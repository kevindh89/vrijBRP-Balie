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

package examples.nl.procura.gbav.zoeken;

import static nl.procura.burgerzaken.gba.core.enums.GBACat.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import nl.procura.burgerzaken.gba.core.enums.GBAElem;
import nl.procura.diensten.gba.ple.base.*;
import nl.procura.diensten.gba.ple.procura.arguments.PLEArgs;
import nl.procura.diensten.gbav.utils.GbavAutorisatie;
import nl.procura.diensten.gbav.utils.GbavResultaat;
import nl.procura.diensten.gbav.utils.GbavService;
import nl.procura.diensten.gbav.utils.acties.GbavBeperkteZoekActie;
import nl.procura.diensten.gbav.utils.vraag.GbavVraagAntwoord;
import nl.procura.gbaws.testdata.Testdata;

public class TestBeperkteGbavZoeken {

  private final static Logger LOGGER = LoggerFactory.getLogger(TestBeperkteGbavZoeken.class.getName());

  public TestBeperkteGbavZoeken() {

    try {
      String endpoint = "https://<ip>/gba-v/online/lo3services/adhoc";
      GbavService gbav = new GbavService("<username>", "<password>", endpoint); // tot 06-12-2015

      GbavBeperkteZoekActie actie = gbav.getActies().getBeperkteZoekActie();
      GbavVraagAntwoord antwoord = actie.zoek(getArgumenten(), getAutorisatie(), new BasePLBuilder());

      new Formatter(antwoord.getBasisPLHandler().getResult());
      showResult(antwoord.getResultaat());
      BasePLViewer.view(antwoord.getBasisPLHandler().getResult().getBasePLs());

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    new TestBeperkteGbavZoeken();
  }

  public GbavAutorisatie getAutorisatie() {

    GbavAutorisatie autorisatie = new GbavAutorisatie();

    autorisatie.addElement(PERSOON, GBAElem.ANR);
    autorisatie.addElement(PERSOON, GBAElem.GESLACHTSAAND);
    autorisatie.addElement(HUW_GPS, GBAElem.ANR);
    autorisatie.addElement(OUDER_1, GBAElem.ANR);
    autorisatie.addElement(OUDER_2, GBAElem.ANR);
    autorisatie.addElement(KINDEREN, GBAElem.ANR);
    autorisatie.addElement(PERSOON, GBAElem.BSN);
    autorisatie.addElement(PERSOON, GBAElem.GESLACHTSNAAM);
    autorisatie.addElement(PERSOON, GBAElem.GEBOORTEPLAATS);
    autorisatie.addElement(PERSOON, GBAElem.GEBOORTELAND);
    autorisatie.addElement(VB, GBAElem.STRAATNAAM);
    autorisatie.addElement(VB, GBAElem.HNR_L);
    autorisatie.addElement(VB, GBAElem.HNR_T);
    autorisatie.addElement(VB, GBAElem.WPL_NAAM);
    autorisatie.addElement(VB, GBAElem.GEM_DEEL);
    autorisatie.addElement(VB, GBAElem.GEM_INSCHR);
    autorisatie.addElement(VB, GBAElem.HNR);
    autorisatie.addElement(VB, GBAElem.POSTCODE);
    autorisatie.addElement(HUW_GPS, GBAElem.REDEN_ONTBINDING);
    autorisatie.addElement(HUW_GPS, GBAElem.REDEN_ONTBINDING);
    autorisatie.addElement(NATIO, GBAElem.NATIONALITEIT);

    return autorisatie;
  }

  public PLEArgs getArgumenten() {

    PLEArgs args = new PLEArgs();
    args.addNummer(Testdata.TEST_ANR_101.toString());
    args.setShowHistory(true);
    args.addCat(PERSOON, NATIO, VB, KINDEREN);

    return args;
  }

  public void showResult(GbavResultaat result) {

    LOGGER.info("Result");
    LOGGER.info("---------");
    LOGGER.info("Code........: " + result.getCode());
    LOGGER.info("Letter......: " + result.getLetter());
    LOGGER.info("Omschrijving: " + result.getOmschrijving());
    LOGGER.info("Referentie..: " + result.getReferentie());
  }

  class Formatter extends BasePLFormatter {

    public Formatter(PLEResult ple) {
      super(ple);
    }

    @Override
    public String getNationalValue(int elementCode, BasePLValue value) {
      return "xyz";
    }
  }
}
