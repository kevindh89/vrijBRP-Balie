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

package nl.procura.gba.web.rest.v1_0.document.contactgegevens;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "contactgegevens")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "telefoonMobiel", "telefoonThuis", "telefoonWerk", "email" })
public class GbaRestDocumentContact {

  private String telefoonThuis  = "";
  private String telefoonWerk   = "";
  private String telefoonMobiel = "";
  private String email          = "";

  public String getTelefoonMobiel() {
    return telefoonMobiel;
  }

  public void setTelefoonMobiel(String telefoonMobiel) {
    this.telefoonMobiel = telefoonMobiel;
  }

  public String getTelefoonWerk() {
    return telefoonWerk;
  }

  public void setTelefoonWerk(String telefoonWerk) {
    this.telefoonWerk = telefoonWerk;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelefoonThuis() {
    return telefoonThuis;
  }

  public void setTelefoonThuis(String telefoonThuis) {
    this.telefoonThuis = telefoonThuis;
  }
}
