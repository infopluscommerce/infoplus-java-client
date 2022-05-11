# OverrideReturnAddressApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOverrideReturnAddress**](OverrideReturnAddressApi.md#addOverrideReturnAddress) | **POST** /v3.0/overrideReturnAddress | Create an overrideReturnAddress
[**addOverrideReturnAddressAudit**](OverrideReturnAddressApi.md#addOverrideReturnAddressAudit) | **PUT** /v3.0/overrideReturnAddress/{overrideReturnAddressId}/audit/{overrideReturnAddressAudit} | Add new audit for an overrideReturnAddress
[**addOverrideReturnAddressFile**](OverrideReturnAddressApi.md#addOverrideReturnAddressFile) | **POST** /v3.0/overrideReturnAddress/{overrideReturnAddressId}/file/{fileName} | Attach a file to an overrideReturnAddress
[**addOverrideReturnAddressFileByURL**](OverrideReturnAddressApi.md#addOverrideReturnAddressFileByURL) | **POST** /v3.0/overrideReturnAddress/{overrideReturnAddressId}/file | Attach a file to an overrideReturnAddress by URL.
[**addOverrideReturnAddressTag**](OverrideReturnAddressApi.md#addOverrideReturnAddressTag) | **PUT** /v3.0/overrideReturnAddress/{overrideReturnAddressId}/tag/{overrideReturnAddressTag} | Add new tags for an overrideReturnAddress.
[**deleteOverrideReturnAddress**](OverrideReturnAddressApi.md#deleteOverrideReturnAddress) | **DELETE** /v3.0/overrideReturnAddress/{overrideReturnAddressId} | Delete an overrideReturnAddress
[**deleteOverrideReturnAddressFile**](OverrideReturnAddressApi.md#deleteOverrideReturnAddressFile) | **DELETE** /v3.0/overrideReturnAddress/{overrideReturnAddressId}/file/{fileId} | Delete a file for an overrideReturnAddress.
[**deleteOverrideReturnAddressTag**](OverrideReturnAddressApi.md#deleteOverrideReturnAddressTag) | **DELETE** /v3.0/overrideReturnAddress/{overrideReturnAddressId}/tag/{overrideReturnAddressTag} | Delete a tag for an overrideReturnAddress.
[**getDuplicateOverrideReturnAddressById**](OverrideReturnAddressApi.md#getDuplicateOverrideReturnAddressById) | **GET** /v3.0/overrideReturnAddress/duplicate/{overrideReturnAddressId} | Get a duplicated an overrideReturnAddress by id
[**getOverrideReturnAddressByFilter**](OverrideReturnAddressApi.md#getOverrideReturnAddressByFilter) | **GET** /v3.0/overrideReturnAddress/search | Search overrideReturnAddresses by filter
[**getOverrideReturnAddressById**](OverrideReturnAddressApi.md#getOverrideReturnAddressById) | **GET** /v3.0/overrideReturnAddress/{overrideReturnAddressId} | Get an overrideReturnAddress by id
[**getOverrideReturnAddressFiles**](OverrideReturnAddressApi.md#getOverrideReturnAddressFiles) | **GET** /v3.0/overrideReturnAddress/{overrideReturnAddressId}/file | Get the files for an overrideReturnAddress.
[**getOverrideReturnAddressTags**](OverrideReturnAddressApi.md#getOverrideReturnAddressTags) | **GET** /v3.0/overrideReturnAddress/{overrideReturnAddressId}/tag | Get the tags for an overrideReturnAddress.
[**updateOverrideReturnAddress**](OverrideReturnAddressApi.md#updateOverrideReturnAddress) | **PUT** /v3.0/overrideReturnAddress | Update an overrideReturnAddress
[**updateOverrideReturnAddressCustomFields**](OverrideReturnAddressApi.md#updateOverrideReturnAddressCustomFields) | **PUT** /v3.0/overrideReturnAddress/customFields | Update an overrideReturnAddress custom fields


<a name="addOverrideReturnAddress"></a>
# **addOverrideReturnAddress**
> OverrideReturnAddress addOverrideReturnAddress(body)

Create an overrideReturnAddress

Inserts a new overrideReturnAddress using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
OverrideReturnAddress body = new OverrideReturnAddress(); // OverrideReturnAddress | OverrideReturnAddress to be inserted.
try {
    OverrideReturnAddress result = apiInstance.addOverrideReturnAddress(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#addOverrideReturnAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OverrideReturnAddress**](OverrideReturnAddress.md)| OverrideReturnAddress to be inserted. |

### Return type

[**OverrideReturnAddress**](OverrideReturnAddress.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOverrideReturnAddressAudit"></a>
# **addOverrideReturnAddressAudit**
> addOverrideReturnAddressAudit(overrideReturnAddressId, overrideReturnAddressAudit)

Add new audit for an overrideReturnAddress

Adds an audit to an existing overrideReturnAddress.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
Integer overrideReturnAddressId = 56; // Integer | Id of the overrideReturnAddress to add an audit to
String overrideReturnAddressAudit = "overrideReturnAddressAudit_example"; // String | The audit to add
try {
    apiInstance.addOverrideReturnAddressAudit(overrideReturnAddressId, overrideReturnAddressAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#addOverrideReturnAddressAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overrideReturnAddressId** | **Integer**| Id of the overrideReturnAddress to add an audit to |
 **overrideReturnAddressAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOverrideReturnAddressFile"></a>
# **addOverrideReturnAddressFile**
> addOverrideReturnAddressFile(overrideReturnAddressId, fileName)

Attach a file to an overrideReturnAddress

Adds a file to an existing overrideReturnAddress.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
Integer overrideReturnAddressId = 56; // Integer | Id of the overrideReturnAddress to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addOverrideReturnAddressFile(overrideReturnAddressId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#addOverrideReturnAddressFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overrideReturnAddressId** | **Integer**| Id of the overrideReturnAddress to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addOverrideReturnAddressFileByURL"></a>
# **addOverrideReturnAddressFileByURL**
> addOverrideReturnAddressFileByURL(body, overrideReturnAddressId)

Attach a file to an overrideReturnAddress by URL.

Adds a file to an existing overrideReturnAddress by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer overrideReturnAddressId = 56; // Integer | Id of the overrideReturnAddress to add an file to
try {
    apiInstance.addOverrideReturnAddressFileByURL(body, overrideReturnAddressId);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#addOverrideReturnAddressFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **overrideReturnAddressId** | **Integer**| Id of the overrideReturnAddress to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOverrideReturnAddressTag"></a>
# **addOverrideReturnAddressTag**
> addOverrideReturnAddressTag(overrideReturnAddressId, overrideReturnAddressTag)

Add new tags for an overrideReturnAddress.

Adds a tag to an existing overrideReturnAddress.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
Integer overrideReturnAddressId = 56; // Integer | Id of the overrideReturnAddress to add a tag to
String overrideReturnAddressTag = "overrideReturnAddressTag_example"; // String | The tag to add
try {
    apiInstance.addOverrideReturnAddressTag(overrideReturnAddressId, overrideReturnAddressTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#addOverrideReturnAddressTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overrideReturnAddressId** | **Integer**| Id of the overrideReturnAddress to add a tag to |
 **overrideReturnAddressTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOverrideReturnAddress"></a>
# **deleteOverrideReturnAddress**
> deleteOverrideReturnAddress(overrideReturnAddressId)

Delete an overrideReturnAddress

Deletes the overrideReturnAddress identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
Integer overrideReturnAddressId = 56; // Integer | Id of the overrideReturnAddress to be deleted.
try {
    apiInstance.deleteOverrideReturnAddress(overrideReturnAddressId);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#deleteOverrideReturnAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overrideReturnAddressId** | **Integer**| Id of the overrideReturnAddress to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteOverrideReturnAddressFile"></a>
# **deleteOverrideReturnAddressFile**
> deleteOverrideReturnAddressFile(overrideReturnAddressId, fileId)

Delete a file for an overrideReturnAddress.

Deletes an existing overrideReturnAddress file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
Integer overrideReturnAddressId = 56; // Integer | Id of the overrideReturnAddress to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteOverrideReturnAddressFile(overrideReturnAddressId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#deleteOverrideReturnAddressFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overrideReturnAddressId** | **Integer**| Id of the overrideReturnAddress to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteOverrideReturnAddressTag"></a>
# **deleteOverrideReturnAddressTag**
> deleteOverrideReturnAddressTag(overrideReturnAddressId, overrideReturnAddressTag)

Delete a tag for an overrideReturnAddress.

Deletes an existing overrideReturnAddress tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
Integer overrideReturnAddressId = 56; // Integer | Id of the overrideReturnAddress to remove tag from
String overrideReturnAddressTag = "overrideReturnAddressTag_example"; // String | The tag to delete
try {
    apiInstance.deleteOverrideReturnAddressTag(overrideReturnAddressId, overrideReturnAddressTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#deleteOverrideReturnAddressTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overrideReturnAddressId** | **Integer**| Id of the overrideReturnAddress to remove tag from |
 **overrideReturnAddressTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateOverrideReturnAddressById"></a>
# **getDuplicateOverrideReturnAddressById**
> OverrideReturnAddress getDuplicateOverrideReturnAddressById(overrideReturnAddressId)

Get a duplicated an overrideReturnAddress by id

Returns a duplicated overrideReturnAddress identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
Integer overrideReturnAddressId = 56; // Integer | Id of the overrideReturnAddress to be duplicated.
try {
    OverrideReturnAddress result = apiInstance.getDuplicateOverrideReturnAddressById(overrideReturnAddressId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#getDuplicateOverrideReturnAddressById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overrideReturnAddressId** | **Integer**| Id of the overrideReturnAddress to be duplicated. |

### Return type

[**OverrideReturnAddress**](OverrideReturnAddress.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOverrideReturnAddressByFilter"></a>
# **getOverrideReturnAddressByFilter**
> List&lt;OverrideReturnAddress&gt; getOverrideReturnAddressByFilter(filter, page, limit, sort)

Search overrideReturnAddresses by filter

Returns the list of overrideReturnAddresses that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<OverrideReturnAddress> result = apiInstance.getOverrideReturnAddressByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#getOverrideReturnAddressByFilter");
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

[**List&lt;OverrideReturnAddress&gt;**](OverrideReturnAddress.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOverrideReturnAddressById"></a>
# **getOverrideReturnAddressById**
> OverrideReturnAddress getOverrideReturnAddressById(overrideReturnAddressId)

Get an overrideReturnAddress by id

Returns the overrideReturnAddress identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
Integer overrideReturnAddressId = 56; // Integer | Id of the overrideReturnAddress to be returned.
try {
    OverrideReturnAddress result = apiInstance.getOverrideReturnAddressById(overrideReturnAddressId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#getOverrideReturnAddressById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overrideReturnAddressId** | **Integer**| Id of the overrideReturnAddress to be returned. |

### Return type

[**OverrideReturnAddress**](OverrideReturnAddress.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOverrideReturnAddressFiles"></a>
# **getOverrideReturnAddressFiles**
> getOverrideReturnAddressFiles(overrideReturnAddressId)

Get the files for an overrideReturnAddress.

Get all existing overrideReturnAddress files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
Integer overrideReturnAddressId = 56; // Integer | Id of the overrideReturnAddress to get files for
try {
    apiInstance.getOverrideReturnAddressFiles(overrideReturnAddressId);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#getOverrideReturnAddressFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overrideReturnAddressId** | **Integer**| Id of the overrideReturnAddress to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOverrideReturnAddressTags"></a>
# **getOverrideReturnAddressTags**
> getOverrideReturnAddressTags(overrideReturnAddressId)

Get the tags for an overrideReturnAddress.

Get all existing overrideReturnAddress tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
Integer overrideReturnAddressId = 56; // Integer | Id of the overrideReturnAddress to get tags for
try {
    apiInstance.getOverrideReturnAddressTags(overrideReturnAddressId);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#getOverrideReturnAddressTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overrideReturnAddressId** | **Integer**| Id of the overrideReturnAddress to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOverrideReturnAddress"></a>
# **updateOverrideReturnAddress**
> updateOverrideReturnAddress(body)

Update an overrideReturnAddress

Updates an existing overrideReturnAddress using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
OverrideReturnAddress body = new OverrideReturnAddress(); // OverrideReturnAddress | OverrideReturnAddress to be updated.
try {
    apiInstance.updateOverrideReturnAddress(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#updateOverrideReturnAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OverrideReturnAddress**](OverrideReturnAddress.md)| OverrideReturnAddress to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOverrideReturnAddressCustomFields"></a>
# **updateOverrideReturnAddressCustomFields**
> updateOverrideReturnAddressCustomFields(body)

Update an overrideReturnAddress custom fields

Updates an existing overrideReturnAddress custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
OverrideReturnAddress body = new OverrideReturnAddress(); // OverrideReturnAddress | OverrideReturnAddress to be updated.
try {
    apiInstance.updateOverrideReturnAddressCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#updateOverrideReturnAddressCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OverrideReturnAddress**](OverrideReturnAddress.md)| OverrideReturnAddress to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

