# LoadContentApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLoadContentAudit**](LoadContentApi.md#addLoadContentAudit) | **PUT** /v3.0/loadContent/{loadContentId}/audit/{loadContentAudit} | Add new audit for a loadContent
[**addLoadContentFile**](LoadContentApi.md#addLoadContentFile) | **POST** /v3.0/loadContent/{loadContentId}/file/{fileName} | Attach a file to a loadContent
[**addLoadContentFileByURL**](LoadContentApi.md#addLoadContentFileByURL) | **POST** /v3.0/loadContent/{loadContentId}/file | Attach a file to a loadContent by URL.
[**addLoadContentTag**](LoadContentApi.md#addLoadContentTag) | **PUT** /v3.0/loadContent/{loadContentId}/tag/{loadContentTag} | Add new tags for a loadContent.
[**deleteLoadContentFile**](LoadContentApi.md#deleteLoadContentFile) | **DELETE** /v3.0/loadContent/{loadContentId}/file/{fileId} | Delete a file for a loadContent.
[**deleteLoadContentTag**](LoadContentApi.md#deleteLoadContentTag) | **DELETE** /v3.0/loadContent/{loadContentId}/tag/{loadContentTag} | Delete a tag for a loadContent.
[**getDuplicateLoadContentById**](LoadContentApi.md#getDuplicateLoadContentById) | **GET** /v3.0/loadContent/duplicate/{loadContentId} | Get a duplicated a loadContent by id
[**getLoadContentByFilter**](LoadContentApi.md#getLoadContentByFilter) | **GET** /v3.0/loadContent/search | Search loadContents by filter
[**getLoadContentById**](LoadContentApi.md#getLoadContentById) | **GET** /v3.0/loadContent/{loadContentId} | Get a loadContent by id
[**getLoadContentFiles**](LoadContentApi.md#getLoadContentFiles) | **GET** /v3.0/loadContent/{loadContentId}/file | Get the files for a loadContent.
[**getLoadContentTags**](LoadContentApi.md#getLoadContentTags) | **GET** /v3.0/loadContent/{loadContentId}/tag | Get the tags for a loadContent.
[**updateLoadContentCustomFields**](LoadContentApi.md#updateLoadContentCustomFields) | **PUT** /v3.0/loadContent/customFields | Update a loadContent custom fields


<a name="addLoadContentAudit"></a>
# **addLoadContentAudit**
> addLoadContentAudit(loadContentId, loadContentAudit)

Add new audit for a loadContent

Adds an audit to an existing loadContent.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadContentApi apiInstance = new LoadContentApi();
Integer loadContentId = 56; // Integer | Id of the loadContent to add an audit to
String loadContentAudit = "loadContentAudit_example"; // String | The audit to add
try {
    apiInstance.addLoadContentAudit(loadContentId, loadContentAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadContentApi#addLoadContentAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadContentId** | **Integer**| Id of the loadContent to add an audit to |
 **loadContentAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLoadContentFile"></a>
# **addLoadContentFile**
> addLoadContentFile(loadContentId, fileName)

Attach a file to a loadContent

Adds a file to an existing loadContent.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadContentApi apiInstance = new LoadContentApi();
Integer loadContentId = 56; // Integer | Id of the loadContent to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addLoadContentFile(loadContentId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadContentApi#addLoadContentFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadContentId** | **Integer**| Id of the loadContent to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addLoadContentFileByURL"></a>
# **addLoadContentFileByURL**
> addLoadContentFileByURL(body, loadContentId)

Attach a file to a loadContent by URL.

Adds a file to an existing loadContent by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadContentApi apiInstance = new LoadContentApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer loadContentId = 56; // Integer | Id of the loadContent to add an file to
try {
    apiInstance.addLoadContentFileByURL(body, loadContentId);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadContentApi#addLoadContentFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **loadContentId** | **Integer**| Id of the loadContent to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLoadContentTag"></a>
# **addLoadContentTag**
> addLoadContentTag(loadContentId, loadContentTag)

Add new tags for a loadContent.

Adds a tag to an existing loadContent.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadContentApi apiInstance = new LoadContentApi();
Integer loadContentId = 56; // Integer | Id of the loadContent to add a tag to
String loadContentTag = "loadContentTag_example"; // String | The tag to add
try {
    apiInstance.addLoadContentTag(loadContentId, loadContentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadContentApi#addLoadContentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadContentId** | **Integer**| Id of the loadContent to add a tag to |
 **loadContentTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLoadContentFile"></a>
# **deleteLoadContentFile**
> deleteLoadContentFile(loadContentId, fileId)

Delete a file for a loadContent.

Deletes an existing loadContent file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadContentApi apiInstance = new LoadContentApi();
Integer loadContentId = 56; // Integer | Id of the loadContent to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteLoadContentFile(loadContentId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadContentApi#deleteLoadContentFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadContentId** | **Integer**| Id of the loadContent to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLoadContentTag"></a>
# **deleteLoadContentTag**
> deleteLoadContentTag(loadContentId, loadContentTag)

Delete a tag for a loadContent.

Deletes an existing loadContent tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadContentApi apiInstance = new LoadContentApi();
Integer loadContentId = 56; // Integer | Id of the loadContent to remove tag from
String loadContentTag = "loadContentTag_example"; // String | The tag to delete
try {
    apiInstance.deleteLoadContentTag(loadContentId, loadContentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadContentApi#deleteLoadContentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadContentId** | **Integer**| Id of the loadContent to remove tag from |
 **loadContentTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateLoadContentById"></a>
# **getDuplicateLoadContentById**
> LoadContent getDuplicateLoadContentById(loadContentId)

Get a duplicated a loadContent by id

Returns a duplicated loadContent identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadContentApi apiInstance = new LoadContentApi();
Integer loadContentId = 56; // Integer | Id of the loadContent to be duplicated.
try {
    LoadContent result = apiInstance.getDuplicateLoadContentById(loadContentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadContentApi#getDuplicateLoadContentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadContentId** | **Integer**| Id of the loadContent to be duplicated. |

### Return type

[**LoadContent**](LoadContent.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoadContentByFilter"></a>
# **getLoadContentByFilter**
> List&lt;LoadContent&gt; getLoadContentByFilter(filter, page, limit, sort)

Search loadContents by filter

Returns the list of loadContents that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadContentApi apiInstance = new LoadContentApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<LoadContent> result = apiInstance.getLoadContentByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadContentApi#getLoadContentByFilter");
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

[**List&lt;LoadContent&gt;**](LoadContent.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoadContentById"></a>
# **getLoadContentById**
> LoadContent getLoadContentById(loadContentId)

Get a loadContent by id

Returns the loadContent identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadContentApi apiInstance = new LoadContentApi();
Integer loadContentId = 56; // Integer | Id of the loadContent to be returned.
try {
    LoadContent result = apiInstance.getLoadContentById(loadContentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadContentApi#getLoadContentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadContentId** | **Integer**| Id of the loadContent to be returned. |

### Return type

[**LoadContent**](LoadContent.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoadContentFiles"></a>
# **getLoadContentFiles**
> getLoadContentFiles(loadContentId)

Get the files for a loadContent.

Get all existing loadContent files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadContentApi apiInstance = new LoadContentApi();
Integer loadContentId = 56; // Integer | Id of the loadContent to get files for
try {
    apiInstance.getLoadContentFiles(loadContentId);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadContentApi#getLoadContentFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadContentId** | **Integer**| Id of the loadContent to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoadContentTags"></a>
# **getLoadContentTags**
> getLoadContentTags(loadContentId)

Get the tags for a loadContent.

Get all existing loadContent tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadContentApi apiInstance = new LoadContentApi();
Integer loadContentId = 56; // Integer | Id of the loadContent to get tags for
try {
    apiInstance.getLoadContentTags(loadContentId);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadContentApi#getLoadContentTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadContentId** | **Integer**| Id of the loadContent to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLoadContentCustomFields"></a>
# **updateLoadContentCustomFields**
> updateLoadContentCustomFields(body)

Update a loadContent custom fields

Updates an existing loadContent custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoadContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoadContentApi apiInstance = new LoadContentApi();
LoadContent body = new LoadContent(); // LoadContent | LoadContent to be updated.
try {
    apiInstance.updateLoadContentCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadContentApi#updateLoadContentCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoadContent**](LoadContent.md)| LoadContent to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

