
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateInvoiceConsolidationLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateInvoiceConsolidationLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Subscription"/>
 *     &lt;enumeration value="Account"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Corporate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UpdateInvoiceConsolidationLevelType", namespace = "http://mdsuk.com/ws/dise3g/agreement/dto/business")
@XmlEnum
public enum UpdateInvoiceConsolidationLevelType {

    @XmlEnumValue("Subscription")
    SUBSCRIPTION("Subscription"),
    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Corporate")
    CORPORATE("Corporate");
    private final String value;

    UpdateInvoiceConsolidationLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateInvoiceConsolidationLevelType fromValue(String v) {
        for (UpdateInvoiceConsolidationLevelType c: UpdateInvoiceConsolidationLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
