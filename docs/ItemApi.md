# ItemApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addItem**](ItemApi.md#addItem) | **POST** /beta/item | Create an item
[**addItemAudit**](ItemApi.md#addItemAudit) | **PUT** /beta/item/{itemId}/audit/{itemAudit} | Add new audit for an item
[**addItemFile**](ItemApi.md#addItemFile) | **POST** /beta/item/{itemId}/file/{fileName} | Attach a file to an item
[**addItemTag**](ItemApi.md#addItemTag) | **PUT** /beta/item/{itemId}/tag/{itemTag} | Add new tags for an item.
[**deleteItem**](ItemApi.md#deleteItem) | **DELETE** /beta/item/{itemId} | Delete an item
[**deleteItemTag**](ItemApi.md#deleteItemTag) | **DELETE** /beta/item/{itemId}/tag/{itemTag} | Delete a tag for an item.
[**getBySKU**](ItemApi.md#getBySKU) | **GET** /beta/item/getBySKU | Get an item by SKU
[**getDuplicateItemById**](ItemApi.md#getDuplicateItemById) | **GET** /beta/item/duplicate/{itemId} | Get a duplicated an item by id
[**getItemByFilter**](ItemApi.md#getItemByFilter) | **GET** /beta/item/search | Search items by filter
[**getItemById**](ItemApi.md#getItemById) | **GET** /beta/item/{itemId} | Get an item by id
[**getItemTags**](ItemApi.md#getItemTags) | **GET** /beta/item/{itemId}/tag | Get the tags for an item.
[**updateItem**](ItemApi.md#updateItem) | **PUT** /beta/item | Update an item
[**updateItemCustomFields**](ItemApi.md#updateItemCustomFields) | **PUT** /beta/item/customFields | Update an item custom fields


<a name="addItem"></a>
# **addItem**
> Item addItem(body)

Create an item

Inserts a new item using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
Item body = new Item(); // Item | Item to be inserted.
try {
    Item result = apiInstance.addItem(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#addItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Item**](Item.md)| Item to be inserted. |

### Return type

[**Item**](Item.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemAudit"></a>
# **addItemAudit**
> addItemAudit(itemId, itemAudit)

Add new audit for an item

Adds an audit to an existing item.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
Integer itemId = 56; // Integer | Id of the item to add an audit to
String itemAudit = "itemAudit_example"; // String | The audit to add
try {
    apiInstance.addItemAudit(itemId, itemAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#addItemAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**| Id of the item to add an audit to |
 **itemAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemFile"></a>
# **addItemFile**
> addItemFile(itemId, fileName)

Attach a file to an item

Adds a file to an existing item.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
Integer itemId = 56; // Integer | Id of the item to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addItemFile(itemId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#addItemFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**| Id of the item to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addItemTag"></a>
# **addItemTag**
> addItemTag(itemId, itemTag)

Add new tags for an item.

Adds a tag to an existing item.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
Integer itemId = 56; // Integer | Id of the item to add a tag to
String itemTag = "itemTag_example"; // String | The tag to add
try {
    apiInstance.addItemTag(itemId, itemTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#addItemTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**| Id of the item to add a tag to |
 **itemTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItem"></a>
# **deleteItem**
> deleteItem(itemId)

Delete an item

Deletes the item identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
Integer itemId = 56; // Integer | Id of the item to be deleted.
try {
    apiInstance.deleteItem(itemId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#deleteItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**| Id of the item to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteItemTag"></a>
# **deleteItemTag**
> deleteItemTag(itemId, itemTag)

Delete a tag for an item.

Deletes an existing item tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
Integer itemId = 56; // Integer | Id of the item to remove tag from
String itemTag = "itemTag_example"; // String | The tag to delete
try {
    apiInstance.deleteItemTag(itemId, itemTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#deleteItemTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**| Id of the item to remove tag from |
 **itemTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBySKU"></a>
# **getBySKU**
> Item getBySKU(lobId, sku)

Get an item by SKU

Returns the item identified by the specified parameters.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
Integer lobId = 56; // Integer | lobId of the item to be returned.
String sku = "sku_example"; // String | sku of the item to be returned.
try {
    Item result = apiInstance.getBySKU(lobId, sku);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getBySKU");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lobId** | **Integer**| lobId of the item to be returned. |
 **sku** | **String**| sku of the item to be returned. |

### Return type

[**Item**](Item.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateItemById"></a>
# **getDuplicateItemById**
> Item getDuplicateItemById(itemId)

Get a duplicated an item by id

Returns a duplicated item identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
Integer itemId = 56; // Integer | Id of the item to be duplicated.
try {
    Item result = apiInstance.getDuplicateItemById(itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getDuplicateItemById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**| Id of the item to be duplicated. |

### Return type

[**Item**](Item.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemByFilter"></a>
# **getItemByFilter**
> List&lt;Item&gt; getItemByFilter(filter, page, limit, sort)

Search items by filter

Returns the list of items that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Item> result = apiInstance.getItemByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getItemByFilter");
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

[**List&lt;Item&gt;**](Item.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemById"></a>
# **getItemById**
> Item getItemById(itemId)

Get an item by id

Returns the item identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
Integer itemId = 56; // Integer | Id of the item to be returned.
try {
    Item result = apiInstance.getItemById(itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getItemById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**| Id of the item to be returned. |

### Return type

[**Item**](Item.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemTags"></a>
# **getItemTags**
> getItemTags(itemId)

Get the tags for an item.

Get all existing item tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
Integer itemId = 56; // Integer | Id of the item to get tags for
try {
    apiInstance.getItemTags(itemId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getItemTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**| Id of the item to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateItem"></a>
# **updateItem**
> updateItem(body)

Update an item

Updates an existing item using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
Item body = new Item(); // Item | Item to be updated.
try {
    apiInstance.updateItem(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#updateItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Item**](Item.md)| Item to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateItemCustomFields"></a>
# **updateItemCustomFields**
> updateItemCustomFields(body)

Update an item custom fields

Updates an existing item custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
Item body = new Item(); // Item | Item to be updated.
try {
    apiInstance.updateItemCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#updateItemCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Item**](Item.md)| Item to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

