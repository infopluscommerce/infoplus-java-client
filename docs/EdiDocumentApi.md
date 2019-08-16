# EdiDocumentApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEdiDocument**](EdiDocumentApi.md#addEdiDocument) | **POST** /beta/ediDocument | Create an ediDocument
[**addEdiDocumentAudit**](EdiDocumentApi.md#addEdiDocumentAudit) | **PUT** /beta/ediDocument/{ediDocumentId}/audit/{ediDocumentAudit} | Add new audit for an ediDocument
[**addEdiDocumentFile**](EdiDocumentApi.md#addEdiDocumentFile) | **POST** /beta/ediDocument/{ediDocumentId}/file/{fileName} | Attach a file to an ediDocument
[**addEdiDocumentTag**](EdiDocumentApi.md#addEdiDocumentTag) | **PUT** /beta/ediDocument/{ediDocumentId}/tag/{ediDocumentTag} | Add new tags for an ediDocument.
[**deleteEdiDocumentTag**](EdiDocumentApi.md#deleteEdiDocumentTag) | **DELETE** /beta/ediDocument/{ediDocumentId}/tag/{ediDocumentTag} | Delete a tag for an ediDocument.
[**getDuplicateEdiDocumentById**](EdiDocumentApi.md#getDuplicateEdiDocumentById) | **GET** /beta/ediDocument/duplicate/{ediDocumentId} | Get a duplicated an ediDocument by id
[**getEdiDocumentByFilter**](EdiDocumentApi.md#getEdiDocumentByFilter) | **GET** /beta/ediDocument/search | Search ediDocuments by filter
[**getEdiDocumentById**](EdiDocumentApi.md#getEdiDocumentById) | **GET** /beta/ediDocument/{ediDocumentId} | Get an ediDocument by id
[**getEdiDocumentTags**](EdiDocumentApi.md#getEdiDocumentTags) | **GET** /beta/ediDocument/{ediDocumentId}/tag | Get the tags for an ediDocument.


<a name="addEdiDocument"></a>
# **addEdiDocument**
> EdiDocument addEdiDocument(body)

Create an ediDocument

Inserts a new ediDocument using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EdiDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EdiDocumentApi apiInstance = new EdiDocumentApi();
EdiDocument body = new EdiDocument(); // EdiDocument | EdiDocument to be inserted.
try {
    EdiDocument result = apiInstance.addEdiDocument(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EdiDocumentApi#addEdiDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EdiDocument**](EdiDocument.md)| EdiDocument to be inserted. |

### Return type

[**EdiDocument**](EdiDocument.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addEdiDocumentAudit"></a>
# **addEdiDocumentAudit**
> addEdiDocumentAudit(ediDocumentId, ediDocumentAudit)

Add new audit for an ediDocument

Adds an audit to an existing ediDocument.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EdiDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EdiDocumentApi apiInstance = new EdiDocumentApi();
Integer ediDocumentId = 56; // Integer | Id of the ediDocument to add an audit to
String ediDocumentAudit = "ediDocumentAudit_example"; // String | The audit to add
try {
    apiInstance.addEdiDocumentAudit(ediDocumentId, ediDocumentAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling EdiDocumentApi#addEdiDocumentAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ediDocumentId** | **Integer**| Id of the ediDocument to add an audit to |
 **ediDocumentAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addEdiDocumentFile"></a>
# **addEdiDocumentFile**
> addEdiDocumentFile(ediDocumentId, fileName)

Attach a file to an ediDocument

Adds a file to an existing ediDocument.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EdiDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EdiDocumentApi apiInstance = new EdiDocumentApi();
Integer ediDocumentId = 56; // Integer | Id of the ediDocument to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addEdiDocumentFile(ediDocumentId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling EdiDocumentApi#addEdiDocumentFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ediDocumentId** | **Integer**| Id of the ediDocument to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addEdiDocumentTag"></a>
# **addEdiDocumentTag**
> addEdiDocumentTag(ediDocumentId, ediDocumentTag)

Add new tags for an ediDocument.

Adds a tag to an existing ediDocument.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EdiDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EdiDocumentApi apiInstance = new EdiDocumentApi();
Integer ediDocumentId = 56; // Integer | Id of the ediDocument to add a tag to
String ediDocumentTag = "ediDocumentTag_example"; // String | The tag to add
try {
    apiInstance.addEdiDocumentTag(ediDocumentId, ediDocumentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling EdiDocumentApi#addEdiDocumentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ediDocumentId** | **Integer**| Id of the ediDocument to add a tag to |
 **ediDocumentTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEdiDocumentTag"></a>
# **deleteEdiDocumentTag**
> deleteEdiDocumentTag(ediDocumentId, ediDocumentTag)

Delete a tag for an ediDocument.

Deletes an existing ediDocument tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EdiDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EdiDocumentApi apiInstance = new EdiDocumentApi();
Integer ediDocumentId = 56; // Integer | Id of the ediDocument to remove tag from
String ediDocumentTag = "ediDocumentTag_example"; // String | The tag to delete
try {
    apiInstance.deleteEdiDocumentTag(ediDocumentId, ediDocumentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling EdiDocumentApi#deleteEdiDocumentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ediDocumentId** | **Integer**| Id of the ediDocument to remove tag from |
 **ediDocumentTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateEdiDocumentById"></a>
# **getDuplicateEdiDocumentById**
> EdiDocument getDuplicateEdiDocumentById(ediDocumentId)

Get a duplicated an ediDocument by id

Returns a duplicated ediDocument identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EdiDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EdiDocumentApi apiInstance = new EdiDocumentApi();
Integer ediDocumentId = 56; // Integer | Id of the ediDocument to be duplicated.
try {
    EdiDocument result = apiInstance.getDuplicateEdiDocumentById(ediDocumentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EdiDocumentApi#getDuplicateEdiDocumentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ediDocumentId** | **Integer**| Id of the ediDocument to be duplicated. |

### Return type

[**EdiDocument**](EdiDocument.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEdiDocumentByFilter"></a>
# **getEdiDocumentByFilter**
> List&lt;EdiDocument&gt; getEdiDocumentByFilter(filter, page, limit, sort)

Search ediDocuments by filter

Returns the list of ediDocuments that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EdiDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EdiDocumentApi apiInstance = new EdiDocumentApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<EdiDocument> result = apiInstance.getEdiDocumentByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EdiDocumentApi#getEdiDocumentByFilter");
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

[**List&lt;EdiDocument&gt;**](EdiDocument.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEdiDocumentById"></a>
# **getEdiDocumentById**
> EdiDocument getEdiDocumentById(ediDocumentId)

Get an ediDocument by id

Returns the ediDocument identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EdiDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EdiDocumentApi apiInstance = new EdiDocumentApi();
Integer ediDocumentId = 56; // Integer | Id of the ediDocument to be returned.
try {
    EdiDocument result = apiInstance.getEdiDocumentById(ediDocumentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EdiDocumentApi#getEdiDocumentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ediDocumentId** | **Integer**| Id of the ediDocument to be returned. |

### Return type

[**EdiDocument**](EdiDocument.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEdiDocumentTags"></a>
# **getEdiDocumentTags**
> getEdiDocumentTags(ediDocumentId)

Get the tags for an ediDocument.

Get all existing ediDocument tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EdiDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EdiDocumentApi apiInstance = new EdiDocumentApi();
Integer ediDocumentId = 56; // Integer | Id of the ediDocument to get tags for
try {
    apiInstance.getEdiDocumentTags(ediDocumentId);
} catch (ApiException e) {
    System.err.println("Exception when calling EdiDocumentApi#getEdiDocumentTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ediDocumentId** | **Integer**| Id of the ediDocument to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

