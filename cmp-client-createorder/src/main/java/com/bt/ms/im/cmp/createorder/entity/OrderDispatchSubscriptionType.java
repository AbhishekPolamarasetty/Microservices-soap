
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderDispatchSubscriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDispatchSubscriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionIdentifier" type="{http://mdsuk.com/ws/dise3g/order/dto/business}SubscriptionIdentifierChoiceType"/>
 *         &lt;element name="HandsetDetails" type="{http://mdsuk.com/ws/dise3g/order/dto/business}HandsetDetailsType"/>
 *         &lt;element name="ContractStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDispatchSubscriptionType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/business", propOrder = {
    "subscriptionIdentifier",
    "handsetDetails",
    "contractStartDate"
})
public class OrderDispatchSubscriptionType {

    @XmlElement(name = "SubscriptionIdentifier", required = true)
    protected SubscriptionIdentifierChoiceType subscriptionIdentifier;
    @XmlElement(name = "HandsetDetails", required = true)
    protected HandsetDetailsType handsetDetails;
    @XmlElement(name = "ContractStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractStartDate;

    /**
     * Gets the value of the subscriptionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionIdentifierChoiceType }
     *     
     */
    public SubscriptionIdentifierChoiceType getSubscriptionIdentifier() {
        return subscriptionIdentifier;
    }

    /**
     * Sets the value of the subscriptionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionIdentifierChoiceType }
     *     
     */
    public void setSubscriptionIdentifier(SubscriptionIdentifierChoiceType value) {
        this.subscriptionIdentifier = value;
    }

    /**
     * Gets the value of the handsetDetails property.
     * 
     * @return
     *     possible object is
     *     {@link HandsetDetailsType }
     *     
     */
    public HandsetDetailsType getHandsetDetails() {
        return handsetDetails;
    }

    /**
     * Sets the value of the handsetDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandsetDetailsType }
     *     
     */
    public void setHandsetDetails(HandsetDetailsType value) {
        this.handsetDetails = value;
    }

    /**
     * Gets the value of the contractStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractStartDate() {
        return contractStartDate;
    }

    /**
     * Sets the value of the contractStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractStartDate(XMLGregorianCalendar value) {
        this.contractStartDate = value;
    }

}
