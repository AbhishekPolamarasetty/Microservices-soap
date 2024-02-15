
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageClassificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PackageClassificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BASE_PACKAGE"/>
 *     &lt;enumeration value="BOLTON_PACKAGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PackageClassificationType")
@XmlEnum
public enum PackageClassificationType {

    BASE_PACKAGE,
    BOLTON_PACKAGE;

    public String value() {
        return name();
    }

    public static PackageClassificationType fromValue(String v) {
        return valueOf(v);
    }

}
