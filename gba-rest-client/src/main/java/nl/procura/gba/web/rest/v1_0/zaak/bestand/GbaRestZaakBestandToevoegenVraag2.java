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

package nl.procura.gba.web.rest.v1_0.zaak.bestand;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "vraag")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "zaakId", "titel", "bestandsNaam", "inhoud" })
public class GbaRestZaakBestandToevoegenVraag2 {

  private String zaakId       = "";
  private String titel        = "";
  private String bestandsNaam = "";
  private byte[] inhoud;

  public String getZaakId() {
    return zaakId;
  }

  public void setZaakId(String zaakId) {
    this.zaakId = zaakId;
  }

  public String getBestandsNaam() {
    return bestandsNaam;
  }

  public void setBestandsNaam(String bestandsNaam) {
    this.bestandsNaam = bestandsNaam;
  }

  public byte[] getInhoud() {
    return inhoud;
  }

  public void setInhoud(byte[] inhoud) {
    this.inhoud = inhoud;
  }

  public String getTitel() {
    return titel;
  }

  public void setTitel(String titel) {
    this.titel = titel;
  }
}
