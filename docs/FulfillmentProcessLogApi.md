# FulfillmentProcessLogApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFulfillmentProcessLogAudit**](FulfillmentProcessLogApi.md#addFulfillmentProcessLogAudit) | **PUT** /v3.0/fulfillmentProcessLog/{fulfillmentProcessLogId}/audit/{fulfillmentProcessLogAudit} | Add new audit for a fulfillmentProcessLog
[**addFulfillmentProcessLogFile**](FulfillmentProcessLogApi.md#addFulfillmentProcessLogFile) | **POST** /v3.0/fulfillmentProcessLog/{fulfillmentProcessLogId}/file/{fileName} | Attach a file to a fulfillmentProcessLog
[**addFulfillmentProcessLogFileByURL**](FulfillmentProcessLogApi.md#addFulfillmentProcessLogFileByURL) | **POST** /v3.0/fulfillmentProcessLog/{fulfillmentProcessLogId}/file | Attach a file to a fulfillmentProcessLog by URL.
[**addFulfillmentProcessLogTag**](FulfillmentProcessLogApi.md#addFulfillmentProcessLogTag) | **PUT** /v3.0/fulfillmentProcessLog/{fulfillmentProcessLogId}/tag/{fulfillmentProcessLogTag} | Add new tags for a fulfillmentProcessLog.
[**deleteFulfillmentProcessLogFile**](FulfillmentProcessLogApi.md#deleteFulfillmentProcessLogFile) | **DELETE** /v3.0/fulfillmentProcessLog/{fulfillmentProcessLogId}/file/{fileId} | Delete a file for a fulfillmentProcessLog.
[**deleteFulfillmentProcessLogTag**](FulfillmentProcessLogApi.md#deleteFulfillmentProcessLogTag) | **DELETE** /v3.0/fulfillmentProcessLog/{fulfillmentProcessLogId}/tag/{fulfillmentProcessLogTag} | Delete a tag for a fulfillmentProcessLog.
[**getDuplicateFulfillmentProcessLogById**](FulfillmentProcessLogApi.md#getDuplicateFulfillmentProcessLogById) | **GET** /v3.0/fulfillmentProcessLog/duplicate/{fulfillmentProcessLogId} | Get a duplicated a fulfillmentProcessLog by id
[**getFulfillmentProcessLogByFilter**](FulfillmentProcessLogApi.md#getFulfillmentProcessLogByFilter) | **GET** /v3.0/fulfillmentProcessLog/search | Search fulfillmentProcessLogs by filter
[**getFulfillmentProcessLogById**](FulfillmentProcessLogApi.md#getFulfillmentProcessLogById) | **GET** /v3.0/fulfillmentProcessLog/{fulfillmentProcessLogId} | Get a fulfillmentProcessLog by id
[**getFulfillmentProcessLogFiles**](FulfillmentProcessLogApi.md#getFulfillmentProcessLogFiles) | **GET** /v3.0/fulfillmentProcessLog/{fulfillmentProcessLogId}/file | Get the files for a fulfillmentProcessLog.
[**getFulfillmentProcessLogTags**](FulfillmentProcessLogApi.md#getFulfillmentProcessLogTags) | **GET** /v3.0/fulfillmentProcessLog/{fulfillmentProcessLogId}/tag | Get the tags for a fulfillmentProcessLog.


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

<a name="addFulfillmentProcessLogFile"></a>
# **addFulfillmentProcessLogFile**
> addFulfillmentProcessLogFile(fulfillmentProcessLogId, fileName)

Attach a file to a fulfillmentProcessLog

Adds a file to an existing fulfillmentProcessLog.

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
Integer fulfillmentProcessLogId = 56; // Integer | Id of the fulfillmentProcessLog to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addFulfillmentProcessLogFile(fulfillmentProcessLogId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessLogApi#addFulfillmentProcessLogFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentProcessLogId** | **Integer**| Id of the fulfillmentProcessLog to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addFulfillmentProcessLogFileByURL"></a>
# **addFulfillmentProcessLogFileByURL**
> addFulfillmentProcessLogFileByURL(body, fulfillmentProcessLogId)

Attach a file to a fulfillmentProcessLog by URL.

Adds a file to an existing fulfillmentProcessLog by URL.

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
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer fulfillmentProcessLogId = 56; // Integer | Id of the fulfillmentProcessLog to add an file to
try {
    apiInstance.addFulfillmentProcessLogFileByURL(body, fulfillmentProcessLogId);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessLogApi#addFulfillmentProcessLogFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **fulfillmentProcessLogId** | **Integer**| Id of the fulfillmentProcessLog to add an file to |

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

<a name="deleteFulfillmentProcessLogFile"></a>
# **deleteFulfillmentProcessLogFile**
> deleteFulfillmentProcessLogFile(fulfillmentProcessLogId, fileId)

Delete a file for a fulfillmentProcessLog.

Deletes an existing fulfillmentProcessLog file using the specified data.

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
Integer fulfillmentProcessLogId = 56; // Integer | Id of the fulfillmentProcessLog to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteFulfillmentProcessLogFile(fulfillmentProcessLogId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessLogApi#deleteFulfillmentProcessLogFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentProcessLogId** | **Integer**| Id of the fulfillmentProcessLog to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
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

<a name="getFulfillmentProcessLogFiles"></a>
# **getFulfillmentProcessLogFiles**
> getFulfillmentProcessLogFiles(fulfillmentProcessLogId)

Get the files for a fulfillmentProcessLog.

Get all existing fulfillmentProcessLog files.

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
Integer fulfillmentProcessLogId = 56; // Integer | Id of the fulfillmentProcessLog to get files for
try {
    apiInstance.getFulfillmentProcessLogFiles(fulfillmentProcessLogId);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessLogApi#getFulfillmentProcessLogFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentProcessLogId** | **Integer**| Id of the fulfillmentProcessLog to get files for |

### Return type

null (empty response body)

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

