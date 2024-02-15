
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cash"/>
 *     &lt;enumeration value="CashOnDelivery"/>
 *     &lt;enumeration value="Cheque"/>
 *     &lt;enumeration value="PaymentCard"/>
 *     &lt;enumeration value="OnAccount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/business")
@XmlEnum
public enum PaymentType {

    @XmlEnumValue("Cash")
    CASH("Cash"),
    @XmlEnumValue("CashOnDelivery")
    CASH_ON_DELIVERY("CashOnDelivery"),
    @XmlEnumValue("Cheque")
    CHEQUE("Cheque"),
    @XmlEnumValue("PaymentCard")
    PAYMENT_CARD("PaymentCard"),
    @XmlEnumValue("OnAccount")
    ON_ACCOUNT("OnAccount");
    private final String value;

    PaymentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentType fromValue(String v) {
        for (PaymentType c: PaymentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
