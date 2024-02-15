
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DlpPortInType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DlpPortInType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SubscriptionNumber" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType"/>
 *         &lt;element name="PACCode" type="{http://mdsuk.com/ws/dise3g/porting/dto/business}PacCodeType"/>
 *         &lt;element name="PACExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PACCreationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="RNO" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength2Type" minOccurs="0"/>
 *         &lt;element name="DNO" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength2Type"/>
 *         &lt;element name="RSP" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength3Type" minOccurs="0"/>
 *         &lt;element name="DSP" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength3Type"/>
 *         &lt;element name="PortDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PortStatus" type="{http://mdsuk.com/ws/dise3g/account/dto/business}PortStatusType"/>
 *         &lt;element name="Cancellable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NumberBeingPortedIn" type="{http://mdsuk.com/ws/dise3g/base}NetworkSerialNumberType"/>
 *         &lt;element name="NumberBeingReplaced" type="{http://mdsuk.com/ws/dise3g/base}NetworkSerialNumberType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DlpPortInType", namespace = "http://mdsuk.com/ws/dise3g/account/dto/business", propOrder = {

})
public class DlpPortInType {

    @XmlElement(name = "SubscriptionNumber")
    @XmlSchemaType(name = "integer")
    protected int subscriptionNumber;
    @XmlElement(name = "PACCode", required = true)
    protected String pacCode;
    @XmlElement(name = "PACExpiryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pacExpiryDate;
    @XmlElement(name = "PACCreationDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pacCreationDate;
    @XmlElement(name = "RNO")
    protected String rno;
    @XmlElement(name = "DNO", required = true)
    protected String dno;
    @XmlElement(name = "RSP")
    protected String rsp;
    @XmlElement(name = "DSP", required = true)
    protected String dsp;
    @XmlElement(name = "PortDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar portDate;
    @XmlElement(name = "PortStatus", required = true)
    @XmlSchemaType(name = "string")
    protected PortStatusType portStatus;
    @XmlElement(name = "Cancellable")
    protected Boolean cancellable;
    @XmlElement(name = "NumberBeingPortedIn", required = true)
    protected String numberBeingPortedIn;
    @XmlElement(name = "NumberBeingReplaced")
    protected String numberBeingReplaced;

    /**
     * Gets the value of the subscriptionNumber property.
     * 
     */
    public int getSubscriptionNumber() {
        return subscriptionNumber;
    }

    /**
     * Sets the value of the subscriptionNumber property.
     * 
     */
    public void setSubscriptionNumber(int value) {
        this.subscriptionNumber = value;
    }

    /**
     * Gets the value of the pacCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACCode() {
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
    public void setPACCode(String value) {
        this.pacCode = value;
    }

    /**
     * Gets the value of the pacExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPACExpiryDate() {
        return pacExpiryDate;
    }

    /**
     * Sets the value of the pacExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPACExpiryDate(XMLGregorianCalendar value) {
        this.pacExpiryDate = value;
    }

    /**
     * Gets the value of the pacCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPACCreationDate() {
        return pacCreationDate;
    }

    /**
     * Sets the value of the pacCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPACCreationDate(XMLGregorianCalendar value) {
        this.pacCreationDate = value;
    }

    /**
     * Gets the value of the rno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRNO() {
        return rno;
    }

    /**
     * Sets the value of the rno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRNO(String value) {
        this.rno = value;
    }

    /**
     * Gets the value of the dno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNO() {
        return dno;
    }

    /**
     * Sets the value of the dno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNO(String value) {
        this.dno = value;
    }

    /**
     * Gets the value of the rsp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSP() {
        return rsp;
    }

    /**
     * Sets the value of the rsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSP(String value) {
        this.rsp = value;
    }

    /**
     * Gets the value of the dsp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSP() {
        return dsp;
    }

    /**
     * Sets the value of the dsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSP(String value) {
        this.dsp = value;
    }

    /**
     * Gets the value of the portDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPortDate() {
        return portDate;
    }

    /**
     * Sets the value of the portDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPortDate(XMLGregorianCalendar value) {
        this.portDate = value;
    }

    /**
     * Gets the value of the portStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PortStatusType }
     *     
     */
    public PortStatusType getPortStatus() {
        return portStatus;
    }

    /**
     * Sets the value of the portStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortStatusType }
     *     
     */
    public void setPortStatus(PortStatusType value) {
        this.portStatus = value;
    }

    /**
     * Gets the value of the cancellable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancellable() {
        return cancellable;
    }

    /**
     * Sets the value of the cancellable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancellable(Boolean value) {
        this.cancellable = value;
    }

    /**
     * Gets the value of the numberBeingPortedIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberBeingPortedIn() {
        return numberBeingPortedIn;
    }

    /**
     * Sets the value of the numberBeingPortedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberBeingPortedIn(String value) {
        this.numberBeingPortedIn = value;
    }

    /**
     * Gets the value of the numberBeingReplaced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberBeingReplaced() {
        return numberBeingReplaced;
    }

    /**
     * Sets the value of the numberBeingReplaced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberBeingReplaced(String value) {
        this.numberBeingReplaced = value;
    }

}
