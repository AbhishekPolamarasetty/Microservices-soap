
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This structure is returned as part of the Subscription Query response
 *                 when Notification_Preferences dataset is specified
 * 
 * <p>Java class for NotificationPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationPreference" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NotificationPreferenceType" maxOccurs="unbounded"/>
 *         &lt;element name="ExclusionPeriod" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ExclusionPeriodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationPreferencesType", propOrder = {
    "notificationPreference",
    "exclusionPeriod"
})
public class NotificationPreferencesType {

    @XmlElement(name = "NotificationPreference", required = true)
    protected List<NotificationPreferenceType> notificationPreference;
    @XmlElement(name = "ExclusionPeriod")
    protected ExclusionPeriodType exclusionPeriod;

    /**
     * Gets the value of the notificationPreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationPreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationPreferenceType }
     * 
     * 
     */
    public List<NotificationPreferenceType> getNotificationPreference() {
        if (notificationPreference == null) {
            notificationPreference = new ArrayList<NotificationPreferenceType>();
        }
        return this.notificationPreference;
    }

    /**
     * Gets the value of the exclusionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ExclusionPeriodType }
     *     
     */
    public ExclusionPeriodType getExclusionPeriod() {
        return exclusionPeriod;
    }

    /**
     * Sets the value of the exclusionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclusionPeriodType }
     *     
     */
    public void setExclusionPeriod(ExclusionPeriodType value) {
        this.exclusionPeriod = value;
    }

}
