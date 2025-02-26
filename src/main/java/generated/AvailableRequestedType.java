//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.12 at 04:20:58 PM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailableRequestedType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AvailableRequestedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Available"/>
 *     &lt;enumeration value="Requested"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AvailableRequestedType")
@XmlEnum
public enum AvailableRequestedType {

    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("Requested")
    REQUESTED("Requested");
    private final String value;

    AvailableRequestedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AvailableRequestedType fromValue(String v) {
        for (AvailableRequestedType c: AvailableRequestedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
