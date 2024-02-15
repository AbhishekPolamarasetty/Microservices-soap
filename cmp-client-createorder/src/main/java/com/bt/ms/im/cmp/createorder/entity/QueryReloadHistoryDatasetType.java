
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryReloadHistoryDatasetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryReloadHistoryDatasetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RELOADS"/>
 *     &lt;enumeration value="TOPUPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryReloadHistoryDatasetType", namespace = "http://mdsuk.com/ws/dise3g/basket/dto/business")
@XmlEnum
public enum QueryReloadHistoryDatasetType {

    RELOADS,
    TOPUPS;

    public String value() {
        return name();
    }

    public static QueryReloadHistoryDatasetType fromValue(String v) {
        return valueOf(v);
    }

}
