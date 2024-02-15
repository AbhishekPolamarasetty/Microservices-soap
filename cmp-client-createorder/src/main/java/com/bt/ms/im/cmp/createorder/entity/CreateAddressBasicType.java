
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateAddressBasicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateAddressBasicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="PersonalAddress" type="{http://mdsuk.com/ws/dise3g/address/dto/business}CreatePersonalAddressType"/>
 *           &lt;element name="BusinessAddress" type="{http://mdsuk.com/ws/dise3g/address/dto/business}CreateBusinessAddressType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateAddressBasicType", namespace = "http://mdsuk.com/ws/dise3g/address/dto/business", propOrder = {
    "personalAddress",
    "businessAddress"
})
public class CreateAddressBasicType {

    @XmlElement(name = "PersonalAddress")
    protected CreatePersonalAddressType personalAddress;
    @XmlElement(name = "BusinessAddress")
    protected CreateBusinessAddressType businessAddress;

    /**
     * Gets the value of the personalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link CreatePersonalAddressType }
     *     
     */
    public CreatePersonalAddressType getPersonalAddress() {
        return personalAddress;
    }

    /**
     * Sets the value of the personalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreatePersonalAddressType }
     *     
     */
    public void setPersonalAddress(CreatePersonalAddressType value) {
        this.personalAddress = value;
    }

    /**
     * Gets the value of the businessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link CreateBusinessAddressType }
     *     
     */
    public CreateBusinessAddressType getBusinessAddress() {
        return businessAddress;
    }

    /**
     * Sets the value of the businessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateBusinessAddressType }
     *     
     */
    public void setBusinessAddress(CreateBusinessAddressType value) {
        this.businessAddress = value;
    }

}
