# ItemLowstockCodeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addItemLowstockCode**](ItemLowstockCodeApi.md#addItemLowstockCode) | **POST** /beta/itemLowstockCode | Create an itemLowstockCode
[**addItemLowstockCodeAudit**](ItemLowstockCodeApi.md#addItemLowstockCodeAudit) | **PUT** /beta/itemLowstockCode/{itemLowstockCodeId}/audit/{itemLowstockCodeAudit} | Add new audit for an itemLowstockCode
[**addItemLowstockCodeFile**](ItemLowstockCodeApi.md#addItemLowstockCodeFile) | **POST** /beta/itemLowstockCode/{itemLowstockCodeId}/file/{fileName} | Attach a file to an itemLowstockCode
[**addItemLowstockCodeFileByURL**](ItemLowstockCodeApi.md#addItemLowstockCodeFileByURL) | **POST** /beta/itemLowstockCode/{itemLowstockCodeId}/file | Attach a file to an itemLowstockCode by URL.
[**addItemLowstockCodeTag**](ItemLowstockCodeApi.md#addItemLowstockCodeTag) | **PUT** /beta/itemLowstockCode/{itemLowstockCodeId}/tag/{itemLowstockCodeTag} | Add new tags for an itemLowstockCode.
[**deleteItemLowstockCode**](ItemLowstockCodeApi.md#deleteItemLowstockCode) | **DELETE** /beta/itemLowstockCode/{itemLowstockCodeId} | Delete an itemLowstockCode
[**deleteItemLowstockCodeFile**](ItemLowstockCodeApi.md#deleteItemLowstockCodeFile) | **DELETE** /beta/itemLowstockCode/{itemLowstockCodeId}/file/{fileId} | Delete a file for an itemLowstockCode.
[**deleteItemLowstockCodeTag**](ItemLowstockCodeApi.md#deleteItemLowstockCodeTag) | **DELETE** /beta/itemLowstockCode/{itemLowstockCodeId}/tag/{itemLowstockCodeTag} | Delete a tag for an itemLowstockCode.
[**getDuplicateItemLowstockCodeById**](ItemLowstockCodeApi.md#getDuplicateItemLowstockCodeById) | **GET** /beta/itemLowstockCode/duplicate/{itemLowstockCodeId} | Get a duplicated an itemLowstockCode by id
[**getItemLowstockCodeByFilter**](ItemLowstockCodeApi.md#getItemLowstockCodeByFilter) | **GET** /beta/itemLowstockCode/search | Search itemLowstockCodes by filter
[**getItemLowstockCodeById**](ItemLowstockCodeApi.md#getItemLowstockCodeById) | **GET** /beta/itemLowstockCode/{itemLowstockCodeId} | Get an itemLowstockCode by id
[**getItemLowstockCodeFiles**](ItemLowstockCodeApi.md#getItemLowstockCodeFiles) | **GET** /beta/itemLowstockCode/{itemLowstockCodeId}/file | Get the files for an itemLowstockCode.
[**getItemLowstockCodeTags**](ItemLowstockCodeApi.md#getItemLowstockCodeTags) | **GET** /beta/itemLowstockCode/{itemLowstockCodeId}/tag | Get the tags for an itemLowstockCode.
[**updateItemLowstockCode**](ItemLowstockCodeApi.md#updateItemLowstockCode) | **PUT** /beta/itemLowstockCode | Update an itemLowstockCode


<a name="addItemLowstockCode"></a>
# **addItemLowstockCode**
> ItemLowstockCode addItemLowstockCode(body)

Create an itemLowstockCode

Inserts a new itemLowstockCode using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemLowstockCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemLowstockCodeApi apiInstance = new ItemLowstockCodeApi();
ItemLowstockCode body = new ItemLowstockCode(); // ItemLowstockCode | ItemLowstockCode to be inserted.
try {
    ItemLowstockCode result = apiInstance.addItemLowstockCode(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemLowstockCodeApi#addItemLowstockCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemLowstockCode**](ItemLowstockCode.md)| ItemLowstockCode to be inserted. |

### Return type

[**ItemLowstockCode**](ItemLowstockCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemLowstockCodeAudit"></a>
# **addItemLowstockCodeAudit**
> addItemLowstockCodeAudit(itemLowstockCodeId, itemLowstockCodeAudit)

Add new audit for an itemLowstockCode

Adds an audit to an existing itemLowstockCode.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemLowstockCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemLowstockCodeApi apiInstance = new ItemLowstockCodeApi();
Integer itemLowstockCodeId = 56; // Integer | Id of the itemLowstockCode to add an audit to
String itemLowstockCodeAudit = "itemLowstockCodeAudit_example"; // String | The audit to add
try {
    apiInstance.addItemLowstockCodeAudit(itemLowstockCodeId, itemLowstockCodeAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemLowstockCodeApi#addItemLowstockCodeAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemLowstockCodeId** | **Integer**| Id of the itemLowstockCode to add an audit to |
 **itemLowstockCodeAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemLowstockCodeFile"></a>
# **addItemLowstockCodeFile**
> addItemLowstockCodeFile(itemLowstockCodeId, fileName)

Attach a file to an itemLowstockCode

Adds a file to an existing itemLowstockCode.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemLowstockCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemLowstockCodeApi apiInstance = new ItemLowstockCodeApi();
Integer itemLowstockCodeId = 56; // Integer | Id of the itemLowstockCode to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addItemLowstockCodeFile(itemLowstockCodeId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemLowstockCodeApi#addItemLowstockCodeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemLowstockCodeId** | **Integer**| Id of the itemLowstockCode to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addItemLowstockCodeFileByURL"></a>
# **addItemLowstockCodeFileByURL**
> addItemLowstockCodeFileByURL(body, itemLowstockCodeId)

Attach a file to an itemLowstockCode by URL.

Adds a file to an existing itemLowstockCode by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemLowstockCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemLowstockCodeApi apiInstance = new ItemLowstockCodeApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer itemLowstockCodeId = 56; // Integer | Id of the itemLowstockCode to add an file to
try {
    apiInstance.addItemLowstockCodeFileByURL(body, itemLowstockCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemLowstockCodeApi#addItemLowstockCodeFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **itemLowstockCodeId** | **Integer**| Id of the itemLowstockCode to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemLowstockCodeTag"></a>
# **addItemLowstockCodeTag**
> addItemLowstockCodeTag(itemLowstockCodeId, itemLowstockCodeTag)

Add new tags for an itemLowstockCode.

Adds a tag to an existing itemLowstockCode.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemLowstockCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemLowstockCodeApi apiInstance = new ItemLowstockCodeApi();
Integer itemLowstockCodeId = 56; // Integer | Id of the itemLowstockCode to add a tag to
String itemLowstockCodeTag = "itemLowstockCodeTag_example"; // String | The tag to add
try {
    apiInstance.addItemLowstockCodeTag(itemLowstockCodeId, itemLowstockCodeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemLowstockCodeApi#addItemLowstockCodeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemLowstockCodeId** | **Integer**| Id of the itemLowstockCode to add a tag to |
 **itemLowstockCodeTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemLowstockCode"></a>
# **deleteItemLowstockCode**
> deleteItemLowstockCode(itemLowstockCodeId)

Delete an itemLowstockCode

Deletes the itemLowstockCode identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemLowstockCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemLowstockCodeApi apiInstance = new ItemLowstockCodeApi();
Integer itemLowstockCodeId = 56; // Integer | Id of the itemLowstockCode to be deleted.
try {
    apiInstance.deleteItemLowstockCode(itemLowstockCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemLowstockCodeApi#deleteItemLowstockCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemLowstockCodeId** | **Integer**| Id of the itemLowstockCode to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteItemLowstockCodeFile"></a>
# **deleteItemLowstockCodeFile**
> deleteItemLowstockCodeFile(itemLowstockCodeId, fileId)

Delete a file for an itemLowstockCode.

Deletes an existing itemLowstockCode file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemLowstockCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemLowstockCodeApi apiInstance = new ItemLowstockCodeApi();
Integer itemLowstockCodeId = 56; // Integer | Id of the itemLowstockCode to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteItemLowstockCodeFile(itemLowstockCodeId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemLowstockCodeApi#deleteItemLowstockCodeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemLowstockCodeId** | **Integer**| Id of the itemLowstockCode to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteItemLowstockCodeTag"></a>
# **deleteItemLowstockCodeTag**
> deleteItemLowstockCodeTag(itemLowstockCodeId, itemLowstockCodeTag)

Delete a tag for an itemLowstockCode.

Deletes an existing itemLowstockCode tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemLowstockCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemLowstockCodeApi apiInstance = new ItemLowstockCodeApi();
Integer itemLowstockCodeId = 56; // Integer | Id of the itemLowstockCode to remove tag from
String itemLowstockCodeTag = "itemLowstockCodeTag_example"; // String | The tag to delete
try {
    apiInstance.deleteItemLowstockCodeTag(itemLowstockCodeId, itemLowstockCodeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemLowstockCodeApi#deleteItemLowstockCodeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemLowstockCodeId** | **Integer**| Id of the itemLowstockCode to remove tag from |
 **itemLowstockCodeTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateItemLowstockCodeById"></a>
# **getDuplicateItemLowstockCodeById**
> ItemLowstockCode getDuplicateItemLowstockCodeById(itemLowstockCodeId)

Get a duplicated an itemLowstockCode by id

Returns a duplicated itemLowstockCode identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemLowstockCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemLowstockCodeApi apiInstance = new ItemLowstockCodeApi();
Integer itemLowstockCodeId = 56; // Integer | Id of the itemLowstockCode to be duplicated.
try {
    ItemLowstockCode result = apiInstance.getDuplicateItemLowstockCodeById(itemLowstockCodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemLowstockCodeApi#getDuplicateItemLowstockCodeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemLowstockCodeId** | **Integer**| Id of the itemLowstockCode to be duplicated. |

### Return type

[**ItemLowstockCode**](ItemLowstockCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemLowstockCodeByFilter"></a>
# **getItemLowstockCodeByFilter**
> List&lt;ItemLowstockCode&gt; getItemLowstockCodeByFilter(filter, page, limit, sort)

Search itemLowstockCodes by filter

Returns the list of itemLowstockCodes that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemLowstockCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemLowstockCodeApi apiInstance = new ItemLowstockCodeApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ItemLowstockCode> result = apiInstance.getItemLowstockCodeByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemLowstockCodeApi#getItemLowstockCodeByFilter");
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

[**List&lt;ItemLowstockCode&gt;**](ItemLowstockCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemLowstockCodeById"></a>
# **getItemLowstockCodeById**
> ItemLowstockCode getItemLowstockCodeById(itemLowstockCodeId)

Get an itemLowstockCode by id

Returns the itemLowstockCode identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemLowstockCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemLowstockCodeApi apiInstance = new ItemLowstockCodeApi();
Integer itemLowstockCodeId = 56; // Integer | Id of the itemLowstockCode to be returned.
try {
    ItemLowstockCode result = apiInstance.getItemLowstockCodeById(itemLowstockCodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemLowstockCodeApi#getItemLowstockCodeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemLowstockCodeId** | **Integer**| Id of the itemLowstockCode to be returned. |

### Return type

[**ItemLowstockCode**](ItemLowstockCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemLowstockCodeFiles"></a>
# **getItemLowstockCodeFiles**
> getItemLowstockCodeFiles(itemLowstockCodeId)

Get the files for an itemLowstockCode.

Get all existing itemLowstockCode files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemLowstockCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemLowstockCodeApi apiInstance = new ItemLowstockCodeApi();
Integer itemLowstockCodeId = 56; // Integer | Id of the itemLowstockCode to get files for
try {
    apiInstance.getItemLowstockCodeFiles(itemLowstockCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemLowstockCodeApi#getItemLowstockCodeFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemLowstockCodeId** | **Integer**| Id of the itemLowstockCode to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemLowstockCodeTags"></a>
# **getItemLowstockCodeTags**
> getItemLowstockCodeTags(itemLowstockCodeId)

Get the tags for an itemLowstockCode.

Get all existing itemLowstockCode tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemLowstockCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemLowstockCodeApi apiInstance = new ItemLowstockCodeApi();
Integer itemLowstockCodeId = 56; // Integer | Id of the itemLowstockCode to get tags for
try {
    apiInstance.getItemLowstockCodeTags(itemLowstockCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemLowstockCodeApi#getItemLowstockCodeTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemLowstockCodeId** | **Integer**| Id of the itemLowstockCode to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateItemLowstockCode"></a>
# **updateItemLowstockCode**
> updateItemLowstockCode(body)

Update an itemLowstockCode

Updates an existing itemLowstockCode using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemLowstockCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemLowstockCodeApi apiInstance = new ItemLowstockCodeApi();
ItemLowstockCode body = new ItemLowstockCode(); // ItemLowstockCode | ItemLowstockCode to be updated.
try {
    apiInstance.updateItemLowstockCode(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemLowstockCodeApi#updateItemLowstockCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemLowstockCode**](ItemLowstockCode.md)| ItemLowstockCode to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

