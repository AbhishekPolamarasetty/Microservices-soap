
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ActivateDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivateDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ContractNumber" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ContractNumberType" minOccurs="0"/>
 *         &lt;element name="ContractTerm" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ContractTermType" minOccurs="0"/>
 *         &lt;element name="ContractStartedOn" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivateDataType", propOrder = {

})
public class ActivateDataType {

    @XmlElement(name = "ContractNumber")
    protected String contractNumber;
    @XmlElement(name = "ContractTerm")
    @XmlSchemaType(name = "integer")
    protected Integer contractTerm;
    @XmlElement(name = "ContractStartedOn")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractStartedOn;

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the contractTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractTerm() {
        return contractTerm;
    }

    /**
     * Sets the value of the contractTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractTerm(Integer value) {
        this.contractTerm = value;
    }

    /**
     * Gets the value of the contractStartedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractStartedOn() {
        return contractStartedOn;
    }

    /**
     * Sets the value of the contractStartedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractStartedOn(XMLGregorianCalendar value) {
        this.contractStartedOn = value;
    }

}
