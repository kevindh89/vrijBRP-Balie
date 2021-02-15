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

package nl.procura.rdw.processen.p0184.f08;

import java.io.Serializable;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for NAT-PERSOON-GEG complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NAT-PERSOON-GEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="NAT-PERS-SL" type="{}NAT-PERS-SL"/>
 *         &lt;element name="B-DAT-NAT-P-GEG" type="{}DATUM-EJMD" minOccurs="0"/>
 *         &lt;element name="GBA-NR-NAT-P" type="{}GBA-NR" minOccurs="0"/>
 *         &lt;element name="NATIONAL-PERS" type="{}NATIONAL-PERS" minOccurs="0"/>
 *         &lt;element name="ISO-NAT-CODE-NP" type="{}ISO-NAT-CODE" minOccurs="0"/>
 *         &lt;element name="FISC-NR-NAT-P" type="{}FISC-NR-NAT-P" minOccurs="0"/>
 *         &lt;element name="GESL-NAAM-NAT-P" type="{}GESL-NAAM"/>
 *         &lt;element name="VOOR-VOEG-NAT-P" type="{}VOOR-VOEG-DIA" minOccurs="0"/>
 *         &lt;element name="VOOR-LET-NAT-P" type="{}VOOR-LET" minOccurs="0"/>
 *         &lt;element name="ADEL-PRED-NAT-P" type="{}ADEL-PRED" minOccurs="0"/>
 *         &lt;element name="VOOR-NAAM-NAT-P" type="{}VOOR-NAAM" minOccurs="0"/>
 *         &lt;element name="BURG-ST-NAT-P" type="{}BURG-STAAT" minOccurs="0"/>
 *         &lt;element name="NAAM-GEBR-NAT-P" type="{}AAND-NAAM-GEBR" minOccurs="0"/>
 *         &lt;element name="GESL-NAAM-ECHTG" type="{}GESL-NAAM" minOccurs="0"/>
 *         &lt;element name="VOOR-VOEG-ECHTG" type="{}VOOR-VOEG-DIA" minOccurs="0"/>
 *         &lt;element name="ADEL-PRED-ECHTG" type="{}ADEL-PRED" minOccurs="0"/>
 *         &lt;element name="GESL-NAAM-NP-D" type="{}GESL-NAAM-DIAKR" minOccurs="0"/>
 *         &lt;element name="VOOR-VOEG-NP-D" type="{}VOOR-VOEG-DIAKR" minOccurs="0"/>
 *         &lt;element name="VOOR-LET-NP-D" type="{}VOOR-LET-DIAKR" minOccurs="0"/>
 *         &lt;element name="VOOR-NAAM-NP-D" type="{}VOOR-NAAM-DIAKR" minOccurs="0"/>
 *         &lt;element name="GESL-NAAM-E-D" type="{}GESL-NAAM-DIAKR" minOccurs="0"/>
 *         &lt;element name="VOOR-VOEG-E-D" type="{}VOOR-VOEG-DIAKR" minOccurs="0"/>
 *         &lt;element name="SRT-AUT-GEB-PL" type="{}SOORT-AUTOR" minOccurs="0"/>
 *         &lt;element name="AUTOR-C-GEB-PL" type="{}AUTOR-C-GEB-PL" minOccurs="0"/>
 *         &lt;element name="GEMEENTE-GEB-PL" type="{}TEKST-24" minOccurs="0"/>
 *         &lt;element name="GEM-GEB-PL-DIA" type="{}NAAM-GEM-DIA" minOccurs="0"/>
 *         &lt;element name="LAND-C-ISO-GEB" type="{}LAND-CODE-ISO-3" minOccurs="0"/>
 *         &lt;element name="GEB-PL-BUITENL" type="{}GEB-PL-BUITENL" minOccurs="0"/>
 *         &lt;element name="GEB-PL-BUIT-DIA" type="{}GEB-PL-BUIT-DIA" minOccurs="0"/>
 *         &lt;element name="GEB-DAT-NAT-P" type="{}DATUM-EJMD"/>
 *         &lt;element name="VOORL-REG-IND" type="{}INDIC-JN" minOccurs="0"/>
 *         &lt;element name="MAATREGEL-IND" type="{}INDIC-JN" minOccurs="0"/>
 *         &lt;element name="EIND-DAT-NAT-P" type="{}DATUM-EJMD" minOccurs="0"/>
 *         &lt;element name="REDEN-EIND-NP" type="{}REDEN-EIND-NP" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAT-PERSOON-GEG",
    propOrder = {

    })
public class NATPERSOONGEG implements Serializable {

