
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PortType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PORT_IN"/>
 *     &lt;enumeration value="PORT_OUT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PortType", namespace = "http://mdsuk.com/ws/dise3g/porting/dto/business")
@XmlEnum
public enum PortType {

    PORT_IN,
    PORT_OUT;

    public String value() {
        return name();
    }

    public static PortType fromValue(String v) {
        return valueOf(v);
    }

}
