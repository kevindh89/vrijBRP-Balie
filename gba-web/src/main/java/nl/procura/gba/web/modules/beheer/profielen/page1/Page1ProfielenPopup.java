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

package nl.procura.gba.web.modules.beheer.profielen.page1;

import nl.procura.gba.web.components.layouts.navigation.GbaPopupButton;

public class Page1ProfielenPopup extends GbaPopupButton {

  public Page1ProfielenPopup() {

    super("Opties", "150px", "145px");

    addChoice(new Choice("Importeren") {

      @Override
      public void onClick() {

        onImporteren();
      }

    });

    addChoice(new Choice("Exporteren") {

      @Override
      public void onClick() {

        onExporteren();
      }
    });

    addChoice(new Choice("Kopieer gebruikers") {

      @Override
      public void onClick() {

        onKopieerGebruikers();
      }
    });
  }

  public void onExporteren() {
  }

  public void onImporteren() {
  }

  public void onKopieerGebruikers() {
  }
}
