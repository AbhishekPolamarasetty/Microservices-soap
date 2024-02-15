
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BasketCode" type="{http://mdsuk.com/ws/dise3g/base}ServiceCodeType"/>
 *         &lt;element name="Consumption" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType"/>
 *         &lt;element name="PreEventBalance" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasketType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "basketCode",
    "consumption",
    "preEventBalance"
})
public class BasketType {

    @XmlElement(name = "BasketCode", required = true)
    protected String basketCode;
    @XmlElement(name = "Consumption", required = true)
    protected BigDecimal consumption;
    @XmlElement(name = "PreEventBalance", required = true)
    protected BigDecimal preEventBalance;

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
     * Gets the value of the consumption property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsumption() {
        return consumption;
    }

    /**
     * Sets the value of the consumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsumption(BigDecimal value) {
        this.consumption = value;
    }

    /**
     * Gets the value of the preEventBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreEventBalance() {
        return preEventBalance;
    }

    /**
     * Sets the value of the preEventBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreEventBalance(BigDecimal value) {
        this.preEventBalance = value;
    }

}
