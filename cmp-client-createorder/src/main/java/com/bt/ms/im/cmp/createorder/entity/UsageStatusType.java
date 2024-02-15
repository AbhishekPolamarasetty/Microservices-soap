
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsageStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UsageStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Written Off"/>
 *     &lt;enumeration value="Awaiting Manual Invoice"/>
 *     &lt;enumeration value="Awaiting Invoice"/>
 *     &lt;enumeration value="Manually Invoiced"/>
 *     &lt;enumeration value="Invoiced"/>
 *     &lt;enumeration value="Unallocated to Subscription"/>
 *     &lt;enumeration value="Manually Allocated"/>
 *     &lt;enumeration value="Exceeds Maximum Network Price"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UsageStatusType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business")
@XmlEnum
public enum UsageStatusType {

    @XmlEnumValue("Written Off")
    WRITTEN_OFF("Written Off"),
    @XmlEnumValue("Awaiting Manual Invoice")
    AWAITING_MANUAL_INVOICE("Awaiting Manual Invoice"),
    @XmlEnumValue("Awaiting Invoice")
    AWAITING_INVOICE("Awaiting Invoice"),
    @XmlEnumValue("Manually Invoiced")
    MANUALLY_INVOICED("Manually Invoiced"),
    @XmlEnumValue("Invoiced")
    INVOICED("Invoiced"),
    @XmlEnumValue("Unallocated to Subscription")
    UNALLOCATED_TO_SUBSCRIPTION("Unallocated to Subscription"),
    @XmlEnumValue("Manually Allocated")
    MANUALLY_ALLOCATED("Manually Allocated"),
    @XmlEnumValue("Exceeds Maximum Network Price")
    EXCEEDS_MAXIMUM_NETWORK_PRICE("Exceeds Maximum Network Price");
    private final String value;

    UsageStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UsageStatusType fromValue(String v) {
        for (UsageStatusType c: UsageStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
