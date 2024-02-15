
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagedSerialNumbersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedSerialNumbersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ManagedSerialNumber" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ManagedSerialNumberType" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedSerialNumbersType", propOrder = {
    "managedSerialNumber"
})
public class ManagedSerialNumbersType {

    @XmlElement(name = "ManagedSerialNumber")
    protected List<ManagedSerialNumberType> managedSerialNumber;

    /**
     * Gets the value of the managedSerialNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managedSerialNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagedSerialNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedSerialNumberType }
     * 
     * 
     */
    public List<ManagedSerialNumberType> getManagedSerialNumber() {
        if (managedSerialNumber == null) {
            managedSerialNumber = new ArrayList<ManagedSerialNumberType>();
        }
        return this.managedSerialNumber;
    }

}
