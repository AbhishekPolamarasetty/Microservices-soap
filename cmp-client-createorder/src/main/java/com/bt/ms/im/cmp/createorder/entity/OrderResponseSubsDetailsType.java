
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderResponseSubsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderResponseSubsDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SubscriptionCreationStatus" type="{http://mdsuk.com/ws/dise3g/order/dto/service}SubscriptionCreationStatusesType" minOccurs="0"/>
 *         &lt;element name="SubscriptionCreationMessage" type="{http://mdsuk.com/ws/dise3g/base}MessageType" minOccurs="0"/>
 *         &lt;element name="SubscriptionNumber" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType" minOccurs="0"/>
 *         &lt;element name="MobileNumber" type="{http://mdsuk.com/ws/dise3g/base}PhoneNumberType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderResponseSubsDetailsType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/service", propOrder = {

})
public class OrderResponseSubsDetailsType {

    @XmlElement(name = "SubscriptionCreationStatus")
    @XmlSchemaType(name = "string")
    protected SubscriptionCreationStatusesType subscriptionCreationStatus;
    @XmlElement(name = "SubscriptionCreationMessage")
    protected String subscriptionCreationMessage;
    @XmlElement(name = "SubscriptionNumber")
    @XmlSchemaType(name = "integer")
    protected Integer subscriptionNumber;
    @XmlElement(name = "MobileNumber")
    protected String mobileNumber;

    /**
     * Gets the value of the subscriptionCreationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionCreationStatusesType }
     *     
     */
    public SubscriptionCreationStatusesType getSubscriptionCreationStatus() {
        return subscriptionCreationStatus;
    }

    /**
     * Sets the value of the subscriptionCreationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionCreationStatusesType }
     *     
     */
    public void setSubscriptionCreationStatus(SubscriptionCreationStatusesType value) {
        this.subscriptionCreationStatus = value;
    }

    /**
     * Gets the value of the subscriptionCreationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionCreationMessage() {
        return subscriptionCreationMessage;
    }

    /**
     * Sets the value of the subscriptionCreationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionCreationMessage(String value) {
        this.subscriptionCreationMessage = value;
    }

    /**
     * Gets the value of the subscriptionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubscriptionNumber() {
        return subscriptionNumber;
    }

    /**
     * Sets the value of the subscriptionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubscriptionNumber(Integer value) {
        this.subscriptionNumber = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

}
