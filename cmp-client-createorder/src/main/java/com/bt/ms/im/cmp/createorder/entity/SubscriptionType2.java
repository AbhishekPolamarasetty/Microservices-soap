
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SubscriptionNumber" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType"/>
 *         &lt;element name="NetworkSerialNumber" type="{http://mdsuk.com/ws/dise3g/base}NetworkSerialNumberType"/>
 *         &lt;element name="UserName" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30Type" minOccurs="0"/>
 *         &lt;element name="AvailableAmount" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="FormattedAvailableAmount" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30NotRequiredType" minOccurs="0"/>
 *         &lt;element name="BalanceAmount" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="FormattedBalanceAmount" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30NotRequiredType" minOccurs="0"/>
 *         &lt;element name="RTCBalanceResourceID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RTCCreditLimitThresholdID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {

})
public class SubscriptionType2 {

    @XmlElement(name = "SubscriptionNumber")
    @XmlSchemaType(name = "integer")
    protected int subscriptionNumber;
    @XmlElement(name = "NetworkSerialNumber", required = true)
    protected String networkSerialNumber;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "AvailableAmount")
    protected BigDecimal availableAmount;
    @XmlElement(name = "FormattedAvailableAmount")
    protected String formattedAvailableAmount;
    @XmlElement(name = "BalanceAmount")
    protected BigDecimal balanceAmount;
    @XmlElement(name = "FormattedBalanceAmount")
    protected String formattedBalanceAmount;
    @XmlElement(name = "RTCBalanceResourceID")
    protected Long rtcBalanceResourceID;
    @XmlElement(name = "RTCCreditLimitThresholdID")
    protected Long rtcCreditLimitThresholdID;

    /**
     * Gets the value of the subscriptionNumber property.
     * 
     */
    public int getSubscriptionNumber() {
        return subscriptionNumber;
    }

    /**
     * Sets the value of the subscriptionNumber property.
     * 
     */
    public void setSubscriptionNumber(int value) {
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

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
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

}
