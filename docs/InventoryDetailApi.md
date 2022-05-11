# InventoryDetailApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInventoryDetailAudit**](InventoryDetailApi.md#addInventoryDetailAudit) | **PUT** /v3.0/inventoryDetail/{inventoryDetailId}/audit/{inventoryDetailAudit} | Add new audit for an inventoryDetail
[**addInventoryDetailFile**](InventoryDetailApi.md#addInventoryDetailFile) | **POST** /v3.0/inventoryDetail/{inventoryDetailId}/file/{fileName} | Attach a file to an inventoryDetail
[**addInventoryDetailFileByURL**](InventoryDetailApi.md#addInventoryDetailFileByURL) | **POST** /v3.0/inventoryDetail/{inventoryDetailId}/file | Attach a file to an inventoryDetail by URL.
[**addInventoryDetailTag**](InventoryDetailApi.md#addInventoryDetailTag) | **PUT** /v3.0/inventoryDetail/{inventoryDetailId}/tag/{inventoryDetailTag} | Add new tags for an inventoryDetail.
[**deleteInventoryDetailFile**](InventoryDetailApi.md#deleteInventoryDetailFile) | **DELETE** /v3.0/inventoryDetail/{inventoryDetailId}/file/{fileId} | Delete a file for an inventoryDetail.
[**deleteInventoryDetailTag**](InventoryDetailApi.md#deleteInventoryDetailTag) | **DELETE** /v3.0/inventoryDetail/{inventoryDetailId}/tag/{inventoryDetailTag} | Delete a tag for an inventoryDetail.
[**getDuplicateInventoryDetailById**](InventoryDetailApi.md#getDuplicateInventoryDetailById) | **GET** /v3.0/inventoryDetail/duplicate/{inventoryDetailId} | Get a duplicated an inventoryDetail by id
[**getInventoryDetailByFilter**](InventoryDetailApi.md#getInventoryDetailByFilter) | **GET** /v3.0/inventoryDetail/search | Search inventoryDetails by filter
[**getInventoryDetailById**](InventoryDetailApi.md#getInventoryDetailById) | **GET** /v3.0/inventoryDetail/{inventoryDetailId} | Get an inventoryDetail by id
[**getInventoryDetailFiles**](InventoryDetailApi.md#getInventoryDetailFiles) | **GET** /v3.0/inventoryDetail/{inventoryDetailId}/file | Get the files for an inventoryDetail.
[**getInventoryDetailTags**](InventoryDetailApi.md#getInventoryDetailTags) | **GET** /v3.0/inventoryDetail/{inventoryDetailId}/tag | Get the tags for an inventoryDetail.
[**updateInventoryDetailCustomFields**](InventoryDetailApi.md#updateInventoryDetailCustomFields) | **PUT** /v3.0/inventoryDetail/customFields | Update an inventoryDetail custom fields


<a name="addInventoryDetailAudit"></a>
# **addInventoryDetailAudit**
> addInventoryDetailAudit(inventoryDetailId, inventoryDetailAudit)

Add new audit for an inventoryDetail

Adds an audit to an existing inventoryDetail.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryDetailApi apiInstance = new InventoryDetailApi();
Integer inventoryDetailId = 56; // Integer | Id of the inventoryDetail to add an audit to
String inventoryDetailAudit = "inventoryDetailAudit_example"; // String | The audit to add
try {
    apiInstance.addInventoryDetailAudit(inventoryDetailId, inventoryDetailAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryDetailApi#addInventoryDetailAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryDetailId** | **Integer**| Id of the inventoryDetail to add an audit to |
 **inventoryDetailAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addInventoryDetailFile"></a>
# **addInventoryDetailFile**
> addInventoryDetailFile(inventoryDetailId, fileName)

Attach a file to an inventoryDetail

Adds a file to an existing inventoryDetail.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryDetailApi apiInstance = new InventoryDetailApi();
Integer inventoryDetailId = 56; // Integer | Id of the inventoryDetail to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addInventoryDetailFile(inventoryDetailId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryDetailApi#addInventoryDetailFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryDetailId** | **Integer**| Id of the inventoryDetail to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addInventoryDetailFileByURL"></a>
# **addInventoryDetailFileByURL**
> addInventoryDetailFileByURL(body, inventoryDetailId)

Attach a file to an inventoryDetail by URL.

Adds a file to an existing inventoryDetail by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryDetailApi apiInstance = new InventoryDetailApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer inventoryDetailId = 56; // Integer | Id of the inventoryDetail to add an file to
try {
    apiInstance.addInventoryDetailFileByURL(body, inventoryDetailId);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryDetailApi#addInventoryDetailFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **inventoryDetailId** | **Integer**| Id of the inventoryDetail to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addInventoryDetailTag"></a>
# **addInventoryDetailTag**
> addInventoryDetailTag(inventoryDetailId, inventoryDetailTag)

Add new tags for an inventoryDetail.

Adds a tag to an existing inventoryDetail.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryDetailApi apiInstance = new InventoryDetailApi();
Integer inventoryDetailId = 56; // Integer | Id of the inventoryDetail to add a tag to
String inventoryDetailTag = "inventoryDetailTag_example"; // String | The tag to add
try {
    apiInstance.addInventoryDetailTag(inventoryDetailId, inventoryDetailTag);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryDetailApi#addInventoryDetailTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryDetailId** | **Integer**| Id of the inventoryDetail to add a tag to |
 **inventoryDetailTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteInventoryDetailFile"></a>
# **deleteInventoryDetailFile**
> deleteInventoryDetailFile(inventoryDetailId, fileId)

Delete a file for an inventoryDetail.

Deletes an existing inventoryDetail file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryDetailApi apiInstance = new InventoryDetailApi();
Integer inventoryDetailId = 56; // Integer | Id of the inventoryDetail to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteInventoryDetailFile(inventoryDetailId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryDetailApi#deleteInventoryDetailFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryDetailId** | **Integer**| Id of the inventoryDetail to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteInventoryDetailTag"></a>
# **deleteInventoryDetailTag**
> deleteInventoryDetailTag(inventoryDetailId, inventoryDetailTag)

Delete a tag for an inventoryDetail.

Deletes an existing inventoryDetail tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryDetailApi apiInstance = new InventoryDetailApi();
Integer inventoryDetailId = 56; // Integer | Id of the inventoryDetail to remove tag from
String inventoryDetailTag = "inventoryDetailTag_example"; // String | The tag to delete
try {
    apiInstance.deleteInventoryDetailTag(inventoryDetailId, inventoryDetailTag);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryDetailApi#deleteInventoryDetailTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryDetailId** | **Integer**| Id of the inventoryDetail to remove tag from |
 **inventoryDetailTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateInventoryDetailById"></a>
# **getDuplicateInventoryDetailById**
> InventoryDetail getDuplicateInventoryDetailById(inventoryDetailId)

Get a duplicated an inventoryDetail by id

Returns a duplicated inventoryDetail identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryDetailApi apiInstance = new InventoryDetailApi();
Integer inventoryDetailId = 56; // Integer | Id of the inventoryDetail to be duplicated.
try {
    InventoryDetail result = apiInstance.getDuplicateInventoryDetailById(inventoryDetailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryDetailApi#getDuplicateInventoryDetailById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryDetailId** | **Integer**| Id of the inventoryDetail to be duplicated. |

### Return type

[**InventoryDetail**](InventoryDetail.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventoryDetailByFilter"></a>
# **getInventoryDetailByFilter**
> List&lt;InventoryDetail&gt; getInventoryDetailByFilter(filter, page, limit, sort)

Search inventoryDetails by filter

Returns the list of inventoryDetails that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryDetailApi apiInstance = new InventoryDetailApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<InventoryDetail> result = apiInstance.getInventoryDetailByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryDetailApi#getInventoryDetailByFilter");
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

[**List&lt;InventoryDetail&gt;**](InventoryDetail.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventoryDetailById"></a>
# **getInventoryDetailById**
> InventoryDetail getInventoryDetailById(inventoryDetailId)

Get an inventoryDetail by id

Returns the inventoryDetail identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryDetailApi apiInstance = new InventoryDetailApi();
Integer inventoryDetailId = 56; // Integer | Id of the inventoryDetail to be returned.
try {
    InventoryDetail result = apiInstance.getInventoryDetailById(inventoryDetailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryDetailApi#getInventoryDetailById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryDetailId** | **Integer**| Id of the inventoryDetail to be returned. |

### Return type

[**InventoryDetail**](InventoryDetail.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventoryDetailFiles"></a>
# **getInventoryDetailFiles**
> getInventoryDetailFiles(inventoryDetailId)

Get the files for an inventoryDetail.

Get all existing inventoryDetail files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryDetailApi apiInstance = new InventoryDetailApi();
Integer inventoryDetailId = 56; // Integer | Id of the inventoryDetail to get files for
try {
    apiInstance.getInventoryDetailFiles(inventoryDetailId);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryDetailApi#getInventoryDetailFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryDetailId** | **Integer**| Id of the inventoryDetail to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventoryDetailTags"></a>
# **getInventoryDetailTags**
> getInventoryDetailTags(inventoryDetailId)

Get the tags for an inventoryDetail.

Get all existing inventoryDetail tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryDetailApi apiInstance = new InventoryDetailApi();
Integer inventoryDetailId = 56; // Integer | Id of the inventoryDetail to get tags for
try {
    apiInstance.getInventoryDetailTags(inventoryDetailId);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryDetailApi#getInventoryDetailTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryDetailId** | **Integer**| Id of the inventoryDetail to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateInventoryDetailCustomFields"></a>
# **updateInventoryDetailCustomFields**
> updateInventoryDetailCustomFields(body)

Update an inventoryDetail custom fields

Updates an existing inventoryDetail custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryDetailApi apiInstance = new InventoryDetailApi();
InventoryDetail body = new InventoryDetail(); // InventoryDetail | InventoryDetail to be updated.
try {
    apiInstance.updateInventoryDetailCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryDetailApi#updateInventoryDetailCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InventoryDetail**](InventoryDetail.md)| InventoryDetail to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

