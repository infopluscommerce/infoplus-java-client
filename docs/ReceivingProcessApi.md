# ReceivingProcessApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addReceivingProcessAudit**](ReceivingProcessApi.md#addReceivingProcessAudit) | **PUT** /v3.0/receivingProcess/{receivingProcessId}/audit/{receivingProcessAudit} | Add new audit for a receivingProcess
[**addReceivingProcessFile**](ReceivingProcessApi.md#addReceivingProcessFile) | **POST** /v3.0/receivingProcess/{receivingProcessId}/file/{fileName} | Attach a file to a receivingProcess
[**addReceivingProcessFileByURL**](ReceivingProcessApi.md#addReceivingProcessFileByURL) | **POST** /v3.0/receivingProcess/{receivingProcessId}/file | Attach a file to a receivingProcess by URL.
[**addReceivingProcessTag**](ReceivingProcessApi.md#addReceivingProcessTag) | **PUT** /v3.0/receivingProcess/{receivingProcessId}/tag/{receivingProcessTag} | Add new tags for a receivingProcess.
[**deleteReceivingProcessFile**](ReceivingProcessApi.md#deleteReceivingProcessFile) | **DELETE** /v3.0/receivingProcess/{receivingProcessId}/file/{fileId} | Delete a file for a receivingProcess.
[**deleteReceivingProcessTag**](ReceivingProcessApi.md#deleteReceivingProcessTag) | **DELETE** /v3.0/receivingProcess/{receivingProcessId}/tag/{receivingProcessTag} | Delete a tag for a receivingProcess.
[**getDuplicateReceivingProcessById**](ReceivingProcessApi.md#getDuplicateReceivingProcessById) | **GET** /v3.0/receivingProcess/duplicate/{receivingProcessId} | Get a duplicated a receivingProcess by id
[**getReceivingProcessByFilter**](ReceivingProcessApi.md#getReceivingProcessByFilter) | **GET** /v3.0/receivingProcess/search | Search receivingProcesses by filter
[**getReceivingProcessById**](ReceivingProcessApi.md#getReceivingProcessById) | **GET** /v3.0/receivingProcess/{receivingProcessId} | Get a receivingProcess by id
[**getReceivingProcessFiles**](ReceivingProcessApi.md#getReceivingProcessFiles) | **GET** /v3.0/receivingProcess/{receivingProcessId}/file | Get the files for a receivingProcess.
[**getReceivingProcessTags**](ReceivingProcessApi.md#getReceivingProcessTags) | **GET** /v3.0/receivingProcess/{receivingProcessId}/tag | Get the tags for a receivingProcess.
[**updateReceivingProcessCustomFields**](ReceivingProcessApi.md#updateReceivingProcessCustomFields) | **PUT** /v3.0/receivingProcess/customFields | Update a receivingProcess custom fields


<a name="addReceivingProcessAudit"></a>
# **addReceivingProcessAudit**
> addReceivingProcessAudit(receivingProcessId, receivingProcessAudit)

Add new audit for a receivingProcess

Adds an audit to an existing receivingProcess.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingProcessApi apiInstance = new ReceivingProcessApi();
Integer receivingProcessId = 56; // Integer | Id of the receivingProcess to add an audit to
String receivingProcessAudit = "receivingProcessAudit_example"; // String | The audit to add
try {
    apiInstance.addReceivingProcessAudit(receivingProcessId, receivingProcessAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingProcessApi#addReceivingProcessAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receivingProcessId** | **Integer**| Id of the receivingProcess to add an audit to |
 **receivingProcessAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addReceivingProcessFile"></a>
# **addReceivingProcessFile**
> addReceivingProcessFile(receivingProcessId, fileName)

Attach a file to a receivingProcess

Adds a file to an existing receivingProcess.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingProcessApi apiInstance = new ReceivingProcessApi();
Integer receivingProcessId = 56; // Integer | Id of the receivingProcess to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addReceivingProcessFile(receivingProcessId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingProcessApi#addReceivingProcessFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receivingProcessId** | **Integer**| Id of the receivingProcess to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addReceivingProcessFileByURL"></a>
# **addReceivingProcessFileByURL**
> addReceivingProcessFileByURL(body, receivingProcessId)

Attach a file to a receivingProcess by URL.

Adds a file to an existing receivingProcess by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingProcessApi apiInstance = new ReceivingProcessApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer receivingProcessId = 56; // Integer | Id of the receivingProcess to add an file to
try {
    apiInstance.addReceivingProcessFileByURL(body, receivingProcessId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingProcessApi#addReceivingProcessFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **receivingProcessId** | **Integer**| Id of the receivingProcess to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addReceivingProcessTag"></a>
# **addReceivingProcessTag**
> addReceivingProcessTag(receivingProcessId, receivingProcessTag)

Add new tags for a receivingProcess.

Adds a tag to an existing receivingProcess.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingProcessApi apiInstance = new ReceivingProcessApi();
Integer receivingProcessId = 56; // Integer | Id of the receivingProcess to add a tag to
String receivingProcessTag = "receivingProcessTag_example"; // String | The tag to add
try {
    apiInstance.addReceivingProcessTag(receivingProcessId, receivingProcessTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingProcessApi#addReceivingProcessTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receivingProcessId** | **Integer**| Id of the receivingProcess to add a tag to |
 **receivingProcessTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReceivingProcessFile"></a>
# **deleteReceivingProcessFile**
> deleteReceivingProcessFile(receivingProcessId, fileId)

Delete a file for a receivingProcess.

Deletes an existing receivingProcess file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingProcessApi apiInstance = new ReceivingProcessApi();
Integer receivingProcessId = 56; // Integer | Id of the receivingProcess to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteReceivingProcessFile(receivingProcessId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingProcessApi#deleteReceivingProcessFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receivingProcessId** | **Integer**| Id of the receivingProcess to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteReceivingProcessTag"></a>
# **deleteReceivingProcessTag**
> deleteReceivingProcessTag(receivingProcessId, receivingProcessTag)

Delete a tag for a receivingProcess.

Deletes an existing receivingProcess tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingProcessApi apiInstance = new ReceivingProcessApi();
Integer receivingProcessId = 56; // Integer | Id of the receivingProcess to remove tag from
String receivingProcessTag = "receivingProcessTag_example"; // String | The tag to delete
try {
    apiInstance.deleteReceivingProcessTag(receivingProcessId, receivingProcessTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingProcessApi#deleteReceivingProcessTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receivingProcessId** | **Integer**| Id of the receivingProcess to remove tag from |
 **receivingProcessTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateReceivingProcessById"></a>
# **getDuplicateReceivingProcessById**
> ReceivingProcess getDuplicateReceivingProcessById(receivingProcessId)

Get a duplicated a receivingProcess by id

Returns a duplicated receivingProcess identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingProcessApi apiInstance = new ReceivingProcessApi();
Integer receivingProcessId = 56; // Integer | Id of the receivingProcess to be duplicated.
try {
    ReceivingProcess result = apiInstance.getDuplicateReceivingProcessById(receivingProcessId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingProcessApi#getDuplicateReceivingProcessById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receivingProcessId** | **Integer**| Id of the receivingProcess to be duplicated. |

### Return type

[**ReceivingProcess**](ReceivingProcess.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReceivingProcessByFilter"></a>
# **getReceivingProcessByFilter**
> List&lt;ReceivingProcess&gt; getReceivingProcessByFilter(filter, page, limit, sort)

Search receivingProcesses by filter

Returns the list of receivingProcesses that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingProcessApi apiInstance = new ReceivingProcessApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ReceivingProcess> result = apiInstance.getReceivingProcessByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingProcessApi#getReceivingProcessByFilter");
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

[**List&lt;ReceivingProcess&gt;**](ReceivingProcess.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReceivingProcessById"></a>
# **getReceivingProcessById**
> ReceivingProcess getReceivingProcessById(receivingProcessId)

Get a receivingProcess by id

Returns the receivingProcess identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingProcessApi apiInstance = new ReceivingProcessApi();
Integer receivingProcessId = 56; // Integer | Id of the receivingProcess to be returned.
try {
    ReceivingProcess result = apiInstance.getReceivingProcessById(receivingProcessId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingProcessApi#getReceivingProcessById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receivingProcessId** | **Integer**| Id of the receivingProcess to be returned. |

### Return type

[**ReceivingProcess**](ReceivingProcess.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReceivingProcessFiles"></a>
# **getReceivingProcessFiles**
> getReceivingProcessFiles(receivingProcessId)

Get the files for a receivingProcess.

Get all existing receivingProcess files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingProcessApi apiInstance = new ReceivingProcessApi();
Integer receivingProcessId = 56; // Integer | Id of the receivingProcess to get files for
try {
    apiInstance.getReceivingProcessFiles(receivingProcessId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingProcessApi#getReceivingProcessFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receivingProcessId** | **Integer**| Id of the receivingProcess to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReceivingProcessTags"></a>
# **getReceivingProcessTags**
> getReceivingProcessTags(receivingProcessId)

Get the tags for a receivingProcess.

Get all existing receivingProcess tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingProcessApi apiInstance = new ReceivingProcessApi();
Integer receivingProcessId = 56; // Integer | Id of the receivingProcess to get tags for
try {
    apiInstance.getReceivingProcessTags(receivingProcessId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingProcessApi#getReceivingProcessTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receivingProcessId** | **Integer**| Id of the receivingProcess to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateReceivingProcessCustomFields"></a>
# **updateReceivingProcessCustomFields**
> updateReceivingProcessCustomFields(body)

Update a receivingProcess custom fields

Updates an existing receivingProcess custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingProcessApi apiInstance = new ReceivingProcessApi();
ReceivingProcess body = new ReceivingProcess(); // ReceivingProcess | ReceivingProcess to be updated.
try {
    apiInstance.updateReceivingProcessCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingProcessApi#updateReceivingProcessCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReceivingProcess**](ReceivingProcess.md)| ReceivingProcess to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

