# ReplenishmentApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addReplenishmentAudit**](ReplenishmentApi.md#addReplenishmentAudit) | **PUT** /beta/replenishment/{replenishmentId}/audit/{replenishmentAudit} | Add new audit for a replenishment
[**addReplenishmentFile**](ReplenishmentApi.md#addReplenishmentFile) | **POST** /beta/replenishment/{replenishmentId}/file/{fileName} | Attach a file to a replenishment
[**addReplenishmentFileByURL**](ReplenishmentApi.md#addReplenishmentFileByURL) | **POST** /beta/replenishment/{replenishmentId}/file | Attach a file to a replenishment by URL.
[**addReplenishmentTag**](ReplenishmentApi.md#addReplenishmentTag) | **PUT** /beta/replenishment/{replenishmentId}/tag/{replenishmentTag} | Add new tags for a replenishment.
[**deleteReplenishmentFile**](ReplenishmentApi.md#deleteReplenishmentFile) | **DELETE** /beta/replenishment/{replenishmentId}/file/{fileId} | Delete a file for a replenishment.
[**deleteReplenishmentTag**](ReplenishmentApi.md#deleteReplenishmentTag) | **DELETE** /beta/replenishment/{replenishmentId}/tag/{replenishmentTag} | Delete a tag for a replenishment.
[**getDuplicateReplenishmentById**](ReplenishmentApi.md#getDuplicateReplenishmentById) | **GET** /beta/replenishment/duplicate/{replenishmentId} | Get a duplicated a replenishment by id
[**getReplenishmentByFilter**](ReplenishmentApi.md#getReplenishmentByFilter) | **GET** /beta/replenishment/search | Search replenishments by filter
[**getReplenishmentById**](ReplenishmentApi.md#getReplenishmentById) | **GET** /beta/replenishment/{replenishmentId} | Get a replenishment by id
[**getReplenishmentFiles**](ReplenishmentApi.md#getReplenishmentFiles) | **GET** /beta/replenishment/{replenishmentId}/file | Get the files for a replenishment.
[**getReplenishmentTags**](ReplenishmentApi.md#getReplenishmentTags) | **GET** /beta/replenishment/{replenishmentId}/tag | Get the tags for a replenishment.
[**updateReplenishmentCustomFields**](ReplenishmentApi.md#updateReplenishmentCustomFields) | **PUT** /beta/replenishment/customFields | Update a replenishment custom fields


<a name="addReplenishmentAudit"></a>
# **addReplenishmentAudit**
> addReplenishmentAudit(replenishmentId, replenishmentAudit)

Add new audit for a replenishment

Adds an audit to an existing replenishment.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentApi apiInstance = new ReplenishmentApi();
Integer replenishmentId = 56; // Integer | Id of the replenishment to add an audit to
String replenishmentAudit = "replenishmentAudit_example"; // String | The audit to add
try {
    apiInstance.addReplenishmentAudit(replenishmentId, replenishmentAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentApi#addReplenishmentAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentId** | **Integer**| Id of the replenishment to add an audit to |
 **replenishmentAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addReplenishmentFile"></a>
# **addReplenishmentFile**
> addReplenishmentFile(replenishmentId, fileName)

Attach a file to a replenishment

Adds a file to an existing replenishment.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentApi apiInstance = new ReplenishmentApi();
Integer replenishmentId = 56; // Integer | Id of the replenishment to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addReplenishmentFile(replenishmentId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentApi#addReplenishmentFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentId** | **Integer**| Id of the replenishment to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addReplenishmentFileByURL"></a>
# **addReplenishmentFileByURL**
> addReplenishmentFileByURL(body, replenishmentId)

Attach a file to a replenishment by URL.

Adds a file to an existing replenishment by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentApi apiInstance = new ReplenishmentApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer replenishmentId = 56; // Integer | Id of the replenishment to add an file to
try {
    apiInstance.addReplenishmentFileByURL(body, replenishmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentApi#addReplenishmentFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **replenishmentId** | **Integer**| Id of the replenishment to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addReplenishmentTag"></a>
# **addReplenishmentTag**
> addReplenishmentTag(replenishmentId, replenishmentTag)

Add new tags for a replenishment.

Adds a tag to an existing replenishment.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentApi apiInstance = new ReplenishmentApi();
Integer replenishmentId = 56; // Integer | Id of the replenishment to add a tag to
String replenishmentTag = "replenishmentTag_example"; // String | The tag to add
try {
    apiInstance.addReplenishmentTag(replenishmentId, replenishmentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentApi#addReplenishmentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentId** | **Integer**| Id of the replenishment to add a tag to |
 **replenishmentTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReplenishmentFile"></a>
# **deleteReplenishmentFile**
> deleteReplenishmentFile(replenishmentId, fileId)

Delete a file for a replenishment.

Deletes an existing replenishment file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentApi apiInstance = new ReplenishmentApi();
Integer replenishmentId = 56; // Integer | Id of the replenishment to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteReplenishmentFile(replenishmentId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentApi#deleteReplenishmentFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentId** | **Integer**| Id of the replenishment to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteReplenishmentTag"></a>
# **deleteReplenishmentTag**
> deleteReplenishmentTag(replenishmentId, replenishmentTag)

Delete a tag for a replenishment.

Deletes an existing replenishment tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentApi apiInstance = new ReplenishmentApi();
Integer replenishmentId = 56; // Integer | Id of the replenishment to remove tag from
String replenishmentTag = "replenishmentTag_example"; // String | The tag to delete
try {
    apiInstance.deleteReplenishmentTag(replenishmentId, replenishmentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentApi#deleteReplenishmentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentId** | **Integer**| Id of the replenishment to remove tag from |
 **replenishmentTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateReplenishmentById"></a>
# **getDuplicateReplenishmentById**
> Replenishment getDuplicateReplenishmentById(replenishmentId)

Get a duplicated a replenishment by id

Returns a duplicated replenishment identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentApi apiInstance = new ReplenishmentApi();
Integer replenishmentId = 56; // Integer | Id of the replenishment to be duplicated.
try {
    Replenishment result = apiInstance.getDuplicateReplenishmentById(replenishmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentApi#getDuplicateReplenishmentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentId** | **Integer**| Id of the replenishment to be duplicated. |

### Return type

[**Replenishment**](Replenishment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReplenishmentByFilter"></a>
# **getReplenishmentByFilter**
> List&lt;Replenishment&gt; getReplenishmentByFilter(filter, page, limit, sort)

Search replenishments by filter

Returns the list of replenishments that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentApi apiInstance = new ReplenishmentApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Replenishment> result = apiInstance.getReplenishmentByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentApi#getReplenishmentByFilter");
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

[**List&lt;Replenishment&gt;**](Replenishment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReplenishmentById"></a>
# **getReplenishmentById**
> Replenishment getReplenishmentById(replenishmentId)

Get a replenishment by id

Returns the replenishment identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentApi apiInstance = new ReplenishmentApi();
Integer replenishmentId = 56; // Integer | Id of the replenishment to be returned.
try {
    Replenishment result = apiInstance.getReplenishmentById(replenishmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentApi#getReplenishmentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentId** | **Integer**| Id of the replenishment to be returned. |

### Return type

[**Replenishment**](Replenishment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReplenishmentFiles"></a>
# **getReplenishmentFiles**
> getReplenishmentFiles(replenishmentId)

Get the files for a replenishment.

Get all existing replenishment files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentApi apiInstance = new ReplenishmentApi();
Integer replenishmentId = 56; // Integer | Id of the replenishment to get files for
try {
    apiInstance.getReplenishmentFiles(replenishmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentApi#getReplenishmentFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentId** | **Integer**| Id of the replenishment to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReplenishmentTags"></a>
# **getReplenishmentTags**
> getReplenishmentTags(replenishmentId)

Get the tags for a replenishment.

Get all existing replenishment tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentApi apiInstance = new ReplenishmentApi();
Integer replenishmentId = 56; // Integer | Id of the replenishment to get tags for
try {
    apiInstance.getReplenishmentTags(replenishmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentApi#getReplenishmentTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentId** | **Integer**| Id of the replenishment to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateReplenishmentCustomFields"></a>
# **updateReplenishmentCustomFields**
> updateReplenishmentCustomFields(body)

Update a replenishment custom fields

Updates an existing replenishment custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentApi apiInstance = new ReplenishmentApi();
Replenishment body = new Replenishment(); // Replenishment | Replenishment to be updated.
try {
    apiInstance.updateReplenishmentCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentApi#updateReplenishmentCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Replenishment**](Replenishment.md)| Replenishment to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

