# ItemReceiptActivityApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addItemReceiptActivity**](ItemReceiptActivityApi.md#addItemReceiptActivity) | **POST** /beta/itemReceiptActivity | Create an itemReceiptActivity
[**addItemReceiptActivityAudit**](ItemReceiptActivityApi.md#addItemReceiptActivityAudit) | **PUT** /beta/itemReceiptActivity/{itemReceiptActivityId}/audit/{itemReceiptActivityAudit} | Add new audit for an itemReceiptActivity
[**addItemReceiptActivityFile**](ItemReceiptActivityApi.md#addItemReceiptActivityFile) | **POST** /beta/itemReceiptActivity/{itemReceiptActivityId}/file/{fileName} | Attach a file to an itemReceiptActivity
[**addItemReceiptActivityFileByURL**](ItemReceiptActivityApi.md#addItemReceiptActivityFileByURL) | **POST** /beta/itemReceiptActivity/{itemReceiptActivityId}/file | Attach a file to an itemReceiptActivity by URL.
[**addItemReceiptActivityTag**](ItemReceiptActivityApi.md#addItemReceiptActivityTag) | **PUT** /beta/itemReceiptActivity/{itemReceiptActivityId}/tag/{itemReceiptActivityTag} | Add new tags for an itemReceiptActivity.
[**deleteItemReceiptActivity**](ItemReceiptActivityApi.md#deleteItemReceiptActivity) | **DELETE** /beta/itemReceiptActivity/{itemReceiptActivityId} | Delete an itemReceiptActivity
[**deleteItemReceiptActivityFile**](ItemReceiptActivityApi.md#deleteItemReceiptActivityFile) | **DELETE** /beta/itemReceiptActivity/{itemReceiptActivityId}/file/{fileId} | Delete a file for an itemReceiptActivity.
[**deleteItemReceiptActivityTag**](ItemReceiptActivityApi.md#deleteItemReceiptActivityTag) | **DELETE** /beta/itemReceiptActivity/{itemReceiptActivityId}/tag/{itemReceiptActivityTag} | Delete a tag for an itemReceiptActivity.
[**getDuplicateItemReceiptActivityById**](ItemReceiptActivityApi.md#getDuplicateItemReceiptActivityById) | **GET** /beta/itemReceiptActivity/duplicate/{itemReceiptActivityId} | Get a duplicated an itemReceiptActivity by id
[**getItemReceiptActivityByFilter**](ItemReceiptActivityApi.md#getItemReceiptActivityByFilter) | **GET** /beta/itemReceiptActivity/search | Search itemReceiptActivitys by filter
[**getItemReceiptActivityById**](ItemReceiptActivityApi.md#getItemReceiptActivityById) | **GET** /beta/itemReceiptActivity/{itemReceiptActivityId} | Get an itemReceiptActivity by id
[**getItemReceiptActivityFiles**](ItemReceiptActivityApi.md#getItemReceiptActivityFiles) | **GET** /beta/itemReceiptActivity/{itemReceiptActivityId}/file | Get the files for an itemReceiptActivity.
[**getItemReceiptActivityTags**](ItemReceiptActivityApi.md#getItemReceiptActivityTags) | **GET** /beta/itemReceiptActivity/{itemReceiptActivityId}/tag | Get the tags for an itemReceiptActivity.
[**updateItemReceiptActivity**](ItemReceiptActivityApi.md#updateItemReceiptActivity) | **PUT** /beta/itemReceiptActivity | Update an itemReceiptActivity


<a name="addItemReceiptActivity"></a>
# **addItemReceiptActivity**
> ItemReceiptActivity addItemReceiptActivity(body)

Create an itemReceiptActivity

Inserts a new itemReceiptActivity using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptActivityApi apiInstance = new ItemReceiptActivityApi();
ItemReceiptActivity body = new ItemReceiptActivity(); // ItemReceiptActivity | ItemReceiptActivity to be inserted.
try {
    ItemReceiptActivity result = apiInstance.addItemReceiptActivity(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptActivityApi#addItemReceiptActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemReceiptActivity**](ItemReceiptActivity.md)| ItemReceiptActivity to be inserted. |

### Return type

[**ItemReceiptActivity**](ItemReceiptActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemReceiptActivityAudit"></a>
# **addItemReceiptActivityAudit**
> addItemReceiptActivityAudit(itemReceiptActivityId, itemReceiptActivityAudit)

Add new audit for an itemReceiptActivity

Adds an audit to an existing itemReceiptActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptActivityApi apiInstance = new ItemReceiptActivityApi();
Integer itemReceiptActivityId = 56; // Integer | Id of the itemReceiptActivity to add an audit to
String itemReceiptActivityAudit = "itemReceiptActivityAudit_example"; // String | The audit to add
try {
    apiInstance.addItemReceiptActivityAudit(itemReceiptActivityId, itemReceiptActivityAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptActivityApi#addItemReceiptActivityAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemReceiptActivityId** | **Integer**| Id of the itemReceiptActivity to add an audit to |
 **itemReceiptActivityAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemReceiptActivityFile"></a>
# **addItemReceiptActivityFile**
> addItemReceiptActivityFile(itemReceiptActivityId, fileName)

Attach a file to an itemReceiptActivity

Adds a file to an existing itemReceiptActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptActivityApi apiInstance = new ItemReceiptActivityApi();
Integer itemReceiptActivityId = 56; // Integer | Id of the itemReceiptActivity to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addItemReceiptActivityFile(itemReceiptActivityId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptActivityApi#addItemReceiptActivityFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemReceiptActivityId** | **Integer**| Id of the itemReceiptActivity to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addItemReceiptActivityFileByURL"></a>
# **addItemReceiptActivityFileByURL**
> addItemReceiptActivityFileByURL(body, itemReceiptActivityId)

Attach a file to an itemReceiptActivity by URL.

Adds a file to an existing itemReceiptActivity by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptActivityApi apiInstance = new ItemReceiptActivityApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer itemReceiptActivityId = 56; // Integer | Id of the itemReceiptActivity to add an file to
try {
    apiInstance.addItemReceiptActivityFileByURL(body, itemReceiptActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptActivityApi#addItemReceiptActivityFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **itemReceiptActivityId** | **Integer**| Id of the itemReceiptActivity to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemReceiptActivityTag"></a>
# **addItemReceiptActivityTag**
> addItemReceiptActivityTag(itemReceiptActivityId, itemReceiptActivityTag)

Add new tags for an itemReceiptActivity.

Adds a tag to an existing itemReceiptActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptActivityApi apiInstance = new ItemReceiptActivityApi();
Integer itemReceiptActivityId = 56; // Integer | Id of the itemReceiptActivity to add a tag to
String itemReceiptActivityTag = "itemReceiptActivityTag_example"; // String | The tag to add
try {
    apiInstance.addItemReceiptActivityTag(itemReceiptActivityId, itemReceiptActivityTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptActivityApi#addItemReceiptActivityTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemReceiptActivityId** | **Integer**| Id of the itemReceiptActivity to add a tag to |
 **itemReceiptActivityTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemReceiptActivity"></a>
# **deleteItemReceiptActivity**
> deleteItemReceiptActivity(itemReceiptActivityId)

Delete an itemReceiptActivity

Deletes the itemReceiptActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptActivityApi apiInstance = new ItemReceiptActivityApi();
Integer itemReceiptActivityId = 56; // Integer | Id of the itemReceiptActivity to be deleted.
try {
    apiInstance.deleteItemReceiptActivity(itemReceiptActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptActivityApi#deleteItemReceiptActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemReceiptActivityId** | **Integer**| Id of the itemReceiptActivity to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteItemReceiptActivityFile"></a>
# **deleteItemReceiptActivityFile**
> deleteItemReceiptActivityFile(itemReceiptActivityId, fileId)

Delete a file for an itemReceiptActivity.

Deletes an existing itemReceiptActivity file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptActivityApi apiInstance = new ItemReceiptActivityApi();
Integer itemReceiptActivityId = 56; // Integer | Id of the itemReceiptActivity to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteItemReceiptActivityFile(itemReceiptActivityId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptActivityApi#deleteItemReceiptActivityFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemReceiptActivityId** | **Integer**| Id of the itemReceiptActivity to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteItemReceiptActivityTag"></a>
# **deleteItemReceiptActivityTag**
> deleteItemReceiptActivityTag(itemReceiptActivityId, itemReceiptActivityTag)

Delete a tag for an itemReceiptActivity.

Deletes an existing itemReceiptActivity tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptActivityApi apiInstance = new ItemReceiptActivityApi();
Integer itemReceiptActivityId = 56; // Integer | Id of the itemReceiptActivity to remove tag from
String itemReceiptActivityTag = "itemReceiptActivityTag_example"; // String | The tag to delete
try {
    apiInstance.deleteItemReceiptActivityTag(itemReceiptActivityId, itemReceiptActivityTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptActivityApi#deleteItemReceiptActivityTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemReceiptActivityId** | **Integer**| Id of the itemReceiptActivity to remove tag from |
 **itemReceiptActivityTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateItemReceiptActivityById"></a>
# **getDuplicateItemReceiptActivityById**
> ItemReceiptActivity getDuplicateItemReceiptActivityById(itemReceiptActivityId)

Get a duplicated an itemReceiptActivity by id

Returns a duplicated itemReceiptActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptActivityApi apiInstance = new ItemReceiptActivityApi();
Integer itemReceiptActivityId = 56; // Integer | Id of the itemReceiptActivity to be duplicated.
try {
    ItemReceiptActivity result = apiInstance.getDuplicateItemReceiptActivityById(itemReceiptActivityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptActivityApi#getDuplicateItemReceiptActivityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemReceiptActivityId** | **Integer**| Id of the itemReceiptActivity to be duplicated. |

### Return type

[**ItemReceiptActivity**](ItemReceiptActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemReceiptActivityByFilter"></a>
# **getItemReceiptActivityByFilter**
> List&lt;ItemReceiptActivity&gt; getItemReceiptActivityByFilter(filter, page, limit, sort)

Search itemReceiptActivitys by filter

Returns the list of itemReceiptActivitys that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptActivityApi apiInstance = new ItemReceiptActivityApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ItemReceiptActivity> result = apiInstance.getItemReceiptActivityByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptActivityApi#getItemReceiptActivityByFilter");
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

[**List&lt;ItemReceiptActivity&gt;**](ItemReceiptActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemReceiptActivityById"></a>
# **getItemReceiptActivityById**
> ItemReceiptActivity getItemReceiptActivityById(itemReceiptActivityId)

Get an itemReceiptActivity by id

Returns the itemReceiptActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptActivityApi apiInstance = new ItemReceiptActivityApi();
Integer itemReceiptActivityId = 56; // Integer | Id of the itemReceiptActivity to be returned.
try {
    ItemReceiptActivity result = apiInstance.getItemReceiptActivityById(itemReceiptActivityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptActivityApi#getItemReceiptActivityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemReceiptActivityId** | **Integer**| Id of the itemReceiptActivity to be returned. |

### Return type

[**ItemReceiptActivity**](ItemReceiptActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemReceiptActivityFiles"></a>
# **getItemReceiptActivityFiles**
> getItemReceiptActivityFiles(itemReceiptActivityId)

Get the files for an itemReceiptActivity.

Get all existing itemReceiptActivity files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptActivityApi apiInstance = new ItemReceiptActivityApi();
Integer itemReceiptActivityId = 56; // Integer | Id of the itemReceiptActivity to get files for
try {
    apiInstance.getItemReceiptActivityFiles(itemReceiptActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptActivityApi#getItemReceiptActivityFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemReceiptActivityId** | **Integer**| Id of the itemReceiptActivity to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemReceiptActivityTags"></a>
# **getItemReceiptActivityTags**
> getItemReceiptActivityTags(itemReceiptActivityId)

Get the tags for an itemReceiptActivity.

Get all existing itemReceiptActivity tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptActivityApi apiInstance = new ItemReceiptActivityApi();
Integer itemReceiptActivityId = 56; // Integer | Id of the itemReceiptActivity to get tags for
try {
    apiInstance.getItemReceiptActivityTags(itemReceiptActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptActivityApi#getItemReceiptActivityTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemReceiptActivityId** | **Integer**| Id of the itemReceiptActivity to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateItemReceiptActivity"></a>
# **updateItemReceiptActivity**
> updateItemReceiptActivity(body)

Update an itemReceiptActivity

Updates an existing itemReceiptActivity using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptActivityApi apiInstance = new ItemReceiptActivityApi();
ItemReceiptActivity body = new ItemReceiptActivity(); // ItemReceiptActivity | ItemReceiptActivity to be updated.
try {
    apiInstance.updateItemReceiptActivity(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptActivityApi#updateItemReceiptActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemReceiptActivity**](ItemReceiptActivity.md)| ItemReceiptActivity to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

