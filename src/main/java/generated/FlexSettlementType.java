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
 * <p>Java class for FlexSettlementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlexSettlementType">
 *   &lt;complexContent>
 *     &lt;extension base="{}PayloadMessageResponseType">
 *       &lt;sequence>
 *         &lt;element name="FlexOrderSettlement" type="{}FlexOrderSettlementType" maxOccurs="unbounded"/>
 *         &lt;element name="ContractSettlement" type="{}ContractSettlementType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PeriodStart" use="required" type="{}PeriodType" />
 *       &lt;attribute name="PeriodEnd" use="required" type="{}PeriodType" />
 *       &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Currency" use="required" type="{}ISO4217CurrencyType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexSettlementType", propOrder = {
    "flexOrderSettlement",
    "contractSettlement"
})
public class FlexSettlementType
    extends PayloadMessageResponseType
{

    @XmlElement(name = "FlexOrderSettlement", required = true)
    protected List<FlexOrderSettlementType> flexOrderSettlement;
    @XmlElement(name = "ContractSettlement", required = true)
    protected List<ContractSettlementType> contractSettlement;
    @XmlAttribute(name = "PeriodStart", required = true)
    protected XMLGregorianCalendar periodStart;
    @XmlAttribute(name = "PeriodEnd", required = true)
    protected XMLGregorianCalendar periodEnd;
    @XmlAttribute(name = "Reference")
    protected String reference;
    @XmlAttribute(name = "Currency", required = true)
    protected String currency;

    /**
     * Gets the value of the flexOrderSettlement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flexOrderSettlement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlexOrderSettlement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlexOrderSettlementType }
     * 
     * 
     */
    public List<FlexOrderSettlementType> getFlexOrderSettlement() {
        if (flexOrderSettlement == null) {
            flexOrderSettlement = new ArrayList<FlexOrderSettlementType>();
        }
        return this.flexOrderSettlement;
    }

    /**
     * Gets the value of the contractSettlement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractSettlement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractSettlement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractSettlementType }
     * 
     * 
     */
    public List<ContractSettlementType> getContractSettlement() {
        if (contractSettlement == null) {
            contractSettlement = new ArrayList<ContractSettlementType>();
        }
        return this.contractSettlement;
    }

    /**
     * Gets the value of the periodStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodStart() {
        return periodStart;
    }

    /**
     * Sets the value of the periodStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodStart(XMLGregorianCalendar value) {
        this.periodStart = value;
    }

    /**
     * Gets the value of the periodEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodEnd() {
        return periodEnd;
    }

    /**
     * Sets the value of the periodEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodEnd(XMLGregorianCalendar value) {
        this.periodEnd = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
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

}
