
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PaymentCardTokenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCardTokenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardReference" type="{http://mdsuk.com/ws/dise3g/base}PCI_CardOnFileReferenceType"/>
 *         &lt;element name="CardNumber" type="{http://mdsuk.com/ws/dise3g/base}PCI_CCDCCardNumberType" minOccurs="0"/>
 *         &lt;element name="NameOnCard" type="{http://mdsuk.com/ws/dise3g/base}NameOnCardType" minOccurs="0"/>
 *         &lt;element name="StartYear" type="{http://mdsuk.com/ws/dise3g/base}YearNumberType" minOccurs="0"/>
 *         &lt;element name="StartMonth" type="{http://mdsuk.com/ws/dise3g/base}MonthNumberType" minOccurs="0"/>
 *         &lt;element name="ExpiryYear" type="{http://mdsuk.com/ws/dise3g/base}YearNumberType" minOccurs="0"/>
 *         &lt;element name="ExpiryMonth" type="{http://mdsuk.com/ws/dise3g/base}MonthNumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardTokenType", namespace = "http://mdsuk.com/ws/dise3g/payment/dto/business", propOrder = {
    "cardReference",
    "cardNumber",
    "nameOnCard",
    "startYear",
    "startMonth",
    "expiryYear",
    "expiryMonth"
})
public class PaymentCardTokenType {

    @XmlElement(name = "CardReference", required = true)
    protected String cardReference;
    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "NameOnCard")
    protected String nameOnCard;
    @XmlElement(name = "StartYear")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String startYear;
    @XmlElement(name = "StartMonth")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String startMonth;
    @XmlElement(name = "ExpiryYear")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String expiryYear;
    @XmlElement(name = "ExpiryMonth")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String expiryMonth;

    /**
     * Gets the value of the cardReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardReference() {
        return cardReference;
    }

    /**
     * Sets the value of the cardReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardReference(String value) {
        this.cardReference = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the nameOnCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOnCard() {
        return nameOnCard;
    }

    /**
     * Sets the value of the nameOnCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOnCard(String value) {
        this.nameOnCard = value;
    }

    /**
     * Gets the value of the startYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartYear() {
        return startYear;
    }

    /**
     * Sets the value of the startYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartYear(String value) {
        this.startYear = value;
    }

    /**
     * Gets the value of the startMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartMonth() {
        return startMonth;
    }

    /**
     * Sets the value of the startMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartMonth(String value) {
        this.startMonth = value;
    }

    /**
     * Gets the value of the expiryYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryYear() {
        return expiryYear;
    }

    /**
     * Sets the value of the expiryYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryYear(String value) {
        this.expiryYear = value;
    }

    /**
     * Gets the value of the expiryMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryMonth() {
        return expiryMonth;
    }

    /**
     * Sets the value of the expiryMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryMonth(String value) {
        this.expiryMonth = value;
    }

}
