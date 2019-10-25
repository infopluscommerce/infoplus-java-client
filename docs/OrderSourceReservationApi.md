# OrderSourceReservationApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrderSourceReservation**](OrderSourceReservationApi.md#addOrderSourceReservation) | **POST** /beta/orderSourceReservation | Create an orderSourceReservation
[**addOrderSourceReservationAudit**](OrderSourceReservationApi.md#addOrderSourceReservationAudit) | **PUT** /beta/orderSourceReservation/{orderSourceReservationId}/audit/{orderSourceReservationAudit} | Add new audit for an orderSourceReservation
[**addOrderSourceReservationFile**](OrderSourceReservationApi.md#addOrderSourceReservationFile) | **POST** /beta/orderSourceReservation/{orderSourceReservationId}/file/{fileName} | Attach a file to an orderSourceReservation
[**addOrderSourceReservationTag**](OrderSourceReservationApi.md#addOrderSourceReservationTag) | **PUT** /beta/orderSourceReservation/{orderSourceReservationId}/tag/{orderSourceReservationTag} | Add new tags for an orderSourceReservation.
[**deleteOrderSourceReservation**](OrderSourceReservationApi.md#deleteOrderSourceReservation) | **DELETE** /beta/orderSourceReservation/{orderSourceReservationId} | Delete an orderSourceReservation
[**deleteOrderSourceReservationTag**](OrderSourceReservationApi.md#deleteOrderSourceReservationTag) | **DELETE** /beta/orderSourceReservation/{orderSourceReservationId}/tag/{orderSourceReservationTag} | Delete a tag for an orderSourceReservation.
[**getDuplicateOrderSourceReservationById**](OrderSourceReservationApi.md#getDuplicateOrderSourceReservationById) | **GET** /beta/orderSourceReservation/duplicate/{orderSourceReservationId} | Get a duplicated an orderSourceReservation by id
[**getOrderSourceReservationByFilter**](OrderSourceReservationApi.md#getOrderSourceReservationByFilter) | **GET** /beta/orderSourceReservation/search | Search orderSourceReservations by filter
[**getOrderSourceReservationById**](OrderSourceReservationApi.md#getOrderSourceReservationById) | **GET** /beta/orderSourceReservation/{orderSourceReservationId} | Get an orderSourceReservation by id
[**getOrderSourceReservationTags**](OrderSourceReservationApi.md#getOrderSourceReservationTags) | **GET** /beta/orderSourceReservation/{orderSourceReservationId}/tag | Get the tags for an orderSourceReservation.
[**updateOrderSourceReservation**](OrderSourceReservationApi.md#updateOrderSourceReservation) | **PUT** /beta/orderSourceReservation | Update an orderSourceReservation
[**updateOrderSourceReservationCustomFields**](OrderSourceReservationApi.md#updateOrderSourceReservationCustomFields) | **PUT** /beta/orderSourceReservation/customFields | Update an orderSourceReservation custom fields


<a name="addOrderSourceReservation"></a>
# **addOrderSourceReservation**
> OrderSourceReservation addOrderSourceReservation(body)

Create an orderSourceReservation

Inserts a new orderSourceReservation using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceReservationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceReservationApi apiInstance = new OrderSourceReservationApi();
OrderSourceReservation body = new OrderSourceReservation(); // OrderSourceReservation | OrderSourceReservation to be inserted.
try {
    OrderSourceReservation result = apiInstance.addOrderSourceReservation(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceReservationApi#addOrderSourceReservation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderSourceReservation**](OrderSourceReservation.md)| OrderSourceReservation to be inserted. |

### Return type

[**OrderSourceReservation**](OrderSourceReservation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrderSourceReservationAudit"></a>
# **addOrderSourceReservationAudit**
> addOrderSourceReservationAudit(orderSourceReservationId, orderSourceReservationAudit)

Add new audit for an orderSourceReservation

Adds an audit to an existing orderSourceReservation.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceReservationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceReservationApi apiInstance = new OrderSourceReservationApi();
Integer orderSourceReservationId = 56; // Integer | Id of the orderSourceReservation to add an audit to
String orderSourceReservationAudit = "orderSourceReservationAudit_example"; // String | The audit to add
try {
    apiInstance.addOrderSourceReservationAudit(orderSourceReservationId, orderSourceReservationAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceReservationApi#addOrderSourceReservationAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceReservationId** | **Integer**| Id of the orderSourceReservation to add an audit to |
 **orderSourceReservationAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrderSourceReservationFile"></a>
# **addOrderSourceReservationFile**
> addOrderSourceReservationFile(orderSourceReservationId, fileName)

Attach a file to an orderSourceReservation

Adds a file to an existing orderSourceReservation.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceReservationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceReservationApi apiInstance = new OrderSourceReservationApi();
Integer orderSourceReservationId = 56; // Integer | Id of the orderSourceReservation to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addOrderSourceReservationFile(orderSourceReservationId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceReservationApi#addOrderSourceReservationFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceReservationId** | **Integer**| Id of the orderSourceReservation to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addOrderSourceReservationTag"></a>
# **addOrderSourceReservationTag**
> addOrderSourceReservationTag(orderSourceReservationId, orderSourceReservationTag)

Add new tags for an orderSourceReservation.

Adds a tag to an existing orderSourceReservation.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceReservationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceReservationApi apiInstance = new OrderSourceReservationApi();
Integer orderSourceReservationId = 56; // Integer | Id of the orderSourceReservation to add a tag to
String orderSourceReservationTag = "orderSourceReservationTag_example"; // String | The tag to add
try {
    apiInstance.addOrderSourceReservationTag(orderSourceReservationId, orderSourceReservationTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceReservationApi#addOrderSourceReservationTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceReservationId** | **Integer**| Id of the orderSourceReservation to add a tag to |
 **orderSourceReservationTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOrderSourceReservation"></a>
# **deleteOrderSourceReservation**
> deleteOrderSourceReservation(orderSourceReservationId)

Delete an orderSourceReservation

Deletes the orderSourceReservation identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceReservationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceReservationApi apiInstance = new OrderSourceReservationApi();
Integer orderSourceReservationId = 56; // Integer | Id of the orderSourceReservation to be deleted.
try {
    apiInstance.deleteOrderSourceReservation(orderSourceReservationId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceReservationApi#deleteOrderSourceReservation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceReservationId** | **Integer**| Id of the orderSourceReservation to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteOrderSourceReservationTag"></a>
# **deleteOrderSourceReservationTag**
> deleteOrderSourceReservationTag(orderSourceReservationId, orderSourceReservationTag)

Delete a tag for an orderSourceReservation.

Deletes an existing orderSourceReservation tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceReservationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceReservationApi apiInstance = new OrderSourceReservationApi();
Integer orderSourceReservationId = 56; // Integer | Id of the orderSourceReservation to remove tag from
String orderSourceReservationTag = "orderSourceReservationTag_example"; // String | The tag to delete
try {
    apiInstance.deleteOrderSourceReservationTag(orderSourceReservationId, orderSourceReservationTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceReservationApi#deleteOrderSourceReservationTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceReservationId** | **Integer**| Id of the orderSourceReservation to remove tag from |
 **orderSourceReservationTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateOrderSourceReservationById"></a>
# **getDuplicateOrderSourceReservationById**
> OrderSourceReservation getDuplicateOrderSourceReservationById(orderSourceReservationId)

Get a duplicated an orderSourceReservation by id

Returns a duplicated orderSourceReservation identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceReservationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceReservationApi apiInstance = new OrderSourceReservationApi();
Integer orderSourceReservationId = 56; // Integer | Id of the orderSourceReservation to be duplicated.
try {
    OrderSourceReservation result = apiInstance.getDuplicateOrderSourceReservationById(orderSourceReservationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceReservationApi#getDuplicateOrderSourceReservationById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceReservationId** | **Integer**| Id of the orderSourceReservation to be duplicated. |

### Return type

[**OrderSourceReservation**](OrderSourceReservation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderSourceReservationByFilter"></a>
# **getOrderSourceReservationByFilter**
> List&lt;OrderSourceReservation&gt; getOrderSourceReservationByFilter(filter, page, limit, sort)

Search orderSourceReservations by filter

Returns the list of orderSourceReservations that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceReservationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceReservationApi apiInstance = new OrderSourceReservationApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<OrderSourceReservation> result = apiInstance.getOrderSourceReservationByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceReservationApi#getOrderSourceReservationByFilter");
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

[**List&lt;OrderSourceReservation&gt;**](OrderSourceReservation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderSourceReservationById"></a>
# **getOrderSourceReservationById**
> OrderSourceReservation getOrderSourceReservationById(orderSourceReservationId)

Get an orderSourceReservation by id

Returns the orderSourceReservation identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceReservationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceReservationApi apiInstance = new OrderSourceReservationApi();
Integer orderSourceReservationId = 56; // Integer | Id of the orderSourceReservation to be returned.
try {
    OrderSourceReservation result = apiInstance.getOrderSourceReservationById(orderSourceReservationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceReservationApi#getOrderSourceReservationById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceReservationId** | **Integer**| Id of the orderSourceReservation to be returned. |

### Return type

[**OrderSourceReservation**](OrderSourceReservation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderSourceReservationTags"></a>
# **getOrderSourceReservationTags**
> getOrderSourceReservationTags(orderSourceReservationId)

Get the tags for an orderSourceReservation.

Get all existing orderSourceReservation tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceReservationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceReservationApi apiInstance = new OrderSourceReservationApi();
Integer orderSourceReservationId = 56; // Integer | Id of the orderSourceReservation to get tags for
try {
    apiInstance.getOrderSourceReservationTags(orderSourceReservationId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceReservationApi#getOrderSourceReservationTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceReservationId** | **Integer**| Id of the orderSourceReservation to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOrderSourceReservation"></a>
# **updateOrderSourceReservation**
> updateOrderSourceReservation(body)

Update an orderSourceReservation

Updates an existing orderSourceReservation using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceReservationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceReservationApi apiInstance = new OrderSourceReservationApi();
OrderSourceReservation body = new OrderSourceReservation(); // OrderSourceReservation | OrderSourceReservation to be updated.
try {
    apiInstance.updateOrderSourceReservation(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceReservationApi#updateOrderSourceReservation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderSourceReservation**](OrderSourceReservation.md)| OrderSourceReservation to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOrderSourceReservationCustomFields"></a>
# **updateOrderSourceReservationCustomFields**
> updateOrderSourceReservationCustomFields(body)

Update an orderSourceReservation custom fields

Updates an existing orderSourceReservation custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceReservationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceReservationApi apiInstance = new OrderSourceReservationApi();
OrderSourceReservation body = new OrderSourceReservation(); // OrderSourceReservation | OrderSourceReservation to be updated.
try {
    apiInstance.updateOrderSourceReservationCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceReservationApi#updateOrderSourceReservationCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderSourceReservation**](OrderSourceReservation.md)| OrderSourceReservation to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

