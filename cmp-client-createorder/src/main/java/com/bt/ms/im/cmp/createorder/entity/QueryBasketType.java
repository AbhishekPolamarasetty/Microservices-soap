
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for QueryBasketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryBasketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="BasketCode" type="{http://mdsuk.com/ws/dise3g/base}ServiceCodeType"/>
 *         &lt;element name="BasketDescription" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30NotRequiredType" minOccurs="0"/>
 *         &lt;element name="BasketDefinitionCode" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength8Type"/>
 *         &lt;element name="BasketDefinitionDescription" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30NotRequiredType" minOccurs="0"/>
 *         &lt;element name="AvailableAmount" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="FormattedAvailableAmount" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30NotRequiredType" minOccurs="0"/>
 *         &lt;element name="BalanceAmount" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="FormattedBalanceAmount" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30NotRequiredType" minOccurs="0"/>
 *         &lt;element name="RTCUnitOfMeasure" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30NotRequiredType" minOccurs="0"/>
 *         &lt;element name="LastGrantAmount" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="RecurringAllowance" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="FormattedRecurringAllowance" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30NotRequiredType" minOccurs="0"/>
 *         &lt;element name="RolloverAllowance" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="FormattedRolloverAllowance" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30NotRequiredType" minOccurs="0"/>
 *         &lt;element name="ReservedAmount" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="FormattedReservedAmount" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30NotRequiredType" minOccurs="0"/>
 *         &lt;element name="BasketEffective" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="BasketExpiry" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UsageLimit" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="DefaultCreditLimitMinimum" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="DefaultCreditLimitMaximum" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="BillingOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsVirtual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPrepaid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPeriodic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShared" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SharedLevel" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30NotRequiredType" minOccurs="0"/>
 *         &lt;element name="IsBillCycleAligned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCreditLimitUpdatable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RTCBalanceResourceID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RTCCreditLimitThresholdID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HeaderOrDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HeaderService" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30NotRequiredType" minOccurs="0"/>
 *         &lt;element name="CustomerBasketPeriods" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}CustomerBasketsPeriod" minOccurs="0"/>
 *         &lt;element name="BasketDefinitionAttributes" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}BasketDefinitionsAttribute" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryBasketType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {

})
public class QueryBasketType {

