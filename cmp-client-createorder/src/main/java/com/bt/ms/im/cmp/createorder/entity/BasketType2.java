
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="BasketCode" type="{http://mdsuk.com/ws/dise3g/base}ServiceCodeType"/>
 *         &lt;element name="BasketDefinition" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}BasketDefinitionType" minOccurs="0"/>
 *         &lt;element name="SharedBasket" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}SharedBasketType" minOccurs="0"/>
 *         &lt;element name="Subscriptions" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}SubscriptionsType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasketType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {

})
public class BasketType2 {

    @XmlElement(name = "BasketCode", required = true)
    protected String basketCode;
    @XmlElement(name = "BasketDefinition")
    protected BasketDefinitionType basketDefinition;
    @XmlElement(name = "SharedBasket")
    protected SharedBasketType sharedBasket;
    @XmlElement(name = "Subscriptions")
    protected SubscriptionsType2 subscriptions;

    /**
     * Gets the value of the basketCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasketCode() {
        return basketCode;
    }

    /**
     * Sets the value of the basketCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasketCode(String value) {
        this.basketCode = value;
    }

    /**
     * Gets the value of the basketDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link BasketDefinitionType }
     *     
     */
    public BasketDefinitionType getBasketDefinition() {
        return basketDefinition;
    }

    /**
     * Sets the value of the basketDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasketDefinitionType }
     *     
     */
    public void setBasketDefinition(BasketDefinitionType value) {
        this.basketDefinition = value;
    }

    /**
     * Gets the value of the sharedBasket property.
     * 
     * @return
     *     possible object is
     *     {@link SharedBasketType }
     *     
     */
    public SharedBasketType getSharedBasket() {
        return sharedBasket;
    }

    /**
     * Sets the value of the sharedBasket property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedBasketType }
     *     
     */
    public void setSharedBasket(SharedBasketType value) {
        this.sharedBasket = value;
    }

    /**
     * Gets the value of the subscriptions property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionsType2 }
     *     
     */
    public SubscriptionsType2 getSubscriptions() {
        return subscriptions;
    }

    /**
     * Sets the value of the subscriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionsType2 }
     *     
     */
    public void setSubscriptions(SubscriptionsType2 value) {
        this.subscriptions = value;
    }

}
