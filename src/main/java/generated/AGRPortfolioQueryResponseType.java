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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AGRPortfolioQueryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AGRPortfolioQueryResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{}PayloadMessageResponseType">
 *       &lt;sequence>
 *         &lt;element name="DSO-View" type="{}AGRPortfolioQueryResponseDSOViewType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TimeZone" use="required" type="{}TimeZoneNameType" />
 *       &lt;attribute name="AGRPortfolioQueryMessageID" use="required" type="{}UUIDType" />
 *       &lt;attribute name="Period" use="required" type="{}PeriodType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGRPortfolioQueryResponseType", propOrder = {
    "dsoView"
})
public class AGRPortfolioQueryResponseType
    extends PayloadMessageResponseType
{

    @XmlElement(name = "DSO-View", required = true)
    protected List<AGRPortfolioQueryResponseDSOViewType> dsoView;
    @XmlAttribute(name = "TimeZone", required = true)
    protected String timeZone;
    @XmlAttribute(name = "AGRPortfolioQueryMessageID", required = true)
    protected String agrPortfolioQueryMessageID;
    @XmlAttribute(name = "Period", required = true)
    protected XMLGregorianCalendar period;

    /**
     * Gets the value of the dsoView property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dsoView property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSOView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AGRPortfolioQueryResponseDSOViewType }
     * 
     * 
     */
    public List<AGRPortfolioQueryResponseDSOViewType> getDSOView() {
        if (dsoView == null) {
            dsoView = new ArrayList<AGRPortfolioQueryResponseDSOViewType>();
        }
        return this.dsoView;
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
     * Gets the value of the agrPortfolioQueryMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGRPortfolioQueryMessageID() {
        return agrPortfolioQueryMessageID;
    }

    /**
     * Sets the value of the agrPortfolioQueryMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGRPortfolioQueryMessageID(String value) {
        this.agrPortfolioQueryMessageID = value;
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
