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

package nl.procura.gba.web.modules.persoonslijst.nationaliteit.page2;

import java.io.Serializable;
import java.lang.annotation.ElementType;

import nl.procura.vaadin.annotation.field.Field;
import nl.procura.vaadin.annotation.field.Field.FieldType;
import nl.procura.vaadin.annotation.field.FormFieldFactoryBean;

import lombok.Data;

@Data
@FormFieldFactoryBean(accessType = ElementType.FIELD)
public class Page2NationaliteitBean implements Serializable {

  public static final String NATIONALITEIT             = "nationaliteit";
  public static final String REDENVERKRIJGING          = "redenVerkrijging";
  public static final String REDENVERLIES              = "redenVerlies";
  public static final String BIJZONDERNEDERLANDERSCHAP = "bijzonderNederlanderschap";
  public static final String EU_PERSOONSNUMMER         = "euPersoonsnummer";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "Nationaliteit")
  private String nationaliteit = "";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "Reden opnemen")
  private String redenVerkrijging = "";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "Reden beëindigen")
  private String redenVerlies = "";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "Bijz. Nederlanderschap")
  private String bijzonderNederlanderschap = "";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "EU-persoonsnummer")
  private String euPersoonsnummer = "";
}
