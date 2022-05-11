# FulfillmentLayoutPositionApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFulfillmentLayoutPositionAudit**](FulfillmentLayoutPositionApi.md#addFulfillmentLayoutPositionAudit) | **PUT** /v3.0/fulfillmentLayoutPosition/{fulfillmentLayoutPositionId}/audit/{fulfillmentLayoutPositionAudit} | Add new audit for a fulfillmentLayoutPosition
[**addFulfillmentLayoutPositionFile**](FulfillmentLayoutPositionApi.md#addFulfillmentLayoutPositionFile) | **POST** /v3.0/fulfillmentLayoutPosition/{fulfillmentLayoutPositionId}/file/{fileName} | Attach a file to a fulfillmentLayoutPosition
[**addFulfillmentLayoutPositionFileByURL**](FulfillmentLayoutPositionApi.md#addFulfillmentLayoutPositionFileByURL) | **POST** /v3.0/fulfillmentLayoutPosition/{fulfillmentLayoutPositionId}/file | Attach a file to a fulfillmentLayoutPosition by URL.
[**addFulfillmentLayoutPositionTag**](FulfillmentLayoutPositionApi.md#addFulfillmentLayoutPositionTag) | **PUT** /v3.0/fulfillmentLayoutPosition/{fulfillmentLayoutPositionId}/tag/{fulfillmentLayoutPositionTag} | Add new tags for a fulfillmentLayoutPosition.
[**deleteFulfillmentLayoutPositionFile**](FulfillmentLayoutPositionApi.md#deleteFulfillmentLayoutPositionFile) | **DELETE** /v3.0/fulfillmentLayoutPosition/{fulfillmentLayoutPositionId}/file/{fileId} | Delete a file for a fulfillmentLayoutPosition.
[**deleteFulfillmentLayoutPositionTag**](FulfillmentLayoutPositionApi.md#deleteFulfillmentLayoutPositionTag) | **DELETE** /v3.0/fulfillmentLayoutPosition/{fulfillmentLayoutPositionId}/tag/{fulfillmentLayoutPositionTag} | Delete a tag for a fulfillmentLayoutPosition.
[**getDuplicateFulfillmentLayoutPositionById**](FulfillmentLayoutPositionApi.md#getDuplicateFulfillmentLayoutPositionById) | **GET** /v3.0/fulfillmentLayoutPosition/duplicate/{fulfillmentLayoutPositionId} | Get a duplicated a fulfillmentLayoutPosition by id
[**getFulfillmentLayoutPositionByFilter**](FulfillmentLayoutPositionApi.md#getFulfillmentLayoutPositionByFilter) | **GET** /v3.0/fulfillmentLayoutPosition/search | Search fulfillmentLayoutPositions by filter
[**getFulfillmentLayoutPositionById**](FulfillmentLayoutPositionApi.md#getFulfillmentLayoutPositionById) | **GET** /v3.0/fulfillmentLayoutPosition/{fulfillmentLayoutPositionId} | Get a fulfillmentLayoutPosition by id
[**getFulfillmentLayoutPositionFiles**](FulfillmentLayoutPositionApi.md#getFulfillmentLayoutPositionFiles) | **GET** /v3.0/fulfillmentLayoutPosition/{fulfillmentLayoutPositionId}/file | Get the files for a fulfillmentLayoutPosition.
[**getFulfillmentLayoutPositionTags**](FulfillmentLayoutPositionApi.md#getFulfillmentLayoutPositionTags) | **GET** /v3.0/fulfillmentLayoutPosition/{fulfillmentLayoutPositionId}/tag | Get the tags for a fulfillmentLayoutPosition.


<a name="addFulfillmentLayoutPositionAudit"></a>
# **addFulfillmentLayoutPositionAudit**
> addFulfillmentLayoutPositionAudit(fulfillmentLayoutPositionId, fulfillmentLayoutPositionAudit)

Add new audit for a fulfillmentLayoutPosition

Adds an audit to an existing fulfillmentLayoutPosition.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentLayoutPositionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentLayoutPositionApi apiInstance = new FulfillmentLayoutPositionApi();
Integer fulfillmentLayoutPositionId = 56; // Integer | Id of the fulfillmentLayoutPosition to add an audit to
String fulfillmentLayoutPositionAudit = "fulfillmentLayoutPositionAudit_example"; // String | The audit to add
try {
    apiInstance.addFulfillmentLayoutPositionAudit(fulfillmentLayoutPositionId, fulfillmentLayoutPositionAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentLayoutPositionApi#addFulfillmentLayoutPositionAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentLayoutPositionId** | **Integer**| Id of the fulfillmentLayoutPosition to add an audit to |
 **fulfillmentLayoutPositionAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addFulfillmentLayoutPositionFile"></a>
# **addFulfillmentLayoutPositionFile**
> addFulfillmentLayoutPositionFile(fulfillmentLayoutPositionId, fileName)

Attach a file to a fulfillmentLayoutPosition

Adds a file to an existing fulfillmentLayoutPosition.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentLayoutPositionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentLayoutPositionApi apiInstance = new FulfillmentLayoutPositionApi();
Integer fulfillmentLayoutPositionId = 56; // Integer | Id of the fulfillmentLayoutPosition to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addFulfillmentLayoutPositionFile(fulfillmentLayoutPositionId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentLayoutPositionApi#addFulfillmentLayoutPositionFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentLayoutPositionId** | **Integer**| Id of the fulfillmentLayoutPosition to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addFulfillmentLayoutPositionFileByURL"></a>
# **addFulfillmentLayoutPositionFileByURL**
> addFulfillmentLayoutPositionFileByURL(body, fulfillmentLayoutPositionId)

Attach a file to a fulfillmentLayoutPosition by URL.

Adds a file to an existing fulfillmentLayoutPosition by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentLayoutPositionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentLayoutPositionApi apiInstance = new FulfillmentLayoutPositionApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer fulfillmentLayoutPositionId = 56; // Integer | Id of the fulfillmentLayoutPosition to add an file to
try {
    apiInstance.addFulfillmentLayoutPositionFileByURL(body, fulfillmentLayoutPositionId);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentLayoutPositionApi#addFulfillmentLayoutPositionFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **fulfillmentLayoutPositionId** | **Integer**| Id of the fulfillmentLayoutPosition to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addFulfillmentLayoutPositionTag"></a>
# **addFulfillmentLayoutPositionTag**
> addFulfillmentLayoutPositionTag(fulfillmentLayoutPositionId, fulfillmentLayoutPositionTag)

Add new tags for a fulfillmentLayoutPosition.

Adds a tag to an existing fulfillmentLayoutPosition.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentLayoutPositionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentLayoutPositionApi apiInstance = new FulfillmentLayoutPositionApi();
Integer fulfillmentLayoutPositionId = 56; // Integer | Id of the fulfillmentLayoutPosition to add a tag to
String fulfillmentLayoutPositionTag = "fulfillmentLayoutPositionTag_example"; // String | The tag to add
try {
    apiInstance.addFulfillmentLayoutPositionTag(fulfillmentLayoutPositionId, fulfillmentLayoutPositionTag);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentLayoutPositionApi#addFulfillmentLayoutPositionTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentLayoutPositionId** | **Integer**| Id of the fulfillmentLayoutPosition to add a tag to |
 **fulfillmentLayoutPositionTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFulfillmentLayoutPositionFile"></a>
# **deleteFulfillmentLayoutPositionFile**
> deleteFulfillmentLayoutPositionFile(fulfillmentLayoutPositionId, fileId)

Delete a file for a fulfillmentLayoutPosition.

Deletes an existing fulfillmentLayoutPosition file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentLayoutPositionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentLayoutPositionApi apiInstance = new FulfillmentLayoutPositionApi();
Integer fulfillmentLayoutPositionId = 56; // Integer | Id of the fulfillmentLayoutPosition to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteFulfillmentLayoutPositionFile(fulfillmentLayoutPositionId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentLayoutPositionApi#deleteFulfillmentLayoutPositionFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentLayoutPositionId** | **Integer**| Id of the fulfillmentLayoutPosition to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteFulfillmentLayoutPositionTag"></a>
# **deleteFulfillmentLayoutPositionTag**
> deleteFulfillmentLayoutPositionTag(fulfillmentLayoutPositionId, fulfillmentLayoutPositionTag)

Delete a tag for a fulfillmentLayoutPosition.

Deletes an existing fulfillmentLayoutPosition tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentLayoutPositionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentLayoutPositionApi apiInstance = new FulfillmentLayoutPositionApi();
Integer fulfillmentLayoutPositionId = 56; // Integer | Id of the fulfillmentLayoutPosition to remove tag from
String fulfillmentLayoutPositionTag = "fulfillmentLayoutPositionTag_example"; // String | The tag to delete
try {
    apiInstance.deleteFulfillmentLayoutPositionTag(fulfillmentLayoutPositionId, fulfillmentLayoutPositionTag);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentLayoutPositionApi#deleteFulfillmentLayoutPositionTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentLayoutPositionId** | **Integer**| Id of the fulfillmentLayoutPosition to remove tag from |
 **fulfillmentLayoutPositionTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateFulfillmentLayoutPositionById"></a>
# **getDuplicateFulfillmentLayoutPositionById**
> FulfillmentLayoutPosition getDuplicateFulfillmentLayoutPositionById(fulfillmentLayoutPositionId)

Get a duplicated a fulfillmentLayoutPosition by id

Returns a duplicated fulfillmentLayoutPosition identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentLayoutPositionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentLayoutPositionApi apiInstance = new FulfillmentLayoutPositionApi();
Integer fulfillmentLayoutPositionId = 56; // Integer | Id of the fulfillmentLayoutPosition to be duplicated.
try {
    FulfillmentLayoutPosition result = apiInstance.getDuplicateFulfillmentLayoutPositionById(fulfillmentLayoutPositionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentLayoutPositionApi#getDuplicateFulfillmentLayoutPositionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentLayoutPositionId** | **Integer**| Id of the fulfillmentLayoutPosition to be duplicated. |

### Return type

[**FulfillmentLayoutPosition**](FulfillmentLayoutPosition.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFulfillmentLayoutPositionByFilter"></a>
# **getFulfillmentLayoutPositionByFilter**
> List&lt;FulfillmentLayoutPosition&gt; getFulfillmentLayoutPositionByFilter(filter, page, limit, sort)

Search fulfillmentLayoutPositions by filter

Returns the list of fulfillmentLayoutPositions that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentLayoutPositionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentLayoutPositionApi apiInstance = new FulfillmentLayoutPositionApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<FulfillmentLayoutPosition> result = apiInstance.getFulfillmentLayoutPositionByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentLayoutPositionApi#getFulfillmentLayoutPositionByFilter");
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

[**List&lt;FulfillmentLayoutPosition&gt;**](FulfillmentLayoutPosition.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFulfillmentLayoutPositionById"></a>
# **getFulfillmentLayoutPositionById**
> FulfillmentLayoutPosition getFulfillmentLayoutPositionById(fulfillmentLayoutPositionId)

Get a fulfillmentLayoutPosition by id

Returns the fulfillmentLayoutPosition identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentLayoutPositionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentLayoutPositionApi apiInstance = new FulfillmentLayoutPositionApi();
Integer fulfillmentLayoutPositionId = 56; // Integer | Id of the fulfillmentLayoutPosition to be returned.
try {
    FulfillmentLayoutPosition result = apiInstance.getFulfillmentLayoutPositionById(fulfillmentLayoutPositionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentLayoutPositionApi#getFulfillmentLayoutPositionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentLayoutPositionId** | **Integer**| Id of the fulfillmentLayoutPosition to be returned. |

### Return type

[**FulfillmentLayoutPosition**](FulfillmentLayoutPosition.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFulfillmentLayoutPositionFiles"></a>
# **getFulfillmentLayoutPositionFiles**
> getFulfillmentLayoutPositionFiles(fulfillmentLayoutPositionId)

Get the files for a fulfillmentLayoutPosition.

Get all existing fulfillmentLayoutPosition files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentLayoutPositionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentLayoutPositionApi apiInstance = new FulfillmentLayoutPositionApi();
Integer fulfillmentLayoutPositionId = 56; // Integer | Id of the fulfillmentLayoutPosition to get files for
try {
    apiInstance.getFulfillmentLayoutPositionFiles(fulfillmentLayoutPositionId);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentLayoutPositionApi#getFulfillmentLayoutPositionFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentLayoutPositionId** | **Integer**| Id of the fulfillmentLayoutPosition to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFulfillmentLayoutPositionTags"></a>
# **getFulfillmentLayoutPositionTags**
> getFulfillmentLayoutPositionTags(fulfillmentLayoutPositionId)

Get the tags for a fulfillmentLayoutPosition.

Get all existing fulfillmentLayoutPosition tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentLayoutPositionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentLayoutPositionApi apiInstance = new FulfillmentLayoutPositionApi();
Integer fulfillmentLayoutPositionId = 56; // Integer | Id of the fulfillmentLayoutPosition to get tags for
try {
    apiInstance.getFulfillmentLayoutPositionTags(fulfillmentLayoutPositionId);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentLayoutPositionApi#getFulfillmentLayoutPositionTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentLayoutPositionId** | **Integer**| Id of the fulfillmentLayoutPosition to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

