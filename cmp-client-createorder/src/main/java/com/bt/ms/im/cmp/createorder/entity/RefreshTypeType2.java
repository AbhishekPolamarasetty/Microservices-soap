
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefreshTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefreshTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Automatic" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}RefreshAutomaticType"/>
 *         &lt;element name="Recurring" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}RefreshRecurringType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefreshTypeType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {
    "automatic",
    "recurring"
})
public class RefreshTypeType2 {

    @XmlElement(name = "Automatic")
    protected RefreshAutomaticType2 automatic;
    @XmlElement(name = "Recurring")
    protected RefreshRecurringType2 recurring;

    /**
     * Gets the value of the automatic property.
     * 
     * @return
     *     possible object is
     *     {@link RefreshAutomaticType2 }
     *     
     */
    public RefreshAutomaticType2 getAutomatic() {
        return automatic;
    }

    /**
     * Sets the value of the automatic property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefreshAutomaticType2 }
     *     
     */
    public void setAutomatic(RefreshAutomaticType2 value) {
        this.automatic = value;
    }

    /**
     * Gets the value of the recurring property.
     * 
     * @return
     *     possible object is
     *     {@link RefreshRecurringType2 }
     *     
     */
    public RefreshRecurringType2 getRecurring() {
        return recurring;
    }

    /**
     * Sets the value of the recurring property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefreshRecurringType2 }
     *     
     */
    public void setRecurring(RefreshRecurringType2 value) {
        this.recurring = value;
    }

}
