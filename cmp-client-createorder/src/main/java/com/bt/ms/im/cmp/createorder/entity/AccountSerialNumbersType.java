
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This structure is returned as part of the some Query responses when
 *                 SERIALNUMBERS dataset is specified
 * 
 * <p>Java class for AccountSerialNumbersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountSerialNumbersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountSerialNumber" type="{http://mdsuk.com/ws/dise3g/account/dto/business}AccountSerialNumberType" maxOccurs="999" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSerialNumbersType", namespace = "http://mdsuk.com/ws/dise3g/account/dto/business", propOrder = {
    "accountSerialNumber"
})
public class AccountSerialNumbersType {

    @XmlElement(name = "AccountSerialNumber")
    protected List<AccountSerialNumberType> accountSerialNumber;

    /**
     * Gets the value of the accountSerialNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountSerialNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountSerialNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountSerialNumberType }
     * 
     * 
     */
    public List<AccountSerialNumberType> getAccountSerialNumber() {
        if (accountSerialNumber == null) {
            accountSerialNumber = new ArrayList<AccountSerialNumberType>();
        }
        return this.accountSerialNumber;
    }

}
