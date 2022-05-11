# JobApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addJob**](JobApi.md#addJob) | **POST** /v3.0/job | Create a job
[**addJobAudit**](JobApi.md#addJobAudit) | **PUT** /v3.0/job/{jobId}/audit/{jobAudit} | Add new audit for a job
[**addJobFile**](JobApi.md#addJobFile) | **POST** /v3.0/job/{jobId}/file/{fileName} | Attach a file to a job
[**addJobFileByURL**](JobApi.md#addJobFileByURL) | **POST** /v3.0/job/{jobId}/file | Attach a file to a job by URL.
[**addJobTag**](JobApi.md#addJobTag) | **PUT** /v3.0/job/{jobId}/tag/{jobTag} | Add new tags for a job.
[**deleteJob**](JobApi.md#deleteJob) | **DELETE** /v3.0/job/{jobId} | Delete a job
[**deleteJobFile**](JobApi.md#deleteJobFile) | **DELETE** /v3.0/job/{jobId}/file/{fileId} | Delete a file for a job.
[**deleteJobTag**](JobApi.md#deleteJobTag) | **DELETE** /v3.0/job/{jobId}/tag/{jobTag} | Delete a tag for a job.
[**executeJob**](JobApi.md#executeJob) | **POST** /v3.0/job/executeJob | Run the ExecuteJob process.
[**getDuplicateJobById**](JobApi.md#getDuplicateJobById) | **GET** /v3.0/job/duplicate/{jobId} | Get a duplicated a job by id
[**getJobByFilter**](JobApi.md#getJobByFilter) | **GET** /v3.0/job/search | Search jobs by filter
[**getJobById**](JobApi.md#getJobById) | **GET** /v3.0/job/{jobId} | Get a job by id
[**getJobFiles**](JobApi.md#getJobFiles) | **GET** /v3.0/job/{jobId}/file | Get the files for a job.
[**getJobTags**](JobApi.md#getJobTags) | **GET** /v3.0/job/{jobId}/tag | Get the tags for a job.
[**updateJob**](JobApi.md#updateJob) | **PUT** /v3.0/job | Update a job
[**updateJobCustomFields**](JobApi.md#updateJobCustomFields) | **PUT** /v3.0/job/customFields | Update a job custom fields


<a name="addJob"></a>
# **addJob**
> Job addJob(body)

Create a job

Inserts a new job using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
Job body = new Job(); // Job | Job to be inserted.
try {
    Job result = apiInstance.addJob(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#addJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Job**](Job.md)| Job to be inserted. |

### Return type

[**Job**](Job.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addJobAudit"></a>
# **addJobAudit**
> addJobAudit(jobId, jobAudit)

Add new audit for a job

Adds an audit to an existing job.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
Integer jobId = 56; // Integer | Id of the job to add an audit to
String jobAudit = "jobAudit_example"; // String | The audit to add
try {
    apiInstance.addJobAudit(jobId, jobAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#addJobAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**| Id of the job to add an audit to |
 **jobAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addJobFile"></a>
# **addJobFile**
> addJobFile(jobId, fileName)

Attach a file to a job

Adds a file to an existing job.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
Integer jobId = 56; // Integer | Id of the job to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addJobFile(jobId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#addJobFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**| Id of the job to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addJobFileByURL"></a>
# **addJobFileByURL**
> addJobFileByURL(body, jobId)

Attach a file to a job by URL.

Adds a file to an existing job by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer jobId = 56; // Integer | Id of the job to add an file to
try {
    apiInstance.addJobFileByURL(body, jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#addJobFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **jobId** | **Integer**| Id of the job to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addJobTag"></a>
# **addJobTag**
> addJobTag(jobId, jobTag)

Add new tags for a job.

Adds a tag to an existing job.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
Integer jobId = 56; // Integer | Id of the job to add a tag to
String jobTag = "jobTag_example"; // String | The tag to add
try {
    apiInstance.addJobTag(jobId, jobTag);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#addJobTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**| Id of the job to add a tag to |
 **jobTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteJob"></a>
# **deleteJob**
> deleteJob(jobId)

Delete a job

Deletes the job identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
Integer jobId = 56; // Integer | Id of the job to be deleted.
try {
    apiInstance.deleteJob(jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#deleteJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**| Id of the job to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteJobFile"></a>
# **deleteJobFile**
> deleteJobFile(jobId, fileId)

Delete a file for a job.

Deletes an existing job file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
Integer jobId = 56; // Integer | Id of the job to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteJobFile(jobId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#deleteJobFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**| Id of the job to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteJobTag"></a>
# **deleteJobTag**
> deleteJobTag(jobId, jobTag)

Delete a tag for a job.

Deletes an existing job tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
Integer jobId = 56; // Integer | Id of the job to remove tag from
String jobTag = "jobTag_example"; // String | The tag to delete
try {
    apiInstance.deleteJobTag(jobId, jobTag);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#deleteJobTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**| Id of the job to remove tag from |
 **jobTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="executeJob"></a>
# **executeJob**
> List&lt;ProcessOutputAPIModel&gt; executeJob(body)

Run the ExecuteJob process.



### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
ExecuteJobInputAPIModel body = new ExecuteJobInputAPIModel(); // ExecuteJobInputAPIModel | Input data for ExecuteJob process.
try {
    List<ProcessOutputAPIModel> result = apiInstance.executeJob(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#executeJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExecuteJobInputAPIModel**](ExecuteJobInputAPIModel.md)| Input data for ExecuteJob process. |

### Return type

[**List&lt;ProcessOutputAPIModel&gt;**](ProcessOutputAPIModel.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateJobById"></a>
# **getDuplicateJobById**
> Job getDuplicateJobById(jobId)

Get a duplicated a job by id

Returns a duplicated job identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
Integer jobId = 56; // Integer | Id of the job to be duplicated.
try {
    Job result = apiInstance.getDuplicateJobById(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getDuplicateJobById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**| Id of the job to be duplicated. |

### Return type

[**Job**](Job.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobByFilter"></a>
# **getJobByFilter**
> List&lt;Job&gt; getJobByFilter(filter, page, limit, sort)

Search jobs by filter

Returns the list of jobs that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Job> result = apiInstance.getJobByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJobByFilter");
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

[**List&lt;Job&gt;**](Job.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobById"></a>
# **getJobById**
> Job getJobById(jobId)

Get a job by id

Returns the job identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
Integer jobId = 56; // Integer | Id of the job to be returned.
try {
    Job result = apiInstance.getJobById(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJobById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**| Id of the job to be returned. |

### Return type

[**Job**](Job.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobFiles"></a>
# **getJobFiles**
> getJobFiles(jobId)

Get the files for a job.

Get all existing job files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
Integer jobId = 56; // Integer | Id of the job to get files for
try {
    apiInstance.getJobFiles(jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJobFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**| Id of the job to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobTags"></a>
# **getJobTags**
> getJobTags(jobId)

Get the tags for a job.

Get all existing job tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
Integer jobId = 56; // Integer | Id of the job to get tags for
try {
    apiInstance.getJobTags(jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJobTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**| Id of the job to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateJob"></a>
# **updateJob**
> updateJob(body)

Update a job

Updates an existing job using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
Job body = new Job(); // Job | Job to be updated.
try {
    apiInstance.updateJob(body);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#updateJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Job**](Job.md)| Job to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateJobCustomFields"></a>
# **updateJobCustomFields**
> updateJobCustomFields(body)

Update a job custom fields

Updates an existing job custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
Job body = new Job(); // Job | Job to be updated.
try {
    apiInstance.updateJobCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#updateJobCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Job**](Job.md)| Job to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

