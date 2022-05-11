# OmsOrderApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOmsOrder**](OmsOrderApi.md#addOmsOrder) | **POST** /v3.0/omsOrder | Create an omsOrder
[**addOmsOrderAudit**](OmsOrderApi.md#addOmsOrderAudit) | **PUT** /v3.0/omsOrder/{omsOrderId}/audit/{omsOrderAudit} | Add new audit for an omsOrder
[**addOmsOrderFile**](OmsOrderApi.md#addOmsOrderFile) | **POST** /v3.0/omsOrder/{omsOrderId}/file/{fileName} | Attach a file to an omsOrder
[**addOmsOrderFileByURL**](OmsOrderApi.md#addOmsOrderFileByURL) | **POST** /v3.0/omsOrder/{omsOrderId}/file | Attach a file to an omsOrder by URL.
[**addOmsOrderTag**](OmsOrderApi.md#addOmsOrderTag) | **PUT** /v3.0/omsOrder/{omsOrderId}/tag/{omsOrderTag} | Add new tags for an omsOrder.
[**deleteOmsOrderFile**](OmsOrderApi.md#deleteOmsOrderFile) | **DELETE** /v3.0/omsOrder/{omsOrderId}/file/{fileId} | Delete a file for an omsOrder.
[**deleteOmsOrderTag**](OmsOrderApi.md#deleteOmsOrderTag) | **DELETE** /v3.0/omsOrder/{omsOrderId}/tag/{omsOrderTag} | Delete a tag for an omsOrder.
[**getDuplicateOmsOrderById**](OmsOrderApi.md#getDuplicateOmsOrderById) | **GET** /v3.0/omsOrder/duplicate/{omsOrderId} | Get a duplicated an omsOrder by id
[**getOmsOrderByFilter**](OmsOrderApi.md#getOmsOrderByFilter) | **GET** /v3.0/omsOrder/search | Search omsOrders by filter
[**getOmsOrderById**](OmsOrderApi.md#getOmsOrderById) | **GET** /v3.0/omsOrder/{omsOrderId} | Get an omsOrder by id
[**getOmsOrderFiles**](OmsOrderApi.md#getOmsOrderFiles) | **GET** /v3.0/omsOrder/{omsOrderId}/file | Get the files for an omsOrder.
[**getOmsOrderTags**](OmsOrderApi.md#getOmsOrderTags) | **GET** /v3.0/omsOrder/{omsOrderId}/tag | Get the tags for an omsOrder.
[**updateOmsOrder**](OmsOrderApi.md#updateOmsOrder) | **PUT** /v3.0/omsOrder | Update an omsOrder
[**updateOmsOrderCustomFields**](OmsOrderApi.md#updateOmsOrderCustomFields) | **PUT** /v3.0/omsOrder/customFields | Update an omsOrder custom fields


<a name="addOmsOrder"></a>
# **addOmsOrder**
> OmsOrder addOmsOrder(body)

Create an omsOrder

Inserts a new omsOrder using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OmsOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OmsOrderApi apiInstance = new OmsOrderApi();
OmsOrder body = new OmsOrder(); // OmsOrder | OmsOrder to be inserted.
try {
    OmsOrder result = apiInstance.addOmsOrder(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OmsOrderApi#addOmsOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OmsOrder**](OmsOrder.md)| OmsOrder to be inserted. |

### Return type

[**OmsOrder**](OmsOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOmsOrderAudit"></a>
# **addOmsOrderAudit**
> addOmsOrderAudit(omsOrderId, omsOrderAudit)

Add new audit for an omsOrder

Adds an audit to an existing omsOrder.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OmsOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OmsOrderApi apiInstance = new OmsOrderApi();
Integer omsOrderId = 56; // Integer | Id of the omsOrder to add an audit to
String omsOrderAudit = "omsOrderAudit_example"; // String | The audit to add
try {
    apiInstance.addOmsOrderAudit(omsOrderId, omsOrderAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling OmsOrderApi#addOmsOrderAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **omsOrderId** | **Integer**| Id of the omsOrder to add an audit to |
 **omsOrderAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOmsOrderFile"></a>
# **addOmsOrderFile**
> addOmsOrderFile(omsOrderId, fileName)

Attach a file to an omsOrder

Adds a file to an existing omsOrder.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OmsOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OmsOrderApi apiInstance = new OmsOrderApi();
Integer omsOrderId = 56; // Integer | Id of the omsOrder to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addOmsOrderFile(omsOrderId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling OmsOrderApi#addOmsOrderFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **omsOrderId** | **Integer**| Id of the omsOrder to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addOmsOrderFileByURL"></a>
# **addOmsOrderFileByURL**
> addOmsOrderFileByURL(body, omsOrderId)

Attach a file to an omsOrder by URL.

Adds a file to an existing omsOrder by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OmsOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OmsOrderApi apiInstance = new OmsOrderApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer omsOrderId = 56; // Integer | Id of the omsOrder to add an file to
try {
    apiInstance.addOmsOrderFileByURL(body, omsOrderId);
} catch (ApiException e) {
    System.err.println("Exception when calling OmsOrderApi#addOmsOrderFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **omsOrderId** | **Integer**| Id of the omsOrder to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOmsOrderTag"></a>
# **addOmsOrderTag**
> addOmsOrderTag(omsOrderId, omsOrderTag)

Add new tags for an omsOrder.

Adds a tag to an existing omsOrder.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OmsOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OmsOrderApi apiInstance = new OmsOrderApi();
Integer omsOrderId = 56; // Integer | Id of the omsOrder to add a tag to
String omsOrderTag = "omsOrderTag_example"; // String | The tag to add
try {
    apiInstance.addOmsOrderTag(omsOrderId, omsOrderTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OmsOrderApi#addOmsOrderTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **omsOrderId** | **Integer**| Id of the omsOrder to add a tag to |
 **omsOrderTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOmsOrderFile"></a>
# **deleteOmsOrderFile**
> deleteOmsOrderFile(omsOrderId, fileId)

Delete a file for an omsOrder.

Deletes an existing omsOrder file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OmsOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OmsOrderApi apiInstance = new OmsOrderApi();
Integer omsOrderId = 56; // Integer | Id of the omsOrder to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteOmsOrderFile(omsOrderId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling OmsOrderApi#deleteOmsOrderFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **omsOrderId** | **Integer**| Id of the omsOrder to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteOmsOrderTag"></a>
# **deleteOmsOrderTag**
> deleteOmsOrderTag(omsOrderId, omsOrderTag)

Delete a tag for an omsOrder.

Deletes an existing omsOrder tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OmsOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OmsOrderApi apiInstance = new OmsOrderApi();
Integer omsOrderId = 56; // Integer | Id of the omsOrder to remove tag from
String omsOrderTag = "omsOrderTag_example"; // String | The tag to delete
try {
    apiInstance.deleteOmsOrderTag(omsOrderId, omsOrderTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OmsOrderApi#deleteOmsOrderTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **omsOrderId** | **Integer**| Id of the omsOrder to remove tag from |
 **omsOrderTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateOmsOrderById"></a>
# **getDuplicateOmsOrderById**
> OmsOrder getDuplicateOmsOrderById(omsOrderId)

Get a duplicated an omsOrder by id

Returns a duplicated omsOrder identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OmsOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OmsOrderApi apiInstance = new OmsOrderApi();
Integer omsOrderId = 56; // Integer | Id of the omsOrder to be duplicated.
try {
    OmsOrder result = apiInstance.getDuplicateOmsOrderById(omsOrderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OmsOrderApi#getDuplicateOmsOrderById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **omsOrderId** | **Integer**| Id of the omsOrder to be duplicated. |

### Return type

[**OmsOrder**](OmsOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOmsOrderByFilter"></a>
# **getOmsOrderByFilter**
> List&lt;OmsOrder&gt; getOmsOrderByFilter(filter, page, limit, sort)

Search omsOrders by filter

Returns the list of omsOrders that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OmsOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OmsOrderApi apiInstance = new OmsOrderApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<OmsOrder> result = apiInstance.getOmsOrderByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OmsOrderApi#getOmsOrderByFilter");
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

[**List&lt;OmsOrder&gt;**](OmsOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOmsOrderById"></a>
# **getOmsOrderById**
> OmsOrder getOmsOrderById(omsOrderId)

Get an omsOrder by id

Returns the omsOrder identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OmsOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OmsOrderApi apiInstance = new OmsOrderApi();
Integer omsOrderId = 56; // Integer | Id of the omsOrder to be returned.
try {
    OmsOrder result = apiInstance.getOmsOrderById(omsOrderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OmsOrderApi#getOmsOrderById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **omsOrderId** | **Integer**| Id of the omsOrder to be returned. |

### Return type

[**OmsOrder**](OmsOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOmsOrderFiles"></a>
# **getOmsOrderFiles**
> getOmsOrderFiles(omsOrderId)

Get the files for an omsOrder.

Get all existing omsOrder files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OmsOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OmsOrderApi apiInstance = new OmsOrderApi();
Integer omsOrderId = 56; // Integer | Id of the omsOrder to get files for
try {
    apiInstance.getOmsOrderFiles(omsOrderId);
} catch (ApiException e) {
    System.err.println("Exception when calling OmsOrderApi#getOmsOrderFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **omsOrderId** | **Integer**| Id of the omsOrder to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOmsOrderTags"></a>
# **getOmsOrderTags**
> getOmsOrderTags(omsOrderId)

Get the tags for an omsOrder.

Get all existing omsOrder tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OmsOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OmsOrderApi apiInstance = new OmsOrderApi();
Integer omsOrderId = 56; // Integer | Id of the omsOrder to get tags for
try {
    apiInstance.getOmsOrderTags(omsOrderId);
} catch (ApiException e) {
    System.err.println("Exception when calling OmsOrderApi#getOmsOrderTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **omsOrderId** | **Integer**| Id of the omsOrder to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOmsOrder"></a>
# **updateOmsOrder**
> updateOmsOrder(body)

Update an omsOrder

Updates an existing omsOrder using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OmsOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OmsOrderApi apiInstance = new OmsOrderApi();
OmsOrder body = new OmsOrder(); // OmsOrder | OmsOrder to be updated.
try {
    apiInstance.updateOmsOrder(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OmsOrderApi#updateOmsOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OmsOrder**](OmsOrder.md)| OmsOrder to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOmsOrderCustomFields"></a>
# **updateOmsOrderCustomFields**
> updateOmsOrderCustomFields(body)

Update an omsOrder custom fields

Updates an existing omsOrder custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OmsOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OmsOrderApi apiInstance = new OmsOrderApi();
OmsOrder body = new OmsOrder(); // OmsOrder | OmsOrder to be updated.
try {
    apiInstance.updateOmsOrderCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OmsOrderApi#updateOmsOrderCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OmsOrder**](OmsOrder.md)| OmsOrder to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

