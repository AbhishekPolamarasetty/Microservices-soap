
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BundleLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BundleLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Subscription"/>
 *     &lt;enumeration value="Agreement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BundleLevelType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business")
@XmlEnum
public enum BundleLevelType {

    @XmlEnumValue("Subscription")
    SUBSCRIPTION("Subscription"),
    @XmlEnumValue("Agreement")
    AGREEMENT("Agreement");
    private final String value;

    BundleLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BundleLevelType fromValue(String v) {
        for (BundleLevelType c: BundleLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
