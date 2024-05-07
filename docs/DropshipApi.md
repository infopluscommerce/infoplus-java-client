# DropshipApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDropshipAudit**](DropshipApi.md#addDropshipAudit) | **PUT** /beta/dropship/{dropshipId}/audit/{dropshipAudit} | Add new audit for a dropship
[**addDropshipFile**](DropshipApi.md#addDropshipFile) | **POST** /beta/dropship/{dropshipId}/file/{fileName} | Attach a file to a dropship
[**addDropshipFileByURL**](DropshipApi.md#addDropshipFileByURL) | **POST** /beta/dropship/{dropshipId}/file | Attach a file to a dropship by URL.
[**addDropshipTag**](DropshipApi.md#addDropshipTag) | **PUT** /beta/dropship/{dropshipId}/tag/{dropshipTag} | Add new tags for a dropship.
[**deleteDropshipFile**](DropshipApi.md#deleteDropshipFile) | **DELETE** /beta/dropship/{dropshipId}/file/{fileId} | Delete a file for a dropship.
[**deleteDropshipTag**](DropshipApi.md#deleteDropshipTag) | **DELETE** /beta/dropship/{dropshipId}/tag/{dropshipTag} | Delete a tag for a dropship.
[**getDropshipByFilter**](DropshipApi.md#getDropshipByFilter) | **GET** /beta/dropship/search | Search dropships by filter
[**getDropshipById**](DropshipApi.md#getDropshipById) | **GET** /beta/dropship/{dropshipId} | Get a dropship by id
[**getDropshipFiles**](DropshipApi.md#getDropshipFiles) | **GET** /beta/dropship/{dropshipId}/file | Get the files for a dropship.
[**getDropshipTags**](DropshipApi.md#getDropshipTags) | **GET** /beta/dropship/{dropshipId}/tag | Get the tags for a dropship.
[**getDuplicateDropshipById**](DropshipApi.md#getDuplicateDropshipById) | **GET** /beta/dropship/duplicate/{dropshipId} | Get a duplicated a dropship by id
[**updateDropship**](DropshipApi.md#updateDropship) | **PUT** /beta/dropship | Update a dropship


<a name="addDropshipAudit"></a>
# **addDropshipAudit**
> addDropshipAudit(dropshipId, dropshipAudit)

Add new audit for a dropship

Adds an audit to an existing dropship.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DropshipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DropshipApi apiInstance = new DropshipApi();
Integer dropshipId = 56; // Integer | Id of the dropship to add an audit to
String dropshipAudit = "dropshipAudit_example"; // String | The audit to add
try {
    apiInstance.addDropshipAudit(dropshipId, dropshipAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling DropshipApi#addDropshipAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dropshipId** | **Integer**| Id of the dropship to add an audit to |
 **dropshipAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addDropshipFile"></a>
# **addDropshipFile**
> addDropshipFile(dropshipId, fileName)

Attach a file to a dropship

Adds a file to an existing dropship.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DropshipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DropshipApi apiInstance = new DropshipApi();
Integer dropshipId = 56; // Integer | Id of the dropship to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addDropshipFile(dropshipId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling DropshipApi#addDropshipFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dropshipId** | **Integer**| Id of the dropship to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addDropshipFileByURL"></a>
# **addDropshipFileByURL**
> addDropshipFileByURL(body, dropshipId)

Attach a file to a dropship by URL.

Adds a file to an existing dropship by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DropshipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DropshipApi apiInstance = new DropshipApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer dropshipId = 56; // Integer | Id of the dropship to add an file to
try {
    apiInstance.addDropshipFileByURL(body, dropshipId);
} catch (ApiException e) {
    System.err.println("Exception when calling DropshipApi#addDropshipFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **dropshipId** | **Integer**| Id of the dropship to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addDropshipTag"></a>
# **addDropshipTag**
> addDropshipTag(dropshipId, dropshipTag)

Add new tags for a dropship.

Adds a tag to an existing dropship.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DropshipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DropshipApi apiInstance = new DropshipApi();
Integer dropshipId = 56; // Integer | Id of the dropship to add a tag to
String dropshipTag = "dropshipTag_example"; // String | The tag to add
try {
    apiInstance.addDropshipTag(dropshipId, dropshipTag);
} catch (ApiException e) {
    System.err.println("Exception when calling DropshipApi#addDropshipTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dropshipId** | **Integer**| Id of the dropship to add a tag to |
 **dropshipTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDropshipFile"></a>
# **deleteDropshipFile**
> deleteDropshipFile(dropshipId, fileId)

Delete a file for a dropship.

Deletes an existing dropship file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DropshipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DropshipApi apiInstance = new DropshipApi();
Integer dropshipId = 56; // Integer | Id of the dropship to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteDropshipFile(dropshipId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling DropshipApi#deleteDropshipFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dropshipId** | **Integer**| Id of the dropship to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDropshipTag"></a>
# **deleteDropshipTag**
> deleteDropshipTag(dropshipId, dropshipTag)

Delete a tag for a dropship.

Deletes an existing dropship tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DropshipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DropshipApi apiInstance = new DropshipApi();
Integer dropshipId = 56; // Integer | Id of the dropship to remove tag from
String dropshipTag = "dropshipTag_example"; // String | The tag to delete
try {
    apiInstance.deleteDropshipTag(dropshipId, dropshipTag);
} catch (ApiException e) {
    System.err.println("Exception when calling DropshipApi#deleteDropshipTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dropshipId** | **Integer**| Id of the dropship to remove tag from |
 **dropshipTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDropshipByFilter"></a>
# **getDropshipByFilter**
> List&lt;Dropship&gt; getDropshipByFilter(filter, page, limit, sort)

Search dropships by filter

Returns the list of dropships that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DropshipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DropshipApi apiInstance = new DropshipApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Dropship> result = apiInstance.getDropshipByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DropshipApi#getDropshipByFilter");
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

[**List&lt;Dropship&gt;**](Dropship.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDropshipById"></a>
# **getDropshipById**
> Dropship getDropshipById(dropshipId)

Get a dropship by id

Returns the dropship identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DropshipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DropshipApi apiInstance = new DropshipApi();
Integer dropshipId = 56; // Integer | Id of the dropship to be returned.
try {
    Dropship result = apiInstance.getDropshipById(dropshipId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DropshipApi#getDropshipById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dropshipId** | **Integer**| Id of the dropship to be returned. |

### Return type

[**Dropship**](Dropship.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDropshipFiles"></a>
# **getDropshipFiles**
> getDropshipFiles(dropshipId)

Get the files for a dropship.

Get all existing dropship files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DropshipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DropshipApi apiInstance = new DropshipApi();
Integer dropshipId = 56; // Integer | Id of the dropship to get files for
try {
    apiInstance.getDropshipFiles(dropshipId);
} catch (ApiException e) {
    System.err.println("Exception when calling DropshipApi#getDropshipFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dropshipId** | **Integer**| Id of the dropship to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDropshipTags"></a>
# **getDropshipTags**
> getDropshipTags(dropshipId)

Get the tags for a dropship.

Get all existing dropship tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DropshipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DropshipApi apiInstance = new DropshipApi();
Integer dropshipId = 56; // Integer | Id of the dropship to get tags for
try {
    apiInstance.getDropshipTags(dropshipId);
} catch (ApiException e) {
    System.err.println("Exception when calling DropshipApi#getDropshipTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dropshipId** | **Integer**| Id of the dropship to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateDropshipById"></a>
# **getDuplicateDropshipById**
> Dropship getDuplicateDropshipById(dropshipId)

Get a duplicated a dropship by id

Returns a duplicated dropship identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DropshipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DropshipApi apiInstance = new DropshipApi();
Integer dropshipId = 56; // Integer | Id of the dropship to be duplicated.
try {
    Dropship result = apiInstance.getDuplicateDropshipById(dropshipId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DropshipApi#getDuplicateDropshipById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dropshipId** | **Integer**| Id of the dropship to be duplicated. |

### Return type

[**Dropship**](Dropship.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDropship"></a>
# **updateDropship**
> updateDropship(body)

Update a dropship

Updates an existing dropship using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DropshipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DropshipApi apiInstance = new DropshipApi();
Dropship body = new Dropship(); // Dropship | Dropship to be updated.
try {
    apiInstance.updateDropship(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DropshipApi#updateDropship");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Dropship**](Dropship.md)| Dropship to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