    @XmlElement(name = "BasketCode", required = true)
    protected String basketCode;
    @XmlElement(name = "BasketDescription")
    protected String basketDescription;
    @XmlElement(name = "BasketDefinitionCode", required = true)
    protected String basketDefinitionCode;
    @XmlElement(name = "BasketDefinitionDescription")
    protected String basketDefinitionDescription;
    @XmlElement(name = "AvailableAmount")
    protected BigDecimal availableAmount;
    @XmlElement(name = "FormattedAvailableAmount")
    protected String formattedAvailableAmount;
    @XmlElement(name = "BalanceAmount")
    protected BigDecimal balanceAmount;
    @XmlElement(name = "FormattedBalanceAmount")
    protected String formattedBalanceAmount;
    @XmlElement(name = "RTCUnitOfMeasure")
    protected String rtcUnitOfMeasure;
    @XmlElement(name = "LastGrantAmount")
    protected BigDecimal lastGrantAmount;
    @XmlElement(name = "RecurringAllowance")
    protected BigDecimal recurringAllowance;
    @XmlElement(name = "FormattedRecurringAllowance")
    protected String formattedRecurringAllowance;
    @XmlElement(name = "RolloverAllowance")
    protected BigDecimal rolloverAllowance;
    @XmlElement(name = "FormattedRolloverAllowance")
    protected String formattedRolloverAllowance;
    @XmlElement(name = "ReservedAmount")
    protected BigDecimal reservedAmount;
    @XmlElement(name = "FormattedReservedAmount")
    protected String formattedReservedAmount;
    @XmlElement(name = "BasketEffective", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar basketEffective;
    @XmlElement(name = "BasketExpiry")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar basketExpiry;
    @XmlElement(name = "UsageLimit")
    protected BigDecimal usageLimit;
    @XmlElement(name = "DefaultCreditLimitMinimum")
    protected BigDecimal defaultCreditLimitMinimum;
    @XmlElement(name = "DefaultCreditLimitMaximum")
    protected BigDecimal defaultCreditLimitMaximum;
    @XmlElement(name = "BillingOption")
    protected String billingOption;
    @XmlElement(name = "IsVirtual")
    protected Boolean isVirtual;
    @XmlElement(name = "IsPrepaid")
    protected Boolean isPrepaid;
    @XmlElement(name = "IsPeriodic")
    protected Boolean isPeriodic;
    @XmlElement(name = "IsShared")
    protected Boolean isShared;
    @XmlElement(name = "SharedLevel")
    protected String sharedLevel;
    @XmlElement(name = "IsBillCycleAligned")
    protected Boolean isBillCycleAligned;
    @XmlElement(name = "IsCreditLimitUpdatable")
    protected Boolean isCreditLimitUpdatable;
    @XmlElement(name = "RTCBalanceResourceID")
    protected Long rtcBalanceResourceID;
    @XmlElement(name = "RTCCreditLimitThresholdID")
    protected Long rtcCreditLimitThresholdID;
    @XmlElement(name = "HeaderOrDetail")
    protected String headerOrDetail;
    @XmlElement(name = "HeaderService")
    protected String headerService;
    @XmlElement(name = "CustomerBasketPeriods")
    protected CustomerBasketsPeriod customerBasketPeriods;
    @XmlElement(name = "BasketDefinitionAttributes")
    protected BasketDefinitionsAttribute basketDefinitionAttributes;

    /**
     * Gets the value of the basketCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasketCode() {
        return basketCode;
    }

    /**
     * Sets the value of the basketCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasketCode(String value) {
        this.basketCode = value;
    }

    /**
     * Gets the value of the basketDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasketDescription() {
        return basketDescription;
    }

    /**
     * Sets the value of the basketDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasketDescription(String value) {
        this.basketDescription = value;
    }

    /**
     * Gets the value of the basketDefinitionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasketDefinitionCode() {
        return basketDefinitionCode;
    }

    /**
     * Sets the value of the basketDefinitionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasketDefinitionCode(String value) {
        this.basketDefinitionCode = value;
    }

    /**
     * Gets the value of the basketDefinitionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasketDefinitionDescription() {
        return basketDefinitionDescription;
    }

    /**
     * Sets the value of the basketDefinitionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasketDefinitionDescription(String value) {
        this.basketDefinitionDescription = value;
    }

    /**
     * Gets the value of the availableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailableAmount() {
        return availableAmount;
    }

    /**
     * Sets the value of the availableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailableAmount(BigDecimal value) {
        this.availableAmount = value;
    }

    /**
     * Gets the value of the formattedAvailableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedAvailableAmount() {
        return formattedAvailableAmount;
    }

    /**
     * Sets the value of the formattedAvailableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedAvailableAmount(String value) {
        this.formattedAvailableAmount = value;
    }

    /**
     * Gets the value of the balanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceAmount() {
        return balanceAmount;
    }

    /**
     * Sets the value of the balanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceAmount(BigDecimal value) {
        this.balanceAmount = value;
    }

    /**
     * Gets the value of the formattedBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedBalanceAmount() {
        return formattedBalanceAmount;
    }

    /**
     * Sets the value of the formattedBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedBalanceAmount(String value) {
        this.formattedBalanceAmount = value;
    }

    /**
     * Gets the value of the rtcUnitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTCUnitOfMeasure() {
        return rtcUnitOfMeasure;
    }

    /**
     * Sets the value of the rtcUnitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTCUnitOfMeasure(String value) {
        this.rtcUnitOfMeasure = value;
    }

    /**
     * Gets the value of the lastGrantAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastGrantAmount() {
        return lastGrantAmount;
    }

    /**
     * Sets the value of the lastGrantAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastGrantAmount(BigDecimal value) {
        this.lastGrantAmount = value;
    }

    /**
     * Gets the value of the recurringAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecurringAllowance() {
        return recurringAllowance;
    }

    /**
     * Sets the value of the recurringAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecurringAllowance(BigDecimal value) {
        this.recurringAllowance = value;
    }

    /**
     * Gets the value of the formattedRecurringAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedRecurringAllowance() {
        return formattedRecurringAllowance;
    }

    /**
     * Sets the value of the formattedRecurringAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedRecurringAllowance(String value) {
        this.formattedRecurringAllowance = value;
    }

    /**
     * Gets the value of the rolloverAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRolloverAllowance() {
        return rolloverAllowance;
    }

    /**
     * Sets the value of the rolloverAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRolloverAllowance(BigDecimal value) {
        this.rolloverAllowance = value;
    }

    /**
     * Gets the value of the formattedRolloverAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedRolloverAllowance() {
        return formattedRolloverAllowance;
    }

    /**
     * Sets the value of the formattedRolloverAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedRolloverAllowance(String value) {
        this.formattedRolloverAllowance = value;
    }

    /**
     * Gets the value of the reservedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReservedAmount() {
        return reservedAmount;
    }

    /**
     * Sets the value of the reservedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReservedAmount(BigDecimal value) {
        this.reservedAmount = value;
    }

    /**
     * Gets the value of the formattedReservedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedReservedAmount() {
        return formattedReservedAmount;
    }

    /**
     * Sets the value of the formattedReservedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedReservedAmount(String value) {
        this.formattedReservedAmount = value;
    }

    /**
     * Gets the value of the basketEffective property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBasketEffective() {
        return basketEffective;
    }

    /**
     * Sets the value of the basketEffective property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBasketEffective(XMLGregorianCalendar value) {
        this.basketEffective = value;
    }

    /**
     * Gets the value of the basketExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBasketExpiry() {
        return basketExpiry;
    }

    /**
     * Sets the value of the basketExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBasketExpiry(XMLGregorianCalendar value) {
        this.basketExpiry = value;
    }

    /**
     * Gets the value of the usageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsageLimit() {
        return usageLimit;
    }

    /**
     * Sets the value of the usageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsageLimit(BigDecimal value) {
        this.usageLimit = value;
    }

    /**
     * Gets the value of the defaultCreditLimitMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultCreditLimitMinimum() {
        return defaultCreditLimitMinimum;
    }

    /**
     * Sets the value of the defaultCreditLimitMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultCreditLimitMinimum(BigDecimal value) {
        this.defaultCreditLimitMinimum = value;
    }

    /**
     * Gets the value of the defaultCreditLimitMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultCreditLimitMaximum() {
        return defaultCreditLimitMaximum;
    }

    /**
     * Sets the value of the defaultCreditLimitMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultCreditLimitMaximum(BigDecimal value) {
        this.defaultCreditLimitMaximum = value;
    }

    /**
     * Gets the value of the billingOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingOption() {
        return billingOption;
    }

    /**
     * Sets the value of the billingOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingOption(String value) {
        this.billingOption = value;
    }

    /**
     * Gets the value of the isVirtual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVirtual() {
        return isVirtual;
    }

    /**
     * Sets the value of the isVirtual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVirtual(Boolean value) {
        this.isVirtual = value;
    }

    /**
     * Gets the value of the isPrepaid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrepaid() {
        return isPrepaid;
    }

    /**
     * Sets the value of the isPrepaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrepaid(Boolean value) {
        this.isPrepaid = value;
    }

    /**
     * Gets the value of the isPeriodic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPeriodic() {
        return isPeriodic;
    }

    /**
     * Sets the value of the isPeriodic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPeriodic(Boolean value) {
        this.isPeriodic = value;
    }

    /**
     * Gets the value of the isShared property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShared() {
        return isShared;
    }

    /**
     * Sets the value of the isShared property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShared(Boolean value) {
        this.isShared = value;
    }

    /**
     * Gets the value of the sharedLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedLevel() {
        return sharedLevel;
    }

    /**
     * Sets the value of the sharedLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedLevel(String value) {
        this.sharedLevel = value;
    }

    /**
     * Gets the value of the isBillCycleAligned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBillCycleAligned() {
        return isBillCycleAligned;
    }

    /**
     * Sets the value of the isBillCycleAligned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBillCycleAligned(Boolean value) {
        this.isBillCycleAligned = value;
    }

    /**
     * Gets the value of the isCreditLimitUpdatable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCreditLimitUpdatable() {
        return isCreditLimitUpdatable;
    }

    /**
     * Sets the value of the isCreditLimitUpdatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCreditLimitUpdatable(Boolean value) {
        this.isCreditLimitUpdatable = value;
    }

    /**
     * Gets the value of the rtcBalanceResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRTCBalanceResourceID() {
        return rtcBalanceResourceID;
    }

    /**
     * Sets the value of the rtcBalanceResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRTCBalanceResourceID(Long value) {
        this.rtcBalanceResourceID = value;
    }

    /**
     * Gets the value of the rtcCreditLimitThresholdID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRTCCreditLimitThresholdID() {
        return rtcCreditLimitThresholdID;
    }

    /**
     * Sets the value of the rtcCreditLimitThresholdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRTCCreditLimitThresholdID(Long value) {
        this.rtcCreditLimitThresholdID = value;
    }

    /**
     * Gets the value of the headerOrDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderOrDetail() {
        return headerOrDetail;
    }

    /**
     * Sets the value of the headerOrDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderOrDetail(String value) {
        this.headerOrDetail = value;
    }

    /**
     * Gets the value of the headerService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderService() {
        return headerService;
    }

    /**
     * Sets the value of the headerService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderService(String value) {
        this.headerService = value;
    }

    /**
     * Gets the value of the customerBasketPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBasketsPeriod }
     *     
     */
    public CustomerBasketsPeriod getCustomerBasketPeriods() {
        return customerBasketPeriods;
    }

    /**
     * Sets the value of the customerBasketPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBasketsPeriod }
     *     
     */
    public void setCustomerBasketPeriods(CustomerBasketsPeriod value) {
        this.customerBasketPeriods = value;
    }

    /**
     * Gets the value of the basketDefinitionAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link BasketDefinitionsAttribute }
     *     
     */
    public BasketDefinitionsAttribute getBasketDefinitionAttributes() {
        return basketDefinitionAttributes;
    }

    /**
     * Sets the value of the basketDefinitionAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasketDefinitionsAttribute }
     *     
     */
    public void setBasketDefinitionAttributes(BasketDefinitionsAttribute value) {
        this.basketDefinitionAttributes = value;
    }

}
