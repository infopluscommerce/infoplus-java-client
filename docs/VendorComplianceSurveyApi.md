# VendorComplianceSurveyApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addVendorComplianceSurvey**](VendorComplianceSurveyApi.md#addVendorComplianceSurvey) | **POST** /v3.0/vendorComplianceSurvey | Create a vendorComplianceSurvey
[**addVendorComplianceSurveyAudit**](VendorComplianceSurveyApi.md#addVendorComplianceSurveyAudit) | **PUT** /v3.0/vendorComplianceSurvey/{vendorComplianceSurveyId}/audit/{vendorComplianceSurveyAudit} | Add new audit for a vendorComplianceSurvey
[**addVendorComplianceSurveyFile**](VendorComplianceSurveyApi.md#addVendorComplianceSurveyFile) | **POST** /v3.0/vendorComplianceSurvey/{vendorComplianceSurveyId}/file/{fileName} | Attach a file to a vendorComplianceSurvey
[**addVendorComplianceSurveyFileByURL**](VendorComplianceSurveyApi.md#addVendorComplianceSurveyFileByURL) | **POST** /v3.0/vendorComplianceSurvey/{vendorComplianceSurveyId}/file | Attach a file to a vendorComplianceSurvey by URL.
[**addVendorComplianceSurveyTag**](VendorComplianceSurveyApi.md#addVendorComplianceSurveyTag) | **PUT** /v3.0/vendorComplianceSurvey/{vendorComplianceSurveyId}/tag/{vendorComplianceSurveyTag} | Add new tags for a vendorComplianceSurvey.
[**deleteVendorComplianceSurvey**](VendorComplianceSurveyApi.md#deleteVendorComplianceSurvey) | **DELETE** /v3.0/vendorComplianceSurvey/{vendorComplianceSurveyId} | Delete a vendorComplianceSurvey
[**deleteVendorComplianceSurveyFile**](VendorComplianceSurveyApi.md#deleteVendorComplianceSurveyFile) | **DELETE** /v3.0/vendorComplianceSurvey/{vendorComplianceSurveyId}/file/{fileId} | Delete a file for a vendorComplianceSurvey.
[**deleteVendorComplianceSurveyTag**](VendorComplianceSurveyApi.md#deleteVendorComplianceSurveyTag) | **DELETE** /v3.0/vendorComplianceSurvey/{vendorComplianceSurveyId}/tag/{vendorComplianceSurveyTag} | Delete a tag for a vendorComplianceSurvey.
[**getDuplicateVendorComplianceSurveyById**](VendorComplianceSurveyApi.md#getDuplicateVendorComplianceSurveyById) | **GET** /v3.0/vendorComplianceSurvey/duplicate/{vendorComplianceSurveyId} | Get a duplicated a vendorComplianceSurvey by id
[**getVendorComplianceSurveyByFilter**](VendorComplianceSurveyApi.md#getVendorComplianceSurveyByFilter) | **GET** /v3.0/vendorComplianceSurvey/search | Search vendorComplianceSurveys by filter
[**getVendorComplianceSurveyById**](VendorComplianceSurveyApi.md#getVendorComplianceSurveyById) | **GET** /v3.0/vendorComplianceSurvey/{vendorComplianceSurveyId} | Get a vendorComplianceSurvey by id
[**getVendorComplianceSurveyFiles**](VendorComplianceSurveyApi.md#getVendorComplianceSurveyFiles) | **GET** /v3.0/vendorComplianceSurvey/{vendorComplianceSurveyId}/file | Get the files for a vendorComplianceSurvey.
[**getVendorComplianceSurveyTags**](VendorComplianceSurveyApi.md#getVendorComplianceSurveyTags) | **GET** /v3.0/vendorComplianceSurvey/{vendorComplianceSurveyId}/tag | Get the tags for a vendorComplianceSurvey.
[**updateVendorComplianceSurvey**](VendorComplianceSurveyApi.md#updateVendorComplianceSurvey) | **PUT** /v3.0/vendorComplianceSurvey | Update a vendorComplianceSurvey
[**updateVendorComplianceSurveyCustomFields**](VendorComplianceSurveyApi.md#updateVendorComplianceSurveyCustomFields) | **PUT** /v3.0/vendorComplianceSurvey/customFields | Update a vendorComplianceSurvey custom fields


<a name="addVendorComplianceSurvey"></a>
# **addVendorComplianceSurvey**
> VendorComplianceSurvey addVendorComplianceSurvey(body)

Create a vendorComplianceSurvey

Inserts a new vendorComplianceSurvey using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorComplianceSurveyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorComplianceSurveyApi apiInstance = new VendorComplianceSurveyApi();
VendorComplianceSurvey body = new VendorComplianceSurvey(); // VendorComplianceSurvey | VendorComplianceSurvey to be inserted.
try {
    VendorComplianceSurvey result = apiInstance.addVendorComplianceSurvey(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorComplianceSurveyApi#addVendorComplianceSurvey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VendorComplianceSurvey**](VendorComplianceSurvey.md)| VendorComplianceSurvey to be inserted. |

### Return type

[**VendorComplianceSurvey**](VendorComplianceSurvey.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addVendorComplianceSurveyAudit"></a>
# **addVendorComplianceSurveyAudit**
> addVendorComplianceSurveyAudit(vendorComplianceSurveyId, vendorComplianceSurveyAudit)

Add new audit for a vendorComplianceSurvey

Adds an audit to an existing vendorComplianceSurvey.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorComplianceSurveyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorComplianceSurveyApi apiInstance = new VendorComplianceSurveyApi();
Integer vendorComplianceSurveyId = 56; // Integer | Id of the vendorComplianceSurvey to add an audit to
String vendorComplianceSurveyAudit = "vendorComplianceSurveyAudit_example"; // String | The audit to add
try {
    apiInstance.addVendorComplianceSurveyAudit(vendorComplianceSurveyId, vendorComplianceSurveyAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorComplianceSurveyApi#addVendorComplianceSurveyAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorComplianceSurveyId** | **Integer**| Id of the vendorComplianceSurvey to add an audit to |
 **vendorComplianceSurveyAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addVendorComplianceSurveyFile"></a>
# **addVendorComplianceSurveyFile**
> addVendorComplianceSurveyFile(vendorComplianceSurveyId, fileName)

Attach a file to a vendorComplianceSurvey

Adds a file to an existing vendorComplianceSurvey.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorComplianceSurveyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorComplianceSurveyApi apiInstance = new VendorComplianceSurveyApi();
Integer vendorComplianceSurveyId = 56; // Integer | Id of the vendorComplianceSurvey to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addVendorComplianceSurveyFile(vendorComplianceSurveyId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorComplianceSurveyApi#addVendorComplianceSurveyFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorComplianceSurveyId** | **Integer**| Id of the vendorComplianceSurvey to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addVendorComplianceSurveyFileByURL"></a>
# **addVendorComplianceSurveyFileByURL**
> addVendorComplianceSurveyFileByURL(body, vendorComplianceSurveyId)

Attach a file to a vendorComplianceSurvey by URL.

Adds a file to an existing vendorComplianceSurvey by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorComplianceSurveyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorComplianceSurveyApi apiInstance = new VendorComplianceSurveyApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer vendorComplianceSurveyId = 56; // Integer | Id of the vendorComplianceSurvey to add an file to
try {
    apiInstance.addVendorComplianceSurveyFileByURL(body, vendorComplianceSurveyId);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorComplianceSurveyApi#addVendorComplianceSurveyFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **vendorComplianceSurveyId** | **Integer**| Id of the vendorComplianceSurvey to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addVendorComplianceSurveyTag"></a>
# **addVendorComplianceSurveyTag**
> addVendorComplianceSurveyTag(vendorComplianceSurveyId, vendorComplianceSurveyTag)

Add new tags for a vendorComplianceSurvey.

Adds a tag to an existing vendorComplianceSurvey.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorComplianceSurveyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorComplianceSurveyApi apiInstance = new VendorComplianceSurveyApi();
Integer vendorComplianceSurveyId = 56; // Integer | Id of the vendorComplianceSurvey to add a tag to
String vendorComplianceSurveyTag = "vendorComplianceSurveyTag_example"; // String | The tag to add
try {
    apiInstance.addVendorComplianceSurveyTag(vendorComplianceSurveyId, vendorComplianceSurveyTag);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorComplianceSurveyApi#addVendorComplianceSurveyTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorComplianceSurveyId** | **Integer**| Id of the vendorComplianceSurvey to add a tag to |
 **vendorComplianceSurveyTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteVendorComplianceSurvey"></a>
# **deleteVendorComplianceSurvey**
> deleteVendorComplianceSurvey(vendorComplianceSurveyId)

Delete a vendorComplianceSurvey

Deletes the vendorComplianceSurvey identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorComplianceSurveyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorComplianceSurveyApi apiInstance = new VendorComplianceSurveyApi();
Integer vendorComplianceSurveyId = 56; // Integer | Id of the vendorComplianceSurvey to be deleted.
try {
    apiInstance.deleteVendorComplianceSurvey(vendorComplianceSurveyId);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorComplianceSurveyApi#deleteVendorComplianceSurvey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorComplianceSurveyId** | **Integer**| Id of the vendorComplianceSurvey to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVendorComplianceSurveyFile"></a>
# **deleteVendorComplianceSurveyFile**
> deleteVendorComplianceSurveyFile(vendorComplianceSurveyId, fileId)

Delete a file for a vendorComplianceSurvey.

Deletes an existing vendorComplianceSurvey file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorComplianceSurveyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorComplianceSurveyApi apiInstance = new VendorComplianceSurveyApi();
Integer vendorComplianceSurveyId = 56; // Integer | Id of the vendorComplianceSurvey to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteVendorComplianceSurveyFile(vendorComplianceSurveyId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorComplianceSurveyApi#deleteVendorComplianceSurveyFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorComplianceSurveyId** | **Integer**| Id of the vendorComplianceSurvey to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVendorComplianceSurveyTag"></a>
# **deleteVendorComplianceSurveyTag**
> deleteVendorComplianceSurveyTag(vendorComplianceSurveyId, vendorComplianceSurveyTag)

Delete a tag for a vendorComplianceSurvey.

Deletes an existing vendorComplianceSurvey tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorComplianceSurveyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorComplianceSurveyApi apiInstance = new VendorComplianceSurveyApi();
Integer vendorComplianceSurveyId = 56; // Integer | Id of the vendorComplianceSurvey to remove tag from
String vendorComplianceSurveyTag = "vendorComplianceSurveyTag_example"; // String | The tag to delete
try {
    apiInstance.deleteVendorComplianceSurveyTag(vendorComplianceSurveyId, vendorComplianceSurveyTag);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorComplianceSurveyApi#deleteVendorComplianceSurveyTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorComplianceSurveyId** | **Integer**| Id of the vendorComplianceSurvey to remove tag from |
 **vendorComplianceSurveyTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateVendorComplianceSurveyById"></a>
# **getDuplicateVendorComplianceSurveyById**
> VendorComplianceSurvey getDuplicateVendorComplianceSurveyById(vendorComplianceSurveyId)

Get a duplicated a vendorComplianceSurvey by id

Returns a duplicated vendorComplianceSurvey identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorComplianceSurveyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorComplianceSurveyApi apiInstance = new VendorComplianceSurveyApi();
Integer vendorComplianceSurveyId = 56; // Integer | Id of the vendorComplianceSurvey to be duplicated.
try {
    VendorComplianceSurvey result = apiInstance.getDuplicateVendorComplianceSurveyById(vendorComplianceSurveyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorComplianceSurveyApi#getDuplicateVendorComplianceSurveyById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorComplianceSurveyId** | **Integer**| Id of the vendorComplianceSurvey to be duplicated. |

### Return type

[**VendorComplianceSurvey**](VendorComplianceSurvey.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVendorComplianceSurveyByFilter"></a>
# **getVendorComplianceSurveyByFilter**
> List&lt;VendorComplianceSurvey&gt; getVendorComplianceSurveyByFilter(filter, page, limit, sort)

Search vendorComplianceSurveys by filter

Returns the list of vendorComplianceSurveys that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorComplianceSurveyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorComplianceSurveyApi apiInstance = new VendorComplianceSurveyApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<VendorComplianceSurvey> result = apiInstance.getVendorComplianceSurveyByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorComplianceSurveyApi#getVendorComplianceSurveyByFilter");
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

[**List&lt;VendorComplianceSurvey&gt;**](VendorComplianceSurvey.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVendorComplianceSurveyById"></a>
# **getVendorComplianceSurveyById**
> VendorComplianceSurvey getVendorComplianceSurveyById(vendorComplianceSurveyId)

Get a vendorComplianceSurvey by id

Returns the vendorComplianceSurvey identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorComplianceSurveyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorComplianceSurveyApi apiInstance = new VendorComplianceSurveyApi();
Integer vendorComplianceSurveyId = 56; // Integer | Id of the vendorComplianceSurvey to be returned.
try {
    VendorComplianceSurvey result = apiInstance.getVendorComplianceSurveyById(vendorComplianceSurveyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorComplianceSurveyApi#getVendorComplianceSurveyById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorComplianceSurveyId** | **Integer**| Id of the vendorComplianceSurvey to be returned. |

### Return type

[**VendorComplianceSurvey**](VendorComplianceSurvey.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVendorComplianceSurveyFiles"></a>
# **getVendorComplianceSurveyFiles**
> getVendorComplianceSurveyFiles(vendorComplianceSurveyId)

Get the files for a vendorComplianceSurvey.

Get all existing vendorComplianceSurvey files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorComplianceSurveyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorComplianceSurveyApi apiInstance = new VendorComplianceSurveyApi();
Integer vendorComplianceSurveyId = 56; // Integer | Id of the vendorComplianceSurvey to get files for
try {
    apiInstance.getVendorComplianceSurveyFiles(vendorComplianceSurveyId);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorComplianceSurveyApi#getVendorComplianceSurveyFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorComplianceSurveyId** | **Integer**| Id of the vendorComplianceSurvey to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVendorComplianceSurveyTags"></a>
# **getVendorComplianceSurveyTags**
> getVendorComplianceSurveyTags(vendorComplianceSurveyId)

Get the tags for a vendorComplianceSurvey.

Get all existing vendorComplianceSurvey tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorComplianceSurveyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorComplianceSurveyApi apiInstance = new VendorComplianceSurveyApi();
Integer vendorComplianceSurveyId = 56; // Integer | Id of the vendorComplianceSurvey to get tags for
try {
    apiInstance.getVendorComplianceSurveyTags(vendorComplianceSurveyId);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorComplianceSurveyApi#getVendorComplianceSurveyTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorComplianceSurveyId** | **Integer**| Id of the vendorComplianceSurvey to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVendorComplianceSurvey"></a>
# **updateVendorComplianceSurvey**
> updateVendorComplianceSurvey(body)

Update a vendorComplianceSurvey

Updates an existing vendorComplianceSurvey using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorComplianceSurveyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorComplianceSurveyApi apiInstance = new VendorComplianceSurveyApi();
VendorComplianceSurvey body = new VendorComplianceSurvey(); // VendorComplianceSurvey | VendorComplianceSurvey to be updated.
try {
    apiInstance.updateVendorComplianceSurvey(body);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorComplianceSurveyApi#updateVendorComplianceSurvey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VendorComplianceSurvey**](VendorComplianceSurvey.md)| VendorComplianceSurvey to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateVendorComplianceSurveyCustomFields"></a>
# **updateVendorComplianceSurveyCustomFields**
> updateVendorComplianceSurveyCustomFields(body)

Update a vendorComplianceSurvey custom fields

Updates an existing vendorComplianceSurvey custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorComplianceSurveyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorComplianceSurveyApi apiInstance = new VendorComplianceSurveyApi();
VendorComplianceSurvey body = new VendorComplianceSurvey(); // VendorComplianceSurvey | VendorComplianceSurvey to be updated.
try {
    apiInstance.updateVendorComplianceSurveyCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorComplianceSurveyApi#updateVendorComplianceSurveyCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VendorComplianceSurvey**](VendorComplianceSurvey.md)| VendorComplianceSurvey to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

