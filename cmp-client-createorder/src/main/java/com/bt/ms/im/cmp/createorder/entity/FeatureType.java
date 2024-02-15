
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="FeatureCode" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength6Type"/>
 *         &lt;element name="FeatureDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FeatureEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FeatureActivityPending" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FeatureCategoryCode" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength6Type"/>
 *         &lt;element name="FeatureCategoryDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AllowEnable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AllowDisable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureType", propOrder = {

})
public class FeatureType {

    @XmlElement(name = "FeatureCode", required = true)
    protected String featureCode;
    @XmlElement(name = "FeatureDescription", required = true)
    protected String featureDescription;
    @XmlElement(name = "FeatureEnabled")
    protected boolean featureEnabled;
    @XmlElement(name = "FeatureActivityPending")
    protected boolean featureActivityPending;
    @XmlElement(name = "FeatureCategoryCode", required = true)
    protected String featureCategoryCode;
    @XmlElement(name = "FeatureCategoryDescription", required = true)
    protected String featureCategoryDescription;
    @XmlElement(name = "AllowEnable")
    protected boolean allowEnable;
    @XmlElement(name = "AllowDisable")
    protected boolean allowDisable;

    /**
     * Gets the value of the featureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureCode() {
        return featureCode;
    }

    /**
     * Sets the value of the featureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureCode(String value) {
        this.featureCode = value;
    }

    /**
     * Gets the value of the featureDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureDescription() {
        return featureDescription;
    }

    /**
     * Sets the value of the featureDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureDescription(String value) {
        this.featureDescription = value;
    }

    /**
     * Gets the value of the featureEnabled property.
     * 
     */
    public boolean isFeatureEnabled() {
        return featureEnabled;
    }

    /**
     * Sets the value of the featureEnabled property.
     * 
     */
    public void setFeatureEnabled(boolean value) {
        this.featureEnabled = value;
    }

    /**
     * Gets the value of the featureActivityPending property.
     * 
     */
    public boolean isFeatureActivityPending() {
        return featureActivityPending;
    }

    /**
     * Sets the value of the featureActivityPending property.
     * 
     */
    public void setFeatureActivityPending(boolean value) {
        this.featureActivityPending = value;
    }

    /**
     * Gets the value of the featureCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureCategoryCode() {
        return featureCategoryCode;
    }

    /**
     * Sets the value of the featureCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureCategoryCode(String value) {
        this.featureCategoryCode = value;
    }

    /**
     * Gets the value of the featureCategoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureCategoryDescription() {
        return featureCategoryDescription;
    }

    /**
     * Sets the value of the featureCategoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureCategoryDescription(String value) {
        this.featureCategoryDescription = value;
    }

    /**
     * Gets the value of the allowEnable property.
     * 
     */
    public boolean isAllowEnable() {
        return allowEnable;
    }

    /**
     * Sets the value of the allowEnable property.
     * 
     */
    public void setAllowEnable(boolean value) {
        this.allowEnable = value;
    }

    /**
     * Gets the value of the allowDisable property.
     * 
     */
    public boolean isAllowDisable() {
        return allowDisable;
    }

    /**
     * Sets the value of the allowDisable property.
     * 
     */
    public void setAllowDisable(boolean value) {
        this.allowDisable = value;
    }

}
