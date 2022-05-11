# ItemAccountCodeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addItemAccountCode**](ItemAccountCodeApi.md#addItemAccountCode) | **POST** /v3.0/itemAccountCode | Create an itemAccountCode
[**addItemAccountCodeAudit**](ItemAccountCodeApi.md#addItemAccountCodeAudit) | **PUT** /v3.0/itemAccountCode/{itemAccountCodeId}/audit/{itemAccountCodeAudit} | Add new audit for an itemAccountCode
[**addItemAccountCodeFile**](ItemAccountCodeApi.md#addItemAccountCodeFile) | **POST** /v3.0/itemAccountCode/{itemAccountCodeId}/file/{fileName} | Attach a file to an itemAccountCode
[**addItemAccountCodeFileByURL**](ItemAccountCodeApi.md#addItemAccountCodeFileByURL) | **POST** /v3.0/itemAccountCode/{itemAccountCodeId}/file | Attach a file to an itemAccountCode by URL.
[**addItemAccountCodeTag**](ItemAccountCodeApi.md#addItemAccountCodeTag) | **PUT** /v3.0/itemAccountCode/{itemAccountCodeId}/tag/{itemAccountCodeTag} | Add new tags for an itemAccountCode.
[**deleteItemAccountCode**](ItemAccountCodeApi.md#deleteItemAccountCode) | **DELETE** /v3.0/itemAccountCode/{itemAccountCodeId} | Delete an itemAccountCode
[**deleteItemAccountCodeFile**](ItemAccountCodeApi.md#deleteItemAccountCodeFile) | **DELETE** /v3.0/itemAccountCode/{itemAccountCodeId}/file/{fileId} | Delete a file for an itemAccountCode.
[**deleteItemAccountCodeTag**](ItemAccountCodeApi.md#deleteItemAccountCodeTag) | **DELETE** /v3.0/itemAccountCode/{itemAccountCodeId}/tag/{itemAccountCodeTag} | Delete a tag for an itemAccountCode.
[**getDuplicateItemAccountCodeById**](ItemAccountCodeApi.md#getDuplicateItemAccountCodeById) | **GET** /v3.0/itemAccountCode/duplicate/{itemAccountCodeId} | Get a duplicated an itemAccountCode by id
[**getItemAccountCodeByFilter**](ItemAccountCodeApi.md#getItemAccountCodeByFilter) | **GET** /v3.0/itemAccountCode/search | Search itemAccountCodes by filter
[**getItemAccountCodeById**](ItemAccountCodeApi.md#getItemAccountCodeById) | **GET** /v3.0/itemAccountCode/{itemAccountCodeId} | Get an itemAccountCode by id
[**getItemAccountCodeFiles**](ItemAccountCodeApi.md#getItemAccountCodeFiles) | **GET** /v3.0/itemAccountCode/{itemAccountCodeId}/file | Get the files for an itemAccountCode.
[**getItemAccountCodeTags**](ItemAccountCodeApi.md#getItemAccountCodeTags) | **GET** /v3.0/itemAccountCode/{itemAccountCodeId}/tag | Get the tags for an itemAccountCode.
[**updateItemAccountCode**](ItemAccountCodeApi.md#updateItemAccountCode) | **PUT** /v3.0/itemAccountCode | Update an itemAccountCode


<a name="addItemAccountCode"></a>
# **addItemAccountCode**
> ItemAccountCode addItemAccountCode(body)

Create an itemAccountCode

Inserts a new itemAccountCode using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemAccountCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemAccountCodeApi apiInstance = new ItemAccountCodeApi();
ItemAccountCode body = new ItemAccountCode(); // ItemAccountCode | ItemAccountCode to be inserted.
try {
    ItemAccountCode result = apiInstance.addItemAccountCode(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemAccountCodeApi#addItemAccountCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemAccountCode**](ItemAccountCode.md)| ItemAccountCode to be inserted. |

### Return type

[**ItemAccountCode**](ItemAccountCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemAccountCodeAudit"></a>
# **addItemAccountCodeAudit**
> addItemAccountCodeAudit(itemAccountCodeId, itemAccountCodeAudit)

Add new audit for an itemAccountCode

Adds an audit to an existing itemAccountCode.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemAccountCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemAccountCodeApi apiInstance = new ItemAccountCodeApi();
Integer itemAccountCodeId = 56; // Integer | Id of the itemAccountCode to add an audit to
String itemAccountCodeAudit = "itemAccountCodeAudit_example"; // String | The audit to add
try {
    apiInstance.addItemAccountCodeAudit(itemAccountCodeId, itemAccountCodeAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemAccountCodeApi#addItemAccountCodeAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemAccountCodeId** | **Integer**| Id of the itemAccountCode to add an audit to |
 **itemAccountCodeAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemAccountCodeFile"></a>
# **addItemAccountCodeFile**
> addItemAccountCodeFile(itemAccountCodeId, fileName)

Attach a file to an itemAccountCode

Adds a file to an existing itemAccountCode.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemAccountCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemAccountCodeApi apiInstance = new ItemAccountCodeApi();
Integer itemAccountCodeId = 56; // Integer | Id of the itemAccountCode to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addItemAccountCodeFile(itemAccountCodeId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemAccountCodeApi#addItemAccountCodeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemAccountCodeId** | **Integer**| Id of the itemAccountCode to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addItemAccountCodeFileByURL"></a>
# **addItemAccountCodeFileByURL**
> addItemAccountCodeFileByURL(body, itemAccountCodeId)

Attach a file to an itemAccountCode by URL.

Adds a file to an existing itemAccountCode by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemAccountCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemAccountCodeApi apiInstance = new ItemAccountCodeApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer itemAccountCodeId = 56; // Integer | Id of the itemAccountCode to add an file to
try {
    apiInstance.addItemAccountCodeFileByURL(body, itemAccountCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemAccountCodeApi#addItemAccountCodeFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **itemAccountCodeId** | **Integer**| Id of the itemAccountCode to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemAccountCodeTag"></a>
# **addItemAccountCodeTag**
> addItemAccountCodeTag(itemAccountCodeId, itemAccountCodeTag)

Add new tags for an itemAccountCode.

Adds a tag to an existing itemAccountCode.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemAccountCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemAccountCodeApi apiInstance = new ItemAccountCodeApi();
Integer itemAccountCodeId = 56; // Integer | Id of the itemAccountCode to add a tag to
String itemAccountCodeTag = "itemAccountCodeTag_example"; // String | The tag to add
try {
    apiInstance.addItemAccountCodeTag(itemAccountCodeId, itemAccountCodeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemAccountCodeApi#addItemAccountCodeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemAccountCodeId** | **Integer**| Id of the itemAccountCode to add a tag to |
 **itemAccountCodeTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemAccountCode"></a>
# **deleteItemAccountCode**
> deleteItemAccountCode(itemAccountCodeId)

Delete an itemAccountCode

Deletes the itemAccountCode identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemAccountCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemAccountCodeApi apiInstance = new ItemAccountCodeApi();
Integer itemAccountCodeId = 56; // Integer | Id of the itemAccountCode to be deleted.
try {
    apiInstance.deleteItemAccountCode(itemAccountCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemAccountCodeApi#deleteItemAccountCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemAccountCodeId** | **Integer**| Id of the itemAccountCode to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteItemAccountCodeFile"></a>
# **deleteItemAccountCodeFile**
> deleteItemAccountCodeFile(itemAccountCodeId, fileId)

Delete a file for an itemAccountCode.

Deletes an existing itemAccountCode file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemAccountCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemAccountCodeApi apiInstance = new ItemAccountCodeApi();
Integer itemAccountCodeId = 56; // Integer | Id of the itemAccountCode to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteItemAccountCodeFile(itemAccountCodeId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemAccountCodeApi#deleteItemAccountCodeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemAccountCodeId** | **Integer**| Id of the itemAccountCode to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteItemAccountCodeTag"></a>
# **deleteItemAccountCodeTag**
> deleteItemAccountCodeTag(itemAccountCodeId, itemAccountCodeTag)

Delete a tag for an itemAccountCode.

Deletes an existing itemAccountCode tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemAccountCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemAccountCodeApi apiInstance = new ItemAccountCodeApi();
Integer itemAccountCodeId = 56; // Integer | Id of the itemAccountCode to remove tag from
String itemAccountCodeTag = "itemAccountCodeTag_example"; // String | The tag to delete
try {
    apiInstance.deleteItemAccountCodeTag(itemAccountCodeId, itemAccountCodeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemAccountCodeApi#deleteItemAccountCodeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemAccountCodeId** | **Integer**| Id of the itemAccountCode to remove tag from |
 **itemAccountCodeTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateItemAccountCodeById"></a>
# **getDuplicateItemAccountCodeById**
> ItemAccountCode getDuplicateItemAccountCodeById(itemAccountCodeId)

Get a duplicated an itemAccountCode by id

Returns a duplicated itemAccountCode identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemAccountCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemAccountCodeApi apiInstance = new ItemAccountCodeApi();
Integer itemAccountCodeId = 56; // Integer | Id of the itemAccountCode to be duplicated.
try {
    ItemAccountCode result = apiInstance.getDuplicateItemAccountCodeById(itemAccountCodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemAccountCodeApi#getDuplicateItemAccountCodeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemAccountCodeId** | **Integer**| Id of the itemAccountCode to be duplicated. |

### Return type

[**ItemAccountCode**](ItemAccountCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemAccountCodeByFilter"></a>
# **getItemAccountCodeByFilter**
> List&lt;ItemAccountCode&gt; getItemAccountCodeByFilter(filter, page, limit, sort)

Search itemAccountCodes by filter

Returns the list of itemAccountCodes that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemAccountCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemAccountCodeApi apiInstance = new ItemAccountCodeApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ItemAccountCode> result = apiInstance.getItemAccountCodeByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemAccountCodeApi#getItemAccountCodeByFilter");
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

[**List&lt;ItemAccountCode&gt;**](ItemAccountCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemAccountCodeById"></a>
# **getItemAccountCodeById**
> ItemAccountCode getItemAccountCodeById(itemAccountCodeId)

Get an itemAccountCode by id

Returns the itemAccountCode identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemAccountCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemAccountCodeApi apiInstance = new ItemAccountCodeApi();
Integer itemAccountCodeId = 56; // Integer | Id of the itemAccountCode to be returned.
try {
    ItemAccountCode result = apiInstance.getItemAccountCodeById(itemAccountCodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemAccountCodeApi#getItemAccountCodeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemAccountCodeId** | **Integer**| Id of the itemAccountCode to be returned. |

### Return type

[**ItemAccountCode**](ItemAccountCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemAccountCodeFiles"></a>
# **getItemAccountCodeFiles**
> getItemAccountCodeFiles(itemAccountCodeId)

Get the files for an itemAccountCode.

Get all existing itemAccountCode files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemAccountCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemAccountCodeApi apiInstance = new ItemAccountCodeApi();
Integer itemAccountCodeId = 56; // Integer | Id of the itemAccountCode to get files for
try {
    apiInstance.getItemAccountCodeFiles(itemAccountCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemAccountCodeApi#getItemAccountCodeFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemAccountCodeId** | **Integer**| Id of the itemAccountCode to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemAccountCodeTags"></a>
# **getItemAccountCodeTags**
> getItemAccountCodeTags(itemAccountCodeId)

Get the tags for an itemAccountCode.

Get all existing itemAccountCode tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemAccountCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemAccountCodeApi apiInstance = new ItemAccountCodeApi();
Integer itemAccountCodeId = 56; // Integer | Id of the itemAccountCode to get tags for
try {
    apiInstance.getItemAccountCodeTags(itemAccountCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemAccountCodeApi#getItemAccountCodeTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemAccountCodeId** | **Integer**| Id of the itemAccountCode to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateItemAccountCode"></a>
# **updateItemAccountCode**
> updateItemAccountCode(body)

Update an itemAccountCode

Updates an existing itemAccountCode using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemAccountCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemAccountCodeApi apiInstance = new ItemAccountCodeApi();
ItemAccountCode body = new ItemAccountCode(); // ItemAccountCode | ItemAccountCode to be updated.
try {
    apiInstance.updateItemAccountCode(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemAccountCodeApi#updateItemAccountCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemAccountCode**](ItemAccountCode.md)| ItemAccountCode to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

