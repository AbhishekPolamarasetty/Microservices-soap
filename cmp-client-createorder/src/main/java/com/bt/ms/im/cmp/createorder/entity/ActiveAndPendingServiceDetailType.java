
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActiveAndPendingServiceDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActiveAndPendingServiceDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mdsuk.com/ws/dise3g/services/dto/business}ServiceDetailType">
 *       &lt;sequence>
 *         &lt;element name="NetworkConfirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeletionActionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveAndPendingServiceDetailType", namespace = "http://mdsuk.com/ws/dise3g/services/dto/business", propOrder = {
    "networkConfirmed",
    "deletionActionStatus"
})
public class ActiveAndPendingServiceDetailType
    extends ServiceDetailType
{

    @XmlElement(name = "NetworkConfirmed")
    protected Boolean networkConfirmed;
    @XmlElement(name = "DeletionActionStatus")
    protected String deletionActionStatus;

    /**
     * Gets the value of the networkConfirmed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetworkConfirmed() {
        return networkConfirmed;
    }

    /**
     * Sets the value of the networkConfirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetworkConfirmed(Boolean value) {
        this.networkConfirmed = value;
    }

    /**
     * Gets the value of the deletionActionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeletionActionStatus() {
        return deletionActionStatus;
    }

    /**
     * Sets the value of the deletionActionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeletionActionStatus(String value) {
        this.deletionActionStatus = value;
    }

}
