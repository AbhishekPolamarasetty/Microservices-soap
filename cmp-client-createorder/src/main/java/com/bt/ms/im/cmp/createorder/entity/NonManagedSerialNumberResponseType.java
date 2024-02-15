
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NonManagedSerialNumberResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonManagedSerialNumberResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NonManagedSerialNumberType">
 *       &lt;sequence>
 *         &lt;element name="NetworkEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NetworkSerialStatus" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NetworkSerialStatusType" minOccurs="0"/>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonManagedSerialNumberResponseType", propOrder = {
    "networkEffectiveDate",
    "networkSerialStatus",
    "lastAmendedDate"
})
public class NonManagedSerialNumberResponseType
    extends NonManagedSerialNumberType
{

    @XmlElement(name = "NetworkEffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar networkEffectiveDate;
    @XmlElement(name = "NetworkSerialStatus")
    @XmlSchemaType(name = "string")
    protected NetworkSerialStatusType networkSerialStatus;
    @XmlElement(name = "LastAmendedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the networkEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNetworkEffectiveDate() {
        return networkEffectiveDate;
    }

    /**
     * Sets the value of the networkEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNetworkEffectiveDate(XMLGregorianCalendar value) {
        this.networkEffectiveDate = value;
    }

    /**
     * Gets the value of the networkSerialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSerialStatusType }
     *     
     */
    public NetworkSerialStatusType getNetworkSerialStatus() {
        return networkSerialStatus;
    }

    /**
     * Sets the value of the networkSerialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSerialStatusType }
     *     
     */
    public void setNetworkSerialStatus(NetworkSerialStatusType value) {
        this.networkSerialStatus = value;
    }

    /**
     * Gets the value of the lastAmendedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAmendedDate() {
        return lastAmendedDate;
    }

    /**
     * Sets the value of the lastAmendedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAmendedDate(XMLGregorianCalendar value) {
        this.lastAmendedDate = value;
    }

}
