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

package nl.procura.gba.web.modules.bs.common.pages.persoonpage;

import static nl.procura.gba.web.modules.bs.common.pages.persoonpage.BsPersoonBean1.*;

import com.vaadin.ui.Field;

import nl.procura.diensten.gba.ple.extensions.BasePLExt;
import nl.procura.gba.web.application.GbaApplication;
import nl.procura.gba.web.components.layouts.lazyloading.LazyLayout;
import nl.procura.gba.web.components.layouts.page.StatusButton;
import nl.procura.gba.web.services.bs.algemeen.enums.DossierPersoonType;
import nl.procura.gba.web.services.bs.algemeen.persoon.DossierPersoon;
import nl.procura.gba.web.services.gba.functies.PersoonslijstStatus;
import nl.procura.gba.web.services.gba.ple.opslag.PersoonStatusOpslagEntry;
import nl.procura.vaadin.component.layout.table.TableLayout.Column;
import nl.procura.validation.Bsn;

public class BsPersoonForm1 extends BsPersoonForm {

  private final GbaApplication gbaApplication;

  public BsPersoonForm1(GbaApplication gbaApplication, DossierPersoon dossierPersoon,
      BsPersoonRequirement requirement) {

    super(dossierPersoon, requirement);

    this.gbaApplication = gbaApplication;

    setCaption("Persoonsgegevens van " + dossierPersoon.getDossierPersoonType().getDescrExtra());

    if (dossierPersoon.getDossierPersoonType().is(DossierPersoonType.AMBTENAAR)) {

      setOrder(NAAM, BSN, VOORV, TITEL, VOORN, GESLACHT, AKTENAAM, STATUS);
    } else {

      setOrder(NAAM, BSN, VOORV, TITEL, VOORN, GESLACHT, STATUS);
    }

    update();
  }

  @Override
  public void afterSetColumn(Column column, Field field, Property property) {

    if (property.is(STATUS)) {

      Bsn bsn = new Bsn(getBean().getBsn());

      if (bsn.isCorrect()) {

        final BasePLExt pl = gbaApplication.getServices().getPersonenWsService().getPersoonslijst(
            bsn.getDefaultBsn());

        if (pl != null) {

          PersoonStatusOpslagEntry status = PersoonslijstStatus.getStoredStatus(gbaApplication.getServices(),
              pl);

          final StatusButton button = new StatusButton(status != null ? status.getStatus() : "", pl);

          if (status != null) {

            column.addComponent(button);
          } else {

            LazyLayout lazyLayout = new LazyLayout(button, 200, "500px", "25px") {

              @Override
              public void onVisible() {

                button.setCaption(PersoonslijstStatus.getStatus(gbaApplication.getServices(), pl));
              }

            }.setIndicatorLeft();

            column.addComponent(lazyLayout);
          }
        }
      }
    }

    super.afterSetColumn(column, field, property);
  }

  @Override
  public void setColumn(Column column, Field field, Property property) {

    if (property.is(AKTENAAM, STATUS)) {
      column.setColspan(3);
    }

    super.setColumn(column, field, property);
  }

}
