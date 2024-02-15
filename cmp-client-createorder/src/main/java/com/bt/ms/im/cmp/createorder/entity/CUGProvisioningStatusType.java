
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CUGProvisioningStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CUGProvisioningStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BLANK"/>
 *     &lt;enumeration value="Awaiting Provisioning"/>
 *     &lt;enumeration value="Provisioning Requested"/>
 *     &lt;enumeration value="Confirmed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CUGProvisioningStatusType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business")
@XmlEnum
public enum CUGProvisioningStatusType {

    BLANK("BLANK"),
    @XmlEnumValue("Awaiting Provisioning")
    AWAITING_PROVISIONING("Awaiting Provisioning"),
    @XmlEnumValue("Provisioning Requested")
    PROVISIONING_REQUESTED("Provisioning Requested"),
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed");
    private final String value;

    CUGProvisioningStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CUGProvisioningStatusType fromValue(String v) {
        for (CUGProvisioningStatusType c: CUGProvisioningStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
