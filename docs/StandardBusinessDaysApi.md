# StandardBusinessDaysApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStandardBusinessDays**](StandardBusinessDaysApi.md#addStandardBusinessDays) | **POST** /v3.0/standardBusinessDays | Create a standardBusinessDays
[**addStandardBusinessDaysAudit**](StandardBusinessDaysApi.md#addStandardBusinessDaysAudit) | **PUT** /v3.0/standardBusinessDays/{standardBusinessDaysId}/audit/{standardBusinessDaysAudit} | Add new audit for a standardBusinessDays
[**addStandardBusinessDaysFile**](StandardBusinessDaysApi.md#addStandardBusinessDaysFile) | **POST** /v3.0/standardBusinessDays/{standardBusinessDaysId}/file/{fileName} | Attach a file to a standardBusinessDays
[**addStandardBusinessDaysFileByURL**](StandardBusinessDaysApi.md#addStandardBusinessDaysFileByURL) | **POST** /v3.0/standardBusinessDays/{standardBusinessDaysId}/file | Attach a file to a standardBusinessDays by URL.
[**addStandardBusinessDaysTag**](StandardBusinessDaysApi.md#addStandardBusinessDaysTag) | **PUT** /v3.0/standardBusinessDays/{standardBusinessDaysId}/tag/{standardBusinessDaysTag} | Add new tags for a standardBusinessDays.
[**deleteStandardBusinessDays**](StandardBusinessDaysApi.md#deleteStandardBusinessDays) | **DELETE** /v3.0/standardBusinessDays/{standardBusinessDaysId} | Delete a standardBusinessDays
[**deleteStandardBusinessDaysFile**](StandardBusinessDaysApi.md#deleteStandardBusinessDaysFile) | **DELETE** /v3.0/standardBusinessDays/{standardBusinessDaysId}/file/{fileId} | Delete a file for a standardBusinessDays.
[**deleteStandardBusinessDaysTag**](StandardBusinessDaysApi.md#deleteStandardBusinessDaysTag) | **DELETE** /v3.0/standardBusinessDays/{standardBusinessDaysId}/tag/{standardBusinessDaysTag} | Delete a tag for a standardBusinessDays.
[**getDuplicateStandardBusinessDaysById**](StandardBusinessDaysApi.md#getDuplicateStandardBusinessDaysById) | **GET** /v3.0/standardBusinessDays/duplicate/{standardBusinessDaysId} | Get a duplicated a standardBusinessDays by id
[**getStandardBusinessDaysByFilter**](StandardBusinessDaysApi.md#getStandardBusinessDaysByFilter) | **GET** /v3.0/standardBusinessDays/search | Search standardBusinessDayses by filter
[**getStandardBusinessDaysById**](StandardBusinessDaysApi.md#getStandardBusinessDaysById) | **GET** /v3.0/standardBusinessDays/{standardBusinessDaysId} | Get a standardBusinessDays by id
[**getStandardBusinessDaysFiles**](StandardBusinessDaysApi.md#getStandardBusinessDaysFiles) | **GET** /v3.0/standardBusinessDays/{standardBusinessDaysId}/file | Get the files for a standardBusinessDays.
[**getStandardBusinessDaysTags**](StandardBusinessDaysApi.md#getStandardBusinessDaysTags) | **GET** /v3.0/standardBusinessDays/{standardBusinessDaysId}/tag | Get the tags for a standardBusinessDays.
[**updateStandardBusinessDays**](StandardBusinessDaysApi.md#updateStandardBusinessDays) | **PUT** /v3.0/standardBusinessDays | Update a standardBusinessDays


<a name="addStandardBusinessDays"></a>
# **addStandardBusinessDays**
> StandardBusinessDays addStandardBusinessDays(body)

Create a standardBusinessDays

Inserts a new standardBusinessDays using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.StandardBusinessDaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StandardBusinessDaysApi apiInstance = new StandardBusinessDaysApi();
StandardBusinessDays body = new StandardBusinessDays(); // StandardBusinessDays | StandardBusinessDays to be inserted.
try {
    StandardBusinessDays result = apiInstance.addStandardBusinessDays(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardBusinessDaysApi#addStandardBusinessDays");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StandardBusinessDays**](StandardBusinessDays.md)| StandardBusinessDays to be inserted. |

### Return type

[**StandardBusinessDays**](StandardBusinessDays.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addStandardBusinessDaysAudit"></a>
# **addStandardBusinessDaysAudit**
> addStandardBusinessDaysAudit(standardBusinessDaysId, standardBusinessDaysAudit)

Add new audit for a standardBusinessDays

Adds an audit to an existing standardBusinessDays.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.StandardBusinessDaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StandardBusinessDaysApi apiInstance = new StandardBusinessDaysApi();
Integer standardBusinessDaysId = 56; // Integer | Id of the standardBusinessDays to add an audit to
String standardBusinessDaysAudit = "standardBusinessDaysAudit_example"; // String | The audit to add
try {
    apiInstance.addStandardBusinessDaysAudit(standardBusinessDaysId, standardBusinessDaysAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardBusinessDaysApi#addStandardBusinessDaysAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **standardBusinessDaysId** | **Integer**| Id of the standardBusinessDays to add an audit to |
 **standardBusinessDaysAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addStandardBusinessDaysFile"></a>
# **addStandardBusinessDaysFile**
> addStandardBusinessDaysFile(standardBusinessDaysId, fileName)

Attach a file to a standardBusinessDays

Adds a file to an existing standardBusinessDays.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.StandardBusinessDaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StandardBusinessDaysApi apiInstance = new StandardBusinessDaysApi();
Integer standardBusinessDaysId = 56; // Integer | Id of the standardBusinessDays to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addStandardBusinessDaysFile(standardBusinessDaysId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardBusinessDaysApi#addStandardBusinessDaysFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **standardBusinessDaysId** | **Integer**| Id of the standardBusinessDays to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addStandardBusinessDaysFileByURL"></a>
# **addStandardBusinessDaysFileByURL**
> addStandardBusinessDaysFileByURL(body, standardBusinessDaysId)

Attach a file to a standardBusinessDays by URL.

Adds a file to an existing standardBusinessDays by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.StandardBusinessDaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StandardBusinessDaysApi apiInstance = new StandardBusinessDaysApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer standardBusinessDaysId = 56; // Integer | Id of the standardBusinessDays to add an file to
try {
    apiInstance.addStandardBusinessDaysFileByURL(body, standardBusinessDaysId);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardBusinessDaysApi#addStandardBusinessDaysFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **standardBusinessDaysId** | **Integer**| Id of the standardBusinessDays to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addStandardBusinessDaysTag"></a>
# **addStandardBusinessDaysTag**
> addStandardBusinessDaysTag(standardBusinessDaysId, standardBusinessDaysTag)

Add new tags for a standardBusinessDays.

Adds a tag to an existing standardBusinessDays.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.StandardBusinessDaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StandardBusinessDaysApi apiInstance = new StandardBusinessDaysApi();
Integer standardBusinessDaysId = 56; // Integer | Id of the standardBusinessDays to add a tag to
String standardBusinessDaysTag = "standardBusinessDaysTag_example"; // String | The tag to add
try {
    apiInstance.addStandardBusinessDaysTag(standardBusinessDaysId, standardBusinessDaysTag);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardBusinessDaysApi#addStandardBusinessDaysTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **standardBusinessDaysId** | **Integer**| Id of the standardBusinessDays to add a tag to |
 **standardBusinessDaysTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteStandardBusinessDays"></a>
# **deleteStandardBusinessDays**
> deleteStandardBusinessDays(standardBusinessDaysId)

Delete a standardBusinessDays

Deletes the standardBusinessDays identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.StandardBusinessDaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StandardBusinessDaysApi apiInstance = new StandardBusinessDaysApi();
Integer standardBusinessDaysId = 56; // Integer | Id of the standardBusinessDays to be deleted.
try {
    apiInstance.deleteStandardBusinessDays(standardBusinessDaysId);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardBusinessDaysApi#deleteStandardBusinessDays");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **standardBusinessDaysId** | **Integer**| Id of the standardBusinessDays to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteStandardBusinessDaysFile"></a>
# **deleteStandardBusinessDaysFile**
> deleteStandardBusinessDaysFile(standardBusinessDaysId, fileId)

Delete a file for a standardBusinessDays.

Deletes an existing standardBusinessDays file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.StandardBusinessDaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StandardBusinessDaysApi apiInstance = new StandardBusinessDaysApi();
Integer standardBusinessDaysId = 56; // Integer | Id of the standardBusinessDays to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteStandardBusinessDaysFile(standardBusinessDaysId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardBusinessDaysApi#deleteStandardBusinessDaysFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **standardBusinessDaysId** | **Integer**| Id of the standardBusinessDays to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteStandardBusinessDaysTag"></a>
# **deleteStandardBusinessDaysTag**
> deleteStandardBusinessDaysTag(standardBusinessDaysId, standardBusinessDaysTag)

Delete a tag for a standardBusinessDays.

Deletes an existing standardBusinessDays tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.StandardBusinessDaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StandardBusinessDaysApi apiInstance = new StandardBusinessDaysApi();
Integer standardBusinessDaysId = 56; // Integer | Id of the standardBusinessDays to remove tag from
String standardBusinessDaysTag = "standardBusinessDaysTag_example"; // String | The tag to delete
try {
    apiInstance.deleteStandardBusinessDaysTag(standardBusinessDaysId, standardBusinessDaysTag);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardBusinessDaysApi#deleteStandardBusinessDaysTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **standardBusinessDaysId** | **Integer**| Id of the standardBusinessDays to remove tag from |
 **standardBusinessDaysTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateStandardBusinessDaysById"></a>
# **getDuplicateStandardBusinessDaysById**
> StandardBusinessDays getDuplicateStandardBusinessDaysById(standardBusinessDaysId)

Get a duplicated a standardBusinessDays by id

Returns a duplicated standardBusinessDays identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.StandardBusinessDaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StandardBusinessDaysApi apiInstance = new StandardBusinessDaysApi();
Integer standardBusinessDaysId = 56; // Integer | Id of the standardBusinessDays to be duplicated.
try {
    StandardBusinessDays result = apiInstance.getDuplicateStandardBusinessDaysById(standardBusinessDaysId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardBusinessDaysApi#getDuplicateStandardBusinessDaysById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **standardBusinessDaysId** | **Integer**| Id of the standardBusinessDays to be duplicated. |

### Return type

[**StandardBusinessDays**](StandardBusinessDays.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStandardBusinessDaysByFilter"></a>
# **getStandardBusinessDaysByFilter**
> List&lt;StandardBusinessDays&gt; getStandardBusinessDaysByFilter(filter, page, limit, sort)

Search standardBusinessDayses by filter

Returns the list of standardBusinessDayses that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.StandardBusinessDaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StandardBusinessDaysApi apiInstance = new StandardBusinessDaysApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<StandardBusinessDays> result = apiInstance.getStandardBusinessDaysByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardBusinessDaysApi#getStandardBusinessDaysByFilter");
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

[**List&lt;StandardBusinessDays&gt;**](StandardBusinessDays.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStandardBusinessDaysById"></a>
# **getStandardBusinessDaysById**
> StandardBusinessDays getStandardBusinessDaysById(standardBusinessDaysId)

Get a standardBusinessDays by id

Returns the standardBusinessDays identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.StandardBusinessDaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StandardBusinessDaysApi apiInstance = new StandardBusinessDaysApi();
Integer standardBusinessDaysId = 56; // Integer | Id of the standardBusinessDays to be returned.
try {
    StandardBusinessDays result = apiInstance.getStandardBusinessDaysById(standardBusinessDaysId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardBusinessDaysApi#getStandardBusinessDaysById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **standardBusinessDaysId** | **Integer**| Id of the standardBusinessDays to be returned. |

### Return type

[**StandardBusinessDays**](StandardBusinessDays.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStandardBusinessDaysFiles"></a>
# **getStandardBusinessDaysFiles**
> getStandardBusinessDaysFiles(standardBusinessDaysId)

Get the files for a standardBusinessDays.

Get all existing standardBusinessDays files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.StandardBusinessDaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StandardBusinessDaysApi apiInstance = new StandardBusinessDaysApi();
Integer standardBusinessDaysId = 56; // Integer | Id of the standardBusinessDays to get files for
try {
    apiInstance.getStandardBusinessDaysFiles(standardBusinessDaysId);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardBusinessDaysApi#getStandardBusinessDaysFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **standardBusinessDaysId** | **Integer**| Id of the standardBusinessDays to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStandardBusinessDaysTags"></a>
# **getStandardBusinessDaysTags**
> getStandardBusinessDaysTags(standardBusinessDaysId)

Get the tags for a standardBusinessDays.

Get all existing standardBusinessDays tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.StandardBusinessDaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StandardBusinessDaysApi apiInstance = new StandardBusinessDaysApi();
Integer standardBusinessDaysId = 56; // Integer | Id of the standardBusinessDays to get tags for
try {
    apiInstance.getStandardBusinessDaysTags(standardBusinessDaysId);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardBusinessDaysApi#getStandardBusinessDaysTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **standardBusinessDaysId** | **Integer**| Id of the standardBusinessDays to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStandardBusinessDays"></a>
# **updateStandardBusinessDays**
> updateStandardBusinessDays(body)

Update a standardBusinessDays

Updates an existing standardBusinessDays using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.StandardBusinessDaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StandardBusinessDaysApi apiInstance = new StandardBusinessDaysApi();
StandardBusinessDays body = new StandardBusinessDays(); // StandardBusinessDays | StandardBusinessDays to be updated.
try {
    apiInstance.updateStandardBusinessDays(body);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardBusinessDaysApi#updateStandardBusinessDays");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StandardBusinessDays**](StandardBusinessDays.md)| StandardBusinessDays to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

