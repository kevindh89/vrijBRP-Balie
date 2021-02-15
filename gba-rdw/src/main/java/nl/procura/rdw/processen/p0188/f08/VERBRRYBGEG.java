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
// Generated on: 2018.06.07 at 02:44:27 PM CEST 
//

package nl.procura.rdw.processen.p0188.f08;

import java.io.Serializable;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for VERBR-RYB-GEG complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="VERBR-RYB-GEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SRT-AUT-LEV" type="{}SOORT-AUTOR" minOccurs="0"/>
 *         &lt;element name="AUTOR-CODE-LEV" type="{}AUTOR-CODE-AFG" minOccurs="0"/>
 *         &lt;element name="NAAM-AUT-LEV" type="{}NAAM-AUTOR" minOccurs="0"/>
 *         &lt;element name="NAAM-LEV-DIA" type="{}NAAM-AUTOR-DIA" minOccurs="0"/>
 *         &lt;element name="STAT-VERBR-RYB" type="{}STAT-VERBR-RYB" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VERBR-RYB-GEG",
    propOrder = {

    })
public class VERBRRYBGEG implements Serializable {

  @XmlElement(name = "SRT-AUT-LEV")
  private String     srtautlev;
  @XmlElement(name = "AUTOR-CODE-LEV")
  private BigInteger autorcodelev;
  @XmlElement(name = "NAAM-AUT-LEV")
  private String     naamautlev;
  @XmlElement(name = "NAAM-LEV-DIA")
  private String     naamlevdia;
  @XmlElement(name = "STAT-VERBR-RYB")
  private BigInteger statverbrryb;

  public String getSrtautlev() {
    return this.srtautlev;
  }

  public void setSrtautlev(String srtautlev) {
    this.srtautlev = srtautlev;
  }

  public BigInteger getAutorcodelev() {
    return this.autorcodelev;
  }

  public void setAutorcodelev(BigInteger autorcodelev) {
    this.autorcodelev = autorcodelev;
  }

  public String getNaamautlev() {
    return this.naamautlev;
  }

  public void setNaamautlev(String naamautlev) {
    this.naamautlev = naamautlev;
  }

  public String getNaamlevdia() {
    return this.naamlevdia;
  }

  public void setNaamlevdia(String naamlevdia) {
    this.naamlevdia = naamlevdia;
  }

  public BigInteger getStatverbrryb() {
    return this.statverbrryb;
  }

  public void setStatverbrryb(BigInteger statverbrryb) {
    this.statverbrryb = statverbrryb;
  }

}
