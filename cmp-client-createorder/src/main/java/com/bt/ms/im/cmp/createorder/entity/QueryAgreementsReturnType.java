
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryAgreementsReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryAgreementsReturnType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AgreementNumber" type="{http://mdsuk.com/ws/dise3g/base}AgreementNumberType"/>
 *         &lt;element name="InvoiceLoggedAt" type="{http://mdsuk.com/ws/dise3g/account/dto/business}TargetIdentifierType" minOccurs="0"/>
 *         &lt;element name="InvoiceConsolidationLevel" type="{http://mdsuk.com/ws/dise3g/base}LevelType" minOccurs="0"/>
 *         &lt;element name="InvoiceAddress" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}InvoiceAddressType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryAgreementsReturnType", namespace = "http://mdsuk.com/ws/dise3g/agreement/dto/business", propOrder = {

})
public class QueryAgreementsReturnType {

    @XmlElement(name = "AgreementNumber")
    @XmlSchemaType(name = "integer")
    protected int agreementNumber;
    @XmlElement(name = "InvoiceLoggedAt")
    protected TargetIdentifierType3 invoiceLoggedAt;
    @XmlElement(name = "InvoiceConsolidationLevel")
    @XmlSchemaType(name = "string")
    protected LevelType invoiceConsolidationLevel;
    @XmlElement(name = "InvoiceAddress")
    @XmlSchemaType(name = "string")
    protected InvoiceAddressType invoiceAddress;

    /**
     * Gets the value of the agreementNumber property.
     * 
     */
    public int getAgreementNumber() {
        return agreementNumber;
    }

    /**
     * Sets the value of the agreementNumber property.
     * 
     */
    public void setAgreementNumber(int value) {
        this.agreementNumber = value;
    }

    /**
     * Gets the value of the invoiceLoggedAt property.
     * 
     * @return
     *     possible object is
     *     {@link TargetIdentifierType3 }
     *     
     */
    public TargetIdentifierType3 getInvoiceLoggedAt() {
        return invoiceLoggedAt;
    }

    /**
     * Sets the value of the invoiceLoggedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetIdentifierType3 }
     *     
     */
    public void setInvoiceLoggedAt(TargetIdentifierType3 value) {
        this.invoiceLoggedAt = value;
    }

    /**
     * Gets the value of the invoiceConsolidationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link LevelType }
     *     
     */
    public LevelType getInvoiceConsolidationLevel() {
        return invoiceConsolidationLevel;
    }

    /**
     * Sets the value of the invoiceConsolidationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelType }
     *     
     */
    public void setInvoiceConsolidationLevel(LevelType value) {
        this.invoiceConsolidationLevel = value;
    }

    /**
     * Gets the value of the invoiceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceAddressType }
     *     
     */
    public InvoiceAddressType getInvoiceAddress() {
        return invoiceAddress;
    }

    /**
     * Sets the value of the invoiceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceAddressType }
     *     
     */
    public void setInvoiceAddress(InvoiceAddressType value) {
        this.invoiceAddress = value;
    }

}
