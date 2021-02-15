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

package nl.procura.gba.web.modules.beheer.profielen.page6;

import nl.procura.burgerzaken.gba.core.enums.GBAGroupElements;
import nl.procura.gba.web.services.beheer.profiel.gba_element.PleElement;

public class PleElementContainer {

  private GBAGroupElements.GBAGroupElem pleElementType = null;
  private PleElement                    pleElement     = null;

  public PleElementContainer(GBAGroupElements.GBAGroupElem pleElementType, PleElement pleElement) {

    this.setPleElementType(pleElementType);
    this.setPleElement(pleElement);
  }

  public PleElement getPleElement() {
    return pleElement;
  }

  public void setPleElement(PleElement pleElement) {
    this.pleElement = pleElement;
  }

  public GBAGroupElements.GBAGroupElem getPleElementType() {
    return pleElementType;
  }

  public void setPleElementType(GBAGroupElements.GBAGroupElem pleElementType) {
    this.pleElementType = pleElementType;
  }
}
