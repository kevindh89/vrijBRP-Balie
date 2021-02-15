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

package nl.procura.gba.web.common.jackson;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.module.SimpleModule;

public class ProcuraModule extends SimpleModule {

  public ProcuraModule() {
    super("procura", new Version(1, 0, 0, ""));
    addDeserializer(OffsetDateTime.class, new OffsetDateTimeDeserializer());
    addDeserializer(LocalDate.class, new LocalDateTimeDeserializer());
  }
}
