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
 * <p>Java class for ADRES-NAT-P-GEG complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ADRES-NAT-P-GEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="HUIS-NR-NAT-P" type="{}HUIS-NR-NUM" minOccurs="0"/>
 *         &lt;element name="HUIS-TV-NAT-P" type="{}HUIS-NR-TOEV" minOccurs="0"/>
 *         &lt;element name="WW-AB-VERW-NP" type="{}WW-AB-VERW" minOccurs="0"/>
 *         &lt;element name="POSTC-N-NAT-P" type="{}POSTC-NUM" minOccurs="0"/>
 *         &lt;element name="POSTC-A-NAT-P" type="{}POSTC-ALF" minOccurs="0"/>
 *         &lt;element name="STRAAT-NAT-P" type="{}STRAAT-NAAM" minOccurs="0"/>
 *         &lt;element name="WOONPL-NAT-P" type="{}WOONPL-NAAM" minOccurs="0"/>
 *         &lt;element name="LOC-REGEL-NAT-P" type="{}ADRES-REGEL" minOccurs="0"/>
 *         &lt;element name="WPL-REGEL-NAT-P" type="{}ADRES-REGEL" minOccurs="0"/>
 *         &lt;element name="LAND-CODE-NAT-P" type="{}LAND-CODE" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADRES-NAT-P-GEG",
    propOrder = {

    })
public class ADRESNATPGEG implements Serializable {

  @XmlElement(name = "HUIS-NR-NAT-P")
  private BigInteger huisnrnatp;
  @XmlElement(name = "HUIS-TV-NAT-P")
  private String     huistvnatp;
  @XmlElement(name = "WW-AB-VERW-NP")
  private String     wwabverwnp;
  @XmlElement(name = "POSTC-N-NAT-P")
  private BigInteger postcnnatp;
  @XmlElement(name = "POSTC-A-NAT-P")
  private String     postcanatp;
  @XmlElement(name = "STRAAT-NAT-P")
  private String     straatnatp;
  @XmlElement(name = "WOONPL-NAT-P")
  private String     woonplnatp;
  @XmlElement(name = "LOC-REGEL-NAT-P")
  private String     locregelnatp;
  @XmlElement(name = "WPL-REGEL-NAT-P")
  private String     wplregelnatp;
  @XmlElement(name = "LAND-CODE-NAT-P")
  private BigInteger landcodenatp;

  public BigInteger getHuisnrnatp() {
    return this.huisnrnatp;
  }

  public void setHuisnrnatp(BigInteger huisnrnatp) {
    this.huisnrnatp = huisnrnatp;
  }

  public String getHuistvnatp() {
    return this.huistvnatp;
  }

  public void setHuistvnatp(String huistvnatp) {
    this.huistvnatp = huistvnatp;
  }

  public String getWwabverwnp() {
    return this.wwabverwnp;
  }

  public void setWwabverwnp(String wwabverwnp) {
    this.wwabverwnp = wwabverwnp;
  }

  public BigInteger getPostcnnatp() {
    return this.postcnnatp;
  }

  public void setPostcnnatp(BigInteger postcnnatp) {
    this.postcnnatp = postcnnatp;
  }

  public String getPostcanatp() {
    return this.postcanatp;
  }

  public void setPostcanatp(String postcanatp) {
    this.postcanatp = postcanatp;
  }

  public String getStraatnatp() {
    return this.straatnatp;
  }

  public void setStraatnatp(String straatnatp) {
    this.straatnatp = straatnatp;
  }

  public String getWoonplnatp() {
    return this.woonplnatp;
  }

  public void setWoonplnatp(String woonplnatp) {
    this.woonplnatp = woonplnatp;
  }

  public String getLocregelnatp() {
    return this.locregelnatp;
  }

  public void setLocregelnatp(String locregelnatp) {
    this.locregelnatp = locregelnatp;
  }

  public String getWplregelnatp() {
    return this.wplregelnatp;
  }

  public void setWplregelnatp(String wplregelnatp) {
    this.wplregelnatp = wplregelnatp;
  }

  public BigInteger getLandcodenatp() {
    return this.landcodenatp;
  }

  public void setLandcodenatp(BigInteger landcodenatp) {
    this.landcodenatp = landcodenatp;
  }

}
