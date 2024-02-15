
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleCreateAccountSerialNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleCreateAccountSerialNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SerialNumberId" type="{http://mdsuk.com/ws/dise3g/account/dto/business}AccountSerialNumberIdType"/>
 *         &lt;element name="SerialNumberValue" type="{http://mdsuk.com/ws/dise3g/base}NetworkSerialNumberType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleCreateAccountSerialNumberType", namespace = "http://mdsuk.com/ws/dise3g/account/dto/business", propOrder = {
    "serialNumberId",
    "serialNumberValue"
})
public class SimpleCreateAccountSerialNumberType {

    @XmlElement(name = "SerialNumberId")
    @XmlSchemaType(name = "integer")
    protected int serialNumberId;
    @XmlElement(name = "SerialNumberValue", required = true)
    protected String serialNumberValue;

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

}