  @XmlElement(name = "NAT-PERS-SL",
      required = true)
  private String     natperssl;
  @XmlElement(name = "B-DAT-NAT-P-GEG")
  private BigInteger bdatnatpgeg;
  @XmlElement(name = "GBA-NR-NAT-P")
  private BigInteger gbanrnatp;
  @XmlElement(name = "NATIONAL-PERS")
  private BigInteger nationalpers;
  @XmlElement(name = "ISO-NAT-CODE-NP")
  private String     isonatcodenp;
  @XmlElement(name = "FISC-NR-NAT-P")
  private BigInteger fiscnrnatp;
  @XmlElement(name = "GESL-NAAM-NAT-P",
      required = true)
  private String     geslnaamnatp;
  @XmlElement(name = "VOOR-VOEG-NAT-P")
  private String     voorvoegnatp;
  @XmlElement(name = "VOOR-LET-NAT-P")
  private String     voorletnatp;
  @XmlElement(name = "ADEL-PRED-NAT-P")
  private String     adelprednatp;
  @XmlElement(name = "VOOR-NAAM-NAT-P")
  private String     voornaamnatp;
  @XmlElement(name = "BURG-ST-NAT-P")
  private BigInteger burgstnatp;
  @XmlElement(name = "NAAM-GEBR-NAT-P")
  private BigInteger naamgebrnatp;
  @XmlElement(name = "GESL-NAAM-ECHTG")
  private String     geslnaamechtg;
  @XmlElement(name = "VOOR-VOEG-ECHTG")
  private String     voorvoegechtg;
  @XmlElement(name = "ADEL-PRED-ECHTG")
  private String     adelpredechtg;
  @XmlElement(name = "GESL-NAAM-NP-D")
  private String     geslnaamnpd;
  @XmlElement(name = "VOOR-VOEG-NP-D")
  private String     voorvoegnpd;
  @XmlElement(name = "VOOR-LET-NP-D")
  private String     voorletnpd;
  @XmlElement(name = "VOOR-NAAM-NP-D")
  private String     voornaamnpd;
  @XmlElement(name = "GESL-NAAM-E-D")
  private String     geslnaamed;
  @XmlElement(name = "VOOR-VOEG-E-D")
  private String     voorvoeged;
  @XmlElement(name = "SRT-AUT-GEB-PL")
  private String     srtautgebpl;
  @XmlElement(name = "AUTOR-C-GEB-PL")
  private BigInteger autorcgebpl;
  @XmlElement(name = "GEMEENTE-GEB-PL")
  private String     gemeentegebpl;
  @XmlElement(name = "GEM-GEB-PL-DIA")
  private String     gemgebpldia;
  @XmlElement(name = "LAND-C-ISO-GEB")
  private String     landcisogeb;
  @XmlElement(name = "GEB-PL-BUITENL")
  private String     gebplbuitenl;
  @XmlElement(name = "GEB-PL-BUIT-DIA")
  private String     gebplbuitdia;
  @XmlElement(name = "GEB-DAT-NAT-P",
      required = true)
  private BigInteger gebdatnatp;
  @XmlElement(name = "VOORL-REG-IND")
  private String     voorlregind;
  @XmlElement(name = "MAATREGEL-IND")
  private String     maatregelind;
  @XmlElement(name = "EIND-DAT-NAT-P")
  private BigInteger einddatnatp;
  @XmlElement(name = "REDEN-EIND-NP")
  private String     redeneindnp;

  public String getNatperssl() {
    return this.natperssl;
  }

  public void setNatperssl(String natperssl) {
    this.natperssl = natperssl;
  }

  public BigInteger getBdatnatpgeg() {
    return this.bdatnatpgeg;
  }

  public void setBdatnatpgeg(BigInteger bdatnatpgeg) {
    this.bdatnatpgeg = bdatnatpgeg;
  }

  public BigInteger getGbanrnatp() {
    return this.gbanrnatp;
  }

  public void setGbanrnatp(BigInteger gbanrnatp) {
    this.gbanrnatp = gbanrnatp;
  }

  public BigInteger getNationalpers() {
    return this.nationalpers;
  }

  public void setNationalpers(BigInteger nationalpers) {
    this.nationalpers = nationalpers;
  }

  public String getIsonatcodenp() {
    return this.isonatcodenp;
  }

  public void setIsonatcodenp(String isonatcodenp) {
    this.isonatcodenp = isonatcodenp;
  }

  public BigInteger getFiscnrnatp() {
    return this.fiscnrnatp;
  }

  public void setFiscnrnatp(BigInteger fiscnrnatp) {
    this.fiscnrnatp = fiscnrnatp;
  }

  public String getGeslnaamnatp() {
    return this.geslnaamnatp;
  }

  public void setGeslnaamnatp(String geslnaamnatp) {
    this.geslnaamnatp = geslnaamnatp;
  }

  public String getVoorvoegnatp() {
    return this.voorvoegnatp;
  }

  public void setVoorvoegnatp(String voorvoegnatp) {
    this.voorvoegnatp = voorvoegnatp;
  }

  public String getVoorletnatp() {
    return this.voorletnatp;
  }

  public void setVoorletnatp(String voorletnatp) {
    this.voorletnatp = voorletnatp;
  }

