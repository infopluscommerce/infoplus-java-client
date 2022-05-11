# OrderApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrder**](OrderApi.md#addOrder) | **POST** /v3.0/order | Create an order
[**addOrderAudit**](OrderApi.md#addOrderAudit) | **PUT** /v3.0/order/{orderId}/audit/{orderAudit} | Add new audit for an order
[**addOrderFile**](OrderApi.md#addOrderFile) | **POST** /v3.0/order/{orderId}/file/{fileName} | Attach a file to an order
[**addOrderFileByURL**](OrderApi.md#addOrderFileByURL) | **POST** /v3.0/order/{orderId}/file | Attach a file to an order by URL.
[**addOrderTag**](OrderApi.md#addOrderTag) | **PUT** /v3.0/order/{orderId}/tag/{orderTag} | Add new tags for an order.
[**applyOrderWarehouseFulfillmentPlan**](OrderApi.md#applyOrderWarehouseFulfillmentPlan) | **POST** /v3.0/order/applyOrderWarehouseFulfillmentPlan | Run the Apply Order Warehouse Fulfillment Plan method.
[**deleteOrder**](OrderApi.md#deleteOrder) | **DELETE** /v3.0/order/{orderId} | Delete an order
[**deleteOrderFile**](OrderApi.md#deleteOrderFile) | **DELETE** /v3.0/order/{orderId}/file/{fileId} | Delete a file for an order.
[**deleteOrderTag**](OrderApi.md#deleteOrderTag) | **DELETE** /v3.0/order/{orderId}/tag/{orderTag} | Delete a tag for an order.
[**editFulfillmentChannel**](OrderApi.md#editFulfillmentChannel) | **POST** /v3.0/order/editFulfillmentChannel | Run the EditLineItemFulfillmentStrategy process.
[**editLineItems**](OrderApi.md#editLineItems) | **POST** /v3.0/order/editLineItems | Run the ReqManualSubstitution process.
[**getDuplicateOrderById**](OrderApi.md#getDuplicateOrderById) | **GET** /v3.0/order/duplicate/{orderId} | Get a duplicated an order by id
[**getOrderByFilter**](OrderApi.md#getOrderByFilter) | **GET** /v3.0/order/search | Search orders by filter
[**getOrderById**](OrderApi.md#getOrderById) | **GET** /v3.0/order/{orderId} | Get an order by id
[**getOrderFiles**](OrderApi.md#getOrderFiles) | **GET** /v3.0/order/{orderId}/file | Get the files for an order.
[**getOrderPackData**](OrderApi.md#getOrderPackData) | **POST** /v3.0/order/getOrderPackData | Run the Get Order Pack Data method.
[**getOrderTags**](OrderApi.md#getOrderTags) | **GET** /v3.0/order/{orderId}/tag | Get the tags for an order.
[**getOrderWarehouseFulfillmentData**](OrderApi.md#getOrderWarehouseFulfillmentData) | **POST** /v3.0/order/getOrderWarehouseFulfillmentData | Run the Get Order Warehouse Fulfillment Plan method.
[**runFulfillmentPlan**](OrderApi.md#runFulfillmentPlan) | **POST** /v3.0/order/runFulfillmentPlan | Run the RunFulfillmentPlan process.
[**updateOrder**](OrderApi.md#updateOrder) | **PUT** /v3.0/order | Update an order
[**updateOrderCustomFields**](OrderApi.md#updateOrderCustomFields) | **PUT** /v3.0/order/customFields | Update an order custom fields


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

<a name="addOrderFile"></a>
# **addOrderFile**
> addOrderFile(orderId, fileName)

Attach a file to an order

Adds a file to an existing order.

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
BigDecimal orderId = new BigDecimal(); // BigDecimal | Id of the order to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addOrderFile(orderId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#addOrderFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **BigDecimal**| Id of the order to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addOrderFileByURL"></a>
# **addOrderFileByURL**
> addOrderFileByURL(body, orderId)

Attach a file to an order by URL.

Adds a file to an existing order by URL.

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
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
BigDecimal orderId = new BigDecimal(); // BigDecimal | Id of the order to add an file to
try {
    apiInstance.addOrderFileByURL(body, orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#addOrderFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **orderId** | **BigDecimal**| Id of the order to add an file to |

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

<a name="deleteOrderFile"></a>
# **deleteOrderFile**
> deleteOrderFile(orderId, fileId)

Delete a file for an order.

Deletes an existing order file using the specified data.

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
BigDecimal orderId = new BigDecimal(); // BigDecimal | Id of the order to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteOrderFile(orderId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#deleteOrderFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **BigDecimal**| Id of the order to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

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

<a name="editFulfillmentChannel"></a>
# **editFulfillmentChannel**
> List&lt;ProcessOutputAPIModel&gt; editFulfillmentChannel(body)

Run the EditLineItemFulfillmentStrategy process.



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
EditLineItemFulfillmentStrategyInputAPIModel body = new EditLineItemFulfillmentStrategyInputAPIModel(); // EditLineItemFulfillmentStrategyInputAPIModel | Input data for EditLineItemFulfillmentStrategy process.
try {
    List<ProcessOutputAPIModel> result = apiInstance.editFulfillmentChannel(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#editFulfillmentChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EditLineItemFulfillmentStrategyInputAPIModel**](EditLineItemFulfillmentStrategyInputAPIModel.md)| Input data for EditLineItemFulfillmentStrategy process. |

### Return type

[**List&lt;ProcessOutputAPIModel&gt;**](ProcessOutputAPIModel.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editLineItems"></a>
# **editLineItems**
> List&lt;ProcessOutputAPIModel&gt; editLineItems(body)

Run the ReqManualSubstitution process.



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
ReqManualSubstitutionInputAPIModel body = new ReqManualSubstitutionInputAPIModel(); // ReqManualSubstitutionInputAPIModel | Input data for ReqManualSubstitution process.
try {
    List<ProcessOutputAPIModel> result = apiInstance.editLineItems(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#editLineItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReqManualSubstitutionInputAPIModel**](ReqManualSubstitutionInputAPIModel.md)| Input data for ReqManualSubstitution process. |

### Return type

[**List&lt;ProcessOutputAPIModel&gt;**](ProcessOutputAPIModel.md)

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

<a name="getOrderFiles"></a>
# **getOrderFiles**
> getOrderFiles(orderId)

Get the files for an order.

Get all existing order files.

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
BigDecimal orderId = new BigDecimal(); // BigDecimal | Id of the order to get files for
try {
    apiInstance.getOrderFiles(orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **BigDecimal**| Id of the order to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderPackData"></a>
# **getOrderPackData**
> GetOrderPackDataOutput getOrderPackData(body)

Run the Get Order Pack Data method.



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
GetOrderPackDataInput body = new GetOrderPackDataInput(); // GetOrderPackDataInput | Input data for Get Order Pack Data process.
try {
    GetOrderPackDataOutput result = apiInstance.getOrderPackData(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderPackData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetOrderPackDataInput**](GetOrderPackDataInput.md)| Input data for Get Order Pack Data process. |

### Return type

[**GetOrderPackDataOutput**](GetOrderPackDataOutput.md)

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

<a name="runFulfillmentPlan"></a>
# **runFulfillmentPlan**
> List&lt;ProcessOutputAPIModel&gt; runFulfillmentPlan(body)

Run the RunFulfillmentPlan process.



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
RunFulfillmentPlanInputAPIModel body = new RunFulfillmentPlanInputAPIModel(); // RunFulfillmentPlanInputAPIModel | Input data for RunFulfillmentPlan process.
try {
    List<ProcessOutputAPIModel> result = apiInstance.runFulfillmentPlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#runFulfillmentPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RunFulfillmentPlanInputAPIModel**](RunFulfillmentPlanInputAPIModel.md)| Input data for RunFulfillmentPlan process. |

### Return type

[**List&lt;ProcessOutputAPIModel&gt;**](ProcessOutputAPIModel.md)

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

