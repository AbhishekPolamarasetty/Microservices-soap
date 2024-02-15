
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GBP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrencyCodeType", namespace = "http://mdsuk.com/ws/dise3g/recordpayment/dto/business")
@XmlEnum
public enum CurrencyCodeType2 {

    GBP;

    public String value() {
        return name();
    }

    public static CurrencyCodeType2 fromValue(String v) {
        return valueOf(v);
    }

}
