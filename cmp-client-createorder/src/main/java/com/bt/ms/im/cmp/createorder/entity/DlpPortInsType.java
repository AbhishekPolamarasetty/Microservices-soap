
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DlpPortInsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DlpPortInsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DLPPortIn" type="{http://mdsuk.com/ws/dise3g/account/dto/business}DlpPortInType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DlpPortInsType", namespace = "http://mdsuk.com/ws/dise3g/account/dto/business", propOrder = {
    "dlpPortIn"
})
public class DlpPortInsType {

    @XmlElement(name = "DLPPortIn")
    protected List<DlpPortInType> dlpPortIn;

    /**
     * Gets the value of the dlpPortIn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dlpPortIn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDLPPortIn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DlpPortInType }
     * 
     * 
     */
    public List<DlpPortInType> getDLPPortIn() {
        if (dlpPortIn == null) {
            dlpPortIn = new ArrayList<DlpPortInType>();
        }
        return this.dlpPortIn;
    }

}
