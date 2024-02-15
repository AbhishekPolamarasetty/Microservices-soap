//
//package com.bt.ms.im.cmp.createorder.entity;
//
//import javax.jws.WebMethod;
//import javax.jws.WebParam;
//import javax.jws.WebRevax
//import javax.jws.WebService;
//import javax.jws.soap.SOAPBinding;
//import jakarta.xml.bind.annotation.XmlSeeAlso;
//import javax.xml.ws.RequestWrapper;
//import javax.xml.ws.ResponseWrapper;
//
//
///**
// * This class was generated by the JAX-WS RI.
// * JAX-WS RI 2.2.9-b130926.1035
// * Generated source version: 2.2
// * 
// */
//@WebService(name = "OrderPortType", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition")
//@XmlSeeAlso({
//    ObjectFactory.class
//})
//public interface OrderPortType {
//
//
//    /**
//     * 
//     * @param orderData
//     * @return
//     *     returns com.bt.ms.im.cmp.createorder.entity.OrderResponseType
//     * @throws SecurityFault_Exception
//     * @throws SystemFault_Exception
//     * @throws ValidationFault_Exception
//     * @throws ServiceUnavailableFault_Exception
//     */
//    @WebMethod(operationName = "CreateOrder")
//    @WebResult(name = "Result", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition")
//    @RequestWrapper(localName = "CreateOrder", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition", className = "com.bt.ms.im.cmp.createorder.entity.CreateOrder")
//    @ResponseWrapper(localName = "CreateOrderResponse", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition", className = "com.bt.ms.im.cmp.createorder.entity.CreateOrderResponse")
//    public OrderResponseType createOrder(
//        @WebParam(name = "OrderData", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition")
//        OrderType orderData)
//        throws SecurityFault_Exception, ServiceUnavailableFault_Exception, SystemFault_Exception, ValidationFault_Exception
//    ;
//
//    /**
//     * 
//     * @param orderData
//     * @return
//     *     returns com.bt.ms.im.cmp.createorder.entity.QueryOrderResponseType
//     * @throws SecurityFault_Exception
//     * @throws SystemFault_Exception
//     * @throws ValidationFault_Exception
//     * @throws ServiceUnavailableFault_Exception
//     */
//    @WebMethod(operationName = "QueryOrder")
//    @WebResult(name = "Result", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition")
//    @RequestWrapper(localName = "QueryOrder", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition", className = "com.bt.ms.im.cmp.createorder.entity.QueryOrder")
//    @ResponseWrapper(localName = "QueryOrderResponse", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition", className = "com.bt.ms.im.cmp.createorder.entity.QueryOrderResponse")
//    public QueryOrderResponseType queryOrder(
//        @WebParam(name = "OrderData", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition")
//        QueryOrderType orderData)
//        throws SecurityFault_Exception, ServiceUnavailableFault_Exception, SystemFault_Exception, ValidationFault_Exception
//    ;
//
//    /**
//     * 
//     * @param queryData
//     * @return
//     *     returns com.bt.ms.im.cmp.createorder.entity.StockEnquiryResponseType
//     * @throws SecurityFault_Exception
//     * @throws SystemFault_Exception
//     * @throws ValidationFault_Exception
//     * @throws ServiceUnavailableFault_Exception
//     */
//    @WebMethod(operationName = "QueryStock")
//    @WebResult(name = "Result", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition")
//    @RequestWrapper(localName = "QueryStock", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition", className = "com.bt.ms.im.cmp.createorder.entity.QueryStock")
//    @ResponseWrapper(localName = "QueryStockResponse", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition", className = "com.bt.ms.im.cmp.createorder.entity.QueryStockResponse")
//    public StockEnquiryResponseType queryStock(
//        @WebParam(name = "QueryData", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition")
//        StockEnquiryType queryData)
//        throws SecurityFault_Exception, ServiceUnavailableFault_Exception, SystemFault_Exception, ValidationFault_Exception
//    ;
//
//    /**
//     * 
//     * @param orderHistory
//     * @return
//     *     returns com.bt.ms.im.cmp.createorder.entity.QueryOrdersResponseType
//     * @throws SecurityFault_Exception
//     * @throws SystemFault_Exception
//     * @throws ValidationFault_Exception
//     * @throws ServiceUnavailableFault_Exception
//     */
//    @WebMethod(operationName = "QueryOrders")
//    @WebResult(name = "Result", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition")
//    @RequestWrapper(localName = "QueryOrders", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition", className = "com.bt.ms.im.cmp.createorder.entity.QueryOrders")
//    @ResponseWrapper(localName = "QueryOrdersResponse", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition", className = "com.bt.ms.im.cmp.createorder.entity.QueryOrdersResponse")
//    public QueryOrdersResponseType queryOrders(
//        @WebParam(name = "OrderHistory", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition")
//        QueryOrdersType orderHistory)
//        throws SecurityFault_Exception, ServiceUnavailableFault_Exception, SystemFault_Exception, ValidationFault_Exception
//    ;
//
//    /**
//     * 
//     * @param updateData
//     * @return
//     *     returns com.bt.ms.im.cmp.createorder.entity.UpdateOrderStatusResponseType
//     * @throws SecurityFault_Exception
//     * @throws SystemFault_Exception
//     * @throws ValidationFault_Exception
//     * @throws ServiceUnavailableFault_Exception
//     */
//    @WebMethod(operationName = "UpdateOrderStatus")
//    @WebResult(name = "Result", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition")
//    @RequestWrapper(localName = "UpdateOrderStatus", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition", className = "com.bt.ms.im.cmp.createorder.entity.UpdateOrderStatus")
//    @ResponseWrapper(localName = "UpdateOrderStatusResponse", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition", className = "com.bt.ms.im.cmp.createorder.entity.UpdateOrderStatusResponse")
//    public UpdateOrderStatusResponseType updateOrderStatus(
//        @WebParam(name = "UpdateData", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition")
//        UpdateOrderStatusType updateData)
//        throws SecurityFault_Exception, ServiceUnavailableFault_Exception, SystemFault_Exception, ValidationFault_Exception
//    ;
//
//    /**
//     * 
//     * @param parameters
//     * @return
//     *     returns com.bt.ms.im.cmp.createorder.entity.SubsOrderDispatchNotificationResponse
//     * @throws SecurityFault_Exception
//     * @throws SystemFault_Exception
//     * @throws ValidationFault_Exception
//     * @throws ServiceUnavailableFault_Exception
//     */
//    @WebMethod(operationName = "SubsOrderDispatchNotification")
//    @WebResult(name = "SubsOrderDispatchNotificationResponse", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition", partName = "Parameters")
//    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
//    public SubsOrderDispatchNotificationResponse subsOrderDispatchNotification(
//        @WebParam(name = "SubsOrderDispatchNotificationRequest", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition", partName = "Parameters")
//        SubsOrderDispatchNotificationRequest parameters)
//        throws SecurityFault_Exception, ServiceUnavailableFault_Exception, SystemFault_Exception, ValidationFault_Exception
//    ;
//
//}
