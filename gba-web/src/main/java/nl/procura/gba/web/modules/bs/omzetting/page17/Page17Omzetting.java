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

package nl.procura.gba.web.modules.bs.omzetting.page17;

import static nl.procura.gba.web.services.bs.algemeen.enums.DossierPersoonType.OUDER;

import nl.procura.gba.web.modules.bs.common.pages.persoonpage.BsPersoonPage;
import nl.procura.gba.web.modules.bs.omzetting.page16.Page16Omzetting;
import nl.procura.gba.web.services.bs.algemeen.persoon.DossierPersoon;
import nl.procura.gba.web.services.bs.omzetting.DossierOmzetting;
import nl.procura.vaadin.component.layout.page.pageEvents.InitPage;
import nl.procura.vaadin.component.layout.page.pageEvents.PageEvent;

/**
 * Ouder
 */
public class Page17Omzetting extends BsPersoonPage<DossierOmzetting> {

  public Page17Omzetting(DossierPersoon dossierPersoon) {

    super("Omzetting GPS in huwelijk - ouder");

    setDossierPersoon(dossierPersoon);
  }

  @Override
  public void event(PageEvent event) {

    if (event.isEvent(InitPage.class)) {
      getDossierPersoon().setDossierPersoonType(OUDER);
    }

    super.event(event);
  }

  @Override
  public void onNextPage() {

    if (checkPage()) {
      onPreviousPage();
    }
  }

  @Override
  public void onPreviousPage() {
    getNavigation().goToPage(getNavigation().getPage(Page16Omzetting.class));
  }

  @Override
  protected String getInfo() {
    return "Zoek de persoon, controleer de gegevens of vul deze in. "
        + "Stel de identiteit vast en vul contactgegevens in. Druk op Volgende (F2) om verder te gaan.";
  }
}
