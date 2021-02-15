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

package nl.procura.gba.jpa.personen.dao;

import java.util.List;

import nl.procura.gba.jpa.personen.db.GbaCategory;

public class GbaCategoryDao extends GenericDao {

  public static final GbaCategory findGbaCategory(GbaCategory gbaCategory) {

    List<GbaCategory> list = findByExample(gbaCategory);

    return (list.size() > 0) ? list.get(0) : null;
  }

  public static final boolean isGbaCategory(GbaCategory gbaCategory) {

    return findGbaCategory(gbaCategory) != null;
  }
}
