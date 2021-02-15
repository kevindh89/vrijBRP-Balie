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

package nl.procura.gba.web.modules.bs.overlijden.lijkvinding.page20;

import static nl.procura.gba.web.modules.bs.overlijden.lijkvinding.page20.Page20LijkvindingBean.DATUM_LIJKVINDING;
import static nl.procura.gba.web.modules.bs.overlijden.lijkvinding.page20.Page20LijkvindingBean.TIJD_LIJKVINDING;

import java.util.Calendar;
import java.util.Date;

import nl.procura.gba.web.common.misc.GbaDatumUtils;
import nl.procura.gba.web.components.layouts.form.GbaForm;
import nl.procura.gba.web.services.bs.overlijden.lijkvinding.DossierLijkvinding;
import nl.procura.vaadin.component.field.fieldvalues.TimeFieldValue;

public class Page20LijkvindingForm extends GbaForm<Page20LijkvindingBean> {

  private final DossierLijkvinding zaakDossier;

  public Page20LijkvindingForm(DossierLijkvinding zaakDossier) {
    this.zaakDossier = zaakDossier;
    init();
  }

  public Calendar getAanvangTermijnTijdstip() {
    Date date = (Date) getField(DATUM_LIJKVINDING).getValue();
    TimeFieldValue time = (TimeFieldValue) getField(TIJD_LIJKVINDING).getValue();
    return GbaDatumUtils.dateTimeFieldtoCalendar(date, time, "235900");
  }

  @Override
  public Page20LijkvindingBean getNewBean() {
    return new Page20LijkvindingBean();
  }

  public void setCaptionAndOrder() {
  }

  public void update() {
  }

  private void init() {
    setColumnWidths("170px", "");
    setCaptionAndOrder();

    Page20LijkvindingBean bean = getNewBean();
    bean.setPlaatsLijkvinding(zaakDossier.getPlaatsLijkvinding());
    setBean(bean);
  }
}
