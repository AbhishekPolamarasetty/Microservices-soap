
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PostPayUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostPayUnitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UsageDateTime" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}UsageDateTimeType"/>
 *         &lt;element name="UsageStatus" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}UsageStatusType"/>
 *         &lt;element name="DialledNumber" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}DialledNumberType"/>
 *         &lt;element name="UnitOfMeasure" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength8NotRequiredType"/>
 *         &lt;element name="UnitsUsed" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}UnitsType"/>
 *         &lt;element name="UsageClassification" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}UsageClassificationType"/>
 *         &lt;element name="BundleUsageStatus" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BundledUsageStatusType"/>
 *         &lt;element name="PreBundlePrice" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}PreBundleSPValueType"/>
 *         &lt;element name="BundleValue" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BundleAdjustmentValueType" minOccurs="0"/>
 *         &lt;element name="DiscountValue" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}DiscountType" minOccurs="0"/>
 *         &lt;element name="UsagePrice" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}ValueType"/>
 *         &lt;element name="BillingType" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BillingTypeType"/>
 *         &lt;element name="Network" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}NetworkNameType"/>
 *         &lt;element name="UsageDuration" type="{http://mdsuk.com/ws/dise3g/base}SevenDigitNumberType"/>
 *         &lt;element name="CallPricingBreakdown" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}CallPricingBreakdownType" minOccurs="0"/>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType" minOccurs="0"/>
 *         &lt;element name="Baskets" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BasketsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostPayUnitType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "usageDateTime",
    "usageStatus",
    "dialledNumber",
    "unitOfMeasure",
    "unitsUsed",
    "usageClassification",
    "bundleUsageStatus",
    "preBundlePrice",
    "bundleValue",
    "discountValue",
    "usagePrice",
    "billingType",
    "network",
    "usageDuration",
    "callPricingBreakdown",
    "lastAmendedDate",
    "baskets"
})
public class PostPayUnitType {

