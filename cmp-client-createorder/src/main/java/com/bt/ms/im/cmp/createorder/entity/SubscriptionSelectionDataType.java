
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionSelectionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionSelectionDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SubscriptionNumber" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType"/>
 *         &lt;element name="PrimarySerialNumber" type="{http://mdsuk.com/ws/dise3g/base}NetworkSerialNumberType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionSelectionDataType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/business", propOrder = {
    "subscriptionNumber",
    "primarySerialNumber"
})
public class SubscriptionSelectionDataType {

    @XmlElement(name = "SubscriptionNumber")
    @XmlSchemaType(name = "integer")
    protected Integer subscriptionNumber;
    @XmlElement(name = "PrimarySerialNumber")
    protected String primarySerialNumber;

    /**
     * Gets the value of the subscriptionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubscriptionNumber() {
        return subscriptionNumber;
    }

    /**
     * Sets the value of the subscriptionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubscriptionNumber(Integer value) {
        this.subscriptionNumber = value;
    }

    /**
     * Gets the value of the primarySerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimarySerialNumber() {
        return primarySerialNumber;
    }

    /**
     * Sets the value of the primarySerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimarySerialNumber(String value) {
        this.primarySerialNumber = value;
    }

}