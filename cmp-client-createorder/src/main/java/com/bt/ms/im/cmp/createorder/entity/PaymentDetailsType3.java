
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountNumber" type="{http://mdsuk.com/ws/dise3g/base}AccountNumberType"/>
 *         &lt;element name="TransactionReference" type="{http://mdsuk.com/ws/dise3g/recordpayment/dto/business}TransactionReferenceType" minOccurs="0"/>
 *         &lt;element name="PaymentReference" type="{http://mdsuk.com/ws/dise3g/recordpayment/dto/business}PaymentReferenceType" minOccurs="0"/>
 *         &lt;element name="CardReference" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30Type" minOccurs="0"/>
 *         &lt;element name="TransactionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Amount" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2Type"/>
 *         &lt;element name="CurrencyCode" type="{http://mdsuk.com/ws/dise3g/recordpayment/dto/business}CurrencyCodeType"/>
 *         &lt;element name="PaymentType" type="{http://mdsuk.com/ws/dise3g/base}PaymentTypeType"/>
 *         &lt;element name="CardNumber" type="{http://mdsuk.com/ws/dise3g/base}CCDCCardNumberType" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://mdsuk.com/ws/dise3g/recordpayment/dto/business}MonthYearType" minOccurs="0"/>
 *         &lt;element name="ExpiryDate" type="{http://mdsuk.com/ws/dise3g/recordpayment/dto/business}MonthYearType" minOccurs="0"/>
 *         &lt;element name="NameOnCard" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30Type" minOccurs="0"/>
 *         &lt;element name="AVSHouseStreetNumber" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength25Type" minOccurs="0"/>
 *         &lt;element name="PostCode" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength10Type" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://mdsuk.com/ws/dise3g/base}StringFixedLength2Type" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength4Type" minOccurs="0"/>
 *         &lt;element name="ProductService" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailsType", namespace = "http://mdsuk.com/ws/dise3g/recordpayment/dto/business", propOrder = {
    "accountNumber",
    "transactionReference",
    "paymentReference",
    "cardReference",
    "transactionDateTime",
    "amount",
    "currencyCode",
    "paymentType",
    "cardNumber",
    "startDate",
    "expiryDate",
    "nameOnCard",
    "avsHouseStreetNumber",
    "postCode",
    "countryCode",
    "reasonCode",
    "productService"
})
public class PaymentDetailsType3 {

    @XmlElement(name = "AccountNumber")
    @XmlSchemaType(name = "integer")
    protected int accountNumber;
    @XmlElement(name = "TransactionReference")
    protected String transactionReference;
    @XmlElement(name = "PaymentReference")
    protected String paymentReference;
    @XmlElement(name = "CardReference")
    protected String cardReference;
    @XmlElement(name = "TransactionDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDateTime;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "CurrencyCode", required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyCodeType2 currencyCode;
    @XmlElement(name = "PaymentType", required = true)
    protected String paymentType;
    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "StartDate")
    protected MonthYearType2 startDate;
    @XmlElement(name = "ExpiryDate")
    protected MonthYearType2 expiryDate;
    @XmlElement(name = "NameOnCard")
    protected String nameOnCard;
    @XmlElement(name = "AVSHouseStreetNumber")
    protected String avsHouseStreetNumber;
    @XmlElement(name = "PostCode")
    protected String postCode;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "ReasonCode")
    protected String reasonCode;
    @XmlElement(name = "ProductService")
    protected String productService;

    /**
     * Gets the value of the accountNumber property.
     * 
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     */
    public void setAccountNumber(int value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the transactionReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionReference() {
        return transactionReference;
    }

    /**
     * Sets the value of the transactionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionReference(String value) {
        this.transactionReference = value;
    }

    /**
     * Gets the value of the paymentReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentReference() {
        return paymentReference;
    }

    /**
     * Sets the value of the paymentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentReference(String value) {
        this.paymentReference = value;
    }

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
     * Gets the value of the transactionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDateTime() {
        return transactionDateTime;
    }

    /**
     * Sets the value of the transactionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDateTime(XMLGregorianCalendar value) {
        this.transactionDateTime = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType2 }
     *     
     */
    public CurrencyCodeType2 getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType2 }
     *     
     */
    public void setCurrencyCode(CurrencyCodeType2 value) {
        this.currencyCode = value;
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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link MonthYearType2 }
     *     
     */
    public MonthYearType2 getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthYearType2 }
     *     
     */
    public void setStartDate(MonthYearType2 value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link MonthYearType2 }
     *     
     */
    public MonthYearType2 getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthYearType2 }
     *     
     */
    public void setExpiryDate(MonthYearType2 value) {
        this.expiryDate = value;
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
     * Gets the value of the avsHouseStreetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVSHouseStreetNumber() {
        return avsHouseStreetNumber;
    }

    /**
     * Sets the value of the avsHouseStreetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVSHouseStreetNumber(String value) {
        this.avsHouseStreetNumber = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the productService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductService() {
        return productService;
    }

    /**
     * Sets the value of the productService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductService(String value) {
        this.productService = value;
    }

}
