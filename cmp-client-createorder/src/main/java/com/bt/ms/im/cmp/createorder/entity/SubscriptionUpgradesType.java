
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionUpgradesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionUpgradesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Upgrade" type="{http://mdsuk.com/ws/dise3g/order/dto/business}SubscriptionOrderUpgradeType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionUpgradesType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/service", propOrder = {
    "upgrade"
})
public class SubscriptionUpgradesType {

    @XmlElement(name = "Upgrade", required = true)
    protected List<SubscriptionOrderUpgradeType> upgrade;

    /**
     * Gets the value of the upgrade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the upgrade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpgrade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionOrderUpgradeType }
     * 
     * 
     */
    public List<SubscriptionOrderUpgradeType> getUpgrade() {
        if (upgrade == null) {
            upgrade = new ArrayList<SubscriptionOrderUpgradeType>();
        }
        return this.upgrade;
    }

}
