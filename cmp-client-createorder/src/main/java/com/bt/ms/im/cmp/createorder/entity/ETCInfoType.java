
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ETCInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ETCInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactID" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength100Type" minOccurs="0"/>
 *         &lt;element name="RequestorMobileNumber" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength25Type" minOccurs="0"/>
 *         &lt;element name="RequestorEmail" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30Type" minOccurs="0"/>
 *         &lt;element name="RequestChannel" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength1Type" minOccurs="0"/>
 *         &lt;element name="EstimatedTerminationDate" type="{http://mdsuk.com/ws/dise3g/porting/dto/business}TerminationDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ETCInfoType", namespace = "http://mdsuk.com/ws/dise3g/porting/dto/business", propOrder = {
    "contactID",
    "requestorMobileNumber",
    "requestorEmail",
    "requestChannel",
    "estimatedTerminationDate"
})
public class ETCInfoType {

    @XmlElement(name = "ContactID")
    protected String contactID;
    @XmlElement(name = "RequestorMobileNumber")
    protected String requestorMobileNumber;
    @XmlElement(name = "RequestorEmail")
    protected String requestorEmail;
    @XmlElement(name = "RequestChannel")
    protected String requestChannel;
    @XmlElement(name = "EstimatedTerminationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar estimatedTerminationDate;

    /**
     * Gets the value of the contactID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactID() {
        return contactID;
    }

    /**
     * Sets the value of the contactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactID(String value) {
        this.contactID = value;
    }

    /**
     * Gets the value of the requestorMobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorMobileNumber() {
        return requestorMobileNumber;
    }

    /**
     * Sets the value of the requestorMobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestorMobileNumber(String value) {
        this.requestorMobileNumber = value;
    }

    /**
     * Gets the value of the requestorEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorEmail() {
        return requestorEmail;
    }

    /**
     * Sets the value of the requestorEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestorEmail(String value) {
        this.requestorEmail = value;
    }

    /**
     * Gets the value of the requestChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestChannel() {
        return requestChannel;
    }

    /**
     * Sets the value of the requestChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestChannel(String value) {
        this.requestChannel = value;
    }

    /**
     * Gets the value of the estimatedTerminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedTerminationDate() {
        return estimatedTerminationDate;
    }

    /**
     * Sets the value of the estimatedTerminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedTerminationDate(XMLGregorianCalendar value) {
        this.estimatedTerminationDate = value;
    }

}
