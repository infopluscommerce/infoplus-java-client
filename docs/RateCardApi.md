# RateCardApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRateCard**](RateCardApi.md#addRateCard) | **POST** /beta/rateCard | Create a rateCard
[**addRateCardAudit**](RateCardApi.md#addRateCardAudit) | **PUT** /beta/rateCard/{rateCardId}/audit/{rateCardAudit} | Add new audit for a rateCard
[**addRateCardFile**](RateCardApi.md#addRateCardFile) | **POST** /beta/rateCard/{rateCardId}/file/{fileName} | Attach a file to a rateCard
[**addRateCardFileByURL**](RateCardApi.md#addRateCardFileByURL) | **POST** /beta/rateCard/{rateCardId}/file | Attach a file to a rateCard by URL.
[**addRateCardTag**](RateCardApi.md#addRateCardTag) | **PUT** /beta/rateCard/{rateCardId}/tag/{rateCardTag} | Add new tags for a rateCard.
[**deleteRateCard**](RateCardApi.md#deleteRateCard) | **DELETE** /beta/rateCard/{rateCardId} | Delete a rateCard
[**deleteRateCardFile**](RateCardApi.md#deleteRateCardFile) | **DELETE** /beta/rateCard/{rateCardId}/file/{fileId} | Delete a file for a rateCard.
[**deleteRateCardTag**](RateCardApi.md#deleteRateCardTag) | **DELETE** /beta/rateCard/{rateCardId}/tag/{rateCardTag} | Delete a tag for a rateCard.
[**getDuplicateRateCardById**](RateCardApi.md#getDuplicateRateCardById) | **GET** /beta/rateCard/duplicate/{rateCardId} | Get a duplicated a rateCard by id
[**getRateCardByFilter**](RateCardApi.md#getRateCardByFilter) | **GET** /beta/rateCard/search | Search rateCards by filter
[**getRateCardById**](RateCardApi.md#getRateCardById) | **GET** /beta/rateCard/{rateCardId} | Get a rateCard by id
[**getRateCardFiles**](RateCardApi.md#getRateCardFiles) | **GET** /beta/rateCard/{rateCardId}/file | Get the files for a rateCard.
[**getRateCardTags**](RateCardApi.md#getRateCardTags) | **GET** /beta/rateCard/{rateCardId}/tag | Get the tags for a rateCard.
[**updateRateCard**](RateCardApi.md#updateRateCard) | **PUT** /beta/rateCard | Update a rateCard


<a name="addRateCard"></a>
# **addRateCard**
> RateCard addRateCard(body)

Create a rateCard

Inserts a new rateCard using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.RateCardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RateCardApi apiInstance = new RateCardApi();
RateCard body = new RateCard(); // RateCard | RateCard to be inserted.
try {
    RateCard result = apiInstance.addRateCard(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RateCardApi#addRateCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RateCard**](RateCard.md)| RateCard to be inserted. |

### Return type

[**RateCard**](RateCard.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addRateCardAudit"></a>
# **addRateCardAudit**
> addRateCardAudit(rateCardId, rateCardAudit)

Add new audit for a rateCard

Adds an audit to an existing rateCard.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.RateCardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RateCardApi apiInstance = new RateCardApi();
Integer rateCardId = 56; // Integer | Id of the rateCard to add an audit to
String rateCardAudit = "rateCardAudit_example"; // String | The audit to add
try {
    apiInstance.addRateCardAudit(rateCardId, rateCardAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling RateCardApi#addRateCardAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rateCardId** | **Integer**| Id of the rateCard to add an audit to |
 **rateCardAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addRateCardFile"></a>
# **addRateCardFile**
> addRateCardFile(rateCardId, fileName)

Attach a file to a rateCard

Adds a file to an existing rateCard.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.RateCardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RateCardApi apiInstance = new RateCardApi();
Integer rateCardId = 56; // Integer | Id of the rateCard to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addRateCardFile(rateCardId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling RateCardApi#addRateCardFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rateCardId** | **Integer**| Id of the rateCard to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addRateCardFileByURL"></a>
# **addRateCardFileByURL**
> addRateCardFileByURL(body, rateCardId)

Attach a file to a rateCard by URL.

Adds a file to an existing rateCard by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.RateCardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RateCardApi apiInstance = new RateCardApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer rateCardId = 56; // Integer | Id of the rateCard to add an file to
try {
    apiInstance.addRateCardFileByURL(body, rateCardId);
} catch (ApiException e) {
    System.err.println("Exception when calling RateCardApi#addRateCardFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **rateCardId** | **Integer**| Id of the rateCard to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addRateCardTag"></a>
# **addRateCardTag**
> addRateCardTag(rateCardId, rateCardTag)

Add new tags for a rateCard.

Adds a tag to an existing rateCard.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.RateCardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RateCardApi apiInstance = new RateCardApi();
Integer rateCardId = 56; // Integer | Id of the rateCard to add a tag to
String rateCardTag = "rateCardTag_example"; // String | The tag to add
try {
    apiInstance.addRateCardTag(rateCardId, rateCardTag);
} catch (ApiException e) {
    System.err.println("Exception when calling RateCardApi#addRateCardTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rateCardId** | **Integer**| Id of the rateCard to add a tag to |
 **rateCardTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRateCard"></a>
# **deleteRateCard**
> deleteRateCard(rateCardId)

Delete a rateCard

Deletes the rateCard identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.RateCardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RateCardApi apiInstance = new RateCardApi();
Integer rateCardId = 56; // Integer | Id of the rateCard to be deleted.
try {
    apiInstance.deleteRateCard(rateCardId);
} catch (ApiException e) {
    System.err.println("Exception when calling RateCardApi#deleteRateCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rateCardId** | **Integer**| Id of the rateCard to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteRateCardFile"></a>
# **deleteRateCardFile**
> deleteRateCardFile(rateCardId, fileId)

Delete a file for a rateCard.

Deletes an existing rateCard file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.RateCardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RateCardApi apiInstance = new RateCardApi();
Integer rateCardId = 56; // Integer | Id of the rateCard to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteRateCardFile(rateCardId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling RateCardApi#deleteRateCardFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rateCardId** | **Integer**| Id of the rateCard to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteRateCardTag"></a>
# **deleteRateCardTag**
> deleteRateCardTag(rateCardId, rateCardTag)

Delete a tag for a rateCard.

Deletes an existing rateCard tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.RateCardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RateCardApi apiInstance = new RateCardApi();
Integer rateCardId = 56; // Integer | Id of the rateCard to remove tag from
String rateCardTag = "rateCardTag_example"; // String | The tag to delete
try {
    apiInstance.deleteRateCardTag(rateCardId, rateCardTag);
} catch (ApiException e) {
    System.err.println("Exception when calling RateCardApi#deleteRateCardTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rateCardId** | **Integer**| Id of the rateCard to remove tag from |
 **rateCardTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateRateCardById"></a>
# **getDuplicateRateCardById**
> RateCard getDuplicateRateCardById(rateCardId)

Get a duplicated a rateCard by id

Returns a duplicated rateCard identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.RateCardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RateCardApi apiInstance = new RateCardApi();
Integer rateCardId = 56; // Integer | Id of the rateCard to be duplicated.
try {
    RateCard result = apiInstance.getDuplicateRateCardById(rateCardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RateCardApi#getDuplicateRateCardById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rateCardId** | **Integer**| Id of the rateCard to be duplicated. |

### Return type

[**RateCard**](RateCard.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRateCardByFilter"></a>
# **getRateCardByFilter**
> List&lt;RateCard&gt; getRateCardByFilter(filter, page, limit, sort)

Search rateCards by filter

Returns the list of rateCards that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.RateCardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RateCardApi apiInstance = new RateCardApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<RateCard> result = apiInstance.getRateCardByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RateCardApi#getRateCardByFilter");
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

[**List&lt;RateCard&gt;**](RateCard.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRateCardById"></a>
# **getRateCardById**
> RateCard getRateCardById(rateCardId)

Get a rateCard by id

Returns the rateCard identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.RateCardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RateCardApi apiInstance = new RateCardApi();
Integer rateCardId = 56; // Integer | Id of the rateCard to be returned.
try {
    RateCard result = apiInstance.getRateCardById(rateCardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RateCardApi#getRateCardById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rateCardId** | **Integer**| Id of the rateCard to be returned. |

### Return type

[**RateCard**](RateCard.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRateCardFiles"></a>
# **getRateCardFiles**
> getRateCardFiles(rateCardId)

Get the files for a rateCard.

Get all existing rateCard files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.RateCardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RateCardApi apiInstance = new RateCardApi();
Integer rateCardId = 56; // Integer | Id of the rateCard to get files for
try {
    apiInstance.getRateCardFiles(rateCardId);
} catch (ApiException e) {
    System.err.println("Exception when calling RateCardApi#getRateCardFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rateCardId** | **Integer**| Id of the rateCard to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRateCardTags"></a>
# **getRateCardTags**
> getRateCardTags(rateCardId)

Get the tags for a rateCard.

Get all existing rateCard tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.RateCardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RateCardApi apiInstance = new RateCardApi();
Integer rateCardId = 56; // Integer | Id of the rateCard to get tags for
try {
    apiInstance.getRateCardTags(rateCardId);
} catch (ApiException e) {
    System.err.println("Exception when calling RateCardApi#getRateCardTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rateCardId** | **Integer**| Id of the rateCard to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRateCard"></a>
# **updateRateCard**
> updateRateCard(body)

Update a rateCard

Updates an existing rateCard using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.RateCardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RateCardApi apiInstance = new RateCardApi();
RateCard body = new RateCard(); // RateCard | RateCard to be updated.
try {
    apiInstance.updateRateCard(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RateCardApi#updateRateCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RateCard**](RateCard.md)| RateCard to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

