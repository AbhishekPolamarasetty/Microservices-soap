
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminationFeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminationFeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TerminationFee" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminationFeeType", namespace = "http://mdsuk.com/ws/dise3g/account/dto/business", propOrder = {
    "terminationFee"
})
public class TerminationFeeType {

    @XmlElement(name = "TerminationFee", required = true)
    protected BigDecimal terminationFee;

    /**
     * Gets the value of the terminationFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTerminationFee() {
        return terminationFee;
    }

    /**
     * Sets the value of the terminationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTerminationFee(BigDecimal value) {
        this.terminationFee = value;
    }

}
