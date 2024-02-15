
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpgradeTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpgradeTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NumberChange"/>
 *     &lt;enumeration value="TariffChange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UpgradeTypeType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/business")
@XmlEnum
public enum UpgradeTypeType {

    @XmlEnumValue("NumberChange")
    NUMBER_CHANGE("NumberChange"),
    @XmlEnumValue("TariffChange")
    TARIFF_CHANGE("TariffChange");
    private final String value;

    UpgradeTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpgradeTypeType fromValue(String v) {
        for (UpgradeTypeType c: UpgradeTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
