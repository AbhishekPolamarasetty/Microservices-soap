
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionBasketAdjustmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionBasketAdjustmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionNumber" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType"/>
 *         &lt;element name="BasketAdjustments" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}BasketAdjustmentsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionBasketAdjustmentType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {
    "subscriptionNumber",
    "basketAdjustments"
})
public class SubscriptionBasketAdjustmentType {

    @XmlElement(name = "SubscriptionNumber")
    @XmlSchemaType(name = "integer")
    protected int subscriptionNumber;
    @XmlElement(name = "BasketAdjustments", required = true)
    protected BasketAdjustmentsType basketAdjustments;

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
     * Gets the value of the basketAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link BasketAdjustmentsType }
     *     
     */
    public BasketAdjustmentsType getBasketAdjustments() {
        return basketAdjustments;
    }

    /**
     * Sets the value of the basketAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasketAdjustmentsType }
     *     
     */
    public void setBasketAdjustments(BasketAdjustmentsType value) {
        this.basketAdjustments = value;
    }

}
