
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusFilterAllEffectiveFutureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusFilterAllEffectiveFutureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="EFFECTIVE"/>
 *     &lt;enumeration value="FUTURE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusFilterAllEffectiveFutureType", namespace = "http://mdsuk.com/ws/dise3g/services/dto/business")
@XmlEnum
public enum StatusFilterAllEffectiveFutureType {

    ALL,
    EFFECTIVE,
    FUTURE;

    public String value() {
        return name();
    }

    public static StatusFilterAllEffectiveFutureType fromValue(String v) {
        return valueOf(v);
    }

}
