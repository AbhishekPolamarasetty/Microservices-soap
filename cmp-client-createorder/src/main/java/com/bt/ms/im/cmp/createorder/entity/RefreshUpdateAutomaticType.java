
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefreshUpdateAutomaticType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefreshUpdateAutomaticType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Update" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}RefreshUpdateReloadType"/>
 *         &lt;element name="Disable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Enable" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}RefreshUpdateAutomaticEnableType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefreshUpdateAutomaticType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {
    "update",
    "disable",
    "enable"
})
public class RefreshUpdateAutomaticType {

    @XmlElement(name = "Update")
    protected RefreshUpdateReloadType update;
    @XmlElement(name = "Disable")
    protected Boolean disable;
    @XmlElement(name = "Enable")
    protected RefreshUpdateAutomaticEnableType enable;

    /**
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link RefreshUpdateReloadType }
     *     
     */
    public RefreshUpdateReloadType getUpdate() {
        return update;
    }

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefreshUpdateReloadType }
     *     
     */
    public void setUpdate(RefreshUpdateReloadType value) {
        this.update = value;
    }

    /**
     * Gets the value of the disable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisable() {
        return disable;
    }

    /**
     * Sets the value of the disable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisable(Boolean value) {
        this.disable = value;
    }

    /**
     * Gets the value of the enable property.
     * 
     * @return
     *     possible object is
     *     {@link RefreshUpdateAutomaticEnableType }
     *     
     */
    public RefreshUpdateAutomaticEnableType getEnable() {
        return enable;
    }

    /**
     * Sets the value of the enable property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefreshUpdateAutomaticEnableType }
     *     
     */
    public void setEnable(RefreshUpdateAutomaticEnableType value) {
        this.enable = value;
    }

}
