# FinanceSystemConnectionLogApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFinanceSystemConnectionLogAudit**](FinanceSystemConnectionLogApi.md#addFinanceSystemConnectionLogAudit) | **PUT** /beta/financeSystemConnectionLog/{financeSystemConnectionLogId}/audit/{financeSystemConnectionLogAudit} | Add new audit for a financeSystemConnectionLog
[**addFinanceSystemConnectionLogFile**](FinanceSystemConnectionLogApi.md#addFinanceSystemConnectionLogFile) | **POST** /beta/financeSystemConnectionLog/{financeSystemConnectionLogId}/file/{fileName} | Attach a file to a financeSystemConnectionLog
[**addFinanceSystemConnectionLogTag**](FinanceSystemConnectionLogApi.md#addFinanceSystemConnectionLogTag) | **PUT** /beta/financeSystemConnectionLog/{financeSystemConnectionLogId}/tag/{financeSystemConnectionLogTag} | Add new tags for a financeSystemConnectionLog.
[**deleteFinanceSystemConnectionLogTag**](FinanceSystemConnectionLogApi.md#deleteFinanceSystemConnectionLogTag) | **DELETE** /beta/financeSystemConnectionLog/{financeSystemConnectionLogId}/tag/{financeSystemConnectionLogTag} | Delete a tag for a financeSystemConnectionLog.
[**getDuplicateFinanceSystemConnectionLogById**](FinanceSystemConnectionLogApi.md#getDuplicateFinanceSystemConnectionLogById) | **GET** /beta/financeSystemConnectionLog/duplicate/{financeSystemConnectionLogId} | Get a duplicated a financeSystemConnectionLog by id
[**getFinanceSystemConnectionLogByFilter**](FinanceSystemConnectionLogApi.md#getFinanceSystemConnectionLogByFilter) | **GET** /beta/financeSystemConnectionLog/search | Search financeSystemConnectionLogs by filter
[**getFinanceSystemConnectionLogById**](FinanceSystemConnectionLogApi.md#getFinanceSystemConnectionLogById) | **GET** /beta/financeSystemConnectionLog/{financeSystemConnectionLogId} | Get a financeSystemConnectionLog by id
[**getFinanceSystemConnectionLogTags**](FinanceSystemConnectionLogApi.md#getFinanceSystemConnectionLogTags) | **GET** /beta/financeSystemConnectionLog/{financeSystemConnectionLogId}/tag | Get the tags for a financeSystemConnectionLog.


<a name="addFinanceSystemConnectionLogAudit"></a>
# **addFinanceSystemConnectionLogAudit**
> addFinanceSystemConnectionLogAudit(financeSystemConnectionLogId, financeSystemConnectionLogAudit)

Add new audit for a financeSystemConnectionLog

Adds an audit to an existing financeSystemConnectionLog.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FinanceSystemConnectionLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FinanceSystemConnectionLogApi apiInstance = new FinanceSystemConnectionLogApi();
Integer financeSystemConnectionLogId = 56; // Integer | Id of the financeSystemConnectionLog to add an audit to
String financeSystemConnectionLogAudit = "financeSystemConnectionLogAudit_example"; // String | The audit to add
try {
    apiInstance.addFinanceSystemConnectionLogAudit(financeSystemConnectionLogId, financeSystemConnectionLogAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling FinanceSystemConnectionLogApi#addFinanceSystemConnectionLogAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financeSystemConnectionLogId** | **Integer**| Id of the financeSystemConnectionLog to add an audit to |
 **financeSystemConnectionLogAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addFinanceSystemConnectionLogFile"></a>
# **addFinanceSystemConnectionLogFile**
> addFinanceSystemConnectionLogFile(financeSystemConnectionLogId, fileName)

Attach a file to a financeSystemConnectionLog

Adds a file to an existing financeSystemConnectionLog.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FinanceSystemConnectionLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FinanceSystemConnectionLogApi apiInstance = new FinanceSystemConnectionLogApi();
Integer financeSystemConnectionLogId = 56; // Integer | Id of the financeSystemConnectionLog to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addFinanceSystemConnectionLogFile(financeSystemConnectionLogId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling FinanceSystemConnectionLogApi#addFinanceSystemConnectionLogFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financeSystemConnectionLogId** | **Integer**| Id of the financeSystemConnectionLog to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addFinanceSystemConnectionLogTag"></a>
# **addFinanceSystemConnectionLogTag**
> addFinanceSystemConnectionLogTag(financeSystemConnectionLogId, financeSystemConnectionLogTag)

Add new tags for a financeSystemConnectionLog.

Adds a tag to an existing financeSystemConnectionLog.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FinanceSystemConnectionLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FinanceSystemConnectionLogApi apiInstance = new FinanceSystemConnectionLogApi();
Integer financeSystemConnectionLogId = 56; // Integer | Id of the financeSystemConnectionLog to add a tag to
String financeSystemConnectionLogTag = "financeSystemConnectionLogTag_example"; // String | The tag to add
try {
    apiInstance.addFinanceSystemConnectionLogTag(financeSystemConnectionLogId, financeSystemConnectionLogTag);
} catch (ApiException e) {
    System.err.println("Exception when calling FinanceSystemConnectionLogApi#addFinanceSystemConnectionLogTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financeSystemConnectionLogId** | **Integer**| Id of the financeSystemConnectionLog to add a tag to |
 **financeSystemConnectionLogTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFinanceSystemConnectionLogTag"></a>
# **deleteFinanceSystemConnectionLogTag**
> deleteFinanceSystemConnectionLogTag(financeSystemConnectionLogId, financeSystemConnectionLogTag)

Delete a tag for a financeSystemConnectionLog.

Deletes an existing financeSystemConnectionLog tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FinanceSystemConnectionLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FinanceSystemConnectionLogApi apiInstance = new FinanceSystemConnectionLogApi();
Integer financeSystemConnectionLogId = 56; // Integer | Id of the financeSystemConnectionLog to remove tag from
String financeSystemConnectionLogTag = "financeSystemConnectionLogTag_example"; // String | The tag to delete
try {
    apiInstance.deleteFinanceSystemConnectionLogTag(financeSystemConnectionLogId, financeSystemConnectionLogTag);
} catch (ApiException e) {
    System.err.println("Exception when calling FinanceSystemConnectionLogApi#deleteFinanceSystemConnectionLogTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financeSystemConnectionLogId** | **Integer**| Id of the financeSystemConnectionLog to remove tag from |
 **financeSystemConnectionLogTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateFinanceSystemConnectionLogById"></a>
# **getDuplicateFinanceSystemConnectionLogById**
> FinanceSystemConnectionLog getDuplicateFinanceSystemConnectionLogById(financeSystemConnectionLogId)

Get a duplicated a financeSystemConnectionLog by id

Returns a duplicated financeSystemConnectionLog identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FinanceSystemConnectionLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FinanceSystemConnectionLogApi apiInstance = new FinanceSystemConnectionLogApi();
Integer financeSystemConnectionLogId = 56; // Integer | Id of the financeSystemConnectionLog to be duplicated.
try {
    FinanceSystemConnectionLog result = apiInstance.getDuplicateFinanceSystemConnectionLogById(financeSystemConnectionLogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinanceSystemConnectionLogApi#getDuplicateFinanceSystemConnectionLogById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financeSystemConnectionLogId** | **Integer**| Id of the financeSystemConnectionLog to be duplicated. |

### Return type

[**FinanceSystemConnectionLog**](FinanceSystemConnectionLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFinanceSystemConnectionLogByFilter"></a>
# **getFinanceSystemConnectionLogByFilter**
> List&lt;FinanceSystemConnectionLog&gt; getFinanceSystemConnectionLogByFilter(filter, page, limit, sort)

Search financeSystemConnectionLogs by filter

Returns the list of financeSystemConnectionLogs that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FinanceSystemConnectionLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FinanceSystemConnectionLogApi apiInstance = new FinanceSystemConnectionLogApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<FinanceSystemConnectionLog> result = apiInstance.getFinanceSystemConnectionLogByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinanceSystemConnectionLogApi#getFinanceSystemConnectionLogByFilter");
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

[**List&lt;FinanceSystemConnectionLog&gt;**](FinanceSystemConnectionLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFinanceSystemConnectionLogById"></a>
# **getFinanceSystemConnectionLogById**
> FinanceSystemConnectionLog getFinanceSystemConnectionLogById(financeSystemConnectionLogId)

Get a financeSystemConnectionLog by id

Returns the financeSystemConnectionLog identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FinanceSystemConnectionLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FinanceSystemConnectionLogApi apiInstance = new FinanceSystemConnectionLogApi();
Integer financeSystemConnectionLogId = 56; // Integer | Id of the financeSystemConnectionLog to be returned.
try {
    FinanceSystemConnectionLog result = apiInstance.getFinanceSystemConnectionLogById(financeSystemConnectionLogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinanceSystemConnectionLogApi#getFinanceSystemConnectionLogById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financeSystemConnectionLogId** | **Integer**| Id of the financeSystemConnectionLog to be returned. |

### Return type

[**FinanceSystemConnectionLog**](FinanceSystemConnectionLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFinanceSystemConnectionLogTags"></a>
# **getFinanceSystemConnectionLogTags**
> getFinanceSystemConnectionLogTags(financeSystemConnectionLogId)

Get the tags for a financeSystemConnectionLog.

Get all existing financeSystemConnectionLog tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FinanceSystemConnectionLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FinanceSystemConnectionLogApi apiInstance = new FinanceSystemConnectionLogApi();
Integer financeSystemConnectionLogId = 56; // Integer | Id of the financeSystemConnectionLog to get tags for
try {
    apiInstance.getFinanceSystemConnectionLogTags(financeSystemConnectionLogId);
} catch (ApiException e) {
    System.err.println("Exception when calling FinanceSystemConnectionLogApi#getFinanceSystemConnectionLogTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financeSystemConnectionLogId** | **Integer**| Id of the financeSystemConnectionLog to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

