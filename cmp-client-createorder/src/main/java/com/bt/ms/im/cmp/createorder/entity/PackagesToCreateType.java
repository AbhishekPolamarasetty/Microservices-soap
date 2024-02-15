
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackagesToCreateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagesToCreateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BasePackage" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}BasePackageType" minOccurs="0"/>
 *         &lt;element name="BoltOnPackages" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}BoltOnPackageType" minOccurs="0"/>
 *         &lt;element name="ExpireOverlappingServices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagesToCreateType", propOrder = {
    "basePackage",
    "boltOnPackages",
    "expireOverlappingServices"
})
public class PackagesToCreateType {

    @XmlElement(name = "BasePackage")
    protected BasePackageType basePackage;
    @XmlElement(name = "BoltOnPackages")
    protected BoltOnPackageType boltOnPackages;
    @XmlElement(name = "ExpireOverlappingServices")
    protected Boolean expireOverlappingServices;

    /**
     * Gets the value of the basePackage property.
     * 
     * @return
     *     possible object is
     *     {@link BasePackageType }
     *     
     */
    public BasePackageType getBasePackage() {
        return basePackage;
    }

    /**
     * Sets the value of the basePackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasePackageType }
     *     
     */
    public void setBasePackage(BasePackageType value) {
        this.basePackage = value;
    }

    /**
     * Gets the value of the boltOnPackages property.
     * 
     * @return
     *     possible object is
     *     {@link BoltOnPackageType }
     *     
     */
    public BoltOnPackageType getBoltOnPackages() {
        return boltOnPackages;
    }

    /**
     * Sets the value of the boltOnPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoltOnPackageType }
     *     
     */
    public void setBoltOnPackages(BoltOnPackageType value) {
        this.boltOnPackages = value;
    }

    /**
     * Gets the value of the expireOverlappingServices property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpireOverlappingServices() {
        return expireOverlappingServices;
    }

    /**
     * Sets the value of the expireOverlappingServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpireOverlappingServices(Boolean value) {
        this.expireOverlappingServices = value;
    }

}
