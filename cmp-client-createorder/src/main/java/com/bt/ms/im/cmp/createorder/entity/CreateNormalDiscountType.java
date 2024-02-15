
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateNormalDiscountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateNormalDiscountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Services" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}ServicesListType" minOccurs="0"/>
 *         &lt;element name="CallClassGroups" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}CallClassGroupsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateNormalDiscountType", namespace = "http://mdsuk.com/ws/dise3g/discount/dto/business", propOrder = {
    "services",
    "callClassGroups"
})
public class CreateNormalDiscountType {

    @XmlElement(name = "Services")
    protected ServicesListType services;
    @XmlElement(name = "CallClassGroups")
    protected CallClassGroupsListType callClassGroups;

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link ServicesListType }
     *     
     */
    public ServicesListType getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicesListType }
     *     
     */
    public void setServices(ServicesListType value) {
        this.services = value;
    }

    /**
     * Gets the value of the callClassGroups property.
     * 
     * @return
     *     possible object is
     *     {@link CallClassGroupsListType }
     *     
     */
    public CallClassGroupsListType getCallClassGroups() {
        return callClassGroups;
    }

    /**
     * Sets the value of the callClassGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallClassGroupsListType }
     *     
     */
    public void setCallClassGroups(CallClassGroupsListType value) {
        this.callClassGroups = value;
    }

}
