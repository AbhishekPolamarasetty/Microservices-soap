
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PacDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PacDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PacCode" type="{http://mdsuk.com/ws/dise3g/porting/dto/business}PacCodeType"/>
 *         &lt;element name="EntryCount" type="{http://mdsuk.com/ws/dise3g/base}FiveDigitNumberType"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SwitchType" type="{http://mdsuk.com/ws/dise3g/porting/dto/business}SwitchType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PacDetailType", namespace = "http://mdsuk.com/ws/dise3g/porting/dto/business", propOrder = {
    "pacCode",
    "entryCount",
    "creationDate",
    "expiryDate",
    "switchType"
})
public class PacDetailType {

    @XmlElement(name = "PacCode", required = true)
    protected String pacCode;
    @XmlElement(name = "EntryCount")
    @XmlSchemaType(name = "integer")
    protected int entryCount;
    @XmlElement(name = "CreationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "SwitchType")
    @XmlSchemaType(name = "string")
    protected SwitchType switchType;

    /**
     * Gets the value of the pacCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacCode() {
        return pacCode;
    }

    /**
     * Sets the value of the pacCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacCode(String value) {
        this.pacCode = value;
    }

    /**
     * Gets the value of the entryCount property.
     * 
     */
    public int getEntryCount() {
        return entryCount;
    }

    /**
     * Sets the value of the entryCount property.
     * 
     */
    public void setEntryCount(int value) {
        this.entryCount = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the switchType property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchType }
     *     
     */
    public SwitchType getSwitchType() {
        return switchType;
    }

    /**
     * Sets the value of the switchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchType }
     *     
     */
    public void setSwitchType(SwitchType value) {
        this.switchType = value;
    }

}
