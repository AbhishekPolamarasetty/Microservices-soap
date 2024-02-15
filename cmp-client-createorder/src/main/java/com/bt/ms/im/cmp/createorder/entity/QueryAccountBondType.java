
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for QueryAccountBondType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryAccountBondType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BondNumber" type="{http://mdsuk.com/ws/dise3g/base}BondNumberType" minOccurs="0"/>
 *         &lt;element name="BondSalesLedgerAccountNumber" type="{http://mdsuk.com/ws/dise3g/base}AccountNumberType" minOccurs="0"/>
 *         &lt;element name="BondPaymentType" type="{http://mdsuk.com/ws/dise3g/base}PaymentTypeType" minOccurs="0"/>
 *         &lt;element name="EventNumber" type="{http://mdsuk.com/ws/dise3g/base}NineDigitNumberType" minOccurs="0"/>
 *         &lt;element name="BondOrigin" type="{http://mdsuk.com/ws/dise3g/base}BondOriginType" minOccurs="0"/>
 *         &lt;element name="SubscriptionNumber" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType" minOccurs="0"/>
 *         &lt;element name="BondStatus" type="{http://mdsuk.com/ws/dise3g/account/dto/business}QueryAccountBondStatusType" minOccurs="0"/>
 *         &lt;element name="BondAmount" type="{http://mdsuk.com/ws/dise3g/base}BondAmountType" minOccurs="0"/>
 *         &lt;element name="ReceivedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PostedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExpectedRefundDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ActualRefundDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BondRefundType" type="{http://mdsuk.com/ws/dise3g/base}PaymentTypeType" minOccurs="0"/>
 *         &lt;element name="RefundOrCancellationReference" type="{http://mdsuk.com/ws/dise3g/account/dto/business}BondRefundOrCancellationReferenceType" minOccurs="0"/>
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
@XmlType(name = "QueryAccountBondType", namespace = "http://mdsuk.com/ws/dise3g/account/dto/business", propOrder = {
    "bondNumber",
    "bondSalesLedgerAccountNumber",
    "bondPaymentType",
    "eventNumber",
    "bondOrigin",
    "subscriptionNumber",
    "bondStatus",
    "bondAmount",
    "receivedDate",
    "postedDate",
    "expectedRefundDate",
    "actualRefundDate",
    "bondRefundType",
    "refundOrCancellationReference",
    "lastAmendedDate"
})
public class QueryAccountBondType {

    @XmlElement(name = "BondNumber")
    @XmlSchemaType(name = "integer")
    protected Integer bondNumber;
    @XmlElement(name = "BondSalesLedgerAccountNumber")
    @XmlSchemaType(name = "integer")
    protected Integer bondSalesLedgerAccountNumber;
    @XmlElement(name = "BondPaymentType")
    protected String bondPaymentType;
    @XmlElement(name = "EventNumber")
    @XmlSchemaType(name = "integer")
    protected Integer eventNumber;
    @XmlElement(name = "BondOrigin")
    protected String bondOrigin;
    @XmlElement(name = "SubscriptionNumber")
    @XmlSchemaType(name = "integer")
    protected Integer subscriptionNumber;
    @XmlElement(name = "BondStatus")
    @XmlSchemaType(name = "string")
    protected QueryAccountBondStatusType bondStatus;
    @XmlElement(name = "BondAmount")
    protected BigDecimal bondAmount;
    @XmlElement(name = "ReceivedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receivedDate;
    @XmlElement(name = "PostedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar postedDate;
    @XmlElement(name = "ExpectedRefundDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedRefundDate;
    @XmlElement(name = "ActualRefundDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actualRefundDate;
    @XmlElement(name = "BondRefundType")
    protected String bondRefundType;
    @XmlElement(name = "RefundOrCancellationReference")
    protected String refundOrCancellationReference;
    @XmlElement(name = "LastAmendedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the bondNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBondNumber() {
        return bondNumber;
    }

    /**
     * Sets the value of the bondNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBondNumber(Integer value) {
        this.bondNumber = value;
    }

    /**
     * Gets the value of the bondSalesLedgerAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBondSalesLedgerAccountNumber() {
        return bondSalesLedgerAccountNumber;
    }

    /**
     * Sets the value of the bondSalesLedgerAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBondSalesLedgerAccountNumber(Integer value) {
        this.bondSalesLedgerAccountNumber = value;
    }

    /**
     * Gets the value of the bondPaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBondPaymentType() {
        return bondPaymentType;
    }

    /**
     * Sets the value of the bondPaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBondPaymentType(String value) {
        this.bondPaymentType = value;
    }

    /**
     * Gets the value of the eventNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEventNumber() {
        return eventNumber;
    }

    /**
     * Sets the value of the eventNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEventNumber(Integer value) {
        this.eventNumber = value;
    }

    /**
     * Gets the value of the bondOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBondOrigin() {
        return bondOrigin;
    }

    /**
     * Sets the value of the bondOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBondOrigin(String value) {
        this.bondOrigin = value;
    }

    /**
     * Gets the value of the subscriptionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubscriptionNumber() {
        return subscriptionNumber;
    }

    /**
     * Sets the value of the subscriptionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubscriptionNumber(Integer value) {
        this.subscriptionNumber = value;
    }

    /**
     * Gets the value of the bondStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryAccountBondStatusType }
     *     
     */
    public QueryAccountBondStatusType getBondStatus() {
        return bondStatus;
    }

    /**
     * Sets the value of the bondStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryAccountBondStatusType }
     *     
     */
    public void setBondStatus(QueryAccountBondStatusType value) {
        this.bondStatus = value;
    }

    /**
     * Gets the value of the bondAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBondAmount() {
        return bondAmount;
    }

    /**
     * Sets the value of the bondAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBondAmount(BigDecimal value) {
        this.bondAmount = value;
    }

    /**
     * Gets the value of the receivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedDate() {
        return receivedDate;
    }

    /**
     * Sets the value of the receivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedDate(XMLGregorianCalendar value) {
        this.receivedDate = value;
    }

    /**
     * Gets the value of the postedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostedDate() {
        return postedDate;
    }

    /**
     * Sets the value of the postedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostedDate(XMLGregorianCalendar value) {
        this.postedDate = value;
    }

    /**
     * Gets the value of the expectedRefundDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedRefundDate() {
        return expectedRefundDate;
    }

    /**
     * Sets the value of the expectedRefundDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedRefundDate(XMLGregorianCalendar value) {
        this.expectedRefundDate = value;
    }

    /**
     * Gets the value of the actualRefundDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualRefundDate() {
        return actualRefundDate;
    }

    /**
     * Sets the value of the actualRefundDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualRefundDate(XMLGregorianCalendar value) {
        this.actualRefundDate = value;
    }

    /**
     * Gets the value of the bondRefundType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBondRefundType() {
        return bondRefundType;
    }

    /**
     * Sets the value of the bondRefundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBondRefundType(String value) {
        this.bondRefundType = value;
    }

    /**
     * Gets the value of the refundOrCancellationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundOrCancellationReference() {
        return refundOrCancellationReference;
    }

    /**
     * Sets the value of the refundOrCancellationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundOrCancellationReference(String value) {
        this.refundOrCancellationReference = value;
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
