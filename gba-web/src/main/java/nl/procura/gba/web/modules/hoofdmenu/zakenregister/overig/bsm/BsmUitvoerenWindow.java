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

package nl.procura.gba.web.modules.hoofdmenu.zakenregister.overig.bsm;

import nl.procura.bsm.rest.v1_0.objecten.taak.BsmRestTaak;
import nl.procura.bsm.rest.v1_0.objecten.taak.BsmRestTaakVraag;
import nl.procura.bsm.taken.BsmTaak;
import nl.procura.gba.web.components.layouts.ModuleTemplate;
import nl.procura.gba.web.components.layouts.form.GbaForm;
import nl.procura.gba.web.components.layouts.window.GbaModalWindow;
import nl.procura.gba.web.windows.home.modules.MainModuleContainer;
import nl.procura.vaadin.component.layout.page.pageEvents.InitPage;
import nl.procura.vaadin.component.layout.page.pageEvents.PageEvent;

public abstract class BsmUitvoerenWindow extends GbaModalWindow {

  private final GbaForm          form;
  private final BsmTaak          bsmTaak;
  private final BsmRestTaakVraag bsmVraag;

  public BsmUitvoerenWindow(GbaForm form, BsmTaak bsmTaak, BsmRestTaakVraag bsmVraag) {

    super("Uitvoeren van een taak (Escape om te sluiten)", "700px");
    this.form = form;
    this.bsmTaak = bsmTaak;
    this.bsmVraag = bsmVraag;
  }

  @Override
  public void attach() {

    super.attach();

    MainModuleContainer mainModule = new MainModuleContainer();

    addComponent(mainModule);

    mainModule.getNavigation().addPage(new Module());
  }

  protected abstract void reload();

  public class Module extends ModuleTemplate {

    public Module() {
      setMargin(false);
    }

    @Override
    public void event(PageEvent event) {

      if (event.isEvent(InitPage.class)) {

        BsmUitvoerenPage bsmUitvoerenPage = new BsmUitvoerenPage() {

          @Override
          public GbaForm getBetreftForm() {
            return form;
          }

          @Override
          public BsmRestTaak getBsmRestTaak() {
            return getServices().getBsmService().getBsmRestTaak(bsmTaak);
          }

          @Override
          public BsmRestTaakVraag getBsmVraag() {
            return bsmVraag;
          }

          @Override
          public void reloadZaak() {
            BsmUitvoerenWindow.this.reload();
          }
        };
        getPages().getNavigation().goToPage(bsmUitvoerenPage);
      }

      super.event(event);
    }
  }
}
