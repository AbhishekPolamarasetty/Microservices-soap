
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySubscriptionBundlesDatasetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuerySubscriptionBundlesDatasetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CURRENTBUNDLES"/>
 *     &lt;enumeration value="DEFINITIONS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuerySubscriptionBundlesDatasetType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business")
@XmlEnum
public enum QuerySubscriptionBundlesDatasetType {

    CURRENTBUNDLES,
    DEFINITIONS;

    public String value() {
        return name();
    }

    public static QuerySubscriptionBundlesDatasetType fromValue(String v) {
        return valueOf(v);
    }

}
