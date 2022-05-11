# ParcelInvoiceApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addParcelInvoiceAudit**](ParcelInvoiceApi.md#addParcelInvoiceAudit) | **PUT** /v3.0/parcelInvoice/{parcelInvoiceId}/audit/{parcelInvoiceAudit} | Add new audit for a parcelInvoice
[**addParcelInvoiceFile**](ParcelInvoiceApi.md#addParcelInvoiceFile) | **POST** /v3.0/parcelInvoice/{parcelInvoiceId}/file/{fileName} | Attach a file to a parcelInvoice
[**addParcelInvoiceFileByURL**](ParcelInvoiceApi.md#addParcelInvoiceFileByURL) | **POST** /v3.0/parcelInvoice/{parcelInvoiceId}/file | Attach a file to a parcelInvoice by URL.
[**addParcelInvoiceTag**](ParcelInvoiceApi.md#addParcelInvoiceTag) | **PUT** /v3.0/parcelInvoice/{parcelInvoiceId}/tag/{parcelInvoiceTag} | Add new tags for a parcelInvoice.
[**deleteParcelInvoice**](ParcelInvoiceApi.md#deleteParcelInvoice) | **DELETE** /v3.0/parcelInvoice/{parcelInvoiceId} | Delete a parcelInvoice
[**deleteParcelInvoiceFile**](ParcelInvoiceApi.md#deleteParcelInvoiceFile) | **DELETE** /v3.0/parcelInvoice/{parcelInvoiceId}/file/{fileId} | Delete a file for a parcelInvoice.
[**deleteParcelInvoiceTag**](ParcelInvoiceApi.md#deleteParcelInvoiceTag) | **DELETE** /v3.0/parcelInvoice/{parcelInvoiceId}/tag/{parcelInvoiceTag} | Delete a tag for a parcelInvoice.
[**getDuplicateParcelInvoiceById**](ParcelInvoiceApi.md#getDuplicateParcelInvoiceById) | **GET** /v3.0/parcelInvoice/duplicate/{parcelInvoiceId} | Get a duplicated a parcelInvoice by id
[**getParcelInvoiceByFilter**](ParcelInvoiceApi.md#getParcelInvoiceByFilter) | **GET** /v3.0/parcelInvoice/search | Search parcelInvoices by filter
[**getParcelInvoiceById**](ParcelInvoiceApi.md#getParcelInvoiceById) | **GET** /v3.0/parcelInvoice/{parcelInvoiceId} | Get a parcelInvoice by id
[**getParcelInvoiceFiles**](ParcelInvoiceApi.md#getParcelInvoiceFiles) | **GET** /v3.0/parcelInvoice/{parcelInvoiceId}/file | Get the files for a parcelInvoice.
[**getParcelInvoiceTags**](ParcelInvoiceApi.md#getParcelInvoiceTags) | **GET** /v3.0/parcelInvoice/{parcelInvoiceId}/tag | Get the tags for a parcelInvoice.


<a name="addParcelInvoiceAudit"></a>
# **addParcelInvoiceAudit**
> addParcelInvoiceAudit(parcelInvoiceId, parcelInvoiceAudit)

Add new audit for a parcelInvoice

Adds an audit to an existing parcelInvoice.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelInvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelInvoiceApi apiInstance = new ParcelInvoiceApi();
Integer parcelInvoiceId = 56; // Integer | Id of the parcelInvoice to add an audit to
String parcelInvoiceAudit = "parcelInvoiceAudit_example"; // String | The audit to add
try {
    apiInstance.addParcelInvoiceAudit(parcelInvoiceId, parcelInvoiceAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelInvoiceApi#addParcelInvoiceAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelInvoiceId** | **Integer**| Id of the parcelInvoice to add an audit to |
 **parcelInvoiceAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addParcelInvoiceFile"></a>
# **addParcelInvoiceFile**
> addParcelInvoiceFile(parcelInvoiceId, fileName)

Attach a file to a parcelInvoice

Adds a file to an existing parcelInvoice.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelInvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelInvoiceApi apiInstance = new ParcelInvoiceApi();
Integer parcelInvoiceId = 56; // Integer | Id of the parcelInvoice to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addParcelInvoiceFile(parcelInvoiceId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelInvoiceApi#addParcelInvoiceFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelInvoiceId** | **Integer**| Id of the parcelInvoice to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addParcelInvoiceFileByURL"></a>
# **addParcelInvoiceFileByURL**
> addParcelInvoiceFileByURL(body, parcelInvoiceId)

Attach a file to a parcelInvoice by URL.

Adds a file to an existing parcelInvoice by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelInvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelInvoiceApi apiInstance = new ParcelInvoiceApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer parcelInvoiceId = 56; // Integer | Id of the parcelInvoice to add an file to
try {
    apiInstance.addParcelInvoiceFileByURL(body, parcelInvoiceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelInvoiceApi#addParcelInvoiceFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **parcelInvoiceId** | **Integer**| Id of the parcelInvoice to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addParcelInvoiceTag"></a>
# **addParcelInvoiceTag**
> addParcelInvoiceTag(parcelInvoiceId, parcelInvoiceTag)

Add new tags for a parcelInvoice.

Adds a tag to an existing parcelInvoice.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelInvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelInvoiceApi apiInstance = new ParcelInvoiceApi();
Integer parcelInvoiceId = 56; // Integer | Id of the parcelInvoice to add a tag to
String parcelInvoiceTag = "parcelInvoiceTag_example"; // String | The tag to add
try {
    apiInstance.addParcelInvoiceTag(parcelInvoiceId, parcelInvoiceTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelInvoiceApi#addParcelInvoiceTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelInvoiceId** | **Integer**| Id of the parcelInvoice to add a tag to |
 **parcelInvoiceTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteParcelInvoice"></a>
# **deleteParcelInvoice**
> deleteParcelInvoice(parcelInvoiceId)

Delete a parcelInvoice

Deletes the parcelInvoice identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelInvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelInvoiceApi apiInstance = new ParcelInvoiceApi();
Integer parcelInvoiceId = 56; // Integer | Id of the parcelInvoice to be deleted.
try {
    apiInstance.deleteParcelInvoice(parcelInvoiceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelInvoiceApi#deleteParcelInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelInvoiceId** | **Integer**| Id of the parcelInvoice to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteParcelInvoiceFile"></a>
# **deleteParcelInvoiceFile**
> deleteParcelInvoiceFile(parcelInvoiceId, fileId)

Delete a file for a parcelInvoice.

Deletes an existing parcelInvoice file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelInvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelInvoiceApi apiInstance = new ParcelInvoiceApi();
Integer parcelInvoiceId = 56; // Integer | Id of the parcelInvoice to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteParcelInvoiceFile(parcelInvoiceId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelInvoiceApi#deleteParcelInvoiceFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelInvoiceId** | **Integer**| Id of the parcelInvoice to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteParcelInvoiceTag"></a>
# **deleteParcelInvoiceTag**
> deleteParcelInvoiceTag(parcelInvoiceId, parcelInvoiceTag)

Delete a tag for a parcelInvoice.

Deletes an existing parcelInvoice tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelInvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelInvoiceApi apiInstance = new ParcelInvoiceApi();
Integer parcelInvoiceId = 56; // Integer | Id of the parcelInvoice to remove tag from
String parcelInvoiceTag = "parcelInvoiceTag_example"; // String | The tag to delete
try {
    apiInstance.deleteParcelInvoiceTag(parcelInvoiceId, parcelInvoiceTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelInvoiceApi#deleteParcelInvoiceTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelInvoiceId** | **Integer**| Id of the parcelInvoice to remove tag from |
 **parcelInvoiceTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateParcelInvoiceById"></a>
# **getDuplicateParcelInvoiceById**
> ParcelInvoice getDuplicateParcelInvoiceById(parcelInvoiceId)

Get a duplicated a parcelInvoice by id

Returns a duplicated parcelInvoice identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelInvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelInvoiceApi apiInstance = new ParcelInvoiceApi();
Integer parcelInvoiceId = 56; // Integer | Id of the parcelInvoice to be duplicated.
try {
    ParcelInvoice result = apiInstance.getDuplicateParcelInvoiceById(parcelInvoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelInvoiceApi#getDuplicateParcelInvoiceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelInvoiceId** | **Integer**| Id of the parcelInvoice to be duplicated. |

### Return type

[**ParcelInvoice**](ParcelInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParcelInvoiceByFilter"></a>
# **getParcelInvoiceByFilter**
> List&lt;ParcelInvoice&gt; getParcelInvoiceByFilter(filter, page, limit, sort)

Search parcelInvoices by filter

Returns the list of parcelInvoices that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelInvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelInvoiceApi apiInstance = new ParcelInvoiceApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ParcelInvoice> result = apiInstance.getParcelInvoiceByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelInvoiceApi#getParcelInvoiceByFilter");
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

[**List&lt;ParcelInvoice&gt;**](ParcelInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParcelInvoiceById"></a>
# **getParcelInvoiceById**
> ParcelInvoice getParcelInvoiceById(parcelInvoiceId)

Get a parcelInvoice by id

Returns the parcelInvoice identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelInvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelInvoiceApi apiInstance = new ParcelInvoiceApi();
Integer parcelInvoiceId = 56; // Integer | Id of the parcelInvoice to be returned.
try {
    ParcelInvoice result = apiInstance.getParcelInvoiceById(parcelInvoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelInvoiceApi#getParcelInvoiceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelInvoiceId** | **Integer**| Id of the parcelInvoice to be returned. |

### Return type

[**ParcelInvoice**](ParcelInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParcelInvoiceFiles"></a>
# **getParcelInvoiceFiles**
> getParcelInvoiceFiles(parcelInvoiceId)

Get the files for a parcelInvoice.

Get all existing parcelInvoice files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelInvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelInvoiceApi apiInstance = new ParcelInvoiceApi();
Integer parcelInvoiceId = 56; // Integer | Id of the parcelInvoice to get files for
try {
    apiInstance.getParcelInvoiceFiles(parcelInvoiceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelInvoiceApi#getParcelInvoiceFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelInvoiceId** | **Integer**| Id of the parcelInvoice to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParcelInvoiceTags"></a>
# **getParcelInvoiceTags**
> getParcelInvoiceTags(parcelInvoiceId)

Get the tags for a parcelInvoice.

Get all existing parcelInvoice tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelInvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelInvoiceApi apiInstance = new ParcelInvoiceApi();
Integer parcelInvoiceId = 56; // Integer | Id of the parcelInvoice to get tags for
try {
    apiInstance.getParcelInvoiceTags(parcelInvoiceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelInvoiceApi#getParcelInvoiceTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelInvoiceId** | **Integer**| Id of the parcelInvoice to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

