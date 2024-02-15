
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This structure optionally returned as part of the Account Query response
 * 
 * <p>Java class for AccountTypeAndUsageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountTypeAndUsageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AccountType" type="{http://mdsuk.com/ws/dise3g/account/dto/business}AccountTypeType" minOccurs="0"/>
 *         &lt;element name="SubLedgerCode" type="{http://mdsuk.com/ws/dise3g/account/dto/business}SubLedgerCodeType" minOccurs="0"/>
 *         &lt;element name="AccountUsage" type="{http://mdsuk.com/ws/dise3g/account/dto/business}AccountUsageType" minOccurs="0"/>
 *         &lt;element name="CorrespondingAccount" type="{http://mdsuk.com/ws/dise3g/base}AccountNumberType" minOccurs="0"/>
 *         &lt;element name="AccountServiceAgreement" type="{http://mdsuk.com/ws/dise3g/base}AgreementNumberType" minOccurs="0"/>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountTypeAndUsageType", namespace = "http://mdsuk.com/ws/dise3g/account/dto/business", propOrder = {

})
public class AccountTypeAndUsageType {

    @XmlElement(name = "AccountType")
    protected String accountType;
    @XmlElement(name = "SubLedgerCode")
    protected String subLedgerCode;
    @XmlElement(name = "AccountUsage")
    @XmlSchemaType(name = "string")
    protected AccountUsageType accountUsage;
    @XmlElement(name = "CorrespondingAccount")
    @XmlSchemaType(name = "integer")
    protected Integer correspondingAccount;
    @XmlElement(name = "AccountServiceAgreement")
    @XmlSchemaType(name = "integer")
    protected Integer accountServiceAgreement;
    @XmlElement(name = "LastAmendedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the subLedgerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubLedgerCode() {
        return subLedgerCode;
    }

    /**
     * Sets the value of the subLedgerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubLedgerCode(String value) {
        this.subLedgerCode = value;
    }

    /**
     * Gets the value of the accountUsage property.
     * 
     * @return
     *     possible object is
     *     {@link AccountUsageType }
     *     
     */
    public AccountUsageType getAccountUsage() {
        return accountUsage;
    }

    /**
     * Sets the value of the accountUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountUsageType }
     *     
     */
    public void setAccountUsage(AccountUsageType value) {
        this.accountUsage = value;
    }

    /**
     * Gets the value of the correspondingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCorrespondingAccount() {
        return correspondingAccount;
    }

    /**
     * Sets the value of the correspondingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCorrespondingAccount(Integer value) {
        this.correspondingAccount = value;
    }

    /**
     * Gets the value of the accountServiceAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountServiceAgreement() {
        return accountServiceAgreement;
    }

    /**
     * Sets the value of the accountServiceAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountServiceAgreement(Integer value) {
        this.accountServiceAgreement = value;
    }

    /**
     * Gets the value of the lastAmendedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAmendedDate() {
        return lastAmendedDate;
    }

    /**
     * Sets the value of the lastAmendedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAmendedDate(XMLGregorianCalendar value) {
        this.lastAmendedDate = value;
    }

}
