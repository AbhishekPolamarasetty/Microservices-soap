package com.bt.ms.im.mapper;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.springframework.stereotype.Component;

import com.bt.ms.im.css.createequipmentorder.entity.CreateEquipmentOrderRequest;
import com.bt.ms.im.css.createequipmentorder.entity.CreateEquipmentOrderResponse;
import com.bt.ms.im.css.createequipmentorder.entity.ObjectFactory;
import com.bt.ms.im.entity.ProductOrderCreateRequest;

@Component
public class RequestMapper {
	public CreateEquipmentOrderRequest postRequestToCss(ProductOrderCreateRequest request) {
		CreateEquipmentOrderRequest createEquipmentOrderRequest = new CreateEquipmentOrderRequest();
//		createEquipmentOrderRequest.setMessage(request.);
		System.out.println(request.getBillingAccount().getId());

		return new CreateEquipmentOrderRequest();
	}

}
//
//@Component
//public class RequestMapper {
//	public CreateEquipmentOrderRequest postRequestToCss(ProductOrderCreateRequest request) {
//		CreateEquipmentOrderRequest createEquipmentOrderRequest = new CreateEquipmentOrderRequest();
////		createEquipmentOrderRequest.setMessage(request.);
//		ObjectFactory  objectFactory = new ObjectFactory();
//		if (request.getBillingAccount() != null) {
//			String billingId = objectFactory.createCreateEquipmentOrder().getMessage().getCustomerDetails().getEquipmentAccountNumber();
//			createEquipmentOrderRequest.getMessage().getCustomerDetails().setEquipmentAccountNumber(billingId);;
//		}
//		System.out.println(request.getBillingAccount().getId());
//        if (request.getExternalId()!= null) {
//        	String externalId = objectFactory.createCreateEquipmentOrder().getMessage().getCustomerDetails().getPoNumber();
//        	createEquipmentOrderRequest.getMessage().getCustomerDetails().setPoNumber(externalId);
//        }
////        System.out.println(request.getExternalId());
//		return new CreateEquipmentOrderRequest();
//	}
//
//}