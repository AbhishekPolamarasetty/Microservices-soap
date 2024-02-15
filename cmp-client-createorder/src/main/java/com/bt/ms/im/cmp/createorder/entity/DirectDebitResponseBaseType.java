
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DirectDebitResponseBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectDebitResponseBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankName" type="{http://mdsuk.com/ws/dise3g/base}BankNameType" minOccurs="0"/>
 *         &lt;element name="NameOfPayer" type="{http://mdsuk.com/ws/dise3g/base}NameOfPayerType" minOccurs="0"/>
 *         &lt;element name="DateMandateReceived" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DirectDebitPaymentStatus" type="{http://mdsuk.com/ws/dise3g/payment/dto/business}DirectDebitPaymentStatusType" minOccurs="0"/>
 *         &lt;element name="DDSetupMethodCode" type="{http://mdsuk.com/ws/dise3g/base}DDSetupMethodCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitResponseBaseType", namespace = "http://mdsuk.com/ws/dise3g/payment/dto/business", propOrder = {
    "bankName",
    "nameOfPayer",
    "dateMandateReceived",
    "directDebitPaymentStatus",
    "ddSetupMethodCode"
})
@XmlSeeAlso({
    DirectDebitResponseType.class,
    SEPADirectDebitResponseType.class
})
public class DirectDebitResponseBaseType {

    @XmlElement(name = "BankName")
    protected String bankName;
    @XmlElement(name = "NameOfPayer")
    protected String nameOfPayer;
    @XmlElement(name = "DateMandateReceived")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateMandateReceived;
    @XmlElement(name = "DirectDebitPaymentStatus")
    protected String directDebitPaymentStatus;
    @XmlElement(name = "DDSetupMethodCode")
    protected String ddSetupMethodCode;

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the nameOfPayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfPayer() {
        return nameOfPayer;
    }

    /**
     * Sets the value of the nameOfPayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfPayer(String value) {
        this.nameOfPayer = value;
    }

    /**
     * Gets the value of the dateMandateReceived property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateMandateReceived() {
        return dateMandateReceived;
    }

    /**
     * Sets the value of the dateMandateReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateMandateReceived(XMLGregorianCalendar value) {
        this.dateMandateReceived = value;
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

    /**
     * Gets the value of the ddSetupMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDSetupMethodCode() {
        return ddSetupMethodCode;
    }

    /**
     * Sets the value of the ddSetupMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDSetupMethodCode(String value) {
        this.ddSetupMethodCode = value;
    }

}
