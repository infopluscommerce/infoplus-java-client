# QuickReceiptApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addQuickReceipt**](QuickReceiptApi.md#addQuickReceipt) | **POST** /beta/quickReceipt | Create a quickReceipt
[**addQuickReceiptAudit**](QuickReceiptApi.md#addQuickReceiptAudit) | **PUT** /beta/quickReceipt/{quickReceiptId}/audit/{quickReceiptAudit} | Add new audit for a quickReceipt
[**addQuickReceiptFile**](QuickReceiptApi.md#addQuickReceiptFile) | **POST** /beta/quickReceipt/{quickReceiptId}/file/{fileName} | Attach a file to a quickReceipt
[**addQuickReceiptFileByURL**](QuickReceiptApi.md#addQuickReceiptFileByURL) | **POST** /beta/quickReceipt/{quickReceiptId}/file | Attach a file to a quickReceipt by URL.
[**addQuickReceiptTag**](QuickReceiptApi.md#addQuickReceiptTag) | **PUT** /beta/quickReceipt/{quickReceiptId}/tag/{quickReceiptTag} | Add new tags for a quickReceipt.
[**deleteQuickReceipt**](QuickReceiptApi.md#deleteQuickReceipt) | **DELETE** /beta/quickReceipt/{quickReceiptId} | Delete a quickReceipt
[**deleteQuickReceiptFile**](QuickReceiptApi.md#deleteQuickReceiptFile) | **DELETE** /beta/quickReceipt/{quickReceiptId}/file/{fileId} | Delete a file for a quickReceipt.
[**deleteQuickReceiptTag**](QuickReceiptApi.md#deleteQuickReceiptTag) | **DELETE** /beta/quickReceipt/{quickReceiptId}/tag/{quickReceiptTag} | Delete a tag for a quickReceipt.
[**executeQuickReceipt**](QuickReceiptApi.md#executeQuickReceipt) | **POST** /beta/quickReceipt/executeQuickReceipt | Run the ExecuteQuickReceipt process.
[**getDuplicateQuickReceiptById**](QuickReceiptApi.md#getDuplicateQuickReceiptById) | **GET** /beta/quickReceipt/duplicate/{quickReceiptId} | Get a duplicated a quickReceipt by id
[**getQuickReceiptByFilter**](QuickReceiptApi.md#getQuickReceiptByFilter) | **GET** /beta/quickReceipt/search | Search quickReceipts by filter
[**getQuickReceiptById**](QuickReceiptApi.md#getQuickReceiptById) | **GET** /beta/quickReceipt/{quickReceiptId} | Get a quickReceipt by id
[**getQuickReceiptFiles**](QuickReceiptApi.md#getQuickReceiptFiles) | **GET** /beta/quickReceipt/{quickReceiptId}/file | Get the files for a quickReceipt.
[**getQuickReceiptTags**](QuickReceiptApi.md#getQuickReceiptTags) | **GET** /beta/quickReceipt/{quickReceiptId}/tag | Get the tags for a quickReceipt.
[**updateQuickReceipt**](QuickReceiptApi.md#updateQuickReceipt) | **PUT** /beta/quickReceipt | Update a quickReceipt
[**updateQuickReceiptCustomFields**](QuickReceiptApi.md#updateQuickReceiptCustomFields) | **PUT** /beta/quickReceipt/customFields | Update a quickReceipt custom fields


<a name="addQuickReceipt"></a>
# **addQuickReceipt**
> QuickReceipt addQuickReceipt(body)

Create a quickReceipt

Inserts a new quickReceipt using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickReceiptApi apiInstance = new QuickReceiptApi();
QuickReceipt body = new QuickReceipt(); // QuickReceipt | QuickReceipt to be inserted.
try {
    QuickReceipt result = apiInstance.addQuickReceipt(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickReceiptApi#addQuickReceipt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QuickReceipt**](QuickReceipt.md)| QuickReceipt to be inserted. |

### Return type

[**QuickReceipt**](QuickReceipt.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addQuickReceiptAudit"></a>
# **addQuickReceiptAudit**
> addQuickReceiptAudit(quickReceiptId, quickReceiptAudit)

Add new audit for a quickReceipt

Adds an audit to an existing quickReceipt.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickReceiptApi apiInstance = new QuickReceiptApi();
Integer quickReceiptId = 56; // Integer | Id of the quickReceipt to add an audit to
String quickReceiptAudit = "quickReceiptAudit_example"; // String | The audit to add
try {
    apiInstance.addQuickReceiptAudit(quickReceiptId, quickReceiptAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickReceiptApi#addQuickReceiptAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickReceiptId** | **Integer**| Id of the quickReceipt to add an audit to |
 **quickReceiptAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addQuickReceiptFile"></a>
# **addQuickReceiptFile**
> addQuickReceiptFile(quickReceiptId, fileName)

Attach a file to a quickReceipt

Adds a file to an existing quickReceipt.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickReceiptApi apiInstance = new QuickReceiptApi();
Integer quickReceiptId = 56; // Integer | Id of the quickReceipt to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addQuickReceiptFile(quickReceiptId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickReceiptApi#addQuickReceiptFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickReceiptId** | **Integer**| Id of the quickReceipt to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addQuickReceiptFileByURL"></a>
# **addQuickReceiptFileByURL**
> addQuickReceiptFileByURL(body, quickReceiptId)

Attach a file to a quickReceipt by URL.

Adds a file to an existing quickReceipt by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickReceiptApi apiInstance = new QuickReceiptApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer quickReceiptId = 56; // Integer | Id of the quickReceipt to add an file to
try {
    apiInstance.addQuickReceiptFileByURL(body, quickReceiptId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickReceiptApi#addQuickReceiptFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **quickReceiptId** | **Integer**| Id of the quickReceipt to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addQuickReceiptTag"></a>
# **addQuickReceiptTag**
> addQuickReceiptTag(quickReceiptId, quickReceiptTag)

Add new tags for a quickReceipt.

Adds a tag to an existing quickReceipt.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickReceiptApi apiInstance = new QuickReceiptApi();
Integer quickReceiptId = 56; // Integer | Id of the quickReceipt to add a tag to
String quickReceiptTag = "quickReceiptTag_example"; // String | The tag to add
try {
    apiInstance.addQuickReceiptTag(quickReceiptId, quickReceiptTag);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickReceiptApi#addQuickReceiptTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickReceiptId** | **Integer**| Id of the quickReceipt to add a tag to |
 **quickReceiptTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteQuickReceipt"></a>
# **deleteQuickReceipt**
> deleteQuickReceipt(quickReceiptId)

Delete a quickReceipt

Deletes the quickReceipt identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickReceiptApi apiInstance = new QuickReceiptApi();
Integer quickReceiptId = 56; // Integer | Id of the quickReceipt to be deleted.
try {
    apiInstance.deleteQuickReceipt(quickReceiptId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickReceiptApi#deleteQuickReceipt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickReceiptId** | **Integer**| Id of the quickReceipt to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteQuickReceiptFile"></a>
# **deleteQuickReceiptFile**
> deleteQuickReceiptFile(quickReceiptId, fileId)

Delete a file for a quickReceipt.

Deletes an existing quickReceipt file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickReceiptApi apiInstance = new QuickReceiptApi();
Integer quickReceiptId = 56; // Integer | Id of the quickReceipt to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteQuickReceiptFile(quickReceiptId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickReceiptApi#deleteQuickReceiptFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickReceiptId** | **Integer**| Id of the quickReceipt to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteQuickReceiptTag"></a>
# **deleteQuickReceiptTag**
> deleteQuickReceiptTag(quickReceiptId, quickReceiptTag)

Delete a tag for a quickReceipt.

Deletes an existing quickReceipt tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickReceiptApi apiInstance = new QuickReceiptApi();
Integer quickReceiptId = 56; // Integer | Id of the quickReceipt to remove tag from
String quickReceiptTag = "quickReceiptTag_example"; // String | The tag to delete
try {
    apiInstance.deleteQuickReceiptTag(quickReceiptId, quickReceiptTag);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickReceiptApi#deleteQuickReceiptTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickReceiptId** | **Integer**| Id of the quickReceipt to remove tag from |
 **quickReceiptTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="executeQuickReceipt"></a>
# **executeQuickReceipt**
> List&lt;ProcessOutputAPIModel&gt; executeQuickReceipt(body)

Run the ExecuteQuickReceipt process.



### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickReceiptApi apiInstance = new QuickReceiptApi();
ExecuteQuickReceiptInputAPIModel body = new ExecuteQuickReceiptInputAPIModel(); // ExecuteQuickReceiptInputAPIModel | Input data for ExecuteQuickReceipt process.
try {
    List<ProcessOutputAPIModel> result = apiInstance.executeQuickReceipt(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickReceiptApi#executeQuickReceipt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExecuteQuickReceiptInputAPIModel**](ExecuteQuickReceiptInputAPIModel.md)| Input data for ExecuteQuickReceipt process. |

### Return type

[**List&lt;ProcessOutputAPIModel&gt;**](ProcessOutputAPIModel.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateQuickReceiptById"></a>
# **getDuplicateQuickReceiptById**
> QuickReceipt getDuplicateQuickReceiptById(quickReceiptId)

Get a duplicated a quickReceipt by id

Returns a duplicated quickReceipt identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickReceiptApi apiInstance = new QuickReceiptApi();
Integer quickReceiptId = 56; // Integer | Id of the quickReceipt to be duplicated.
try {
    QuickReceipt result = apiInstance.getDuplicateQuickReceiptById(quickReceiptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickReceiptApi#getDuplicateQuickReceiptById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickReceiptId** | **Integer**| Id of the quickReceipt to be duplicated. |

### Return type

[**QuickReceipt**](QuickReceipt.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQuickReceiptByFilter"></a>
# **getQuickReceiptByFilter**
> List&lt;QuickReceipt&gt; getQuickReceiptByFilter(filter, page, limit, sort)

Search quickReceipts by filter

Returns the list of quickReceipts that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickReceiptApi apiInstance = new QuickReceiptApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<QuickReceipt> result = apiInstance.getQuickReceiptByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickReceiptApi#getQuickReceiptByFilter");
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

[**List&lt;QuickReceipt&gt;**](QuickReceipt.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQuickReceiptById"></a>
# **getQuickReceiptById**
> QuickReceipt getQuickReceiptById(quickReceiptId)

Get a quickReceipt by id

Returns the quickReceipt identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickReceiptApi apiInstance = new QuickReceiptApi();
Integer quickReceiptId = 56; // Integer | Id of the quickReceipt to be returned.
try {
    QuickReceipt result = apiInstance.getQuickReceiptById(quickReceiptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickReceiptApi#getQuickReceiptById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickReceiptId** | **Integer**| Id of the quickReceipt to be returned. |

### Return type

[**QuickReceipt**](QuickReceipt.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQuickReceiptFiles"></a>
# **getQuickReceiptFiles**
> getQuickReceiptFiles(quickReceiptId)

Get the files for a quickReceipt.

Get all existing quickReceipt files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickReceiptApi apiInstance = new QuickReceiptApi();
Integer quickReceiptId = 56; // Integer | Id of the quickReceipt to get files for
try {
    apiInstance.getQuickReceiptFiles(quickReceiptId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickReceiptApi#getQuickReceiptFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickReceiptId** | **Integer**| Id of the quickReceipt to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQuickReceiptTags"></a>
# **getQuickReceiptTags**
> getQuickReceiptTags(quickReceiptId)

Get the tags for a quickReceipt.

Get all existing quickReceipt tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickReceiptApi apiInstance = new QuickReceiptApi();
Integer quickReceiptId = 56; // Integer | Id of the quickReceipt to get tags for
try {
    apiInstance.getQuickReceiptTags(quickReceiptId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickReceiptApi#getQuickReceiptTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickReceiptId** | **Integer**| Id of the quickReceipt to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateQuickReceipt"></a>
# **updateQuickReceipt**
> updateQuickReceipt(body)

Update a quickReceipt

Updates an existing quickReceipt using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickReceiptApi apiInstance = new QuickReceiptApi();
QuickReceipt body = new QuickReceipt(); // QuickReceipt | QuickReceipt to be updated.
try {
    apiInstance.updateQuickReceipt(body);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickReceiptApi#updateQuickReceipt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QuickReceipt**](QuickReceipt.md)| QuickReceipt to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateQuickReceiptCustomFields"></a>
# **updateQuickReceiptCustomFields**
> updateQuickReceiptCustomFields(body)

Update a quickReceipt custom fields

Updates an existing quickReceipt custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickReceiptApi apiInstance = new QuickReceiptApi();
QuickReceipt body = new QuickReceipt(); // QuickReceipt | QuickReceipt to be updated.
try {
    apiInstance.updateQuickReceiptCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickReceiptApi#updateQuickReceiptCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QuickReceipt**](QuickReceipt.md)| QuickReceipt to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

