
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetResourceAttributesBillableAssetLineIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetResourceAttributesBillableAssetLineIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AccountIdentifier" type="{http://mdsuk.com/ws/dise3g/base}AccountNumberType"/>
 *         &lt;element name="BillableAssetCode" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BillableAssetCode"/>
 *         &lt;element name="BillableAssetLineIdentifier" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BillableAssetLineIdentifierType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetResourceAttributesBillableAssetLineIdentifierType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {

})
public class SetResourceAttributesBillableAssetLineIdentifierType {

    @XmlElement(name = "AccountIdentifier")
    @XmlSchemaType(name = "integer")
    protected int accountIdentifier;
    @XmlElement(name = "BillableAssetCode", required = true)
    protected String billableAssetCode;
    @XmlElement(name = "BillableAssetLineIdentifier")
    @XmlSchemaType(name = "integer")
    protected long billableAssetLineIdentifier;

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

    /**
     * Gets the value of the billableAssetLineIdentifier property.
     * 
     */
    public long getBillableAssetLineIdentifier() {
        return billableAssetLineIdentifier;
    }

    /**
     * Sets the value of the billableAssetLineIdentifier property.
     * 
     */
    public void setBillableAssetLineIdentifier(long value) {
        this.billableAssetLineIdentifier = value;
    }

}
