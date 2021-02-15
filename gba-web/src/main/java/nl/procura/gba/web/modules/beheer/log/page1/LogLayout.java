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

package nl.procura.gba.web.modules.beheer.log.page1;

import nl.procura.gba.web.common.misc.ZaakPeriode;
import nl.procura.gba.web.components.fields.GbaNativeSelect;
import nl.procura.gba.web.components.layouts.table.GbaTable;
import nl.procura.gba.web.components.layouts.tablefilter.GbaIndexedTableFilterLayout;
import nl.procura.gba.web.components.listeners.FieldChangeListener;

public abstract class LogLayout extends GbaIndexedTableFilterLayout {

  private PeriodeVeld periodeVeld;

  public LogLayout(GbaTable table) {

    super(table);
    setPeriodeVeld(new PeriodeVeld());
    addComponent(getPeriodeVeld());
    getPeriodeVeld().setWidth("200px");
    setSpacing(true);
  }

  public PeriodeVeld getPeriodeVeld() {
    return periodeVeld;
  }

  public void setPeriodeVeld(PeriodeVeld periodeVeld) {
    this.periodeVeld = periodeVeld;
  }

  protected abstract void onPeriodeWijziging(ZaakPeriode periode);

  protected abstract void onSysteemAccountWijziging(Boolean toon);

  public class PeriodeVeld extends GbaNativeSelect {

    public PeriodeVeld() {

      setNullSelectionAllowed(false);
      setContainerDataSource(new LogPeriodesContainer());
      setImmediate(true);
      FieldChangeListener<ZaakPeriode> listener = new FieldChangeListener<ZaakPeriode>() {

        @Override
        public void onChange(ZaakPeriode periode) {
          onPeriodeWijziging(periode);
        }
      };
      addListener(listener);
    }
  }
}
