
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageClassificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PackageClassificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Base"/>
 *     &lt;enumeration value="Bolton"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PackageClassificationType", namespace = "http://mdsuk.com/ws/dise3g/services/dto/business")
@XmlEnum
public enum PackageClassificationType2 {

    @XmlEnumValue("Base")
    BASE("Base"),
    @XmlEnumValue("Bolton")
    BOLTON("Bolton");
    private final String value;

    PackageClassificationType2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PackageClassificationType2 fromValue(String v) {
        for (PackageClassificationType2 c: PackageClassificationType2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
