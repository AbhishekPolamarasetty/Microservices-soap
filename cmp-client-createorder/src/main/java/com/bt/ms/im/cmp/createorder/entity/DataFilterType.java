
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ResourceTemplateType" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}ResourceLevelType" minOccurs="0"/>
 *         &lt;element name="ResourceTemplateCode" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength6Type" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataFilterType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {

})
public class DataFilterType {

    @XmlElement(name = "ResourceTemplateType")
    @XmlSchemaType(name = "string")
    protected ResourceLevelType resourceTemplateType;
    @XmlElement(name = "ResourceTemplateCode")
    protected String resourceTemplateCode;

    /**
     * Gets the value of the resourceTemplateType property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceLevelType }
     *     
     */
    public ResourceLevelType getResourceTemplateType() {
        return resourceTemplateType;
    }

    /**
     * Sets the value of the resourceTemplateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceLevelType }
     *     
     */
    public void setResourceTemplateType(ResourceLevelType value) {
        this.resourceTemplateType = value;
    }

    /**
     * Gets the value of the resourceTemplateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceTemplateCode() {
        return resourceTemplateCode;
    }

    /**
     * Sets the value of the resourceTemplateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceTemplateCode(String value) {
        this.resourceTemplateCode = value;
    }

}
