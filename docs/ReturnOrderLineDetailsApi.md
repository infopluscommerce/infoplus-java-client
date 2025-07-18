# ReturnOrderLineDetailsApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addReturnOrderLineDetailsAudit**](ReturnOrderLineDetailsApi.md#addReturnOrderLineDetailsAudit) | **PUT** /beta/returnOrderLineDetails/{returnOrderLineDetailsId}/audit/{returnOrderLineDetailsAudit} | Add new audit for a returnOrderLineDetails
[**addReturnOrderLineDetailsFile**](ReturnOrderLineDetailsApi.md#addReturnOrderLineDetailsFile) | **POST** /beta/returnOrderLineDetails/{returnOrderLineDetailsId}/file/{fileName} | Attach a file to a returnOrderLineDetails
[**addReturnOrderLineDetailsFileByURL**](ReturnOrderLineDetailsApi.md#addReturnOrderLineDetailsFileByURL) | **POST** /beta/returnOrderLineDetails/{returnOrderLineDetailsId}/file | Attach a file to a returnOrderLineDetails by URL.
[**addReturnOrderLineDetailsTag**](ReturnOrderLineDetailsApi.md#addReturnOrderLineDetailsTag) | **PUT** /beta/returnOrderLineDetails/{returnOrderLineDetailsId}/tag/{returnOrderLineDetailsTag} | Add new tags for a returnOrderLineDetails.
[**deleteReturnOrderLineDetailsFile**](ReturnOrderLineDetailsApi.md#deleteReturnOrderLineDetailsFile) | **DELETE** /beta/returnOrderLineDetails/{returnOrderLineDetailsId}/file/{fileId} | Delete a file for a returnOrderLineDetails.
[**deleteReturnOrderLineDetailsTag**](ReturnOrderLineDetailsApi.md#deleteReturnOrderLineDetailsTag) | **DELETE** /beta/returnOrderLineDetails/{returnOrderLineDetailsId}/tag/{returnOrderLineDetailsTag} | Delete a tag for a returnOrderLineDetails.
[**getDuplicateReturnOrderLineDetailsById**](ReturnOrderLineDetailsApi.md#getDuplicateReturnOrderLineDetailsById) | **GET** /beta/returnOrderLineDetails/duplicate/{returnOrderLineDetailsId} | Get a duplicated a returnOrderLineDetails by id
[**getReturnOrderLineDetailsByFilter**](ReturnOrderLineDetailsApi.md#getReturnOrderLineDetailsByFilter) | **GET** /beta/returnOrderLineDetails/search | Search returnOrderLineDetailses by filter
[**getReturnOrderLineDetailsById**](ReturnOrderLineDetailsApi.md#getReturnOrderLineDetailsById) | **GET** /beta/returnOrderLineDetails/{returnOrderLineDetailsId} | Get a returnOrderLineDetails by id
[**getReturnOrderLineDetailsFiles**](ReturnOrderLineDetailsApi.md#getReturnOrderLineDetailsFiles) | **GET** /beta/returnOrderLineDetails/{returnOrderLineDetailsId}/file | Get the files for a returnOrderLineDetails.
[**getReturnOrderLineDetailsTags**](ReturnOrderLineDetailsApi.md#getReturnOrderLineDetailsTags) | **GET** /beta/returnOrderLineDetails/{returnOrderLineDetailsId}/tag | Get the tags for a returnOrderLineDetails.
[**updateReturnOrderLineDetailsCustomFields**](ReturnOrderLineDetailsApi.md#updateReturnOrderLineDetailsCustomFields) | **PUT** /beta/returnOrderLineDetails/customFields | Update a returnOrderLineDetails custom fields


<a name="addReturnOrderLineDetailsAudit"></a>
# **addReturnOrderLineDetailsAudit**
> addReturnOrderLineDetailsAudit(returnOrderLineDetailsId, returnOrderLineDetailsAudit)

Add new audit for a returnOrderLineDetails

Adds an audit to an existing returnOrderLineDetails.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineDetailsApi apiInstance = new ReturnOrderLineDetailsApi();
Integer returnOrderLineDetailsId = 56; // Integer | Id of the returnOrderLineDetails to add an audit to
String returnOrderLineDetailsAudit = "returnOrderLineDetailsAudit_example"; // String | The audit to add
try {
    apiInstance.addReturnOrderLineDetailsAudit(returnOrderLineDetailsId, returnOrderLineDetailsAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineDetailsApi#addReturnOrderLineDetailsAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderLineDetailsId** | **Integer**| Id of the returnOrderLineDetails to add an audit to |
 **returnOrderLineDetailsAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addReturnOrderLineDetailsFile"></a>
# **addReturnOrderLineDetailsFile**
> addReturnOrderLineDetailsFile(returnOrderLineDetailsId, fileName)

Attach a file to a returnOrderLineDetails

Adds a file to an existing returnOrderLineDetails.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineDetailsApi apiInstance = new ReturnOrderLineDetailsApi();
Integer returnOrderLineDetailsId = 56; // Integer | Id of the returnOrderLineDetails to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addReturnOrderLineDetailsFile(returnOrderLineDetailsId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineDetailsApi#addReturnOrderLineDetailsFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderLineDetailsId** | **Integer**| Id of the returnOrderLineDetails to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addReturnOrderLineDetailsFileByURL"></a>
# **addReturnOrderLineDetailsFileByURL**
> addReturnOrderLineDetailsFileByURL(body, returnOrderLineDetailsId)

Attach a file to a returnOrderLineDetails by URL.

Adds a file to an existing returnOrderLineDetails by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineDetailsApi apiInstance = new ReturnOrderLineDetailsApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer returnOrderLineDetailsId = 56; // Integer | Id of the returnOrderLineDetails to add an file to
try {
    apiInstance.addReturnOrderLineDetailsFileByURL(body, returnOrderLineDetailsId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineDetailsApi#addReturnOrderLineDetailsFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **returnOrderLineDetailsId** | **Integer**| Id of the returnOrderLineDetails to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addReturnOrderLineDetailsTag"></a>
# **addReturnOrderLineDetailsTag**
> addReturnOrderLineDetailsTag(returnOrderLineDetailsId, returnOrderLineDetailsTag)

Add new tags for a returnOrderLineDetails.

Adds a tag to an existing returnOrderLineDetails.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineDetailsApi apiInstance = new ReturnOrderLineDetailsApi();
Integer returnOrderLineDetailsId = 56; // Integer | Id of the returnOrderLineDetails to add a tag to
String returnOrderLineDetailsTag = "returnOrderLineDetailsTag_example"; // String | The tag to add
try {
    apiInstance.addReturnOrderLineDetailsTag(returnOrderLineDetailsId, returnOrderLineDetailsTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineDetailsApi#addReturnOrderLineDetailsTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderLineDetailsId** | **Integer**| Id of the returnOrderLineDetails to add a tag to |
 **returnOrderLineDetailsTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReturnOrderLineDetailsFile"></a>
# **deleteReturnOrderLineDetailsFile**
> deleteReturnOrderLineDetailsFile(returnOrderLineDetailsId, fileId)

Delete a file for a returnOrderLineDetails.

Deletes an existing returnOrderLineDetails file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineDetailsApi apiInstance = new ReturnOrderLineDetailsApi();
Integer returnOrderLineDetailsId = 56; // Integer | Id of the returnOrderLineDetails to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteReturnOrderLineDetailsFile(returnOrderLineDetailsId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineDetailsApi#deleteReturnOrderLineDetailsFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderLineDetailsId** | **Integer**| Id of the returnOrderLineDetails to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteReturnOrderLineDetailsTag"></a>
# **deleteReturnOrderLineDetailsTag**
> deleteReturnOrderLineDetailsTag(returnOrderLineDetailsId, returnOrderLineDetailsTag)

Delete a tag for a returnOrderLineDetails.

Deletes an existing returnOrderLineDetails tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineDetailsApi apiInstance = new ReturnOrderLineDetailsApi();
Integer returnOrderLineDetailsId = 56; // Integer | Id of the returnOrderLineDetails to remove tag from
String returnOrderLineDetailsTag = "returnOrderLineDetailsTag_example"; // String | The tag to delete
try {
    apiInstance.deleteReturnOrderLineDetailsTag(returnOrderLineDetailsId, returnOrderLineDetailsTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineDetailsApi#deleteReturnOrderLineDetailsTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderLineDetailsId** | **Integer**| Id of the returnOrderLineDetails to remove tag from |
 **returnOrderLineDetailsTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateReturnOrderLineDetailsById"></a>
# **getDuplicateReturnOrderLineDetailsById**
> ReturnOrderLineDetails getDuplicateReturnOrderLineDetailsById(returnOrderLineDetailsId)

Get a duplicated a returnOrderLineDetails by id

Returns a duplicated returnOrderLineDetails identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineDetailsApi apiInstance = new ReturnOrderLineDetailsApi();
Integer returnOrderLineDetailsId = 56; // Integer | Id of the returnOrderLineDetails to be duplicated.
try {
    ReturnOrderLineDetails result = apiInstance.getDuplicateReturnOrderLineDetailsById(returnOrderLineDetailsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineDetailsApi#getDuplicateReturnOrderLineDetailsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderLineDetailsId** | **Integer**| Id of the returnOrderLineDetails to be duplicated. |

### Return type

[**ReturnOrderLineDetails**](ReturnOrderLineDetails.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReturnOrderLineDetailsByFilter"></a>
# **getReturnOrderLineDetailsByFilter**
> List&lt;ReturnOrderLineDetails&gt; getReturnOrderLineDetailsByFilter(filter, page, limit, sort)

Search returnOrderLineDetailses by filter

Returns the list of returnOrderLineDetailses that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineDetailsApi apiInstance = new ReturnOrderLineDetailsApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ReturnOrderLineDetails> result = apiInstance.getReturnOrderLineDetailsByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineDetailsApi#getReturnOrderLineDetailsByFilter");
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

[**List&lt;ReturnOrderLineDetails&gt;**](ReturnOrderLineDetails.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReturnOrderLineDetailsById"></a>
# **getReturnOrderLineDetailsById**
> ReturnOrderLineDetails getReturnOrderLineDetailsById(returnOrderLineDetailsId)

Get a returnOrderLineDetails by id

Returns the returnOrderLineDetails identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineDetailsApi apiInstance = new ReturnOrderLineDetailsApi();
Integer returnOrderLineDetailsId = 56; // Integer | Id of the returnOrderLineDetails to be returned.
try {
    ReturnOrderLineDetails result = apiInstance.getReturnOrderLineDetailsById(returnOrderLineDetailsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineDetailsApi#getReturnOrderLineDetailsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderLineDetailsId** | **Integer**| Id of the returnOrderLineDetails to be returned. |

### Return type

[**ReturnOrderLineDetails**](ReturnOrderLineDetails.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReturnOrderLineDetailsFiles"></a>
# **getReturnOrderLineDetailsFiles**
> getReturnOrderLineDetailsFiles(returnOrderLineDetailsId)

Get the files for a returnOrderLineDetails.

Get all existing returnOrderLineDetails files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineDetailsApi apiInstance = new ReturnOrderLineDetailsApi();
Integer returnOrderLineDetailsId = 56; // Integer | Id of the returnOrderLineDetails to get files for
try {
    apiInstance.getReturnOrderLineDetailsFiles(returnOrderLineDetailsId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineDetailsApi#getReturnOrderLineDetailsFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderLineDetailsId** | **Integer**| Id of the returnOrderLineDetails to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReturnOrderLineDetailsTags"></a>
# **getReturnOrderLineDetailsTags**
> getReturnOrderLineDetailsTags(returnOrderLineDetailsId)

Get the tags for a returnOrderLineDetails.

Get all existing returnOrderLineDetails tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineDetailsApi apiInstance = new ReturnOrderLineDetailsApi();
Integer returnOrderLineDetailsId = 56; // Integer | Id of the returnOrderLineDetails to get tags for
try {
    apiInstance.getReturnOrderLineDetailsTags(returnOrderLineDetailsId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineDetailsApi#getReturnOrderLineDetailsTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnOrderLineDetailsId** | **Integer**| Id of the returnOrderLineDetails to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateReturnOrderLineDetailsCustomFields"></a>
# **updateReturnOrderLineDetailsCustomFields**
> updateReturnOrderLineDetailsCustomFields(body)

Update a returnOrderLineDetails custom fields

Updates an existing returnOrderLineDetails custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReturnOrderLineDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReturnOrderLineDetailsApi apiInstance = new ReturnOrderLineDetailsApi();
ReturnOrderLineDetails body = new ReturnOrderLineDetails(); // ReturnOrderLineDetails | ReturnOrderLineDetails to be updated.
try {
    apiInstance.updateReturnOrderLineDetailsCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnOrderLineDetailsApi#updateReturnOrderLineDetailsCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReturnOrderLineDetails**](ReturnOrderLineDetails.md)| ReturnOrderLineDetails to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

