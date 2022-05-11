# InventoryStorageActivityApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInventoryStorageActivity**](InventoryStorageActivityApi.md#addInventoryStorageActivity) | **POST** /v3.0/inventoryStorageActivity | Create an inventoryStorageActivity
[**addInventoryStorageActivityAudit**](InventoryStorageActivityApi.md#addInventoryStorageActivityAudit) | **PUT** /v3.0/inventoryStorageActivity/{inventoryStorageActivityId}/audit/{inventoryStorageActivityAudit} | Add new audit for an inventoryStorageActivity
[**addInventoryStorageActivityFile**](InventoryStorageActivityApi.md#addInventoryStorageActivityFile) | **POST** /v3.0/inventoryStorageActivity/{inventoryStorageActivityId}/file/{fileName} | Attach a file to an inventoryStorageActivity
[**addInventoryStorageActivityFileByURL**](InventoryStorageActivityApi.md#addInventoryStorageActivityFileByURL) | **POST** /v3.0/inventoryStorageActivity/{inventoryStorageActivityId}/file | Attach a file to an inventoryStorageActivity by URL.
[**addInventoryStorageActivityTag**](InventoryStorageActivityApi.md#addInventoryStorageActivityTag) | **PUT** /v3.0/inventoryStorageActivity/{inventoryStorageActivityId}/tag/{inventoryStorageActivityTag} | Add new tags for an inventoryStorageActivity.
[**deleteInventoryStorageActivity**](InventoryStorageActivityApi.md#deleteInventoryStorageActivity) | **DELETE** /v3.0/inventoryStorageActivity/{inventoryStorageActivityId} | Delete an inventoryStorageActivity
[**deleteInventoryStorageActivityFile**](InventoryStorageActivityApi.md#deleteInventoryStorageActivityFile) | **DELETE** /v3.0/inventoryStorageActivity/{inventoryStorageActivityId}/file/{fileId} | Delete a file for an inventoryStorageActivity.
[**deleteInventoryStorageActivityTag**](InventoryStorageActivityApi.md#deleteInventoryStorageActivityTag) | **DELETE** /v3.0/inventoryStorageActivity/{inventoryStorageActivityId}/tag/{inventoryStorageActivityTag} | Delete a tag for an inventoryStorageActivity.
[**getDuplicateInventoryStorageActivityById**](InventoryStorageActivityApi.md#getDuplicateInventoryStorageActivityById) | **GET** /v3.0/inventoryStorageActivity/duplicate/{inventoryStorageActivityId} | Get a duplicated an inventoryStorageActivity by id
[**getInventoryStorageActivityByFilter**](InventoryStorageActivityApi.md#getInventoryStorageActivityByFilter) | **GET** /v3.0/inventoryStorageActivity/search | Search inventoryStorageActivitys by filter
[**getInventoryStorageActivityById**](InventoryStorageActivityApi.md#getInventoryStorageActivityById) | **GET** /v3.0/inventoryStorageActivity/{inventoryStorageActivityId} | Get an inventoryStorageActivity by id
[**getInventoryStorageActivityFiles**](InventoryStorageActivityApi.md#getInventoryStorageActivityFiles) | **GET** /v3.0/inventoryStorageActivity/{inventoryStorageActivityId}/file | Get the files for an inventoryStorageActivity.
[**getInventoryStorageActivityTags**](InventoryStorageActivityApi.md#getInventoryStorageActivityTags) | **GET** /v3.0/inventoryStorageActivity/{inventoryStorageActivityId}/tag | Get the tags for an inventoryStorageActivity.
[**updateInventoryStorageActivity**](InventoryStorageActivityApi.md#updateInventoryStorageActivity) | **PUT** /v3.0/inventoryStorageActivity | Update an inventoryStorageActivity


<a name="addInventoryStorageActivity"></a>
# **addInventoryStorageActivity**
> InventoryStorageActivity addInventoryStorageActivity(body)

Create an inventoryStorageActivity

Inserts a new inventoryStorageActivity using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryStorageActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryStorageActivityApi apiInstance = new InventoryStorageActivityApi();
InventoryStorageActivity body = new InventoryStorageActivity(); // InventoryStorageActivity | InventoryStorageActivity to be inserted.
try {
    InventoryStorageActivity result = apiInstance.addInventoryStorageActivity(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryStorageActivityApi#addInventoryStorageActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InventoryStorageActivity**](InventoryStorageActivity.md)| InventoryStorageActivity to be inserted. |

### Return type

[**InventoryStorageActivity**](InventoryStorageActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addInventoryStorageActivityAudit"></a>
# **addInventoryStorageActivityAudit**
> addInventoryStorageActivityAudit(inventoryStorageActivityId, inventoryStorageActivityAudit)

Add new audit for an inventoryStorageActivity

Adds an audit to an existing inventoryStorageActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryStorageActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryStorageActivityApi apiInstance = new InventoryStorageActivityApi();
Integer inventoryStorageActivityId = 56; // Integer | Id of the inventoryStorageActivity to add an audit to
String inventoryStorageActivityAudit = "inventoryStorageActivityAudit_example"; // String | The audit to add
try {
    apiInstance.addInventoryStorageActivityAudit(inventoryStorageActivityId, inventoryStorageActivityAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryStorageActivityApi#addInventoryStorageActivityAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryStorageActivityId** | **Integer**| Id of the inventoryStorageActivity to add an audit to |
 **inventoryStorageActivityAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addInventoryStorageActivityFile"></a>
# **addInventoryStorageActivityFile**
> addInventoryStorageActivityFile(inventoryStorageActivityId, fileName)

Attach a file to an inventoryStorageActivity

Adds a file to an existing inventoryStorageActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryStorageActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryStorageActivityApi apiInstance = new InventoryStorageActivityApi();
Integer inventoryStorageActivityId = 56; // Integer | Id of the inventoryStorageActivity to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addInventoryStorageActivityFile(inventoryStorageActivityId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryStorageActivityApi#addInventoryStorageActivityFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryStorageActivityId** | **Integer**| Id of the inventoryStorageActivity to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addInventoryStorageActivityFileByURL"></a>
# **addInventoryStorageActivityFileByURL**
> addInventoryStorageActivityFileByURL(body, inventoryStorageActivityId)

Attach a file to an inventoryStorageActivity by URL.

Adds a file to an existing inventoryStorageActivity by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryStorageActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryStorageActivityApi apiInstance = new InventoryStorageActivityApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer inventoryStorageActivityId = 56; // Integer | Id of the inventoryStorageActivity to add an file to
try {
    apiInstance.addInventoryStorageActivityFileByURL(body, inventoryStorageActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryStorageActivityApi#addInventoryStorageActivityFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **inventoryStorageActivityId** | **Integer**| Id of the inventoryStorageActivity to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addInventoryStorageActivityTag"></a>
# **addInventoryStorageActivityTag**
> addInventoryStorageActivityTag(inventoryStorageActivityId, inventoryStorageActivityTag)

Add new tags for an inventoryStorageActivity.

Adds a tag to an existing inventoryStorageActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryStorageActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryStorageActivityApi apiInstance = new InventoryStorageActivityApi();
Integer inventoryStorageActivityId = 56; // Integer | Id of the inventoryStorageActivity to add a tag to
String inventoryStorageActivityTag = "inventoryStorageActivityTag_example"; // String | The tag to add
try {
    apiInstance.addInventoryStorageActivityTag(inventoryStorageActivityId, inventoryStorageActivityTag);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryStorageActivityApi#addInventoryStorageActivityTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryStorageActivityId** | **Integer**| Id of the inventoryStorageActivity to add a tag to |
 **inventoryStorageActivityTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteInventoryStorageActivity"></a>
# **deleteInventoryStorageActivity**
> deleteInventoryStorageActivity(inventoryStorageActivityId)

Delete an inventoryStorageActivity

Deletes the inventoryStorageActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryStorageActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryStorageActivityApi apiInstance = new InventoryStorageActivityApi();
Integer inventoryStorageActivityId = 56; // Integer | Id of the inventoryStorageActivity to be deleted.
try {
    apiInstance.deleteInventoryStorageActivity(inventoryStorageActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryStorageActivityApi#deleteInventoryStorageActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryStorageActivityId** | **Integer**| Id of the inventoryStorageActivity to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteInventoryStorageActivityFile"></a>
# **deleteInventoryStorageActivityFile**
> deleteInventoryStorageActivityFile(inventoryStorageActivityId, fileId)

Delete a file for an inventoryStorageActivity.

Deletes an existing inventoryStorageActivity file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryStorageActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryStorageActivityApi apiInstance = new InventoryStorageActivityApi();
Integer inventoryStorageActivityId = 56; // Integer | Id of the inventoryStorageActivity to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteInventoryStorageActivityFile(inventoryStorageActivityId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryStorageActivityApi#deleteInventoryStorageActivityFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryStorageActivityId** | **Integer**| Id of the inventoryStorageActivity to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteInventoryStorageActivityTag"></a>
# **deleteInventoryStorageActivityTag**
> deleteInventoryStorageActivityTag(inventoryStorageActivityId, inventoryStorageActivityTag)

Delete a tag for an inventoryStorageActivity.

Deletes an existing inventoryStorageActivity tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryStorageActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryStorageActivityApi apiInstance = new InventoryStorageActivityApi();
Integer inventoryStorageActivityId = 56; // Integer | Id of the inventoryStorageActivity to remove tag from
String inventoryStorageActivityTag = "inventoryStorageActivityTag_example"; // String | The tag to delete
try {
    apiInstance.deleteInventoryStorageActivityTag(inventoryStorageActivityId, inventoryStorageActivityTag);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryStorageActivityApi#deleteInventoryStorageActivityTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryStorageActivityId** | **Integer**| Id of the inventoryStorageActivity to remove tag from |
 **inventoryStorageActivityTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateInventoryStorageActivityById"></a>
# **getDuplicateInventoryStorageActivityById**
> InventoryStorageActivity getDuplicateInventoryStorageActivityById(inventoryStorageActivityId)

Get a duplicated an inventoryStorageActivity by id

Returns a duplicated inventoryStorageActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryStorageActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryStorageActivityApi apiInstance = new InventoryStorageActivityApi();
Integer inventoryStorageActivityId = 56; // Integer | Id of the inventoryStorageActivity to be duplicated.
try {
    InventoryStorageActivity result = apiInstance.getDuplicateInventoryStorageActivityById(inventoryStorageActivityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryStorageActivityApi#getDuplicateInventoryStorageActivityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryStorageActivityId** | **Integer**| Id of the inventoryStorageActivity to be duplicated. |

### Return type

[**InventoryStorageActivity**](InventoryStorageActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventoryStorageActivityByFilter"></a>
# **getInventoryStorageActivityByFilter**
> List&lt;InventoryStorageActivity&gt; getInventoryStorageActivityByFilter(filter, page, limit, sort)

Search inventoryStorageActivitys by filter

Returns the list of inventoryStorageActivitys that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryStorageActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryStorageActivityApi apiInstance = new InventoryStorageActivityApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<InventoryStorageActivity> result = apiInstance.getInventoryStorageActivityByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryStorageActivityApi#getInventoryStorageActivityByFilter");
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

[**List&lt;InventoryStorageActivity&gt;**](InventoryStorageActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventoryStorageActivityById"></a>
# **getInventoryStorageActivityById**
> InventoryStorageActivity getInventoryStorageActivityById(inventoryStorageActivityId)

Get an inventoryStorageActivity by id

Returns the inventoryStorageActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryStorageActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryStorageActivityApi apiInstance = new InventoryStorageActivityApi();
Integer inventoryStorageActivityId = 56; // Integer | Id of the inventoryStorageActivity to be returned.
try {
    InventoryStorageActivity result = apiInstance.getInventoryStorageActivityById(inventoryStorageActivityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryStorageActivityApi#getInventoryStorageActivityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryStorageActivityId** | **Integer**| Id of the inventoryStorageActivity to be returned. |

### Return type

[**InventoryStorageActivity**](InventoryStorageActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventoryStorageActivityFiles"></a>
# **getInventoryStorageActivityFiles**
> getInventoryStorageActivityFiles(inventoryStorageActivityId)

Get the files for an inventoryStorageActivity.

Get all existing inventoryStorageActivity files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryStorageActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryStorageActivityApi apiInstance = new InventoryStorageActivityApi();
Integer inventoryStorageActivityId = 56; // Integer | Id of the inventoryStorageActivity to get files for
try {
    apiInstance.getInventoryStorageActivityFiles(inventoryStorageActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryStorageActivityApi#getInventoryStorageActivityFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryStorageActivityId** | **Integer**| Id of the inventoryStorageActivity to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventoryStorageActivityTags"></a>
# **getInventoryStorageActivityTags**
> getInventoryStorageActivityTags(inventoryStorageActivityId)

Get the tags for an inventoryStorageActivity.

Get all existing inventoryStorageActivity tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryStorageActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryStorageActivityApi apiInstance = new InventoryStorageActivityApi();
Integer inventoryStorageActivityId = 56; // Integer | Id of the inventoryStorageActivity to get tags for
try {
    apiInstance.getInventoryStorageActivityTags(inventoryStorageActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryStorageActivityApi#getInventoryStorageActivityTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryStorageActivityId** | **Integer**| Id of the inventoryStorageActivity to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateInventoryStorageActivity"></a>
# **updateInventoryStorageActivity**
> updateInventoryStorageActivity(body)

Update an inventoryStorageActivity

Updates an existing inventoryStorageActivity using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryStorageActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryStorageActivityApi apiInstance = new InventoryStorageActivityApi();
InventoryStorageActivity body = new InventoryStorageActivity(); // InventoryStorageActivity | InventoryStorageActivity to be updated.
try {
    apiInstance.updateInventoryStorageActivity(body);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryStorageActivityApi#updateInventoryStorageActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InventoryStorageActivity**](InventoryStorageActivity.md)| InventoryStorageActivity to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

