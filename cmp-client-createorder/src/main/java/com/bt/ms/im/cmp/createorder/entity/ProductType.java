
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mdsuk.com/ws/dise3g/order/dto/business}OrderProductDataType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="Subscriptions" type="{http://mdsuk.com/ws/dise3g/order/dto/service}SubscriptionsConnectionType"/>
 *         &lt;element name="SubscriptionIdentifiers" type="{http://mdsuk.com/ws/dise3g/order/dto/service}SubscriptionNumbersType"/>
 *         &lt;element name="Upgrades" type="{http://mdsuk.com/ws/dise3g/order/dto/service}SubscriptionUpgradesType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/service", propOrder = {
    "subscriptions",
    "subscriptionIdentifiers",
    "upgrades"
})
public class ProductType
    extends OrderProductDataType
{

    @XmlElement(name = "Subscriptions")
    protected SubscriptionsConnectionType subscriptions;
    @XmlElement(name = "SubscriptionIdentifiers")
    protected SubscriptionNumbersType subscriptionIdentifiers;
    @XmlElement(name = "Upgrades")
    protected SubscriptionUpgradesType upgrades;

    /**
     * Gets the value of the subscriptions property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionsConnectionType }
     *     
     */
    public SubscriptionsConnectionType getSubscriptions() {
        return subscriptions;
    }

    /**
     * Sets the value of the subscriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionsConnectionType }
     *     
     */
    public void setSubscriptions(SubscriptionsConnectionType value) {
        this.subscriptions = value;
    }

    /**
     * Gets the value of the subscriptionIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionNumbersType }
     *     
     */
    public SubscriptionNumbersType getSubscriptionIdentifiers() {
        return subscriptionIdentifiers;
    }

    /**
     * Sets the value of the subscriptionIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionNumbersType }
     *     
     */
    public void setSubscriptionIdentifiers(SubscriptionNumbersType value) {
        this.subscriptionIdentifiers = value;
    }

    /**
     * Gets the value of the upgrades property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionUpgradesType }
     *     
     */
    public SubscriptionUpgradesType getUpgrades() {
        return upgrades;
    }

    /**
     * Sets the value of the upgrades property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionUpgradesType }
     *     
     */
    public void setUpgrades(SubscriptionUpgradesType value) {
        this.upgrades = value;
    }

}
