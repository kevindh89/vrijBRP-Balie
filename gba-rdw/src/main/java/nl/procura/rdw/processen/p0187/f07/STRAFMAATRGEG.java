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
 * <p>Java class for STRAF-MAATR-GEG complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="STRAF-MAATR-GEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="STR-MAATR-NR" type="{}STR-MAATR-NR" minOccurs="0"/>
 *         &lt;element name="INVORD-DAT-STR" type="{}DATUM-EJMD" minOccurs="0"/>
 *         &lt;element name="EINDE-INV-DAT" type="{}DATUM-EJMD" minOccurs="0"/>
 *         &lt;element name="RKK-CODE-STR" type="{}REGIOKORPS-CODE" minOccurs="0"/>
 *         &lt;element name="KORPS-CODE-STR" type="{}KORPS-CODE" minOccurs="0"/>
 *         &lt;element name="VERBALIS-NR-STR" type="{}VERBALIS-NR" minOccurs="0"/>
 *         &lt;element name="INH-TERMYN" type="{}INH-TERMYN" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STRAF-MAATR-GEG",
    propOrder = {

    })
public class STRAFMAATRGEG implements Serializable {

  @XmlElement(name = "STR-MAATR-NR")
  private BigInteger strmaatrnr;
  @XmlElement(name = "INVORD-DAT-STR")
  private BigInteger invorddatstr;
  @XmlElement(name = "EINDE-INV-DAT")
  private BigInteger eindeinvdat;
  @XmlElement(name = "RKK-CODE-STR")
  private String     rkkcodestr;
  @XmlElement(name = "KORPS-CODE-STR")
  private String     korpscodestr;
  @XmlElement(name = "VERBALIS-NR-STR")
  private String     verbalisnrstr;
  @XmlElement(name = "INH-TERMYN")
  private String     inhtermyn;

  public BigInteger getStrmaatrnr() {
    return this.strmaatrnr;
  }

  public void setStrmaatrnr(BigInteger strmaatrnr) {
    this.strmaatrnr = strmaatrnr;
  }

  public BigInteger getInvorddatstr() {
    return this.invorddatstr;
  }

  public void setInvorddatstr(BigInteger invorddatstr) {
    this.invorddatstr = invorddatstr;
  }

  public BigInteger getEindeinvdat() {
    return this.eindeinvdat;
  }

  public void setEindeinvdat(BigInteger eindeinvdat) {
    this.eindeinvdat = eindeinvdat;
  }

  public String getRkkcodestr() {
    return this.rkkcodestr;
  }

  public void setRkkcodestr(String rkkcodestr) {
    this.rkkcodestr = rkkcodestr;
  }

  public String getKorpscodestr() {
    return this.korpscodestr;
  }

  public void setKorpscodestr(String korpscodestr) {
    this.korpscodestr = korpscodestr;
  }

  public String getVerbalisnrstr() {
    return this.verbalisnrstr;
  }

  public void setVerbalisnrstr(String verbalisnrstr) {
    this.verbalisnrstr = verbalisnrstr;
  }

  public String getInhtermyn() {
    return this.inhtermyn;
  }

  public void setInhtermyn(String inhtermyn) {
    this.inhtermyn = inhtermyn;
  }

}
