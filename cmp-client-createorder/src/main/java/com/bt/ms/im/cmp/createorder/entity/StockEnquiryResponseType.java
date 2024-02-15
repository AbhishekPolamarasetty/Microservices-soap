
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockEnquiryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockEnquiryResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ExternalReference" type="{http://mdsuk.com/ws/dise3g/base}ExternalReferenceType" minOccurs="0"/>
 *         &lt;element name="ProductCode" type="{http://mdsuk.com/ws/dise3g/order/dto/business}ProductCodeType"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="NonStockItem" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="WarehouseCode" type="{http://mdsuk.com/ws/dise3g/order/dto/business}WarehouseCodeType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockEnquiryResponseType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/service", propOrder = {

})
public class StockEnquiryResponseType {

    @XmlElement(name = "ExternalReference")
    protected String externalReference;
    @XmlElement(name = "ProductCode", required = true)
    protected String productCode;
    @XmlElement(name = "Quantity", required = true)
    protected BigInteger quantity;
    @XmlElement(name = "NonStockItem", defaultValue = "false")
    protected boolean nonStockItem;
    @XmlElement(name = "WarehouseCode", required = true)
    protected String warehouseCode;

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
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the nonStockItem property.
     * 
     */
    public boolean isNonStockItem() {
        return nonStockItem;
    }

    /**
     * Sets the value of the nonStockItem property.
     * 
     */
    public void setNonStockItem(boolean value) {
        this.nonStockItem = value;
    }

    /**
     * Gets the value of the warehouseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseCode() {
        return warehouseCode;
    }

    /**
     * Sets the value of the warehouseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseCode(String value) {
        this.warehouseCode = value;
    }

}