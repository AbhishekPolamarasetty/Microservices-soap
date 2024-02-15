
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillableAssetIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillableAssetIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AccountIdentifier" type="{http://mdsuk.com/ws/dise3g/base}AccountNumberType"/>
 *         &lt;element name="BillableAssetCode" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BillableAssetCode"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillableAssetIdentifierType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {

})
public class BillableAssetIdentifierType {

    @XmlElement(name = "AccountIdentifier")
    @XmlSchemaType(name = "integer")
    protected int accountIdentifier;
    @XmlElement(name = "BillableAssetCode", required = true)
    protected String billableAssetCode;

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
     * Gets the value of the billableAssetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillableAssetCode() {
        return billableAssetCode;
    }

    /**
     * Sets the value of the billableAssetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillableAssetCode(String value) {
        this.billableAssetCode = value;
    }

}
