# PackingDetailApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPackingDetailAudit**](PackingDetailApi.md#addPackingDetailAudit) | **PUT** /beta/packingDetail/{packingDetailId}/audit/{packingDetailAudit} | Add new audit for a packingDetail
[**addPackingDetailFile**](PackingDetailApi.md#addPackingDetailFile) | **POST** /beta/packingDetail/{packingDetailId}/file/{fileName} | Attach a file to a packingDetail
[**addPackingDetailFileByURL**](PackingDetailApi.md#addPackingDetailFileByURL) | **POST** /beta/packingDetail/{packingDetailId}/file | Attach a file to a packingDetail by URL.
[**addPackingDetailTag**](PackingDetailApi.md#addPackingDetailTag) | **PUT** /beta/packingDetail/{packingDetailId}/tag/{packingDetailTag} | Add new tags for a packingDetail.
[**deletePackingDetailFile**](PackingDetailApi.md#deletePackingDetailFile) | **DELETE** /beta/packingDetail/{packingDetailId}/file/{fileId} | Delete a file for a packingDetail.
[**deletePackingDetailTag**](PackingDetailApi.md#deletePackingDetailTag) | **DELETE** /beta/packingDetail/{packingDetailId}/tag/{packingDetailTag} | Delete a tag for a packingDetail.
[**getDuplicatePackingDetailById**](PackingDetailApi.md#getDuplicatePackingDetailById) | **GET** /beta/packingDetail/duplicate/{packingDetailId} | Get a duplicated a packingDetail by id
[**getPackingDetailByFilter**](PackingDetailApi.md#getPackingDetailByFilter) | **GET** /beta/packingDetail/search | Search packingDetails by filter
[**getPackingDetailById**](PackingDetailApi.md#getPackingDetailById) | **GET** /beta/packingDetail/{packingDetailId} | Get a packingDetail by id
[**getPackingDetailFiles**](PackingDetailApi.md#getPackingDetailFiles) | **GET** /beta/packingDetail/{packingDetailId}/file | Get the files for a packingDetail.
[**getPackingDetailTags**](PackingDetailApi.md#getPackingDetailTags) | **GET** /beta/packingDetail/{packingDetailId}/tag | Get the tags for a packingDetail.
[**updatePackingDetailCustomFields**](PackingDetailApi.md#updatePackingDetailCustomFields) | **PUT** /beta/packingDetail/customFields | Update a packingDetail custom fields


<a name="addPackingDetailAudit"></a>
# **addPackingDetailAudit**
> addPackingDetailAudit(packingDetailId, packingDetailAudit)

Add new audit for a packingDetail

Adds an audit to an existing packingDetail.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingDetailApi apiInstance = new PackingDetailApi();
Integer packingDetailId = 56; // Integer | Id of the packingDetail to add an audit to
String packingDetailAudit = "packingDetailAudit_example"; // String | The audit to add
try {
    apiInstance.addPackingDetailAudit(packingDetailId, packingDetailAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingDetailApi#addPackingDetailAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingDetailId** | **Integer**| Id of the packingDetail to add an audit to |
 **packingDetailAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPackingDetailFile"></a>
# **addPackingDetailFile**
> addPackingDetailFile(packingDetailId, fileName)

Attach a file to a packingDetail

Adds a file to an existing packingDetail.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingDetailApi apiInstance = new PackingDetailApi();
Integer packingDetailId = 56; // Integer | Id of the packingDetail to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addPackingDetailFile(packingDetailId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingDetailApi#addPackingDetailFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingDetailId** | **Integer**| Id of the packingDetail to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addPackingDetailFileByURL"></a>
# **addPackingDetailFileByURL**
> addPackingDetailFileByURL(body, packingDetailId)

Attach a file to a packingDetail by URL.

Adds a file to an existing packingDetail by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingDetailApi apiInstance = new PackingDetailApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer packingDetailId = 56; // Integer | Id of the packingDetail to add an file to
try {
    apiInstance.addPackingDetailFileByURL(body, packingDetailId);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingDetailApi#addPackingDetailFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **packingDetailId** | **Integer**| Id of the packingDetail to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPackingDetailTag"></a>
# **addPackingDetailTag**
> addPackingDetailTag(packingDetailId, packingDetailTag)

Add new tags for a packingDetail.

Adds a tag to an existing packingDetail.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingDetailApi apiInstance = new PackingDetailApi();
Integer packingDetailId = 56; // Integer | Id of the packingDetail to add a tag to
String packingDetailTag = "packingDetailTag_example"; // String | The tag to add
try {
    apiInstance.addPackingDetailTag(packingDetailId, packingDetailTag);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingDetailApi#addPackingDetailTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingDetailId** | **Integer**| Id of the packingDetail to add a tag to |
 **packingDetailTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePackingDetailFile"></a>
# **deletePackingDetailFile**
> deletePackingDetailFile(packingDetailId, fileId)

Delete a file for a packingDetail.

Deletes an existing packingDetail file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingDetailApi apiInstance = new PackingDetailApi();
Integer packingDetailId = 56; // Integer | Id of the packingDetail to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deletePackingDetailFile(packingDetailId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingDetailApi#deletePackingDetailFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingDetailId** | **Integer**| Id of the packingDetail to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePackingDetailTag"></a>
# **deletePackingDetailTag**
> deletePackingDetailTag(packingDetailId, packingDetailTag)

Delete a tag for a packingDetail.

Deletes an existing packingDetail tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingDetailApi apiInstance = new PackingDetailApi();
Integer packingDetailId = 56; // Integer | Id of the packingDetail to remove tag from
String packingDetailTag = "packingDetailTag_example"; // String | The tag to delete
try {
    apiInstance.deletePackingDetailTag(packingDetailId, packingDetailTag);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingDetailApi#deletePackingDetailTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingDetailId** | **Integer**| Id of the packingDetail to remove tag from |
 **packingDetailTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicatePackingDetailById"></a>
# **getDuplicatePackingDetailById**
> PackingDetail getDuplicatePackingDetailById(packingDetailId)

Get a duplicated a packingDetail by id

Returns a duplicated packingDetail identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingDetailApi apiInstance = new PackingDetailApi();
Integer packingDetailId = 56; // Integer | Id of the packingDetail to be duplicated.
try {
    PackingDetail result = apiInstance.getDuplicatePackingDetailById(packingDetailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingDetailApi#getDuplicatePackingDetailById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingDetailId** | **Integer**| Id of the packingDetail to be duplicated. |

### Return type

[**PackingDetail**](PackingDetail.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPackingDetailByFilter"></a>
# **getPackingDetailByFilter**
> List&lt;PackingDetail&gt; getPackingDetailByFilter(filter, page, limit, sort)

Search packingDetails by filter

Returns the list of packingDetails that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingDetailApi apiInstance = new PackingDetailApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<PackingDetail> result = apiInstance.getPackingDetailByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingDetailApi#getPackingDetailByFilter");
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

[**List&lt;PackingDetail&gt;**](PackingDetail.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPackingDetailById"></a>
# **getPackingDetailById**
> PackingDetail getPackingDetailById(packingDetailId)

Get a packingDetail by id

Returns the packingDetail identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingDetailApi apiInstance = new PackingDetailApi();
Integer packingDetailId = 56; // Integer | Id of the packingDetail to be returned.
try {
    PackingDetail result = apiInstance.getPackingDetailById(packingDetailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingDetailApi#getPackingDetailById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingDetailId** | **Integer**| Id of the packingDetail to be returned. |

### Return type

[**PackingDetail**](PackingDetail.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPackingDetailFiles"></a>
# **getPackingDetailFiles**
> getPackingDetailFiles(packingDetailId)

Get the files for a packingDetail.

Get all existing packingDetail files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingDetailApi apiInstance = new PackingDetailApi();
Integer packingDetailId = 56; // Integer | Id of the packingDetail to get files for
try {
    apiInstance.getPackingDetailFiles(packingDetailId);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingDetailApi#getPackingDetailFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingDetailId** | **Integer**| Id of the packingDetail to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPackingDetailTags"></a>
# **getPackingDetailTags**
> getPackingDetailTags(packingDetailId)

Get the tags for a packingDetail.

Get all existing packingDetail tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingDetailApi apiInstance = new PackingDetailApi();
Integer packingDetailId = 56; // Integer | Id of the packingDetail to get tags for
try {
    apiInstance.getPackingDetailTags(packingDetailId);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingDetailApi#getPackingDetailTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingDetailId** | **Integer**| Id of the packingDetail to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePackingDetailCustomFields"></a>
# **updatePackingDetailCustomFields**
> updatePackingDetailCustomFields(body)

Update a packingDetail custom fields

Updates an existing packingDetail custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingDetailApi apiInstance = new PackingDetailApi();
PackingDetail body = new PackingDetail(); // PackingDetail | PackingDetail to be updated.
try {
    apiInstance.updatePackingDetailCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingDetailApi#updatePackingDetailCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PackingDetail**](PackingDetail.md)| PackingDetail to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

