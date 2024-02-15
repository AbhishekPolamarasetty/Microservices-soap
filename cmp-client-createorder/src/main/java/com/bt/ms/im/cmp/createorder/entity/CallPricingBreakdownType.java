
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallPricingBreakdownType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallPricingBreakdownType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccessChargeDetails" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}AccessChargeDetailsType"/>
 *         &lt;element name="ServiceChargeDetails" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}ServiceChargeDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallPricingBreakdownType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "accessChargeDetails",
    "serviceChargeDetails"
})
public class CallPricingBreakdownType {

    @XmlElement(name = "AccessChargeDetails", required = true)
    protected AccessChargeDetailsType accessChargeDetails;
    @XmlElement(name = "ServiceChargeDetails", required = true)
    protected ServiceChargeDetailsType serviceChargeDetails;

    /**
     * Gets the value of the accessChargeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AccessChargeDetailsType }
     *     
     */
    public AccessChargeDetailsType getAccessChargeDetails() {
        return accessChargeDetails;
    }

    /**
     * Sets the value of the accessChargeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessChargeDetailsType }
     *     
     */
    public void setAccessChargeDetails(AccessChargeDetailsType value) {
        this.accessChargeDetails = value;
    }

    /**
     * Gets the value of the serviceChargeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceChargeDetailsType }
     *     
     */
    public ServiceChargeDetailsType getServiceChargeDetails() {
        return serviceChargeDetails;
    }

    /**
     * Sets the value of the serviceChargeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceChargeDetailsType }
     *     
     */
    public void setServiceChargeDetails(ServiceChargeDetailsType value) {
        this.serviceChargeDetails = value;
    }

}
