
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateInvoiceFrequencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateInvoiceFrequencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="DayOfYear" type="{http://mdsuk.com/ws/dise3g/base}DayOfYearIntType"/>
 *         &lt;element name="MonthOfYear" type="{http://mdsuk.com/ws/dise3g/base}MonthOfYearIntType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInvoiceFrequencyType", namespace = "http://mdsuk.com/ws/dise3g/agreement/dto/business", propOrder = {
    "dayOfYear",
    "monthOfYear"
})
public class UpdateInvoiceFrequencyType {

    @XmlElement(name = "DayOfYear")
    protected Integer dayOfYear;
    @XmlElement(name = "MonthOfYear")
    protected Integer monthOfYear;

    /**
     * Gets the value of the dayOfYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDayOfYear() {
        return dayOfYear;
    }

    /**
     * Sets the value of the dayOfYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDayOfYear(Integer value) {
        this.dayOfYear = value;
    }

    /**
     * Gets the value of the monthOfYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonthOfYear() {
        return monthOfYear;
    }

    /**
     * Sets the value of the monthOfYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonthOfYear(Integer value) {
        this.monthOfYear = value;
    }

}
