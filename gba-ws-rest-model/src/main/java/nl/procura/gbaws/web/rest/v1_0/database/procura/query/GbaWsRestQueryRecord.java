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

package nl.procura.gbaws.web.rest.v1_0.database.procura.query;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "record")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "velden" })
public class GbaWsRestQueryRecord {

  @XmlElement(name = "velden")
  private List<GbaWsRestQueryVeld> velden = new ArrayList<>();

  public List<GbaWsRestQueryVeld> getVelden() {
    return velden;
  }

  public void setVelden(List<GbaWsRestQueryVeld> velden) {
    this.velden = velden;
  }
}
