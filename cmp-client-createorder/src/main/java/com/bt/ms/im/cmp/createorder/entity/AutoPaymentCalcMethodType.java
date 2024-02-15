
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoPaymentCalcMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutoPaymentCalcMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CHILD"/>
 *     &lt;enumeration value="PARENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AutoPaymentCalcMethodType", namespace = "http://mdsuk.com/ws/dise3g/account/dto/business")
@XmlEnum
public enum AutoPaymentCalcMethodType {

    CHILD,
    PARENT;

    public String value() {
        return name();
    }

    public static AutoPaymentCalcMethodType fromValue(String v) {
        return valueOf(v);
    }

}
