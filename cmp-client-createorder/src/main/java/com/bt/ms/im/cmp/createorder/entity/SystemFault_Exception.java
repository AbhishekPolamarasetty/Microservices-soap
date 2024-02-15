
package com.bt.ms.im.cmp.createorder.entity;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "SystemFault", targetNamespace = "http://mdsuk.com/ws/dise3g/fault/definition")
public class SystemFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SystemFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public SystemFault_Exception(String message, SystemFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public SystemFault_Exception(String message, SystemFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.bt.ms.im.cmp.createorder.entity.SystemFault
     */
    public SystemFault getFaultInfo() {
        return faultInfo;
    }

}