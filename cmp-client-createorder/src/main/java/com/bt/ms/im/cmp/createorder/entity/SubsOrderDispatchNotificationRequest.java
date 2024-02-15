
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
 *         &lt;element name="DispatchData" type="{http://mdsuk.com/ws/dise3g/order/dto/service}OrderDispatchNotificationType"/>
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
    "dispatchData"
})
@XmlRootElement(name = "SubsOrderDispatchNotificationRequest", namespace = "http://mdsuk.com/ws/dise3g/order/definition")
public class SubsOrderDispatchNotificationRequest {

    @XmlElement(name = "DispatchData", namespace = "http://mdsuk.com/ws/dise3g/order/definition", required = true)
    protected OrderDispatchNotificationType dispatchData;

    /**
     * Gets the value of the dispatchData property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDispatchNotificationType }
     *     
     */
    public OrderDispatchNotificationType getDispatchData() {
        return dispatchData;
    }

    /**
     * Sets the value of the dispatchData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDispatchNotificationType }
     *     
     */
    public void setDispatchData(OrderDispatchNotificationType value) {
        this.dispatchData = value;
    }

}
