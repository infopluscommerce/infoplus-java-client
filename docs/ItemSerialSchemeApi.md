# ItemSerialSchemeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addItemSerialScheme**](ItemSerialSchemeApi.md#addItemSerialScheme) | **POST** /beta/itemSerialScheme | Create an itemSerialScheme
[**addItemSerialSchemeAudit**](ItemSerialSchemeApi.md#addItemSerialSchemeAudit) | **PUT** /beta/itemSerialScheme/{itemSerialSchemeId}/audit/{itemSerialSchemeAudit} | Add new audit for an itemSerialScheme
[**addItemSerialSchemeFile**](ItemSerialSchemeApi.md#addItemSerialSchemeFile) | **POST** /beta/itemSerialScheme/{itemSerialSchemeId}/file/{fileName} | Attach a file to an itemSerialScheme
[**addItemSerialSchemeFileByURL**](ItemSerialSchemeApi.md#addItemSerialSchemeFileByURL) | **POST** /beta/itemSerialScheme/{itemSerialSchemeId}/file | Attach a file to an itemSerialScheme by URL.
[**addItemSerialSchemeTag**](ItemSerialSchemeApi.md#addItemSerialSchemeTag) | **PUT** /beta/itemSerialScheme/{itemSerialSchemeId}/tag/{itemSerialSchemeTag} | Add new tags for an itemSerialScheme.
[**deleteItemSerialScheme**](ItemSerialSchemeApi.md#deleteItemSerialScheme) | **DELETE** /beta/itemSerialScheme/{itemSerialSchemeId} | Delete an itemSerialScheme
[**deleteItemSerialSchemeFile**](ItemSerialSchemeApi.md#deleteItemSerialSchemeFile) | **DELETE** /beta/itemSerialScheme/{itemSerialSchemeId}/file/{fileId} | Delete a file for an itemSerialScheme.
[**deleteItemSerialSchemeTag**](ItemSerialSchemeApi.md#deleteItemSerialSchemeTag) | **DELETE** /beta/itemSerialScheme/{itemSerialSchemeId}/tag/{itemSerialSchemeTag} | Delete a tag for an itemSerialScheme.
[**getDuplicateItemSerialSchemeById**](ItemSerialSchemeApi.md#getDuplicateItemSerialSchemeById) | **GET** /beta/itemSerialScheme/duplicate/{itemSerialSchemeId} | Get a duplicated an itemSerialScheme by id
[**getItemSerialSchemeByFilter**](ItemSerialSchemeApi.md#getItemSerialSchemeByFilter) | **GET** /beta/itemSerialScheme/search | Search itemSerialSchemes by filter
[**getItemSerialSchemeById**](ItemSerialSchemeApi.md#getItemSerialSchemeById) | **GET** /beta/itemSerialScheme/{itemSerialSchemeId} | Get an itemSerialScheme by id
[**getItemSerialSchemeFiles**](ItemSerialSchemeApi.md#getItemSerialSchemeFiles) | **GET** /beta/itemSerialScheme/{itemSerialSchemeId}/file | Get the files for an itemSerialScheme.
[**getItemSerialSchemeTags**](ItemSerialSchemeApi.md#getItemSerialSchemeTags) | **GET** /beta/itemSerialScheme/{itemSerialSchemeId}/tag | Get the tags for an itemSerialScheme.
[**updateItemSerialScheme**](ItemSerialSchemeApi.md#updateItemSerialScheme) | **PUT** /beta/itemSerialScheme | Update an itemSerialScheme


<a name="addItemSerialScheme"></a>
# **addItemSerialScheme**
> ItemSerialScheme addItemSerialScheme(body)

Create an itemSerialScheme

Inserts a new itemSerialScheme using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialSchemeApi apiInstance = new ItemSerialSchemeApi();
ItemSerialScheme body = new ItemSerialScheme(); // ItemSerialScheme | ItemSerialScheme to be inserted.
try {
    ItemSerialScheme result = apiInstance.addItemSerialScheme(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialSchemeApi#addItemSerialScheme");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemSerialScheme**](ItemSerialScheme.md)| ItemSerialScheme to be inserted. |

### Return type

[**ItemSerialScheme**](ItemSerialScheme.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemSerialSchemeAudit"></a>
# **addItemSerialSchemeAudit**
> addItemSerialSchemeAudit(itemSerialSchemeId, itemSerialSchemeAudit)

Add new audit for an itemSerialScheme

Adds an audit to an existing itemSerialScheme.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialSchemeApi apiInstance = new ItemSerialSchemeApi();
Integer itemSerialSchemeId = 56; // Integer | Id of the itemSerialScheme to add an audit to
String itemSerialSchemeAudit = "itemSerialSchemeAudit_example"; // String | The audit to add
try {
    apiInstance.addItemSerialSchemeAudit(itemSerialSchemeId, itemSerialSchemeAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialSchemeApi#addItemSerialSchemeAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSerialSchemeId** | **Integer**| Id of the itemSerialScheme to add an audit to |
 **itemSerialSchemeAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemSerialSchemeFile"></a>
# **addItemSerialSchemeFile**
> addItemSerialSchemeFile(itemSerialSchemeId, fileName)

Attach a file to an itemSerialScheme

Adds a file to an existing itemSerialScheme.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialSchemeApi apiInstance = new ItemSerialSchemeApi();
Integer itemSerialSchemeId = 56; // Integer | Id of the itemSerialScheme to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addItemSerialSchemeFile(itemSerialSchemeId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialSchemeApi#addItemSerialSchemeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSerialSchemeId** | **Integer**| Id of the itemSerialScheme to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addItemSerialSchemeFileByURL"></a>
# **addItemSerialSchemeFileByURL**
> addItemSerialSchemeFileByURL(body, itemSerialSchemeId)

Attach a file to an itemSerialScheme by URL.

Adds a file to an existing itemSerialScheme by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialSchemeApi apiInstance = new ItemSerialSchemeApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer itemSerialSchemeId = 56; // Integer | Id of the itemSerialScheme to add an file to
try {
    apiInstance.addItemSerialSchemeFileByURL(body, itemSerialSchemeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialSchemeApi#addItemSerialSchemeFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **itemSerialSchemeId** | **Integer**| Id of the itemSerialScheme to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemSerialSchemeTag"></a>
# **addItemSerialSchemeTag**
> addItemSerialSchemeTag(itemSerialSchemeId, itemSerialSchemeTag)

Add new tags for an itemSerialScheme.

Adds a tag to an existing itemSerialScheme.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialSchemeApi apiInstance = new ItemSerialSchemeApi();
Integer itemSerialSchemeId = 56; // Integer | Id of the itemSerialScheme to add a tag to
String itemSerialSchemeTag = "itemSerialSchemeTag_example"; // String | The tag to add
try {
    apiInstance.addItemSerialSchemeTag(itemSerialSchemeId, itemSerialSchemeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialSchemeApi#addItemSerialSchemeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSerialSchemeId** | **Integer**| Id of the itemSerialScheme to add a tag to |
 **itemSerialSchemeTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemSerialScheme"></a>
# **deleteItemSerialScheme**
> deleteItemSerialScheme(itemSerialSchemeId)

Delete an itemSerialScheme

Deletes the itemSerialScheme identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialSchemeApi apiInstance = new ItemSerialSchemeApi();
Integer itemSerialSchemeId = 56; // Integer | Id of the itemSerialScheme to be deleted.
try {
    apiInstance.deleteItemSerialScheme(itemSerialSchemeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialSchemeApi#deleteItemSerialScheme");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSerialSchemeId** | **Integer**| Id of the itemSerialScheme to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteItemSerialSchemeFile"></a>
# **deleteItemSerialSchemeFile**
> deleteItemSerialSchemeFile(itemSerialSchemeId, fileId)

Delete a file for an itemSerialScheme.

Deletes an existing itemSerialScheme file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialSchemeApi apiInstance = new ItemSerialSchemeApi();
Integer itemSerialSchemeId = 56; // Integer | Id of the itemSerialScheme to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteItemSerialSchemeFile(itemSerialSchemeId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialSchemeApi#deleteItemSerialSchemeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSerialSchemeId** | **Integer**| Id of the itemSerialScheme to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteItemSerialSchemeTag"></a>
# **deleteItemSerialSchemeTag**
> deleteItemSerialSchemeTag(itemSerialSchemeId, itemSerialSchemeTag)

Delete a tag for an itemSerialScheme.

Deletes an existing itemSerialScheme tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialSchemeApi apiInstance = new ItemSerialSchemeApi();
Integer itemSerialSchemeId = 56; // Integer | Id of the itemSerialScheme to remove tag from
String itemSerialSchemeTag = "itemSerialSchemeTag_example"; // String | The tag to delete
try {
    apiInstance.deleteItemSerialSchemeTag(itemSerialSchemeId, itemSerialSchemeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialSchemeApi#deleteItemSerialSchemeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSerialSchemeId** | **Integer**| Id of the itemSerialScheme to remove tag from |
 **itemSerialSchemeTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateItemSerialSchemeById"></a>
# **getDuplicateItemSerialSchemeById**
> ItemSerialScheme getDuplicateItemSerialSchemeById(itemSerialSchemeId)

Get a duplicated an itemSerialScheme by id

Returns a duplicated itemSerialScheme identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialSchemeApi apiInstance = new ItemSerialSchemeApi();
Integer itemSerialSchemeId = 56; // Integer | Id of the itemSerialScheme to be duplicated.
try {
    ItemSerialScheme result = apiInstance.getDuplicateItemSerialSchemeById(itemSerialSchemeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialSchemeApi#getDuplicateItemSerialSchemeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSerialSchemeId** | **Integer**| Id of the itemSerialScheme to be duplicated. |

### Return type

[**ItemSerialScheme**](ItemSerialScheme.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemSerialSchemeByFilter"></a>
# **getItemSerialSchemeByFilter**
> List&lt;ItemSerialScheme&gt; getItemSerialSchemeByFilter(filter, page, limit, sort)

Search itemSerialSchemes by filter

Returns the list of itemSerialSchemes that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialSchemeApi apiInstance = new ItemSerialSchemeApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ItemSerialScheme> result = apiInstance.getItemSerialSchemeByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialSchemeApi#getItemSerialSchemeByFilter");
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

[**List&lt;ItemSerialScheme&gt;**](ItemSerialScheme.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemSerialSchemeById"></a>
# **getItemSerialSchemeById**
> ItemSerialScheme getItemSerialSchemeById(itemSerialSchemeId)

Get an itemSerialScheme by id

Returns the itemSerialScheme identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialSchemeApi apiInstance = new ItemSerialSchemeApi();
Integer itemSerialSchemeId = 56; // Integer | Id of the itemSerialScheme to be returned.
try {
    ItemSerialScheme result = apiInstance.getItemSerialSchemeById(itemSerialSchemeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialSchemeApi#getItemSerialSchemeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSerialSchemeId** | **Integer**| Id of the itemSerialScheme to be returned. |

### Return type

[**ItemSerialScheme**](ItemSerialScheme.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemSerialSchemeFiles"></a>
# **getItemSerialSchemeFiles**
> getItemSerialSchemeFiles(itemSerialSchemeId)

Get the files for an itemSerialScheme.

Get all existing itemSerialScheme files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialSchemeApi apiInstance = new ItemSerialSchemeApi();
Integer itemSerialSchemeId = 56; // Integer | Id of the itemSerialScheme to get files for
try {
    apiInstance.getItemSerialSchemeFiles(itemSerialSchemeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialSchemeApi#getItemSerialSchemeFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSerialSchemeId** | **Integer**| Id of the itemSerialScheme to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemSerialSchemeTags"></a>
# **getItemSerialSchemeTags**
> getItemSerialSchemeTags(itemSerialSchemeId)

Get the tags for an itemSerialScheme.

Get all existing itemSerialScheme tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialSchemeApi apiInstance = new ItemSerialSchemeApi();
Integer itemSerialSchemeId = 56; // Integer | Id of the itemSerialScheme to get tags for
try {
    apiInstance.getItemSerialSchemeTags(itemSerialSchemeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialSchemeApi#getItemSerialSchemeTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSerialSchemeId** | **Integer**| Id of the itemSerialScheme to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateItemSerialScheme"></a>
# **updateItemSerialScheme**
> updateItemSerialScheme(body)

Update an itemSerialScheme

Updates an existing itemSerialScheme using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialSchemeApi apiInstance = new ItemSerialSchemeApi();
ItemSerialScheme body = new ItemSerialScheme(); // ItemSerialScheme | ItemSerialScheme to be updated.
try {
    apiInstance.updateItemSerialScheme(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialSchemeApi#updateItemSerialScheme");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemSerialScheme**](ItemSerialScheme.md)| ItemSerialScheme to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

