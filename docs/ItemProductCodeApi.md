# ItemProductCodeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addItemProductCode**](ItemProductCodeApi.md#addItemProductCode) | **POST** /beta/itemProductCode | Create an itemProductCode
[**addItemProductCodeAudit**](ItemProductCodeApi.md#addItemProductCodeAudit) | **PUT** /beta/itemProductCode/{itemProductCodeId}/audit/{itemProductCodeAudit} | Add new audit for an itemProductCode
[**addItemProductCodeFile**](ItemProductCodeApi.md#addItemProductCodeFile) | **POST** /beta/itemProductCode/{itemProductCodeId}/file/{fileName} | Attach a file to an itemProductCode
[**addItemProductCodeFileByURL**](ItemProductCodeApi.md#addItemProductCodeFileByURL) | **POST** /beta/itemProductCode/{itemProductCodeId}/file | Attach a file to an itemProductCode by URL.
[**addItemProductCodeTag**](ItemProductCodeApi.md#addItemProductCodeTag) | **PUT** /beta/itemProductCode/{itemProductCodeId}/tag/{itemProductCodeTag} | Add new tags for an itemProductCode.
[**deleteItemProductCode**](ItemProductCodeApi.md#deleteItemProductCode) | **DELETE** /beta/itemProductCode/{itemProductCodeId} | Delete an itemProductCode
[**deleteItemProductCodeFile**](ItemProductCodeApi.md#deleteItemProductCodeFile) | **DELETE** /beta/itemProductCode/{itemProductCodeId}/file/{fileId} | Delete a file for an itemProductCode.
[**deleteItemProductCodeTag**](ItemProductCodeApi.md#deleteItemProductCodeTag) | **DELETE** /beta/itemProductCode/{itemProductCodeId}/tag/{itemProductCodeTag} | Delete a tag for an itemProductCode.
[**getDuplicateItemProductCodeById**](ItemProductCodeApi.md#getDuplicateItemProductCodeById) | **GET** /beta/itemProductCode/duplicate/{itemProductCodeId} | Get a duplicated an itemProductCode by id
[**getItemProductCodeByFilter**](ItemProductCodeApi.md#getItemProductCodeByFilter) | **GET** /beta/itemProductCode/search | Search itemProductCodes by filter
[**getItemProductCodeById**](ItemProductCodeApi.md#getItemProductCodeById) | **GET** /beta/itemProductCode/{itemProductCodeId} | Get an itemProductCode by id
[**getItemProductCodeFiles**](ItemProductCodeApi.md#getItemProductCodeFiles) | **GET** /beta/itemProductCode/{itemProductCodeId}/file | Get the files for an itemProductCode.
[**getItemProductCodeTags**](ItemProductCodeApi.md#getItemProductCodeTags) | **GET** /beta/itemProductCode/{itemProductCodeId}/tag | Get the tags for an itemProductCode.
[**updateItemProductCode**](ItemProductCodeApi.md#updateItemProductCode) | **PUT** /beta/itemProductCode | Update an itemProductCode


<a name="addItemProductCode"></a>
# **addItemProductCode**
> ItemProductCode addItemProductCode(body)

Create an itemProductCode

Inserts a new itemProductCode using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemProductCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemProductCodeApi apiInstance = new ItemProductCodeApi();
ItemProductCode body = new ItemProductCode(); // ItemProductCode | ItemProductCode to be inserted.
try {
    ItemProductCode result = apiInstance.addItemProductCode(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemProductCodeApi#addItemProductCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemProductCode**](ItemProductCode.md)| ItemProductCode to be inserted. |

### Return type

[**ItemProductCode**](ItemProductCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemProductCodeAudit"></a>
# **addItemProductCodeAudit**
> addItemProductCodeAudit(itemProductCodeId, itemProductCodeAudit)

Add new audit for an itemProductCode

Adds an audit to an existing itemProductCode.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemProductCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemProductCodeApi apiInstance = new ItemProductCodeApi();
Integer itemProductCodeId = 56; // Integer | Id of the itemProductCode to add an audit to
String itemProductCodeAudit = "itemProductCodeAudit_example"; // String | The audit to add
try {
    apiInstance.addItemProductCodeAudit(itemProductCodeId, itemProductCodeAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemProductCodeApi#addItemProductCodeAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemProductCodeId** | **Integer**| Id of the itemProductCode to add an audit to |
 **itemProductCodeAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemProductCodeFile"></a>
# **addItemProductCodeFile**
> addItemProductCodeFile(itemProductCodeId, fileName)

Attach a file to an itemProductCode

Adds a file to an existing itemProductCode.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemProductCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemProductCodeApi apiInstance = new ItemProductCodeApi();
Integer itemProductCodeId = 56; // Integer | Id of the itemProductCode to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addItemProductCodeFile(itemProductCodeId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemProductCodeApi#addItemProductCodeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemProductCodeId** | **Integer**| Id of the itemProductCode to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addItemProductCodeFileByURL"></a>
# **addItemProductCodeFileByURL**
> addItemProductCodeFileByURL(body, itemProductCodeId)

Attach a file to an itemProductCode by URL.

Adds a file to an existing itemProductCode by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemProductCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemProductCodeApi apiInstance = new ItemProductCodeApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer itemProductCodeId = 56; // Integer | Id of the itemProductCode to add an file to
try {
    apiInstance.addItemProductCodeFileByURL(body, itemProductCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemProductCodeApi#addItemProductCodeFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **itemProductCodeId** | **Integer**| Id of the itemProductCode to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemProductCodeTag"></a>
# **addItemProductCodeTag**
> addItemProductCodeTag(itemProductCodeId, itemProductCodeTag)

Add new tags for an itemProductCode.

Adds a tag to an existing itemProductCode.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemProductCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemProductCodeApi apiInstance = new ItemProductCodeApi();
Integer itemProductCodeId = 56; // Integer | Id of the itemProductCode to add a tag to
String itemProductCodeTag = "itemProductCodeTag_example"; // String | The tag to add
try {
    apiInstance.addItemProductCodeTag(itemProductCodeId, itemProductCodeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemProductCodeApi#addItemProductCodeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemProductCodeId** | **Integer**| Id of the itemProductCode to add a tag to |
 **itemProductCodeTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemProductCode"></a>
# **deleteItemProductCode**
> deleteItemProductCode(itemProductCodeId)

Delete an itemProductCode

Deletes the itemProductCode identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemProductCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemProductCodeApi apiInstance = new ItemProductCodeApi();
Integer itemProductCodeId = 56; // Integer | Id of the itemProductCode to be deleted.
try {
    apiInstance.deleteItemProductCode(itemProductCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemProductCodeApi#deleteItemProductCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemProductCodeId** | **Integer**| Id of the itemProductCode to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteItemProductCodeFile"></a>
# **deleteItemProductCodeFile**
> deleteItemProductCodeFile(itemProductCodeId, fileId)

Delete a file for an itemProductCode.

Deletes an existing itemProductCode file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemProductCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemProductCodeApi apiInstance = new ItemProductCodeApi();
Integer itemProductCodeId = 56; // Integer | Id of the itemProductCode to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteItemProductCodeFile(itemProductCodeId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemProductCodeApi#deleteItemProductCodeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemProductCodeId** | **Integer**| Id of the itemProductCode to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteItemProductCodeTag"></a>
# **deleteItemProductCodeTag**
> deleteItemProductCodeTag(itemProductCodeId, itemProductCodeTag)

Delete a tag for an itemProductCode.

Deletes an existing itemProductCode tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemProductCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemProductCodeApi apiInstance = new ItemProductCodeApi();
Integer itemProductCodeId = 56; // Integer | Id of the itemProductCode to remove tag from
String itemProductCodeTag = "itemProductCodeTag_example"; // String | The tag to delete
try {
    apiInstance.deleteItemProductCodeTag(itemProductCodeId, itemProductCodeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemProductCodeApi#deleteItemProductCodeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemProductCodeId** | **Integer**| Id of the itemProductCode to remove tag from |
 **itemProductCodeTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateItemProductCodeById"></a>
# **getDuplicateItemProductCodeById**
> ItemProductCode getDuplicateItemProductCodeById(itemProductCodeId)

Get a duplicated an itemProductCode by id

Returns a duplicated itemProductCode identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemProductCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemProductCodeApi apiInstance = new ItemProductCodeApi();
Integer itemProductCodeId = 56; // Integer | Id of the itemProductCode to be duplicated.
try {
    ItemProductCode result = apiInstance.getDuplicateItemProductCodeById(itemProductCodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemProductCodeApi#getDuplicateItemProductCodeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemProductCodeId** | **Integer**| Id of the itemProductCode to be duplicated. |

### Return type

[**ItemProductCode**](ItemProductCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemProductCodeByFilter"></a>
# **getItemProductCodeByFilter**
> List&lt;ItemProductCode&gt; getItemProductCodeByFilter(filter, page, limit, sort)

Search itemProductCodes by filter

Returns the list of itemProductCodes that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemProductCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemProductCodeApi apiInstance = new ItemProductCodeApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ItemProductCode> result = apiInstance.getItemProductCodeByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemProductCodeApi#getItemProductCodeByFilter");
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

[**List&lt;ItemProductCode&gt;**](ItemProductCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemProductCodeById"></a>
# **getItemProductCodeById**
> ItemProductCode getItemProductCodeById(itemProductCodeId)

Get an itemProductCode by id

Returns the itemProductCode identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemProductCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemProductCodeApi apiInstance = new ItemProductCodeApi();
Integer itemProductCodeId = 56; // Integer | Id of the itemProductCode to be returned.
try {
    ItemProductCode result = apiInstance.getItemProductCodeById(itemProductCodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemProductCodeApi#getItemProductCodeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemProductCodeId** | **Integer**| Id of the itemProductCode to be returned. |

### Return type

[**ItemProductCode**](ItemProductCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemProductCodeFiles"></a>
# **getItemProductCodeFiles**
> getItemProductCodeFiles(itemProductCodeId)

Get the files for an itemProductCode.

Get all existing itemProductCode files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemProductCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemProductCodeApi apiInstance = new ItemProductCodeApi();
Integer itemProductCodeId = 56; // Integer | Id of the itemProductCode to get files for
try {
    apiInstance.getItemProductCodeFiles(itemProductCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemProductCodeApi#getItemProductCodeFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemProductCodeId** | **Integer**| Id of the itemProductCode to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemProductCodeTags"></a>
# **getItemProductCodeTags**
> getItemProductCodeTags(itemProductCodeId)

Get the tags for an itemProductCode.

Get all existing itemProductCode tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemProductCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemProductCodeApi apiInstance = new ItemProductCodeApi();
Integer itemProductCodeId = 56; // Integer | Id of the itemProductCode to get tags for
try {
    apiInstance.getItemProductCodeTags(itemProductCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemProductCodeApi#getItemProductCodeTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemProductCodeId** | **Integer**| Id of the itemProductCode to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateItemProductCode"></a>
# **updateItemProductCode**
> updateItemProductCode(body)

Update an itemProductCode

Updates an existing itemProductCode using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemProductCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemProductCodeApi apiInstance = new ItemProductCodeApi();
ItemProductCode body = new ItemProductCode(); // ItemProductCode | ItemProductCode to be updated.
try {
    apiInstance.updateItemProductCode(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemProductCodeApi#updateItemProductCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemProductCode**](ItemProductCode.md)| ItemProductCode to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

