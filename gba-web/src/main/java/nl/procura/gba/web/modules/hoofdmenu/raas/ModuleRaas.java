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

package nl.procura.gba.web.modules.hoofdmenu.raas;

import nl.procura.gba.web.common.annotations.ModuleAnnotation;
import nl.procura.gba.web.components.layouts.ModuleTemplate;
import nl.procura.gba.web.components.layouts.tabsheet.GbaTabsheet;
import nl.procura.gba.web.modules.hoofdmenu.raas.tab1.Tab1RaasModule;
import nl.procura.gba.web.modules.hoofdmenu.raas.tab2.Tab2RaasModule;
import nl.procura.gba.web.services.beheer.profiel.actie.ProfielActie;
import nl.procura.gba.web.theme.GbaWebTheme;
import nl.procura.vaadin.component.layout.page.PageLayout;
import nl.procura.vaadin.component.layout.page.pageEvents.InitPage;
import nl.procura.vaadin.component.layout.page.pageEvents.PageEvent;

@ModuleAnnotation(url = "#raas",
    caption = "RAAS",
    profielActie = ProfielActie.SELECT_HOOFD_INZAGE_RAAS)
public class ModuleRaas extends ModuleTemplate {

  public ModuleRaas() {
  }

  @Override
  public void event(PageEvent event) {
    if (event.isEvent(InitPage.class)) {
      getPages().getNavigation().goToPage(new RaasTab());
    }

    super.event(event);
  }

  public class RaasTab extends PageLayout {

    private final GbaTabsheet tabs = new GbaTabsheet();

    RaasTab() {
      tabs.addStyleName(GbaWebTheme.TABSHEET_TOP);
      tabs.addTab(Tab1RaasModule.class, "Aanvragen");
      tabs.addTab(Tab2RaasModule.class, "Berichten");
      addExpandComponent(tabs);
    }
  }
}
