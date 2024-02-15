
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Immediate"/>
 *     &lt;enumeration value="OnDespatchOfOrder"/>
 *     &lt;enumeration value="ActivationByCustomer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActivationType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/business")
@XmlEnum
public enum ActivationType {

    @XmlEnumValue("Immediate")
    IMMEDIATE("Immediate"),
    @XmlEnumValue("OnDespatchOfOrder")
    ON_DESPATCH_OF_ORDER("OnDespatchOfOrder"),
    @XmlEnumValue("ActivationByCustomer")
    ACTIVATION_BY_CUSTOMER("ActivationByCustomer");
    private final String value;

    ActivationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActivationType fromValue(String v) {
        for (ActivationType c: ActivationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
