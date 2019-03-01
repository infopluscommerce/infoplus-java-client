# WorkApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addWorkAudit**](WorkApi.md#addWorkAudit) | **PUT** /beta/work/{workId}/audit/{workAudit} | Add new audit for a work
[**addWorkFile**](WorkApi.md#addWorkFile) | **POST** /beta/work/{workId}/file/{fileName} | Attach a file to a work
[**addWorkTag**](WorkApi.md#addWorkTag) | **PUT** /beta/work/{workId}/tag/{workTag} | Add new tags for a work.
[**deleteWorkTag**](WorkApi.md#deleteWorkTag) | **DELETE** /beta/work/{workId}/tag/{workTag} | Delete a tag for a work.
[**getDuplicateWorkById**](WorkApi.md#getDuplicateWorkById) | **GET** /beta/work/duplicate/{workId} | Get a duplicated a work by id
[**getWorkByFilter**](WorkApi.md#getWorkByFilter) | **GET** /beta/work/search | Search works by filter
[**getWorkById**](WorkApi.md#getWorkById) | **GET** /beta/work/{workId} | Get a work by id
[**getWorkTags**](WorkApi.md#getWorkTags) | **GET** /beta/work/{workId}/tag | Get the tags for a work.
[**updateWorkCustomFields**](WorkApi.md#updateWorkCustomFields) | **PUT** /beta/work/customFields | Update a work custom fields


<a name="addWorkAudit"></a>
# **addWorkAudit**
> addWorkAudit(workId, workAudit)

Add new audit for a work

Adds an audit to an existing work.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WorkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkApi apiInstance = new WorkApi();
Integer workId = 56; // Integer | Id of the work to add an audit to
String workAudit = "workAudit_example"; // String | The audit to add
try {
    apiInstance.addWorkAudit(workId, workAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkApi#addWorkAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workId** | **Integer**| Id of the work to add an audit to |
 **workAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addWorkFile"></a>
# **addWorkFile**
> addWorkFile(workId, fileName)

Attach a file to a work

Adds a file to an existing work.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WorkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkApi apiInstance = new WorkApi();
Integer workId = 56; // Integer | Id of the work to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addWorkFile(workId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkApi#addWorkFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workId** | **Integer**| Id of the work to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addWorkTag"></a>
# **addWorkTag**
> addWorkTag(workId, workTag)

Add new tags for a work.

Adds a tag to an existing work.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WorkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkApi apiInstance = new WorkApi();
Integer workId = 56; // Integer | Id of the work to add a tag to
String workTag = "workTag_example"; // String | The tag to add
try {
    apiInstance.addWorkTag(workId, workTag);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkApi#addWorkTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workId** | **Integer**| Id of the work to add a tag to |
 **workTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWorkTag"></a>
# **deleteWorkTag**
> deleteWorkTag(workId, workTag)

Delete a tag for a work.

Deletes an existing work tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WorkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkApi apiInstance = new WorkApi();
Integer workId = 56; // Integer | Id of the work to remove tag from
String workTag = "workTag_example"; // String | The tag to delete
try {
    apiInstance.deleteWorkTag(workId, workTag);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkApi#deleteWorkTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workId** | **Integer**| Id of the work to remove tag from |
 **workTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateWorkById"></a>
# **getDuplicateWorkById**
> Work getDuplicateWorkById(workId)

Get a duplicated a work by id

Returns a duplicated work identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WorkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkApi apiInstance = new WorkApi();
Integer workId = 56; // Integer | Id of the work to be duplicated.
try {
    Work result = apiInstance.getDuplicateWorkById(workId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkApi#getDuplicateWorkById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workId** | **Integer**| Id of the work to be duplicated. |

### Return type

[**Work**](Work.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkByFilter"></a>
# **getWorkByFilter**
> List&lt;Work&gt; getWorkByFilter(filter, page, limit, sort)

Search works by filter

Returns the list of works that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WorkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkApi apiInstance = new WorkApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Work> result = apiInstance.getWorkByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkApi#getWorkByFilter");
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

[**List&lt;Work&gt;**](Work.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkById"></a>
# **getWorkById**
> Work getWorkById(workId)

Get a work by id

Returns the work identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WorkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkApi apiInstance = new WorkApi();
Integer workId = 56; // Integer | Id of the work to be returned.
try {
    Work result = apiInstance.getWorkById(workId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkApi#getWorkById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workId** | **Integer**| Id of the work to be returned. |

### Return type

[**Work**](Work.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkTags"></a>
# **getWorkTags**
> getWorkTags(workId)

Get the tags for a work.

Get all existing work tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WorkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkApi apiInstance = new WorkApi();
Integer workId = 56; // Integer | Id of the work to get tags for
try {
    apiInstance.getWorkTags(workId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkApi#getWorkTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workId** | **Integer**| Id of the work to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorkCustomFields"></a>
# **updateWorkCustomFields**
> updateWorkCustomFields(body)

Update a work custom fields

Updates an existing work custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WorkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkApi apiInstance = new WorkApi();
Work body = new Work(); // Work | Work to be updated.
try {
    apiInstance.updateWorkCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkApi#updateWorkCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Work**](Work.md)| Work to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

