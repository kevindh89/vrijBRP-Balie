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
// Generated on: 2018.06.26 at 02:32:23 PM CEST 
//

package nl.procura.rdw.processen.p0184.f07;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for INNEM-RYB-GEG complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="INNEM-RYB-GEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="INNEMING-NR" type="{}INNEMING-NR" minOccurs="0"/>
 *         &lt;element name="TOEGEST-INN-PER" type="{}TOEGEST-INN-PER" minOccurs="0"/>
 *         &lt;element name="SANC-BEDR-INN" type="{}BEDRAG-7" minOccurs="0"/>
 *         &lt;element name="BETAAL-DAT-INN" type="{}DATUM-EJMD" minOccurs="0"/>
 *         &lt;element name="KORPS-CODE-INN" type="{}KORPS-CODE" minOccurs="0"/>
 *         &lt;element name="VERBALIS-NR-INN" type="{}VERBALIS-NR" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INNEM-RYB-GEG",
    propOrder = {

    })
public class INNEMRYBGEG implements Serializable {

  @XmlElement(name = "INNEMING-NR")
  private BigInteger innemingnr;
  @XmlElement(name = "TOEGEST-INN-PER")
  private BigInteger toegestinnper;
  @XmlElement(name = "SANC-BEDR-INN")
  private BigDecimal sancbedrinn;
  @XmlElement(name = "BETAAL-DAT-INN")
  private BigInteger betaaldatinn;
  @XmlElement(name = "KORPS-CODE-INN")
  private String     korpscodeinn;
  @XmlElement(name = "VERBALIS-NR-INN")
  private String     verbalisnrinn;

  public BigInteger getInnemingnr() {
    return this.innemingnr;
  }

  public void setInnemingnr(BigInteger innemingnr) {
    this.innemingnr = innemingnr;
  }

  public BigInteger getToegestinnper() {
    return this.toegestinnper;
  }

  public void setToegestinnper(BigInteger toegestinnper) {
    this.toegestinnper = toegestinnper;
  }

  public BigDecimal getSancbedrinn() {
    return this.sancbedrinn;
  }

  public void setSancbedrinn(BigDecimal sancbedrinn) {
    this.sancbedrinn = sancbedrinn;
  }

  public BigInteger getBetaaldatinn() {
    return this.betaaldatinn;
  }

  public void setBetaaldatinn(BigInteger betaaldatinn) {
    this.betaaldatinn = betaaldatinn;
  }

  public String getKorpscodeinn() {
    return this.korpscodeinn;
  }

  public void setKorpscodeinn(String korpscodeinn) {
    this.korpscodeinn = korpscodeinn;
  }

  public String getVerbalisnrinn() {
    return this.verbalisnrinn;
  }

  public void setVerbalisnrinn(String verbalisnrinn) {
    this.verbalisnrinn = verbalisnrinn;
  }

}
