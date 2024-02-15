
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CUGNumberInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUGNumberInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NetworkSerialNumber" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}NetworkSerialNumberType" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SubscriptionNumber" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType"/>
 *         &lt;element name="CUGProvisioningStatus" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}CUGProvisioningStatusType"/>
 *         &lt;element name="CUGAllowDeletion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUGNumberInfoType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "networkSerialNumber",
    "effectiveDate",
    "expiryDate",
    "subscriptionNumber",
    "cugProvisioningStatus",
    "cugAllowDeletion",
    "lastAmendedDate"
})
public class CUGNumberInfoType {

    @XmlElement(name = "NetworkSerialNumber")
    protected String networkSerialNumber;
    @XmlElement(name = "EffectiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "SubscriptionNumber")
    @XmlSchemaType(name = "integer")
    protected int subscriptionNumber;
    @XmlElement(name = "CUGProvisioningStatus", required = true)
    @XmlSchemaType(name = "string")
    protected CUGProvisioningStatusType cugProvisioningStatus;
    @XmlElement(name = "CUGAllowDeletion")
    protected boolean cugAllowDeletion;
    @XmlElement(name = "LastAmendedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the networkSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkSerialNumber() {
        return networkSerialNumber;
    }

    /**
     * Sets the value of the networkSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkSerialNumber(String value) {
        this.networkSerialNumber = value;
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
     * Gets the value of the cugProvisioningStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CUGProvisioningStatusType }
     *     
     */
    public CUGProvisioningStatusType getCUGProvisioningStatus() {
        return cugProvisioningStatus;
    }

    /**
     * Sets the value of the cugProvisioningStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUGProvisioningStatusType }
     *     
     */
    public void setCUGProvisioningStatus(CUGProvisioningStatusType value) {
        this.cugProvisioningStatus = value;
    }

    /**
     * Gets the value of the cugAllowDeletion property.
     * 
     */
    public boolean isCUGAllowDeletion() {
        return cugAllowDeletion;
    }

    /**
     * Sets the value of the cugAllowDeletion property.
     * 
     */
    public void setCUGAllowDeletion(boolean value) {
        this.cugAllowDeletion = value;
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