
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Awaiting Format"/>
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="Published"/>
 *     &lt;enumeration value="Read"/>
 *     &lt;enumeration value="Sent"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Sent By Email"/>
 *     &lt;enumeration value="Delivery Failure"/>
 *     &lt;enumeration value="Closed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NotificationStatus")
@XmlEnum
public enum NotificationStatus {

    @XmlEnumValue("Awaiting Format")
    AWAITING_FORMAT("Awaiting Format"),
    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("Published")
    PUBLISHED("Published"),
    @XmlEnumValue("Read")
    READ("Read"),
    @XmlEnumValue("Sent")
    SENT("Sent"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Sent By Email")
    SENT_BY_EMAIL("Sent By Email"),
    @XmlEnumValue("Delivery Failure")
    DELIVERY_FAILURE("Delivery Failure"),
    @XmlEnumValue("Closed")
    CLOSED("Closed");
    private final String value;

    NotificationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotificationStatus fromValue(String v) {
        for (NotificationStatus c: NotificationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
