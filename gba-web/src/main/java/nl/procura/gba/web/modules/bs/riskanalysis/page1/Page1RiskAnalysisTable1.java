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

package nl.procura.gba.web.modules.bs.riskanalysis.page1;

import nl.procura.gba.jpa.personen.db.RiskProfile;
import nl.procura.gba.jpa.personen.db.RiskProfileRule;
import nl.procura.gba.web.components.layouts.table.GbaTable;

public class Page1RiskAnalysisTable1 extends GbaTable {

  private RiskProfile riskProfile;

  public Page1RiskAnalysisTable1() {
  }

  @Override
  public void setColumns() {
    addColumn("Score", 50);
    addColumn("Naam");
    super.setColumns();
  }

  @Override
  public void setRecords() {
    if (riskProfile != null) {
      for (RiskProfileRule rule : riskProfile.getRules()) {
        Record r = addRecord(rule);
        r.addValue(rule.getScore());
        r.addValue(rule.getName());
      }
    }
  }

  public void setRiskProfile(RiskProfile riskProfile) {
    this.riskProfile = riskProfile;
    init();
  }
}
