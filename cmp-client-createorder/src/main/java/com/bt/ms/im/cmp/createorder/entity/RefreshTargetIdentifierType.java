
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefreshTargetIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefreshTargetIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SubscriptionIdentifier" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType"/>
 *         &lt;element name="NetworkSerialNumber" type="{http://mdsuk.com/ws/dise3g/base}NetworkSerialNumberType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefreshTargetIdentifierType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {
    "subscriptionIdentifier",
    "networkSerialNumber"
})
public class RefreshTargetIdentifierType {

    @XmlElement(name = "SubscriptionIdentifier")
    @XmlSchemaType(name = "integer")
    protected Integer subscriptionIdentifier;
    @XmlElement(name = "NetworkSerialNumber")
    protected String networkSerialNumber;

    /**
     * Gets the value of the subscriptionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubscriptionIdentifier() {
        return subscriptionIdentifier;
    }

    /**
     * Sets the value of the subscriptionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubscriptionIdentifier(Integer value) {
        this.subscriptionIdentifier = value;
    }

    /**
     * Gets the value of the networkSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkSerialNumber() {
        return networkSerialNumber;
    }

    /**
     * Sets the value of the networkSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkSerialNumber(String value) {
        this.networkSerialNumber = value;
    }

}
