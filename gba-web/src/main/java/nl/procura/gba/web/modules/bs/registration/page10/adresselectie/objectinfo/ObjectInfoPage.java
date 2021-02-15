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

package nl.procura.gba.web.modules.bs.registration.page10.adresselectie.objectinfo;

import nl.procura.diensten.gba.wk.extensions.BaseWKExt;
import nl.procura.gba.web.components.layouts.page.NormalPageTemplate;
import nl.procura.vaadin.component.layout.page.pageEvents.InitPage;
import nl.procura.vaadin.component.layout.page.pageEvents.PageEvent;

public class ObjectInfoPage extends NormalPageTemplate {

  private ObjectInfoForm  form;
  private final BaseWKExt adres;

  public ObjectInfoPage(final BaseWKExt adres) {
    this.adres = adres;
  }

  @Override
  public void event(final PageEvent event) {

    if (event.isEvent(InitPage.class)) {
      addButton(this.buttonClose);
      this.form = new ObjectInfoForm(this.adres);
      addComponent(this.form);
    }

    super.event(event);
  }

  @Override
  public void onClose() {
    getWindow().closeWindow();
  }
}
