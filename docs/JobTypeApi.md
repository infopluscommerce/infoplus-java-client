# JobTypeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addJobType**](JobTypeApi.md#addJobType) | **POST** /beta/jobType | Create a jobType
[**addJobTypeAudit**](JobTypeApi.md#addJobTypeAudit) | **PUT** /beta/jobType/{jobTypeId}/audit/{jobTypeAudit} | Add new audit for a jobType
[**addJobTypeFile**](JobTypeApi.md#addJobTypeFile) | **POST** /beta/jobType/{jobTypeId}/file/{fileName} | Attach a file to a jobType
[**addJobTypeTag**](JobTypeApi.md#addJobTypeTag) | **PUT** /beta/jobType/{jobTypeId}/tag/{jobTypeTag} | Add new tags for a jobType.
[**deleteJobType**](JobTypeApi.md#deleteJobType) | **DELETE** /beta/jobType/{jobTypeId} | Delete a jobType
[**deleteJobTypeTag**](JobTypeApi.md#deleteJobTypeTag) | **DELETE** /beta/jobType/{jobTypeId}/tag/{jobTypeTag} | Delete a tag for a jobType.
[**getDuplicateJobTypeById**](JobTypeApi.md#getDuplicateJobTypeById) | **GET** /beta/jobType/duplicate/{jobTypeId} | Get a duplicated a jobType by id
[**getJobTypeByFilter**](JobTypeApi.md#getJobTypeByFilter) | **GET** /beta/jobType/search | Search jobTypes by filter
[**getJobTypeById**](JobTypeApi.md#getJobTypeById) | **GET** /beta/jobType/{jobTypeId} | Get a jobType by id
[**getJobTypeTags**](JobTypeApi.md#getJobTypeTags) | **GET** /beta/jobType/{jobTypeId}/tag | Get the tags for a jobType.
[**updateJobType**](JobTypeApi.md#updateJobType) | **PUT** /beta/jobType | Update a jobType
[**updateJobTypeCustomFields**](JobTypeApi.md#updateJobTypeCustomFields) | **PUT** /beta/jobType/customFields | Update a jobType custom fields


<a name="addJobType"></a>
# **addJobType**
> JobType addJobType(body)

Create a jobType

Inserts a new jobType using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTypeApi apiInstance = new JobTypeApi();
JobType body = new JobType(); // JobType | JobType to be inserted.
try {
    JobType result = apiInstance.addJobType(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTypeApi#addJobType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JobType**](JobType.md)| JobType to be inserted. |

### Return type

[**JobType**](JobType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addJobTypeAudit"></a>
# **addJobTypeAudit**
> addJobTypeAudit(jobTypeId, jobTypeAudit)

Add new audit for a jobType

Adds an audit to an existing jobType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTypeApi apiInstance = new JobTypeApi();
Integer jobTypeId = 56; // Integer | Id of the jobType to add an audit to
String jobTypeAudit = "jobTypeAudit_example"; // String | The audit to add
try {
    apiInstance.addJobTypeAudit(jobTypeId, jobTypeAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTypeApi#addJobTypeAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTypeId** | **Integer**| Id of the jobType to add an audit to |
 **jobTypeAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addJobTypeFile"></a>
# **addJobTypeFile**
> addJobTypeFile(jobTypeId, fileName)

Attach a file to a jobType

Adds a file to an existing jobType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTypeApi apiInstance = new JobTypeApi();
Integer jobTypeId = 56; // Integer | Id of the jobType to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addJobTypeFile(jobTypeId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTypeApi#addJobTypeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTypeId** | **Integer**| Id of the jobType to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addJobTypeTag"></a>
# **addJobTypeTag**
> addJobTypeTag(jobTypeId, jobTypeTag)

Add new tags for a jobType.

Adds a tag to an existing jobType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTypeApi apiInstance = new JobTypeApi();
Integer jobTypeId = 56; // Integer | Id of the jobType to add a tag to
String jobTypeTag = "jobTypeTag_example"; // String | The tag to add
try {
    apiInstance.addJobTypeTag(jobTypeId, jobTypeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTypeApi#addJobTypeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTypeId** | **Integer**| Id of the jobType to add a tag to |
 **jobTypeTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteJobType"></a>
# **deleteJobType**
> deleteJobType(jobTypeId)

Delete a jobType

Deletes the jobType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTypeApi apiInstance = new JobTypeApi();
Integer jobTypeId = 56; // Integer | Id of the jobType to be deleted.
try {
    apiInstance.deleteJobType(jobTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTypeApi#deleteJobType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTypeId** | **Integer**| Id of the jobType to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteJobTypeTag"></a>
# **deleteJobTypeTag**
> deleteJobTypeTag(jobTypeId, jobTypeTag)

Delete a tag for a jobType.

Deletes an existing jobType tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTypeApi apiInstance = new JobTypeApi();
Integer jobTypeId = 56; // Integer | Id of the jobType to remove tag from
String jobTypeTag = "jobTypeTag_example"; // String | The tag to delete
try {
    apiInstance.deleteJobTypeTag(jobTypeId, jobTypeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTypeApi#deleteJobTypeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTypeId** | **Integer**| Id of the jobType to remove tag from |
 **jobTypeTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateJobTypeById"></a>
# **getDuplicateJobTypeById**
> JobType getDuplicateJobTypeById(jobTypeId)

Get a duplicated a jobType by id

Returns a duplicated jobType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTypeApi apiInstance = new JobTypeApi();
Integer jobTypeId = 56; // Integer | Id of the jobType to be duplicated.
try {
    JobType result = apiInstance.getDuplicateJobTypeById(jobTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTypeApi#getDuplicateJobTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTypeId** | **Integer**| Id of the jobType to be duplicated. |

### Return type

[**JobType**](JobType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobTypeByFilter"></a>
# **getJobTypeByFilter**
> List&lt;JobType&gt; getJobTypeByFilter(filter, page, limit, sort)

Search jobTypes by filter

Returns the list of jobTypes that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTypeApi apiInstance = new JobTypeApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<JobType> result = apiInstance.getJobTypeByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTypeApi#getJobTypeByFilter");
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

[**List&lt;JobType&gt;**](JobType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobTypeById"></a>
# **getJobTypeById**
> JobType getJobTypeById(jobTypeId)

Get a jobType by id

Returns the jobType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTypeApi apiInstance = new JobTypeApi();
Integer jobTypeId = 56; // Integer | Id of the jobType to be returned.
try {
    JobType result = apiInstance.getJobTypeById(jobTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTypeApi#getJobTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTypeId** | **Integer**| Id of the jobType to be returned. |

### Return type

[**JobType**](JobType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobTypeTags"></a>
# **getJobTypeTags**
> getJobTypeTags(jobTypeId)

Get the tags for a jobType.

Get all existing jobType tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTypeApi apiInstance = new JobTypeApi();
Integer jobTypeId = 56; // Integer | Id of the jobType to get tags for
try {
    apiInstance.getJobTypeTags(jobTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTypeApi#getJobTypeTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTypeId** | **Integer**| Id of the jobType to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateJobType"></a>
# **updateJobType**
> updateJobType(body)

Update a jobType

Updates an existing jobType using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTypeApi apiInstance = new JobTypeApi();
JobType body = new JobType(); // JobType | JobType to be updated.
try {
    apiInstance.updateJobType(body);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTypeApi#updateJobType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JobType**](JobType.md)| JobType to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateJobTypeCustomFields"></a>
# **updateJobTypeCustomFields**
> updateJobTypeCustomFields(body)

Update a jobType custom fields

Updates an existing jobType custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobTypeApi apiInstance = new JobTypeApi();
JobType body = new JobType(); // JobType | JobType to be updated.
try {
    apiInstance.updateJobTypeCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling JobTypeApi#updateJobTypeCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JobType**](JobType.md)| JobType to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

