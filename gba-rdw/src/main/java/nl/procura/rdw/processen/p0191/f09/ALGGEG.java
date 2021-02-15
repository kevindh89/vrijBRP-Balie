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
// Generated on: 2018.06.26 at 02:32:26 PM CEST 
//

package nl.procura.rdw.processen.p0191.f09;

import java.io.Serializable;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ALG-GEG complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ALG-GEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="GEBR-IDENT" type="{}GEBR-IDENT"/>
 *         &lt;element name="PROC-IDENT" type="{}PROC-IDENT"/>
 *         &lt;element name="PROC-FUNC" type="{}PROC-FUNC"/>
 *         &lt;element name="STAT-RIP" type="{}STAT-RIP" minOccurs="0"/>
 *         &lt;element name="OPT-STAT-TEKST" type="{}OPT-STAT-TEKST" minOccurs="0"/>
 *         &lt;element name="STAT-TEKST-RIP" type="{}STAT-TEKST-RIP" minOccurs="0"/>
 *         &lt;element name="INFO-GEBR" type="{}INFO-GEBR" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ALG-GEG",
    propOrder = {

    })
public class ALGGEG implements Serializable {

  @XmlElement(name = "GEBR-IDENT",
      required = true)
  private String     gebrident;
  @XmlElement(name = "PROC-IDENT",
      required = true)
  private BigInteger procident;
  @XmlElement(name = "PROC-FUNC",
      required = true)
  private BigInteger procfunc;
  @XmlElement(name = "STAT-RIP")
  private BigInteger statrip;
  @XmlElement(name = "OPT-STAT-TEKST")
  private BigInteger optstattekst;
  @XmlElement(name = "STAT-TEKST-RIP")
  private String     stattekstrip;
  @XmlElement(name = "INFO-GEBR")
  private String     infogebr;

  public String getGebrident() {
    return this.gebrident;
  }

  public void setGebrident(String gebrident) {
    this.gebrident = gebrident;
  }

  public BigInteger getProcident() {
    return this.procident;
  }

  public void setProcident(BigInteger procident) {
    this.procident = procident;
  }

  public BigInteger getProcfunc() {
    return this.procfunc;
  }

  public void setProcfunc(BigInteger procfunc) {
    this.procfunc = procfunc;
  }

  public BigInteger getStatrip() {
    return this.statrip;
  }

  public void setStatrip(BigInteger statrip) {
    this.statrip = statrip;
  }

  public BigInteger getOptstattekst() {
    return this.optstattekst;
  }

  public void setOptstattekst(BigInteger optstattekst) {
    this.optstattekst = optstattekst;
  }

  public String getStattekstrip() {
    return this.stattekstrip;
  }

  public void setStattekstrip(String stattekstrip) {
    this.stattekstrip = stattekstrip;
  }

  public String getInfogebr() {
    return this.infogebr;
  }

  public void setInfogebr(String infogebr) {
    this.infogebr = infogebr;
  }

}
