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
// Generated on: 2018.06.26 at 02:32:31 PM CEST 
//

package nl.procura.rdw.processen.p1914.f02;

import java.io.Serializable;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for AANVR-RYB-Z-GEG complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AANVR-RYB-Z-GEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AUTOR-A-RYB-K" type="{}AUTOR-CODE"/>
 *         &lt;element name="STAT-CODE-RYB-K" type="{}STAT-AAN-RYB-K"/>
 *         &lt;element name="GEM-LOC-A-RYB-A" type="{}GEM-LOC-CODE" minOccurs="0"/>
 *         &lt;element name="GEM-LOC-A-RYB-L" type="{}GEM-LOC-CODE" minOccurs="0"/>
 *         &lt;element name="AANVR-NR-RYB-L" type="{}AANVR-NR-RYB-K" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AANVR-RYB-Z-GEG",
    propOrder = {

    })
public class AANVRRYBZGEG implements Serializable {

  @XmlElement(name = "AUTOR-A-RYB-K",
      required = true)
  private BigInteger autorarybk;
  @XmlElement(name = "STAT-CODE-RYB-K",
      required = true)
  private BigInteger statcoderybk;
  @XmlElement(name = "GEM-LOC-A-RYB-A")
  private BigInteger gemlocaryba;
  @XmlElement(name = "GEM-LOC-A-RYB-L")
  private BigInteger gemlocarybl;
  @XmlElement(name = "AANVR-NR-RYB-L")
  private BigInteger aanvrnrrybl;

  public BigInteger getAutorarybk() {
    return this.autorarybk;
  }

  public void setAutorarybk(BigInteger autorarybk) {
    this.autorarybk = autorarybk;
  }

  public BigInteger getStatcoderybk() {
    return this.statcoderybk;
  }

  public void setStatcoderybk(BigInteger statcoderybk) {
    this.statcoderybk = statcoderybk;
  }

  public BigInteger getGemlocaryba() {
    return this.gemlocaryba;
  }

  public void setGemlocaryba(BigInteger gemlocaryba) {
    this.gemlocaryba = gemlocaryba;
  }

  public BigInteger getGemlocarybl() {
    return this.gemlocarybl;
  }

  public void setGemlocarybl(BigInteger gemlocarybl) {
    this.gemlocarybl = gemlocarybl;
  }

  public BigInteger getAanvrnrrybl() {
    return this.aanvrnrrybl;
  }

  public void setAanvrnrrybl(BigInteger aanvrnrrybl) {
    this.aanvrnrrybl = aanvrnrrybl;
  }

}
