
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CallClassOverrideDatasetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallClassOverrideDatasetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Network" type="{http://mdsuk.com/ws/dise3g/base}NetworkCodeType"/>
 *         &lt;element name="CallClassification" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength12Type"/>
 *         &lt;element name="PeriodTable" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength6NotRequiredType" minOccurs="0"/>
 *         &lt;element name="VolumeTable" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength6NotRequiredType" minOccurs="0"/>
 *         &lt;element name="Level" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}OverrideLevelType"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
@XmlType(name = "CallClassOverrideDatasetType", propOrder = {
    "network",
    "callClassification",
    "periodTable",
    "volumeTable",
    "level",
    "effectiveDate",
    "expiryDate",
    "lastAmendedDate"
})
public class CallClassOverrideDatasetType {

    @XmlElement(name = "Network", required = true)
    protected String network;
    @XmlElement(name = "CallClassification", required = true)
    protected String callClassification;
    @XmlElement(name = "PeriodTable")
    protected String periodTable;
    @XmlElement(name = "VolumeTable")
    protected String volumeTable;
    @XmlElement(name = "Level", required = true)
    @XmlSchemaType(name = "string")
    protected OverrideLevelType level;
    @XmlElement(name = "EffectiveDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "LastAmendedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetwork(String value) {
        this.network = value;
    }

    /**
     * Gets the value of the callClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallClassification() {
        return callClassification;
    }

    /**
     * Sets the value of the callClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallClassification(String value) {
        this.callClassification = value;
    }

    /**
     * Gets the value of the periodTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodTable() {
        return periodTable;
    }

    /**
     * Sets the value of the periodTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodTable(String value) {
        this.periodTable = value;
    }

    /**
     * Gets the value of the volumeTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeTable() {
        return volumeTable;
    }

    /**
     * Sets the value of the volumeTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeTable(String value) {
        this.volumeTable = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link OverrideLevelType }
     *     
     */
    public OverrideLevelType getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverrideLevelType }
     *     
     */
    public void setLevel(OverrideLevelType value) {
        this.level = value;
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
