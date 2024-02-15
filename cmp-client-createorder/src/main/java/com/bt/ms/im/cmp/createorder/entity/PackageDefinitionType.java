
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PackageCode" type="{http://mdsuk.com/ws/dise3g/services/dto/business}PackageCodeType"/>
 *         &lt;element name="PackageClassification" type="{http://mdsuk.com/ws/dise3g/services/dto/business}PackageClassificationType"/>
 *         &lt;element name="PackageDescription" type="{http://mdsuk.com/ws/dise3g/services/dto/business}DescriptionType"/>
 *         &lt;element name="LongDescription" type="{http://mdsuk.com/ws/dise3g/services/dto/business}LongDescriptionType" minOccurs="0"/>
 *         &lt;element name="ToolTipText" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength300NotRequiredType" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{http://mdsuk.com/ws/dise3g/base}AttributesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageDefinitionType", namespace = "http://mdsuk.com/ws/dise3g/services/dto/business", propOrder = {
    "packageCode",
    "packageClassification",
    "packageDescription",
    "longDescription",
    "toolTipText",
    "attributes"
})
public class PackageDefinitionType {

    @XmlElement(name = "PackageCode", required = true)
    protected String packageCode;
    @XmlElement(name = "PackageClassification", required = true)
    @XmlSchemaType(name = "string")
    protected PackageClassificationType2 packageClassification;
    @XmlElement(name = "PackageDescription", required = true)
    protected String packageDescription;
    @XmlElement(name = "LongDescription")
    protected String longDescription;
    @XmlElement(name = "ToolTipText")
    protected String toolTipText;
    @XmlElement(name = "Attributes")
    protected AttributesType attributes;

    /**
     * Gets the value of the packageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageCode() {
        return packageCode;
    }

    /**
     * Sets the value of the packageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageCode(String value) {
        this.packageCode = value;
    }

    /**
     * Gets the value of the packageClassification property.
     * 
     * @return
     *     possible object is
     *     {@link PackageClassificationType2 }
     *     
     */
    public PackageClassificationType2 getPackageClassification() {
        return packageClassification;
    }

    /**
     * Sets the value of the packageClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageClassificationType2 }
     *     
     */
    public void setPackageClassification(PackageClassificationType2 value) {
        this.packageClassification = value;
    }

    /**
     * Gets the value of the packageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageDescription() {
        return packageDescription;
    }

    /**
     * Sets the value of the packageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageDescription(String value) {
        this.packageDescription = value;
    }

    /**
     * Gets the value of the longDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Sets the value of the longDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongDescription(String value) {
        this.longDescription = value;
    }

    /**
     * Gets the value of the toolTipText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolTipText() {
        return toolTipText;
    }

    /**
     * Sets the value of the toolTipText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolTipText(String value) {
        this.toolTipText = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link AttributesType }
     *     
     */
    public AttributesType getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributesType }
     *     
     */
    public void setAttributes(AttributesType value) {
        this.attributes = value;
    }

}
