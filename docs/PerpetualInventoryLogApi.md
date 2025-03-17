# PerpetualInventoryLogApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPerpetualInventoryLogAudit**](PerpetualInventoryLogApi.md#addPerpetualInventoryLogAudit) | **PUT** /beta/perpetualInventoryLog/{perpetualInventoryLogId}/audit/{perpetualInventoryLogAudit} | Add new audit for a perpetualInventoryLog
[**addPerpetualInventoryLogFile**](PerpetualInventoryLogApi.md#addPerpetualInventoryLogFile) | **POST** /beta/perpetualInventoryLog/{perpetualInventoryLogId}/file/{fileName} | Attach a file to a perpetualInventoryLog
[**addPerpetualInventoryLogFileByURL**](PerpetualInventoryLogApi.md#addPerpetualInventoryLogFileByURL) | **POST** /beta/perpetualInventoryLog/{perpetualInventoryLogId}/file | Attach a file to a perpetualInventoryLog by URL.
[**addPerpetualInventoryLogTag**](PerpetualInventoryLogApi.md#addPerpetualInventoryLogTag) | **PUT** /beta/perpetualInventoryLog/{perpetualInventoryLogId}/tag/{perpetualInventoryLogTag} | Add new tags for a perpetualInventoryLog.
[**deletePerpetualInventoryLogFile**](PerpetualInventoryLogApi.md#deletePerpetualInventoryLogFile) | **DELETE** /beta/perpetualInventoryLog/{perpetualInventoryLogId}/file/{fileId} | Delete a file for a perpetualInventoryLog.
[**deletePerpetualInventoryLogTag**](PerpetualInventoryLogApi.md#deletePerpetualInventoryLogTag) | **DELETE** /beta/perpetualInventoryLog/{perpetualInventoryLogId}/tag/{perpetualInventoryLogTag} | Delete a tag for a perpetualInventoryLog.
[**getDuplicatePerpetualInventoryLogById**](PerpetualInventoryLogApi.md#getDuplicatePerpetualInventoryLogById) | **GET** /beta/perpetualInventoryLog/duplicate/{perpetualInventoryLogId} | Get a duplicated a perpetualInventoryLog by id
[**getPerpetualInventoryLogByFilter**](PerpetualInventoryLogApi.md#getPerpetualInventoryLogByFilter) | **GET** /beta/perpetualInventoryLog/search | Search perpetualInventoryLogs by filter
[**getPerpetualInventoryLogById**](PerpetualInventoryLogApi.md#getPerpetualInventoryLogById) | **GET** /beta/perpetualInventoryLog/{perpetualInventoryLogId} | Get a perpetualInventoryLog by id
[**getPerpetualInventoryLogFiles**](PerpetualInventoryLogApi.md#getPerpetualInventoryLogFiles) | **GET** /beta/perpetualInventoryLog/{perpetualInventoryLogId}/file | Get the files for a perpetualInventoryLog.
[**getPerpetualInventoryLogTags**](PerpetualInventoryLogApi.md#getPerpetualInventoryLogTags) | **GET** /beta/perpetualInventoryLog/{perpetualInventoryLogId}/tag | Get the tags for a perpetualInventoryLog.


<a name="addPerpetualInventoryLogAudit"></a>
# **addPerpetualInventoryLogAudit**
> addPerpetualInventoryLogAudit(perpetualInventoryLogId, perpetualInventoryLogAudit)

Add new audit for a perpetualInventoryLog

Adds an audit to an existing perpetualInventoryLog.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PerpetualInventoryLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PerpetualInventoryLogApi apiInstance = new PerpetualInventoryLogApi();
Integer perpetualInventoryLogId = 56; // Integer | Id of the perpetualInventoryLog to add an audit to
String perpetualInventoryLogAudit = "perpetualInventoryLogAudit_example"; // String | The audit to add
try {
    apiInstance.addPerpetualInventoryLogAudit(perpetualInventoryLogId, perpetualInventoryLogAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling PerpetualInventoryLogApi#addPerpetualInventoryLogAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perpetualInventoryLogId** | **Integer**| Id of the perpetualInventoryLog to add an audit to |
 **perpetualInventoryLogAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPerpetualInventoryLogFile"></a>
# **addPerpetualInventoryLogFile**
> addPerpetualInventoryLogFile(perpetualInventoryLogId, fileName)

Attach a file to a perpetualInventoryLog

Adds a file to an existing perpetualInventoryLog.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PerpetualInventoryLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PerpetualInventoryLogApi apiInstance = new PerpetualInventoryLogApi();
Integer perpetualInventoryLogId = 56; // Integer | Id of the perpetualInventoryLog to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addPerpetualInventoryLogFile(perpetualInventoryLogId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling PerpetualInventoryLogApi#addPerpetualInventoryLogFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perpetualInventoryLogId** | **Integer**| Id of the perpetualInventoryLog to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addPerpetualInventoryLogFileByURL"></a>
# **addPerpetualInventoryLogFileByURL**
> addPerpetualInventoryLogFileByURL(body, perpetualInventoryLogId)

Attach a file to a perpetualInventoryLog by URL.

Adds a file to an existing perpetualInventoryLog by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PerpetualInventoryLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PerpetualInventoryLogApi apiInstance = new PerpetualInventoryLogApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer perpetualInventoryLogId = 56; // Integer | Id of the perpetualInventoryLog to add an file to
try {
    apiInstance.addPerpetualInventoryLogFileByURL(body, perpetualInventoryLogId);
} catch (ApiException e) {
    System.err.println("Exception when calling PerpetualInventoryLogApi#addPerpetualInventoryLogFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **perpetualInventoryLogId** | **Integer**| Id of the perpetualInventoryLog to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPerpetualInventoryLogTag"></a>
# **addPerpetualInventoryLogTag**
> addPerpetualInventoryLogTag(perpetualInventoryLogId, perpetualInventoryLogTag)

Add new tags for a perpetualInventoryLog.

Adds a tag to an existing perpetualInventoryLog.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PerpetualInventoryLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PerpetualInventoryLogApi apiInstance = new PerpetualInventoryLogApi();
Integer perpetualInventoryLogId = 56; // Integer | Id of the perpetualInventoryLog to add a tag to
String perpetualInventoryLogTag = "perpetualInventoryLogTag_example"; // String | The tag to add
try {
    apiInstance.addPerpetualInventoryLogTag(perpetualInventoryLogId, perpetualInventoryLogTag);
} catch (ApiException e) {
    System.err.println("Exception when calling PerpetualInventoryLogApi#addPerpetualInventoryLogTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perpetualInventoryLogId** | **Integer**| Id of the perpetualInventoryLog to add a tag to |
 **perpetualInventoryLogTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePerpetualInventoryLogFile"></a>
# **deletePerpetualInventoryLogFile**
> deletePerpetualInventoryLogFile(perpetualInventoryLogId, fileId)

Delete a file for a perpetualInventoryLog.

Deletes an existing perpetualInventoryLog file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PerpetualInventoryLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PerpetualInventoryLogApi apiInstance = new PerpetualInventoryLogApi();
Integer perpetualInventoryLogId = 56; // Integer | Id of the perpetualInventoryLog to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deletePerpetualInventoryLogFile(perpetualInventoryLogId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling PerpetualInventoryLogApi#deletePerpetualInventoryLogFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perpetualInventoryLogId** | **Integer**| Id of the perpetualInventoryLog to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePerpetualInventoryLogTag"></a>
# **deletePerpetualInventoryLogTag**
> deletePerpetualInventoryLogTag(perpetualInventoryLogId, perpetualInventoryLogTag)

Delete a tag for a perpetualInventoryLog.

Deletes an existing perpetualInventoryLog tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PerpetualInventoryLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PerpetualInventoryLogApi apiInstance = new PerpetualInventoryLogApi();
Integer perpetualInventoryLogId = 56; // Integer | Id of the perpetualInventoryLog to remove tag from
String perpetualInventoryLogTag = "perpetualInventoryLogTag_example"; // String | The tag to delete
try {
    apiInstance.deletePerpetualInventoryLogTag(perpetualInventoryLogId, perpetualInventoryLogTag);
} catch (ApiException e) {
    System.err.println("Exception when calling PerpetualInventoryLogApi#deletePerpetualInventoryLogTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perpetualInventoryLogId** | **Integer**| Id of the perpetualInventoryLog to remove tag from |
 **perpetualInventoryLogTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicatePerpetualInventoryLogById"></a>
# **getDuplicatePerpetualInventoryLogById**
> PerpetualInventoryLog getDuplicatePerpetualInventoryLogById(perpetualInventoryLogId)

Get a duplicated a perpetualInventoryLog by id

Returns a duplicated perpetualInventoryLog identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PerpetualInventoryLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PerpetualInventoryLogApi apiInstance = new PerpetualInventoryLogApi();
Integer perpetualInventoryLogId = 56; // Integer | Id of the perpetualInventoryLog to be duplicated.
try {
    PerpetualInventoryLog result = apiInstance.getDuplicatePerpetualInventoryLogById(perpetualInventoryLogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerpetualInventoryLogApi#getDuplicatePerpetualInventoryLogById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perpetualInventoryLogId** | **Integer**| Id of the perpetualInventoryLog to be duplicated. |

### Return type

[**PerpetualInventoryLog**](PerpetualInventoryLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPerpetualInventoryLogByFilter"></a>
# **getPerpetualInventoryLogByFilter**
> List&lt;PerpetualInventoryLog&gt; getPerpetualInventoryLogByFilter(filter, page, limit, sort)

Search perpetualInventoryLogs by filter

Returns the list of perpetualInventoryLogs that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PerpetualInventoryLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PerpetualInventoryLogApi apiInstance = new PerpetualInventoryLogApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<PerpetualInventoryLog> result = apiInstance.getPerpetualInventoryLogByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerpetualInventoryLogApi#getPerpetualInventoryLogByFilter");
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

[**List&lt;PerpetualInventoryLog&gt;**](PerpetualInventoryLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPerpetualInventoryLogById"></a>
# **getPerpetualInventoryLogById**
> PerpetualInventoryLog getPerpetualInventoryLogById(perpetualInventoryLogId)

Get a perpetualInventoryLog by id

Returns the perpetualInventoryLog identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PerpetualInventoryLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PerpetualInventoryLogApi apiInstance = new PerpetualInventoryLogApi();
Integer perpetualInventoryLogId = 56; // Integer | Id of the perpetualInventoryLog to be returned.
try {
    PerpetualInventoryLog result = apiInstance.getPerpetualInventoryLogById(perpetualInventoryLogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerpetualInventoryLogApi#getPerpetualInventoryLogById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perpetualInventoryLogId** | **Integer**| Id of the perpetualInventoryLog to be returned. |

### Return type

[**PerpetualInventoryLog**](PerpetualInventoryLog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPerpetualInventoryLogFiles"></a>
# **getPerpetualInventoryLogFiles**
> getPerpetualInventoryLogFiles(perpetualInventoryLogId)

Get the files for a perpetualInventoryLog.

Get all existing perpetualInventoryLog files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PerpetualInventoryLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PerpetualInventoryLogApi apiInstance = new PerpetualInventoryLogApi();
Integer perpetualInventoryLogId = 56; // Integer | Id of the perpetualInventoryLog to get files for
try {
    apiInstance.getPerpetualInventoryLogFiles(perpetualInventoryLogId);
} catch (ApiException e) {
    System.err.println("Exception when calling PerpetualInventoryLogApi#getPerpetualInventoryLogFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perpetualInventoryLogId** | **Integer**| Id of the perpetualInventoryLog to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPerpetualInventoryLogTags"></a>
# **getPerpetualInventoryLogTags**
> getPerpetualInventoryLogTags(perpetualInventoryLogId)

Get the tags for a perpetualInventoryLog.

Get all existing perpetualInventoryLog tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PerpetualInventoryLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PerpetualInventoryLogApi apiInstance = new PerpetualInventoryLogApi();
Integer perpetualInventoryLogId = 56; // Integer | Id of the perpetualInventoryLog to get tags for
try {
    apiInstance.getPerpetualInventoryLogTags(perpetualInventoryLogId);
} catch (ApiException e) {
    System.err.println("Exception when calling PerpetualInventoryLogApi#getPerpetualInventoryLogTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perpetualInventoryLogId** | **Integer**| Id of the perpetualInventoryLog to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

