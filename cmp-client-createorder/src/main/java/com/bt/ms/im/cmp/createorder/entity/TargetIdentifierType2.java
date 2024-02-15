
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AccountIdentifier" type="{http://mdsuk.com/ws/dise3g/base}AccountNumberType" minOccurs="0"/>
 *         &lt;element name="SubscriptionIdentifier" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType" minOccurs="0"/>
 *         &lt;element name="AgreementIdentifier" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}AgreementNumberIntType" minOccurs="0"/>
 *         &lt;element name="SubscriptionService" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}SubscriptionServiceIdentifierType" minOccurs="0"/>
 *         &lt;element name="BillableAsset" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BillableAssetIdentifierType" minOccurs="0"/>
 *         &lt;element name="BillableAssetLine" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}SetResourceAttributesBillableAssetLineIdentifierType" minOccurs="0"/>
 *         &lt;element name="AccountService" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}AccountServiceIdentifierType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetIdentifierType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "accountIdentifier",
    "subscriptionIdentifier",
    "agreementIdentifier",
    "subscriptionService",
    "billableAsset",
    "billableAssetLine",
    "accountService"
})
public class TargetIdentifierType2 {

    @XmlElement(name = "AccountIdentifier")
    @XmlSchemaType(name = "integer")
    protected Integer accountIdentifier;
    @XmlElement(name = "SubscriptionIdentifier")
    @XmlSchemaType(name = "integer")
    protected Integer subscriptionIdentifier;
    @XmlElement(name = "AgreementIdentifier")
    protected Integer agreementIdentifier;
    @XmlElement(name = "SubscriptionService")
    protected SubscriptionServiceIdentifierType subscriptionService;
    @XmlElement(name = "BillableAsset")
    protected BillableAssetIdentifierType billableAsset;
    @XmlElement(name = "BillableAssetLine")
    protected SetResourceAttributesBillableAssetLineIdentifierType billableAssetLine;
    @XmlElement(name = "AccountService")
    protected AccountServiceIdentifierType accountService;

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

    /**
     * Gets the value of the subscriptionService property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionServiceIdentifierType }
     *     
     */
    public SubscriptionServiceIdentifierType getSubscriptionService() {
        return subscriptionService;
    }

    /**
     * Sets the value of the subscriptionService property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionServiceIdentifierType }
     *     
     */
    public void setSubscriptionService(SubscriptionServiceIdentifierType value) {
        this.subscriptionService = value;
    }

    /**
     * Gets the value of the billableAsset property.
     * 
     * @return
     *     possible object is
     *     {@link BillableAssetIdentifierType }
     *     
     */
    public BillableAssetIdentifierType getBillableAsset() {
        return billableAsset;
    }

    /**
     * Sets the value of the billableAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillableAssetIdentifierType }
     *     
     */
    public void setBillableAsset(BillableAssetIdentifierType value) {
        this.billableAsset = value;
    }

    /**
     * Gets the value of the billableAssetLine property.
     * 
     * @return
     *     possible object is
     *     {@link SetResourceAttributesBillableAssetLineIdentifierType }
     *     
     */
    public SetResourceAttributesBillableAssetLineIdentifierType getBillableAssetLine() {
        return billableAssetLine;
    }

    /**
     * Sets the value of the billableAssetLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetResourceAttributesBillableAssetLineIdentifierType }
     *     
     */
    public void setBillableAssetLine(SetResourceAttributesBillableAssetLineIdentifierType value) {
        this.billableAssetLine = value;
    }

    /**
     * Gets the value of the accountService property.
     * 
     * @return
     *     possible object is
     *     {@link AccountServiceIdentifierType }
     *     
     */
    public AccountServiceIdentifierType getAccountService() {
        return accountService;
    }

    /**
     * Sets the value of the accountService property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountServiceIdentifierType }
     *     
     */
    public void setAccountService(AccountServiceIdentifierType value) {
        this.accountService = value;
    }

}
