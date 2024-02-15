
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReloadsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReloadsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Reload" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}ReloadType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReloadsType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {
    "reload"
})
public class ReloadsType {

    @XmlElement(name = "Reload")
    protected List<ReloadType> reload;

    /**
     * Gets the value of the reload property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reload property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReload().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReloadType }
     * 
     * 
     */
    public List<ReloadType> getReload() {
        if (reload == null) {
            reload = new ArrayList<ReloadType>();
        }
        return this.reload;
    }

}