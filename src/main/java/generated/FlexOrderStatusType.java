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
 * <p>Java class for FlexOrderStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlexOrderStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="FlexOrderMessageID" use="required" type="{}UUIDType" />
 *       &lt;attribute name="IsValidated" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexOrderStatusType")
public class FlexOrderStatusType {

    @XmlAttribute(name = "FlexOrderMessageID", required = true)
    protected String flexOrderMessageID;
    @XmlAttribute(name = "IsValidated", required = true)
    protected boolean isValidated;

    /**
     * Gets the value of the flexOrderMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexOrderMessageID() {
        return flexOrderMessageID;
    }

    /**
     * Sets the value of the flexOrderMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexOrderMessageID(String value) {
        this.flexOrderMessageID = value;
    }

    /**
     * Gets the value of the isValidated property.
     * 
     */
    public boolean isIsValidated() {
        return isValidated;
    }

    /**
     * Sets the value of the isValidated property.
     * 
     */
    public void setIsValidated(boolean value) {
        this.isValidated = value;
    }

}
