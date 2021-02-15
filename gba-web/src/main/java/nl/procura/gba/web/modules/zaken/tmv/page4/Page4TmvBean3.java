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

package nl.procura.gba.web.modules.zaken.tmv.page4;

import java.io.Serializable;
import java.lang.annotation.ElementType;

import nl.procura.vaadin.annotation.field.Field;
import nl.procura.vaadin.annotation.field.Field.FieldType;
import nl.procura.vaadin.annotation.field.FormFieldFactoryBean;

@FormFieldFactoryBean(accessType = ElementType.FIELD)
public class Page4TmvBean3 implements Serializable {

  @Field(type = FieldType.TEXT_FIELD,
      caption = "Melding")
  private String melding = "";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "Verstuurd door")
  private String verstuurddoor = "";

  public String getMelding() {
    return melding;
  }

  public void setMelding(String melding) {
    this.melding = melding;
  }

  public String getVerstuurddoor() {
    return verstuurddoor;
  }

  public void setVerstuurddoor(String verstuurddoor) {
    this.verstuurddoor = verstuurddoor;
  }
}
