# WorkBatchApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addWorkBatchAudit**](WorkBatchApi.md#addWorkBatchAudit) | **PUT** /beta/workBatch/{workBatchId}/audit/{workBatchAudit} | Add new audit for a workBatch
[**addWorkBatchTag**](WorkBatchApi.md#addWorkBatchTag) | **PUT** /beta/workBatch/{workBatchId}/tag/{workBatchTag} | Add new tags for a workBatch.
[**deleteWorkBatchTag**](WorkBatchApi.md#deleteWorkBatchTag) | **DELETE** /beta/workBatch/{workBatchId}/tag/{workBatchTag} | Delete a tag for a workBatch.
[**getDuplicateWorkBatchById**](WorkBatchApi.md#getDuplicateWorkBatchById) | **GET** /beta/workBatch/duplicate/{workBatchId} | Get a duplicated a workBatch by id
[**getWorkBatchByFilter**](WorkBatchApi.md#getWorkBatchByFilter) | **GET** /beta/workBatch/search | Search workBatchs by filter
[**getWorkBatchById**](WorkBatchApi.md#getWorkBatchById) | **GET** /beta/workBatch/{workBatchId} | Get a workBatch by id
[**getWorkBatchTags**](WorkBatchApi.md#getWorkBatchTags) | **GET** /beta/workBatch/{workBatchId}/tag | Get the tags for a workBatch.
[**updateWorkBatch**](WorkBatchApi.md#updateWorkBatch) | **PUT** /beta/workBatch | Update a workBatch
[**updateWorkBatchCustomFields**](WorkBatchApi.md#updateWorkBatchCustomFields) | **PUT** /beta/workBatch/customFields | Update a workBatch custom fields


<a name="addWorkBatchAudit"></a>
# **addWorkBatchAudit**
> addWorkBatchAudit(workBatchId, workBatchAudit)

Add new audit for a workBatch

Adds an audit to an existing workBatch.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WorkBatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkBatchApi apiInstance = new WorkBatchApi();
Integer workBatchId = 56; // Integer | Id of the workBatch to add an audit to
String workBatchAudit = "workBatchAudit_example"; // String | The audit to add
try {
    apiInstance.addWorkBatchAudit(workBatchId, workBatchAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkBatchApi#addWorkBatchAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workBatchId** | **Integer**| Id of the workBatch to add an audit to |
 **workBatchAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addWorkBatchTag"></a>
# **addWorkBatchTag**
> addWorkBatchTag(workBatchId, workBatchTag)

Add new tags for a workBatch.

Adds a tag to an existing workBatch.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WorkBatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkBatchApi apiInstance = new WorkBatchApi();
Integer workBatchId = 56; // Integer | Id of the workBatch to add a tag to
String workBatchTag = "workBatchTag_example"; // String | The tag to add
try {
    apiInstance.addWorkBatchTag(workBatchId, workBatchTag);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkBatchApi#addWorkBatchTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workBatchId** | **Integer**| Id of the workBatch to add a tag to |
 **workBatchTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWorkBatchTag"></a>
# **deleteWorkBatchTag**
> deleteWorkBatchTag(workBatchId, workBatchTag)

Delete a tag for a workBatch.

Deletes an existing workBatch tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WorkBatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkBatchApi apiInstance = new WorkBatchApi();
Integer workBatchId = 56; // Integer | Id of the workBatch to remove tag from
String workBatchTag = "workBatchTag_example"; // String | The tag to delete
try {
    apiInstance.deleteWorkBatchTag(workBatchId, workBatchTag);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkBatchApi#deleteWorkBatchTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workBatchId** | **Integer**| Id of the workBatch to remove tag from |
 **workBatchTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateWorkBatchById"></a>
# **getDuplicateWorkBatchById**
> WorkBatch getDuplicateWorkBatchById(workBatchId)

Get a duplicated a workBatch by id

Returns a duplicated workBatch identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WorkBatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkBatchApi apiInstance = new WorkBatchApi();
Integer workBatchId = 56; // Integer | Id of the workBatch to be duplicated.
try {
    WorkBatch result = apiInstance.getDuplicateWorkBatchById(workBatchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkBatchApi#getDuplicateWorkBatchById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workBatchId** | **Integer**| Id of the workBatch to be duplicated. |

### Return type

[**WorkBatch**](WorkBatch.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkBatchByFilter"></a>
# **getWorkBatchByFilter**
> List&lt;WorkBatch&gt; getWorkBatchByFilter(filter, page, limit, sort)

Search workBatchs by filter

Returns the list of workBatchs that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WorkBatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkBatchApi apiInstance = new WorkBatchApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<WorkBatch> result = apiInstance.getWorkBatchByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkBatchApi#getWorkBatchByFilter");
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

[**List&lt;WorkBatch&gt;**](WorkBatch.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkBatchById"></a>
# **getWorkBatchById**
> WorkBatch getWorkBatchById(workBatchId)

Get a workBatch by id

Returns the workBatch identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WorkBatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkBatchApi apiInstance = new WorkBatchApi();
Integer workBatchId = 56; // Integer | Id of the workBatch to be returned.
try {
    WorkBatch result = apiInstance.getWorkBatchById(workBatchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkBatchApi#getWorkBatchById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workBatchId** | **Integer**| Id of the workBatch to be returned. |

### Return type

[**WorkBatch**](WorkBatch.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkBatchTags"></a>
# **getWorkBatchTags**
> getWorkBatchTags(workBatchId)

Get the tags for a workBatch.

Get all existing workBatch tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WorkBatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkBatchApi apiInstance = new WorkBatchApi();
Integer workBatchId = 56; // Integer | Id of the workBatch to get tags for
try {
    apiInstance.getWorkBatchTags(workBatchId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkBatchApi#getWorkBatchTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workBatchId** | **Integer**| Id of the workBatch to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorkBatch"></a>
# **updateWorkBatch**
> updateWorkBatch(body)

Update a workBatch

Updates an existing workBatch using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WorkBatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkBatchApi apiInstance = new WorkBatchApi();
WorkBatch body = new WorkBatch(); // WorkBatch | WorkBatch to be updated.
try {
    apiInstance.updateWorkBatch(body);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkBatchApi#updateWorkBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WorkBatch**](WorkBatch.md)| WorkBatch to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWorkBatchCustomFields"></a>
# **updateWorkBatchCustomFields**
> updateWorkBatchCustomFields(body)

Update a workBatch custom fields

Updates an existing workBatch custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WorkBatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkBatchApi apiInstance = new WorkBatchApi();
WorkBatch body = new WorkBatch(); // WorkBatch | WorkBatch to be updated.
try {
    apiInstance.updateWorkBatchCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkBatchApi#updateWorkBatchCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WorkBatch**](WorkBatch.md)| WorkBatch to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
