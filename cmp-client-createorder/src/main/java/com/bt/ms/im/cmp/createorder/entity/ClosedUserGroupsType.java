
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClosedUserGroupsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClosedUserGroupsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClosedUserGroup" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}CUGInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClosedUserGroupsType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "closedUserGroup"
})
public class ClosedUserGroupsType {

    @XmlElement(name = "ClosedUserGroup")
    protected List<CUGInfoType> closedUserGroup;

    /**
     * Gets the value of the closedUserGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the closedUserGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClosedUserGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CUGInfoType }
     * 
     * 
     */
    public List<CUGInfoType> getClosedUserGroup() {
        if (closedUserGroup == null) {
            closedUserGroup = new ArrayList<CUGInfoType>();
        }
        return this.closedUserGroup;
    }

}
