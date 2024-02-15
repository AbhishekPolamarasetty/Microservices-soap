
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrePayUsageSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrePayUsageSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalPrePayValue" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}PrePayValueType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrePayUsageSummaryType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "totalPrePayValue"
})
public class PrePayUsageSummaryType {

    @XmlElement(name = "TotalPrePayValue")
    protected BigDecimal totalPrePayValue;

    /**
     * Gets the value of the totalPrePayValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPrePayValue() {
        return totalPrePayValue;
    }

    /**
     * Sets the value of the totalPrePayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPrePayValue(BigDecimal value) {
        this.totalPrePayValue = value;
    }

}
