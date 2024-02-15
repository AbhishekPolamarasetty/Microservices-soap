
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisteredCardTargetIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisteredCardTargetIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AccountNumber" type="{http://mdsuk.com/ws/dise3g/base}AccountNumberType"/>
 *         &lt;element name="SubscriptionNumber" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType"/>
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
@XmlType(name = "RegisteredCardTargetIdentifierType", namespace = "http://mdsuk.com/ws/dise3g/account/dto/business", propOrder = {
    "accountNumber",
    "subscriptionNumber",
    "networkSerialNumber"
})
public class RegisteredCardTargetIdentifierType {

    @XmlElement(name = "AccountNumber")
    @XmlSchemaType(name = "integer")
    protected Integer accountNumber;
    @XmlElement(name = "SubscriptionNumber")
    @XmlSchemaType(name = "integer")
    protected Integer subscriptionNumber;
    @XmlElement(name = "NetworkSerialNumber")
    protected String networkSerialNumber;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountNumber(Integer value) {
        this.accountNumber = value;
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
