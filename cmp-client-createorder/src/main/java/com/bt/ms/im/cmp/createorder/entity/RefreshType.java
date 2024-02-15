
package com.bt.ms.im.cmp.createorder.entity;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RefreshType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefreshType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefreshSequence" type="{http://mdsuk.com/ws/dise3g/base}ThreeDigitNumberType"/>
 *         &lt;element name="RefreshType" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}RefreshTypeType"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefreshType", propOrder = {
    "refreshSequence",
    "refreshType",
    "startDate",
    "description",
    "price"
})
public class RefreshType {

    @XmlElement(name = "RefreshSequence")
    @XmlSchemaType(name = "integer")
    protected int refreshSequence;
    @XmlElement(name = "RefreshType", required = true)
    protected RefreshTypeType refreshType;
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Price", required = true)
    protected BigDecimal price;

    /**
     * Gets the value of the refreshSequence property.
     * 
     */
    public int getRefreshSequence() {
        return refreshSequence;
    }

    /**
     * Sets the value of the refreshSequence property.
     * 
     */
    public void setRefreshSequence(int value) {
        this.refreshSequence = value;
    }

    /**
     * Gets the value of the refreshType property.
     * 
     * @return
     *     possible object is
     *     {@link RefreshTypeType }
     *     
     */
    public RefreshTypeType getRefreshType() {
        return refreshType;
    }

    /**
     * Sets the value of the refreshType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefreshTypeType }
     *     
     */
    public void setRefreshType(RefreshTypeType value) {
        this.refreshType = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

}
