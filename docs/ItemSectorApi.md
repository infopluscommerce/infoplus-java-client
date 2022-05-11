# ItemSectorApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addItemSector**](ItemSectorApi.md#addItemSector) | **POST** /v3.0/itemSector | Create an itemSector
[**addItemSectorAudit**](ItemSectorApi.md#addItemSectorAudit) | **PUT** /v3.0/itemSector/{itemSectorId}/audit/{itemSectorAudit} | Add new audit for an itemSector
[**addItemSectorFile**](ItemSectorApi.md#addItemSectorFile) | **POST** /v3.0/itemSector/{itemSectorId}/file/{fileName} | Attach a file to an itemSector
[**addItemSectorFileByURL**](ItemSectorApi.md#addItemSectorFileByURL) | **POST** /v3.0/itemSector/{itemSectorId}/file | Attach a file to an itemSector by URL.
[**addItemSectorTag**](ItemSectorApi.md#addItemSectorTag) | **PUT** /v3.0/itemSector/{itemSectorId}/tag/{itemSectorTag} | Add new tags for an itemSector.
[**deleteItemSector**](ItemSectorApi.md#deleteItemSector) | **DELETE** /v3.0/itemSector/{itemSectorId} | Delete an itemSector
[**deleteItemSectorFile**](ItemSectorApi.md#deleteItemSectorFile) | **DELETE** /v3.0/itemSector/{itemSectorId}/file/{fileId} | Delete a file for an itemSector.
[**deleteItemSectorTag**](ItemSectorApi.md#deleteItemSectorTag) | **DELETE** /v3.0/itemSector/{itemSectorId}/tag/{itemSectorTag} | Delete a tag for an itemSector.
[**getDuplicateItemSectorById**](ItemSectorApi.md#getDuplicateItemSectorById) | **GET** /v3.0/itemSector/duplicate/{itemSectorId} | Get a duplicated an itemSector by id
[**getItemSectorByFilter**](ItemSectorApi.md#getItemSectorByFilter) | **GET** /v3.0/itemSector/search | Search itemSectors by filter
[**getItemSectorById**](ItemSectorApi.md#getItemSectorById) | **GET** /v3.0/itemSector/{itemSectorId} | Get an itemSector by id
[**getItemSectorFiles**](ItemSectorApi.md#getItemSectorFiles) | **GET** /v3.0/itemSector/{itemSectorId}/file | Get the files for an itemSector.
[**getItemSectorTags**](ItemSectorApi.md#getItemSectorTags) | **GET** /v3.0/itemSector/{itemSectorId}/tag | Get the tags for an itemSector.
[**updateItemSector**](ItemSectorApi.md#updateItemSector) | **PUT** /v3.0/itemSector | Update an itemSector


<a name="addItemSector"></a>
# **addItemSector**
> ItemSector addItemSector(body)

Create an itemSector

Inserts a new itemSector using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSectorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSectorApi apiInstance = new ItemSectorApi();
ItemSector body = new ItemSector(); // ItemSector | ItemSector to be inserted.
try {
    ItemSector result = apiInstance.addItemSector(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSectorApi#addItemSector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemSector**](ItemSector.md)| ItemSector to be inserted. |

### Return type

[**ItemSector**](ItemSector.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemSectorAudit"></a>
# **addItemSectorAudit**
> addItemSectorAudit(itemSectorId, itemSectorAudit)

Add new audit for an itemSector

Adds an audit to an existing itemSector.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSectorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSectorApi apiInstance = new ItemSectorApi();
Integer itemSectorId = 56; // Integer | Id of the itemSector to add an audit to
String itemSectorAudit = "itemSectorAudit_example"; // String | The audit to add
try {
    apiInstance.addItemSectorAudit(itemSectorId, itemSectorAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSectorApi#addItemSectorAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSectorId** | **Integer**| Id of the itemSector to add an audit to |
 **itemSectorAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemSectorFile"></a>
# **addItemSectorFile**
> addItemSectorFile(itemSectorId, fileName)

Attach a file to an itemSector

Adds a file to an existing itemSector.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSectorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSectorApi apiInstance = new ItemSectorApi();
Integer itemSectorId = 56; // Integer | Id of the itemSector to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addItemSectorFile(itemSectorId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSectorApi#addItemSectorFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSectorId** | **Integer**| Id of the itemSector to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addItemSectorFileByURL"></a>
# **addItemSectorFileByURL**
> addItemSectorFileByURL(body, itemSectorId)

Attach a file to an itemSector by URL.

Adds a file to an existing itemSector by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSectorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSectorApi apiInstance = new ItemSectorApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer itemSectorId = 56; // Integer | Id of the itemSector to add an file to
try {
    apiInstance.addItemSectorFileByURL(body, itemSectorId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSectorApi#addItemSectorFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **itemSectorId** | **Integer**| Id of the itemSector to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemSectorTag"></a>
# **addItemSectorTag**
> addItemSectorTag(itemSectorId, itemSectorTag)

Add new tags for an itemSector.

Adds a tag to an existing itemSector.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSectorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSectorApi apiInstance = new ItemSectorApi();
Integer itemSectorId = 56; // Integer | Id of the itemSector to add a tag to
String itemSectorTag = "itemSectorTag_example"; // String | The tag to add
try {
    apiInstance.addItemSectorTag(itemSectorId, itemSectorTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSectorApi#addItemSectorTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSectorId** | **Integer**| Id of the itemSector to add a tag to |
 **itemSectorTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemSector"></a>
# **deleteItemSector**
> deleteItemSector(itemSectorId)

Delete an itemSector

Deletes the itemSector identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSectorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSectorApi apiInstance = new ItemSectorApi();
Integer itemSectorId = 56; // Integer | Id of the itemSector to be deleted.
try {
    apiInstance.deleteItemSector(itemSectorId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSectorApi#deleteItemSector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSectorId** | **Integer**| Id of the itemSector to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteItemSectorFile"></a>
# **deleteItemSectorFile**
> deleteItemSectorFile(itemSectorId, fileId)

Delete a file for an itemSector.

Deletes an existing itemSector file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSectorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSectorApi apiInstance = new ItemSectorApi();
Integer itemSectorId = 56; // Integer | Id of the itemSector to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteItemSectorFile(itemSectorId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSectorApi#deleteItemSectorFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSectorId** | **Integer**| Id of the itemSector to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteItemSectorTag"></a>
# **deleteItemSectorTag**
> deleteItemSectorTag(itemSectorId, itemSectorTag)

Delete a tag for an itemSector.

Deletes an existing itemSector tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSectorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSectorApi apiInstance = new ItemSectorApi();
Integer itemSectorId = 56; // Integer | Id of the itemSector to remove tag from
String itemSectorTag = "itemSectorTag_example"; // String | The tag to delete
try {
    apiInstance.deleteItemSectorTag(itemSectorId, itemSectorTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSectorApi#deleteItemSectorTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSectorId** | **Integer**| Id of the itemSector to remove tag from |
 **itemSectorTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateItemSectorById"></a>
# **getDuplicateItemSectorById**
> ItemSector getDuplicateItemSectorById(itemSectorId)

Get a duplicated an itemSector by id

Returns a duplicated itemSector identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSectorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSectorApi apiInstance = new ItemSectorApi();
Integer itemSectorId = 56; // Integer | Id of the itemSector to be duplicated.
try {
    ItemSector result = apiInstance.getDuplicateItemSectorById(itemSectorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSectorApi#getDuplicateItemSectorById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSectorId** | **Integer**| Id of the itemSector to be duplicated. |

### Return type

[**ItemSector**](ItemSector.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemSectorByFilter"></a>
# **getItemSectorByFilter**
> List&lt;ItemSector&gt; getItemSectorByFilter(filter, page, limit, sort)

Search itemSectors by filter

Returns the list of itemSectors that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSectorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSectorApi apiInstance = new ItemSectorApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ItemSector> result = apiInstance.getItemSectorByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSectorApi#getItemSectorByFilter");
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

[**List&lt;ItemSector&gt;**](ItemSector.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemSectorById"></a>
# **getItemSectorById**
> ItemSector getItemSectorById(itemSectorId)

Get an itemSector by id

Returns the itemSector identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSectorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSectorApi apiInstance = new ItemSectorApi();
Integer itemSectorId = 56; // Integer | Id of the itemSector to be returned.
try {
    ItemSector result = apiInstance.getItemSectorById(itemSectorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSectorApi#getItemSectorById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSectorId** | **Integer**| Id of the itemSector to be returned. |

### Return type

[**ItemSector**](ItemSector.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemSectorFiles"></a>
# **getItemSectorFiles**
> getItemSectorFiles(itemSectorId)

Get the files for an itemSector.

Get all existing itemSector files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSectorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSectorApi apiInstance = new ItemSectorApi();
Integer itemSectorId = 56; // Integer | Id of the itemSector to get files for
try {
    apiInstance.getItemSectorFiles(itemSectorId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSectorApi#getItemSectorFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSectorId** | **Integer**| Id of the itemSector to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemSectorTags"></a>
# **getItemSectorTags**
> getItemSectorTags(itemSectorId)

Get the tags for an itemSector.

Get all existing itemSector tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSectorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSectorApi apiInstance = new ItemSectorApi();
Integer itemSectorId = 56; // Integer | Id of the itemSector to get tags for
try {
    apiInstance.getItemSectorTags(itemSectorId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSectorApi#getItemSectorTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSectorId** | **Integer**| Id of the itemSector to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateItemSector"></a>
# **updateItemSector**
> updateItemSector(body)

Update an itemSector

Updates an existing itemSector using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSectorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSectorApi apiInstance = new ItemSectorApi();
ItemSector body = new ItemSector(); // ItemSector | ItemSector to be updated.
try {
    apiInstance.updateItemSector(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSectorApi#updateItemSector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemSector**](ItemSector.md)| ItemSector to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

