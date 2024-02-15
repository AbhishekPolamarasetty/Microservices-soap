
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryAgreementDatasetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryAgreementDatasetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BASIC"/>
 *     &lt;enumeration value="ADDRESS"/>
 *     &lt;enumeration value="BUNDLES"/>
 *     &lt;enumeration value="CONTRACTANDSALES"/>
 *     &lt;enumeration value="INVOICECONTROL"/>
 *     &lt;enumeration value="SERVICES"/>
 *     &lt;enumeration value="DISCOUNTS"/>
 *     &lt;enumeration value="BASKETS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryAgreementDatasetType", namespace = "http://mdsuk.com/ws/dise3g/agreement/dto/business")
@XmlEnum
public enum QueryAgreementDatasetType {

    BASIC,
    ADDRESS,
    BUNDLES,
    CONTRACTANDSALES,
    INVOICECONTROL,
    SERVICES,
    DISCOUNTS,
    BASKETS;

    public String value() {
        return name();
    }

    public static QueryAgreementDatasetType fromValue(String v) {
        return valueOf(v);
    }

}
