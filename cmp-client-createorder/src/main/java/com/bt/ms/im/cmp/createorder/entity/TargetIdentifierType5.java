
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="CustomerLevel" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}CustomerLevelType"/>
 *         &lt;element name="CustomerReference" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}CustomerReferenceType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetIdentifierType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {

})
public class TargetIdentifierType5 {

    @XmlElement(name = "CustomerLevel", required = true)
    @XmlSchemaType(name = "string")
    protected CustomerLevelType4 customerLevel;
    @XmlElement(name = "CustomerReference", required = true)
    protected String customerReference;

    /**
     * Gets the value of the customerLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerLevelType4 }
     *     
     */
    public CustomerLevelType4 getCustomerLevel() {
        return customerLevel;
    }

    /**
     * Sets the value of the customerLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerLevelType4 }
     *     
     */
    public void setCustomerLevel(CustomerLevelType4 value) {
        this.customerLevel = value;
    }

    /**
     * Gets the value of the customerReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * Sets the value of the customerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReference(String value) {
        this.customerReference = value;
    }

}
