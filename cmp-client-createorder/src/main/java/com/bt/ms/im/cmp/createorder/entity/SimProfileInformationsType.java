
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimProfileInformationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimProfileInformationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SimProfileInformation" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}SimProfileInformationType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimProfileInformationsType", propOrder = {
    "simProfileInformation"
})
public class SimProfileInformationsType {

    @XmlElement(name = "SimProfileInformation", required = true)
    protected List<SimProfileInformationType> simProfileInformation;

    /**
     * Gets the value of the simProfileInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simProfileInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimProfileInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimProfileInformationType }
     * 
     * 
     */
    public List<SimProfileInformationType> getSimProfileInformation() {
        if (simProfileInformation == null) {
            simProfileInformation = new ArrayList<SimProfileInformationType>();
        }
        return this.simProfileInformation;
    }

}
