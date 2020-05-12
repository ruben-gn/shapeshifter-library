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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FlexRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlexRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{}FlexMessageType">
 *       &lt;sequence>
 *         &lt;element name="ISP" type="{}FlexRequestISPType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Revision" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="ExpirationDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexRequestType", propOrder = {
    "isp"
})
public class FlexRequestType
    extends FlexMessageType
{

    @XmlElement(name = "ISP", required = true)
    protected List<FlexRequestISPType> isp;
    @XmlAttribute(name = "Revision", required = true)
    protected long revision;
    @XmlAttribute(name = "ExpirationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDateTime;

    /**
     * Gets the value of the isp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getISP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlexRequestISPType }
     * 
     * 
     */
    public List<FlexRequestISPType> getISP() {
        if (isp == null) {
            isp = new ArrayList<FlexRequestISPType>();
        }
        return this.isp;
    }

    /**
     * Gets the value of the revision property.
     * 
     */
    public long getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     */
    public void setRevision(long value) {
        this.revision = value;
    }

    /**
     * Gets the value of the expirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDateTime() {
        return expirationDateTime;
    }

    /**
     * Sets the value of the expirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDateTime(XMLGregorianCalendar value) {
        this.expirationDateTime = value;
    }

}
