
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUBSCRIPTION"/>
 *     &lt;enumeration value="NETWORKSERIALNUMBER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerLevelType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business")
@XmlEnum
public enum CustomerLevelType4 {

    SUBSCRIPTION,
    NETWORKSERIALNUMBER;

    public String value() {
        return name();
    }

    public static CustomerLevelType4 fromValue(String v) {
        return valueOf(v);
    }

}
