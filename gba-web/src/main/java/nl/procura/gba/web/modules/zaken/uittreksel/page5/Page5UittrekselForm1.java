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

package nl.procura.gba.web.modules.zaken.uittreksel.page5;

import static nl.procura.gba.web.modules.zaken.document.page5.Page5DocumentBean1.*;

import nl.procura.gba.web.components.layouts.form.GbaForm;

public class Page5UittrekselForm1 extends GbaForm<Page5UittrekselBean1> {

  public Page5UittrekselForm1(String adres) {

    setReadonlyAsText(true);
    setCaption("Toevoegen personen");
    setOrder(ADRES, BSN, GEBOORTEDATUM, GESLACHTSNAAM);
    setColumnWidths(WIDTH_130, "");

    Page5UittrekselBean1 b = new Page5UittrekselBean1();
    b.setAdres(adres);
    setBean(b);

    getField(BSN).focus();
  }
}
