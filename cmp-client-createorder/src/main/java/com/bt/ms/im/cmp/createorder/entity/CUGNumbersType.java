
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CUGNumbersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUGNumbersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUG" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}CUGDatasetType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUGNumbersType", propOrder = {
    "cug"
})
public class CUGNumbersType {

    @XmlElement(name = "CUG", required = true)
    protected List<CUGDatasetType> cug;

    /**
     * Gets the value of the cug property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cug property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCUG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CUGDatasetType }
     * 
     * 
     */
    public List<CUGDatasetType> getCUG() {
        if (cug == null) {
            cug = new ArrayList<CUGDatasetType>();
        }
        return this.cug;
    }

}
