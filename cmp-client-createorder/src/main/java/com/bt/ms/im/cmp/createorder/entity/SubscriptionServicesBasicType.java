
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionServicesBasicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionServicesBasicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionService" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}SubscriptionServiceBasicType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionServicesBasicType", propOrder = {
    "subscriptionService"
})
public class SubscriptionServicesBasicType {

    @XmlElement(name = "SubscriptionService", required = true)
    protected List<SubscriptionServiceBasicType> subscriptionService;

    /**
     * Gets the value of the subscriptionService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionServiceBasicType }
     * 
     * 
     */
    public List<SubscriptionServiceBasicType> getSubscriptionService() {
        if (subscriptionService == null) {
            subscriptionService = new ArrayList<SubscriptionServiceBasicType>();
        }
        return this.subscriptionService;
    }

}
