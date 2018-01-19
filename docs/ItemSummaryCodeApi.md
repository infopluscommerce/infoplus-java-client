# ItemSummaryCodeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addItemSummaryCode**](ItemSummaryCodeApi.md#addItemSummaryCode) | **POST** /beta/itemSummaryCode | Create an itemSummaryCode
[**addItemSummaryCodeAudit**](ItemSummaryCodeApi.md#addItemSummaryCodeAudit) | **PUT** /beta/itemSummaryCode/{itemSummaryCodeId}/audit/{itemSummaryCodeAudit} | Add new audit for an itemSummaryCode
[**addItemSummaryCodeTag**](ItemSummaryCodeApi.md#addItemSummaryCodeTag) | **PUT** /beta/itemSummaryCode/{itemSummaryCodeId}/tag/{itemSummaryCodeTag} | Add new tags for an itemSummaryCode.
[**deleteItemSummaryCode**](ItemSummaryCodeApi.md#deleteItemSummaryCode) | **DELETE** /beta/itemSummaryCode/{itemSummaryCodeId} | Delete an itemSummaryCode
[**deleteItemSummaryCodeTag**](ItemSummaryCodeApi.md#deleteItemSummaryCodeTag) | **DELETE** /beta/itemSummaryCode/{itemSummaryCodeId}/tag/{itemSummaryCodeTag} | Delete a tag for an itemSummaryCode.
[**getDuplicateItemSummaryCodeById**](ItemSummaryCodeApi.md#getDuplicateItemSummaryCodeById) | **GET** /beta/itemSummaryCode/duplicate/{itemSummaryCodeId} | Get a duplicated an itemSummaryCode by id
[**getItemSummaryCodeByFilter**](ItemSummaryCodeApi.md#getItemSummaryCodeByFilter) | **GET** /beta/itemSummaryCode/search | Search itemSummaryCodes by filter
[**getItemSummaryCodeById**](ItemSummaryCodeApi.md#getItemSummaryCodeById) | **GET** /beta/itemSummaryCode/{itemSummaryCodeId} | Get an itemSummaryCode by id
[**getItemSummaryCodeTags**](ItemSummaryCodeApi.md#getItemSummaryCodeTags) | **GET** /beta/itemSummaryCode/{itemSummaryCodeId}/tag | Get the tags for an itemSummaryCode.
[**updateItemSummaryCode**](ItemSummaryCodeApi.md#updateItemSummaryCode) | **PUT** /beta/itemSummaryCode | Update an itemSummaryCode


<a name="addItemSummaryCode"></a>
# **addItemSummaryCode**
> ItemSummaryCode addItemSummaryCode(body)

Create an itemSummaryCode

Inserts a new itemSummaryCode using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSummaryCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSummaryCodeApi apiInstance = new ItemSummaryCodeApi();
ItemSummaryCode body = new ItemSummaryCode(); // ItemSummaryCode | ItemSummaryCode to be inserted.
try {
    ItemSummaryCode result = apiInstance.addItemSummaryCode(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSummaryCodeApi#addItemSummaryCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemSummaryCode**](ItemSummaryCode.md)| ItemSummaryCode to be inserted. |

### Return type

[**ItemSummaryCode**](ItemSummaryCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemSummaryCodeAudit"></a>
# **addItemSummaryCodeAudit**
> addItemSummaryCodeAudit(itemSummaryCodeId, itemSummaryCodeAudit)

Add new audit for an itemSummaryCode

Adds an audit to an existing itemSummaryCode.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSummaryCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSummaryCodeApi apiInstance = new ItemSummaryCodeApi();
Integer itemSummaryCodeId = 56; // Integer | Id of the itemSummaryCode to add an audit to
String itemSummaryCodeAudit = "itemSummaryCodeAudit_example"; // String | The audit to add
try {
    apiInstance.addItemSummaryCodeAudit(itemSummaryCodeId, itemSummaryCodeAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSummaryCodeApi#addItemSummaryCodeAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSummaryCodeId** | **Integer**| Id of the itemSummaryCode to add an audit to |
 **itemSummaryCodeAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemSummaryCodeTag"></a>
# **addItemSummaryCodeTag**
> addItemSummaryCodeTag(itemSummaryCodeId, itemSummaryCodeTag)

Add new tags for an itemSummaryCode.

Adds a tag to an existing itemSummaryCode.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSummaryCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSummaryCodeApi apiInstance = new ItemSummaryCodeApi();
Integer itemSummaryCodeId = 56; // Integer | Id of the itemSummaryCode to add a tag to
String itemSummaryCodeTag = "itemSummaryCodeTag_example"; // String | The tag to add
try {
    apiInstance.addItemSummaryCodeTag(itemSummaryCodeId, itemSummaryCodeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSummaryCodeApi#addItemSummaryCodeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSummaryCodeId** | **Integer**| Id of the itemSummaryCode to add a tag to |
 **itemSummaryCodeTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemSummaryCode"></a>
# **deleteItemSummaryCode**
> deleteItemSummaryCode(itemSummaryCodeId)

Delete an itemSummaryCode

Deletes the itemSummaryCode identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSummaryCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSummaryCodeApi apiInstance = new ItemSummaryCodeApi();
Integer itemSummaryCodeId = 56; // Integer | Id of the itemSummaryCode to be deleted.
try {
    apiInstance.deleteItemSummaryCode(itemSummaryCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSummaryCodeApi#deleteItemSummaryCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSummaryCodeId** | **Integer**| Id of the itemSummaryCode to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteItemSummaryCodeTag"></a>
# **deleteItemSummaryCodeTag**
> deleteItemSummaryCodeTag(itemSummaryCodeId, itemSummaryCodeTag)

Delete a tag for an itemSummaryCode.

Deletes an existing itemSummaryCode tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSummaryCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSummaryCodeApi apiInstance = new ItemSummaryCodeApi();
Integer itemSummaryCodeId = 56; // Integer | Id of the itemSummaryCode to remove tag from
String itemSummaryCodeTag = "itemSummaryCodeTag_example"; // String | The tag to delete
try {
    apiInstance.deleteItemSummaryCodeTag(itemSummaryCodeId, itemSummaryCodeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSummaryCodeApi#deleteItemSummaryCodeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSummaryCodeId** | **Integer**| Id of the itemSummaryCode to remove tag from |
 **itemSummaryCodeTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateItemSummaryCodeById"></a>
# **getDuplicateItemSummaryCodeById**
> ItemSummaryCode getDuplicateItemSummaryCodeById(itemSummaryCodeId)

Get a duplicated an itemSummaryCode by id

Returns a duplicated itemSummaryCode identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSummaryCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSummaryCodeApi apiInstance = new ItemSummaryCodeApi();
Integer itemSummaryCodeId = 56; // Integer | Id of the itemSummaryCode to be duplicated.
try {
    ItemSummaryCode result = apiInstance.getDuplicateItemSummaryCodeById(itemSummaryCodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSummaryCodeApi#getDuplicateItemSummaryCodeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSummaryCodeId** | **Integer**| Id of the itemSummaryCode to be duplicated. |

### Return type

[**ItemSummaryCode**](ItemSummaryCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemSummaryCodeByFilter"></a>
# **getItemSummaryCodeByFilter**
> List&lt;ItemSummaryCode&gt; getItemSummaryCodeByFilter(filter, page, limit, sort)

Search itemSummaryCodes by filter

Returns the list of itemSummaryCodes that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSummaryCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSummaryCodeApi apiInstance = new ItemSummaryCodeApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ItemSummaryCode> result = apiInstance.getItemSummaryCodeByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSummaryCodeApi#getItemSummaryCodeByFilter");
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

[**List&lt;ItemSummaryCode&gt;**](ItemSummaryCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemSummaryCodeById"></a>
# **getItemSummaryCodeById**
> ItemSummaryCode getItemSummaryCodeById(itemSummaryCodeId)

Get an itemSummaryCode by id

Returns the itemSummaryCode identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSummaryCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSummaryCodeApi apiInstance = new ItemSummaryCodeApi();
Integer itemSummaryCodeId = 56; // Integer | Id of the itemSummaryCode to be returned.
try {
    ItemSummaryCode result = apiInstance.getItemSummaryCodeById(itemSummaryCodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSummaryCodeApi#getItemSummaryCodeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSummaryCodeId** | **Integer**| Id of the itemSummaryCode to be returned. |

### Return type

[**ItemSummaryCode**](ItemSummaryCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemSummaryCodeTags"></a>
# **getItemSummaryCodeTags**
> getItemSummaryCodeTags(itemSummaryCodeId)

Get the tags for an itemSummaryCode.

Get all existing itemSummaryCode tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSummaryCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSummaryCodeApi apiInstance = new ItemSummaryCodeApi();
Integer itemSummaryCodeId = 56; // Integer | Id of the itemSummaryCode to get tags for
try {
    apiInstance.getItemSummaryCodeTags(itemSummaryCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSummaryCodeApi#getItemSummaryCodeTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSummaryCodeId** | **Integer**| Id of the itemSummaryCode to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateItemSummaryCode"></a>
# **updateItemSummaryCode**
> updateItemSummaryCode(body)

Update an itemSummaryCode

Updates an existing itemSummaryCode using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSummaryCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSummaryCodeApi apiInstance = new ItemSummaryCodeApi();
ItemSummaryCode body = new ItemSummaryCode(); // ItemSummaryCode | ItemSummaryCode to be updated.
try {
    apiInstance.updateItemSummaryCode(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSummaryCodeApi#updateItemSummaryCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemSummaryCode**](ItemSummaryCode.md)| ItemSummaryCode to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

