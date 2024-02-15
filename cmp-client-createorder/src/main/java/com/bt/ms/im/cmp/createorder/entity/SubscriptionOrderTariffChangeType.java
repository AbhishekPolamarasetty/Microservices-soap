
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionOrderTariffChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionOrderTariffChangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PricePlanCode" type="{http://mdsuk.com/ws/dise3g/base}PricePlanCodeType" minOccurs="0"/>
 *         &lt;element name="TariffCode" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}TariffCodeType" minOccurs="0"/>
 *         &lt;element name="PackageCode" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}PackageCodeType" minOccurs="0"/>
 *         &lt;element name="IgnoreDefaultPackage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NonNetworkChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EndBars" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EndEventBarCode" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength4Type" minOccurs="0"/>
 *         &lt;element name="EndDialledOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EndCallClassOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ManagedSerialNumbers" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ManagedSerialNumbersType" minOccurs="0"/>
 *         &lt;element name="NonManagedSerialNumbers" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NonManagedSerialNumbersType" minOccurs="0"/>
 *         &lt;element name="NetworkSubCodes" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NetworkSubCodesType" minOccurs="0"/>
 *         &lt;element name="SalesAccountIdentifier" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}SalesAccountIdentifierType" minOccurs="0"/>
 *         &lt;element name="UpdateContractAndSales" type="{http://mdsuk.com/ws/dise3g/tariff/dto/business}TariffUpdateContractAndSalesType" minOccurs="0"/>
 *         &lt;element name="BoltOnPackages" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}UpdateBoltOnPackagesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionOrderTariffChangeType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/business", propOrder = {
    "pricePlanCode",
    "tariffCode",
    "packageCode",
    "ignoreDefaultPackage",
    "nonNetworkChange",
    "endBars",
    "endEventBarCode",
    "endDialledOverrides",
    "endCallClassOverrides",
    "managedSerialNumbers",
    "nonManagedSerialNumbers",
    "networkSubCodes",
    "salesAccountIdentifier",
    "updateContractAndSales",
    "boltOnPackages"
})
public class SubscriptionOrderTariffChangeType {

    @XmlElement(name = "PricePlanCode")
    protected String pricePlanCode;
    @XmlElement(name = "TariffCode")
    protected String tariffCode;
    @XmlElement(name = "PackageCode")
    protected String packageCode;
    @XmlElement(name = "IgnoreDefaultPackage")
    protected Boolean ignoreDefaultPackage;
    @XmlElement(name = "NonNetworkChange")
    protected boolean nonNetworkChange;
    @XmlElement(name = "EndBars")
    protected Boolean endBars;
    @XmlElement(name = "EndEventBarCode")
    protected String endEventBarCode;
    @XmlElement(name = "EndDialledOverrides")
    protected Boolean endDialledOverrides;
    @XmlElement(name = "EndCallClassOverrides")
    protected Boolean endCallClassOverrides;
    @XmlElement(name = "ManagedSerialNumbers")
    protected ManagedSerialNumbersType managedSerialNumbers;
    @XmlElement(name = "NonManagedSerialNumbers")
    protected NonManagedSerialNumbersType2 nonManagedSerialNumbers;
    @XmlElement(name = "NetworkSubCodes")
    protected NetworkSubCodesType networkSubCodes;
    @XmlElement(name = "SalesAccountIdentifier")
    @XmlSchemaType(name = "integer")
    protected Integer salesAccountIdentifier;
    @XmlElement(name = "UpdateContractAndSales")
    protected TariffUpdateContractAndSalesType updateContractAndSales;
    @XmlElement(name = "BoltOnPackages")
    protected UpdateBoltOnPackagesType boltOnPackages;

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
     * Gets the value of the nonNetworkChange property.
     * 
     */
    public boolean isNonNetworkChange() {
        return nonNetworkChange;
    }

    /**
     * Sets the value of the nonNetworkChange property.
     * 
     */
    public void setNonNetworkChange(boolean value) {
        this.nonNetworkChange = value;
    }

    /**
     * Gets the value of the endBars property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndBars() {
        return endBars;
    }

    /**
     * Sets the value of the endBars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndBars(Boolean value) {
        this.endBars = value;
    }

    /**
     * Gets the value of the endEventBarCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndEventBarCode() {
        return endEventBarCode;
    }

    /**
     * Sets the value of the endEventBarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndEventBarCode(String value) {
        this.endEventBarCode = value;
    }

    /**
     * Gets the value of the endDialledOverrides property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndDialledOverrides() {
        return endDialledOverrides;
    }

    /**
     * Sets the value of the endDialledOverrides property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndDialledOverrides(Boolean value) {
        this.endDialledOverrides = value;
    }

    /**
     * Gets the value of the endCallClassOverrides property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndCallClassOverrides() {
        return endCallClassOverrides;
    }

    /**
     * Sets the value of the endCallClassOverrides property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndCallClassOverrides(Boolean value) {
        this.endCallClassOverrides = value;
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
     * Gets the value of the salesAccountIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalesAccountIdentifier() {
        return salesAccountIdentifier;
    }

    /**
     * Sets the value of the salesAccountIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalesAccountIdentifier(Integer value) {
        this.salesAccountIdentifier = value;
    }

    /**
     * Gets the value of the updateContractAndSales property.
     * 
     * @return
     *     possible object is
     *     {@link TariffUpdateContractAndSalesType }
     *     
     */
    public TariffUpdateContractAndSalesType getUpdateContractAndSales() {
        return updateContractAndSales;
    }

    /**
     * Sets the value of the updateContractAndSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffUpdateContractAndSalesType }
     *     
     */
    public void setUpdateContractAndSales(TariffUpdateContractAndSalesType value) {
        this.updateContractAndSales = value;
    }

    /**
     * Gets the value of the boltOnPackages property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateBoltOnPackagesType }
     *     
     */
    public UpdateBoltOnPackagesType getBoltOnPackages() {
        return boltOnPackages;
    }

    /**
     * Sets the value of the boltOnPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateBoltOnPackagesType }
     *     
     */
    public void setBoltOnPackages(UpdateBoltOnPackagesType value) {
        this.boltOnPackages = value;
    }

}
