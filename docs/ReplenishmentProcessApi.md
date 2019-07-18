# ReplenishmentProcessApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addReplenishmentProcessAudit**](ReplenishmentProcessApi.md#addReplenishmentProcessAudit) | **PUT** /beta/replenishmentProcess/{replenishmentProcessId}/audit/{replenishmentProcessAudit} | Add new audit for a replenishmentProcess
[**addReplenishmentProcessFile**](ReplenishmentProcessApi.md#addReplenishmentProcessFile) | **POST** /beta/replenishmentProcess/{replenishmentProcessId}/file/{fileName} | Attach a file to a replenishmentProcess
[**addReplenishmentProcessTag**](ReplenishmentProcessApi.md#addReplenishmentProcessTag) | **PUT** /beta/replenishmentProcess/{replenishmentProcessId}/tag/{replenishmentProcessTag} | Add new tags for a replenishmentProcess.
[**deleteReplenishmentProcessTag**](ReplenishmentProcessApi.md#deleteReplenishmentProcessTag) | **DELETE** /beta/replenishmentProcess/{replenishmentProcessId}/tag/{replenishmentProcessTag} | Delete a tag for a replenishmentProcess.
[**getDuplicateReplenishmentProcessById**](ReplenishmentProcessApi.md#getDuplicateReplenishmentProcessById) | **GET** /beta/replenishmentProcess/duplicate/{replenishmentProcessId} | Get a duplicated a replenishmentProcess by id
[**getReplenishmentProcessByFilter**](ReplenishmentProcessApi.md#getReplenishmentProcessByFilter) | **GET** /beta/replenishmentProcess/search | Search replenishmentProcesses by filter
[**getReplenishmentProcessById**](ReplenishmentProcessApi.md#getReplenishmentProcessById) | **GET** /beta/replenishmentProcess/{replenishmentProcessId} | Get a replenishmentProcess by id
[**getReplenishmentProcessTags**](ReplenishmentProcessApi.md#getReplenishmentProcessTags) | **GET** /beta/replenishmentProcess/{replenishmentProcessId}/tag | Get the tags for a replenishmentProcess.
[**updateReplenishmentProcessCustomFields**](ReplenishmentProcessApi.md#updateReplenishmentProcessCustomFields) | **PUT** /beta/replenishmentProcess/customFields | Update a replenishmentProcess custom fields


<a name="addReplenishmentProcessAudit"></a>
# **addReplenishmentProcessAudit**
> addReplenishmentProcessAudit(replenishmentProcessId, replenishmentProcessAudit)

Add new audit for a replenishmentProcess

Adds an audit to an existing replenishmentProcess.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentProcessApi apiInstance = new ReplenishmentProcessApi();
Integer replenishmentProcessId = 56; // Integer | Id of the replenishmentProcess to add an audit to
String replenishmentProcessAudit = "replenishmentProcessAudit_example"; // String | The audit to add
try {
    apiInstance.addReplenishmentProcessAudit(replenishmentProcessId, replenishmentProcessAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentProcessApi#addReplenishmentProcessAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentProcessId** | **Integer**| Id of the replenishmentProcess to add an audit to |
 **replenishmentProcessAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addReplenishmentProcessFile"></a>
# **addReplenishmentProcessFile**
> addReplenishmentProcessFile(replenishmentProcessId, fileName)

Attach a file to a replenishmentProcess

Adds a file to an existing replenishmentProcess.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentProcessApi apiInstance = new ReplenishmentProcessApi();
Integer replenishmentProcessId = 56; // Integer | Id of the replenishmentProcess to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addReplenishmentProcessFile(replenishmentProcessId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentProcessApi#addReplenishmentProcessFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentProcessId** | **Integer**| Id of the replenishmentProcess to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addReplenishmentProcessTag"></a>
# **addReplenishmentProcessTag**
> addReplenishmentProcessTag(replenishmentProcessId, replenishmentProcessTag)

Add new tags for a replenishmentProcess.

Adds a tag to an existing replenishmentProcess.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentProcessApi apiInstance = new ReplenishmentProcessApi();
Integer replenishmentProcessId = 56; // Integer | Id of the replenishmentProcess to add a tag to
String replenishmentProcessTag = "replenishmentProcessTag_example"; // String | The tag to add
try {
    apiInstance.addReplenishmentProcessTag(replenishmentProcessId, replenishmentProcessTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentProcessApi#addReplenishmentProcessTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentProcessId** | **Integer**| Id of the replenishmentProcess to add a tag to |
 **replenishmentProcessTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReplenishmentProcessTag"></a>
# **deleteReplenishmentProcessTag**
> deleteReplenishmentProcessTag(replenishmentProcessId, replenishmentProcessTag)

Delete a tag for a replenishmentProcess.

Deletes an existing replenishmentProcess tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentProcessApi apiInstance = new ReplenishmentProcessApi();
Integer replenishmentProcessId = 56; // Integer | Id of the replenishmentProcess to remove tag from
String replenishmentProcessTag = "replenishmentProcessTag_example"; // String | The tag to delete
try {
    apiInstance.deleteReplenishmentProcessTag(replenishmentProcessId, replenishmentProcessTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentProcessApi#deleteReplenishmentProcessTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentProcessId** | **Integer**| Id of the replenishmentProcess to remove tag from |
 **replenishmentProcessTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateReplenishmentProcessById"></a>
# **getDuplicateReplenishmentProcessById**
> ReplenishmentProcess getDuplicateReplenishmentProcessById(replenishmentProcessId)

Get a duplicated a replenishmentProcess by id

Returns a duplicated replenishmentProcess identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentProcessApi apiInstance = new ReplenishmentProcessApi();
Integer replenishmentProcessId = 56; // Integer | Id of the replenishmentProcess to be duplicated.
try {
    ReplenishmentProcess result = apiInstance.getDuplicateReplenishmentProcessById(replenishmentProcessId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentProcessApi#getDuplicateReplenishmentProcessById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentProcessId** | **Integer**| Id of the replenishmentProcess to be duplicated. |

### Return type

[**ReplenishmentProcess**](ReplenishmentProcess.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReplenishmentProcessByFilter"></a>
# **getReplenishmentProcessByFilter**
> List&lt;ReplenishmentProcess&gt; getReplenishmentProcessByFilter(filter, page, limit, sort)

Search replenishmentProcesses by filter

Returns the list of replenishmentProcesses that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentProcessApi apiInstance = new ReplenishmentProcessApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ReplenishmentProcess> result = apiInstance.getReplenishmentProcessByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentProcessApi#getReplenishmentProcessByFilter");
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

[**List&lt;ReplenishmentProcess&gt;**](ReplenishmentProcess.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReplenishmentProcessById"></a>
# **getReplenishmentProcessById**
> ReplenishmentProcess getReplenishmentProcessById(replenishmentProcessId)

Get a replenishmentProcess by id

Returns the replenishmentProcess identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentProcessApi apiInstance = new ReplenishmentProcessApi();
Integer replenishmentProcessId = 56; // Integer | Id of the replenishmentProcess to be returned.
try {
    ReplenishmentProcess result = apiInstance.getReplenishmentProcessById(replenishmentProcessId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentProcessApi#getReplenishmentProcessById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentProcessId** | **Integer**| Id of the replenishmentProcess to be returned. |

### Return type

[**ReplenishmentProcess**](ReplenishmentProcess.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReplenishmentProcessTags"></a>
# **getReplenishmentProcessTags**
> getReplenishmentProcessTags(replenishmentProcessId)

Get the tags for a replenishmentProcess.

Get all existing replenishmentProcess tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentProcessApi apiInstance = new ReplenishmentProcessApi();
Integer replenishmentProcessId = 56; // Integer | Id of the replenishmentProcess to get tags for
try {
    apiInstance.getReplenishmentProcessTags(replenishmentProcessId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentProcessApi#getReplenishmentProcessTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentProcessId** | **Integer**| Id of the replenishmentProcess to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateReplenishmentProcessCustomFields"></a>
# **updateReplenishmentProcessCustomFields**
> updateReplenishmentProcessCustomFields(body)

Update a replenishmentProcess custom fields

Updates an existing replenishmentProcess custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentProcessApi apiInstance = new ReplenishmentProcessApi();
ReplenishmentProcess body = new ReplenishmentProcess(); // ReplenishmentProcess | ReplenishmentProcess to be updated.
try {
    apiInstance.updateReplenishmentProcessCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentProcessApi#updateReplenishmentProcessCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReplenishmentProcess**](ReplenishmentProcess.md)| ReplenishmentProcess to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

