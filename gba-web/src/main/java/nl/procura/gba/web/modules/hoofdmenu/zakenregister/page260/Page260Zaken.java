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

package nl.procura.gba.web.modules.hoofdmenu.zakenregister.page260;

import static nl.procura.gba.web.modules.hoofdmenu.zakenregister.overig.ZaakPersoonType.AANGEVER;

import nl.procura.gba.web.modules.bs.registration.ModuleRegistration;
import nl.procura.gba.web.modules.bs.registration.summary.RegistrationSummaryBuilder;
import nl.procura.gba.web.modules.hoofdmenu.zakenregister.overig.ZaakPersoonType;
import nl.procura.gba.web.modules.hoofdmenu.zakenregister.overig.ZaakTabsheet;
import nl.procura.gba.web.modules.hoofdmenu.zakenregister.overig.ZakenregisterOptiePage;
import nl.procura.gba.web.modules.hoofdmenu.zakenregister.page101.Page101Zaken;
import nl.procura.gba.web.services.beheer.profiel.actie.ProfielActie;
import nl.procura.gba.web.services.bs.algemeen.Dossier;
import nl.procura.gba.web.services.zaken.documenten.DocumentType;
import nl.procura.gba.web.windows.home.modules.MainModuleContainer;
import nl.procura.vaadin.functies.VaadinUtils;

/**
 * Show first registration summary.
 */
public class Page260Zaken extends ZakenregisterOptiePage<Dossier> {

  public Page260Zaken(Dossier zaak) {
    super(zaak, "Zakenregister - eerste inschrijving");
    addButton(buttonPrev);
  }

  @Override
  protected void addOptieButtons() {

    addOptieButton(buttonAanpassen);
    addOptieButton(buttonDoc);
    addOptieButton(buttonPersonen);
    addOptieButton(buttonFiat);
    addOptieButton(buttonVerwerken);

    buttonAanpassen.setEnabled(getApplication().isProfielActie(ProfielActie.UPDATE_ZAAK_REGISTRATIE));
  }

  @Override
  protected void addTabs(ZaakTabsheet<Dossier> tabsheet) {
    RegistrationSummaryBuilder.addTab(tabsheet, getZaak().getZaakDossier());
  }

  @Override
  protected ZaakPersoonType[] getZoekpersoonTypes() {
    return new ZaakPersoonType[]{ AANGEVER };
  }

  @Override
  protected void goToDocument() {
    getNavigation().goToPage(new Page101Zaken(getZaak(), getTitle(), new DocumentType[0]));
  }

  @Override
  protected void goToPersoon(ZaakPersoonType type) {

    switch (type) {
      case AANGEVER:
      default:
        goToPersoon("zaken.eerste.registratie", getZaak().getAnummer(), getZaak().getBurgerServiceNummer());
        break;
    }
  }

  @Override
  protected void goToZaak() {
    MainModuleContainer mainModule = VaadinUtils.getChild(getWindow(), MainModuleContainer.class);
    mainModule.getNavigation().addPage(new ModuleRegistration(getZaak()));
  }
}
