
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusSuccessFailureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusSuccessFailureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="FAILURE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusSuccessFailureType", namespace = "http://mdsuk.com/ws/dise3g/base")
@XmlEnum
public enum StatusSuccessFailureType {

    SUCCESS,
    FAILURE;

    public String value() {
        return name();
    }

    public static StatusSuccessFailureType fromValue(String v) {
        return valueOf(v);
    }

}
