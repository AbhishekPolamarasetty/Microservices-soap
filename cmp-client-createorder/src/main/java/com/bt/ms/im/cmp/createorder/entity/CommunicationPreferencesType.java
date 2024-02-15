
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Data structure included Customer Preferences response
 * 
 * <p>Java class for CommunicationPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicationPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="CommunicationMethod" type="{http://mdsuk.com/ws/dise3g/account/dto/business}CustomerPreferenceOptionType" minOccurs="0"/>
 *         &lt;element name="ParticularRequirement" type="{http://mdsuk.com/ws/dise3g/account/dto/business}CustomerPreferenceOptionType" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength2Type" minOccurs="0"/>
 *         &lt;element name="MarketingByLetter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MarketingByEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MarketingByTelephone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MarketingBySMS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MarketingOnInvoiceStatement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "CommunicationPreferencesType", namespace = "http://mdsuk.com/ws/dise3g/account/dto/business", propOrder = {

})
public class CommunicationPreferencesType {

    @XmlElement(name = "CommunicationMethod")
    protected String communicationMethod;
    @XmlElement(name = "ParticularRequirement")
    protected String particularRequirement;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "MarketingByLetter")
    protected Boolean marketingByLetter;
    @XmlElement(name = "MarketingByEmail")
    protected Boolean marketingByEmail;
    @XmlElement(name = "MarketingByTelephone")
    protected Boolean marketingByTelephone;
    @XmlElement(name = "MarketingBySMS")
    protected Boolean marketingBySMS;
    @XmlElement(name = "MarketingOnInvoiceStatement")
    protected Boolean marketingOnInvoiceStatement;
    @XmlElement(name = "LastAmendedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the communicationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationMethod() {
        return communicationMethod;
    }

    /**
     * Sets the value of the communicationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationMethod(String value) {
        this.communicationMethod = value;
    }

    /**
     * Gets the value of the particularRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticularRequirement() {
        return particularRequirement;
    }

    /**
     * Sets the value of the particularRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticularRequirement(String value) {
        this.particularRequirement = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the marketingByLetter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarketingByLetter() {
        return marketingByLetter;
    }

    /**
     * Sets the value of the marketingByLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketingByLetter(Boolean value) {
        this.marketingByLetter = value;
    }

    /**
     * Gets the value of the marketingByEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarketingByEmail() {
        return marketingByEmail;
    }

    /**
     * Sets the value of the marketingByEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketingByEmail(Boolean value) {
        this.marketingByEmail = value;
    }

    /**
     * Gets the value of the marketingByTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarketingByTelephone() {
        return marketingByTelephone;
    }

    /**
     * Sets the value of the marketingByTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketingByTelephone(Boolean value) {
        this.marketingByTelephone = value;
    }

    /**
     * Gets the value of the marketingBySMS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarketingBySMS() {
        return marketingBySMS;
    }

    /**
     * Sets the value of the marketingBySMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketingBySMS(Boolean value) {
        this.marketingBySMS = value;
    }

    /**
     * Gets the value of the marketingOnInvoiceStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarketingOnInvoiceStatement() {
        return marketingOnInvoiceStatement;
    }

    /**
     * Sets the value of the marketingOnInvoiceStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketingOnInvoiceStatement(Boolean value) {
        this.marketingOnInvoiceStatement = value;
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
