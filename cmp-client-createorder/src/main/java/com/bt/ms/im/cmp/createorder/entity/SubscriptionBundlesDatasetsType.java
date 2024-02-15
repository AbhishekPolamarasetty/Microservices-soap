
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionBundlesDatasetsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionBundlesDatasetsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dataset" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}QuerySubscriptionBundlesDatasetType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionBundlesDatasetsType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "dataset"
})
public class SubscriptionBundlesDatasetsType {

    @XmlElement(name = "Dataset", required = true)
    @XmlSchemaType(name = "string")
    protected List<QuerySubscriptionBundlesDatasetType> dataset;

    /**
     * Gets the value of the dataset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuerySubscriptionBundlesDatasetType }
     * 
     * 
     */
    public List<QuerySubscriptionBundlesDatasetType> getDataset() {
        if (dataset == null) {
            dataset = new ArrayList<QuerySubscriptionBundlesDatasetType>();
        }
        return this.dataset;
    }

}