  public String getAdelprednatp() {
    return this.adelprednatp;
  }

  public void setAdelprednatp(String adelprednatp) {
    this.adelprednatp = adelprednatp;
  }

  public String getVoornaamnatp() {
    return this.voornaamnatp;
  }

  public void setVoornaamnatp(String voornaamnatp) {
    this.voornaamnatp = voornaamnatp;
  }

  public BigInteger getBurgstnatp() {
    return this.burgstnatp;
  }

  public void setBurgstnatp(BigInteger burgstnatp) {
    this.burgstnatp = burgstnatp;
  }

  public BigInteger getNaamgebrnatp() {
    return this.naamgebrnatp;
  }

  public void setNaamgebrnatp(BigInteger naamgebrnatp) {
    this.naamgebrnatp = naamgebrnatp;
  }

  public String getGeslnaamechtg() {
    return this.geslnaamechtg;
  }

  public void setGeslnaamechtg(String geslnaamechtg) {
    this.geslnaamechtg = geslnaamechtg;
  }

  public String getVoorvoegechtg() {
    return this.voorvoegechtg;
  }

  public void setVoorvoegechtg(String voorvoegechtg) {
    this.voorvoegechtg = voorvoegechtg;
  }

  public String getAdelpredechtg() {
    return this.adelpredechtg;
  }

  public void setAdelpredechtg(String adelpredechtg) {
    this.adelpredechtg = adelpredechtg;
  }

  public String getGeslnaamnpd() {
    return this.geslnaamnpd;
  }

  public void setGeslnaamnpd(String geslnaamnpd) {
    this.geslnaamnpd = geslnaamnpd;
  }

  public String getVoorvoegnpd() {
    return this.voorvoegnpd;
  }

  public void setVoorvoegnpd(String voorvoegnpd) {
    this.voorvoegnpd = voorvoegnpd;
  }

  public String getVoorletnpd() {
    return this.voorletnpd;
  }

  public void setVoorletnpd(String voorletnpd) {
    this.voorletnpd = voorletnpd;
  }

  public String getVoornaamnpd() {
    return this.voornaamnpd;
  }

  public void setVoornaamnpd(String voornaamnpd) {
    this.voornaamnpd = voornaamnpd;
  }

  public String getGeslnaamed() {
    return this.geslnaamed;
  }

  public void setGeslnaamed(String geslnaamed) {
    this.geslnaamed = geslnaamed;
  }

  public String getVoorvoeged() {
    return this.voorvoeged;
  }

  public void setVoorvoeged(String voorvoeged) {
    this.voorvoeged = voorvoeged;
  }

  public String getSrtautgebpl() {
    return this.srtautgebpl;
  }

  public void setSrtautgebpl(String srtautgebpl) {
    this.srtautgebpl = srtautgebpl;
  }

  public BigInteger getAutorcgebpl() {
    return this.autorcgebpl;
  }

  public void setAutorcgebpl(BigInteger autorcgebpl) {
    this.autorcgebpl = autorcgebpl;
  }

  public String getGemeentegebpl() {
    return this.gemeentegebpl;
  }

  public void setGemeentegebpl(String gemeentegebpl) {
    this.gemeentegebpl = gemeentegebpl;
  }

  public String getGemgebpldia() {
    return this.gemgebpldia;
  }

  public void setGemgebpldia(String gemgebpldia) {
    this.gemgebpldia = gemgebpldia;
  }

  public String getLandcisogeb() {
    return this.landcisogeb;
  }

  public void setLandcisogeb(String landcisogeb) {
    this.landcisogeb = landcisogeb;
  }

  public String getGebplbuitenl() {
    return this.gebplbuitenl;
  }

  public void setGebplbuitenl(String gebplbuitenl) {
    this.gebplbuitenl = gebplbuitenl;
  }

  public String getGebplbuitdia() {
    return this.gebplbuitdia;
  }

  public void setGebplbuitdia(String gebplbuitdia) {
    this.gebplbuitdia = gebplbuitdia;
  }

  public BigInteger getGebdatnatp() {
    return this.gebdatnatp;
  }

  public void setGebdatnatp(BigInteger gebdatnatp) {
    this.gebdatnatp = gebdatnatp;
  }

  public String getVoorlregind() {
    return this.voorlregind;
  }

  public void setVoorlregind(String voorlregind) {
    this.voorlregind = voorlregind;
  }

  public String getMaatregelind() {
    return this.maatregelind;
  }

  public void setMaatregelind(String maatregelind) {
    this.maatregelind = maatregelind;
  }

  public BigInteger getEinddatnatp() {
    return this.einddatnatp;
  }

  public void setEinddatnatp(BigInteger einddatnatp) {
    this.einddatnatp = einddatnatp;
  }

  public String getRedeneindnp() {
    return this.redeneindnp;
  }

  public void setRedeneindnp(String redeneindnp) {
    this.redeneindnp = redeneindnp;
  }

}
