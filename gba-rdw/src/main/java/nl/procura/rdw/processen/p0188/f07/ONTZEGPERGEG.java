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
 * <p>Java class for ONTZEG-PER-GEG complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ONTZEG-PER-GEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ONTZEG-DAT" type="{}DATUM-EJMD" minOccurs="0"/>
 *         &lt;element name="INLEV-DAT-ONTZ" type="{}DATUM-EJMD" minOccurs="0"/>
 *         &lt;element name="EINDE-ONTZ-DAT" type="{}DATUM-EJMD" minOccurs="0"/>
 *         &lt;element name="ONTZ-TERMYN" type="{}ONTZ-TERMYN" minOccurs="0"/>
 *         &lt;element name="OMSCH-PART-ONTZ" type="{}TEKST-100" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ONTZEG-PER-GEG",
    propOrder = {

    })
public class ONTZEGPERGEG implements Serializable {

  @XmlElement(name = "ONTZEG-DAT")
  private BigInteger ontzegdat;
  @XmlElement(name = "INLEV-DAT-ONTZ")
  private BigInteger inlevdatontz;
  @XmlElement(name = "EINDE-ONTZ-DAT")
  private BigInteger eindeontzdat;
  @XmlElement(name = "ONTZ-TERMYN")
  private String     ontztermyn;
  @XmlElement(name = "OMSCH-PART-ONTZ")
  private String     omschpartontz;

  public BigInteger getOntzegdat() {
    return this.ontzegdat;
  }

  public void setOntzegdat(BigInteger ontzegdat) {
    this.ontzegdat = ontzegdat;
  }

  public BigInteger getInlevdatontz() {
    return this.inlevdatontz;
  }

  public void setInlevdatontz(BigInteger inlevdatontz) {
    this.inlevdatontz = inlevdatontz;
  }

  public BigInteger getEindeontzdat() {
    return this.eindeontzdat;
  }

  public void setEindeontzdat(BigInteger eindeontzdat) {
    this.eindeontzdat = eindeontzdat;
  }

  public String getOntztermyn() {
    return this.ontztermyn;
  }

  public void setOntztermyn(String ontztermyn) {
    this.ontztermyn = ontztermyn;
  }

  public String getOmschpartontz() {
    return this.omschpartontz;
  }

  public void setOmschpartontz(String omschpartontz) {
    this.omschpartontz = omschpartontz;
  }

}
