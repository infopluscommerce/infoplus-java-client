# SlaSetupApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSlaSetupAudit**](SlaSetupApi.md#addSlaSetupAudit) | **PUT** /beta/slaSetup/{slaSetupId}/audit/{slaSetupAudit} | Add new audit for a slaSetup
[**addSlaSetupFile**](SlaSetupApi.md#addSlaSetupFile) | **POST** /beta/slaSetup/{slaSetupId}/file/{fileName} | Attach a file to a slaSetup
[**addSlaSetupTag**](SlaSetupApi.md#addSlaSetupTag) | **PUT** /beta/slaSetup/{slaSetupId}/tag/{slaSetupTag} | Add new tags for a slaSetup.
[**deleteSlaSetupTag**](SlaSetupApi.md#deleteSlaSetupTag) | **DELETE** /beta/slaSetup/{slaSetupId}/tag/{slaSetupTag} | Delete a tag for a slaSetup.
[**getDuplicateSlaSetupById**](SlaSetupApi.md#getDuplicateSlaSetupById) | **GET** /beta/slaSetup/duplicate/{slaSetupId} | Get a duplicated a slaSetup by id
[**getSlaSetupByFilter**](SlaSetupApi.md#getSlaSetupByFilter) | **GET** /beta/slaSetup/search | Search slaSetups by filter
[**getSlaSetupById**](SlaSetupApi.md#getSlaSetupById) | **GET** /beta/slaSetup/{slaSetupId} | Get a slaSetup by id
[**getSlaSetupTags**](SlaSetupApi.md#getSlaSetupTags) | **GET** /beta/slaSetup/{slaSetupId}/tag | Get the tags for a slaSetup.


<a name="addSlaSetupAudit"></a>
# **addSlaSetupAudit**
> addSlaSetupAudit(slaSetupId, slaSetupAudit)

Add new audit for a slaSetup

Adds an audit to an existing slaSetup.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SlaSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SlaSetupApi apiInstance = new SlaSetupApi();
Integer slaSetupId = 56; // Integer | Id of the slaSetup to add an audit to
String slaSetupAudit = "slaSetupAudit_example"; // String | The audit to add
try {
    apiInstance.addSlaSetupAudit(slaSetupId, slaSetupAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling SlaSetupApi#addSlaSetupAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slaSetupId** | **Integer**| Id of the slaSetup to add an audit to |
 **slaSetupAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addSlaSetupFile"></a>
# **addSlaSetupFile**
> addSlaSetupFile(slaSetupId, fileName)

Attach a file to a slaSetup

Adds a file to an existing slaSetup.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SlaSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SlaSetupApi apiInstance = new SlaSetupApi();
Integer slaSetupId = 56; // Integer | Id of the slaSetup to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addSlaSetupFile(slaSetupId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling SlaSetupApi#addSlaSetupFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slaSetupId** | **Integer**| Id of the slaSetup to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addSlaSetupTag"></a>
# **addSlaSetupTag**
> addSlaSetupTag(slaSetupId, slaSetupTag)

Add new tags for a slaSetup.

Adds a tag to an existing slaSetup.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SlaSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SlaSetupApi apiInstance = new SlaSetupApi();
Integer slaSetupId = 56; // Integer | Id of the slaSetup to add a tag to
String slaSetupTag = "slaSetupTag_example"; // String | The tag to add
try {
    apiInstance.addSlaSetupTag(slaSetupId, slaSetupTag);
} catch (ApiException e) {
    System.err.println("Exception when calling SlaSetupApi#addSlaSetupTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slaSetupId** | **Integer**| Id of the slaSetup to add a tag to |
 **slaSetupTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSlaSetupTag"></a>
# **deleteSlaSetupTag**
> deleteSlaSetupTag(slaSetupId, slaSetupTag)

Delete a tag for a slaSetup.

Deletes an existing slaSetup tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SlaSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SlaSetupApi apiInstance = new SlaSetupApi();
Integer slaSetupId = 56; // Integer | Id of the slaSetup to remove tag from
String slaSetupTag = "slaSetupTag_example"; // String | The tag to delete
try {
    apiInstance.deleteSlaSetupTag(slaSetupId, slaSetupTag);
} catch (ApiException e) {
    System.err.println("Exception when calling SlaSetupApi#deleteSlaSetupTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slaSetupId** | **Integer**| Id of the slaSetup to remove tag from |
 **slaSetupTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateSlaSetupById"></a>
# **getDuplicateSlaSetupById**
> SlaSetup getDuplicateSlaSetupById(slaSetupId)

Get a duplicated a slaSetup by id

Returns a duplicated slaSetup identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SlaSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SlaSetupApi apiInstance = new SlaSetupApi();
Integer slaSetupId = 56; // Integer | Id of the slaSetup to be duplicated.
try {
    SlaSetup result = apiInstance.getDuplicateSlaSetupById(slaSetupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlaSetupApi#getDuplicateSlaSetupById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slaSetupId** | **Integer**| Id of the slaSetup to be duplicated. |

### Return type

[**SlaSetup**](SlaSetup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSlaSetupByFilter"></a>
# **getSlaSetupByFilter**
> List&lt;SlaSetup&gt; getSlaSetupByFilter(filter, page, limit, sort)

Search slaSetups by filter

Returns the list of slaSetups that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SlaSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SlaSetupApi apiInstance = new SlaSetupApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<SlaSetup> result = apiInstance.getSlaSetupByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlaSetupApi#getSlaSetupByFilter");
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

[**List&lt;SlaSetup&gt;**](SlaSetup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSlaSetupById"></a>
# **getSlaSetupById**
> SlaSetup getSlaSetupById(slaSetupId)

Get a slaSetup by id

Returns the slaSetup identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SlaSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SlaSetupApi apiInstance = new SlaSetupApi();
Integer slaSetupId = 56; // Integer | Id of the slaSetup to be returned.
try {
    SlaSetup result = apiInstance.getSlaSetupById(slaSetupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlaSetupApi#getSlaSetupById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slaSetupId** | **Integer**| Id of the slaSetup to be returned. |

### Return type

[**SlaSetup**](SlaSetup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSlaSetupTags"></a>
# **getSlaSetupTags**
> getSlaSetupTags(slaSetupId)

Get the tags for a slaSetup.

Get all existing slaSetup tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SlaSetupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SlaSetupApi apiInstance = new SlaSetupApi();
Integer slaSetupId = 56; // Integer | Id of the slaSetup to get tags for
try {
    apiInstance.getSlaSetupTags(slaSetupId);
} catch (ApiException e) {
    System.err.println("Exception when calling SlaSetupApi#getSlaSetupTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slaSetupId** | **Integer**| Id of the slaSetup to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

