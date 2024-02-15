
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="paymentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountNumber" type="{http://mdsuk.com/ws/dise3g/base}AccountNumberType"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nameOnCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDateMMYYNumber" type="{http://mdsuk.com/ws/dise3g/payment/dto/business}MonthYearType" minOccurs="0"/>
 *         &lt;element name="expiryDateMMYYNumber" type="{http://mdsuk.com/ws/dise3g/payment/dto/business}MonthYearType" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2Type"/>
 *         &lt;element name="issueNumber" type="{http://mdsuk.com/ws/dise3g/base}TwoDigitNumberType" minOccurs="0"/>
 *         &lt;element name="AVSHouseStreetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CSCNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://mdsuk.com/ws/dise3g/payment/dto/business}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="holdPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="paymentNumber" type="{http://mdsuk.com/ws/dise3g/payment/dto/business}PaymentNumberType"/>
 *         &lt;element name="paymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="processedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="postCode" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength10Type" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://mdsuk.com/ws/dise3g/base}StringFixedLength2Type" minOccurs="0"/>
 *         &lt;element name="productService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailsType", namespace = "http://mdsuk.com/ws/dise3g/payment/dto/business", propOrder = {
    "paymentTypeCode",
    "accountNumber",
    "cardNumber",
    "nameOnCard",
    "startDateMMYYNumber",
    "expiryDateMMYYNumber",
    "amount",
    "issueNumber",
    "avsHouseStreetNumber",
    "cscNumber",
    "currencyCode",
    "holdPayment",
    "paymentNumber",
    "paymentStatus",
    "processedDate",
    "processedDateTime",
    "postCode",
    "countryCode",
    "productService"
})
public class PaymentDetailsType2 {

    @XmlElement(required = true)
    protected String paymentTypeCode;
    @XmlSchemaType(name = "integer")
    protected int accountNumber;
    @XmlElement(required = true)
    protected String cardNumber;
    @XmlElementRef(name = "nameOnCard", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nameOnCard;
    @XmlElementRef(name = "startDateMMYYNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<MonthYearType> startDateMMYYNumber;
    protected MonthYearType expiryDateMMYYNumber;
    @XmlElement(required = true)
    protected BigDecimal amount;
    protected String issueNumber;
    @XmlElement(name = "AVSHouseStreetNumber")
    protected String avsHouseStreetNumber;
    @XmlElement(name = "CSCNumber")
    protected String cscNumber;
    @XmlSchemaType(name = "string")
    protected CurrencyCodeType currencyCode;
    protected Boolean holdPayment;
    @XmlElement(required = true)
    protected String paymentNumber;
    protected String paymentStatus;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar processedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processedDateTime;
    protected String postCode;
    protected String countryCode;
    protected String productService;

    /**
     * Gets the value of the paymentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeCode() {
        return paymentTypeCode;
    }

    /**
     * Sets the value of the paymentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTypeCode(String value) {
        this.paymentTypeCode = value;
    }

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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNameOnCard() {
        return nameOnCard;
    }

    /**
     * Sets the value of the nameOnCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNameOnCard(JAXBElement<String> value) {
        this.nameOnCard = value;
    }

    /**
     * Gets the value of the startDateMMYYNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonthYearType }{@code >}
     *     
     */
    public JAXBElement<MonthYearType> getStartDateMMYYNumber() {
        return startDateMMYYNumber;
    }

    /**
     * Sets the value of the startDateMMYYNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonthYearType }{@code >}
     *     
     */
    public void setStartDateMMYYNumber(JAXBElement<MonthYearType> value) {
        this.startDateMMYYNumber = value;
    }

    /**
     * Gets the value of the expiryDateMMYYNumber property.
     * 
     * @return
     *     possible object is
     *     {@link MonthYearType }
     *     
     */
    public MonthYearType getExpiryDateMMYYNumber() {
        return expiryDateMMYYNumber;
    }

    /**
     * Sets the value of the expiryDateMMYYNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthYearType }
     *     
     */
    public void setExpiryDateMMYYNumber(MonthYearType value) {
        this.expiryDateMMYYNumber = value;
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
     * Gets the value of the issueNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * Sets the value of the issueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueNumber(String value) {
        this.issueNumber = value;
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
     * Gets the value of the cscNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSCNumber() {
        return cscNumber;
    }

    /**
     * Sets the value of the cscNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSCNumber(String value) {
        this.cscNumber = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyCode(CurrencyCodeType value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the holdPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHoldPayment() {
        return holdPayment;
    }

    /**
     * Sets the value of the holdPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHoldPayment(Boolean value) {
        this.holdPayment = value;
    }

    /**
     * Gets the value of the paymentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentNumber() {
        return paymentNumber;
    }

    /**
     * Sets the value of the paymentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentNumber(String value) {
        this.paymentNumber = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the processedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessedDate() {
        return processedDate;
    }

    /**
     * Sets the value of the processedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessedDate(XMLGregorianCalendar value) {
        this.processedDate = value;
    }

    /**
     * Gets the value of the processedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessedDateTime() {
        return processedDateTime;
    }

    /**
     * Sets the value of the processedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessedDateTime(XMLGregorianCalendar value) {
        this.processedDateTime = value;
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
