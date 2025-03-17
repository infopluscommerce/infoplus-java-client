# CommodityCodeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCommodityCodeAudit**](CommodityCodeApi.md#addCommodityCodeAudit) | **PUT** /beta/commodityCode/{commodityCodeId}/audit/{commodityCodeAudit} | Add new audit for a commodityCode
[**addCommodityCodeFile**](CommodityCodeApi.md#addCommodityCodeFile) | **POST** /beta/commodityCode/{commodityCodeId}/file/{fileName} | Attach a file to a commodityCode
[**addCommodityCodeFileByURL**](CommodityCodeApi.md#addCommodityCodeFileByURL) | **POST** /beta/commodityCode/{commodityCodeId}/file | Attach a file to a commodityCode by URL.
[**addCommodityCodeTag**](CommodityCodeApi.md#addCommodityCodeTag) | **PUT** /beta/commodityCode/{commodityCodeId}/tag/{commodityCodeTag} | Add new tags for a commodityCode.
[**deleteCommodityCodeFile**](CommodityCodeApi.md#deleteCommodityCodeFile) | **DELETE** /beta/commodityCode/{commodityCodeId}/file/{fileId} | Delete a file for a commodityCode.
[**deleteCommodityCodeTag**](CommodityCodeApi.md#deleteCommodityCodeTag) | **DELETE** /beta/commodityCode/{commodityCodeId}/tag/{commodityCodeTag} | Delete a tag for a commodityCode.
[**getCommodityCodeByFilter**](CommodityCodeApi.md#getCommodityCodeByFilter) | **GET** /beta/commodityCode/search | Search commodityCodes by filter
[**getCommodityCodeById**](CommodityCodeApi.md#getCommodityCodeById) | **GET** /beta/commodityCode/{commodityCodeId} | Get a commodityCode by id
[**getCommodityCodeFiles**](CommodityCodeApi.md#getCommodityCodeFiles) | **GET** /beta/commodityCode/{commodityCodeId}/file | Get the files for a commodityCode.
[**getCommodityCodeTags**](CommodityCodeApi.md#getCommodityCodeTags) | **GET** /beta/commodityCode/{commodityCodeId}/tag | Get the tags for a commodityCode.
[**getDuplicateCommodityCodeById**](CommodityCodeApi.md#getDuplicateCommodityCodeById) | **GET** /beta/commodityCode/duplicate/{commodityCodeId} | Get a duplicated a commodityCode by id


<a name="addCommodityCodeAudit"></a>
# **addCommodityCodeAudit**
> addCommodityCodeAudit(commodityCodeId, commodityCodeAudit)

Add new audit for a commodityCode

Adds an audit to an existing commodityCode.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CommodityCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CommodityCodeApi apiInstance = new CommodityCodeApi();
Integer commodityCodeId = 56; // Integer | Id of the commodityCode to add an audit to
String commodityCodeAudit = "commodityCodeAudit_example"; // String | The audit to add
try {
    apiInstance.addCommodityCodeAudit(commodityCodeId, commodityCodeAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling CommodityCodeApi#addCommodityCodeAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commodityCodeId** | **Integer**| Id of the commodityCode to add an audit to |
 **commodityCodeAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCommodityCodeFile"></a>
# **addCommodityCodeFile**
> addCommodityCodeFile(commodityCodeId, fileName)

Attach a file to a commodityCode

Adds a file to an existing commodityCode.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CommodityCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CommodityCodeApi apiInstance = new CommodityCodeApi();
Integer commodityCodeId = 56; // Integer | Id of the commodityCode to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addCommodityCodeFile(commodityCodeId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling CommodityCodeApi#addCommodityCodeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commodityCodeId** | **Integer**| Id of the commodityCode to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addCommodityCodeFileByURL"></a>
# **addCommodityCodeFileByURL**
> addCommodityCodeFileByURL(body, commodityCodeId)

Attach a file to a commodityCode by URL.

Adds a file to an existing commodityCode by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CommodityCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CommodityCodeApi apiInstance = new CommodityCodeApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer commodityCodeId = 56; // Integer | Id of the commodityCode to add an file to
try {
    apiInstance.addCommodityCodeFileByURL(body, commodityCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling CommodityCodeApi#addCommodityCodeFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **commodityCodeId** | **Integer**| Id of the commodityCode to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCommodityCodeTag"></a>
# **addCommodityCodeTag**
> addCommodityCodeTag(commodityCodeId, commodityCodeTag)

Add new tags for a commodityCode.

Adds a tag to an existing commodityCode.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CommodityCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CommodityCodeApi apiInstance = new CommodityCodeApi();
Integer commodityCodeId = 56; // Integer | Id of the commodityCode to add a tag to
String commodityCodeTag = "commodityCodeTag_example"; // String | The tag to add
try {
    apiInstance.addCommodityCodeTag(commodityCodeId, commodityCodeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CommodityCodeApi#addCommodityCodeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commodityCodeId** | **Integer**| Id of the commodityCode to add a tag to |
 **commodityCodeTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCommodityCodeFile"></a>
# **deleteCommodityCodeFile**
> deleteCommodityCodeFile(commodityCodeId, fileId)

Delete a file for a commodityCode.

Deletes an existing commodityCode file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CommodityCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CommodityCodeApi apiInstance = new CommodityCodeApi();
Integer commodityCodeId = 56; // Integer | Id of the commodityCode to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteCommodityCodeFile(commodityCodeId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling CommodityCodeApi#deleteCommodityCodeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commodityCodeId** | **Integer**| Id of the commodityCode to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCommodityCodeTag"></a>
# **deleteCommodityCodeTag**
> deleteCommodityCodeTag(commodityCodeId, commodityCodeTag)

Delete a tag for a commodityCode.

Deletes an existing commodityCode tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CommodityCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CommodityCodeApi apiInstance = new CommodityCodeApi();
Integer commodityCodeId = 56; // Integer | Id of the commodityCode to remove tag from
String commodityCodeTag = "commodityCodeTag_example"; // String | The tag to delete
try {
    apiInstance.deleteCommodityCodeTag(commodityCodeId, commodityCodeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CommodityCodeApi#deleteCommodityCodeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commodityCodeId** | **Integer**| Id of the commodityCode to remove tag from |
 **commodityCodeTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCommodityCodeByFilter"></a>
# **getCommodityCodeByFilter**
> List&lt;CommodityCode&gt; getCommodityCodeByFilter(filter, page, limit, sort)

Search commodityCodes by filter

Returns the list of commodityCodes that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CommodityCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CommodityCodeApi apiInstance = new CommodityCodeApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<CommodityCode> result = apiInstance.getCommodityCodeByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommodityCodeApi#getCommodityCodeByFilter");
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

[**List&lt;CommodityCode&gt;**](CommodityCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCommodityCodeById"></a>
# **getCommodityCodeById**
> CommodityCode getCommodityCodeById(commodityCodeId)

Get a commodityCode by id

Returns the commodityCode identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CommodityCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CommodityCodeApi apiInstance = new CommodityCodeApi();
Integer commodityCodeId = 56; // Integer | Id of the commodityCode to be returned.
try {
    CommodityCode result = apiInstance.getCommodityCodeById(commodityCodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommodityCodeApi#getCommodityCodeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commodityCodeId** | **Integer**| Id of the commodityCode to be returned. |

### Return type

[**CommodityCode**](CommodityCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCommodityCodeFiles"></a>
# **getCommodityCodeFiles**
> getCommodityCodeFiles(commodityCodeId)

Get the files for a commodityCode.

Get all existing commodityCode files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CommodityCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CommodityCodeApi apiInstance = new CommodityCodeApi();
Integer commodityCodeId = 56; // Integer | Id of the commodityCode to get files for
try {
    apiInstance.getCommodityCodeFiles(commodityCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling CommodityCodeApi#getCommodityCodeFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commodityCodeId** | **Integer**| Id of the commodityCode to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCommodityCodeTags"></a>
# **getCommodityCodeTags**
> getCommodityCodeTags(commodityCodeId)

Get the tags for a commodityCode.

Get all existing commodityCode tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CommodityCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CommodityCodeApi apiInstance = new CommodityCodeApi();
Integer commodityCodeId = 56; // Integer | Id of the commodityCode to get tags for
try {
    apiInstance.getCommodityCodeTags(commodityCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling CommodityCodeApi#getCommodityCodeTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commodityCodeId** | **Integer**| Id of the commodityCode to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateCommodityCodeById"></a>
# **getDuplicateCommodityCodeById**
> CommodityCode getDuplicateCommodityCodeById(commodityCodeId)

Get a duplicated a commodityCode by id

Returns a duplicated commodityCode identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CommodityCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CommodityCodeApi apiInstance = new CommodityCodeApi();
Integer commodityCodeId = 56; // Integer | Id of the commodityCode to be duplicated.
try {
    CommodityCode result = apiInstance.getDuplicateCommodityCodeById(commodityCodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommodityCodeApi#getDuplicateCommodityCodeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commodityCodeId** | **Integer**| Id of the commodityCode to be duplicated. |

### Return type

[**CommodityCode**](CommodityCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

