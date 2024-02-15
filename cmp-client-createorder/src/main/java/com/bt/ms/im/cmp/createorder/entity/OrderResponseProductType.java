
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderResponseProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderResponseProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ProductCode" type="{http://mdsuk.com/ws/dise3g/order/dto/business}ProductCodeType"/>
 *         &lt;element name="Comment" type="{http://mdsuk.com/ws/dise3g/order/dto/business}CommentType" minOccurs="0"/>
 *         &lt;element name="SubscriptionsDetails" type="{http://mdsuk.com/ws/dise3g/order/dto/service}OrderResponseSubscriptionsDetailsType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderResponseProductType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/service", propOrder = {

})
public class OrderResponseProductType {

    @XmlElement(name = "ProductCode", required = true)
    protected String productCode;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "SubscriptionsDetails")
    protected OrderResponseSubscriptionsDetailsType subscriptionsDetails;

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the subscriptionsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrderResponseSubscriptionsDetailsType }
     *     
     */
    public OrderResponseSubscriptionsDetailsType getSubscriptionsDetails() {
        return subscriptionsDetails;
    }

    /**
     * Sets the value of the subscriptionsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderResponseSubscriptionsDetailsType }
     *     
     */
    public void setSubscriptionsDetails(OrderResponseSubscriptionsDetailsType value) {
        this.subscriptionsDetails = value;
    }

}
