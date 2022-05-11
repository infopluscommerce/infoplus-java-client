# CustomerInvoiceTemplateLineApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCustomerInvoiceTemplateLineAudit**](CustomerInvoiceTemplateLineApi.md#addCustomerInvoiceTemplateLineAudit) | **PUT** /v3.0/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/audit/{customerInvoiceTemplateLineAudit} | Add new audit for a customerInvoiceTemplateLine
[**addCustomerInvoiceTemplateLineFile**](CustomerInvoiceTemplateLineApi.md#addCustomerInvoiceTemplateLineFile) | **POST** /v3.0/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/file/{fileName} | Attach a file to a customerInvoiceTemplateLine
[**addCustomerInvoiceTemplateLineFileByURL**](CustomerInvoiceTemplateLineApi.md#addCustomerInvoiceTemplateLineFileByURL) | **POST** /v3.0/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/file | Attach a file to a customerInvoiceTemplateLine by URL.
[**addCustomerInvoiceTemplateLineTag**](CustomerInvoiceTemplateLineApi.md#addCustomerInvoiceTemplateLineTag) | **PUT** /v3.0/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/tag/{customerInvoiceTemplateLineTag} | Add new tags for a customerInvoiceTemplateLine.
[**deleteCustomerInvoiceTemplateLine**](CustomerInvoiceTemplateLineApi.md#deleteCustomerInvoiceTemplateLine) | **DELETE** /v3.0/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId} | Delete a customerInvoiceTemplateLine
[**deleteCustomerInvoiceTemplateLineFile**](CustomerInvoiceTemplateLineApi.md#deleteCustomerInvoiceTemplateLineFile) | **DELETE** /v3.0/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/file/{fileId} | Delete a file for a customerInvoiceTemplateLine.
[**deleteCustomerInvoiceTemplateLineTag**](CustomerInvoiceTemplateLineApi.md#deleteCustomerInvoiceTemplateLineTag) | **DELETE** /v3.0/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/tag/{customerInvoiceTemplateLineTag} | Delete a tag for a customerInvoiceTemplateLine.
[**getCustomerInvoiceTemplateLineByFilter**](CustomerInvoiceTemplateLineApi.md#getCustomerInvoiceTemplateLineByFilter) | **GET** /v3.0/customerInvoiceTemplateLine/search | Search customerInvoiceTemplateLines by filter
[**getCustomerInvoiceTemplateLineById**](CustomerInvoiceTemplateLineApi.md#getCustomerInvoiceTemplateLineById) | **GET** /v3.0/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId} | Get a customerInvoiceTemplateLine by id
[**getCustomerInvoiceTemplateLineFiles**](CustomerInvoiceTemplateLineApi.md#getCustomerInvoiceTemplateLineFiles) | **GET** /v3.0/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/file | Get the files for a customerInvoiceTemplateLine.
[**getCustomerInvoiceTemplateLineTags**](CustomerInvoiceTemplateLineApi.md#getCustomerInvoiceTemplateLineTags) | **GET** /v3.0/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/tag | Get the tags for a customerInvoiceTemplateLine.
[**getDuplicateCustomerInvoiceTemplateLineById**](CustomerInvoiceTemplateLineApi.md#getDuplicateCustomerInvoiceTemplateLineById) | **GET** /v3.0/customerInvoiceTemplateLine/duplicate/{customerInvoiceTemplateLineId} | Get a duplicated a customerInvoiceTemplateLine by id
[**updateCustomerInvoiceTemplateLine**](CustomerInvoiceTemplateLineApi.md#updateCustomerInvoiceTemplateLine) | **PUT** /v3.0/customerInvoiceTemplateLine | Update a customerInvoiceTemplateLine


<a name="addCustomerInvoiceTemplateLineAudit"></a>
# **addCustomerInvoiceTemplateLineAudit**
> addCustomerInvoiceTemplateLineAudit(customerInvoiceTemplateLineId, customerInvoiceTemplateLineAudit)

Add new audit for a customerInvoiceTemplateLine

Adds an audit to an existing customerInvoiceTemplateLine.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateLineApi apiInstance = new CustomerInvoiceTemplateLineApi();
Integer customerInvoiceTemplateLineId = 56; // Integer | Id of the customerInvoiceTemplateLine to add an audit to
String customerInvoiceTemplateLineAudit = "customerInvoiceTemplateLineAudit_example"; // String | The audit to add
try {
    apiInstance.addCustomerInvoiceTemplateLineAudit(customerInvoiceTemplateLineId, customerInvoiceTemplateLineAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateLineApi#addCustomerInvoiceTemplateLineAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerInvoiceTemplateLineId** | **Integer**| Id of the customerInvoiceTemplateLine to add an audit to |
 **customerInvoiceTemplateLineAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCustomerInvoiceTemplateLineFile"></a>
# **addCustomerInvoiceTemplateLineFile**
> addCustomerInvoiceTemplateLineFile(customerInvoiceTemplateLineId, fileName)

Attach a file to a customerInvoiceTemplateLine

Adds a file to an existing customerInvoiceTemplateLine.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateLineApi apiInstance = new CustomerInvoiceTemplateLineApi();
Integer customerInvoiceTemplateLineId = 56; // Integer | Id of the customerInvoiceTemplateLine to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addCustomerInvoiceTemplateLineFile(customerInvoiceTemplateLineId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateLineApi#addCustomerInvoiceTemplateLineFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerInvoiceTemplateLineId** | **Integer**| Id of the customerInvoiceTemplateLine to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addCustomerInvoiceTemplateLineFileByURL"></a>
# **addCustomerInvoiceTemplateLineFileByURL**
> addCustomerInvoiceTemplateLineFileByURL(body, customerInvoiceTemplateLineId)

Attach a file to a customerInvoiceTemplateLine by URL.

Adds a file to an existing customerInvoiceTemplateLine by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateLineApi apiInstance = new CustomerInvoiceTemplateLineApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer customerInvoiceTemplateLineId = 56; // Integer | Id of the customerInvoiceTemplateLine to add an file to
try {
    apiInstance.addCustomerInvoiceTemplateLineFileByURL(body, customerInvoiceTemplateLineId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateLineApi#addCustomerInvoiceTemplateLineFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **customerInvoiceTemplateLineId** | **Integer**| Id of the customerInvoiceTemplateLine to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCustomerInvoiceTemplateLineTag"></a>
# **addCustomerInvoiceTemplateLineTag**
> addCustomerInvoiceTemplateLineTag(customerInvoiceTemplateLineId, customerInvoiceTemplateLineTag)

Add new tags for a customerInvoiceTemplateLine.

Adds a tag to an existing customerInvoiceTemplateLine.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateLineApi apiInstance = new CustomerInvoiceTemplateLineApi();
Integer customerInvoiceTemplateLineId = 56; // Integer | Id of the customerInvoiceTemplateLine to add a tag to
String customerInvoiceTemplateLineTag = "customerInvoiceTemplateLineTag_example"; // String | The tag to add
try {
    apiInstance.addCustomerInvoiceTemplateLineTag(customerInvoiceTemplateLineId, customerInvoiceTemplateLineTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateLineApi#addCustomerInvoiceTemplateLineTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerInvoiceTemplateLineId** | **Integer**| Id of the customerInvoiceTemplateLine to add a tag to |
 **customerInvoiceTemplateLineTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomerInvoiceTemplateLine"></a>
# **deleteCustomerInvoiceTemplateLine**
> deleteCustomerInvoiceTemplateLine(customerInvoiceTemplateLineId)

Delete a customerInvoiceTemplateLine

Deletes the customerInvoiceTemplateLine identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateLineApi apiInstance = new CustomerInvoiceTemplateLineApi();
Integer customerInvoiceTemplateLineId = 56; // Integer | Id of the customerInvoiceTemplateLine to be deleted.
try {
    apiInstance.deleteCustomerInvoiceTemplateLine(customerInvoiceTemplateLineId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateLineApi#deleteCustomerInvoiceTemplateLine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerInvoiceTemplateLineId** | **Integer**| Id of the customerInvoiceTemplateLine to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCustomerInvoiceTemplateLineFile"></a>
# **deleteCustomerInvoiceTemplateLineFile**
> deleteCustomerInvoiceTemplateLineFile(customerInvoiceTemplateLineId, fileId)

Delete a file for a customerInvoiceTemplateLine.

Deletes an existing customerInvoiceTemplateLine file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateLineApi apiInstance = new CustomerInvoiceTemplateLineApi();
Integer customerInvoiceTemplateLineId = 56; // Integer | Id of the customerInvoiceTemplateLine to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteCustomerInvoiceTemplateLineFile(customerInvoiceTemplateLineId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateLineApi#deleteCustomerInvoiceTemplateLineFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerInvoiceTemplateLineId** | **Integer**| Id of the customerInvoiceTemplateLine to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCustomerInvoiceTemplateLineTag"></a>
# **deleteCustomerInvoiceTemplateLineTag**
> deleteCustomerInvoiceTemplateLineTag(customerInvoiceTemplateLineId, customerInvoiceTemplateLineTag)

Delete a tag for a customerInvoiceTemplateLine.

Deletes an existing customerInvoiceTemplateLine tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateLineApi apiInstance = new CustomerInvoiceTemplateLineApi();
Integer customerInvoiceTemplateLineId = 56; // Integer | Id of the customerInvoiceTemplateLine to remove tag from
String customerInvoiceTemplateLineTag = "customerInvoiceTemplateLineTag_example"; // String | The tag to delete
try {
    apiInstance.deleteCustomerInvoiceTemplateLineTag(customerInvoiceTemplateLineId, customerInvoiceTemplateLineTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateLineApi#deleteCustomerInvoiceTemplateLineTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerInvoiceTemplateLineId** | **Integer**| Id of the customerInvoiceTemplateLine to remove tag from |
 **customerInvoiceTemplateLineTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerInvoiceTemplateLineByFilter"></a>
# **getCustomerInvoiceTemplateLineByFilter**
> List&lt;CustomerInvoiceTemplateLine&gt; getCustomerInvoiceTemplateLineByFilter(filter, page, limit, sort)

Search customerInvoiceTemplateLines by filter

Returns the list of customerInvoiceTemplateLines that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateLineApi apiInstance = new CustomerInvoiceTemplateLineApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<CustomerInvoiceTemplateLine> result = apiInstance.getCustomerInvoiceTemplateLineByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateLineApi#getCustomerInvoiceTemplateLineByFilter");
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

[**List&lt;CustomerInvoiceTemplateLine&gt;**](CustomerInvoiceTemplateLine.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerInvoiceTemplateLineById"></a>
# **getCustomerInvoiceTemplateLineById**
> CustomerInvoiceTemplateLine getCustomerInvoiceTemplateLineById(customerInvoiceTemplateLineId)

Get a customerInvoiceTemplateLine by id

Returns the customerInvoiceTemplateLine identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateLineApi apiInstance = new CustomerInvoiceTemplateLineApi();
Integer customerInvoiceTemplateLineId = 56; // Integer | Id of the customerInvoiceTemplateLine to be returned.
try {
    CustomerInvoiceTemplateLine result = apiInstance.getCustomerInvoiceTemplateLineById(customerInvoiceTemplateLineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateLineApi#getCustomerInvoiceTemplateLineById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerInvoiceTemplateLineId** | **Integer**| Id of the customerInvoiceTemplateLine to be returned. |

### Return type

[**CustomerInvoiceTemplateLine**](CustomerInvoiceTemplateLine.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerInvoiceTemplateLineFiles"></a>
# **getCustomerInvoiceTemplateLineFiles**
> getCustomerInvoiceTemplateLineFiles(customerInvoiceTemplateLineId)

Get the files for a customerInvoiceTemplateLine.

Get all existing customerInvoiceTemplateLine files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateLineApi apiInstance = new CustomerInvoiceTemplateLineApi();
Integer customerInvoiceTemplateLineId = 56; // Integer | Id of the customerInvoiceTemplateLine to get files for
try {
    apiInstance.getCustomerInvoiceTemplateLineFiles(customerInvoiceTemplateLineId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateLineApi#getCustomerInvoiceTemplateLineFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerInvoiceTemplateLineId** | **Integer**| Id of the customerInvoiceTemplateLine to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerInvoiceTemplateLineTags"></a>
# **getCustomerInvoiceTemplateLineTags**
> getCustomerInvoiceTemplateLineTags(customerInvoiceTemplateLineId)

Get the tags for a customerInvoiceTemplateLine.

Get all existing customerInvoiceTemplateLine tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateLineApi apiInstance = new CustomerInvoiceTemplateLineApi();
Integer customerInvoiceTemplateLineId = 56; // Integer | Id of the customerInvoiceTemplateLine to get tags for
try {
    apiInstance.getCustomerInvoiceTemplateLineTags(customerInvoiceTemplateLineId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateLineApi#getCustomerInvoiceTemplateLineTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerInvoiceTemplateLineId** | **Integer**| Id of the customerInvoiceTemplateLine to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateCustomerInvoiceTemplateLineById"></a>
# **getDuplicateCustomerInvoiceTemplateLineById**
> CustomerInvoiceTemplateLine getDuplicateCustomerInvoiceTemplateLineById(customerInvoiceTemplateLineId)

Get a duplicated a customerInvoiceTemplateLine by id

Returns a duplicated customerInvoiceTemplateLine identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateLineApi apiInstance = new CustomerInvoiceTemplateLineApi();
Integer customerInvoiceTemplateLineId = 56; // Integer | Id of the customerInvoiceTemplateLine to be duplicated.
try {
    CustomerInvoiceTemplateLine result = apiInstance.getDuplicateCustomerInvoiceTemplateLineById(customerInvoiceTemplateLineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateLineApi#getDuplicateCustomerInvoiceTemplateLineById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerInvoiceTemplateLineId** | **Integer**| Id of the customerInvoiceTemplateLine to be duplicated. |

### Return type

[**CustomerInvoiceTemplateLine**](CustomerInvoiceTemplateLine.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCustomerInvoiceTemplateLine"></a>
# **updateCustomerInvoiceTemplateLine**
> updateCustomerInvoiceTemplateLine(body)

Update a customerInvoiceTemplateLine

Updates an existing customerInvoiceTemplateLine using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateLineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateLineApi apiInstance = new CustomerInvoiceTemplateLineApi();
CustomerInvoiceTemplateLine body = new CustomerInvoiceTemplateLine(); // CustomerInvoiceTemplateLine | CustomerInvoiceTemplateLine to be updated.
try {
    apiInstance.updateCustomerInvoiceTemplateLine(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateLineApi#updateCustomerInvoiceTemplateLine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomerInvoiceTemplateLine**](CustomerInvoiceTemplateLine.md)| CustomerInvoiceTemplateLine to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

