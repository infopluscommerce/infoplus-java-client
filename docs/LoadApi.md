# LoadApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLoadAudit**](LoadApi.md#addLoadAudit) | **PUT** /v3.0/load/{loadId}/audit/{loadAudit} | Add new audit for a load
[**addLoadFile**](LoadApi.md#addLoadFile) | **POST** /v3.0/load/{loadId}/file/{fileName} | Attach a file to a load
[**addLoadFileByURL**](LoadApi.md#addLoadFileByURL) | **POST** /v3.0/load/{loadId}/file | Attach a file to a load by URL.
[**addLoadTag**](LoadApi.md#addLoadTag) | **PUT** /v3.0/load/{loadId}/tag/{loadTag} | Add new tags for a load.
[**deleteLoadFile**](LoadApi.md#deleteLoadFile) | **DELETE** /v3.0/load/{loadId}/file/{fileId} | Delete a file for a load.
[**deleteLoadTag**](LoadApi.md#deleteLoadTag) | **DELETE** /v3.0/load/{loadId}/tag/{loadTag} | Delete a tag for a load.
[**getDuplicateLoadById**](LoadApi.md#getDuplicateLoadById) | **GET** /v3.0/load/duplicate/{loadId} | Get a duplicated a load by id
[**getLoadByFilter**](LoadApi.md#getLoadByFilter) | **GET** /v3.0/load/search | Search loads by filter
[**getLoadById**](LoadApi.md#getLoadById) | **GET** /v3.0/load/{loadId} | Get a load by id
[**getLoadFiles**](LoadApi.md#getLoadFiles) | **GET** /v3.0/load/{loadId}/file | Get the files for a load.
[**getLoadTags**](LoadApi.md#getLoadTags) | **GET** /v3.0/load/{loadId}/tag | Get the tags for a load.
[**updateLoadCustomFields**](LoadApi.md#updateLoadCustomFields) | **PUT** /v3.0/load/customFields | Update a load custom fields


<a name="addLoadAudit"></a>
# **addLoadAudit**
> addLoadAudit(loadId, loadAudit)

Add new audit for a load

Adds an audit to an existing load.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadApi apiInstance = new LoadApi();
Integer loadId = 56; // Integer | Id of the load to add an audit to
String loadAudit = "loadAudit_example"; // String | The audit to add
try {
    apiInstance.addLoadAudit(loadId, loadAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadApi#addLoadAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadId** | **Integer**| Id of the load to add an audit to |
 **loadAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLoadFile"></a>
# **addLoadFile**
> addLoadFile(loadId, fileName)

Attach a file to a load

Adds a file to an existing load.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadApi apiInstance = new LoadApi();
Integer loadId = 56; // Integer | Id of the load to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addLoadFile(loadId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadApi#addLoadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadId** | **Integer**| Id of the load to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addLoadFileByURL"></a>
# **addLoadFileByURL**
> addLoadFileByURL(body, loadId)

Attach a file to a load by URL.

Adds a file to an existing load by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadApi apiInstance = new LoadApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer loadId = 56; // Integer | Id of the load to add an file to
try {
    apiInstance.addLoadFileByURL(body, loadId);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadApi#addLoadFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **loadId** | **Integer**| Id of the load to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLoadTag"></a>
# **addLoadTag**
> addLoadTag(loadId, loadTag)

Add new tags for a load.

Adds a tag to an existing load.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadApi apiInstance = new LoadApi();
Integer loadId = 56; // Integer | Id of the load to add a tag to
String loadTag = "loadTag_example"; // String | The tag to add
try {
    apiInstance.addLoadTag(loadId, loadTag);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadApi#addLoadTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadId** | **Integer**| Id of the load to add a tag to |
 **loadTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLoadFile"></a>
# **deleteLoadFile**
> deleteLoadFile(loadId, fileId)

Delete a file for a load.

Deletes an existing load file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadApi apiInstance = new LoadApi();
Integer loadId = 56; // Integer | Id of the load to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteLoadFile(loadId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadApi#deleteLoadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadId** | **Integer**| Id of the load to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLoadTag"></a>
# **deleteLoadTag**
> deleteLoadTag(loadId, loadTag)

Delete a tag for a load.

Deletes an existing load tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadApi apiInstance = new LoadApi();
Integer loadId = 56; // Integer | Id of the load to remove tag from
String loadTag = "loadTag_example"; // String | The tag to delete
try {
    apiInstance.deleteLoadTag(loadId, loadTag);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadApi#deleteLoadTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadId** | **Integer**| Id of the load to remove tag from |
 **loadTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateLoadById"></a>
# **getDuplicateLoadById**
> Load getDuplicateLoadById(loadId)

Get a duplicated a load by id

Returns a duplicated load identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadApi apiInstance = new LoadApi();
Integer loadId = 56; // Integer | Id of the load to be duplicated.
try {
    Load result = apiInstance.getDuplicateLoadById(loadId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadApi#getDuplicateLoadById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadId** | **Integer**| Id of the load to be duplicated. |

### Return type

[**Load**](Load.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoadByFilter"></a>
# **getLoadByFilter**
> List&lt;Load&gt; getLoadByFilter(filter, page, limit, sort)

Search loads by filter

Returns the list of loads that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadApi apiInstance = new LoadApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Load> result = apiInstance.getLoadByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadApi#getLoadByFilter");
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

[**List&lt;Load&gt;**](Load.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoadById"></a>
# **getLoadById**
> Load getLoadById(loadId)

Get a load by id

Returns the load identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadApi apiInstance = new LoadApi();
Integer loadId = 56; // Integer | Id of the load to be returned.
try {
    Load result = apiInstance.getLoadById(loadId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadApi#getLoadById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadId** | **Integer**| Id of the load to be returned. |

### Return type

[**Load**](Load.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoadFiles"></a>
# **getLoadFiles**
> getLoadFiles(loadId)

Get the files for a load.

Get all existing load files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadApi apiInstance = new LoadApi();
Integer loadId = 56; // Integer | Id of the load to get files for
try {
    apiInstance.getLoadFiles(loadId);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadApi#getLoadFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadId** | **Integer**| Id of the load to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoadTags"></a>
# **getLoadTags**
> getLoadTags(loadId)

Get the tags for a load.

Get all existing load tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadApi apiInstance = new LoadApi();
Integer loadId = 56; // Integer | Id of the load to get tags for
try {
    apiInstance.getLoadTags(loadId);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadApi#getLoadTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadId** | **Integer**| Id of the load to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLoadCustomFields"></a>
# **updateLoadCustomFields**
> updateLoadCustomFields(body)

Update a load custom fields

Updates an existing load custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadApi apiInstance = new LoadApi();
Load body = new Load(); // Load | Load to be updated.
try {
    apiInstance.updateLoadCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadApi#updateLoadCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Load**](Load.md)| Load to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

