
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReloadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReloadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReloadData" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}ReloadDataType"/>
 *         &lt;element name="Baskets" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}ReloadBasketsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReloadType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {
    "reloadData",
    "baskets"
})
public class ReloadType {

    @XmlElement(name = "ReloadData", required = true)
    protected ReloadDataType reloadData;
    @XmlElement(name = "Baskets")
    protected ReloadBasketsType baskets;

    /**
     * Gets the value of the reloadData property.
     * 
     * @return
     *     possible object is
     *     {@link ReloadDataType }
     *     
     */
    public ReloadDataType getReloadData() {
        return reloadData;
    }

    /**
     * Sets the value of the reloadData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReloadDataType }
     *     
     */
    public void setReloadData(ReloadDataType value) {
        this.reloadData = value;
    }

    /**
     * Gets the value of the baskets property.
     * 
     * @return
     *     possible object is
     *     {@link ReloadBasketsType }
     *     
     */
    public ReloadBasketsType getBaskets() {
        return baskets;
    }

    /**
     * Sets the value of the baskets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReloadBasketsType }
     *     
     */
    public void setBaskets(ReloadBasketsType value) {
        this.baskets = value;
    }

}
