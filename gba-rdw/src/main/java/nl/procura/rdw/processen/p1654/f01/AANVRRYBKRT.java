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
// Generated on: 2018.06.26 at 02:32:29 PM CEST 
//

package nl.procura.rdw.processen.p1654.f01;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import nl.procura.rdw.functions.ProcesObject;

/**
 * <p>Java class for AANVR-RYB-KRT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AANVR-RYB-KRT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ALG-GEG" type="{}ALG-GEG"/>
 *         &lt;element name="NAT-PERSOON-GEG" type="{}NAT-PERSOON-GEG"/>
 *         &lt;element name="ADRES-NAT-P-GEG" type="{}ADRES-NAT-P-GEG"/>
 *         &lt;element name="AANVR-RYB-K-GEG" type="{}AANVR-RYB-K-GEG"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AANVR-RYB-KRT",
    propOrder = {

    })
public class AANVRRYBKRT extends ProcesObject implements Serializable {

  @XmlElement(name = "ALG-GEG",
      required = true)
  private ALGGEG        alggeg;
  @XmlElement(name = "NAT-PERSOON-GEG",
      required = true)
  private NATPERSOONGEG natpersoongeg;
  @XmlElement(name = "ADRES-NAT-P-GEG",
      required = true)
  private ADRESNATPGEG  adresnatpgeg;
  @XmlElement(name = "AANVR-RYB-K-GEG",
      required = true)
  private AANVRRYBKGEG  aanvrrybkgeg;

  public ALGGEG getAlggeg() {
    return this.alggeg;
  }

  public void setAlggeg(ALGGEG alggeg) {
    this.alggeg = alggeg;
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

  public AANVRRYBKGEG getAanvrrybkgeg() {
    return this.aanvrrybkgeg;
  }

  public void setAanvrrybkgeg(AANVRRYBKGEG aanvrrybkgeg) {
    this.aanvrrybkgeg = aanvrrybkgeg;
  }

}
