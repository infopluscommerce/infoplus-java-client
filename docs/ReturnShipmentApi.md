# ReturnShipmentApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addReturnShipmentAudit**](ReturnShipmentApi.md#addReturnShipmentAudit) | **PUT** /beta/returnShipment/{returnShipmentId}/audit/{returnShipmentAudit} | Add new audit for a returnShipment
[**addReturnShipmentFile**](ReturnShipmentApi.md#addReturnShipmentFile) | **POST** /beta/returnShipment/{returnShipmentId}/file/{fileName} | Attach a file to a returnShipment
[**addReturnShipmentFileByURL**](ReturnShipmentApi.md#addReturnShipmentFileByURL) | **POST** /beta/returnShipment/{returnShipmentId}/file | Attach a file to a returnShipment by URL.
[**addReturnShipmentTag**](ReturnShipmentApi.md#addReturnShipmentTag) | **PUT** /beta/returnShipment/{returnShipmentId}/tag/{returnShipmentTag} | Add new tags for a returnShipment.
[**deleteReturnShipmentFile**](ReturnShipmentApi.md#deleteReturnShipmentFile) | **DELETE** /beta/returnShipment/{returnShipmentId}/file/{fileId} | Delete a file for a returnShipment.
[**deleteReturnShipmentTag**](ReturnShipmentApi.md#deleteReturnShipmentTag) | **DELETE** /beta/returnShipment/{returnShipmentId}/tag/{returnShipmentTag} | Delete a tag for a returnShipment.
[**getDuplicateReturnShipmentById**](ReturnShipmentApi.md#getDuplicateReturnShipmentById) | **GET** /beta/returnShipment/duplicate/{returnShipmentId} | Get a duplicated a returnShipment by id
[**getReturnShipmentByFilter**](ReturnShipmentApi.md#getReturnShipmentByFilter) | **GET** /beta/returnShipment/search | Search returnShipments by filter
[**getReturnShipmentById**](ReturnShipmentApi.md#getReturnShipmentById) | **GET** /beta/returnShipment/{returnShipmentId} | Get a returnShipment by id
[**getReturnShipmentFiles**](ReturnShipmentApi.md#getReturnShipmentFiles) | **GET** /beta/returnShipment/{returnShipmentId}/file | Get the files for a returnShipment.
[**getReturnShipmentTags**](ReturnShipmentApi.md#getReturnShipmentTags) | **GET** /beta/returnShipment/{returnShipmentId}/tag | Get the tags for a returnShipment.
[**updateReturnShipmentCustomFields**](ReturnShipmentApi.md#updateReturnShipmentCustomFields) | **PUT** /beta/returnShipment/customFields | Update a returnShipment custom fields


<a name="addReturnShipmentAudit"></a>
# **addReturnShipmentAudit**
> addReturnShipmentAudit(returnShipmentId, returnShipmentAudit)

Add new audit for a returnShipment

Adds an audit to an existing returnShipment.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnShipmentApi apiInstance = new ReturnShipmentApi();
Integer returnShipmentId = 56; // Integer | Id of the returnShipment to add an audit to
String returnShipmentAudit = "returnShipmentAudit_example"; // String | The audit to add
try {
    apiInstance.addReturnShipmentAudit(returnShipmentId, returnShipmentAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnShipmentApi#addReturnShipmentAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnShipmentId** | **Integer**| Id of the returnShipment to add an audit to |
 **returnShipmentAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addReturnShipmentFile"></a>
# **addReturnShipmentFile**
> addReturnShipmentFile(returnShipmentId, fileName)

Attach a file to a returnShipment

Adds a file to an existing returnShipment.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnShipmentApi apiInstance = new ReturnShipmentApi();
Integer returnShipmentId = 56; // Integer | Id of the returnShipment to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addReturnShipmentFile(returnShipmentId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnShipmentApi#addReturnShipmentFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnShipmentId** | **Integer**| Id of the returnShipment to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addReturnShipmentFileByURL"></a>
# **addReturnShipmentFileByURL**
> addReturnShipmentFileByURL(body, returnShipmentId)

Attach a file to a returnShipment by URL.

Adds a file to an existing returnShipment by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnShipmentApi apiInstance = new ReturnShipmentApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer returnShipmentId = 56; // Integer | Id of the returnShipment to add an file to
try {
    apiInstance.addReturnShipmentFileByURL(body, returnShipmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnShipmentApi#addReturnShipmentFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **returnShipmentId** | **Integer**| Id of the returnShipment to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addReturnShipmentTag"></a>
# **addReturnShipmentTag**
> addReturnShipmentTag(returnShipmentId, returnShipmentTag)

Add new tags for a returnShipment.

Adds a tag to an existing returnShipment.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnShipmentApi apiInstance = new ReturnShipmentApi();
Integer returnShipmentId = 56; // Integer | Id of the returnShipment to add a tag to
String returnShipmentTag = "returnShipmentTag_example"; // String | The tag to add
try {
    apiInstance.addReturnShipmentTag(returnShipmentId, returnShipmentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnShipmentApi#addReturnShipmentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnShipmentId** | **Integer**| Id of the returnShipment to add a tag to |
 **returnShipmentTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReturnShipmentFile"></a>
# **deleteReturnShipmentFile**
> deleteReturnShipmentFile(returnShipmentId, fileId)

Delete a file for a returnShipment.

Deletes an existing returnShipment file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnShipmentApi apiInstance = new ReturnShipmentApi();
Integer returnShipmentId = 56; // Integer | Id of the returnShipment to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteReturnShipmentFile(returnShipmentId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnShipmentApi#deleteReturnShipmentFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnShipmentId** | **Integer**| Id of the returnShipment to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteReturnShipmentTag"></a>
# **deleteReturnShipmentTag**
> deleteReturnShipmentTag(returnShipmentId, returnShipmentTag)

Delete a tag for a returnShipment.

Deletes an existing returnShipment tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnShipmentApi apiInstance = new ReturnShipmentApi();
Integer returnShipmentId = 56; // Integer | Id of the returnShipment to remove tag from
String returnShipmentTag = "returnShipmentTag_example"; // String | The tag to delete
try {
    apiInstance.deleteReturnShipmentTag(returnShipmentId, returnShipmentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnShipmentApi#deleteReturnShipmentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnShipmentId** | **Integer**| Id of the returnShipment to remove tag from |
 **returnShipmentTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateReturnShipmentById"></a>
# **getDuplicateReturnShipmentById**
> ReturnShipment getDuplicateReturnShipmentById(returnShipmentId)

Get a duplicated a returnShipment by id

Returns a duplicated returnShipment identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnShipmentApi apiInstance = new ReturnShipmentApi();
Integer returnShipmentId = 56; // Integer | Id of the returnShipment to be duplicated.
try {
    ReturnShipment result = apiInstance.getDuplicateReturnShipmentById(returnShipmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnShipmentApi#getDuplicateReturnShipmentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnShipmentId** | **Integer**| Id of the returnShipment to be duplicated. |

### Return type

[**ReturnShipment**](ReturnShipment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReturnShipmentByFilter"></a>
# **getReturnShipmentByFilter**
> List&lt;ReturnShipment&gt; getReturnShipmentByFilter(filter, page, limit, sort)

Search returnShipments by filter

Returns the list of returnShipments that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnShipmentApi apiInstance = new ReturnShipmentApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ReturnShipment> result = apiInstance.getReturnShipmentByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnShipmentApi#getReturnShipmentByFilter");
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

[**List&lt;ReturnShipment&gt;**](ReturnShipment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReturnShipmentById"></a>
# **getReturnShipmentById**
> ReturnShipment getReturnShipmentById(returnShipmentId)

Get a returnShipment by id

Returns the returnShipment identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnShipmentApi apiInstance = new ReturnShipmentApi();
Integer returnShipmentId = 56; // Integer | Id of the returnShipment to be returned.
try {
    ReturnShipment result = apiInstance.getReturnShipmentById(returnShipmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnShipmentApi#getReturnShipmentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnShipmentId** | **Integer**| Id of the returnShipment to be returned. |

### Return type

[**ReturnShipment**](ReturnShipment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReturnShipmentFiles"></a>
# **getReturnShipmentFiles**
> getReturnShipmentFiles(returnShipmentId)

Get the files for a returnShipment.

Get all existing returnShipment files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnShipmentApi apiInstance = new ReturnShipmentApi();
Integer returnShipmentId = 56; // Integer | Id of the returnShipment to get files for
try {
    apiInstance.getReturnShipmentFiles(returnShipmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnShipmentApi#getReturnShipmentFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnShipmentId** | **Integer**| Id of the returnShipment to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReturnShipmentTags"></a>
# **getReturnShipmentTags**
> getReturnShipmentTags(returnShipmentId)

Get the tags for a returnShipment.

Get all existing returnShipment tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnShipmentApi apiInstance = new ReturnShipmentApi();
Integer returnShipmentId = 56; // Integer | Id of the returnShipment to get tags for
try {
    apiInstance.getReturnShipmentTags(returnShipmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnShipmentApi#getReturnShipmentTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnShipmentId** | **Integer**| Id of the returnShipment to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateReturnShipmentCustomFields"></a>
# **updateReturnShipmentCustomFields**
> updateReturnShipmentCustomFields(body)

Update a returnShipment custom fields

Updates an existing returnShipment custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnShipmentApi apiInstance = new ReturnShipmentApi();
ReturnShipment body = new ReturnShipment(); // ReturnShipment | ReturnShipment to be updated.
try {
    apiInstance.updateReturnShipmentCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnShipmentApi#updateReturnShipmentCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReturnShipment**](ReturnShipment.md)| ReturnShipment to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

