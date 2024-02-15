
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusFilterAllActiveType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusFilterAllActiveType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="ACTIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusFilterAllActiveType", namespace = "http://mdsuk.com/ws/dise3g/base")
@XmlEnum
public enum StatusFilterAllActiveType {

    ALL,
    ACTIVE;

    public String value() {
        return name();
    }

    public static StatusFilterAllActiveType fromValue(String v) {
        return valueOf(v);
    }

}
