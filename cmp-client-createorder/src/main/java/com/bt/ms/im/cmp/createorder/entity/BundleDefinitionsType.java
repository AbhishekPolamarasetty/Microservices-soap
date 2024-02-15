
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BundleDefinitionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BundleDefinitionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BundleDefinition" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}BundleDefinitionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BundleDefinitionsType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "bundleDefinition"
})
public class BundleDefinitionsType {

    @XmlElement(name = "BundleDefinition")
    protected List<BundleDefinitionType> bundleDefinition;

    /**
     * Gets the value of the bundleDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bundleDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBundleDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BundleDefinitionType }
     * 
     * 
     */
    public List<BundleDefinitionType> getBundleDefinition() {
        if (bundleDefinition == null) {
            bundleDefinition = new ArrayList<BundleDefinitionType>();
        }
        return this.bundleDefinition;
    }

}
