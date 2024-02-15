
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackagesToExpireType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagesToExpireType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BasePackage" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ExpirePackageType" minOccurs="0"/>
 *         &lt;element name="BoltOnPackages" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ExpireBoltOnPackagesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagesToExpireType", propOrder = {
    "basePackage",
    "boltOnPackages"
})
public class PackagesToExpireType {

    @XmlElement(name = "BasePackage")
    protected ExpirePackageType basePackage;
    @XmlElement(name = "BoltOnPackages")
    protected ExpireBoltOnPackagesType boltOnPackages;

    /**
     * Gets the value of the basePackage property.
     * 
     * @return
     *     possible object is
     *     {@link ExpirePackageType }
     *     
     */
    public ExpirePackageType getBasePackage() {
        return basePackage;
    }

    /**
     * Sets the value of the basePackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpirePackageType }
     *     
     */
    public void setBasePackage(ExpirePackageType value) {
        this.basePackage = value;
    }

    /**
     * Gets the value of the boltOnPackages property.
     * 
     * @return
     *     possible object is
     *     {@link ExpireBoltOnPackagesType }
     *     
     */
    public ExpireBoltOnPackagesType getBoltOnPackages() {
        return boltOnPackages;
    }

    /**
     * Sets the value of the boltOnPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpireBoltOnPackagesType }
     *     
     */
    public void setBoltOnPackages(ExpireBoltOnPackagesType value) {
        this.boltOnPackages = value;
    }

}
