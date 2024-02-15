
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionServiceIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionServiceIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SubscriptionIdentifier" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType"/>
 *         &lt;element name="ServiceCode" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ServiceCodeType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionServiceIdentifierType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {

})
public class SubscriptionServiceIdentifierType {

    @XmlElement(name = "SubscriptionIdentifier")
    @XmlSchemaType(name = "integer")
    protected int subscriptionIdentifier;
    @XmlElement(name = "ServiceCode", required = true)
    protected String serviceCode;

    /**
     * Gets the value of the subscriptionIdentifier property.
     * 
     */
    public int getSubscriptionIdentifier() {
        return subscriptionIdentifier;
    }

    /**
     * Sets the value of the subscriptionIdentifier property.
     * 
     */
    public void setSubscriptionIdentifier(int value) {
        this.subscriptionIdentifier = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

}
