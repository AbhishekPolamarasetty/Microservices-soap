
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefreshAutomaticType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefreshAutomaticType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReloadMethod" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength6Type"/>
 *         &lt;element name="ReloadOption" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength6Type"/>
 *         &lt;element name="LowThresholdValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RefreshStatus" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}RefreshStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefreshAutomaticType", propOrder = {
    "reloadMethod",
    "reloadOption",
    "lowThresholdValue",
    "refreshStatus"
})
public class RefreshAutomaticType {

    @XmlElement(name = "ReloadMethod", required = true)
    protected String reloadMethod;
    @XmlElement(name = "ReloadOption", required = true)
    protected String reloadOption;
    @XmlElement(name = "LowThresholdValue", required = true)
    protected String lowThresholdValue;
    @XmlElement(name = "RefreshStatus", required = true)
    @XmlSchemaType(name = "string")
    protected RefreshStatusType refreshStatus;

    /**
     * Gets the value of the reloadMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReloadMethod() {
        return reloadMethod;
    }

    /**
     * Sets the value of the reloadMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReloadMethod(String value) {
        this.reloadMethod = value;
    }

    /**
     * Gets the value of the reloadOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReloadOption() {
        return reloadOption;
    }

    /**
     * Sets the value of the reloadOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReloadOption(String value) {
        this.reloadOption = value;
    }

    /**
     * Gets the value of the lowThresholdValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowThresholdValue() {
        return lowThresholdValue;
    }

    /**
     * Sets the value of the lowThresholdValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowThresholdValue(String value) {
        this.lowThresholdValue = value;
    }

    /**
     * Gets the value of the refreshStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RefreshStatusType }
     *     
     */
    public RefreshStatusType getRefreshStatus() {
        return refreshStatus;
    }

    /**
     * Sets the value of the refreshStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefreshStatusType }
     *     
     */
    public void setRefreshStatus(RefreshStatusType value) {
        this.refreshStatus = value;
    }

}
