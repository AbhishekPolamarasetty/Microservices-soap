
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefreshStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefreshStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DISABLED"/>
 *     &lt;enumeration value="ENABLED"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="NEW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefreshStatusType")
@XmlEnum
public enum RefreshStatusType {

    DISABLED,
    ENABLED,
    ERROR,
    NEW;

    public String value() {
        return name();
    }

    public static RefreshStatusType fromValue(String v) {
        return valueOf(v);
    }

}
