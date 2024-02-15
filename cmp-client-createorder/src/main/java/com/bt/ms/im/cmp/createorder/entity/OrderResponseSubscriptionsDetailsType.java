
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderResponseSubscriptionsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderResponseSubscriptionsDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionDetails" type="{http://mdsuk.com/ws/dise3g/order/dto/service}OrderResponseSubsDetailsType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderResponseSubscriptionsDetailsType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/service", propOrder = {
    "subscriptionDetails"
})
public class OrderResponseSubscriptionsDetailsType {

    @XmlElement(name = "SubscriptionDetails", required = true)
    protected List<OrderResponseSubsDetailsType> subscriptionDetails;

    /**
     * Gets the value of the subscriptionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderResponseSubsDetailsType }
     * 
     * 
     */
    public List<OrderResponseSubsDetailsType> getSubscriptionDetails() {
        if (subscriptionDetails == null) {
            subscriptionDetails = new ArrayList<OrderResponseSubsDetailsType>();
        }
        return this.subscriptionDetails;
    }

}
