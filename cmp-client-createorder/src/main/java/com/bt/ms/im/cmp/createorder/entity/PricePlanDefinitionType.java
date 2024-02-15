
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricePlanDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricePlanDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PricePlanCode" type="{http://mdsuk.com/ws/dise3g/base}PricePlanCodeType"/>
 *         &lt;element name="PricePlanDescription" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30Type"/>
 *         &lt;element name="LongDescription" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength120NotRequiredType" minOccurs="0"/>
 *         &lt;element name="ToolTipText" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength300NotRequiredType" minOccurs="0"/>
 *         &lt;element name="ContractTerm" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ContractTermType" minOccurs="0"/>
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
@XmlType(name = "PricePlanDefinitionType", propOrder = {
    "pricePlanCode",
    "pricePlanDescription",
    "longDescription",
    "toolTipText",
    "contractTerm",
    "attributes"
})
public class PricePlanDefinitionType {

    @XmlElement(name = "PricePlanCode", required = true)
    protected String pricePlanCode;
    @XmlElement(name = "PricePlanDescription", required = true)
    protected String pricePlanDescription;
    @XmlElement(name = "LongDescription")
    protected String longDescription;
    @XmlElement(name = "ToolTipText")
    protected String toolTipText;
    @XmlElement(name = "ContractTerm")
    @XmlSchemaType(name = "integer")
    protected Integer contractTerm;
    @XmlElement(name = "Attributes")
    protected AttributesType attributes;

    /**
     * Gets the value of the pricePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePlanCode() {
        return pricePlanCode;
    }

    /**
     * Sets the value of the pricePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePlanCode(String value) {
        this.pricePlanCode = value;
    }

    /**
     * Gets the value of the pricePlanDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePlanDescription() {
        return pricePlanDescription;
    }

    /**
     * Sets the value of the pricePlanDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePlanDescription(String value) {
        this.pricePlanDescription = value;
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
     * Gets the value of the contractTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractTerm() {
        return contractTerm;
    }

    /**
     * Sets the value of the contractTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractTerm(Integer value) {
        this.contractTerm = value;
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
