
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CapTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FULL"/>
 *     &lt;enumeration value="PARTIAL"/>
 *     &lt;enumeration value="MIN SERVICE SPEND"/>
 *     &lt;enumeration value="MAX SERVICE SPEND"/>
 *     &lt;enumeration value="OVERAGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CapTypeType")
@XmlEnum
public enum CapTypeType {

    FULL("FULL"),
    PARTIAL("PARTIAL"),
    @XmlEnumValue("MIN SERVICE SPEND")
    MIN_SERVICE_SPEND("MIN SERVICE SPEND"),
    @XmlEnumValue("MAX SERVICE SPEND")
    MAX_SERVICE_SPEND("MAX SERVICE SPEND"),
    OVERAGE("OVERAGE");
    private final String value;

    CapTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CapTypeType fromValue(String v) {
        for (CapTypeType c: CapTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
