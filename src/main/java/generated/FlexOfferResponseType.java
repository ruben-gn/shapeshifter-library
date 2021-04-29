// SPDX-FileCopyrightText: 2020-2021 Alliander N.V.
//
// SPDX-License-Identifier: Apache-2.0

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.12 at 04:20:58 PM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlexOfferResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlexOfferResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{}PayloadMessageResponseType">
 *       &lt;attribute name="FlexOfferMessageID" use="required" type="{}UUIDType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexOfferResponseType")
public class FlexOfferResponseType
    extends PayloadMessageResponseType
{

    @XmlAttribute(name = "FlexOfferMessageID", required = true)
    protected String flexOfferMessageID;

    /**
     * Gets the value of the flexOfferMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexOfferMessageID() {
        return flexOfferMessageID;
    }

    /**
     * Sets the value of the flexOfferMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexOfferMessageID(String value) {
        this.flexOfferMessageID = value;
    }

}
