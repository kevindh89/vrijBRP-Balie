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
 * <p>Java class for ONGELD-CAT-GEG complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ONGELD-CAT-GEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="RYB-CAT-OV" type="{}RYB-CAT" minOccurs="0"/>
 *         &lt;element name="ONGELD-DAT-CAT" type="{}DATUM-EJMD" minOccurs="0"/>
 *         &lt;element name="EINDE-O-DAT-CAT" type="{}DATUM-EJMD" minOccurs="0"/>
 *         &lt;element name="SCHORS-ONG-CODE" type="{}SCHORS-ONG-CODE" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ONGELD-CAT-GEG",
    propOrder = {

    })
public class ONGELDCATGEG implements Serializable {

  @XmlElement(name = "RYB-CAT-OV")
  private String     rybcatov;
  @XmlElement(name = "ONGELD-DAT-CAT")
  private BigInteger ongelddatcat;
  @XmlElement(name = "EINDE-O-DAT-CAT")
  private BigInteger eindeodatcat;
  @XmlElement(name = "SCHORS-ONG-CODE")
  private String     schorsongcode;

  public String getRybcatov() {
    return this.rybcatov;
  }

  public void setRybcatov(String rybcatov) {
    this.rybcatov = rybcatov;
  }

  public BigInteger getOngelddatcat() {
    return this.ongelddatcat;
  }

  public void setOngelddatcat(BigInteger ongelddatcat) {
    this.ongelddatcat = ongelddatcat;
  }

  public BigInteger getEindeodatcat() {
    return this.eindeodatcat;
  }

  public void setEindeodatcat(BigInteger eindeodatcat) {
    this.eindeodatcat = eindeodatcat;
  }

  public String getSchorsongcode() {
    return this.schorsongcode;
  }

  public void setSchorsongcode(String schorsongcode) {
    this.schorsongcode = schorsongcode;
  }

}
