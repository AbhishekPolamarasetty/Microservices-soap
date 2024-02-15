//package com.bt.ms.im.cmp.createorder;
//
//import java.net.Socket;
//import java.util.Map;
//
//import javax.management.InvalidAttributeValueException;
//import javax.net.ssl.SSLContext;
//
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.config.RequestConfig;
//import org.apache.http.conn.ssl.NoopHostnameVerifier;
//import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
//import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
//import org.apache.http.impl.client.HttpClientBuilder;
//import org.apache.http.ssl.PrivateKeyDetails;
//import org.apache.http.ssl.PrivateKeyStrategy;
//import org.apache.http.ssl.SSLContextBuilder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.oxm.jaxb.Jaxb2Marshaller;
//import org.springframework.util.ResourceUtils;
//import org.springframework.ws.client.support.interceptor.ClientInterceptor;
//import org.springframework.ws.transport.WebServiceMessageSender;
//import org.springframework.ws.transport.http.HttpComponentsMessageSender;
//import org.springframework.ws.transport.http.HttpComponentsMessageSender.RemoveSoapHeadersInterceptor;
//
//@Configuration
//public class CreateOrderServiceConfig {
//	@Value("${xmlgw.service.keystore_password: NA}")
//	private String keystorePassword;
//
//	@Value("${xmlgw.service.truststore_password: NA}")
//	private String truststorePassword;
//
//	@Value("${xmlgw.service.identity_location: NA}")
//	private String identityLocation;
//
//	@Value("${xmlgw.service.trust_location: NA}")
//	private String trustLocation;
//
//	@Value("${xmlgw.service.cert_alias: NA}")
//	private String alias;
//
//	@Value("${downstream.client.isOneWaySSL : false}")
//	private boolean isOneWaySSL;
//
//	@Autowired
//	CreateOrderServiceProperties qsProperties;
//
//	@Autowired
//	ClientInterceptor logWsClientInterceptor;
//
//	private static final String DEFAULT_PRPERTY_VALUE = "NA";
//
//	@Bean
//	public CreateOrderServiceClient queryStockClient() throws Exception {
//		CreateOrderServiceClient client = new CreateOrderServiceClient(qsProperties);
//		client.setDefaultUri(qsProperties.getService().getPath());
//		client.setMarshaller(mdsQueryStockMarshaller());
//		client.setUnmarshaller(mdsQueryStockMarshaller());
//		client.setMessageSender(mdsQueryStockWebServiceMessageSender());
//		ClientInterceptor[] interceptors = new ClientInterceptor[] { this.logWsClientInterceptor };
//		client.setInterceptors(interceptors);
//		return client;
//	}
//
//	private Jaxb2Marshaller mdsQueryStockMarshaller() {
//		CustJaxbUnMarshaller queryStockMarshaller = new CustJaxbUnMarshaller();
//		// Jaxb2Marshaller queryStockMarshaller = new Jaxb2Marshaller();
//		// this package must match the package in the <generatePackage> specified in
//		// pom.xml
//		queryStockMarshaller.setContextPath("com.bt.ms.im.cmp.createorder.entity");
//		return queryStockMarshaller;
//	}
//
//	private WebServiceMessageSender mdsQueryStockWebServiceMessageSender() throws Exception {
//		HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
//		// timeout for creating a connection
//		httpComponentsMessageSender
//				.setConnectionTimeout(qsProperties.getService().getConnectionTimeoutSeconds() * 1000);
//		// when you have a connection, timeout the read blocks for
//		httpComponentsMessageSender.setReadTimeout(qsProperties.getService().getReadTimeoutSeconds() * 1000);
//		httpComponentsMessageSender.setHttpClient(httpClient());
//		return httpComponentsMessageSender;
//	}
//
//	public HttpClient httpClient() throws Exception {
//		String path = qsProperties.getService().getPath();
//		RequestConfig config = RequestConfig.custom()
//				.setConnectTimeout(qsProperties.getService().getConnectionTimeoutSeconds() * 1000)
//				.setSocketTimeout(qsProperties.getService().getReadTimeoutSeconds() * 1000).build();
//		if (path != null && path.contains("https") && !isOneWaySSL) {
//			return HttpClientBuilder.create().setDefaultRequestConfig(config)
//					.setSSLSocketFactory(sslConnectionSocketFactory())
//					.addInterceptorFirst(new RemoveSoapHeadersInterceptor())
//					.setRetryHandler(new DefaultHttpRequestRetryHandler(3, true)).build();
//		}
//		return HttpClientBuilder.create().setDefaultRequestConfig(config)
//				.addInterceptorFirst(new RemoveSoapHeadersInterceptor())
//				.setRetryHandler(new DefaultHttpRequestRetryHandler(3, true)).build();
//	}
//
//	public SSLConnectionSocketFactory sslConnectionSocketFactory() throws Exception {
//		// NoopHostnameVerifier essentially turns hostname verification off as otherwise
//		// following error
//		// is thrown: java.security.cert.CertificateException: No name matching
//		// localhost found
//		return new SSLConnectionSocketFactory(sslContext(), NoopHostnameVerifier.INSTANCE);
//	}
//
//	public SSLContext sslContext() throws Exception {
//		if (keystorePassword.trim().equals(DEFAULT_PRPERTY_VALUE)
//				|| truststorePassword.trim().equals(DEFAULT_PRPERTY_VALUE)
//				|| identityLocation.trim().equals(DEFAULT_PRPERTY_VALUE)
//				|| trustLocation.trim().equals(DEFAULT_PRPERTY_VALUE)) {
//			throw new InvalidAttributeValueException(
//					"Configure valid values for keystore and trust store for https calls");
//		}
//
//		return SSLContextBuilder.create().loadKeyMaterial(ResourceUtils.getFile(identityLocation),
//				keystorePassword.toCharArray(), keystorePassword.toCharArray(), new PrivateKeyStrategy() {
//					@Override
//					public String chooseAlias(Map<String, PrivateKeyDetails> aliases, Socket socket) {
//						return alias;
//					}
//				}).loadTrustMaterial(ResourceUtils.getFile(trustLocation), truststorePassword.toCharArray()).build();
//
//	}
//}
