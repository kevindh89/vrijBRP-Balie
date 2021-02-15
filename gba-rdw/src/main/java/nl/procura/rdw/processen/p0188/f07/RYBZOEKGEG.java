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
// Generated on: 2018.06.26 at 02:32:26 PM CEST 
//

package nl.procura.rdw.processen.p0188.f07;

import java.io.Serializable;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for RYB-ZOEK-GEG complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RYB-ZOEK-GEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ERK-RYB-NR-A" type="{}RYB-NR-LANG"/>
 *         &lt;element name="LAND-CODE-ERK-A" type="{}LAND-CODE"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RYB-ZOEK-GEG",
    propOrder = {

    })
public class RYBZOEKGEG implements Serializable {

  @XmlElement(name = "ERK-RYB-NR-A",
      required = true)
  private String     erkrybnra;
  @XmlElement(name = "LAND-CODE-ERK-A",
      required = true)
  private BigInteger landcodeerka;

  public String getErkrybnra() {
    return this.erkrybnra;
  }

  public void setErkrybnra(String erkrybnra) {
    this.erkrybnra = erkrybnra;
  }

  public BigInteger getLandcodeerka() {
    return this.landcodeerka;
  }

  public void setLandcodeerka(BigInteger landcodeerka) {
    this.landcodeerka = landcodeerka;
  }

}
