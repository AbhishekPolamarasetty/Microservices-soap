
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PortStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="Locked"/>
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Complete"/>
 *     &lt;enumeration value="Cancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PortStatusType", namespace = "http://mdsuk.com/ws/dise3g/account/dto/business")
@XmlEnum
public enum PortStatusType {

    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Locked")
    LOCKED("Locked"),
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled");
    private final String value;

    PortStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PortStatusType fromValue(String v) {
        for (PortStatusType c: PortStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
