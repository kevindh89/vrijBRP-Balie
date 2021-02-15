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

package nl.procura.gba.web.modules.bs.overlijden.levenloos.page30;

import nl.procura.gba.web.modules.bs.geboorte.page30.Page30Geboorte;
import nl.procura.gba.web.services.bs.levenloos.DossierLevenloos;

public class Page30Levenloos extends Page30Geboorte<DossierLevenloos> {

  public Page30Levenloos() {
    super("Levenloos geboren kind - moeder uit wie het kind is geboren");
  }
}
