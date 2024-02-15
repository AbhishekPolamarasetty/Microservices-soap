
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BundledCallStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BundledCallStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Dropped"/>
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Part Bundled"/>
 *     &lt;enumeration value="Part Dropped"/>
 *     &lt;enumeration value="Part Rolled"/>
 *     &lt;enumeration value="Rolled"/>
 *     &lt;enumeration value="Yes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BundledCallStatusType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business")
@XmlEnum
public enum BundledCallStatusType {

    @XmlEnumValue("Dropped")
    DROPPED("Dropped"),
    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Part Bundled")
    PART_BUNDLED("Part Bundled"),
    @XmlEnumValue("Part Dropped")
    PART_DROPPED("Part Dropped"),
    @XmlEnumValue("Part Rolled")
    PART_ROLLED("Part Rolled"),
    @XmlEnumValue("Rolled")
    ROLLED("Rolled"),
    @XmlEnumValue("Yes")
    YES("Yes");
    private final String value;

    BundledCallStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BundledCallStatusType fromValue(String v) {
        for (BundledCallStatusType c: BundledCallStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
