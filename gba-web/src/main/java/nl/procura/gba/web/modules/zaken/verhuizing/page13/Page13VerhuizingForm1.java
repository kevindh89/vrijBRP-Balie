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

package nl.procura.gba.web.modules.zaken.verhuizing.page13;

import static nl.procura.gba.web.modules.zaken.verhuizing.page13.Page13VerhuizingBean1.AANVANG;

import nl.procura.gba.web.components.layouts.form.GbaForm;

public class Page13VerhuizingForm1 extends GbaForm<Page13VerhuizingBean1> {

  public Page13VerhuizingForm1() {
    setCaption("Aanvang verhuizing");
    setColumnWidths("200px", "");
    setReadThrough(true);
    setOrder(AANVANG);
    setBean(new Page13VerhuizingBean1());
  }
}
