
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationPreferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationPreferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="NotificationPreferenceCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NotificationTypeDescription" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength35Type"/>
 *         &lt;element name="OptedIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationPreferenceType", propOrder = {

})
public class NotificationPreferenceType {

    @XmlElement(name = "NotificationPreferenceCode", required = true)
    protected String notificationPreferenceCode;
    @XmlElement(name = "NotificationTypeDescription", required = true)
    protected String notificationTypeDescription;
    @XmlElement(name = "OptedIn")
    protected boolean optedIn;

    /**
     * Gets the value of the notificationPreferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationPreferenceCode() {
        return notificationPreferenceCode;
    }

    /**
     * Sets the value of the notificationPreferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationPreferenceCode(String value) {
        this.notificationPreferenceCode = value;
    }

    /**
     * Gets the value of the notificationTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationTypeDescription() {
        return notificationTypeDescription;
    }

    /**
     * Sets the value of the notificationTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationTypeDescription(String value) {
        this.notificationTypeDescription = value;
    }

    /**
     * Gets the value of the optedIn property.
     * 
     */
    public boolean isOptedIn() {
        return optedIn;
    }

    /**
     * Sets the value of the optedIn property.
     * 
     */
    public void setOptedIn(boolean value) {
        this.optedIn = value;
    }

}
