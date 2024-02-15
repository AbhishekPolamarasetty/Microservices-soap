
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ExternalReference" type="{http://mdsuk.com/ws/dise3g/base}ExternalReferenceType" minOccurs="0"/>
 *         &lt;element name="AccountIdentifier" type="{http://mdsuk.com/ws/dise3g/base}AccountNumberType"/>
 *         &lt;element name="OrderHeader" type="{http://mdsuk.com/ws/dise3g/order/dto/business}OrderHeaderType"/>
 *         &lt;element name="Products" type="{http://mdsuk.com/ws/dise3g/order/dto/service}ProductsType"/>
 *         &lt;element name="EligibilityRules" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}EligibilityRulesType" minOccurs="0"/>
 *         &lt;element name="AuditRecord" type="{http://mdsuk.com/ws/dise3g/base}AuditRecordType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/service", propOrder = {

})
public class OrderType {

    @XmlElement(name = "ExternalReference")
    protected String externalReference;
    @XmlElement(name = "AccountIdentifier")
    @XmlSchemaType(name = "integer")
    protected int accountIdentifier;
    @XmlElement(name = "OrderHeader", required = true)
    protected OrderHeaderType orderHeader;
    @XmlElement(name = "Products", required = true)
    protected ProductsType products;
    @XmlElement(name = "EligibilityRules")
    protected EligibilityRulesType eligibilityRules;
    @XmlElement(name = "AuditRecord")
    protected AuditRecordType auditRecord;

    /**
     * Gets the value of the externalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * Sets the value of the externalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReference(String value) {
        this.externalReference = value;
    }

    /**
     * Gets the value of the accountIdentifier property.
     * 
     */
    public int getAccountIdentifier() {
        return accountIdentifier;
    }

    /**
     * Sets the value of the accountIdentifier property.
     * 
     */
    public void setAccountIdentifier(int value) {
        this.accountIdentifier = value;
    }

    /**
     * Gets the value of the orderHeader property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHeaderType }
     *     
     */
    public OrderHeaderType getOrderHeader() {
        return orderHeader;
    }

    /**
     * Sets the value of the orderHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHeaderType }
     *     
     */
    public void setOrderHeader(OrderHeaderType value) {
        this.orderHeader = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link ProductsType }
     *     
     */
    public ProductsType getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductsType }
     *     
     */
    public void setProducts(ProductsType value) {
        this.products = value;
    }

    /**
     * Gets the value of the eligibilityRules property.
     * 
     * @return
     *     possible object is
     *     {@link EligibilityRulesType }
     *     
     */
    public EligibilityRulesType getEligibilityRules() {
        return eligibilityRules;
    }

    /**
     * Sets the value of the eligibilityRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibilityRulesType }
     *     
     */
    public void setEligibilityRules(EligibilityRulesType value) {
        this.eligibilityRules = value;
    }

    /**
     * Gets the value of the auditRecord property.
     * 
     * @return
     *     possible object is
     *     {@link AuditRecordType }
     *     
     */
    public AuditRecordType getAuditRecord() {
        return auditRecord;
    }

    /**
     * Sets the value of the auditRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditRecordType }
     *     
     */
    public void setAuditRecord(AuditRecordType value) {
        this.auditRecord = value;
    }

}
