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

package nl.procura.gbaws.web.rest.v1_0.gbav.account.update;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "vraag")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "code", "datum", "wachtwoord" })
public class GbaWsRestGbavAccountUpdatenVraag {

  private int    code       = -1;
  private int    datum      = -1;
  private String wachtwoord = "";

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public int getDatum() {
    return datum;
  }

  public void setDatum(int datum) {
    this.datum = datum;
  }

  public String getWachtwoord() {
    return wachtwoord;
  }

  public void setWachtwoord(String wachtwoord) {
    this.wachtwoord = wachtwoord;
  }
}
