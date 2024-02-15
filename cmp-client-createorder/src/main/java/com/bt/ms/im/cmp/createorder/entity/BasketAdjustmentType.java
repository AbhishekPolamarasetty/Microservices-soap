
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasketAdjustmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasketAdjustmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="RTCBalanceResourceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AdjustmentAmount" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasketAdjustmentType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {

})
public class BasketAdjustmentType {

    @XmlElement(name = "RTCBalanceResourceID")
    protected long rtcBalanceResourceID;
    @XmlElement(name = "AdjustmentAmount", required = true)
    protected BigDecimal adjustmentAmount;

    /**
     * Gets the value of the rtcBalanceResourceID property.
     * 
     */
    public long getRTCBalanceResourceID() {
        return rtcBalanceResourceID;
    }

    /**
     * Sets the value of the rtcBalanceResourceID property.
     * 
     */
    public void setRTCBalanceResourceID(long value) {
        this.rtcBalanceResourceID = value;
    }

    /**
     * Gets the value of the adjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustmentAmount() {
        return adjustmentAmount;
    }

    /**
     * Sets the value of the adjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustmentAmount(BigDecimal value) {
        this.adjustmentAmount = value;
    }

}
