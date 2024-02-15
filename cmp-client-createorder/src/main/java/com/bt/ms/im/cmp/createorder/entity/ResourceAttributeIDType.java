
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceAttributeIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceAttributeIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ResourceAttributeID" type="{http://mdsuk.com/ws/dise3g/base}TwoDigitNumberType"/>
 *         &lt;element name="AttributeValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceAttributeIDType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {

})
public class ResourceAttributeIDType {

    @XmlElement(name = "ResourceAttributeID", required = true)
    protected String resourceAttributeID;
    @XmlElement(name = "AttributeValue", required = true)
    protected String attributeValue;

    /**
     * Gets the value of the resourceAttributeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceAttributeID() {
        return resourceAttributeID;
    }

    /**
     * Sets the value of the resourceAttributeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceAttributeID(String value) {
        this.resourceAttributeID = value;
    }

    /**
     * Gets the value of the attributeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * Sets the value of the attributeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeValue(String value) {
        this.attributeValue = value;
    }

}
