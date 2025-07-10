# WarehouseInventoryApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addWarehouseInventoryAudit**](WarehouseInventoryApi.md#addWarehouseInventoryAudit) | **PUT** /beta/warehouseInventory/{warehouseInventoryId}/audit/{warehouseInventoryAudit} | Add new audit for a warehouseInventory
[**addWarehouseInventoryFile**](WarehouseInventoryApi.md#addWarehouseInventoryFile) | **POST** /beta/warehouseInventory/{warehouseInventoryId}/file/{fileName} | Attach a file to a warehouseInventory
[**addWarehouseInventoryFileByURL**](WarehouseInventoryApi.md#addWarehouseInventoryFileByURL) | **POST** /beta/warehouseInventory/{warehouseInventoryId}/file | Attach a file to a warehouseInventory by URL.
[**addWarehouseInventoryTag**](WarehouseInventoryApi.md#addWarehouseInventoryTag) | **PUT** /beta/warehouseInventory/{warehouseInventoryId}/tag/{warehouseInventoryTag} | Add new tags for a warehouseInventory.
[**deleteWarehouseInventoryFile**](WarehouseInventoryApi.md#deleteWarehouseInventoryFile) | **DELETE** /beta/warehouseInventory/{warehouseInventoryId}/file/{fileId} | Delete a file for a warehouseInventory.
[**deleteWarehouseInventoryTag**](WarehouseInventoryApi.md#deleteWarehouseInventoryTag) | **DELETE** /beta/warehouseInventory/{warehouseInventoryId}/tag/{warehouseInventoryTag} | Delete a tag for a warehouseInventory.
[**getDuplicateWarehouseInventoryById**](WarehouseInventoryApi.md#getDuplicateWarehouseInventoryById) | **GET** /beta/warehouseInventory/duplicate/{warehouseInventoryId} | Get a duplicated a warehouseInventory by id
[**getWarehouseInventoryByFilter**](WarehouseInventoryApi.md#getWarehouseInventoryByFilter) | **GET** /beta/warehouseInventory/search | Search warehouseInventorys by filter
[**getWarehouseInventoryById**](WarehouseInventoryApi.md#getWarehouseInventoryById) | **GET** /beta/warehouseInventory/{warehouseInventoryId} | Get a warehouseInventory by id
[**getWarehouseInventoryFiles**](WarehouseInventoryApi.md#getWarehouseInventoryFiles) | **GET** /beta/warehouseInventory/{warehouseInventoryId}/file | Get the files for a warehouseInventory.
[**getWarehouseInventoryTags**](WarehouseInventoryApi.md#getWarehouseInventoryTags) | **GET** /beta/warehouseInventory/{warehouseInventoryId}/tag | Get the tags for a warehouseInventory.


<a name="addWarehouseInventoryAudit"></a>
# **addWarehouseInventoryAudit**
> addWarehouseInventoryAudit(warehouseInventoryId, warehouseInventoryAudit)

Add new audit for a warehouseInventory

Adds an audit to an existing warehouseInventory.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseInventoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseInventoryApi apiInstance = new WarehouseInventoryApi();
Integer warehouseInventoryId = 56; // Integer | Id of the warehouseInventory to add an audit to
String warehouseInventoryAudit = "warehouseInventoryAudit_example"; // String | The audit to add
try {
    apiInstance.addWarehouseInventoryAudit(warehouseInventoryId, warehouseInventoryAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseInventoryApi#addWarehouseInventoryAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseInventoryId** | **Integer**| Id of the warehouseInventory to add an audit to |
 **warehouseInventoryAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addWarehouseInventoryFile"></a>
# **addWarehouseInventoryFile**
> addWarehouseInventoryFile(warehouseInventoryId, fileName)

Attach a file to a warehouseInventory

Adds a file to an existing warehouseInventory.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseInventoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseInventoryApi apiInstance = new WarehouseInventoryApi();
Integer warehouseInventoryId = 56; // Integer | Id of the warehouseInventory to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addWarehouseInventoryFile(warehouseInventoryId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseInventoryApi#addWarehouseInventoryFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseInventoryId** | **Integer**| Id of the warehouseInventory to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addWarehouseInventoryFileByURL"></a>
# **addWarehouseInventoryFileByURL**
> addWarehouseInventoryFileByURL(body, warehouseInventoryId)

Attach a file to a warehouseInventory by URL.

Adds a file to an existing warehouseInventory by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseInventoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseInventoryApi apiInstance = new WarehouseInventoryApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer warehouseInventoryId = 56; // Integer | Id of the warehouseInventory to add an file to
try {
    apiInstance.addWarehouseInventoryFileByURL(body, warehouseInventoryId);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseInventoryApi#addWarehouseInventoryFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **warehouseInventoryId** | **Integer**| Id of the warehouseInventory to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addWarehouseInventoryTag"></a>
# **addWarehouseInventoryTag**
> addWarehouseInventoryTag(warehouseInventoryId, warehouseInventoryTag)

Add new tags for a warehouseInventory.

Adds a tag to an existing warehouseInventory.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseInventoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseInventoryApi apiInstance = new WarehouseInventoryApi();
Integer warehouseInventoryId = 56; // Integer | Id of the warehouseInventory to add a tag to
String warehouseInventoryTag = "warehouseInventoryTag_example"; // String | The tag to add
try {
    apiInstance.addWarehouseInventoryTag(warehouseInventoryId, warehouseInventoryTag);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseInventoryApi#addWarehouseInventoryTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseInventoryId** | **Integer**| Id of the warehouseInventory to add a tag to |
 **warehouseInventoryTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWarehouseInventoryFile"></a>
# **deleteWarehouseInventoryFile**
> deleteWarehouseInventoryFile(warehouseInventoryId, fileId)

Delete a file for a warehouseInventory.

Deletes an existing warehouseInventory file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseInventoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseInventoryApi apiInstance = new WarehouseInventoryApi();
Integer warehouseInventoryId = 56; // Integer | Id of the warehouseInventory to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteWarehouseInventoryFile(warehouseInventoryId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseInventoryApi#deleteWarehouseInventoryFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseInventoryId** | **Integer**| Id of the warehouseInventory to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWarehouseInventoryTag"></a>
# **deleteWarehouseInventoryTag**
> deleteWarehouseInventoryTag(warehouseInventoryId, warehouseInventoryTag)

Delete a tag for a warehouseInventory.

Deletes an existing warehouseInventory tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseInventoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseInventoryApi apiInstance = new WarehouseInventoryApi();
Integer warehouseInventoryId = 56; // Integer | Id of the warehouseInventory to remove tag from
String warehouseInventoryTag = "warehouseInventoryTag_example"; // String | The tag to delete
try {
    apiInstance.deleteWarehouseInventoryTag(warehouseInventoryId, warehouseInventoryTag);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseInventoryApi#deleteWarehouseInventoryTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseInventoryId** | **Integer**| Id of the warehouseInventory to remove tag from |
 **warehouseInventoryTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateWarehouseInventoryById"></a>
# **getDuplicateWarehouseInventoryById**
> WarehouseInventory getDuplicateWarehouseInventoryById(warehouseInventoryId)

Get a duplicated a warehouseInventory by id

Returns a duplicated warehouseInventory identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseInventoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseInventoryApi apiInstance = new WarehouseInventoryApi();
Integer warehouseInventoryId = 56; // Integer | Id of the warehouseInventory to be duplicated.
try {
    WarehouseInventory result = apiInstance.getDuplicateWarehouseInventoryById(warehouseInventoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseInventoryApi#getDuplicateWarehouseInventoryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseInventoryId** | **Integer**| Id of the warehouseInventory to be duplicated. |

### Return type

[**WarehouseInventory**](WarehouseInventory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarehouseInventoryByFilter"></a>
# **getWarehouseInventoryByFilter**
> List&lt;WarehouseInventory&gt; getWarehouseInventoryByFilter(filter, page, limit, sort)

Search warehouseInventorys by filter

Returns the list of warehouseInventorys that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseInventoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseInventoryApi apiInstance = new WarehouseInventoryApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<WarehouseInventory> result = apiInstance.getWarehouseInventoryByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseInventoryApi#getWarehouseInventoryByFilter");
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

[**List&lt;WarehouseInventory&gt;**](WarehouseInventory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarehouseInventoryById"></a>
# **getWarehouseInventoryById**
> WarehouseInventory getWarehouseInventoryById(warehouseInventoryId)

Get a warehouseInventory by id

Returns the warehouseInventory identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseInventoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseInventoryApi apiInstance = new WarehouseInventoryApi();
Integer warehouseInventoryId = 56; // Integer | Id of the warehouseInventory to be returned.
try {
    WarehouseInventory result = apiInstance.getWarehouseInventoryById(warehouseInventoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseInventoryApi#getWarehouseInventoryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseInventoryId** | **Integer**| Id of the warehouseInventory to be returned. |

### Return type

[**WarehouseInventory**](WarehouseInventory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarehouseInventoryFiles"></a>
# **getWarehouseInventoryFiles**
> getWarehouseInventoryFiles(warehouseInventoryId)

Get the files for a warehouseInventory.

Get all existing warehouseInventory files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseInventoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseInventoryApi apiInstance = new WarehouseInventoryApi();
Integer warehouseInventoryId = 56; // Integer | Id of the warehouseInventory to get files for
try {
    apiInstance.getWarehouseInventoryFiles(warehouseInventoryId);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseInventoryApi#getWarehouseInventoryFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseInventoryId** | **Integer**| Id of the warehouseInventory to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarehouseInventoryTags"></a>
# **getWarehouseInventoryTags**
> getWarehouseInventoryTags(warehouseInventoryId)

Get the tags for a warehouseInventory.

Get all existing warehouseInventory tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseInventoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseInventoryApi apiInstance = new WarehouseInventoryApi();
Integer warehouseInventoryId = 56; // Integer | Id of the warehouseInventory to get tags for
try {
    apiInstance.getWarehouseInventoryTags(warehouseInventoryId);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseInventoryApi#getWarehouseInventoryTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseInventoryId** | **Integer**| Id of the warehouseInventory to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

