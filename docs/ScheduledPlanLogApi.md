# ScheduledPlanLogApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addScheduledPlanLogAudit**](ScheduledPlanLogApi.md#addScheduledPlanLogAudit) | **PUT** /beta/scheduledPlanLog/{scheduledPlanLogId}/audit/{scheduledPlanLogAudit} | Add new audit for a scheduledPlanLog
[**addScheduledPlanLogFile**](ScheduledPlanLogApi.md#addScheduledPlanLogFile) | **POST** /beta/scheduledPlanLog/{scheduledPlanLogId}/file/{fileName} | Attach a file to a scheduledPlanLog
[**addScheduledPlanLogTag**](ScheduledPlanLogApi.md#addScheduledPlanLogTag) | **PUT** /beta/scheduledPlanLog/{scheduledPlanLogId}/tag/{scheduledPlanLogTag} | Add new tags for a scheduledPlanLog.
[**deleteScheduledPlanLogTag**](ScheduledPlanLogApi.md#deleteScheduledPlanLogTag) | **DELETE** /beta/scheduledPlanLog/{scheduledPlanLogId}/tag/{scheduledPlanLogTag} | Delete a tag for a scheduledPlanLog.
[**getDuplicateScheduledPlanLogById**](ScheduledPlanLogApi.md#getDuplicateScheduledPlanLogById) | **GET** /beta/scheduledPlanLog/duplicate/{scheduledPlanLogId} | Get a duplicated a scheduledPlanLog by id
[**getScheduledPlanLogByFilter**](ScheduledPlanLogApi.md#getScheduledPlanLogByFilter) | **GET** /beta/scheduledPlanLog/search | Search scheduledPlanLogs by filter
[**getScheduledPlanLogById**](ScheduledPlanLogApi.md#getScheduledPlanLogById) | **GET** /beta/scheduledPlanLog/{scheduledPlanLogId} | Get a scheduledPlanLog by id
[**getScheduledPlanLogTags**](ScheduledPlanLogApi.md#getScheduledPlanLogTags) | **GET** /beta/scheduledPlanLog/{scheduledPlanLogId}/tag | Get the tags for a scheduledPlanLog.


<a name="addScheduledPlanLogAudit"></a>
# **addScheduledPlanLogAudit**
> addScheduledPlanLogAudit(scheduledPlanLogId, scheduledPlanLogAudit)

Add new audit for a scheduledPlanLog

Adds an audit to an existing scheduledPlanLog.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ScheduledPlanLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ScheduledPlanLogApi apiInstance = new ScheduledPlanLogApi();
Integer scheduledPlanLogId = 56; // Integer | Id of the scheduledPlanLog to add an audit to
String scheduledPlanLogAudit = "scheduledPlanLogAudit_example"; // String | The audit to add
try {
    apiInstance.addScheduledPlanLogAudit(scheduledPlanLogId, scheduledPlanLogAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanLogApi#addScheduledPlanLogAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduledPlanLogId** | **Integer**| Id of the scheduledPlanLog to add an audit to |
 **scheduledPlanLogAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addScheduledPlanLogFile"></a>
# **addScheduledPlanLogFile**
> addScheduledPlanLogFile(scheduledPlanLogId, fileName)

Attach a file to a scheduledPlanLog

Adds a file to an existing scheduledPlanLog.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ScheduledPlanLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ScheduledPlanLogApi apiInstance = new ScheduledPlanLogApi();
Integer scheduledPlanLogId = 56; // Integer | Id of the scheduledPlanLog to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addScheduledPlanLogFile(scheduledPlanLogId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanLogApi#addScheduledPlanLogFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduledPlanLogId** | **Integer**| Id of the scheduledPlanLog to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addScheduledPlanLogTag"></a>
# **addScheduledPlanLogTag**
> addScheduledPlanLogTag(scheduledPlanLogId, scheduledPlanLogTag)

Add new tags for a scheduledPlanLog.

Adds a tag to an existing scheduledPlanLog.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ScheduledPlanLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ScheduledPlanLogApi apiInstance = new ScheduledPlanLogApi();
Integer scheduledPlanLogId = 56; // Integer | Id of the scheduledPlanLog to add a tag to
String scheduledPlanLogTag = "scheduledPlanLogTag_example"; // String | The tag to add
try {
    apiInstance.addScheduledPlanLogTag(scheduledPlanLogId, scheduledPlanLogTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanLogApi#addScheduledPlanLogTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduledPlanLogId** | **Integer**| Id of the scheduledPlanLog to add a tag to |
 **scheduledPlanLogTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteScheduledPlanLogTag"></a>
# **deleteScheduledPlanLogTag**
> deleteScheduledPlanLogTag(scheduledPlanLogId, scheduledPlanLogTag)

Delete a tag for a scheduledPlanLog.

Deletes an existing scheduledPlanLog tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ScheduledPlanLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ScheduledPlanLogApi apiInstance = new ScheduledPlanLogApi();
Integer scheduledPlanLogId = 56; // Integer | Id of the scheduledPlanLog to remove tag from
String scheduledPlanLogTag = "scheduledPlanLogTag_example"; // String | The tag to delete
try {
    apiInstance.deleteScheduledPlanLogTag(scheduledPlanLogId, scheduledPlanLogTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanLogApi#deleteScheduledPlanLogTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduledPlanLogId** | **Integer**| Id of the scheduledPlanLog to remove tag from |
 **scheduledPlanLogTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateScheduledPlanLogById"></a>
# **getDuplicateScheduledPlanLogById**
> ScheduledPlanLog getDuplicateScheduledPlanLogById(scheduledPlanLogId)

Get a duplicated a scheduledPlanLog by id

Returns a duplicated scheduledPlanLog identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ScheduledPlanLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ScheduledPlanLogApi apiInstance = new ScheduledPlanLogApi();
Integer scheduledPlanLogId = 56; // Integer | Id of the scheduledPlanLog to be duplicated.
try {
    ScheduledPlanLog result = apiInstance.getDuplicateScheduledPlanLogById(scheduledPlanLogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanLogApi#getDuplicateScheduledPlanLogById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduledPlanLogId** | **Integer**| Id of the scheduledPlanLog to be duplicated. |

### Return type

[**ScheduledPlanLog**](ScheduledPlanLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getScheduledPlanLogByFilter"></a>
# **getScheduledPlanLogByFilter**
> List&lt;ScheduledPlanLog&gt; getScheduledPlanLogByFilter(filter, page, limit, sort)

Search scheduledPlanLogs by filter

Returns the list of scheduledPlanLogs that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ScheduledPlanLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ScheduledPlanLogApi apiInstance = new ScheduledPlanLogApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ScheduledPlanLog> result = apiInstance.getScheduledPlanLogByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanLogApi#getScheduledPlanLogByFilter");
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

[**List&lt;ScheduledPlanLog&gt;**](ScheduledPlanLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getScheduledPlanLogById"></a>
# **getScheduledPlanLogById**
> ScheduledPlanLog getScheduledPlanLogById(scheduledPlanLogId)

Get a scheduledPlanLog by id

Returns the scheduledPlanLog identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ScheduledPlanLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ScheduledPlanLogApi apiInstance = new ScheduledPlanLogApi();
Integer scheduledPlanLogId = 56; // Integer | Id of the scheduledPlanLog to be returned.
try {
    ScheduledPlanLog result = apiInstance.getScheduledPlanLogById(scheduledPlanLogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanLogApi#getScheduledPlanLogById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduledPlanLogId** | **Integer**| Id of the scheduledPlanLog to be returned. |

### Return type

[**ScheduledPlanLog**](ScheduledPlanLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getScheduledPlanLogTags"></a>
# **getScheduledPlanLogTags**
> getScheduledPlanLogTags(scheduledPlanLogId)

Get the tags for a scheduledPlanLog.

Get all existing scheduledPlanLog tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ScheduledPlanLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ScheduledPlanLogApi apiInstance = new ScheduledPlanLogApi();
Integer scheduledPlanLogId = 56; // Integer | Id of the scheduledPlanLog to get tags for
try {
    apiInstance.getScheduledPlanLogTags(scheduledPlanLogId);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanLogApi#getScheduledPlanLogTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduledPlanLogId** | **Integer**| Id of the scheduledPlanLog to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

