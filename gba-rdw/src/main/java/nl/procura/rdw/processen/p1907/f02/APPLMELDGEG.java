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

package nl.procura.rdw.processen.p1907.f02;

import java.io.Serializable;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for APPL-MELD-GEG complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="APPL-MELD-GEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SYST-AFK" type="{}SYST-AFK"/>
 *         &lt;element name="MELDING-NR" type="{}MELDING-NR"/>
 *         &lt;element name="KORTE-MELDING" type="{}KORTE-MELDING"/>
 *         &lt;element name="SOORT-MELDING" type="{}SOORT-MELDING"/>
 *         &lt;element name="MELDING-VAR" type="{}MELD-VAR" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APPL-MELD-GEG",
    propOrder = {

    })
public class APPLMELDGEG implements Serializable {

  @XmlElement(name = "SYST-AFK",
      required = true)
  private String     systafk;
  @XmlElement(name = "MELDING-NR",
      required = true)
  private BigInteger meldingnr;
  @XmlElement(name = "KORTE-MELDING",
      required = true)
  private String     kortemelding;
  @XmlElement(name = "SOORT-MELDING",
      required = true)
  private String     soortmelding;
  @XmlElement(name = "MELDING-VAR")
  private String     meldingvar;

  public String getSystafk() {
    return this.systafk;
  }

  public void setSystafk(String systafk) {
    this.systafk = systafk;
  }

  public BigInteger getMeldingnr() {
    return this.meldingnr;
  }

  public void setMeldingnr(BigInteger meldingnr) {
    this.meldingnr = meldingnr;
  }

  public String getKortemelding() {
    return this.kortemelding;
  }

  public void setKortemelding(String kortemelding) {
    this.kortemelding = kortemelding;
  }

  public String getSoortmelding() {
    return this.soortmelding;
  }

  public void setSoortmelding(String soortmelding) {
    this.soortmelding = soortmelding;
  }

  public String getMeldingvar() {
    return this.meldingvar;
  }

  public void setMeldingvar(String meldingvar) {
    this.meldingvar = meldingvar;
  }

}
