
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceChargeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceChargeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WholesaleServiceCharge" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}ValueType"/>
 *         &lt;element name="PreBundleServiceCharge" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}ValueType"/>
 *         &lt;element name="ServiceCharge" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}ValueType"/>
 *         &lt;element name="ServiceChargeDiscountValue" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}ValueType"/>
 *         &lt;element name="ServiceChargeCallClassification" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}CallClassificationType" minOccurs="0"/>
 *         &lt;element name="PreBundleServiceDuration" type="{http://mdsuk.com/ws/dise3g/base}SevenDigitNumberType"/>
 *         &lt;element name="ServiceDuration" type="{http://mdsuk.com/ws/dise3g/base}SevenDigitNumberType"/>
 *         &lt;element name="PreBundleServiceBillableDuration" type="{http://mdsuk.com/ws/dise3g/base}SevenDigitNumberType"/>
 *         &lt;element name="ServiceBillableDuration" type="{http://mdsuk.com/ws/dise3g/base}SevenDigitNumberType"/>
 *         &lt;element name="PreBundleServiceUnits" type="{http://mdsuk.com/ws/dise3g/base}NineDigitNumberType"/>
 *         &lt;element name="ServiceUnits" type="{http://mdsuk.com/ws/dise3g/base}NineDigitNumberType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceChargeDetailsType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "wholesaleServiceCharge",
    "preBundleServiceCharge",
    "serviceCharge",
    "serviceChargeDiscountValue",
    "serviceChargeCallClassification",
    "preBundleServiceDuration",
    "serviceDuration",
    "preBundleServiceBillableDuration",
    "serviceBillableDuration",
    "preBundleServiceUnits",
    "serviceUnits"
})
public class ServiceChargeDetailsType {

    @XmlElement(name = "WholesaleServiceCharge", required = true)
    protected BigDecimal wholesaleServiceCharge;
    @XmlElement(name = "PreBundleServiceCharge", required = true)
    protected BigDecimal preBundleServiceCharge;
    @XmlElement(name = "ServiceCharge", required = true)
    protected BigDecimal serviceCharge;
    @XmlElement(name = "ServiceChargeDiscountValue", required = true)
    protected BigDecimal serviceChargeDiscountValue;
    @XmlElement(name = "ServiceChargeCallClassification")
    protected String serviceChargeCallClassification;
    @XmlElement(name = "PreBundleServiceDuration")
    @XmlSchemaType(name = "integer")
    protected int preBundleServiceDuration;
    @XmlElement(name = "ServiceDuration")
    @XmlSchemaType(name = "integer")
    protected int serviceDuration;
    @XmlElement(name = "PreBundleServiceBillableDuration")
    @XmlSchemaType(name = "integer")
    protected int preBundleServiceBillableDuration;
    @XmlElement(name = "ServiceBillableDuration")
    @XmlSchemaType(name = "integer")
    protected int serviceBillableDuration;
    @XmlElement(name = "PreBundleServiceUnits")
    @XmlSchemaType(name = "integer")
    protected int preBundleServiceUnits;
    @XmlElement(name = "ServiceUnits")
    @XmlSchemaType(name = "integer")
    protected int serviceUnits;

    /**
     * Gets the value of the wholesaleServiceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWholesaleServiceCharge() {
        return wholesaleServiceCharge;
    }

    /**
     * Sets the value of the wholesaleServiceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWholesaleServiceCharge(BigDecimal value) {
        this.wholesaleServiceCharge = value;
    }

    /**
     * Gets the value of the preBundleServiceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreBundleServiceCharge() {
        return preBundleServiceCharge;
    }

    /**
     * Sets the value of the preBundleServiceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreBundleServiceCharge(BigDecimal value) {
        this.preBundleServiceCharge = value;
    }

    /**
     * Gets the value of the serviceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    /**
     * Sets the value of the serviceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceCharge(BigDecimal value) {
        this.serviceCharge = value;
    }

    /**
     * Gets the value of the serviceChargeDiscountValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceChargeDiscountValue() {
        return serviceChargeDiscountValue;
    }

    /**
     * Sets the value of the serviceChargeDiscountValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceChargeDiscountValue(BigDecimal value) {
        this.serviceChargeDiscountValue = value;
    }

    /**
     * Gets the value of the serviceChargeCallClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceChargeCallClassification() {
        return serviceChargeCallClassification;
    }

    /**
     * Sets the value of the serviceChargeCallClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceChargeCallClassification(String value) {
        this.serviceChargeCallClassification = value;
    }

    /**
     * Gets the value of the preBundleServiceDuration property.
     * 
     */
    public int getPreBundleServiceDuration() {
        return preBundleServiceDuration;
    }

    /**
     * Sets the value of the preBundleServiceDuration property.
     * 
     */
    public void setPreBundleServiceDuration(int value) {
        this.preBundleServiceDuration = value;
    }

    /**
     * Gets the value of the serviceDuration property.
     * 
     */
    public int getServiceDuration() {
        return serviceDuration;
    }

    /**
     * Sets the value of the serviceDuration property.
     * 
     */
    public void setServiceDuration(int value) {
        this.serviceDuration = value;
    }

    /**
     * Gets the value of the preBundleServiceBillableDuration property.
     * 
     */
    public int getPreBundleServiceBillableDuration() {
        return preBundleServiceBillableDuration;
    }

    /**
     * Sets the value of the preBundleServiceBillableDuration property.
     * 
     */
    public void setPreBundleServiceBillableDuration(int value) {
        this.preBundleServiceBillableDuration = value;
    }

    /**
     * Gets the value of the serviceBillableDuration property.
     * 
     */
    public int getServiceBillableDuration() {
        return serviceBillableDuration;
    }

    /**
     * Sets the value of the serviceBillableDuration property.
     * 
     */
    public void setServiceBillableDuration(int value) {
        this.serviceBillableDuration = value;
    }

    /**
     * Gets the value of the preBundleServiceUnits property.
     * 
     */
    public int getPreBundleServiceUnits() {
        return preBundleServiceUnits;
    }

    /**
     * Sets the value of the preBundleServiceUnits property.
     * 
     */
    public void setPreBundleServiceUnits(int value) {
        this.preBundleServiceUnits = value;
    }

    /**
     * Gets the value of the serviceUnits property.
     * 
     */
    public int getServiceUnits() {
        return serviceUnits;
    }

    /**
     * Sets the value of the serviceUnits property.
     * 
     */
    public void setServiceUnits(int value) {
        this.serviceUnits = value;
    }

}
