
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BundleLinkedSubscriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BundleLinkedSubscriptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LinkedSubscription" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BundleLinkedSubscriptionType" maxOccurs="unbounded"/>
 *         &lt;element name="QueryLimitExceeded" type="{http://mdsuk.com/ws/dise3g/base}QueryLimitExceededType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BundleLinkedSubscriptionsType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "linkedSubscription",
    "queryLimitExceeded"
})
public class BundleLinkedSubscriptionsType {

    @XmlElement(name = "LinkedSubscription", required = true)
    protected List<BundleLinkedSubscriptionType> linkedSubscription;
    @XmlElement(name = "QueryLimitExceeded")
    protected boolean queryLimitExceeded;

    /**
     * Gets the value of the linkedSubscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedSubscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BundleLinkedSubscriptionType }
     * 
     * 
     */
    public List<BundleLinkedSubscriptionType> getLinkedSubscription() {
        if (linkedSubscription == null) {
            linkedSubscription = new ArrayList<BundleLinkedSubscriptionType>();
        }
        return this.linkedSubscription;
    }

    /**
     * Gets the value of the queryLimitExceeded property.
     * 
     */
    public boolean isQueryLimitExceeded() {
        return queryLimitExceeded;
    }

    /**
     * Sets the value of the queryLimitExceeded property.
     * 
     */
    public void setQueryLimitExceeded(boolean value) {
        this.queryLimitExceeded = value;
    }

}
