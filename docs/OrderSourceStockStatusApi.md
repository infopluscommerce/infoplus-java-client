# OrderSourceStockStatusApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrderSourceStockStatusAudit**](OrderSourceStockStatusApi.md#addOrderSourceStockStatusAudit) | **PUT** /v3.0/orderSourceStockStatus/{orderSourceStockStatusId}/audit/{orderSourceStockStatusAudit} | Add new audit for an orderSourceStockStatus
[**addOrderSourceStockStatusFile**](OrderSourceStockStatusApi.md#addOrderSourceStockStatusFile) | **POST** /v3.0/orderSourceStockStatus/{orderSourceStockStatusId}/file/{fileName} | Attach a file to an orderSourceStockStatus
[**addOrderSourceStockStatusFileByURL**](OrderSourceStockStatusApi.md#addOrderSourceStockStatusFileByURL) | **POST** /v3.0/orderSourceStockStatus/{orderSourceStockStatusId}/file | Attach a file to an orderSourceStockStatus by URL.
[**addOrderSourceStockStatusTag**](OrderSourceStockStatusApi.md#addOrderSourceStockStatusTag) | **PUT** /v3.0/orderSourceStockStatus/{orderSourceStockStatusId}/tag/{orderSourceStockStatusTag} | Add new tags for an orderSourceStockStatus.
[**deleteOrderSourceStockStatusFile**](OrderSourceStockStatusApi.md#deleteOrderSourceStockStatusFile) | **DELETE** /v3.0/orderSourceStockStatus/{orderSourceStockStatusId}/file/{fileId} | Delete a file for an orderSourceStockStatus.
[**deleteOrderSourceStockStatusTag**](OrderSourceStockStatusApi.md#deleteOrderSourceStockStatusTag) | **DELETE** /v3.0/orderSourceStockStatus/{orderSourceStockStatusId}/tag/{orderSourceStockStatusTag} | Delete a tag for an orderSourceStockStatus.
[**getDuplicateOrderSourceStockStatusById**](OrderSourceStockStatusApi.md#getDuplicateOrderSourceStockStatusById) | **GET** /v3.0/orderSourceStockStatus/duplicate/{orderSourceStockStatusId} | Get a duplicated an orderSourceStockStatus by id
[**getOrderSourceStockStatusByFilter**](OrderSourceStockStatusApi.md#getOrderSourceStockStatusByFilter) | **GET** /v3.0/orderSourceStockStatus/search | Search orderSourceStockStatuses by filter
[**getOrderSourceStockStatusById**](OrderSourceStockStatusApi.md#getOrderSourceStockStatusById) | **GET** /v3.0/orderSourceStockStatus/{orderSourceStockStatusId} | Get an orderSourceStockStatus by id
[**getOrderSourceStockStatusFiles**](OrderSourceStockStatusApi.md#getOrderSourceStockStatusFiles) | **GET** /v3.0/orderSourceStockStatus/{orderSourceStockStatusId}/file | Get the files for an orderSourceStockStatus.
[**getOrderSourceStockStatusTags**](OrderSourceStockStatusApi.md#getOrderSourceStockStatusTags) | **GET** /v3.0/orderSourceStockStatus/{orderSourceStockStatusId}/tag | Get the tags for an orderSourceStockStatus.


<a name="addOrderSourceStockStatusAudit"></a>
# **addOrderSourceStockStatusAudit**
> addOrderSourceStockStatusAudit(orderSourceStockStatusId, orderSourceStockStatusAudit)

Add new audit for an orderSourceStockStatus

Adds an audit to an existing orderSourceStockStatus.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceStockStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceStockStatusApi apiInstance = new OrderSourceStockStatusApi();
Integer orderSourceStockStatusId = 56; // Integer | Id of the orderSourceStockStatus to add an audit to
String orderSourceStockStatusAudit = "orderSourceStockStatusAudit_example"; // String | The audit to add
try {
    apiInstance.addOrderSourceStockStatusAudit(orderSourceStockStatusId, orderSourceStockStatusAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceStockStatusApi#addOrderSourceStockStatusAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceStockStatusId** | **Integer**| Id of the orderSourceStockStatus to add an audit to |
 **orderSourceStockStatusAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrderSourceStockStatusFile"></a>
# **addOrderSourceStockStatusFile**
> addOrderSourceStockStatusFile(orderSourceStockStatusId, fileName)

Attach a file to an orderSourceStockStatus

Adds a file to an existing orderSourceStockStatus.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceStockStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceStockStatusApi apiInstance = new OrderSourceStockStatusApi();
Integer orderSourceStockStatusId = 56; // Integer | Id of the orderSourceStockStatus to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addOrderSourceStockStatusFile(orderSourceStockStatusId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceStockStatusApi#addOrderSourceStockStatusFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceStockStatusId** | **Integer**| Id of the orderSourceStockStatus to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addOrderSourceStockStatusFileByURL"></a>
# **addOrderSourceStockStatusFileByURL**
> addOrderSourceStockStatusFileByURL(body, orderSourceStockStatusId)

Attach a file to an orderSourceStockStatus by URL.

Adds a file to an existing orderSourceStockStatus by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceStockStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceStockStatusApi apiInstance = new OrderSourceStockStatusApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer orderSourceStockStatusId = 56; // Integer | Id of the orderSourceStockStatus to add an file to
try {
    apiInstance.addOrderSourceStockStatusFileByURL(body, orderSourceStockStatusId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceStockStatusApi#addOrderSourceStockStatusFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **orderSourceStockStatusId** | **Integer**| Id of the orderSourceStockStatus to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrderSourceStockStatusTag"></a>
# **addOrderSourceStockStatusTag**
> addOrderSourceStockStatusTag(orderSourceStockStatusId, orderSourceStockStatusTag)

Add new tags for an orderSourceStockStatus.

Adds a tag to an existing orderSourceStockStatus.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceStockStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceStockStatusApi apiInstance = new OrderSourceStockStatusApi();
Integer orderSourceStockStatusId = 56; // Integer | Id of the orderSourceStockStatus to add a tag to
String orderSourceStockStatusTag = "orderSourceStockStatusTag_example"; // String | The tag to add
try {
    apiInstance.addOrderSourceStockStatusTag(orderSourceStockStatusId, orderSourceStockStatusTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceStockStatusApi#addOrderSourceStockStatusTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceStockStatusId** | **Integer**| Id of the orderSourceStockStatus to add a tag to |
 **orderSourceStockStatusTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOrderSourceStockStatusFile"></a>
# **deleteOrderSourceStockStatusFile**
> deleteOrderSourceStockStatusFile(orderSourceStockStatusId, fileId)

Delete a file for an orderSourceStockStatus.

Deletes an existing orderSourceStockStatus file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceStockStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceStockStatusApi apiInstance = new OrderSourceStockStatusApi();
Integer orderSourceStockStatusId = 56; // Integer | Id of the orderSourceStockStatus to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteOrderSourceStockStatusFile(orderSourceStockStatusId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceStockStatusApi#deleteOrderSourceStockStatusFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceStockStatusId** | **Integer**| Id of the orderSourceStockStatus to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteOrderSourceStockStatusTag"></a>
# **deleteOrderSourceStockStatusTag**
> deleteOrderSourceStockStatusTag(orderSourceStockStatusId, orderSourceStockStatusTag)

Delete a tag for an orderSourceStockStatus.

Deletes an existing orderSourceStockStatus tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceStockStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceStockStatusApi apiInstance = new OrderSourceStockStatusApi();
Integer orderSourceStockStatusId = 56; // Integer | Id of the orderSourceStockStatus to remove tag from
String orderSourceStockStatusTag = "orderSourceStockStatusTag_example"; // String | The tag to delete
try {
    apiInstance.deleteOrderSourceStockStatusTag(orderSourceStockStatusId, orderSourceStockStatusTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceStockStatusApi#deleteOrderSourceStockStatusTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceStockStatusId** | **Integer**| Id of the orderSourceStockStatus to remove tag from |
 **orderSourceStockStatusTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateOrderSourceStockStatusById"></a>
# **getDuplicateOrderSourceStockStatusById**
> OrderSourceStockStatus getDuplicateOrderSourceStockStatusById(orderSourceStockStatusId)

Get a duplicated an orderSourceStockStatus by id

Returns a duplicated orderSourceStockStatus identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceStockStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceStockStatusApi apiInstance = new OrderSourceStockStatusApi();
Integer orderSourceStockStatusId = 56; // Integer | Id of the orderSourceStockStatus to be duplicated.
try {
    OrderSourceStockStatus result = apiInstance.getDuplicateOrderSourceStockStatusById(orderSourceStockStatusId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceStockStatusApi#getDuplicateOrderSourceStockStatusById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceStockStatusId** | **Integer**| Id of the orderSourceStockStatus to be duplicated. |

### Return type

[**OrderSourceStockStatus**](OrderSourceStockStatus.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderSourceStockStatusByFilter"></a>
# **getOrderSourceStockStatusByFilter**
> List&lt;OrderSourceStockStatus&gt; getOrderSourceStockStatusByFilter(filter, page, limit, sort)

Search orderSourceStockStatuses by filter

Returns the list of orderSourceStockStatuses that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceStockStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceStockStatusApi apiInstance = new OrderSourceStockStatusApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<OrderSourceStockStatus> result = apiInstance.getOrderSourceStockStatusByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceStockStatusApi#getOrderSourceStockStatusByFilter");
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

[**List&lt;OrderSourceStockStatus&gt;**](OrderSourceStockStatus.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderSourceStockStatusById"></a>
# **getOrderSourceStockStatusById**
> OrderSourceStockStatus getOrderSourceStockStatusById(orderSourceStockStatusId)

Get an orderSourceStockStatus by id

Returns the orderSourceStockStatus identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceStockStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceStockStatusApi apiInstance = new OrderSourceStockStatusApi();
Integer orderSourceStockStatusId = 56; // Integer | Id of the orderSourceStockStatus to be returned.
try {
    OrderSourceStockStatus result = apiInstance.getOrderSourceStockStatusById(orderSourceStockStatusId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceStockStatusApi#getOrderSourceStockStatusById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceStockStatusId** | **Integer**| Id of the orderSourceStockStatus to be returned. |

### Return type

[**OrderSourceStockStatus**](OrderSourceStockStatus.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderSourceStockStatusFiles"></a>
# **getOrderSourceStockStatusFiles**
> getOrderSourceStockStatusFiles(orderSourceStockStatusId)

Get the files for an orderSourceStockStatus.

Get all existing orderSourceStockStatus files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceStockStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceStockStatusApi apiInstance = new OrderSourceStockStatusApi();
Integer orderSourceStockStatusId = 56; // Integer | Id of the orderSourceStockStatus to get files for
try {
    apiInstance.getOrderSourceStockStatusFiles(orderSourceStockStatusId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceStockStatusApi#getOrderSourceStockStatusFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceStockStatusId** | **Integer**| Id of the orderSourceStockStatus to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderSourceStockStatusTags"></a>
# **getOrderSourceStockStatusTags**
> getOrderSourceStockStatusTags(orderSourceStockStatusId)

Get the tags for an orderSourceStockStatus.

Get all existing orderSourceStockStatus tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceStockStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceStockStatusApi apiInstance = new OrderSourceStockStatusApi();
Integer orderSourceStockStatusId = 56; // Integer | Id of the orderSourceStockStatus to get tags for
try {
    apiInstance.getOrderSourceStockStatusTags(orderSourceStockStatusId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceStockStatusApi#getOrderSourceStockStatusTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceStockStatusId** | **Integer**| Id of the orderSourceStockStatus to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

