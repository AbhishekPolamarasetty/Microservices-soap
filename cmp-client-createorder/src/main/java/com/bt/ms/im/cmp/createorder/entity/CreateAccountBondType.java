
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Details required to record a Bond against an account for a subscription
 * 
 * <p>Java class for CreateAccountBondType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateAccountBondType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SubscriptionNumber" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType" minOccurs="0"/>
 *         &lt;element name="PaymentType" type="{http://mdsuk.com/ws/dise3g/base}PaymentTypeType"/>
 *         &lt;element name="BondOrigin" type="{http://mdsuk.com/ws/dise3g/base}BondOriginType"/>
 *         &lt;element name="BondAmount" type="{http://mdsuk.com/ws/dise3g/base}BondAmountType"/>
 *         &lt;element name="ExpectedRefundDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PaymentDetails" type="{http://mdsuk.com/ws/dise3g/recordpayment/dto/business}BondPaymentDetailsType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateAccountBondType", namespace = "http://mdsuk.com/ws/dise3g/account/dto/business", propOrder = {

})
public class CreateAccountBondType {

    @XmlElement(name = "SubscriptionNumber")
    @XmlSchemaType(name = "integer")
    protected Integer subscriptionNumber;
    @XmlElement(name = "PaymentType", required = true)
    protected String paymentType;
    @XmlElement(name = "BondOrigin", required = true)
    protected String bondOrigin;
    @XmlElement(name = "BondAmount", required = true)
    protected BigDecimal bondAmount;
    @XmlElement(name = "ExpectedRefundDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedRefundDate;
    @XmlElement(name = "PaymentDetails")
    protected BondPaymentDetailsType paymentDetails;

    /**
     * Gets the value of the subscriptionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubscriptionNumber() {
        return subscriptionNumber;
    }

    /**
     * Sets the value of the subscriptionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubscriptionNumber(Integer value) {
        this.subscriptionNumber = value;
    }

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
     * Gets the value of the bondOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBondOrigin() {
        return bondOrigin;
    }

    /**
     * Sets the value of the bondOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBondOrigin(String value) {
        this.bondOrigin = value;
    }

    /**
     * Gets the value of the bondAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBondAmount() {
        return bondAmount;
    }

    /**
     * Sets the value of the bondAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBondAmount(BigDecimal value) {
        this.bondAmount = value;
    }

    /**
     * Gets the value of the expectedRefundDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedRefundDate() {
        return expectedRefundDate;
    }

    /**
     * Sets the value of the expectedRefundDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedRefundDate(XMLGregorianCalendar value) {
        this.expectedRefundDate = value;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BondPaymentDetailsType }
     *     
     */
    public BondPaymentDetailsType getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BondPaymentDetailsType }
     *     
     */
    public void setPaymentDetails(BondPaymentDetailsType value) {
        this.paymentDetails = value;
    }

}
