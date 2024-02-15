
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DefinitionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefinitionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BundleDefinitions" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BundleDefinitionsType" minOccurs="0"/>
 *         &lt;element name="PackageDefinitions" type="{http://mdsuk.com/ws/dise3g/services/dto/business}PackageDefinitionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefinitionsType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "bundleDefinitions",
    "packageDefinitions"
})
public class DefinitionsType {

    @XmlElement(name = "BundleDefinitions")
    protected BundleDefinitionsType bundleDefinitions;
    @XmlElement(name = "PackageDefinitions")
    protected PackageDefinitionsType packageDefinitions;

    /**
     * Gets the value of the bundleDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link BundleDefinitionsType }
     *     
     */
    public BundleDefinitionsType getBundleDefinitions() {
        return bundleDefinitions;
    }

    /**
     * Sets the value of the bundleDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleDefinitionsType }
     *     
     */
    public void setBundleDefinitions(BundleDefinitionsType value) {
        this.bundleDefinitions = value;
    }

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

}
