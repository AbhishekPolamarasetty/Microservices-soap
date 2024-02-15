
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionOrderTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriptionOrderTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NewConnection"/>
 *     &lt;enumeration value="OrderOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubscriptionOrderTypeType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/business")
@XmlEnum
public enum SubscriptionOrderTypeType {

    @XmlEnumValue("NewConnection")
    NEW_CONNECTION("NewConnection"),
    @XmlEnumValue("OrderOnly")
    ORDER_ONLY("OrderOnly");
    private final String value;

    SubscriptionOrderTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubscriptionOrderTypeType fromValue(String v) {
        for (SubscriptionOrderTypeType c: SubscriptionOrderTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
