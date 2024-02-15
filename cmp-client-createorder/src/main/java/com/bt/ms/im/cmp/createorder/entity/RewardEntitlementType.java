
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RewardEntitlementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RewardEntitlementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="RewardIdentifier" type="{http://mdsuk.com/ws/dise3g/base}RewardIdentifierType"/>
 *         &lt;element name="RewardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RewardTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RewardLevel" type="{http://mdsuk.com/ws/dise3g/base}RewardLevelType"/>
 *         &lt;element name="RewardLevelDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RewardCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RewardCategoryDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AwardedOnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ExpiresOnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
@XmlType(name = "RewardEntitlementType", propOrder = {

})
public class RewardEntitlementType {

    @XmlElement(name = "RewardIdentifier")
    @XmlSchemaType(name = "integer")
    protected int rewardIdentifier;
    @XmlElement(name = "RewardType", required = true)
    protected String rewardType;
    @XmlElement(name = "RewardTypeDescription", required = true)
    protected String rewardTypeDescription;
    @XmlElement(name = "RewardLevel")
    @XmlSchemaType(name = "integer")
    protected int rewardLevel;
    @XmlElement(name = "RewardLevelDescription", required = true)
    protected String rewardLevelDescription;
    @XmlElement(name = "RewardCategory", required = true)
    protected String rewardCategory;
    @XmlElement(name = "RewardCategoryDescription", required = true)
    protected String rewardCategoryDescription;
    @XmlElement(name = "AwardedOnDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar awardedOnDate;
    @XmlElement(name = "ExpiresOnDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiresOnDate;
    @XmlElement(name = "LastAmendedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the rewardIdentifier property.
     * 
     */
    public int getRewardIdentifier() {
        return rewardIdentifier;
    }

    /**
     * Sets the value of the rewardIdentifier property.
     * 
     */
    public void setRewardIdentifier(int value) {
        this.rewardIdentifier = value;
    }

    /**
     * Gets the value of the rewardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardType() {
        return rewardType;
    }

    /**
     * Sets the value of the rewardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardType(String value) {
        this.rewardType = value;
    }

    /**
     * Gets the value of the rewardTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardTypeDescription() {
        return rewardTypeDescription;
    }

    /**
     * Sets the value of the rewardTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardTypeDescription(String value) {
        this.rewardTypeDescription = value;
    }

    /**
     * Gets the value of the rewardLevel property.
     * 
     */
    public int getRewardLevel() {
        return rewardLevel;
    }

    /**
     * Sets the value of the rewardLevel property.
     * 
     */
    public void setRewardLevel(int value) {
        this.rewardLevel = value;
    }

    /**
     * Gets the value of the rewardLevelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardLevelDescription() {
        return rewardLevelDescription;
    }

    /**
     * Sets the value of the rewardLevelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardLevelDescription(String value) {
        this.rewardLevelDescription = value;
    }

    /**
     * Gets the value of the rewardCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardCategory() {
        return rewardCategory;
    }

    /**
     * Sets the value of the rewardCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardCategory(String value) {
        this.rewardCategory = value;
    }

    /**
     * Gets the value of the rewardCategoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardCategoryDescription() {
        return rewardCategoryDescription;
    }

    /**
     * Sets the value of the rewardCategoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardCategoryDescription(String value) {
        this.rewardCategoryDescription = value;
    }

    /**
     * Gets the value of the awardedOnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAwardedOnDate() {
        return awardedOnDate;
    }

    /**
     * Sets the value of the awardedOnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAwardedOnDate(XMLGregorianCalendar value) {
        this.awardedOnDate = value;
    }

    /**
     * Gets the value of the expiresOnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiresOnDate() {
        return expiresOnDate;
    }

    /**
     * Sets the value of the expiresOnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiresOnDate(XMLGregorianCalendar value) {
        this.expiresOnDate = value;
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
