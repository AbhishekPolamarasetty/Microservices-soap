
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelRegisteredCardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelRegisteredCardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardReference" type="{http://mdsuk.com/ws/dise3g/base}PCI_CardOnFileReferenceType"/>
 *         &lt;element name="CancellationReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelRegisteredCardType", namespace = "http://mdsuk.com/ws/dise3g/account/dto/business", propOrder = {
    "cardReference",
    "cancellationReason"
})
public class CancelRegisteredCardType {

    @XmlElement(name = "CardReference", required = true)
    protected String cardReference;
    @XmlElement(name = "CancellationReason")
    protected String cancellationReason;

    /**
     * Gets the value of the cardReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardReference() {
        return cardReference;
    }

    /**
     * Sets the value of the cardReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardReference(String value) {
        this.cardReference = value;
    }

    /**
     * Gets the value of the cancellationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationReason() {
        return cancellationReason;
    }

    /**
     * Sets the value of the cancellationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationReason(String value) {
        this.cancellationReason = value;
    }

}
