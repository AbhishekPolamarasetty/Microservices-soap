
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeGroupId" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}AttributeGroupIdType"/>
 *         &lt;element name="Attribute" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}AttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeGroupType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "attributeGroupId",
    "attribute"
})
public class AttributeGroupType {

    @XmlElement(name = "AttributeGroupId", required = true)
    protected String attributeGroupId;
    @XmlElement(name = "Attribute")
    protected List<AttributeType2> attribute;

    /**
     * Gets the value of the attributeGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeGroupId() {
        return attributeGroupId;
    }

    /**
     * Sets the value of the attributeGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeGroupId(String value) {
        this.attributeGroupId = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeType2 }
     * 
     * 
     */
    public List<AttributeType2> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<AttributeType2>();
        }
        return this.attribute;
    }

}
