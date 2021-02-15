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

package nl.procura.gba.web.modules.bs.registration.person.modules.module2;

import static nl.procura.standard.Globalfunctions.pos;
import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.util.function.Supplier;

import com.vaadin.data.validator.AbstractStringValidator;

import nl.procura.vaadin.component.field.fieldvalues.FieldValue;

public class EuPersonNumberValidator extends AbstractStringValidator {

  private Supplier<FieldValue> natioSupplier;

  public EuPersonNumberValidator(Supplier<FieldValue> nationalitySupplier) {
    super("EU-persoonsnummer is niet van toepassing op de geselecteerde nationaliteit");
    this.natioSupplier = nationalitySupplier;
  }

  @Override
  protected boolean isValidString(String euNumber) {
    return isNotBlank(euNumber) && pos(natioSupplier.get().getAttributes().get("id"));
  }
}
