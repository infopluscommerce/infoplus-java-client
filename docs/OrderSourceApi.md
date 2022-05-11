# OrderSourceApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrderSource**](OrderSourceApi.md#addOrderSource) | **POST** /v3.0/orderSource | Create an orderSource
[**addOrderSourceAudit**](OrderSourceApi.md#addOrderSourceAudit) | **PUT** /v3.0/orderSource/{orderSourceId}/audit/{orderSourceAudit} | Add new audit for an orderSource
[**addOrderSourceFile**](OrderSourceApi.md#addOrderSourceFile) | **POST** /v3.0/orderSource/{orderSourceId}/file/{fileName} | Attach a file to an orderSource
[**addOrderSourceFileByURL**](OrderSourceApi.md#addOrderSourceFileByURL) | **POST** /v3.0/orderSource/{orderSourceId}/file | Attach a file to an orderSource by URL.
[**addOrderSourceTag**](OrderSourceApi.md#addOrderSourceTag) | **PUT** /v3.0/orderSource/{orderSourceId}/tag/{orderSourceTag} | Add new tags for an orderSource.
[**deleteOrderSource**](OrderSourceApi.md#deleteOrderSource) | **DELETE** /v3.0/orderSource/{orderSourceId} | Delete an orderSource
[**deleteOrderSourceFile**](OrderSourceApi.md#deleteOrderSourceFile) | **DELETE** /v3.0/orderSource/{orderSourceId}/file/{fileId} | Delete a file for an orderSource.
[**deleteOrderSourceTag**](OrderSourceApi.md#deleteOrderSourceTag) | **DELETE** /v3.0/orderSource/{orderSourceId}/tag/{orderSourceTag} | Delete a tag for an orderSource.
[**getDuplicateOrderSourceById**](OrderSourceApi.md#getDuplicateOrderSourceById) | **GET** /v3.0/orderSource/duplicate/{orderSourceId} | Get a duplicated an orderSource by id
[**getOrderSourceByFilter**](OrderSourceApi.md#getOrderSourceByFilter) | **GET** /v3.0/orderSource/search | Search orderSources by filter
[**getOrderSourceById**](OrderSourceApi.md#getOrderSourceById) | **GET** /v3.0/orderSource/{orderSourceId} | Get an orderSource by id
[**getOrderSourceFiles**](OrderSourceApi.md#getOrderSourceFiles) | **GET** /v3.0/orderSource/{orderSourceId}/file | Get the files for an orderSource.
[**getOrderSourceTags**](OrderSourceApi.md#getOrderSourceTags) | **GET** /v3.0/orderSource/{orderSourceId}/tag | Get the tags for an orderSource.
[**updateOrderSource**](OrderSourceApi.md#updateOrderSource) | **PUT** /v3.0/orderSource | Update an orderSource
[**updateOrderSourceCustomFields**](OrderSourceApi.md#updateOrderSourceCustomFields) | **PUT** /v3.0/orderSource/customFields | Update an orderSource custom fields


<a name="addOrderSource"></a>
# **addOrderSource**
> OrderSource addOrderSource(body)

Create an orderSource

Inserts a new orderSource using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceApi apiInstance = new OrderSourceApi();
OrderSource body = new OrderSource(); // OrderSource | OrderSource to be inserted.
try {
    OrderSource result = apiInstance.addOrderSource(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceApi#addOrderSource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderSource**](OrderSource.md)| OrderSource to be inserted. |

### Return type

[**OrderSource**](OrderSource.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrderSourceAudit"></a>
# **addOrderSourceAudit**
> addOrderSourceAudit(orderSourceId, orderSourceAudit)

Add new audit for an orderSource

Adds an audit to an existing orderSource.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceApi apiInstance = new OrderSourceApi();
Integer orderSourceId = 56; // Integer | Id of the orderSource to add an audit to
String orderSourceAudit = "orderSourceAudit_example"; // String | The audit to add
try {
    apiInstance.addOrderSourceAudit(orderSourceId, orderSourceAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceApi#addOrderSourceAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceId** | **Integer**| Id of the orderSource to add an audit to |
 **orderSourceAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrderSourceFile"></a>
# **addOrderSourceFile**
> addOrderSourceFile(orderSourceId, fileName)

Attach a file to an orderSource

Adds a file to an existing orderSource.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceApi apiInstance = new OrderSourceApi();
Integer orderSourceId = 56; // Integer | Id of the orderSource to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addOrderSourceFile(orderSourceId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceApi#addOrderSourceFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceId** | **Integer**| Id of the orderSource to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addOrderSourceFileByURL"></a>
# **addOrderSourceFileByURL**
> addOrderSourceFileByURL(body, orderSourceId)

Attach a file to an orderSource by URL.

Adds a file to an existing orderSource by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceApi apiInstance = new OrderSourceApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer orderSourceId = 56; // Integer | Id of the orderSource to add an file to
try {
    apiInstance.addOrderSourceFileByURL(body, orderSourceId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceApi#addOrderSourceFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **orderSourceId** | **Integer**| Id of the orderSource to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrderSourceTag"></a>
# **addOrderSourceTag**
> addOrderSourceTag(orderSourceId, orderSourceTag)

Add new tags for an orderSource.

Adds a tag to an existing orderSource.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceApi apiInstance = new OrderSourceApi();
Integer orderSourceId = 56; // Integer | Id of the orderSource to add a tag to
String orderSourceTag = "orderSourceTag_example"; // String | The tag to add
try {
    apiInstance.addOrderSourceTag(orderSourceId, orderSourceTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceApi#addOrderSourceTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceId** | **Integer**| Id of the orderSource to add a tag to |
 **orderSourceTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOrderSource"></a>
# **deleteOrderSource**
> deleteOrderSource(orderSourceId)

Delete an orderSource

Deletes the orderSource identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceApi apiInstance = new OrderSourceApi();
Integer orderSourceId = 56; // Integer | Id of the orderSource to be deleted.
try {
    apiInstance.deleteOrderSource(orderSourceId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceApi#deleteOrderSource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceId** | **Integer**| Id of the orderSource to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteOrderSourceFile"></a>
# **deleteOrderSourceFile**
> deleteOrderSourceFile(orderSourceId, fileId)

Delete a file for an orderSource.

Deletes an existing orderSource file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceApi apiInstance = new OrderSourceApi();
Integer orderSourceId = 56; // Integer | Id of the orderSource to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteOrderSourceFile(orderSourceId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceApi#deleteOrderSourceFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceId** | **Integer**| Id of the orderSource to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteOrderSourceTag"></a>
# **deleteOrderSourceTag**
> deleteOrderSourceTag(orderSourceId, orderSourceTag)

Delete a tag for an orderSource.

Deletes an existing orderSource tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceApi apiInstance = new OrderSourceApi();
Integer orderSourceId = 56; // Integer | Id of the orderSource to remove tag from
String orderSourceTag = "orderSourceTag_example"; // String | The tag to delete
try {
    apiInstance.deleteOrderSourceTag(orderSourceId, orderSourceTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceApi#deleteOrderSourceTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceId** | **Integer**| Id of the orderSource to remove tag from |
 **orderSourceTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateOrderSourceById"></a>
# **getDuplicateOrderSourceById**
> OrderSource getDuplicateOrderSourceById(orderSourceId)

Get a duplicated an orderSource by id

Returns a duplicated orderSource identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceApi apiInstance = new OrderSourceApi();
Integer orderSourceId = 56; // Integer | Id of the orderSource to be duplicated.
try {
    OrderSource result = apiInstance.getDuplicateOrderSourceById(orderSourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceApi#getDuplicateOrderSourceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceId** | **Integer**| Id of the orderSource to be duplicated. |

### Return type

[**OrderSource**](OrderSource.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderSourceByFilter"></a>
# **getOrderSourceByFilter**
> List&lt;OrderSource&gt; getOrderSourceByFilter(filter, page, limit, sort)

Search orderSources by filter

Returns the list of orderSources that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceApi apiInstance = new OrderSourceApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<OrderSource> result = apiInstance.getOrderSourceByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceApi#getOrderSourceByFilter");
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

[**List&lt;OrderSource&gt;**](OrderSource.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderSourceById"></a>
# **getOrderSourceById**
> OrderSource getOrderSourceById(orderSourceId)

Get an orderSource by id

Returns the orderSource identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceApi apiInstance = new OrderSourceApi();
Integer orderSourceId = 56; // Integer | Id of the orderSource to be returned.
try {
    OrderSource result = apiInstance.getOrderSourceById(orderSourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceApi#getOrderSourceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceId** | **Integer**| Id of the orderSource to be returned. |

### Return type

[**OrderSource**](OrderSource.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderSourceFiles"></a>
# **getOrderSourceFiles**
> getOrderSourceFiles(orderSourceId)

Get the files for an orderSource.

Get all existing orderSource files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceApi apiInstance = new OrderSourceApi();
Integer orderSourceId = 56; // Integer | Id of the orderSource to get files for
try {
    apiInstance.getOrderSourceFiles(orderSourceId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceApi#getOrderSourceFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceId** | **Integer**| Id of the orderSource to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderSourceTags"></a>
# **getOrderSourceTags**
> getOrderSourceTags(orderSourceId)

Get the tags for an orderSource.

Get all existing orderSource tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceApi apiInstance = new OrderSourceApi();
Integer orderSourceId = 56; // Integer | Id of the orderSource to get tags for
try {
    apiInstance.getOrderSourceTags(orderSourceId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceApi#getOrderSourceTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceId** | **Integer**| Id of the orderSource to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOrderSource"></a>
# **updateOrderSource**
> updateOrderSource(body)

Update an orderSource

Updates an existing orderSource using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceApi apiInstance = new OrderSourceApi();
OrderSource body = new OrderSource(); // OrderSource | OrderSource to be updated.
try {
    apiInstance.updateOrderSource(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceApi#updateOrderSource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderSource**](OrderSource.md)| OrderSource to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOrderSourceCustomFields"></a>
# **updateOrderSourceCustomFields**
> updateOrderSourceCustomFields(body)

Update an orderSource custom fields

Updates an existing orderSource custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceApi apiInstance = new OrderSourceApi();
OrderSource body = new OrderSource(); // OrderSource | OrderSource to be updated.
try {
    apiInstance.updateOrderSourceCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceApi#updateOrderSourceCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderSource**](OrderSource.md)| OrderSource to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

