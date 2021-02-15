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

package nl.procura.gba.web.modules.bs.onderzoek.adreslayout;

import com.vaadin.ui.Button;
import com.vaadin.ui.Layout;

import nl.procura.gba.web.common.misc.SelectListener;
import nl.procura.gba.web.components.layouts.OptieLayout;
import nl.procura.gba.web.services.Services;
import nl.procura.gba.web.services.bs.algemeen.persoon.DossierPersoon;
import nl.procura.gba.web.services.gba.basistabellen.gemeente.GemeenteService;
import nl.procura.vaadin.component.field.fieldvalues.FieldValue;
import nl.procura.vaadin.component.layout.Fieldset;
import nl.procura.vaadin.component.layout.VLayout;

import lombok.Getter;

public class AdresLayout extends VLayout {

  private final Button buttonControle = new Button("Controleer adres");
  @Getter
  private AdresForm1   form1;

  private final Button   buttonBewoners   = new Button("Toon bewoners");
  private final Button   buttonObjectInfo = new Button("Object informatie");
  private final Listener listener         = new Listener();

  @Getter
  private AdresForm2                           form2;
  @Getter
  private AdresForm3                           form3;
  private Adres                                adres;
  private final SelectListener<DossierPersoon> bewonerListener;
  private FormType                             type;

  public AdresLayout(Adres adres) {
    this(adres, null);
  }

  public AdresLayout(Adres adres, SelectListener<DossierPersoon> bewonerListener) {
    this.adres = adres;
    this.bewonerListener = bewonerListener;
  }

  public void setAdres(Adres adres) {
    this.adres = adres;
    updateForm();
  }

  public void setForm(FormType type) {
    this.type = type;
    updateForm();
  }

  public void save() {
    commit();

    // set values to empty as default
    adres.setAdres(new FieldValue());
    adres.setHnr("");
    adres.setHnrL("");
    adres.setHnrT("");
    adres.setHnrA(new FieldValue());
    adres.setPc(new FieldValue());
    adres.setPlaats(new FieldValue());
    adres.setGemeente(new FieldValue());
    adres.setBuitenl1("");
    adres.setBuitenl2("");
    adres.setBuitenl3("");
    adres.setLand(new FieldValue());
    adres.setAantalPersonen(new FieldValue());

    if (getForm1() != null) {
      adres.setAdres(getForm1().getBean().getStraat());
      adres.setHnr(getForm1().getBean().getHnr());
      adres.setHnrL(getForm1().getBean().getHnrL());
      adres.setHnrT(getForm1().getBean().getHnrT());
      adres.setHnrA(getForm1().getBean().getHnrA());
      adres.setPc(getForm1().getBean().getPc());
      adres.setPlaats(getForm1().getBean().getWoonplaats());
      adres.setAantalPersonen(getForm1().getBean().getAantalPersonen());
    }

    if (getForm2() != null) {
      adres.setAdres(getForm2().getBean().getStraat());
      adres.setHnr(getForm2().getBean().getHnr());
      adres.setHnrL(getForm2().getBean().getHnrL());
      adres.setHnrT(getForm2().getBean().getHnrT());
      adres.setHnrA(getForm2().getBean().getHnrA());
      adres.setPc(getForm2().getBean().getPc());
      adres.setPlaats(getForm2().getBean().getWoonplaats());
      adres.setGemeente(getForm2().getBean().getGemeente());

      // Zet aGemeente postbussen
      GemeenteService gemService = Services.getInstance().getGemeenteService();
      FieldValue aGemeente = adres.getGemeente();
      adres.setGemeentePostbus(gemService.getGemeente(aGemeente));
    }

    if (getForm3() != null) {
      adres.setBuitenl1(getForm3().getBean().getAdres1());
      adres.setBuitenl2(getForm3().getBean().getAdres2());
      adres.setBuitenl3(getForm3().getBean().getAdres3());
      adres.setLand(getForm3().getBean().getLand());
    }
  }

  private Layout getAdresLayout() {
    form1 = new AdresForm1(adres, bewonerListener);
    OptieLayout optieLayout = new OptieLayout();
    optieLayout.getLeft().addComponent(form1);
    optieLayout.getRight().addButton(buttonControle, listener);
    optieLayout.getRight().addButton(buttonBewoners, listener);
    optieLayout.getRight().addButton(buttonObjectInfo, listener);
    optieLayout.getRight().setWidth("130px");
    return new Fieldset("Adresgegevens binnen de gemeente", optieLayout);
  }

  public void commit() {
    if (form1 != null) {
      form1.commit();
    }
    if (form2 != null) {
      form2.commit();
    }
    if (form3 != null) {
      form3.commit();
    }
  }

  private Fieldset getBuitenGemeenteLayout() {
    form2 = new AdresForm2(adres);
    return new Fieldset("Adresgegevens in een andere gemeente", form2);
  }

  private Fieldset getBuitenlandLayout() {
    form3 = new AdresForm3(adres);
    return new Fieldset("Adresgegevens in het buitenland", form3);
  }

  public enum FormType {
    BINNEN_GEM,
    BUITEN_GEM,
    LAND
  }

  private void updateForm() {
    form1 = null;
    form2 = null;
    form3 = null;
    removeAllComponents();

    if (FormType.BINNEN_GEM.equals(type)) {
      addComponent(getAdresLayout());
    } else if (FormType.BUITEN_GEM.equals(type)) {
      addComponent(getBuitenGemeenteLayout());
    } else if (FormType.LAND.equals(type)) {
      addComponent(getBuitenlandLayout());
    }
  }

  private class Listener implements Button.ClickListener {

    @Override
    public void buttonClick(Button.ClickEvent event) {

      if (buttonBewoners.equals(event.getButton())) {
        onBewoners();
      } else if (buttonControle.equals(event.getButton())) {
        onControle();
      } else if (buttonObjectInfo.equals(event.getButton())) {
        onObjectInfo();
      }
    }
  }

  private void onBewoners() {
    form1.selectAdres(true, false);
  }

  private void onControle() {
    form1.selectAdres(false, false);
  }

  private void onObjectInfo() {
    form1.selectAdres(false, true);
  }
}
