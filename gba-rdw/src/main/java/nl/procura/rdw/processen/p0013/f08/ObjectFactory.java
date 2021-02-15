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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.26 at 02:32:21 PM CEST 
//

package nl.procura.rdw.processen.p0013.f08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the nl.procura.rdw.processen.p0013.f08 package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private final static QName _WACHTWOORD_QNAME = new QName("", "WACHT-WOORD");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.procura.rdw.processen.p0013.f08
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link WACHTWOORD }
   */
  public WACHTWOORD createWACHTWOORD() {
    return new WACHTWOORD();
  }

  /**
   * Create an instance of {@link ALGGEG }
   */
  public ALGGEG createALGGEG() {
    return new ALGGEG();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link WACHTWOORD }{@code >}}
   */
  @XmlElementDecl(namespace = "",
      name = "WACHT-WOORD")
  public JAXBElement<WACHTWOORD> createWACHTWOORD(WACHTWOORD value) {
    return new JAXBElement<>(_WACHTWOORD_QNAME, WACHTWOORD.class, null, value);
  }

}
