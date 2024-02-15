
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasketDefinitionsAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasketDefinitionsAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BasketDefinitionAttribute" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}BasketDefinitionAttribute" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasketDefinitionsAttribute", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {
    "basketDefinitionAttribute"
})
public class BasketDefinitionsAttribute {

    @XmlElement(name = "BasketDefinitionAttribute", required = true)
    protected List<BasketDefinitionAttribute> basketDefinitionAttribute;

    /**
     * Gets the value of the basketDefinitionAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basketDefinitionAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasketDefinitionAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasketDefinitionAttribute }
     * 
     * 
     */
    public List<BasketDefinitionAttribute> getBasketDefinitionAttribute() {
        if (basketDefinitionAttribute == null) {
            basketDefinitionAttribute = new ArrayList<BasketDefinitionAttribute>();
        }
        return this.basketDefinitionAttribute;
    }

}
