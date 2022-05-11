# ReceivingWorksheetApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addReceivingWorksheet**](ReceivingWorksheetApi.md#addReceivingWorksheet) | **POST** /v3.0/receivingWorksheet | Create a receivingWorksheet
[**addReceivingWorksheetAudit**](ReceivingWorksheetApi.md#addReceivingWorksheetAudit) | **PUT** /v3.0/receivingWorksheet/{receivingWorksheetId}/audit/{receivingWorksheetAudit} | Add new audit for a receivingWorksheet
[**addReceivingWorksheetFile**](ReceivingWorksheetApi.md#addReceivingWorksheetFile) | **POST** /v3.0/receivingWorksheet/{receivingWorksheetId}/file/{fileName} | Attach a file to a receivingWorksheet
[**addReceivingWorksheetFileByURL**](ReceivingWorksheetApi.md#addReceivingWorksheetFileByURL) | **POST** /v3.0/receivingWorksheet/{receivingWorksheetId}/file | Attach a file to a receivingWorksheet by URL.
[**addReceivingWorksheetTag**](ReceivingWorksheetApi.md#addReceivingWorksheetTag) | **PUT** /v3.0/receivingWorksheet/{receivingWorksheetId}/tag/{receivingWorksheetTag} | Add new tags for a receivingWorksheet.
[**deleteReceivingWorksheet**](ReceivingWorksheetApi.md#deleteReceivingWorksheet) | **DELETE** /v3.0/receivingWorksheet/{receivingWorksheetId} | Delete a receivingWorksheet
[**deleteReceivingWorksheetFile**](ReceivingWorksheetApi.md#deleteReceivingWorksheetFile) | **DELETE** /v3.0/receivingWorksheet/{receivingWorksheetId}/file/{fileId} | Delete a file for a receivingWorksheet.
[**deleteReceivingWorksheetTag**](ReceivingWorksheetApi.md#deleteReceivingWorksheetTag) | **DELETE** /v3.0/receivingWorksheet/{receivingWorksheetId}/tag/{receivingWorksheetTag} | Delete a tag for a receivingWorksheet.
[**getDuplicateReceivingWorksheetById**](ReceivingWorksheetApi.md#getDuplicateReceivingWorksheetById) | **GET** /v3.0/receivingWorksheet/duplicate/{receivingWorksheetId} | Get a duplicated a receivingWorksheet by id
[**getReceivingWorksheetByFilter**](ReceivingWorksheetApi.md#getReceivingWorksheetByFilter) | **GET** /v3.0/receivingWorksheet/search | Search receivingWorksheets by filter
[**getReceivingWorksheetById**](ReceivingWorksheetApi.md#getReceivingWorksheetById) | **GET** /v3.0/receivingWorksheet/{receivingWorksheetId} | Get a receivingWorksheet by id
[**getReceivingWorksheetFiles**](ReceivingWorksheetApi.md#getReceivingWorksheetFiles) | **GET** /v3.0/receivingWorksheet/{receivingWorksheetId}/file | Get the files for a receivingWorksheet.
[**getReceivingWorksheetTags**](ReceivingWorksheetApi.md#getReceivingWorksheetTags) | **GET** /v3.0/receivingWorksheet/{receivingWorksheetId}/tag | Get the tags for a receivingWorksheet.
[**updateReceivingWorksheet**](ReceivingWorksheetApi.md#updateReceivingWorksheet) | **PUT** /v3.0/receivingWorksheet | Update a receivingWorksheet
[**updateReceivingWorksheetCustomFields**](ReceivingWorksheetApi.md#updateReceivingWorksheetCustomFields) | **PUT** /v3.0/receivingWorksheet/customFields | Update a receivingWorksheet custom fields


<a name="addReceivingWorksheet"></a>
# **addReceivingWorksheet**
> ReceivingWorksheet addReceivingWorksheet(body)

Create a receivingWorksheet

Inserts a new receivingWorksheet using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingWorksheetApi apiInstance = new ReceivingWorksheetApi();
ReceivingWorksheet body = new ReceivingWorksheet(); // ReceivingWorksheet | ReceivingWorksheet to be inserted.
try {
    ReceivingWorksheet result = apiInstance.addReceivingWorksheet(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingWorksheetApi#addReceivingWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReceivingWorksheet**](ReceivingWorksheet.md)| ReceivingWorksheet to be inserted. |

### Return type

[**ReceivingWorksheet**](ReceivingWorksheet.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addReceivingWorksheetAudit"></a>
# **addReceivingWorksheetAudit**
> addReceivingWorksheetAudit(receivingWorksheetId, receivingWorksheetAudit)

Add new audit for a receivingWorksheet

Adds an audit to an existing receivingWorksheet.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingWorksheetApi apiInstance = new ReceivingWorksheetApi();
Integer receivingWorksheetId = 56; // Integer | Id of the receivingWorksheet to add an audit to
String receivingWorksheetAudit = "receivingWorksheetAudit_example"; // String | The audit to add
try {
    apiInstance.addReceivingWorksheetAudit(receivingWorksheetId, receivingWorksheetAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingWorksheetApi#addReceivingWorksheetAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receivingWorksheetId** | **Integer**| Id of the receivingWorksheet to add an audit to |
 **receivingWorksheetAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addReceivingWorksheetFile"></a>
# **addReceivingWorksheetFile**
> addReceivingWorksheetFile(receivingWorksheetId, fileName)

Attach a file to a receivingWorksheet

Adds a file to an existing receivingWorksheet.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingWorksheetApi apiInstance = new ReceivingWorksheetApi();
Integer receivingWorksheetId = 56; // Integer | Id of the receivingWorksheet to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addReceivingWorksheetFile(receivingWorksheetId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingWorksheetApi#addReceivingWorksheetFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receivingWorksheetId** | **Integer**| Id of the receivingWorksheet to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addReceivingWorksheetFileByURL"></a>
# **addReceivingWorksheetFileByURL**
> addReceivingWorksheetFileByURL(body, receivingWorksheetId)

Attach a file to a receivingWorksheet by URL.

Adds a file to an existing receivingWorksheet by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingWorksheetApi apiInstance = new ReceivingWorksheetApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer receivingWorksheetId = 56; // Integer | Id of the receivingWorksheet to add an file to
try {
    apiInstance.addReceivingWorksheetFileByURL(body, receivingWorksheetId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingWorksheetApi#addReceivingWorksheetFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **receivingWorksheetId** | **Integer**| Id of the receivingWorksheet to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addReceivingWorksheetTag"></a>
# **addReceivingWorksheetTag**
> addReceivingWorksheetTag(receivingWorksheetId, receivingWorksheetTag)

Add new tags for a receivingWorksheet.

Adds a tag to an existing receivingWorksheet.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingWorksheetApi apiInstance = new ReceivingWorksheetApi();
Integer receivingWorksheetId = 56; // Integer | Id of the receivingWorksheet to add a tag to
String receivingWorksheetTag = "receivingWorksheetTag_example"; // String | The tag to add
try {
    apiInstance.addReceivingWorksheetTag(receivingWorksheetId, receivingWorksheetTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingWorksheetApi#addReceivingWorksheetTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receivingWorksheetId** | **Integer**| Id of the receivingWorksheet to add a tag to |
 **receivingWorksheetTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReceivingWorksheet"></a>
# **deleteReceivingWorksheet**
> deleteReceivingWorksheet(receivingWorksheetId)

Delete a receivingWorksheet

Deletes the receivingWorksheet identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingWorksheetApi apiInstance = new ReceivingWorksheetApi();
Integer receivingWorksheetId = 56; // Integer | Id of the receivingWorksheet to be deleted.
try {
    apiInstance.deleteReceivingWorksheet(receivingWorksheetId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingWorksheetApi#deleteReceivingWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receivingWorksheetId** | **Integer**| Id of the receivingWorksheet to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteReceivingWorksheetFile"></a>
# **deleteReceivingWorksheetFile**
> deleteReceivingWorksheetFile(receivingWorksheetId, fileId)

Delete a file for a receivingWorksheet.

Deletes an existing receivingWorksheet file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingWorksheetApi apiInstance = new ReceivingWorksheetApi();
Integer receivingWorksheetId = 56; // Integer | Id of the receivingWorksheet to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteReceivingWorksheetFile(receivingWorksheetId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingWorksheetApi#deleteReceivingWorksheetFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receivingWorksheetId** | **Integer**| Id of the receivingWorksheet to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteReceivingWorksheetTag"></a>
# **deleteReceivingWorksheetTag**
> deleteReceivingWorksheetTag(receivingWorksheetId, receivingWorksheetTag)

Delete a tag for a receivingWorksheet.

Deletes an existing receivingWorksheet tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingWorksheetApi apiInstance = new ReceivingWorksheetApi();
Integer receivingWorksheetId = 56; // Integer | Id of the receivingWorksheet to remove tag from
String receivingWorksheetTag = "receivingWorksheetTag_example"; // String | The tag to delete
try {
    apiInstance.deleteReceivingWorksheetTag(receivingWorksheetId, receivingWorksheetTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingWorksheetApi#deleteReceivingWorksheetTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receivingWorksheetId** | **Integer**| Id of the receivingWorksheet to remove tag from |
 **receivingWorksheetTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateReceivingWorksheetById"></a>
# **getDuplicateReceivingWorksheetById**
> ReceivingWorksheet getDuplicateReceivingWorksheetById(receivingWorksheetId)

Get a duplicated a receivingWorksheet by id

Returns a duplicated receivingWorksheet identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingWorksheetApi apiInstance = new ReceivingWorksheetApi();
Integer receivingWorksheetId = 56; // Integer | Id of the receivingWorksheet to be duplicated.
try {
    ReceivingWorksheet result = apiInstance.getDuplicateReceivingWorksheetById(receivingWorksheetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingWorksheetApi#getDuplicateReceivingWorksheetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receivingWorksheetId** | **Integer**| Id of the receivingWorksheet to be duplicated. |

### Return type

[**ReceivingWorksheet**](ReceivingWorksheet.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReceivingWorksheetByFilter"></a>
# **getReceivingWorksheetByFilter**
> List&lt;ReceivingWorksheet&gt; getReceivingWorksheetByFilter(filter, page, limit, sort)

Search receivingWorksheets by filter

Returns the list of receivingWorksheets that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingWorksheetApi apiInstance = new ReceivingWorksheetApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ReceivingWorksheet> result = apiInstance.getReceivingWorksheetByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingWorksheetApi#getReceivingWorksheetByFilter");
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

[**List&lt;ReceivingWorksheet&gt;**](ReceivingWorksheet.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReceivingWorksheetById"></a>
# **getReceivingWorksheetById**
> ReceivingWorksheet getReceivingWorksheetById(receivingWorksheetId)

Get a receivingWorksheet by id

Returns the receivingWorksheet identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingWorksheetApi apiInstance = new ReceivingWorksheetApi();
Integer receivingWorksheetId = 56; // Integer | Id of the receivingWorksheet to be returned.
try {
    ReceivingWorksheet result = apiInstance.getReceivingWorksheetById(receivingWorksheetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingWorksheetApi#getReceivingWorksheetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receivingWorksheetId** | **Integer**| Id of the receivingWorksheet to be returned. |

### Return type

[**ReceivingWorksheet**](ReceivingWorksheet.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReceivingWorksheetFiles"></a>
# **getReceivingWorksheetFiles**
> getReceivingWorksheetFiles(receivingWorksheetId)

Get the files for a receivingWorksheet.

Get all existing receivingWorksheet files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingWorksheetApi apiInstance = new ReceivingWorksheetApi();
Integer receivingWorksheetId = 56; // Integer | Id of the receivingWorksheet to get files for
try {
    apiInstance.getReceivingWorksheetFiles(receivingWorksheetId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingWorksheetApi#getReceivingWorksheetFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receivingWorksheetId** | **Integer**| Id of the receivingWorksheet to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReceivingWorksheetTags"></a>
# **getReceivingWorksheetTags**
> getReceivingWorksheetTags(receivingWorksheetId)

Get the tags for a receivingWorksheet.

Get all existing receivingWorksheet tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingWorksheetApi apiInstance = new ReceivingWorksheetApi();
Integer receivingWorksheetId = 56; // Integer | Id of the receivingWorksheet to get tags for
try {
    apiInstance.getReceivingWorksheetTags(receivingWorksheetId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingWorksheetApi#getReceivingWorksheetTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receivingWorksheetId** | **Integer**| Id of the receivingWorksheet to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateReceivingWorksheet"></a>
# **updateReceivingWorksheet**
> updateReceivingWorksheet(body)

Update a receivingWorksheet

Updates an existing receivingWorksheet using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingWorksheetApi apiInstance = new ReceivingWorksheetApi();
ReceivingWorksheet body = new ReceivingWorksheet(); // ReceivingWorksheet | ReceivingWorksheet to be updated.
try {
    apiInstance.updateReceivingWorksheet(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingWorksheetApi#updateReceivingWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReceivingWorksheet**](ReceivingWorksheet.md)| ReceivingWorksheet to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateReceivingWorksheetCustomFields"></a>
# **updateReceivingWorksheetCustomFields**
> updateReceivingWorksheetCustomFields(body)

Update a receivingWorksheet custom fields

Updates an existing receivingWorksheet custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReceivingWorksheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReceivingWorksheetApi apiInstance = new ReceivingWorksheetApi();
ReceivingWorksheet body = new ReceivingWorksheet(); // ReceivingWorksheet | ReceivingWorksheet to be updated.
try {
    apiInstance.updateReceivingWorksheetCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivingWorksheetApi#updateReceivingWorksheetCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReceivingWorksheet**](ReceivingWorksheet.md)| ReceivingWorksheet to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

