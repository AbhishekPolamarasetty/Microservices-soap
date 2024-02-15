
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopUpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopUpType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TopUpData" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}ReloadDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopUpType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {
    "topUpData"
})
public class TopUpType {

    @XmlElement(name = "TopUpData", required = true)
    protected ReloadDataType topUpData;

    /**
     * Gets the value of the topUpData property.
     * 
     * @return
     *     possible object is
     *     {@link ReloadDataType }
     *     
     */
    public ReloadDataType getTopUpData() {
        return topUpData;
    }

    /**
     * Sets the value of the topUpData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReloadDataType }
     *     
     */
    public void setTopUpData(ReloadDataType value) {
        this.topUpData = value;
    }

}
