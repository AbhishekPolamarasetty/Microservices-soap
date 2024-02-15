
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LastOrderStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LastOrderStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AWAITING_ORDER_DESPATCH"/>
 *     &lt;enumeration value="AWAITING_CUSTOMER_ACTIVATION"/>
 *     &lt;enumeration value="COMPLETE"/>
 *     &lt;enumeration value="CANCELLED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LastOrderStatusType")
@XmlEnum
public enum LastOrderStatusType {

    AWAITING_ORDER_DESPATCH,
    AWAITING_CUSTOMER_ACTIVATION,
    COMPLETE,
    CANCELLED;

    public String value() {
        return name();
    }

    public static LastOrderStatusType fromValue(String v) {
        return valueOf(v);
    }

}
