
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReloadDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReloadDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="EventNumber" type="{http://mdsuk.com/ws/dise3g/base}NineDigitNumberType"/>
 *         &lt;element name="ReloadMethod" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength6Type"/>
 *         &lt;element name="ReloadMethodDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReloadOption" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength6Type"/>
 *         &lt;element name="ReloadOptionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReloadPrice" type="{http://mdsuk.com/ws/dise3g/base}Currency11_2NotRequiredType"/>
 *         &lt;element name="PaymentReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateCreated" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="TimeCreated" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ExpiryTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReloadDataType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {

})
public class ReloadDataType {

    @XmlElement(name = "EventNumber")
    @XmlSchemaType(name = "integer")
    protected int eventNumber;
    @XmlElement(name = "ReloadMethod", required = true)
    protected String reloadMethod;
    @XmlElement(name = "ReloadMethodDescription", required = true)
    protected String reloadMethodDescription;
    @XmlElement(name = "ReloadOption", required = true)
    protected String reloadOption;
    @XmlElement(name = "ReloadOptionDescription", required = true)
    protected String reloadOptionDescription;
    @XmlElement(name = "ReloadPrice", required = true)
    protected BigDecimal reloadPrice;
    @XmlElement(name = "PaymentReference")
    protected String paymentReference;
    @XmlElement(name = "DateCreated", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateCreated;
    @XmlElement(name = "TimeCreated", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar timeCreated;
    @XmlElement(name = "ExpiryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "ExpiryTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar expiryTime;

    /**
     * Gets the value of the eventNumber property.
     * 
     */
    public int getEventNumber() {
        return eventNumber;
    }

    /**
     * Sets the value of the eventNumber property.
     * 
     */
    public void setEventNumber(int value) {
        this.eventNumber = value;
    }

    /**
     * Gets the value of the reloadMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReloadMethod() {
        return reloadMethod;
    }

    /**
     * Sets the value of the reloadMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReloadMethod(String value) {
        this.reloadMethod = value;
    }

    /**
     * Gets the value of the reloadMethodDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReloadMethodDescription() {
        return reloadMethodDescription;
    }

    /**
     * Sets the value of the reloadMethodDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReloadMethodDescription(String value) {
        this.reloadMethodDescription = value;
    }

    /**
     * Gets the value of the reloadOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReloadOption() {
        return reloadOption;
    }

    /**
     * Sets the value of the reloadOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReloadOption(String value) {
        this.reloadOption = value;
    }

    /**
     * Gets the value of the reloadOptionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReloadOptionDescription() {
        return reloadOptionDescription;
    }

    /**
     * Sets the value of the reloadOptionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReloadOptionDescription(String value) {
        this.reloadOptionDescription = value;
    }

    /**
     * Gets the value of the reloadPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReloadPrice() {
        return reloadPrice;
    }

    /**
     * Sets the value of the reloadPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReloadPrice(BigDecimal value) {
        this.reloadPrice = value;
    }

    /**
     * Gets the value of the paymentReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentReference() {
        return paymentReference;
    }

    /**
     * Sets the value of the paymentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentReference(String value) {
        this.paymentReference = value;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the timeCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeCreated() {
        return timeCreated;
    }

    /**
     * Sets the value of the timeCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeCreated(XMLGregorianCalendar value) {
        this.timeCreated = value;
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
     * Gets the value of the expiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryTime() {
        return expiryTime;
    }

    /**
     * Sets the value of the expiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryTime(XMLGregorianCalendar value) {
        this.expiryTime = value;
    }

}
