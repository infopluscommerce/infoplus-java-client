# ReturnOrderApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addReturnOrderAudit**](ReturnOrderApi.md#addReturnOrderAudit) | **PUT** /beta/returnOrder/{returnOrderId}/audit/{returnOrderAudit} | Add new audit for a returnOrder
[**addReturnOrderFile**](ReturnOrderApi.md#addReturnOrderFile) | **POST** /beta/returnOrder/{returnOrderId}/file/{fileName} | Attach a file to a returnOrder
[**addReturnOrderFileByURL**](ReturnOrderApi.md#addReturnOrderFileByURL) | **POST** /beta/returnOrder/{returnOrderId}/file | Attach a file to a returnOrder by URL.
[**addReturnOrderTag**](ReturnOrderApi.md#addReturnOrderTag) | **PUT** /beta/returnOrder/{returnOrderId}/tag/{returnOrderTag} | Add new tags for a returnOrder.
[**deleteReturnOrderFile**](ReturnOrderApi.md#deleteReturnOrderFile) | **DELETE** /beta/returnOrder/{returnOrderId}/file/{fileId} | Delete a file for a returnOrder.
[**deleteReturnOrderTag**](ReturnOrderApi.md#deleteReturnOrderTag) | **DELETE** /beta/returnOrder/{returnOrderId}/tag/{returnOrderTag} | Delete a tag for a returnOrder.
[**getDuplicateReturnOrderById**](ReturnOrderApi.md#getDuplicateReturnOrderById) | **GET** /beta/returnOrder/duplicate/{returnOrderId} | Get a duplicated a returnOrder by id
[**getReturnOrderByFilter**](ReturnOrderApi.md#getReturnOrderByFilter) | **GET** /beta/returnOrder/search | Search returnOrders by filter
[**getReturnOrderById**](ReturnOrderApi.md#getReturnOrderById) | **GET** /beta/returnOrder/{returnOrderId} | Get a returnOrder by id
[**getReturnOrderFiles**](ReturnOrderApi.md#getReturnOrderFiles) | **GET** /beta/returnOrder/{returnOrderId}/file | Get the files for a returnOrder.
[**getReturnOrderTags**](ReturnOrderApi.md#getReturnOrderTags) | **GET** /beta/returnOrder/{returnOrderId}/tag | Get the tags for a returnOrder.
[**updateReturnOrder**](ReturnOrderApi.md#updateReturnOrder) | **PUT** /beta/returnOrder | Update a returnOrder
[**updateReturnOrderCustomFields**](ReturnOrderApi.md#updateReturnOrderCustomFields) | **PUT** /beta/returnOrder/customFields | Update a returnOrder custom fields


<a name="addReturnOrderAudit"></a>
# **addReturnOrderAudit**
> addReturnOrderAudit(returnOrderId, returnOrderAudit)

Add new audit for a returnOrder

Adds an audit to an existing returnOrder.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderApi apiInstance = new ReturnOrderApi();
Integer returnOrderId = 56; // Integer | Id of the returnOrder to add an audit to
String returnOrderAudit = "returnOrderAudit_example"; // String | The audit to add
try {
    apiInstance.addReturnOrderAudit(returnOrderId, returnOrderAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderApi#addReturnOrderAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderId** | **Integer**| Id of the returnOrder to add an audit to |
 **returnOrderAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addReturnOrderFile"></a>
# **addReturnOrderFile**
> addReturnOrderFile(returnOrderId, fileName)

Attach a file to a returnOrder

Adds a file to an existing returnOrder.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderApi apiInstance = new ReturnOrderApi();
Integer returnOrderId = 56; // Integer | Id of the returnOrder to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addReturnOrderFile(returnOrderId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderApi#addReturnOrderFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderId** | **Integer**| Id of the returnOrder to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addReturnOrderFileByURL"></a>
# **addReturnOrderFileByURL**
> addReturnOrderFileByURL(body, returnOrderId)

Attach a file to a returnOrder by URL.

Adds a file to an existing returnOrder by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderApi apiInstance = new ReturnOrderApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer returnOrderId = 56; // Integer | Id of the returnOrder to add an file to
try {
    apiInstance.addReturnOrderFileByURL(body, returnOrderId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderApi#addReturnOrderFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **returnOrderId** | **Integer**| Id of the returnOrder to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addReturnOrderTag"></a>
# **addReturnOrderTag**
> addReturnOrderTag(returnOrderId, returnOrderTag)

Add new tags for a returnOrder.

Adds a tag to an existing returnOrder.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderApi apiInstance = new ReturnOrderApi();
Integer returnOrderId = 56; // Integer | Id of the returnOrder to add a tag to
String returnOrderTag = "returnOrderTag_example"; // String | The tag to add
try {
    apiInstance.addReturnOrderTag(returnOrderId, returnOrderTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderApi#addReturnOrderTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderId** | **Integer**| Id of the returnOrder to add a tag to |
 **returnOrderTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReturnOrderFile"></a>
# **deleteReturnOrderFile**
> deleteReturnOrderFile(returnOrderId, fileId)

Delete a file for a returnOrder.

Deletes an existing returnOrder file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderApi apiInstance = new ReturnOrderApi();
Integer returnOrderId = 56; // Integer | Id of the returnOrder to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteReturnOrderFile(returnOrderId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderApi#deleteReturnOrderFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderId** | **Integer**| Id of the returnOrder to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteReturnOrderTag"></a>
# **deleteReturnOrderTag**
> deleteReturnOrderTag(returnOrderId, returnOrderTag)

Delete a tag for a returnOrder.

Deletes an existing returnOrder tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderApi apiInstance = new ReturnOrderApi();
Integer returnOrderId = 56; // Integer | Id of the returnOrder to remove tag from
String returnOrderTag = "returnOrderTag_example"; // String | The tag to delete
try {
    apiInstance.deleteReturnOrderTag(returnOrderId, returnOrderTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderApi#deleteReturnOrderTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderId** | **Integer**| Id of the returnOrder to remove tag from |
 **returnOrderTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateReturnOrderById"></a>
# **getDuplicateReturnOrderById**
> ReturnOrder getDuplicateReturnOrderById(returnOrderId)

Get a duplicated a returnOrder by id

Returns a duplicated returnOrder identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderApi apiInstance = new ReturnOrderApi();
Integer returnOrderId = 56; // Integer | Id of the returnOrder to be duplicated.
try {
    ReturnOrder result = apiInstance.getDuplicateReturnOrderById(returnOrderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderApi#getDuplicateReturnOrderById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderId** | **Integer**| Id of the returnOrder to be duplicated. |

### Return type

[**ReturnOrder**](ReturnOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReturnOrderByFilter"></a>
# **getReturnOrderByFilter**
> List&lt;ReturnOrder&gt; getReturnOrderByFilter(filter, page, limit, sort)

Search returnOrders by filter

Returns the list of returnOrders that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderApi apiInstance = new ReturnOrderApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ReturnOrder> result = apiInstance.getReturnOrderByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderApi#getReturnOrderByFilter");
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

[**List&lt;ReturnOrder&gt;**](ReturnOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReturnOrderById"></a>
# **getReturnOrderById**
> ReturnOrder getReturnOrderById(returnOrderId)

Get a returnOrder by id

Returns the returnOrder identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderApi apiInstance = new ReturnOrderApi();
Integer returnOrderId = 56; // Integer | Id of the returnOrder to be returned.
try {
    ReturnOrder result = apiInstance.getReturnOrderById(returnOrderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderApi#getReturnOrderById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderId** | **Integer**| Id of the returnOrder to be returned. |

### Return type

[**ReturnOrder**](ReturnOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReturnOrderFiles"></a>
# **getReturnOrderFiles**
> getReturnOrderFiles(returnOrderId)

Get the files for a returnOrder.

Get all existing returnOrder files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderApi apiInstance = new ReturnOrderApi();
Integer returnOrderId = 56; // Integer | Id of the returnOrder to get files for
try {
    apiInstance.getReturnOrderFiles(returnOrderId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderApi#getReturnOrderFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderId** | **Integer**| Id of the returnOrder to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReturnOrderTags"></a>
# **getReturnOrderTags**
> getReturnOrderTags(returnOrderId)

Get the tags for a returnOrder.

Get all existing returnOrder tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderApi apiInstance = new ReturnOrderApi();
Integer returnOrderId = 56; // Integer | Id of the returnOrder to get tags for
try {
    apiInstance.getReturnOrderTags(returnOrderId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderApi#getReturnOrderTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderId** | **Integer**| Id of the returnOrder to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateReturnOrder"></a>
# **updateReturnOrder**
> updateReturnOrder(body)

Update a returnOrder

Updates an existing returnOrder using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderApi apiInstance = new ReturnOrderApi();
ReturnOrder body = new ReturnOrder(); // ReturnOrder | ReturnOrder to be updated.
try {
    apiInstance.updateReturnOrder(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderApi#updateReturnOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReturnOrder**](ReturnOrder.md)| ReturnOrder to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateReturnOrderCustomFields"></a>
# **updateReturnOrderCustomFields**
> updateReturnOrderCustomFields(body)

Update a returnOrder custom fields

Updates an existing returnOrder custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderApi apiInstance = new ReturnOrderApi();
ReturnOrder body = new ReturnOrder(); // ReturnOrder | ReturnOrder to be updated.
try {
    apiInstance.updateReturnOrderCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderApi#updateReturnOrderCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReturnOrder**](ReturnOrder.md)| ReturnOrder to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

