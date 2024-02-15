package com.bt.ms.im.cmp.createorder;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.SoapFaultClientException;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.bt.ms.im.cmp.createorder.entity.CreateOrder;
import com.bt.ms.im.cmp.createorder.entity.CreateOrderResponse;

import jakarta.xml.bind.JAXBElement;



@EnableConfigurationProperties(CreateOrderServiceProperties.class)
public class CreateOrderServiceClient extends WebServiceGatewaySupport {

//	Logger log = LoggerFactory.getLogger(CreateOrderServiceClient.class);
	
	@Autowired
	private CreateOrderServiceProperties createOrderServiceProperties;

	/*
	 * public CreateOrderServiceClient(CreateOrderServiceProperties
	 * createOrderServiceProperties) { super(); this.createOrderServiceProperties =
	 * createOrderServiceProperties; }
	 */

	public CreateOrderResponse createOrder(CreateOrder request) {
		try {
			@SuppressWarnings("unchecked")
			JAXBElement<CreateOrderResponse> response = (JAXBElement<CreateOrderResponse>) getWebServiceTemplate()
					.marshalSendAndReceive(this.createOrderServiceProperties.getService().getPath(),
							new com.bt.ms.im.cmp.createorder.entity.ObjectFactory().createCreateOrder(request),
							new SoapActionCallback(
									this.createOrderServiceProperties.getService().getCreateOrderSoapAction()));

			return response.getValue();
		} catch (SoapFaultClientException soapFaultException) {
/*			BaseFault fault = processFault(soapFaultException);*/
			throw new IllegalArgumentException();
		}
	}
}

	/**
	 * @param soapFaultException
	 * @return
	 */
	/*
	 * private BaseFault processFault(SoapFaultClientException soapFaultException) {
	 * JAXBElement<BaseFault> fault = null; //JAXBElement<ErrorListType>
	 * errorListType = null; try { fault = (JAXBElement<BaseFault>)
	 * getWebServiceTemplate().getUnmarshaller().unmarshal(
	 * soapFaultException.getSoapFault().getFaultDetail().getDetailEntries().next().
	 * getSource());
	 * 
	 * } catch (XmlMappingException | IOException e) { StackTraceElement[] st =
	 * e.getStackTrace();
	 * log.info("Exception cathced at CreateEquipmentOrderClient :: occured on:: {}"
	 * , Arrays.toString(st)); } return fault.getValue(); } }
	 */