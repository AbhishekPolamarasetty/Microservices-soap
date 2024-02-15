
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SubscriptionOrderNumberChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionOrderNumberChangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ManagedSerialNumbers" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ManagedSerialNumbersType" minOccurs="0"/>
 *         &lt;element name="NonManagedSerialNumbers" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NonManagedSerialNumbersType" minOccurs="0"/>
 *         &lt;element name="NetworkSubCodes" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NetworkSubCodesType" minOccurs="0"/>
 *         &lt;element name="SalesAccountIdentifier" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}SalesAccountIdentifierType" minOccurs="0"/>
 *         &lt;element name="NonNetworkChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProcessDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionOrderNumberChangeType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/business", propOrder = {
    "managedSerialNumbers",
    "nonManagedSerialNumbers",
    "networkSubCodes",
    "salesAccountIdentifier",
    "nonNetworkChange",
    "processDate"
})
public class SubscriptionOrderNumberChangeType {

    @XmlElement(name = "ManagedSerialNumbers")
    protected ManagedSerialNumbersType managedSerialNumbers;
    @XmlElement(name = "NonManagedSerialNumbers")
    protected NonManagedSerialNumbersType2 nonManagedSerialNumbers;
    @XmlElement(name = "NetworkSubCodes")
    protected NetworkSubCodesType networkSubCodes;
    @XmlElement(name = "SalesAccountIdentifier")
    @XmlSchemaType(name = "integer")
    protected Integer salesAccountIdentifier;
    @XmlElement(name = "NonNetworkChange")
    protected Boolean nonNetworkChange;
    @XmlElement(name = "ProcessDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar processDate;

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
     * Gets the value of the nonNetworkChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonNetworkChange() {
        return nonNetworkChange;
    }

    /**
     * Sets the value of the nonNetworkChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonNetworkChange(Boolean value) {
        this.nonNetworkChange = value;
    }

    /**
     * Gets the value of the processDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessDate() {
        return processDate;
    }

    /**
     * Sets the value of the processDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessDate(XMLGregorianCalendar value) {
        this.processDate = value;
    }

}
