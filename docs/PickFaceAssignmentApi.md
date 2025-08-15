# PickFaceAssignmentApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPickFaceAssignment**](PickFaceAssignmentApi.md#addPickFaceAssignment) | **POST** /beta/pickFaceAssignment | Create a pickFaceAssignment
[**addPickFaceAssignmentAudit**](PickFaceAssignmentApi.md#addPickFaceAssignmentAudit) | **PUT** /beta/pickFaceAssignment/{pickFaceAssignmentId}/audit/{pickFaceAssignmentAudit} | Add new audit for a pickFaceAssignment
[**addPickFaceAssignmentFile**](PickFaceAssignmentApi.md#addPickFaceAssignmentFile) | **POST** /beta/pickFaceAssignment/{pickFaceAssignmentId}/file/{fileName} | Attach a file to a pickFaceAssignment
[**addPickFaceAssignmentFileByURL**](PickFaceAssignmentApi.md#addPickFaceAssignmentFileByURL) | **POST** /beta/pickFaceAssignment/{pickFaceAssignmentId}/file | Attach a file to a pickFaceAssignment by URL.
[**addPickFaceAssignmentTag**](PickFaceAssignmentApi.md#addPickFaceAssignmentTag) | **PUT** /beta/pickFaceAssignment/{pickFaceAssignmentId}/tag/{pickFaceAssignmentTag} | Add new tags for a pickFaceAssignment.
[**deletePickFaceAssignment**](PickFaceAssignmentApi.md#deletePickFaceAssignment) | **DELETE** /beta/pickFaceAssignment/{pickFaceAssignmentId} | Delete a pickFaceAssignment
[**deletePickFaceAssignmentFile**](PickFaceAssignmentApi.md#deletePickFaceAssignmentFile) | **DELETE** /beta/pickFaceAssignment/{pickFaceAssignmentId}/file/{fileId} | Delete a file for a pickFaceAssignment.
[**deletePickFaceAssignmentTag**](PickFaceAssignmentApi.md#deletePickFaceAssignmentTag) | **DELETE** /beta/pickFaceAssignment/{pickFaceAssignmentId}/tag/{pickFaceAssignmentTag} | Delete a tag for a pickFaceAssignment.
[**getDuplicatePickFaceAssignmentById**](PickFaceAssignmentApi.md#getDuplicatePickFaceAssignmentById) | **GET** /beta/pickFaceAssignment/duplicate/{pickFaceAssignmentId} | Get a duplicated a pickFaceAssignment by id
[**getPickFaceAssignmentByFilter**](PickFaceAssignmentApi.md#getPickFaceAssignmentByFilter) | **GET** /beta/pickFaceAssignment/search | Search pickFaceAssignments by filter
[**getPickFaceAssignmentById**](PickFaceAssignmentApi.md#getPickFaceAssignmentById) | **GET** /beta/pickFaceAssignment/{pickFaceAssignmentId} | Get a pickFaceAssignment by id
[**getPickFaceAssignmentFiles**](PickFaceAssignmentApi.md#getPickFaceAssignmentFiles) | **GET** /beta/pickFaceAssignment/{pickFaceAssignmentId}/file | Get the files for a pickFaceAssignment.
[**getPickFaceAssignmentTags**](PickFaceAssignmentApi.md#getPickFaceAssignmentTags) | **GET** /beta/pickFaceAssignment/{pickFaceAssignmentId}/tag | Get the tags for a pickFaceAssignment.
[**updatePickFaceAssignment**](PickFaceAssignmentApi.md#updatePickFaceAssignment) | **PUT** /beta/pickFaceAssignment | Update a pickFaceAssignment
[**updatePickFaceAssignmentCustomFields**](PickFaceAssignmentApi.md#updatePickFaceAssignmentCustomFields) | **PUT** /beta/pickFaceAssignment/customFields | Update a pickFaceAssignment custom fields


<a name="addPickFaceAssignment"></a>
# **addPickFaceAssignment**
> PickFaceAssignment addPickFaceAssignment(body)

Create a pickFaceAssignment

Inserts a new pickFaceAssignment using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PickFaceAssignmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PickFaceAssignmentApi apiInstance = new PickFaceAssignmentApi();
PickFaceAssignment body = new PickFaceAssignment(); // PickFaceAssignment | PickFaceAssignment to be inserted.
try {
    PickFaceAssignment result = apiInstance.addPickFaceAssignment(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PickFaceAssignmentApi#addPickFaceAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PickFaceAssignment**](PickFaceAssignment.md)| PickFaceAssignment to be inserted. |

### Return type

[**PickFaceAssignment**](PickFaceAssignment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPickFaceAssignmentAudit"></a>
# **addPickFaceAssignmentAudit**
> addPickFaceAssignmentAudit(pickFaceAssignmentId, pickFaceAssignmentAudit)

Add new audit for a pickFaceAssignment

Adds an audit to an existing pickFaceAssignment.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PickFaceAssignmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PickFaceAssignmentApi apiInstance = new PickFaceAssignmentApi();
Integer pickFaceAssignmentId = 56; // Integer | Id of the pickFaceAssignment to add an audit to
String pickFaceAssignmentAudit = "pickFaceAssignmentAudit_example"; // String | The audit to add
try {
    apiInstance.addPickFaceAssignmentAudit(pickFaceAssignmentId, pickFaceAssignmentAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling PickFaceAssignmentApi#addPickFaceAssignmentAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pickFaceAssignmentId** | **Integer**| Id of the pickFaceAssignment to add an audit to |
 **pickFaceAssignmentAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPickFaceAssignmentFile"></a>
# **addPickFaceAssignmentFile**
> addPickFaceAssignmentFile(pickFaceAssignmentId, fileName)

Attach a file to a pickFaceAssignment

Adds a file to an existing pickFaceAssignment.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PickFaceAssignmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PickFaceAssignmentApi apiInstance = new PickFaceAssignmentApi();
Integer pickFaceAssignmentId = 56; // Integer | Id of the pickFaceAssignment to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addPickFaceAssignmentFile(pickFaceAssignmentId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling PickFaceAssignmentApi#addPickFaceAssignmentFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pickFaceAssignmentId** | **Integer**| Id of the pickFaceAssignment to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addPickFaceAssignmentFileByURL"></a>
# **addPickFaceAssignmentFileByURL**
> addPickFaceAssignmentFileByURL(body, pickFaceAssignmentId)

Attach a file to a pickFaceAssignment by URL.

Adds a file to an existing pickFaceAssignment by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PickFaceAssignmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PickFaceAssignmentApi apiInstance = new PickFaceAssignmentApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer pickFaceAssignmentId = 56; // Integer | Id of the pickFaceAssignment to add an file to
try {
    apiInstance.addPickFaceAssignmentFileByURL(body, pickFaceAssignmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling PickFaceAssignmentApi#addPickFaceAssignmentFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **pickFaceAssignmentId** | **Integer**| Id of the pickFaceAssignment to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPickFaceAssignmentTag"></a>
# **addPickFaceAssignmentTag**
> addPickFaceAssignmentTag(pickFaceAssignmentId, pickFaceAssignmentTag)

Add new tags for a pickFaceAssignment.

Adds a tag to an existing pickFaceAssignment.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PickFaceAssignmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PickFaceAssignmentApi apiInstance = new PickFaceAssignmentApi();
Integer pickFaceAssignmentId = 56; // Integer | Id of the pickFaceAssignment to add a tag to
String pickFaceAssignmentTag = "pickFaceAssignmentTag_example"; // String | The tag to add
try {
    apiInstance.addPickFaceAssignmentTag(pickFaceAssignmentId, pickFaceAssignmentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling PickFaceAssignmentApi#addPickFaceAssignmentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pickFaceAssignmentId** | **Integer**| Id of the pickFaceAssignment to add a tag to |
 **pickFaceAssignmentTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePickFaceAssignment"></a>
# **deletePickFaceAssignment**
> deletePickFaceAssignment(pickFaceAssignmentId)

Delete a pickFaceAssignment

Deletes the pickFaceAssignment identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PickFaceAssignmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PickFaceAssignmentApi apiInstance = new PickFaceAssignmentApi();
Integer pickFaceAssignmentId = 56; // Integer | Id of the pickFaceAssignment to be deleted.
try {
    apiInstance.deletePickFaceAssignment(pickFaceAssignmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling PickFaceAssignmentApi#deletePickFaceAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pickFaceAssignmentId** | **Integer**| Id of the pickFaceAssignment to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePickFaceAssignmentFile"></a>
# **deletePickFaceAssignmentFile**
> deletePickFaceAssignmentFile(pickFaceAssignmentId, fileId)

Delete a file for a pickFaceAssignment.

Deletes an existing pickFaceAssignment file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PickFaceAssignmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PickFaceAssignmentApi apiInstance = new PickFaceAssignmentApi();
Integer pickFaceAssignmentId = 56; // Integer | Id of the pickFaceAssignment to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deletePickFaceAssignmentFile(pickFaceAssignmentId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling PickFaceAssignmentApi#deletePickFaceAssignmentFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pickFaceAssignmentId** | **Integer**| Id of the pickFaceAssignment to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePickFaceAssignmentTag"></a>
# **deletePickFaceAssignmentTag**
> deletePickFaceAssignmentTag(pickFaceAssignmentId, pickFaceAssignmentTag)

Delete a tag for a pickFaceAssignment.

Deletes an existing pickFaceAssignment tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PickFaceAssignmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PickFaceAssignmentApi apiInstance = new PickFaceAssignmentApi();
Integer pickFaceAssignmentId = 56; // Integer | Id of the pickFaceAssignment to remove tag from
String pickFaceAssignmentTag = "pickFaceAssignmentTag_example"; // String | The tag to delete
try {
    apiInstance.deletePickFaceAssignmentTag(pickFaceAssignmentId, pickFaceAssignmentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling PickFaceAssignmentApi#deletePickFaceAssignmentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pickFaceAssignmentId** | **Integer**| Id of the pickFaceAssignment to remove tag from |
 **pickFaceAssignmentTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicatePickFaceAssignmentById"></a>
# **getDuplicatePickFaceAssignmentById**
> PickFaceAssignment getDuplicatePickFaceAssignmentById(pickFaceAssignmentId)

Get a duplicated a pickFaceAssignment by id

Returns a duplicated pickFaceAssignment identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PickFaceAssignmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PickFaceAssignmentApi apiInstance = new PickFaceAssignmentApi();
Integer pickFaceAssignmentId = 56; // Integer | Id of the pickFaceAssignment to be duplicated.
try {
    PickFaceAssignment result = apiInstance.getDuplicatePickFaceAssignmentById(pickFaceAssignmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PickFaceAssignmentApi#getDuplicatePickFaceAssignmentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pickFaceAssignmentId** | **Integer**| Id of the pickFaceAssignment to be duplicated. |

### Return type

[**PickFaceAssignment**](PickFaceAssignment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPickFaceAssignmentByFilter"></a>
# **getPickFaceAssignmentByFilter**
> List&lt;PickFaceAssignment&gt; getPickFaceAssignmentByFilter(filter, page, limit, sort)

Search pickFaceAssignments by filter

Returns the list of pickFaceAssignments that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PickFaceAssignmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PickFaceAssignmentApi apiInstance = new PickFaceAssignmentApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<PickFaceAssignment> result = apiInstance.getPickFaceAssignmentByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PickFaceAssignmentApi#getPickFaceAssignmentByFilter");
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

[**List&lt;PickFaceAssignment&gt;**](PickFaceAssignment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPickFaceAssignmentById"></a>
# **getPickFaceAssignmentById**
> PickFaceAssignment getPickFaceAssignmentById(pickFaceAssignmentId)

Get a pickFaceAssignment by id

Returns the pickFaceAssignment identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PickFaceAssignmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PickFaceAssignmentApi apiInstance = new PickFaceAssignmentApi();
Integer pickFaceAssignmentId = 56; // Integer | Id of the pickFaceAssignment to be returned.
try {
    PickFaceAssignment result = apiInstance.getPickFaceAssignmentById(pickFaceAssignmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PickFaceAssignmentApi#getPickFaceAssignmentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pickFaceAssignmentId** | **Integer**| Id of the pickFaceAssignment to be returned. |

### Return type

[**PickFaceAssignment**](PickFaceAssignment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPickFaceAssignmentFiles"></a>
# **getPickFaceAssignmentFiles**
> getPickFaceAssignmentFiles(pickFaceAssignmentId)

Get the files for a pickFaceAssignment.

Get all existing pickFaceAssignment files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PickFaceAssignmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PickFaceAssignmentApi apiInstance = new PickFaceAssignmentApi();
Integer pickFaceAssignmentId = 56; // Integer | Id of the pickFaceAssignment to get files for
try {
    apiInstance.getPickFaceAssignmentFiles(pickFaceAssignmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling PickFaceAssignmentApi#getPickFaceAssignmentFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pickFaceAssignmentId** | **Integer**| Id of the pickFaceAssignment to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPickFaceAssignmentTags"></a>
# **getPickFaceAssignmentTags**
> getPickFaceAssignmentTags(pickFaceAssignmentId)

Get the tags for a pickFaceAssignment.

Get all existing pickFaceAssignment tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PickFaceAssignmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PickFaceAssignmentApi apiInstance = new PickFaceAssignmentApi();
Integer pickFaceAssignmentId = 56; // Integer | Id of the pickFaceAssignment to get tags for
try {
    apiInstance.getPickFaceAssignmentTags(pickFaceAssignmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling PickFaceAssignmentApi#getPickFaceAssignmentTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pickFaceAssignmentId** | **Integer**| Id of the pickFaceAssignment to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePickFaceAssignment"></a>
# **updatePickFaceAssignment**
> updatePickFaceAssignment(body)

Update a pickFaceAssignment

Updates an existing pickFaceAssignment using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PickFaceAssignmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PickFaceAssignmentApi apiInstance = new PickFaceAssignmentApi();
PickFaceAssignment body = new PickFaceAssignment(); // PickFaceAssignment | PickFaceAssignment to be updated.
try {
    apiInstance.updatePickFaceAssignment(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PickFaceAssignmentApi#updatePickFaceAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PickFaceAssignment**](PickFaceAssignment.md)| PickFaceAssignment to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePickFaceAssignmentCustomFields"></a>
# **updatePickFaceAssignmentCustomFields**
> updatePickFaceAssignmentCustomFields(body)

Update a pickFaceAssignment custom fields

Updates an existing pickFaceAssignment custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PickFaceAssignmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PickFaceAssignmentApi apiInstance = new PickFaceAssignmentApi();
PickFaceAssignment body = new PickFaceAssignment(); // PickFaceAssignment | PickFaceAssignment to be updated.
try {
    apiInstance.updatePickFaceAssignmentCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PickFaceAssignmentApi#updatePickFaceAssignmentCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PickFaceAssignment**](PickFaceAssignment.md)| PickFaceAssignment to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

