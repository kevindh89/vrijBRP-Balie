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

package nl.procura.gba.web.modules.zaken.uittreksel.page3;

import static nl.procura.diensten.gba.ple.openoffice.DocumentPLConverter.convert;
import static nl.procura.diensten.gba.ple.openoffice.DocumentPLConverter.removeStillborns;
import static nl.procura.gba.web.services.zaken.documenten.DocumentType.PL_UITTREKSEL;
import static nl.procura.standard.Globalfunctions.toBigDecimal;
import static nl.procura.commons.core.exceptions.ProExceptionSeverity.INFO;
import static nl.procura.commons.core.exceptions.ProExceptionType.SELECT;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.ui.Button;

import nl.procura.diensten.gba.ple.extensions.BasePLExt;
import nl.procura.diensten.gba.ple.extensions.Cat1PersoonExt;
import nl.procura.diensten.gba.ple.openoffice.DocumentPL;
import nl.procura.gba.common.ZaakStatusType;
import nl.procura.gba.web.components.fields.values.UsrFieldValue;
import nl.procura.gba.web.components.layouts.form.document.PrintMultiLayout;
import nl.procura.gba.web.components.layouts.form.document.PrintRecord;
import nl.procura.gba.web.modules.zaken.common.ZakenPage;
import nl.procura.gba.web.modules.zaken.document.page1.Page1DocumentTable;
import nl.procura.gba.web.modules.zaken.uittreksel.page5.Page5Uittreksel;
import nl.procura.gba.web.services.gba.ple.relatieLijst.Relatie;
import nl.procura.gba.web.services.gba.ple.relatieLijst.RelatieType;
import nl.procura.gba.web.services.zaken.documenten.DocumentRecord;
import nl.procura.gba.web.services.zaken.documenten.aanvragen.DocumentZaak;
import nl.procura.gba.web.services.zaken.documenten.aanvragen.DocumentZaakPersoon;
import nl.procura.gba.web.services.zaken.documenten.aanvragen.DocumentZakenService;
import nl.procura.standard.ProcuraDate;
import nl.procura.commons.core.exceptions.ProException;
import nl.procura.vaadin.component.dialog.ConfirmDialog;
import nl.procura.vaadin.component.field.fieldvalues.AnrFieldValue;
import nl.procura.vaadin.component.field.fieldvalues.BsnFieldValue;
import nl.procura.vaadin.component.layout.page.pageEvents.InitPage;
import nl.procura.vaadin.component.layout.page.pageEvents.PageEvent;

/**
 * Nieuw uittreksel
 */
public class Page3Uittreksel extends ZakenPage {

  private Page1DocumentTable table       = null;
  private PrintMultiLayout   printLayout = null;

  public Page3Uittreksel() {
    super("Uittreksel: nieuw");
  }

  /**
   * Relatie toevoegen aan tabel
   */
  public void addRelatie(Relatie relatie) {
    table.addRelatie(relatie);
  }

