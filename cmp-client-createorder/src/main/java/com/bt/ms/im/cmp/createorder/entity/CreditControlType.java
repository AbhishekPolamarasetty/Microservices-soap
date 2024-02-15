
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
 * <p>Java class for CreditControlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditControlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="CreditLimit" type="{http://mdsuk.com/ws/dise3g/account/dto/business}CreditLimitType" minOccurs="0"/>
 *         &lt;element name="HardwareCreditLimit" type="{http://mdsuk.com/ws/dise3g/account/dto/business}HardwareCreditLimitType" minOccurs="0"/>
 *         &lt;element name="CreditScore" type="{http://mdsuk.com/ws/dise3g/account/dto/business}CreditScoreType" minOccurs="0"/>
 *         &lt;element name="IgnoreCreditControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IgnoreCreditControlUpToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="IgnoreUsageLimits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AccountInQuery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreditControlAddressNumber" type="{http://mdsuk.com/ws/dise3g/address/dto/business}AddressCodeType" minOccurs="0"/>
 *         &lt;element name="CreditControlStatus" type="{http://mdsuk.com/ws/dise3g/account/dto/business}CreditControlStatusType" minOccurs="0"/>
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
@XmlType(name = "CreditControlType", namespace = "http://mdsuk.com/ws/dise3g/account/dto/business", propOrder = {

})
public class CreditControlType {

    @XmlElement(name = "CreditLimit")
    @XmlSchemaType(name = "integer")
    protected Integer creditLimit;
    @XmlElement(name = "HardwareCreditLimit")
    @XmlSchemaType(name = "integer")
    protected Integer hardwareCreditLimit;
    @XmlElement(name = "CreditScore")
    @XmlSchemaType(name = "integer")
    protected Integer creditScore;
    @XmlElement(name = "IgnoreCreditControl")
    protected Boolean ignoreCreditControl;
    @XmlElement(name = "IgnoreCreditControlUpToDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ignoreCreditControlUpToDate;
    @XmlElement(name = "IgnoreUsageLimits")
    protected Boolean ignoreUsageLimits;
    @XmlElement(name = "AccountInQuery")
    protected Boolean accountInQuery;
    @XmlElement(name = "CreditControlAddressNumber")
    @XmlSchemaType(name = "integer")
    protected Integer creditControlAddressNumber;
    @XmlElement(name = "CreditControlStatus")
    @XmlSchemaType(name = "string")
    protected CreditControlStatusType creditControlStatus;
    @XmlElement(name = "LastAmendedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditLimit(Integer value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the hardwareCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHardwareCreditLimit() {
        return hardwareCreditLimit;
    }

    /**
     * Sets the value of the hardwareCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHardwareCreditLimit(Integer value) {
        this.hardwareCreditLimit = value;
    }

    /**
     * Gets the value of the creditScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditScore() {
        return creditScore;
    }

    /**
     * Sets the value of the creditScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditScore(Integer value) {
        this.creditScore = value;
    }

    /**
     * Gets the value of the ignoreCreditControl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreCreditControl() {
        return ignoreCreditControl;
    }

    /**
     * Sets the value of the ignoreCreditControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreCreditControl(Boolean value) {
        this.ignoreCreditControl = value;
    }

    /**
     * Gets the value of the ignoreCreditControlUpToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIgnoreCreditControlUpToDate() {
        return ignoreCreditControlUpToDate;
    }

    /**
     * Sets the value of the ignoreCreditControlUpToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIgnoreCreditControlUpToDate(XMLGregorianCalendar value) {
        this.ignoreCreditControlUpToDate = value;
    }

    /**
     * Gets the value of the ignoreUsageLimits property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreUsageLimits() {
        return ignoreUsageLimits;
    }

    /**
     * Sets the value of the ignoreUsageLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreUsageLimits(Boolean value) {
        this.ignoreUsageLimits = value;
    }

    /**
     * Gets the value of the accountInQuery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountInQuery() {
        return accountInQuery;
    }

    /**
     * Sets the value of the accountInQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountInQuery(Boolean value) {
        this.accountInQuery = value;
    }

    /**
     * Gets the value of the creditControlAddressNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditControlAddressNumber() {
        return creditControlAddressNumber;
    }

    /**
     * Sets the value of the creditControlAddressNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditControlAddressNumber(Integer value) {
        this.creditControlAddressNumber = value;
    }

    /**
     * Gets the value of the creditControlStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CreditControlStatusType }
     *     
     */
    public CreditControlStatusType getCreditControlStatus() {
        return creditControlStatus;
    }

    /**
     * Sets the value of the creditControlStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditControlStatusType }
     *     
     */
    public void setCreditControlStatus(CreditControlStatusType value) {
        this.creditControlStatus = value;
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