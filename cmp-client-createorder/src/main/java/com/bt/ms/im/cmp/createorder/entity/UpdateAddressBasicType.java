
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UpdateAddressBasicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateAddressBasicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressNumber" type="{http://mdsuk.com/ws/dise3g/address/dto/business}AddressCodeType"/>
 *         &lt;choice>
 *           &lt;element name="PersonalAddress" type="{http://mdsuk.com/ws/dise3g/address/dto/business}UpdatePersonalAddressType"/>
 *           &lt;element name="BusinessAddress" type="{http://mdsuk.com/ws/dise3g/address/dto/business}UpdateBusinessAddressType"/>
 *         &lt;/choice>
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
@XmlType(name = "UpdateAddressBasicType", namespace = "http://mdsuk.com/ws/dise3g/address/dto/business", propOrder = {
    "addressNumber",
    "personalAddress",
    "businessAddress",
    "lastAmendedDate"
})
public class UpdateAddressBasicType {

    @XmlElement(name = "AddressNumber")
    @XmlSchemaType(name = "integer")
    protected int addressNumber;
    @XmlElement(name = "PersonalAddress")
    protected UpdatePersonalAddressType personalAddress;
    @XmlElement(name = "BusinessAddress")
    protected UpdateBusinessAddressType businessAddress;
    @XmlElement(name = "LastAmendedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the addressNumber property.
     * 
     */
    public int getAddressNumber() {
        return addressNumber;
    }

    /**
     * Sets the value of the addressNumber property.
     * 
     */
    public void setAddressNumber(int value) {
        this.addressNumber = value;
    }

    /**
     * Gets the value of the personalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePersonalAddressType }
     *     
     */
    public UpdatePersonalAddressType getPersonalAddress() {
        return personalAddress;
    }

    /**
     * Sets the value of the personalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePersonalAddressType }
     *     
     */
    public void setPersonalAddress(UpdatePersonalAddressType value) {
        this.personalAddress = value;
    }

    /**
     * Gets the value of the businessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateBusinessAddressType }
     *     
     */
    public UpdateBusinessAddressType getBusinessAddress() {
        return businessAddress;
    }

    /**
     * Sets the value of the businessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateBusinessAddressType }
     *     
     */
    public void setBusinessAddress(UpdateBusinessAddressType value) {
        this.businessAddress = value;
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
