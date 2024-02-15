
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This structure is returned as part of the Subscription Query response
 * 
 * <p>Java class for UpgradeEligibleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpgradeEligibleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Eligible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UpgradePossibleDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EarlyUpgradePossibleDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EarlyUpgradeCharge" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="RemainingContractTerm" type="{http://mdsuk.com/ws/dise3g/base}EightDigitNumberType"/>
 *         &lt;element name="ReasonCodes" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}FailureReasonsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpgradeEligibleType", propOrder = {
    "eligible",
    "upgradePossibleDate",
    "earlyUpgradePossibleDate",
    "earlyUpgradeCharge",
    "remainingContractTerm",
    "reasonCodes"
})
public class UpgradeEligibleType {

    @XmlElement(name = "Eligible")
    protected boolean eligible;
    @XmlElement(name = "UpgradePossibleDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar upgradePossibleDate;
    @XmlElement(name = "EarlyUpgradePossibleDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earlyUpgradePossibleDate;
    @XmlElement(name = "EarlyUpgradeCharge")
    protected BigDecimal earlyUpgradeCharge;
    @XmlElement(name = "RemainingContractTerm")
    @XmlSchemaType(name = "integer")
    protected int remainingContractTerm;
    @XmlElement(name = "ReasonCodes")
    protected FailureReasonsType reasonCodes;

    /**
     * Gets the value of the eligible property.
     * 
     */
    public boolean isEligible() {
        return eligible;
    }

    /**
     * Sets the value of the eligible property.
     * 
     */
    public void setEligible(boolean value) {
        this.eligible = value;
    }

    /**
     * Gets the value of the upgradePossibleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpgradePossibleDate() {
        return upgradePossibleDate;
    }

    /**
     * Sets the value of the upgradePossibleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpgradePossibleDate(XMLGregorianCalendar value) {
        this.upgradePossibleDate = value;
    }

    /**
     * Gets the value of the earlyUpgradePossibleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarlyUpgradePossibleDate() {
        return earlyUpgradePossibleDate;
    }

    /**
     * Sets the value of the earlyUpgradePossibleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarlyUpgradePossibleDate(XMLGregorianCalendar value) {
        this.earlyUpgradePossibleDate = value;
    }

    /**
     * Gets the value of the earlyUpgradeCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEarlyUpgradeCharge() {
        return earlyUpgradeCharge;
    }

    /**
     * Sets the value of the earlyUpgradeCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEarlyUpgradeCharge(BigDecimal value) {
        this.earlyUpgradeCharge = value;
    }

    /**
     * Gets the value of the remainingContractTerm property.
     * 
     */
    public int getRemainingContractTerm() {
        return remainingContractTerm;
    }

    /**
     * Sets the value of the remainingContractTerm property.
     * 
     */
    public void setRemainingContractTerm(int value) {
        this.remainingContractTerm = value;
    }

    /**
     * Gets the value of the reasonCodes property.
     * 
     * @return
     *     possible object is
     *     {@link FailureReasonsType }
     *     
     */
    public FailureReasonsType getReasonCodes() {
        return reasonCodes;
    }

    /**
     * Sets the value of the reasonCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureReasonsType }
     *     
     */
    public void setReasonCodes(FailureReasonsType value) {
        this.reasonCodes = value;
    }

}
