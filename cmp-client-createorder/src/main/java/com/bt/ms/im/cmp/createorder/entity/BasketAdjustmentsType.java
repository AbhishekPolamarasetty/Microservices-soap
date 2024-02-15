
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasketAdjustmentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasketAdjustmentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BasketAdjustment" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}BasketAdjustmentType" maxOccurs="2" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasketAdjustmentsType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {
    "basketAdjustment"
})
public class BasketAdjustmentsType {

    @XmlElement(name = "BasketAdjustment", required = true)
    protected List<BasketAdjustmentType> basketAdjustment;

    /**
     * Gets the value of the basketAdjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basketAdjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasketAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasketAdjustmentType }
     * 
     * 
     */
    public List<BasketAdjustmentType> getBasketAdjustment() {
        if (basketAdjustment == null) {
            basketAdjustment = new ArrayList<BasketAdjustmentType>();
        }
        return this.basketAdjustment;
    }

}
