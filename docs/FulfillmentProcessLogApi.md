# FulfillmentProcessLogApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFulfillmentProcessLogAudit**](FulfillmentProcessLogApi.md#addFulfillmentProcessLogAudit) | **PUT** /beta/fulfillmentProcessLog/{fulfillmentProcessLogId}/audit/{fulfillmentProcessLogAudit} | Add new audit for a fulfillmentProcessLog
[**addFulfillmentProcessLogTag**](FulfillmentProcessLogApi.md#addFulfillmentProcessLogTag) | **PUT** /beta/fulfillmentProcessLog/{fulfillmentProcessLogId}/tag/{fulfillmentProcessLogTag} | Add new tags for a fulfillmentProcessLog.
[**deleteFulfillmentProcessLogTag**](FulfillmentProcessLogApi.md#deleteFulfillmentProcessLogTag) | **DELETE** /beta/fulfillmentProcessLog/{fulfillmentProcessLogId}/tag/{fulfillmentProcessLogTag} | Delete a tag for a fulfillmentProcessLog.
[**getDuplicateFulfillmentProcessLogById**](FulfillmentProcessLogApi.md#getDuplicateFulfillmentProcessLogById) | **GET** /beta/fulfillmentProcessLog/duplicate/{fulfillmentProcessLogId} | Get a duplicated a fulfillmentProcessLog by id
[**getFulfillmentProcessLogByFilter**](FulfillmentProcessLogApi.md#getFulfillmentProcessLogByFilter) | **GET** /beta/fulfillmentProcessLog/search | Search fulfillmentProcessLogs by filter
[**getFulfillmentProcessLogById**](FulfillmentProcessLogApi.md#getFulfillmentProcessLogById) | **GET** /beta/fulfillmentProcessLog/{fulfillmentProcessLogId} | Get a fulfillmentProcessLog by id
[**getFulfillmentProcessLogTags**](FulfillmentProcessLogApi.md#getFulfillmentProcessLogTags) | **GET** /beta/fulfillmentProcessLog/{fulfillmentProcessLogId}/tag | Get the tags for a fulfillmentProcessLog.


<a name="addFulfillmentProcessLogAudit"></a>
# **addFulfillmentProcessLogAudit**
> addFulfillmentProcessLogAudit(fulfillmentProcessLogId, fulfillmentProcessLogAudit)

Add new audit for a fulfillmentProcessLog

Adds an audit to an existing fulfillmentProcessLog.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentProcessLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentProcessLogApi apiInstance = new FulfillmentProcessLogApi();
Integer fulfillmentProcessLogId = 56; // Integer | Id of the fulfillmentProcessLog to add an audit to
String fulfillmentProcessLogAudit = "fulfillmentProcessLogAudit_example"; // String | The audit to add
try {
    apiInstance.addFulfillmentProcessLogAudit(fulfillmentProcessLogId, fulfillmentProcessLogAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessLogApi#addFulfillmentProcessLogAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentProcessLogId** | **Integer**| Id of the fulfillmentProcessLog to add an audit to |
 **fulfillmentProcessLogAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addFulfillmentProcessLogTag"></a>
# **addFulfillmentProcessLogTag**
> addFulfillmentProcessLogTag(fulfillmentProcessLogId, fulfillmentProcessLogTag)

Add new tags for a fulfillmentProcessLog.

Adds a tag to an existing fulfillmentProcessLog.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentProcessLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentProcessLogApi apiInstance = new FulfillmentProcessLogApi();
Integer fulfillmentProcessLogId = 56; // Integer | Id of the fulfillmentProcessLog to add a tag to
String fulfillmentProcessLogTag = "fulfillmentProcessLogTag_example"; // String | The tag to add
try {
    apiInstance.addFulfillmentProcessLogTag(fulfillmentProcessLogId, fulfillmentProcessLogTag);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessLogApi#addFulfillmentProcessLogTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentProcessLogId** | **Integer**| Id of the fulfillmentProcessLog to add a tag to |
 **fulfillmentProcessLogTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFulfillmentProcessLogTag"></a>
# **deleteFulfillmentProcessLogTag**
> deleteFulfillmentProcessLogTag(fulfillmentProcessLogId, fulfillmentProcessLogTag)

Delete a tag for a fulfillmentProcessLog.

Deletes an existing fulfillmentProcessLog tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentProcessLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentProcessLogApi apiInstance = new FulfillmentProcessLogApi();
Integer fulfillmentProcessLogId = 56; // Integer | Id of the fulfillmentProcessLog to remove tag from
String fulfillmentProcessLogTag = "fulfillmentProcessLogTag_example"; // String | The tag to delete
try {
    apiInstance.deleteFulfillmentProcessLogTag(fulfillmentProcessLogId, fulfillmentProcessLogTag);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessLogApi#deleteFulfillmentProcessLogTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentProcessLogId** | **Integer**| Id of the fulfillmentProcessLog to remove tag from |
 **fulfillmentProcessLogTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateFulfillmentProcessLogById"></a>
# **getDuplicateFulfillmentProcessLogById**
> FulfillmentProcessLog getDuplicateFulfillmentProcessLogById(fulfillmentProcessLogId)

Get a duplicated a fulfillmentProcessLog by id

Returns a duplicated fulfillmentProcessLog identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentProcessLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentProcessLogApi apiInstance = new FulfillmentProcessLogApi();
Integer fulfillmentProcessLogId = 56; // Integer | Id of the fulfillmentProcessLog to be duplicated.
try {
    FulfillmentProcessLog result = apiInstance.getDuplicateFulfillmentProcessLogById(fulfillmentProcessLogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessLogApi#getDuplicateFulfillmentProcessLogById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentProcessLogId** | **Integer**| Id of the fulfillmentProcessLog to be duplicated. |

### Return type

[**FulfillmentProcessLog**](FulfillmentProcessLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFulfillmentProcessLogByFilter"></a>
# **getFulfillmentProcessLogByFilter**
> List&lt;FulfillmentProcessLog&gt; getFulfillmentProcessLogByFilter(filter, page, limit, sort)

Search fulfillmentProcessLogs by filter

Returns the list of fulfillmentProcessLogs that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentProcessLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentProcessLogApi apiInstance = new FulfillmentProcessLogApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<FulfillmentProcessLog> result = apiInstance.getFulfillmentProcessLogByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessLogApi#getFulfillmentProcessLogByFilter");
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

[**List&lt;FulfillmentProcessLog&gt;**](FulfillmentProcessLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFulfillmentProcessLogById"></a>
# **getFulfillmentProcessLogById**
> FulfillmentProcessLog getFulfillmentProcessLogById(fulfillmentProcessLogId)

Get a fulfillmentProcessLog by id

Returns the fulfillmentProcessLog identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentProcessLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentProcessLogApi apiInstance = new FulfillmentProcessLogApi();
Integer fulfillmentProcessLogId = 56; // Integer | Id of the fulfillmentProcessLog to be returned.
try {
    FulfillmentProcessLog result = apiInstance.getFulfillmentProcessLogById(fulfillmentProcessLogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessLogApi#getFulfillmentProcessLogById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentProcessLogId** | **Integer**| Id of the fulfillmentProcessLog to be returned. |

### Return type

[**FulfillmentProcessLog**](FulfillmentProcessLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFulfillmentProcessLogTags"></a>
# **getFulfillmentProcessLogTags**
> getFulfillmentProcessLogTags(fulfillmentProcessLogId)

Get the tags for a fulfillmentProcessLog.

Get all existing fulfillmentProcessLog tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentProcessLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentProcessLogApi apiInstance = new FulfillmentProcessLogApi();
Integer fulfillmentProcessLogId = 56; // Integer | Id of the fulfillmentProcessLog to get tags for
try {
    apiInstance.getFulfillmentProcessLogTags(fulfillmentProcessLogId);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessLogApi#getFulfillmentProcessLogTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentProcessLogId** | **Integer**| Id of the fulfillmentProcessLog to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

