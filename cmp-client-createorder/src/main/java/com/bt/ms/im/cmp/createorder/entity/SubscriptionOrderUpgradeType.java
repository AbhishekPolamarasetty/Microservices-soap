
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionOrderUpgradeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionOrderUpgradeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionToUpgrade" type="{http://mdsuk.com/ws/dise3g/order/dto/business}SubscriptionSelectionDataType"/>
 *         &lt;element name="UpgradeType" type="{http://mdsuk.com/ws/dise3g/order/dto/business}UpgradeTypeType"/>
 *         &lt;element name="SubscriptionOrderTariffChange" type="{http://mdsuk.com/ws/dise3g/order/dto/business}SubscriptionOrderTariffChangeType" minOccurs="0"/>
 *         &lt;element name="SubscriptionOrderNumberChange" type="{http://mdsuk.com/ws/dise3g/order/dto/business}SubscriptionOrderNumberChangeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionOrderUpgradeType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/business", propOrder = {
    "subscriptionToUpgrade",
    "upgradeType",
    "subscriptionOrderTariffChange",
    "subscriptionOrderNumberChange"
})
public class SubscriptionOrderUpgradeType {

    @XmlElement(name = "SubscriptionToUpgrade", required = true)
    protected SubscriptionSelectionDataType subscriptionToUpgrade;
    @XmlElement(name = "UpgradeType", required = true)
    @XmlSchemaType(name = "string")
    protected UpgradeTypeType upgradeType;
    @XmlElement(name = "SubscriptionOrderTariffChange")
    protected SubscriptionOrderTariffChangeType subscriptionOrderTariffChange;
    @XmlElement(name = "SubscriptionOrderNumberChange")
    protected SubscriptionOrderNumberChangeType subscriptionOrderNumberChange;

    /**
     * Gets the value of the subscriptionToUpgrade property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionSelectionDataType }
     *     
     */
    public SubscriptionSelectionDataType getSubscriptionToUpgrade() {
        return subscriptionToUpgrade;
    }

    /**
     * Sets the value of the subscriptionToUpgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionSelectionDataType }
     *     
     */
    public void setSubscriptionToUpgrade(SubscriptionSelectionDataType value) {
        this.subscriptionToUpgrade = value;
    }

    /**
     * Gets the value of the upgradeType property.
     * 
     * @return
     *     possible object is
     *     {@link UpgradeTypeType }
     *     
     */
    public UpgradeTypeType getUpgradeType() {
        return upgradeType;
    }

    /**
     * Sets the value of the upgradeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpgradeTypeType }
     *     
     */
    public void setUpgradeType(UpgradeTypeType value) {
        this.upgradeType = value;
    }

    /**
     * Gets the value of the subscriptionOrderTariffChange property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionOrderTariffChangeType }
     *     
     */
    public SubscriptionOrderTariffChangeType getSubscriptionOrderTariffChange() {
        return subscriptionOrderTariffChange;
    }

    /**
     * Sets the value of the subscriptionOrderTariffChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionOrderTariffChangeType }
     *     
     */
    public void setSubscriptionOrderTariffChange(SubscriptionOrderTariffChangeType value) {
        this.subscriptionOrderTariffChange = value;
    }

    /**
     * Gets the value of the subscriptionOrderNumberChange property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionOrderNumberChangeType }
     *     
     */
    public SubscriptionOrderNumberChangeType getSubscriptionOrderNumberChange() {
        return subscriptionOrderNumberChange;
    }

    /**
     * Sets the value of the subscriptionOrderNumberChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionOrderNumberChangeType }
     *     
     */
    public void setSubscriptionOrderNumberChange(SubscriptionOrderNumberChangeType value) {
        this.subscriptionOrderNumberChange = value;
    }

}
