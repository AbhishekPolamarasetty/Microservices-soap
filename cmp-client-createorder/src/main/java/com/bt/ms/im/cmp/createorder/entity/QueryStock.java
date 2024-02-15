
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryData" type="{http://mdsuk.com/ws/dise3g/order/dto/service}StockEnquiryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "queryData"
})
@XmlRootElement(name = "QueryStock", namespace = "http://mdsuk.com/ws/dise3g/order/definition")
public class QueryStock {

    @XmlElement(name = "QueryData", namespace = "http://mdsuk.com/ws/dise3g/order/definition", required = true)
    protected StockEnquiryType queryData;

    /**
     * Gets the value of the queryData property.
     * 
     * @return
     *     possible object is
     *     {@link StockEnquiryType }
     *     
     */
    public StockEnquiryType getQueryData() {
        return queryData;
    }

    /**
     * Sets the value of the queryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockEnquiryType }
     *     
     */
    public void setQueryData(StockEnquiryType value) {
        this.queryData = value;
    }

}
