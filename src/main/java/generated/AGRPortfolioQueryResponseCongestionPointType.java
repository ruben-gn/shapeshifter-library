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
 * <p>Java class for AGRPortfolioQueryResponseCongestionPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AGRPortfolioQueryResponseCongestionPointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Connection" type="{}AGRPortfolioQueryResponseConnectionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EntityAddress" use="required" type="{}EntityAddressType" />
 *       &lt;attribute name="MutexOffersSupported" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DayAheadRedispatchBy" use="required" type="{}RedispatchByType" />
 *       &lt;attribute name="IntradayRedispatchBy" type="{}RedispatchByType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGRPortfolioQueryResponseCongestionPointType", propOrder = {
    "connection"
})
public class AGRPortfolioQueryResponseCongestionPointType {

    @XmlElement(name = "Connection", required = true)
    protected List<AGRPortfolioQueryResponseConnectionType> connection;
    @XmlAttribute(name = "EntityAddress", required = true)
    protected String entityAddress;
    @XmlAttribute(name = "MutexOffersSupported", required = true)
    protected boolean mutexOffersSupported;
    @XmlAttribute(name = "DayAheadRedispatchBy", required = true)
    protected RedispatchByType dayAheadRedispatchBy;
    @XmlAttribute(name = "IntradayRedispatchBy")
    protected RedispatchByType intradayRedispatchBy;

    /**
     * Gets the value of the connection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AGRPortfolioQueryResponseConnectionType }
     * 
     * 
     */
    public List<AGRPortfolioQueryResponseConnectionType> getConnection() {
        if (connection == null) {
            connection = new ArrayList<AGRPortfolioQueryResponseConnectionType>();
        }
        return this.connection;
    }

    /**
     * Gets the value of the entityAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityAddress() {
        return entityAddress;
    }

    /**
     * Sets the value of the entityAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityAddress(String value) {
        this.entityAddress = value;
    }

    /**
     * Gets the value of the mutexOffersSupported property.
     * 
     */
    public boolean isMutexOffersSupported() {
        return mutexOffersSupported;
    }

    /**
     * Sets the value of the mutexOffersSupported property.
     * 
     */
    public void setMutexOffersSupported(boolean value) {
        this.mutexOffersSupported = value;
    }

    /**
     * Gets the value of the dayAheadRedispatchBy property.
     * 
     * @return
     *     possible object is
     *     {@link RedispatchByType }
     *     
     */
    public RedispatchByType getDayAheadRedispatchBy() {
        return dayAheadRedispatchBy;
    }

    /**
     * Sets the value of the dayAheadRedispatchBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedispatchByType }
     *     
     */
    public void setDayAheadRedispatchBy(RedispatchByType value) {
        this.dayAheadRedispatchBy = value;
    }

    /**
     * Gets the value of the intradayRedispatchBy property.
     * 
     * @return
     *     possible object is
     *     {@link RedispatchByType }
     *     
     */
    public RedispatchByType getIntradayRedispatchBy() {
        return intradayRedispatchBy;
    }

    /**
     * Sets the value of the intradayRedispatchBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedispatchByType }
     *     
     */
    public void setIntradayRedispatchBy(RedispatchByType value) {
        this.intradayRedispatchBy = value;
    }

}
