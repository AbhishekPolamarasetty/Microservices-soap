
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="POSTPAY"/>
 *     &lt;enumeration value="PREPAY"/>
 *     &lt;enumeration value="COMBINATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillingTypeType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business")
@XmlEnum
public enum BillingTypeType {

    POSTPAY,
    PREPAY,
    COMBINATION;

    public String value() {
        return name();
    }

    public static BillingTypeType fromValue(String v) {
        return valueOf(v);
    }

}
