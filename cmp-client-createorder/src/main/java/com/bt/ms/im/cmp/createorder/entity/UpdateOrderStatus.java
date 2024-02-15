
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
 *         &lt;element name="UpdateData" type="{http://mdsuk.com/ws/dise3g/order/dto/service}UpdateOrderStatusType"/>
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
    "updateData"
})
@XmlRootElement(name = "UpdateOrderStatus", namespace = "http://mdsuk.com/ws/dise3g/order/definition")
public class UpdateOrderStatus {

    @XmlElement(name = "UpdateData", namespace = "http://mdsuk.com/ws/dise3g/order/definition", required = true)
    protected UpdateOrderStatusType updateData;

    /**
     * Gets the value of the updateData property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOrderStatusType }
     *     
     */
    public UpdateOrderStatusType getUpdateData() {
        return updateData;
    }

    /**
     * Sets the value of the updateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOrderStatusType }
     *     
     */
    public void setUpdateData(UpdateOrderStatusType value) {
        this.updateData = value;
    }

}
