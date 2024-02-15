
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CUGInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUGInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClosedUserGroupNumber" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}ClosedUserGroupNumberType"/>
 *         &lt;element name="CUGType" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}CUGTypeType"/>
 *         &lt;element name="ServiceCode" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ServiceCodeType"/>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUGInfoType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "closedUserGroupNumber",
    "cugType",
    "serviceCode",
    "lastAmendedDate"
})
public class CUGInfoType {

    @XmlElement(name = "ClosedUserGroupNumber")
    @XmlSchemaType(name = "integer")
    protected int closedUserGroupNumber;
    @XmlElement(name = "CUGType", required = true)
    @XmlSchemaType(name = "string")
    protected CUGTypeType cugType;
    @XmlElement(name = "ServiceCode", required = true)
    protected String serviceCode;
    @XmlElement(name = "LastAmendedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the closedUserGroupNumber property.
     * 
     */
    public int getClosedUserGroupNumber() {
        return closedUserGroupNumber;
    }

    /**
     * Sets the value of the closedUserGroupNumber property.
     * 
     */
    public void setClosedUserGroupNumber(int value) {
        this.closedUserGroupNumber = value;
    }

    /**
     * Gets the value of the cugType property.
     * 
     * @return
     *     possible object is
     *     {@link CUGTypeType }
     *     
     */
    public CUGTypeType getCUGType() {
        return cugType;
    }

    /**
     * Sets the value of the cugType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUGTypeType }
     *     
     */
    public void setCUGType(CUGTypeType value) {
        this.cugType = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the lastAmendedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAmendedDate() {
        return lastAmendedDate;
    }

    /**
     * Sets the value of the lastAmendedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAmendedDate(XMLGregorianCalendar value) {
        this.lastAmendedDate = value;
    }

}
