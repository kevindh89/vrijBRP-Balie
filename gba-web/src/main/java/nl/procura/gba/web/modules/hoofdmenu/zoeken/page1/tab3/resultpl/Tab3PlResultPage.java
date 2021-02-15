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

package nl.procura.gba.web.modules.hoofdmenu.zoeken.page1.tab3.resultpl;

import static nl.procura.burgerzaken.gba.core.enums.GBACat.*;
import static nl.procura.standard.Globalfunctions.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.github.wolfie.refresher.Refresher;
import com.github.wolfie.refresher.Refresher.RefreshListener;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;

import nl.procura.diensten.gba.ple.extensions.BasePLExt;
import nl.procura.diensten.gba.ple.procura.arguments.PLEArgs;
import nl.procura.diensten.gba.ple.procura.arguments.PLEDatasource;
import nl.procura.diensten.gba.ple.procura.templates.custom.CustomTemplate;
import nl.procura.diensten.gba.wk.baseWK.BaseWKPerson;
import nl.procura.diensten.gba.wk.baseWK.BaseWKValue;
import nl.procura.diensten.gba.wk.extensions.BaseWKExt;
import nl.procura.diensten.gba.wk.extensions.WKResultWrapper;
import nl.procura.gba.web.common.misc.java.PartitionUtil;
import nl.procura.gba.web.components.layouts.table.overlays.WaitTableOverlay;
import nl.procura.gba.web.components.layouts.tablefilter.export.ExportButton;
import nl.procura.gba.web.modules.hoofdmenu.zoeken.page1.tab3.Tab3Page;
import nl.procura.gba.web.modules.zaken.woningkaart.page1.Page1WoningkaartTable;
import nl.procura.gba.web.modules.zaken.woningkaart.page1.WoningkaartPersonenLayout;
import nl.procura.gba.web.modules.zaken.woningkaart.window.WoningObjectWindow;
import nl.procura.gba.web.services.beheer.bag.ProcuraInhabitantsAddress;
import nl.procura.gba.web.services.beheer.parameter.ParameterConstant;
import nl.procura.gba.web.theme.GbaWebTheme;
import nl.procura.vaadin.component.layout.page.pageEvents.InitPage;
import nl.procura.vaadin.component.layout.page.pageEvents.PageEvent;
import nl.procura.vaadin.functies.VaadinUtils;

public class Tab3PlResultPage extends Tab3Page {

  private final static int SET_SIZE         = 250;
  private final Button     objectInfoButton = new Button("Objectinformatie (F3)");

  private final Label           adresIndicatie = new Label();
  private final Refresher       refresher      = new Refresher();
  private final List<BasePLExt> personen       = new ArrayList<>();
  private Page1WoningkaartTable table          = null;
  private WaitTableOverlay      waitOverlay    = null;
  private WKResultWrapper       result;
  private BaseWKExt             wk             = null;
  private int                   totalSize      = 0;

  public Tab3PlResultPage(Tab3Page parentPage, WKResultWrapper newResult) {

    super(parentPage, "Woningkaart: overzicht bewoner");

    setMargin(true);
    setResult(newResult);

    addButton(buttonPrev);
    addButton(objectInfoButton);

    adresIndicatie.setWidth("80px");
    adresIndicatie.setHeight("25px");
    adresIndicatie.setVisible(false);
  }

  @Override
  public void event(PageEvent event) {

    if (event.isEvent(InitPage.class)) {

      addForm();

      table = new Page1WoningkaartTable() {

        @Override
        public void onClick(Record record) {
          selectRecord((BaseWKPerson) record.getObject());
        }

        @Override
        public void setRecords() {

          try {

            adresIndicatie.setVisible(false);

            if (result.getBasisWkWrappers().size() > 0) {

              parseResult(result);
            }
          } catch (Exception e) {
            getApplication().handleException(getWindow(), e);
          }
        }
      };

      addButton(new ExportButton(table));

      getButtonLayout().addComponent(adresIndicatie);
      getButtonLayout().setComponentAlignment(adresIndicatie, Alignment.MIDDLE_CENTER);

      BaseWKExt wk = result.getBasisWkWrappers().get(0);

      addComponent(new WoningkaartPersonenLayout().set(wk));

      waitOverlay = new WaitTableOverlay(table);

      addExpandComponent(table);
      addComponent(waitOverlay);

      refresher.addListener(new DatabaseListener());
      refresher.setRefreshInterval(500);

      addComponent(refresher);
    }

    super.event(event);
  }

