
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefreshUpdateRefreshesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefreshUpdateRefreshesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Refresh" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}RefreshUpdateType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefreshUpdateRefreshesType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {
    "refresh"
})
public class RefreshUpdateRefreshesType {

    @XmlElement(name = "Refresh", required = true)
    protected List<RefreshUpdateType> refresh;

    /**
     * Gets the value of the refresh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refresh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefresh().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefreshUpdateType }
     * 
     * 
     */
    public List<RefreshUpdateType> getRefresh() {
        if (refresh == null) {
            refresh = new ArrayList<RefreshUpdateType>();
        }
        return this.refresh;
    }

}
