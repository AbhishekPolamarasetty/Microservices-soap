
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomerBasketPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerBasketPeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="IntervalId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AvailableAmount" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="FormattedAvailableAmount" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30NotRequiredType" minOccurs="0"/>
 *         &lt;element name="ConsumedAmount" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="FormattedConsumedAmount" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30NotRequiredType" minOccurs="0"/>
 *         &lt;element name="UsageLimit" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="FormattedUsageLimit" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30NotRequiredType" minOccurs="0"/>
 *         &lt;element name="RecurringAllowance" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="FormattedRecurringAllowance" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30NotRequiredType" minOccurs="0"/>
 *         &lt;element name="RolloverAllowance" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="FormattedRolloverAllowance" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30NotRequiredType" minOccurs="0"/>
 *         &lt;element name="ReservedAmount" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="FormattedReservedAmount" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30NotRequiredType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerBasketPeriod", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {

})
public class CustomerBasketPeriod {

    @XmlElement(name = "IntervalId")
    protected BigInteger intervalId;
    @XmlElement(name = "EffectiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "AvailableAmount")
    protected BigDecimal availableAmount;
    @XmlElement(name = "FormattedAvailableAmount")
    protected String formattedAvailableAmount;
    @XmlElement(name = "ConsumedAmount")
    protected BigDecimal consumedAmount;
    @XmlElement(name = "FormattedConsumedAmount")
    protected String formattedConsumedAmount;
    @XmlElement(name = "UsageLimit")
    protected BigDecimal usageLimit;
    @XmlElement(name = "FormattedUsageLimit")
    protected String formattedUsageLimit;
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

    /**
     * Gets the value of the intervalId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntervalId() {
        return intervalId;
    }

    /**
     * Sets the value of the intervalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntervalId(BigInteger value) {
        this.intervalId = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
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
     * Gets the value of the consumedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsumedAmount() {
        return consumedAmount;
    }

    /**
     * Sets the value of the consumedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsumedAmount(BigDecimal value) {
        this.consumedAmount = value;
    }

    /**
     * Gets the value of the formattedConsumedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedConsumedAmount() {
        return formattedConsumedAmount;
    }

    /**
     * Sets the value of the formattedConsumedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedConsumedAmount(String value) {
        this.formattedConsumedAmount = value;
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
     * Gets the value of the formattedUsageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedUsageLimit() {
        return formattedUsageLimit;
    }

    /**
     * Sets the value of the formattedUsageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedUsageLimit(String value) {
        this.formattedUsageLimit = value;
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

}