  public WKResultWrapper getResult() {
    return result;
  }

  public void setResult(WKResultWrapper result) {
    this.result = result;
  }

  public BaseWKExt getWk() {
    return wk;
  }

  public void setWk(BaseWKExt wk) {
    this.wk = wk;
  }

  @Override
  public void handleEvent(Button button, int keyCode) {

    if ((button == objectInfoButton) || (objectInfoButton.isEnabled() && (keyCode == KeyCode.F3))) {
      getParentWindow().addWindow(new WoningObjectWindow(new ProcuraInhabitantsAddress(getWk())));
    }

    super.handleEvent(button, keyCode);
  }

  @Override
  public void onEnter() {

    if (table.getRecord() != null) {
      selectRecord((BaseWKPerson) table.getRecord().getObject());
    }
  }

  private List<BasePLExt> getPersoonslijsten(List<BaseWKPerson> personen) {

    if (pos(personen.size())) {
      PLEArgs args = new PLEArgs();

      for (BaseWKPerson p : personen) {
        String anr = p.getAnummer().getCode();
        String bsn = p.getBsn().getCode();
        args.addNummer(pos(anr) ? anr : bsn);
      }

      args.setCustomTemplate(CustomTemplate.WK);
      args.setDatasource(PLEDatasource.PROCURA);
      args.setShowHistory(false);
      args.setShowArchives(false);
      args.addCat(PERSOON, VB, INSCHR, VERW);
      args.setCat(HUW_GPS, isTru(getApplication().getServices().getGebruiker().getParameters().get(
          ParameterConstant.ZOEK_PLE_NAAMGEBRUIK).getValue()));

      if (args.getNumbers().size() > 0) {
        return getApplication().getServices().getPersonenWsService().getPersoonslijsten(args,
            false).getBasisPLWrappers();
      }
    }

    return new ArrayList<>();
  }

  private void parseResult(WKResultWrapper result) {

    objectInfoButton.setEnabled(true);

    for (BaseWKExt wk : result.getBasisWkWrappers()) {

      setWk(wk);

      setAdresIndicatie(wk);

      if (wk.getBasisWk().getPersonen().size() < SET_SIZE) {

        table.addToTable(wk.getBasisWk().getPersonen(), getPersoonslijsten(wk.getBasisWk().getPersonen()));

        setGeheimMelding();
      } else {

        new BackgroundThread().start();
      }

      return;
    }
  }

  private void selectRecord(BaseWKPerson pl) {

    String nr = pl.getAnummer().getCode();
    nr = fil(nr) ? nr : pl.getBsn().getCode();
    getApplication().goToPl(getWindow(), "", PLEDatasource.STANDAARD, nr);
  }

  private void setAdresIndicatie(BaseWKExt wk) {

    BaseWKValue ind = wk.getBasisWk().getAdres_indicatie();

    if (pos(ind.getCode())) {
      adresIndicatie.setValue(StringUtils.abbreviate(ind.getDescr(), 10));
      adresIndicatie.setVisible(true);
      adresIndicatie.setStyleName(GbaWebTheme.TEXTBOX.RED);
      adresIndicatie.setDescription(ind.getDescr());
    }
  }

  private void setGeheimMelding() {

    String melding = table.getGeheimMelding();

    if (fil(melding)) {

      VaadinUtils.getChild(this, WoningkaartPersonenLayout.class).append(melding);
    }
  }

  public class BackgroundThread extends Thread {

    @Override
    public void run() {

      totalSize = wk.getBasisWk().getPersonen().size();

      try {

        waitOverlay.setVisible(true);

        waitOverlay.setText("Lijst wordt geladen ... ");

        for (List<BaseWKPerson> partition : PartitionUtil.partition(wk.getBasisWk().getPersonen(),
            SET_SIZE)) {

          personen.addAll(getPersoonslijsten(partition));
        }

        table.addToTable(wk.getBasisWk().getPersonen(), personen);

        waitOverlay.setVisible(false);

        refresher.setEnabled(false);
      } catch (Exception e) {
        getApplication().handleException(getWindow(), e);
      }
    }
  }

  public class DatabaseListener implements RefreshListener {

    @Override
    public void refresh(com.github.wolfie.refresher.Refresher source) {

      double perc = (100.00 / totalSize) * personen.size();

      waitOverlay.setText("Lijst wordt geladen ... <b>" + ((int) perc) + "%</b>");
    }
  }
}
