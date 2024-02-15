
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefreshUpdateRecurringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefreshUpdateRecurringType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cancel" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}RefreshUpdateCancelType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefreshUpdateRecurringType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {
    "cancel"
})
public class RefreshUpdateRecurringType {

    @XmlElement(name = "Cancel", required = true)
    protected RefreshUpdateCancelType cancel;

    /**
     * Gets the value of the cancel property.
     * 
     * @return
     *     possible object is
     *     {@link RefreshUpdateCancelType }
     *     
     */
    public RefreshUpdateCancelType getCancel() {
        return cancel;
    }

    /**
     * Sets the value of the cancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefreshUpdateCancelType }
     *     
     */
    public void setCancel(RefreshUpdateCancelType value) {
        this.cancel = value;
    }

}
