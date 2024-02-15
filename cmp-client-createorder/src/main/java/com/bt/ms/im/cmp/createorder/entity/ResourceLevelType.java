
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCOUNT"/>
 *     &lt;enumeration value="AGREEMENT"/>
 *     &lt;enumeration value="SUBSCRIPTION"/>
 *     &lt;enumeration value="SUBSCRIPTION_SERVICE"/>
 *     &lt;enumeration value="ACCOUNT_SERVICE"/>
 *     &lt;enumeration value="BILLABLE_ASSET"/>
 *     &lt;enumeration value="BILLABLE_ASSET_LINE"/>
 *     &lt;enumeration value="HARDWARE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourceLevelType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business")
@XmlEnum
public enum ResourceLevelType {

    ACCOUNT,
    AGREEMENT,
    SUBSCRIPTION,
    SUBSCRIPTION_SERVICE,
    ACCOUNT_SERVICE,
    BILLABLE_ASSET,
    BILLABLE_ASSET_LINE,
    HARDWARE;

    public String value() {
        return name();
    }

    public static ResourceLevelType fromValue(String v) {
        return valueOf(v);
    }

}
