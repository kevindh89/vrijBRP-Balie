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

package nl.procura.gba.jpa.personen.dao;

import static nl.procura.gba.common.ZaakType.PL_MUTATION;
import static nl.procura.standard.Globalfunctions.aval;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;

import nl.procura.gba.common.ConditionalMap;
import nl.procura.gba.jpa.personen.db.PlMut;
import nl.procura.gba.jpa.personen.utils.CriteriaWrapper;

public class PlMutDao extends ZaakDao {

  public static final String C_PL_MUT = "cPlMut";
  public static final String D_IN     = "dIn";
  public static final String T_IN     = "tIn";

  public static final List<ZaakKey> findZaakKeys(ConditionalMap map) {
    CriteriaWrapper<PlMut, ZaakKey> w = new CriteriaWrapper<>(PlMut.class, ZaakKey.class, map);
    Path<Object> zaakId = w.getTable().get(ZAAK_ID);
    Path<Object> dOpn = w.getTable().get(D_IN);
    Path<Object> tOpn = w.getTable().get(T_IN);

    w.getCq().select(w.getBuilder().construct(ZaakKey.class, zaakId, dOpn, dOpn, tOpn))
        .orderBy(getOrder(w, D_IN, T_IN, C_PL_MUT));

    find(w);

    return addZaakType(w.getResultList(), PL_MUTATION);
  }

  public static final int findCount(ConditionalMap map) {
    CriteriaWrapper<PlMut, Long> w = new CriteriaWrapper<>(PlMut.class, Long.class, map);
    w.getCq().select(w.getBuilder().count(w.getTable().get(ZAAK_ID)));
    find(w);
    List<?> list = w.getEm().createQuery(w.getCq()).getResultList();
    return aval(list.get(0));
  }

  public static final List<PlMut> find(ConditionalMap map) {
    CriteriaWrapper<PlMut, PlMut> w = new CriteriaWrapper<>(PlMut.class, PlMut.class, map);
    find(w);
    w.getCq().orderBy(getOrder(w, D_IN, T_IN, C_PL_MUT));
    TypedQuery<PlMut> query = w.getEm().createQuery(w.getCq());
    return get(query, map);
  }

  private static void find(CriteriaWrapper<PlMut, ?> w) {

    CriteriaBuilder builder = w.getBuilder();
    Root<PlMut> table = w.getTable();
    CriteriaQuery query = w.getCq();
    ConditionalMap map = w.getMap();

    List<Predicate> where = new ArrayList<>();
    where.add(builder.greaterThan(table.get(C_PL_MUT), 0));
    List<Predicate> ids = new ArrayList<>();

    if (map.containsKey(ANR)) {
      ids.add(builder.equal(table.get(ANR), map.get(ANR)));
    }

    if (map.containsKey(BSN)) {
      ids.add(builder.equal(table.get(BSN), map.get(BSN)));
    }

    if (ids.size() > 0) {
      where.add(builder.and(builder.or(ids.toArray(new Predicate[ids.size()]))));
    }

    if (map.containsKey(ZAAK_ID)) {
      where.add(getZaakIds(builder, table, map));
    }

    if (map.containsKey(IND_VERWERKT)) {
      where.add(getStatussen(table, map));
    }

    if (map.containsKey(NIET_IND_VERWERKT)) {
      where.add(builder.not(getNegeerStatussen(table, map)));
    }

    ge(where, builder, map, table.<Long> get(D_IN), D_INVOER_VANAF, D_INGANG_VANAF);
    le(where, builder, map, table.<Long> get(D_IN), D_INVOER_TM, D_INGANG_TM);

    // Niet mogelijk voor deze zaak
    if (map.containsKeys(D_END_TERMIJN, D_AFHAAL_VANAF, D_AFHAAL_TM)) {
      where.add(builder.lessThan(table.get(C_PL_MUT), 0));
    }

    getMutDate(where, table, query, builder, map);
    getUsr(ZaakDao.USR, where, table, builder, map);
    getProfile(ZaakDao.USR, where, table, builder, map);
    getAttribute(query, where, table, builder, map);

    query.where(where.toArray(new Predicate[where.size()]));
  }
}
