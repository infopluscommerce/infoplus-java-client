# PackingPlanDetailApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPackingPlanDetailAudit**](PackingPlanDetailApi.md#addPackingPlanDetailAudit) | **PUT** /beta/packingPlanDetail/{packingPlanDetailId}/audit/{packingPlanDetailAudit} | Add new audit for a packingPlanDetail
[**addPackingPlanDetailFile**](PackingPlanDetailApi.md#addPackingPlanDetailFile) | **POST** /beta/packingPlanDetail/{packingPlanDetailId}/file/{fileName} | Attach a file to a packingPlanDetail
[**addPackingPlanDetailFileByURL**](PackingPlanDetailApi.md#addPackingPlanDetailFileByURL) | **POST** /beta/packingPlanDetail/{packingPlanDetailId}/file | Attach a file to a packingPlanDetail by URL.
[**addPackingPlanDetailTag**](PackingPlanDetailApi.md#addPackingPlanDetailTag) | **PUT** /beta/packingPlanDetail/{packingPlanDetailId}/tag/{packingPlanDetailTag} | Add new tags for a packingPlanDetail.
[**deletePackingPlanDetailFile**](PackingPlanDetailApi.md#deletePackingPlanDetailFile) | **DELETE** /beta/packingPlanDetail/{packingPlanDetailId}/file/{fileId} | Delete a file for a packingPlanDetail.
[**deletePackingPlanDetailTag**](PackingPlanDetailApi.md#deletePackingPlanDetailTag) | **DELETE** /beta/packingPlanDetail/{packingPlanDetailId}/tag/{packingPlanDetailTag} | Delete a tag for a packingPlanDetail.
[**getDuplicatePackingPlanDetailById**](PackingPlanDetailApi.md#getDuplicatePackingPlanDetailById) | **GET** /beta/packingPlanDetail/duplicate/{packingPlanDetailId} | Get a duplicated a packingPlanDetail by id
[**getPackingPlanDetailByFilter**](PackingPlanDetailApi.md#getPackingPlanDetailByFilter) | **GET** /beta/packingPlanDetail/search | Search packingPlanDetails by filter
[**getPackingPlanDetailById**](PackingPlanDetailApi.md#getPackingPlanDetailById) | **GET** /beta/packingPlanDetail/{packingPlanDetailId} | Get a packingPlanDetail by id
[**getPackingPlanDetailFiles**](PackingPlanDetailApi.md#getPackingPlanDetailFiles) | **GET** /beta/packingPlanDetail/{packingPlanDetailId}/file | Get the files for a packingPlanDetail.
[**getPackingPlanDetailTags**](PackingPlanDetailApi.md#getPackingPlanDetailTags) | **GET** /beta/packingPlanDetail/{packingPlanDetailId}/tag | Get the tags for a packingPlanDetail.
[**updatePackingPlanDetailCustomFields**](PackingPlanDetailApi.md#updatePackingPlanDetailCustomFields) | **PUT** /beta/packingPlanDetail/customFields | Update a packingPlanDetail custom fields


<a name="addPackingPlanDetailAudit"></a>
# **addPackingPlanDetailAudit**
> addPackingPlanDetailAudit(packingPlanDetailId, packingPlanDetailAudit)

Add new audit for a packingPlanDetail

Adds an audit to an existing packingPlanDetail.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanDetailApi apiInstance = new PackingPlanDetailApi();
Integer packingPlanDetailId = 56; // Integer | Id of the packingPlanDetail to add an audit to
String packingPlanDetailAudit = "packingPlanDetailAudit_example"; // String | The audit to add
try {
    apiInstance.addPackingPlanDetailAudit(packingPlanDetailId, packingPlanDetailAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanDetailApi#addPackingPlanDetailAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingPlanDetailId** | **Integer**| Id of the packingPlanDetail to add an audit to |
 **packingPlanDetailAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPackingPlanDetailFile"></a>
# **addPackingPlanDetailFile**
> addPackingPlanDetailFile(packingPlanDetailId, fileName)

Attach a file to a packingPlanDetail

Adds a file to an existing packingPlanDetail.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanDetailApi apiInstance = new PackingPlanDetailApi();
Integer packingPlanDetailId = 56; // Integer | Id of the packingPlanDetail to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addPackingPlanDetailFile(packingPlanDetailId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanDetailApi#addPackingPlanDetailFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingPlanDetailId** | **Integer**| Id of the packingPlanDetail to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addPackingPlanDetailFileByURL"></a>
# **addPackingPlanDetailFileByURL**
> addPackingPlanDetailFileByURL(body, packingPlanDetailId)

Attach a file to a packingPlanDetail by URL.

Adds a file to an existing packingPlanDetail by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanDetailApi apiInstance = new PackingPlanDetailApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer packingPlanDetailId = 56; // Integer | Id of the packingPlanDetail to add an file to
try {
    apiInstance.addPackingPlanDetailFileByURL(body, packingPlanDetailId);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanDetailApi#addPackingPlanDetailFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **packingPlanDetailId** | **Integer**| Id of the packingPlanDetail to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPackingPlanDetailTag"></a>
# **addPackingPlanDetailTag**
> addPackingPlanDetailTag(packingPlanDetailId, packingPlanDetailTag)

Add new tags for a packingPlanDetail.

Adds a tag to an existing packingPlanDetail.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanDetailApi apiInstance = new PackingPlanDetailApi();
Integer packingPlanDetailId = 56; // Integer | Id of the packingPlanDetail to add a tag to
String packingPlanDetailTag = "packingPlanDetailTag_example"; // String | The tag to add
try {
    apiInstance.addPackingPlanDetailTag(packingPlanDetailId, packingPlanDetailTag);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanDetailApi#addPackingPlanDetailTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingPlanDetailId** | **Integer**| Id of the packingPlanDetail to add a tag to |
 **packingPlanDetailTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePackingPlanDetailFile"></a>
# **deletePackingPlanDetailFile**
> deletePackingPlanDetailFile(packingPlanDetailId, fileId)

Delete a file for a packingPlanDetail.

Deletes an existing packingPlanDetail file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanDetailApi apiInstance = new PackingPlanDetailApi();
Integer packingPlanDetailId = 56; // Integer | Id of the packingPlanDetail to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deletePackingPlanDetailFile(packingPlanDetailId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanDetailApi#deletePackingPlanDetailFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingPlanDetailId** | **Integer**| Id of the packingPlanDetail to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePackingPlanDetailTag"></a>
# **deletePackingPlanDetailTag**
> deletePackingPlanDetailTag(packingPlanDetailId, packingPlanDetailTag)

Delete a tag for a packingPlanDetail.

Deletes an existing packingPlanDetail tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanDetailApi apiInstance = new PackingPlanDetailApi();
Integer packingPlanDetailId = 56; // Integer | Id of the packingPlanDetail to remove tag from
String packingPlanDetailTag = "packingPlanDetailTag_example"; // String | The tag to delete
try {
    apiInstance.deletePackingPlanDetailTag(packingPlanDetailId, packingPlanDetailTag);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanDetailApi#deletePackingPlanDetailTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingPlanDetailId** | **Integer**| Id of the packingPlanDetail to remove tag from |
 **packingPlanDetailTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicatePackingPlanDetailById"></a>
# **getDuplicatePackingPlanDetailById**
> PackingPlanDetail getDuplicatePackingPlanDetailById(packingPlanDetailId)

Get a duplicated a packingPlanDetail by id

Returns a duplicated packingPlanDetail identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanDetailApi apiInstance = new PackingPlanDetailApi();
Integer packingPlanDetailId = 56; // Integer | Id of the packingPlanDetail to be duplicated.
try {
    PackingPlanDetail result = apiInstance.getDuplicatePackingPlanDetailById(packingPlanDetailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanDetailApi#getDuplicatePackingPlanDetailById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingPlanDetailId** | **Integer**| Id of the packingPlanDetail to be duplicated. |

### Return type

[**PackingPlanDetail**](PackingPlanDetail.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPackingPlanDetailByFilter"></a>
# **getPackingPlanDetailByFilter**
> List&lt;PackingPlanDetail&gt; getPackingPlanDetailByFilter(filter, page, limit, sort)

Search packingPlanDetails by filter

Returns the list of packingPlanDetails that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanDetailApi apiInstance = new PackingPlanDetailApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<PackingPlanDetail> result = apiInstance.getPackingPlanDetailByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanDetailApi#getPackingPlanDetailByFilter");
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

[**List&lt;PackingPlanDetail&gt;**](PackingPlanDetail.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPackingPlanDetailById"></a>
# **getPackingPlanDetailById**
> PackingPlanDetail getPackingPlanDetailById(packingPlanDetailId)

Get a packingPlanDetail by id

Returns the packingPlanDetail identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanDetailApi apiInstance = new PackingPlanDetailApi();
Integer packingPlanDetailId = 56; // Integer | Id of the packingPlanDetail to be returned.
try {
    PackingPlanDetail result = apiInstance.getPackingPlanDetailById(packingPlanDetailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanDetailApi#getPackingPlanDetailById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingPlanDetailId** | **Integer**| Id of the packingPlanDetail to be returned. |

### Return type

[**PackingPlanDetail**](PackingPlanDetail.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPackingPlanDetailFiles"></a>
# **getPackingPlanDetailFiles**
> getPackingPlanDetailFiles(packingPlanDetailId)

Get the files for a packingPlanDetail.

Get all existing packingPlanDetail files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanDetailApi apiInstance = new PackingPlanDetailApi();
Integer packingPlanDetailId = 56; // Integer | Id of the packingPlanDetail to get files for
try {
    apiInstance.getPackingPlanDetailFiles(packingPlanDetailId);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanDetailApi#getPackingPlanDetailFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingPlanDetailId** | **Integer**| Id of the packingPlanDetail to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPackingPlanDetailTags"></a>
# **getPackingPlanDetailTags**
> getPackingPlanDetailTags(packingPlanDetailId)

Get the tags for a packingPlanDetail.

Get all existing packingPlanDetail tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanDetailApi apiInstance = new PackingPlanDetailApi();
Integer packingPlanDetailId = 56; // Integer | Id of the packingPlanDetail to get tags for
try {
    apiInstance.getPackingPlanDetailTags(packingPlanDetailId);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanDetailApi#getPackingPlanDetailTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingPlanDetailId** | **Integer**| Id of the packingPlanDetail to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePackingPlanDetailCustomFields"></a>
# **updatePackingPlanDetailCustomFields**
> updatePackingPlanDetailCustomFields(body)

Update a packingPlanDetail custom fields

Updates an existing packingPlanDetail custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanDetailApi apiInstance = new PackingPlanDetailApi();
PackingPlanDetail body = new PackingPlanDetail(); // PackingPlanDetail | PackingPlanDetail to be updated.
try {
    apiInstance.updatePackingPlanDetailCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanDetailApi#updatePackingPlanDetailCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PackingPlanDetail**](PackingPlanDetail.md)| PackingPlanDetail to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

