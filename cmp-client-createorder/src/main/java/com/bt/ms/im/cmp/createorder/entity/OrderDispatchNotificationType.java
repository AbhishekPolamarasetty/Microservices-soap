
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderDispatchNotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDispatchNotificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ExternalReference" type="{http://mdsuk.com/ws/dise3g/base}ExternalReferenceType" minOccurs="0"/>
 *         &lt;element name="OrderNumber" type="{http://mdsuk.com/ws/dise3g/order/dto/business}OrderNumberType" minOccurs="0"/>
 *         &lt;element name="CustomerReference" type="{http://mdsuk.com/ws/dise3g/order/dto/business}CustomerReferenceType" minOccurs="0"/>
 *         &lt;element name="CourierReference" type="{http://mdsuk.com/ws/dise3g/order/dto/business}CourierReferenceType" minOccurs="0"/>
 *         &lt;element name="DispatchByDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="OrderComments" type="{http://mdsuk.com/ws/dise3g/order/dto/business}CommentType" minOccurs="0"/>
 *         &lt;element name="Subscriptions" type="{http://mdsuk.com/ws/dise3g/order/dto/business}OrderDispatchSubscriptionsType" minOccurs="0"/>
 *         &lt;element name="AuditRecord" type="{http://mdsuk.com/ws/dise3g/base}AuditRecordType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDispatchNotificationType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/service", propOrder = {

})
public class OrderDispatchNotificationType {

    @XmlElement(name = "ExternalReference")
    protected String externalReference;
    @XmlElement(name = "OrderNumber")
    protected String orderNumber;
    @XmlElement(name = "CustomerReference")
    protected String customerReference;
    @XmlElement(name = "CourierReference")
    protected String courierReference;
    @XmlElement(name = "DispatchByDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dispatchByDate;
    @XmlElement(name = "OrderComments")
    protected String orderComments;
    @XmlElement(name = "Subscriptions")
    protected OrderDispatchSubscriptionsType subscriptions;
    @XmlElement(name = "AuditRecord")
    protected AuditRecordType auditRecord;

    /**
     * Gets the value of the externalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * Sets the value of the externalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReference(String value) {
        this.externalReference = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the customerReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * Sets the value of the customerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReference(String value) {
        this.customerReference = value;
    }

    /**
     * Gets the value of the courierReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourierReference() {
        return courierReference;
    }

    /**
     * Sets the value of the courierReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourierReference(String value) {
        this.courierReference = value;
    }

    /**
     * Gets the value of the dispatchByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDispatchByDate() {
        return dispatchByDate;
    }

    /**
     * Sets the value of the dispatchByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDispatchByDate(XMLGregorianCalendar value) {
        this.dispatchByDate = value;
    }

    /**
     * Gets the value of the orderComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderComments() {
        return orderComments;
    }

    /**
     * Sets the value of the orderComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderComments(String value) {
        this.orderComments = value;
    }

    /**
     * Gets the value of the subscriptions property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDispatchSubscriptionsType }
     *     
     */
    public OrderDispatchSubscriptionsType getSubscriptions() {
        return subscriptions;
    }

    /**
     * Sets the value of the subscriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDispatchSubscriptionsType }
     *     
     */
    public void setSubscriptions(OrderDispatchSubscriptionsType value) {
        this.subscriptions = value;
    }

    /**
     * Gets the value of the auditRecord property.
     * 
     * @return
     *     possible object is
     *     {@link AuditRecordType }
     *     
     */
    public AuditRecordType getAuditRecord() {
        return auditRecord;
    }

    /**
     * Sets the value of the auditRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditRecordType }
     *     
     */
    public void setAuditRecord(AuditRecordType value) {
        this.auditRecord = value;
    }

}
