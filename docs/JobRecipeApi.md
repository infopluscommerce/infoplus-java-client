# JobRecipeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addJobRecipe**](JobRecipeApi.md#addJobRecipe) | **POST** /v3.0/jobRecipe | Create a jobRecipe
[**addJobRecipeAudit**](JobRecipeApi.md#addJobRecipeAudit) | **PUT** /v3.0/jobRecipe/{jobRecipeId}/audit/{jobRecipeAudit} | Add new audit for a jobRecipe
[**addJobRecipeFile**](JobRecipeApi.md#addJobRecipeFile) | **POST** /v3.0/jobRecipe/{jobRecipeId}/file/{fileName} | Attach a file to a jobRecipe
[**addJobRecipeFileByURL**](JobRecipeApi.md#addJobRecipeFileByURL) | **POST** /v3.0/jobRecipe/{jobRecipeId}/file | Attach a file to a jobRecipe by URL.
[**addJobRecipeTag**](JobRecipeApi.md#addJobRecipeTag) | **PUT** /v3.0/jobRecipe/{jobRecipeId}/tag/{jobRecipeTag} | Add new tags for a jobRecipe.
[**deleteJobRecipe**](JobRecipeApi.md#deleteJobRecipe) | **DELETE** /v3.0/jobRecipe/{jobRecipeId} | Delete a jobRecipe
[**deleteJobRecipeFile**](JobRecipeApi.md#deleteJobRecipeFile) | **DELETE** /v3.0/jobRecipe/{jobRecipeId}/file/{fileId} | Delete a file for a jobRecipe.
[**deleteJobRecipeTag**](JobRecipeApi.md#deleteJobRecipeTag) | **DELETE** /v3.0/jobRecipe/{jobRecipeId}/tag/{jobRecipeTag} | Delete a tag for a jobRecipe.
[**getDuplicateJobRecipeById**](JobRecipeApi.md#getDuplicateJobRecipeById) | **GET** /v3.0/jobRecipe/duplicate/{jobRecipeId} | Get a duplicated a jobRecipe by id
[**getJobRecipeByFilter**](JobRecipeApi.md#getJobRecipeByFilter) | **GET** /v3.0/jobRecipe/search | Search jobRecipes by filter
[**getJobRecipeById**](JobRecipeApi.md#getJobRecipeById) | **GET** /v3.0/jobRecipe/{jobRecipeId} | Get a jobRecipe by id
[**getJobRecipeFiles**](JobRecipeApi.md#getJobRecipeFiles) | **GET** /v3.0/jobRecipe/{jobRecipeId}/file | Get the files for a jobRecipe.
[**getJobRecipeTags**](JobRecipeApi.md#getJobRecipeTags) | **GET** /v3.0/jobRecipe/{jobRecipeId}/tag | Get the tags for a jobRecipe.
[**updateJobRecipe**](JobRecipeApi.md#updateJobRecipe) | **PUT** /v3.0/jobRecipe | Update a jobRecipe
[**updateJobRecipeCustomFields**](JobRecipeApi.md#updateJobRecipeCustomFields) | **PUT** /v3.0/jobRecipe/customFields | Update a jobRecipe custom fields


<a name="addJobRecipe"></a>
# **addJobRecipe**
> JobRecipe addJobRecipe(body)

Create a jobRecipe

Inserts a new jobRecipe using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobRecipeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobRecipeApi apiInstance = new JobRecipeApi();
JobRecipe body = new JobRecipe(); // JobRecipe | JobRecipe to be inserted.
try {
    JobRecipe result = apiInstance.addJobRecipe(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobRecipeApi#addJobRecipe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JobRecipe**](JobRecipe.md)| JobRecipe to be inserted. |

### Return type

[**JobRecipe**](JobRecipe.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addJobRecipeAudit"></a>
# **addJobRecipeAudit**
> addJobRecipeAudit(jobRecipeId, jobRecipeAudit)

Add new audit for a jobRecipe

Adds an audit to an existing jobRecipe.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobRecipeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobRecipeApi apiInstance = new JobRecipeApi();
Integer jobRecipeId = 56; // Integer | Id of the jobRecipe to add an audit to
String jobRecipeAudit = "jobRecipeAudit_example"; // String | The audit to add
try {
    apiInstance.addJobRecipeAudit(jobRecipeId, jobRecipeAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling JobRecipeApi#addJobRecipeAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobRecipeId** | **Integer**| Id of the jobRecipe to add an audit to |
 **jobRecipeAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addJobRecipeFile"></a>
# **addJobRecipeFile**
> addJobRecipeFile(jobRecipeId, fileName)

Attach a file to a jobRecipe

Adds a file to an existing jobRecipe.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobRecipeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobRecipeApi apiInstance = new JobRecipeApi();
Integer jobRecipeId = 56; // Integer | Id of the jobRecipe to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addJobRecipeFile(jobRecipeId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling JobRecipeApi#addJobRecipeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobRecipeId** | **Integer**| Id of the jobRecipe to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addJobRecipeFileByURL"></a>
# **addJobRecipeFileByURL**
> addJobRecipeFileByURL(body, jobRecipeId)

Attach a file to a jobRecipe by URL.

Adds a file to an existing jobRecipe by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobRecipeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobRecipeApi apiInstance = new JobRecipeApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer jobRecipeId = 56; // Integer | Id of the jobRecipe to add an file to
try {
    apiInstance.addJobRecipeFileByURL(body, jobRecipeId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobRecipeApi#addJobRecipeFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **jobRecipeId** | **Integer**| Id of the jobRecipe to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addJobRecipeTag"></a>
# **addJobRecipeTag**
> addJobRecipeTag(jobRecipeId, jobRecipeTag)

Add new tags for a jobRecipe.

Adds a tag to an existing jobRecipe.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobRecipeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobRecipeApi apiInstance = new JobRecipeApi();
Integer jobRecipeId = 56; // Integer | Id of the jobRecipe to add a tag to
String jobRecipeTag = "jobRecipeTag_example"; // String | The tag to add
try {
    apiInstance.addJobRecipeTag(jobRecipeId, jobRecipeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling JobRecipeApi#addJobRecipeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobRecipeId** | **Integer**| Id of the jobRecipe to add a tag to |
 **jobRecipeTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteJobRecipe"></a>
# **deleteJobRecipe**
> deleteJobRecipe(jobRecipeId)

Delete a jobRecipe

Deletes the jobRecipe identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobRecipeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobRecipeApi apiInstance = new JobRecipeApi();
Integer jobRecipeId = 56; // Integer | Id of the jobRecipe to be deleted.
try {
    apiInstance.deleteJobRecipe(jobRecipeId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobRecipeApi#deleteJobRecipe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobRecipeId** | **Integer**| Id of the jobRecipe to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteJobRecipeFile"></a>
# **deleteJobRecipeFile**
> deleteJobRecipeFile(jobRecipeId, fileId)

Delete a file for a jobRecipe.

Deletes an existing jobRecipe file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobRecipeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobRecipeApi apiInstance = new JobRecipeApi();
Integer jobRecipeId = 56; // Integer | Id of the jobRecipe to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteJobRecipeFile(jobRecipeId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobRecipeApi#deleteJobRecipeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobRecipeId** | **Integer**| Id of the jobRecipe to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteJobRecipeTag"></a>
# **deleteJobRecipeTag**
> deleteJobRecipeTag(jobRecipeId, jobRecipeTag)

Delete a tag for a jobRecipe.

Deletes an existing jobRecipe tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobRecipeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobRecipeApi apiInstance = new JobRecipeApi();
Integer jobRecipeId = 56; // Integer | Id of the jobRecipe to remove tag from
String jobRecipeTag = "jobRecipeTag_example"; // String | The tag to delete
try {
    apiInstance.deleteJobRecipeTag(jobRecipeId, jobRecipeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling JobRecipeApi#deleteJobRecipeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobRecipeId** | **Integer**| Id of the jobRecipe to remove tag from |
 **jobRecipeTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateJobRecipeById"></a>
# **getDuplicateJobRecipeById**
> JobRecipe getDuplicateJobRecipeById(jobRecipeId)

Get a duplicated a jobRecipe by id

Returns a duplicated jobRecipe identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobRecipeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobRecipeApi apiInstance = new JobRecipeApi();
Integer jobRecipeId = 56; // Integer | Id of the jobRecipe to be duplicated.
try {
    JobRecipe result = apiInstance.getDuplicateJobRecipeById(jobRecipeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobRecipeApi#getDuplicateJobRecipeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobRecipeId** | **Integer**| Id of the jobRecipe to be duplicated. |

### Return type

[**JobRecipe**](JobRecipe.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobRecipeByFilter"></a>
# **getJobRecipeByFilter**
> List&lt;JobRecipe&gt; getJobRecipeByFilter(filter, page, limit, sort)

Search jobRecipes by filter

Returns the list of jobRecipes that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobRecipeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobRecipeApi apiInstance = new JobRecipeApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<JobRecipe> result = apiInstance.getJobRecipeByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobRecipeApi#getJobRecipeByFilter");
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

[**List&lt;JobRecipe&gt;**](JobRecipe.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobRecipeById"></a>
# **getJobRecipeById**
> JobRecipe getJobRecipeById(jobRecipeId)

Get a jobRecipe by id

Returns the jobRecipe identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobRecipeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobRecipeApi apiInstance = new JobRecipeApi();
Integer jobRecipeId = 56; // Integer | Id of the jobRecipe to be returned.
try {
    JobRecipe result = apiInstance.getJobRecipeById(jobRecipeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobRecipeApi#getJobRecipeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobRecipeId** | **Integer**| Id of the jobRecipe to be returned. |

### Return type

[**JobRecipe**](JobRecipe.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobRecipeFiles"></a>
# **getJobRecipeFiles**
> getJobRecipeFiles(jobRecipeId)

Get the files for a jobRecipe.

Get all existing jobRecipe files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobRecipeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobRecipeApi apiInstance = new JobRecipeApi();
Integer jobRecipeId = 56; // Integer | Id of the jobRecipe to get files for
try {
    apiInstance.getJobRecipeFiles(jobRecipeId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobRecipeApi#getJobRecipeFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobRecipeId** | **Integer**| Id of the jobRecipe to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobRecipeTags"></a>
# **getJobRecipeTags**
> getJobRecipeTags(jobRecipeId)

Get the tags for a jobRecipe.

Get all existing jobRecipe tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobRecipeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobRecipeApi apiInstance = new JobRecipeApi();
Integer jobRecipeId = 56; // Integer | Id of the jobRecipe to get tags for
try {
    apiInstance.getJobRecipeTags(jobRecipeId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobRecipeApi#getJobRecipeTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobRecipeId** | **Integer**| Id of the jobRecipe to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateJobRecipe"></a>
# **updateJobRecipe**
> updateJobRecipe(body)

Update a jobRecipe

Updates an existing jobRecipe using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobRecipeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobRecipeApi apiInstance = new JobRecipeApi();
JobRecipe body = new JobRecipe(); // JobRecipe | JobRecipe to be updated.
try {
    apiInstance.updateJobRecipe(body);
} catch (ApiException e) {
    System.err.println("Exception when calling JobRecipeApi#updateJobRecipe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JobRecipe**](JobRecipe.md)| JobRecipe to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateJobRecipeCustomFields"></a>
# **updateJobRecipeCustomFields**
> updateJobRecipeCustomFields(body)

Update a jobRecipe custom fields

Updates an existing jobRecipe custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.JobRecipeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobRecipeApi apiInstance = new JobRecipeApi();
JobRecipe body = new JobRecipe(); // JobRecipe | JobRecipe to be updated.
try {
    apiInstance.updateJobRecipeCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling JobRecipeApi#updateJobRecipeCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JobRecipe**](JobRecipe.md)| JobRecipe to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

