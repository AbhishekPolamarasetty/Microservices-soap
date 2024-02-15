package com.bt.ms.im.cmp.createorder;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties("mds.createorder")
@Validated
@Configuration
public class CreateOrderServiceProperties {

	private static final String DEFAULT_QUERYSTOCK_SOAPACTION = "http://mdsuk.com/ws/dise3g/order/service/OrderPortType/CreateOrderRequest";

	private static final int DEFAULT_READ_TIMEOUT_SECONDS = 20;

	private static final int DEFAULT_CONNECTION_TIMEOUT_SECONDS = 5;

	@Valid
	private Service service;

	@Getter
	@Setter
	public static class Service {

		@NotBlank
		private String path;

		private String createOrderSoapAction = DEFAULT_QUERYSTOCK_SOAPACTION;

		private int readTimeoutSeconds = DEFAULT_READ_TIMEOUT_SECONDS;

		private int connectionTimeoutSeconds = DEFAULT_CONNECTION_TIMEOUT_SECONDS;

	}
}
