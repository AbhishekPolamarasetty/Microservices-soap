
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BundleAppliedOnType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BundleAppliedOnType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BLANK"/>
 *     &lt;enumeration value="Access Charge"/>
 *     &lt;enumeration value="Service Charge"/>
 *     &lt;enumeration value="Full Price"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BundleAppliedOnType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business")
@XmlEnum
public enum BundleAppliedOnType {

    BLANK("BLANK"),
    @XmlEnumValue("Access Charge")
    ACCESS_CHARGE("Access Charge"),
    @XmlEnumValue("Service Charge")
    SERVICE_CHARGE("Service Charge"),
    @XmlEnumValue("Full Price")
    FULL_PRICE("Full Price");
    private final String value;

    BundleAppliedOnType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BundleAppliedOnType fromValue(String v) {
        for (BundleAppliedOnType c: BundleAppliedOnType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
