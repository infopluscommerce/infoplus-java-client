# ItemReceiptApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addItemReceiptAudit**](ItemReceiptApi.md#addItemReceiptAudit) | **PUT** /beta/itemReceipt/{itemReceiptId}/audit/{itemReceiptAudit} | Add new audit for an itemReceipt
[**addItemReceiptTag**](ItemReceiptApi.md#addItemReceiptTag) | **PUT** /beta/itemReceipt/{itemReceiptId}/tag/{itemReceiptTag} | Add new tags for an itemReceipt.
[**deleteItemReceiptTag**](ItemReceiptApi.md#deleteItemReceiptTag) | **DELETE** /beta/itemReceipt/{itemReceiptId}/tag/{itemReceiptTag} | Delete a tag for an itemReceipt.
[**getDuplicateItemReceiptById**](ItemReceiptApi.md#getDuplicateItemReceiptById) | **GET** /beta/itemReceipt/duplicate/{itemReceiptId} | Get a duplicated an itemReceipt by id
[**getItemReceiptByFilter**](ItemReceiptApi.md#getItemReceiptByFilter) | **GET** /beta/itemReceipt/search | Search itemReceipts by filter
[**getItemReceiptById**](ItemReceiptApi.md#getItemReceiptById) | **GET** /beta/itemReceipt/{itemReceiptId} | Get an itemReceipt by id
[**getItemReceiptTags**](ItemReceiptApi.md#getItemReceiptTags) | **GET** /beta/itemReceipt/{itemReceiptId}/tag | Get the tags for an itemReceipt.
[**updateItemReceipt**](ItemReceiptApi.md#updateItemReceipt) | **PUT** /beta/itemReceipt | Update an itemReceipt
[**updateItemReceiptCustomFields**](ItemReceiptApi.md#updateItemReceiptCustomFields) | **PUT** /beta/itemReceipt/customFields | Update an itemReceipt custom fields


<a name="addItemReceiptAudit"></a>
# **addItemReceiptAudit**
> addItemReceiptAudit(itemReceiptId, itemReceiptAudit)

Add new audit for an itemReceipt

Adds an audit to an existing itemReceipt.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptApi apiInstance = new ItemReceiptApi();
Integer itemReceiptId = 56; // Integer | Id of the itemReceipt to add an audit to
String itemReceiptAudit = "itemReceiptAudit_example"; // String | The audit to add
try {
    apiInstance.addItemReceiptAudit(itemReceiptId, itemReceiptAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptApi#addItemReceiptAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemReceiptId** | **Integer**| Id of the itemReceipt to add an audit to |
 **itemReceiptAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemReceiptTag"></a>
# **addItemReceiptTag**
> addItemReceiptTag(itemReceiptId, itemReceiptTag)

Add new tags for an itemReceipt.

Adds a tag to an existing itemReceipt.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptApi apiInstance = new ItemReceiptApi();
Integer itemReceiptId = 56; // Integer | Id of the itemReceipt to add a tag to
String itemReceiptTag = "itemReceiptTag_example"; // String | The tag to add
try {
    apiInstance.addItemReceiptTag(itemReceiptId, itemReceiptTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptApi#addItemReceiptTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemReceiptId** | **Integer**| Id of the itemReceipt to add a tag to |
 **itemReceiptTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemReceiptTag"></a>
# **deleteItemReceiptTag**
> deleteItemReceiptTag(itemReceiptId, itemReceiptTag)

Delete a tag for an itemReceipt.

Deletes an existing itemReceipt tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptApi apiInstance = new ItemReceiptApi();
Integer itemReceiptId = 56; // Integer | Id of the itemReceipt to remove tag from
String itemReceiptTag = "itemReceiptTag_example"; // String | The tag to delete
try {
    apiInstance.deleteItemReceiptTag(itemReceiptId, itemReceiptTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptApi#deleteItemReceiptTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemReceiptId** | **Integer**| Id of the itemReceipt to remove tag from |
 **itemReceiptTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateItemReceiptById"></a>
# **getDuplicateItemReceiptById**
> ItemReceipt getDuplicateItemReceiptById(itemReceiptId)

Get a duplicated an itemReceipt by id

Returns a duplicated itemReceipt identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptApi apiInstance = new ItemReceiptApi();
Integer itemReceiptId = 56; // Integer | Id of the itemReceipt to be duplicated.
try {
    ItemReceipt result = apiInstance.getDuplicateItemReceiptById(itemReceiptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptApi#getDuplicateItemReceiptById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemReceiptId** | **Integer**| Id of the itemReceipt to be duplicated. |

### Return type

[**ItemReceipt**](ItemReceipt.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemReceiptByFilter"></a>
# **getItemReceiptByFilter**
> List&lt;ItemReceipt&gt; getItemReceiptByFilter(filter, page, limit, sort)

Search itemReceipts by filter

Returns the list of itemReceipts that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptApi apiInstance = new ItemReceiptApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ItemReceipt> result = apiInstance.getItemReceiptByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptApi#getItemReceiptByFilter");
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

[**List&lt;ItemReceipt&gt;**](ItemReceipt.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemReceiptById"></a>
# **getItemReceiptById**
> ItemReceipt getItemReceiptById(itemReceiptId)

Get an itemReceipt by id

Returns the itemReceipt identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptApi apiInstance = new ItemReceiptApi();
Integer itemReceiptId = 56; // Integer | Id of the itemReceipt to be returned.
try {
    ItemReceipt result = apiInstance.getItemReceiptById(itemReceiptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptApi#getItemReceiptById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemReceiptId** | **Integer**| Id of the itemReceipt to be returned. |

### Return type

[**ItemReceipt**](ItemReceipt.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemReceiptTags"></a>
# **getItemReceiptTags**
> getItemReceiptTags(itemReceiptId)

Get the tags for an itemReceipt.

Get all existing itemReceipt tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptApi apiInstance = new ItemReceiptApi();
Integer itemReceiptId = 56; // Integer | Id of the itemReceipt to get tags for
try {
    apiInstance.getItemReceiptTags(itemReceiptId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptApi#getItemReceiptTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemReceiptId** | **Integer**| Id of the itemReceipt to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateItemReceipt"></a>
# **updateItemReceipt**
> updateItemReceipt(body)

Update an itemReceipt

Updates an existing itemReceipt using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptApi apiInstance = new ItemReceiptApi();
ItemReceipt body = new ItemReceipt(); // ItemReceipt | ItemReceipt to be updated.
try {
    apiInstance.updateItemReceipt(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptApi#updateItemReceipt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemReceipt**](ItemReceipt.md)| ItemReceipt to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateItemReceiptCustomFields"></a>
# **updateItemReceiptCustomFields**
> updateItemReceiptCustomFields(body)

Update an itemReceipt custom fields

Updates an existing itemReceipt custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemReceiptApi apiInstance = new ItemReceiptApi();
ItemReceipt body = new ItemReceipt(); // ItemReceipt | ItemReceipt to be updated.
try {
    apiInstance.updateItemReceiptCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemReceiptApi#updateItemReceiptCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemReceipt**](ItemReceipt.md)| ItemReceipt to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

