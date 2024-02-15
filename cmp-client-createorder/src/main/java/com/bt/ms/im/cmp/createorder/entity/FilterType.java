
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WholesaleServiceCharge" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}ValueType"/>
 *         &lt;element name="PreBundleServiceCharge" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}ValueType"/>
 *         &lt;element name="ServiceCharge" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}ValueType"/>
 *         &lt;element name="ServiceChargeDiscountValue" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}ValueType"/>
 *         &lt;element name="ServiceChargeCallClassification" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}CallClassificationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "wholesaleServiceCharge",
    "preBundleServiceCharge",
    "serviceCharge",
    "serviceChargeDiscountValue",
    "serviceChargeCallClassification"
})
public class FilterType {

    @XmlElement(name = "WholesaleServiceCharge", required = true)
    protected BigDecimal wholesaleServiceCharge;
    @XmlElement(name = "PreBundleServiceCharge", required = true)
    protected BigDecimal preBundleServiceCharge;
    @XmlElement(name = "ServiceCharge", required = true)
    protected BigDecimal serviceCharge;
    @XmlElement(name = "ServiceChargeDiscountValue", required = true)
    protected BigDecimal serviceChargeDiscountValue;
    @XmlElement(name = "ServiceChargeCallClassification", required = true)
    protected String serviceChargeCallClassification;

    /**
     * Gets the value of the wholesaleServiceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWholesaleServiceCharge() {
        return wholesaleServiceCharge;
    }

    /**
     * Sets the value of the wholesaleServiceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWholesaleServiceCharge(BigDecimal value) {
        this.wholesaleServiceCharge = value;
    }

    /**
     * Gets the value of the preBundleServiceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreBundleServiceCharge() {
        return preBundleServiceCharge;
    }

    /**
     * Sets the value of the preBundleServiceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreBundleServiceCharge(BigDecimal value) {
        this.preBundleServiceCharge = value;
    }

    /**
     * Gets the value of the serviceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    /**
     * Sets the value of the serviceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceCharge(BigDecimal value) {
        this.serviceCharge = value;
    }

    /**
     * Gets the value of the serviceChargeDiscountValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceChargeDiscountValue() {
        return serviceChargeDiscountValue;
    }

    /**
     * Sets the value of the serviceChargeDiscountValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceChargeDiscountValue(BigDecimal value) {
        this.serviceChargeDiscountValue = value;
    }

    /**
     * Gets the value of the serviceChargeCallClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceChargeCallClassification() {
        return serviceChargeCallClassification;
    }

    /**
     * Sets the value of the serviceChargeCallClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceChargeCallClassification(String value) {
        this.serviceChargeCallClassification = value;
    }

}
