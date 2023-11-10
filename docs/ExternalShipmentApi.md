# ExternalShipmentApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addExternalShipment**](ExternalShipmentApi.md#addExternalShipment) | **POST** /beta/externalShipment | Create an externalShipment
[**addExternalShipmentAudit**](ExternalShipmentApi.md#addExternalShipmentAudit) | **PUT** /beta/externalShipment/{externalShipmentId}/audit/{externalShipmentAudit} | Add new audit for an externalShipment
[**addExternalShipmentFile**](ExternalShipmentApi.md#addExternalShipmentFile) | **POST** /beta/externalShipment/{externalShipmentId}/file/{fileName} | Attach a file to an externalShipment
[**addExternalShipmentFileByURL**](ExternalShipmentApi.md#addExternalShipmentFileByURL) | **POST** /beta/externalShipment/{externalShipmentId}/file | Attach a file to an externalShipment by URL.
[**addExternalShipmentTag**](ExternalShipmentApi.md#addExternalShipmentTag) | **PUT** /beta/externalShipment/{externalShipmentId}/tag/{externalShipmentTag} | Add new tags for an externalShipment.
[**deleteExternalShipment**](ExternalShipmentApi.md#deleteExternalShipment) | **DELETE** /beta/externalShipment/{externalShipmentId} | Delete an externalShipment
[**deleteExternalShipmentFile**](ExternalShipmentApi.md#deleteExternalShipmentFile) | **DELETE** /beta/externalShipment/{externalShipmentId}/file/{fileId} | Delete a file for an externalShipment.
[**deleteExternalShipmentTag**](ExternalShipmentApi.md#deleteExternalShipmentTag) | **DELETE** /beta/externalShipment/{externalShipmentId}/tag/{externalShipmentTag} | Delete a tag for an externalShipment.
[**executeExternalShipment**](ExternalShipmentApi.md#executeExternalShipment) | **POST** /beta/externalShipment/executeExternalShipment | Execute externalShipment
[**getDuplicateExternalShipmentById**](ExternalShipmentApi.md#getDuplicateExternalShipmentById) | **GET** /beta/externalShipment/duplicate/{externalShipmentId} | Get a duplicated an externalShipment by id
[**getExternalShipmentByFilter**](ExternalShipmentApi.md#getExternalShipmentByFilter) | **GET** /beta/externalShipment/search | Search externalShipments by filter
[**getExternalShipmentById**](ExternalShipmentApi.md#getExternalShipmentById) | **GET** /beta/externalShipment/{externalShipmentId} | Get an externalShipment by id
[**getExternalShipmentFiles**](ExternalShipmentApi.md#getExternalShipmentFiles) | **GET** /beta/externalShipment/{externalShipmentId}/file | Get the files for an externalShipment.
[**getExternalShipmentTags**](ExternalShipmentApi.md#getExternalShipmentTags) | **GET** /beta/externalShipment/{externalShipmentId}/tag | Get the tags for an externalShipment.
[**updateExternalShipment**](ExternalShipmentApi.md#updateExternalShipment) | **PUT** /beta/externalShipment | Update an externalShipment
[**updateExternalShipmentCustomFields**](ExternalShipmentApi.md#updateExternalShipmentCustomFields) | **PUT** /beta/externalShipment/customFields | Update an externalShipment custom fields


<a name="addExternalShipment"></a>
# **addExternalShipment**
> ExternalShipment addExternalShipment(body)

Create an externalShipment

Inserts a new externalShipment using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShipmentApi apiInstance = new ExternalShipmentApi();
ExternalShipment body = new ExternalShipment(); // ExternalShipment | ExternalShipment to be inserted.
try {
    ExternalShipment result = apiInstance.addExternalShipment(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShipmentApi#addExternalShipment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExternalShipment**](ExternalShipment.md)| ExternalShipment to be inserted. |

### Return type

[**ExternalShipment**](ExternalShipment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addExternalShipmentAudit"></a>
# **addExternalShipmentAudit**
> addExternalShipmentAudit(externalShipmentId, externalShipmentAudit)

Add new audit for an externalShipment

Adds an audit to an existing externalShipment.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShipmentApi apiInstance = new ExternalShipmentApi();
Integer externalShipmentId = 56; // Integer | Id of the externalShipment to add an audit to
String externalShipmentAudit = "externalShipmentAudit_example"; // String | The audit to add
try {
    apiInstance.addExternalShipmentAudit(externalShipmentId, externalShipmentAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShipmentApi#addExternalShipmentAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalShipmentId** | **Integer**| Id of the externalShipment to add an audit to |
 **externalShipmentAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addExternalShipmentFile"></a>
# **addExternalShipmentFile**
> addExternalShipmentFile(externalShipmentId, fileName)

Attach a file to an externalShipment

Adds a file to an existing externalShipment.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShipmentApi apiInstance = new ExternalShipmentApi();
Integer externalShipmentId = 56; // Integer | Id of the externalShipment to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addExternalShipmentFile(externalShipmentId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShipmentApi#addExternalShipmentFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalShipmentId** | **Integer**| Id of the externalShipment to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addExternalShipmentFileByURL"></a>
# **addExternalShipmentFileByURL**
> addExternalShipmentFileByURL(body, externalShipmentId)

Attach a file to an externalShipment by URL.

Adds a file to an existing externalShipment by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShipmentApi apiInstance = new ExternalShipmentApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer externalShipmentId = 56; // Integer | Id of the externalShipment to add an file to
try {
    apiInstance.addExternalShipmentFileByURL(body, externalShipmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShipmentApi#addExternalShipmentFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **externalShipmentId** | **Integer**| Id of the externalShipment to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addExternalShipmentTag"></a>
# **addExternalShipmentTag**
> addExternalShipmentTag(externalShipmentId, externalShipmentTag)

Add new tags for an externalShipment.

Adds a tag to an existing externalShipment.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShipmentApi apiInstance = new ExternalShipmentApi();
Integer externalShipmentId = 56; // Integer | Id of the externalShipment to add a tag to
String externalShipmentTag = "externalShipmentTag_example"; // String | The tag to add
try {
    apiInstance.addExternalShipmentTag(externalShipmentId, externalShipmentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShipmentApi#addExternalShipmentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalShipmentId** | **Integer**| Id of the externalShipment to add a tag to |
 **externalShipmentTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteExternalShipment"></a>
# **deleteExternalShipment**
> deleteExternalShipment(externalShipmentId)

Delete an externalShipment

Deletes the externalShipment identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShipmentApi apiInstance = new ExternalShipmentApi();
Integer externalShipmentId = 56; // Integer | Id of the externalShipment to be deleted.
try {
    apiInstance.deleteExternalShipment(externalShipmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShipmentApi#deleteExternalShipment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalShipmentId** | **Integer**| Id of the externalShipment to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteExternalShipmentFile"></a>
# **deleteExternalShipmentFile**
> deleteExternalShipmentFile(externalShipmentId, fileId)

Delete a file for an externalShipment.

Deletes an existing externalShipment file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShipmentApi apiInstance = new ExternalShipmentApi();
Integer externalShipmentId = 56; // Integer | Id of the externalShipment to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteExternalShipmentFile(externalShipmentId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShipmentApi#deleteExternalShipmentFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalShipmentId** | **Integer**| Id of the externalShipment to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteExternalShipmentTag"></a>
# **deleteExternalShipmentTag**
> deleteExternalShipmentTag(externalShipmentId, externalShipmentTag)

Delete a tag for an externalShipment.

Deletes an existing externalShipment tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShipmentApi apiInstance = new ExternalShipmentApi();
Integer externalShipmentId = 56; // Integer | Id of the externalShipment to remove tag from
String externalShipmentTag = "externalShipmentTag_example"; // String | The tag to delete
try {
    apiInstance.deleteExternalShipmentTag(externalShipmentId, externalShipmentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShipmentApi#deleteExternalShipmentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalShipmentId** | **Integer**| Id of the externalShipment to remove tag from |
 **externalShipmentTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="executeExternalShipment"></a>
# **executeExternalShipment**
> List&lt;ProcessOutputAPIModel&gt; executeExternalShipment(body)

Execute externalShipment

Execute externalShipments using the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShipmentApi apiInstance = new ExternalShipmentApi();
ExecuteExternalShipmentInputAPIModel body = new ExecuteExternalShipmentInputAPIModel(); // ExecuteExternalShipmentInputAPIModel | ExternalShipment to be executed.
try {
    List<ProcessOutputAPIModel> result = apiInstance.executeExternalShipment(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShipmentApi#executeExternalShipment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExecuteExternalShipmentInputAPIModel**](ExecuteExternalShipmentInputAPIModel.md)| ExternalShipment to be executed. |

### Return type

[**List&lt;ProcessOutputAPIModel&gt;**](ProcessOutputAPIModel.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDuplicateExternalShipmentById"></a>
# **getDuplicateExternalShipmentById**
> ExternalShipment getDuplicateExternalShipmentById(externalShipmentId)

Get a duplicated an externalShipment by id

Returns a duplicated externalShipment identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShipmentApi apiInstance = new ExternalShipmentApi();
Integer externalShipmentId = 56; // Integer | Id of the externalShipment to be duplicated.
try {
    ExternalShipment result = apiInstance.getDuplicateExternalShipmentById(externalShipmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShipmentApi#getDuplicateExternalShipmentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalShipmentId** | **Integer**| Id of the externalShipment to be duplicated. |

### Return type

[**ExternalShipment**](ExternalShipment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExternalShipmentByFilter"></a>
# **getExternalShipmentByFilter**
> List&lt;ExternalShipment&gt; getExternalShipmentByFilter(filter, page, limit, sort)

Search externalShipments by filter

Returns the list of externalShipments that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShipmentApi apiInstance = new ExternalShipmentApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ExternalShipment> result = apiInstance.getExternalShipmentByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShipmentApi#getExternalShipmentByFilter");
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

[**List&lt;ExternalShipment&gt;**](ExternalShipment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExternalShipmentById"></a>
# **getExternalShipmentById**
> ExternalShipment getExternalShipmentById(externalShipmentId)

Get an externalShipment by id

Returns the externalShipment identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShipmentApi apiInstance = new ExternalShipmentApi();
Integer externalShipmentId = 56; // Integer | Id of the externalShipment to be returned.
try {
    ExternalShipment result = apiInstance.getExternalShipmentById(externalShipmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShipmentApi#getExternalShipmentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalShipmentId** | **Integer**| Id of the externalShipment to be returned. |

### Return type

[**ExternalShipment**](ExternalShipment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExternalShipmentFiles"></a>
# **getExternalShipmentFiles**
> getExternalShipmentFiles(externalShipmentId)

Get the files for an externalShipment.

Get all existing externalShipment files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShipmentApi apiInstance = new ExternalShipmentApi();
Integer externalShipmentId = 56; // Integer | Id of the externalShipment to get files for
try {
    apiInstance.getExternalShipmentFiles(externalShipmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShipmentApi#getExternalShipmentFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalShipmentId** | **Integer**| Id of the externalShipment to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExternalShipmentTags"></a>
# **getExternalShipmentTags**
> getExternalShipmentTags(externalShipmentId)

Get the tags for an externalShipment.

Get all existing externalShipment tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShipmentApi apiInstance = new ExternalShipmentApi();
Integer externalShipmentId = 56; // Integer | Id of the externalShipment to get tags for
try {
    apiInstance.getExternalShipmentTags(externalShipmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShipmentApi#getExternalShipmentTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalShipmentId** | **Integer**| Id of the externalShipment to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateExternalShipment"></a>
# **updateExternalShipment**
> updateExternalShipment(body)

Update an externalShipment

Updates an existing externalShipment using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShipmentApi apiInstance = new ExternalShipmentApi();
ExternalShipment body = new ExternalShipment(); // ExternalShipment | ExternalShipment to be updated.
try {
    apiInstance.updateExternalShipment(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShipmentApi#updateExternalShipment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExternalShipment**](ExternalShipment.md)| ExternalShipment to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateExternalShipmentCustomFields"></a>
# **updateExternalShipmentCustomFields**
> updateExternalShipmentCustomFields(body)

Update an externalShipment custom fields

Updates an existing externalShipment custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShipmentApi apiInstance = new ExternalShipmentApi();
ExternalShipment body = new ExternalShipment(); // ExternalShipment | ExternalShipment to be updated.
try {
    apiInstance.updateExternalShipmentCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShipmentApi#updateExternalShipmentCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExternalShipment**](ExternalShipment.md)| ExternalShipment to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

