
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HandsetDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandsetDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NetworkSerialNumber1" type="{http://mdsuk.com/ws/dise3g/base}NetworkSerialNumberType" minOccurs="0"/>
 *         &lt;element name="NetworkSerialNumber2" type="{http://mdsuk.com/ws/dise3g/base}NetworkSerialNumberType" minOccurs="0"/>
 *         &lt;element name="IMEI" type="{http://mdsuk.com/ws/dise3g/base}NetworkSerialNumberType" minOccurs="0"/>
 *         &lt;element name="NonManagedSerialNumbers" type="{http://mdsuk.com/ws/dise3g/order/dto/business}NonManagedSerialNumbersType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandsetDetailsType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/business", propOrder = {
    "networkSerialNumber1",
    "networkSerialNumber2",
    "imei",
    "nonManagedSerialNumbers"
})
public class HandsetDetailsType {

    @XmlElement(name = "NetworkSerialNumber1")
    protected String networkSerialNumber1;
    @XmlElement(name = "NetworkSerialNumber2")
    protected String networkSerialNumber2;
    @XmlElement(name = "IMEI")
    protected String imei;
    @XmlElement(name = "NonManagedSerialNumbers")
    protected NonManagedSerialNumbersType nonManagedSerialNumbers;

    /**
     * Gets the value of the networkSerialNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkSerialNumber1() {
        return networkSerialNumber1;
    }

    /**
     * Sets the value of the networkSerialNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkSerialNumber1(String value) {
        this.networkSerialNumber1 = value;
    }

    /**
     * Gets the value of the networkSerialNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkSerialNumber2() {
        return networkSerialNumber2;
    }

    /**
     * Sets the value of the networkSerialNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkSerialNumber2(String value) {
        this.networkSerialNumber2 = value;
    }

    /**
     * Gets the value of the imei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMEI() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMEI(String value) {
        this.imei = value;
    }

    /**
     * Gets the value of the nonManagedSerialNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link NonManagedSerialNumbersType }
     *     
     */
    public NonManagedSerialNumbersType getNonManagedSerialNumbers() {
        return nonManagedSerialNumbers;
    }

    /**
     * Sets the value of the nonManagedSerialNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonManagedSerialNumbersType }
     *     
     */
    public void setNonManagedSerialNumbers(NonManagedSerialNumbersType value) {
        this.nonManagedSerialNumbers = value;
    }

}
