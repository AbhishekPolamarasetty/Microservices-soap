
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Data structure used to add a pre-registered card token with CMP for one-off payments.
 * 
 * <p>Java class for AddRegisteredCardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRegisteredCardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="PaymentType" type="{http://mdsuk.com/ws/dise3g/base}PaymentTypeType"/>
 *         &lt;element name="PaymentCardToken" type="{http://mdsuk.com/ws/dise3g/payment/dto/business}PaymentCardTokenType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRegisteredCardType", namespace = "http://mdsuk.com/ws/dise3g/account/dto/business", propOrder = {

})
public class AddRegisteredCardType {

    @XmlElement(name = "PaymentType", required = true)
    protected String paymentType;
    @XmlElement(name = "PaymentCardToken", required = true)
    protected PaymentCardTokenType paymentCardToken;

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the paymentCardToken property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardTokenType }
     *     
     */
    public PaymentCardTokenType getPaymentCardToken() {
        return paymentCardToken;
    }

    /**
     * Sets the value of the paymentCardToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardTokenType }
     *     
     */
    public void setPaymentCardToken(PaymentCardTokenType value) {
        this.paymentCardToken = value;
    }

}