    @XmlElement(name = "UsageDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar usageDateTime;
    @XmlElement(name = "UsageStatus", required = true)
    @XmlSchemaType(name = "string")
    protected UsageStatusType usageStatus;
    @XmlElement(name = "DialledNumber", required = true)
    protected String dialledNumber;
    @XmlElement(name = "UnitOfMeasure", required = true)
    protected String unitOfMeasure;
    @XmlElement(name = "UnitsUsed")
    @XmlSchemaType(name = "integer")
    protected int unitsUsed;
    @XmlElement(name = "UsageClassification", required = true)
    protected String usageClassification;
    @XmlElement(name = "BundleUsageStatus", required = true)
    @XmlSchemaType(name = "string")
    protected BundledUsageStatusType bundleUsageStatus;
    @XmlElement(name = "PreBundlePrice", required = true)
    protected BigDecimal preBundlePrice;
    @XmlElement(name = "BundleValue")
    protected BigDecimal bundleValue;
    @XmlElement(name = "DiscountValue")
    protected BigDecimal discountValue;
    @XmlElement(name = "UsagePrice", required = true)
    protected BigDecimal usagePrice;
    @XmlElement(name = "BillingType", required = true)
    @XmlSchemaType(name = "string")
    protected BillingTypeType billingType;
    @XmlElement(name = "Network", required = true)
    protected String network;
    @XmlElement(name = "UsageDuration")
    @XmlSchemaType(name = "integer")
    protected int usageDuration;
    @XmlElement(name = "CallPricingBreakdown")
    protected CallPricingBreakdownType callPricingBreakdown;
    @XmlElement(name = "LastAmendedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;
    @XmlElement(name = "Baskets")
    protected BasketsType baskets;

    /**
     * Gets the value of the usageDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUsageDateTime() {
        return usageDateTime;
    }

    /**
     * Sets the value of the usageDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUsageDateTime(XMLGregorianCalendar value) {
        this.usageDateTime = value;
    }

    /**
     * Gets the value of the usageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link UsageStatusType }
     *     
     */
    public UsageStatusType getUsageStatus() {
        return usageStatus;
    }

    /**
     * Sets the value of the usageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageStatusType }
     *     
     */
    public void setUsageStatus(UsageStatusType value) {
        this.usageStatus = value;
    }

    /**
     * Gets the value of the dialledNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialledNumber() {
        return dialledNumber;
    }

    /**
     * Sets the value of the dialledNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialledNumber(String value) {
        this.dialledNumber = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the unitsUsed property.
     * 
     */
    public int getUnitsUsed() {
        return unitsUsed;
    }

    /**
     * Sets the value of the unitsUsed property.
     * 
     */
    public void setUnitsUsed(int value) {
        this.unitsUsed = value;
    }

    /**
     * Gets the value of the usageClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageClassification() {
        return usageClassification;
    }

    /**
     * Sets the value of the usageClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageClassification(String value) {
        this.usageClassification = value;
    }

    /**
     * Gets the value of the bundleUsageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BundledUsageStatusType }
     *     
     */
    public BundledUsageStatusType getBundleUsageStatus() {
        return bundleUsageStatus;
    }

    /**
     * Sets the value of the bundleUsageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundledUsageStatusType }
     *     
     */
    public void setBundleUsageStatus(BundledUsageStatusType value) {
        this.bundleUsageStatus = value;
    }

    /**
     * Gets the value of the preBundlePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreBundlePrice() {
        return preBundlePrice;
    }

    /**
     * Sets the value of the preBundlePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreBundlePrice(BigDecimal value) {
        this.preBundlePrice = value;
    }

    /**
     * Gets the value of the bundleValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBundleValue() {
        return bundleValue;
    }

    /**
     * Sets the value of the bundleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBundleValue(BigDecimal value) {
        this.bundleValue = value;
    }

    /**
     * Gets the value of the discountValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountValue() {
        return discountValue;
    }

    /**
     * Sets the value of the discountValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountValue(BigDecimal value) {
        this.discountValue = value;
    }

    /**
     * Gets the value of the usagePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsagePrice() {
        return usagePrice;
    }

    /**
     * Sets the value of the usagePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsagePrice(BigDecimal value) {
        this.usagePrice = value;
    }

    /**
     * Gets the value of the billingType property.
     * 
     * @return
     *     possible object is
     *     {@link BillingTypeType }
     *     
     */
    public BillingTypeType getBillingType() {
        return billingType;
    }

    /**
     * Sets the value of the billingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingTypeType }
     *     
     */
    public void setBillingType(BillingTypeType value) {
        this.billingType = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetwork(String value) {
        this.network = value;
    }

    /**
     * Gets the value of the usageDuration property.
     * 
     */
    public int getUsageDuration() {
        return usageDuration;
    }

    /**
     * Sets the value of the usageDuration property.
     * 
     */
    public void setUsageDuration(int value) {
        this.usageDuration = value;
    }

    /**
     * Gets the value of the callPricingBreakdown property.
     * 
     * @return
     *     possible object is
     *     {@link CallPricingBreakdownType }
     *     
     */
    public CallPricingBreakdownType getCallPricingBreakdown() {
        return callPricingBreakdown;
    }

    /**
     * Sets the value of the callPricingBreakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallPricingBreakdownType }
     *     
     */
    public void setCallPricingBreakdown(CallPricingBreakdownType value) {
        this.callPricingBreakdown = value;
    }

    /**
     * Gets the value of the lastAmendedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAmendedDate() {
        return lastAmendedDate;
    }

    /**
     * Sets the value of the lastAmendedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAmendedDate(XMLGregorianCalendar value) {
        this.lastAmendedDate = value;
    }

    /**
     * Gets the value of the baskets property.
     * 
     * @return
     *     possible object is
     *     {@link BasketsType }
     *     
     */
    public BasketsType getBaskets() {
        return baskets;
    }

    /**
     * Sets the value of the baskets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasketsType }
     *     
     */
    public void setBaskets(BasketsType value) {
        this.baskets = value;
    }

}
