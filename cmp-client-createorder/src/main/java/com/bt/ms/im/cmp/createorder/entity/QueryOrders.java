
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderHistory" type="{http://mdsuk.com/ws/dise3g/order/dto/service}QueryOrdersType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderHistory"
})
@XmlRootElement(name = "QueryOrders", namespace = "http://mdsuk.com/ws/dise3g/order/definition")
public class QueryOrders {

    @XmlElement(name = "OrderHistory", namespace = "http://mdsuk.com/ws/dise3g/order/definition", required = true)
    protected QueryOrdersType orderHistory;

    /**
     * Gets the value of the orderHistory property.
     * 
     * @return
     *     possible object is
     *     {@link QueryOrdersType }
     *     
     */
    public QueryOrdersType getOrderHistory() {
        return orderHistory;
    }

    /**
     * Sets the value of the orderHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOrdersType }
     *     
     */
    public void setOrderHistory(QueryOrdersType value) {
        this.orderHistory = value;
    }

}
