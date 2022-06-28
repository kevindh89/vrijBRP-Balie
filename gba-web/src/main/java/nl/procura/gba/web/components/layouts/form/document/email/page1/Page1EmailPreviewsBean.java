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

package nl.procura.gba.web.components.layouts.form.document.email.page1;

import java.io.Serializable;
import java.lang.annotation.ElementType;

import nl.procura.gba.web.components.fields.GbaTextField;
import nl.procura.gba.web.services.beheer.email.EmailTemplate;
import nl.procura.vaadin.annotation.field.Field;
import nl.procura.vaadin.annotation.field.FormFieldFactoryBean;
import nl.procura.vaadin.annotation.field.Select;
import nl.procura.vaadin.component.field.ProNativeSelect;

import lombok.Data;

@Data
@FormFieldFactoryBean(accessType = ElementType.FIELD)
public class Page1EmailPreviewsBean implements Serializable {

  public static final String SJABLOON  = "sjabloon";
  public static final String ONDERWERP = "onderwerp";

  @Field(customTypeClass = ProNativeSelect.class,
      caption = "E-mail sjabloon",
      width = "300px")
  @Select(itemCaptionPropertyId = EmailTemplateContainer.OMSCHRIJVING)
  private EmailTemplate sjabloon = null;

  @Field(customTypeClass = GbaTextField.class,
      caption = "Onderwerp",
      required = true,
      width = "300px")
  private String onderwerp = "";
}
