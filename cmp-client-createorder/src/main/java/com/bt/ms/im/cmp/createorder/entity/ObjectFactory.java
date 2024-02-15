
package com.bt.ms.im.cmp.createorder.entity;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bt.ms.im.cmp.createorder.entity package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {
	private final static QName _CreateOrder_QNAME = new QName("http://mdsuk.com/ws/dise3g/order/definition", "CreateOrder");
    private final static QName _CreateOrderResponse_QNAME = new QName("http://mdsuk.com/ws/dise3g/order/definition", "CreateOrderResponse");

    private final static QName _SystemFault_QNAME = new QName("http://mdsuk.com/ws/dise3g/fault/definition", "SystemFault");
    private final static QName _ValidationFault_QNAME = new QName("http://mdsuk.com/ws/dise3g/fault/definition", "ValidationFault");
    private final static QName _SecurityFault_QNAME = new QName("http://mdsuk.com/ws/dise3g/fault/definition", "SecurityFault");
    private final static QName _ServiceUnavailableFault_QNAME = new QName("http://mdsuk.com/ws/dise3g/fault/definition", "ServiceUnavailableFault");
    private final static QName _PaymentType2StartDateMMYYNumber_QNAME = new QName("", "startDateMMYYNumber");
    private final static QName _PaymentType2NameOnCard_QNAME = new QName("", "nameOnCard");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bt.ms.im.cmp.createorder.entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidationFault }
     * 
     */
    public ValidationFault createValidationFault() {
        return new ValidationFault();
    }

    /**
     * Create an instance of {@link SystemFault }
     * 
     */
    public SystemFault createSystemFault() {
        return new SystemFault();
    }

    /**
     * Create an instance of {@link ServiceUnavailableFault }
     * 
     */
    public ServiceUnavailableFault createServiceUnavailableFault() {
        return new ServiceUnavailableFault();
    }

    /**
     * Create an instance of {@link SecurityFault }
     * 
     */
    public SecurityFault createSecurityFault() {
        return new SecurityFault();
    }

    /**
     * Create an instance of {@link FaultDetails }
     * 
     */
    public FaultDetails createFaultDetails() {
        return new FaultDetails();
    }

    /**
     * Create an instance of {@link BaseFault }
     * 
     */
    public BaseFault createBaseFault() {
        return new BaseFault();
    }

    /**
     * Create an instance of {@link ErrorListType }
     * 
     */
    public ErrorListType createErrorListType() {
        return new ErrorListType();
    }

    /**
     * Create an instance of {@link QueryOrderResponse }
     * 
     */
    public QueryOrderResponse createQueryOrderResponse() {
        return new QueryOrderResponse();
    }

    /**
     * Create an instance of {@link QueryOrderResponseType }
     * 
     */
    public QueryOrderResponseType createQueryOrderResponseType() {
        return new QueryOrderResponseType();
    }

    /**
     * Create an instance of {@link SubsOrderDispatchNotificationRequest }
     * 
     */
    public SubsOrderDispatchNotificationRequest createSubsOrderDispatchNotificationRequest() {
        return new SubsOrderDispatchNotificationRequest();
    }

    /**
     * Create an instance of {@link OrderDispatchNotificationType }
     * 
     */
    public OrderDispatchNotificationType createOrderDispatchNotificationType() {
        return new OrderDispatchNotificationType();
    }

    /**
     * Create an instance of {@link UpdateOrderStatusResponse }
     * 
     */
    public UpdateOrderStatusResponse createUpdateOrderStatusResponse() {
        return new UpdateOrderStatusResponse();
    }

    /**
     * Create an instance of {@link UpdateOrderStatusResponseType }
     * 
     */
    public UpdateOrderStatusResponseType createUpdateOrderStatusResponseType() {
        return new UpdateOrderStatusResponseType();
    }

    /**
     * Create an instance of {@link QueryOrders }
     * 
     */
    public QueryOrders createQueryOrders() {
        return new QueryOrders();
    }

    /**
     * Create an instance of {@link QueryOrdersType }
     * 
     */
    public QueryOrdersType createQueryOrdersType() {
        return new QueryOrdersType();
    }

    /**
     * Create an instance of {@link QueryStockResponse }
     * 
     */
    public QueryStockResponse createQueryStockResponse() {
        return new QueryStockResponse();
    }

    /**
     * Create an instance of {@link StockEnquiryResponseType }
     * 
     */
    public StockEnquiryResponseType createStockEnquiryResponseType() {
        return new StockEnquiryResponseType();
    }

    /**
     * Create an instance of {@link CreateOrder }
     * 
     */
    public CreateOrder createCreateOrder() {
        return new CreateOrder();
    }

    /**
     * Create an instance of {@link OrderType }
     * 
     */
    public OrderType createOrderType() {
        return new OrderType();
    }

    /**
     * Create an instance of {@link UpdateOrderStatus }
     * 
     */
    public UpdateOrderStatus createUpdateOrderStatus() {
        return new UpdateOrderStatus();
    }

    /**
     * Create an instance of {@link UpdateOrderStatusType }
     * 
     */
    public UpdateOrderStatusType createUpdateOrderStatusType() {
        return new UpdateOrderStatusType();
    }

    /**
     * Create an instance of {@link CreateOrderResponse }
     * 
     */
    public CreateOrderResponse createCreateOrderResponse() {
        return new CreateOrderResponse();
    }

    /**
     * Create an instance of {@link OrderResponseType }
     * 
     */
    public OrderResponseType createOrderResponseType() {
        return new OrderResponseType();
    }

    /**
     * Create an instance of {@link QueryStock }
     * 
     */
    public QueryStock createQueryStock() {
        return new QueryStock();
    }

    /**
     * Create an instance of {@link StockEnquiryType }
     * 
     */
    public StockEnquiryType createStockEnquiryType() {
        return new StockEnquiryType();
    }

    /**
     * Create an instance of {@link SubsOrderDispatchNotificationResponse }
     * 
     */
    public SubsOrderDispatchNotificationResponse createSubsOrderDispatchNotificationResponse() {
        return new SubsOrderDispatchNotificationResponse();
    }

    /**
     * Create an instance of {@link OrderDispatchNotificationResponseType }
     * 
     */
    public OrderDispatchNotificationResponseType createOrderDispatchNotificationResponseType() {
        return new OrderDispatchNotificationResponseType();
    }

    /**
     * Create an instance of {@link QueryOrdersResponse }
     * 
     */
    public QueryOrdersResponse createQueryOrdersResponse() {
        return new QueryOrdersResponse();
    }

    /**
     * Create an instance of {@link QueryOrdersResponseType }
     * 
     */
    public QueryOrdersResponseType createQueryOrdersResponseType() {
        return new QueryOrdersResponseType();
    }

    /**
     * Create an instance of {@link QueryOrder }
     * 
     */
    public QueryOrder createQueryOrder() {
        return new QueryOrder();
    }

    /**
     * Create an instance of {@link QueryOrderType }
     * 
     */
    public QueryOrderType createQueryOrderType() {
        return new QueryOrderType();
    }

    /**
     * Create an instance of {@link SubscriptionNumbersType }
     * 
     */
    public SubscriptionNumbersType createSubscriptionNumbersType() {
        return new SubscriptionNumbersType();
    }

    /**
     * Create an instance of {@link OrderResponseProductsType }
     * 
     */
    public OrderResponseProductsType createOrderResponseProductsType() {
        return new OrderResponseProductsType();
    }

    /**
     * Create an instance of {@link OrderResponseProductType }
     * 
     */
    public OrderResponseProductType createOrderResponseProductType() {
        return new OrderResponseProductType();
    }

    /**
     * Create an instance of {@link ProductType }
     * 
     */
    public ProductType createProductType() {
        return new ProductType();
    }

    /**
     * Create an instance of {@link OrderResponseSubscriptionsDetailsType }
     * 
     */
    public OrderResponseSubscriptionsDetailsType createOrderResponseSubscriptionsDetailsType() {
        return new OrderResponseSubscriptionsDetailsType();
    }

    /**
     * Create an instance of {@link SubscriptionUpgradesType }
     * 
     */
    public SubscriptionUpgradesType createSubscriptionUpgradesType() {
        return new SubscriptionUpgradesType();
    }

    /**
     * Create an instance of {@link ProductsType }
     * 
     */
    public ProductsType createProductsType() {
        return new ProductsType();
    }

    /**
     * Create an instance of {@link SubscriptionsConnectionType }
     * 
     */
    public SubscriptionsConnectionType createSubscriptionsConnectionType() {
        return new SubscriptionsConnectionType();
    }

    /**
     * Create an instance of {@link OrderResponseSubsDetailsType }
     * 
     */
    public OrderResponseSubsDetailsType createOrderResponseSubsDetailsType() {
        return new OrderResponseSubsDetailsType();
    }

    /**
     * Create an instance of {@link SubscriptionSelectionDataType }
     * 
     */
    public SubscriptionSelectionDataType createSubscriptionSelectionDataType() {
        return new SubscriptionSelectionDataType();
    }

    /**
     * Create an instance of {@link OrderAdditionalDetailType }
     * 
     */
    public OrderAdditionalDetailType createOrderAdditionalDetailType() {
        return new OrderAdditionalDetailType();
    }

    /**
     * Create an instance of {@link SubscriptionType }
     * 
     */
    public SubscriptionType createSubscriptionType() {
        return new SubscriptionType();
    }

    /**
     * Create an instance of {@link ProductsType2 }
     * 
     */
    public ProductsType2 createProductsType2() {
        return new ProductsType2();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeType();
    }

    /**
     * Create an instance of {@link OrderDispatchSubscriptionsType }
     * 
     */
    public OrderDispatchSubscriptionsType createOrderDispatchSubscriptionsType() {
        return new OrderDispatchSubscriptionsType();
    }

    /**
     * Create an instance of {@link SubscriptionOrderNumberChangeType }
     * 
     */
    public SubscriptionOrderNumberChangeType createSubscriptionOrderNumberChangeType() {
        return new SubscriptionOrderNumberChangeType();
    }

    /**
     * Create an instance of {@link ProductItemDetailType }
     * 
     */
    public ProductItemDetailType createProductItemDetailType() {
        return new ProductItemDetailType();
    }

    /**
     * Create an instance of {@link ProductType2 }
     * 
     */
    public ProductType2 createProductType2() {
        return new ProductType2();
    }

    /**
     * Create an instance of {@link OrdersType }
     * 
     */
    public OrdersType createOrdersType() {
        return new OrdersType();
    }

    /**
     * Create an instance of {@link OrderBasicType }
     * 
     */
    public OrderBasicType createOrderBasicType() {
        return new OrderBasicType();
    }

    /**
     * Create an instance of {@link QueryOrderDatasetsType }
     * 
     */
    public QueryOrderDatasetsType createQueryOrderDatasetsType() {
        return new QueryOrderDatasetsType();
    }

    /**
     * Create an instance of {@link OrderProductDataType }
     * 
     */
    public OrderProductDataType createOrderProductDataType() {
        return new OrderProductDataType();
    }

    /**
     * Create an instance of {@link OrderDispatchSubscriptionType }
     * 
     */
    public OrderDispatchSubscriptionType createOrderDispatchSubscriptionType() {
        return new OrderDispatchSubscriptionType();
    }

    /**
     * Create an instance of {@link SalesType }
     * 
     */
    public SalesType createSalesType() {
        return new SalesType();
    }

    /**
     * Create an instance of {@link SubscriptionsType }
     * 
     */
    public SubscriptionsType createSubscriptionsType() {
        return new SubscriptionsType();
    }

    /**
     * Create an instance of {@link SubscriptionOrderTariffChangeType }
     * 
     */
    public SubscriptionOrderTariffChangeType createSubscriptionOrderTariffChangeType() {
        return new SubscriptionOrderTariffChangeType();
    }

    /**
     * Create an instance of {@link ProductItemType }
     * 
     */
    public ProductItemType createProductItemType() {
        return new ProductItemType();
    }

    /**
     * Create an instance of {@link ProductItemsType }
     * 
     */
    public ProductItemsType createProductItemsType() {
        return new ProductItemsType();
    }

    /**
     * Create an instance of {@link OrderItemType }
     * 
     */
    public OrderItemType createOrderItemType() {
        return new OrderItemType();
    }

    /**
     * Create an instance of {@link SubscriptionOrderUpgradeType }
     * 
     */
    public SubscriptionOrderUpgradeType createSubscriptionOrderUpgradeType() {
        return new SubscriptionOrderUpgradeType();
    }

    /**
     * Create an instance of {@link ShippingAddressInformationType }
     * 
     */
    public ShippingAddressInformationType createShippingAddressInformationType() {
        return new ShippingAddressInformationType();
    }

    /**
     * Create an instance of {@link OrderHeaderType }
     * 
     */
    public OrderHeaderType createOrderHeaderType() {
        return new OrderHeaderType();
    }

    /**
     * Create an instance of {@link HandsetDetailsType }
     * 
     */
    public HandsetDetailsType createHandsetDetailsType() {
        return new HandsetDetailsType();
    }

    /**
     * Create an instance of {@link ProductItemDetailsType }
     * 
     */
    public ProductItemDetailsType createProductItemDetailsType() {
        return new ProductItemDetailsType();
    }

    /**
     * Create an instance of {@link SubscriptionIdentifierChoiceType }
     * 
     */
    public SubscriptionIdentifierChoiceType createSubscriptionIdentifierChoiceType() {
        return new SubscriptionIdentifierChoiceType();
    }

    /**
     * Create an instance of {@link NonManagedSerialNumbersType }
     * 
     */
    public NonManagedSerialNumbersType createNonManagedSerialNumbersType() {
        return new NonManagedSerialNumbersType();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link CreateBusinessAddressType }
     * 
     */
    public CreateBusinessAddressType createCreateBusinessAddressType() {
        return new CreateBusinessAddressType();
    }

    /**
     * Create an instance of {@link BusinessAddressQueryType }
     * 
     */
    public BusinessAddressQueryType createBusinessAddressQueryType() {
        return new BusinessAddressQueryType();
    }

    /**
     * Create an instance of {@link EmailTypes }
     * 
     */
    public EmailTypes createEmailTypes() {
        return new EmailTypes();
    }

    /**
     * Create an instance of {@link UpdateAddressBasicType }
     * 
     */
    public UpdateAddressBasicType createUpdateAddressBasicType() {
        return new UpdateAddressBasicType();
    }

    /**
     * Create an instance of {@link TargetIdentifierType }
     * 
     */
    public TargetIdentifierType createTargetIdentifierType() {
        return new TargetIdentifierType();
    }

    /**
     * Create an instance of {@link PersonalAddressType }
     * 
     */
    public PersonalAddressType createPersonalAddressType() {
        return new PersonalAddressType();
    }

    /**
     * Create an instance of {@link PersonalAddressQueryType }
     * 
     */
    public PersonalAddressQueryType createPersonalAddressQueryType() {
        return new PersonalAddressQueryType();
    }

    /**
     * Create an instance of {@link AddressQueryType }
     * 
     */
    public AddressQueryType createAddressQueryType() {
        return new AddressQueryType();
    }

    /**
     * Create an instance of {@link AddressUsageType }
     * 
     */
    public AddressUsageType createAddressUsageType() {
        return new AddressUsageType();
    }

    /**
     * Create an instance of {@link UpdateBusinessAddressType }
     * 
     */
    public UpdateBusinessAddressType createUpdateBusinessAddressType() {
        return new UpdateBusinessAddressType();
    }

    /**
     * Create an instance of {@link CreateAddressBasicType }
     * 
     */
    public CreateAddressBasicType createCreateAddressBasicType() {
        return new CreateAddressBasicType();
    }

    /**
     * Create an instance of {@link BusinessAddressType }
     * 
     */
    public BusinessAddressType createBusinessAddressType() {
        return new BusinessAddressType();
    }

    /**
     * Create an instance of {@link UpdatePersonalAddressType }
     * 
     */
    public UpdatePersonalAddressType createUpdatePersonalAddressType() {
        return new UpdatePersonalAddressType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link CreatePersonalAddressType }
     * 
     */
    public CreatePersonalAddressType createCreatePersonalAddressType() {
        return new CreatePersonalAddressType();
    }

    /**
     * Create an instance of {@link CustomerReferenceType }
     * 
     */
    public CustomerReferenceType createCustomerReferenceType() {
        return new CustomerReferenceType();
    }

    /**
     * Create an instance of {@link AuditRecordType }
     * 
     */
    public AuditRecordType createAuditRecordType() {
        return new AuditRecordType();
    }

    /**
     * Create an instance of {@link MessageDetailsType }
     * 
     */
    public MessageDetailsType createMessageDetailsType() {
        return new MessageDetailsType();
    }

    /**
     * Create an instance of {@link AttributesType }
     * 
     */
    public AttributesType createAttributesType() {
        return new AttributesType();
    }

    /**
     * Create an instance of {@link ClearableDateTimeType }
     * 
     */
    public ClearableDateTimeType createClearableDateTimeType() {
        return new ClearableDateTimeType();
    }

    /**
     * Create an instance of {@link ClearableDateType }
     * 
     */
    public ClearableDateType createClearableDateType() {
        return new ClearableDateType();
    }

    /**
     * Create an instance of {@link ParameterType }
     * 
     */
    public ParameterType createParameterType() {
        return new ParameterType();
    }

    /**
     * Create an instance of {@link AttributeDetailsType }
     * 
     */
    public AttributeDetailsType createAttributeDetailsType() {
        return new AttributeDetailsType();
    }

    /**
     * Create an instance of {@link CompatibilityRulesType }
     * 
     */
    public CompatibilityRulesType createCompatibilityRulesType() {
        return new CompatibilityRulesType();
    }

    /**
     * Create an instance of {@link MessageListType }
     * 
     */
    public MessageListType createMessageListType() {
        return new MessageListType();
    }

    /**
     * Create an instance of {@link BillingMediaType }
     * 
     */
    public BillingMediaType createBillingMediaType() {
        return new BillingMediaType();
    }

    /**
     * Create an instance of {@link ManagedSerialNumbersType }
     * 
     */
    public ManagedSerialNumbersType createManagedSerialNumbersType() {
        return new ManagedSerialNumbersType();
    }

    /**
     * Create an instance of {@link FeatureTypes }
     * 
     */
    public FeatureTypes createFeatureTypes() {
        return new FeatureTypes();
    }

    /**
     * Create an instance of {@link UpdateUsageAndCreditControlType }
     * 
     */
    public UpdateUsageAndCreditControlType createUpdateUsageAndCreditControlType() {
        return new UpdateUsageAndCreditControlType();
    }

    /**
     * Create an instance of {@link ContractAndSalesType }
     * 
     */
    public ContractAndSalesType createContractAndSalesType() {
        return new ContractAndSalesType();
    }

    /**
     * Create an instance of {@link LinkTargetReferenceType }
     * 
     */
    public LinkTargetReferenceType createLinkTargetReferenceType() {
        return new LinkTargetReferenceType();
    }

    /**
     * Create an instance of {@link NonManagedSerialNumberType }
     * 
     */
    public NonManagedSerialNumberType createNonManagedSerialNumberType() {
        return new NonManagedSerialNumberType();
    }

    /**
     * Create an instance of {@link CUGNumbersType }
     * 
     */
    public CUGNumbersType createCUGNumbersType() {
        return new CUGNumbersType();
    }

    /**
     * Create an instance of {@link UpdateCustomerDetailsType }
     * 
     */
    public UpdateCustomerDetailsType createUpdateCustomerDetailsType() {
        return new UpdateCustomerDetailsType();
    }

    /**
     * Create an instance of {@link CapType }
     * 
     */
    public CapType createCapType() {
        return new CapType();
    }

    /**
     * Create an instance of {@link SubscriptionServicesType }
     * 
     */
    public SubscriptionServicesType createSubscriptionServicesType() {
        return new SubscriptionServicesType();
    }

    /**
     * Create an instance of {@link PostPayCapsType }
     * 
     */
    public PostPayCapsType createPostPayCapsType() {
        return new PostPayCapsType();
    }

    /**
     * Create an instance of {@link QueryNotificationType }
     * 
     */
    public QueryNotificationType createQueryNotificationType() {
        return new QueryNotificationType();
    }

    /**
     * Create an instance of {@link RecordAccountBondType }
     * 
     */
    public RecordAccountBondType createRecordAccountBondType() {
        return new RecordAccountBondType();
    }

    /**
     * Create an instance of {@link CallClassOverridesDatasetsType }
     * 
     */
    public CallClassOverridesDatasetsType createCallClassOverridesDatasetsType() {
        return new CallClassOverridesDatasetsType();
    }

    /**
     * Create an instance of {@link RefreshType }
     * 
     */
    public RefreshType createRefreshType() {
        return new RefreshType();
    }

    /**
     * Create an instance of {@link ManagedSerialNumbersResponseType }
     * 
     */
    public ManagedSerialNumbersResponseType createManagedSerialNumbersResponseType() {
        return new ManagedSerialNumbersResponseType();
    }

    /**
     * Create an instance of {@link DefaultRewardCategoryType }
     * 
     */
    public DefaultRewardCategoryType createDefaultRewardCategoryType() {
        return new DefaultRewardCategoryType();
    }

    /**
     * Create an instance of {@link SubscriptionUpgradeType }
     * 
     */
    public SubscriptionUpgradeType createSubscriptionUpgradeType() {
        return new SubscriptionUpgradeType();
    }

    /**
     * Create an instance of {@link NonManagedSerialNumberResponseType }
     * 
     */
    public NonManagedSerialNumberResponseType createNonManagedSerialNumberResponseType() {
        return new NonManagedSerialNumberResponseType();
    }

    /**
     * Create an instance of {@link NetworkSubCodesType }
     * 
     */
    public NetworkSubCodesType createNetworkSubCodesType() {
        return new NetworkSubCodesType();
    }

    /**
     * Create an instance of {@link UpdateContractAndSalesType }
     * 
     */
    public UpdateContractAndSalesType createUpdateContractAndSalesType() {
        return new UpdateContractAndSalesType();
    }

    /**
     * Create an instance of {@link QueryPostPayCapsType }
     * 
     */
    public QueryPostPayCapsType createQueryPostPayCapsType() {
        return new QueryPostPayCapsType();
    }

    /**
     * Create an instance of {@link QuerySubscriptionDatasetsType }
     * 
     */
    public QuerySubscriptionDatasetsType createQuerySubscriptionDatasetsType() {
        return new QuerySubscriptionDatasetsType();
    }

    /**
     * Create an instance of {@link NonManagedSerialNumbersValueType }
     * 
     */
    public NonManagedSerialNumbersValueType createNonManagedSerialNumbersValueType() {
        return new NonManagedSerialNumbersValueType();
    }

    /**
     * Create an instance of {@link UpdateSubscriptionBasicType }
     * 
     */
    public UpdateSubscriptionBasicType createUpdateSubscriptionBasicType() {
        return new UpdateSubscriptionBasicType();
    }

    /**
     * Create an instance of {@link SimProfileInformationsType }
     * 
     */
    public SimProfileInformationsType createSimProfileInformationsType() {
        return new SimProfileInformationsType();
    }

    /**
     * Create an instance of {@link UpdateBillingMediaType }
     * 
     */
    public UpdateBillingMediaType createUpdateBillingMediaType() {
        return new UpdateBillingMediaType();
    }

    /**
     * Create an instance of {@link ActivateDataType }
     * 
     */
    public ActivateDataType createActivateDataType() {
        return new ActivateDataType();
    }

    /**
     * Create an instance of {@link EligibilityRulesType }
     * 
     */
    public EligibilityRulesType createEligibilityRulesType() {
        return new EligibilityRulesType();
    }

    /**
     * Create an instance of {@link NetworkSubCodeType }
     * 
     */
    public NetworkSubCodeType createNetworkSubCodeType() {
        return new NetworkSubCodeType();
    }

    /**
     * Create an instance of {@link UpgradeEligibleType }
     * 
     */
    public UpgradeEligibleType createUpgradeEligibleType() {
        return new UpgradeEligibleType();
    }

    /**
     * Create an instance of {@link SubscriptionDonorLedPortDetailsType }
     * 
     */
    public SubscriptionDonorLedPortDetailsType createSubscriptionDonorLedPortDetailsType() {
        return new SubscriptionDonorLedPortDetailsType();
    }

    /**
     * Create an instance of {@link ManagedSerialNumberType }
     * 
     */
    public ManagedSerialNumberType createManagedSerialNumberType() {
        return new ManagedSerialNumberType();
    }

    /**
     * Create an instance of {@link RewardEntitlementsTypes }
     * 
     */
    public RewardEntitlementsTypes createRewardEntitlementsTypes() {
        return new RewardEntitlementsTypes();
    }

    /**
     * Create an instance of {@link PricePlanDefinitionsType }
     * 
     */
    public PricePlanDefinitionsType createPricePlanDefinitionsType() {
        return new PricePlanDefinitionsType();
    }

    /**
     * Create an instance of {@link RefreshRecurringType }
     * 
     */
    public RefreshRecurringType createRefreshRecurringType() {
        return new RefreshRecurringType();
    }

    /**
     * Create an instance of {@link PackagesDatasetsType }
     * 
     */
    public PackagesDatasetsType createPackagesDatasetsType() {
        return new PackagesDatasetsType();
    }

    /**
     * Create an instance of {@link NetworkSubCodesValueType }
     * 
     */
    public NetworkSubCodesValueType createNetworkSubCodesValueType() {
        return new NetworkSubCodesValueType();
    }

    /**
     * Create an instance of {@link UsageAndCreditControlType }
     * 
     */
    public UsageAndCreditControlType createUsageAndCreditControlType() {
        return new UsageAndCreditControlType();
    }

    /**
     * Create an instance of {@link CUGDatasetType }
     * 
     */
    public CUGDatasetType createCUGDatasetType() {
        return new CUGDatasetType();
    }

    /**
     * Create an instance of {@link FailureReasonsType }
     * 
     */
    public FailureReasonsType createFailureReasonsType() {
        return new FailureReasonsType();
    }

    /**
     * Create an instance of {@link QueryNotificationsType }
     * 
     */
    public QueryNotificationsType createQueryNotificationsType() {
        return new QueryNotificationsType();
    }

    /**
     * Create an instance of {@link PackagesToExpireType }
     * 
     */
    public PackagesToExpireType createPackagesToExpireType() {
        return new PackagesToExpireType();
    }

    /**
     * Create an instance of {@link NonManagedSerialNumbersResponseType }
     * 
     */
    public NonManagedSerialNumbersResponseType createNonManagedSerialNumbersResponseType() {
        return new NonManagedSerialNumbersResponseType();
    }

    /**
     * Create an instance of {@link NotificationPreferencesType }
     * 
     */
    public NotificationPreferencesType createNotificationPreferencesType() {
        return new NotificationPreferencesType();
    }

    /**
     * Create an instance of {@link RefreshAutomaticType }
     * 
     */
    public RefreshAutomaticType createRefreshAutomaticType() {
        return new RefreshAutomaticType();
    }

    /**
     * Create an instance of {@link NetworkSubCodeValueType }
     * 
     */
    public NetworkSubCodeValueType createNetworkSubCodeValueType() {
        return new NetworkSubCodeValueType();
    }

    /**
     * Create an instance of {@link PackagesToCreateType }
     * 
     */
    public PackagesToCreateType createPackagesToCreateType() {
        return new PackagesToCreateType();
    }

    /**
     * Create an instance of {@link AsOfDateType }
     * 
     */
    public AsOfDateType createAsOfDateType() {
        return new AsOfDateType();
    }

    /**
     * Create an instance of {@link DefinitionsDatasetsType }
     * 
     */
    public DefinitionsDatasetsType createDefinitionsDatasetsType() {
        return new DefinitionsDatasetsType();
    }

    /**
     * Create an instance of {@link LinkedSubscriptionsType }
     * 
     */
    public LinkedSubscriptionsType createLinkedSubscriptionsType() {
        return new LinkedSubscriptionsType();
    }

    /**
     * Create an instance of {@link RewardEntitlementType }
     * 
     */
    public RewardEntitlementType createRewardEntitlementType() {
        return new RewardEntitlementType();
    }

    /**
     * Create an instance of {@link CreateEmailType }
     * 
     */
    public CreateEmailType createCreateEmailType() {
        return new CreateEmailType();
    }

    /**
     * Create an instance of {@link SimProfileInformationType }
     * 
     */
    public SimProfileInformationType createSimProfileInformationType() {
        return new SimProfileInformationType();
    }

    /**
     * Create an instance of {@link UpdateManagedSerialNumberChoiceType }
     * 
     */
    public UpdateManagedSerialNumberChoiceType createUpdateManagedSerialNumberChoiceType() {
        return new UpdateManagedSerialNumberChoiceType();
    }

    /**
     * Create an instance of {@link CapWithUnBarType }
     * 
     */
    public CapWithUnBarType createCapWithUnBarType() {
        return new CapWithUnBarType();
    }

    /**
     * Create an instance of {@link SerialNumbersType }
     * 
     */
    public SerialNumbersType createSerialNumbersType() {
        return new SerialNumbersType();
    }

    /**
     * Create an instance of {@link SubscriptionConnectionType }
     * 
     */
    public SubscriptionConnectionType createSubscriptionConnectionType() {
        return new SubscriptionConnectionType();
    }

    /**
     * Create an instance of {@link SubscriptionServiceBasicType }
     * 
     */
    public SubscriptionServiceBasicType createSubscriptionServiceBasicType() {
        return new SubscriptionServiceBasicType();
    }

    /**
     * Create an instance of {@link CallClassOverrideDatasetType }
     * 
     */
    public CallClassOverrideDatasetType createCallClassOverrideDatasetType() {
        return new CallClassOverrideDatasetType();
    }

    /**
     * Create an instance of {@link SubscriptionBarsType }
     * 
     */
    public SubscriptionBarsType createSubscriptionBarsType() {
        return new SubscriptionBarsType();
    }

    /**
     * Create an instance of {@link ContractType }
     * 
     */
    public ContractType createContractType() {
        return new ContractType();
    }

    /**
     * Create an instance of {@link UpdateManagedSerialNumbersType }
     * 
     */
    public UpdateManagedSerialNumbersType createUpdateManagedSerialNumbersType() {
        return new UpdateManagedSerialNumbersType();
    }

    /**
     * Create an instance of {@link NetworkSubCodesResponseType }
     * 
     */
    public NetworkSubCodesResponseType createNetworkSubCodesResponseType() {
        return new NetworkSubCodesResponseType();
    }

    /**
     * Create an instance of {@link DiscountsOverridesType }
     * 
     */
    public DiscountsOverridesType createDiscountsOverridesType() {
        return new DiscountsOverridesType();
    }

    /**
     * Create an instance of {@link FeatureType }
     * 
     */
    public FeatureType createFeatureType() {
        return new FeatureType();
    }

    /**
     * Create an instance of {@link ExpirePackageType }
     * 
     */
    public ExpirePackageType createExpirePackageType() {
        return new ExpirePackageType();
    }

    /**
     * Create an instance of {@link RefreshTypeType }
     * 
     */
    public RefreshTypeType createRefreshTypeType() {
        return new RefreshTypeType();
    }

    /**
     * Create an instance of {@link NotificationPreferenceType }
     * 
     */
    public NotificationPreferenceType createNotificationPreferenceType() {
        return new NotificationPreferenceType();
    }

    /**
     * Create an instance of {@link BasePackageType }
     * 
     */
    public BasePackageType createBasePackageType() {
        return new BasePackageType();
    }

    /**
     * Create an instance of {@link UpdatePackageCodeType }
     * 
     */
    public UpdatePackageCodeType createUpdatePackageCodeType() {
        return new UpdatePackageCodeType();
    }

    /**
     * Create an instance of {@link PostPayCapsWithUnBarType }
     * 
     */
    public PostPayCapsWithUnBarType createPostPayCapsWithUnBarType() {
        return new PostPayCapsWithUnBarType();
    }

    /**
     * Create an instance of {@link QueryPostPayCapType }
     * 
     */
    public QueryPostPayCapType createQueryPostPayCapType() {
        return new QueryPostPayCapType();
    }

    /**
     * Create an instance of {@link SubscriptionBasicType }
     * 
     */
    public SubscriptionBasicType createSubscriptionBasicType() {
        return new SubscriptionBasicType();
    }

    /**
     * Create an instance of {@link ManagedSerialNumberResponseType }
     * 
     */
    public ManagedSerialNumberResponseType createManagedSerialNumberResponseType() {
        return new ManagedSerialNumberResponseType();
    }

    /**
     * Create an instance of {@link ExclusionPeriodType }
     * 
     */
    public ExclusionPeriodType createExclusionPeriodType() {
        return new ExclusionPeriodType();
    }

    /**
     * Create an instance of {@link PendingTariffChangeDatasetType }
     * 
     */
    public PendingTariffChangeDatasetType createPendingTariffChangeDatasetType() {
        return new PendingTariffChangeDatasetType();
    }

    /**
     * Create an instance of {@link SubscriptionServiceType }
     * 
     */
    public SubscriptionServiceType createSubscriptionServiceType() {
        return new SubscriptionServiceType();
    }

    /**
     * Create an instance of {@link UpdateBoltOnPackagesType }
     * 
     */
    public UpdateBoltOnPackagesType createUpdateBoltOnPackagesType() {
        return new UpdateBoltOnPackagesType();
    }

    /**
     * Create an instance of {@link RefreshesType }
     * 
     */
    public RefreshesType createRefreshesType() {
        return new RefreshesType();
    }

    /**
     * Create an instance of {@link NetworkSubCodeResponseType }
     * 
     */
    public NetworkSubCodeResponseType createNetworkSubCodeResponseType() {
        return new NetworkSubCodeResponseType();
    }

    /**
     * Create an instance of {@link ConnectionDetailsType }
     * 
     */
    public ConnectionDetailsType createConnectionDetailsType() {
        return new ConnectionDetailsType();
    }

    /**
     * Create an instance of {@link PackageDatasetType }
     * 
     */
    public PackageDatasetType createPackageDatasetType() {
        return new PackageDatasetType();
    }

    /**
     * Create an instance of {@link CustomerDetailsType }
     * 
     */
    public CustomerDetailsType createCustomerDetailsType() {
        return new CustomerDetailsType();
    }

    /**
     * Create an instance of {@link PricePlanDefinitionType }
     * 
     */
    public PricePlanDefinitionType createPricePlanDefinitionType() {
        return new PricePlanDefinitionType();
    }

    /**
     * Create an instance of {@link NumbersType }
     * 
     */
    public NumbersType createNumbersType() {
        return new NumbersType();
    }

    /**
     * Create an instance of {@link SubscriptionServicesBasicType }
     * 
     */
    public SubscriptionServicesBasicType createSubscriptionServicesBasicType() {
        return new SubscriptionServicesBasicType();
    }

    /**
     * Create an instance of {@link SubscriptionBarType }
     * 
     */
    public SubscriptionBarType createSubscriptionBarType() {
        return new SubscriptionBarType();
    }

    /**
     * Create an instance of {@link APNListType }
     * 
     */
    public APNListType createAPNListType() {
        return new APNListType();
    }

    /**
     * Create an instance of {@link BoltOnPackageType }
     * 
     */
    public BoltOnPackageType createBoltOnPackageType() {
        return new BoltOnPackageType();
    }

    /**
     * Create an instance of {@link PricingPeriodCoverageType }
     * 
     */
    public PricingPeriodCoverageType createPricingPeriodCoverageType() {
        return new PricingPeriodCoverageType();
    }

    /**
     * Create an instance of {@link ExpireBoltOnPackagesType }
     * 
     */
    public ExpireBoltOnPackagesType createExpireBoltOnPackagesType() {
        return new ExpireBoltOnPackagesType();
    }

    /**
     * Create an instance of {@link NonManagedSerialNumbersType2 }
     * 
     */
    public NonManagedSerialNumbersType2 createNonManagedSerialNumbersType2() {
        return new NonManagedSerialNumbersType2();
    }

    /**
     * Create an instance of {@link NonManagedSerialNumberValueType }
     * 
     */
    public NonManagedSerialNumberValueType createNonManagedSerialNumberValueType() {
        return new NonManagedSerialNumberValueType();
    }

    /**
     * Create an instance of {@link UpdateManagedSerialNumberType }
     * 
     */
    public UpdateManagedSerialNumberType createUpdateManagedSerialNumberType() {
        return new UpdateManagedSerialNumberType();
    }

    /**
     * Create an instance of {@link ServiceDetailsType }
     * 
     */
    public ServiceDetailsType createServiceDetailsType() {
        return new ServiceDetailsType();
    }

    /**
     * Create an instance of {@link ActiveAndPendingServiceDetailType }
     * 
     */
    public ActiveAndPendingServiceDetailType createActiveAndPendingServiceDetailType() {
        return new ActiveAndPendingServiceDetailType();
    }

    /**
     * Create an instance of {@link ServiceDetailType }
     * 
     */
    public ServiceDetailType createServiceDetailType() {
        return new ServiceDetailType();
    }

    /**
     * Create an instance of {@link PackageDefinitionsType }
     * 
     */
    public PackageDefinitionsType createPackageDefinitionsType() {
        return new PackageDefinitionsType();
    }

    /**
     * Create an instance of {@link PackageDefinitionType }
     * 
     */
    public PackageDefinitionType createPackageDefinitionType() {
        return new PackageDefinitionType();
    }

    /**
     * Create an instance of {@link UpdateServiceBasicType }
     * 
     */
    public UpdateServiceBasicType createUpdateServiceBasicType() {
        return new UpdateServiceBasicType();
    }

    /**
     * Create an instance of {@link ServiceType }
     * 
     */
    public ServiceType createServiceType() {
        return new ServiceType();
    }

    /**
     * Create an instance of {@link ActiveAndPendingServiceDetailsType }
     * 
     */
    public ActiveAndPendingServiceDetailsType createActiveAndPendingServiceDetailsType() {
        return new ActiveAndPendingServiceDetailsType();
    }

    /**
     * Create an instance of {@link GenericServiceBasicType }
     * 
     */
    public GenericServiceBasicType createGenericServiceBasicType() {
        return new GenericServiceBasicType();
    }

    /**
     * Create an instance of {@link UnbilledUnitSummaryType }
     * 
     */
    public UnbilledUnitSummaryType createUnbilledUnitSummaryType() {
        return new UnbilledUnitSummaryType();
    }

    /**
     * Create an instance of {@link CurrentSubscriptionBundleType }
     * 
     */
    public CurrentSubscriptionBundleType createCurrentSubscriptionBundleType() {
        return new CurrentSubscriptionBundleType();
    }

    /**
     * Create an instance of {@link CUGNumbersType2 }
     * 
     */
    public CUGNumbersType2 createCUGNumbersType2() {
        return new CUGNumbersType2();
    }

    /**
     * Create an instance of {@link QueryAttributeType }
     * 
     */
    public QueryAttributeType createQueryAttributeType() {
        return new QueryAttributeType();
    }

    /**
     * Create an instance of {@link ResourceAttributeResponseType }
     * 
     */
    public ResourceAttributeResponseType createResourceAttributeResponseType() {
        return new ResourceAttributeResponseType();
    }

    /**
     * Create an instance of {@link DefinitionsType }
     * 
     */
    public DefinitionsType createDefinitionsType() {
        return new DefinitionsType();
    }

    /**
     * Create an instance of {@link QueryBundleDatasetsType }
     * 
     */
    public QueryBundleDatasetsType createQueryBundleDatasetsType() {
        return new QueryBundleDatasetsType();
    }

    /**
     * Create an instance of {@link CreateCUGNumbersListType }
     * 
     */
    public CreateCUGNumbersListType createCreateCUGNumbersListType() {
        return new CreateCUGNumbersListType();
    }

    /**
     * Create an instance of {@link BundleUnlinkedSubscriptionType }
     * 
     */
    public BundleUnlinkedSubscriptionType createBundleUnlinkedSubscriptionType() {
        return new BundleUnlinkedSubscriptionType();
    }

    /**
     * Create an instance of {@link RecentUsageFilterType }
     * 
     */
    public RecentUsageFilterType createRecentUsageFilterType() {
        return new RecentUsageFilterType();
    }

    /**
     * Create an instance of {@link UsageAttributesType }
     * 
     */
    public UsageAttributesType createUsageAttributesType() {
        return new UsageAttributesType();
    }

    /**
     * Create an instance of {@link AccessChargeDetailsType }
     * 
     */
    public AccessChargeDetailsType createAccessChargeDetailsType() {
        return new AccessChargeDetailsType();
    }

    /**
     * Create an instance of {@link UnbilledUnitType }
     * 
     */
    public UnbilledUnitType createUnbilledUnitType() {
        return new UnbilledUnitType();
    }

    /**
     * Create an instance of {@link CUGNumberType }
     * 
     */
    public CUGNumberType createCUGNumberType() {
        return new CUGNumberType();
    }

    /**
     * Create an instance of {@link BundleLinkedSubscriptionsType }
     * 
     */
    public BundleLinkedSubscriptionsType createBundleLinkedSubscriptionsType() {
        return new BundleLinkedSubscriptionsType();
    }

    /**
     * Create an instance of {@link BillableAssetIdentifierType }
     * 
     */
    public BillableAssetIdentifierType createBillableAssetIdentifierType() {
        return new BillableAssetIdentifierType();
    }

    /**
     * Create an instance of {@link QueryResourceTargetIdentifierType }
     * 
     */
    public QueryResourceTargetIdentifierType createQueryResourceTargetIdentifierType() {
        return new QueryResourceTargetIdentifierType();
    }

    /**
     * Create an instance of {@link ResourceAttributeIDType }
     * 
     */
    public ResourceAttributeIDType createResourceAttributeIDType() {
        return new ResourceAttributeIDType();
    }

    /**
     * Create an instance of {@link PrePayUsageSummaryType }
     * 
     */
    public PrePayUsageSummaryType createPrePayUsageSummaryType() {
        return new PrePayUsageSummaryType();
    }

    /**
     * Create an instance of {@link CurrentSubscriptionBundlesType }
     * 
     */
    public CurrentSubscriptionBundlesType createCurrentSubscriptionBundlesType() {
        return new CurrentSubscriptionBundlesType();
    }

    /**
     * Create an instance of {@link SetResourceAttributesBillableAssetLineIdentifierType }
     * 
     */
    public SetResourceAttributesBillableAssetLineIdentifierType createSetResourceAttributesBillableAssetLineIdentifierType() {
        return new SetResourceAttributesBillableAssetLineIdentifierType();
    }

    /**
     * Create an instance of {@link CallPricingBreakdownType }
     * 
     */
    public CallPricingBreakdownType createCallPricingBreakdownType() {
        return new CallPricingBreakdownType();
    }

    /**
     * Create an instance of {@link BasketType }
     * 
     */
    public BasketType createBasketType() {
        return new BasketType();
    }

    /**
     * Create an instance of {@link QueryAttributeGroupType }
     * 
     */
    public QueryAttributeGroupType createQueryAttributeGroupType() {
        return new QueryAttributeGroupType();
    }

    /**
     * Create an instance of {@link QueryBillableAssetDatasets }
     * 
     */
    public QueryBillableAssetDatasets createQueryBillableAssetDatasets() {
        return new QueryBillableAssetDatasets();
    }

    /**
     * Create an instance of {@link SubscriptionBundlesDatasetsType }
     * 
     */
    public SubscriptionBundlesDatasetsType createSubscriptionBundlesDatasetsType() {
        return new SubscriptionBundlesDatasetsType();
    }

    /**
     * Create an instance of {@link QueryRecentUsageTargetType }
     * 
     */
    public QueryRecentUsageTargetType createQueryRecentUsageTargetType() {
        return new QueryRecentUsageTargetType();
    }

    /**
     * Create an instance of {@link CUGInfoType }
     * 
     */
    public CUGInfoType createCUGInfoType() {
        return new CUGInfoType();
    }

    /**
     * Create an instance of {@link PostPayUnitsType }
     * 
     */
    public PostPayUnitsType createPostPayUnitsType() {
        return new PostPayUnitsType();
    }

    /**
     * Create an instance of {@link ServiceChargeDetailsType }
     * 
     */
    public ServiceChargeDetailsType createServiceChargeDetailsType() {
        return new ServiceChargeDetailsType();
    }

    /**
     * Create an instance of {@link ResourceTemplateResponseType }
     * 
     */
    public ResourceTemplateResponseType createResourceTemplateResponseType() {
        return new ResourceTemplateResponseType();
    }

    /**
     * Create an instance of {@link TargetIdentifierType2 }
     * 
     */
    public TargetIdentifierType2 createTargetIdentifierType2() {
        return new TargetIdentifierType2();
    }

    /**
     * Create an instance of {@link AttributeType2 }
     * 
     */
    public AttributeType2 createAttributeType2() {
        return new AttributeType2();
    }

    /**
     * Create an instance of {@link ResourceTemplateType }
     * 
     */
    public ResourceTemplateType createResourceTemplateType() {
        return new ResourceTemplateType();
    }

    /**
     * Create an instance of {@link PrePayUnitsType }
     * 
     */
    public PrePayUnitsType createPrePayUnitsType() {
        return new PrePayUnitsType();
    }

    /**
     * Create an instance of {@link BundleUnlinkedSubscriptionsType }
     * 
     */
    public BundleUnlinkedSubscriptionsType createBundleUnlinkedSubscriptionsType() {
        return new BundleUnlinkedSubscriptionsType();
    }

    /**
     * Create an instance of {@link BundleDefinitionsType }
     * 
     */
    public BundleDefinitionsType createBundleDefinitionsType() {
        return new BundleDefinitionsType();
    }

    /**
     * Create an instance of {@link CUGNumberInfoType }
     * 
     */
    public CUGNumberInfoType createCUGNumberInfoType() {
        return new CUGNumberInfoType();
    }

    /**
     * Create an instance of {@link UnbilledUnitsType }
     * 
     */
    public UnbilledUnitsType createUnbilledUnitsType() {
        return new UnbilledUnitsType();
    }

    /**
     * Create an instance of {@link UnbilledUnitsDatasetsType }
     * 
     */
    public UnbilledUnitsDatasetsType createUnbilledUnitsDatasetsType() {
        return new UnbilledUnitsDatasetsType();
    }

    /**
     * Create an instance of {@link FilterType }
     * 
     */
    public FilterType createFilterType() {
        return new FilterType();
    }

    /**
     * Create an instance of {@link CUGNumbersInfoType }
     * 
     */
    public CUGNumbersInfoType createCUGNumbersInfoType() {
        return new CUGNumbersInfoType();
    }

    /**
     * Create an instance of {@link RecentUsageDatasetsType }
     * 
     */
    public RecentUsageDatasetsType createRecentUsageDatasetsType() {
        return new RecentUsageDatasetsType();
    }

    /**
     * Create an instance of {@link AccountServiceIdentifierType }
     * 
     */
    public AccountServiceIdentifierType createAccountServiceIdentifierType() {
        return new AccountServiceIdentifierType();
    }

    /**
     * Create an instance of {@link DataFilterType }
     * 
     */
    public DataFilterType createDataFilterType() {
        return new DataFilterType();
    }

    /**
     * Create an instance of {@link BundleDefinitionType }
     * 
     */
    public BundleDefinitionType createBundleDefinitionType() {
        return new BundleDefinitionType();
    }

    /**
     * Create an instance of {@link BasketsType }
     * 
     */
    public BasketsType createBasketsType() {
        return new BasketsType();
    }

    /**
     * Create an instance of {@link ClosedUserGroupsType }
     * 
     */
    public ClosedUserGroupsType createClosedUserGroupsType() {
        return new ClosedUserGroupsType();
    }

    /**
     * Create an instance of {@link QueryUnbilledUnitsTargetType }
     * 
     */
    public QueryUnbilledUnitsTargetType createQueryUnbilledUnitsTargetType() {
        return new QueryUnbilledUnitsTargetType();
    }

    /**
     * Create an instance of {@link BundleTargetIdentifierType }
     * 
     */
    public BundleTargetIdentifierType createBundleTargetIdentifierType() {
        return new BundleTargetIdentifierType();
    }

    /**
     * Create an instance of {@link PostPayUnitType }
     * 
     */
    public PostPayUnitType createPostPayUnitType() {
        return new PostPayUnitType();
    }

    /**
     * Create an instance of {@link SubscriptionServiceIdentifierType }
     * 
     */
    public SubscriptionServiceIdentifierType createSubscriptionServiceIdentifierType() {
        return new SubscriptionServiceIdentifierType();
    }

    /**
     * Create an instance of {@link CurrentUsageType }
     * 
     */
    public CurrentUsageType createCurrentUsageType() {
        return new CurrentUsageType();
    }

    /**
     * Create an instance of {@link PrePayUnitType }
     * 
     */
    public PrePayUnitType createPrePayUnitType() {
        return new PrePayUnitType();
    }

    /**
     * Create an instance of {@link RecentUsageDateFilterType }
     * 
     */
    public RecentUsageDateFilterType createRecentUsageDateFilterType() {
        return new RecentUsageDateFilterType();
    }

    /**
     * Create an instance of {@link AttributeGroupType }
     * 
     */
    public AttributeGroupType createAttributeGroupType() {
        return new AttributeGroupType();
    }

    /**
     * Create an instance of {@link BundleLinkedSubscriptionType }
     * 
     */
    public BundleLinkedSubscriptionType createBundleLinkedSubscriptionType() {
        return new BundleLinkedSubscriptionType();
    }

    /**
     * Create an instance of {@link UsageAttributeType }
     * 
     */
    public UsageAttributeType createUsageAttributeType() {
        return new UsageAttributeType();
    }

    /**
     * Create an instance of {@link ContractAndSalesType2 }
     * 
     */
    public ContractAndSalesType2 createContractAndSalesType2() {
        return new ContractAndSalesType2();
    }

    /**
     * Create an instance of {@link UpdateAgreementBasicType }
     * 
     */
    public UpdateAgreementBasicType createUpdateAgreementBasicType() {
        return new UpdateAgreementBasicType();
    }

    /**
     * Create an instance of {@link TariffType }
     * 
     */
    public TariffType createTariffType() {
        return new TariffType();
    }

    /**
     * Create an instance of {@link ServiceType2 }
     * 
     */
    public ServiceType2 createServiceType2() {
        return new ServiceType2();
    }

    /**
     * Create an instance of {@link QueryCostCentreType }
     * 
     */
    public QueryCostCentreType createQueryCostCentreType() {
        return new QueryCostCentreType();
    }

    /**
     * Create an instance of {@link InvoiceControlType }
     * 
     */
    public InvoiceControlType createInvoiceControlType() {
        return new InvoiceControlType();
    }

    /**
     * Create an instance of {@link AutoContractRenewalType }
     * 
     */
    public AutoContractRenewalType createAutoContractRenewalType() {
        return new AutoContractRenewalType();
    }

    /**
     * Create an instance of {@link AgreementBasicType }
     * 
     */
    public AgreementBasicType createAgreementBasicType() {
        return new AgreementBasicType();
    }

    /**
     * Create an instance of {@link AgreementType }
     * 
     */
    public AgreementType createAgreementType() {
        return new AgreementType();
    }

    /**
     * Create an instance of {@link UpdateContractAndSalesType2 }
     * 
     */
    public UpdateContractAndSalesType2 createUpdateContractAndSalesType2() {
        return new UpdateContractAndSalesType2();
    }

    /**
     * Create an instance of {@link UpdateInvoiceControlType }
     * 
     */
    public UpdateInvoiceControlType createUpdateInvoiceControlType() {
        return new UpdateInvoiceControlType();
    }

    /**
     * Create an instance of {@link QueryAgreementDatasetsType }
     * 
     */
    public QueryAgreementDatasetsType createQueryAgreementDatasetsType() {
        return new QueryAgreementDatasetsType();
    }

    /**
     * Create an instance of {@link QueryAgreementsReturnType }
     * 
     */
    public QueryAgreementsReturnType createQueryAgreementsReturnType() {
        return new QueryAgreementsReturnType();
    }

    /**
     * Create an instance of {@link QueryAgreementCostCentresDatasetsType }
     * 
     */
    public QueryAgreementCostCentresDatasetsType createQueryAgreementCostCentresDatasetsType() {
        return new QueryAgreementCostCentresDatasetsType();
    }

    /**
     * Create an instance of {@link QueryAgreementCostCentresBasicType }
     * 
     */
    public QueryAgreementCostCentresBasicType createQueryAgreementCostCentresBasicType() {
        return new QueryAgreementCostCentresBasicType();
    }

    /**
     * Create an instance of {@link UpdateInvoiceFrequencyType }
     * 
     */
    public UpdateInvoiceFrequencyType createUpdateInvoiceFrequencyType() {
        return new UpdateInvoiceFrequencyType();
    }

    /**
     * Create an instance of {@link InvoiceFrequencyType }
     * 
     */
    public InvoiceFrequencyType createInvoiceFrequencyType() {
        return new InvoiceFrequencyType();
    }

    /**
     * Create an instance of {@link SubscriptionInvoiceControlType }
     * 
     */
    public SubscriptionInvoiceControlType createSubscriptionInvoiceControlType() {
        return new SubscriptionInvoiceControlType();
    }

    /**
     * Create an instance of {@link UpdateSubscriptionInvoiceControlType }
     * 
     */
    public UpdateSubscriptionInvoiceControlType createUpdateSubscriptionInvoiceControlType() {
        return new UpdateSubscriptionInvoiceControlType();
    }

    /**
     * Create an instance of {@link DlpPortInType }
     * 
     */
    public DlpPortInType createDlpPortInType() {
        return new DlpPortInType();
    }

    /**
     * Create an instance of {@link DlpPortInsType }
     * 
     */
    public DlpPortInsType createDlpPortInsType() {
        return new DlpPortInsType();
    }

    /**
     * Create an instance of {@link UpdateCustomerDetailsType2 }
     * 
     */
    public UpdateCustomerDetailsType2 createUpdateCustomerDetailsType2() {
        return new UpdateCustomerDetailsType2();
    }

    /**
     * Create an instance of {@link CreateAccountBondType }
     * 
     */
    public CreateAccountBondType createCreateAccountBondType() {
        return new CreateAccountBondType();
    }

    /**
     * Create an instance of {@link TargetIdentifierType3 }
     * 
     */
    public TargetIdentifierType3 createTargetIdentifierType3() {
        return new TargetIdentifierType3();
    }

    /**
     * Create an instance of {@link AccountTransactionsListResponseType }
     * 
     */
    public AccountTransactionsListResponseType createAccountTransactionsListResponseType() {
        return new AccountTransactionsListResponseType();
    }

    /**
     * Create an instance of {@link QueryAccountBondType }
     * 
     */
    public QueryAccountBondType createQueryAccountBondType() {
        return new QueryAccountBondType();
    }

    /**
     * Create an instance of {@link AccountBasicType }
     * 
     */
    public AccountBasicType createAccountBasicType() {
        return new AccountBasicType();
    }

    /**
     * Create an instance of {@link SimpleCreateAccountSerialNumberType }
     * 
     */
    public SimpleCreateAccountSerialNumberType createSimpleCreateAccountSerialNumberType() {
        return new SimpleCreateAccountSerialNumberType();
    }

    /**
     * Create an instance of {@link AccountServiceBasicType }
     * 
     */
    public AccountServiceBasicType createAccountServiceBasicType() {
        return new AccountServiceBasicType();
    }

    /**
     * Create an instance of {@link AccountSerialNumberType }
     * 
     */
    public AccountSerialNumberType createAccountSerialNumberType() {
        return new AccountSerialNumberType();
    }

    /**
     * Create an instance of {@link UpdatePaymentDetailsType }
     * 
     */
    public UpdatePaymentDetailsType createUpdatePaymentDetailsType() {
        return new UpdatePaymentDetailsType();
    }

    /**
     * Create an instance of {@link UpdateAccountType }
     * 
     */
    public UpdateAccountType createUpdateAccountType() {
        return new UpdateAccountType();
    }

    /**
     * Create an instance of {@link UpdateAccountTypeAndUsage }
     * 
     */
    public UpdateAccountTypeAndUsage createUpdateAccountTypeAndUsage() {
        return new UpdateAccountTypeAndUsage();
    }

    /**
     * Create an instance of {@link AutoPaymentsType }
     * 
     */
    public AutoPaymentsType createAutoPaymentsType() {
        return new AutoPaymentsType();
    }

    /**
     * Create an instance of {@link CommunicationPreferencesType }
     * 
     */
    public CommunicationPreferencesType createCommunicationPreferencesType() {
        return new CommunicationPreferencesType();
    }

    /**
     * Create an instance of {@link PaymentDetailsType }
     * 
     */
    public PaymentDetailsType createPaymentDetailsType() {
        return new PaymentDetailsType();
    }

    /**
     * Create an instance of {@link AccountSerialNumbersType }
     * 
     */
    public AccountSerialNumbersType createAccountSerialNumbersType() {
        return new AccountSerialNumbersType();
    }

    /**
     * Create an instance of {@link CancelRegisteredCardType }
     * 
     */
    public CancelRegisteredCardType createCancelRegisteredCardType() {
        return new CancelRegisteredCardType();
    }

    /**
     * Create an instance of {@link UpdateCreditControlType }
     * 
     */
    public UpdateCreditControlType createUpdateCreditControlType() {
        return new UpdateCreditControlType();
    }

    /**
     * Create an instance of {@link UpdateAccountBasic }
     * 
     */
    public UpdateAccountBasic createUpdateAccountBasic() {
        return new UpdateAccountBasic();
    }

    /**
     * Create an instance of {@link DlpPortsType }
     * 
     */
    public DlpPortsType createDlpPortsType() {
        return new DlpPortsType();
    }

    /**
     * Create an instance of {@link SimpleCreateAccountSerialNumbersType }
     * 
     */
    public SimpleCreateAccountSerialNumbersType createSimpleCreateAccountSerialNumbersType() {
        return new SimpleCreateAccountSerialNumbersType();
    }

    /**
     * Create an instance of {@link SubsequentInvoiceFrequencyIntType }
     * 
     */
    public SubsequentInvoiceFrequencyIntType createSubsequentInvoiceFrequencyIntType() {
        return new SubsequentInvoiceFrequencyIntType();
    }

    /**
     * Create an instance of {@link RegisteredCardTargetIdentifierType }
     * 
     */
    public RegisteredCardTargetIdentifierType createRegisteredCardTargetIdentifierType() {
        return new RegisteredCardTargetIdentifierType();
    }

    /**
     * Create an instance of {@link UpdateNonSubscriptionInvoiceControlType }
     * 
     */
    public UpdateNonSubscriptionInvoiceControlType createUpdateNonSubscriptionInvoiceControlType() {
        return new UpdateNonSubscriptionInvoiceControlType();
    }

    /**
     * Create an instance of {@link NonSubscriptionInvoiceControlType }
     * 
     */
    public NonSubscriptionInvoiceControlType createNonSubscriptionInvoiceControlType() {
        return new NonSubscriptionInvoiceControlType();
    }

    /**
     * Create an instance of {@link QueryAccountDatasetsType }
     * 
     */
    public QueryAccountDatasetsType createQueryAccountDatasetsType() {
        return new QueryAccountDatasetsType();
    }

    /**
     * Create an instance of {@link UpdateAutoPaymentsType }
     * 
     */
    public UpdateAutoPaymentsType createUpdateAutoPaymentsType() {
        return new UpdateAutoPaymentsType();
    }

    /**
     * Create an instance of {@link TerminationFeeType }
     * 
     */
    public TerminationFeeType createTerminationFeeType() {
        return new TerminationFeeType();
    }

    /**
     * Create an instance of {@link CreditControlType }
     * 
     */
    public CreditControlType createCreditControlType() {
        return new CreditControlType();
    }

    /**
     * Create an instance of {@link SubsequentInvoiceFrequencyType }
     * 
     */
    public SubsequentInvoiceFrequencyType createSubsequentInvoiceFrequencyType() {
        return new SubsequentInvoiceFrequencyType();
    }

    /**
     * Create an instance of {@link QueryAccountBondsType }
     * 
     */
    public QueryAccountBondsType createQueryAccountBondsType() {
        return new QueryAccountBondsType();
    }

    /**
     * Create an instance of {@link AddRegisteredCardType }
     * 
     */
    public AddRegisteredCardType createAddRegisteredCardType() {
        return new AddRegisteredCardType();
    }

    /**
     * Create an instance of {@link AccountType }
     * 
     */
    public AccountType createAccountType() {
        return new AccountType();
    }

    /**
     * Create an instance of {@link AccountTypeAndUsageType }
     * 
     */
    public AccountTypeAndUsageType createAccountTypeAndUsageType() {
        return new AccountTypeAndUsageType();
    }

    /**
     * Create an instance of {@link CustomerDetailsType2 }
     * 
     */
    public CustomerDetailsType2 createCustomerDetailsType2() {
        return new CustomerDetailsType2();
    }

    /**
     * Create an instance of {@link AccountServicesBasicType }
     * 
     */
    public AccountServicesBasicType createAccountServicesBasicType() {
        return new AccountServicesBasicType();
    }

    /**
     * Create an instance of {@link ChequeType }
     * 
     */
    public ChequeType createChequeType() {
        return new ChequeType();
    }

    /**
     * Create an instance of {@link UpdateDirectDebitType }
     * 
     */
    public UpdateDirectDebitType createUpdateDirectDebitType() {
        return new UpdateDirectDebitType();
    }

    /**
     * Create an instance of {@link MonthYearType }
     * 
     */
    public MonthYearType createMonthYearType() {
        return new MonthYearType();
    }

    /**
     * Create an instance of {@link DirectDebitResponseType }
     * 
     */
    public DirectDebitResponseType createDirectDebitResponseType() {
        return new DirectDebitResponseType();
    }

    /**
     * Create an instance of {@link SEPADirectDebitResponseType }
     * 
     */
    public SEPADirectDebitResponseType createSEPADirectDebitResponseType() {
        return new SEPADirectDebitResponseType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link DirectDebitResponseBaseType }
     * 
     */
    public DirectDebitResponseBaseType createDirectDebitResponseBaseType() {
        return new DirectDebitResponseBaseType();
    }

    /**
     * Create an instance of {@link PaymentType2 }
     * 
     */
    public PaymentType2 createPaymentType2() {
        return new PaymentType2();
    }

    /**
     * Create an instance of {@link PaymentCardTokenType }
     * 
     */
    public PaymentCardTokenType createPaymentCardTokenType() {
        return new PaymentCardTokenType();
    }

    /**
     * Create an instance of {@link DirectDebitBaseType }
     * 
     */
    public DirectDebitBaseType createDirectDebitBaseType() {
        return new DirectDebitBaseType();
    }

    /**
     * Create an instance of {@link UpdatePaymentCardType }
     * 
     */
    public UpdatePaymentCardType createUpdatePaymentCardType() {
        return new UpdatePaymentCardType();
    }

    /**
     * Create an instance of {@link PaymentCardType }
     * 
     */
    public PaymentCardType createPaymentCardType() {
        return new PaymentCardType();
    }

    /**
     * Create an instance of {@link SEPADirectDebitType }
     * 
     */
    public SEPADirectDebitType createSEPADirectDebitType() {
        return new SEPADirectDebitType();
    }

    /**
     * Create an instance of {@link PaymentCardQueryType }
     * 
     */
    public PaymentCardQueryType createPaymentCardQueryType() {
        return new PaymentCardQueryType();
    }

    /**
     * Create an instance of {@link CancellationPaymentType }
     * 
     */
    public CancellationPaymentType createCancellationPaymentType() {
        return new CancellationPaymentType();
    }

    /**
     * Create an instance of {@link PaymentDetailsType2 }
     * 
     */
    public PaymentDetailsType2 createPaymentDetailsType2() {
        return new PaymentDetailsType2();
    }

    /**
     * Create an instance of {@link DirectDebitType }
     * 
     */
    public DirectDebitType createDirectDebitType() {
        return new DirectDebitType();
    }

    /**
     * Create an instance of {@link SuccessfulPaymentType }
     * 
     */
    public SuccessfulPaymentType createSuccessfulPaymentType() {
        return new SuccessfulPaymentType();
    }

    /**
     * Create an instance of {@link PaymentOutcomeType }
     * 
     */
    public PaymentOutcomeType createPaymentOutcomeType() {
        return new PaymentOutcomeType();
    }

    /**
     * Create an instance of {@link FailedPaymentType }
     * 
     */
    public FailedPaymentType createFailedPaymentType() {
        return new FailedPaymentType();
    }

    /**
     * Create an instance of {@link PaymentDetailsType3 }
     * 
     */
    public PaymentDetailsType3 createPaymentDetailsType3() {
        return new PaymentDetailsType3();
    }

    /**
     * Create an instance of {@link MonthYearType2 }
     * 
     */
    public MonthYearType2 createMonthYearType2() {
        return new MonthYearType2();
    }

    /**
     * Create an instance of {@link BondPaymentDetailsType }
     * 
     */
    public BondPaymentDetailsType createBondPaymentDetailsType() {
        return new BondPaymentDetailsType();
    }

    /**
     * Create an instance of {@link AdditionalInfoType }
     * 
     */
    public AdditionalInfoType createAdditionalInfoType() {
        return new AdditionalInfoType();
    }

    /**
     * Create an instance of {@link ETCInfoType }
     * 
     */
    public ETCInfoType createETCInfoType() {
        return new ETCInfoType();
    }

    /**
     * Create an instance of {@link ContactInfoType }
     * 
     */
    public ContactInfoType createContactInfoType() {
        return new ContactInfoType();
    }

    /**
     * Create an instance of {@link DonorLedPortDetailsType }
     * 
     */
    public DonorLedPortDetailsType createDonorLedPortDetailsType() {
        return new DonorLedPortDetailsType();
    }

    /**
     * Create an instance of {@link SubscriptionResponseType }
     * 
     */
    public SubscriptionResponseType createSubscriptionResponseType() {
        return new SubscriptionResponseType();
    }

    /**
     * Create an instance of {@link SubscriptionResponseListType }
     * 
     */
    public SubscriptionResponseListType createSubscriptionResponseListType() {
        return new SubscriptionResponseListType();
    }

    /**
     * Create an instance of {@link PacDetailQueryResponseType }
     * 
     */
    public PacDetailQueryResponseType createPacDetailQueryResponseType() {
        return new PacDetailQueryResponseType();
    }

    /**
     * Create an instance of {@link SubscriptionListType }
     * 
     */
    public SubscriptionListType createSubscriptionListType() {
        return new SubscriptionListType();
    }

    /**
     * Create an instance of {@link SpOptionalDataType }
     * 
     */
    public SpOptionalDataType createSpOptionalDataType() {
        return new SpOptionalDataType();
    }

    /**
     * Create an instance of {@link PacDetailType }
     * 
     */
    public PacDetailType createPacDetailType() {
        return new PacDetailType();
    }

    /**
     * Create an instance of {@link BundlesType }
     * 
     */
    public BundlesType createBundlesType() {
        return new BundlesType();
    }

    /**
     * Create an instance of {@link BundleType }
     * 
     */
    public BundleType createBundleType() {
        return new BundleType();
    }

    /**
     * Create an instance of {@link AggregatedBundlesType }
     * 
     */
    public AggregatedBundlesType createAggregatedBundlesType() {
        return new AggregatedBundlesType();
    }

    /**
     * Create an instance of {@link BundleFullType }
     * 
     */
    public BundleFullType createBundleFullType() {
        return new BundleFullType();
    }

    /**
     * Create an instance of {@link AggregatedBundleType }
     * 
     */
    public AggregatedBundleType createAggregatedBundleType() {
        return new AggregatedBundleType();
    }

    /**
     * Create an instance of {@link BundleUpdateType }
     * 
     */
    public BundleUpdateType createBundleUpdateType() {
        return new BundleUpdateType();
    }

    /**
     * Create an instance of {@link AgreementTariffType }
     * 
     */
    public AgreementTariffType createAgreementTariffType() {
        return new AgreementTariffType();
    }

    /**
     * Create an instance of {@link CallClassGroupItemType }
     * 
     */
    public CallClassGroupItemType createCallClassGroupItemType() {
        return new CallClassGroupItemType();
    }

    /**
     * Create an instance of {@link CreateNormalDiscountType }
     * 
     */
    public CreateNormalDiscountType createCreateNormalDiscountType() {
        return new CreateNormalDiscountType();
    }

    /**
     * Create an instance of {@link InvoiceVolumesListType }
     * 
     */
    public InvoiceVolumesListType createInvoiceVolumesListType() {
        return new InvoiceVolumesListType();
    }

    /**
     * Create an instance of {@link CallClassGroupsListType }
     * 
     */
    public CallClassGroupsListType createCallClassGroupsListType() {
        return new CallClassGroupsListType();
    }

    /**
     * Create an instance of {@link FavouriteNumbersListType }
     * 
     */
    public FavouriteNumbersListType createFavouriteNumbersListType() {
        return new FavouriteNumbersListType();
    }

    /**
     * Create an instance of {@link FavouriteNumberItemType }
     * 
     */
    public FavouriteNumberItemType createFavouriteNumberItemType() {
        return new FavouriteNumberItemType();
    }

    /**
     * Create an instance of {@link NetworkOrTariffType }
     * 
     */
    public NetworkOrTariffType createNetworkOrTariffType() {
        return new NetworkOrTariffType();
    }

    /**
     * Create an instance of {@link ServicesListType }
     * 
     */
    public ServicesListType createServicesListType() {
        return new ServicesListType();
    }

    /**
     * Create an instance of {@link UpdateDiscountBasicType }
     * 
     */
    public UpdateDiscountBasicType createUpdateDiscountBasicType() {
        return new UpdateDiscountBasicType();
    }

    /**
     * Create an instance of {@link TargetIdentifierType4 }
     * 
     */
    public TargetIdentifierType4 createTargetIdentifierType4() {
        return new TargetIdentifierType4();
    }

    /**
     * Create an instance of {@link NetworkType }
     * 
     */
    public NetworkType createNetworkType() {
        return new NetworkType();
    }

    /**
     * Create an instance of {@link CrossProductsListType }
     * 
     */
    public CrossProductsListType createCrossProductsListType() {
        return new CrossProductsListType();
    }

    /**
     * Create an instance of {@link InvoiceBandType }
     * 
     */
    public InvoiceBandType createInvoiceBandType() {
        return new InvoiceBandType();
    }

    /**
     * Create an instance of {@link InvoiceVolumeItemType }
     * 
     */
    public InvoiceVolumeItemType createInvoiceVolumeItemType() {
        return new InvoiceVolumeItemType();
    }

    /**
     * Create an instance of {@link CreateInvoiceVolumeDiscountType }
     * 
     */
    public CreateInvoiceVolumeDiscountType createCreateInvoiceVolumeDiscountType() {
        return new CreateInvoiceVolumeDiscountType();
    }

    /**
     * Create an instance of {@link CreateCumulativeDiscountType }
     * 
     */
    public CreateCumulativeDiscountType createCreateCumulativeDiscountType() {
        return new CreateCumulativeDiscountType();
    }

    /**
     * Create an instance of {@link CrossProductItemType }
     * 
     */
    public CrossProductItemType createCrossProductItemType() {
        return new CrossProductItemType();
    }

    /**
     * Create an instance of {@link DiscountsType }
     * 
     */
    public DiscountsType createDiscountsType() {
        return new DiscountsType();
    }

    /**
     * Create an instance of {@link DiscountType }
     * 
     */
    public DiscountType createDiscountType() {
        return new DiscountType();
    }

    /**
     * Create an instance of {@link CreateCrossProductDiscountType }
     * 
     */
    public CreateCrossProductDiscountType createCreateCrossProductDiscountType() {
        return new CreateCrossProductDiscountType();
    }

    /**
     * Create an instance of {@link CommonDiscountDataType }
     * 
     */
    public CommonDiscountDataType createCommonDiscountDataType() {
        return new CommonDiscountDataType();
    }

    /**
     * Create an instance of {@link CreateFavouriteNumberDiscountType }
     * 
     */
    public CreateFavouriteNumberDiscountType createCreateFavouriteNumberDiscountType() {
        return new CreateFavouriteNumberDiscountType();
    }

    /**
     * Create an instance of {@link ServiceItemType }
     * 
     */
    public ServiceItemType createServiceItemType() {
        return new ServiceItemType();
    }

    /**
     * Create an instance of {@link BasketDefinitionsAttribute }
     * 
     */
    public BasketDefinitionsAttribute createBasketDefinitionsAttribute() {
        return new BasketDefinitionsAttribute();
    }

    /**
     * Create an instance of {@link BasketDefinitionType }
     * 
     */
    public BasketDefinitionType createBasketDefinitionType() {
        return new BasketDefinitionType();
    }

    /**
     * Create an instance of {@link RefreshAutomaticType2 }
     * 
     */
    public RefreshAutomaticType2 createRefreshAutomaticType2() {
        return new RefreshAutomaticType2();
    }

    /**
     * Create an instance of {@link RefreshUpdateType }
     * 
     */
    public RefreshUpdateType createRefreshUpdateType() {
        return new RefreshUpdateType();
    }

    /**
     * Create an instance of {@link SubscriptionsType2 }
     * 
     */
    public SubscriptionsType2 createSubscriptionsType2() {
        return new SubscriptionsType2();
    }

    /**
     * Create an instance of {@link PurchaseOfferType }
     * 
     */
    public PurchaseOfferType createPurchaseOfferType() {
        return new PurchaseOfferType();
    }

    /**
     * Create an instance of {@link RefreshTypeType2 }
     * 
     */
    public RefreshTypeType2 createRefreshTypeType2() {
        return new RefreshTypeType2();
    }

    /**
     * Create an instance of {@link SubscriptionBasketAdjustmentType }
     * 
     */
    public SubscriptionBasketAdjustmentType createSubscriptionBasketAdjustmentType() {
        return new SubscriptionBasketAdjustmentType();
    }

    /**
     * Create an instance of {@link TopUpsType }
     * 
     */
    public TopUpsType createTopUpsType() {
        return new TopUpsType();
    }

    /**
     * Create an instance of {@link RefreshUpdateReloadMethodAndOptionType }
     * 
     */
    public RefreshUpdateReloadMethodAndOptionType createRefreshUpdateReloadMethodAndOptionType() {
        return new RefreshUpdateReloadMethodAndOptionType();
    }

    /**
     * Create an instance of {@link RefreshUpdateAutomaticType }
     * 
     */
    public RefreshUpdateAutomaticType createRefreshUpdateAutomaticType() {
        return new RefreshUpdateAutomaticType();
    }

    /**
     * Create an instance of {@link ReloadBasketType }
     * 
     */
    public ReloadBasketType createReloadBasketType() {
        return new ReloadBasketType();
    }

    /**
     * Create an instance of {@link CustomerBasketsPeriod }
     * 
     */
    public CustomerBasketsPeriod createCustomerBasketsPeriod() {
        return new CustomerBasketsPeriod();
    }

    /**
     * Create an instance of {@link BasketsType2 }
     * 
     */
    public BasketsType2 createBasketsType2() {
        return new BasketsType2();
    }

    /**
     * Create an instance of {@link SubscriptionType2 }
     * 
     */
    public SubscriptionType2 createSubscriptionType2() {
        return new SubscriptionType2();
    }

    /**
     * Create an instance of {@link ReloadType }
     * 
     */
    public ReloadType createReloadType() {
        return new ReloadType();
    }

    /**
     * Create an instance of {@link TargetIdentifierType5 }
     * 
     */
    public TargetIdentifierType5 createTargetIdentifierType5() {
        return new TargetIdentifierType5();
    }

    /**
     * Create an instance of {@link RefreshUpdateReloadType }
     * 
     */
    public RefreshUpdateReloadType createRefreshUpdateReloadType() {
        return new RefreshUpdateReloadType();
    }

    /**
     * Create an instance of {@link QueryBasketsType }
     * 
     */
    public QueryBasketsType createQueryBasketsType() {
        return new QueryBasketsType();
    }

    /**
     * Create an instance of {@link SharedBasketType }
     * 
     */
    public SharedBasketType createSharedBasketType() {
        return new SharedBasketType();
    }

    /**
     * Create an instance of {@link BasketAdjustmentType }
     * 
     */
    public BasketAdjustmentType createBasketAdjustmentType() {
        return new BasketAdjustmentType();
    }

    /**
     * Create an instance of {@link RefreshUpdateAutomaticEnableType }
     * 
     */
    public RefreshUpdateAutomaticEnableType createRefreshUpdateAutomaticEnableType() {
        return new RefreshUpdateAutomaticEnableType();
    }

    /**
     * Create an instance of {@link SubscriptionsBasketAdjustmentType }
     * 
     */
    public SubscriptionsBasketAdjustmentType createSubscriptionsBasketAdjustmentType() {
        return new SubscriptionsBasketAdjustmentType();
    }

    /**
     * Create an instance of {@link RefreshTargetIdentifierType }
     * 
     */
    public RefreshTargetIdentifierType createRefreshTargetIdentifierType() {
        return new RefreshTargetIdentifierType();
    }

    /**
     * Create an instance of {@link BasketType2 }
     * 
     */
    public BasketType2 createBasketType2() {
        return new BasketType2();
    }

    /**
     * Create an instance of {@link RefreshUpdateRecurringType }
     * 
     */
    public RefreshUpdateRecurringType createRefreshUpdateRecurringType() {
        return new RefreshUpdateRecurringType();
    }

    /**
     * Create an instance of {@link TopUpType }
     * 
     */
    public TopUpType createTopUpType() {
        return new TopUpType();
    }

    /**
     * Create an instance of {@link BasketDefinitionAttribute }
     * 
     */
    public BasketDefinitionAttribute createBasketDefinitionAttribute() {
        return new BasketDefinitionAttribute();
    }

    /**
     * Create an instance of {@link RefreshUpdateCancelType }
     * 
     */
    public RefreshUpdateCancelType createRefreshUpdateCancelType() {
        return new RefreshUpdateCancelType();
    }

    /**
     * Create an instance of {@link ReloadBasketsType }
     * 
     */
    public ReloadBasketsType createReloadBasketsType() {
        return new ReloadBasketsType();
    }

    /**
     * Create an instance of {@link RefreshType2 }
     * 
     */
    public RefreshType2 createRefreshType2() {
        return new RefreshType2();
    }

    /**
     * Create an instance of {@link ReloadsType }
     * 
     */
    public ReloadsType createReloadsType() {
        return new ReloadsType();
    }

    /**
     * Create an instance of {@link RefreshRecurringType2 }
     * 
     */
    public RefreshRecurringType2 createRefreshRecurringType2() {
        return new RefreshRecurringType2();
    }

    /**
     * Create an instance of {@link RefreshUpdateRefreshesType }
     * 
     */
    public RefreshUpdateRefreshesType createRefreshUpdateRefreshesType() {
        return new RefreshUpdateRefreshesType();
    }

    /**
     * Create an instance of {@link QuerySharedBasketBalanceDatasetsType }
     * 
     */
    public QuerySharedBasketBalanceDatasetsType createQuerySharedBasketBalanceDatasetsType() {
        return new QuerySharedBasketBalanceDatasetsType();
    }

    /**
     * Create an instance of {@link BasketCodesType }
     * 
     */
    public BasketCodesType createBasketCodesType() {
        return new BasketCodesType();
    }

    /**
     * Create an instance of {@link QueryReloadHistoryDatasetsType }
     * 
     */
    public QueryReloadHistoryDatasetsType createQueryReloadHistoryDatasetsType() {
        return new QueryReloadHistoryDatasetsType();
    }

    /**
     * Create an instance of {@link ReloadDataType }
     * 
     */
    public ReloadDataType createReloadDataType() {
        return new ReloadDataType();
    }

    /**
     * Create an instance of {@link QueryBasketType }
     * 
     */
    public QueryBasketType createQueryBasketType() {
        return new QueryBasketType();
    }

    /**
     * Create an instance of {@link CreditLimitType }
     * 
     */
    public CreditLimitType createCreditLimitType() {
        return new CreditLimitType();
    }

    /**
     * Create an instance of {@link CustomerBasketPeriod }
     * 
     */
    public CustomerBasketPeriod createCustomerBasketPeriod() {
        return new CustomerBasketPeriod();
    }

    /**
     * Create an instance of {@link PurchaseOffersType }
     * 
     */
    public PurchaseOffersType createPurchaseOffersType() {
        return new PurchaseOffersType();
    }

    /**
     * Create an instance of {@link BasketAdjustmentsType }
     * 
     */
    public BasketAdjustmentsType createBasketAdjustmentsType() {
        return new BasketAdjustmentsType();
    }

    /**
     * Create an instance of {@link TariffType2 }
     * 
     */
    public TariffType2 createTariffType2() {
        return new TariffType2();
    }

    /**
     * Create an instance of {@link TariffUpdateContractAndSalesType }
     * 
     */
    public TariffUpdateContractAndSalesType createTariffUpdateContractAndSalesType() {
        return new TariffUpdateContractAndSalesType();
    }

    /**
     * Create an instance of {@link TariffIdType }
     * 
     */
    public TariffIdType createTariffIdType() {
        return new TariffIdType();
    }
    
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdsuk.com/ws/dise3g/order/definition", name = "CreateOrder")
    public JAXBElement<CreateOrder> createCreateOrder(CreateOrder value) {
        return new JAXBElement<CreateOrder>(_CreateOrder_QNAME, CreateOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockEnquiryResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdsuk.com/ws/dise3g/order/definition", name = "CreateOrderResponse")
    public JAXBElement<CreateOrderResponse> createCreateOrderResponse(CreateOrderResponse value) {
        return new JAXBElement<CreateOrderResponse>(_CreateOrderResponse_QNAME, CreateOrderResponse.class, null, value);
    }
    

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdsuk.com/ws/dise3g/fault/definition", name = "SystemFault")
    public JAXBElement<SystemFault> createSystemFault(SystemFault value) {
        return new JAXBElement<SystemFault>(_SystemFault_QNAME, SystemFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdsuk.com/ws/dise3g/fault/definition", name = "ValidationFault")
    public JAXBElement<ValidationFault> createValidationFault(ValidationFault value) {
        return new JAXBElement<ValidationFault>(_ValidationFault_QNAME, ValidationFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdsuk.com/ws/dise3g/fault/definition", name = "SecurityFault")
    public JAXBElement<SecurityFault> createSecurityFault(SecurityFault value) {
        return new JAXBElement<SecurityFault>(_SecurityFault_QNAME, SecurityFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceUnavailableFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdsuk.com/ws/dise3g/fault/definition", name = "ServiceUnavailableFault")
    public JAXBElement<ServiceUnavailableFault> createServiceUnavailableFault(ServiceUnavailableFault value) {
        return new JAXBElement<ServiceUnavailableFault>(_ServiceUnavailableFault_QNAME, ServiceUnavailableFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonthYearType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startDateMMYYNumber", scope = PaymentType2 .class)
    public JAXBElement<MonthYearType> createPaymentType2StartDateMMYYNumber(MonthYearType value) {
        return new JAXBElement<MonthYearType>(_PaymentType2StartDateMMYYNumber_QNAME, MonthYearType.class, PaymentType2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nameOnCard", scope = PaymentType2 .class)
    public JAXBElement<String> createPaymentType2NameOnCard(String value) {
        return new JAXBElement<String>(_PaymentType2NameOnCard_QNAME, String.class, PaymentType2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonthYearType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startDateMMYYNumber", scope = PaymentDetailsType2 .class)
    public JAXBElement<MonthYearType> createPaymentDetailsType2StartDateMMYYNumber(MonthYearType value) {
        return new JAXBElement<MonthYearType>(_PaymentType2StartDateMMYYNumber_QNAME, MonthYearType.class, PaymentDetailsType2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nameOnCard", scope = PaymentDetailsType2 .class)
    public JAXBElement<String> createPaymentDetailsType2NameOnCard(String value) {
        return new JAXBElement<String>(_PaymentType2NameOnCard_QNAME, String.class, PaymentDetailsType2 .class, value);
    }

}