  @Override
  public void event(PageEvent event) {

    if (event.isEvent(InitPage.class)) {

      printLayout = new PrintMultiLayout(null, null, null, PL_UITTREKSEL) {

        @Override
        protected void afterPrintRecord(PrintRecord record, boolean isPreview) {

          if (!isPreview) {
            opslaanZaak((DocumentZaak) record.getZaak());
          }
        }

        @Override
        protected void doPrint(boolean isPreview) {
          checkMachtiging(isPreview);
        }

        @Override
        protected List<PrintRecord> getPrintRecords(boolean isPreview) {

          if (table.getSelectedRecords().isEmpty()) {
            throw new ProException(SELECT, INFO, "Er zijn geen personen geselecteerd");
          }

          List<PrintRecord> printRecords = new ArrayList<>();

          for (PrintRecord printRecord : super.getPrintRecords(isPreview)) {

            PrintRecord newPrintRecord = new PrintRecord();
            List<BasePLExt> pls = new ArrayList<>();

            ArrayList<Relatie> relaties = table.getSelectedValues(Relatie.class);
            for (Relatie relatie : relaties) {
              pls.add(relatie.getPl());
            }

            DocumentRecord document = printRecord.getDocument();
            List<DocumentPL> dps = convert(pls, null);
            dps.stream().filter(dp -> !document.isStillbornAllowed()).forEach(dpl -> removeStillborns(dpl));

            newPrintRecord.setZaak(samenstellenZaak(relaties, printRecord));
            newPrintRecord.setSoort(printRecord.getSoort());
            newPrintRecord.setDocument(document);
            newPrintRecord.setUitvoer(printRecord.getUitvoer());
            newPrintRecord.setModel(dps);
            printRecords.add(newPrintRecord);
          }

          return printRecords;
        }

        private void checkMachtiging(final boolean isPreview) {

          if (isMachtigingNodig()) {
            ConfirmDialog window = new ConfirmDialog("Is er een machtiging overlegd?") {

              @Override
              public void buttonYes() {
                closeWindow();
                continuePrint(isPreview);
              }
            };

            getWindow().addWindow(window);
          } else {
            continuePrint(isPreview);
          }
        }

        private void continuePrint(boolean isPreview) {
          super.doPrint(isPreview);
        }

        private boolean isMachtigingNodig() {
          for (Relatie rel : table.getSelectedValues(Relatie.class)) {
            if (rel.getRelatieType() == RelatieType.NIET_GERELATEERD) {
              return true;
            }
          }

          return false;
        }
      };

      addButton(buttonPrev);

      addButton(getPrintButtons());

      buttonNew.setCaption("Toevoegen persoon");

      addButton(buttonNew);

      table = new Page1DocumentTable() {

        @Override
        public void setRecords() {
          for (Relatie relatie : getApplication()
              .getServices().getPersonenWsService().getRelatieLijst(getPl(), false)
              .getSortedRelaties()) {

            if (relatie.isHuisgenoot()) {
              addRelatie(relatie);
            }
          }
        }
      };

      addComponent(table);
      addExpandComponent(printLayout);
    }

    super.event(event);
  }

  public Button[] getPrintButtons() {
    return printLayout.getButtons();
  }

  @Override
  public void handleEvent(Button button, int keyCode) {
    printLayout.handleActions(button, keyCode);
    super.handleEvent(button, keyCode);
  }

  @Override
  public void onNew() {
    getNavigation().goToPage(new Page5Uittreksel(getPl().getVerblijfplaats().getAdres()));
  }

  /**
   * Herlaad records
   */
  public void reloadRecords() {
    table.reloadRecords();
  }

  /**
   * Opslaan van de uittreksel aanvraag zaak
   */
  private DocumentZaak opslaanZaak(DocumentZaak aanvraag) {
    DocumentZakenService uittreksels = getApplication().getServices().getDocumentZakenService();
    uittreksels.save(aanvraag);

    return aanvraag;
  }

  /**
   * Opslaan van de uittreksel aanvraag zaak
   */
  private DocumentZaak samenstellenZaak(List<Relatie> relaties, PrintRecord printRecord) {

    DocumentZaak aanvraag = (DocumentZaak) getServices().getDocumentZakenService().getNewZaak();
    aanvraag.setAnr(getPl().getPersoon().getAnr().getVal());
    aanvraag.setIndVerwerkt(toBigDecimal(ZaakStatusType.VERWERKT.getCode()));
    aanvraag.setIngevoerdDoor(new UsrFieldValue(getApplication().getServices().getGebruiker()));

    Cat1PersoonExt pl = getServices().getPersonenWsService().getHuidige().getPersoon();
    AnrFieldValue anr = new AnrFieldValue(pl.getAnr().getVal());
    BsnFieldValue bsn = new BsnFieldValue(pl.getBsn().getVal());

    aanvraag.setAnummer(anr);
    aanvraag.setBurgerServiceNummer(bsn);

    for (Relatie relatie : relaties) {
      AnrFieldValue relAnr = new AnrFieldValue(relatie.getPl().getPersoon().getAnr().getVal());
      BsnFieldValue relBsn = new BsnFieldValue(relatie.getPl().getPersoon().getBsn().getVal());
      aanvraag.getPersonen().add(new DocumentZaakPersoon(relAnr, relBsn, relatie.getRelatieType()));
    }

    ProcuraDate currentDate = new ProcuraDate();

    aanvraag.setDAanvr(toBigDecimal(currentDate.getSystemDate()));
    aanvraag.setTAanvr(toBigDecimal(currentDate.getSystemTime()));
    aanvraag.setDoc(printRecord.getDocument());

    aanvraag.setIdVragen(toBigDecimal(1));
    aanvraag.setLocatieInvoer(getApplication().getServices().getGebruiker().getLocatie());

    aanvraag.setDocumentAfn(""); // Niet meer van toepassing
    aanvraag.setDocumentDoel(""); // Niet meer van toepassing

    return aanvraag;
  }
}
