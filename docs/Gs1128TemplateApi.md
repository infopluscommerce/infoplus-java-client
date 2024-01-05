# Gs1128TemplateApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGs1128Template**](Gs1128TemplateApi.md#addGs1128Template) | **POST** /beta/gs1128Template | Create a gs1128Template
[**addGs1128TemplateAudit**](Gs1128TemplateApi.md#addGs1128TemplateAudit) | **PUT** /beta/gs1128Template/{gs1128TemplateId}/audit/{gs1128TemplateAudit} | Add new audit for a gs1128Template
[**addGs1128TemplateFile**](Gs1128TemplateApi.md#addGs1128TemplateFile) | **POST** /beta/gs1128Template/{gs1128TemplateId}/file/{fileName} | Attach a file to a gs1128Template
[**addGs1128TemplateFileByURL**](Gs1128TemplateApi.md#addGs1128TemplateFileByURL) | **POST** /beta/gs1128Template/{gs1128TemplateId}/file | Attach a file to a gs1128Template by URL.
[**addGs1128TemplateTag**](Gs1128TemplateApi.md#addGs1128TemplateTag) | **PUT** /beta/gs1128Template/{gs1128TemplateId}/tag/{gs1128TemplateTag} | Add new tags for a gs1128Template.
[**deleteGs1128Template**](Gs1128TemplateApi.md#deleteGs1128Template) | **DELETE** /beta/gs1128Template/{gs1128TemplateId} | Delete a gs1128Template
[**deleteGs1128TemplateFile**](Gs1128TemplateApi.md#deleteGs1128TemplateFile) | **DELETE** /beta/gs1128Template/{gs1128TemplateId}/file/{fileId} | Delete a file for a gs1128Template.
[**deleteGs1128TemplateTag**](Gs1128TemplateApi.md#deleteGs1128TemplateTag) | **DELETE** /beta/gs1128Template/{gs1128TemplateId}/tag/{gs1128TemplateTag} | Delete a tag for a gs1128Template.
[**getDuplicateGs1128TemplateById**](Gs1128TemplateApi.md#getDuplicateGs1128TemplateById) | **GET** /beta/gs1128Template/duplicate/{gs1128TemplateId} | Get a duplicated a gs1128Template by id
[**getGs1128TemplateByFilter**](Gs1128TemplateApi.md#getGs1128TemplateByFilter) | **GET** /beta/gs1128Template/search | Search gs1128Templates by filter
[**getGs1128TemplateById**](Gs1128TemplateApi.md#getGs1128TemplateById) | **GET** /beta/gs1128Template/{gs1128TemplateId} | Get a gs1128Template by id
[**getGs1128TemplateFiles**](Gs1128TemplateApi.md#getGs1128TemplateFiles) | **GET** /beta/gs1128Template/{gs1128TemplateId}/file | Get the files for a gs1128Template.
[**getGs1128TemplateTags**](Gs1128TemplateApi.md#getGs1128TemplateTags) | **GET** /beta/gs1128Template/{gs1128TemplateId}/tag | Get the tags for a gs1128Template.
[**updateGs1128Template**](Gs1128TemplateApi.md#updateGs1128Template) | **PUT** /beta/gs1128Template | Update a gs1128Template


<a name="addGs1128Template"></a>
# **addGs1128Template**
> Gs1128Template addGs1128Template(body)

Create a gs1128Template

Inserts a new gs1128Template using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128TemplateApi apiInstance = new Gs1128TemplateApi();
Gs1128Template body = new Gs1128Template(); // Gs1128Template | Gs1128Template to be inserted.
try {
    Gs1128Template result = apiInstance.addGs1128Template(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128TemplateApi#addGs1128Template");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Gs1128Template**](Gs1128Template.md)| Gs1128Template to be inserted. |

### Return type

[**Gs1128Template**](Gs1128Template.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addGs1128TemplateAudit"></a>
# **addGs1128TemplateAudit**
> addGs1128TemplateAudit(gs1128TemplateId, gs1128TemplateAudit)

Add new audit for a gs1128Template

Adds an audit to an existing gs1128Template.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128TemplateApi apiInstance = new Gs1128TemplateApi();
Integer gs1128TemplateId = 56; // Integer | Id of the gs1128Template to add an audit to
String gs1128TemplateAudit = "gs1128TemplateAudit_example"; // String | The audit to add
try {
    apiInstance.addGs1128TemplateAudit(gs1128TemplateId, gs1128TemplateAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128TemplateApi#addGs1128TemplateAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gs1128TemplateId** | **Integer**| Id of the gs1128Template to add an audit to |
 **gs1128TemplateAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addGs1128TemplateFile"></a>
# **addGs1128TemplateFile**
> addGs1128TemplateFile(gs1128TemplateId, fileName)

Attach a file to a gs1128Template

Adds a file to an existing gs1128Template.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128TemplateApi apiInstance = new Gs1128TemplateApi();
Integer gs1128TemplateId = 56; // Integer | Id of the gs1128Template to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addGs1128TemplateFile(gs1128TemplateId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128TemplateApi#addGs1128TemplateFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gs1128TemplateId** | **Integer**| Id of the gs1128Template to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addGs1128TemplateFileByURL"></a>
# **addGs1128TemplateFileByURL**
> addGs1128TemplateFileByURL(body, gs1128TemplateId)

Attach a file to a gs1128Template by URL.

Adds a file to an existing gs1128Template by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128TemplateApi apiInstance = new Gs1128TemplateApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer gs1128TemplateId = 56; // Integer | Id of the gs1128Template to add an file to
try {
    apiInstance.addGs1128TemplateFileByURL(body, gs1128TemplateId);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128TemplateApi#addGs1128TemplateFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **gs1128TemplateId** | **Integer**| Id of the gs1128Template to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addGs1128TemplateTag"></a>
# **addGs1128TemplateTag**
> addGs1128TemplateTag(gs1128TemplateId, gs1128TemplateTag)

Add new tags for a gs1128Template.

Adds a tag to an existing gs1128Template.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128TemplateApi apiInstance = new Gs1128TemplateApi();
Integer gs1128TemplateId = 56; // Integer | Id of the gs1128Template to add a tag to
String gs1128TemplateTag = "gs1128TemplateTag_example"; // String | The tag to add
try {
    apiInstance.addGs1128TemplateTag(gs1128TemplateId, gs1128TemplateTag);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128TemplateApi#addGs1128TemplateTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gs1128TemplateId** | **Integer**| Id of the gs1128Template to add a tag to |
 **gs1128TemplateTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGs1128Template"></a>
# **deleteGs1128Template**
> deleteGs1128Template(gs1128TemplateId)

Delete a gs1128Template

Deletes the gs1128Template identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128TemplateApi apiInstance = new Gs1128TemplateApi();
Integer gs1128TemplateId = 56; // Integer | Id of the gs1128Template to be deleted.
try {
    apiInstance.deleteGs1128Template(gs1128TemplateId);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128TemplateApi#deleteGs1128Template");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gs1128TemplateId** | **Integer**| Id of the gs1128Template to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteGs1128TemplateFile"></a>
# **deleteGs1128TemplateFile**
> deleteGs1128TemplateFile(gs1128TemplateId, fileId)

Delete a file for a gs1128Template.

Deletes an existing gs1128Template file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128TemplateApi apiInstance = new Gs1128TemplateApi();
Integer gs1128TemplateId = 56; // Integer | Id of the gs1128Template to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteGs1128TemplateFile(gs1128TemplateId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128TemplateApi#deleteGs1128TemplateFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gs1128TemplateId** | **Integer**| Id of the gs1128Template to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteGs1128TemplateTag"></a>
# **deleteGs1128TemplateTag**
> deleteGs1128TemplateTag(gs1128TemplateId, gs1128TemplateTag)

Delete a tag for a gs1128Template.

Deletes an existing gs1128Template tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128TemplateApi apiInstance = new Gs1128TemplateApi();
Integer gs1128TemplateId = 56; // Integer | Id of the gs1128Template to remove tag from
String gs1128TemplateTag = "gs1128TemplateTag_example"; // String | The tag to delete
try {
    apiInstance.deleteGs1128TemplateTag(gs1128TemplateId, gs1128TemplateTag);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128TemplateApi#deleteGs1128TemplateTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gs1128TemplateId** | **Integer**| Id of the gs1128Template to remove tag from |
 **gs1128TemplateTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateGs1128TemplateById"></a>
# **getDuplicateGs1128TemplateById**
> Gs1128Template getDuplicateGs1128TemplateById(gs1128TemplateId)

Get a duplicated a gs1128Template by id

Returns a duplicated gs1128Template identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128TemplateApi apiInstance = new Gs1128TemplateApi();
Integer gs1128TemplateId = 56; // Integer | Id of the gs1128Template to be duplicated.
try {
    Gs1128Template result = apiInstance.getDuplicateGs1128TemplateById(gs1128TemplateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128TemplateApi#getDuplicateGs1128TemplateById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gs1128TemplateId** | **Integer**| Id of the gs1128Template to be duplicated. |

### Return type

[**Gs1128Template**](Gs1128Template.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGs1128TemplateByFilter"></a>
# **getGs1128TemplateByFilter**
> List&lt;Gs1128Template&gt; getGs1128TemplateByFilter(filter, page, limit, sort)

Search gs1128Templates by filter

Returns the list of gs1128Templates that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128TemplateApi apiInstance = new Gs1128TemplateApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Gs1128Template> result = apiInstance.getGs1128TemplateByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128TemplateApi#getGs1128TemplateByFilter");
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

[**List&lt;Gs1128Template&gt;**](Gs1128Template.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGs1128TemplateById"></a>
# **getGs1128TemplateById**
> Gs1128Template getGs1128TemplateById(gs1128TemplateId)

Get a gs1128Template by id

Returns the gs1128Template identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128TemplateApi apiInstance = new Gs1128TemplateApi();
Integer gs1128TemplateId = 56; // Integer | Id of the gs1128Template to be returned.
try {
    Gs1128Template result = apiInstance.getGs1128TemplateById(gs1128TemplateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128TemplateApi#getGs1128TemplateById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gs1128TemplateId** | **Integer**| Id of the gs1128Template to be returned. |

### Return type

[**Gs1128Template**](Gs1128Template.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGs1128TemplateFiles"></a>
# **getGs1128TemplateFiles**
> getGs1128TemplateFiles(gs1128TemplateId)

Get the files for a gs1128Template.

Get all existing gs1128Template files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128TemplateApi apiInstance = new Gs1128TemplateApi();
Integer gs1128TemplateId = 56; // Integer | Id of the gs1128Template to get files for
try {
    apiInstance.getGs1128TemplateFiles(gs1128TemplateId);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128TemplateApi#getGs1128TemplateFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gs1128TemplateId** | **Integer**| Id of the gs1128Template to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGs1128TemplateTags"></a>
# **getGs1128TemplateTags**
> getGs1128TemplateTags(gs1128TemplateId)

Get the tags for a gs1128Template.

Get all existing gs1128Template tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128TemplateApi apiInstance = new Gs1128TemplateApi();
Integer gs1128TemplateId = 56; // Integer | Id of the gs1128Template to get tags for
try {
    apiInstance.getGs1128TemplateTags(gs1128TemplateId);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128TemplateApi#getGs1128TemplateTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gs1128TemplateId** | **Integer**| Id of the gs1128Template to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateGs1128Template"></a>
# **updateGs1128Template**
> updateGs1128Template(body)

Update a gs1128Template

Updates an existing gs1128Template using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128TemplateApi apiInstance = new Gs1128TemplateApi();
Gs1128Template body = new Gs1128Template(); // Gs1128Template | Gs1128Template to be updated.
try {
    apiInstance.updateGs1128Template(body);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128TemplateApi#updateGs1128Template");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Gs1128Template**](Gs1128Template.md)| Gs1128Template to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

