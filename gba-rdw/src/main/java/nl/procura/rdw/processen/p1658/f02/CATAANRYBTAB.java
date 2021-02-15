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

package nl.procura.rdw.processen.p1658.f02;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for CAT-AAN-RYB-TAB complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CAT-AAN-RYB-TAB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CAT-AAN-RYB-GEG" type="{}CAT-AAN-RYB-GEG" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAT-AAN-RYB-TAB",
    propOrder = { "cataanrybgeg" })
public class CATAANRYBTAB implements Serializable {

  @XmlElement(name = "CAT-AAN-RYB-GEG",
      required = true)
  private List<CATAANRYBGEG> cataanrybgeg;

  public List<CATAANRYBGEG> getCataanrybgeg() {
    return this.cataanrybgeg;
  }

  public void setCataanrybgeg(List<CATAANRYBGEG> cataanrybgeg) {
    this.cataanrybgeg = cataanrybgeg;
  }

}
