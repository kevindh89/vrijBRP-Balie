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

package nl.procura.gba.web.modules.beheer.gebruikers.email.page2;

import java.io.Serializable;
import java.lang.annotation.ElementType;

import nl.procura.gba.web.services.beheer.email.EmailTemplate;
import nl.procura.vaadin.annotation.field.Field;
import nl.procura.vaadin.annotation.field.Field.FieldType;
import nl.procura.vaadin.annotation.field.FormFieldFactoryBean;
import nl.procura.vaadin.annotation.field.TextArea;

import lombok.Data;

@Data
@FormFieldFactoryBean(accessType = ElementType.FIELD)
public class Page2SendEmailBean implements Serializable {

  public static final String EMAIL  = "email";
  public static final String INHOUD = "inhoud";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "Email",
      readOnly = true,
      width = "500px")
  private String email;

  @Field(type = FieldType.TEXT_AREA,
      caption = "Inhoud",
      required = true,
      width = "685px",
      readOnly = true)
  @TextArea(nullRepresentation = "",
      rows = 10)
  private String inhoud;

  public Page2SendEmailBean(EmailTemplate email) {
    this.email = email.getOnderwerp();
    this.inhoud = email.getInhoud();
  }
}
