
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UnbilledUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnbilledUnitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CallDate" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}CallDateType"/>
 *         &lt;element name="CallTime" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}CallTimeType"/>
 *         &lt;element name="CallStatus" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}CallStatusType"/>
 *         &lt;element name="DialledNumber" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}DialledNumberType"/>
 *         &lt;element name="UnitOfMeasure" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength8NotRequiredType"/>
 *         &lt;element name="UnitsUsed" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}UnitsType"/>
 *         &lt;element name="CallClassification" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}CallClassificationType"/>
 *         &lt;element name="BundleCallStatus" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BundledCallStatusType"/>
 *         &lt;element name="PreBundlePrice" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}PreBundleSPValueType"/>
 *         &lt;element name="BundleValue" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BundleAdjustmentValueType" minOccurs="0"/>
 *         &lt;element name="DiscountValue" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}DiscountType" minOccurs="0"/>
 *         &lt;element name="CallPrice" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}ValueType"/>
 *         &lt;element name="BillingType" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BillingTypeType"/>
 *         &lt;element name="Network" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}NetworkNameType"/>
 *         &lt;element name="CallDuration" type="{http://mdsuk.com/ws/dise3g/base}SevenDigitNumberType"/>
 *         &lt;element name="CallPricingBreakdown" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}CallPricingBreakdownType" minOccurs="0"/>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnbilledUnitType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "callDate",
    "callTime",
    "callStatus",
    "dialledNumber",
    "unitOfMeasure",
    "unitsUsed",
    "callClassification",
    "bundleCallStatus",
    "preBundlePrice",
    "bundleValue",
    "discountValue",
    "callPrice",
    "billingType",
    "network",
    "callDuration",
    "callPricingBreakdown",
    "lastAmendedDate"
})
public class UnbilledUnitType {

    @XmlElement(name = "CallDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar callDate;
    @XmlElement(name = "CallTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar callTime;
    @XmlElement(name = "CallStatus", required = true)
    @XmlSchemaType(name = "string")
    protected CallStatusType callStatus;
    @XmlElement(name = "DialledNumber", required = true)
    protected String dialledNumber;
    @XmlElement(name = "UnitOfMeasure", required = true)
    protected String unitOfMeasure;
    @XmlElement(name = "UnitsUsed")
    @XmlSchemaType(name = "integer")
    protected int unitsUsed;
    @XmlElement(name = "CallClassification", required = true)
    protected String callClassification;
    @XmlElement(name = "BundleCallStatus", required = true)
    @XmlSchemaType(name = "string")
    protected BundledCallStatusType bundleCallStatus;
    @XmlElement(name = "PreBundlePrice", required = true)
    protected BigDecimal preBundlePrice;
    @XmlElement(name = "BundleValue")
    protected BigDecimal bundleValue;
    @XmlElement(name = "DiscountValue")
    protected BigDecimal discountValue;
    @XmlElement(name = "CallPrice", required = true)
    protected BigDecimal callPrice;
    @XmlElement(name = "BillingType", required = true)
    @XmlSchemaType(name = "string")
    protected BillingTypeType billingType;
    @XmlElement(name = "Network", required = true)
    protected String network;
    @XmlElement(name = "CallDuration")
    @XmlSchemaType(name = "integer")
    protected int callDuration;
    @XmlElement(name = "CallPricingBreakdown")
    protected CallPricingBreakdownType callPricingBreakdown;
    @XmlElement(name = "LastAmendedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the callDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallDate() {
        return callDate;
    }

    /**
     * Sets the value of the callDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallDate(XMLGregorianCalendar value) {
        this.callDate = value;
    }

    /**
     * Gets the value of the callTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallTime() {
        return callTime;
    }

    /**
     * Sets the value of the callTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallTime(XMLGregorianCalendar value) {
        this.callTime = value;
    }

    /**
     * Gets the value of the callStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CallStatusType }
     *     
     */
    public CallStatusType getCallStatus() {
        return callStatus;
    }

    /**
     * Sets the value of the callStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallStatusType }
     *     
     */
    public void setCallStatus(CallStatusType value) {
        this.callStatus = value;
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
     * Gets the value of the callClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallClassification() {
        return callClassification;
    }

    /**
     * Sets the value of the callClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallClassification(String value) {
        this.callClassification = value;
    }

    /**
     * Gets the value of the bundleCallStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BundledCallStatusType }
     *     
     */
    public BundledCallStatusType getBundleCallStatus() {
        return bundleCallStatus;
    }

    /**
     * Sets the value of the bundleCallStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundledCallStatusType }
     *     
     */
    public void setBundleCallStatus(BundledCallStatusType value) {
        this.bundleCallStatus = value;
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
     * Gets the value of the callPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCallPrice() {
        return callPrice;
    }

    /**
     * Sets the value of the callPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCallPrice(BigDecimal value) {
        this.callPrice = value;
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
     * Gets the value of the callDuration property.
     * 
     */
    public int getCallDuration() {
        return callDuration;
    }

    /**
     * Sets the value of the callDuration property.
     * 
     */
    public void setCallDuration(int value) {
        this.callDuration = value;
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

}
