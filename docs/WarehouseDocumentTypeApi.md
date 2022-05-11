# WarehouseDocumentTypeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addWarehouseDocumentTypeAudit**](WarehouseDocumentTypeApi.md#addWarehouseDocumentTypeAudit) | **PUT** /v3.0/warehouseDocumentType/{warehouseDocumentTypeId}/audit/{warehouseDocumentTypeAudit} | Add new audit for a warehouseDocumentType
[**addWarehouseDocumentTypeFile**](WarehouseDocumentTypeApi.md#addWarehouseDocumentTypeFile) | **POST** /v3.0/warehouseDocumentType/{warehouseDocumentTypeId}/file/{fileName} | Attach a file to a warehouseDocumentType
[**addWarehouseDocumentTypeFileByURL**](WarehouseDocumentTypeApi.md#addWarehouseDocumentTypeFileByURL) | **POST** /v3.0/warehouseDocumentType/{warehouseDocumentTypeId}/file | Attach a file to a warehouseDocumentType by URL.
[**addWarehouseDocumentTypeTag**](WarehouseDocumentTypeApi.md#addWarehouseDocumentTypeTag) | **PUT** /v3.0/warehouseDocumentType/{warehouseDocumentTypeId}/tag/{warehouseDocumentTypeTag} | Add new tags for a warehouseDocumentType.
[**deleteWarehouseDocumentTypeFile**](WarehouseDocumentTypeApi.md#deleteWarehouseDocumentTypeFile) | **DELETE** /v3.0/warehouseDocumentType/{warehouseDocumentTypeId}/file/{fileId} | Delete a file for a warehouseDocumentType.
[**deleteWarehouseDocumentTypeTag**](WarehouseDocumentTypeApi.md#deleteWarehouseDocumentTypeTag) | **DELETE** /v3.0/warehouseDocumentType/{warehouseDocumentTypeId}/tag/{warehouseDocumentTypeTag} | Delete a tag for a warehouseDocumentType.
[**getDuplicateWarehouseDocumentTypeById**](WarehouseDocumentTypeApi.md#getDuplicateWarehouseDocumentTypeById) | **GET** /v3.0/warehouseDocumentType/duplicate/{warehouseDocumentTypeId} | Get a duplicated a warehouseDocumentType by id
[**getWarehouseDocumentTypeByFilter**](WarehouseDocumentTypeApi.md#getWarehouseDocumentTypeByFilter) | **GET** /v3.0/warehouseDocumentType/search | Search warehouseDocumentTypes by filter
[**getWarehouseDocumentTypeById**](WarehouseDocumentTypeApi.md#getWarehouseDocumentTypeById) | **GET** /v3.0/warehouseDocumentType/{warehouseDocumentTypeId} | Get a warehouseDocumentType by id
[**getWarehouseDocumentTypeFiles**](WarehouseDocumentTypeApi.md#getWarehouseDocumentTypeFiles) | **GET** /v3.0/warehouseDocumentType/{warehouseDocumentTypeId}/file | Get the files for a warehouseDocumentType.
[**getWarehouseDocumentTypeTags**](WarehouseDocumentTypeApi.md#getWarehouseDocumentTypeTags) | **GET** /v3.0/warehouseDocumentType/{warehouseDocumentTypeId}/tag | Get the tags for a warehouseDocumentType.


<a name="addWarehouseDocumentTypeAudit"></a>
# **addWarehouseDocumentTypeAudit**
> addWarehouseDocumentTypeAudit(warehouseDocumentTypeId, warehouseDocumentTypeAudit)

Add new audit for a warehouseDocumentType

Adds an audit to an existing warehouseDocumentType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseDocumentTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseDocumentTypeApi apiInstance = new WarehouseDocumentTypeApi();
Integer warehouseDocumentTypeId = 56; // Integer | Id of the warehouseDocumentType to add an audit to
String warehouseDocumentTypeAudit = "warehouseDocumentTypeAudit_example"; // String | The audit to add
try {
    apiInstance.addWarehouseDocumentTypeAudit(warehouseDocumentTypeId, warehouseDocumentTypeAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseDocumentTypeApi#addWarehouseDocumentTypeAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseDocumentTypeId** | **Integer**| Id of the warehouseDocumentType to add an audit to |
 **warehouseDocumentTypeAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addWarehouseDocumentTypeFile"></a>
# **addWarehouseDocumentTypeFile**
> addWarehouseDocumentTypeFile(warehouseDocumentTypeId, fileName)

Attach a file to a warehouseDocumentType

Adds a file to an existing warehouseDocumentType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseDocumentTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseDocumentTypeApi apiInstance = new WarehouseDocumentTypeApi();
Integer warehouseDocumentTypeId = 56; // Integer | Id of the warehouseDocumentType to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addWarehouseDocumentTypeFile(warehouseDocumentTypeId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseDocumentTypeApi#addWarehouseDocumentTypeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseDocumentTypeId** | **Integer**| Id of the warehouseDocumentType to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addWarehouseDocumentTypeFileByURL"></a>
# **addWarehouseDocumentTypeFileByURL**
> addWarehouseDocumentTypeFileByURL(body, warehouseDocumentTypeId)

Attach a file to a warehouseDocumentType by URL.

Adds a file to an existing warehouseDocumentType by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseDocumentTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseDocumentTypeApi apiInstance = new WarehouseDocumentTypeApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer warehouseDocumentTypeId = 56; // Integer | Id of the warehouseDocumentType to add an file to
try {
    apiInstance.addWarehouseDocumentTypeFileByURL(body, warehouseDocumentTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseDocumentTypeApi#addWarehouseDocumentTypeFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **warehouseDocumentTypeId** | **Integer**| Id of the warehouseDocumentType to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addWarehouseDocumentTypeTag"></a>
# **addWarehouseDocumentTypeTag**
> addWarehouseDocumentTypeTag(warehouseDocumentTypeId, warehouseDocumentTypeTag)

Add new tags for a warehouseDocumentType.

Adds a tag to an existing warehouseDocumentType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseDocumentTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseDocumentTypeApi apiInstance = new WarehouseDocumentTypeApi();
Integer warehouseDocumentTypeId = 56; // Integer | Id of the warehouseDocumentType to add a tag to
String warehouseDocumentTypeTag = "warehouseDocumentTypeTag_example"; // String | The tag to add
try {
    apiInstance.addWarehouseDocumentTypeTag(warehouseDocumentTypeId, warehouseDocumentTypeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseDocumentTypeApi#addWarehouseDocumentTypeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseDocumentTypeId** | **Integer**| Id of the warehouseDocumentType to add a tag to |
 **warehouseDocumentTypeTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWarehouseDocumentTypeFile"></a>
# **deleteWarehouseDocumentTypeFile**
> deleteWarehouseDocumentTypeFile(warehouseDocumentTypeId, fileId)

Delete a file for a warehouseDocumentType.

Deletes an existing warehouseDocumentType file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseDocumentTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseDocumentTypeApi apiInstance = new WarehouseDocumentTypeApi();
Integer warehouseDocumentTypeId = 56; // Integer | Id of the warehouseDocumentType to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteWarehouseDocumentTypeFile(warehouseDocumentTypeId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseDocumentTypeApi#deleteWarehouseDocumentTypeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseDocumentTypeId** | **Integer**| Id of the warehouseDocumentType to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWarehouseDocumentTypeTag"></a>
# **deleteWarehouseDocumentTypeTag**
> deleteWarehouseDocumentTypeTag(warehouseDocumentTypeId, warehouseDocumentTypeTag)

Delete a tag for a warehouseDocumentType.

Deletes an existing warehouseDocumentType tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseDocumentTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseDocumentTypeApi apiInstance = new WarehouseDocumentTypeApi();
Integer warehouseDocumentTypeId = 56; // Integer | Id of the warehouseDocumentType to remove tag from
String warehouseDocumentTypeTag = "warehouseDocumentTypeTag_example"; // String | The tag to delete
try {
    apiInstance.deleteWarehouseDocumentTypeTag(warehouseDocumentTypeId, warehouseDocumentTypeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseDocumentTypeApi#deleteWarehouseDocumentTypeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseDocumentTypeId** | **Integer**| Id of the warehouseDocumentType to remove tag from |
 **warehouseDocumentTypeTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateWarehouseDocumentTypeById"></a>
# **getDuplicateWarehouseDocumentTypeById**
> WarehouseDocumentType getDuplicateWarehouseDocumentTypeById(warehouseDocumentTypeId)

Get a duplicated a warehouseDocumentType by id

Returns a duplicated warehouseDocumentType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseDocumentTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseDocumentTypeApi apiInstance = new WarehouseDocumentTypeApi();
Integer warehouseDocumentTypeId = 56; // Integer | Id of the warehouseDocumentType to be duplicated.
try {
    WarehouseDocumentType result = apiInstance.getDuplicateWarehouseDocumentTypeById(warehouseDocumentTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseDocumentTypeApi#getDuplicateWarehouseDocumentTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseDocumentTypeId** | **Integer**| Id of the warehouseDocumentType to be duplicated. |

### Return type

[**WarehouseDocumentType**](WarehouseDocumentType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarehouseDocumentTypeByFilter"></a>
# **getWarehouseDocumentTypeByFilter**
> List&lt;WarehouseDocumentType&gt; getWarehouseDocumentTypeByFilter(filter, page, limit, sort)

Search warehouseDocumentTypes by filter

Returns the list of warehouseDocumentTypes that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseDocumentTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseDocumentTypeApi apiInstance = new WarehouseDocumentTypeApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<WarehouseDocumentType> result = apiInstance.getWarehouseDocumentTypeByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseDocumentTypeApi#getWarehouseDocumentTypeByFilter");
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

[**List&lt;WarehouseDocumentType&gt;**](WarehouseDocumentType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarehouseDocumentTypeById"></a>
# **getWarehouseDocumentTypeById**
> WarehouseDocumentType getWarehouseDocumentTypeById(warehouseDocumentTypeId)

Get a warehouseDocumentType by id

Returns the warehouseDocumentType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseDocumentTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseDocumentTypeApi apiInstance = new WarehouseDocumentTypeApi();
Integer warehouseDocumentTypeId = 56; // Integer | Id of the warehouseDocumentType to be returned.
try {
    WarehouseDocumentType result = apiInstance.getWarehouseDocumentTypeById(warehouseDocumentTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseDocumentTypeApi#getWarehouseDocumentTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseDocumentTypeId** | **Integer**| Id of the warehouseDocumentType to be returned. |

### Return type

[**WarehouseDocumentType**](WarehouseDocumentType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarehouseDocumentTypeFiles"></a>
# **getWarehouseDocumentTypeFiles**
> getWarehouseDocumentTypeFiles(warehouseDocumentTypeId)

Get the files for a warehouseDocumentType.

Get all existing warehouseDocumentType files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseDocumentTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseDocumentTypeApi apiInstance = new WarehouseDocumentTypeApi();
Integer warehouseDocumentTypeId = 56; // Integer | Id of the warehouseDocumentType to get files for
try {
    apiInstance.getWarehouseDocumentTypeFiles(warehouseDocumentTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseDocumentTypeApi#getWarehouseDocumentTypeFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseDocumentTypeId** | **Integer**| Id of the warehouseDocumentType to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarehouseDocumentTypeTags"></a>
# **getWarehouseDocumentTypeTags**
> getWarehouseDocumentTypeTags(warehouseDocumentTypeId)

Get the tags for a warehouseDocumentType.

Get all existing warehouseDocumentType tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseDocumentTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseDocumentTypeApi apiInstance = new WarehouseDocumentTypeApi();
Integer warehouseDocumentTypeId = 56; // Integer | Id of the warehouseDocumentType to get tags for
try {
    apiInstance.getWarehouseDocumentTypeTags(warehouseDocumentTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseDocumentTypeApi#getWarehouseDocumentTypeTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseDocumentTypeId** | **Integer**| Id of the warehouseDocumentType to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

