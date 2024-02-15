
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryAccountBondStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryAccountBondStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Awaiting Approval"/>
 *     &lt;enumeration value="Awaiting Batch Posting"/>
 *     &lt;enumeration value="Awaiting Confirmation"/>
 *     &lt;enumeration value="Awaiting Posting"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Opened Posted"/>
 *     &lt;enumeration value="Refund on Confirmation"/>
 *     &lt;enumeration value="Refunded"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryAccountBondStatusType", namespace = "http://mdsuk.com/ws/dise3g/account/dto/business")
@XmlEnum
public enum QueryAccountBondStatusType {

    @XmlEnumValue("Awaiting Approval")
    AWAITING_APPROVAL("Awaiting Approval"),
    @XmlEnumValue("Awaiting Batch Posting")
    AWAITING_BATCH_POSTING("Awaiting Batch Posting"),
    @XmlEnumValue("Awaiting Confirmation")
    AWAITING_CONFIRMATION("Awaiting Confirmation"),
    @XmlEnumValue("Awaiting Posting")
    AWAITING_POSTING("Awaiting Posting"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Opened Posted")
    OPENED_POSTED("Opened Posted"),
    @XmlEnumValue("Refund on Confirmation")
    REFUND_ON_CONFIRMATION("Refund on Confirmation"),
    @XmlEnumValue("Refunded")
    REFUNDED("Refunded");
    private final String value;

    QueryAccountBondStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueryAccountBondStatusType fromValue(String v) {
        for (QueryAccountBondStatusType c: QueryAccountBondStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
