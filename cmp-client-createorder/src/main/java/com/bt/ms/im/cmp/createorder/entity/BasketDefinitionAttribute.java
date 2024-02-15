
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasketDefinitionAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasketDefinitionAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="BasketDefinitionAttributeSeqNo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="BasketDefinitionAttributeValue" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength100NotRequiredType" minOccurs="0"/>
 *         &lt;element name="BasketDefinitionAttributeType" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30NotRequiredType" minOccurs="0"/>
 *         &lt;element name="BasketDefinitionAttributeTypeDescription" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30NotRequiredType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasketDefinitionAttribute", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {

})
public class BasketDefinitionAttribute {

    @XmlElement(name = "BasketDefinitionAttributeSeqNo")
    protected BigInteger basketDefinitionAttributeSeqNo;
    @XmlElement(name = "BasketDefinitionAttributeValue")
    protected String basketDefinitionAttributeValue;
    @XmlElement(name = "BasketDefinitionAttributeType")
    protected String basketDefinitionAttributeType;
    @XmlElement(name = "BasketDefinitionAttributeTypeDescription")
    protected String basketDefinitionAttributeTypeDescription;

    /**
     * Gets the value of the basketDefinitionAttributeSeqNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBasketDefinitionAttributeSeqNo() {
        return basketDefinitionAttributeSeqNo;
    }

    /**
     * Sets the value of the basketDefinitionAttributeSeqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBasketDefinitionAttributeSeqNo(BigInteger value) {
        this.basketDefinitionAttributeSeqNo = value;
    }

    /**
     * Gets the value of the basketDefinitionAttributeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasketDefinitionAttributeValue() {
        return basketDefinitionAttributeValue;
    }

    /**
     * Sets the value of the basketDefinitionAttributeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasketDefinitionAttributeValue(String value) {
        this.basketDefinitionAttributeValue = value;
    }

    /**
     * Gets the value of the basketDefinitionAttributeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasketDefinitionAttributeType() {
        return basketDefinitionAttributeType;
    }

    /**
     * Sets the value of the basketDefinitionAttributeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasketDefinitionAttributeType(String value) {
        this.basketDefinitionAttributeType = value;
    }

    /**
     * Gets the value of the basketDefinitionAttributeTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasketDefinitionAttributeTypeDescription() {
        return basketDefinitionAttributeTypeDescription;
    }

    /**
     * Sets the value of the basketDefinitionAttributeTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasketDefinitionAttributeTypeDescription(String value) {
        this.basketDefinitionAttributeTypeDescription = value;
    }

}
