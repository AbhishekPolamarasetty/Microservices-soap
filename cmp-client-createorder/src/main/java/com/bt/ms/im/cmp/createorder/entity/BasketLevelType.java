
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasketLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BasketLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AGREEMENT"/>
 *     &lt;enumeration value="SUBSCRIPTION"/>
 *     &lt;enumeration value="TARIFFSHARE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BasketLevelType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business")
@XmlEnum
public enum BasketLevelType {

    AGREEMENT,
    SUBSCRIPTION,
    TARIFFSHARE;

    public String value() {
        return name();
    }

    public static BasketLevelType fromValue(String v) {
        return valueOf(v);
    }

}
