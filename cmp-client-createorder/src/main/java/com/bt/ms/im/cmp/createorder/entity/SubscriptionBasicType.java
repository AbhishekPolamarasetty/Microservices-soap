
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This structure is returned as part of the Subscription Query response
 *                 when BASIC dataset is specified
 * 
 * <p>Java class for SubscriptionBasicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionBasicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SubscriptionNumber" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType"/>
 *         &lt;element name="AgreementNumber" type="{http://mdsuk.com/ws/dise3g/base}AgreementNumberType"/>
 *         &lt;element name="AccountNumber" type="{http://mdsuk.com/ws/dise3g/base}AccountNumberType"/>
 *         &lt;element name="CorporateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyNumber" type="{http://mdsuk.com/ws/dise3g/base}CompanyNumberType"/>
 *         &lt;element name="SalesAccountCode" type="{http://mdsuk.com/ws/dise3g/base}SalesAccountCodeType" minOccurs="0"/>
 *         &lt;element name="SubscriptionStatus" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}SubscriptionStatusType"/>
 *         &lt;element name="LastSubscriptionOrderStatus" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}LastOrderStatusType" minOccurs="0"/>
 *         &lt;element name="PricePlanCode" type="{http://mdsuk.com/ws/dise3g/base}PricePlanCodeType" minOccurs="0"/>
 *         &lt;element name="TariffChangePending" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TariffCode" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}TariffCodeType"/>
 *         &lt;element name="TariffShareGroup" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}TariffShareGroupType" minOccurs="0"/>
 *         &lt;element name="BillingType" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}BillingTypeType"/>
 *         &lt;element name="NetworkCode" type="{http://mdsuk.com/ws/dise3g/base}NetworkCodeType"/>
 *         &lt;element name="ConnectedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DisconnectedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TerminateOn" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ConnectionReason" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ConnectionReasonType"/>
 *         &lt;element name="AddressNumber" type="{http://mdsuk.com/ws/dise3g/address/dto/business}AddressCodeType"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastTariffChangeEvent" type="{http://mdsuk.com/ws/dise3g/base}NineDigitNumberType" minOccurs="0"/>
 *         &lt;element name="LastNumberChangeEvent" type="{http://mdsuk.com/ws/dise3g/base}NineDigitNumberType" minOccurs="0"/>
 *         &lt;element name="LastConnectionEvent" type="{http://mdsuk.com/ws/dise3g/base}NineDigitNumberType" minOccurs="0"/>
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
@XmlType(name = "SubscriptionBasicType", propOrder = {

})
public class SubscriptionBasicType {

    @XmlElement(name = "SubscriptionNumber")
    @XmlSchemaType(name = "integer")
    protected int subscriptionNumber;
    @XmlElement(name = "AgreementNumber")
    @XmlSchemaType(name = "integer")
    protected int agreementNumber;
    @XmlElement(name = "AccountNumber")
    @XmlSchemaType(name = "integer")
    protected int accountNumber;
    @XmlElement(name = "CorporateCode")
    protected String corporateCode;
    @XmlElement(name = "GroupCode")
    protected String groupCode;
    @XmlElement(name = "CompanyNumber", required = true)
    protected String companyNumber;
    @XmlElement(name = "SalesAccountCode")
    @XmlSchemaType(name = "integer")
    protected Integer salesAccountCode;
    @XmlElement(name = "SubscriptionStatus", required = true)
    protected String subscriptionStatus;
    @XmlElement(name = "LastSubscriptionOrderStatus")
    @XmlSchemaType(name = "string")
    protected LastOrderStatusType lastSubscriptionOrderStatus;
    @XmlElement(name = "PricePlanCode")
    protected String pricePlanCode;
    @XmlElement(name = "TariffChangePending")
    protected boolean tariffChangePending;
    @XmlElement(name = "TariffCode", required = true)
    protected String tariffCode;
    @XmlElement(name = "TariffShareGroup")
    protected String tariffShareGroup;
    @XmlElement(name = "BillingType", required = true)
    protected String billingType;
    @XmlElement(name = "NetworkCode", required = true)
    protected String networkCode;
    @XmlElement(name = "ConnectedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar connectedDate;
    @XmlElement(name = "DisconnectedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar disconnectedDate;
    @XmlElement(name = "TerminateOn")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminateOn;
    @XmlElement(name = "ConnectionReason", required = true)
    protected String connectionReason;
    @XmlElement(name = "AddressNumber")
    @XmlSchemaType(name = "integer")
    protected int addressNumber;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "Parent")
    protected Boolean parent;
    @XmlElement(name = "LastTariffChangeEvent")
    @XmlSchemaType(name = "integer")
    protected Integer lastTariffChangeEvent;
    @XmlElement(name = "LastNumberChangeEvent")
    @XmlSchemaType(name = "integer")
    protected Integer lastNumberChangeEvent;
    @XmlElement(name = "LastConnectionEvent")
    @XmlSchemaType(name = "integer")
    protected Integer lastConnectionEvent;
    @XmlElement(name = "SuspendedFromInvoicing")
    protected Boolean suspendedFromInvoicing;
    @XmlElement(name = "LastAmendedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

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
     * Gets the value of the agreementNumber property.
     * 
     */
    public int getAgreementNumber() {
        return agreementNumber;
    }

    /**
     * Sets the value of the agreementNumber property.
     * 
     */
    public void setAgreementNumber(int value) {
        this.agreementNumber = value;
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
     * Gets the value of the corporateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateCode() {
        return corporateCode;
    }

    /**
     * Sets the value of the corporateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateCode(String value) {
        this.corporateCode = value;
    }

    /**
     * Gets the value of the groupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * Sets the value of the groupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCode(String value) {
        this.groupCode = value;
    }

    /**
     * Gets the value of the companyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNumber() {
        return companyNumber;
    }

    /**
     * Sets the value of the companyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNumber(String value) {
        this.companyNumber = value;
    }

    /**
     * Gets the value of the salesAccountCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalesAccountCode() {
        return salesAccountCode;
    }

    /**
     * Sets the value of the salesAccountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalesAccountCode(Integer value) {
        this.salesAccountCode = value;
    }

    /**
     * Gets the value of the subscriptionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionStatus() {
        return subscriptionStatus;
    }

    /**
     * Sets the value of the subscriptionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionStatus(String value) {
        this.subscriptionStatus = value;
    }

    /**
     * Gets the value of the lastSubscriptionOrderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LastOrderStatusType }
     *     
     */
    public LastOrderStatusType getLastSubscriptionOrderStatus() {
        return lastSubscriptionOrderStatus;
    }

    /**
     * Sets the value of the lastSubscriptionOrderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastOrderStatusType }
     *     
     */
    public void setLastSubscriptionOrderStatus(LastOrderStatusType value) {
        this.lastSubscriptionOrderStatus = value;
    }

    /**
     * Gets the value of the pricePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePlanCode() {
        return pricePlanCode;
    }

    /**
     * Sets the value of the pricePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePlanCode(String value) {
        this.pricePlanCode = value;
    }

    /**
     * Gets the value of the tariffChangePending property.
     * 
     */
    public boolean isTariffChangePending() {
        return tariffChangePending;
    }

    /**
     * Sets the value of the tariffChangePending property.
     * 
     */
    public void setTariffChangePending(boolean value) {
        this.tariffChangePending = value;
    }

    /**
     * Gets the value of the tariffCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffCode() {
        return tariffCode;
    }

    /**
     * Sets the value of the tariffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffCode(String value) {
        this.tariffCode = value;
    }

    /**
     * Gets the value of the tariffShareGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffShareGroup() {
        return tariffShareGroup;
    }

    /**
     * Sets the value of the tariffShareGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffShareGroup(String value) {
        this.tariffShareGroup = value;
    }

    /**
     * Gets the value of the billingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingType() {
        return billingType;
    }

    /**
     * Sets the value of the billingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingType(String value) {
        this.billingType = value;
    }

    /**
     * Gets the value of the networkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkCode() {
        return networkCode;
    }

    /**
     * Sets the value of the networkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkCode(String value) {
        this.networkCode = value;
    }

    /**
     * Gets the value of the connectedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConnectedDate() {
        return connectedDate;
    }

    /**
     * Sets the value of the connectedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConnectedDate(XMLGregorianCalendar value) {
        this.connectedDate = value;
    }

    /**
     * Gets the value of the disconnectedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisconnectedDate() {
        return disconnectedDate;
    }

    /**
     * Sets the value of the disconnectedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisconnectedDate(XMLGregorianCalendar value) {
        this.disconnectedDate = value;
    }

    /**
     * Gets the value of the terminateOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminateOn() {
        return terminateOn;
    }

    /**
     * Sets the value of the terminateOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminateOn(XMLGregorianCalendar value) {
        this.terminateOn = value;
    }

    /**
     * Gets the value of the connectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionReason() {
        return connectionReason;
    }

    /**
     * Sets the value of the connectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionReason(String value) {
        this.connectionReason = value;
    }

    /**
     * Gets the value of the addressNumber property.
     * 
     */
    public int getAddressNumber() {
        return addressNumber;
    }

    /**
     * Sets the value of the addressNumber property.
     * 
     */
    public void setAddressNumber(int value) {
        this.addressNumber = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParent(Boolean value) {
        this.parent = value;
    }

    /**
     * Gets the value of the lastTariffChangeEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastTariffChangeEvent() {
        return lastTariffChangeEvent;
    }

    /**
     * Sets the value of the lastTariffChangeEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastTariffChangeEvent(Integer value) {
        this.lastTariffChangeEvent = value;
    }

    /**
     * Gets the value of the lastNumberChangeEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastNumberChangeEvent() {
        return lastNumberChangeEvent;
    }

    /**
     * Sets the value of the lastNumberChangeEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastNumberChangeEvent(Integer value) {
        this.lastNumberChangeEvent = value;
    }

    /**
     * Gets the value of the lastConnectionEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastConnectionEvent() {
        return lastConnectionEvent;
    }

    /**
     * Sets the value of the lastConnectionEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastConnectionEvent(Integer value) {
        this.lastConnectionEvent = value;
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
