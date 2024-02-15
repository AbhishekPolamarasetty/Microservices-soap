
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryBundleDatasetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryBundleDatasetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CURRENTUSAGE"/>
 *     &lt;enumeration value="LINKEDSUBSCRIPTIONS"/>
 *     &lt;enumeration value="UNLINKEDSUBSCRIPTIONS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryBundleDatasetType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business")
@XmlEnum
public enum QueryBundleDatasetType {

    CURRENTUSAGE,
    LINKEDSUBSCRIPTIONS,
    UNLINKEDSUBSCRIPTIONS;

    public String value() {
        return name();
    }

    public static QueryBundleDatasetType fromValue(String v) {
        return valueOf(v);
    }

}
