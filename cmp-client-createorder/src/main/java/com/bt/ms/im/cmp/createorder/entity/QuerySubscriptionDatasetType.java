
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySubscriptionDatasetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuerySubscriptionDatasetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ATTRIBUTES"/>
 *     &lt;enumeration value="BASIC"/>
 *     &lt;enumeration value="ADDRESS"/>
 *     &lt;enumeration value="BILLINGMEDIA"/>
 *     &lt;enumeration value="BUNDLES"/>
 *     &lt;enumeration value="DISCOUNTS"/>
 *     &lt;enumeration value="CONTRACTANDSALES"/>
 *     &lt;enumeration value="CUSTOMERDETAILS"/>
 *     &lt;enumeration value="DISCOUNTOVERRIDES"/>
 *     &lt;enumeration value="SERIALNUMBERS"/>
 *     &lt;enumeration value="SERVICES"/>
 *     &lt;enumeration value="SUBSCRIPTIONBARS"/>
 *     &lt;enumeration value="USAGEANDCREDITCONTROL"/>
 *     &lt;enumeration value="POSTPAYCAPS"/>
 *     &lt;enumeration value="ACTIVE_AND_PENDING_SERVICES"/>
 *     &lt;enumeration value="FREEZES"/>
 *     &lt;enumeration value="BASKETS"/>
 *     &lt;enumeration value="SIM_PROFILE_INFORMATION"/>
 *     &lt;enumeration value="TERMINATION_FEE"/>
 *     &lt;enumeration value="RECENT_NOTIFICATIONS"/>
 *     &lt;enumeration value="UPGRADEELIGIBILITY"/>
 *     &lt;enumeration value="REWARD_ENTITLEMENTS"/>
 *     &lt;enumeration value="DEFAULT_REWARD_CATEGORY"/>
 *     &lt;enumeration value="FEATURES"/>
 *     &lt;enumeration value="NOTIFICATION_PREFERENCES"/>
 *     &lt;enumeration value="REFRESH"/>
 *     &lt;enumeration value="TOTAL_ALLOWANCES"/>
 *     &lt;enumeration value="PACKAGES"/>
 *     &lt;enumeration value="DEFINITIONS"/>
 *     &lt;enumeration value="PENDING_TARIFF_CHANGE"/>
 *     &lt;enumeration value="CALL_CLASS_OVERRIDES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuerySubscriptionDatasetType")
@XmlEnum
public enum QuerySubscriptionDatasetType {

    ATTRIBUTES,
    BASIC,
    ADDRESS,
    BILLINGMEDIA,
    BUNDLES,
    DISCOUNTS,
    CONTRACTANDSALES,
    CUSTOMERDETAILS,
    DISCOUNTOVERRIDES,
    SERIALNUMBERS,
    SERVICES,
    SUBSCRIPTIONBARS,
    USAGEANDCREDITCONTROL,
    POSTPAYCAPS,
    ACTIVE_AND_PENDING_SERVICES,
    FREEZES,
    BASKETS,
    SIM_PROFILE_INFORMATION,
    TERMINATION_FEE,
    RECENT_NOTIFICATIONS,
    UPGRADEELIGIBILITY,
    REWARD_ENTITLEMENTS,
    DEFAULT_REWARD_CATEGORY,
    FEATURES,
    NOTIFICATION_PREFERENCES,
    REFRESH,
    TOTAL_ALLOWANCES,
    PACKAGES,
    DEFINITIONS,
    PENDING_TARIFF_CHANGE,
    CALL_CLASS_OVERRIDES;

    public String value() {
        return name();
    }

    public static QuerySubscriptionDatasetType fromValue(String v) {
        return valueOf(v);
    }

}
