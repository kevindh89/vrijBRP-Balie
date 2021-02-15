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

package nl.procura.rdw.processen.p0199.f08;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import nl.procura.rdw.functions.ProcesObject;

/**
 * <p>Java class for BR-CERT-OP-SL complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BR-CERT-OP-SL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ALG-GEG" type="{}ALG-GEG"/>
 *         &lt;element name="NAT-P-ZOEK-GEG" type="{}NAT-P-ZOEK-GEG"/>
 *         &lt;element name="BROMF-CERT-TAB" type="{}BROMF-CERT-TAB" minOccurs="0"/>
 *         &lt;element name="NAT-PERSOON-TAB" type="{}NAT-PERSOON-TAB"/>
 *         &lt;element name="ADRES-NAT-P-TAB" type="{}ADRES-NAT-P-TAB"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BR-CERT-OP-SL",
    propOrder = {

    })
public class BRCERTOPSL extends ProcesObject implements Serializable {

  @XmlElement(name = "ALG-GEG",
      required = true)
  private ALGGEG        alggeg;
  @XmlElement(name = "NAT-P-ZOEK-GEG",
      required = true)
  private NATPZOEKGEG   natpzoekgeg;
  @XmlElement(name = "BROMF-CERT-TAB")
  private BROMFCERTTAB  bromfcerttab;
  @XmlElement(name = "NAT-PERSOON-TAB",
      required = true)
  private NATPERSOONTAB natpersoontab;
  @XmlElement(name = "ADRES-NAT-P-TAB",
      required = true)
  private ADRESNATPTAB  adresnatptab;

  public ALGGEG getAlggeg() {
    return this.alggeg;
  }

  public void setAlggeg(ALGGEG alggeg) {
    this.alggeg = alggeg;
  }

  public NATPZOEKGEG getNatpzoekgeg() {
    return this.natpzoekgeg;
  }

  public void setNatpzoekgeg(NATPZOEKGEG natpzoekgeg) {
    this.natpzoekgeg = natpzoekgeg;
  }

  public BROMFCERTTAB getBromfcerttab() {
    return this.bromfcerttab;
  }

  public void setBromfcerttab(BROMFCERTTAB bromfcerttab) {
    this.bromfcerttab = bromfcerttab;
  }

  public NATPERSOONTAB getNatpersoontab() {
    return this.natpersoontab;
  }

  public void setNatpersoontab(NATPERSOONTAB natpersoontab) {
    this.natpersoontab = natpersoontab;
  }

  public ADRESNATPTAB getAdresnatptab() {
    return this.adresnatptab;
  }

  public void setAdresnatptab(ADRESNATPTAB adresnatptab) {
    this.adresnatptab = adresnatptab;
  }

}
