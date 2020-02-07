# ItemBuyerApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addItemBuyer**](ItemBuyerApi.md#addItemBuyer) | **POST** /beta/itemBuyer | Create an itemBuyer
[**addItemBuyerAudit**](ItemBuyerApi.md#addItemBuyerAudit) | **PUT** /beta/itemBuyer/{itemBuyerId}/audit/{itemBuyerAudit} | Add new audit for an itemBuyer
[**addItemBuyerFile**](ItemBuyerApi.md#addItemBuyerFile) | **POST** /beta/itemBuyer/{itemBuyerId}/file/{fileName} | Attach a file to an itemBuyer
[**addItemBuyerFileByURL**](ItemBuyerApi.md#addItemBuyerFileByURL) | **POST** /beta/itemBuyer/{itemBuyerId}/file | Attach a file to an itemBuyer by URL.
[**addItemBuyerTag**](ItemBuyerApi.md#addItemBuyerTag) | **PUT** /beta/itemBuyer/{itemBuyerId}/tag/{itemBuyerTag} | Add new tags for an itemBuyer.
[**deleteItemBuyer**](ItemBuyerApi.md#deleteItemBuyer) | **DELETE** /beta/itemBuyer/{itemBuyerId} | Delete an itemBuyer
[**deleteItemBuyerFile**](ItemBuyerApi.md#deleteItemBuyerFile) | **DELETE** /beta/itemBuyer/{itemBuyerId}/file/{fileId} | Delete a file for an itemBuyer.
[**deleteItemBuyerTag**](ItemBuyerApi.md#deleteItemBuyerTag) | **DELETE** /beta/itemBuyer/{itemBuyerId}/tag/{itemBuyerTag} | Delete a tag for an itemBuyer.
[**getDuplicateItemBuyerById**](ItemBuyerApi.md#getDuplicateItemBuyerById) | **GET** /beta/itemBuyer/duplicate/{itemBuyerId} | Get a duplicated an itemBuyer by id
[**getItemBuyerByFilter**](ItemBuyerApi.md#getItemBuyerByFilter) | **GET** /beta/itemBuyer/search | Search itemBuyers by filter
[**getItemBuyerById**](ItemBuyerApi.md#getItemBuyerById) | **GET** /beta/itemBuyer/{itemBuyerId} | Get an itemBuyer by id
[**getItemBuyerFiles**](ItemBuyerApi.md#getItemBuyerFiles) | **GET** /beta/itemBuyer/{itemBuyerId}/file | Get the files for an itemBuyer.
[**getItemBuyerTags**](ItemBuyerApi.md#getItemBuyerTags) | **GET** /beta/itemBuyer/{itemBuyerId}/tag | Get the tags for an itemBuyer.
[**updateItemBuyer**](ItemBuyerApi.md#updateItemBuyer) | **PUT** /beta/itemBuyer | Update an itemBuyer


<a name="addItemBuyer"></a>
# **addItemBuyer**
> ItemBuyer addItemBuyer(body)

Create an itemBuyer

Inserts a new itemBuyer using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemBuyerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemBuyerApi apiInstance = new ItemBuyerApi();
ItemBuyer body = new ItemBuyer(); // ItemBuyer | ItemBuyer to be inserted.
try {
    ItemBuyer result = apiInstance.addItemBuyer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemBuyerApi#addItemBuyer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemBuyer**](ItemBuyer.md)| ItemBuyer to be inserted. |

### Return type

[**ItemBuyer**](ItemBuyer.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemBuyerAudit"></a>
# **addItemBuyerAudit**
> addItemBuyerAudit(itemBuyerId, itemBuyerAudit)

Add new audit for an itemBuyer

Adds an audit to an existing itemBuyer.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemBuyerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemBuyerApi apiInstance = new ItemBuyerApi();
Integer itemBuyerId = 56; // Integer | Id of the itemBuyer to add an audit to
String itemBuyerAudit = "itemBuyerAudit_example"; // String | The audit to add
try {
    apiInstance.addItemBuyerAudit(itemBuyerId, itemBuyerAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemBuyerApi#addItemBuyerAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemBuyerId** | **Integer**| Id of the itemBuyer to add an audit to |
 **itemBuyerAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemBuyerFile"></a>
# **addItemBuyerFile**
> addItemBuyerFile(itemBuyerId, fileName)

Attach a file to an itemBuyer

Adds a file to an existing itemBuyer.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemBuyerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemBuyerApi apiInstance = new ItemBuyerApi();
Integer itemBuyerId = 56; // Integer | Id of the itemBuyer to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addItemBuyerFile(itemBuyerId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemBuyerApi#addItemBuyerFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemBuyerId** | **Integer**| Id of the itemBuyer to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addItemBuyerFileByURL"></a>
# **addItemBuyerFileByURL**
> addItemBuyerFileByURL(body, itemBuyerId)

Attach a file to an itemBuyer by URL.

Adds a file to an existing itemBuyer by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemBuyerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemBuyerApi apiInstance = new ItemBuyerApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer itemBuyerId = 56; // Integer | Id of the itemBuyer to add an file to
try {
    apiInstance.addItemBuyerFileByURL(body, itemBuyerId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemBuyerApi#addItemBuyerFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **itemBuyerId** | **Integer**| Id of the itemBuyer to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemBuyerTag"></a>
# **addItemBuyerTag**
> addItemBuyerTag(itemBuyerId, itemBuyerTag)

Add new tags for an itemBuyer.

Adds a tag to an existing itemBuyer.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemBuyerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemBuyerApi apiInstance = new ItemBuyerApi();
Integer itemBuyerId = 56; // Integer | Id of the itemBuyer to add a tag to
String itemBuyerTag = "itemBuyerTag_example"; // String | The tag to add
try {
    apiInstance.addItemBuyerTag(itemBuyerId, itemBuyerTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemBuyerApi#addItemBuyerTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemBuyerId** | **Integer**| Id of the itemBuyer to add a tag to |
 **itemBuyerTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemBuyer"></a>
# **deleteItemBuyer**
> deleteItemBuyer(itemBuyerId)

Delete an itemBuyer

Deletes the itemBuyer identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemBuyerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemBuyerApi apiInstance = new ItemBuyerApi();
Integer itemBuyerId = 56; // Integer | Id of the itemBuyer to be deleted.
try {
    apiInstance.deleteItemBuyer(itemBuyerId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemBuyerApi#deleteItemBuyer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemBuyerId** | **Integer**| Id of the itemBuyer to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteItemBuyerFile"></a>
# **deleteItemBuyerFile**
> deleteItemBuyerFile(itemBuyerId, fileId)

Delete a file for an itemBuyer.

Deletes an existing itemBuyer file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemBuyerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemBuyerApi apiInstance = new ItemBuyerApi();
Integer itemBuyerId = 56; // Integer | Id of the itemBuyer to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteItemBuyerFile(itemBuyerId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemBuyerApi#deleteItemBuyerFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemBuyerId** | **Integer**| Id of the itemBuyer to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteItemBuyerTag"></a>
# **deleteItemBuyerTag**
> deleteItemBuyerTag(itemBuyerId, itemBuyerTag)

Delete a tag for an itemBuyer.

Deletes an existing itemBuyer tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemBuyerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemBuyerApi apiInstance = new ItemBuyerApi();
Integer itemBuyerId = 56; // Integer | Id of the itemBuyer to remove tag from
String itemBuyerTag = "itemBuyerTag_example"; // String | The tag to delete
try {
    apiInstance.deleteItemBuyerTag(itemBuyerId, itemBuyerTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemBuyerApi#deleteItemBuyerTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemBuyerId** | **Integer**| Id of the itemBuyer to remove tag from |
 **itemBuyerTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateItemBuyerById"></a>
# **getDuplicateItemBuyerById**
> ItemBuyer getDuplicateItemBuyerById(itemBuyerId)

Get a duplicated an itemBuyer by id

Returns a duplicated itemBuyer identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemBuyerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemBuyerApi apiInstance = new ItemBuyerApi();
Integer itemBuyerId = 56; // Integer | Id of the itemBuyer to be duplicated.
try {
    ItemBuyer result = apiInstance.getDuplicateItemBuyerById(itemBuyerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemBuyerApi#getDuplicateItemBuyerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemBuyerId** | **Integer**| Id of the itemBuyer to be duplicated. |

### Return type

[**ItemBuyer**](ItemBuyer.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemBuyerByFilter"></a>
# **getItemBuyerByFilter**
> List&lt;ItemBuyer&gt; getItemBuyerByFilter(filter, page, limit, sort)

Search itemBuyers by filter

Returns the list of itemBuyers that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemBuyerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemBuyerApi apiInstance = new ItemBuyerApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ItemBuyer> result = apiInstance.getItemBuyerByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemBuyerApi#getItemBuyerByFilter");
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

[**List&lt;ItemBuyer&gt;**](ItemBuyer.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemBuyerById"></a>
# **getItemBuyerById**
> ItemBuyer getItemBuyerById(itemBuyerId)

Get an itemBuyer by id

Returns the itemBuyer identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemBuyerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemBuyerApi apiInstance = new ItemBuyerApi();
Integer itemBuyerId = 56; // Integer | Id of the itemBuyer to be returned.
try {
    ItemBuyer result = apiInstance.getItemBuyerById(itemBuyerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemBuyerApi#getItemBuyerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemBuyerId** | **Integer**| Id of the itemBuyer to be returned. |

### Return type

[**ItemBuyer**](ItemBuyer.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemBuyerFiles"></a>
# **getItemBuyerFiles**
> getItemBuyerFiles(itemBuyerId)

Get the files for an itemBuyer.

Get all existing itemBuyer files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemBuyerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemBuyerApi apiInstance = new ItemBuyerApi();
Integer itemBuyerId = 56; // Integer | Id of the itemBuyer to get files for
try {
    apiInstance.getItemBuyerFiles(itemBuyerId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemBuyerApi#getItemBuyerFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemBuyerId** | **Integer**| Id of the itemBuyer to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemBuyerTags"></a>
# **getItemBuyerTags**
> getItemBuyerTags(itemBuyerId)

Get the tags for an itemBuyer.

Get all existing itemBuyer tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemBuyerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemBuyerApi apiInstance = new ItemBuyerApi();
Integer itemBuyerId = 56; // Integer | Id of the itemBuyer to get tags for
try {
    apiInstance.getItemBuyerTags(itemBuyerId);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemBuyerApi#getItemBuyerTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemBuyerId** | **Integer**| Id of the itemBuyer to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateItemBuyer"></a>
# **updateItemBuyer**
> updateItemBuyer(body)

Update an itemBuyer

Updates an existing itemBuyer using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemBuyerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemBuyerApi apiInstance = new ItemBuyerApi();
ItemBuyer body = new ItemBuyer(); // ItemBuyer | ItemBuyer to be updated.
try {
    apiInstance.updateItemBuyer(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemBuyerApi#updateItemBuyer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ItemBuyer**](ItemBuyer.md)| ItemBuyer to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

