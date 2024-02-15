
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExclusionPeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExclusionPeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ExclusionStartTime" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength8Type" minOccurs="0"/>
 *         &lt;element name="ExclusionEndTime" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength8Type" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExclusionPeriodType", propOrder = {

})
public class ExclusionPeriodType {

    @XmlElement(name = "ExclusionStartTime")
    protected String exclusionStartTime;
    @XmlElement(name = "ExclusionEndTime")
    protected String exclusionEndTime;

    /**
     * Gets the value of the exclusionStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExclusionStartTime() {
        return exclusionStartTime;
    }

    /**
     * Sets the value of the exclusionStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExclusionStartTime(String value) {
        this.exclusionStartTime = value;
    }

    /**
     * Gets the value of the exclusionEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExclusionEndTime() {
        return exclusionEndTime;
    }

    /**
     * Sets the value of the exclusionEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExclusionEndTime(String value) {
        this.exclusionEndTime = value;
    }

}
