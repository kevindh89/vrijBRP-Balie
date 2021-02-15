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

package nl.procura.rdw.processen.p1909.f02;

import java.io.Serializable;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for GESCH-VERKL-GEG complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GESCH-VERKL-GEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AFG-DAT-G-VERKL" type="{}DATUM-EJMD"/>
 *         &lt;element name="E-DAT-G-VERKL" type="{}DATUM-EJMD" minOccurs="0"/>
 *         &lt;element name="STATUS-G-VERKL" type="{}STATUS-G-VERKL"/>
 *         &lt;element name="TOEL-BL-G-VERKL" type="{}TOEL-BLOKKERING" minOccurs="0"/>
 *         &lt;element name="BEPERK-G-VERKL" type="{}BEPERK-G-VERKL" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GESCH-VERKL-GEG",
    propOrder = {

    })
public class GESCHVERKLGEG implements Serializable {

  @XmlElement(name = "AFG-DAT-G-VERKL",
      required = true)
  private BigInteger afgdatgverkl;
  @XmlElement(name = "E-DAT-G-VERKL")
  private BigInteger edatgverkl;
  @XmlElement(name = "STATUS-G-VERKL",
      required = true)
  private String     statusgverkl;
  @XmlElement(name = "TOEL-BL-G-VERKL")
  private String     toelblgverkl;
  @XmlElement(name = "BEPERK-G-VERKL")
  private String     beperkgverkl;

  public BigInteger getAfgdatgverkl() {
    return this.afgdatgverkl;
  }

  public void setAfgdatgverkl(BigInteger afgdatgverkl) {
    this.afgdatgverkl = afgdatgverkl;
  }

  public BigInteger getEdatgverkl() {
    return this.edatgverkl;
  }

  public void setEdatgverkl(BigInteger edatgverkl) {
    this.edatgverkl = edatgverkl;
  }

  public String getStatusgverkl() {
    return this.statusgverkl;
  }

  public void setStatusgverkl(String statusgverkl) {
    this.statusgverkl = statusgverkl;
  }

  public String getToelblgverkl() {
    return this.toelblgverkl;
  }

  public void setToelblgverkl(String toelblgverkl) {
    this.toelblgverkl = toelblgverkl;
  }

  public String getBeperkgverkl() {
    return this.beperkgverkl;
  }

  public void setBeperkgverkl(String beperkgverkl) {
    this.beperkgverkl = beperkgverkl;
  }

}
