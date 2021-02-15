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

package nl.procura.gba.web.modules.bs.registration.page50;

import static nl.procura.vaadin.annotation.field.Field.FieldType.LABEL;

import java.lang.annotation.ElementType;

import nl.procura.gba.common.DateTime;
import nl.procura.gba.web.components.layouts.form.GbaForm;
import nl.procura.vaadin.annotation.field.Field;
import nl.procura.vaadin.annotation.field.FormFieldFactoryBean;

import lombok.Data;

public class StartDateForm extends GbaForm<StartDateForm.Bean> {

  StartDateForm(DateTime startDate) {
    setCaption("Aanvang inschrijving");
    Bean bean = new Bean();
    bean.setStartDate(startDate);
    setBean(bean);
  }

  @Data
  @FormFieldFactoryBean(accessType = ElementType.FIELD)
  public static class Bean {

    @Field(type = LABEL, caption = "Datum aangifte")
    public DateTime startDate;
  }
}
