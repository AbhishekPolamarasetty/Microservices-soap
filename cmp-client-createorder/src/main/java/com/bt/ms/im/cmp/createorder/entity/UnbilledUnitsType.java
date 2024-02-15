
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnbilledUnitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnbilledUnitsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnbilledUnit" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}UnbilledUnitType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="QueryLimitExceeded" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}QueryLimitExceededType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnbilledUnitsType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "unbilledUnit",
    "queryLimitExceeded"
})
public class UnbilledUnitsType {

    @XmlElement(name = "UnbilledUnit")
    protected List<UnbilledUnitType> unbilledUnit;
    @XmlElement(name = "QueryLimitExceeded")
    protected boolean queryLimitExceeded;

    /**
     * Gets the value of the unbilledUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unbilledUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnbilledUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnbilledUnitType }
     * 
     * 
     */
    public List<UnbilledUnitType> getUnbilledUnit() {
        if (unbilledUnit == null) {
            unbilledUnit = new ArrayList<UnbilledUnitType>();
        }
        return this.unbilledUnit;
    }

    /**
     * Gets the value of the queryLimitExceeded property.
     * 
     */
    public boolean isQueryLimitExceeded() {
        return queryLimitExceeded;
    }

    /**
     * Sets the value of the queryLimitExceeded property.
     * 
     */
    public void setQueryLimitExceeded(boolean value) {
        this.queryLimitExceeded = value;
    }

}
