
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Data structure  returned by Agreement Query Response when BASIC dataset is specified
 * 
 * <p>Java class for AgreementBasicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementBasicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AgreementNumber" type="{http://mdsuk.com/ws/dise3g/base}AgreementNumberType" minOccurs="0"/>
 *         &lt;element name="AgreementLoggedAt" type="{http://mdsuk.com/ws/dise3g/account/dto/business}TargetIdentifierType" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://mdsuk.com/ws/dise3g/base}CompanyCodeType" minOccurs="0"/>
 *         &lt;element name="BillingCycle" type="{http://mdsuk.com/ws/dise3g/base}DayOfMonthType" minOccurs="0"/>
 *         &lt;element name="InvoiceFrequency" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}InvoiceFrequencyType" minOccurs="0"/>
 *         &lt;element name="TerminatedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="InvoiceConsolidationLevel" type="{http://mdsuk.com/ws/dise3g/base}LevelType" minOccurs="0"/>
 *         &lt;element name="InvoiceLoggedAt" type="{http://mdsuk.com/ws/dise3g/base}LevelType" minOccurs="0"/>
 *         &lt;element name="InvoiceAddress" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}InvoiceAddressType" minOccurs="0"/>
 *         &lt;element name="BillingMedia" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}BillingMediaType" minOccurs="0"/>
 *         &lt;element name="AddressNumber" type="{http://mdsuk.com/ws/dise3g/address/dto/business}AddressCodeType" minOccurs="0"/>
 *         &lt;element name="SuspendedFromInvoicing" type="{http://mdsuk.com/ws/dise3g/base}SuspendedFromInvoicingType" minOccurs="0"/>
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
@XmlType(name = "AgreementBasicType", namespace = "http://mdsuk.com/ws/dise3g/agreement/dto/business", propOrder = {

})
public class AgreementBasicType {

    @XmlElement(name = "AgreementNumber")
    @XmlSchemaType(name = "integer")
    protected Integer agreementNumber;
    @XmlElement(name = "AgreementLoggedAt")
    protected TargetIdentifierType3 agreementLoggedAt;
    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "BillingCycle")
    @XmlSchemaType(name = "integer")
    protected Integer billingCycle;
    @XmlElement(name = "InvoiceFrequency")
    protected InvoiceFrequencyType invoiceFrequency;
    @XmlElement(name = "TerminatedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminatedDate;
    @XmlElement(name = "InvoiceConsolidationLevel")
    @XmlSchemaType(name = "string")
    protected LevelType invoiceConsolidationLevel;
    @XmlElement(name = "InvoiceLoggedAt")
    @XmlSchemaType(name = "string")
    protected LevelType invoiceLoggedAt;
    @XmlElement(name = "InvoiceAddress")
    @XmlSchemaType(name = "string")
    protected InvoiceAddressType invoiceAddress;
    @XmlElement(name = "BillingMedia")
    protected String billingMedia;
    @XmlElement(name = "AddressNumber")
    @XmlSchemaType(name = "integer")
    protected Integer addressNumber;
    @XmlElement(name = "SuspendedFromInvoicing")
    protected Boolean suspendedFromInvoicing;
    @XmlElement(name = "LastAmendedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the agreementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAgreementNumber() {
        return agreementNumber;
    }

    /**
     * Sets the value of the agreementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAgreementNumber(Integer value) {
        this.agreementNumber = value;
    }

    /**
     * Gets the value of the agreementLoggedAt property.
     * 
     * @return
     *     possible object is
     *     {@link TargetIdentifierType3 }
     *     
     */
    public TargetIdentifierType3 getAgreementLoggedAt() {
        return agreementLoggedAt;
    }

    /**
     * Sets the value of the agreementLoggedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetIdentifierType3 }
     *     
     */
    public void setAgreementLoggedAt(TargetIdentifierType3 value) {
        this.agreementLoggedAt = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the billingCycle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillingCycle() {
        return billingCycle;
    }

    /**
     * Sets the value of the billingCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillingCycle(Integer value) {
        this.billingCycle = value;
    }

    /**
     * Gets the value of the invoiceFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceFrequencyType }
     *     
     */
    public InvoiceFrequencyType getInvoiceFrequency() {
        return invoiceFrequency;
    }

    /**
     * Sets the value of the invoiceFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceFrequencyType }
     *     
     */
    public void setInvoiceFrequency(InvoiceFrequencyType value) {
        this.invoiceFrequency = value;
    }

    /**
     * Gets the value of the terminatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminatedDate() {
        return terminatedDate;
    }

    /**
     * Sets the value of the terminatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminatedDate(XMLGregorianCalendar value) {
        this.terminatedDate = value;
    }

    /**
     * Gets the value of the invoiceConsolidationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link LevelType }
     *     
     */
    public LevelType getInvoiceConsolidationLevel() {
        return invoiceConsolidationLevel;
    }

    /**
     * Sets the value of the invoiceConsolidationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelType }
     *     
     */
    public void setInvoiceConsolidationLevel(LevelType value) {
        this.invoiceConsolidationLevel = value;
    }

    /**
     * Gets the value of the invoiceLoggedAt property.
     * 
     * @return
     *     possible object is
     *     {@link LevelType }
     *     
     */
    public LevelType getInvoiceLoggedAt() {
        return invoiceLoggedAt;
    }

    /**
     * Sets the value of the invoiceLoggedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelType }
     *     
     */
    public void setInvoiceLoggedAt(LevelType value) {
        this.invoiceLoggedAt = value;
    }

    /**
     * Gets the value of the invoiceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceAddressType }
     *     
     */
    public InvoiceAddressType getInvoiceAddress() {
        return invoiceAddress;
    }

    /**
     * Sets the value of the invoiceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceAddressType }
     *     
     */
    public void setInvoiceAddress(InvoiceAddressType value) {
        this.invoiceAddress = value;
    }

    /**
     * Gets the value of the billingMedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingMedia() {
        return billingMedia;
    }

    /**
     * Sets the value of the billingMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingMedia(String value) {
        this.billingMedia = value;
    }

    /**
     * Gets the value of the addressNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAddressNumber() {
        return addressNumber;
    }

    /**
     * Sets the value of the addressNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAddressNumber(Integer value) {
        this.addressNumber = value;
    }

    /**
     * Gets the value of the suspendedFromInvoicing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuspendedFromInvoicing() {
        return suspendedFromInvoicing;
    }

    /**
     * Sets the value of the suspendedFromInvoicing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuspendedFromInvoicing(Boolean value) {
        this.suspendedFromInvoicing = value;
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
