
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallClassOverridesDatasetsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallClassOverridesDatasetsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CallClassOverride" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}CallClassOverrideDatasetType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallClassOverridesDatasetsType", propOrder = {
    "callClassOverride"
})
public class CallClassOverridesDatasetsType {

    @XmlElement(name = "CallClassOverride")
    protected List<CallClassOverrideDatasetType> callClassOverride;

    /**
     * Gets the value of the callClassOverride property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callClassOverride property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallClassOverride().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallClassOverrideDatasetType }
     * 
     * 
     */
    public List<CallClassOverrideDatasetType> getCallClassOverride() {
        if (callClassOverride == null) {
            callClassOverride = new ArrayList<CallClassOverrideDatasetType>();
        }
        return this.callClassOverride;
    }

}
