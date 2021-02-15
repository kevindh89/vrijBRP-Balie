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

package nl.procura.gba.web.modules.bs.overlijden.levenloos.overzicht;

import static nl.procura.gba.common.MiscUtils.to;
import static nl.procura.standard.Globalfunctions.isTru;

import com.vaadin.ui.Component;
import com.vaadin.ui.Layout;

import nl.procura.gba.web.modules.bs.erkenning.overzicht.ErkenningOverzichtLayout;
import nl.procura.gba.web.modules.hoofdmenu.zakenregister.overig.ZaakTabsheet;
import nl.procura.gba.web.modules.hoofdmenu.zakenregister.overig.zkndms.ZakenDmsLayout;
import nl.procura.gba.web.services.beheer.parameter.ParameterConstant;
import nl.procura.gba.web.services.bs.algemeen.ZaakDossier;
import nl.procura.gba.web.services.bs.erkenning.DossierErkenning;
import nl.procura.gba.web.services.bs.erkenning.ErkenningsType;
import nl.procura.gba.web.services.bs.geboorte.GezinssituatieType;
import nl.procura.gba.web.services.bs.geboorte.erkenningbuitenproweb.ErkenningBuitenProweb;
import nl.procura.gba.web.services.bs.levenloos.DossierLevenloos;

public class LevenloosOverzichtBuilder {

  public static void addTab(ZaakTabsheet tabsheet, ZaakDossier zaakDossier) {
    DossierLevenloos levenloos = to(zaakDossier, DossierLevenloos.class);

    if (levenloos.getGezinssituatie() == GezinssituatieType.BINNEN_HETERO_HUWELIJK) {
      tabsheet.addTab(new LevenloosOverzichtLayout(levenloos), "Geboorte binnen huwelijk");
    } else {

      if (levenloos.getErkenningsType() == ErkenningsType.GEEN_ERKENNING) {
        tabsheet.addTab(new LevenloosOverzichtLayout(levenloos), "Geboorte buiten huwelijk, geen erkenning");
      } else {
        tabsheet.addTab(new LevenloosOverzichtLayout(levenloos), "Geboorte buiten huwelijk");
      }
    }

    if (levenloos.getVragen().heeftErkenningBijGeboorte()) {
      Component layout = new ErkenningOverzichtLayout(
          to(levenloos.getErkenningBijGeboorte(), DossierErkenning.class));
      tabsheet.addTab(layout, "Erkenning bij aangifte geboorte");
    } else if (levenloos.getVragen().heeftErkenningVoorGeboorte()) {
      Layout layout = new ErkenningOverzichtLayout(
          to(levenloos.getErkenningVoorGeboorte(), DossierErkenning.class));
      tabsheet.addTab(layout, "Erkenning vóór geboorte (in Proweb)");
    } else if (levenloos.getVragen().heeftErkenningBuitenProweb()) {
      Component layout = new ErkenningOverzichtLayout(
          to(levenloos.getErkenningBuitenProweb(), ErkenningBuitenProweb.class));
      tabsheet.addTab(layout, "Erkenning vóór geboorte (buiten Proweb)");
    }

    // Zaken DMS tab
    boolean isZakenDsmAan = isTru(tabsheet.getApplication().getParmValue(ParameterConstant.BSM_ZAKEN_DMS));
    boolean isZaakDmsAan = isTru(tabsheet.getApplication().getParmValue(ParameterConstant.ZAKEN_DMS_OVERL_LEVENLOOS));

    if (isZakenDsmAan && isZaakDmsAan) {
      ZakenDmsLayout zknDmsLayout = new ZakenDmsLayout(zaakDossier.getDossier());
      zknDmsLayout.setTab(tabsheet.addTab(zknDmsLayout, "Zaaksysteem"));
    }
  }
}
