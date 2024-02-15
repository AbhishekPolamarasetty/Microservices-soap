
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SalesAccountNumber" type="{http://mdsuk.com/ws/dise3g/order/dto/business}SalesAccountNumberType"/>
 *         &lt;element name="PromisedForDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DespatchByDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="WarehouseCode" type="{http://mdsuk.com/ws/dise3g/order/dto/business}WarehouseCodeType" minOccurs="0"/>
 *         &lt;element name="DeliveryMethodCode" type="{http://mdsuk.com/ws/dise3g/order/dto/business}DeliveryMethodCodeType" minOccurs="0"/>
 *         &lt;element name="DeliveryInstructions" type="{http://mdsuk.com/ws/dise3g/order/dto/business}DeliveryInstructionsType" minOccurs="0"/>
 *         &lt;element name="ShippingAddressInformation" type="{http://mdsuk.com/ws/dise3g/order/dto/business}ShippingAddressInformationType"/>
 *         &lt;element name="EnquirySourceCode" type="{http://mdsuk.com/ws/dise3g/base}EnquirySourceCodeType" minOccurs="0"/>
 *         &lt;element name="CampaignCode" type="{http://mdsuk.com/ws/dise3g/base}CampaignCodeType" minOccurs="0"/>
 *         &lt;element name="PricePlanCode" type="{http://mdsuk.com/ws/dise3g/base}PricePlanCodeType" minOccurs="0"/>
 *         &lt;element name="SubscriptionAccountCode" type="{http://mdsuk.com/ws/dise3g/base}AccountNumberType" minOccurs="0"/>
 *         &lt;element name="CustomerReference" type="{http://mdsuk.com/ws/dise3g/order/dto/business}CustomerReferenceType" minOccurs="0"/>
 *         &lt;element name="PaymentType" type="{http://mdsuk.com/ws/dise3g/order/dto/business}PaymentType"/>
 *         &lt;element name="Generate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExternalOrderNumber" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30Type" minOccurs="0"/>
 *         &lt;element name="EnhancedOrderType" type="{http://mdsuk.com/ws/dise3g/order/dto/business}EnhancedOrderTypeType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderHeaderType", namespace = "http://mdsuk.com/ws/dise3g/order/dto/business", propOrder = {

})
public class OrderHeaderType {

    @XmlElement(name = "SalesAccountNumber")
    @XmlSchemaType(name = "integer")
    protected int salesAccountNumber;
    @XmlElement(name = "PromisedForDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar promisedForDate;
    @XmlElement(name = "DespatchByDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar despatchByDate;
    @XmlElement(name = "WarehouseCode")
    protected String warehouseCode;
    @XmlElement(name = "DeliveryMethodCode")
    protected String deliveryMethodCode;
    @XmlElement(name = "DeliveryInstructions")
    protected String deliveryInstructions;
    @XmlElement(name = "ShippingAddressInformation", required = true)
    protected ShippingAddressInformationType shippingAddressInformation;
    @XmlElement(name = "EnquirySourceCode")
    protected String enquirySourceCode;
    @XmlElement(name = "CampaignCode")
    @XmlSchemaType(name = "integer")
    protected Integer campaignCode;
    @XmlElement(name = "PricePlanCode")
    protected String pricePlanCode;
    @XmlElement(name = "SubscriptionAccountCode")
    @XmlSchemaType(name = "integer")
    protected Integer subscriptionAccountCode;
    @XmlElement(name = "CustomerReference")
    protected String customerReference;
    @XmlElement(name = "PaymentType", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentType paymentType;
    @XmlElement(name = "Generate", defaultValue = "true")
    protected Boolean generate;
    @XmlElement(name = "ExternalOrderNumber")
    protected String externalOrderNumber;
    @XmlElement(name = "EnhancedOrderType")
    @XmlSchemaType(name = "string")
    protected EnhancedOrderTypeType enhancedOrderType;

    /**
     * Gets the value of the salesAccountNumber property.
     * 
     */
    public int getSalesAccountNumber() {
        return salesAccountNumber;
    }

    /**
     * Sets the value of the salesAccountNumber property.
     * 
     */
    public void setSalesAccountNumber(int value) {
        this.salesAccountNumber = value;
    }

    /**
     * Gets the value of the promisedForDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPromisedForDate() {
        return promisedForDate;
    }

    /**
     * Sets the value of the promisedForDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPromisedForDate(XMLGregorianCalendar value) {
        this.promisedForDate = value;
    }

    /**
     * Gets the value of the despatchByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDespatchByDate() {
        return despatchByDate;
    }

    /**
     * Sets the value of the despatchByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDespatchByDate(XMLGregorianCalendar value) {
        this.despatchByDate = value;
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

    /**
     * Gets the value of the deliveryMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMethodCode() {
        return deliveryMethodCode;
    }

    /**
     * Sets the value of the deliveryMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMethodCode(String value) {
        this.deliveryMethodCode = value;
    }

    /**
     * Gets the value of the deliveryInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryInstructions() {
        return deliveryInstructions;
    }

    /**
     * Sets the value of the deliveryInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryInstructions(String value) {
        this.deliveryInstructions = value;
    }

    /**
     * Gets the value of the shippingAddressInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingAddressInformationType }
     *     
     */
    public ShippingAddressInformationType getShippingAddressInformation() {
        return shippingAddressInformation;
    }

    /**
     * Sets the value of the shippingAddressInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingAddressInformationType }
     *     
     */
    public void setShippingAddressInformation(ShippingAddressInformationType value) {
        this.shippingAddressInformation = value;
    }

    /**
     * Gets the value of the enquirySourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnquirySourceCode() {
        return enquirySourceCode;
    }

    /**
     * Sets the value of the enquirySourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnquirySourceCode(String value) {
        this.enquirySourceCode = value;
    }

    /**
     * Gets the value of the campaignCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCampaignCode() {
        return campaignCode;
    }

    /**
     * Sets the value of the campaignCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCampaignCode(Integer value) {
        this.campaignCode = value;
    }

    /**
     * Gets the value of the pricePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePlanCode() {
        return pricePlanCode;
    }

    /**
     * Sets the value of the pricePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePlanCode(String value) {
        this.pricePlanCode = value;
    }

    /**
     * Gets the value of the subscriptionAccountCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubscriptionAccountCode() {
        return subscriptionAccountCode;
    }

    /**
     * Sets the value of the subscriptionAccountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubscriptionAccountCode(Integer value) {
        this.subscriptionAccountCode = value;
    }

    /**
     * Gets the value of the customerReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * Sets the value of the customerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReference(String value) {
        this.customerReference = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPaymentType(PaymentType value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the generate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenerate() {
        return generate;
    }

    /**
     * Sets the value of the generate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerate(Boolean value) {
        this.generate = value;
    }

    /**
     * Gets the value of the externalOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalOrderNumber() {
        return externalOrderNumber;
    }

    /**
     * Sets the value of the externalOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalOrderNumber(String value) {
        this.externalOrderNumber = value;
    }

    /**
     * Gets the value of the enhancedOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedOrderTypeType }
     *     
     */
    public EnhancedOrderTypeType getEnhancedOrderType() {
        return enhancedOrderType;
    }

    /**
     * Sets the value of the enhancedOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedOrderTypeType }
     *     
     */
    public void setEnhancedOrderType(EnhancedOrderTypeType value) {
        this.enhancedOrderType = value;
    }

}
