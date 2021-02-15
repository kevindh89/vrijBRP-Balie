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
// Generated on: 2018.06.26 at 02:32:27 PM CEST 
//

package nl.procura.rdw.processen.p0198.f08;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for BROMF-NAT-P-GEG complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BROMF-NAT-P-GEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="BROMF-CERT-GEG" type="{}BROMF-CERT-GEG" minOccurs="0"/>
 *         &lt;element name="NAT-PERSOON-GEG" type="{}NAT-PERSOON-GEG"/>
 *         &lt;element name="ADRES-NAT-P-GEG" type="{}ADRES-NAT-P-GEG"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BROMF-NAT-P-GEG",
    propOrder = {

    })
public class BROMFNATPGEG implements Serializable {

  @XmlElement(name = "BROMF-CERT-GEG")
  private BROMFCERTGEG  bromfcertgeg;
  @XmlElement(name = "NAT-PERSOON-GEG",
      required = true)
  private NATPERSOONGEG natpersoongeg;
  @XmlElement(name = "ADRES-NAT-P-GEG",
      required = true)
  private ADRESNATPGEG  adresnatpgeg;

  public BROMFCERTGEG getBromfcertgeg() {
    return this.bromfcertgeg;
  }

  public void setBromfcertgeg(BROMFCERTGEG bromfcertgeg) {
    this.bromfcertgeg = bromfcertgeg;
  }

  public NATPERSOONGEG getNatpersoongeg() {
    return this.natpersoongeg;
  }

  public void setNatpersoongeg(NATPERSOONGEG natpersoongeg) {
    this.natpersoongeg = natpersoongeg;
  }

  public ADRESNATPGEG getAdresnatpgeg() {
    return this.adresnatpgeg;
  }

  public void setAdresnatpgeg(ADRESNATPGEG adresnatpgeg) {
    this.adresnatpgeg = adresnatpgeg;
  }

}
