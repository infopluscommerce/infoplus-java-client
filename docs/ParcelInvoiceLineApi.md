# ParcelInvoiceLineApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addParcelInvoiceLineAudit**](ParcelInvoiceLineApi.md#addParcelInvoiceLineAudit) | **PUT** /beta/parcelInvoiceLine/{parcelInvoiceLineId}/audit/{parcelInvoiceLineAudit} | Add new audit for a parcelInvoiceLine
[**addParcelInvoiceLineTag**](ParcelInvoiceLineApi.md#addParcelInvoiceLineTag) | **PUT** /beta/parcelInvoiceLine/{parcelInvoiceLineId}/tag/{parcelInvoiceLineTag} | Add new tags for a parcelInvoiceLine.
[**deleteParcelInvoiceLineTag**](ParcelInvoiceLineApi.md#deleteParcelInvoiceLineTag) | **DELETE** /beta/parcelInvoiceLine/{parcelInvoiceLineId}/tag/{parcelInvoiceLineTag} | Delete a tag for a parcelInvoiceLine.
[**getDuplicateParcelInvoiceLineById**](ParcelInvoiceLineApi.md#getDuplicateParcelInvoiceLineById) | **GET** /beta/parcelInvoiceLine/duplicate/{parcelInvoiceLineId} | Get a duplicated a parcelInvoiceLine by id
[**getParcelInvoiceLineByFilter**](ParcelInvoiceLineApi.md#getParcelInvoiceLineByFilter) | **GET** /beta/parcelInvoiceLine/search | Search parcelInvoiceLines by filter
[**getParcelInvoiceLineById**](ParcelInvoiceLineApi.md#getParcelInvoiceLineById) | **GET** /beta/parcelInvoiceLine/{parcelInvoiceLineId} | Get a parcelInvoiceLine by id
[**getParcelInvoiceLineTags**](ParcelInvoiceLineApi.md#getParcelInvoiceLineTags) | **GET** /beta/parcelInvoiceLine/{parcelInvoiceLineId}/tag | Get the tags for a parcelInvoiceLine.
[**updateParcelInvoiceLine**](ParcelInvoiceLineApi.md#updateParcelInvoiceLine) | **PUT** /beta/parcelInvoiceLine | Update a parcelInvoiceLine


<a name="addParcelInvoiceLineAudit"></a>
# **addParcelInvoiceLineAudit**
> addParcelInvoiceLineAudit(parcelInvoiceLineId, parcelInvoiceLineAudit)

Add new audit for a parcelInvoiceLine

Adds an audit to an existing parcelInvoiceLine.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelInvoiceLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelInvoiceLineApi apiInstance = new ParcelInvoiceLineApi();
Integer parcelInvoiceLineId = 56; // Integer | Id of the parcelInvoiceLine to add an audit to
String parcelInvoiceLineAudit = "parcelInvoiceLineAudit_example"; // String | The audit to add
try {
    apiInstance.addParcelInvoiceLineAudit(parcelInvoiceLineId, parcelInvoiceLineAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelInvoiceLineApi#addParcelInvoiceLineAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelInvoiceLineId** | **Integer**| Id of the parcelInvoiceLine to add an audit to |
 **parcelInvoiceLineAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addParcelInvoiceLineTag"></a>
# **addParcelInvoiceLineTag**
> addParcelInvoiceLineTag(parcelInvoiceLineId, parcelInvoiceLineTag)

Add new tags for a parcelInvoiceLine.

Adds a tag to an existing parcelInvoiceLine.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelInvoiceLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelInvoiceLineApi apiInstance = new ParcelInvoiceLineApi();
Integer parcelInvoiceLineId = 56; // Integer | Id of the parcelInvoiceLine to add a tag to
String parcelInvoiceLineTag = "parcelInvoiceLineTag_example"; // String | The tag to add
try {
    apiInstance.addParcelInvoiceLineTag(parcelInvoiceLineId, parcelInvoiceLineTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelInvoiceLineApi#addParcelInvoiceLineTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelInvoiceLineId** | **Integer**| Id of the parcelInvoiceLine to add a tag to |
 **parcelInvoiceLineTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteParcelInvoiceLineTag"></a>
# **deleteParcelInvoiceLineTag**
> deleteParcelInvoiceLineTag(parcelInvoiceLineId, parcelInvoiceLineTag)

Delete a tag for a parcelInvoiceLine.

Deletes an existing parcelInvoiceLine tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelInvoiceLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelInvoiceLineApi apiInstance = new ParcelInvoiceLineApi();
Integer parcelInvoiceLineId = 56; // Integer | Id of the parcelInvoiceLine to remove tag from
String parcelInvoiceLineTag = "parcelInvoiceLineTag_example"; // String | The tag to delete
try {
    apiInstance.deleteParcelInvoiceLineTag(parcelInvoiceLineId, parcelInvoiceLineTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelInvoiceLineApi#deleteParcelInvoiceLineTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelInvoiceLineId** | **Integer**| Id of the parcelInvoiceLine to remove tag from |
 **parcelInvoiceLineTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateParcelInvoiceLineById"></a>
# **getDuplicateParcelInvoiceLineById**
> ParcelInvoiceLine getDuplicateParcelInvoiceLineById(parcelInvoiceLineId)

Get a duplicated a parcelInvoiceLine by id

Returns a duplicated parcelInvoiceLine identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelInvoiceLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelInvoiceLineApi apiInstance = new ParcelInvoiceLineApi();
Integer parcelInvoiceLineId = 56; // Integer | Id of the parcelInvoiceLine to be duplicated.
try {
    ParcelInvoiceLine result = apiInstance.getDuplicateParcelInvoiceLineById(parcelInvoiceLineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelInvoiceLineApi#getDuplicateParcelInvoiceLineById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelInvoiceLineId** | **Integer**| Id of the parcelInvoiceLine to be duplicated. |

### Return type

[**ParcelInvoiceLine**](ParcelInvoiceLine.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParcelInvoiceLineByFilter"></a>
# **getParcelInvoiceLineByFilter**
> List&lt;ParcelInvoiceLine&gt; getParcelInvoiceLineByFilter(filter, page, limit, sort)

Search parcelInvoiceLines by filter

Returns the list of parcelInvoiceLines that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelInvoiceLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelInvoiceLineApi apiInstance = new ParcelInvoiceLineApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ParcelInvoiceLine> result = apiInstance.getParcelInvoiceLineByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelInvoiceLineApi#getParcelInvoiceLineByFilter");
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

[**List&lt;ParcelInvoiceLine&gt;**](ParcelInvoiceLine.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParcelInvoiceLineById"></a>
# **getParcelInvoiceLineById**
> ParcelInvoiceLine getParcelInvoiceLineById(parcelInvoiceLineId)

Get a parcelInvoiceLine by id

Returns the parcelInvoiceLine identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelInvoiceLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelInvoiceLineApi apiInstance = new ParcelInvoiceLineApi();
Integer parcelInvoiceLineId = 56; // Integer | Id of the parcelInvoiceLine to be returned.
try {
    ParcelInvoiceLine result = apiInstance.getParcelInvoiceLineById(parcelInvoiceLineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelInvoiceLineApi#getParcelInvoiceLineById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelInvoiceLineId** | **Integer**| Id of the parcelInvoiceLine to be returned. |

### Return type

[**ParcelInvoiceLine**](ParcelInvoiceLine.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParcelInvoiceLineTags"></a>
# **getParcelInvoiceLineTags**
> getParcelInvoiceLineTags(parcelInvoiceLineId)

Get the tags for a parcelInvoiceLine.

Get all existing parcelInvoiceLine tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelInvoiceLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelInvoiceLineApi apiInstance = new ParcelInvoiceLineApi();
Integer parcelInvoiceLineId = 56; // Integer | Id of the parcelInvoiceLine to get tags for
try {
    apiInstance.getParcelInvoiceLineTags(parcelInvoiceLineId);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelInvoiceLineApi#getParcelInvoiceLineTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelInvoiceLineId** | **Integer**| Id of the parcelInvoiceLine to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateParcelInvoiceLine"></a>
# **updateParcelInvoiceLine**
> updateParcelInvoiceLine(body)

Update a parcelInvoiceLine

Updates an existing parcelInvoiceLine using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelInvoiceLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelInvoiceLineApi apiInstance = new ParcelInvoiceLineApi();
ParcelInvoiceLine body = new ParcelInvoiceLine(); // ParcelInvoiceLine | ParcelInvoiceLine to be updated.
try {
    apiInstance.updateParcelInvoiceLine(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelInvoiceLineApi#updateParcelInvoiceLine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParcelInvoiceLine**](ParcelInvoiceLine.md)| ParcelInvoiceLine to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

