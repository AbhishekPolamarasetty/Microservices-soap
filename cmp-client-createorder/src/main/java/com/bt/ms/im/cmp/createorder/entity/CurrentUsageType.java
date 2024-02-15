
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CurrentUsageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentUsageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BundleCode" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BundleCodeType"/>
 *         &lt;element name="UnitType" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}UnitOfMeasureType"/>
 *         &lt;element name="AvailableUnits" type="{http://mdsuk.com/ws/dise3g/base}Decimal14Type"/>
 *         &lt;element name="UsedUnits" type="{http://mdsuk.com/ws/dise3g/base}Decimal14Type"/>
 *         &lt;element name="UnitOfMeasure" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength8NotRequiredType"/>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentUsageType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "bundleCode",
    "unitType",
    "availableUnits",
    "usedUnits",
    "unitOfMeasure",
    "lastAmendedDate"
})
public class CurrentUsageType {

    @XmlElement(name = "BundleCode", required = true)
    protected String bundleCode;
    @XmlElement(name = "UnitType", required = true)
    @XmlSchemaType(name = "string")
    protected UnitOfMeasureType unitType;
    @XmlElement(name = "AvailableUnits", required = true)
    protected BigDecimal availableUnits;
    @XmlElement(name = "UsedUnits", required = true)
    protected BigDecimal usedUnits;
    @XmlElement(name = "UnitOfMeasure", required = true, nillable = true)
    protected String unitOfMeasure;
    @XmlElement(name = "LastAmendedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the bundleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleCode() {
        return bundleCode;
    }

    /**
     * Sets the value of the bundleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleCode(String value) {
        this.bundleCode = value;
    }

    /**
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public UnitOfMeasureType getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public void setUnitType(UnitOfMeasureType value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the availableUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailableUnits() {
        return availableUnits;
    }

    /**
     * Sets the value of the availableUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailableUnits(BigDecimal value) {
        this.availableUnits = value;
    }

    /**
     * Gets the value of the usedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsedUnits() {
        return usedUnits;
    }

    /**
     * Sets the value of the usedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsedUnits(BigDecimal value) {
        this.usedUnits = value;
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
