
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryResourceTargetIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryResourceTargetIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AccountIdentifier" type="{http://mdsuk.com/ws/dise3g/base}AccountNumberType" minOccurs="0"/>
 *         &lt;element name="SubscriptionIdentifier" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType" minOccurs="0"/>
 *         &lt;element name="AgreementIdentifier" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}AgreementNumberIntType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResourceTargetIdentifierType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "accountIdentifier",
    "subscriptionIdentifier",
    "agreementIdentifier"
})
public class QueryResourceTargetIdentifierType {

    @XmlElement(name = "AccountIdentifier")
    @XmlSchemaType(name = "integer")
    protected Integer accountIdentifier;
    @XmlElement(name = "SubscriptionIdentifier")
    @XmlSchemaType(name = "integer")
    protected Integer subscriptionIdentifier;
    @XmlElement(name = "AgreementIdentifier")
    protected Integer agreementIdentifier;

    /**
     * Gets the value of the accountIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountIdentifier() {
        return accountIdentifier;
    }

    /**
     * Sets the value of the accountIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountIdentifier(Integer value) {
        this.accountIdentifier = value;
    }

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
     * Gets the value of the agreementIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAgreementIdentifier() {
        return agreementIdentifier;
    }

    /**
     * Sets the value of the agreementIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAgreementIdentifier(Integer value) {
        this.agreementIdentifier = value;
    }

}
