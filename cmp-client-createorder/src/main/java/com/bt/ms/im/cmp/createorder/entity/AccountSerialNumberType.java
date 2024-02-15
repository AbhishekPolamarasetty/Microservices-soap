
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccountSerialNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountSerialNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SerialNumberId" type="{http://mdsuk.com/ws/dise3g/account/dto/business}AccountSerialNumberIdType"/>
 *         &lt;element name="SerialNumberValue" type="{http://mdsuk.com/ws/dise3g/base}NetworkSerialNumberType"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="SerialStatus" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NetworkSerialStatusType"/>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSerialNumberType", namespace = "http://mdsuk.com/ws/dise3g/account/dto/business", propOrder = {
    "serialNumberId",
    "serialNumberValue",
    "effectiveDate",
    "serialStatus",
    "lastAmendedDate"
})
public class AccountSerialNumberType {

    @XmlElement(name = "SerialNumberId")
    @XmlSchemaType(name = "integer")
    protected int serialNumberId;
    @XmlElement(name = "SerialNumberValue", required = true)
    protected String serialNumberValue;
    @XmlElement(name = "EffectiveDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "SerialStatus", required = true)
    @XmlSchemaType(name = "string")
    protected NetworkSerialStatusType serialStatus;
    @XmlElement(name = "LastAmendedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the serialNumberId property.
     * 
     */
    public int getSerialNumberId() {
        return serialNumberId;
    }

    /**
     * Sets the value of the serialNumberId property.
     * 
     */
    public void setSerialNumberId(int value) {
        this.serialNumberId = value;
    }

    /**
     * Gets the value of the serialNumberValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumberValue() {
        return serialNumberValue;
    }

    /**
     * Sets the value of the serialNumberValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumberValue(String value) {
        this.serialNumberValue = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the serialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSerialStatusType }
     *     
     */
    public NetworkSerialStatusType getSerialStatus() {
        return serialStatus;
    }

    /**
     * Sets the value of the serialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSerialStatusType }
     *     
     */
    public void setSerialStatus(NetworkSerialStatusType value) {
        this.serialStatus = value;
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
