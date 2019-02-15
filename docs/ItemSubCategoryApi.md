# ItemSubCategoryApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addItemSubCategory**](ItemSubCategoryApi.md#addItemSubCategory) | **POST** /beta/itemSubCategory | Create an itemSubCategory
[**addItemSubCategoryAudit**](ItemSubCategoryApi.md#addItemSubCategoryAudit) | **PUT** /beta/itemSubCategory/{itemSubCategoryId}/audit/{itemSubCategoryAudit} | Add new audit for an itemSubCategory
[**addItemSubCategoryTag**](ItemSubCategoryApi.md#addItemSubCategoryTag) | **PUT** /beta/itemSubCategory/{itemSubCategoryId}/tag/{itemSubCategoryTag} | Add new tags for an itemSubCategory.
[**deleteItemSubCategory**](ItemSubCategoryApi.md#deleteItemSubCategory) | **DELETE** /beta/itemSubCategory/{itemSubCategoryId} | Delete an itemSubCategory
[**deleteItemSubCategoryTag**](ItemSubCategoryApi.md#deleteItemSubCategoryTag) | **DELETE** /beta/itemSubCategory/{itemSubCategoryId}/tag/{itemSubCategoryTag} | Delete a tag for an itemSubCategory.
[**getDuplicateItemSubCategoryById**](ItemSubCategoryApi.md#getDuplicateItemSubCategoryById) | **GET** /beta/itemSubCategory/duplicate/{itemSubCategoryId} | Get a duplicated an itemSubCategory by id
[**getItemSubCategoryByFilter**](ItemSubCategoryApi.md#getItemSubCategoryByFilter) | **GET** /beta/itemSubCategory/search | Search itemSubCategorys by filter
[**getItemSubCategoryById**](ItemSubCategoryApi.md#getItemSubCategoryById) | **GET** /beta/itemSubCategory/{itemSubCategoryId} | Get an itemSubCategory by id
[**getItemSubCategoryTags**](ItemSubCategoryApi.md#getItemSubCategoryTags) | **GET** /beta/itemSubCategory/{itemSubCategoryId}/tag | Get the tags for an itemSubCategory.
[**updateItemSubCategory**](ItemSubCategoryApi.md#updateItemSubCategory) | **PUT** /beta/itemSubCategory | Update an itemSubCategory


<a name="addItemSubCategory"></a>
# **addItemSubCategory**
> ItemSubCategory addItemSubCategory(body)

Create an itemSubCategory

Inserts a new itemSubCategory using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSubCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSubCategoryApi apiInstance = new ItemSubCategoryApi();
ItemSubCategory body = new ItemSubCategory(); // ItemSubCategory | ItemSubCategory to be inserted.
try {
    ItemSubCategory result = apiInstance.addItemSubCategory(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSubCategoryApi#addItemSubCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemSubCategory**](ItemSubCategory.md)| ItemSubCategory to be inserted. |

### Return type

[**ItemSubCategory**](ItemSubCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemSubCategoryAudit"></a>
# **addItemSubCategoryAudit**
> addItemSubCategoryAudit(itemSubCategoryId, itemSubCategoryAudit)

Add new audit for an itemSubCategory

Adds an audit to an existing itemSubCategory.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSubCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSubCategoryApi apiInstance = new ItemSubCategoryApi();
Integer itemSubCategoryId = 56; // Integer | Id of the itemSubCategory to add an audit to
String itemSubCategoryAudit = "itemSubCategoryAudit_example"; // String | The audit to add
try {
    apiInstance.addItemSubCategoryAudit(itemSubCategoryId, itemSubCategoryAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSubCategoryApi#addItemSubCategoryAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSubCategoryId** | **Integer**| Id of the itemSubCategory to add an audit to |
 **itemSubCategoryAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemSubCategoryTag"></a>
# **addItemSubCategoryTag**
> addItemSubCategoryTag(itemSubCategoryId, itemSubCategoryTag)

Add new tags for an itemSubCategory.

Adds a tag to an existing itemSubCategory.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSubCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSubCategoryApi apiInstance = new ItemSubCategoryApi();
Integer itemSubCategoryId = 56; // Integer | Id of the itemSubCategory to add a tag to
String itemSubCategoryTag = "itemSubCategoryTag_example"; // String | The tag to add
try {
    apiInstance.addItemSubCategoryTag(itemSubCategoryId, itemSubCategoryTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSubCategoryApi#addItemSubCategoryTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSubCategoryId** | **Integer**| Id of the itemSubCategory to add a tag to |
 **itemSubCategoryTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemSubCategory"></a>
# **deleteItemSubCategory**
> deleteItemSubCategory(itemSubCategoryId)

Delete an itemSubCategory

Deletes the itemSubCategory identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSubCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSubCategoryApi apiInstance = new ItemSubCategoryApi();
Integer itemSubCategoryId = 56; // Integer | Id of the itemSubCategory to be deleted.
try {
    apiInstance.deleteItemSubCategory(itemSubCategoryId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSubCategoryApi#deleteItemSubCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSubCategoryId** | **Integer**| Id of the itemSubCategory to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteItemSubCategoryTag"></a>
# **deleteItemSubCategoryTag**
> deleteItemSubCategoryTag(itemSubCategoryId, itemSubCategoryTag)

Delete a tag for an itemSubCategory.

Deletes an existing itemSubCategory tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSubCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSubCategoryApi apiInstance = new ItemSubCategoryApi();
Integer itemSubCategoryId = 56; // Integer | Id of the itemSubCategory to remove tag from
String itemSubCategoryTag = "itemSubCategoryTag_example"; // String | The tag to delete
try {
    apiInstance.deleteItemSubCategoryTag(itemSubCategoryId, itemSubCategoryTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSubCategoryApi#deleteItemSubCategoryTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSubCategoryId** | **Integer**| Id of the itemSubCategory to remove tag from |
 **itemSubCategoryTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateItemSubCategoryById"></a>
# **getDuplicateItemSubCategoryById**
> ItemSubCategory getDuplicateItemSubCategoryById(itemSubCategoryId)

Get a duplicated an itemSubCategory by id

Returns a duplicated itemSubCategory identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSubCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSubCategoryApi apiInstance = new ItemSubCategoryApi();
Integer itemSubCategoryId = 56; // Integer | Id of the itemSubCategory to be duplicated.
try {
    ItemSubCategory result = apiInstance.getDuplicateItemSubCategoryById(itemSubCategoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSubCategoryApi#getDuplicateItemSubCategoryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSubCategoryId** | **Integer**| Id of the itemSubCategory to be duplicated. |

### Return type

[**ItemSubCategory**](ItemSubCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemSubCategoryByFilter"></a>
# **getItemSubCategoryByFilter**
> List&lt;ItemSubCategory&gt; getItemSubCategoryByFilter(filter, page, limit, sort)

Search itemSubCategorys by filter

Returns the list of itemSubCategorys that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSubCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSubCategoryApi apiInstance = new ItemSubCategoryApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ItemSubCategory> result = apiInstance.getItemSubCategoryByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSubCategoryApi#getItemSubCategoryByFilter");
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

[**List&lt;ItemSubCategory&gt;**](ItemSubCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemSubCategoryById"></a>
# **getItemSubCategoryById**
> ItemSubCategory getItemSubCategoryById(itemSubCategoryId)

Get an itemSubCategory by id

Returns the itemSubCategory identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSubCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSubCategoryApi apiInstance = new ItemSubCategoryApi();
Integer itemSubCategoryId = 56; // Integer | Id of the itemSubCategory to be returned.
try {
    ItemSubCategory result = apiInstance.getItemSubCategoryById(itemSubCategoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSubCategoryApi#getItemSubCategoryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSubCategoryId** | **Integer**| Id of the itemSubCategory to be returned. |

### Return type

[**ItemSubCategory**](ItemSubCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemSubCategoryTags"></a>
# **getItemSubCategoryTags**
> getItemSubCategoryTags(itemSubCategoryId)

Get the tags for an itemSubCategory.

Get all existing itemSubCategory tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSubCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSubCategoryApi apiInstance = new ItemSubCategoryApi();
Integer itemSubCategoryId = 56; // Integer | Id of the itemSubCategory to get tags for
try {
    apiInstance.getItemSubCategoryTags(itemSubCategoryId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSubCategoryApi#getItemSubCategoryTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSubCategoryId** | **Integer**| Id of the itemSubCategory to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateItemSubCategory"></a>
# **updateItemSubCategory**
> updateItemSubCategory(body)

Update an itemSubCategory

Updates an existing itemSubCategory using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemSubCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemSubCategoryApi apiInstance = new ItemSubCategoryApi();
ItemSubCategory body = new ItemSubCategory(); // ItemSubCategory | ItemSubCategory to be updated.
try {
    apiInstance.updateItemSubCategory(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemSubCategoryApi#updateItemSubCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemSubCategory**](ItemSubCategory.md)| ItemSubCategory to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

