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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A connection that the DSO wants the CRO to update
 * 
 * <p>Java class for DSOPortfolioUpdateConnectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSOPortfolioUpdateConnectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="EntityAddress" use="required" type="{}EntityAddressType" />
 *       &lt;attribute name="StartPeriod" use="required" type="{}PeriodType" />
 *       &lt;attribute name="EndPeriod" type="{}PeriodType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSOPortfolioUpdateConnectionType")
public class DSOPortfolioUpdateConnectionType {

    @XmlAttribute(name = "EntityAddress", required = true)
    protected String entityAddress;
    @XmlAttribute(name = "StartPeriod", required = true)
    protected XMLGregorianCalendar startPeriod;
    @XmlAttribute(name = "EndPeriod")
    protected XMLGregorianCalendar endPeriod;

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
     * Gets the value of the startPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartPeriod() {
        return startPeriod;
    }

    /**
     * Sets the value of the startPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartPeriod(XMLGregorianCalendar value) {
        this.startPeriod = value;
    }

    /**
     * Gets the value of the endPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndPeriod() {
        return endPeriod;
    }

    /**
     * Sets the value of the endPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndPeriod(XMLGregorianCalendar value) {
        this.endPeriod = value;
    }

}
