
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DirectDebitResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectDebitResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mdsuk.com/ws/dise3g/payment/dto/business}DirectDebitResponseBaseType">
 *       &lt;sequence>
 *         &lt;element name="PaymentType" type="{http://mdsuk.com/ws/dise3g/base}PaymentTypeType"/>
 *         &lt;element name="BankAccountNumber" type="{http://mdsuk.com/ws/dise3g/base}BankAccountNumberType" minOccurs="0"/>
 *         &lt;element name="BankSortCode" type="{http://mdsuk.com/ws/dise3g/base}BankSortCodeType" minOccurs="0"/>
 *         &lt;element name="ControlDigit" type="{http://mdsuk.com/ws/dise3g/base}ControlDigitType" minOccurs="0"/>
 *         &lt;element name="DDAccountName" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength60Type" minOccurs="0"/>
 *         &lt;element name="ConfirmationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitResponseType", namespace = "http://mdsuk.com/ws/dise3g/payment/dto/business", propOrder = {
    "paymentType",
    "bankAccountNumber",
    "bankSortCode",
    "controlDigit",
    "ddAccountName",
    "confirmationDate"
})
public class DirectDebitResponseType
    extends DirectDebitResponseBaseType
{

    @XmlElement(name = "PaymentType", required = true)
    protected String paymentType;
    @XmlElement(name = "BankAccountNumber")
    protected String bankAccountNumber;
    @XmlElement(name = "BankSortCode")
    protected String bankSortCode;
    @XmlElement(name = "ControlDigit")
    protected String controlDigit;
    @XmlElement(name = "DDAccountName")
    protected String ddAccountName;
    @XmlElement(name = "ConfirmationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar confirmationDate;

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
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNumber(String value) {
        this.bankAccountNumber = value;
    }

    /**
     * Gets the value of the bankSortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankSortCode() {
        return bankSortCode;
    }

    /**
     * Sets the value of the bankSortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankSortCode(String value) {
        this.bankSortCode = value;
    }

    /**
     * Gets the value of the controlDigit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlDigit() {
        return controlDigit;
    }

    /**
     * Sets the value of the controlDigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlDigit(String value) {
        this.controlDigit = value;
    }

    /**
     * Gets the value of the ddAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDAccountName() {
        return ddAccountName;
    }

    /**
     * Sets the value of the ddAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDAccountName(String value) {
        this.ddAccountName = value;
    }

    /**
     * Gets the value of the confirmationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfirmationDate() {
        return confirmationDate;
    }

    /**
     * Sets the value of the confirmationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfirmationDate(XMLGregorianCalendar value) {
        this.confirmationDate = value;
    }

}
