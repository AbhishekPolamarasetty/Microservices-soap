
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkSerialStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkSerialStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CHANGING"/>
 *     &lt;enumeration value="CURRENT"/>
 *     &lt;enumeration value="SUPERSEDED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NetworkSerialStatusType")
@XmlEnum
public enum NetworkSerialStatusType {

    CHANGING,
    CURRENT,
    SUPERSEDED;

    public String value() {
        return name();
    }

    public static NetworkSerialStatusType fromValue(String v) {
        return valueOf(v);
    }

}
