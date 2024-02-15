
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrentSubscriptionBundlesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentSubscriptionBundlesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentSubscriptionBundle" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}CurrentSubscriptionBundleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentSubscriptionBundlesType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "currentSubscriptionBundle"
})
public class CurrentSubscriptionBundlesType {

    @XmlElement(name = "CurrentSubscriptionBundle")
    protected List<CurrentSubscriptionBundleType> currentSubscriptionBundle;

    /**
     * Gets the value of the currentSubscriptionBundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentSubscriptionBundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentSubscriptionBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrentSubscriptionBundleType }
     * 
     * 
     */
    public List<CurrentSubscriptionBundleType> getCurrentSubscriptionBundle() {
        if (currentSubscriptionBundle == null) {
            currentSubscriptionBundle = new ArrayList<CurrentSubscriptionBundleType>();
        }
        return this.currentSubscriptionBundle;
    }

}
