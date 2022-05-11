# InvoiceWorksheetApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInvoiceWorksheet**](InvoiceWorksheetApi.md#addInvoiceWorksheet) | **POST** /v3.0/invoiceWorksheet | Create an invoiceWorksheet
[**addInvoiceWorksheetAudit**](InvoiceWorksheetApi.md#addInvoiceWorksheetAudit) | **PUT** /v3.0/invoiceWorksheet/{invoiceWorksheetId}/audit/{invoiceWorksheetAudit} | Add new audit for an invoiceWorksheet
[**addInvoiceWorksheetFile**](InvoiceWorksheetApi.md#addInvoiceWorksheetFile) | **POST** /v3.0/invoiceWorksheet/{invoiceWorksheetId}/file/{fileName} | Attach a file to an invoiceWorksheet
[**addInvoiceWorksheetFileByURL**](InvoiceWorksheetApi.md#addInvoiceWorksheetFileByURL) | **POST** /v3.0/invoiceWorksheet/{invoiceWorksheetId}/file | Attach a file to an invoiceWorksheet by URL.
[**addInvoiceWorksheetTag**](InvoiceWorksheetApi.md#addInvoiceWorksheetTag) | **PUT** /v3.0/invoiceWorksheet/{invoiceWorksheetId}/tag/{invoiceWorksheetTag} | Add new tags for an invoiceWorksheet.
[**deleteInvoiceWorksheet**](InvoiceWorksheetApi.md#deleteInvoiceWorksheet) | **DELETE** /v3.0/invoiceWorksheet/{invoiceWorksheetId} | Delete an invoiceWorksheet
[**deleteInvoiceWorksheetFile**](InvoiceWorksheetApi.md#deleteInvoiceWorksheetFile) | **DELETE** /v3.0/invoiceWorksheet/{invoiceWorksheetId}/file/{fileId} | Delete a file for an invoiceWorksheet.
[**deleteInvoiceWorksheetTag**](InvoiceWorksheetApi.md#deleteInvoiceWorksheetTag) | **DELETE** /v3.0/invoiceWorksheet/{invoiceWorksheetId}/tag/{invoiceWorksheetTag} | Delete a tag for an invoiceWorksheet.
[**getDuplicateInvoiceWorksheetById**](InvoiceWorksheetApi.md#getDuplicateInvoiceWorksheetById) | **GET** /v3.0/invoiceWorksheet/duplicate/{invoiceWorksheetId} | Get a duplicated an invoiceWorksheet by id
[**getInvoiceWorksheetByFilter**](InvoiceWorksheetApi.md#getInvoiceWorksheetByFilter) | **GET** /v3.0/invoiceWorksheet/search | Search invoiceWorksheets by filter
[**getInvoiceWorksheetById**](InvoiceWorksheetApi.md#getInvoiceWorksheetById) | **GET** /v3.0/invoiceWorksheet/{invoiceWorksheetId} | Get an invoiceWorksheet by id
[**getInvoiceWorksheetFiles**](InvoiceWorksheetApi.md#getInvoiceWorksheetFiles) | **GET** /v3.0/invoiceWorksheet/{invoiceWorksheetId}/file | Get the files for an invoiceWorksheet.
[**getInvoiceWorksheetTags**](InvoiceWorksheetApi.md#getInvoiceWorksheetTags) | **GET** /v3.0/invoiceWorksheet/{invoiceWorksheetId}/tag | Get the tags for an invoiceWorksheet.
[**updateInvoiceWorksheet**](InvoiceWorksheetApi.md#updateInvoiceWorksheet) | **PUT** /v3.0/invoiceWorksheet | Update an invoiceWorksheet


<a name="addInvoiceWorksheet"></a>
# **addInvoiceWorksheet**
> InvoiceWorksheet addInvoiceWorksheet(body)

Create an invoiceWorksheet

Inserts a new invoiceWorksheet using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetApi apiInstance = new InvoiceWorksheetApi();
InvoiceWorksheet body = new InvoiceWorksheet(); // InvoiceWorksheet | InvoiceWorksheet to be inserted.
try {
    InvoiceWorksheet result = apiInstance.addInvoiceWorksheet(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetApi#addInvoiceWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InvoiceWorksheet**](InvoiceWorksheet.md)| InvoiceWorksheet to be inserted. |

### Return type

[**InvoiceWorksheet**](InvoiceWorksheet.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addInvoiceWorksheetAudit"></a>
# **addInvoiceWorksheetAudit**
> addInvoiceWorksheetAudit(invoiceWorksheetId, invoiceWorksheetAudit)

Add new audit for an invoiceWorksheet

Adds an audit to an existing invoiceWorksheet.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetApi apiInstance = new InvoiceWorksheetApi();
Integer invoiceWorksheetId = 56; // Integer | Id of the invoiceWorksheet to add an audit to
String invoiceWorksheetAudit = "invoiceWorksheetAudit_example"; // String | The audit to add
try {
    apiInstance.addInvoiceWorksheetAudit(invoiceWorksheetId, invoiceWorksheetAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetApi#addInvoiceWorksheetAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetId** | **Integer**| Id of the invoiceWorksheet to add an audit to |
 **invoiceWorksheetAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addInvoiceWorksheetFile"></a>
# **addInvoiceWorksheetFile**
> addInvoiceWorksheetFile(invoiceWorksheetId, fileName)

Attach a file to an invoiceWorksheet

Adds a file to an existing invoiceWorksheet.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetApi apiInstance = new InvoiceWorksheetApi();
Integer invoiceWorksheetId = 56; // Integer | Id of the invoiceWorksheet to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addInvoiceWorksheetFile(invoiceWorksheetId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetApi#addInvoiceWorksheetFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetId** | **Integer**| Id of the invoiceWorksheet to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addInvoiceWorksheetFileByURL"></a>
# **addInvoiceWorksheetFileByURL**
> addInvoiceWorksheetFileByURL(body, invoiceWorksheetId)

Attach a file to an invoiceWorksheet by URL.

Adds a file to an existing invoiceWorksheet by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetApi apiInstance = new InvoiceWorksheetApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer invoiceWorksheetId = 56; // Integer | Id of the invoiceWorksheet to add an file to
try {
    apiInstance.addInvoiceWorksheetFileByURL(body, invoiceWorksheetId);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetApi#addInvoiceWorksheetFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **invoiceWorksheetId** | **Integer**| Id of the invoiceWorksheet to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addInvoiceWorksheetTag"></a>
# **addInvoiceWorksheetTag**
> addInvoiceWorksheetTag(invoiceWorksheetId, invoiceWorksheetTag)

Add new tags for an invoiceWorksheet.

Adds a tag to an existing invoiceWorksheet.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetApi apiInstance = new InvoiceWorksheetApi();
Integer invoiceWorksheetId = 56; // Integer | Id of the invoiceWorksheet to add a tag to
String invoiceWorksheetTag = "invoiceWorksheetTag_example"; // String | The tag to add
try {
    apiInstance.addInvoiceWorksheetTag(invoiceWorksheetId, invoiceWorksheetTag);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetApi#addInvoiceWorksheetTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetId** | **Integer**| Id of the invoiceWorksheet to add a tag to |
 **invoiceWorksheetTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteInvoiceWorksheet"></a>
# **deleteInvoiceWorksheet**
> deleteInvoiceWorksheet(invoiceWorksheetId)

Delete an invoiceWorksheet

Deletes the invoiceWorksheet identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetApi apiInstance = new InvoiceWorksheetApi();
Integer invoiceWorksheetId = 56; // Integer | Id of the invoiceWorksheet to be deleted.
try {
    apiInstance.deleteInvoiceWorksheet(invoiceWorksheetId);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetApi#deleteInvoiceWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetId** | **Integer**| Id of the invoiceWorksheet to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteInvoiceWorksheetFile"></a>
# **deleteInvoiceWorksheetFile**
> deleteInvoiceWorksheetFile(invoiceWorksheetId, fileId)

Delete a file for an invoiceWorksheet.

Deletes an existing invoiceWorksheet file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetApi apiInstance = new InvoiceWorksheetApi();
Integer invoiceWorksheetId = 56; // Integer | Id of the invoiceWorksheet to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteInvoiceWorksheetFile(invoiceWorksheetId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetApi#deleteInvoiceWorksheetFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetId** | **Integer**| Id of the invoiceWorksheet to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteInvoiceWorksheetTag"></a>
# **deleteInvoiceWorksheetTag**
> deleteInvoiceWorksheetTag(invoiceWorksheetId, invoiceWorksheetTag)

Delete a tag for an invoiceWorksheet.

Deletes an existing invoiceWorksheet tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetApi apiInstance = new InvoiceWorksheetApi();
Integer invoiceWorksheetId = 56; // Integer | Id of the invoiceWorksheet to remove tag from
String invoiceWorksheetTag = "invoiceWorksheetTag_example"; // String | The tag to delete
try {
    apiInstance.deleteInvoiceWorksheetTag(invoiceWorksheetId, invoiceWorksheetTag);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetApi#deleteInvoiceWorksheetTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetId** | **Integer**| Id of the invoiceWorksheet to remove tag from |
 **invoiceWorksheetTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateInvoiceWorksheetById"></a>
# **getDuplicateInvoiceWorksheetById**
> InvoiceWorksheet getDuplicateInvoiceWorksheetById(invoiceWorksheetId)

Get a duplicated an invoiceWorksheet by id

Returns a duplicated invoiceWorksheet identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetApi apiInstance = new InvoiceWorksheetApi();
Integer invoiceWorksheetId = 56; // Integer | Id of the invoiceWorksheet to be duplicated.
try {
    InvoiceWorksheet result = apiInstance.getDuplicateInvoiceWorksheetById(invoiceWorksheetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetApi#getDuplicateInvoiceWorksheetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetId** | **Integer**| Id of the invoiceWorksheet to be duplicated. |

### Return type

[**InvoiceWorksheet**](InvoiceWorksheet.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvoiceWorksheetByFilter"></a>
# **getInvoiceWorksheetByFilter**
> List&lt;InvoiceWorksheet&gt; getInvoiceWorksheetByFilter(filter, page, limit, sort)

Search invoiceWorksheets by filter

Returns the list of invoiceWorksheets that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetApi apiInstance = new InvoiceWorksheetApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<InvoiceWorksheet> result = apiInstance.getInvoiceWorksheetByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetApi#getInvoiceWorksheetByFilter");
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

[**List&lt;InvoiceWorksheet&gt;**](InvoiceWorksheet.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvoiceWorksheetById"></a>
# **getInvoiceWorksheetById**
> InvoiceWorksheet getInvoiceWorksheetById(invoiceWorksheetId)

Get an invoiceWorksheet by id

Returns the invoiceWorksheet identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetApi apiInstance = new InvoiceWorksheetApi();
Integer invoiceWorksheetId = 56; // Integer | Id of the invoiceWorksheet to be returned.
try {
    InvoiceWorksheet result = apiInstance.getInvoiceWorksheetById(invoiceWorksheetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetApi#getInvoiceWorksheetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetId** | **Integer**| Id of the invoiceWorksheet to be returned. |

### Return type

[**InvoiceWorksheet**](InvoiceWorksheet.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvoiceWorksheetFiles"></a>
# **getInvoiceWorksheetFiles**
> getInvoiceWorksheetFiles(invoiceWorksheetId)

Get the files for an invoiceWorksheet.

Get all existing invoiceWorksheet files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetApi apiInstance = new InvoiceWorksheetApi();
Integer invoiceWorksheetId = 56; // Integer | Id of the invoiceWorksheet to get files for
try {
    apiInstance.getInvoiceWorksheetFiles(invoiceWorksheetId);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetApi#getInvoiceWorksheetFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetId** | **Integer**| Id of the invoiceWorksheet to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvoiceWorksheetTags"></a>
# **getInvoiceWorksheetTags**
> getInvoiceWorksheetTags(invoiceWorksheetId)

Get the tags for an invoiceWorksheet.

Get all existing invoiceWorksheet tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetApi apiInstance = new InvoiceWorksheetApi();
Integer invoiceWorksheetId = 56; // Integer | Id of the invoiceWorksheet to get tags for
try {
    apiInstance.getInvoiceWorksheetTags(invoiceWorksheetId);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetApi#getInvoiceWorksheetTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetId** | **Integer**| Id of the invoiceWorksheet to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateInvoiceWorksheet"></a>
# **updateInvoiceWorksheet**
> updateInvoiceWorksheet(body)

Update an invoiceWorksheet

Updates an existing invoiceWorksheet using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetApi apiInstance = new InvoiceWorksheetApi();
InvoiceWorksheet body = new InvoiceWorksheet(); // InvoiceWorksheet | InvoiceWorksheet to be updated.
try {
    apiInstance.updateInvoiceWorksheet(body);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetApi#updateInvoiceWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InvoiceWorksheet**](InvoiceWorksheet.md)| InvoiceWorksheet to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

