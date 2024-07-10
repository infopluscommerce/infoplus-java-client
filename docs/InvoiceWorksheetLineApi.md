# InvoiceWorksheetLineApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInvoiceWorksheetLine**](InvoiceWorksheetLineApi.md#addInvoiceWorksheetLine) | **POST** /beta/invoiceWorksheetLine | Create an invoiceWorksheetLine
[**addInvoiceWorksheetLineAudit**](InvoiceWorksheetLineApi.md#addInvoiceWorksheetLineAudit) | **PUT** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/audit/{invoiceWorksheetLineAudit} | Add new audit for an invoiceWorksheetLine
[**addInvoiceWorksheetLineFile**](InvoiceWorksheetLineApi.md#addInvoiceWorksheetLineFile) | **POST** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/file/{fileName} | Attach a file to an invoiceWorksheetLine
[**addInvoiceWorksheetLineFileByURL**](InvoiceWorksheetLineApi.md#addInvoiceWorksheetLineFileByURL) | **POST** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/file | Attach a file to an invoiceWorksheetLine by URL.
[**addInvoiceWorksheetLineTag**](InvoiceWorksheetLineApi.md#addInvoiceWorksheetLineTag) | **PUT** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/tag/{invoiceWorksheetLineTag} | Add new tags for an invoiceWorksheetLine.
[**deleteInvoiceWorksheetLine**](InvoiceWorksheetLineApi.md#deleteInvoiceWorksheetLine) | **DELETE** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId} | Delete an invoiceWorksheetLine
[**deleteInvoiceWorksheetLineFile**](InvoiceWorksheetLineApi.md#deleteInvoiceWorksheetLineFile) | **DELETE** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/file/{fileId} | Delete a file for an invoiceWorksheetLine.
[**deleteInvoiceWorksheetLineTag**](InvoiceWorksheetLineApi.md#deleteInvoiceWorksheetLineTag) | **DELETE** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/tag/{invoiceWorksheetLineTag} | Delete a tag for an invoiceWorksheetLine.
[**getDuplicateInvoiceWorksheetLineById**](InvoiceWorksheetLineApi.md#getDuplicateInvoiceWorksheetLineById) | **GET** /beta/invoiceWorksheetLine/duplicate/{invoiceWorksheetLineId} | Get a duplicated an invoiceWorksheetLine by id
[**getInvoiceWorksheetLineByFilter**](InvoiceWorksheetLineApi.md#getInvoiceWorksheetLineByFilter) | **GET** /beta/invoiceWorksheetLine/search | Search invoiceWorksheetLines by filter
[**getInvoiceWorksheetLineById**](InvoiceWorksheetLineApi.md#getInvoiceWorksheetLineById) | **GET** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId} | Get an invoiceWorksheetLine by id
[**getInvoiceWorksheetLineFiles**](InvoiceWorksheetLineApi.md#getInvoiceWorksheetLineFiles) | **GET** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/file | Get the files for an invoiceWorksheetLine.
[**getInvoiceWorksheetLineTags**](InvoiceWorksheetLineApi.md#getInvoiceWorksheetLineTags) | **GET** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/tag | Get the tags for an invoiceWorksheetLine.
[**updateInvoiceWorksheetLine**](InvoiceWorksheetLineApi.md#updateInvoiceWorksheetLine) | **PUT** /beta/invoiceWorksheetLine | Update an invoiceWorksheetLine


<a name="addInvoiceWorksheetLine"></a>
# **addInvoiceWorksheetLine**
> InvoiceWorksheetLine addInvoiceWorksheetLine(body)

Create an invoiceWorksheetLine

Inserts a new invoiceWorksheetLine using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineApi apiInstance = new InvoiceWorksheetLineApi();
InvoiceWorksheetLine body = new InvoiceWorksheetLine(); // InvoiceWorksheetLine | InvoiceWorksheetLine to be inserted.
try {
    InvoiceWorksheetLine result = apiInstance.addInvoiceWorksheetLine(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineApi#addInvoiceWorksheetLine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InvoiceWorksheetLine**](InvoiceWorksheetLine.md)| InvoiceWorksheetLine to be inserted. |

### Return type

[**InvoiceWorksheetLine**](InvoiceWorksheetLine.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addInvoiceWorksheetLineAudit"></a>
# **addInvoiceWorksheetLineAudit**
> addInvoiceWorksheetLineAudit(invoiceWorksheetLineId, invoiceWorksheetLineAudit)

Add new audit for an invoiceWorksheetLine

Adds an audit to an existing invoiceWorksheetLine.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineApi apiInstance = new InvoiceWorksheetLineApi();
Integer invoiceWorksheetLineId = 56; // Integer | Id of the invoiceWorksheetLine to add an audit to
String invoiceWorksheetLineAudit = "invoiceWorksheetLineAudit_example"; // String | The audit to add
try {
    apiInstance.addInvoiceWorksheetLineAudit(invoiceWorksheetLineId, invoiceWorksheetLineAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineApi#addInvoiceWorksheetLineAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetLineId** | **Integer**| Id of the invoiceWorksheetLine to add an audit to |
 **invoiceWorksheetLineAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addInvoiceWorksheetLineFile"></a>
# **addInvoiceWorksheetLineFile**
> addInvoiceWorksheetLineFile(invoiceWorksheetLineId, fileName)

Attach a file to an invoiceWorksheetLine

Adds a file to an existing invoiceWorksheetLine.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineApi apiInstance = new InvoiceWorksheetLineApi();
Integer invoiceWorksheetLineId = 56; // Integer | Id of the invoiceWorksheetLine to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addInvoiceWorksheetLineFile(invoiceWorksheetLineId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineApi#addInvoiceWorksheetLineFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetLineId** | **Integer**| Id of the invoiceWorksheetLine to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addInvoiceWorksheetLineFileByURL"></a>
# **addInvoiceWorksheetLineFileByURL**
> addInvoiceWorksheetLineFileByURL(body, invoiceWorksheetLineId)

Attach a file to an invoiceWorksheetLine by URL.

Adds a file to an existing invoiceWorksheetLine by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineApi apiInstance = new InvoiceWorksheetLineApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer invoiceWorksheetLineId = 56; // Integer | Id of the invoiceWorksheetLine to add an file to
try {
    apiInstance.addInvoiceWorksheetLineFileByURL(body, invoiceWorksheetLineId);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineApi#addInvoiceWorksheetLineFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **invoiceWorksheetLineId** | **Integer**| Id of the invoiceWorksheetLine to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addInvoiceWorksheetLineTag"></a>
# **addInvoiceWorksheetLineTag**
> addInvoiceWorksheetLineTag(invoiceWorksheetLineId, invoiceWorksheetLineTag)

Add new tags for an invoiceWorksheetLine.

Adds a tag to an existing invoiceWorksheetLine.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineApi apiInstance = new InvoiceWorksheetLineApi();
Integer invoiceWorksheetLineId = 56; // Integer | Id of the invoiceWorksheetLine to add a tag to
String invoiceWorksheetLineTag = "invoiceWorksheetLineTag_example"; // String | The tag to add
try {
    apiInstance.addInvoiceWorksheetLineTag(invoiceWorksheetLineId, invoiceWorksheetLineTag);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineApi#addInvoiceWorksheetLineTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetLineId** | **Integer**| Id of the invoiceWorksheetLine to add a tag to |
 **invoiceWorksheetLineTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteInvoiceWorksheetLine"></a>
# **deleteInvoiceWorksheetLine**
> deleteInvoiceWorksheetLine(invoiceWorksheetLineId)

Delete an invoiceWorksheetLine

Deletes the invoiceWorksheetLine identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineApi apiInstance = new InvoiceWorksheetLineApi();
Integer invoiceWorksheetLineId = 56; // Integer | Id of the invoiceWorksheetLine to be deleted.
try {
    apiInstance.deleteInvoiceWorksheetLine(invoiceWorksheetLineId);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineApi#deleteInvoiceWorksheetLine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetLineId** | **Integer**| Id of the invoiceWorksheetLine to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteInvoiceWorksheetLineFile"></a>
# **deleteInvoiceWorksheetLineFile**
> deleteInvoiceWorksheetLineFile(invoiceWorksheetLineId, fileId)

Delete a file for an invoiceWorksheetLine.

Deletes an existing invoiceWorksheetLine file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineApi apiInstance = new InvoiceWorksheetLineApi();
Integer invoiceWorksheetLineId = 56; // Integer | Id of the invoiceWorksheetLine to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteInvoiceWorksheetLineFile(invoiceWorksheetLineId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineApi#deleteInvoiceWorksheetLineFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetLineId** | **Integer**| Id of the invoiceWorksheetLine to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteInvoiceWorksheetLineTag"></a>
# **deleteInvoiceWorksheetLineTag**
> deleteInvoiceWorksheetLineTag(invoiceWorksheetLineId, invoiceWorksheetLineTag)

Delete a tag for an invoiceWorksheetLine.

Deletes an existing invoiceWorksheetLine tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineApi apiInstance = new InvoiceWorksheetLineApi();
Integer invoiceWorksheetLineId = 56; // Integer | Id of the invoiceWorksheetLine to remove tag from
String invoiceWorksheetLineTag = "invoiceWorksheetLineTag_example"; // String | The tag to delete
try {
    apiInstance.deleteInvoiceWorksheetLineTag(invoiceWorksheetLineId, invoiceWorksheetLineTag);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineApi#deleteInvoiceWorksheetLineTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetLineId** | **Integer**| Id of the invoiceWorksheetLine to remove tag from |
 **invoiceWorksheetLineTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateInvoiceWorksheetLineById"></a>
# **getDuplicateInvoiceWorksheetLineById**
> InvoiceWorksheetLine getDuplicateInvoiceWorksheetLineById(invoiceWorksheetLineId)

Get a duplicated an invoiceWorksheetLine by id

Returns a duplicated invoiceWorksheetLine identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineApi apiInstance = new InvoiceWorksheetLineApi();
Integer invoiceWorksheetLineId = 56; // Integer | Id of the invoiceWorksheetLine to be duplicated.
try {
    InvoiceWorksheetLine result = apiInstance.getDuplicateInvoiceWorksheetLineById(invoiceWorksheetLineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineApi#getDuplicateInvoiceWorksheetLineById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetLineId** | **Integer**| Id of the invoiceWorksheetLine to be duplicated. |

### Return type

[**InvoiceWorksheetLine**](InvoiceWorksheetLine.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvoiceWorksheetLineByFilter"></a>
# **getInvoiceWorksheetLineByFilter**
> List&lt;InvoiceWorksheetLine&gt; getInvoiceWorksheetLineByFilter(filter, page, limit, sort)

Search invoiceWorksheetLines by filter

Returns the list of invoiceWorksheetLines that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineApi apiInstance = new InvoiceWorksheetLineApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<InvoiceWorksheetLine> result = apiInstance.getInvoiceWorksheetLineByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineApi#getInvoiceWorksheetLineByFilter");
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

[**List&lt;InvoiceWorksheetLine&gt;**](InvoiceWorksheetLine.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvoiceWorksheetLineById"></a>
# **getInvoiceWorksheetLineById**
> InvoiceWorksheetLine getInvoiceWorksheetLineById(invoiceWorksheetLineId)

Get an invoiceWorksheetLine by id

Returns the invoiceWorksheetLine identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineApi apiInstance = new InvoiceWorksheetLineApi();
Integer invoiceWorksheetLineId = 56; // Integer | Id of the invoiceWorksheetLine to be returned.
try {
    InvoiceWorksheetLine result = apiInstance.getInvoiceWorksheetLineById(invoiceWorksheetLineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineApi#getInvoiceWorksheetLineById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetLineId** | **Integer**| Id of the invoiceWorksheetLine to be returned. |

### Return type

[**InvoiceWorksheetLine**](InvoiceWorksheetLine.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvoiceWorksheetLineFiles"></a>
# **getInvoiceWorksheetLineFiles**
> getInvoiceWorksheetLineFiles(invoiceWorksheetLineId)

Get the files for an invoiceWorksheetLine.

Get all existing invoiceWorksheetLine files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineApi apiInstance = new InvoiceWorksheetLineApi();
Integer invoiceWorksheetLineId = 56; // Integer | Id of the invoiceWorksheetLine to get files for
try {
    apiInstance.getInvoiceWorksheetLineFiles(invoiceWorksheetLineId);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineApi#getInvoiceWorksheetLineFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetLineId** | **Integer**| Id of the invoiceWorksheetLine to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvoiceWorksheetLineTags"></a>
# **getInvoiceWorksheetLineTags**
> getInvoiceWorksheetLineTags(invoiceWorksheetLineId)

Get the tags for an invoiceWorksheetLine.

Get all existing invoiceWorksheetLine tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineApi apiInstance = new InvoiceWorksheetLineApi();
Integer invoiceWorksheetLineId = 56; // Integer | Id of the invoiceWorksheetLine to get tags for
try {
    apiInstance.getInvoiceWorksheetLineTags(invoiceWorksheetLineId);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineApi#getInvoiceWorksheetLineTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetLineId** | **Integer**| Id of the invoiceWorksheetLine to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateInvoiceWorksheetLine"></a>
# **updateInvoiceWorksheetLine**
> updateInvoiceWorksheetLine(body)

Update an invoiceWorksheetLine

Updates an existing invoiceWorksheetLine using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineApi apiInstance = new InvoiceWorksheetLineApi();
InvoiceWorksheetLine body = new InvoiceWorksheetLine(); // InvoiceWorksheetLine | InvoiceWorksheetLine to be updated.
try {
    apiInstance.updateInvoiceWorksheetLine(body);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineApi#updateInvoiceWorksheetLine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InvoiceWorksheetLine**](InvoiceWorksheetLine.md)| InvoiceWorksheetLine to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

