
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionConnectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionConnectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AgreementNumber" type="{http://mdsuk.com/ws/dise3g/base}AgreementNumberType" minOccurs="0"/>
 *         &lt;element name="EnquirySource" type="{http://mdsuk.com/ws/dise3g/base}EnquirySourceCodeType" minOccurs="0"/>
 *         &lt;element name="CampaignNumber" type="{http://mdsuk.com/ws/dise3g/base}CampaignCodeType" minOccurs="0"/>
 *         &lt;element name="PricePlan" type="{http://mdsuk.com/ws/dise3g/base}PricePlanCodeType" minOccurs="0"/>
 *         &lt;element name="TariffCode" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}TariffCodeType" minOccurs="0"/>
 *         &lt;element name="PackageCode" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}PackageCodeType" minOccurs="0"/>
 *         &lt;element name="IgnoreDefaultPackage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SalesAccountCode" type="{http://mdsuk.com/ws/dise3g/base}AccountNumberType" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}UserNameType" minOccurs="0"/>
 *         &lt;element name="CustomerCostCentre" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}CustomerCostCentreType" minOccurs="0"/>
 *         &lt;element name="CustomerReference" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}CustomerReferenceCodeType" minOccurs="0"/>
 *         &lt;element name="SubPassword" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}SubPasswordType" minOccurs="0"/>
 *         &lt;element name="DirectoryListingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ManagedSerialNumbers" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ManagedSerialNumbersType" minOccurs="0"/>
 *         &lt;element name="NonManagedSerialNumbers" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NonManagedSerialNumbersType" minOccurs="0"/>
 *         &lt;element name="NetworkSubCodes" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NetworkSubCodesType" minOccurs="0"/>
 *         &lt;element name="APNList" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}APNListType" minOccurs="0"/>
 *         &lt;element name="ConnectionDetails" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ConnectionDetailsType"/>
 *         &lt;element name="Address" type="{http://mdsuk.com/ws/dise3g/address/dto/business}AddressType" minOccurs="0"/>
 *         &lt;element name="Contract" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ContractType" minOccurs="0"/>
 *         &lt;element name="EmailData" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}CreateEmailType" minOccurs="0"/>
 *         &lt;element name="AttributeGroup" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}AttributeGroupType" minOccurs="0"/>
 *         &lt;element name="DonorLedPortDetails" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}SubscriptionDonorLedPortDetailsType" minOccurs="0"/>
 *         &lt;element name="PostPayCaps" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}PostPayCapsType" minOccurs="0"/>
 *         &lt;element name="AccountBond" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}RecordAccountBondType" minOccurs="0"/>
 *         &lt;element name="ParentSubscription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BoltOnPackages" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}BoltOnPackageType" minOccurs="0"/>
 *         &lt;element name="CUGNumbers" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}CUGNumbersType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionConnectionType", propOrder = {

})
public class SubscriptionConnectionType {

