
package com.bt.ms.im.cmp.createorder.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryBundleDatasetsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryBundleDatasetsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dataset" type="{http://mdsuk.com/ws/dise3g/billing/dto/business}QueryBundleDatasetType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryBundleDatasetsType", namespace = "http://mdsuk.com/ws/dise3g/billing/dto/business", propOrder = {
    "dataset"
})
public class QueryBundleDatasetsType {

    @XmlElement(name = "Dataset", required = true)
    @XmlSchemaType(name = "string")
    protected List<QueryBundleDatasetType> dataset;

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
     * {@link QueryBundleDatasetType }
     * 
     * 
     */
    public List<QueryBundleDatasetType> getDataset() {
        if (dataset == null) {
            dataset = new ArrayList<QueryBundleDatasetType>();
        }
        return this.dataset;
    }

}
