
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BundleDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BundleDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BundleCode" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BundleCodeType"/>
 *         &lt;element name="BundleDescription" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30Type"/>
 *         &lt;element name="LongDescription" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength120NotRequiredType" minOccurs="0"/>
 *         &lt;element name="ToolTipText" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength300NotRequiredType" minOccurs="0"/>
 *         &lt;element name="ApplyBundleServiceCode" type="{http://mdsuk.com/ws/dise3g/base}ServiceCodeType" minOccurs="0"/>
 *         &lt;element name="BundleType" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BundleTypeType"/>
 *         &lt;element name="BundleLevel" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BundleLevelType"/>
 *         &lt;element name="CurrentAllocationFirst" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Rollover" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "BundleDefinitionType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "bundleCode",
    "bundleDescription",
    "longDescription",
    "toolTipText",
    "applyBundleServiceCode",
    "bundleType",
    "bundleLevel",
    "currentAllocationFirst",
    "rollover",
    "attributes"
})
public class BundleDefinitionType {

    @XmlElement(name = "BundleCode", required = true)
    protected String bundleCode;
    @XmlElement(name = "BundleDescription", required = true)
    protected String bundleDescription;
    @XmlElement(name = "LongDescription")
    protected String longDescription;
    @XmlElement(name = "ToolTipText")
    protected String toolTipText;
    @XmlElement(name = "ApplyBundleServiceCode")
    protected String applyBundleServiceCode;
    @XmlElement(name = "BundleType", required = true)
    @XmlSchemaType(name = "string")
    protected BundleTypeType bundleType;
    @XmlElement(name = "BundleLevel", required = true)
    @XmlSchemaType(name = "string")
    protected BundleLevelType bundleLevel;
    @XmlElement(name = "CurrentAllocationFirst")
    protected boolean currentAllocationFirst;
    @XmlElement(name = "Rollover")
    protected boolean rollover;
    @XmlElement(name = "Attributes")
    protected AttributesType attributes;

    /**
     * Gets the value of the bundleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleCode() {
        return bundleCode;
    }

    /**
     * Sets the value of the bundleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleCode(String value) {
        this.bundleCode = value;
    }

    /**
     * Gets the value of the bundleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleDescription() {
        return bundleDescription;
    }

    /**
     * Sets the value of the bundleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleDescription(String value) {
        this.bundleDescription = value;
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
     * Gets the value of the applyBundleServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyBundleServiceCode() {
        return applyBundleServiceCode;
    }

    /**
     * Sets the value of the applyBundleServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyBundleServiceCode(String value) {
        this.applyBundleServiceCode = value;
    }

    /**
     * Gets the value of the bundleType property.
     * 
     * @return
     *     possible object is
     *     {@link BundleTypeType }
     *     
     */
    public BundleTypeType getBundleType() {
        return bundleType;
    }

    /**
     * Sets the value of the bundleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleTypeType }
     *     
     */
    public void setBundleType(BundleTypeType value) {
        this.bundleType = value;
    }

    /**
     * Gets the value of the bundleLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BundleLevelType }
     *     
     */
    public BundleLevelType getBundleLevel() {
        return bundleLevel;
    }

    /**
     * Sets the value of the bundleLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleLevelType }
     *     
     */
    public void setBundleLevel(BundleLevelType value) {
        this.bundleLevel = value;
    }

    /**
     * Gets the value of the currentAllocationFirst property.
     * 
     */
    public boolean isCurrentAllocationFirst() {
        return currentAllocationFirst;
    }

    /**
     * Sets the value of the currentAllocationFirst property.
     * 
     */
    public void setCurrentAllocationFirst(boolean value) {
        this.currentAllocationFirst = value;
    }

    /**
     * Gets the value of the rollover property.
     * 
     */
    public boolean isRollover() {
        return rollover;
    }

    /**
     * Sets the value of the rollover property.
     * 
     */
    public void setRollover(boolean value) {
        this.rollover = value;
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
