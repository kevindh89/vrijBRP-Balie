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

package nl.procura.rdw.processen.p1722.f02;

import java.io.Serializable;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for AANVR-RYB-K-GEG complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AANVR-RYB-K-GEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AANVR-NR-RYB-K" type="{}AANVR-NR-RYB-K"/>
 *         &lt;element name="GEM-LOC-A-RYB-K" type="{}GEM-LOC-CODE"/>
 *         &lt;element name="AANVR-DAT-RYB-K" type="{}DATUM-EJMD"/>
 *         &lt;element name="AANVR-TYD-RYB-K" type="{}TYD-UM"/>
 *         &lt;element name="SRT-AANVR-RYB-K" type="{}SRT-AANVR-RYB-K"/>
 *         &lt;element name="REDEN-AAN-RYB-K" type="{}REDEN-AAN-RYB-K" minOccurs="0"/>
 *         &lt;element name="SPOED-AFH-IND" type="{}INDIC-JN"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AANVR-RYB-K-GEG",
    propOrder = {

    })
public class AANVRRYBKGEG implements Serializable {

  @XmlElement(name = "AANVR-NR-RYB-K",
      required = true)
  private BigInteger aanvrnrrybk;
  @XmlElement(name = "GEM-LOC-A-RYB-K",
      required = true)
  private BigInteger gemlocarybk;
  @XmlElement(name = "AANVR-DAT-RYB-K",
      required = true)
  private BigInteger aanvrdatrybk;
  @XmlElement(name = "AANVR-TYD-RYB-K",
      required = true)
  private BigInteger aanvrtydrybk;
  @XmlElement(name = "SRT-AANVR-RYB-K",
      required = true)
  private BigInteger srtaanvrrybk;
  @XmlElement(name = "REDEN-AAN-RYB-K")
  private BigInteger redenaanrybk;
  @XmlElement(name = "SPOED-AFH-IND",
      required = true)
  private String     spoedafhind;

  public BigInteger getAanvrnrrybk() {
    return this.aanvrnrrybk;
  }

  public void setAanvrnrrybk(BigInteger aanvrnrrybk) {
    this.aanvrnrrybk = aanvrnrrybk;
  }

  public BigInteger getGemlocarybk() {
    return this.gemlocarybk;
  }

  public void setGemlocarybk(BigInteger gemlocarybk) {
    this.gemlocarybk = gemlocarybk;
  }

  public BigInteger getAanvrdatrybk() {
    return this.aanvrdatrybk;
  }

  public void setAanvrdatrybk(BigInteger aanvrdatrybk) {
    this.aanvrdatrybk = aanvrdatrybk;
  }

  public BigInteger getAanvrtydrybk() {
    return this.aanvrtydrybk;
  }

  public void setAanvrtydrybk(BigInteger aanvrtydrybk) {
    this.aanvrtydrybk = aanvrtydrybk;
  }

  public BigInteger getSrtaanvrrybk() {
    return this.srtaanvrrybk;
  }

  public void setSrtaanvrrybk(BigInteger srtaanvrrybk) {
    this.srtaanvrrybk = srtaanvrrybk;
  }

  public BigInteger getRedenaanrybk() {
    return this.redenaanrybk;
  }

  public void setRedenaanrybk(BigInteger redenaanrybk) {
    this.redenaanrybk = redenaanrybk;
  }

  public String getSpoedafhind() {
    return this.spoedafhind;
  }

  public void setSpoedafhind(String spoedafhind) {
    this.spoedafhind = spoedafhind;
  }

}
