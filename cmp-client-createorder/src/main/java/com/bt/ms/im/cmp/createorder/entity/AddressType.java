
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="PersonalAddress" type="{http://mdsuk.com/ws/dise3g/address/dto/business}PersonalAddressType"/>
 *         &lt;element name="BusinessAddress" type="{http://mdsuk.com/ws/dise3g/address/dto/business}BusinessAddressType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", namespace = "http://mdsuk.com/ws/dise3g/address/dto/business", propOrder = {
    "personalAddress",
    "businessAddress"
})
public class AddressType {

    @XmlElement(name = "PersonalAddress")
    protected PersonalAddressType personalAddress;
    @XmlElement(name = "BusinessAddress")
    protected BusinessAddressType businessAddress;

    /**
     * Gets the value of the personalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalAddressType }
     *     
     */
    public PersonalAddressType getPersonalAddress() {
        return personalAddress;
    }

    /**
     * Sets the value of the personalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalAddressType }
     *     
     */
    public void setPersonalAddress(PersonalAddressType value) {
        this.personalAddress = value;
    }

    /**
     * Gets the value of the businessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessAddressType }
     *     
     */
    public BusinessAddressType getBusinessAddress() {
        return businessAddress;
    }

    /**
     * Sets the value of the businessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessAddressType }
     *     
     */
    public void setBusinessAddress(BusinessAddressType value) {
        this.businessAddress = value;
    }

}
