# OrderSourceItemSetupApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrderSourceItemSetup**](OrderSourceItemSetupApi.md#addOrderSourceItemSetup) | **POST** /v3.0/orderSourceItemSetup | Create an orderSourceItemSetup
[**addOrderSourceItemSetupAudit**](OrderSourceItemSetupApi.md#addOrderSourceItemSetupAudit) | **PUT** /v3.0/orderSourceItemSetup/{orderSourceItemSetupId}/audit/{orderSourceItemSetupAudit} | Add new audit for an orderSourceItemSetup
[**addOrderSourceItemSetupFile**](OrderSourceItemSetupApi.md#addOrderSourceItemSetupFile) | **POST** /v3.0/orderSourceItemSetup/{orderSourceItemSetupId}/file/{fileName} | Attach a file to an orderSourceItemSetup
[**addOrderSourceItemSetupFileByURL**](OrderSourceItemSetupApi.md#addOrderSourceItemSetupFileByURL) | **POST** /v3.0/orderSourceItemSetup/{orderSourceItemSetupId}/file | Attach a file to an orderSourceItemSetup by URL.
[**addOrderSourceItemSetupTag**](OrderSourceItemSetupApi.md#addOrderSourceItemSetupTag) | **PUT** /v3.0/orderSourceItemSetup/{orderSourceItemSetupId}/tag/{orderSourceItemSetupTag} | Add new tags for an orderSourceItemSetup.
[**deleteOrderSourceItemSetup**](OrderSourceItemSetupApi.md#deleteOrderSourceItemSetup) | **DELETE** /v3.0/orderSourceItemSetup/{orderSourceItemSetupId} | Delete an orderSourceItemSetup
[**deleteOrderSourceItemSetupFile**](OrderSourceItemSetupApi.md#deleteOrderSourceItemSetupFile) | **DELETE** /v3.0/orderSourceItemSetup/{orderSourceItemSetupId}/file/{fileId} | Delete a file for an orderSourceItemSetup.
[**deleteOrderSourceItemSetupTag**](OrderSourceItemSetupApi.md#deleteOrderSourceItemSetupTag) | **DELETE** /v3.0/orderSourceItemSetup/{orderSourceItemSetupId}/tag/{orderSourceItemSetupTag} | Delete a tag for an orderSourceItemSetup.
[**getDuplicateOrderSourceItemSetupById**](OrderSourceItemSetupApi.md#getDuplicateOrderSourceItemSetupById) | **GET** /v3.0/orderSourceItemSetup/duplicate/{orderSourceItemSetupId} | Get a duplicated an orderSourceItemSetup by id
[**getOrderSourceItemSetupByFilter**](OrderSourceItemSetupApi.md#getOrderSourceItemSetupByFilter) | **GET** /v3.0/orderSourceItemSetup/search | Search orderSourceItemSetups by filter
[**getOrderSourceItemSetupById**](OrderSourceItemSetupApi.md#getOrderSourceItemSetupById) | **GET** /v3.0/orderSourceItemSetup/{orderSourceItemSetupId} | Get an orderSourceItemSetup by id
[**getOrderSourceItemSetupFiles**](OrderSourceItemSetupApi.md#getOrderSourceItemSetupFiles) | **GET** /v3.0/orderSourceItemSetup/{orderSourceItemSetupId}/file | Get the files for an orderSourceItemSetup.
[**getOrderSourceItemSetupTags**](OrderSourceItemSetupApi.md#getOrderSourceItemSetupTags) | **GET** /v3.0/orderSourceItemSetup/{orderSourceItemSetupId}/tag | Get the tags for an orderSourceItemSetup.
[**updateOrderSourceItemSetup**](OrderSourceItemSetupApi.md#updateOrderSourceItemSetup) | **PUT** /v3.0/orderSourceItemSetup | Update an orderSourceItemSetup
[**updateOrderSourceItemSetupCustomFields**](OrderSourceItemSetupApi.md#updateOrderSourceItemSetupCustomFields) | **PUT** /v3.0/orderSourceItemSetup/customFields | Update an orderSourceItemSetup custom fields


<a name="addOrderSourceItemSetup"></a>
# **addOrderSourceItemSetup**
> OrderSourceItemSetup addOrderSourceItemSetup(body)

Create an orderSourceItemSetup

Inserts a new orderSourceItemSetup using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceItemSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceItemSetupApi apiInstance = new OrderSourceItemSetupApi();
OrderSourceItemSetup body = new OrderSourceItemSetup(); // OrderSourceItemSetup | OrderSourceItemSetup to be inserted.
try {
    OrderSourceItemSetup result = apiInstance.addOrderSourceItemSetup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceItemSetupApi#addOrderSourceItemSetup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderSourceItemSetup**](OrderSourceItemSetup.md)| OrderSourceItemSetup to be inserted. |

### Return type

[**OrderSourceItemSetup**](OrderSourceItemSetup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrderSourceItemSetupAudit"></a>
# **addOrderSourceItemSetupAudit**
> addOrderSourceItemSetupAudit(orderSourceItemSetupId, orderSourceItemSetupAudit)

Add new audit for an orderSourceItemSetup

Adds an audit to an existing orderSourceItemSetup.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceItemSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceItemSetupApi apiInstance = new OrderSourceItemSetupApi();
Integer orderSourceItemSetupId = 56; // Integer | Id of the orderSourceItemSetup to add an audit to
String orderSourceItemSetupAudit = "orderSourceItemSetupAudit_example"; // String | The audit to add
try {
    apiInstance.addOrderSourceItemSetupAudit(orderSourceItemSetupId, orderSourceItemSetupAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceItemSetupApi#addOrderSourceItemSetupAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceItemSetupId** | **Integer**| Id of the orderSourceItemSetup to add an audit to |
 **orderSourceItemSetupAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrderSourceItemSetupFile"></a>
# **addOrderSourceItemSetupFile**
> addOrderSourceItemSetupFile(orderSourceItemSetupId, fileName)

Attach a file to an orderSourceItemSetup

Adds a file to an existing orderSourceItemSetup.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceItemSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceItemSetupApi apiInstance = new OrderSourceItemSetupApi();
Integer orderSourceItemSetupId = 56; // Integer | Id of the orderSourceItemSetup to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addOrderSourceItemSetupFile(orderSourceItemSetupId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceItemSetupApi#addOrderSourceItemSetupFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceItemSetupId** | **Integer**| Id of the orderSourceItemSetup to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addOrderSourceItemSetupFileByURL"></a>
# **addOrderSourceItemSetupFileByURL**
> addOrderSourceItemSetupFileByURL(body, orderSourceItemSetupId)

Attach a file to an orderSourceItemSetup by URL.

Adds a file to an existing orderSourceItemSetup by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceItemSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceItemSetupApi apiInstance = new OrderSourceItemSetupApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer orderSourceItemSetupId = 56; // Integer | Id of the orderSourceItemSetup to add an file to
try {
    apiInstance.addOrderSourceItemSetupFileByURL(body, orderSourceItemSetupId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceItemSetupApi#addOrderSourceItemSetupFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **orderSourceItemSetupId** | **Integer**| Id of the orderSourceItemSetup to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrderSourceItemSetupTag"></a>
# **addOrderSourceItemSetupTag**
> addOrderSourceItemSetupTag(orderSourceItemSetupId, orderSourceItemSetupTag)

Add new tags for an orderSourceItemSetup.

Adds a tag to an existing orderSourceItemSetup.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceItemSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceItemSetupApi apiInstance = new OrderSourceItemSetupApi();
Integer orderSourceItemSetupId = 56; // Integer | Id of the orderSourceItemSetup to add a tag to
String orderSourceItemSetupTag = "orderSourceItemSetupTag_example"; // String | The tag to add
try {
    apiInstance.addOrderSourceItemSetupTag(orderSourceItemSetupId, orderSourceItemSetupTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceItemSetupApi#addOrderSourceItemSetupTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceItemSetupId** | **Integer**| Id of the orderSourceItemSetup to add a tag to |
 **orderSourceItemSetupTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOrderSourceItemSetup"></a>
# **deleteOrderSourceItemSetup**
> deleteOrderSourceItemSetup(orderSourceItemSetupId)

Delete an orderSourceItemSetup

Deletes the orderSourceItemSetup identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceItemSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceItemSetupApi apiInstance = new OrderSourceItemSetupApi();
Integer orderSourceItemSetupId = 56; // Integer | Id of the orderSourceItemSetup to be deleted.
try {
    apiInstance.deleteOrderSourceItemSetup(orderSourceItemSetupId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceItemSetupApi#deleteOrderSourceItemSetup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceItemSetupId** | **Integer**| Id of the orderSourceItemSetup to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteOrderSourceItemSetupFile"></a>
# **deleteOrderSourceItemSetupFile**
> deleteOrderSourceItemSetupFile(orderSourceItemSetupId, fileId)

Delete a file for an orderSourceItemSetup.

Deletes an existing orderSourceItemSetup file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceItemSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceItemSetupApi apiInstance = new OrderSourceItemSetupApi();
Integer orderSourceItemSetupId = 56; // Integer | Id of the orderSourceItemSetup to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteOrderSourceItemSetupFile(orderSourceItemSetupId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceItemSetupApi#deleteOrderSourceItemSetupFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceItemSetupId** | **Integer**| Id of the orderSourceItemSetup to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteOrderSourceItemSetupTag"></a>
# **deleteOrderSourceItemSetupTag**
> deleteOrderSourceItemSetupTag(orderSourceItemSetupId, orderSourceItemSetupTag)

Delete a tag for an orderSourceItemSetup.

Deletes an existing orderSourceItemSetup tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceItemSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceItemSetupApi apiInstance = new OrderSourceItemSetupApi();
Integer orderSourceItemSetupId = 56; // Integer | Id of the orderSourceItemSetup to remove tag from
String orderSourceItemSetupTag = "orderSourceItemSetupTag_example"; // String | The tag to delete
try {
    apiInstance.deleteOrderSourceItemSetupTag(orderSourceItemSetupId, orderSourceItemSetupTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceItemSetupApi#deleteOrderSourceItemSetupTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceItemSetupId** | **Integer**| Id of the orderSourceItemSetup to remove tag from |
 **orderSourceItemSetupTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateOrderSourceItemSetupById"></a>
# **getDuplicateOrderSourceItemSetupById**
> OrderSourceItemSetup getDuplicateOrderSourceItemSetupById(orderSourceItemSetupId)

Get a duplicated an orderSourceItemSetup by id

Returns a duplicated orderSourceItemSetup identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceItemSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceItemSetupApi apiInstance = new OrderSourceItemSetupApi();
Integer orderSourceItemSetupId = 56; // Integer | Id of the orderSourceItemSetup to be duplicated.
try {
    OrderSourceItemSetup result = apiInstance.getDuplicateOrderSourceItemSetupById(orderSourceItemSetupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceItemSetupApi#getDuplicateOrderSourceItemSetupById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceItemSetupId** | **Integer**| Id of the orderSourceItemSetup to be duplicated. |

### Return type

[**OrderSourceItemSetup**](OrderSourceItemSetup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderSourceItemSetupByFilter"></a>
# **getOrderSourceItemSetupByFilter**
> List&lt;OrderSourceItemSetup&gt; getOrderSourceItemSetupByFilter(filter, page, limit, sort)

Search orderSourceItemSetups by filter

Returns the list of orderSourceItemSetups that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceItemSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceItemSetupApi apiInstance = new OrderSourceItemSetupApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<OrderSourceItemSetup> result = apiInstance.getOrderSourceItemSetupByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceItemSetupApi#getOrderSourceItemSetupByFilter");
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

[**List&lt;OrderSourceItemSetup&gt;**](OrderSourceItemSetup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderSourceItemSetupById"></a>
# **getOrderSourceItemSetupById**
> OrderSourceItemSetup getOrderSourceItemSetupById(orderSourceItemSetupId)

Get an orderSourceItemSetup by id

Returns the orderSourceItemSetup identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceItemSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceItemSetupApi apiInstance = new OrderSourceItemSetupApi();
Integer orderSourceItemSetupId = 56; // Integer | Id of the orderSourceItemSetup to be returned.
try {
    OrderSourceItemSetup result = apiInstance.getOrderSourceItemSetupById(orderSourceItemSetupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceItemSetupApi#getOrderSourceItemSetupById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceItemSetupId** | **Integer**| Id of the orderSourceItemSetup to be returned. |

### Return type

[**OrderSourceItemSetup**](OrderSourceItemSetup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderSourceItemSetupFiles"></a>
# **getOrderSourceItemSetupFiles**
> getOrderSourceItemSetupFiles(orderSourceItemSetupId)

Get the files for an orderSourceItemSetup.

Get all existing orderSourceItemSetup files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceItemSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceItemSetupApi apiInstance = new OrderSourceItemSetupApi();
Integer orderSourceItemSetupId = 56; // Integer | Id of the orderSourceItemSetup to get files for
try {
    apiInstance.getOrderSourceItemSetupFiles(orderSourceItemSetupId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceItemSetupApi#getOrderSourceItemSetupFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceItemSetupId** | **Integer**| Id of the orderSourceItemSetup to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderSourceItemSetupTags"></a>
# **getOrderSourceItemSetupTags**
> getOrderSourceItemSetupTags(orderSourceItemSetupId)

Get the tags for an orderSourceItemSetup.

Get all existing orderSourceItemSetup tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceItemSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceItemSetupApi apiInstance = new OrderSourceItemSetupApi();
Integer orderSourceItemSetupId = 56; // Integer | Id of the orderSourceItemSetup to get tags for
try {
    apiInstance.getOrderSourceItemSetupTags(orderSourceItemSetupId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceItemSetupApi#getOrderSourceItemSetupTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSourceItemSetupId** | **Integer**| Id of the orderSourceItemSetup to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOrderSourceItemSetup"></a>
# **updateOrderSourceItemSetup**
> updateOrderSourceItemSetup(body)

Update an orderSourceItemSetup

Updates an existing orderSourceItemSetup using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceItemSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceItemSetupApi apiInstance = new OrderSourceItemSetupApi();
OrderSourceItemSetup body = new OrderSourceItemSetup(); // OrderSourceItemSetup | OrderSourceItemSetup to be updated.
try {
    apiInstance.updateOrderSourceItemSetup(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceItemSetupApi#updateOrderSourceItemSetup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderSourceItemSetup**](OrderSourceItemSetup.md)| OrderSourceItemSetup to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOrderSourceItemSetupCustomFields"></a>
# **updateOrderSourceItemSetupCustomFields**
> updateOrderSourceItemSetupCustomFields(body)

Update an orderSourceItemSetup custom fields

Updates an existing orderSourceItemSetup custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderSourceItemSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderSourceItemSetupApi apiInstance = new OrderSourceItemSetupApi();
OrderSourceItemSetup body = new OrderSourceItemSetup(); // OrderSourceItemSetup | OrderSourceItemSetup to be updated.
try {
    apiInstance.updateOrderSourceItemSetupCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderSourceItemSetupApi#updateOrderSourceItemSetupCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderSourceItemSetup**](OrderSourceItemSetup.md)| OrderSourceItemSetup to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

