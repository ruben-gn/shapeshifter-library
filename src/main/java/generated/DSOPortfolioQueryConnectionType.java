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
 * A Connection that is part of the congestion point.
 * 
 * <p>Java class for DSOPortfolioQueryConnectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSOPortfolioQueryConnectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="EntityAddress" use="required" type="{}EntityAddressType" />
 *       &lt;attribute name="AGR-Domain" type="{}InternetDomainType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSOPortfolioQueryConnectionType")
public class DSOPortfolioQueryConnectionType {

    @XmlAttribute(name = "EntityAddress", required = true)
    protected String entityAddress;
    @XmlAttribute(name = "AGR-Domain")
    protected String agrDomain;

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
     * Gets the value of the agrDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGRDomain() {
        return agrDomain;
    }

    /**
     * Sets the value of the agrDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGRDomain(String value) {
        this.agrDomain = value;
    }

}
