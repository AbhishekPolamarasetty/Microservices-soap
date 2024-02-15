
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapDataTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CapDataTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VALUE"/>
 *     &lt;enumeration value="VOLUME"/>
 *     &lt;enumeration value="DURATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CapDataTypeType")
@XmlEnum
public enum CapDataTypeType {

    VALUE,
    VOLUME,
    DURATION;

    public String value() {
        return name();
    }

    public static CapDataTypeType fromValue(String v) {
        return valueOf(v);
    }

}
