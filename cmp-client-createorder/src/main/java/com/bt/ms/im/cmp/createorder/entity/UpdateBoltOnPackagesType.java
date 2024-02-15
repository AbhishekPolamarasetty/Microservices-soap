
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateBoltOnPackagesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateBoltOnPackagesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreateBoltOnPackages" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}UpdatePackageCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateBoltOnPackagesType", propOrder = {
    "createBoltOnPackages"
})
public class UpdateBoltOnPackagesType {

    @XmlElement(name = "CreateBoltOnPackages")
    protected UpdatePackageCodeType createBoltOnPackages;

    /**
     * Gets the value of the createBoltOnPackages property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePackageCodeType }
     *     
     */
    public UpdatePackageCodeType getCreateBoltOnPackages() {
        return createBoltOnPackages;
    }

    /**
     * Sets the value of the createBoltOnPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePackageCodeType }
     *     
     */
    public void setCreateBoltOnPackages(UpdatePackageCodeType value) {
        this.createBoltOnPackages = value;
    }

}
