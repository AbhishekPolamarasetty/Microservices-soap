
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentOutcomeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentOutcomeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SuccessfulPayment" type="{http://mdsuk.com/ws/dise3g/recordpayment/dto/business}SuccessfulPaymentType"/>
 *         &lt;element name="FailedPayment" type="{http://mdsuk.com/ws/dise3g/recordpayment/dto/business}FailedPaymentType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentOutcomeType", namespace = "http://mdsuk.com/ws/dise3g/recordpayment/dto/business", propOrder = {
    "successfulPayment",
    "failedPayment"
})
public class PaymentOutcomeType {

    @XmlElement(name = "SuccessfulPayment")
    protected SuccessfulPaymentType successfulPayment;
    @XmlElement(name = "FailedPayment")
    protected FailedPaymentType failedPayment;

    /**
     * Gets the value of the successfulPayment property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessfulPaymentType }
     *     
     */
    public SuccessfulPaymentType getSuccessfulPayment() {
        return successfulPayment;
    }

    /**
     * Sets the value of the successfulPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessfulPaymentType }
     *     
     */
    public void setSuccessfulPayment(SuccessfulPaymentType value) {
        this.successfulPayment = value;
    }

    /**
     * Gets the value of the failedPayment property.
     * 
     * @return
     *     possible object is
     *     {@link FailedPaymentType }
     *     
     */
    public FailedPaymentType getFailedPayment() {
        return failedPayment;
    }

    /**
     * Sets the value of the failedPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailedPaymentType }
     *     
     */
    public void setFailedPayment(FailedPaymentType value) {
        this.failedPayment = value;
    }

}
