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
// Generated on: 2018.06.26 at 02:32:28 PM CEST 
//

package nl.procura.rdw.processen.p1651.f08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the nl.procura.rdw.processen.p1651.f08 package.
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

  private final static QName _AANRYBKOVERZ_QNAME = new QName("", "AAN-RYB-K-OVERZ");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.procura.rdw.processen.p1651.f08
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link AANRYBKOVERZ }
   */
  public AANRYBKOVERZ createAANRYBKOVERZ() {
    return new AANRYBKOVERZ();
  }

  /**
   * Create an instance of {@link RYVVERKLGEG }
   */
  public RYVVERKLGEG createRYVVERKLGEG() {
    return new RYVVERKLGEG();
  }

  /**
   * Create an instance of {@link NATPERSOONGEG }
   */
  public NATPERSOONGEG createNATPERSOONGEG() {
    return new NATPERSOONGEG();
  }

  /**
   * Create an instance of {@link AANVRRYBKTAB }
   */
  public AANVRRYBKTAB createAANVRRYBKTAB() {
    return new AANVRRYBKTAB();
  }

  /**
   * Create an instance of {@link CATAANRYBTAB }
   */
  public CATAANRYBTAB createCATAANRYBTAB() {
    return new CATAANRYBTAB();
  }

  /**
   * Create an instance of {@link AANVRRYBKGEG }
   */
  public AANVRRYBKGEG createAANVRRYBKGEG() {
    return new AANVRRYBKGEG();
  }

  /**
   * Create an instance of {@link GESCHVERKLGEG }
   */
  public GESCHVERKLGEG createGESCHVERKLGEG() {
    return new GESCHVERKLGEG();
  }

  /**
   * Create an instance of {@link RYBGEG }
   */
  public RYBGEG createRYBGEG() {
    return new RYBGEG();
  }

  /**
   * Create an instance of {@link APPLMELDGEG }
   */
  public APPLMELDGEG createAPPLMELDGEG() {
    return new APPLMELDGEG();
  }

  /**
   * Create an instance of {@link ADRESNATPGEG }
   */
  public ADRESNATPGEG createADRESNATPGEG() {
    return new ADRESNATPGEG();
  }

  /**
   * Create an instance of {@link CATAANRYBGEG }
   */
  public CATAANRYBGEG createCATAANRYBGEG() {
    return new CATAANRYBGEG();
  }

  /**
   * Create an instance of {@link ALGGEG }
   */
  public ALGGEG createALGGEG() {
    return new ALGGEG();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AANRYBKOVERZ }{@code >}}
   */
  @XmlElementDecl(namespace = "",
      name = "AAN-RYB-K-OVERZ")
  public JAXBElement<AANRYBKOVERZ> createAANRYBKOVERZ(AANRYBKOVERZ value) {
    return new JAXBElement<>(_AANRYBKOVERZ_QNAME, AANRYBKOVERZ.class, null, value);
  }

}
