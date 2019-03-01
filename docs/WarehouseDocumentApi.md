# WarehouseDocumentApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addWarehouseDocumentAudit**](WarehouseDocumentApi.md#addWarehouseDocumentAudit) | **PUT** /beta/warehouseDocument/{warehouseDocumentId}/audit/{warehouseDocumentAudit} | Add new audit for a warehouseDocument
[**addWarehouseDocumentFile**](WarehouseDocumentApi.md#addWarehouseDocumentFile) | **POST** /beta/warehouseDocument/{warehouseDocumentId}/file/{fileName} | Attach a file to a warehouseDocument
[**addWarehouseDocumentTag**](WarehouseDocumentApi.md#addWarehouseDocumentTag) | **PUT** /beta/warehouseDocument/{warehouseDocumentId}/tag/{warehouseDocumentTag} | Add new tags for a warehouseDocument.
[**deleteWarehouseDocumentTag**](WarehouseDocumentApi.md#deleteWarehouseDocumentTag) | **DELETE** /beta/warehouseDocument/{warehouseDocumentId}/tag/{warehouseDocumentTag} | Delete a tag for a warehouseDocument.
[**getDuplicateWarehouseDocumentById**](WarehouseDocumentApi.md#getDuplicateWarehouseDocumentById) | **GET** /beta/warehouseDocument/duplicate/{warehouseDocumentId} | Get a duplicated a warehouseDocument by id
[**getWarehouseDocumentByFilter**](WarehouseDocumentApi.md#getWarehouseDocumentByFilter) | **GET** /beta/warehouseDocument/search | Search warehouseDocuments by filter
[**getWarehouseDocumentById**](WarehouseDocumentApi.md#getWarehouseDocumentById) | **GET** /beta/warehouseDocument/{warehouseDocumentId} | Get a warehouseDocument by id
[**getWarehouseDocumentTags**](WarehouseDocumentApi.md#getWarehouseDocumentTags) | **GET** /beta/warehouseDocument/{warehouseDocumentId}/tag | Get the tags for a warehouseDocument.
[**updateWarehouseDocumentCustomFields**](WarehouseDocumentApi.md#updateWarehouseDocumentCustomFields) | **PUT** /beta/warehouseDocument/customFields | Update a warehouseDocument custom fields


<a name="addWarehouseDocumentAudit"></a>
# **addWarehouseDocumentAudit**
> addWarehouseDocumentAudit(warehouseDocumentId, warehouseDocumentAudit)

Add new audit for a warehouseDocument

Adds an audit to an existing warehouseDocument.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseDocumentApi apiInstance = new WarehouseDocumentApi();
Integer warehouseDocumentId = 56; // Integer | Id of the warehouseDocument to add an audit to
String warehouseDocumentAudit = "warehouseDocumentAudit_example"; // String | The audit to add
try {
    apiInstance.addWarehouseDocumentAudit(warehouseDocumentId, warehouseDocumentAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseDocumentApi#addWarehouseDocumentAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseDocumentId** | **Integer**| Id of the warehouseDocument to add an audit to |
 **warehouseDocumentAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addWarehouseDocumentFile"></a>
# **addWarehouseDocumentFile**
> addWarehouseDocumentFile(warehouseDocumentId, fileName)

Attach a file to a warehouseDocument

Adds a file to an existing warehouseDocument.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseDocumentApi apiInstance = new WarehouseDocumentApi();
Integer warehouseDocumentId = 56; // Integer | Id of the warehouseDocument to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addWarehouseDocumentFile(warehouseDocumentId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseDocumentApi#addWarehouseDocumentFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseDocumentId** | **Integer**| Id of the warehouseDocument to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addWarehouseDocumentTag"></a>
# **addWarehouseDocumentTag**
> addWarehouseDocumentTag(warehouseDocumentId, warehouseDocumentTag)

Add new tags for a warehouseDocument.

Adds a tag to an existing warehouseDocument.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseDocumentApi apiInstance = new WarehouseDocumentApi();
Integer warehouseDocumentId = 56; // Integer | Id of the warehouseDocument to add a tag to
String warehouseDocumentTag = "warehouseDocumentTag_example"; // String | The tag to add
try {
    apiInstance.addWarehouseDocumentTag(warehouseDocumentId, warehouseDocumentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseDocumentApi#addWarehouseDocumentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseDocumentId** | **Integer**| Id of the warehouseDocument to add a tag to |
 **warehouseDocumentTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWarehouseDocumentTag"></a>
# **deleteWarehouseDocumentTag**
> deleteWarehouseDocumentTag(warehouseDocumentId, warehouseDocumentTag)

Delete a tag for a warehouseDocument.

Deletes an existing warehouseDocument tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseDocumentApi apiInstance = new WarehouseDocumentApi();
Integer warehouseDocumentId = 56; // Integer | Id of the warehouseDocument to remove tag from
String warehouseDocumentTag = "warehouseDocumentTag_example"; // String | The tag to delete
try {
    apiInstance.deleteWarehouseDocumentTag(warehouseDocumentId, warehouseDocumentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseDocumentApi#deleteWarehouseDocumentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseDocumentId** | **Integer**| Id of the warehouseDocument to remove tag from |
 **warehouseDocumentTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateWarehouseDocumentById"></a>
# **getDuplicateWarehouseDocumentById**
> WarehouseDocument getDuplicateWarehouseDocumentById(warehouseDocumentId)

Get a duplicated a warehouseDocument by id

Returns a duplicated warehouseDocument identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseDocumentApi apiInstance = new WarehouseDocumentApi();
Integer warehouseDocumentId = 56; // Integer | Id of the warehouseDocument to be duplicated.
try {
    WarehouseDocument result = apiInstance.getDuplicateWarehouseDocumentById(warehouseDocumentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseDocumentApi#getDuplicateWarehouseDocumentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseDocumentId** | **Integer**| Id of the warehouseDocument to be duplicated. |

### Return type

[**WarehouseDocument**](WarehouseDocument.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarehouseDocumentByFilter"></a>
# **getWarehouseDocumentByFilter**
> List&lt;WarehouseDocument&gt; getWarehouseDocumentByFilter(filter, page, limit, sort)

Search warehouseDocuments by filter

Returns the list of warehouseDocuments that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseDocumentApi apiInstance = new WarehouseDocumentApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<WarehouseDocument> result = apiInstance.getWarehouseDocumentByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseDocumentApi#getWarehouseDocumentByFilter");
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

[**List&lt;WarehouseDocument&gt;**](WarehouseDocument.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarehouseDocumentById"></a>
# **getWarehouseDocumentById**
> WarehouseDocument getWarehouseDocumentById(warehouseDocumentId)

Get a warehouseDocument by id

Returns the warehouseDocument identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseDocumentApi apiInstance = new WarehouseDocumentApi();
Integer warehouseDocumentId = 56; // Integer | Id of the warehouseDocument to be returned.
try {
    WarehouseDocument result = apiInstance.getWarehouseDocumentById(warehouseDocumentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseDocumentApi#getWarehouseDocumentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseDocumentId** | **Integer**| Id of the warehouseDocument to be returned. |

### Return type

[**WarehouseDocument**](WarehouseDocument.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarehouseDocumentTags"></a>
# **getWarehouseDocumentTags**
> getWarehouseDocumentTags(warehouseDocumentId)

Get the tags for a warehouseDocument.

Get all existing warehouseDocument tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseDocumentApi apiInstance = new WarehouseDocumentApi();
Integer warehouseDocumentId = 56; // Integer | Id of the warehouseDocument to get tags for
try {
    apiInstance.getWarehouseDocumentTags(warehouseDocumentId);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseDocumentApi#getWarehouseDocumentTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseDocumentId** | **Integer**| Id of the warehouseDocument to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWarehouseDocumentCustomFields"></a>
# **updateWarehouseDocumentCustomFields**
> updateWarehouseDocumentCustomFields(body)

Update a warehouseDocument custom fields

Updates an existing warehouseDocument custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseDocumentApi apiInstance = new WarehouseDocumentApi();
WarehouseDocument body = new WarehouseDocument(); // WarehouseDocument | WarehouseDocument to be updated.
try {
    apiInstance.updateWarehouseDocumentCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseDocumentApi#updateWarehouseDocumentCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WarehouseDocument**](WarehouseDocument.md)| WarehouseDocument to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

