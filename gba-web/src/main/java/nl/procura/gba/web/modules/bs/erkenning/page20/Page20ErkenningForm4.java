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

package nl.procura.gba.web.modules.bs.erkenning.page20;

import java.io.Serializable;
import java.lang.annotation.ElementType;

import nl.procura.gba.web.components.fields.GbaNativeSelect;
import nl.procura.gba.web.components.layouts.form.GbaForm;
import nl.procura.gba.web.modules.bs.erkenning.page20.Page20ErkenningForm4.Page20ErkenningBean4;
import nl.procura.vaadin.annotation.field.Field;
import nl.procura.vaadin.annotation.field.Field.FieldType;
import nl.procura.vaadin.annotation.field.FormFieldFactoryBean;
import nl.procura.vaadin.annotation.field.Immediate;
import nl.procura.vaadin.annotation.field.Select;
import nl.procura.vaadin.component.container.NLBooleanContainer;

public class Page20ErkenningForm4 extends GbaForm<Page20ErkenningBean4> {

  public static final String STAP4 = "stap4";
  public static final String VBT1  = "vbt1";

  public Page20ErkenningForm4() {

    setCaptionAndOrder();
  }

  @Override
  public Page20ErkenningBean4 getNewBean() {
    return new Page20ErkenningBean4();
  }

  public void setCaptionAndOrder() {
  }

  @FormFieldFactoryBean(accessType = ElementType.FIELD)
  public class Page20ErkenningBean4 implements Serializable {

    @Field(customTypeClass = GbaNativeSelect.class,
        caption = "Mogelijkheid naar recht verblijfplaats (land) erkenner?",
        required = true)
    @Select(containerDataSource = NLBooleanContainer.class,
        itemCaptionPropertyId = NLBooleanContainer.JA_NEE)
    @Immediate
    private Boolean stap4 = null;

    @Field(type = FieldType.LABEL,
        caption = "Verblijfplaats erkenner in")
    private String vbt1 = "";

    public Boolean getStap4() {
      return stap4;
    }

    public void setStap4(Boolean stap4) {
      this.stap4 = stap4;
    }

    public String getVbt1() {
      return vbt1;
    }

    public void setVbt1(String vbt1) {
      this.vbt1 = vbt1;
    }
  }
}
