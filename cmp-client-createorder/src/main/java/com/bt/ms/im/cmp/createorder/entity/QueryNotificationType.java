
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for QueryNotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryNotificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationNumber" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength11Type"/>
 *         &lt;element name="SentOnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NotificationMessage" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NotificationMessageType"/>
 *         &lt;element name="NotificationStatus" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NotificationStatus"/>
 *         &lt;element name="NotificationType" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NotificationType"/>
 *         &lt;element name="NotificationSource" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength25Type"/>
 *         &lt;element name="NotificationPriority" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength1Type"/>
 *         &lt;element name="NotificationCategoryCode" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength6Type"/>
 *         &lt;element name="NotificationCategory" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30Type"/>
 *         &lt;element name="ExpireOnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryNotificationType", propOrder = {
    "notificationNumber",
    "sentOnDate",
    "notificationMessage",
    "notificationStatus",
    "notificationType",
    "notificationSource",
    "notificationPriority",
    "notificationCategoryCode",
    "notificationCategory",
    "expireOnDate"
})
public class QueryNotificationType {

    @XmlElement(name = "NotificationNumber", required = true)
    protected String notificationNumber;
    @XmlElement(name = "SentOnDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sentOnDate;
    @XmlElement(name = "NotificationMessage", required = true)
    protected String notificationMessage;
    @XmlElement(name = "NotificationStatus", required = true)
    @XmlSchemaType(name = "string")
    protected NotificationStatus notificationStatus;
    @XmlElement(name = "NotificationType", required = true)
    @XmlSchemaType(name = "string")
    protected NotificationType notificationType;
    @XmlElement(name = "NotificationSource", required = true)
    protected String notificationSource;
    @XmlElement(name = "NotificationPriority", required = true)
    protected String notificationPriority;
    @XmlElement(name = "NotificationCategoryCode", required = true)
    protected String notificationCategoryCode;
    @XmlElement(name = "NotificationCategory", required = true)
    protected String notificationCategory;
    @XmlElement(name = "ExpireOnDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expireOnDate;

    /**
     * Gets the value of the notificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationNumber() {
        return notificationNumber;
    }

    /**
     * Sets the value of the notificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationNumber(String value) {
        this.notificationNumber = value;
    }

    /**
     * Gets the value of the sentOnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentOnDate() {
        return sentOnDate;
    }

    /**
     * Sets the value of the sentOnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSentOnDate(XMLGregorianCalendar value) {
        this.sentOnDate = value;
    }

    /**
     * Gets the value of the notificationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationMessage() {
        return notificationMessage;
    }

    /**
     * Sets the value of the notificationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationMessage(String value) {
        this.notificationMessage = value;
    }

    /**
     * Gets the value of the notificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationStatus }
     *     
     */
    public NotificationStatus getNotificationStatus() {
        return notificationStatus;
    }

    /**
     * Sets the value of the notificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationStatus }
     *     
     */
    public void setNotificationStatus(NotificationStatus value) {
        this.notificationStatus = value;
    }

    /**
     * Gets the value of the notificationType property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationType }
     *     
     */
    public NotificationType getNotificationType() {
        return notificationType;
    }

    /**
     * Sets the value of the notificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType }
     *     
     */
    public void setNotificationType(NotificationType value) {
        this.notificationType = value;
    }

    /**
     * Gets the value of the notificationSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationSource() {
        return notificationSource;
    }

    /**
     * Sets the value of the notificationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationSource(String value) {
        this.notificationSource = value;
    }

    /**
     * Gets the value of the notificationPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationPriority() {
        return notificationPriority;
    }

    /**
     * Sets the value of the notificationPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationPriority(String value) {
        this.notificationPriority = value;
    }

    /**
     * Gets the value of the notificationCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationCategoryCode() {
        return notificationCategoryCode;
    }

    /**
     * Sets the value of the notificationCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationCategoryCode(String value) {
        this.notificationCategoryCode = value;
    }

    /**
     * Gets the value of the notificationCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationCategory() {
        return notificationCategory;
    }

    /**
     * Sets the value of the notificationCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationCategory(String value) {
        this.notificationCategory = value;
    }

    /**
     * Gets the value of the expireOnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireOnDate() {
        return expireOnDate;
    }

    /**
     * Sets the value of the expireOnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireOnDate(XMLGregorianCalendar value) {
        this.expireOnDate = value;
    }

}
