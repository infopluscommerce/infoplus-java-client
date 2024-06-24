# OrderActivityApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrderActivity**](OrderActivityApi.md#addOrderActivity) | **POST** /beta/orderActivity | Create an orderActivity
[**addOrderActivityAudit**](OrderActivityApi.md#addOrderActivityAudit) | **PUT** /beta/orderActivity/{orderActivityId}/audit/{orderActivityAudit} | Add new audit for an orderActivity
[**addOrderActivityFile**](OrderActivityApi.md#addOrderActivityFile) | **POST** /beta/orderActivity/{orderActivityId}/file/{fileName} | Attach a file to an orderActivity
[**addOrderActivityFileByURL**](OrderActivityApi.md#addOrderActivityFileByURL) | **POST** /beta/orderActivity/{orderActivityId}/file | Attach a file to an orderActivity by URL.
[**addOrderActivityTag**](OrderActivityApi.md#addOrderActivityTag) | **PUT** /beta/orderActivity/{orderActivityId}/tag/{orderActivityTag} | Add new tags for an orderActivity.
[**deleteOrderActivity**](OrderActivityApi.md#deleteOrderActivity) | **DELETE** /beta/orderActivity/{orderActivityId} | Delete an orderActivity
[**deleteOrderActivityFile**](OrderActivityApi.md#deleteOrderActivityFile) | **DELETE** /beta/orderActivity/{orderActivityId}/file/{fileId} | Delete a file for an orderActivity.
[**deleteOrderActivityTag**](OrderActivityApi.md#deleteOrderActivityTag) | **DELETE** /beta/orderActivity/{orderActivityId}/tag/{orderActivityTag} | Delete a tag for an orderActivity.
[**getDuplicateOrderActivityById**](OrderActivityApi.md#getDuplicateOrderActivityById) | **GET** /beta/orderActivity/duplicate/{orderActivityId} | Get a duplicated an orderActivity by id
[**getOrderActivityByFilter**](OrderActivityApi.md#getOrderActivityByFilter) | **GET** /beta/orderActivity/search | Search orderActivitys by filter
[**getOrderActivityById**](OrderActivityApi.md#getOrderActivityById) | **GET** /beta/orderActivity/{orderActivityId} | Get an orderActivity by id
[**getOrderActivityFiles**](OrderActivityApi.md#getOrderActivityFiles) | **GET** /beta/orderActivity/{orderActivityId}/file | Get the files for an orderActivity.
[**getOrderActivityTags**](OrderActivityApi.md#getOrderActivityTags) | **GET** /beta/orderActivity/{orderActivityId}/tag | Get the tags for an orderActivity.
[**updateOrderActivity**](OrderActivityApi.md#updateOrderActivity) | **PUT** /beta/orderActivity | Update an orderActivity


<a name="addOrderActivity"></a>
# **addOrderActivity**
> OrderActivity addOrderActivity(body)

Create an orderActivity

Inserts a new orderActivity using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderActivityApi apiInstance = new OrderActivityApi();
OrderActivity body = new OrderActivity(); // OrderActivity | OrderActivity to be inserted.
try {
    OrderActivity result = apiInstance.addOrderActivity(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderActivityApi#addOrderActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderActivity**](OrderActivity.md)| OrderActivity to be inserted. |

### Return type

[**OrderActivity**](OrderActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrderActivityAudit"></a>
# **addOrderActivityAudit**
> addOrderActivityAudit(orderActivityId, orderActivityAudit)

Add new audit for an orderActivity

Adds an audit to an existing orderActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderActivityApi apiInstance = new OrderActivityApi();
BigDecimal orderActivityId = new BigDecimal(); // BigDecimal | Id of the orderActivity to add an audit to
String orderActivityAudit = "orderActivityAudit_example"; // String | The audit to add
try {
    apiInstance.addOrderActivityAudit(orderActivityId, orderActivityAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderActivityApi#addOrderActivityAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderActivityId** | **BigDecimal**| Id of the orderActivity to add an audit to |
 **orderActivityAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrderActivityFile"></a>
# **addOrderActivityFile**
> addOrderActivityFile(orderActivityId, fileName)

Attach a file to an orderActivity

Adds a file to an existing orderActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderActivityApi apiInstance = new OrderActivityApi();
BigDecimal orderActivityId = new BigDecimal(); // BigDecimal | Id of the orderActivity to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addOrderActivityFile(orderActivityId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderActivityApi#addOrderActivityFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderActivityId** | **BigDecimal**| Id of the orderActivity to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addOrderActivityFileByURL"></a>
# **addOrderActivityFileByURL**
> addOrderActivityFileByURL(body, orderActivityId)

Attach a file to an orderActivity by URL.

Adds a file to an existing orderActivity by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderActivityApi apiInstance = new OrderActivityApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
BigDecimal orderActivityId = new BigDecimal(); // BigDecimal | Id of the orderActivity to add an file to
try {
    apiInstance.addOrderActivityFileByURL(body, orderActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderActivityApi#addOrderActivityFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **orderActivityId** | **BigDecimal**| Id of the orderActivity to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrderActivityTag"></a>
# **addOrderActivityTag**
> addOrderActivityTag(orderActivityId, orderActivityTag)

Add new tags for an orderActivity.

Adds a tag to an existing orderActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderActivityApi apiInstance = new OrderActivityApi();
BigDecimal orderActivityId = new BigDecimal(); // BigDecimal | Id of the orderActivity to add a tag to
String orderActivityTag = "orderActivityTag_example"; // String | The tag to add
try {
    apiInstance.addOrderActivityTag(orderActivityId, orderActivityTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderActivityApi#addOrderActivityTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderActivityId** | **BigDecimal**| Id of the orderActivity to add a tag to |
 **orderActivityTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOrderActivity"></a>
# **deleteOrderActivity**
> deleteOrderActivity(orderActivityId)

Delete an orderActivity

Deletes the orderActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderActivityApi apiInstance = new OrderActivityApi();
BigDecimal orderActivityId = new BigDecimal(); // BigDecimal | Id of the orderActivity to be deleted.
try {
    apiInstance.deleteOrderActivity(orderActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderActivityApi#deleteOrderActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderActivityId** | **BigDecimal**| Id of the orderActivity to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteOrderActivityFile"></a>
# **deleteOrderActivityFile**
> deleteOrderActivityFile(orderActivityId, fileId)

Delete a file for an orderActivity.

Deletes an existing orderActivity file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderActivityApi apiInstance = new OrderActivityApi();
BigDecimal orderActivityId = new BigDecimal(); // BigDecimal | Id of the orderActivity to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteOrderActivityFile(orderActivityId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderActivityApi#deleteOrderActivityFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderActivityId** | **BigDecimal**| Id of the orderActivity to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteOrderActivityTag"></a>
# **deleteOrderActivityTag**
> deleteOrderActivityTag(orderActivityId, orderActivityTag)

Delete a tag for an orderActivity.

Deletes an existing orderActivity tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderActivityApi apiInstance = new OrderActivityApi();
BigDecimal orderActivityId = new BigDecimal(); // BigDecimal | Id of the orderActivity to remove tag from
String orderActivityTag = "orderActivityTag_example"; // String | The tag to delete
try {
    apiInstance.deleteOrderActivityTag(orderActivityId, orderActivityTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderActivityApi#deleteOrderActivityTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderActivityId** | **BigDecimal**| Id of the orderActivity to remove tag from |
 **orderActivityTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateOrderActivityById"></a>
# **getDuplicateOrderActivityById**
> OrderActivity getDuplicateOrderActivityById(orderActivityId)

Get a duplicated an orderActivity by id

Returns a duplicated orderActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderActivityApi apiInstance = new OrderActivityApi();
BigDecimal orderActivityId = new BigDecimal(); // BigDecimal | Id of the orderActivity to be duplicated.
try {
    OrderActivity result = apiInstance.getDuplicateOrderActivityById(orderActivityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderActivityApi#getDuplicateOrderActivityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderActivityId** | **BigDecimal**| Id of the orderActivity to be duplicated. |

### Return type

[**OrderActivity**](OrderActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderActivityByFilter"></a>
# **getOrderActivityByFilter**
> List&lt;OrderActivity&gt; getOrderActivityByFilter(filter, page, limit, sort)

Search orderActivitys by filter

Returns the list of orderActivitys that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderActivityApi apiInstance = new OrderActivityApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<OrderActivity> result = apiInstance.getOrderActivityByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderActivityApi#getOrderActivityByFilter");
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

[**List&lt;OrderActivity&gt;**](OrderActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderActivityById"></a>
# **getOrderActivityById**
> OrderActivity getOrderActivityById(orderActivityId)

Get an orderActivity by id

Returns the orderActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderActivityApi apiInstance = new OrderActivityApi();
BigDecimal orderActivityId = new BigDecimal(); // BigDecimal | Id of the orderActivity to be returned.
try {
    OrderActivity result = apiInstance.getOrderActivityById(orderActivityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderActivityApi#getOrderActivityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderActivityId** | **BigDecimal**| Id of the orderActivity to be returned. |

### Return type

[**OrderActivity**](OrderActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderActivityFiles"></a>
# **getOrderActivityFiles**
> getOrderActivityFiles(orderActivityId)

Get the files for an orderActivity.

Get all existing orderActivity files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderActivityApi apiInstance = new OrderActivityApi();
BigDecimal orderActivityId = new BigDecimal(); // BigDecimal | Id of the orderActivity to get files for
try {
    apiInstance.getOrderActivityFiles(orderActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderActivityApi#getOrderActivityFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderActivityId** | **BigDecimal**| Id of the orderActivity to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderActivityTags"></a>
# **getOrderActivityTags**
> getOrderActivityTags(orderActivityId)

Get the tags for an orderActivity.

Get all existing orderActivity tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderActivityApi apiInstance = new OrderActivityApi();
BigDecimal orderActivityId = new BigDecimal(); // BigDecimal | Id of the orderActivity to get tags for
try {
    apiInstance.getOrderActivityTags(orderActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderActivityApi#getOrderActivityTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderActivityId** | **BigDecimal**| Id of the orderActivity to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOrderActivity"></a>
# **updateOrderActivity**
> updateOrderActivity(body)

Update an orderActivity

Updates an existing orderActivity using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderActivityApi apiInstance = new OrderActivityApi();
OrderActivity body = new OrderActivity(); // OrderActivity | OrderActivity to be updated.
try {
    apiInstance.updateOrderActivity(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderActivityApi#updateOrderActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderActivity**](OrderActivity.md)| OrderActivity to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

