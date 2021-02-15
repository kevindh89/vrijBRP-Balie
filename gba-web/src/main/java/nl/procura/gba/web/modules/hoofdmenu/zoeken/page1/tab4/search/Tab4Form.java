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

package nl.procura.gba.web.modules.hoofdmenu.zoeken.page1.tab4.search;

import static java.util.Arrays.asList;
import static nl.procura.gba.web.modules.hoofdmenu.zoeken.page1.ZoekBean.*;

import com.vaadin.ui.Field;

import nl.procura.gba.web.components.layouts.form.GbaForm;
import nl.procura.gba.web.modules.hoofdmenu.zoeken.page1.ZoekBean;
import nl.procura.vaadin.component.layout.table.TableLayout.Column;

public class Tab4Form extends GbaForm<ZoekBean> {

  public Tab4Form() {
    setColumnWidths(WIDTH_130, "250px", "110px", "");
  }

  @Override
  public ZoekBean getNewBean() {
    return new ZoekBean();
  }

  @Override
  public Field newField(Field field, Property property) {
    field.setWidth("200px");

    if (property.is(GEBOORTEDATUM) && asList(getOrder()).contains(BSN)) {
      getLayout().addBreak();
    }

    if (property.is(STRAAT)) {
      getLayout().addBreak();
    }

    return super.newField(field, property);
  }

  @Override
  public void setColumn(Column column, Field field, Property property) {
    if (property.is(BSN, VOORNAAM, REISDOC, RIJBEWIJS, VREEMDELINGENDOC)) {
      column.setColspan(3);
    }

    super.setColumn(column, field, property);
  }
}
