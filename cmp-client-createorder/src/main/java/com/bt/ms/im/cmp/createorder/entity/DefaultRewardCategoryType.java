
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DefaultRewardCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefaultRewardCategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="RewardCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RewardCategoryDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultRewardCategoryType", propOrder = {

})
public class DefaultRewardCategoryType {

    @XmlElement(name = "RewardCategory", required = true)
    protected String rewardCategory;
    @XmlElement(name = "RewardCategoryDescription", required = true)
    protected String rewardCategoryDescription;

    /**
     * Gets the value of the rewardCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardCategory() {
        return rewardCategory;
    }

    /**
     * Sets the value of the rewardCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardCategory(String value) {
        this.rewardCategory = value;
    }

    /**
     * Gets the value of the rewardCategoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardCategoryDescription() {
        return rewardCategoryDescription;
    }

    /**
     * Sets the value of the rewardCategoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardCategoryDescription(String value) {
        this.rewardCategoryDescription = value;
    }

}
