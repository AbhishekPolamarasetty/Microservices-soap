
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryAgreementCostCentresDatasetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryAgreementCostCentresDatasetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BASIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryAgreementCostCentresDatasetType", namespace = "http://mdsuk.com/ws/dise3g/agreement/dto/business")
@XmlEnum
public enum QueryAgreementCostCentresDatasetType {

    BASIC;

    public String value() {
        return name();
    }

    public static QueryAgreementCostCentresDatasetType fromValue(String v) {
        return valueOf(v);
    }

}
