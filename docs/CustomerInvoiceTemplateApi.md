# CustomerInvoiceTemplateApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCustomerInvoiceTemplate**](CustomerInvoiceTemplateApi.md#addCustomerInvoiceTemplate) | **POST** /beta/customerInvoiceTemplate | Create a customerInvoiceTemplate
[**addCustomerInvoiceTemplateAudit**](CustomerInvoiceTemplateApi.md#addCustomerInvoiceTemplateAudit) | **PUT** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/audit/{customerInvoiceTemplateAudit} | Add new audit for a customerInvoiceTemplate
[**addCustomerInvoiceTemplateFile**](CustomerInvoiceTemplateApi.md#addCustomerInvoiceTemplateFile) | **POST** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/file/{fileName} | Attach a file to a customerInvoiceTemplate
[**addCustomerInvoiceTemplateFileByURL**](CustomerInvoiceTemplateApi.md#addCustomerInvoiceTemplateFileByURL) | **POST** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/file | Attach a file to a customerInvoiceTemplate by URL.
[**addCustomerInvoiceTemplateTag**](CustomerInvoiceTemplateApi.md#addCustomerInvoiceTemplateTag) | **PUT** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/tag/{customerInvoiceTemplateTag} | Add new tags for a customerInvoiceTemplate.
[**deleteCustomerInvoiceTemplate**](CustomerInvoiceTemplateApi.md#deleteCustomerInvoiceTemplate) | **DELETE** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId} | Delete a customerInvoiceTemplate
[**deleteCustomerInvoiceTemplateFile**](CustomerInvoiceTemplateApi.md#deleteCustomerInvoiceTemplateFile) | **DELETE** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/file/{fileId} | Delete a file for a customerInvoiceTemplate.
[**deleteCustomerInvoiceTemplateTag**](CustomerInvoiceTemplateApi.md#deleteCustomerInvoiceTemplateTag) | **DELETE** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/tag/{customerInvoiceTemplateTag} | Delete a tag for a customerInvoiceTemplate.
[**getCustomerInvoiceTemplateByFilter**](CustomerInvoiceTemplateApi.md#getCustomerInvoiceTemplateByFilter) | **GET** /beta/customerInvoiceTemplate/search | Search customerInvoiceTemplates by filter
[**getCustomerInvoiceTemplateById**](CustomerInvoiceTemplateApi.md#getCustomerInvoiceTemplateById) | **GET** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId} | Get a customerInvoiceTemplate by id
[**getCustomerInvoiceTemplateFiles**](CustomerInvoiceTemplateApi.md#getCustomerInvoiceTemplateFiles) | **GET** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/file | Get the files for a customerInvoiceTemplate.
[**getCustomerInvoiceTemplateTags**](CustomerInvoiceTemplateApi.md#getCustomerInvoiceTemplateTags) | **GET** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/tag | Get the tags for a customerInvoiceTemplate.
[**getDuplicateCustomerInvoiceTemplateById**](CustomerInvoiceTemplateApi.md#getDuplicateCustomerInvoiceTemplateById) | **GET** /beta/customerInvoiceTemplate/duplicate/{customerInvoiceTemplateId} | Get a duplicated a customerInvoiceTemplate by id
[**updateCustomerInvoiceTemplate**](CustomerInvoiceTemplateApi.md#updateCustomerInvoiceTemplate) | **PUT** /beta/customerInvoiceTemplate | Update a customerInvoiceTemplate


<a name="addCustomerInvoiceTemplate"></a>
# **addCustomerInvoiceTemplate**
> CustomerInvoiceTemplate addCustomerInvoiceTemplate(body)

Create a customerInvoiceTemplate

Inserts a new customerInvoiceTemplate using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateApi apiInstance = new CustomerInvoiceTemplateApi();
CustomerInvoiceTemplate body = new CustomerInvoiceTemplate(); // CustomerInvoiceTemplate | CustomerInvoiceTemplate to be inserted.
try {
    CustomerInvoiceTemplate result = apiInstance.addCustomerInvoiceTemplate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateApi#addCustomerInvoiceTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomerInvoiceTemplate**](CustomerInvoiceTemplate.md)| CustomerInvoiceTemplate to be inserted. |

### Return type

[**CustomerInvoiceTemplate**](CustomerInvoiceTemplate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCustomerInvoiceTemplateAudit"></a>
# **addCustomerInvoiceTemplateAudit**
> addCustomerInvoiceTemplateAudit(customerInvoiceTemplateId, customerInvoiceTemplateAudit)

Add new audit for a customerInvoiceTemplate

Adds an audit to an existing customerInvoiceTemplate.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateApi apiInstance = new CustomerInvoiceTemplateApi();
Integer customerInvoiceTemplateId = 56; // Integer | Id of the customerInvoiceTemplate to add an audit to
String customerInvoiceTemplateAudit = "customerInvoiceTemplateAudit_example"; // String | The audit to add
try {
    apiInstance.addCustomerInvoiceTemplateAudit(customerInvoiceTemplateId, customerInvoiceTemplateAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateApi#addCustomerInvoiceTemplateAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerInvoiceTemplateId** | **Integer**| Id of the customerInvoiceTemplate to add an audit to |
 **customerInvoiceTemplateAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCustomerInvoiceTemplateFile"></a>
# **addCustomerInvoiceTemplateFile**
> addCustomerInvoiceTemplateFile(customerInvoiceTemplateId, fileName)

Attach a file to a customerInvoiceTemplate

Adds a file to an existing customerInvoiceTemplate.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateApi apiInstance = new CustomerInvoiceTemplateApi();
Integer customerInvoiceTemplateId = 56; // Integer | Id of the customerInvoiceTemplate to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addCustomerInvoiceTemplateFile(customerInvoiceTemplateId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateApi#addCustomerInvoiceTemplateFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerInvoiceTemplateId** | **Integer**| Id of the customerInvoiceTemplate to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addCustomerInvoiceTemplateFileByURL"></a>
# **addCustomerInvoiceTemplateFileByURL**
> addCustomerInvoiceTemplateFileByURL(body, customerInvoiceTemplateId)

Attach a file to a customerInvoiceTemplate by URL.

Adds a file to an existing customerInvoiceTemplate by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateApi apiInstance = new CustomerInvoiceTemplateApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer customerInvoiceTemplateId = 56; // Integer | Id of the customerInvoiceTemplate to add an file to
try {
    apiInstance.addCustomerInvoiceTemplateFileByURL(body, customerInvoiceTemplateId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateApi#addCustomerInvoiceTemplateFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **customerInvoiceTemplateId** | **Integer**| Id of the customerInvoiceTemplate to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCustomerInvoiceTemplateTag"></a>
# **addCustomerInvoiceTemplateTag**
> addCustomerInvoiceTemplateTag(customerInvoiceTemplateId, customerInvoiceTemplateTag)

Add new tags for a customerInvoiceTemplate.

Adds a tag to an existing customerInvoiceTemplate.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateApi apiInstance = new CustomerInvoiceTemplateApi();
Integer customerInvoiceTemplateId = 56; // Integer | Id of the customerInvoiceTemplate to add a tag to
String customerInvoiceTemplateTag = "customerInvoiceTemplateTag_example"; // String | The tag to add
try {
    apiInstance.addCustomerInvoiceTemplateTag(customerInvoiceTemplateId, customerInvoiceTemplateTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateApi#addCustomerInvoiceTemplateTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerInvoiceTemplateId** | **Integer**| Id of the customerInvoiceTemplate to add a tag to |
 **customerInvoiceTemplateTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomerInvoiceTemplate"></a>
# **deleteCustomerInvoiceTemplate**
> deleteCustomerInvoiceTemplate(customerInvoiceTemplateId)

Delete a customerInvoiceTemplate

Deletes the customerInvoiceTemplate identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateApi apiInstance = new CustomerInvoiceTemplateApi();
Integer customerInvoiceTemplateId = 56; // Integer | Id of the customerInvoiceTemplate to be deleted.
try {
    apiInstance.deleteCustomerInvoiceTemplate(customerInvoiceTemplateId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateApi#deleteCustomerInvoiceTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerInvoiceTemplateId** | **Integer**| Id of the customerInvoiceTemplate to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCustomerInvoiceTemplateFile"></a>
# **deleteCustomerInvoiceTemplateFile**
> deleteCustomerInvoiceTemplateFile(customerInvoiceTemplateId, fileId)

Delete a file for a customerInvoiceTemplate.

Deletes an existing customerInvoiceTemplate file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateApi apiInstance = new CustomerInvoiceTemplateApi();
Integer customerInvoiceTemplateId = 56; // Integer | Id of the customerInvoiceTemplate to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteCustomerInvoiceTemplateFile(customerInvoiceTemplateId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateApi#deleteCustomerInvoiceTemplateFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerInvoiceTemplateId** | **Integer**| Id of the customerInvoiceTemplate to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCustomerInvoiceTemplateTag"></a>
# **deleteCustomerInvoiceTemplateTag**
> deleteCustomerInvoiceTemplateTag(customerInvoiceTemplateId, customerInvoiceTemplateTag)

Delete a tag for a customerInvoiceTemplate.

Deletes an existing customerInvoiceTemplate tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateApi apiInstance = new CustomerInvoiceTemplateApi();
Integer customerInvoiceTemplateId = 56; // Integer | Id of the customerInvoiceTemplate to remove tag from
String customerInvoiceTemplateTag = "customerInvoiceTemplateTag_example"; // String | The tag to delete
try {
    apiInstance.deleteCustomerInvoiceTemplateTag(customerInvoiceTemplateId, customerInvoiceTemplateTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateApi#deleteCustomerInvoiceTemplateTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerInvoiceTemplateId** | **Integer**| Id of the customerInvoiceTemplate to remove tag from |
 **customerInvoiceTemplateTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerInvoiceTemplateByFilter"></a>
# **getCustomerInvoiceTemplateByFilter**
> List&lt;CustomerInvoiceTemplate&gt; getCustomerInvoiceTemplateByFilter(filter, page, limit, sort)

Search customerInvoiceTemplates by filter

Returns the list of customerInvoiceTemplates that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateApi apiInstance = new CustomerInvoiceTemplateApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<CustomerInvoiceTemplate> result = apiInstance.getCustomerInvoiceTemplateByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateApi#getCustomerInvoiceTemplateByFilter");
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

[**List&lt;CustomerInvoiceTemplate&gt;**](CustomerInvoiceTemplate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerInvoiceTemplateById"></a>
# **getCustomerInvoiceTemplateById**
> CustomerInvoiceTemplate getCustomerInvoiceTemplateById(customerInvoiceTemplateId)

Get a customerInvoiceTemplate by id

Returns the customerInvoiceTemplate identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateApi apiInstance = new CustomerInvoiceTemplateApi();
Integer customerInvoiceTemplateId = 56; // Integer | Id of the customerInvoiceTemplate to be returned.
try {
    CustomerInvoiceTemplate result = apiInstance.getCustomerInvoiceTemplateById(customerInvoiceTemplateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateApi#getCustomerInvoiceTemplateById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerInvoiceTemplateId** | **Integer**| Id of the customerInvoiceTemplate to be returned. |

### Return type

[**CustomerInvoiceTemplate**](CustomerInvoiceTemplate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerInvoiceTemplateFiles"></a>
# **getCustomerInvoiceTemplateFiles**
> getCustomerInvoiceTemplateFiles(customerInvoiceTemplateId)

Get the files for a customerInvoiceTemplate.

Get all existing customerInvoiceTemplate files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateApi apiInstance = new CustomerInvoiceTemplateApi();
Integer customerInvoiceTemplateId = 56; // Integer | Id of the customerInvoiceTemplate to get files for
try {
    apiInstance.getCustomerInvoiceTemplateFiles(customerInvoiceTemplateId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateApi#getCustomerInvoiceTemplateFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerInvoiceTemplateId** | **Integer**| Id of the customerInvoiceTemplate to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerInvoiceTemplateTags"></a>
# **getCustomerInvoiceTemplateTags**
> getCustomerInvoiceTemplateTags(customerInvoiceTemplateId)

Get the tags for a customerInvoiceTemplate.

Get all existing customerInvoiceTemplate tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateApi apiInstance = new CustomerInvoiceTemplateApi();
Integer customerInvoiceTemplateId = 56; // Integer | Id of the customerInvoiceTemplate to get tags for
try {
    apiInstance.getCustomerInvoiceTemplateTags(customerInvoiceTemplateId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateApi#getCustomerInvoiceTemplateTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerInvoiceTemplateId** | **Integer**| Id of the customerInvoiceTemplate to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateCustomerInvoiceTemplateById"></a>
# **getDuplicateCustomerInvoiceTemplateById**
> CustomerInvoiceTemplate getDuplicateCustomerInvoiceTemplateById(customerInvoiceTemplateId)

Get a duplicated a customerInvoiceTemplate by id

Returns a duplicated customerInvoiceTemplate identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateApi apiInstance = new CustomerInvoiceTemplateApi();
Integer customerInvoiceTemplateId = 56; // Integer | Id of the customerInvoiceTemplate to be duplicated.
try {
    CustomerInvoiceTemplate result = apiInstance.getDuplicateCustomerInvoiceTemplateById(customerInvoiceTemplateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateApi#getDuplicateCustomerInvoiceTemplateById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerInvoiceTemplateId** | **Integer**| Id of the customerInvoiceTemplate to be duplicated. |

### Return type

[**CustomerInvoiceTemplate**](CustomerInvoiceTemplate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCustomerInvoiceTemplate"></a>
# **updateCustomerInvoiceTemplate**
> updateCustomerInvoiceTemplate(body)

Update a customerInvoiceTemplate

Updates an existing customerInvoiceTemplate using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerInvoiceTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerInvoiceTemplateApi apiInstance = new CustomerInvoiceTemplateApi();
CustomerInvoiceTemplate body = new CustomerInvoiceTemplate(); // CustomerInvoiceTemplate | CustomerInvoiceTemplate to be updated.
try {
    apiInstance.updateCustomerInvoiceTemplate(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceTemplateApi#updateCustomerInvoiceTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomerInvoiceTemplate**](CustomerInvoiceTemplate.md)| CustomerInvoiceTemplate to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

