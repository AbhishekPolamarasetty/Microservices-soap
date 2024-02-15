
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnbilledUnitSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnbilledUnitSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalPreBundleValue" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}PreBundleValueType" minOccurs="0"/>
 *         &lt;element name="TotalBundleValue" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BundleValueType" minOccurs="0"/>
 *         &lt;element name="TotalPostBundleValue" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}PostBundleValueType" minOccurs="0"/>
 *         &lt;element name="TotalDiscountValue" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}DiscountType" minOccurs="0"/>
 *         &lt;element name="TotalUnbilledValue" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}UnbilledValueType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnbilledUnitSummaryType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "totalPreBundleValue",
    "totalBundleValue",
    "totalPostBundleValue",
    "totalDiscountValue",
    "totalUnbilledValue"
})
public class UnbilledUnitSummaryType {

    @XmlElement(name = "TotalPreBundleValue")
    protected BigDecimal totalPreBundleValue;
    @XmlElement(name = "TotalBundleValue")
    protected BigDecimal totalBundleValue;
    @XmlElement(name = "TotalPostBundleValue")
    protected BigDecimal totalPostBundleValue;
    @XmlElement(name = "TotalDiscountValue")
    protected BigDecimal totalDiscountValue;
    @XmlElement(name = "TotalUnbilledValue")
    protected BigDecimal totalUnbilledValue;

    /**
     * Gets the value of the totalPreBundleValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPreBundleValue() {
        return totalPreBundleValue;
    }

    /**
     * Sets the value of the totalPreBundleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPreBundleValue(BigDecimal value) {
        this.totalPreBundleValue = value;
    }

    /**
     * Gets the value of the totalBundleValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalBundleValue() {
        return totalBundleValue;
    }

    /**
     * Sets the value of the totalBundleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalBundleValue(BigDecimal value) {
        this.totalBundleValue = value;
    }

    /**
     * Gets the value of the totalPostBundleValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPostBundleValue() {
        return totalPostBundleValue;
    }

    /**
     * Sets the value of the totalPostBundleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPostBundleValue(BigDecimal value) {
        this.totalPostBundleValue = value;
    }

    /**
     * Gets the value of the totalDiscountValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDiscountValue() {
        return totalDiscountValue;
    }

    /**
     * Sets the value of the totalDiscountValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDiscountValue(BigDecimal value) {
        this.totalDiscountValue = value;
    }

    /**
     * Gets the value of the totalUnbilledValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalUnbilledValue() {
        return totalUnbilledValue;
    }

    /**
     * Sets the value of the totalUnbilledValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalUnbilledValue(BigDecimal value) {
        this.totalUnbilledValue = value;
    }

}
