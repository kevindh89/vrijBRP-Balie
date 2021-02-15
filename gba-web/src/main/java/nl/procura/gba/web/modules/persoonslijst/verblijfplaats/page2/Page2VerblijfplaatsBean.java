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

package nl.procura.gba.web.modules.persoonslijst.verblijfplaats.page2;

import java.io.Serializable;
import java.lang.annotation.ElementType;

import nl.procura.vaadin.annotation.field.Field;
import nl.procura.vaadin.annotation.field.Field.FieldType;
import nl.procura.vaadin.annotation.field.FormFieldFactoryBean;

import lombok.Data;

@Data
@FormFieldFactoryBean(accessType = ElementType.FIELD)
public class Page2VerblijfplaatsBean implements Serializable {

  public static final String GEMEENTE          = "gemeente";
  public static final String DATUMINSCHRIJVING = "datumInschrijving";
  public static final String GEMEENTEDEEL      = "gemeentedeel";
  public static final String ADRES             = "adres";
  public static final String FUNCTIEADRES      = "functieadres";
  public static final String AANGIFTE          = "aangifte";
  public static final String AANVANG           = "aanvang";
  public static final String VERTREK           = "vertrek";
  public static final String VERTREKADRES      = "vertrekAdres";
  public static final String VESTIGING         = "vestiging";

  public static final String WOONPLAATS      = "woonplaats";
  public static final String OPENBARE_RUIMTE = "openbareRuimte";
  public static final String AON             = "aon";
  public static final String INA             = "ina";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "Gemeente")
  private String gemeente = "";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "Datum inschrijving")
  private String datumInschrijving = "";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "Gemeentedeel")
  private String gemeentedeel = "";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "Woonplaats")
  private String woonplaats = "";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "Openbare ruimte")
  private String openbareRuimte = "";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "ID-verblijfplaats (AON)")
  private String aon = "";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "ID-nummeraand. (INA)")
  private String ina = "";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "Adres")
  private String adres = "";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "Functieadres")
  private String functieadres = "";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "Aangifte")
  private String aangifte = "";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "Aanvang")
  private String aanvang = "";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "Vertrek")
  private String vertrek = "";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "Vertrekadres")
  private String vertrekAdres = "";

  @Field(type = FieldType.TEXT_FIELD,
      caption = "Vestiging")
  private String vestiging = "";
}
