
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiscountLevelType">
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
@XmlType(name = "DiscountLevelType", namespace = "http://mdsuk.com/ws/dise3g/discount/dto/business")
@XmlEnum
public enum DiscountLevelType {

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

    DiscountLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiscountLevelType fromValue(String v) {
        for (DiscountLevelType c: DiscountLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
