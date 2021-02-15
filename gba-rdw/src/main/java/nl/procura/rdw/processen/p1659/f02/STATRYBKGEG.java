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
// Generated on: 2018.06.26 at 02:32:30 PM CEST 
//

package nl.procura.rdw.processen.p1659.f02;

import java.io.Serializable;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for STAT-RYB-K-GEG complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="STAT-RYB-K-GEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="STAT-CODE-RYB-K" type="{}STAT-CODE-RYB-K"/>
 *         &lt;element name="STAT-DAT-RYB-K" type="{}DATUM-EJMD"/>
 *         &lt;element name="STAT-TYD-RYB-K" type="{}TYD-UM"/>
 *         &lt;element name="GEM-REF-S-RYB-K" type="{}GEM-REF"/>
 *         &lt;element name="RYB-STAT-RYB-K" type="{}RYB-NR" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STAT-RYB-K-GEG",
    propOrder = {

    })
public class STATRYBKGEG implements Serializable {

  @XmlElement(name = "STAT-CODE-RYB-K",
      required = true)
  private BigInteger statcoderybk;
  @XmlElement(name = "STAT-DAT-RYB-K",
      required = true)
  private BigInteger statdatrybk;
  @XmlElement(name = "STAT-TYD-RYB-K",
      required = true)
  private BigInteger stattydrybk;
  @XmlElement(name = "GEM-REF-S-RYB-K",
      required = true)
  private String     gemrefsrybk;
  @XmlElement(name = "RYB-STAT-RYB-K")
  private BigInteger rybstatrybk;

  public BigInteger getStatcoderybk() {
    return this.statcoderybk;
  }

  public void setStatcoderybk(BigInteger statcoderybk) {
    this.statcoderybk = statcoderybk;
  }

  public BigInteger getStatdatrybk() {
    return this.statdatrybk;
  }

  public void setStatdatrybk(BigInteger statdatrybk) {
    this.statdatrybk = statdatrybk;
  }

  public BigInteger getStattydrybk() {
    return this.stattydrybk;
  }

  public void setStattydrybk(BigInteger stattydrybk) {
    this.stattydrybk = stattydrybk;
  }

  public String getGemrefsrybk() {
    return this.gemrefsrybk;
  }

  public void setGemrefsrybk(String gemrefsrybk) {
    this.gemrefsrybk = gemrefsrybk;
  }

  public BigInteger getRybstatrybk() {
    return this.rybstatrybk;
  }

  public void setRybstatrybk(BigInteger rybstatrybk) {
    this.rybstatrybk = rybstatrybk;
  }

}
