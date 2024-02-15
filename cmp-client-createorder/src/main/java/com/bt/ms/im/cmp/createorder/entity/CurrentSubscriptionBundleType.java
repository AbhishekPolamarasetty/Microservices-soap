
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CurrentSubscriptionBundleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentSubscriptionBundleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BundleCode" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BundleCodeType"/>
 *         &lt;element name="SubscriptionNumber" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType"/>
 *         &lt;element name="PackageCode" type="{http://mdsuk.com/ws/dise3g/services/dto/business}PackageCodeType" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="AvailableUnits" type="{http://mdsuk.com/ws/dise3g/base}TenDigitNumberType"/>
 *         &lt;element name="UnitsUsed" type="{http://mdsuk.com/ws/dise3g/base}TenDigitNumberType"/>
 *         &lt;element name="ProRatedPrice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ProRatedAllocation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentSubscriptionBundleType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "bundleCode",
    "subscriptionNumber",
    "packageCode",
    "effectiveDate",
    "expiryDate",
    "availableUnits",
    "unitsUsed",
    "proRatedPrice",
    "proRatedAllocation",
    "lastAmendedDate"
})
public class CurrentSubscriptionBundleType {

    @XmlElement(name = "BundleCode", required = true)
    protected String bundleCode;
    @XmlElement(name = "SubscriptionNumber")
    @XmlSchemaType(name = "integer")
    protected int subscriptionNumber;
    @XmlElement(name = "PackageCode")
    protected String packageCode;
    @XmlElement(name = "EffectiveDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "AvailableUnits")
    @XmlSchemaType(name = "integer")
    protected long availableUnits;
    @XmlElement(name = "UnitsUsed")
    @XmlSchemaType(name = "integer")
    protected long unitsUsed;
    @XmlElement(name = "ProRatedPrice")
    protected boolean proRatedPrice;
    @XmlElement(name = "ProRatedAllocation")
    protected boolean proRatedAllocation;
    @XmlElement(name = "LastAmendedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the bundleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleCode() {
        return bundleCode;
    }

    /**
     * Sets the value of the bundleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleCode(String value) {
        this.bundleCode = value;
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
     * Gets the value of the availableUnits property.
     * 
     */
    public long getAvailableUnits() {
        return availableUnits;
    }

    /**
     * Sets the value of the availableUnits property.
     * 
     */
    public void setAvailableUnits(long value) {
        this.availableUnits = value;
    }

    /**
     * Gets the value of the unitsUsed property.
     * 
     */
    public long getUnitsUsed() {
        return unitsUsed;
    }

    /**
     * Sets the value of the unitsUsed property.
     * 
     */
    public void setUnitsUsed(long value) {
        this.unitsUsed = value;
    }

    /**
     * Gets the value of the proRatedPrice property.
     * 
     */
    public boolean isProRatedPrice() {
        return proRatedPrice;
    }

    /**
     * Sets the value of the proRatedPrice property.
     * 
     */
    public void setProRatedPrice(boolean value) {
        this.proRatedPrice = value;
    }

    /**
     * Gets the value of the proRatedAllocation property.
     * 
     */
    public boolean isProRatedAllocation() {
        return proRatedAllocation;
    }

    /**
     * Sets the value of the proRatedAllocation property.
     * 
     */
    public void setProRatedAllocation(boolean value) {
        this.proRatedAllocation = value;
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
