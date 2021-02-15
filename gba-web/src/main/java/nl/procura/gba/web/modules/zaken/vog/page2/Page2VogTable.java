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

package nl.procura.gba.web.modules.zaken.vog.page2;

import nl.procura.gba.web.components.layouts.table.GbaTable;
import nl.procura.gba.web.services.zaken.vog.VogAanvraag;
import nl.procura.gba.web.services.zaken.vog.VogFunctie;

public class Page2VogTable extends GbaTable {

  private VogAanvraag aanvraag;

  public Page2VogTable(VogAanvraag aanvraag) {
    setAanvraag(aanvraag);
  }

  public VogAanvraag getAanvraag() {
    return aanvraag;
  }

  public void setAanvraag(VogAanvraag aanvraag) {
    this.aanvraag = aanvraag;
  }

  @Override
  public void setColumns() {

    addColumn("Nr", 30);
    addColumn("Functiegebied");

    super.setColumns();
  }

  @Override
  public void setRecords() {

    for (VogFunctie s : aanvraag.getScreening().getFunctiegebieden()) {

      Record r = addRecord(s);
      r.addValue(s.getVogFuncTab());
      r.addValue(s.getOms());
    }
  }
}
