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

package nl.procura.gba.web.modules.hoofdmenu.zoeken.quicksearch.person.page1;

import static nl.procura.gba.web.modules.hoofdmenu.zoeken.quicksearch.person.page1.Page1QuickSearchBean.*;

import com.vaadin.ui.Field;

import nl.procura.gba.web.components.layouts.form.GbaForm;

public class Page1QuickSearchForm extends GbaForm<Page1QuickSearchBean> {

  public Page1QuickSearchForm() {
    setOrder(GESLACHTSNAAM, BSN, GEBOORTEDATUM, ANR);
    setColumnWidths(WIDTH_130, "", "110px", "");
    setBean(new Page1QuickSearchBean());
  }

  @Override
  public Field newField(Field field, Property property) {
    field.setWidth("150px");
    return super.newField(field, property);
  }
}
