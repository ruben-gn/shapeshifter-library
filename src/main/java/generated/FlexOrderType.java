//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.12 at 04:20:58 PM CEST 
//


package generated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlexOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlexOrderType">
 *   &lt;complexContent>
 *     &lt;extension base="{}FlexMessageType">
 *       &lt;sequence>
 *         &lt;element name="ISP" type="{}FlexOrderISPType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FlexOfferMessageID" use="required" type="{}UUIDType" />
 *       &lt;attribute name="ContractID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="D-PrognosisMessageID" type="{}UUIDType" />
 *       &lt;attribute name="BaselineReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Price" use="required" type="{}CurrencyAmountType" />
 *       &lt;attribute name="Currency" use="required" type="{}ISO4217CurrencyType" />
 *       &lt;attribute name="OrderReference" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OptionReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ActivationFactor" type="{}ActivationFactorType" default="1.00" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexOrderType", propOrder = {
    "isp"
})
public class FlexOrderType
    extends FlexMessageType
{

    @XmlElement(name = "ISP", required = true)
    protected List<FlexOrderISPType> isp;
    @XmlAttribute(name = "FlexOfferMessageID", required = true)
    protected String flexOfferMessageID;
    @XmlAttribute(name = "ContractID")
    protected String contractID;
    @XmlAttribute(name = "D-PrognosisMessageID")
    protected String dPrognosisMessageID;
    @XmlAttribute(name = "BaselineReference")
    protected String baselineReference;
    @XmlAttribute(name = "Price", required = true)
    protected BigDecimal price;
    @XmlAttribute(name = "Currency", required = true)
    protected String currency;
    @XmlAttribute(name = "OrderReference", required = true)
    protected String orderReference;
    @XmlAttribute(name = "OptionReference")
    protected String optionReference;
    @XmlAttribute(name = "ActivationFactor")
    protected BigDecimal activationFactor;

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
     * {@link FlexOrderISPType }
     * 
     * 
     */
    public List<FlexOrderISPType> getISP() {
        if (isp == null) {
            isp = new ArrayList<FlexOrderISPType>();
        }
        return this.isp;
    }

    /**
     * Gets the value of the flexOfferMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexOfferMessageID() {
        return flexOfferMessageID;
    }

    /**
     * Sets the value of the flexOfferMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexOfferMessageID(String value) {
        this.flexOfferMessageID = value;
    }

    /**
     * Gets the value of the contractID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractID() {
        return contractID;
    }

    /**
     * Sets the value of the contractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractID(String value) {
        this.contractID = value;
    }

    /**
     * Gets the value of the dPrognosisMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPrognosisMessageID() {
        return dPrognosisMessageID;
    }

    /**
     * Sets the value of the dPrognosisMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPrognosisMessageID(String value) {
        this.dPrognosisMessageID = value;
    }

    /**
     * Gets the value of the baselineReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaselineReference() {
        return baselineReference;
    }

    /**
     * Sets the value of the baselineReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaselineReference(String value) {
        this.baselineReference = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

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
     * Gets the value of the optionReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionReference() {
        return optionReference;
    }

    /**
     * Sets the value of the optionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionReference(String value) {
        this.optionReference = value;
    }

    /**
     * Gets the value of the activationFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActivationFactor() {
        if (activationFactor == null) {
            return new BigDecimal("1.00");
        } else {
            return activationFactor;
        }
    }

    /**
     * Sets the value of the activationFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActivationFactor(BigDecimal value) {
        this.activationFactor = value;
    }

}
