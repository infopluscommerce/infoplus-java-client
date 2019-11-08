# InvoiceWorksheetLineDetailApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInvoiceWorksheetLineDetailAudit**](InvoiceWorksheetLineDetailApi.md#addInvoiceWorksheetLineDetailAudit) | **PUT** /beta/invoiceWorksheetLineDetail/{invoiceWorksheetLineDetailId}/audit/{invoiceWorksheetLineDetailAudit} | Add new audit for an invoiceWorksheetLineDetail
[**addInvoiceWorksheetLineDetailFile**](InvoiceWorksheetLineDetailApi.md#addInvoiceWorksheetLineDetailFile) | **POST** /beta/invoiceWorksheetLineDetail/{invoiceWorksheetLineDetailId}/file/{fileName} | Attach a file to an invoiceWorksheetLineDetail
[**addInvoiceWorksheetLineDetailTag**](InvoiceWorksheetLineDetailApi.md#addInvoiceWorksheetLineDetailTag) | **PUT** /beta/invoiceWorksheetLineDetail/{invoiceWorksheetLineDetailId}/tag/{invoiceWorksheetLineDetailTag} | Add new tags for an invoiceWorksheetLineDetail.
[**deleteInvoiceWorksheetLineDetailTag**](InvoiceWorksheetLineDetailApi.md#deleteInvoiceWorksheetLineDetailTag) | **DELETE** /beta/invoiceWorksheetLineDetail/{invoiceWorksheetLineDetailId}/tag/{invoiceWorksheetLineDetailTag} | Delete a tag for an invoiceWorksheetLineDetail.
[**getDuplicateInvoiceWorksheetLineDetailById**](InvoiceWorksheetLineDetailApi.md#getDuplicateInvoiceWorksheetLineDetailById) | **GET** /beta/invoiceWorksheetLineDetail/duplicate/{invoiceWorksheetLineDetailId} | Get a duplicated an invoiceWorksheetLineDetail by id
[**getInvoiceWorksheetLineDetailByFilter**](InvoiceWorksheetLineDetailApi.md#getInvoiceWorksheetLineDetailByFilter) | **GET** /beta/invoiceWorksheetLineDetail/search | Search invoiceWorksheetLineDetails by filter
[**getInvoiceWorksheetLineDetailById**](InvoiceWorksheetLineDetailApi.md#getInvoiceWorksheetLineDetailById) | **GET** /beta/invoiceWorksheetLineDetail/{invoiceWorksheetLineDetailId} | Get an invoiceWorksheetLineDetail by id
[**getInvoiceWorksheetLineDetailTags**](InvoiceWorksheetLineDetailApi.md#getInvoiceWorksheetLineDetailTags) | **GET** /beta/invoiceWorksheetLineDetail/{invoiceWorksheetLineDetailId}/tag | Get the tags for an invoiceWorksheetLineDetail.


<a name="addInvoiceWorksheetLineDetailAudit"></a>
# **addInvoiceWorksheetLineDetailAudit**
> addInvoiceWorksheetLineDetailAudit(invoiceWorksheetLineDetailId, invoiceWorksheetLineDetailAudit)

Add new audit for an invoiceWorksheetLineDetail

Adds an audit to an existing invoiceWorksheetLineDetail.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineDetailApi apiInstance = new InvoiceWorksheetLineDetailApi();
Integer invoiceWorksheetLineDetailId = 56; // Integer | Id of the invoiceWorksheetLineDetail to add an audit to
String invoiceWorksheetLineDetailAudit = "invoiceWorksheetLineDetailAudit_example"; // String | The audit to add
try {
    apiInstance.addInvoiceWorksheetLineDetailAudit(invoiceWorksheetLineDetailId, invoiceWorksheetLineDetailAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineDetailApi#addInvoiceWorksheetLineDetailAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetLineDetailId** | **Integer**| Id of the invoiceWorksheetLineDetail to add an audit to |
 **invoiceWorksheetLineDetailAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addInvoiceWorksheetLineDetailFile"></a>
# **addInvoiceWorksheetLineDetailFile**
> addInvoiceWorksheetLineDetailFile(invoiceWorksheetLineDetailId, fileName)

Attach a file to an invoiceWorksheetLineDetail

Adds a file to an existing invoiceWorksheetLineDetail.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineDetailApi apiInstance = new InvoiceWorksheetLineDetailApi();
Integer invoiceWorksheetLineDetailId = 56; // Integer | Id of the invoiceWorksheetLineDetail to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addInvoiceWorksheetLineDetailFile(invoiceWorksheetLineDetailId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineDetailApi#addInvoiceWorksheetLineDetailFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetLineDetailId** | **Integer**| Id of the invoiceWorksheetLineDetail to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addInvoiceWorksheetLineDetailTag"></a>
# **addInvoiceWorksheetLineDetailTag**
> addInvoiceWorksheetLineDetailTag(invoiceWorksheetLineDetailId, invoiceWorksheetLineDetailTag)

Add new tags for an invoiceWorksheetLineDetail.

Adds a tag to an existing invoiceWorksheetLineDetail.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineDetailApi apiInstance = new InvoiceWorksheetLineDetailApi();
Integer invoiceWorksheetLineDetailId = 56; // Integer | Id of the invoiceWorksheetLineDetail to add a tag to
String invoiceWorksheetLineDetailTag = "invoiceWorksheetLineDetailTag_example"; // String | The tag to add
try {
    apiInstance.addInvoiceWorksheetLineDetailTag(invoiceWorksheetLineDetailId, invoiceWorksheetLineDetailTag);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineDetailApi#addInvoiceWorksheetLineDetailTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetLineDetailId** | **Integer**| Id of the invoiceWorksheetLineDetail to add a tag to |
 **invoiceWorksheetLineDetailTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteInvoiceWorksheetLineDetailTag"></a>
# **deleteInvoiceWorksheetLineDetailTag**
> deleteInvoiceWorksheetLineDetailTag(invoiceWorksheetLineDetailId, invoiceWorksheetLineDetailTag)

Delete a tag for an invoiceWorksheetLineDetail.

Deletes an existing invoiceWorksheetLineDetail tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineDetailApi apiInstance = new InvoiceWorksheetLineDetailApi();
Integer invoiceWorksheetLineDetailId = 56; // Integer | Id of the invoiceWorksheetLineDetail to remove tag from
String invoiceWorksheetLineDetailTag = "invoiceWorksheetLineDetailTag_example"; // String | The tag to delete
try {
    apiInstance.deleteInvoiceWorksheetLineDetailTag(invoiceWorksheetLineDetailId, invoiceWorksheetLineDetailTag);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineDetailApi#deleteInvoiceWorksheetLineDetailTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetLineDetailId** | **Integer**| Id of the invoiceWorksheetLineDetail to remove tag from |
 **invoiceWorksheetLineDetailTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateInvoiceWorksheetLineDetailById"></a>
# **getDuplicateInvoiceWorksheetLineDetailById**
> InvoiceWorksheetLineDetail getDuplicateInvoiceWorksheetLineDetailById(invoiceWorksheetLineDetailId)

Get a duplicated an invoiceWorksheetLineDetail by id

Returns a duplicated invoiceWorksheetLineDetail identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineDetailApi apiInstance = new InvoiceWorksheetLineDetailApi();
Integer invoiceWorksheetLineDetailId = 56; // Integer | Id of the invoiceWorksheetLineDetail to be duplicated.
try {
    InvoiceWorksheetLineDetail result = apiInstance.getDuplicateInvoiceWorksheetLineDetailById(invoiceWorksheetLineDetailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineDetailApi#getDuplicateInvoiceWorksheetLineDetailById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetLineDetailId** | **Integer**| Id of the invoiceWorksheetLineDetail to be duplicated. |

### Return type

[**InvoiceWorksheetLineDetail**](InvoiceWorksheetLineDetail.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvoiceWorksheetLineDetailByFilter"></a>
# **getInvoiceWorksheetLineDetailByFilter**
> List&lt;InvoiceWorksheetLineDetail&gt; getInvoiceWorksheetLineDetailByFilter(filter, page, limit, sort)

Search invoiceWorksheetLineDetails by filter

Returns the list of invoiceWorksheetLineDetails that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineDetailApi apiInstance = new InvoiceWorksheetLineDetailApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<InvoiceWorksheetLineDetail> result = apiInstance.getInvoiceWorksheetLineDetailByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineDetailApi#getInvoiceWorksheetLineDetailByFilter");
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

[**List&lt;InvoiceWorksheetLineDetail&gt;**](InvoiceWorksheetLineDetail.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvoiceWorksheetLineDetailById"></a>
# **getInvoiceWorksheetLineDetailById**
> InvoiceWorksheetLineDetail getInvoiceWorksheetLineDetailById(invoiceWorksheetLineDetailId)

Get an invoiceWorksheetLineDetail by id

Returns the invoiceWorksheetLineDetail identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineDetailApi apiInstance = new InvoiceWorksheetLineDetailApi();
Integer invoiceWorksheetLineDetailId = 56; // Integer | Id of the invoiceWorksheetLineDetail to be returned.
try {
    InvoiceWorksheetLineDetail result = apiInstance.getInvoiceWorksheetLineDetailById(invoiceWorksheetLineDetailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineDetailApi#getInvoiceWorksheetLineDetailById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetLineDetailId** | **Integer**| Id of the invoiceWorksheetLineDetail to be returned. |

### Return type

[**InvoiceWorksheetLineDetail**](InvoiceWorksheetLineDetail.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvoiceWorksheetLineDetailTags"></a>
# **getInvoiceWorksheetLineDetailTags**
> getInvoiceWorksheetLineDetailTags(invoiceWorksheetLineDetailId)

Get the tags for an invoiceWorksheetLineDetail.

Get all existing invoiceWorksheetLineDetail tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InvoiceWorksheetLineDetailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceWorksheetLineDetailApi apiInstance = new InvoiceWorksheetLineDetailApi();
Integer invoiceWorksheetLineDetailId = 56; // Integer | Id of the invoiceWorksheetLineDetail to get tags for
try {
    apiInstance.getInvoiceWorksheetLineDetailTags(invoiceWorksheetLineDetailId);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceWorksheetLineDetailApi#getInvoiceWorksheetLineDetailTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceWorksheetLineDetailId** | **Integer**| Id of the invoiceWorksheetLineDetail to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

