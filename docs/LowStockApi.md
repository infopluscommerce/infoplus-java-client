# LowStockApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLowStockAudit**](LowStockApi.md#addLowStockAudit) | **PUT** /beta/lowStock/{lowStockId}/audit/{lowStockAudit} | Add new audit for a lowStock
[**addLowStockFile**](LowStockApi.md#addLowStockFile) | **POST** /beta/lowStock/{lowStockId}/file/{fileName} | Attach a file to a lowStock
[**addLowStockTag**](LowStockApi.md#addLowStockTag) | **PUT** /beta/lowStock/{lowStockId}/tag/{lowStockTag} | Add new tags for a lowStock.
[**deleteLowStockTag**](LowStockApi.md#deleteLowStockTag) | **DELETE** /beta/lowStock/{lowStockId}/tag/{lowStockTag} | Delete a tag for a lowStock.
[**getDuplicateLowStockById**](LowStockApi.md#getDuplicateLowStockById) | **GET** /beta/lowStock/duplicate/{lowStockId} | Get a duplicated a lowStock by id
[**getLowStockByFilter**](LowStockApi.md#getLowStockByFilter) | **GET** /beta/lowStock/search | Search lowStocks by filter
[**getLowStockById**](LowStockApi.md#getLowStockById) | **GET** /beta/lowStock/{lowStockId} | Get a lowStock by id
[**getLowStockTags**](LowStockApi.md#getLowStockTags) | **GET** /beta/lowStock/{lowStockId}/tag | Get the tags for a lowStock.


<a name="addLowStockAudit"></a>
# **addLowStockAudit**
> addLowStockAudit(lowStockId, lowStockAudit)

Add new audit for a lowStock

Adds an audit to an existing lowStock.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LowStockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LowStockApi apiInstance = new LowStockApi();
Integer lowStockId = 56; // Integer | Id of the lowStock to add an audit to
String lowStockAudit = "lowStockAudit_example"; // String | The audit to add
try {
    apiInstance.addLowStockAudit(lowStockId, lowStockAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling LowStockApi#addLowStockAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lowStockId** | **Integer**| Id of the lowStock to add an audit to |
 **lowStockAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLowStockFile"></a>
# **addLowStockFile**
> addLowStockFile(lowStockId, fileName)

Attach a file to a lowStock

Adds a file to an existing lowStock.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LowStockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LowStockApi apiInstance = new LowStockApi();
Integer lowStockId = 56; // Integer | Id of the lowStock to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addLowStockFile(lowStockId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling LowStockApi#addLowStockFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lowStockId** | **Integer**| Id of the lowStock to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addLowStockTag"></a>
# **addLowStockTag**
> addLowStockTag(lowStockId, lowStockTag)

Add new tags for a lowStock.

Adds a tag to an existing lowStock.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LowStockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LowStockApi apiInstance = new LowStockApi();
Integer lowStockId = 56; // Integer | Id of the lowStock to add a tag to
String lowStockTag = "lowStockTag_example"; // String | The tag to add
try {
    apiInstance.addLowStockTag(lowStockId, lowStockTag);
} catch (ApiException e) {
    System.err.println("Exception when calling LowStockApi#addLowStockTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lowStockId** | **Integer**| Id of the lowStock to add a tag to |
 **lowStockTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLowStockTag"></a>
# **deleteLowStockTag**
> deleteLowStockTag(lowStockId, lowStockTag)

Delete a tag for a lowStock.

Deletes an existing lowStock tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LowStockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LowStockApi apiInstance = new LowStockApi();
Integer lowStockId = 56; // Integer | Id of the lowStock to remove tag from
String lowStockTag = "lowStockTag_example"; // String | The tag to delete
try {
    apiInstance.deleteLowStockTag(lowStockId, lowStockTag);
} catch (ApiException e) {
    System.err.println("Exception when calling LowStockApi#deleteLowStockTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lowStockId** | **Integer**| Id of the lowStock to remove tag from |
 **lowStockTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateLowStockById"></a>
# **getDuplicateLowStockById**
> LowStock getDuplicateLowStockById(lowStockId)

Get a duplicated a lowStock by id

Returns a duplicated lowStock identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LowStockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LowStockApi apiInstance = new LowStockApi();
Integer lowStockId = 56; // Integer | Id of the lowStock to be duplicated.
try {
    LowStock result = apiInstance.getDuplicateLowStockById(lowStockId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LowStockApi#getDuplicateLowStockById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lowStockId** | **Integer**| Id of the lowStock to be duplicated. |

### Return type

[**LowStock**](LowStock.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLowStockByFilter"></a>
# **getLowStockByFilter**
> List&lt;LowStock&gt; getLowStockByFilter(filter, page, limit, sort)

Search lowStocks by filter

Returns the list of lowStocks that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LowStockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LowStockApi apiInstance = new LowStockApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<LowStock> result = apiInstance.getLowStockByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LowStockApi#getLowStockByFilter");
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

[**List&lt;LowStock&gt;**](LowStock.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLowStockById"></a>
# **getLowStockById**
> LowStock getLowStockById(lowStockId)

Get a lowStock by id

Returns the lowStock identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LowStockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LowStockApi apiInstance = new LowStockApi();
Integer lowStockId = 56; // Integer | Id of the lowStock to be returned.
try {
    LowStock result = apiInstance.getLowStockById(lowStockId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LowStockApi#getLowStockById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lowStockId** | **Integer**| Id of the lowStock to be returned. |

### Return type

[**LowStock**](LowStock.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLowStockTags"></a>
# **getLowStockTags**
> getLowStockTags(lowStockId)

Get the tags for a lowStock.

Get all existing lowStock tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LowStockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LowStockApi apiInstance = new LowStockApi();
Integer lowStockId = 56; // Integer | Id of the lowStock to get tags for
try {
    apiInstance.getLowStockTags(lowStockId);
} catch (ApiException e) {
    System.err.println("Exception when calling LowStockApi#getLowStockTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lowStockId** | **Integer**| Id of the lowStock to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

