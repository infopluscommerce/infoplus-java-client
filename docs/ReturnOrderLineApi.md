# ReturnOrderLineApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addReturnOrderLineAudit**](ReturnOrderLineApi.md#addReturnOrderLineAudit) | **PUT** /beta/returnOrderLine/{returnOrderLineId}/audit/{returnOrderLineAudit} | Add new audit for a returnOrderLine
[**addReturnOrderLineFile**](ReturnOrderLineApi.md#addReturnOrderLineFile) | **POST** /beta/returnOrderLine/{returnOrderLineId}/file/{fileName} | Attach a file to a returnOrderLine
[**addReturnOrderLineFileByURL**](ReturnOrderLineApi.md#addReturnOrderLineFileByURL) | **POST** /beta/returnOrderLine/{returnOrderLineId}/file | Attach a file to a returnOrderLine by URL.
[**addReturnOrderLineTag**](ReturnOrderLineApi.md#addReturnOrderLineTag) | **PUT** /beta/returnOrderLine/{returnOrderLineId}/tag/{returnOrderLineTag} | Add new tags for a returnOrderLine.
[**deleteReturnOrderLineFile**](ReturnOrderLineApi.md#deleteReturnOrderLineFile) | **DELETE** /beta/returnOrderLine/{returnOrderLineId}/file/{fileId} | Delete a file for a returnOrderLine.
[**deleteReturnOrderLineTag**](ReturnOrderLineApi.md#deleteReturnOrderLineTag) | **DELETE** /beta/returnOrderLine/{returnOrderLineId}/tag/{returnOrderLineTag} | Delete a tag for a returnOrderLine.
[**getDuplicateReturnOrderLineById**](ReturnOrderLineApi.md#getDuplicateReturnOrderLineById) | **GET** /beta/returnOrderLine/duplicate/{returnOrderLineId} | Get a duplicated a returnOrderLine by id
[**getReturnOrderLineByFilter**](ReturnOrderLineApi.md#getReturnOrderLineByFilter) | **GET** /beta/returnOrderLine/search | Search returnOrderLines by filter
[**getReturnOrderLineById**](ReturnOrderLineApi.md#getReturnOrderLineById) | **GET** /beta/returnOrderLine/{returnOrderLineId} | Get a returnOrderLine by id
[**getReturnOrderLineFiles**](ReturnOrderLineApi.md#getReturnOrderLineFiles) | **GET** /beta/returnOrderLine/{returnOrderLineId}/file | Get the files for a returnOrderLine.
[**getReturnOrderLineTags**](ReturnOrderLineApi.md#getReturnOrderLineTags) | **GET** /beta/returnOrderLine/{returnOrderLineId}/tag | Get the tags for a returnOrderLine.
[**updateReturnOrderLineCustomFields**](ReturnOrderLineApi.md#updateReturnOrderLineCustomFields) | **PUT** /beta/returnOrderLine/customFields | Update a returnOrderLine custom fields


<a name="addReturnOrderLineAudit"></a>
# **addReturnOrderLineAudit**
> addReturnOrderLineAudit(returnOrderLineId, returnOrderLineAudit)

Add new audit for a returnOrderLine

Adds an audit to an existing returnOrderLine.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineApi apiInstance = new ReturnOrderLineApi();
Integer returnOrderLineId = 56; // Integer | Id of the returnOrderLine to add an audit to
String returnOrderLineAudit = "returnOrderLineAudit_example"; // String | The audit to add
try {
    apiInstance.addReturnOrderLineAudit(returnOrderLineId, returnOrderLineAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineApi#addReturnOrderLineAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderLineId** | **Integer**| Id of the returnOrderLine to add an audit to |
 **returnOrderLineAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addReturnOrderLineFile"></a>
# **addReturnOrderLineFile**
> addReturnOrderLineFile(returnOrderLineId, fileName)

Attach a file to a returnOrderLine

Adds a file to an existing returnOrderLine.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineApi apiInstance = new ReturnOrderLineApi();
Integer returnOrderLineId = 56; // Integer | Id of the returnOrderLine to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addReturnOrderLineFile(returnOrderLineId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineApi#addReturnOrderLineFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderLineId** | **Integer**| Id of the returnOrderLine to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addReturnOrderLineFileByURL"></a>
# **addReturnOrderLineFileByURL**
> addReturnOrderLineFileByURL(body, returnOrderLineId)

Attach a file to a returnOrderLine by URL.

Adds a file to an existing returnOrderLine by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineApi apiInstance = new ReturnOrderLineApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer returnOrderLineId = 56; // Integer | Id of the returnOrderLine to add an file to
try {
    apiInstance.addReturnOrderLineFileByURL(body, returnOrderLineId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineApi#addReturnOrderLineFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **returnOrderLineId** | **Integer**| Id of the returnOrderLine to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addReturnOrderLineTag"></a>
# **addReturnOrderLineTag**
> addReturnOrderLineTag(returnOrderLineId, returnOrderLineTag)

Add new tags for a returnOrderLine.

Adds a tag to an existing returnOrderLine.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineApi apiInstance = new ReturnOrderLineApi();
Integer returnOrderLineId = 56; // Integer | Id of the returnOrderLine to add a tag to
String returnOrderLineTag = "returnOrderLineTag_example"; // String | The tag to add
try {
    apiInstance.addReturnOrderLineTag(returnOrderLineId, returnOrderLineTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineApi#addReturnOrderLineTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderLineId** | **Integer**| Id of the returnOrderLine to add a tag to |
 **returnOrderLineTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReturnOrderLineFile"></a>
# **deleteReturnOrderLineFile**
> deleteReturnOrderLineFile(returnOrderLineId, fileId)

Delete a file for a returnOrderLine.

Deletes an existing returnOrderLine file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineApi apiInstance = new ReturnOrderLineApi();
Integer returnOrderLineId = 56; // Integer | Id of the returnOrderLine to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteReturnOrderLineFile(returnOrderLineId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineApi#deleteReturnOrderLineFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderLineId** | **Integer**| Id of the returnOrderLine to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteReturnOrderLineTag"></a>
# **deleteReturnOrderLineTag**
> deleteReturnOrderLineTag(returnOrderLineId, returnOrderLineTag)

Delete a tag for a returnOrderLine.

Deletes an existing returnOrderLine tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineApi apiInstance = new ReturnOrderLineApi();
Integer returnOrderLineId = 56; // Integer | Id of the returnOrderLine to remove tag from
String returnOrderLineTag = "returnOrderLineTag_example"; // String | The tag to delete
try {
    apiInstance.deleteReturnOrderLineTag(returnOrderLineId, returnOrderLineTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineApi#deleteReturnOrderLineTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderLineId** | **Integer**| Id of the returnOrderLine to remove tag from |
 **returnOrderLineTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateReturnOrderLineById"></a>
# **getDuplicateReturnOrderLineById**
> ReturnOrderLine getDuplicateReturnOrderLineById(returnOrderLineId)

Get a duplicated a returnOrderLine by id

Returns a duplicated returnOrderLine identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineApi apiInstance = new ReturnOrderLineApi();
Integer returnOrderLineId = 56; // Integer | Id of the returnOrderLine to be duplicated.
try {
    ReturnOrderLine result = apiInstance.getDuplicateReturnOrderLineById(returnOrderLineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineApi#getDuplicateReturnOrderLineById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderLineId** | **Integer**| Id of the returnOrderLine to be duplicated. |

### Return type

[**ReturnOrderLine**](ReturnOrderLine.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReturnOrderLineByFilter"></a>
# **getReturnOrderLineByFilter**
> List&lt;ReturnOrderLine&gt; getReturnOrderLineByFilter(filter, page, limit, sort)

Search returnOrderLines by filter

Returns the list of returnOrderLines that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineApi apiInstance = new ReturnOrderLineApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ReturnOrderLine> result = apiInstance.getReturnOrderLineByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineApi#getReturnOrderLineByFilter");
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

[**List&lt;ReturnOrderLine&gt;**](ReturnOrderLine.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReturnOrderLineById"></a>
# **getReturnOrderLineById**
> ReturnOrderLine getReturnOrderLineById(returnOrderLineId)

Get a returnOrderLine by id

Returns the returnOrderLine identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineApi apiInstance = new ReturnOrderLineApi();
Integer returnOrderLineId = 56; // Integer | Id of the returnOrderLine to be returned.
try {
    ReturnOrderLine result = apiInstance.getReturnOrderLineById(returnOrderLineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineApi#getReturnOrderLineById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderLineId** | **Integer**| Id of the returnOrderLine to be returned. |

### Return type

[**ReturnOrderLine**](ReturnOrderLine.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReturnOrderLineFiles"></a>
# **getReturnOrderLineFiles**
> getReturnOrderLineFiles(returnOrderLineId)

Get the files for a returnOrderLine.

Get all existing returnOrderLine files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineApi apiInstance = new ReturnOrderLineApi();
Integer returnOrderLineId = 56; // Integer | Id of the returnOrderLine to get files for
try {
    apiInstance.getReturnOrderLineFiles(returnOrderLineId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineApi#getReturnOrderLineFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderLineId** | **Integer**| Id of the returnOrderLine to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReturnOrderLineTags"></a>
# **getReturnOrderLineTags**
> getReturnOrderLineTags(returnOrderLineId)

Get the tags for a returnOrderLine.

Get all existing returnOrderLine tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineApi apiInstance = new ReturnOrderLineApi();
Integer returnOrderLineId = 56; // Integer | Id of the returnOrderLine to get tags for
try {
    apiInstance.getReturnOrderLineTags(returnOrderLineId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineApi#getReturnOrderLineTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderLineId** | **Integer**| Id of the returnOrderLine to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateReturnOrderLineCustomFields"></a>
# **updateReturnOrderLineCustomFields**
> updateReturnOrderLineCustomFields(body)

Update a returnOrderLine custom fields

Updates an existing returnOrderLine custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineApi apiInstance = new ReturnOrderLineApi();
ReturnOrderLine body = new ReturnOrderLine(); // ReturnOrderLine | ReturnOrderLine to be updated.
try {
    apiInstance.updateReturnOrderLineCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineApi#updateReturnOrderLineCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReturnOrderLine**](ReturnOrderLine.md)| ReturnOrderLine to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

