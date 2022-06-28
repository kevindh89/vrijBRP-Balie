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

package nl.procura.gba.web.services.beheer.profiel.actie;

import static nl.procura.gba.web.services.beheer.profiel.actie.ProfielActieType.*;
import static nl.procura.standard.Globalfunctions.eq;
import static nl.procura.standard.Globalfunctions.fil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum ProfielActie {

  ONBEKEND(new Actie(SELECT, "")),
  SELECT_BEHEER_PARAMETERS(new Actie(SELECT, ActieDescr.BEHEER_PARAMETERS)),
  UPDATE_BEHEER_PARAMETERS(new Actie(UPDATE, ActieDescr.BEHEER_PARAMETERS)),
  DELETE_BEHEER_PARAMETERS(new Actie(DELETE, ActieDescr.BEHEER_PARAMETERS)),
  SELECT_BEHEER_LOG(new Actie(SELECT, ActieDescr.BEHEER_LOG)),
  UPDATE_BEHEER_LOG(new Actie(UPDATE, ActieDescr.BEHEER_LOG)),
  DELETE_BEHEER_LOG(new Actie(DELETE, ActieDescr.BEHEER_LOG)),
  SELECT_BEHEER_DMS(new Actie(SELECT, ActieDescr.BEHEER_DMS)),
  UPDATE_BEHEER_DMS(new Actie(UPDATE, ActieDescr.BEHEER_DMS)),
  DELETE_BEHEER_DMS(new Actie(DELETE, ActieDescr.BEHEER_DMS)),
  SELECT_BEHEER_EMAIL(new Actie(SELECT, ActieDescr.BEHEER_EMAIL)),
  UPDATE_BEHEER_EMAIL(new Actie(UPDATE, ActieDescr.BEHEER_EMAIL)),
  DELETE_BEHEER_EMAIL(new Actie(DELETE, ActieDescr.BEHEER_EMAIL)),
  SELECT_BEHEER_SMS(new Actie(SELECT, ActieDescr.BEHEER_SMS)),
  UPDATE_BEHEER_SMS(new Actie(UPDATE, ActieDescr.BEHEER_SMS)),
  DELETE_BEHEER_SMS(new Actie(DELETE, ActieDescr.BEHEER_SMS)),
  SELECT_BEHEER_VERKIEZING(new Actie(SELECT, ActieDescr.BEHEER_VERKIEZING)),
  UPDATE_BEHEER_VERKIEZING(new Actie(UPDATE, ActieDescr.BEHEER_VERKIEZING)),
  DELETE_BEHEER_VERKIEZING(new Actie(DELETE, ActieDescr.BEHEER_VERKIEZING)),
  SELECT_BEHEER_GEBRUIKERS(new Actie(SELECT, ActieDescr.BEHEER_GEBRUIKERS)),
  UPDATE_BEHEER_GEBRUIKERS(new Actie(UPDATE, ActieDescr.BEHEER_GEBRUIKERS)),
  DELETE_BEHEER_GEBRUIKERS(new Actie(DELETE, ActieDescr.BEHEER_GEBRUIKERS)),
  SELECT_BEHEER_ONDERHOUD(new Actie(SELECT, ActieDescr.BEHEER_ONDERHOUD)),
  UPDATE_BEHEER_ONDERHOUD(new Actie(UPDATE, ActieDescr.BEHEER_ONDERHOUD)),
  DELETE_BEHEER_ONDERHOUD(new Actie(DELETE, ActieDescr.BEHEER_ONDERHOUD)),
  SELECT_BEHEER_PROFIELEN(new Actie(SELECT, ActieDescr.BEHEER_PROFIELEN)),
  UPDATE_BEHEER_PROFIELEN(new Actie(UPDATE, ActieDescr.BEHEER_PROFIELEN)),
  DELETE_BEHEER_PROFIELEN(new Actie(DELETE, ActieDescr.BEHEER_PROFIELEN)),
  SELECT_BEHEER_LICENTIE(new Actie(SELECT, ActieDescr.BEHEER_LICENTIE)),
  UPDATE_BEHEER_LICENTIE(new Actie(UPDATE, ActieDescr.BEHEER_LICENTIE)),
  DELETE_BEHEER_LICENTIE(new Actie(DELETE, ActieDescr.BEHEER_LICENTIE)),
  SELECT_BEHEER_PROTOCOLLERING(new Actie(SELECT, ActieDescr.BEHEER_PROTOCOLLERING)),
  UPDATE_BEHEER_PROTOCOLLERING(new Actie(UPDATE, ActieDescr.BEHEER_PROTOCOLLERING)),
  DELETE_BEHEER_PROTOCOLLERING(new Actie(DELETE, ActieDescr.BEHEER_PROTOCOLLERING)),
  SELECT_BEHEER_VOORRAAD(new Actie(SELECT, ActieDescr.BEHEER_VOORRAAD)),
  UPDATE_BEHEER_VOORRAAD(new Actie(UPDATE, ActieDescr.BEHEER_VOORRAAD)),
  DELETE_BEHEER_VOORRAAD(new Actie(DELETE, ActieDescr.BEHEER_VOORRAAD)),
  SELECT_BEHEER_DOCUMENTEN(new Actie(SELECT, ActieDescr.BEHEER_DOCUMENTEN)),
  UPDATE_BEHEER_DOCUMENTEN(new Actie(UPDATE, ActieDescr.BEHEER_DOCUMENTEN)),
  DELETE_BEHEER_DOCUMENTEN(new Actie(DELETE, ActieDescr.BEHEER_DOCUMENTEN)),
  SELECT_BEHEER_LOCATIE(new Actie(SELECT, ActieDescr.BEHEER_LOCATIE)),
  UPDATE_BEHEER_LOCATIE(new Actie(UPDATE, ActieDescr.BEHEER_LOCATIE)),
  DELETE_BEHEER_LOCATIE(new Actie(DELETE, ActieDescr.BEHEER_LOCATIE)),
  SELECT_BEHEER_KASSA(new Actie(SELECT, ActieDescr.BEHEER_KASSA)),
  UPDATE_BEHEER_KASSA(new Actie(UPDATE, ActieDescr.BEHEER_KASSA)),
  DELETE_BEHEER_KASSA(new Actie(DELETE, ActieDescr.BEHEER_KASSA)),
  SELECT_BEHEER_LOGBESTANDEN(new Actie(SELECT, ActieDescr.BEHEER_LOGBESTANDEN)),
  UPDATE_BEHEER_LOGBESTANDEN(new Actie(UPDATE, ActieDescr.BEHEER_LOGBESTANDEN)),
  DELETE_BEHEER_LOGBESTANDEN(new Actie(DELETE, ActieDescr.BEHEER_LOGBESTANDEN)),
  SELECT_BASISTABEL_HUWELIJKSLOCATIES(new Actie(SELECT, ActieDescr.BASISTABEL_HUWELIJKSLOCATIES)),
  UPDATE_BASISTABEL_HUWELIJKSLOCATIES(new Actie(UPDATE, ActieDescr.BASISTABEL_HUWELIJKSLOCATIES)),
  DELETE_BASISTABEL_HUWELIJKSLOCATIES(new Actie(DELETE, ActieDescr.BASISTABEL_HUWELIJKSLOCATIES)),
  SELECT_BASISTABEL_RISICOPROFIELEN(new Actie(SELECT, ActieDescr.BASISTABEL_RISICOPROFIELEN)),
  UPDATE_BASISTABEL_RISICOPROFIELEN(new Actie(UPDATE, ActieDescr.BASISTABEL_RISICOPROFIELEN)),
  DELETE_BASISTABEL_RISICOPROFIELEN(new Actie(DELETE, ActieDescr.BASISTABEL_RISICOPROFIELEN)),
  SELECT_BASISTABEL_AKTES(new Actie(SELECT, ActieDescr.BASISTABEL_AKTES)),
  UPDATE_BASISTABEL_AKTES(new Actie(UPDATE, ActieDescr.BASISTABEL_AKTES)),
  DELETE_BASISTABEL_AKTES(new Actie(DELETE, ActieDescr.BASISTABEL_AKTES)),
  SELECT_BASISTABEL_GEMEENTEN(new Actie(SELECT, ActieDescr.BASISTABEL_GEMEENTEN)),
  UPDATE_BASISTABEL_GEMEENTEN(new Actie(UPDATE, ActieDescr.BASISTABEL_GEMEENTEN)),
  DELETE_BASISTABEL_GEMEENTEN(new Actie(DELETE, ActieDescr.BASISTABEL_GEMEENTEN)),
  SELECT_BASISTABEL_HUWELIJKSAMBTENAREN(new Actie(SELECT, ActieDescr.BASISTABEL_HUWELIJKSAMBTENAREN)),
  UPDATE_BASISTABEL_HUWELIJKSAMBTENAREN(new Actie(UPDATE, ActieDescr.BASISTABEL_HUWELIJKSAMBTENAREN)),
  DELETE_BASISTABEL_HUWELIJKSAMBTENAREN(new Actie(DELETE, ActieDescr.BASISTABEL_HUWELIJKSAMBTENAREN)),
  SELECT_BASISTABEL_BELANGHEBBENDEN(new Actie(SELECT, ActieDescr.BASISTABEL_BELANGHEBBENDEN)),
  UPDATE_BASISTABEL_BELANGHEBBENDEN(new Actie(UPDATE, ActieDescr.BASISTABEL_BELANGHEBBENDEN)),
  DELETE_BASISTABEL_BELANGHEBBENDEN(new Actie(DELETE, ActieDescr.BASISTABEL_BELANGHEBBENDEN)),
  SELECT_BASISTABEL_OVERLIJDENAANGEVERS(new Actie(SELECT, ActieDescr.BASISTABEL_OVERLIJDEN_AANGEVERS)),
  UPDATE_BASISTABEL_OVERLIJDENAANGEVERS(new Actie(UPDATE, ActieDescr.BASISTABEL_OVERLIJDEN_AANGEVERS)),
  DELETE_BASISTABEL_OVERLIJDENAANGEVERS(new Actie(DELETE, ActieDescr.BASISTABEL_OVERLIJDEN_AANGEVERS)),
  SELECT_BASISTABEL_KENNISBANKGEGEVENS(new Actie(SELECT, ActieDescr.BASISTABEL_KENNISBANKGEGEVENS)),
  UPDATE_BASISTABEL_KENNISBANKGEGEVENS(new Actie(UPDATE, ActieDescr.BASISTABEL_KENNISBANKGEGEVENS)),
  DELETE_BASISTABEL_KENNISBANKGEGEVENS(new Actie(DELETE, ActieDescr.BASISTABEL_KENNISBANKGEGEVENS)),
  SELECT_HOOFD_ZOEKEN(new Actie(SELECT, ActieDescr.HOOFD_ZOEKEN)),
  SELECT_HOOFD_KASSA(new Actie(SELECT, ActieDescr.HOOFD_KASSA)),
  SELECT_HOOFD_BSM(new Actie(SELECT, ActieDescr.HOOFD_BSM)),
  SELECT_HOOFD_INBOX(new Actie(SELECT, ActieDescr.HOOFD_INBOX)),
  SELECT_HOOFD_ZAKENREGISTER(new Actie(SELECT, ActieDescr.HOOFD_ZAKENREGISTER)),
  UPDATE_HOOFD_ZAKENREGISTER(new Actie(UPDATE, ActieDescr.HOOFD_ZAKENREGISTER)),
  DELETE_HOOFD_ZAKENREGISTER(new Actie(DELETE, ActieDescr.HOOFD_ZAKENREGISTER)),
  SELECT_HOOFD_GEMEENTELIJK(new Actie(SELECT, ActieDescr.HOOFD_GEMEENTELIJK)),
  SELECT_HOOFD_GBAV(new Actie(SELECT, ActieDescr.HOOFD_GBAV)),
  SELECT_HOOFD_WONINGKAART(new Actie(SELECT, ActieDescr.HOOFD_WONINGKAART)),
  SELECT_HOOFD_VERIFICATIEVRAAG(new Actie(SELECT, ActieDescr.HOOFD_VERIFICATIEVRAAG)),
  SELECT_HOOFD_UITVOEREN_PRESENTIEVRAAG(new Actie(SELECT, ActieDescr.HOOFD_UITVOEREN_PRESENTIEVRAAG)),
  SELECT_HOOFD_INZAGE_PRESENTIEVRAGEN(new Actie(SELECT, ActieDescr.HOOFD_INZAGE_PRESENTIEVRAGEN)),
  DELETE_HOOFD_INZAGE_PRESENTIEVRAGEN(new Actie(DELETE, ActieDescr.HOOFD_INZAGE_PRESENTIEVRAGEN)),
  SELECT_HOOFD_INZAGE_SMS(new Actie(SELECT, ActieDescr.HOOFD_INZAGE_SMS)),
  UPDATE_HOOFD_INZAGE_SMS(new Actie(UPDATE, ActieDescr.HOOFD_INZAGE_SMS)),
  DELETE_HOOFD_INZAGE_SMS(new Actie(DELETE, ActieDescr.HOOFD_INZAGE_SMS)),
  SELECT_HOOFD_INZAGE_RAAS(new Actie(SELECT, ActieDescr.HOOFD_INZAGE_RAAS)),
  UPDATE_HOOFD_INZAGE_RAAS(new Actie(UPDATE, ActieDescr.HOOFD_INZAGE_RAAS)),
  DELETE_HOOFD_INZAGE_RAAS(new Actie(DELETE, ActieDescr.HOOFD_INZAGE_RAAS)),
  SELECT_HOOFD_KLAPPER(new Actie(SELECT, ActieDescr.HOOFD_KLAPPER)),
  UPDATE_HOOFD_KLAPPER(new Actie(UPDATE, ActieDescr.HOOFD_KLAPPER)),
  DELETE_HOOFD_KLAPPER(new Actie(DELETE, ActieDescr.HOOFD_KLAPPER)),
  SELECT_ZAAK_AFSTAMMING(new Actie(SELECT, ActieDescr.ZAAK_AFSTAMMING)),
  UPDATE_ZAAK_AFSTAMMING(new Actie(UPDATE, ActieDescr.ZAAK_AFSTAMMING)),
  DELETE_ZAAK_AFSTAMMING(new Actie(DELETE, ActieDescr.ZAAK_AFSTAMMING)),
  SELECT_ZAAK_ONDERZOEK(new Actie(SELECT, ActieDescr.ZAAK_ONDERZOEK)),
  UPDATE_ZAAK_ONDERZOEK(new Actie(UPDATE, ActieDescr.ZAAK_ONDERZOEK)),
  DELETE_ZAAK_ONDERZOEK(new Actie(DELETE, ActieDescr.ZAAK_ONDERZOEK)),
  SELECT_CASE_RISK_ANALYSIS(new Actie(SELECT, ActieDescr.CASE_RISK_ANALYSIS)),
  UPDATE_CASE_RISK_ANALYSIS(new Actie(UPDATE, ActieDescr.CASE_RISK_ANALYSIS)),
  DELETE_CASE_RISK_ANALYSIS(new Actie(DELETE, ActieDescr.CASE_RISK_ANALYSIS)),
  SELECT_ZAAK_REGISTRATIE(new Actie(SELECT, ActieDescr.ZAAK_REGISTRATIE)),
  UPDATE_ZAAK_REGISTRATIE(new Actie(UPDATE, ActieDescr.ZAAK_REGISTRATIE)),
  DELETE_ZAAK_REGISTRATIE(new Actie(DELETE, ActieDescr.ZAAK_REGISTRATIE)),
  SELECT_ZAAK_OVERLIJDEN(new Actie(SELECT, ActieDescr.ZAAK_OVERLIJDEN)),
  UPDATE_ZAAK_OVERLIJDEN(new Actie(UPDATE, ActieDescr.ZAAK_OVERLIJDEN)),
  DELETE_ZAAK_OVERLIJDEN(new Actie(DELETE, ActieDescr.ZAAK_OVERLIJDEN)),
  SELECT_ZAAK_HUWELIJKGPS(new Actie(SELECT, ActieDescr.ZAAK_HUWELIJKGPS)),
  UPDATE_ZAAK_HUWELIJKGPS(new Actie(UPDATE, ActieDescr.ZAAK_HUWELIJKGPS)),
  DELETE_ZAAK_HUWELIJKGPS(new Actie(DELETE, ActieDescr.ZAAK_HUWELIJKGPS)),
  SELECT_ZAAK_OMZETTING(new Actie(SELECT, ActieDescr.ZAAK_OMZETTING)),
  UPDATE_ZAAK_OMZETTING(new Actie(UPDATE, ActieDescr.ZAAK_OMZETTING)),
  DELETE_ZAAK_OMZETTING(new Actie(DELETE, ActieDescr.ZAAK_OMZETTING)),
  SELECT_ZAAK_ONTBINDING(new Actie(SELECT, ActieDescr.ZAAK_ONTBINDING)),
  UPDATE_ZAAK_ONTBINDING(new Actie(UPDATE, ActieDescr.ZAAK_ONTBINDING)),
  DELETE_ZAAK_ONTBINDING(new Actie(DELETE, ActieDescr.ZAAK_ONTBINDING)),
  SELECT_ZAAK_GV(new Actie(SELECT, ActieDescr.ZAAK_GV)),
  UPDATE_ZAAK_GV(new Actie(UPDATE, ActieDescr.ZAAK_GV)),
  DELETE_ZAAK_GV(new Actie(DELETE, ActieDescr.ZAAK_GV)),
  SELECT_ZAAK_DOCUMENT(new Actie(SELECT, ActieDescr.ZAAK_DOCUMENT)),
  UPDATE_ZAAK_DOCUMENT(new Actie(UPDATE, ActieDescr.ZAAK_DOCUMENT)),
  DELETE_ZAAK_DOCUMENT(new Actie(DELETE, ActieDescr.ZAAK_DOCUMENT)),
  SELECT_ZAAK_DOCUMENT_ARCHIEF(new Actie(SELECT, ActieDescr.ZAAK_DOCUMENT_ARCHIEF)),
  UPDATE_ZAAK_DOCUMENT_ARCHIEF(new Actie(UPDATE, ActieDescr.ZAAK_DOCUMENT_ARCHIEF)),
  DELETE_ZAAK_DOCUMENT_ARCHIEF(new Actie(DELETE, ActieDescr.ZAAK_DOCUMENT_ARCHIEF)),
  SELECT_ZAAK_GPK(new Actie(SELECT, ActieDescr.ZAAK_GPK)),
  UPDATE_ZAAK_GPK(new Actie(UPDATE, ActieDescr.ZAAK_GPK)),
  DELETE_ZAAK_GPK(new Actie(DELETE, ActieDescr.ZAAK_GPK)),
  SELECT_ZAAK_CORRESPONDENTIE(new Actie(SELECT, ActieDescr.ZAAK_CORRESPONDENTIE)),
  UPDATE_ZAAK_CORRESPONDENTIE(new Actie(UPDATE, ActieDescr.ZAAK_CORRESPONDENTIE)),
  DELETE_ZAAK_CORRESPONDENTIE(new Actie(DELETE, ActieDescr.ZAAK_CORRESPONDENTIE)),
  SELECT_ZAAK_KIEZERSREGISTER(new Actie(SELECT, ActieDescr.ZAAK_KIEZERSREGISTER)),
  SELECT_ZAAK_NAAMGEBRUIK(new Actie(SELECT, ActieDescr.ZAAK_NAAMGEBRUIK)),
  UPDATE_ZAAK_NAAMGEBRUIK(new Actie(UPDATE, ActieDescr.ZAAK_NAAMGEBRUIK)),
  DELETE_ZAAK_NAAMGEBRUIK(new Actie(DELETE, ActieDescr.ZAAK_NAAMGEBRUIK)),
  SELECT_ZAAK_UITTREKSEL(new Actie(SELECT, ActieDescr.ZAAK_UITTREKSEL)),
  UPDATE_ZAAK_UITTREKSEL(new Actie(UPDATE, ActieDescr.ZAAK_UITTREKSEL)),
  DELETE_ZAAK_UITTREKSEL(new Actie(DELETE, ActieDescr.ZAAK_UITTREKSEL)),
  SELECT_ZAAK_INDICATIE(new Actie(SELECT, ActieDescr.ZAAK_INDICATIE)),
  UPDATE_ZAAK_INDICATIE(new Actie(UPDATE, ActieDescr.ZAAK_INDICATIE)),
  DELETE_ZAAK_INDICATIE(new Actie(DELETE, ActieDescr.ZAAK_INDICATIE)),
  SELECT_ZAAK_REISDOCUMENT(new Actie(SELECT, ActieDescr.ZAAK_REISDOCUMENT)),
  UPDATE_ZAAK_REISDOCUMENT(new Actie(UPDATE, ActieDescr.ZAAK_REISDOCUMENT)),
  DELETE_ZAAK_REISDOCUMENT(new Actie(DELETE, ActieDescr.ZAAK_REISDOCUMENT)),
  SELECT_ZAAK_INHOUDING(new Actie(SELECT, ActieDescr.ZAAK_INHOUDING)),
  UPDATE_ZAAK_INHOUDING(new Actie(UPDATE, ActieDescr.ZAAK_INHOUDING)),
  DELETE_ZAAK_INHOUDING(new Actie(DELETE, ActieDescr.ZAAK_INHOUDING)),
  SELECT_ZAAK_RIJBEWIJS(new Actie(SELECT, ActieDescr.ZAAK_RIJBEWIJS)),
  UPDATE_ZAAK_RIJBEWIJS(new Actie(UPDATE, ActieDescr.ZAAK_RIJBEWIJS)),
  DELETE_ZAAK_RIJBEWIJS(new Actie(DELETE, ActieDescr.ZAAK_RIJBEWIJS)),
  ZAAK_RIJBEWIJS_ONTVANGST(new Actie(UPDATE, ActieDescr.ZAAK_RIJBEWIJS_ONTVANGST)),
  ZAAK_RIJBEWIJS_ONGELDIG(new Actie(UPDATE, ActieDescr.ZAAK_RIJBEWIJS_ONGELDIG)),
  SELECT_SELECTIES(new Actie(SELECT, ActieDescr.ZAKEN_SELECTIES)),
  UPDATE_SELECTIES(new Actie(UPDATE, ActieDescr.ZAKEN_SELECTIES)),
  SELECT_VERLOPEN_ZAKEN(new Actie(SELECT, ActieDescr.VERLOPEN_ZAKEN)),
  DELETE_VERLOPEN_ZAKEN(new Actie(DELETE, ActieDescr.VERLOPEN_ZAKEN)),
  SELECT_ZAAK_TERUGMELDING(new Actie(SELECT, ActieDescr.ZAAK_TERUGMELDING)),
  UPDATE_ZAAK_TERUGMELDING(new Actie(UPDATE, ActieDescr.ZAAK_TERUGMELDING)),
  DELETE_ZAAK_TERUGMELDING(new Actie(DELETE, ActieDescr.ZAAK_TERUGMELDING)),
  SELECT_ZAAK_VERSTREKKINGSBEPERKING(new Actie(SELECT, ActieDescr.ZAAK_VERSTREKKINGSBEPERKING)),
  UPDATE_ZAAK_VERSTREKKINGSBEPERKING(new Actie(UPDATE, ActieDescr.ZAAK_VERSTREKKINGSBEPERKING)),
  DELETE_ZAAK_VERSTREKKINGSBEPERKING(new Actie(DELETE, ActieDescr.ZAAK_VERSTREKKINGSBEPERKING)),
  SELECT_ZAAK_VOG(new Actie(SELECT, ActieDescr.ZAAK_VOG)),
  UPDATE_ZAAK_VOG(new Actie(UPDATE, ActieDescr.ZAAK_VOG)),
  DELETE_ZAAK_VOG(new Actie(DELETE, ActieDescr.ZAAK_VOG)),
  SELECT_ZAAK_VERHUIZING(new Actie(SELECT, ActieDescr.ZAAK_VERHUIZING)),
  UPDATE_ZAAK_VERHUIZING(new Actie(UPDATE, ActieDescr.ZAAK_VERHUIZING)),
  DELETE_ZAAK_VERHUIZING(new Actie(DELETE, ActieDescr.ZAAK_VERHUIZING)),
  SELECT_OPTIE_IDENTIFICATIE(new Actie(SELECT, ActieDescr.OPTIE_IDENTIFICATIE)),
  SELECT_OPTIE_CONTACTGEGEVENS(new Actie(SELECT, ActieDescr.OPTIE_CONTACTGEGEVENS)),
  UPDATE_OPTIE_CONTACTGEGEVENS(new Actie(UPDATE, ActieDescr.OPTIE_CONTACTGEGEVENS)),
  DELETE_OPTIE_CONTACTGEGEVENS(new Actie(DELETE, ActieDescr.OPTIE_CONTACTGEGEVENS)),
  SELECT_OPTIE_AANTEKENINGEN(new Actie(SELECT, ActieDescr.OPTIE_AANTEKENINGEN)),
  UPDATE_OPTIE_AANTEKENINGEN(new Actie(UPDATE, ActieDescr.OPTIE_AANTEKENINGEN)),
  DELETE_OPTIE_AANTEKENINGEN(new Actie(DELETE, ActieDescr.OPTIE_AANTEKENINGEN)),
  SELECT_OPTIE_KAART(new Actie(SELECT, ActieDescr.OPTIE_KAART)),
  SELECT_OPTIE_PROTOCOLLERING(new Actie(SELECT, ActieDescr.OPTIE_PROTOCOLLERING)),
  SELECT_OPTIE_WONINGKAART(new Actie(SELECT, ActieDescr.OPTIE_WONINGKAART)),
  SELECT_OPTIE_SMS(new Actie(SELECT, ActieDescr.OPTIE_SMS)),
  UPDATE_OPTIE_SMS(new Actie(UPDATE, ActieDescr.OPTIE_SMS)),
  DELETE_OPTIE_SMS(new Actie(DELETE, ActieDescr.OPTIE_SMS)),
  SELECT_PL_MUTATIONS(new Actie(SELECT, ActieDescr.PL_MUTATIONS)),
  SELECT_PL_SUPERUSER_MUTATIONS(new Actie(SELECT, ActieDescr.PL_SUPER_USER_MUTATIONS)),
  SELECT_PL_OVERZICHT(new Actie(SELECT, ActieDescr.PL_OVERZICHT)),
  SELECT_PL_PERSOON(new Actie(SELECT, ActieDescr.PL_PERSOON)),
  SELECT_PL_OUDERS(new Actie(SELECT, ActieDescr.PL_OUDERS)),
  SELECT_PL_NATIONALITEIT(new Actie(SELECT, ActieDescr.PL_NATIONALITEIT)),
  SELECT_PL_HUWELIJKGPS(new Actie(SELECT, ActieDescr.PL_HUWELIJKGPS)),
  SELECT_PL_OVERLIJDEN(new Actie(SELECT, ActieDescr.PL_OVERLIJDEN)),
  SELECT_PL_INSCHRIJVING(new Actie(SELECT, ActieDescr.PL_INSCHRIJVING)),
  SELECT_PL_VERBLIJFPLAATS(new Actie(SELECT, ActieDescr.PL_VERBLIJFPLAATS)),
  SELECT_PL_KIND(new Actie(SELECT, ActieDescr.PL_KIND)),
  SELECT_PL_VERBLIJFSTITEL(new Actie(SELECT, ActieDescr.PL_VERBLIJFSTITEL)),
  SELECT_PL_GEZAGSVERHOUDING(new Actie(SELECT, ActieDescr.PL_GEZAGSVERHOUDING)),
  SELECT_PL_REISDOCUMENT(new Actie(SELECT, ActieDescr.PL_REISDOCUMENT)),
  SELECT_PL_KIESRECHT(new Actie(SELECT, ActieDescr.PL_KIESRECHT)),
  SELECT_PL_AFN_INDICATIES(new Actie(SELECT, ActieDescr.PL_AFN_INDICATIES)),
  SELECT_PL_RIJBEWIJS(new Actie(SELECT, ActieDescr.PL_RIJBEWIJS)),
  SELECT_PL_KLADBLOK_OUD(new Actie(SELECT, ActieDescr.PL_KLADBLOK_OUD)),
  SELECT_PL_LOKALE_AFNEMER_INDICATIES(new Actie(SELECT, ActieDescr.PL_LOKALE_AFNEMER_INDICATIES)),
  SELECT_PL_ONDERZOEKSGEGEVENS(new Actie(SELECT, ActieDescr.PL_ONDERZOEKSGEGEVENS));

  private final Actie actie;

  ProfielActie(Actie actie) {
    this.actie = actie;
  }

  public static ProfielActie getActie(ProfielActieType type, ProfielActie actie) {
    return Arrays.stream(values())
        .filter(p -> p.getActie().getType().equals(type) &&
            eq(p.getActie().getAction(), actie.getActie().getAction()))
        .findFirst()
        .orElse(actie == ONBEKEND ? ONBEKEND : null);
  }

  public static List<ProfielActie> getActies() {
    return Arrays.stream(values()).filter(a -> fil(a.getActie().getAction())).collect(Collectors.toList());
  }

  public Actie getActie() {
    return actie;
  }
}
