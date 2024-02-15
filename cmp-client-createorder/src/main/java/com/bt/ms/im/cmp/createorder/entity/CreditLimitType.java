
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditLimitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditLimitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="BasketCode" type="{http://mdsuk.com/ws/dise3g/base}ServiceCodeType"/>
 *         &lt;element name="RTCBalanceResourceID" type="{http://mdsuk.com/ws/dise3g/base}FiveDigitNumberType"/>
 *         &lt;element name="RTCCreditLimitThresholdID" type="{http://mdsuk.com/ws/dise3g/base}ElevenDigitNumberType"/>
 *         &lt;element name="CreditLimitValue" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2Type"/>
 *         &lt;element name="Unlimited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditLimitType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {

})
public class CreditLimitType {

    @XmlElement(name = "BasketCode", required = true)
    protected String basketCode;
    @XmlElement(name = "RTCBalanceResourceID")
    @XmlSchemaType(name = "integer")
    protected int rtcBalanceResourceID;
    @XmlElement(name = "RTCCreditLimitThresholdID")
    @XmlSchemaType(name = "integer")
    protected long rtcCreditLimitThresholdID;
    @XmlElement(name = "CreditLimitValue", required = true)
    protected BigDecimal creditLimitValue;
    @XmlElement(name = "Unlimited")
    protected Boolean unlimited;

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
     * Gets the value of the rtcBalanceResourceID property.
     * 
     */
    public int getRTCBalanceResourceID() {
        return rtcBalanceResourceID;
    }

    /**
     * Sets the value of the rtcBalanceResourceID property.
     * 
     */
    public void setRTCBalanceResourceID(int value) {
        this.rtcBalanceResourceID = value;
    }

    /**
     * Gets the value of the rtcCreditLimitThresholdID property.
     * 
     */
    public long getRTCCreditLimitThresholdID() {
        return rtcCreditLimitThresholdID;
    }

    /**
     * Sets the value of the rtcCreditLimitThresholdID property.
     * 
     */
    public void setRTCCreditLimitThresholdID(long value) {
        this.rtcCreditLimitThresholdID = value;
    }

    /**
     * Gets the value of the creditLimitValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditLimitValue() {
        return creditLimitValue;
    }

    /**
     * Sets the value of the creditLimitValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditLimitValue(BigDecimal value) {
        this.creditLimitValue = value;
    }

    /**
     * Gets the value of the unlimited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnlimited() {
        return unlimited;
    }

    /**
     * Sets the value of the unlimited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnlimited(Boolean value) {
        this.unlimited = value;
    }

}
