# OrderApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrder**](OrderApi.md#addOrder) | **POST** /beta/order | Create an order
[**addOrderAudit**](OrderApi.md#addOrderAudit) | **PUT** /beta/order/{orderId}/audit/{orderAudit} | Add new audit for an order
[**addOrderTag**](OrderApi.md#addOrderTag) | **PUT** /beta/order/{orderId}/tag/{orderTag} | Add new tags for an order.
[**applyOrderWarehouseFulfillmentPlan**](OrderApi.md#applyOrderWarehouseFulfillmentPlan) | **POST** /beta/order/applyOrderWarehouseFulfillmentPlan | Run the Apply Order Warehouse Fulfillment Plan method.
[**deleteOrder**](OrderApi.md#deleteOrder) | **DELETE** /beta/order/{orderId} | Delete an order
[**deleteOrderTag**](OrderApi.md#deleteOrderTag) | **DELETE** /beta/order/{orderId}/tag/{orderTag} | Delete a tag for an order.
[**getDuplicateOrderById**](OrderApi.md#getDuplicateOrderById) | **GET** /beta/order/duplicate/{orderId} | Get a duplicated an order by id
[**getOrderByFilter**](OrderApi.md#getOrderByFilter) | **GET** /beta/order/search | Search orders by filter
[**getOrderById**](OrderApi.md#getOrderById) | **GET** /beta/order/{orderId} | Get an order by id
[**getOrderTags**](OrderApi.md#getOrderTags) | **GET** /beta/order/{orderId}/tag | Get the tags for an order.
[**getOrderWarehouseFulfillmentData**](OrderApi.md#getOrderWarehouseFulfillmentData) | **POST** /beta/order/getOrderWarehouseFulfillmentData | Run the Get Order Warehouse Fulfillment Plan method.
[**updateOrder**](OrderApi.md#updateOrder) | **PUT** /beta/order | Update an order
[**updateOrderCustomFields**](OrderApi.md#updateOrderCustomFields) | **PUT** /beta/order/customFields | Update an order custom fields


<a name="addOrder"></a>
# **addOrder**
> Order addOrder(body)

Create an order

Inserts a new order using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Order body = new Order(); // Order | Order to be inserted.
try {
    Order result = apiInstance.addOrder(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#addOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Order**](Order.md)| Order to be inserted. |

### Return type

[**Order**](Order.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrderAudit"></a>
# **addOrderAudit**
> addOrderAudit(orderId, orderAudit)

Add new audit for an order

Adds an audit to an existing order.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
BigDecimal orderId = new BigDecimal(); // BigDecimal | Id of the order to add an audit to
String orderAudit = "orderAudit_example"; // String | The audit to add
try {
    apiInstance.addOrderAudit(orderId, orderAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#addOrderAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **BigDecimal**| Id of the order to add an audit to |
 **orderAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrderTag"></a>
# **addOrderTag**
> addOrderTag(orderId, orderTag)

Add new tags for an order.

Adds a tag to an existing order.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
BigDecimal orderId = new BigDecimal(); // BigDecimal | Id of the order to add a tag to
String orderTag = "orderTag_example"; // String | The tag to add
try {
    apiInstance.addOrderTag(orderId, orderTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#addOrderTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **BigDecimal**| Id of the order to add a tag to |
 **orderTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="applyOrderWarehouseFulfillmentPlan"></a>
# **applyOrderWarehouseFulfillmentPlan**
> ApplyOrderWarehouseFulfillmentPlanOutput applyOrderWarehouseFulfillmentPlan(body)

Run the Apply Order Warehouse Fulfillment Plan method.



### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
ApplyOrderWarehouseFulfillmentPlanInput body = new ApplyOrderWarehouseFulfillmentPlanInput(); // ApplyOrderWarehouseFulfillmentPlanInput | Input data for Apply Order Warehouse Fulfillment Plan process.
try {
    ApplyOrderWarehouseFulfillmentPlanOutput result = apiInstance.applyOrderWarehouseFulfillmentPlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#applyOrderWarehouseFulfillmentPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApplyOrderWarehouseFulfillmentPlanInput**](ApplyOrderWarehouseFulfillmentPlanInput.md)| Input data for Apply Order Warehouse Fulfillment Plan process. |

### Return type

[**ApplyOrderWarehouseFulfillmentPlanOutput**](ApplyOrderWarehouseFulfillmentPlanOutput.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteOrder"></a>
# **deleteOrder**
> deleteOrder(orderId)

Delete an order

Deletes the order identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
BigDecimal orderId = new BigDecimal(); // BigDecimal | Id of the order to be deleted.
try {
    apiInstance.deleteOrder(orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#deleteOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **BigDecimal**| Id of the order to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteOrderTag"></a>
# **deleteOrderTag**
> deleteOrderTag(orderId, orderTag)

Delete a tag for an order.

Deletes an existing order tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
BigDecimal orderId = new BigDecimal(); // BigDecimal | Id of the order to remove tag from
String orderTag = "orderTag_example"; // String | The tag to delete
try {
    apiInstance.deleteOrderTag(orderId, orderTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#deleteOrderTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **BigDecimal**| Id of the order to remove tag from |
 **orderTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateOrderById"></a>
# **getDuplicateOrderById**
> Order getDuplicateOrderById(orderId)

Get a duplicated an order by id

Returns a duplicated order identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
BigDecimal orderId = new BigDecimal(); // BigDecimal | Id of the order to be duplicated.
try {
    Order result = apiInstance.getDuplicateOrderById(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getDuplicateOrderById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **BigDecimal**| Id of the order to be duplicated. |

### Return type

[**Order**](Order.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderByFilter"></a>
# **getOrderByFilter**
> List&lt;Order&gt; getOrderByFilter(filter, page, limit, sort)

Search orders by filter

Returns the list of orders that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Order> result = apiInstance.getOrderByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderByFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Query string, used to filter results. | [optional]
 **page** | **Integer**| Result page number.  Defaults to 1. | [optional]
 **limit** | **Integer**| Maximum results per page.  Defaults to 20.  Max allowed value is 250. | [optional]
 **sort** | **String**| Sort results by specified field. | [optional]

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderById"></a>
# **getOrderById**
> Order getOrderById(orderId)

Get an order by id

Returns the order identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
BigDecimal orderId = new BigDecimal(); // BigDecimal | Id of the order to be returned.
try {
    Order result = apiInstance.getOrderById(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **BigDecimal**| Id of the order to be returned. |

### Return type

[**Order**](Order.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderTags"></a>
# **getOrderTags**
> getOrderTags(orderId)

Get the tags for an order.

Get all existing order tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
BigDecimal orderId = new BigDecimal(); // BigDecimal | Id of the order to get tags for
try {
    apiInstance.getOrderTags(orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **BigDecimal**| Id of the order to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderWarehouseFulfillmentData"></a>
# **getOrderWarehouseFulfillmentData**
> GetOrderWarehouseFulfillmentDataOutput getOrderWarehouseFulfillmentData(body)

Run the Get Order Warehouse Fulfillment Plan method.



### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
GetOrderWarehouseFulfillmentDataInput body = new GetOrderWarehouseFulfillmentDataInput(); // GetOrderWarehouseFulfillmentDataInput | Input data for Get Order Warehouse Fulfillment Plan process.
try {
    GetOrderWarehouseFulfillmentDataOutput result = apiInstance.getOrderWarehouseFulfillmentData(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderWarehouseFulfillmentData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetOrderWarehouseFulfillmentDataInput**](GetOrderWarehouseFulfillmentDataInput.md)| Input data for Get Order Warehouse Fulfillment Plan process. |

### Return type

[**GetOrderWarehouseFulfillmentDataOutput**](GetOrderWarehouseFulfillmentDataOutput.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOrder"></a>
# **updateOrder**
> updateOrder(body)

Update an order

Updates an existing order using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Order body = new Order(); // Order | Order to be updated.
try {
    apiInstance.updateOrder(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#updateOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Order**](Order.md)| Order to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOrderCustomFields"></a>
# **updateOrderCustomFields**
> updateOrderCustomFields(body)

Update an order custom fields

Updates an existing order custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Order body = new Order(); // Order | Order to be updated.
try {
    apiInstance.updateOrderCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#updateOrderCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Order**](Order.md)| Order to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

