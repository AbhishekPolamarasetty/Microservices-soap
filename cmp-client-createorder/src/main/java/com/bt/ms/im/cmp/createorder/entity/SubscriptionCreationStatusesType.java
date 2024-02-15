
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionCreationStatusesType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriptionCreationStatusesType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="FAILURE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubscriptionCreationStatusesType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/service")
@XmlEnum
public enum SubscriptionCreationStatusesType {

    SUCCESS,
    FAILURE;

    public String value() {
        return name();
    }

    public static SubscriptionCreationStatusesType fromValue(String v) {
        return valueOf(v);
    }

}
