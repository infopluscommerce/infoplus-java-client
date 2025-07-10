# OrderLineApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrderLineAudit**](OrderLineApi.md#addOrderLineAudit) | **PUT** /beta/orderLine/{orderLineId}/audit/{orderLineAudit} | Add new audit for an orderLine
[**addOrderLineFile**](OrderLineApi.md#addOrderLineFile) | **POST** /beta/orderLine/{orderLineId}/file/{fileName} | Attach a file to an orderLine
[**addOrderLineFileByURL**](OrderLineApi.md#addOrderLineFileByURL) | **POST** /beta/orderLine/{orderLineId}/file | Attach a file to an orderLine by URL.
[**addOrderLineTag**](OrderLineApi.md#addOrderLineTag) | **PUT** /beta/orderLine/{orderLineId}/tag/{orderLineTag} | Add new tags for an orderLine.
[**deleteOrderLineFile**](OrderLineApi.md#deleteOrderLineFile) | **DELETE** /beta/orderLine/{orderLineId}/file/{fileId} | Delete a file for an orderLine.
[**deleteOrderLineTag**](OrderLineApi.md#deleteOrderLineTag) | **DELETE** /beta/orderLine/{orderLineId}/tag/{orderLineTag} | Delete a tag for an orderLine.
[**getDuplicateOrderLineById**](OrderLineApi.md#getDuplicateOrderLineById) | **GET** /beta/orderLine/duplicate/{orderLineId} | Get a duplicated an orderLine by id
[**getOrderLineByFilter**](OrderLineApi.md#getOrderLineByFilter) | **GET** /beta/orderLine/search | Search orderLines by filter
[**getOrderLineById**](OrderLineApi.md#getOrderLineById) | **GET** /beta/orderLine/{orderLineId} | Get an orderLine by id
[**getOrderLineFiles**](OrderLineApi.md#getOrderLineFiles) | **GET** /beta/orderLine/{orderLineId}/file | Get the files for an orderLine.
[**getOrderLineTags**](OrderLineApi.md#getOrderLineTags) | **GET** /beta/orderLine/{orderLineId}/tag | Get the tags for an orderLine.
[**updateOrderLineCustomFields**](OrderLineApi.md#updateOrderLineCustomFields) | **PUT** /beta/orderLine/customFields | Update an orderLine custom fields


<a name="addOrderLineAudit"></a>
# **addOrderLineAudit**
> addOrderLineAudit(orderLineId, orderLineAudit)

Add new audit for an orderLine

Adds an audit to an existing orderLine.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineApi apiInstance = new OrderLineApi();
Integer orderLineId = 56; // Integer | Id of the orderLine to add an audit to
String orderLineAudit = "orderLineAudit_example"; // String | The audit to add
try {
    apiInstance.addOrderLineAudit(orderLineId, orderLineAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineApi#addOrderLineAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderLineId** | **Integer**| Id of the orderLine to add an audit to |
 **orderLineAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrderLineFile"></a>
# **addOrderLineFile**
> addOrderLineFile(orderLineId, fileName)

Attach a file to an orderLine

Adds a file to an existing orderLine.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineApi apiInstance = new OrderLineApi();
Integer orderLineId = 56; // Integer | Id of the orderLine to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addOrderLineFile(orderLineId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineApi#addOrderLineFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderLineId** | **Integer**| Id of the orderLine to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addOrderLineFileByURL"></a>
# **addOrderLineFileByURL**
> addOrderLineFileByURL(body, orderLineId)

Attach a file to an orderLine by URL.

Adds a file to an existing orderLine by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineApi apiInstance = new OrderLineApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer orderLineId = 56; // Integer | Id of the orderLine to add an file to
try {
    apiInstance.addOrderLineFileByURL(body, orderLineId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineApi#addOrderLineFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **orderLineId** | **Integer**| Id of the orderLine to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrderLineTag"></a>
# **addOrderLineTag**
> addOrderLineTag(orderLineId, orderLineTag)

Add new tags for an orderLine.

Adds a tag to an existing orderLine.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineApi apiInstance = new OrderLineApi();
Integer orderLineId = 56; // Integer | Id of the orderLine to add a tag to
String orderLineTag = "orderLineTag_example"; // String | The tag to add
try {
    apiInstance.addOrderLineTag(orderLineId, orderLineTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineApi#addOrderLineTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderLineId** | **Integer**| Id of the orderLine to add a tag to |
 **orderLineTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOrderLineFile"></a>
# **deleteOrderLineFile**
> deleteOrderLineFile(orderLineId, fileId)

Delete a file for an orderLine.

Deletes an existing orderLine file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineApi apiInstance = new OrderLineApi();
Integer orderLineId = 56; // Integer | Id of the orderLine to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteOrderLineFile(orderLineId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineApi#deleteOrderLineFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderLineId** | **Integer**| Id of the orderLine to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteOrderLineTag"></a>
# **deleteOrderLineTag**
> deleteOrderLineTag(orderLineId, orderLineTag)

Delete a tag for an orderLine.

Deletes an existing orderLine tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineApi apiInstance = new OrderLineApi();
Integer orderLineId = 56; // Integer | Id of the orderLine to remove tag from
String orderLineTag = "orderLineTag_example"; // String | The tag to delete
try {
    apiInstance.deleteOrderLineTag(orderLineId, orderLineTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineApi#deleteOrderLineTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderLineId** | **Integer**| Id of the orderLine to remove tag from |
 **orderLineTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateOrderLineById"></a>
# **getDuplicateOrderLineById**
> OrderLine getDuplicateOrderLineById(orderLineId)

Get a duplicated an orderLine by id

Returns a duplicated orderLine identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineApi apiInstance = new OrderLineApi();
Integer orderLineId = 56; // Integer | Id of the orderLine to be duplicated.
try {
    OrderLine result = apiInstance.getDuplicateOrderLineById(orderLineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineApi#getDuplicateOrderLineById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderLineId** | **Integer**| Id of the orderLine to be duplicated. |

### Return type

[**OrderLine**](OrderLine.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderLineByFilter"></a>
# **getOrderLineByFilter**
> List&lt;OrderLine&gt; getOrderLineByFilter(filter, page, limit, sort)

Search orderLines by filter

Returns the list of orderLines that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineApi apiInstance = new OrderLineApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<OrderLine> result = apiInstance.getOrderLineByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineApi#getOrderLineByFilter");
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

[**List&lt;OrderLine&gt;**](OrderLine.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderLineById"></a>
# **getOrderLineById**
> OrderLine getOrderLineById(orderLineId)

Get an orderLine by id

Returns the orderLine identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineApi apiInstance = new OrderLineApi();
Integer orderLineId = 56; // Integer | Id of the orderLine to be returned.
try {
    OrderLine result = apiInstance.getOrderLineById(orderLineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineApi#getOrderLineById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderLineId** | **Integer**| Id of the orderLine to be returned. |

### Return type

[**OrderLine**](OrderLine.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderLineFiles"></a>
# **getOrderLineFiles**
> getOrderLineFiles(orderLineId)

Get the files for an orderLine.

Get all existing orderLine files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineApi apiInstance = new OrderLineApi();
Integer orderLineId = 56; // Integer | Id of the orderLine to get files for
try {
    apiInstance.getOrderLineFiles(orderLineId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineApi#getOrderLineFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderLineId** | **Integer**| Id of the orderLine to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderLineTags"></a>
# **getOrderLineTags**
> getOrderLineTags(orderLineId)

Get the tags for an orderLine.

Get all existing orderLine tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineApi apiInstance = new OrderLineApi();
Integer orderLineId = 56; // Integer | Id of the orderLine to get tags for
try {
    apiInstance.getOrderLineTags(orderLineId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineApi#getOrderLineTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderLineId** | **Integer**| Id of the orderLine to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOrderLineCustomFields"></a>
# **updateOrderLineCustomFields**
> updateOrderLineCustomFields(body)

Update an orderLine custom fields

Updates an existing orderLine custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLineApi apiInstance = new OrderLineApi();
OrderLine body = new OrderLine(); // OrderLine | OrderLine to be updated.
try {
    apiInstance.updateOrderLineCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLineApi#updateOrderLineCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderLine**](OrderLine.md)| OrderLine to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

