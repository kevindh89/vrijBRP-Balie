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

package nl.procura.gba.web.rest.v1_0.zaak.zoeken.riskanalysis;

import static nl.procura.gba.web.rest.v1_0.algemeen.GbaRestElementType.*;

import java.util.Map;

import nl.procura.gba.common.ZaakType;
import nl.procura.gba.jpa.personen.db.DossRiskAnalysisSubject;
import nl.procura.gba.jpa.personen.db.RiskProfile;
import nl.procura.gba.jpa.personen.db.RiskProfileRule;
import nl.procura.gba.web.rest.v1_0.algemeen.GbaRestElement;
import nl.procura.gba.web.rest.v1_0.zaak.GbaRestElementHandler;
import nl.procura.gba.web.services.Services;
import nl.procura.gba.web.services.bs.algemeen.Dossier;
import nl.procura.gba.web.services.bs.riskanalysis.DossierRiskAnalysis;
import nl.procura.gba.web.services.zaken.algemeen.Zaak;
import nl.procura.standard.exceptions.ProException;
import nl.procura.standard.exceptions.ProExceptionSeverity;
import nl.procura.vaadin.component.field.fieldvalues.AnrFieldValue;
import nl.procura.vaadin.component.field.fieldvalues.BsnFieldValue;

public class GbaRestRiskAnalysisHandler extends GbaRestElementHandler {

  public GbaRestRiskAnalysisHandler(Services services) {
    super(services);
  }

  public void convert(GbaRestElement gbaZaak, Zaak zaakParm) {

    Dossier zaak = (Dossier) zaakParm;
    DossierRiskAnalysis zaakDossier = (DossierRiskAnalysis) zaak.getZaakDossier();
    RiskProfile riskProfile = zaakDossier.getRiskProfile();

    if (riskProfile == null) {
      throw new ProException(ProExceptionSeverity.ERROR, "Deze zaak is niet (meer) gekoppeld aan een risicoprofiel");
    }

    ZaakType refZaakType = ZaakType.get(zaakDossier.getRefCaseType().longValue());

    GbaRestElement risicoAnalyse = gbaZaak.add(RISICOANALYSE);
    add(risicoAnalyse, RELATIE_ZAAK_TYPE, refZaakType.getCode(), refZaakType.getOms());
    add(risicoAnalyse, RELATIE_ZAAK_ID, zaakDossier.getRefCaseId());

    GbaRestElement riskProfileElement = risicoAnalyse.add(RISICOPROFIEL);
    add(riskProfileElement, DREMPEL, riskProfile.getThreshold().longValue());

    GbaRestElement subjectsElement = risicoAnalyse.add(PERSONEN);
    for (DossRiskAnalysisSubject subject : zaakDossier.getSubjects()) {
      GbaRestElement subjectElement = subjectsElement.add(PERSOON);
      add(subjectElement, BSN, new BsnFieldValue(subject.getPerson().getBsn().longValue()));
      add(subjectElement, SCORE, subject.getScore().longValue());
      add(subjectElement, LOG, subject.getLog());
    }

    for (RiskProfileRule rule : riskProfile.getRules()) {
      GbaRestElement ruleElement = riskProfileElement.add(RISICOPROFIEL_REGEL);
      add(ruleElement, NAAM, rule.getName());
      add(ruleElement, SCORE, rule.getScore().longValue());
      add(ruleElement, TYPE, rule.getRuleType().getId(), rule.getRuleType().getDescr());

      if (!rule.getAttributes().isEmpty()) {
        GbaRestElement vars = risicoAnalyse.add(VARIABELEN);
        for (Map.Entry<Object, Object> prop : rule.getAttributes().entrySet()) {
          add(vars, CODE, prop.getKey().toString());
          add(vars, WAARDE, prop.getValue().toString());
        }
      }
    }

    if (zaakDossier.getSubjects().size() > 0) {
      GbaRestElement deelZaken = gbaZaak.add(DEELZAKEN);

      for (DossRiskAnalysisSubject subject : zaakDossier.getSubjects()) {
        GbaRestElement deelZaak = deelZaken.add(DEELZAAK);
        add(deelZaak, BSN, new BsnFieldValue(subject.getPerson().getBsn().longValue()));
        add(deelZaak, ANR, new AnrFieldValue(subject.getPerson().getAnr().longValue()));
      }
    }
  }
}
