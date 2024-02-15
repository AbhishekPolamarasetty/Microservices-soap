
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defined with a choice to allow for using NetworkSerialNumber1 or
 * 				a SubscriptionNumber depending on which identifier is passed to the fulfilment system
 * 			
 * 
 * <p>Java class for SubscriptionIdentifierChoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionIdentifierChoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="NetworkSerialNumber1" type="{http://mdsuk.com/ws/dise3g/base}NetworkSerialNumberType" minOccurs="0"/>
 *         &lt;element name="SubscriptionNumber" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionIdentifierChoiceType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/business", propOrder = {
    "networkSerialNumber1",
    "subscriptionNumber"
})
public class SubscriptionIdentifierChoiceType {

    @XmlElement(name = "NetworkSerialNumber1")
    protected String networkSerialNumber1;
    @XmlElement(name = "SubscriptionNumber")
    @XmlSchemaType(name = "integer")
    protected Integer subscriptionNumber;

    /**
     * Gets the value of the networkSerialNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkSerialNumber1() {
        return networkSerialNumber1;
    }

    /**
     * Sets the value of the networkSerialNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkSerialNumber1(String value) {
        this.networkSerialNumber1 = value;
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

}
