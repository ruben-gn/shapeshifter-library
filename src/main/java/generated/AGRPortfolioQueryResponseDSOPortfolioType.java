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


/**
 * <p>Java class for AGRPortfolioQueryResponseDSOPortfolioType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AGRPortfolioQueryResponseDSOPortfolioType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CongestionPoint" type="{}AGRPortfolioQueryResponseCongestionPointType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DSO-Domain" use="required" type="{}InternetDomainType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGRPortfolioQueryResponseDSOPortfolioType", propOrder = {
    "congestionPoint"
})
public class AGRPortfolioQueryResponseDSOPortfolioType {

    @XmlElement(name = "CongestionPoint", required = true)
    protected List<AGRPortfolioQueryResponseCongestionPointType> congestionPoint;
    @XmlAttribute(name = "DSO-Domain", required = true)
    protected String dsoDomain;

    /**
     * Gets the value of the congestionPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the congestionPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCongestionPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AGRPortfolioQueryResponseCongestionPointType }
     * 
     * 
     */
    public List<AGRPortfolioQueryResponseCongestionPointType> getCongestionPoint() {
        if (congestionPoint == null) {
            congestionPoint = new ArrayList<AGRPortfolioQueryResponseCongestionPointType>();
        }
        return this.congestionPoint;
    }

    /**
     * Gets the value of the dsoDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSODomain() {
        return dsoDomain;
    }

    /**
     * Sets the value of the dsoDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSODomain(String value) {
        this.dsoDomain = value;
    }

}
