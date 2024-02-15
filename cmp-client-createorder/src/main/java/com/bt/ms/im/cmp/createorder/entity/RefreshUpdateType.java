
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefreshUpdateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefreshUpdateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefreshNumber" type="{http://mdsuk.com/ws/dise3g/base}ThreeDigitNumberType"/>
 *         &lt;choice>
 *           &lt;element name="Automatic" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}RefreshUpdateAutomaticType"/>
 *           &lt;element name="Recurring" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}RefreshUpdateRecurringType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefreshUpdateType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {
    "refreshNumber",
    "automatic",
    "recurring"
})
public class RefreshUpdateType {

    @XmlElement(name = "RefreshNumber")
    @XmlSchemaType(name = "integer")
    protected int refreshNumber;
    @XmlElement(name = "Automatic")
    protected RefreshUpdateAutomaticType automatic;
    @XmlElement(name = "Recurring")
    protected RefreshUpdateRecurringType recurring;

    /**
     * Gets the value of the refreshNumber property.
     * 
     */
    public int getRefreshNumber() {
        return refreshNumber;
    }

    /**
     * Sets the value of the refreshNumber property.
     * 
     */
    public void setRefreshNumber(int value) {
        this.refreshNumber = value;
    }

    /**
     * Gets the value of the automatic property.
     * 
     * @return
     *     possible object is
     *     {@link RefreshUpdateAutomaticType }
     *     
     */
    public RefreshUpdateAutomaticType getAutomatic() {
        return automatic;
    }

    /**
     * Sets the value of the automatic property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefreshUpdateAutomaticType }
     *     
     */
    public void setAutomatic(RefreshUpdateAutomaticType value) {
        this.automatic = value;
    }

    /**
     * Gets the value of the recurring property.
     * 
     * @return
     *     possible object is
     *     {@link RefreshUpdateRecurringType }
     *     
     */
    public RefreshUpdateRecurringType getRecurring() {
        return recurring;
    }

    /**
     * Sets the value of the recurring property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefreshUpdateRecurringType }
     *     
     */
    public void setRecurring(RefreshUpdateRecurringType value) {
        this.recurring = value;
    }

}
