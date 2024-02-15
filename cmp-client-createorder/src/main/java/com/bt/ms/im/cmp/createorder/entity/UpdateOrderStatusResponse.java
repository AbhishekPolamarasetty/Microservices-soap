
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
 *         &lt;element name="Result" type="{http://mdsuk.com/ws/dise3g/order/dto/service}UpdateOrderStatusResponseType"/>
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
    "result"
})
@XmlRootElement(name = "UpdateOrderStatusResponse", namespace = "http://mdsuk.com/ws/dise3g/order/definition")
public class UpdateOrderStatusResponse {

    @XmlElement(name = "Result", namespace = "http://mdsuk.com/ws/dise3g/order/definition", required = true)
    protected UpdateOrderStatusResponseType result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOrderStatusResponseType }
     *     
     */
    public UpdateOrderStatusResponseType getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOrderStatusResponseType }
     *     
     */
    public void setResult(UpdateOrderStatusResponseType value) {
        this.result = value;
    }

}
