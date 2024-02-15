
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Temp1"/>
 *     &lt;enumeration value="Temp2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NotificationCategory")
@XmlEnum
public enum NotificationCategory {

    @XmlEnumValue("Temp1")
    TEMP_1("Temp1"),
    @XmlEnumValue("Temp2")
    TEMP_2("Temp2");
    private final String value;

    NotificationCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotificationCategory fromValue(String v) {
        for (NotificationCategory c: NotificationCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
