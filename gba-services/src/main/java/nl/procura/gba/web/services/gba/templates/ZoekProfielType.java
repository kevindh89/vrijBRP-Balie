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

package nl.procura.gba.web.services.gba.templates;

import static nl.procura.standard.Globalfunctions.equalsIgnoreCase;

public enum ZoekProfielType {

  PROFIEL_STANDAARD("1", "Standaardprofiel"),
  PROFIEL_GBAV_PLUS("2", "GBA-V+ profiel");

  private String code;
  private String oms;

  ZoekProfielType(String code, String oms) {
    this.code = code;
    this.oms = oms;
  }

  public static ZoekProfielType get(String code) {
    for (ZoekProfielType type : values()) {
      if (equalsIgnoreCase(type.getCode(), code)) {
        return type;
      }
    }

    return PROFIEL_STANDAARD;
  }

  public static boolean is(ZoekProfielType type, String code) {
    return (type == get(code));
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getOms() {
    return oms;
  }

  public void setOms(String oms) {
    this.oms = oms;
  }

  @Override
  public String toString() {
    return getOms();
  }
}
