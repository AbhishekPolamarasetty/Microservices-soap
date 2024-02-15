
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectDebitBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectDebitBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameOfPayer" type="{http://mdsuk.com/ws/dise3g/base}NameOfPayerType" minOccurs="0"/>
 *         &lt;element name="DateMandateReceived" type="{http://mdsuk.com/ws/dise3g/base}ClearableDateType" minOccurs="0"/>
 *         &lt;element name="DDSetupMethodCode" type="{http://mdsuk.com/ws/dise3g/base}DDSetupMethodCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitBaseType", namespace = "http://mdsuk.com/ws/dise3g/payment/dto/business", propOrder = {
    "nameOfPayer",
    "dateMandateReceived",
    "ddSetupMethodCode"
})
@XmlSeeAlso({
    SEPADirectDebitType.class,
    DirectDebitType.class
})
public class DirectDebitBaseType {

    @XmlElement(name = "NameOfPayer")
    protected String nameOfPayer;
    @XmlElement(name = "DateMandateReceived")
    protected ClearableDateType dateMandateReceived;
    @XmlElement(name = "DDSetupMethodCode")
    protected String ddSetupMethodCode;

    /**
     * Gets the value of the nameOfPayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfPayer() {
        return nameOfPayer;
    }

    /**
     * Sets the value of the nameOfPayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfPayer(String value) {
        this.nameOfPayer = value;
    }

    /**
     * Gets the value of the dateMandateReceived property.
     * 
     * @return
     *     possible object is
     *     {@link ClearableDateType }
     *     
     */
    public ClearableDateType getDateMandateReceived() {
        return dateMandateReceived;
    }

    /**
     * Sets the value of the dateMandateReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearableDateType }
     *     
     */
    public void setDateMandateReceived(ClearableDateType value) {
        this.dateMandateReceived = value;
    }

    /**
     * Gets the value of the ddSetupMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDSetupMethodCode() {
        return ddSetupMethodCode;
    }

    /**
     * Sets the value of the ddSetupMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDSetupMethodCode(String value) {
        this.ddSetupMethodCode = value;
    }

}
