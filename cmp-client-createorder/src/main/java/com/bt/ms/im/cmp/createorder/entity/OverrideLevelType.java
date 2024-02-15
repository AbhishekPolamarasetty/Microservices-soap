
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverrideLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OverrideLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Corporate"/>
 *     &lt;enumeration value="Account"/>
 *     &lt;enumeration value="Agreement"/>
 *     &lt;enumeration value="Subscription"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OverrideLevelType")
@XmlEnum
public enum OverrideLevelType {

    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Corporate")
    CORPORATE("Corporate"),
    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("Agreement")
    AGREEMENT("Agreement"),
    @XmlEnumValue("Subscription")
    SUBSCRIPTION("Subscription");
    private final String value;

    OverrideLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OverrideLevelType fromValue(String v) {
        for (OverrideLevelType c: OverrideLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
