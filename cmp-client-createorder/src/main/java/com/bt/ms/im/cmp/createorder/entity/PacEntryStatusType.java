
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PacEntryStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PacEntryStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Locked"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="Processed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PacEntryStatusType", namespace = "http://mdsuk.com/ws/dise3g/porting/dto/business")
@XmlEnum
public enum PacEntryStatusType {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Locked")
    LOCKED("Locked"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Processed")
    PROCESSED("Processed");
    private final String value;

    PacEntryStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PacEntryStatusType fromValue(String v) {
        for (PacEntryStatusType c: PacEntryStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
