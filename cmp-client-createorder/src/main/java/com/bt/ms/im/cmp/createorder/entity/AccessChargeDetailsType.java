
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessChargeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessChargeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WholesaleAccessCharge" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}ValueType"/>
 *         &lt;element name="PreBundleAccessCharge" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}ValueType"/>
 *         &lt;element name="AccessCharge" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}ValueType"/>
 *         &lt;element name="AccessChargeDiscountValue" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}ValueType"/>
 *         &lt;element name="AccessChargeCallClassification" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}CallClassificationType" minOccurs="0"/>
 *         &lt;element name="PreBundleAccessDuration" type="{http://mdsuk.com/ws/dise3g/base}SevenDigitNumberType"/>
 *         &lt;element name="AccessDuration" type="{http://mdsuk.com/ws/dise3g/base}SevenDigitNumberType"/>
 *         &lt;element name="PreBundleAccessBillableDuration" type="{http://mdsuk.com/ws/dise3g/base}SevenDigitNumberType"/>
 *         &lt;element name="AccessBillableDuration" type="{http://mdsuk.com/ws/dise3g/base}SevenDigitNumberType"/>
 *         &lt;element name="PreBundleAccessUnits" type="{http://mdsuk.com/ws/dise3g/base}NineDigitNumberType"/>
 *         &lt;element name="AccessUnits" type="{http://mdsuk.com/ws/dise3g/base}NineDigitNumberType"/>
 *         &lt;element name="BundleAppliedOn" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BundleAppliedOnType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessChargeDetailsType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "wholesaleAccessCharge",
    "preBundleAccessCharge",
    "accessCharge",
    "accessChargeDiscountValue",
    "accessChargeCallClassification",
    "preBundleAccessDuration",
    "accessDuration",
    "preBundleAccessBillableDuration",
    "accessBillableDuration",
    "preBundleAccessUnits",
    "accessUnits",
    "bundleAppliedOn"
})
public class AccessChargeDetailsType {

    @XmlElement(name = "WholesaleAccessCharge", required = true)
    protected BigDecimal wholesaleAccessCharge;
    @XmlElement(name = "PreBundleAccessCharge", required = true)
    protected BigDecimal preBundleAccessCharge;
    @XmlElement(name = "AccessCharge", required = true)
    protected BigDecimal accessCharge;
    @XmlElement(name = "AccessChargeDiscountValue", required = true)
    protected BigDecimal accessChargeDiscountValue;
    @XmlElement(name = "AccessChargeCallClassification")
    protected String accessChargeCallClassification;
    @XmlElement(name = "PreBundleAccessDuration")
    @XmlSchemaType(name = "integer")
    protected int preBundleAccessDuration;
    @XmlElement(name = "AccessDuration")
    @XmlSchemaType(name = "integer")
    protected int accessDuration;
    @XmlElement(name = "PreBundleAccessBillableDuration")
    @XmlSchemaType(name = "integer")
    protected int preBundleAccessBillableDuration;
    @XmlElement(name = "AccessBillableDuration")
    @XmlSchemaType(name = "integer")
    protected int accessBillableDuration;
    @XmlElement(name = "PreBundleAccessUnits")
    @XmlSchemaType(name = "integer")
    protected int preBundleAccessUnits;
    @XmlElement(name = "AccessUnits")
    @XmlSchemaType(name = "integer")
    protected int accessUnits;
    @XmlElement(name = "BundleAppliedOn", required = true)
    @XmlSchemaType(name = "string")
    protected BundleAppliedOnType bundleAppliedOn;

    /**
     * Gets the value of the wholesaleAccessCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWholesaleAccessCharge() {
        return wholesaleAccessCharge;
    }

    /**
     * Sets the value of the wholesaleAccessCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWholesaleAccessCharge(BigDecimal value) {
        this.wholesaleAccessCharge = value;
    }

    /**
     * Gets the value of the preBundleAccessCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreBundleAccessCharge() {
        return preBundleAccessCharge;
    }

    /**
     * Sets the value of the preBundleAccessCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreBundleAccessCharge(BigDecimal value) {
        this.preBundleAccessCharge = value;
    }

    /**
     * Gets the value of the accessCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccessCharge() {
        return accessCharge;
    }

    /**
     * Sets the value of the accessCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccessCharge(BigDecimal value) {
        this.accessCharge = value;
    }

    /**
     * Gets the value of the accessChargeDiscountValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccessChargeDiscountValue() {
        return accessChargeDiscountValue;
    }

    /**
     * Sets the value of the accessChargeDiscountValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccessChargeDiscountValue(BigDecimal value) {
        this.accessChargeDiscountValue = value;
    }

    /**
     * Gets the value of the accessChargeCallClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessChargeCallClassification() {
        return accessChargeCallClassification;
    }

    /**
     * Sets the value of the accessChargeCallClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessChargeCallClassification(String value) {
        this.accessChargeCallClassification = value;
    }

    /**
     * Gets the value of the preBundleAccessDuration property.
     * 
     */
    public int getPreBundleAccessDuration() {
        return preBundleAccessDuration;
    }

    /**
     * Sets the value of the preBundleAccessDuration property.
     * 
     */
    public void setPreBundleAccessDuration(int value) {
        this.preBundleAccessDuration = value;
    }

    /**
     * Gets the value of the accessDuration property.
     * 
     */
    public int getAccessDuration() {
        return accessDuration;
    }

    /**
     * Sets the value of the accessDuration property.
     * 
     */
    public void setAccessDuration(int value) {
        this.accessDuration = value;
    }

    /**
     * Gets the value of the preBundleAccessBillableDuration property.
     * 
     */
    public int getPreBundleAccessBillableDuration() {
        return preBundleAccessBillableDuration;
    }

    /**
     * Sets the value of the preBundleAccessBillableDuration property.
     * 
     */
    public void setPreBundleAccessBillableDuration(int value) {
        this.preBundleAccessBillableDuration = value;
    }

    /**
     * Gets the value of the accessBillableDuration property.
     * 
     */
    public int getAccessBillableDuration() {
        return accessBillableDuration;
    }

    /**
     * Sets the value of the accessBillableDuration property.
     * 
     */
    public void setAccessBillableDuration(int value) {
        this.accessBillableDuration = value;
    }

    /**
     * Gets the value of the preBundleAccessUnits property.
     * 
     */
    public int getPreBundleAccessUnits() {
        return preBundleAccessUnits;
    }

    /**
     * Sets the value of the preBundleAccessUnits property.
     * 
     */
    public void setPreBundleAccessUnits(int value) {
        this.preBundleAccessUnits = value;
    }

    /**
     * Gets the value of the accessUnits property.
     * 
     */
    public int getAccessUnits() {
        return accessUnits;
    }

    /**
     * Sets the value of the accessUnits property.
     * 
     */
    public void setAccessUnits(int value) {
        this.accessUnits = value;
    }

    /**
     * Gets the value of the bundleAppliedOn property.
     * 
     * @return
     *     possible object is
     *     {@link BundleAppliedOnType }
     *     
     */
    public BundleAppliedOnType getBundleAppliedOn() {
        return bundleAppliedOn;
    }

    /**
     * Sets the value of the bundleAppliedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleAppliedOnType }
     *     
     */
    public void setBundleAppliedOn(BundleAppliedOnType value) {
        this.bundleAppliedOn = value;
    }

}
