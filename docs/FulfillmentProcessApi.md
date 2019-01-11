# FulfillmentProcessApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFulfillmentProcessAudit**](FulfillmentProcessApi.md#addFulfillmentProcessAudit) | **PUT** /beta/fulfillmentProcess/{fulfillmentProcessId}/audit/{fulfillmentProcessAudit} | Add new audit for a fulfillmentProcess
[**addFulfillmentProcessTag**](FulfillmentProcessApi.md#addFulfillmentProcessTag) | **PUT** /beta/fulfillmentProcess/{fulfillmentProcessId}/tag/{fulfillmentProcessTag} | Add new tags for a fulfillmentProcess.
[**deleteFulfillmentProcessTag**](FulfillmentProcessApi.md#deleteFulfillmentProcessTag) | **DELETE** /beta/fulfillmentProcess/{fulfillmentProcessId}/tag/{fulfillmentProcessTag} | Delete a tag for a fulfillmentProcess.
[**getDuplicateFulfillmentProcessById**](FulfillmentProcessApi.md#getDuplicateFulfillmentProcessById) | **GET** /beta/fulfillmentProcess/duplicate/{fulfillmentProcessId} | Get a duplicated a fulfillmentProcess by id
[**getFulfillmentProcessByFilter**](FulfillmentProcessApi.md#getFulfillmentProcessByFilter) | **GET** /beta/fulfillmentProcess/search | Search fulfillmentProcesses by filter
[**getFulfillmentProcessById**](FulfillmentProcessApi.md#getFulfillmentProcessById) | **GET** /beta/fulfillmentProcess/{fulfillmentProcessId} | Get a fulfillmentProcess by id
[**getFulfillmentProcessTags**](FulfillmentProcessApi.md#getFulfillmentProcessTags) | **GET** /beta/fulfillmentProcess/{fulfillmentProcessId}/tag | Get the tags for a fulfillmentProcess.
[**updateFulfillmentProcessCustomFields**](FulfillmentProcessApi.md#updateFulfillmentProcessCustomFields) | **PUT** /beta/fulfillmentProcess/customFields | Update a fulfillmentProcess custom fields


<a name="addFulfillmentProcessAudit"></a>
# **addFulfillmentProcessAudit**
> addFulfillmentProcessAudit(fulfillmentProcessId, fulfillmentProcessAudit)

Add new audit for a fulfillmentProcess

Adds an audit to an existing fulfillmentProcess.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentProcessApi apiInstance = new FulfillmentProcessApi();
Integer fulfillmentProcessId = 56; // Integer | Id of the fulfillmentProcess to add an audit to
String fulfillmentProcessAudit = "fulfillmentProcessAudit_example"; // String | The audit to add
try {
    apiInstance.addFulfillmentProcessAudit(fulfillmentProcessId, fulfillmentProcessAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessApi#addFulfillmentProcessAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentProcessId** | **Integer**| Id of the fulfillmentProcess to add an audit to |
 **fulfillmentProcessAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addFulfillmentProcessTag"></a>
# **addFulfillmentProcessTag**
> addFulfillmentProcessTag(fulfillmentProcessId, fulfillmentProcessTag)

Add new tags for a fulfillmentProcess.

Adds a tag to an existing fulfillmentProcess.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentProcessApi apiInstance = new FulfillmentProcessApi();
Integer fulfillmentProcessId = 56; // Integer | Id of the fulfillmentProcess to add a tag to
String fulfillmentProcessTag = "fulfillmentProcessTag_example"; // String | The tag to add
try {
    apiInstance.addFulfillmentProcessTag(fulfillmentProcessId, fulfillmentProcessTag);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessApi#addFulfillmentProcessTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentProcessId** | **Integer**| Id of the fulfillmentProcess to add a tag to |
 **fulfillmentProcessTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFulfillmentProcessTag"></a>
# **deleteFulfillmentProcessTag**
> deleteFulfillmentProcessTag(fulfillmentProcessId, fulfillmentProcessTag)

Delete a tag for a fulfillmentProcess.

Deletes an existing fulfillmentProcess tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentProcessApi apiInstance = new FulfillmentProcessApi();
Integer fulfillmentProcessId = 56; // Integer | Id of the fulfillmentProcess to remove tag from
String fulfillmentProcessTag = "fulfillmentProcessTag_example"; // String | The tag to delete
try {
    apiInstance.deleteFulfillmentProcessTag(fulfillmentProcessId, fulfillmentProcessTag);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessApi#deleteFulfillmentProcessTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentProcessId** | **Integer**| Id of the fulfillmentProcess to remove tag from |
 **fulfillmentProcessTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateFulfillmentProcessById"></a>
# **getDuplicateFulfillmentProcessById**
> FulfillmentProcess getDuplicateFulfillmentProcessById(fulfillmentProcessId)

Get a duplicated a fulfillmentProcess by id

Returns a duplicated fulfillmentProcess identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentProcessApi apiInstance = new FulfillmentProcessApi();
Integer fulfillmentProcessId = 56; // Integer | Id of the fulfillmentProcess to be duplicated.
try {
    FulfillmentProcess result = apiInstance.getDuplicateFulfillmentProcessById(fulfillmentProcessId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessApi#getDuplicateFulfillmentProcessById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentProcessId** | **Integer**| Id of the fulfillmentProcess to be duplicated. |

### Return type

[**FulfillmentProcess**](FulfillmentProcess.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFulfillmentProcessByFilter"></a>
# **getFulfillmentProcessByFilter**
> List&lt;FulfillmentProcess&gt; getFulfillmentProcessByFilter(filter, page, limit, sort)

Search fulfillmentProcesses by filter

Returns the list of fulfillmentProcesses that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentProcessApi apiInstance = new FulfillmentProcessApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<FulfillmentProcess> result = apiInstance.getFulfillmentProcessByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessApi#getFulfillmentProcessByFilter");
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

[**List&lt;FulfillmentProcess&gt;**](FulfillmentProcess.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFulfillmentProcessById"></a>
# **getFulfillmentProcessById**
> FulfillmentProcess getFulfillmentProcessById(fulfillmentProcessId)

Get a fulfillmentProcess by id

Returns the fulfillmentProcess identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentProcessApi apiInstance = new FulfillmentProcessApi();
Integer fulfillmentProcessId = 56; // Integer | Id of the fulfillmentProcess to be returned.
try {
    FulfillmentProcess result = apiInstance.getFulfillmentProcessById(fulfillmentProcessId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessApi#getFulfillmentProcessById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentProcessId** | **Integer**| Id of the fulfillmentProcess to be returned. |

### Return type

[**FulfillmentProcess**](FulfillmentProcess.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFulfillmentProcessTags"></a>
# **getFulfillmentProcessTags**
> getFulfillmentProcessTags(fulfillmentProcessId)

Get the tags for a fulfillmentProcess.

Get all existing fulfillmentProcess tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentProcessApi apiInstance = new FulfillmentProcessApi();
Integer fulfillmentProcessId = 56; // Integer | Id of the fulfillmentProcess to get tags for
try {
    apiInstance.getFulfillmentProcessTags(fulfillmentProcessId);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessApi#getFulfillmentProcessTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentProcessId** | **Integer**| Id of the fulfillmentProcess to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFulfillmentProcessCustomFields"></a>
# **updateFulfillmentProcessCustomFields**
> updateFulfillmentProcessCustomFields(body)

Update a fulfillmentProcess custom fields

Updates an existing fulfillmentProcess custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentProcessApi apiInstance = new FulfillmentProcessApi();
FulfillmentProcess body = new FulfillmentProcess(); // FulfillmentProcess | FulfillmentProcess to be updated.
try {
    apiInstance.updateFulfillmentProcessCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessApi#updateFulfillmentProcessCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FulfillmentProcess**](FulfillmentProcess.md)| FulfillmentProcess to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

