
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnhancedOrderTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnhancedOrderTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Regular"/>
 *     &lt;enumeration value="Hot Staging"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnhancedOrderTypeType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/business")
@XmlEnum
public enum EnhancedOrderTypeType {

    @XmlEnumValue("Regular")
    REGULAR("Regular"),
    @XmlEnumValue("Hot Staging")
    HOT_STAGING("Hot Staging");
    private final String value;

    EnhancedOrderTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnhancedOrderTypeType fromValue(String v) {
        for (EnhancedOrderTypeType c: EnhancedOrderTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
