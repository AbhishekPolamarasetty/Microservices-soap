
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SubscriptionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MSISDN" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength25Type"/>
 *         &lt;element name="SubscriptionNumber" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountNumber" type="{http://mdsuk.com/ws/dise3g/base}AccountNumberType"/>
 *         &lt;element name="PortDate" type="{http://mdsuk.com/ws/dise3g/porting/dto/business}PortDateType" minOccurs="0"/>
 *         &lt;element name="PacEntryStatus" type="{http://mdsuk.com/ws/dise3g/porting/dto/business}PacEntryStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionResponseType", namespace = "http://mdsuk.com/ws/dise3g/porting/dto/business", propOrder = {
    "msisdn",
    "subscriptionNumber",
    "userName",
    "accountNumber",
    "portDate",
    "pacEntryStatus"
})
public class SubscriptionResponseType {

    @XmlElement(name = "MSISDN", required = true)
    protected String msisdn;
    @XmlElement(name = "SubscriptionNumber")
    @XmlSchemaType(name = "integer")
    protected int subscriptionNumber;
    @XmlElement(name = "UserName", required = true)
    protected String userName;
    @XmlElement(name = "AccountNumber")
    @XmlSchemaType(name = "integer")
    protected int accountNumber;
    @XmlElement(name = "PortDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar portDate;
    @XmlElement(name = "PacEntryStatus", required = true)
    @XmlSchemaType(name = "string")
    protected PacEntryStatusType pacEntryStatus;

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDN() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSISDN(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the subscriptionNumber property.
     * 
     */
    public int getSubscriptionNumber() {
        return subscriptionNumber;
    }

    /**
     * Sets the value of the subscriptionNumber property.
     * 
     */
    public void setSubscriptionNumber(int value) {
        this.subscriptionNumber = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
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
     * Gets the value of the portDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPortDate() {
        return portDate;
    }

    /**
     * Sets the value of the portDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPortDate(XMLGregorianCalendar value) {
        this.portDate = value;
    }

    /**
     * Gets the value of the pacEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PacEntryStatusType }
     *     
     */
    public PacEntryStatusType getPacEntryStatus() {
        return pacEntryStatus;
    }

    /**
     * Sets the value of the pacEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacEntryStatusType }
     *     
     */
    public void setPacEntryStatus(PacEntryStatusType value) {
        this.pacEntryStatus = value;
    }

}
