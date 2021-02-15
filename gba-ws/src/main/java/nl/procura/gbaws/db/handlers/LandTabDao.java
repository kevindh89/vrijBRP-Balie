/*
 * Copyright 2021 - 2022 Procura B.V.
 *
 * In licentie gegeven krachtens de EUPL, versie 1.2
 * U mag dit werk niet gebruiken, behalve onder de voorwaarden van de licentie.
 * U kunt een kopie van de licentie vinden op:
 *
 *   https://github.com/vrijBRP/vrijBRP/blob/master/LICENSE.md
 *
 * Deze bevat zowel de Nederlandse als de Engelse tekst
 *
 * Tenzij dit op grond van toepasselijk recht vereist is of schriftelijk
 * is overeengekomen, wordt software krachtens deze licentie verspreid
 * "zoals deze is", ZONDER ENIGE GARANTIES OF VOORWAARDEN, noch expliciet
 * noch impliciet.
 * Zie de licentie voor de specifieke bepalingen voor toestemmingen en
 * beperkingen op grond van de licentie.
 */

package nl.procura.gbaws.db.handlers;

import static nl.procura.standard.Globalfunctions.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import nl.procura.burgerzaken.gba.core.enums.GBATable;
import nl.procura.gba.jpa.personenws.db.Landtab;
import nl.procura.gba.jpa.personenws.db.LandtabElement;
import nl.procura.gba.jpa.personenws.db.LandtabRecord;
import nl.procura.gba.jpa.personenws.db.LandtabRecordPK;
import nl.procura.gba.jpa.personenws.utils.GbaWsJpa;
import nl.procura.gbaws.db.enums.LandTabType;
import nl.procura.standard.ProcuraDate;

public class LandTabDao implements Serializable {

  public static List<LandTable> getTables(List<Integer> tableCodes) {

    final List<LandTable> l = new ArrayList<>();
    final EntityManager m = GbaWsJpa.getManager();
    final TypedQuery<Landtab> q = m.createQuery("select l from Landtab l where l.cTable in :codes", Landtab.class);
    q.setParameter("codes", tableCodes);
    final List<Landtab> list = q.getResultList();

    for (final Landtab r : list) {
      l.add(get(r));
    }

    return l;
  }

  public static List<LandTable> getTables() {

    final List<LandTable> l = new ArrayList<>();
    final EntityManager m = GbaWsJpa.getManager();
    final TypedQuery<Landtab> q = m.createQuery("select l from Landtab l", Landtab.class);
    final List<Landtab> list = q.getResultList();

    for (final Landtab r : list) {
      l.add(get(r));
    }

    return l;
  }

  private static LandTable get(Landtab r) {
    return new LandTable(r.getCTable(), getTabelDescription(r.getCTable()), r.getLandtabRecordCollection().size());
  }

  public static void removeTable(EntityManager em, int tableCode) {
    Landtab landtab = em.find(Landtab.class, tableCode);
    if (landtab != null) {
      em.remove(landtab);
    }
  }

  public static String getTableDescription(int tableCode) {

    final EntityManager m = GbaWsJpa.getManager();
    final Landtab tab = m.find(Landtab.class, tableCode);
    return tab == null ? "" : getTabelDescription(tab.getCTable());
  }

  public static List<LandTableElement> getAllElements(int tableCode) {

    final ArrayList<LandTableElement> l = new ArrayList<>();
    final EntityManager m = GbaWsJpa.getManager();

    if (pos(tableCode)) {

      final Landtab t = m.find(Landtab.class, tableCode);
      for (final LandtabElement r : t.getLandtabElementCollection()) {
        l.add(new LandTableElement(r.getCElement(), "Onbekend"));
      }
    }

    return l;
  }

  public static List<LandTableRecord> getAllRecords(int tableCode, boolean history) {

    final List<LandTableRecord> l = new ArrayList<>();

    if (pos(tableCode)) {
      final EntityManager m = GbaWsJpa.getManager();
      final Landtab t = m.find(Landtab.class, tableCode);

      for (final LandtabRecord r : t.getLandtabRecordCollection()) {
        if (history || !(pos(r.getDEnd()) && new ProcuraDate(astr(r.getDEnd())).isExpired())) {
          l.add(new LandTableRecord(r.getLandtabRecordPK().getCRecord(), format(r), r.getDIn(), r.getDEnd(),
              r.getAttr()));
        }
      }
    }

    return l;
  }

  private static String format(LandtabRecord r) {
    if (GBATable.AUT_VERSTREK_NED_REISD.getTableCode() == r.getLandtabRecordPK().getCTable()) {
      return formatAuthority(r);
    }
    return r.getOms();
  }

  /**
   * If a code is for instance BI0599 the the code is extracted and
   * the municipality is added to the description
   */
  private static String formatAuthority(LandtabRecord r) {
    String value = r.getLandtabRecordPK().getCRecord();
    String number = value.replaceAll("\\D+", "");
    if (pos(number)) {
      LandtabRecordPK pk = new LandtabRecordPK();
      pk.setCTable(GBATable.PLAATS.getTableCode());
      pk.setCRecord(number);
      EntityManager m = GbaWsJpa.getManager();
      LandtabRecord plaats = m.find(LandtabRecord.class, pk);
      if (plaats != null) {
        return r.getOms() + " (" + plaats.getOms() + ")";
      }
    }
    return r.getOms();
  }

  public static String getTabelDescription(int tableCode) {
    return LandTabType.get(tableCode).getDescr();
  }

  public static class BaseContainer implements Serializable {

    private final int    code;
    private final String description;

    public BaseContainer(int code, String description) {
      this.code = code;
      this.description = description;
    }

    public int getCode() {
      return code;
    }

    public String getDescription() {
      return description;
    }

    @Override
    public String toString() {
      return getCode() + " = " + getDescription();
    }
  }

  public static class LandTable extends BaseContainer {

    private final int recordCount;

    public LandTable(int code, String description, int recordCount) {
      super(code, description);
      this.recordCount = recordCount;
    }

    public String getElementsAsString() {

      StringBuilder sb = new StringBuilder();
      for (final LandTableElement element : getAllElements(getCode())) {
        sb.append(element.getCode());
        sb.append(", ");
      }

      return trim(sb.toString());
    }

    public int getRecordCount() {
      return recordCount;
    }
  }

  public static class LandTableElement extends BaseContainer {

    public LandTableElement(int code, String description) {
      super(code, description);
    }
  }

  public static class LandTableRecord implements Serializable {

    private final String code;
    private final String description;
    private final int    dateIn;
    private final int    dateEnd;
    private final String attr;

    public LandTableRecord(String code, String description, int dateIn, int dateEnd, String attr) {
      this.code = code;
      this.description = description;
      this.dateIn = dateIn;
      this.dateEnd = dateEnd;
      this.attr = attr;
    }

    @Override
    public String toString() {
      return getCode() + " = " + getDescription();
    }

    public String getCode() {
      return code;
    }

    public String getDescription() {
      return description;
    }

    public int getDateIn() {
      return dateIn;
    }

    public int getDateEnd() {
      return dateEnd;
    }

    public String getAttr() {
      return attr;
    }
  }
}
