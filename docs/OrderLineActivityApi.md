# OrderLineActivityApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrderLineActivity**](OrderLineActivityApi.md#addOrderLineActivity) | **POST** /beta/orderLineActivity | Create an orderLineActivity
[**addOrderLineActivityAudit**](OrderLineActivityApi.md#addOrderLineActivityAudit) | **PUT** /beta/orderLineActivity/{orderLineActivityId}/audit/{orderLineActivityAudit} | Add new audit for an orderLineActivity
[**addOrderLineActivityTag**](OrderLineActivityApi.md#addOrderLineActivityTag) | **PUT** /beta/orderLineActivity/{orderLineActivityId}/tag/{orderLineActivityTag} | Add new tags for an orderLineActivity.
[**deleteOrderLineActivity**](OrderLineActivityApi.md#deleteOrderLineActivity) | **DELETE** /beta/orderLineActivity/{orderLineActivityId} | Delete an orderLineActivity
[**deleteOrderLineActivityTag**](OrderLineActivityApi.md#deleteOrderLineActivityTag) | **DELETE** /beta/orderLineActivity/{orderLineActivityId}/tag/{orderLineActivityTag} | Delete a tag for an orderLineActivity.
[**getDuplicateOrderLineActivityById**](OrderLineActivityApi.md#getDuplicateOrderLineActivityById) | **GET** /beta/orderLineActivity/duplicate/{orderLineActivityId} | Get a duplicated an orderLineActivity by id
[**getOrderLineActivityByFilter**](OrderLineActivityApi.md#getOrderLineActivityByFilter) | **GET** /beta/orderLineActivity/search | Search orderLineActivitys by filter
[**getOrderLineActivityById**](OrderLineActivityApi.md#getOrderLineActivityById) | **GET** /beta/orderLineActivity/{orderLineActivityId} | Get an orderLineActivity by id
[**getOrderLineActivityTags**](OrderLineActivityApi.md#getOrderLineActivityTags) | **GET** /beta/orderLineActivity/{orderLineActivityId}/tag | Get the tags for an orderLineActivity.
[**updateOrderLineActivity**](OrderLineActivityApi.md#updateOrderLineActivity) | **PUT** /beta/orderLineActivity | Update an orderLineActivity


<a name="addOrderLineActivity"></a>
# **addOrderLineActivity**
> OrderLineActivity addOrderLineActivity(body)

Create an orderLineActivity

Inserts a new orderLineActivity using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineActivityApi apiInstance = new OrderLineActivityApi();
OrderLineActivity body = new OrderLineActivity(); // OrderLineActivity | OrderLineActivity to be inserted.
try {
    OrderLineActivity result = apiInstance.addOrderLineActivity(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineActivityApi#addOrderLineActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderLineActivity**](OrderLineActivity.md)| OrderLineActivity to be inserted. |

### Return type

[**OrderLineActivity**](OrderLineActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrderLineActivityAudit"></a>
# **addOrderLineActivityAudit**
> addOrderLineActivityAudit(orderLineActivityId, orderLineActivityAudit)

Add new audit for an orderLineActivity

Adds an audit to an existing orderLineActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineActivityApi apiInstance = new OrderLineActivityApi();
Integer orderLineActivityId = 56; // Integer | Id of the orderLineActivity to add an audit to
String orderLineActivityAudit = "orderLineActivityAudit_example"; // String | The audit to add
try {
    apiInstance.addOrderLineActivityAudit(orderLineActivityId, orderLineActivityAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineActivityApi#addOrderLineActivityAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderLineActivityId** | **Integer**| Id of the orderLineActivity to add an audit to |
 **orderLineActivityAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrderLineActivityTag"></a>
# **addOrderLineActivityTag**
> addOrderLineActivityTag(orderLineActivityId, orderLineActivityTag)

Add new tags for an orderLineActivity.

Adds a tag to an existing orderLineActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineActivityApi apiInstance = new OrderLineActivityApi();
Integer orderLineActivityId = 56; // Integer | Id of the orderLineActivity to add a tag to
String orderLineActivityTag = "orderLineActivityTag_example"; // String | The tag to add
try {
    apiInstance.addOrderLineActivityTag(orderLineActivityId, orderLineActivityTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineActivityApi#addOrderLineActivityTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderLineActivityId** | **Integer**| Id of the orderLineActivity to add a tag to |
 **orderLineActivityTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOrderLineActivity"></a>
# **deleteOrderLineActivity**
> deleteOrderLineActivity(orderLineActivityId)

Delete an orderLineActivity

Deletes the orderLineActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineActivityApi apiInstance = new OrderLineActivityApi();
Integer orderLineActivityId = 56; // Integer | Id of the orderLineActivity to be deleted.
try {
    apiInstance.deleteOrderLineActivity(orderLineActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineActivityApi#deleteOrderLineActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderLineActivityId** | **Integer**| Id of the orderLineActivity to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteOrderLineActivityTag"></a>
# **deleteOrderLineActivityTag**
> deleteOrderLineActivityTag(orderLineActivityId, orderLineActivityTag)

Delete a tag for an orderLineActivity.

Deletes an existing orderLineActivity tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineActivityApi apiInstance = new OrderLineActivityApi();
Integer orderLineActivityId = 56; // Integer | Id of the orderLineActivity to remove tag from
String orderLineActivityTag = "orderLineActivityTag_example"; // String | The tag to delete
try {
    apiInstance.deleteOrderLineActivityTag(orderLineActivityId, orderLineActivityTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineActivityApi#deleteOrderLineActivityTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderLineActivityId** | **Integer**| Id of the orderLineActivity to remove tag from |
 **orderLineActivityTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateOrderLineActivityById"></a>
# **getDuplicateOrderLineActivityById**
> OrderLineActivity getDuplicateOrderLineActivityById(orderLineActivityId)

Get a duplicated an orderLineActivity by id

Returns a duplicated orderLineActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineActivityApi apiInstance = new OrderLineActivityApi();
Integer orderLineActivityId = 56; // Integer | Id of the orderLineActivity to be duplicated.
try {
    OrderLineActivity result = apiInstance.getDuplicateOrderLineActivityById(orderLineActivityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineActivityApi#getDuplicateOrderLineActivityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderLineActivityId** | **Integer**| Id of the orderLineActivity to be duplicated. |

### Return type

[**OrderLineActivity**](OrderLineActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderLineActivityByFilter"></a>
# **getOrderLineActivityByFilter**
> List&lt;OrderLineActivity&gt; getOrderLineActivityByFilter(filter, page, limit, sort)

Search orderLineActivitys by filter

Returns the list of orderLineActivitys that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineActivityApi apiInstance = new OrderLineActivityApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<OrderLineActivity> result = apiInstance.getOrderLineActivityByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineActivityApi#getOrderLineActivityByFilter");
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

[**List&lt;OrderLineActivity&gt;**](OrderLineActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderLineActivityById"></a>
# **getOrderLineActivityById**
> OrderLineActivity getOrderLineActivityById(orderLineActivityId)

Get an orderLineActivity by id

Returns the orderLineActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineActivityApi apiInstance = new OrderLineActivityApi();
Integer orderLineActivityId = 56; // Integer | Id of the orderLineActivity to be returned.
try {
    OrderLineActivity result = apiInstance.getOrderLineActivityById(orderLineActivityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineActivityApi#getOrderLineActivityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderLineActivityId** | **Integer**| Id of the orderLineActivity to be returned. |

### Return type

[**OrderLineActivity**](OrderLineActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderLineActivityTags"></a>
# **getOrderLineActivityTags**
> getOrderLineActivityTags(orderLineActivityId)

Get the tags for an orderLineActivity.

Get all existing orderLineActivity tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineActivityApi apiInstance = new OrderLineActivityApi();
Integer orderLineActivityId = 56; // Integer | Id of the orderLineActivity to get tags for
try {
    apiInstance.getOrderLineActivityTags(orderLineActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineActivityApi#getOrderLineActivityTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderLineActivityId** | **Integer**| Id of the orderLineActivity to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOrderLineActivity"></a>
# **updateOrderLineActivity**
> updateOrderLineActivity(body)

Update an orderLineActivity

Updates an existing orderLineActivity using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineActivityApi apiInstance = new OrderLineActivityApi();
OrderLineActivity body = new OrderLineActivity(); // OrderLineActivity | OrderLineActivity to be updated.
try {
    apiInstance.updateOrderLineActivity(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineActivityApi#updateOrderLineActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderLineActivity**](OrderLineActivity.md)| OrderLineActivity to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

