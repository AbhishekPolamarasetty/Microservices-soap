//
//package com.bt.ms.im.cmp.createorder.entity;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import javax.xml.namespace.QName;
//import javax.xml.ws.Service;
//import javax.xml.ws.WebEndpoint;
//import javax.xml.ws.WebServiceClient;
//import javax.xml.ws.WebServiceException;
//import javax.xml.ws.WebServiceFeature;
//
//
///**
// * This is the webservice for DISE order processing.
// * 
// * This class was generated by the JAX-WS RI.
// * JAX-WS RI 2.2.9-b130926.1035
// * Generated source version: 2.2
// * 
// */
//@WebServiceClient(name = "OrderPort", targetNamespace = "http://mdsuk.com/ws/dise3g/order/service", wsdlLocation = "file:/C:/shwetha/CMP-7.3.8/wsdl/order/orderservice.wsdl")
//public class OrderPort
//    extends Service
//{
//
//    private final static URL ORDERPORT_WSDL_LOCATION;
//    private final static WebServiceException ORDERPORT_EXCEPTION;
//    private final static QName ORDERPORT_QNAME = new QName("http://mdsuk.com/ws/dise3g/order/service", "OrderPort");
//
//    static {
//        URL url = null;
//        WebServiceException e = null;
//        try {
//            url = new URL("file:/C:/shwetha/CMP-7.3.8/wsdl/order/orderservice.wsdl");
//        } catch (MalformedURLException ex) {
//            e = new WebServiceException(ex);
//        }
//        ORDERPORT_WSDL_LOCATION = url;
//        ORDERPORT_EXCEPTION = e;
//    }
//
//    public OrderPort() {
//        super(__getWsdlLocation(), ORDERPORT_QNAME);
//    }
//
//    public OrderPort(WebServiceFeature... features) {
//        super(__getWsdlLocation(), ORDERPORT_QNAME, features);
//    }
//
//    public OrderPort(URL wsdlLocation) {
//        super(wsdlLocation, ORDERPORT_QNAME);
//    }
//
//    public OrderPort(URL wsdlLocation, WebServiceFeature... features) {
//        super(wsdlLocation, ORDERPORT_QNAME, features);
//    }
//
//    public OrderPort(URL wsdlLocation, QName serviceName) {
//        super(wsdlLocation, serviceName);
//    }
//
//    public OrderPort(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
//        super(wsdlLocation, serviceName, features);
//    }
//
//    /**
//     * 
//     * @return
//     *     returns OrderPortType
//     */
//    @WebEndpoint(name = "OrderPort")
//    public OrderPortType getOrderPort() {
//        return super.getPort(new QName("http://mdsuk.com/ws/dise3g/order/service", "OrderPort"), OrderPortType.class);
//    }
//
//    /**
//     * 
//     * @param features
//     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
//     * @return
//     *     returns OrderPortType
//     */
//    @WebEndpoint(name = "OrderPort")
//    public OrderPortType getOrderPort(WebServiceFeature... features) {
//        return super.getPort(new QName("http://mdsuk.com/ws/dise3g/order/service", "OrderPort"), OrderPortType.class, features);
//    }
//
//    private static URL __getWsdlLocation() {
//        if (ORDERPORT_EXCEPTION!= null) {
//            throw ORDERPORT_EXCEPTION;
//        }
//        return ORDERPORT_WSDL_LOCATION;
//    }
//
//}
