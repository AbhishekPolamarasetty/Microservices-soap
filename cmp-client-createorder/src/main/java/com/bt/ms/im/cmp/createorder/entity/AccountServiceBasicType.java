
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccountServiceBasicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountServiceBasicType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mdsuk.com/ws/dise3g/services/dto/business}GenericServiceBasicType">
 *       &lt;sequence>
 *         &lt;element name="PackageCode" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}PackageCodeType" minOccurs="0"/>
 *         &lt;element name="PricePeriodCoverage" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}PricingPeriodCoverageType" minOccurs="0"/>
 *         &lt;element name="SalesAccountNumber" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}SalesPersonNumberType" minOccurs="0"/>
 *         &lt;element name="BillingOffset" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}BillingOffsetType" minOccurs="0"/>
 *         &lt;element name="AddingEvent" type="{http://mdsuk.com/ws/dise3g/base}NineDigitNumberType" minOccurs="0"/>
 *         &lt;element name="NetworkConfirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Migrated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RecurringCharge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PerBill" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BilledUntil" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ServiceBarred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ContractService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ContractDuration" type="{http://mdsuk.com/ws/dise3g/base}ThreeDigitNumberType" minOccurs="0"/>
 *         &lt;element name="SuppressRemainingCharge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ContractReference" type="{http://mdsuk.com/ws/dise3g/services/dto/business}ContractReferenceType" minOccurs="0"/>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountServiceBasicType", namespace = "http://mdsuk.com/ws/dise3g/account/dto/business", propOrder = {
    "packageCode",
    "pricePeriodCoverage",
    "salesAccountNumber",
    "billingOffset",
    "addingEvent",
    "networkConfirmed",
    "migrated",
    "recurringCharge",
    "perBill",
    "billedUntil",
    "serviceBarred",
    "contractService",
    "contractDuration",
    "suppressRemainingCharge",
    "contractReference",
    "lastAmendedDate"
})
public class AccountServiceBasicType
    extends GenericServiceBasicType
{

    @XmlElement(name = "PackageCode")
    protected String packageCode;
    @XmlElement(name = "PricePeriodCoverage")
    protected PricingPeriodCoverageType pricePeriodCoverage;
    @XmlElement(name = "SalesAccountNumber")
    @XmlSchemaType(name = "integer")
    protected Integer salesAccountNumber;
    @XmlElement(name = "BillingOffset")
    @XmlSchemaType(name = "integer")
    protected Integer billingOffset;
    @XmlElement(name = "AddingEvent")
    @XmlSchemaType(name = "integer")
    protected Integer addingEvent;
    @XmlElement(name = "NetworkConfirmed")
    protected Boolean networkConfirmed;
    @XmlElement(name = "Migrated")
    protected Boolean migrated;
    @XmlElement(name = "RecurringCharge")
    protected Boolean recurringCharge;
    @XmlElement(name = "PerBill")
    protected Boolean perBill;
    @XmlElement(name = "BilledUntil")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar billedUntil;
    @XmlElement(name = "ServiceBarred")
    protected Boolean serviceBarred;
    @XmlElement(name = "ContractService")
    protected Boolean contractService;
    @XmlElement(name = "ContractDuration")
    @XmlSchemaType(name = "integer")
    protected Integer contractDuration;
    @XmlElement(name = "SuppressRemainingCharge")
    protected Boolean suppressRemainingCharge;
    @XmlElement(name = "ContractReference")
    protected String contractReference;
    @XmlElement(name = "LastAmendedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the packageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageCode() {
        return packageCode;
    }

    /**
     * Sets the value of the packageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageCode(String value) {
        this.packageCode = value;
    }

    /**
     * Gets the value of the pricePeriodCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link PricingPeriodCoverageType }
     *     
     */
    public PricingPeriodCoverageType getPricePeriodCoverage() {
        return pricePeriodCoverage;
    }

    /**
     * Sets the value of the pricePeriodCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingPeriodCoverageType }
     *     
     */
    public void setPricePeriodCoverage(PricingPeriodCoverageType value) {
        this.pricePeriodCoverage = value;
    }

    /**
     * Gets the value of the salesAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalesAccountNumber() {
        return salesAccountNumber;
    }

    /**
     * Sets the value of the salesAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalesAccountNumber(Integer value) {
        this.salesAccountNumber = value;
    }

    /**
     * Gets the value of the billingOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillingOffset() {
        return billingOffset;
    }

    /**
     * Sets the value of the billingOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillingOffset(Integer value) {
        this.billingOffset = value;
    }

    /**
     * Gets the value of the addingEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAddingEvent() {
        return addingEvent;
    }

    /**
     * Sets the value of the addingEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAddingEvent(Integer value) {
        this.addingEvent = value;
    }

    /**
     * Gets the value of the networkConfirmed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetworkConfirmed() {
        return networkConfirmed;
    }

    /**
     * Sets the value of the networkConfirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetworkConfirmed(Boolean value) {
        this.networkConfirmed = value;
    }

    /**
     * Gets the value of the migrated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMigrated() {
        return migrated;
    }

    /**
     * Sets the value of the migrated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMigrated(Boolean value) {
        this.migrated = value;
    }

    /**
     * Gets the value of the recurringCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecurringCharge() {
        return recurringCharge;
    }

    /**
     * Sets the value of the recurringCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecurringCharge(Boolean value) {
        this.recurringCharge = value;
    }

    /**
     * Gets the value of the perBill property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerBill() {
        return perBill;
    }

    /**
     * Sets the value of the perBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerBill(Boolean value) {
        this.perBill = value;
    }

    /**
     * Gets the value of the billedUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBilledUntil() {
        return billedUntil;
    }

    /**
     * Sets the value of the billedUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBilledUntil(XMLGregorianCalendar value) {
        this.billedUntil = value;
    }

    /**
     * Gets the value of the serviceBarred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceBarred() {
        return serviceBarred;
    }

    /**
     * Sets the value of the serviceBarred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceBarred(Boolean value) {
        this.serviceBarred = value;
    }

    /**
     * Gets the value of the contractService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContractService() {
        return contractService;
    }

    /**
     * Sets the value of the contractService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContractService(Boolean value) {
        this.contractService = value;
    }

    /**
     * Gets the value of the contractDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractDuration() {
        return contractDuration;
    }

    /**
     * Sets the value of the contractDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractDuration(Integer value) {
        this.contractDuration = value;
    }

    /**
     * Gets the value of the suppressRemainingCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressRemainingCharge() {
        return suppressRemainingCharge;
    }

    /**
     * Sets the value of the suppressRemainingCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressRemainingCharge(Boolean value) {
        this.suppressRemainingCharge = value;
    }

    /**
     * Gets the value of the contractReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractReference() {
        return contractReference;
    }

    /**
     * Sets the value of the contractReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractReference(String value) {
        this.contractReference = value;
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
