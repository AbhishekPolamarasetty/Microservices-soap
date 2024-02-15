
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwitchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SwitchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAC"/>
 *     &lt;enumeration value="STAC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SwitchType", namespace = "http://mdsuk.com/ws/dise3g/porting/dto/business")
@XmlEnum
public enum SwitchType {

    PAC,
    STAC;

    public String value() {
        return name();
    }

    public static SwitchType fromValue(String v) {
        return valueOf(v);
    }

}
