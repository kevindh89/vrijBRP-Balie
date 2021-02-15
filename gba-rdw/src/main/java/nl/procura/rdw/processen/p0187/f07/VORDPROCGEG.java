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
// Generated on: 2018.06.26 at 02:32:25 PM CEST 
//

package nl.procura.rdw.processen.p0187.f07;

import java.io.Serializable;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for VORD-PROC-GEG complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="VORD-PROC-GEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="INVORD-DAT-VP" type="{}DATUM-EJMD" minOccurs="0"/>
 *         &lt;element name="EINDE-INV-VP" type="{}DATUM-EJMD" minOccurs="0"/>
 *         &lt;element name="SRT-AUT-INL-VP" type="{}SOORT-AUTOR" minOccurs="0"/>
 *         &lt;element name="AUTOR-C-INL-VP" type="{}AUTOR-C-INL-VP" minOccurs="0"/>
 *         &lt;element name="NAAM-AUT-INL-VP" type="{}NAAM-AUTOR" minOccurs="0"/>
 *         &lt;element name="NAAM-INL-VP-DIA" type="{}NAAM-AUTOR-DIA" minOccurs="0"/>
 *         &lt;element name="RKK-CODE-VP" type="{}REGIOKORPS-CODE" minOccurs="0"/>
 *         &lt;element name="KORPS-CODE-VP" type="{}KORPS-CODE" minOccurs="0"/>
 *         &lt;element name="VERBALIS-NR-VP" type="{}VERBALIS-NR" minOccurs="0"/>
 *         &lt;element name="DOSSIER-NR-VP" type="{}DOSSIER-NR-VP" minOccurs="0"/>
 *         &lt;element name="SCHORS-GELD-DAT" type="{}DATUM-EJMD" minOccurs="0"/>
 *         &lt;element name="EINDE-SCH-DAT" type="{}DATUM-EJMD" minOccurs="0"/>
 *         &lt;element name="FEIT-IN-DAT-SCH" type="{}DATUM-EJMD" minOccurs="0"/>
 *         &lt;element name="ONGELD-DAT-VP" type="{}DATUM-EJMD" minOccurs="0"/>
 *         &lt;element name="ONGELD-CODE-VP" type="{}ONGELD-CODE-VP" minOccurs="0"/>
 *         &lt;element name="FEIT-INL-DAT-VP" type="{}DATUM-EJMD" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VORD-PROC-GEG",
    propOrder = {

    })
public class VORDPROCGEG implements Serializable {

  @XmlElement(name = "INVORD-DAT-VP")
  private BigInteger invorddatvp;
  @XmlElement(name = "EINDE-INV-VP")
  private BigInteger eindeinvvp;
  @XmlElement(name = "SRT-AUT-INL-VP")
  private String     srtautinlvp;
  @XmlElement(name = "AUTOR-C-INL-VP")
  private BigInteger autorcinlvp;
  @XmlElement(name = "NAAM-AUT-INL-VP")
  private String     naamautinlvp;
  @XmlElement(name = "NAAM-INL-VP-DIA")
  private String     naaminlvpdia;
  @XmlElement(name = "RKK-CODE-VP")
  private String     rkkcodevp;
  @XmlElement(name = "KORPS-CODE-VP")
  private String     korpscodevp;
  @XmlElement(name = "VERBALIS-NR-VP")
  private String     verbalisnrvp;
  @XmlElement(name = "DOSSIER-NR-VP")
  private String     dossiernrvp;
  @XmlElement(name = "SCHORS-GELD-DAT")
  private BigInteger schorsgelddat;
  @XmlElement(name = "EINDE-SCH-DAT")
  private BigInteger eindeschdat;
  @XmlElement(name = "FEIT-IN-DAT-SCH")
  private BigInteger feitindatsch;
  @XmlElement(name = "ONGELD-DAT-VP")
  private BigInteger ongelddatvp;
  @XmlElement(name = "ONGELD-CODE-VP")
  private String     ongeldcodevp;
  @XmlElement(name = "FEIT-INL-DAT-VP")
  private BigInteger feitinldatvp;

  public BigInteger getInvorddatvp() {
    return this.invorddatvp;
  }

  public void setInvorddatvp(BigInteger invorddatvp) {
    this.invorddatvp = invorddatvp;
  }

  public BigInteger getEindeinvvp() {
    return this.eindeinvvp;
  }

  public void setEindeinvvp(BigInteger eindeinvvp) {
    this.eindeinvvp = eindeinvvp;
  }

  public String getSrtautinlvp() {
    return this.srtautinlvp;
  }

  public void setSrtautinlvp(String srtautinlvp) {
    this.srtautinlvp = srtautinlvp;
  }

  public BigInteger getAutorcinlvp() {
    return this.autorcinlvp;
  }

  public void setAutorcinlvp(BigInteger autorcinlvp) {
    this.autorcinlvp = autorcinlvp;
  }

  public String getNaamautinlvp() {
    return this.naamautinlvp;
  }

  public void setNaamautinlvp(String naamautinlvp) {
    this.naamautinlvp = naamautinlvp;
  }

  public String getNaaminlvpdia() {
    return this.naaminlvpdia;
  }

  public void setNaaminlvpdia(String naaminlvpdia) {
    this.naaminlvpdia = naaminlvpdia;
  }

  public String getRkkcodevp() {
    return this.rkkcodevp;
  }

  public void setRkkcodevp(String rkkcodevp) {
    this.rkkcodevp = rkkcodevp;
  }

  public String getKorpscodevp() {
    return this.korpscodevp;
  }

  public void setKorpscodevp(String korpscodevp) {
    this.korpscodevp = korpscodevp;
  }

  public String getVerbalisnrvp() {
    return this.verbalisnrvp;
  }

  public void setVerbalisnrvp(String verbalisnrvp) {
    this.verbalisnrvp = verbalisnrvp;
  }

  public String getDossiernrvp() {
    return this.dossiernrvp;
  }

  public void setDossiernrvp(String dossiernrvp) {
    this.dossiernrvp = dossiernrvp;
  }

  public BigInteger getSchorsgelddat() {
    return this.schorsgelddat;
  }

  public void setSchorsgelddat(BigInteger schorsgelddat) {
    this.schorsgelddat = schorsgelddat;
  }

  public BigInteger getEindeschdat() {
    return this.eindeschdat;
  }

  public void setEindeschdat(BigInteger eindeschdat) {
    this.eindeschdat = eindeschdat;
  }

  public BigInteger getFeitindatsch() {
    return this.feitindatsch;
  }

  public void setFeitindatsch(BigInteger feitindatsch) {
    this.feitindatsch = feitindatsch;
  }

  public BigInteger getOngelddatvp() {
    return this.ongelddatvp;
  }

  public void setOngelddatvp(BigInteger ongelddatvp) {
    this.ongelddatvp = ongelddatvp;
  }

  public String getOngeldcodevp() {
    return this.ongeldcodevp;
  }

  public void setOngeldcodevp(String ongeldcodevp) {
    this.ongeldcodevp = ongeldcodevp;
  }

  public BigInteger getFeitinldatvp() {
    return this.feitinldatvp;
  }

  public void setFeitinldatvp(BigInteger feitinldatvp) {
    this.feitinldatvp = feitinldatvp;
  }

}
