
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecentUsageFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecentUsageFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Date" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}RecentUsageDateFilterType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecentUsageFilterType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "date"
})
public class RecentUsageFilterType {

    @XmlElement(name = "Date")
    protected RecentUsageDateFilterType date;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link RecentUsageDateFilterType }
     *     
     */
    public RecentUsageDateFilterType getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecentUsageDateFilterType }
     *     
     */
    public void setDate(RecentUsageDateFilterType value) {
        this.date = value;
    }

}
