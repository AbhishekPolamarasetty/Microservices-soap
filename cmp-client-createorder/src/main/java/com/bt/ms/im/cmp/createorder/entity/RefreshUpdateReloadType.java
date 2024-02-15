
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefreshUpdateReloadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefreshUpdateReloadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Reload" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}RefreshUpdateReloadMethodAndOptionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefreshUpdateReloadType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {
    "reload"
})
public class RefreshUpdateReloadType {

    @XmlElement(name = "Reload")
    protected RefreshUpdateReloadMethodAndOptionType reload;

    /**
     * Gets the value of the reload property.
     * 
     * @return
     *     possible object is
     *     {@link RefreshUpdateReloadMethodAndOptionType }
     *     
     */
    public RefreshUpdateReloadMethodAndOptionType getReload() {
        return reload;
    }

    /**
     * Sets the value of the reload property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefreshUpdateReloadMethodAndOptionType }
     *     
     */
    public void setReload(RefreshUpdateReloadMethodAndOptionType value) {
        this.reload = value;
    }

}
