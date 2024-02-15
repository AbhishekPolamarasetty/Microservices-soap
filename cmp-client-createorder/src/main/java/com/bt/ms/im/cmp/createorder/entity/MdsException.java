///**
// * 
// */
//package com.bt.ms.im.cmp.createorder.entity;
//
//import org.springframework.util.StringUtils;
//import org.springframework.ws.soap.client.SoapFaultClientException;
//
//import com.bt.ms.im.baseclientexception.BaseClientException;
//
//import lombok.Getter;
//import lombok.Setter;
//
///**
// * @author Shwetha G S
// *
// */
//
//@Getter
//@Setter
//public class MdsException extends BaseClientException {
//	private static final long serialVersionUID = -2395532411059786998L;
//	private String faultCode;
//	private String faultString;
//	private String faultActor;
//	private ErrorListType errorListType;
//
//	private Class<?> detailExceptionType;
//	private String detailCode;
//	private String detailFaultDescription;
//	private String detailSourceSystem;
//
//	public MdsException(String faultCode, String faultString) {
//		super();
//		this.faultCode = faultCode;
//		this.faultString = faultString;
//	}
//
//	/**
//	 * This class serves as a wrapper class for handling the
//	 * SoapFaultClientException from Excalibur
//	 * 
//	 * @param soapFaultException
//	 * @param faultDetail
//	 */
//	public MdsException(SoapFaultClientException soapFaultException, BaseFault faultDetail) {
//
//		this.faultCode = soapFaultException.getFaultCode().toString();
//		this.faultString = soapFaultException.getFaultStringOrReason();
//		this.faultActor = soapFaultException.getSoapFault().getFaultActorOrRole();
//		
//		if (null != faultDetail) {
//			if(faultDetail instanceof ValidationFault) {
//				String reason="";
//				this.errorListType = ((ValidationFault) faultDetail).getErrors();
//				if(((ValidationFault) faultDetail).getErrors()!= null) {
//					for (FaultDetails errorList : this.errorListType.getError()) {
//						reason = reason + errorList.getMessageId() + " - " + errorList.getMessageText() + ", ";
//					}
//					String reasonValue = (faultDetail.getDetails().getMessageId() + " : " + reason).replaceAll("..$", "");
//					this.detailExceptionType = faultDetail.getClass();
//					this.detailCode = reasonValue;
//					this.detailFaultDescription = faultDetail.getDetails().getMessageText();
//				}
//			}
//			else {
//				String extranInfo="";
//				if(faultDetail.getDetails().getExtraInfo() != null) {
//					extranInfo = ", " + faultDetail.getDetails().getExtraInfo();
//				}
//				this.detailExceptionType = faultDetail.getClass();
//				this.detailCode = faultDetail.getDetails().getMessageId();
//				this.detailFaultDescription = faultDetail.getDetails().getMessageText() + extranInfo;
//			}
//			super.setReasonCode(this.detailCode);
//			super.setReasonText(this.detailFaultDescription);
//			super.setSourceSystem(getDetailCode());
//
//		} else {
//			super.setReasonCode(this.faultCode);
//			super.setReasonText(this.faultString);
//		}
//	}
//}
