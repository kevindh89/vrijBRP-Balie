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

package nl.procura.gba.web.modules.hoofdmenu.zakenregister.page61;

import nl.procura.gba.web.modules.hoofdmenu.zakenregister.overig.ZakenregisterPrintPage;
import nl.procura.gba.web.services.zaken.documenten.DocumentType;
import nl.procura.gba.web.services.zaken.verhuizing.VerhuisAanvraag;
import nl.procura.vaadin.component.layout.page.pageEvents.InitPage;
import nl.procura.vaadin.component.layout.page.pageEvents.PageEvent;

/**
 * Afdrukken aanvraag
 */
public class Page61Zaken extends ZakenregisterPrintPage {

  public Page61Zaken(VerhuisAanvraag aanvraag) {
    super("Zakenregister - verhuisaanvraag - afdrukken", aanvraag, DocumentType.VERHUIZING_AANGIFTE);
  }

  @Override
  public void event(PageEvent event) {

    if (event.isEvent(InitPage.class)) {
      getServices().getVerhuizingService().setVolledigeZaakExtra((VerhuisAanvraag) getModel());
    }

    super.event(event);
  }

  @Override
  public void setButtons() {

    addButton(buttonPrev);
    addButton(getPrintButtons());

    super.setButtons();
  }
}
