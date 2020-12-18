# JobTimeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addJobTime**](JobTimeApi.md#addJobTime) | **POST** /beta/jobTime | Create a jobTime
[**addJobTimeAudit**](JobTimeApi.md#addJobTimeAudit) | **PUT** /beta/jobTime/{jobTimeId}/audit/{jobTimeAudit} | Add new audit for a jobTime
[**addJobTimeFile**](JobTimeApi.md#addJobTimeFile) | **POST** /beta/jobTime/{jobTimeId}/file/{fileName} | Attach a file to a jobTime
[**addJobTimeFileByURL**](JobTimeApi.md#addJobTimeFileByURL) | **POST** /beta/jobTime/{jobTimeId}/file | Attach a file to a jobTime by URL.
[**addJobTimeTag**](JobTimeApi.md#addJobTimeTag) | **PUT** /beta/jobTime/{jobTimeId}/tag/{jobTimeTag} | Add new tags for a jobTime.
[**deleteJobTime**](JobTimeApi.md#deleteJobTime) | **DELETE** /beta/jobTime/{jobTimeId} | Delete a jobTime
[**deleteJobTimeFile**](JobTimeApi.md#deleteJobTimeFile) | **DELETE** /beta/jobTime/{jobTimeId}/file/{fileId} | Delete a file for a jobTime.
[**deleteJobTimeTag**](JobTimeApi.md#deleteJobTimeTag) | **DELETE** /beta/jobTime/{jobTimeId}/tag/{jobTimeTag} | Delete a tag for a jobTime.
[**getDuplicateJobTimeById**](JobTimeApi.md#getDuplicateJobTimeById) | **GET** /beta/jobTime/duplicate/{jobTimeId} | Get a duplicated a jobTime by id
[**getJobTimeByFilter**](JobTimeApi.md#getJobTimeByFilter) | **GET** /beta/jobTime/search | Search jobTimes by filter
[**getJobTimeById**](JobTimeApi.md#getJobTimeById) | **GET** /beta/jobTime/{jobTimeId} | Get a jobTime by id
[**getJobTimeFiles**](JobTimeApi.md#getJobTimeFiles) | **GET** /beta/jobTime/{jobTimeId}/file | Get the files for a jobTime.
[**getJobTimeTags**](JobTimeApi.md#getJobTimeTags) | **GET** /beta/jobTime/{jobTimeId}/tag | Get the tags for a jobTime.
[**updateJobTime**](JobTimeApi.md#updateJobTime) | **PUT** /beta/jobTime | Update a jobTime
[**updateJobTimeCustomFields**](JobTimeApi.md#updateJobTimeCustomFields) | **PUT** /beta/jobTime/customFields | Update a jobTime custom fields


<a name="addJobTime"></a>
# **addJobTime**
> JobTime addJobTime(body)

Create a jobTime

Inserts a new jobTime using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeApi apiInstance = new JobTimeApi();
JobTime body = new JobTime(); // JobTime | JobTime to be inserted.
try {
    JobTime result = apiInstance.addJobTime(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeApi#addJobTime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JobTime**](JobTime.md)| JobTime to be inserted. |

### Return type

[**JobTime**](JobTime.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addJobTimeAudit"></a>
# **addJobTimeAudit**
> addJobTimeAudit(jobTimeId, jobTimeAudit)

Add new audit for a jobTime

Adds an audit to an existing jobTime.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeApi apiInstance = new JobTimeApi();
Integer jobTimeId = 56; // Integer | Id of the jobTime to add an audit to
String jobTimeAudit = "jobTimeAudit_example"; // String | The audit to add
try {
    apiInstance.addJobTimeAudit(jobTimeId, jobTimeAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeApi#addJobTimeAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTimeId** | **Integer**| Id of the jobTime to add an audit to |
 **jobTimeAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addJobTimeFile"></a>
# **addJobTimeFile**
> addJobTimeFile(jobTimeId, fileName)

Attach a file to a jobTime

Adds a file to an existing jobTime.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeApi apiInstance = new JobTimeApi();
Integer jobTimeId = 56; // Integer | Id of the jobTime to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addJobTimeFile(jobTimeId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeApi#addJobTimeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTimeId** | **Integer**| Id of the jobTime to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addJobTimeFileByURL"></a>
# **addJobTimeFileByURL**
> addJobTimeFileByURL(body, jobTimeId)

Attach a file to a jobTime by URL.

Adds a file to an existing jobTime by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeApi apiInstance = new JobTimeApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer jobTimeId = 56; // Integer | Id of the jobTime to add an file to
try {
    apiInstance.addJobTimeFileByURL(body, jobTimeId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeApi#addJobTimeFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **jobTimeId** | **Integer**| Id of the jobTime to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addJobTimeTag"></a>
# **addJobTimeTag**
> addJobTimeTag(jobTimeId, jobTimeTag)

Add new tags for a jobTime.

Adds a tag to an existing jobTime.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeApi apiInstance = new JobTimeApi();
Integer jobTimeId = 56; // Integer | Id of the jobTime to add a tag to
String jobTimeTag = "jobTimeTag_example"; // String | The tag to add
try {
    apiInstance.addJobTimeTag(jobTimeId, jobTimeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeApi#addJobTimeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTimeId** | **Integer**| Id of the jobTime to add a tag to |
 **jobTimeTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteJobTime"></a>
# **deleteJobTime**
> deleteJobTime(jobTimeId)

Delete a jobTime

Deletes the jobTime identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeApi apiInstance = new JobTimeApi();
Integer jobTimeId = 56; // Integer | Id of the jobTime to be deleted.
try {
    apiInstance.deleteJobTime(jobTimeId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeApi#deleteJobTime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTimeId** | **Integer**| Id of the jobTime to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteJobTimeFile"></a>
# **deleteJobTimeFile**
> deleteJobTimeFile(jobTimeId, fileId)

Delete a file for a jobTime.

Deletes an existing jobTime file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeApi apiInstance = new JobTimeApi();
Integer jobTimeId = 56; // Integer | Id of the jobTime to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteJobTimeFile(jobTimeId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeApi#deleteJobTimeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTimeId** | **Integer**| Id of the jobTime to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteJobTimeTag"></a>
# **deleteJobTimeTag**
> deleteJobTimeTag(jobTimeId, jobTimeTag)

Delete a tag for a jobTime.

Deletes an existing jobTime tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeApi apiInstance = new JobTimeApi();
Integer jobTimeId = 56; // Integer | Id of the jobTime to remove tag from
String jobTimeTag = "jobTimeTag_example"; // String | The tag to delete
try {
    apiInstance.deleteJobTimeTag(jobTimeId, jobTimeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeApi#deleteJobTimeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTimeId** | **Integer**| Id of the jobTime to remove tag from |
 **jobTimeTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateJobTimeById"></a>
# **getDuplicateJobTimeById**
> JobTime getDuplicateJobTimeById(jobTimeId)

Get a duplicated a jobTime by id

Returns a duplicated jobTime identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeApi apiInstance = new JobTimeApi();
Integer jobTimeId = 56; // Integer | Id of the jobTime to be duplicated.
try {
    JobTime result = apiInstance.getDuplicateJobTimeById(jobTimeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeApi#getDuplicateJobTimeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTimeId** | **Integer**| Id of the jobTime to be duplicated. |

### Return type

[**JobTime**](JobTime.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobTimeByFilter"></a>
# **getJobTimeByFilter**
> List&lt;JobTime&gt; getJobTimeByFilter(filter, page, limit, sort)

Search jobTimes by filter

Returns the list of jobTimes that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeApi apiInstance = new JobTimeApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<JobTime> result = apiInstance.getJobTimeByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeApi#getJobTimeByFilter");
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

[**List&lt;JobTime&gt;**](JobTime.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobTimeById"></a>
# **getJobTimeById**
> JobTime getJobTimeById(jobTimeId)

Get a jobTime by id

Returns the jobTime identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeApi apiInstance = new JobTimeApi();
Integer jobTimeId = 56; // Integer | Id of the jobTime to be returned.
try {
    JobTime result = apiInstance.getJobTimeById(jobTimeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeApi#getJobTimeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTimeId** | **Integer**| Id of the jobTime to be returned. |

### Return type

[**JobTime**](JobTime.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobTimeFiles"></a>
# **getJobTimeFiles**
> getJobTimeFiles(jobTimeId)

Get the files for a jobTime.

Get all existing jobTime files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeApi apiInstance = new JobTimeApi();
Integer jobTimeId = 56; // Integer | Id of the jobTime to get files for
try {
    apiInstance.getJobTimeFiles(jobTimeId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeApi#getJobTimeFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTimeId** | **Integer**| Id of the jobTime to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobTimeTags"></a>
# **getJobTimeTags**
> getJobTimeTags(jobTimeId)

Get the tags for a jobTime.

Get all existing jobTime tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeApi apiInstance = new JobTimeApi();
Integer jobTimeId = 56; // Integer | Id of the jobTime to get tags for
try {
    apiInstance.getJobTimeTags(jobTimeId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeApi#getJobTimeTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTimeId** | **Integer**| Id of the jobTime to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateJobTime"></a>
# **updateJobTime**
> updateJobTime(body)

Update a jobTime

Updates an existing jobTime using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeApi apiInstance = new JobTimeApi();
JobTime body = new JobTime(); // JobTime | JobTime to be updated.
try {
    apiInstance.updateJobTime(body);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeApi#updateJobTime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JobTime**](JobTime.md)| JobTime to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateJobTimeCustomFields"></a>
# **updateJobTimeCustomFields**
> updateJobTimeCustomFields(body)

Update a jobTime custom fields

Updates an existing jobTime custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTimeApi apiInstance = new JobTimeApi();
JobTime body = new JobTime(); // JobTime | JobTime to be updated.
try {
    apiInstance.updateJobTimeCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTimeApi#updateJobTimeCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JobTime**](JobTime.md)| JobTime to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

