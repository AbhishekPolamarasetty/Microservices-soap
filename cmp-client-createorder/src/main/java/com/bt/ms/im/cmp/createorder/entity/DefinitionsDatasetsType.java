
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DefinitionsDatasetsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefinitionsDatasetsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PackageDefinitions" type="{http://mdsuk.com/ws/dise3g/services/dto/business}PackageDefinitionsType" minOccurs="0"/>
 *         &lt;element name="PricePlanDefinitions" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}PricePlanDefinitionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefinitionsDatasetsType", propOrder = {
    "packageDefinitions",
    "pricePlanDefinitions"
})
public class DefinitionsDatasetsType {

    @XmlElement(name = "PackageDefinitions")
    protected PackageDefinitionsType packageDefinitions;
    @XmlElement(name = "PricePlanDefinitions")
    protected PricePlanDefinitionsType pricePlanDefinitions;

    /**
     * Gets the value of the packageDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link PackageDefinitionsType }
     *     
     */
    public PackageDefinitionsType getPackageDefinitions() {
        return packageDefinitions;
    }

    /**
     * Sets the value of the packageDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageDefinitionsType }
     *     
     */
    public void setPackageDefinitions(PackageDefinitionsType value) {
        this.packageDefinitions = value;
    }

    /**
     * Gets the value of the pricePlanDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link PricePlanDefinitionsType }
     *     
     */
    public PricePlanDefinitionsType getPricePlanDefinitions() {
        return pricePlanDefinitions;
    }

    /**
     * Sets the value of the pricePlanDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricePlanDefinitionsType }
     *     
     */
    public void setPricePlanDefinitions(PricePlanDefinitionsType value) {
        this.pricePlanDefinitions = value;
    }

}
