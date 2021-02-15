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

package examples.nl.procura.gba.overige;

import static nl.procura.gba.web.rest.v1_0.persoon.contact.GbaRestContactgegevenType.EMAIL;
import static nl.procura.gba.web.rest.v1_0.persoon.contact.GbaRestContactgegevenType.TEL_THUIS;

import nl.procura.gba.web.rest.client.GbaRestClientException;
import nl.procura.gba.web.rest.v1_0.persoon.contact.GbaRestPersoonContactgegeven;
import nl.procura.gba.web.rest.v1_0.persoon.contact.GbaRestPersoonContactgegevenToevoegenVraag;
import nl.procura.gbaws.testdata.Testdata;

import examples.nl.procura.gba.GbaRestClientVoorbeelden;
import examples.nl.procura.gba.GbaRestGuice;
import examples.nl.procura.gba.GbaRestGuice.Timer;

public class GbaRestClientPersoonContactgegevensVoorbeelden extends GbaRestClientVoorbeelden {

  public GbaRestClientPersoonContactgegevensVoorbeelden() throws GbaRestClientException {
    toevoegen();
  }

  public static void main(String[] args) {
    GbaRestGuice.getInstance(GbaRestClientPersoonContactgegevensVoorbeelden.class);
  }

  @Timer
  protected void toevoegen() throws GbaRestClientException {

    GbaRestPersoonContactgegevenToevoegenVraag vraag = new GbaRestPersoonContactgegevenToevoegenVraag();
    vraag.setBurgerServiceNummer(Testdata.TEST_BSN_1);
    vraag.getContactgegevens().add(new GbaRestPersoonContactgegeven(EMAIL, "x@x.x"));
    vraag.getContactgegevens().add(new GbaRestPersoonContactgegeven(TEL_THUIS, "1234"));

    getObject(client.getPersoon().getContactgegevens().toevoegen(vraag));
  }
}
