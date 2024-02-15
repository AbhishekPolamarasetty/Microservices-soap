
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceTemplateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceTemplateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResourceTemplateCode" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength6Type"/>
 *         &lt;element name="ResourceAttribute" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}ResourceAttributeIDType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceTemplateType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "resourceTemplateCode",
    "resourceAttribute"
})
public class ResourceTemplateType {

    @XmlElement(name = "ResourceTemplateCode", required = true)
    protected String resourceTemplateCode;
    @XmlElement(name = "ResourceAttribute", required = true)
    protected List<ResourceAttributeIDType> resourceAttribute;

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

    /**
     * Gets the value of the resourceAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceAttributeIDType }
     * 
     * 
     */
    public List<ResourceAttributeIDType> getResourceAttribute() {
        if (resourceAttribute == null) {
            resourceAttribute = new ArrayList<ResourceAttributeIDType>();
        }
        return this.resourceAttribute;
    }

}
