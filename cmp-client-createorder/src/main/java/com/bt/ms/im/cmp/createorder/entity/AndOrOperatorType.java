
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AndOrOperatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AndOrOperatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="And"/>
 *     &lt;enumeration value="Or"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AndOrOperatorType", namespace = "http://mdsuk.com/ws/dise3g/discount/dto/business")
@XmlEnum
public enum AndOrOperatorType {

    @XmlEnumValue("And")
    AND("And"),
    @XmlEnumValue("Or")
    OR("Or");
    private final String value;

    AndOrOperatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AndOrOperatorType fromValue(String v) {
        for (AndOrOperatorType c: AndOrOperatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
