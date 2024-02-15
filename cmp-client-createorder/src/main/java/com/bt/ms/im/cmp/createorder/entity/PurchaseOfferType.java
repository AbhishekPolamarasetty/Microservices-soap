
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ReloadOption" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength6Type"/>
 *         &lt;element name="Price" type="{http://mdsuk.com/ws/dise3g/base}Currency11_2NotRequiredType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseOfferType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {

})
public class PurchaseOfferType {

    @XmlElement(name = "ReloadOption", required = true)
    protected String reloadOption;
    @XmlElement(name = "Price")
    protected BigDecimal price;

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
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

}
