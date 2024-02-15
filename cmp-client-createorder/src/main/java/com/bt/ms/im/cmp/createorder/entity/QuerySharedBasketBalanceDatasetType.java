
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySharedBasketBalanceDatasetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuerySharedBasketBalanceDatasetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFINITION"/>
 *     &lt;enumeration value="SUBSCRIPTION"/>
 *     &lt;enumeration value="SHARED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuerySharedBasketBalanceDatasetType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business")
@XmlEnum
public enum QuerySharedBasketBalanceDatasetType {

    DEFINITION,
    SUBSCRIPTION,
    SHARED;

    public String value() {
        return name();
    }

    public static QuerySharedBasketBalanceDatasetType fromValue(String v) {
        return valueOf(v);
    }

}
