
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectDebitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectDebitType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mdsuk.com/ws/dise3g/payment/dto/business}DirectDebitBaseType">
 *       &lt;sequence>
 *         &lt;element name="DDAccountName" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength60Type" minOccurs="0"/>
 *         &lt;element name="BankAccountNumber" type="{http://mdsuk.com/ws/dise3g/base}BankAccountNumberType" minOccurs="0"/>
 *         &lt;element name="BankSortCode" type="{http://mdsuk.com/ws/dise3g/base}BankSortCodeType" minOccurs="0"/>
 *         &lt;element name="ControlDigit" type="{http://mdsuk.com/ws/dise3g/base}ControlDigitType" minOccurs="0"/>
 *         &lt;element name="DirectDebitPaymentStatus" type="{http://mdsuk.com/ws/dise3g/payment/dto/business}DirectDebitPaymentStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitType", namespace = "http://mdsuk.com/ws/dise3g/payment/dto/business", propOrder = {
    "ddAccountName",
    "bankAccountNumber",
    "bankSortCode",
    "controlDigit",
    "directDebitPaymentStatus"
})
public class DirectDebitType
    extends DirectDebitBaseType
{

    @XmlElement(name = "DDAccountName")
    protected String ddAccountName;
    @XmlElement(name = "BankAccountNumber")
    protected String bankAccountNumber;
    @XmlElement(name = "BankSortCode")
    protected String bankSortCode;
    @XmlElement(name = "ControlDigit")
    protected String controlDigit;
    @XmlElement(name = "DirectDebitPaymentStatus")
    protected String directDebitPaymentStatus;

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
     * Gets the value of the directDebitPaymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectDebitPaymentStatus() {
        return directDebitPaymentStatus;
    }

    /**
     * Sets the value of the directDebitPaymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectDebitPaymentStatus(String value) {
        this.directDebitPaymentStatus = value;
    }

}
