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

package nl.procura.rdw.processen.p1653.f02;

import java.io.Serializable;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for RYB-GEG complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RYB-GEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="RYB-NR" type="{}RYB-NR"/>
 *         &lt;element name="AFGIFTE-DAT-RYB" type="{}DATUM-EJMD"/>
 *         &lt;element name="AUTOR-CODE-AFG" type="{}AUTOR-CODE-AFG"/>
 *         &lt;element name="VERL-DIEFST-DAT" type="{}DATUM-EJMD" minOccurs="0"/>
 *         &lt;element name="PROC-V-VERL-D" type="{}PROC-VERBAAL-NR" minOccurs="0"/>
 *         &lt;element name="EIND-GELD-DAT-R" type="{}DATUM-EJMD"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RYB-GEG",
    propOrder = {

    })
public class RYBGEG implements Serializable {

  @XmlElement(name = "RYB-NR",
      required = true)
  private BigInteger rybnr;
  @XmlElement(name = "AFGIFTE-DAT-RYB",
      required = true)
  private BigInteger afgiftedatryb;
  @XmlElement(name = "AUTOR-CODE-AFG",
      required = true)
  private BigInteger autorcodeafg;
  @XmlElement(name = "VERL-DIEFST-DAT")
  private BigInteger verldiefstdat;
  @XmlElement(name = "PROC-V-VERL-D")
  private String     procvverld;
  @XmlElement(name = "EIND-GELD-DAT-R",
      required = true)
  private BigInteger eindgelddatr;

  public BigInteger getRybnr() {
    return this.rybnr;
  }

  public void setRybnr(BigInteger rybnr) {
    this.rybnr = rybnr;
  }

  public BigInteger getAfgiftedatryb() {
    return this.afgiftedatryb;
  }

  public void setAfgiftedatryb(BigInteger afgiftedatryb) {
    this.afgiftedatryb = afgiftedatryb;
  }

  public BigInteger getAutorcodeafg() {
    return this.autorcodeafg;
  }

  public void setAutorcodeafg(BigInteger autorcodeafg) {
    this.autorcodeafg = autorcodeafg;
  }

  public BigInteger getVerldiefstdat() {
    return this.verldiefstdat;
  }

  public void setVerldiefstdat(BigInteger verldiefstdat) {
    this.verldiefstdat = verldiefstdat;
  }

  public String getProcvverld() {
    return this.procvverld;
  }

  public void setProcvverld(String procvverld) {
    this.procvverld = procvverld;
  }

  public BigInteger getEindgelddatr() {
    return this.eindgelddatr;
  }

  public void setEindgelddatr(BigInteger eindgelddatr) {
    this.eindgelddatr = eindgelddatr;
  }

}
