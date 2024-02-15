
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryOrdersResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryOrdersResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ExternalReference" type="{http://mdsuk.com/ws/dise3g/base}ExternalReferenceType" minOccurs="0"/>
 *         &lt;element name="QueryLimitExceeded" type="{http://mdsuk.com/ws/dise3g/base}QueryLimitExceededType"/>
 *         &lt;element name="Orders" type="{http://mdsuk.com/ws/dise3g/order/dto/business}OrdersType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryOrdersResponseType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/service", propOrder = {

})
public class QueryOrdersResponseType {

    @XmlElement(name = "ExternalReference")
    protected String externalReference;
    @XmlElement(name = "QueryLimitExceeded")
    protected boolean queryLimitExceeded;
    @XmlElement(name = "Orders", required = true)
    protected OrdersType orders;

    /**
     * Gets the value of the externalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * Sets the value of the externalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReference(String value) {
        this.externalReference = value;
    }

    /**
     * Gets the value of the queryLimitExceeded property.
     * 
     */
    public boolean isQueryLimitExceeded() {
        return queryLimitExceeded;
    }

    /**
     * Sets the value of the queryLimitExceeded property.
     * 
     */
    public void setQueryLimitExceeded(boolean value) {
        this.queryLimitExceeded = value;
    }

    /**
     * Gets the value of the orders property.
     * 
     * @return
     *     possible object is
     *     {@link OrdersType }
     *     
     */
    public OrdersType getOrders() {
        return orders;
    }

    /**
     * Sets the value of the orders property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdersType }
     *     
     */
    public void setOrders(OrdersType value) {
        this.orders = value;
    }

}
