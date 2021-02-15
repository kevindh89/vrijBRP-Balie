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

package nl.procura.gba.web.rest.v2.model.zaken.base;

public enum GbaRestZaakSorteringType {

  DATUM_INGANG_NIEUW_OUD("1"),
  DATUM_INGANG_OUD_NIEUW("2"),
  DATUM_INVOER_NIEUW_OUD("3"),
  DATUM_INVOER_OUD_NIEUW("4");

  private final String code;

  GbaRestZaakSorteringType(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }
}
