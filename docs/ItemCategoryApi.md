# ItemCategoryApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addItemCategory**](ItemCategoryApi.md#addItemCategory) | **POST** /beta/itemCategory | Create an itemCategory
[**addItemCategoryAudit**](ItemCategoryApi.md#addItemCategoryAudit) | **PUT** /beta/itemCategory/{itemCategoryId}/audit/{itemCategoryAudit} | Add new audit for an itemCategory
[**addItemCategoryFile**](ItemCategoryApi.md#addItemCategoryFile) | **POST** /beta/itemCategory/{itemCategoryId}/file/{fileName} | Attach a file to an itemCategory
[**addItemCategoryTag**](ItemCategoryApi.md#addItemCategoryTag) | **PUT** /beta/itemCategory/{itemCategoryId}/tag/{itemCategoryTag} | Add new tags for an itemCategory.
[**deleteItemCategory**](ItemCategoryApi.md#deleteItemCategory) | **DELETE** /beta/itemCategory/{itemCategoryId} | Delete an itemCategory
[**deleteItemCategoryTag**](ItemCategoryApi.md#deleteItemCategoryTag) | **DELETE** /beta/itemCategory/{itemCategoryId}/tag/{itemCategoryTag} | Delete a tag for an itemCategory.
[**getDuplicateItemCategoryById**](ItemCategoryApi.md#getDuplicateItemCategoryById) | **GET** /beta/itemCategory/duplicate/{itemCategoryId} | Get a duplicated an itemCategory by id
[**getItemCategoryByFilter**](ItemCategoryApi.md#getItemCategoryByFilter) | **GET** /beta/itemCategory/search | Search itemCategorys by filter
[**getItemCategoryById**](ItemCategoryApi.md#getItemCategoryById) | **GET** /beta/itemCategory/{itemCategoryId} | Get an itemCategory by id
[**getItemCategoryTags**](ItemCategoryApi.md#getItemCategoryTags) | **GET** /beta/itemCategory/{itemCategoryId}/tag | Get the tags for an itemCategory.
[**updateItemCategory**](ItemCategoryApi.md#updateItemCategory) | **PUT** /beta/itemCategory | Update an itemCategory


<a name="addItemCategory"></a>
# **addItemCategory**
> ItemCategory addItemCategory(body)

Create an itemCategory

Inserts a new itemCategory using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemCategoryApi apiInstance = new ItemCategoryApi();
ItemCategory body = new ItemCategory(); // ItemCategory | ItemCategory to be inserted.
try {
    ItemCategory result = apiInstance.addItemCategory(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#addItemCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemCategory**](ItemCategory.md)| ItemCategory to be inserted. |

### Return type

[**ItemCategory**](ItemCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemCategoryAudit"></a>
# **addItemCategoryAudit**
> addItemCategoryAudit(itemCategoryId, itemCategoryAudit)

Add new audit for an itemCategory

Adds an audit to an existing itemCategory.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemCategoryApi apiInstance = new ItemCategoryApi();
Integer itemCategoryId = 56; // Integer | Id of the itemCategory to add an audit to
String itemCategoryAudit = "itemCategoryAudit_example"; // String | The audit to add
try {
    apiInstance.addItemCategoryAudit(itemCategoryId, itemCategoryAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#addItemCategoryAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemCategoryId** | **Integer**| Id of the itemCategory to add an audit to |
 **itemCategoryAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemCategoryFile"></a>
# **addItemCategoryFile**
> addItemCategoryFile(itemCategoryId, fileName)

Attach a file to an itemCategory

Adds a file to an existing itemCategory.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemCategoryApi apiInstance = new ItemCategoryApi();
Integer itemCategoryId = 56; // Integer | Id of the itemCategory to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addItemCategoryFile(itemCategoryId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#addItemCategoryFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemCategoryId** | **Integer**| Id of the itemCategory to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addItemCategoryTag"></a>
# **addItemCategoryTag**
> addItemCategoryTag(itemCategoryId, itemCategoryTag)

Add new tags for an itemCategory.

Adds a tag to an existing itemCategory.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemCategoryApi apiInstance = new ItemCategoryApi();
Integer itemCategoryId = 56; // Integer | Id of the itemCategory to add a tag to
String itemCategoryTag = "itemCategoryTag_example"; // String | The tag to add
try {
    apiInstance.addItemCategoryTag(itemCategoryId, itemCategoryTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#addItemCategoryTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemCategoryId** | **Integer**| Id of the itemCategory to add a tag to |
 **itemCategoryTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemCategory"></a>
# **deleteItemCategory**
> deleteItemCategory(itemCategoryId)

Delete an itemCategory

Deletes the itemCategory identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemCategoryApi apiInstance = new ItemCategoryApi();
Integer itemCategoryId = 56; // Integer | Id of the itemCategory to be deleted.
try {
    apiInstance.deleteItemCategory(itemCategoryId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#deleteItemCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemCategoryId** | **Integer**| Id of the itemCategory to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteItemCategoryTag"></a>
# **deleteItemCategoryTag**
> deleteItemCategoryTag(itemCategoryId, itemCategoryTag)

Delete a tag for an itemCategory.

Deletes an existing itemCategory tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemCategoryApi apiInstance = new ItemCategoryApi();
Integer itemCategoryId = 56; // Integer | Id of the itemCategory to remove tag from
String itemCategoryTag = "itemCategoryTag_example"; // String | The tag to delete
try {
    apiInstance.deleteItemCategoryTag(itemCategoryId, itemCategoryTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#deleteItemCategoryTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemCategoryId** | **Integer**| Id of the itemCategory to remove tag from |
 **itemCategoryTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateItemCategoryById"></a>
# **getDuplicateItemCategoryById**
> ItemCategory getDuplicateItemCategoryById(itemCategoryId)

Get a duplicated an itemCategory by id

Returns a duplicated itemCategory identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemCategoryApi apiInstance = new ItemCategoryApi();
Integer itemCategoryId = 56; // Integer | Id of the itemCategory to be duplicated.
try {
    ItemCategory result = apiInstance.getDuplicateItemCategoryById(itemCategoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#getDuplicateItemCategoryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemCategoryId** | **Integer**| Id of the itemCategory to be duplicated. |

### Return type

[**ItemCategory**](ItemCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemCategoryByFilter"></a>
# **getItemCategoryByFilter**
> List&lt;ItemCategory&gt; getItemCategoryByFilter(filter, page, limit, sort)

Search itemCategorys by filter

Returns the list of itemCategorys that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemCategoryApi apiInstance = new ItemCategoryApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ItemCategory> result = apiInstance.getItemCategoryByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#getItemCategoryByFilter");
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

[**List&lt;ItemCategory&gt;**](ItemCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemCategoryById"></a>
# **getItemCategoryById**
> ItemCategory getItemCategoryById(itemCategoryId)

Get an itemCategory by id

Returns the itemCategory identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemCategoryApi apiInstance = new ItemCategoryApi();
Integer itemCategoryId = 56; // Integer | Id of the itemCategory to be returned.
try {
    ItemCategory result = apiInstance.getItemCategoryById(itemCategoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#getItemCategoryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemCategoryId** | **Integer**| Id of the itemCategory to be returned. |

### Return type

[**ItemCategory**](ItemCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemCategoryTags"></a>
# **getItemCategoryTags**
> getItemCategoryTags(itemCategoryId)

Get the tags for an itemCategory.

Get all existing itemCategory tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemCategoryApi apiInstance = new ItemCategoryApi();
Integer itemCategoryId = 56; // Integer | Id of the itemCategory to get tags for
try {
    apiInstance.getItemCategoryTags(itemCategoryId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#getItemCategoryTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemCategoryId** | **Integer**| Id of the itemCategory to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateItemCategory"></a>
# **updateItemCategory**
> updateItemCategory(body)

Update an itemCategory

Updates an existing itemCategory using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemCategoryApi apiInstance = new ItemCategoryApi();
ItemCategory body = new ItemCategory(); // ItemCategory | ItemCategory to be updated.
try {
    apiInstance.updateItemCategory(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#updateItemCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemCategory**](ItemCategory.md)| ItemCategory to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

