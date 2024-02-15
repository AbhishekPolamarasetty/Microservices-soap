
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for QueryPostPayCapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryPostPayCapType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="CapCode" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}CapCodeType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}CapDescriptionType" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}CapValueType" minOccurs="0"/>
 *         &lt;element name="UnitOfMeasure" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength8NotRequiredType" minOccurs="0"/>
 *         &lt;element name="CapType" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}CapTypeType" minOccurs="0"/>
 *         &lt;element name="CapConsumption" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}CapValueType" minOccurs="0"/>
 *         &lt;element name="CapDataType" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}CapDataTypeType" minOccurs="0"/>
 *         &lt;element name="ThresholdWorkflow" type="{http://mdsuk.com/ws/dise3g/base}NineDigitNumberType" minOccurs="0"/>
 *         &lt;element name="BreachWorkflow" type="{http://mdsuk.com/ws/dise3g/base}NineDigitNumberType" minOccurs="0"/>
 *         &lt;element name="DefaultCapAmount" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}CapValueType" minOccurs="0"/>
 *         &lt;element name="ResetAmount" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}CapValueType" minOccurs="0"/>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPostPayCapType", propOrder = {

})
public class QueryPostPayCapType {

    @XmlElement(name = "CapCode")
    protected String capCode;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "UnitOfMeasure")
    protected String unitOfMeasure;
    @XmlElement(name = "CapType")
    @XmlSchemaType(name = "string")
    protected CapTypeType capType;
    @XmlElement(name = "CapConsumption")
    protected BigDecimal capConsumption;
    @XmlElement(name = "CapDataType")
    @XmlSchemaType(name = "string")
    protected CapDataTypeType capDataType;
    @XmlElement(name = "ThresholdWorkflow")
    @XmlSchemaType(name = "integer")
    protected Integer thresholdWorkflow;
    @XmlElement(name = "BreachWorkflow")
    @XmlSchemaType(name = "integer")
    protected Integer breachWorkflow;
    @XmlElement(name = "DefaultCapAmount")
    protected BigDecimal defaultCapAmount;
    @XmlElement(name = "ResetAmount")
    protected BigDecimal resetAmount;
    @XmlElement(name = "LastAmendedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the capCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapCode() {
        return capCode;
    }

    /**
     * Sets the value of the capCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapCode(String value) {
        this.capCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the capType property.
     * 
     * @return
     *     possible object is
     *     {@link CapTypeType }
     *     
     */
    public CapTypeType getCapType() {
        return capType;
    }

    /**
     * Sets the value of the capType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapTypeType }
     *     
     */
    public void setCapType(CapTypeType value) {
        this.capType = value;
    }

    /**
     * Gets the value of the capConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapConsumption() {
        return capConsumption;
    }

    /**
     * Sets the value of the capConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapConsumption(BigDecimal value) {
        this.capConsumption = value;
    }

    /**
     * Gets the value of the capDataType property.
     * 
     * @return
     *     possible object is
     *     {@link CapDataTypeType }
     *     
     */
    public CapDataTypeType getCapDataType() {
        return capDataType;
    }

    /**
     * Sets the value of the capDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapDataTypeType }
     *     
     */
    public void setCapDataType(CapDataTypeType value) {
        this.capDataType = value;
    }

    /**
     * Gets the value of the thresholdWorkflow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThresholdWorkflow() {
        return thresholdWorkflow;
    }

    /**
     * Sets the value of the thresholdWorkflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThresholdWorkflow(Integer value) {
        this.thresholdWorkflow = value;
    }

    /**
     * Gets the value of the breachWorkflow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBreachWorkflow() {
        return breachWorkflow;
    }

    /**
     * Sets the value of the breachWorkflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBreachWorkflow(Integer value) {
        this.breachWorkflow = value;
    }

    /**
     * Gets the value of the defaultCapAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultCapAmount() {
        return defaultCapAmount;
    }

    /**
     * Sets the value of the defaultCapAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultCapAmount(BigDecimal value) {
        this.defaultCapAmount = value;
    }

    /**
     * Gets the value of the resetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getResetAmount() {
        return resetAmount;
    }

    /**
     * Sets the value of the resetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setResetAmount(BigDecimal value) {
        this.resetAmount = value;
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
