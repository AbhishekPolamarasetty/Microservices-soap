
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SubscriptionDonorLedPortDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionDonorLedPortDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PacCode" type="{http://mdsuk.com/ws/dise3g/porting/dto/business}PacCodeType"/>
 *         &lt;element name="PortDate" type="{http://mdsuk.com/ws/dise3g/porting/dto/business}PortDateType"/>
 *         &lt;element name="UseSuggestedDateOnConflict" type="{http://mdsuk.com/ws/dise3g/porting/dto/business}UseSuggestedDateOnConflictType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionDonorLedPortDetailsType", propOrder = {
    "pacCode",
    "portDate",
    "useSuggestedDateOnConflict"
})
public class SubscriptionDonorLedPortDetailsType {

    @XmlElement(name = "PacCode", required = true)
    protected String pacCode;
    @XmlElement(name = "PortDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar portDate;
    @XmlElement(name = "UseSuggestedDateOnConflict")
    protected Boolean useSuggestedDateOnConflict;

    /**
     * Gets the value of the pacCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacCode() {
        return pacCode;
    }

    /**
     * Sets the value of the pacCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacCode(String value) {
        this.pacCode = value;
    }

    /**
     * Gets the value of the portDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPortDate() {
        return portDate;
    }

    /**
     * Sets the value of the portDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPortDate(XMLGregorianCalendar value) {
        this.portDate = value;
    }

    /**
     * Gets the value of the useSuggestedDateOnConflict property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseSuggestedDateOnConflict() {
        return useSuggestedDateOnConflict;
    }

    /**
     * Sets the value of the useSuggestedDateOnConflict property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSuggestedDateOnConflict(Boolean value) {
        this.useSuggestedDateOnConflict = value;
    }

}
