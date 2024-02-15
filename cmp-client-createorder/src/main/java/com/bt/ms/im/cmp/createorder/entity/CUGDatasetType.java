
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CUGDatasetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUGDatasetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceCode" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ServiceCodeType"/>
 *         &lt;element name="CUGType" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}CUGEnumType"/>
 *         &lt;element name="Numbers" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NumbersType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUGDatasetType", propOrder = {
    "serviceCode",
    "cugType",
    "numbers"
})
public class CUGDatasetType {

    @XmlElement(name = "ServiceCode", required = true)
    protected String serviceCode;
    @XmlElement(name = "CUGType", required = true)
    @XmlSchemaType(name = "string")
    protected CUGEnumType cugType;
    @XmlElement(name = "Numbers", required = true)
    protected NumbersType numbers;

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the cugType property.
     * 
     * @return
     *     possible object is
     *     {@link CUGEnumType }
     *     
     */
    public CUGEnumType getCUGType() {
        return cugType;
    }

    /**
     * Sets the value of the cugType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUGEnumType }
     *     
     */
    public void setCUGType(CUGEnumType value) {
        this.cugType = value;
    }

    /**
     * Gets the value of the numbers property.
     * 
     * @return
     *     possible object is
     *     {@link NumbersType }
     *     
     */
    public NumbersType getNumbers() {
        return numbers;
    }

    /**
     * Sets the value of the numbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumbersType }
     *     
     */
    public void setNumbers(NumbersType value) {
        this.numbers = value;
    }

}
