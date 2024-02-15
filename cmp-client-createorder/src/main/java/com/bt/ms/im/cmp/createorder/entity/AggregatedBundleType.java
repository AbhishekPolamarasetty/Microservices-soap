
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AggregatedBundleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregatedBundleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="BundleCode" type="{http://mdsuk.com/ws/dise3g/bundle/dto/business}BundleCodeType"/>
 *         &lt;element name="BundleEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="BundleExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregatedBundleType", namespace = "http://mdsuk.com/ws/dise3g/bundle/dto/business", propOrder = {

})
public class AggregatedBundleType {

    @XmlElement(name = "BundleCode", required = true)
    protected String bundleCode;
    @XmlElement(name = "BundleEffectiveDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bundleEffectiveDate;
    @XmlElement(name = "BundleExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bundleExpiryDate;

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
     * Gets the value of the bundleEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBundleEffectiveDate() {
        return bundleEffectiveDate;
    }

    /**
     * Sets the value of the bundleEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBundleEffectiveDate(XMLGregorianCalendar value) {
        this.bundleEffectiveDate = value;
    }

    /**
     * Gets the value of the bundleExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBundleExpiryDate() {
        return bundleExpiryDate;
    }

    /**
     * Sets the value of the bundleExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBundleExpiryDate(XMLGregorianCalendar value) {
        this.bundleExpiryDate = value;
    }

}
