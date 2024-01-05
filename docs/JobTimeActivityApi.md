# JobTimeActivityApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addJobTimeActivity**](JobTimeActivityApi.md#addJobTimeActivity) | **POST** /beta/jobTimeActivity | Create a jobTimeActivity
[**addJobTimeActivityAudit**](JobTimeActivityApi.md#addJobTimeActivityAudit) | **PUT** /beta/jobTimeActivity/{jobTimeActivityId}/audit/{jobTimeActivityAudit} | Add new audit for a jobTimeActivity
[**addJobTimeActivityFile**](JobTimeActivityApi.md#addJobTimeActivityFile) | **POST** /beta/jobTimeActivity/{jobTimeActivityId}/file/{fileName} | Attach a file to a jobTimeActivity
[**addJobTimeActivityFileByURL**](JobTimeActivityApi.md#addJobTimeActivityFileByURL) | **POST** /beta/jobTimeActivity/{jobTimeActivityId}/file | Attach a file to a jobTimeActivity by URL.
[**addJobTimeActivityTag**](JobTimeActivityApi.md#addJobTimeActivityTag) | **PUT** /beta/jobTimeActivity/{jobTimeActivityId}/tag/{jobTimeActivityTag} | Add new tags for a jobTimeActivity.
[**deleteJobTimeActivity**](JobTimeActivityApi.md#deleteJobTimeActivity) | **DELETE** /beta/jobTimeActivity/{jobTimeActivityId} | Delete a jobTimeActivity
[**deleteJobTimeActivityFile**](JobTimeActivityApi.md#deleteJobTimeActivityFile) | **DELETE** /beta/jobTimeActivity/{jobTimeActivityId}/file/{fileId} | Delete a file for a jobTimeActivity.
[**deleteJobTimeActivityTag**](JobTimeActivityApi.md#deleteJobTimeActivityTag) | **DELETE** /beta/jobTimeActivity/{jobTimeActivityId}/tag/{jobTimeActivityTag} | Delete a tag for a jobTimeActivity.
[**getDuplicateJobTimeActivityById**](JobTimeActivityApi.md#getDuplicateJobTimeActivityById) | **GET** /beta/jobTimeActivity/duplicate/{jobTimeActivityId} | Get a duplicated a jobTimeActivity by id
[**getJobTimeActivityByFilter**](JobTimeActivityApi.md#getJobTimeActivityByFilter) | **GET** /beta/jobTimeActivity/search | Search jobTimeActivitys by filter
[**getJobTimeActivityById**](JobTimeActivityApi.md#getJobTimeActivityById) | **GET** /beta/jobTimeActivity/{jobTimeActivityId} | Get a jobTimeActivity by id
[**getJobTimeActivityFiles**](JobTimeActivityApi.md#getJobTimeActivityFiles) | **GET** /beta/jobTimeActivity/{jobTimeActivityId}/file | Get the files for a jobTimeActivity.
[**getJobTimeActivityTags**](JobTimeActivityApi.md#getJobTimeActivityTags) | **GET** /beta/jobTimeActivity/{jobTimeActivityId}/tag | Get the tags for a jobTimeActivity.
[**updateJobTimeActivity**](JobTimeActivityApi.md#updateJobTimeActivity) | **PUT** /beta/jobTimeActivity | Update a jobTimeActivity


<a name="addJobTimeActivity"></a>
# **addJobTimeActivity**
> JobTimeActivity addJobTimeActivity(body)

Create a jobTimeActivity

Inserts a new jobTimeActivity using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeActivityApi apiInstance = new JobTimeActivityApi();
JobTimeActivity body = new JobTimeActivity(); // JobTimeActivity | JobTimeActivity to be inserted.
try {
    JobTimeActivity result = apiInstance.addJobTimeActivity(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeActivityApi#addJobTimeActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JobTimeActivity**](JobTimeActivity.md)| JobTimeActivity to be inserted. |

### Return type

[**JobTimeActivity**](JobTimeActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addJobTimeActivityAudit"></a>
# **addJobTimeActivityAudit**
> addJobTimeActivityAudit(jobTimeActivityId, jobTimeActivityAudit)

Add new audit for a jobTimeActivity

Adds an audit to an existing jobTimeActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeActivityApi apiInstance = new JobTimeActivityApi();
Integer jobTimeActivityId = 56; // Integer | Id of the jobTimeActivity to add an audit to
String jobTimeActivityAudit = "jobTimeActivityAudit_example"; // String | The audit to add
try {
    apiInstance.addJobTimeActivityAudit(jobTimeActivityId, jobTimeActivityAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeActivityApi#addJobTimeActivityAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTimeActivityId** | **Integer**| Id of the jobTimeActivity to add an audit to |
 **jobTimeActivityAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addJobTimeActivityFile"></a>
# **addJobTimeActivityFile**
> addJobTimeActivityFile(jobTimeActivityId, fileName)

Attach a file to a jobTimeActivity

Adds a file to an existing jobTimeActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeActivityApi apiInstance = new JobTimeActivityApi();
Integer jobTimeActivityId = 56; // Integer | Id of the jobTimeActivity to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addJobTimeActivityFile(jobTimeActivityId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeActivityApi#addJobTimeActivityFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTimeActivityId** | **Integer**| Id of the jobTimeActivity to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addJobTimeActivityFileByURL"></a>
# **addJobTimeActivityFileByURL**
> addJobTimeActivityFileByURL(body, jobTimeActivityId)

Attach a file to a jobTimeActivity by URL.

Adds a file to an existing jobTimeActivity by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeActivityApi apiInstance = new JobTimeActivityApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer jobTimeActivityId = 56; // Integer | Id of the jobTimeActivity to add an file to
try {
    apiInstance.addJobTimeActivityFileByURL(body, jobTimeActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeActivityApi#addJobTimeActivityFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **jobTimeActivityId** | **Integer**| Id of the jobTimeActivity to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addJobTimeActivityTag"></a>
# **addJobTimeActivityTag**
> addJobTimeActivityTag(jobTimeActivityId, jobTimeActivityTag)

Add new tags for a jobTimeActivity.

Adds a tag to an existing jobTimeActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeActivityApi apiInstance = new JobTimeActivityApi();
Integer jobTimeActivityId = 56; // Integer | Id of the jobTimeActivity to add a tag to
String jobTimeActivityTag = "jobTimeActivityTag_example"; // String | The tag to add
try {
    apiInstance.addJobTimeActivityTag(jobTimeActivityId, jobTimeActivityTag);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeActivityApi#addJobTimeActivityTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTimeActivityId** | **Integer**| Id of the jobTimeActivity to add a tag to |
 **jobTimeActivityTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteJobTimeActivity"></a>
# **deleteJobTimeActivity**
> deleteJobTimeActivity(jobTimeActivityId)

Delete a jobTimeActivity

Deletes the jobTimeActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeActivityApi apiInstance = new JobTimeActivityApi();
Integer jobTimeActivityId = 56; // Integer | Id of the jobTimeActivity to be deleted.
try {
    apiInstance.deleteJobTimeActivity(jobTimeActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeActivityApi#deleteJobTimeActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTimeActivityId** | **Integer**| Id of the jobTimeActivity to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteJobTimeActivityFile"></a>
# **deleteJobTimeActivityFile**
> deleteJobTimeActivityFile(jobTimeActivityId, fileId)

Delete a file for a jobTimeActivity.

Deletes an existing jobTimeActivity file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeActivityApi apiInstance = new JobTimeActivityApi();
Integer jobTimeActivityId = 56; // Integer | Id of the jobTimeActivity to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteJobTimeActivityFile(jobTimeActivityId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeActivityApi#deleteJobTimeActivityFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTimeActivityId** | **Integer**| Id of the jobTimeActivity to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteJobTimeActivityTag"></a>
# **deleteJobTimeActivityTag**
> deleteJobTimeActivityTag(jobTimeActivityId, jobTimeActivityTag)

Delete a tag for a jobTimeActivity.

Deletes an existing jobTimeActivity tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeActivityApi apiInstance = new JobTimeActivityApi();
Integer jobTimeActivityId = 56; // Integer | Id of the jobTimeActivity to remove tag from
String jobTimeActivityTag = "jobTimeActivityTag_example"; // String | The tag to delete
try {
    apiInstance.deleteJobTimeActivityTag(jobTimeActivityId, jobTimeActivityTag);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeActivityApi#deleteJobTimeActivityTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTimeActivityId** | **Integer**| Id of the jobTimeActivity to remove tag from |
 **jobTimeActivityTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateJobTimeActivityById"></a>
# **getDuplicateJobTimeActivityById**
> JobTimeActivity getDuplicateJobTimeActivityById(jobTimeActivityId)

Get a duplicated a jobTimeActivity by id

Returns a duplicated jobTimeActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeActivityApi apiInstance = new JobTimeActivityApi();
Integer jobTimeActivityId = 56; // Integer | Id of the jobTimeActivity to be duplicated.
try {
    JobTimeActivity result = apiInstance.getDuplicateJobTimeActivityById(jobTimeActivityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeActivityApi#getDuplicateJobTimeActivityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTimeActivityId** | **Integer**| Id of the jobTimeActivity to be duplicated. |

### Return type

[**JobTimeActivity**](JobTimeActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobTimeActivityByFilter"></a>
# **getJobTimeActivityByFilter**
> List&lt;JobTimeActivity&gt; getJobTimeActivityByFilter(filter, page, limit, sort)

Search jobTimeActivitys by filter

Returns the list of jobTimeActivitys that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeActivityApi apiInstance = new JobTimeActivityApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<JobTimeActivity> result = apiInstance.getJobTimeActivityByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeActivityApi#getJobTimeActivityByFilter");
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

[**List&lt;JobTimeActivity&gt;**](JobTimeActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobTimeActivityById"></a>
# **getJobTimeActivityById**
> JobTimeActivity getJobTimeActivityById(jobTimeActivityId)

Get a jobTimeActivity by id

Returns the jobTimeActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeActivityApi apiInstance = new JobTimeActivityApi();
Integer jobTimeActivityId = 56; // Integer | Id of the jobTimeActivity to be returned.
try {
    JobTimeActivity result = apiInstance.getJobTimeActivityById(jobTimeActivityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeActivityApi#getJobTimeActivityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTimeActivityId** | **Integer**| Id of the jobTimeActivity to be returned. |

### Return type

[**JobTimeActivity**](JobTimeActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobTimeActivityFiles"></a>
# **getJobTimeActivityFiles**
> getJobTimeActivityFiles(jobTimeActivityId)

Get the files for a jobTimeActivity.

Get all existing jobTimeActivity files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeActivityApi apiInstance = new JobTimeActivityApi();
Integer jobTimeActivityId = 56; // Integer | Id of the jobTimeActivity to get files for
try {
    apiInstance.getJobTimeActivityFiles(jobTimeActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeActivityApi#getJobTimeActivityFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTimeActivityId** | **Integer**| Id of the jobTimeActivity to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobTimeActivityTags"></a>
# **getJobTimeActivityTags**
> getJobTimeActivityTags(jobTimeActivityId)

Get the tags for a jobTimeActivity.

Get all existing jobTimeActivity tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeActivityApi apiInstance = new JobTimeActivityApi();
Integer jobTimeActivityId = 56; // Integer | Id of the jobTimeActivity to get tags for
try {
    apiInstance.getJobTimeActivityTags(jobTimeActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeActivityApi#getJobTimeActivityTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTimeActivityId** | **Integer**| Id of the jobTimeActivity to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateJobTimeActivity"></a>
# **updateJobTimeActivity**
> updateJobTimeActivity(body)

Update a jobTimeActivity

Updates an existing jobTimeActivity using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeActivityApi apiInstance = new JobTimeActivityApi();
JobTimeActivity body = new JobTimeActivity(); // JobTimeActivity | JobTimeActivity to be updated.
try {
    apiInstance.updateJobTimeActivity(body);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeActivityApi#updateJobTimeActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JobTimeActivity**](JobTimeActivity.md)| JobTimeActivity to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

