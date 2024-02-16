# LoggedTimeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLoggedTimeAudit**](LoggedTimeApi.md#addLoggedTimeAudit) | **PUT** /beta/loggedTime/{loggedTimeId}/audit/{loggedTimeAudit} | Add new audit for a loggedTime
[**addLoggedTimeFile**](LoggedTimeApi.md#addLoggedTimeFile) | **POST** /beta/loggedTime/{loggedTimeId}/file/{fileName} | Attach a file to a loggedTime
[**addLoggedTimeFileByURL**](LoggedTimeApi.md#addLoggedTimeFileByURL) | **POST** /beta/loggedTime/{loggedTimeId}/file | Attach a file to a loggedTime by URL.
[**addLoggedTimeTag**](LoggedTimeApi.md#addLoggedTimeTag) | **PUT** /beta/loggedTime/{loggedTimeId}/tag/{loggedTimeTag} | Add new tags for a loggedTime.
[**deleteLoggedTimeFile**](LoggedTimeApi.md#deleteLoggedTimeFile) | **DELETE** /beta/loggedTime/{loggedTimeId}/file/{fileId} | Delete a file for a loggedTime.
[**deleteLoggedTimeTag**](LoggedTimeApi.md#deleteLoggedTimeTag) | **DELETE** /beta/loggedTime/{loggedTimeId}/tag/{loggedTimeTag} | Delete a tag for a loggedTime.
[**getDuplicateLoggedTimeById**](LoggedTimeApi.md#getDuplicateLoggedTimeById) | **GET** /beta/loggedTime/duplicate/{loggedTimeId} | Get a duplicated a loggedTime by id
[**getLoggedTimeByFilter**](LoggedTimeApi.md#getLoggedTimeByFilter) | **GET** /beta/loggedTime/search | Search loggedTimes by filter
[**getLoggedTimeById**](LoggedTimeApi.md#getLoggedTimeById) | **GET** /beta/loggedTime/{loggedTimeId} | Get a loggedTime by id
[**getLoggedTimeFiles**](LoggedTimeApi.md#getLoggedTimeFiles) | **GET** /beta/loggedTime/{loggedTimeId}/file | Get the files for a loggedTime.
[**getLoggedTimeTags**](LoggedTimeApi.md#getLoggedTimeTags) | **GET** /beta/loggedTime/{loggedTimeId}/tag | Get the tags for a loggedTime.
[**updateLoggedTimeCustomFields**](LoggedTimeApi.md#updateLoggedTimeCustomFields) | **PUT** /beta/loggedTime/customFields | Update a loggedTime custom fields


<a name="addLoggedTimeAudit"></a>
# **addLoggedTimeAudit**
> addLoggedTimeAudit(loggedTimeId, loggedTimeAudit)

Add new audit for a loggedTime

Adds an audit to an existing loggedTime.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoggedTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoggedTimeApi apiInstance = new LoggedTimeApi();
Integer loggedTimeId = 56; // Integer | Id of the loggedTime to add an audit to
String loggedTimeAudit = "loggedTimeAudit_example"; // String | The audit to add
try {
    apiInstance.addLoggedTimeAudit(loggedTimeId, loggedTimeAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggedTimeApi#addLoggedTimeAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loggedTimeId** | **Integer**| Id of the loggedTime to add an audit to |
 **loggedTimeAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLoggedTimeFile"></a>
# **addLoggedTimeFile**
> addLoggedTimeFile(loggedTimeId, fileName)

Attach a file to a loggedTime

Adds a file to an existing loggedTime.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoggedTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoggedTimeApi apiInstance = new LoggedTimeApi();
Integer loggedTimeId = 56; // Integer | Id of the loggedTime to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addLoggedTimeFile(loggedTimeId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggedTimeApi#addLoggedTimeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loggedTimeId** | **Integer**| Id of the loggedTime to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addLoggedTimeFileByURL"></a>
# **addLoggedTimeFileByURL**
> addLoggedTimeFileByURL(body, loggedTimeId)

Attach a file to a loggedTime by URL.

Adds a file to an existing loggedTime by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoggedTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoggedTimeApi apiInstance = new LoggedTimeApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer loggedTimeId = 56; // Integer | Id of the loggedTime to add an file to
try {
    apiInstance.addLoggedTimeFileByURL(body, loggedTimeId);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggedTimeApi#addLoggedTimeFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **loggedTimeId** | **Integer**| Id of the loggedTime to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLoggedTimeTag"></a>
# **addLoggedTimeTag**
> addLoggedTimeTag(loggedTimeId, loggedTimeTag)

Add new tags for a loggedTime.

Adds a tag to an existing loggedTime.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoggedTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoggedTimeApi apiInstance = new LoggedTimeApi();
Integer loggedTimeId = 56; // Integer | Id of the loggedTime to add a tag to
String loggedTimeTag = "loggedTimeTag_example"; // String | The tag to add
try {
    apiInstance.addLoggedTimeTag(loggedTimeId, loggedTimeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggedTimeApi#addLoggedTimeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loggedTimeId** | **Integer**| Id of the loggedTime to add a tag to |
 **loggedTimeTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLoggedTimeFile"></a>
# **deleteLoggedTimeFile**
> deleteLoggedTimeFile(loggedTimeId, fileId)

Delete a file for a loggedTime.

Deletes an existing loggedTime file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoggedTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoggedTimeApi apiInstance = new LoggedTimeApi();
Integer loggedTimeId = 56; // Integer | Id of the loggedTime to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteLoggedTimeFile(loggedTimeId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggedTimeApi#deleteLoggedTimeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loggedTimeId** | **Integer**| Id of the loggedTime to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLoggedTimeTag"></a>
# **deleteLoggedTimeTag**
> deleteLoggedTimeTag(loggedTimeId, loggedTimeTag)

Delete a tag for a loggedTime.

Deletes an existing loggedTime tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoggedTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoggedTimeApi apiInstance = new LoggedTimeApi();
Integer loggedTimeId = 56; // Integer | Id of the loggedTime to remove tag from
String loggedTimeTag = "loggedTimeTag_example"; // String | The tag to delete
try {
    apiInstance.deleteLoggedTimeTag(loggedTimeId, loggedTimeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggedTimeApi#deleteLoggedTimeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loggedTimeId** | **Integer**| Id of the loggedTime to remove tag from |
 **loggedTimeTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateLoggedTimeById"></a>
# **getDuplicateLoggedTimeById**
> LoggedTime getDuplicateLoggedTimeById(loggedTimeId)

Get a duplicated a loggedTime by id

Returns a duplicated loggedTime identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoggedTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoggedTimeApi apiInstance = new LoggedTimeApi();
Integer loggedTimeId = 56; // Integer | Id of the loggedTime to be duplicated.
try {
    LoggedTime result = apiInstance.getDuplicateLoggedTimeById(loggedTimeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggedTimeApi#getDuplicateLoggedTimeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loggedTimeId** | **Integer**| Id of the loggedTime to be duplicated. |

### Return type

[**LoggedTime**](LoggedTime.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoggedTimeByFilter"></a>
# **getLoggedTimeByFilter**
> List&lt;LoggedTime&gt; getLoggedTimeByFilter(filter, page, limit, sort)

Search loggedTimes by filter

Returns the list of loggedTimes that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoggedTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoggedTimeApi apiInstance = new LoggedTimeApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<LoggedTime> result = apiInstance.getLoggedTimeByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggedTimeApi#getLoggedTimeByFilter");
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

[**List&lt;LoggedTime&gt;**](LoggedTime.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoggedTimeById"></a>
# **getLoggedTimeById**
> LoggedTime getLoggedTimeById(loggedTimeId)

Get a loggedTime by id

Returns the loggedTime identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoggedTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoggedTimeApi apiInstance = new LoggedTimeApi();
Integer loggedTimeId = 56; // Integer | Id of the loggedTime to be returned.
try {
    LoggedTime result = apiInstance.getLoggedTimeById(loggedTimeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggedTimeApi#getLoggedTimeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loggedTimeId** | **Integer**| Id of the loggedTime to be returned. |

### Return type

[**LoggedTime**](LoggedTime.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoggedTimeFiles"></a>
# **getLoggedTimeFiles**
> getLoggedTimeFiles(loggedTimeId)

Get the files for a loggedTime.

Get all existing loggedTime files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoggedTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoggedTimeApi apiInstance = new LoggedTimeApi();
Integer loggedTimeId = 56; // Integer | Id of the loggedTime to get files for
try {
    apiInstance.getLoggedTimeFiles(loggedTimeId);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggedTimeApi#getLoggedTimeFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loggedTimeId** | **Integer**| Id of the loggedTime to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoggedTimeTags"></a>
# **getLoggedTimeTags**
> getLoggedTimeTags(loggedTimeId)

Get the tags for a loggedTime.

Get all existing loggedTime tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoggedTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoggedTimeApi apiInstance = new LoggedTimeApi();
Integer loggedTimeId = 56; // Integer | Id of the loggedTime to get tags for
try {
    apiInstance.getLoggedTimeTags(loggedTimeId);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggedTimeApi#getLoggedTimeTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loggedTimeId** | **Integer**| Id of the loggedTime to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLoggedTimeCustomFields"></a>
# **updateLoggedTimeCustomFields**
> updateLoggedTimeCustomFields(body)

Update a loggedTime custom fields

Updates an existing loggedTime custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoggedTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoggedTimeApi apiInstance = new LoggedTimeApi();
LoggedTime body = new LoggedTime(); // LoggedTime | LoggedTime to be updated.
try {
    apiInstance.updateLoggedTimeCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggedTimeApi#updateLoggedTimeCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoggedTime**](LoggedTime.md)| LoggedTime to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

