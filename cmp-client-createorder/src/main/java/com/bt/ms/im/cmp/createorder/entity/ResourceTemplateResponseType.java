
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ResourceTemplateResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceTemplateResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TargetIdentifier" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}QueryResourceTargetIdentifierType"/>
 *         &lt;element name="TemplateType" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}ResourceLevelType"/>
 *         &lt;element name="TemplateCode" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength5Type"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ResourceAttributes" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}ResourceAttributeResponseType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceTemplateResponseType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "targetIdentifier",
    "templateType",
    "templateCode",
    "effectiveDate",
    "resourceAttributes"
})
public class ResourceTemplateResponseType {

    @XmlElement(name = "TargetIdentifier", required = true)
    protected QueryResourceTargetIdentifierType targetIdentifier;
    @XmlElement(name = "TemplateType", required = true)
    @XmlSchemaType(name = "string")
    protected ResourceLevelType templateType;
    @XmlElement(name = "TemplateCode", required = true)
    protected String templateCode;
    @XmlElement(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "ResourceAttributes", required = true)
    protected List<ResourceAttributeResponseType> resourceAttributes;

    /**
     * Gets the value of the targetIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResourceTargetIdentifierType }
     *     
     */
    public QueryResourceTargetIdentifierType getTargetIdentifier() {
        return targetIdentifier;
    }

    /**
     * Sets the value of the targetIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResourceTargetIdentifierType }
     *     
     */
    public void setTargetIdentifier(QueryResourceTargetIdentifierType value) {
        this.targetIdentifier = value;
    }

    /**
     * Gets the value of the templateType property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceLevelType }
     *     
     */
    public ResourceLevelType getTemplateType() {
        return templateType;
    }

    /**
     * Sets the value of the templateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceLevelType }
     *     
     */
    public void setTemplateType(ResourceLevelType value) {
        this.templateType = value;
    }

    /**
     * Gets the value of the templateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateCode() {
        return templateCode;
    }

    /**
     * Sets the value of the templateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateCode(String value) {
        this.templateCode = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the resourceAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceAttributeResponseType }
     * 
     * 
     */
    public List<ResourceAttributeResponseType> getResourceAttributes() {
        if (resourceAttributes == null) {
            resourceAttributes = new ArrayList<ResourceAttributeResponseType>();
        }
        return this.resourceAttributes;
    }

}