    @XmlElement(name = "AgreementNumber")
    @XmlSchemaType(name = "integer")
    protected Integer agreementNumber;
    @XmlElement(name = "EnquirySource")
    protected String enquirySource;
    @XmlElement(name = "CampaignNumber")
    @XmlSchemaType(name = "integer")
    protected Integer campaignNumber;
    @XmlElement(name = "PricePlan")
    protected String pricePlan;
    @XmlElement(name = "TariffCode")
    protected String tariffCode;
    @XmlElement(name = "PackageCode")
    protected String packageCode;
    @XmlElement(name = "IgnoreDefaultPackage")
    protected Boolean ignoreDefaultPackage;
    @XmlElement(name = "SalesAccountCode")
    @XmlSchemaType(name = "integer")
    protected Integer salesAccountCode;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "CustomerCostCentre")
    protected String customerCostCentre;
    @XmlElement(name = "CustomerReference")
    protected String customerReference;
    @XmlElement(name = "SubPassword")
    protected String subPassword;
    @XmlElement(name = "DirectoryListingAllowed")
    protected Boolean directoryListingAllowed;
    @XmlElement(name = "ManagedSerialNumbers")
    protected ManagedSerialNumbersType managedSerialNumbers;
    @XmlElement(name = "NonManagedSerialNumbers")
    protected NonManagedSerialNumbersType2 nonManagedSerialNumbers;
    @XmlElement(name = "NetworkSubCodes")
    protected NetworkSubCodesType networkSubCodes;
    @XmlElement(name = "APNList")
    protected APNListType apnList;
    @XmlElement(name = "ConnectionDetails", required = true)
    protected ConnectionDetailsType connectionDetails;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "Contract")
    protected ContractType contract;
    @XmlElement(name = "EmailData")
    protected CreateEmailType emailData;
    @XmlElement(name = "AttributeGroup")
    protected AttributeGroupType attributeGroup;
    @XmlElement(name = "DonorLedPortDetails")
    protected SubscriptionDonorLedPortDetailsType donorLedPortDetails;
    @XmlElement(name = "PostPayCaps")
    protected PostPayCapsType postPayCaps;
    @XmlElement(name = "AccountBond")
    protected RecordAccountBondType accountBond;
    @XmlElement(name = "ParentSubscription")
    protected Boolean parentSubscription;
    @XmlElement(name = "BoltOnPackages")
    protected BoltOnPackageType boltOnPackages;
    @XmlElement(name = "CUGNumbers")
    protected CUGNumbersType cugNumbers;

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
     * Gets the value of the enquirySource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnquirySource() {
        return enquirySource;
    }

    /**
     * Sets the value of the enquirySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnquirySource(String value) {
        this.enquirySource = value;
    }

    /**
     * Gets the value of the campaignNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCampaignNumber() {
        return campaignNumber;
    }

    /**
     * Sets the value of the campaignNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCampaignNumber(Integer value) {
        this.campaignNumber = value;
    }

    /**
     * Gets the value of the pricePlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePlan() {
        return pricePlan;
    }

    /**
     * Sets the value of the pricePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePlan(String value) {
        this.pricePlan = value;
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
     * Gets the value of the ignoreDefaultPackage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreDefaultPackage() {
        return ignoreDefaultPackage;
    }

    /**
     * Sets the value of the ignoreDefaultPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreDefaultPackage(Boolean value) {
        this.ignoreDefaultPackage = value;
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
     * Gets the value of the customerCostCentre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCostCentre() {
        return customerCostCentre;
    }

    /**
     * Sets the value of the customerCostCentre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCostCentre(String value) {
        this.customerCostCentre = value;
    }

    /**
     * Gets the value of the customerReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * Sets the value of the customerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReference(String value) {
        this.customerReference = value;
    }

    /**
     * Gets the value of the subPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubPassword() {
        return subPassword;
    }

    /**
     * Sets the value of the subPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubPassword(String value) {
        this.subPassword = value;
    }

    /**
     * Gets the value of the directoryListingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirectoryListingAllowed() {
        return directoryListingAllowed;
    }

    /**
     * Sets the value of the directoryListingAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectoryListingAllowed(Boolean value) {
        this.directoryListingAllowed = value;
    }

    /**
     * Gets the value of the managedSerialNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedSerialNumbersType }
     *     
     */
    public ManagedSerialNumbersType getManagedSerialNumbers() {
        return managedSerialNumbers;
    }

    /**
     * Sets the value of the managedSerialNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedSerialNumbersType }
     *     
     */
    public void setManagedSerialNumbers(ManagedSerialNumbersType value) {
        this.managedSerialNumbers = value;
    }

    /**
     * Gets the value of the nonManagedSerialNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link NonManagedSerialNumbersType2 }
     *     
     */
    public NonManagedSerialNumbersType2 getNonManagedSerialNumbers() {
        return nonManagedSerialNumbers;
    }

    /**
     * Sets the value of the nonManagedSerialNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonManagedSerialNumbersType2 }
     *     
     */
    public void setNonManagedSerialNumbers(NonManagedSerialNumbersType2 value) {
        this.nonManagedSerialNumbers = value;
    }

    /**
     * Gets the value of the networkSubCodes property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSubCodesType }
     *     
     */
    public NetworkSubCodesType getNetworkSubCodes() {
        return networkSubCodes;
    }

    /**
     * Sets the value of the networkSubCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSubCodesType }
     *     
     */
    public void setNetworkSubCodes(NetworkSubCodesType value) {
        this.networkSubCodes = value;
    }

    /**
     * Gets the value of the apnList property.
     * 
     * @return
     *     possible object is
     *     {@link APNListType }
     *     
     */
    public APNListType getAPNList() {
        return apnList;
    }

    /**
     * Sets the value of the apnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link APNListType }
     *     
     */
    public void setAPNList(APNListType value) {
        this.apnList = value;
    }

    /**
     * Gets the value of the connectionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionDetailsType }
     *     
     */
    public ConnectionDetailsType getConnectionDetails() {
        return connectionDetails;
    }

    /**
     * Sets the value of the connectionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionDetailsType }
     *     
     */
    public void setConnectionDetails(ConnectionDetailsType value) {
        this.connectionDetails = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    public ContractType getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     */
    public void setContract(ContractType value) {
        this.contract = value;
    }

    /**
     * Gets the value of the emailData property.
     * 
     * @return
     *     possible object is
     *     {@link CreateEmailType }
     *     
     */
    public CreateEmailType getEmailData() {
        return emailData;
    }

    /**
     * Sets the value of the emailData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateEmailType }
     *     
     */
    public void setEmailData(CreateEmailType value) {
        this.emailData = value;
    }

    /**
     * Gets the value of the attributeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeGroupType }
     *     
     */
    public AttributeGroupType getAttributeGroup() {
        return attributeGroup;
    }

    /**
     * Sets the value of the attributeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeGroupType }
     *     
     */
    public void setAttributeGroup(AttributeGroupType value) {
        this.attributeGroup = value;
    }

    /**
     * Gets the value of the donorLedPortDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionDonorLedPortDetailsType }
     *     
     */
    public SubscriptionDonorLedPortDetailsType getDonorLedPortDetails() {
        return donorLedPortDetails;
    }

    /**
     * Sets the value of the donorLedPortDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionDonorLedPortDetailsType }
     *     
     */
    public void setDonorLedPortDetails(SubscriptionDonorLedPortDetailsType value) {
        this.donorLedPortDetails = value;
    }

    /**
     * Gets the value of the postPayCaps property.
     * 
     * @return
     *     possible object is
     *     {@link PostPayCapsType }
     *     
     */
    public PostPayCapsType getPostPayCaps() {
        return postPayCaps;
    }

    /**
     * Sets the value of the postPayCaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostPayCapsType }
     *     
     */
    public void setPostPayCaps(PostPayCapsType value) {
        this.postPayCaps = value;
    }

    /**
     * Gets the value of the accountBond property.
     * 
     * @return
     *     possible object is
     *     {@link RecordAccountBondType }
     *     
     */
    public RecordAccountBondType getAccountBond() {
        return accountBond;
    }

    /**
     * Sets the value of the accountBond property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordAccountBondType }
     *     
     */
    public void setAccountBond(RecordAccountBondType value) {
        this.accountBond = value;
    }

    /**
     * Gets the value of the parentSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParentSubscription() {
        return parentSubscription;
    }

    /**
     * Sets the value of the parentSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParentSubscription(Boolean value) {
        this.parentSubscription = value;
    }

    /**
     * Gets the value of the boltOnPackages property.
     * 
     * @return
     *     possible object is
     *     {@link BoltOnPackageType }
     *     
     */
    public BoltOnPackageType getBoltOnPackages() {
        return boltOnPackages;
    }

    /**
     * Sets the value of the boltOnPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoltOnPackageType }
     *     
     */
    public void setBoltOnPackages(BoltOnPackageType value) {
        this.boltOnPackages = value;
    }

    /**
     * Gets the value of the cugNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link CUGNumbersType }
     *     
     */
    public CUGNumbersType getCUGNumbers() {
        return cugNumbers;
    }

    /**
     * Sets the value of the cugNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUGNumbersType }
     *     
     */
    public void setCUGNumbers(CUGNumbersType value) {
        this.cugNumbers = value;
    }

}
