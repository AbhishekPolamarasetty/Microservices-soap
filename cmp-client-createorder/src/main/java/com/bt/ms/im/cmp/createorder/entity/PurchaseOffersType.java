
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseOffersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOffersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PurchaseOffer" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}PurchaseOfferType" maxOccurs="5"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseOffersType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {
    "purchaseOffer"
})
public class PurchaseOffersType {

    @XmlElement(name = "PurchaseOffer", required = true)
    protected List<PurchaseOfferType> purchaseOffer;

    /**
     * Gets the value of the purchaseOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseOfferType }
     * 
     * 
     */
    public List<PurchaseOfferType> getPurchaseOffer() {
        if (purchaseOffer == null) {
            purchaseOffer = new ArrayList<PurchaseOfferType>();
        }
        return this.purchaseOffer;
    }

}
