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
 * <p>Java class for FlexOrderSettlementStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlexOrderSettlementStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="OrderReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Disposition" use="required" type="{}AcceptedDisputedType" />
 *       &lt;attribute name="DisputeReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexOrderSettlementStatusType")
public class FlexOrderSettlementStatusType {

    @XmlAttribute(name = "OrderReference")
    protected String orderReference;
    @XmlAttribute(name = "Disposition", required = true)
    protected AcceptedDisputedType disposition;
    @XmlAttribute(name = "DisputeReason")
    protected String disputeReason;

    /**
     * Gets the value of the orderReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderReference() {
        return orderReference;
    }

    /**
     * Sets the value of the orderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderReference(String value) {
        this.orderReference = value;
    }

    /**
     * Gets the value of the disposition property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedDisputedType }
     *     
     */
    public AcceptedDisputedType getDisposition() {
        return disposition;
    }

    /**
     * Sets the value of the disposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedDisputedType }
     *     
     */
    public void setDisposition(AcceptedDisputedType value) {
        this.disposition = value;
    }

    /**
     * Gets the value of the disputeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeReason() {
        return disputeReason;
    }

    /**
     * Sets the value of the disputeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeReason(String value) {
        this.disputeReason = value;
    }

}
