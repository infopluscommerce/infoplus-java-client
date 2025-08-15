# ItemActivityApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addItemActivityAudit**](ItemActivityApi.md#addItemActivityAudit) | **PUT** /beta/itemActivity/{itemActivityId}/audit/{itemActivityAudit} | Add new audit for an itemActivity
[**addItemActivityFile**](ItemActivityApi.md#addItemActivityFile) | **POST** /beta/itemActivity/{itemActivityId}/file/{fileName} | Attach a file to an itemActivity
[**addItemActivityFileByURL**](ItemActivityApi.md#addItemActivityFileByURL) | **POST** /beta/itemActivity/{itemActivityId}/file | Attach a file to an itemActivity by URL.
[**addItemActivityTag**](ItemActivityApi.md#addItemActivityTag) | **PUT** /beta/itemActivity/{itemActivityId}/tag/{itemActivityTag} | Add new tags for an itemActivity.
[**deleteItemActivityFile**](ItemActivityApi.md#deleteItemActivityFile) | **DELETE** /beta/itemActivity/{itemActivityId}/file/{fileId} | Delete a file for an itemActivity.
[**deleteItemActivityTag**](ItemActivityApi.md#deleteItemActivityTag) | **DELETE** /beta/itemActivity/{itemActivityId}/tag/{itemActivityTag} | Delete a tag for an itemActivity.
[**getDuplicateItemActivityById**](ItemActivityApi.md#getDuplicateItemActivityById) | **GET** /beta/itemActivity/duplicate/{itemActivityId} | Get a duplicated an itemActivity by id
[**getItemActivityByFilter**](ItemActivityApi.md#getItemActivityByFilter) | **GET** /beta/itemActivity/search | Search itemActivitys by filter
[**getItemActivityById**](ItemActivityApi.md#getItemActivityById) | **GET** /beta/itemActivity/{itemActivityId} | Get an itemActivity by id
[**getItemActivityFiles**](ItemActivityApi.md#getItemActivityFiles) | **GET** /beta/itemActivity/{itemActivityId}/file | Get the files for an itemActivity.
[**getItemActivityTags**](ItemActivityApi.md#getItemActivityTags) | **GET** /beta/itemActivity/{itemActivityId}/tag | Get the tags for an itemActivity.


<a name="addItemActivityAudit"></a>
# **addItemActivityAudit**
> addItemActivityAudit(itemActivityId, itemActivityAudit)

Add new audit for an itemActivity

Adds an audit to an existing itemActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemActivityApi apiInstance = new ItemActivityApi();
Integer itemActivityId = 56; // Integer | Id of the itemActivity to add an audit to
String itemActivityAudit = "itemActivityAudit_example"; // String | The audit to add
try {
    apiInstance.addItemActivityAudit(itemActivityId, itemActivityAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemActivityApi#addItemActivityAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemActivityId** | **Integer**| Id of the itemActivity to add an audit to |
 **itemActivityAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemActivityFile"></a>
# **addItemActivityFile**
> addItemActivityFile(itemActivityId, fileName)

Attach a file to an itemActivity

Adds a file to an existing itemActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemActivityApi apiInstance = new ItemActivityApi();
Integer itemActivityId = 56; // Integer | Id of the itemActivity to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addItemActivityFile(itemActivityId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemActivityApi#addItemActivityFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemActivityId** | **Integer**| Id of the itemActivity to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addItemActivityFileByURL"></a>
# **addItemActivityFileByURL**
> addItemActivityFileByURL(body, itemActivityId)

Attach a file to an itemActivity by URL.

Adds a file to an existing itemActivity by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemActivityApi apiInstance = new ItemActivityApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer itemActivityId = 56; // Integer | Id of the itemActivity to add an file to
try {
    apiInstance.addItemActivityFileByURL(body, itemActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemActivityApi#addItemActivityFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **itemActivityId** | **Integer**| Id of the itemActivity to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemActivityTag"></a>
# **addItemActivityTag**
> addItemActivityTag(itemActivityId, itemActivityTag)

Add new tags for an itemActivity.

Adds a tag to an existing itemActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemActivityApi apiInstance = new ItemActivityApi();
Integer itemActivityId = 56; // Integer | Id of the itemActivity to add a tag to
String itemActivityTag = "itemActivityTag_example"; // String | The tag to add
try {
    apiInstance.addItemActivityTag(itemActivityId, itemActivityTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemActivityApi#addItemActivityTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemActivityId** | **Integer**| Id of the itemActivity to add a tag to |
 **itemActivityTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemActivityFile"></a>
# **deleteItemActivityFile**
> deleteItemActivityFile(itemActivityId, fileId)

Delete a file for an itemActivity.

Deletes an existing itemActivity file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemActivityApi apiInstance = new ItemActivityApi();
Integer itemActivityId = 56; // Integer | Id of the itemActivity to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteItemActivityFile(itemActivityId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemActivityApi#deleteItemActivityFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemActivityId** | **Integer**| Id of the itemActivity to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteItemActivityTag"></a>
# **deleteItemActivityTag**
> deleteItemActivityTag(itemActivityId, itemActivityTag)

Delete a tag for an itemActivity.

Deletes an existing itemActivity tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemActivityApi apiInstance = new ItemActivityApi();
Integer itemActivityId = 56; // Integer | Id of the itemActivity to remove tag from
String itemActivityTag = "itemActivityTag_example"; // String | The tag to delete
try {
    apiInstance.deleteItemActivityTag(itemActivityId, itemActivityTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemActivityApi#deleteItemActivityTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemActivityId** | **Integer**| Id of the itemActivity to remove tag from |
 **itemActivityTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateItemActivityById"></a>
# **getDuplicateItemActivityById**
> ItemActivity getDuplicateItemActivityById(itemActivityId)

Get a duplicated an itemActivity by id

Returns a duplicated itemActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemActivityApi apiInstance = new ItemActivityApi();
Integer itemActivityId = 56; // Integer | Id of the itemActivity to be duplicated.
try {
    ItemActivity result = apiInstance.getDuplicateItemActivityById(itemActivityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemActivityApi#getDuplicateItemActivityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemActivityId** | **Integer**| Id of the itemActivity to be duplicated. |

### Return type

[**ItemActivity**](ItemActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemActivityByFilter"></a>
# **getItemActivityByFilter**
> List&lt;ItemActivity&gt; getItemActivityByFilter(filter, page, limit, sort)

Search itemActivitys by filter

Returns the list of itemActivitys that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemActivityApi apiInstance = new ItemActivityApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ItemActivity> result = apiInstance.getItemActivityByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemActivityApi#getItemActivityByFilter");
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

[**List&lt;ItemActivity&gt;**](ItemActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemActivityById"></a>
# **getItemActivityById**
> ItemActivity getItemActivityById(itemActivityId)

Get an itemActivity by id

Returns the itemActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemActivityApi apiInstance = new ItemActivityApi();
Integer itemActivityId = 56; // Integer | Id of the itemActivity to be returned.
try {
    ItemActivity result = apiInstance.getItemActivityById(itemActivityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemActivityApi#getItemActivityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemActivityId** | **Integer**| Id of the itemActivity to be returned. |

### Return type

[**ItemActivity**](ItemActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemActivityFiles"></a>
# **getItemActivityFiles**
> getItemActivityFiles(itemActivityId)

Get the files for an itemActivity.

Get all existing itemActivity files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemActivityApi apiInstance = new ItemActivityApi();
Integer itemActivityId = 56; // Integer | Id of the itemActivity to get files for
try {
    apiInstance.getItemActivityFiles(itemActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemActivityApi#getItemActivityFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemActivityId** | **Integer**| Id of the itemActivity to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemActivityTags"></a>
# **getItemActivityTags**
> getItemActivityTags(itemActivityId)

Get the tags for an itemActivity.

Get all existing itemActivity tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemActivityApi apiInstance = new ItemActivityApi();
Integer itemActivityId = 56; // Integer | Id of the itemActivity to get tags for
try {
    apiInstance.getItemActivityTags(itemActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemActivityApi#getItemActivityTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemActivityId** | **Integer**| Id of the itemActivity to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

