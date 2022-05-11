# Gs1128LabelApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGs1128LabelAudit**](Gs1128LabelApi.md#addGs1128LabelAudit) | **PUT** /v3.0/gs1128Label/{gs1128LabelId}/audit/{gs1128LabelAudit} | Add new audit for a gs1128Label
[**addGs1128LabelFile**](Gs1128LabelApi.md#addGs1128LabelFile) | **POST** /v3.0/gs1128Label/{gs1128LabelId}/file/{fileName} | Attach a file to a gs1128Label
[**addGs1128LabelFileByURL**](Gs1128LabelApi.md#addGs1128LabelFileByURL) | **POST** /v3.0/gs1128Label/{gs1128LabelId}/file | Attach a file to a gs1128Label by URL.
[**addGs1128LabelTag**](Gs1128LabelApi.md#addGs1128LabelTag) | **PUT** /v3.0/gs1128Label/{gs1128LabelId}/tag/{gs1128LabelTag} | Add new tags for a gs1128Label.
[**deleteGs1128Label**](Gs1128LabelApi.md#deleteGs1128Label) | **DELETE** /v3.0/gs1128Label/{gs1128LabelId} | Delete a gs1128Label
[**deleteGs1128LabelFile**](Gs1128LabelApi.md#deleteGs1128LabelFile) | **DELETE** /v3.0/gs1128Label/{gs1128LabelId}/file/{fileId} | Delete a file for a gs1128Label.
[**deleteGs1128LabelTag**](Gs1128LabelApi.md#deleteGs1128LabelTag) | **DELETE** /v3.0/gs1128Label/{gs1128LabelId}/tag/{gs1128LabelTag} | Delete a tag for a gs1128Label.
[**getDuplicateGs1128LabelById**](Gs1128LabelApi.md#getDuplicateGs1128LabelById) | **GET** /v3.0/gs1128Label/duplicate/{gs1128LabelId} | Get a duplicated a gs1128Label by id
[**getGs1128LabelByFilter**](Gs1128LabelApi.md#getGs1128LabelByFilter) | **GET** /v3.0/gs1128Label/search | Search gs1128Labels by filter
[**getGs1128LabelById**](Gs1128LabelApi.md#getGs1128LabelById) | **GET** /v3.0/gs1128Label/{gs1128LabelId} | Get a gs1128Label by id
[**getGs1128LabelFiles**](Gs1128LabelApi.md#getGs1128LabelFiles) | **GET** /v3.0/gs1128Label/{gs1128LabelId}/file | Get the files for a gs1128Label.
[**getGs1128LabelTags**](Gs1128LabelApi.md#getGs1128LabelTags) | **GET** /v3.0/gs1128Label/{gs1128LabelId}/tag | Get the tags for a gs1128Label.
[**updateGs1128LabelCustomFields**](Gs1128LabelApi.md#updateGs1128LabelCustomFields) | **PUT** /v3.0/gs1128Label/customFields | Update a gs1128Label custom fields


<a name="addGs1128LabelAudit"></a>
# **addGs1128LabelAudit**
> addGs1128LabelAudit(gs1128LabelId, gs1128LabelAudit)

Add new audit for a gs1128Label

Adds an audit to an existing gs1128Label.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128LabelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128LabelApi apiInstance = new Gs1128LabelApi();
Integer gs1128LabelId = 56; // Integer | Id of the gs1128Label to add an audit to
String gs1128LabelAudit = "gs1128LabelAudit_example"; // String | The audit to add
try {
    apiInstance.addGs1128LabelAudit(gs1128LabelId, gs1128LabelAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128LabelApi#addGs1128LabelAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gs1128LabelId** | **Integer**| Id of the gs1128Label to add an audit to |
 **gs1128LabelAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addGs1128LabelFile"></a>
# **addGs1128LabelFile**
> addGs1128LabelFile(gs1128LabelId, fileName)

Attach a file to a gs1128Label

Adds a file to an existing gs1128Label.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128LabelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128LabelApi apiInstance = new Gs1128LabelApi();
Integer gs1128LabelId = 56; // Integer | Id of the gs1128Label to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addGs1128LabelFile(gs1128LabelId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128LabelApi#addGs1128LabelFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gs1128LabelId** | **Integer**| Id of the gs1128Label to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addGs1128LabelFileByURL"></a>
# **addGs1128LabelFileByURL**
> addGs1128LabelFileByURL(body, gs1128LabelId)

Attach a file to a gs1128Label by URL.

Adds a file to an existing gs1128Label by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128LabelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128LabelApi apiInstance = new Gs1128LabelApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer gs1128LabelId = 56; // Integer | Id of the gs1128Label to add an file to
try {
    apiInstance.addGs1128LabelFileByURL(body, gs1128LabelId);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128LabelApi#addGs1128LabelFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **gs1128LabelId** | **Integer**| Id of the gs1128Label to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addGs1128LabelTag"></a>
# **addGs1128LabelTag**
> addGs1128LabelTag(gs1128LabelId, gs1128LabelTag)

Add new tags for a gs1128Label.

Adds a tag to an existing gs1128Label.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128LabelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128LabelApi apiInstance = new Gs1128LabelApi();
Integer gs1128LabelId = 56; // Integer | Id of the gs1128Label to add a tag to
String gs1128LabelTag = "gs1128LabelTag_example"; // String | The tag to add
try {
    apiInstance.addGs1128LabelTag(gs1128LabelId, gs1128LabelTag);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128LabelApi#addGs1128LabelTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gs1128LabelId** | **Integer**| Id of the gs1128Label to add a tag to |
 **gs1128LabelTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGs1128Label"></a>
# **deleteGs1128Label**
> deleteGs1128Label(gs1128LabelId)

Delete a gs1128Label

Deletes the gs1128Label identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128LabelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128LabelApi apiInstance = new Gs1128LabelApi();
Integer gs1128LabelId = 56; // Integer | Id of the gs1128Label to be deleted.
try {
    apiInstance.deleteGs1128Label(gs1128LabelId);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128LabelApi#deleteGs1128Label");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gs1128LabelId** | **Integer**| Id of the gs1128Label to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteGs1128LabelFile"></a>
# **deleteGs1128LabelFile**
> deleteGs1128LabelFile(gs1128LabelId, fileId)

Delete a file for a gs1128Label.

Deletes an existing gs1128Label file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128LabelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128LabelApi apiInstance = new Gs1128LabelApi();
Integer gs1128LabelId = 56; // Integer | Id of the gs1128Label to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteGs1128LabelFile(gs1128LabelId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128LabelApi#deleteGs1128LabelFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gs1128LabelId** | **Integer**| Id of the gs1128Label to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteGs1128LabelTag"></a>
# **deleteGs1128LabelTag**
> deleteGs1128LabelTag(gs1128LabelId, gs1128LabelTag)

Delete a tag for a gs1128Label.

Deletes an existing gs1128Label tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128LabelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128LabelApi apiInstance = new Gs1128LabelApi();
Integer gs1128LabelId = 56; // Integer | Id of the gs1128Label to remove tag from
String gs1128LabelTag = "gs1128LabelTag_example"; // String | The tag to delete
try {
    apiInstance.deleteGs1128LabelTag(gs1128LabelId, gs1128LabelTag);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128LabelApi#deleteGs1128LabelTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gs1128LabelId** | **Integer**| Id of the gs1128Label to remove tag from |
 **gs1128LabelTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateGs1128LabelById"></a>
# **getDuplicateGs1128LabelById**
> GS1128Label getDuplicateGs1128LabelById(gs1128LabelId)

Get a duplicated a gs1128Label by id

Returns a duplicated gs1128Label identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128LabelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128LabelApi apiInstance = new Gs1128LabelApi();
Integer gs1128LabelId = 56; // Integer | Id of the gs1128Label to be duplicated.
try {
    GS1128Label result = apiInstance.getDuplicateGs1128LabelById(gs1128LabelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128LabelApi#getDuplicateGs1128LabelById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gs1128LabelId** | **Integer**| Id of the gs1128Label to be duplicated. |

### Return type

[**GS1128Label**](GS1128Label.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGs1128LabelByFilter"></a>
# **getGs1128LabelByFilter**
> List&lt;GS1128Label&gt; getGs1128LabelByFilter(filter, page, limit, sort)

Search gs1128Labels by filter

Returns the list of gs1128Labels that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128LabelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128LabelApi apiInstance = new Gs1128LabelApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<GS1128Label> result = apiInstance.getGs1128LabelByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128LabelApi#getGs1128LabelByFilter");
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

[**List&lt;GS1128Label&gt;**](GS1128Label.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGs1128LabelById"></a>
# **getGs1128LabelById**
> GS1128Label getGs1128LabelById(gs1128LabelId)

Get a gs1128Label by id

Returns the gs1128Label identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128LabelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128LabelApi apiInstance = new Gs1128LabelApi();
Integer gs1128LabelId = 56; // Integer | Id of the gs1128Label to be returned.
try {
    GS1128Label result = apiInstance.getGs1128LabelById(gs1128LabelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128LabelApi#getGs1128LabelById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gs1128LabelId** | **Integer**| Id of the gs1128Label to be returned. |

### Return type

[**GS1128Label**](GS1128Label.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGs1128LabelFiles"></a>
# **getGs1128LabelFiles**
> getGs1128LabelFiles(gs1128LabelId)

Get the files for a gs1128Label.

Get all existing gs1128Label files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128LabelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128LabelApi apiInstance = new Gs1128LabelApi();
Integer gs1128LabelId = 56; // Integer | Id of the gs1128Label to get files for
try {
    apiInstance.getGs1128LabelFiles(gs1128LabelId);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128LabelApi#getGs1128LabelFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gs1128LabelId** | **Integer**| Id of the gs1128Label to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGs1128LabelTags"></a>
# **getGs1128LabelTags**
> getGs1128LabelTags(gs1128LabelId)

Get the tags for a gs1128Label.

Get all existing gs1128Label tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128LabelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128LabelApi apiInstance = new Gs1128LabelApi();
Integer gs1128LabelId = 56; // Integer | Id of the gs1128Label to get tags for
try {
    apiInstance.getGs1128LabelTags(gs1128LabelId);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128LabelApi#getGs1128LabelTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gs1128LabelId** | **Integer**| Id of the gs1128Label to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateGs1128LabelCustomFields"></a>
# **updateGs1128LabelCustomFields**
> updateGs1128LabelCustomFields(body)

Update a gs1128Label custom fields

Updates an existing gs1128Label custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.Gs1128LabelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

Gs1128LabelApi apiInstance = new Gs1128LabelApi();
GS1128Label body = new GS1128Label(); // GS1128Label | Gs1128Label to be updated.
try {
    apiInstance.updateGs1128LabelCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling Gs1128LabelApi#updateGs1128LabelCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GS1128Label**](GS1128Label.md)| Gs1128Label to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

