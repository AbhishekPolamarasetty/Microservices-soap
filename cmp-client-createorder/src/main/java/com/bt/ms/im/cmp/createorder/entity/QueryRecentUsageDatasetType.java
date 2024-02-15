
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryRecentUsageDatasetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryRecentUsageDatasetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PREPAY"/>
 *     &lt;enumeration value="POSTPAID"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="SUMMARY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryRecentUsageDatasetType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business")
@XmlEnum
public enum QueryRecentUsageDatasetType {

    PREPAY,
    POSTPAID,
    ALL,
    SUMMARY;

    public String value() {
        return name();
    }

    public static QueryRecentUsageDatasetType fromValue(String v) {
        return valueOf(v);
    }

}
