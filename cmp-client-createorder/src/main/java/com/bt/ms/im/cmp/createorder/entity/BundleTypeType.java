
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BundleTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BundleTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Value"/>
 *     &lt;enumeration value="Volume"/>
 *     &lt;enumeration value="Billable Duration"/>
 *     &lt;enumeration value="Actual Duration"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BundleTypeType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business")
@XmlEnum
public enum BundleTypeType {

    @XmlEnumValue("Value")
    VALUE("Value"),
    @XmlEnumValue("Volume")
    VOLUME("Volume"),
    @XmlEnumValue("Billable Duration")
    BILLABLE_DURATION("Billable Duration"),
    @XmlEnumValue("Actual Duration")
    ACTUAL_DURATION("Actual Duration");
    private final String value;

    BundleTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BundleTypeType fromValue(String v) {
        for (BundleTypeType c: BundleTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
