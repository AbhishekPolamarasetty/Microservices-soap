
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateCUGNumbersListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateCUGNumbersListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUGNumber" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}NetworkSerialNumberType"/>
 *         &lt;element name="CUGNumberDescription" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}CUGNumberDescriptionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateCUGNumbersListType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "cugNumber",
    "cugNumberDescription"
})
public class CreateCUGNumbersListType {

    @XmlElement(name = "CUGNumber", required = true)
    protected String cugNumber;
    @XmlElement(name = "CUGNumberDescription")
    protected String cugNumberDescription;

    /**
     * Gets the value of the cugNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUGNumber() {
        return cugNumber;
    }

    /**
     * Sets the value of the cugNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUGNumber(String value) {
        this.cugNumber = value;
    }

    /**
     * Gets the value of the cugNumberDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUGNumberDescription() {
        return cugNumberDescription;
    }

    /**
     * Sets the value of the cugNumberDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUGNumberDescription(String value) {
        this.cugNumberDescription = value;
    }

}
