
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingPeriodCoverageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingPeriodCoverageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="CoverageType" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}CoverageTypeTypes"/>
 *         &lt;element name="CoverageValue" type="{http://mdsuk.com/ws/dise3g/base}ThreeDigitNumberType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingPeriodCoverageType", propOrder = {

})
public class PricingPeriodCoverageType {

    @XmlElement(name = "CoverageType", required = true)
    @XmlSchemaType(name = "string")
    protected CoverageTypeTypes coverageType;
    @XmlElement(name = "CoverageValue")
    @XmlSchemaType(name = "integer")
    protected int coverageValue;

    /**
     * Gets the value of the coverageType property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageTypeTypes }
     *     
     */
    public CoverageTypeTypes getCoverageType() {
        return coverageType;
    }

    /**
     * Sets the value of the coverageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageTypeTypes }
     *     
     */
    public void setCoverageType(CoverageTypeTypes value) {
        this.coverageType = value;
    }

    /**
     * Gets the value of the coverageValue property.
     * 
     */
    public int getCoverageValue() {
        return coverageValue;
    }

    /**
     * Sets the value of the coverageValue property.
     * 
     */
    public void setCoverageValue(int value) {
        this.coverageValue = value;
    }

}
