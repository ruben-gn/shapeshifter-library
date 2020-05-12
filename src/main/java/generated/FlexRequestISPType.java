//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.12 at 04:20:58 PM CEST 
//


package generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlexRequestISPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlexRequestISPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Disposition" type="{}AvailableRequestedType" />
 *       &lt;attribute name="MinPower" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="MaxPower" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Start" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexRequestISPType")
public class FlexRequestISPType {

    @XmlAttribute(name = "Disposition")
    protected AvailableRequestedType disposition;
    @XmlAttribute(name = "MinPower", required = true)
    protected BigInteger minPower;
    @XmlAttribute(name = "MaxPower", required = true)
    protected BigInteger maxPower;
    @XmlAttribute(name = "Start", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger start;
    @XmlAttribute(name = "Duration")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger duration;

    /**
     * Gets the value of the disposition property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableRequestedType }
     *     
     */
    public AvailableRequestedType getDisposition() {
        return disposition;
    }

    /**
     * Sets the value of the disposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableRequestedType }
     *     
     */
    public void setDisposition(AvailableRequestedType value) {
        this.disposition = value;
    }

    /**
     * Gets the value of the minPower property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinPower() {
        return minPower;
    }

    /**
     * Sets the value of the minPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinPower(BigInteger value) {
        this.minPower = value;
    }

    /**
     * Gets the value of the maxPower property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxPower() {
        return maxPower;
    }

    /**
     * Sets the value of the maxPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxPower(BigInteger value) {
        this.maxPower = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStart(BigInteger value) {
        this.start = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDuration() {
        if (duration == null) {
            return new BigInteger("1");
        } else {
            return duration;
        }
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDuration(BigInteger value) {
        this.duration = value;
    }

}
