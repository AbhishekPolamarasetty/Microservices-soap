
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TariffType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Company" type="{http://mdsuk.com/ws/dise3g/base}CompanyCodeType" minOccurs="0"/>
 *         &lt;element name="TariffCode" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}TariffCodeType" minOccurs="0"/>
 *         &lt;element name="EventTypeCode" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}EventTypeCodeType" minOccurs="0"/>
 *         &lt;element name="EventCode" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}EventCodeType" minOccurs="0"/>
 *         &lt;element name="NetworkCode" type="{http://mdsuk.com/ws/dise3g/base}NetworkCodeType" minOccurs="0"/>
 *         &lt;element name="CallClassCode" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}CallClassCodeType" minOccurs="0"/>
 *         &lt;element name="NetworkTypeCode" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}NetworkTypeCodeType" minOccurs="0"/>
 *         &lt;element name="TermConditionGroupCode" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}TermConditionGroupCodeType" minOccurs="0"/>
 *         &lt;element name="TCGEffectiveDate" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}TCGEffectiveDateType" minOccurs="0"/>
 *         &lt;element name="BillingMediaCode" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}BillingMediaCodeType" minOccurs="0"/>
 *         &lt;element name="CostCenterCode" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}CostCenterCodeType" minOccurs="0"/>
 *         &lt;element name="DailyUsageLimit" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}DailyUsageLimitType" minOccurs="0"/>
 *         &lt;element name="DefContractTermMnthsNumber" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}DefContractTermMnthsNumberType" minOccurs="0"/>
 *         &lt;element name="LowerUsageLimit" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}LowerUsageLimitType" minOccurs="0"/>
 *         &lt;element name="UpperUsageLimit" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}UpperUsageLimitType" minOccurs="0"/>
 *         &lt;element name="TariffDescription" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}TariffDescriptionType" minOccurs="0"/>
 *         &lt;element name="DefaulttoNetworkPrice" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}DefaulttoNetworkPriceType" minOccurs="0"/>
 *         &lt;element name="UseNetworkPriceasMin" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}UseNetworkPriceasMinType" minOccurs="0"/>
 *         &lt;element name="MinDaysAfterSubsStartNumber" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}MinDaysAfterSubsStartNumberType" minOccurs="0"/>
 *         &lt;element name="MinDaysAfterSubsTerminationNumber" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}MinDaysAfterSubsTerminationNumberType" minOccurs="0"/>
 *         &lt;element name="ApplyFirstPeriodFree" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}ApplyFirstPeriodFreeType" minOccurs="0"/>
 *         &lt;element name="OngoingInvFreqDaysNumber" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}OngoingInvFreqDaysNumberType" minOccurs="0"/>
 *         &lt;element name="OngoingInvFreqMonthsNumber" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}OngoingInvFreqMonthsNumberType" minOccurs="0"/>
 *         &lt;element name="CPPublicHolidayDay" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}CPPublicHolidayDayType" minOccurs="0"/>
 *         &lt;element name="NoticePeriodMonthsNumber" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}NoticePeriodMonthsNumberType" minOccurs="0"/>
 *         &lt;element name="MaxTotalTerminationFee" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}MaxTotalTerminationFeeType" minOccurs="0"/>
 *         &lt;element name="TerminationFreeDaysNumber" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}TerminationFreeDaysNumberType" minOccurs="0"/>
 *         &lt;element name="MinDaysFirstNormalNumber" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}MinDaysFirstNormalNumberType" minOccurs="0"/>
 *         &lt;element name="MinDaysNormalFinalNumber" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}MinDaysNormalFinalNumberType" minOccurs="0"/>
 *         &lt;element name="IncludeFutureServices" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}IncludeFutureServicesType" minOccurs="0"/>
 *         &lt;element name="IncludeFutureDiscounts" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}IncludeFutureDiscountsType" minOccurs="0"/>
 *         &lt;element name="MaximumCallPrice" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}MaximumCallPriceType" minOccurs="0"/>
 *         &lt;element name="ExplanationText1" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}ExplanationText1Type" minOccurs="0"/>
 *         &lt;element name="ExplanationText2" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}ExplanationText2Type" minOccurs="0"/>
 *         &lt;element name="ExplanationText3" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}ExplanationText3Type" minOccurs="0"/>
 *         &lt;element name="ExplanationText4" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}ExplanationText4Type" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffType", namespace = "http://mdsuk.com/ws/dise3g/tariff/dto/business", propOrder = {

})
public class TariffType2 {

    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "TariffCode")
    protected String tariffCode;
    @XmlElement(name = "EventTypeCode")
    protected String eventTypeCode;
    @XmlElement(name = "EventCode")
    protected String eventCode;
    @XmlElement(name = "NetworkCode")
    protected String networkCode;
    @XmlElement(name = "CallClassCode")
    protected String callClassCode;
    @XmlElement(name = "NetworkTypeCode")
    protected String networkTypeCode;
    @XmlElement(name = "TermConditionGroupCode")
    protected String termConditionGroupCode;
    @XmlElement(name = "TCGEffectiveDate")
    protected BigDecimal tcgEffectiveDate;
    @XmlElement(name = "BillingMediaCode")
    protected String billingMediaCode;
    @XmlElement(name = "CostCenterCode")
    protected String costCenterCode;
    @XmlElement(name = "DailyUsageLimit")
    protected BigDecimal dailyUsageLimit;
    @XmlElement(name = "DefContractTermMnthsNumber")
    protected BigDecimal defContractTermMnthsNumber;
    @XmlElement(name = "LowerUsageLimit")
    protected BigDecimal lowerUsageLimit;
    @XmlElement(name = "UpperUsageLimit")
    protected BigDecimal upperUsageLimit;
    @XmlElement(name = "TariffDescription")
    protected String tariffDescription;
    @XmlElement(name = "DefaulttoNetworkPrice")
    protected String defaulttoNetworkPrice;
    @XmlElement(name = "UseNetworkPriceasMin")
    protected String useNetworkPriceasMin;
    @XmlElement(name = "MinDaysAfterSubsStartNumber")
    protected BigDecimal minDaysAfterSubsStartNumber;
    @XmlElement(name = "MinDaysAfterSubsTerminationNumber")
    protected BigDecimal minDaysAfterSubsTerminationNumber;
    @XmlElement(name = "ApplyFirstPeriodFree")
    protected String applyFirstPeriodFree;
    @XmlElement(name = "OngoingInvFreqDaysNumber")
    protected BigDecimal ongoingInvFreqDaysNumber;
    @XmlElement(name = "OngoingInvFreqMonthsNumber")
    protected BigDecimal ongoingInvFreqMonthsNumber;
    @XmlElement(name = "CPPublicHolidayDay")
    protected String cpPublicHolidayDay;
    @XmlElement(name = "NoticePeriodMonthsNumber")
    protected BigDecimal noticePeriodMonthsNumber;
    @XmlElement(name = "MaxTotalTerminationFee")
    protected BigDecimal maxTotalTerminationFee;
    @XmlElement(name = "TerminationFreeDaysNumber")
    protected BigDecimal terminationFreeDaysNumber;
    @XmlElement(name = "MinDaysFirstNormalNumber")
    protected BigDecimal minDaysFirstNormalNumber;
    @XmlElement(name = "MinDaysNormalFinalNumber")
    protected BigDecimal minDaysNormalFinalNumber;
    @XmlElement(name = "IncludeFutureServices")
    protected String includeFutureServices;
    @XmlElement(name = "IncludeFutureDiscounts")
    protected String includeFutureDiscounts;
    @XmlElement(name = "MaximumCallPrice")
    protected BigDecimal maximumCallPrice;
    @XmlElement(name = "ExplanationText1")
    protected String explanationText1;
    @XmlElement(name = "ExplanationText2")
    protected String explanationText2;
    @XmlElement(name = "ExplanationText3")
    protected String explanationText3;
    @XmlElement(name = "ExplanationText4")
    protected String explanationText4;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the tariffCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffCode() {
        return tariffCode;
    }

    /**
     * Sets the value of the tariffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffCode(String value) {
        this.tariffCode = value;
    }

    /**
     * Gets the value of the eventTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTypeCode() {
        return eventTypeCode;
    }

    /**
     * Sets the value of the eventTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTypeCode(String value) {
        this.eventTypeCode = value;
    }

    /**
     * Gets the value of the eventCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventCode() {
        return eventCode;
    }

    /**
     * Sets the value of the eventCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventCode(String value) {
        this.eventCode = value;
    }

    /**
     * Gets the value of the networkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkCode() {
        return networkCode;
    }

    /**
     * Sets the value of the networkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkCode(String value) {
        this.networkCode = value;
    }

    /**
     * Gets the value of the callClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallClassCode() {
        return callClassCode;
    }

    /**
     * Sets the value of the callClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallClassCode(String value) {
        this.callClassCode = value;
    }

    /**
     * Gets the value of the networkTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkTypeCode() {
        return networkTypeCode;
    }

    /**
     * Sets the value of the networkTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkTypeCode(String value) {
        this.networkTypeCode = value;
    }

    /**
     * Gets the value of the termConditionGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermConditionGroupCode() {
        return termConditionGroupCode;
    }

    /**
     * Sets the value of the termConditionGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermConditionGroupCode(String value) {
        this.termConditionGroupCode = value;
    }

    /**
     * Gets the value of the tcgEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTCGEffectiveDate() {
        return tcgEffectiveDate;
    }

    /**
     * Sets the value of the tcgEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTCGEffectiveDate(BigDecimal value) {
        this.tcgEffectiveDate = value;
    }

    /**
     * Gets the value of the billingMediaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingMediaCode() {
        return billingMediaCode;
    }

    /**
     * Sets the value of the billingMediaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingMediaCode(String value) {
        this.billingMediaCode = value;
    }

    /**
     * Gets the value of the costCenterCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenterCode() {
        return costCenterCode;
    }

    /**
     * Sets the value of the costCenterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenterCode(String value) {
        this.costCenterCode = value;
    }

    /**
     * Gets the value of the dailyUsageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDailyUsageLimit() {
        return dailyUsageLimit;
    }

    /**
     * Sets the value of the dailyUsageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDailyUsageLimit(BigDecimal value) {
        this.dailyUsageLimit = value;
    }

    /**
     * Gets the value of the defContractTermMnthsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefContractTermMnthsNumber() {
        return defContractTermMnthsNumber;
    }

    /**
     * Sets the value of the defContractTermMnthsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefContractTermMnthsNumber(BigDecimal value) {
        this.defContractTermMnthsNumber = value;
    }

    /**
     * Gets the value of the lowerUsageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowerUsageLimit() {
        return lowerUsageLimit;
    }

    /**
     * Sets the value of the lowerUsageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowerUsageLimit(BigDecimal value) {
        this.lowerUsageLimit = value;
    }

    /**
     * Gets the value of the upperUsageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpperUsageLimit() {
        return upperUsageLimit;
    }

    /**
     * Sets the value of the upperUsageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpperUsageLimit(BigDecimal value) {
        this.upperUsageLimit = value;
    }

    /**
     * Gets the value of the tariffDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffDescription() {
        return tariffDescription;
    }

    /**
     * Sets the value of the tariffDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffDescription(String value) {
        this.tariffDescription = value;
    }

    /**
     * Gets the value of the defaulttoNetworkPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaulttoNetworkPrice() {
        return defaulttoNetworkPrice;
    }

    /**
     * Sets the value of the defaulttoNetworkPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaulttoNetworkPrice(String value) {
        this.defaulttoNetworkPrice = value;
    }

    /**
     * Gets the value of the useNetworkPriceasMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseNetworkPriceasMin() {
        return useNetworkPriceasMin;
    }

    /**
     * Sets the value of the useNetworkPriceasMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseNetworkPriceasMin(String value) {
        this.useNetworkPriceasMin = value;
    }

    /**
     * Gets the value of the minDaysAfterSubsStartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinDaysAfterSubsStartNumber() {
        return minDaysAfterSubsStartNumber;
    }

    /**
     * Sets the value of the minDaysAfterSubsStartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinDaysAfterSubsStartNumber(BigDecimal value) {
        this.minDaysAfterSubsStartNumber = value;
    }

    /**
     * Gets the value of the minDaysAfterSubsTerminationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinDaysAfterSubsTerminationNumber() {
        return minDaysAfterSubsTerminationNumber;
    }

    /**
     * Sets the value of the minDaysAfterSubsTerminationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinDaysAfterSubsTerminationNumber(BigDecimal value) {
        this.minDaysAfterSubsTerminationNumber = value;
    }

    /**
     * Gets the value of the applyFirstPeriodFree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyFirstPeriodFree() {
        return applyFirstPeriodFree;
    }

    /**
     * Sets the value of the applyFirstPeriodFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyFirstPeriodFree(String value) {
        this.applyFirstPeriodFree = value;
    }

    /**
     * Gets the value of the ongoingInvFreqDaysNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOngoingInvFreqDaysNumber() {
        return ongoingInvFreqDaysNumber;
    }

    /**
     * Sets the value of the ongoingInvFreqDaysNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOngoingInvFreqDaysNumber(BigDecimal value) {
        this.ongoingInvFreqDaysNumber = value;
    }

    /**
     * Gets the value of the ongoingInvFreqMonthsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOngoingInvFreqMonthsNumber() {
        return ongoingInvFreqMonthsNumber;
    }

    /**
     * Sets the value of the ongoingInvFreqMonthsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOngoingInvFreqMonthsNumber(BigDecimal value) {
        this.ongoingInvFreqMonthsNumber = value;
    }

    /**
     * Gets the value of the cpPublicHolidayDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPPublicHolidayDay() {
        return cpPublicHolidayDay;
    }

    /**
     * Sets the value of the cpPublicHolidayDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPPublicHolidayDay(String value) {
        this.cpPublicHolidayDay = value;
    }

    /**
     * Gets the value of the noticePeriodMonthsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNoticePeriodMonthsNumber() {
        return noticePeriodMonthsNumber;
    }

    /**
     * Sets the value of the noticePeriodMonthsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNoticePeriodMonthsNumber(BigDecimal value) {
        this.noticePeriodMonthsNumber = value;
    }

    /**
     * Gets the value of the maxTotalTerminationFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxTotalTerminationFee() {
        return maxTotalTerminationFee;
    }

    /**
     * Sets the value of the maxTotalTerminationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxTotalTerminationFee(BigDecimal value) {
        this.maxTotalTerminationFee = value;
    }

    /**
     * Gets the value of the terminationFreeDaysNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTerminationFreeDaysNumber() {
        return terminationFreeDaysNumber;
    }

    /**
     * Sets the value of the terminationFreeDaysNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTerminationFreeDaysNumber(BigDecimal value) {
        this.terminationFreeDaysNumber = value;
    }

    /**
     * Gets the value of the minDaysFirstNormalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinDaysFirstNormalNumber() {
        return minDaysFirstNormalNumber;
    }

    /**
     * Sets the value of the minDaysFirstNormalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinDaysFirstNormalNumber(BigDecimal value) {
        this.minDaysFirstNormalNumber = value;
    }

    /**
     * Gets the value of the minDaysNormalFinalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinDaysNormalFinalNumber() {
        return minDaysNormalFinalNumber;
    }

    /**
     * Sets the value of the minDaysNormalFinalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinDaysNormalFinalNumber(BigDecimal value) {
        this.minDaysNormalFinalNumber = value;
    }

    /**
     * Gets the value of the includeFutureServices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeFutureServices() {
        return includeFutureServices;
    }

    /**
     * Sets the value of the includeFutureServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeFutureServices(String value) {
        this.includeFutureServices = value;
    }

    /**
     * Gets the value of the includeFutureDiscounts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeFutureDiscounts() {
        return includeFutureDiscounts;
    }

    /**
     * Sets the value of the includeFutureDiscounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeFutureDiscounts(String value) {
        this.includeFutureDiscounts = value;
    }

    /**
     * Gets the value of the maximumCallPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumCallPrice() {
        return maximumCallPrice;
    }

    /**
     * Sets the value of the maximumCallPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumCallPrice(BigDecimal value) {
        this.maximumCallPrice = value;
    }

    /**
     * Gets the value of the explanationText1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanationText1() {
        return explanationText1;
    }

    /**
     * Sets the value of the explanationText1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanationText1(String value) {
        this.explanationText1 = value;
    }

    /**
     * Gets the value of the explanationText2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanationText2() {
        return explanationText2;
    }

    /**
     * Sets the value of the explanationText2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanationText2(String value) {
        this.explanationText2 = value;
    }

    /**
     * Gets the value of the explanationText3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanationText3() {
        return explanationText3;
    }

    /**
     * Sets the value of the explanationText3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanationText3(String value) {
        this.explanationText3 = value;
    }

    /**
     * Gets the value of the explanationText4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanationText4() {
        return explanationText4;
    }

    /**
     * Sets the value of the explanationText4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanationText4(String value) {
        this.explanationText4 = value;
    }

}
