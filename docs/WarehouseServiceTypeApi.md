# WarehouseServiceTypeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addWarehouseServiceType**](WarehouseServiceTypeApi.md#addWarehouseServiceType) | **POST** /v3.0/warehouseServiceType | Create a warehouseServiceType
[**addWarehouseServiceTypeAudit**](WarehouseServiceTypeApi.md#addWarehouseServiceTypeAudit) | **PUT** /v3.0/warehouseServiceType/{warehouseServiceTypeId}/audit/{warehouseServiceTypeAudit} | Add new audit for a warehouseServiceType
[**addWarehouseServiceTypeFile**](WarehouseServiceTypeApi.md#addWarehouseServiceTypeFile) | **POST** /v3.0/warehouseServiceType/{warehouseServiceTypeId}/file/{fileName} | Attach a file to a warehouseServiceType
[**addWarehouseServiceTypeFileByURL**](WarehouseServiceTypeApi.md#addWarehouseServiceTypeFileByURL) | **POST** /v3.0/warehouseServiceType/{warehouseServiceTypeId}/file | Attach a file to a warehouseServiceType by URL.
[**addWarehouseServiceTypeTag**](WarehouseServiceTypeApi.md#addWarehouseServiceTypeTag) | **PUT** /v3.0/warehouseServiceType/{warehouseServiceTypeId}/tag/{warehouseServiceTypeTag} | Add new tags for a warehouseServiceType.
[**deleteWarehouseServiceType**](WarehouseServiceTypeApi.md#deleteWarehouseServiceType) | **DELETE** /v3.0/warehouseServiceType/{warehouseServiceTypeId} | Delete a warehouseServiceType
[**deleteWarehouseServiceTypeFile**](WarehouseServiceTypeApi.md#deleteWarehouseServiceTypeFile) | **DELETE** /v3.0/warehouseServiceType/{warehouseServiceTypeId}/file/{fileId} | Delete a file for a warehouseServiceType.
[**deleteWarehouseServiceTypeTag**](WarehouseServiceTypeApi.md#deleteWarehouseServiceTypeTag) | **DELETE** /v3.0/warehouseServiceType/{warehouseServiceTypeId}/tag/{warehouseServiceTypeTag} | Delete a tag for a warehouseServiceType.
[**getDuplicateWarehouseServiceTypeById**](WarehouseServiceTypeApi.md#getDuplicateWarehouseServiceTypeById) | **GET** /v3.0/warehouseServiceType/duplicate/{warehouseServiceTypeId} | Get a duplicated a warehouseServiceType by id
[**getWarehouseServiceTypeByFilter**](WarehouseServiceTypeApi.md#getWarehouseServiceTypeByFilter) | **GET** /v3.0/warehouseServiceType/search | Search warehouseServiceTypes by filter
[**getWarehouseServiceTypeById**](WarehouseServiceTypeApi.md#getWarehouseServiceTypeById) | **GET** /v3.0/warehouseServiceType/{warehouseServiceTypeId} | Get a warehouseServiceType by id
[**getWarehouseServiceTypeFiles**](WarehouseServiceTypeApi.md#getWarehouseServiceTypeFiles) | **GET** /v3.0/warehouseServiceType/{warehouseServiceTypeId}/file | Get the files for a warehouseServiceType.
[**getWarehouseServiceTypeTags**](WarehouseServiceTypeApi.md#getWarehouseServiceTypeTags) | **GET** /v3.0/warehouseServiceType/{warehouseServiceTypeId}/tag | Get the tags for a warehouseServiceType.
[**updateWarehouseServiceType**](WarehouseServiceTypeApi.md#updateWarehouseServiceType) | **PUT** /v3.0/warehouseServiceType | Update a warehouseServiceType
[**updateWarehouseServiceTypeCustomFields**](WarehouseServiceTypeApi.md#updateWarehouseServiceTypeCustomFields) | **PUT** /v3.0/warehouseServiceType/customFields | Update a warehouseServiceType custom fields


<a name="addWarehouseServiceType"></a>
# **addWarehouseServiceType**
> WarehouseServiceType addWarehouseServiceType(body)

Create a warehouseServiceType

Inserts a new warehouseServiceType using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseServiceTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseServiceTypeApi apiInstance = new WarehouseServiceTypeApi();
WarehouseServiceType body = new WarehouseServiceType(); // WarehouseServiceType | WarehouseServiceType to be inserted.
try {
    WarehouseServiceType result = apiInstance.addWarehouseServiceType(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseServiceTypeApi#addWarehouseServiceType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WarehouseServiceType**](WarehouseServiceType.md)| WarehouseServiceType to be inserted. |

### Return type

[**WarehouseServiceType**](WarehouseServiceType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addWarehouseServiceTypeAudit"></a>
# **addWarehouseServiceTypeAudit**
> addWarehouseServiceTypeAudit(warehouseServiceTypeId, warehouseServiceTypeAudit)

Add new audit for a warehouseServiceType

Adds an audit to an existing warehouseServiceType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseServiceTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseServiceTypeApi apiInstance = new WarehouseServiceTypeApi();
Integer warehouseServiceTypeId = 56; // Integer | Id of the warehouseServiceType to add an audit to
String warehouseServiceTypeAudit = "warehouseServiceTypeAudit_example"; // String | The audit to add
try {
    apiInstance.addWarehouseServiceTypeAudit(warehouseServiceTypeId, warehouseServiceTypeAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseServiceTypeApi#addWarehouseServiceTypeAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseServiceTypeId** | **Integer**| Id of the warehouseServiceType to add an audit to |
 **warehouseServiceTypeAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addWarehouseServiceTypeFile"></a>
# **addWarehouseServiceTypeFile**
> addWarehouseServiceTypeFile(warehouseServiceTypeId, fileName)

Attach a file to a warehouseServiceType

Adds a file to an existing warehouseServiceType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseServiceTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseServiceTypeApi apiInstance = new WarehouseServiceTypeApi();
Integer warehouseServiceTypeId = 56; // Integer | Id of the warehouseServiceType to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addWarehouseServiceTypeFile(warehouseServiceTypeId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseServiceTypeApi#addWarehouseServiceTypeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseServiceTypeId** | **Integer**| Id of the warehouseServiceType to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addWarehouseServiceTypeFileByURL"></a>
# **addWarehouseServiceTypeFileByURL**
> addWarehouseServiceTypeFileByURL(body, warehouseServiceTypeId)

Attach a file to a warehouseServiceType by URL.

Adds a file to an existing warehouseServiceType by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseServiceTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseServiceTypeApi apiInstance = new WarehouseServiceTypeApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer warehouseServiceTypeId = 56; // Integer | Id of the warehouseServiceType to add an file to
try {
    apiInstance.addWarehouseServiceTypeFileByURL(body, warehouseServiceTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseServiceTypeApi#addWarehouseServiceTypeFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **warehouseServiceTypeId** | **Integer**| Id of the warehouseServiceType to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addWarehouseServiceTypeTag"></a>
# **addWarehouseServiceTypeTag**
> addWarehouseServiceTypeTag(warehouseServiceTypeId, warehouseServiceTypeTag)

Add new tags for a warehouseServiceType.

Adds a tag to an existing warehouseServiceType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseServiceTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseServiceTypeApi apiInstance = new WarehouseServiceTypeApi();
Integer warehouseServiceTypeId = 56; // Integer | Id of the warehouseServiceType to add a tag to
String warehouseServiceTypeTag = "warehouseServiceTypeTag_example"; // String | The tag to add
try {
    apiInstance.addWarehouseServiceTypeTag(warehouseServiceTypeId, warehouseServiceTypeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseServiceTypeApi#addWarehouseServiceTypeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseServiceTypeId** | **Integer**| Id of the warehouseServiceType to add a tag to |
 **warehouseServiceTypeTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWarehouseServiceType"></a>
# **deleteWarehouseServiceType**
> deleteWarehouseServiceType(warehouseServiceTypeId)

Delete a warehouseServiceType

Deletes the warehouseServiceType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseServiceTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseServiceTypeApi apiInstance = new WarehouseServiceTypeApi();
Integer warehouseServiceTypeId = 56; // Integer | Id of the warehouseServiceType to be deleted.
try {
    apiInstance.deleteWarehouseServiceType(warehouseServiceTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseServiceTypeApi#deleteWarehouseServiceType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseServiceTypeId** | **Integer**| Id of the warehouseServiceType to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWarehouseServiceTypeFile"></a>
# **deleteWarehouseServiceTypeFile**
> deleteWarehouseServiceTypeFile(warehouseServiceTypeId, fileId)

Delete a file for a warehouseServiceType.

Deletes an existing warehouseServiceType file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseServiceTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseServiceTypeApi apiInstance = new WarehouseServiceTypeApi();
Integer warehouseServiceTypeId = 56; // Integer | Id of the warehouseServiceType to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteWarehouseServiceTypeFile(warehouseServiceTypeId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseServiceTypeApi#deleteWarehouseServiceTypeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseServiceTypeId** | **Integer**| Id of the warehouseServiceType to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWarehouseServiceTypeTag"></a>
# **deleteWarehouseServiceTypeTag**
> deleteWarehouseServiceTypeTag(warehouseServiceTypeId, warehouseServiceTypeTag)

Delete a tag for a warehouseServiceType.

Deletes an existing warehouseServiceType tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseServiceTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseServiceTypeApi apiInstance = new WarehouseServiceTypeApi();
Integer warehouseServiceTypeId = 56; // Integer | Id of the warehouseServiceType to remove tag from
String warehouseServiceTypeTag = "warehouseServiceTypeTag_example"; // String | The tag to delete
try {
    apiInstance.deleteWarehouseServiceTypeTag(warehouseServiceTypeId, warehouseServiceTypeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseServiceTypeApi#deleteWarehouseServiceTypeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseServiceTypeId** | **Integer**| Id of the warehouseServiceType to remove tag from |
 **warehouseServiceTypeTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateWarehouseServiceTypeById"></a>
# **getDuplicateWarehouseServiceTypeById**
> WarehouseServiceType getDuplicateWarehouseServiceTypeById(warehouseServiceTypeId)

Get a duplicated a warehouseServiceType by id

Returns a duplicated warehouseServiceType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseServiceTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseServiceTypeApi apiInstance = new WarehouseServiceTypeApi();
Integer warehouseServiceTypeId = 56; // Integer | Id of the warehouseServiceType to be duplicated.
try {
    WarehouseServiceType result = apiInstance.getDuplicateWarehouseServiceTypeById(warehouseServiceTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseServiceTypeApi#getDuplicateWarehouseServiceTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseServiceTypeId** | **Integer**| Id of the warehouseServiceType to be duplicated. |

### Return type

[**WarehouseServiceType**](WarehouseServiceType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarehouseServiceTypeByFilter"></a>
# **getWarehouseServiceTypeByFilter**
> List&lt;WarehouseServiceType&gt; getWarehouseServiceTypeByFilter(filter, page, limit, sort)

Search warehouseServiceTypes by filter

Returns the list of warehouseServiceTypes that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseServiceTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseServiceTypeApi apiInstance = new WarehouseServiceTypeApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<WarehouseServiceType> result = apiInstance.getWarehouseServiceTypeByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseServiceTypeApi#getWarehouseServiceTypeByFilter");
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

[**List&lt;WarehouseServiceType&gt;**](WarehouseServiceType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarehouseServiceTypeById"></a>
# **getWarehouseServiceTypeById**
> WarehouseServiceType getWarehouseServiceTypeById(warehouseServiceTypeId)

Get a warehouseServiceType by id

Returns the warehouseServiceType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseServiceTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseServiceTypeApi apiInstance = new WarehouseServiceTypeApi();
Integer warehouseServiceTypeId = 56; // Integer | Id of the warehouseServiceType to be returned.
try {
    WarehouseServiceType result = apiInstance.getWarehouseServiceTypeById(warehouseServiceTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseServiceTypeApi#getWarehouseServiceTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseServiceTypeId** | **Integer**| Id of the warehouseServiceType to be returned. |

### Return type

[**WarehouseServiceType**](WarehouseServiceType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarehouseServiceTypeFiles"></a>
# **getWarehouseServiceTypeFiles**
> getWarehouseServiceTypeFiles(warehouseServiceTypeId)

Get the files for a warehouseServiceType.

Get all existing warehouseServiceType files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseServiceTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseServiceTypeApi apiInstance = new WarehouseServiceTypeApi();
Integer warehouseServiceTypeId = 56; // Integer | Id of the warehouseServiceType to get files for
try {
    apiInstance.getWarehouseServiceTypeFiles(warehouseServiceTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseServiceTypeApi#getWarehouseServiceTypeFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseServiceTypeId** | **Integer**| Id of the warehouseServiceType to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarehouseServiceTypeTags"></a>
# **getWarehouseServiceTypeTags**
> getWarehouseServiceTypeTags(warehouseServiceTypeId)

Get the tags for a warehouseServiceType.

Get all existing warehouseServiceType tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseServiceTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseServiceTypeApi apiInstance = new WarehouseServiceTypeApi();
Integer warehouseServiceTypeId = 56; // Integer | Id of the warehouseServiceType to get tags for
try {
    apiInstance.getWarehouseServiceTypeTags(warehouseServiceTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseServiceTypeApi#getWarehouseServiceTypeTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseServiceTypeId** | **Integer**| Id of the warehouseServiceType to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWarehouseServiceType"></a>
# **updateWarehouseServiceType**
> updateWarehouseServiceType(body)

Update a warehouseServiceType

Updates an existing warehouseServiceType using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseServiceTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseServiceTypeApi apiInstance = new WarehouseServiceTypeApi();
WarehouseServiceType body = new WarehouseServiceType(); // WarehouseServiceType | WarehouseServiceType to be updated.
try {
    apiInstance.updateWarehouseServiceType(body);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseServiceTypeApi#updateWarehouseServiceType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WarehouseServiceType**](WarehouseServiceType.md)| WarehouseServiceType to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWarehouseServiceTypeCustomFields"></a>
# **updateWarehouseServiceTypeCustomFields**
> updateWarehouseServiceTypeCustomFields(body)

Update a warehouseServiceType custom fields

Updates an existing warehouseServiceType custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseServiceTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseServiceTypeApi apiInstance = new WarehouseServiceTypeApi();
WarehouseServiceType body = new WarehouseServiceType(); // WarehouseServiceType | WarehouseServiceType to be updated.
try {
    apiInstance.updateWarehouseServiceTypeCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseServiceTypeApi#updateWarehouseServiceTypeCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WarehouseServiceType**](WarehouseServiceType.md)| WarehouseServiceType to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

