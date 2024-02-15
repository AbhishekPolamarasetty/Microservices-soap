
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceFrequencyInType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvoiceFrequencyInType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DAYS"/>
 *     &lt;enumeration value="MONTHS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvoiceFrequencyInType", namespace = "http://mdsuk.com/ws/dise3g/agreement/dto/business")
@XmlEnum
public enum InvoiceFrequencyInType {

    DAYS,
    MONTHS;

    public String value() {
        return name();
    }

    public static InvoiceFrequencyInType fromValue(String v) {
        return valueOf(v);
    }

}