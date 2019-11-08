# InventorySnapshotApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInventorySnapshotAudit**](InventorySnapshotApi.md#addInventorySnapshotAudit) | **PUT** /beta/inventorySnapshot/{inventorySnapshotId}/audit/{inventorySnapshotAudit} | Add new audit for an inventorySnapshot
[**addInventorySnapshotFile**](InventorySnapshotApi.md#addInventorySnapshotFile) | **POST** /beta/inventorySnapshot/{inventorySnapshotId}/file/{fileName} | Attach a file to an inventorySnapshot
[**addInventorySnapshotTag**](InventorySnapshotApi.md#addInventorySnapshotTag) | **PUT** /beta/inventorySnapshot/{inventorySnapshotId}/tag/{inventorySnapshotTag} | Add new tags for an inventorySnapshot.
[**deleteInventorySnapshotTag**](InventorySnapshotApi.md#deleteInventorySnapshotTag) | **DELETE** /beta/inventorySnapshot/{inventorySnapshotId}/tag/{inventorySnapshotTag} | Delete a tag for an inventorySnapshot.
[**getDuplicateInventorySnapshotById**](InventorySnapshotApi.md#getDuplicateInventorySnapshotById) | **GET** /beta/inventorySnapshot/duplicate/{inventorySnapshotId} | Get a duplicated an inventorySnapshot by id
[**getInventorySnapshotByFilter**](InventorySnapshotApi.md#getInventorySnapshotByFilter) | **GET** /beta/inventorySnapshot/search | Search inventorySnapshots by filter
[**getInventorySnapshotById**](InventorySnapshotApi.md#getInventorySnapshotById) | **GET** /beta/inventorySnapshot/{inventorySnapshotId} | Get an inventorySnapshot by id
[**getInventorySnapshotTags**](InventorySnapshotApi.md#getInventorySnapshotTags) | **GET** /beta/inventorySnapshot/{inventorySnapshotId}/tag | Get the tags for an inventorySnapshot.


<a name="addInventorySnapshotAudit"></a>
# **addInventorySnapshotAudit**
> addInventorySnapshotAudit(inventorySnapshotId, inventorySnapshotAudit)

Add new audit for an inventorySnapshot

Adds an audit to an existing inventorySnapshot.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventorySnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventorySnapshotApi apiInstance = new InventorySnapshotApi();
Integer inventorySnapshotId = 56; // Integer | Id of the inventorySnapshot to add an audit to
String inventorySnapshotAudit = "inventorySnapshotAudit_example"; // String | The audit to add
try {
    apiInstance.addInventorySnapshotAudit(inventorySnapshotId, inventorySnapshotAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling InventorySnapshotApi#addInventorySnapshotAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventorySnapshotId** | **Integer**| Id of the inventorySnapshot to add an audit to |
 **inventorySnapshotAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addInventorySnapshotFile"></a>
# **addInventorySnapshotFile**
> addInventorySnapshotFile(inventorySnapshotId, fileName)

Attach a file to an inventorySnapshot

Adds a file to an existing inventorySnapshot.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventorySnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventorySnapshotApi apiInstance = new InventorySnapshotApi();
Integer inventorySnapshotId = 56; // Integer | Id of the inventorySnapshot to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addInventorySnapshotFile(inventorySnapshotId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling InventorySnapshotApi#addInventorySnapshotFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventorySnapshotId** | **Integer**| Id of the inventorySnapshot to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addInventorySnapshotTag"></a>
# **addInventorySnapshotTag**
> addInventorySnapshotTag(inventorySnapshotId, inventorySnapshotTag)

Add new tags for an inventorySnapshot.

Adds a tag to an existing inventorySnapshot.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventorySnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventorySnapshotApi apiInstance = new InventorySnapshotApi();
Integer inventorySnapshotId = 56; // Integer | Id of the inventorySnapshot to add a tag to
String inventorySnapshotTag = "inventorySnapshotTag_example"; // String | The tag to add
try {
    apiInstance.addInventorySnapshotTag(inventorySnapshotId, inventorySnapshotTag);
} catch (ApiException e) {
    System.err.println("Exception when calling InventorySnapshotApi#addInventorySnapshotTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventorySnapshotId** | **Integer**| Id of the inventorySnapshot to add a tag to |
 **inventorySnapshotTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteInventorySnapshotTag"></a>
# **deleteInventorySnapshotTag**
> deleteInventorySnapshotTag(inventorySnapshotId, inventorySnapshotTag)

Delete a tag for an inventorySnapshot.

Deletes an existing inventorySnapshot tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventorySnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventorySnapshotApi apiInstance = new InventorySnapshotApi();
Integer inventorySnapshotId = 56; // Integer | Id of the inventorySnapshot to remove tag from
String inventorySnapshotTag = "inventorySnapshotTag_example"; // String | The tag to delete
try {
    apiInstance.deleteInventorySnapshotTag(inventorySnapshotId, inventorySnapshotTag);
} catch (ApiException e) {
    System.err.println("Exception when calling InventorySnapshotApi#deleteInventorySnapshotTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventorySnapshotId** | **Integer**| Id of the inventorySnapshot to remove tag from |
 **inventorySnapshotTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateInventorySnapshotById"></a>
# **getDuplicateInventorySnapshotById**
> InventorySnapshot getDuplicateInventorySnapshotById(inventorySnapshotId)

Get a duplicated an inventorySnapshot by id

Returns a duplicated inventorySnapshot identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventorySnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventorySnapshotApi apiInstance = new InventorySnapshotApi();
Integer inventorySnapshotId = 56; // Integer | Id of the inventorySnapshot to be duplicated.
try {
    InventorySnapshot result = apiInstance.getDuplicateInventorySnapshotById(inventorySnapshotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventorySnapshotApi#getDuplicateInventorySnapshotById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventorySnapshotId** | **Integer**| Id of the inventorySnapshot to be duplicated. |

### Return type

[**InventorySnapshot**](InventorySnapshot.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventorySnapshotByFilter"></a>
# **getInventorySnapshotByFilter**
> List&lt;InventorySnapshot&gt; getInventorySnapshotByFilter(filter, page, limit, sort)

Search inventorySnapshots by filter

Returns the list of inventorySnapshots that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventorySnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventorySnapshotApi apiInstance = new InventorySnapshotApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<InventorySnapshot> result = apiInstance.getInventorySnapshotByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventorySnapshotApi#getInventorySnapshotByFilter");
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

[**List&lt;InventorySnapshot&gt;**](InventorySnapshot.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventorySnapshotById"></a>
# **getInventorySnapshotById**
> InventorySnapshot getInventorySnapshotById(inventorySnapshotId)

Get an inventorySnapshot by id

Returns the inventorySnapshot identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventorySnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventorySnapshotApi apiInstance = new InventorySnapshotApi();
Integer inventorySnapshotId = 56; // Integer | Id of the inventorySnapshot to be returned.
try {
    InventorySnapshot result = apiInstance.getInventorySnapshotById(inventorySnapshotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventorySnapshotApi#getInventorySnapshotById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventorySnapshotId** | **Integer**| Id of the inventorySnapshot to be returned. |

### Return type

[**InventorySnapshot**](InventorySnapshot.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventorySnapshotTags"></a>
# **getInventorySnapshotTags**
> getInventorySnapshotTags(inventorySnapshotId)

Get the tags for an inventorySnapshot.

Get all existing inventorySnapshot tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventorySnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventorySnapshotApi apiInstance = new InventorySnapshotApi();
Integer inventorySnapshotId = 56; // Integer | Id of the inventorySnapshot to get tags for
try {
    apiInstance.getInventorySnapshotTags(inventorySnapshotId);
} catch (ApiException e) {
    System.err.println("Exception when calling InventorySnapshotApi#getInventorySnapshotTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventorySnapshotId** | **Integer**| Id of the inventorySnapshot to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

