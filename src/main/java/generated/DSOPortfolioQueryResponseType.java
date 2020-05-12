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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DSOPortfolioQueryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSOPortfolioQueryResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{}PayloadMessageResponseType">
 *       &lt;sequence>
 *         &lt;element name="CongestionPoint" type="{}DSOPortfolioQueryCongestionPointType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DSOPortfolioQueryMessageID" use="required" type="{}UUIDType" />
 *       &lt;attribute name="TimeZone" use="required" type="{}TimeZoneNameType" />
 *       &lt;attribute name="Period" use="required" type="{}PeriodType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSOPortfolioQueryResponseType", propOrder = {
    "congestionPoint"
})
public class DSOPortfolioQueryResponseType
    extends PayloadMessageResponseType
{

    @XmlElement(name = "CongestionPoint")
    protected DSOPortfolioQueryCongestionPointType congestionPoint;
    @XmlAttribute(name = "DSOPortfolioQueryMessageID", required = true)
    protected String dsoPortfolioQueryMessageID;
    @XmlAttribute(name = "TimeZone", required = true)
    protected String timeZone;
    @XmlAttribute(name = "Period", required = true)
    protected XMLGregorianCalendar period;

    /**
     * Gets the value of the congestionPoint property.
     * 
     * @return
     *     possible object is
     *     {@link DSOPortfolioQueryCongestionPointType }
     *     
     */
    public DSOPortfolioQueryCongestionPointType getCongestionPoint() {
        return congestionPoint;
    }

    /**
     * Sets the value of the congestionPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSOPortfolioQueryCongestionPointType }
     *     
     */
    public void setCongestionPoint(DSOPortfolioQueryCongestionPointType value) {
        this.congestionPoint = value;
    }

    /**
     * Gets the value of the dsoPortfolioQueryMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSOPortfolioQueryMessageID() {
        return dsoPortfolioQueryMessageID;
    }

    /**
     * Sets the value of the dsoPortfolioQueryMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSOPortfolioQueryMessageID(String value) {
        this.dsoPortfolioQueryMessageID = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriod(XMLGregorianCalendar value) {
        this.period = value;
    }

}
