
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SEPADirectDebitResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SEPADirectDebitResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mdsuk.com/ws/dise3g/payment/dto/business}DirectDebitResponseBaseType">
 *       &lt;sequence>
 *         &lt;element name="IBAN" type="{http://mdsuk.com/ws/dise3g/base}IBANType" minOccurs="0"/>
 *         &lt;element name="BIC" type="{http://mdsuk.com/ws/dise3g/base}BICType" minOccurs="0"/>
 *         &lt;element name="MandateReference" type="{http://mdsuk.com/ws/dise3g/base}MandateReferenceType" minOccurs="0"/>
 *         &lt;element name="MandateSignatureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SEPADirectDebitResponseType", namespace = "http://mdsuk.com/ws/dise3g/payment/dto/business", propOrder = {
    "iban",
    "bic",
    "mandateReference",
    "mandateSignatureDate"
})
public class SEPADirectDebitResponseType
    extends DirectDebitResponseBaseType
{

    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "BIC")
    protected String bic;
    @XmlElement(name = "MandateReference")
    protected String mandateReference;
    @XmlElement(name = "MandateSignatureDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mandateSignatureDate;

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the mandateReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandateReference() {
        return mandateReference;
    }

    /**
     * Sets the value of the mandateReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandateReference(String value) {
        this.mandateReference = value;
    }

    /**
     * Gets the value of the mandateSignatureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMandateSignatureDate() {
        return mandateSignatureDate;
    }

    /**
     * Sets the value of the mandateSignatureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMandateSignatureDate(XMLGregorianCalendar value) {
        this.mandateSignatureDate = value;
    }

}
