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

package nl.procura.gba.web.services.inbox;

import static nl.procura.gba.common.MiscUtils.copy;
import static nl.procura.gba.common.MiscUtils.copyList;
import static nl.procura.standard.Globalfunctions.fil;
import static nl.procura.standard.Globalfunctions.pos;
import static nl.procura.standard.exceptions.ProExceptionSeverity.ERROR;

import java.util.List;

import nl.procura.gba.common.ConditionalMap;
import nl.procura.gba.common.ZaakType;
import nl.procura.gba.jpa.personen.dao.GpkDao;
import nl.procura.gba.jpa.personen.dao.InboxDao;
import nl.procura.gba.jpa.personen.dao.ZaakKey;
import nl.procura.gba.jpa.personen.db.Inbox;
import nl.procura.gba.jpa.personen.db.InboxBestand;
import nl.procura.gba.web.common.misc.ZakenList;
import nl.procura.gba.web.services.ServiceEvent;
import nl.procura.gba.web.services.aop.ThrowException;
import nl.procura.gba.web.services.aop.Timer;
import nl.procura.gba.web.services.aop.Transactional;
import nl.procura.gba.web.services.zaken.algemeen.AbstractZaakService;
import nl.procura.gba.web.services.zaken.algemeen.Zaak;
import nl.procura.gba.web.services.zaken.algemeen.ZaakArgumenten;
import nl.procura.gba.web.services.zaken.algemeen.ZaakService;
import nl.procura.standard.exceptions.ProException;

/**
 * Service voor behandelen van Inbox berichten
 */
public class InboxService extends AbstractZaakService<InboxRecord> implements ZaakService<InboxRecord> {

  public InboxService() {
    super("Inbox", ZaakType.INBOX);
  }

  @Override
  @Timer
  @ThrowException("Fout bij het zoeken van inbox records")
  public int getZakenCount(ZaakArgumenten zaakArgumenten) {
    return InboxDao.findCount(getArgumentenToMap(zaakArgumenten));
  }

  @Override
  @Timer
  @ThrowException("Fout bij het zoeken van inbox records")
  public List<InboxRecord> getMinimalZaken(ZaakArgumenten zaakArgumenten) {
    return new ZakenList(copyList(InboxDao.find(getArgumentenToMap(zaakArgumenten)), InboxRecord.class));
  }

  @Override
  public Zaak getNewZaak() {
    return aanvullenZaak(new InboxRecord());
  }

  @Override
  @ThrowException("Het is niet mogelijk om de zaak op te vragen")
  public InboxRecord getStandardZaak(InboxRecord zaak) {
    InboxBestand bestand = InboxDao.findInboxBestandByInboxCode(zaak.getCInbox());
    if (bestand != null) {
      zaak.setBestandsbytes(bestand.getBestand());
    }
    return super.getStandardZaak(zaak);
  }

  @Override
  @Timer
  @ThrowException("Fout bij het zoeken van zaak-ids")
  public List<ZaakKey> getZaakKeys(ZaakArgumenten zaakArgumenten) {
    return InboxDao.findZaakKeys(getArgumentenToMap(zaakArgumenten));
  }

  @Timer
  @ThrowException("Fout bij het zoeken van de records")
  public List<InboxRecord> getZaken(ZaakArgumenten zaakArgumenten) {
    return copyList(InboxDao.find(getArgumentenToMap(zaakArgumenten)), InboxRecord.class);
  }

  @Override
  @Transactional
  public void save(InboxRecord zaak) {

    if (isSaved(zaak)) {
      opslaanStandaardZaak(zaak);
    } else {
      int aantalZaken = getServices().getZakenService().getAantalZaken(new ZaakArgumenten(zaak.getZaakIdExtern()));

      if (zaak.isNieuw() && pos(aantalZaken)) {
        throw new ProException(ERROR, "Er is al een zaak met zaak-id " + zaak.getZaakIdExtern());
      }

      getZaakStatussen().setInitieleStatus(zaak);
      opslaanStandaardZaak(zaak);
      InboxRecordBestand inboxBestand = new InboxRecordBestand(zaak.getBestandsbytes());
      inboxBestand.setInbox(copy(zaak, Inbox.class));
      saveEntity(inboxBestand);
    }

    callListeners(ServiceEvent.CHANGE);
  }

  @Override
  @Transactional
  @ThrowException("Fout bij verwijderen")
  public void delete(InboxRecord zaak) {

    if (fil(zaak.getZaakId())) {

      ConditionalMap map = new ConditionalMap();
      map.put(GpkDao.ZAAK_ID, zaak.getZaakId());
      map.put(GpkDao.MAX_CORRECT_RESULTS, 1);

      removeEntities(InboxDao.find(map));

      deleteZaakRelaties(zaak);
    }

    callListeners(ServiceEvent.CHANGE);
  }

  private ConditionalMap getArgumentenToMap(ZaakArgumenten zaakArgumenten) {
    return getAlgemeneArgumentenToMap(zaakArgumenten);
  }
}
