
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="CustomerLevel" type="{http://mdsuk.com/ws/dise3g/services/dto/business}CustomerLevelType"/>
 *         &lt;element name="CustomerLevelReference" type="{http://mdsuk.com/ws/dise3g/services/dto/business}CustomerLevelReferenceType"/>
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="serviceCode" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ServiceCodeType"/>
 *         &lt;element name="salesPersonId" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}SalesPersonNumberType" minOccurs="0"/>
 *         &lt;element name="salesAccountReference" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}SalesAccountReferenceType" minOccurs="0"/>
 *         &lt;element name="ServicePrice" type="{http://mdsuk.com/ws/dise3g/base}SignedDecimal9_2Type" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://mdsuk.com/ws/dise3g/services/dto/business}DescriptionType" minOccurs="0"/>
 *         &lt;element name="LongDescription" type="{http://mdsuk.com/ws/dise3g/services/dto/business}LongDescriptionType" minOccurs="0"/>
 *         &lt;element name="AccountServiceAgreement" type="{http://mdsuk.com/ws/dise3g/services/dto/business}CustomerLevelReferenceType" minOccurs="0"/>
 *         &lt;element name="SuppressRemainingCharge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ContractReference" type="{http://mdsuk.com/ws/dise3g/services/dto/business}ContractReferenceType" minOccurs="0"/>
 *         &lt;element name="PriceConsolidationService" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ServiceCodeType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceType", namespace = "http://mdsuk.com/ws/dise3g/services/dto/business", propOrder = {

})
public class ServiceType {

    @XmlElement(name = "CustomerLevel", required = true)
    @XmlSchemaType(name = "string")
    protected CustomerLevelType2 customerLevel;
    @XmlElement(name = "CustomerLevelReference", required = true)
    protected String customerLevelReference;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(required = true)
    protected String serviceCode;
    @XmlSchemaType(name = "integer")
    protected Integer salesPersonId;
    @XmlSchemaType(name = "integer")
    protected Integer salesAccountReference;
    @XmlElement(name = "ServicePrice")
    protected BigDecimal servicePrice;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "LongDescription")
    protected String longDescription;
    @XmlElement(name = "AccountServiceAgreement")
    protected String accountServiceAgreement;
    @XmlElement(name = "SuppressRemainingCharge")
    protected Boolean suppressRemainingCharge;
    @XmlElement(name = "ContractReference")
    protected String contractReference;
    @XmlElement(name = "PriceConsolidationService")
    protected String priceConsolidationService;

    /**
     * Gets the value of the customerLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerLevelType2 }
     *     
     */
    public CustomerLevelType2 getCustomerLevel() {
        return customerLevel;
    }

    /**
     * Sets the value of the customerLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerLevelType2 }
     *     
     */
    public void setCustomerLevel(CustomerLevelType2 value) {
        this.customerLevel = value;
    }

    /**
     * Gets the value of the customerLevelReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLevelReference() {
        return customerLevelReference;
    }

    /**
     * Sets the value of the customerLevelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLevelReference(String value) {
        this.customerLevelReference = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the salesPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalesPersonId() {
        return salesPersonId;
    }

    /**
     * Sets the value of the salesPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalesPersonId(Integer value) {
        this.salesPersonId = value;
    }

    /**
     * Gets the value of the salesAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalesAccountReference() {
        return salesAccountReference;
    }

    /**
     * Sets the value of the salesAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalesAccountReference(Integer value) {
        this.salesAccountReference = value;
    }

    /**
     * Gets the value of the servicePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServicePrice() {
        return servicePrice;
    }

    /**
     * Sets the value of the servicePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServicePrice(BigDecimal value) {
        this.servicePrice = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the longDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Sets the value of the longDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongDescription(String value) {
        this.longDescription = value;
    }

    /**
     * Gets the value of the accountServiceAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountServiceAgreement() {
        return accountServiceAgreement;
    }

    /**
     * Sets the value of the accountServiceAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountServiceAgreement(String value) {
        this.accountServiceAgreement = value;
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
     * Gets the value of the priceConsolidationService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceConsolidationService() {
        return priceConsolidationService;
    }

    /**
     * Sets the value of the priceConsolidationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceConsolidationService(String value) {
        this.priceConsolidationService = value;
    }

}
