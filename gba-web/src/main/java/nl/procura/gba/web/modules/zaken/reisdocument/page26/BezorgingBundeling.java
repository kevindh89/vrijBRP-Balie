/*
 * Copyright 2024 - 2025 Procura B.V.
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

package nl.procura.gba.web.modules.zaken.reisdocument.page26;

import nl.procura.gba.web.services.zaken.reisdocumenten.ReisdocumentType;
import nl.procura.gba.web.services.zaken.reisdocumenten.bezorging.Bezorging;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "bundelRefNr")
public class BezorgingBundeling {

  private Bezorging    bezorging;
  private final String bundelRefNr;

  public BezorgingBundeling(Bezorging bezorging, String bundelRefNr) {
    this.bezorging = bezorging;
    this.bundelRefNr = bundelRefNr;
    if (bezorging != null && bezorging.isMelding()) {
      ReisdocumentType type = ReisdocumentType.get(bezorging.getMelding().getDocType());
      omschrijving = "Ja, met " + type + " van " + bezorging.getNaam();
    } else {
      omschrijving = "Nee";
    }
  }

  private String omschrijving;

  @Override
  public String toString() {
    return omschrijving;
  }
}
