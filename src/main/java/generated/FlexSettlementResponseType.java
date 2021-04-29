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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlexSettlementResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlexSettlementResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{}PayloadMessageResponseType">
 *       &lt;sequence>
 *         &lt;element name="FlexOrderSettlementStatus" type="{}FlexOrderSettlementStatusType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FlexSettlementMessageID" use="required" type="{}UUIDType" />
 *       &lt;attribute name="Reference" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexSettlementResponseType", propOrder = {
    "flexOrderSettlementStatus"
})
public class FlexSettlementResponseType
    extends PayloadMessageResponseType
{

    @XmlElement(name = "FlexOrderSettlementStatus", required = true)
    protected List<FlexOrderSettlementStatusType> flexOrderSettlementStatus;
    @XmlAttribute(name = "FlexSettlementMessageID", required = true)
    protected String flexSettlementMessageID;
    @XmlAttribute(name = "Reference", required = true)
    protected String reference;

    /**
     * Gets the value of the flexOrderSettlementStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flexOrderSettlementStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlexOrderSettlementStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlexOrderSettlementStatusType }
     * 
     * 
     */
    public List<FlexOrderSettlementStatusType> getFlexOrderSettlementStatus() {
        if (flexOrderSettlementStatus == null) {
            flexOrderSettlementStatus = new ArrayList<FlexOrderSettlementStatusType>();
        }
        return this.flexOrderSettlementStatus;
    }

    /**
     * Gets the value of the flexSettlementMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexSettlementMessageID() {
        return flexSettlementMessageID;
    }

    /**
     * Sets the value of the flexSettlementMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexSettlementMessageID(String value) {
        this.flexSettlementMessageID = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

}
