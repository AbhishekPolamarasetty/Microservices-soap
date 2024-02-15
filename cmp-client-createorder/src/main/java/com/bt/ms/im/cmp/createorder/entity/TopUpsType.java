
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopUpsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopUpsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TopUp" type="{http://mdsuk.com/ws/dise3g/basket/dto/business}TopUpType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopUpsType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business", propOrder = {
    "topUp"
})
public class TopUpsType {

    @XmlElement(name = "TopUp")
    protected List<TopUpType> topUp;

    /**
     * Gets the value of the topUp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topUp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopUp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopUpType }
     * 
     * 
     */
    public List<TopUpType> getTopUp() {
        if (topUp == null) {
            topUp = new ArrayList<TopUpType>();
        }
        return this.topUp;
    }

}
