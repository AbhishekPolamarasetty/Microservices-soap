
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This structure optionally returned as part of the Query Account response
 * 				when the DLP_PORT Dataset is specified.
 * 
 * <p>Java class for DlpPortsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DlpPortsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="DLPPortIns" type="{http://mdsuk.com/ws/dise3g/account/dto/business}DlpPortInsType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DlpPortsType", namespace = "http://mdsuk.com/ws/dise3g/account/dto/business", propOrder = {

})
public class DlpPortsType {

    @XmlElement(name = "DLPPortIns")
    protected DlpPortInsType dlpPortIns;

    /**
     * Gets the value of the dlpPortIns property.
     * 
     * @return
     *     possible object is
     *     {@link DlpPortInsType }
     *     
     */
    public DlpPortInsType getDLPPortIns() {
        return dlpPortIns;
    }

    /**
     * Sets the value of the dlpPortIns property.
     * 
     * @param value
     *     allowed object is
     *     {@link DlpPortInsType }
     *     
     */
    public void setDLPPortIns(DlpPortInsType value) {
        this.dlpPortIns = value;
    }

}
