
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasketsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasketsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Basket" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}BasketType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasketsType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {
    "basket"
})
public class BasketsType2 {

    @XmlElement(name = "Basket", required = true)
    protected List<BasketType2> basket;

    /**
     * Gets the value of the basket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasketType2 }
     * 
     * 
     */
    public List<BasketType2> getBasket() {
        if (basket == null) {
            basket = new ArrayList<BasketType2>();
        }
        return this.basket;
    }

}