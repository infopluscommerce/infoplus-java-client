# ItemSerialApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addItemSerial**](ItemSerialApi.md#addItemSerial) | **POST** /beta/itemSerial | Create an itemSerial
[**addItemSerialAudit**](ItemSerialApi.md#addItemSerialAudit) | **PUT** /beta/itemSerial/{itemSerialId}/audit/{itemSerialAudit} | Add new audit for an itemSerial
[**addItemSerialTag**](ItemSerialApi.md#addItemSerialTag) | **PUT** /beta/itemSerial/{itemSerialId}/tag/{itemSerialTag} | Add new tags for an itemSerial.
[**deleteItemSerial**](ItemSerialApi.md#deleteItemSerial) | **DELETE** /beta/itemSerial/{itemSerialId} | Delete an itemSerial
[**deleteItemSerialTag**](ItemSerialApi.md#deleteItemSerialTag) | **DELETE** /beta/itemSerial/{itemSerialId}/tag/{itemSerialTag} | Delete a tag for an itemSerial.
[**getDuplicateItemSerialById**](ItemSerialApi.md#getDuplicateItemSerialById) | **GET** /beta/itemSerial/duplicate/{itemSerialId} | Get a duplicated an itemSerial by id
[**getItemSerialByFilter**](ItemSerialApi.md#getItemSerialByFilter) | **GET** /beta/itemSerial/search | Search itemSerials by filter
[**getItemSerialById**](ItemSerialApi.md#getItemSerialById) | **GET** /beta/itemSerial/{itemSerialId} | Get an itemSerial by id
[**getItemSerialTags**](ItemSerialApi.md#getItemSerialTags) | **GET** /beta/itemSerial/{itemSerialId}/tag | Get the tags for an itemSerial.
[**updateItemSerial**](ItemSerialApi.md#updateItemSerial) | **PUT** /beta/itemSerial | Update an itemSerial


<a name="addItemSerial"></a>
# **addItemSerial**
> ItemSerial addItemSerial(body)

Create an itemSerial

Inserts a new itemSerial using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialApi apiInstance = new ItemSerialApi();
ItemSerial body = new ItemSerial(); // ItemSerial | ItemSerial to be inserted.
try {
    ItemSerial result = apiInstance.addItemSerial(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialApi#addItemSerial");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemSerial**](ItemSerial.md)| ItemSerial to be inserted. |

### Return type

[**ItemSerial**](ItemSerial.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemSerialAudit"></a>
# **addItemSerialAudit**
> addItemSerialAudit(itemSerialId, itemSerialAudit)

Add new audit for an itemSerial

Adds an audit to an existing itemSerial.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialApi apiInstance = new ItemSerialApi();
Integer itemSerialId = 56; // Integer | Id of the itemSerial to add an audit to
String itemSerialAudit = "itemSerialAudit_example"; // String | The audit to add
try {
    apiInstance.addItemSerialAudit(itemSerialId, itemSerialAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialApi#addItemSerialAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSerialId** | **Integer**| Id of the itemSerial to add an audit to |
 **itemSerialAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemSerialTag"></a>
# **addItemSerialTag**
> addItemSerialTag(itemSerialId, itemSerialTag)

Add new tags for an itemSerial.

Adds a tag to an existing itemSerial.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialApi apiInstance = new ItemSerialApi();
Integer itemSerialId = 56; // Integer | Id of the itemSerial to add a tag to
String itemSerialTag = "itemSerialTag_example"; // String | The tag to add
try {
    apiInstance.addItemSerialTag(itemSerialId, itemSerialTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialApi#addItemSerialTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSerialId** | **Integer**| Id of the itemSerial to add a tag to |
 **itemSerialTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemSerial"></a>
# **deleteItemSerial**
> deleteItemSerial(itemSerialId)

Delete an itemSerial

Deletes the itemSerial identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialApi apiInstance = new ItemSerialApi();
Integer itemSerialId = 56; // Integer | Id of the itemSerial to be deleted.
try {
    apiInstance.deleteItemSerial(itemSerialId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialApi#deleteItemSerial");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSerialId** | **Integer**| Id of the itemSerial to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteItemSerialTag"></a>
# **deleteItemSerialTag**
> deleteItemSerialTag(itemSerialId, itemSerialTag)

Delete a tag for an itemSerial.

Deletes an existing itemSerial tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialApi apiInstance = new ItemSerialApi();
Integer itemSerialId = 56; // Integer | Id of the itemSerial to remove tag from
String itemSerialTag = "itemSerialTag_example"; // String | The tag to delete
try {
    apiInstance.deleteItemSerialTag(itemSerialId, itemSerialTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialApi#deleteItemSerialTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSerialId** | **Integer**| Id of the itemSerial to remove tag from |
 **itemSerialTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateItemSerialById"></a>
# **getDuplicateItemSerialById**
> ItemSerial getDuplicateItemSerialById(itemSerialId)

Get a duplicated an itemSerial by id

Returns a duplicated itemSerial identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialApi apiInstance = new ItemSerialApi();
Integer itemSerialId = 56; // Integer | Id of the itemSerial to be duplicated.
try {
    ItemSerial result = apiInstance.getDuplicateItemSerialById(itemSerialId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialApi#getDuplicateItemSerialById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSerialId** | **Integer**| Id of the itemSerial to be duplicated. |

### Return type

[**ItemSerial**](ItemSerial.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemSerialByFilter"></a>
# **getItemSerialByFilter**
> List&lt;ItemSerial&gt; getItemSerialByFilter(filter, page, limit, sort)

Search itemSerials by filter

Returns the list of itemSerials that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialApi apiInstance = new ItemSerialApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ItemSerial> result = apiInstance.getItemSerialByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialApi#getItemSerialByFilter");
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

[**List&lt;ItemSerial&gt;**](ItemSerial.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemSerialById"></a>
# **getItemSerialById**
> ItemSerial getItemSerialById(itemSerialId)

Get an itemSerial by id

Returns the itemSerial identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialApi apiInstance = new ItemSerialApi();
Integer itemSerialId = 56; // Integer | Id of the itemSerial to be returned.
try {
    ItemSerial result = apiInstance.getItemSerialById(itemSerialId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialApi#getItemSerialById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSerialId** | **Integer**| Id of the itemSerial to be returned. |

### Return type

[**ItemSerial**](ItemSerial.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemSerialTags"></a>
# **getItemSerialTags**
> getItemSerialTags(itemSerialId)

Get the tags for an itemSerial.

Get all existing itemSerial tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialApi apiInstance = new ItemSerialApi();
Integer itemSerialId = 56; // Integer | Id of the itemSerial to get tags for
try {
    apiInstance.getItemSerialTags(itemSerialId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialApi#getItemSerialTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSerialId** | **Integer**| Id of the itemSerial to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateItemSerial"></a>
# **updateItemSerial**
> updateItemSerial(body)

Update an itemSerial

Updates an existing itemSerial using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSerialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSerialApi apiInstance = new ItemSerialApi();
ItemSerial body = new ItemSerial(); // ItemSerial | ItemSerial to be updated.
try {
    apiInstance.updateItemSerial(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSerialApi#updateItemSerial");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemSerial**](ItemSerial.md)| ItemSerial to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

