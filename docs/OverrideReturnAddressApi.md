# OverrideReturnAddressApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOverrideReturnAddress**](OverrideReturnAddressApi.md#addOverrideReturnAddress) | **POST** /beta/overrideReturnAddress | Create an overrideReturnAddress
[**addOverrideReturnAddressAudit**](OverrideReturnAddressApi.md#addOverrideReturnAddressAudit) | **PUT** /beta/overrideReturnAddress/{overrideReturnAddressId}/audit/{overrideReturnAddressAudit} | Add new audit for an overrideReturnAddress
[**addOverrideReturnAddressTag**](OverrideReturnAddressApi.md#addOverrideReturnAddressTag) | **PUT** /beta/overrideReturnAddress/{overrideReturnAddressId}/tag/{overrideReturnAddressTag} | Add new tags for an overrideReturnAddress.
[**deleteOverrideReturnAddress**](OverrideReturnAddressApi.md#deleteOverrideReturnAddress) | **DELETE** /beta/overrideReturnAddress/{overrideReturnAddressId} | Delete an overrideReturnAddress
[**deleteOverrideReturnAddressTag**](OverrideReturnAddressApi.md#deleteOverrideReturnAddressTag) | **DELETE** /beta/overrideReturnAddress/{overrideReturnAddressId}/tag/{overrideReturnAddressTag} | Delete a tag for an overrideReturnAddress.
[**getDuplicateOverrideReturnAddressById**](OverrideReturnAddressApi.md#getDuplicateOverrideReturnAddressById) | **GET** /beta/overrideReturnAddress/duplicate/{overrideReturnAddressId} | Get a duplicated an overrideReturnAddress by id
[**getOverrideReturnAddressByFilter**](OverrideReturnAddressApi.md#getOverrideReturnAddressByFilter) | **GET** /beta/overrideReturnAddress/search | Search overrideReturnAddresses by filter
[**getOverrideReturnAddressById**](OverrideReturnAddressApi.md#getOverrideReturnAddressById) | **GET** /beta/overrideReturnAddress/{overrideReturnAddressId} | Get an overrideReturnAddress by id
[**getOverrideReturnAddressTags**](OverrideReturnAddressApi.md#getOverrideReturnAddressTags) | **GET** /beta/overrideReturnAddress/{overrideReturnAddressId}/tag | Get the tags for an overrideReturnAddress.
[**updateOverrideReturnAddress**](OverrideReturnAddressApi.md#updateOverrideReturnAddress) | **PUT** /beta/overrideReturnAddress | Update an overrideReturnAddress
[**updateOverrideReturnAddressCustomFields**](OverrideReturnAddressApi.md#updateOverrideReturnAddressCustomFields) | **PUT** /beta/overrideReturnAddress/customFields | Update an overrideReturnAddress custom fields


<a name="addOverrideReturnAddress"></a>
# **addOverrideReturnAddress**
> OverrideReturnAddress addOverrideReturnAddress(body)

Create an overrideReturnAddress

Inserts a new overrideReturnAddress using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
OverrideReturnAddress body = new OverrideReturnAddress(); // OverrideReturnAddress | OverrideReturnAddress to be inserted.
try {
    OverrideReturnAddress result = apiInstance.addOverrideReturnAddress(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#addOverrideReturnAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OverrideReturnAddress**](OverrideReturnAddress.md)| OverrideReturnAddress to be inserted. |

### Return type

[**OverrideReturnAddress**](OverrideReturnAddress.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOverrideReturnAddressAudit"></a>
# **addOverrideReturnAddressAudit**
> addOverrideReturnAddressAudit(overrideReturnAddressId, overrideReturnAddressAudit)

Add new audit for an overrideReturnAddress

Adds an audit to an existing overrideReturnAddress.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
Integer overrideReturnAddressId = 56; // Integer | Id of the overrideReturnAddress to add an audit to
String overrideReturnAddressAudit = "overrideReturnAddressAudit_example"; // String | The audit to add
try {
    apiInstance.addOverrideReturnAddressAudit(overrideReturnAddressId, overrideReturnAddressAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#addOverrideReturnAddressAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overrideReturnAddressId** | **Integer**| Id of the overrideReturnAddress to add an audit to |
 **overrideReturnAddressAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOverrideReturnAddressTag"></a>
# **addOverrideReturnAddressTag**
> addOverrideReturnAddressTag(overrideReturnAddressId, overrideReturnAddressTag)

Add new tags for an overrideReturnAddress.

Adds a tag to an existing overrideReturnAddress.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
Integer overrideReturnAddressId = 56; // Integer | Id of the overrideReturnAddress to add a tag to
String overrideReturnAddressTag = "overrideReturnAddressTag_example"; // String | The tag to add
try {
    apiInstance.addOverrideReturnAddressTag(overrideReturnAddressId, overrideReturnAddressTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#addOverrideReturnAddressTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overrideReturnAddressId** | **Integer**| Id of the overrideReturnAddress to add a tag to |
 **overrideReturnAddressTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOverrideReturnAddress"></a>
# **deleteOverrideReturnAddress**
> deleteOverrideReturnAddress(overrideReturnAddressId)

Delete an overrideReturnAddress

Deletes the overrideReturnAddress identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
Integer overrideReturnAddressId = 56; // Integer | Id of the overrideReturnAddress to be deleted.
try {
    apiInstance.deleteOverrideReturnAddress(overrideReturnAddressId);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#deleteOverrideReturnAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overrideReturnAddressId** | **Integer**| Id of the overrideReturnAddress to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteOverrideReturnAddressTag"></a>
# **deleteOverrideReturnAddressTag**
> deleteOverrideReturnAddressTag(overrideReturnAddressId, overrideReturnAddressTag)

Delete a tag for an overrideReturnAddress.

Deletes an existing overrideReturnAddress tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
Integer overrideReturnAddressId = 56; // Integer | Id of the overrideReturnAddress to remove tag from
String overrideReturnAddressTag = "overrideReturnAddressTag_example"; // String | The tag to delete
try {
    apiInstance.deleteOverrideReturnAddressTag(overrideReturnAddressId, overrideReturnAddressTag);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#deleteOverrideReturnAddressTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overrideReturnAddressId** | **Integer**| Id of the overrideReturnAddress to remove tag from |
 **overrideReturnAddressTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateOverrideReturnAddressById"></a>
# **getDuplicateOverrideReturnAddressById**
> OverrideReturnAddress getDuplicateOverrideReturnAddressById(overrideReturnAddressId)

Get a duplicated an overrideReturnAddress by id

Returns a duplicated overrideReturnAddress identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
Integer overrideReturnAddressId = 56; // Integer | Id of the overrideReturnAddress to be duplicated.
try {
    OverrideReturnAddress result = apiInstance.getDuplicateOverrideReturnAddressById(overrideReturnAddressId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#getDuplicateOverrideReturnAddressById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overrideReturnAddressId** | **Integer**| Id of the overrideReturnAddress to be duplicated. |

### Return type

[**OverrideReturnAddress**](OverrideReturnAddress.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOverrideReturnAddressByFilter"></a>
# **getOverrideReturnAddressByFilter**
> List&lt;OverrideReturnAddress&gt; getOverrideReturnAddressByFilter(filter, page, limit, sort)

Search overrideReturnAddresses by filter

Returns the list of overrideReturnAddresses that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<OverrideReturnAddress> result = apiInstance.getOverrideReturnAddressByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#getOverrideReturnAddressByFilter");
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

[**List&lt;OverrideReturnAddress&gt;**](OverrideReturnAddress.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOverrideReturnAddressById"></a>
# **getOverrideReturnAddressById**
> OverrideReturnAddress getOverrideReturnAddressById(overrideReturnAddressId)

Get an overrideReturnAddress by id

Returns the overrideReturnAddress identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
Integer overrideReturnAddressId = 56; // Integer | Id of the overrideReturnAddress to be returned.
try {
    OverrideReturnAddress result = apiInstance.getOverrideReturnAddressById(overrideReturnAddressId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#getOverrideReturnAddressById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overrideReturnAddressId** | **Integer**| Id of the overrideReturnAddress to be returned. |

### Return type

[**OverrideReturnAddress**](OverrideReturnAddress.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOverrideReturnAddressTags"></a>
# **getOverrideReturnAddressTags**
> getOverrideReturnAddressTags(overrideReturnAddressId)

Get the tags for an overrideReturnAddress.

Get all existing overrideReturnAddress tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
Integer overrideReturnAddressId = 56; // Integer | Id of the overrideReturnAddress to get tags for
try {
    apiInstance.getOverrideReturnAddressTags(overrideReturnAddressId);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#getOverrideReturnAddressTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overrideReturnAddressId** | **Integer**| Id of the overrideReturnAddress to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOverrideReturnAddress"></a>
# **updateOverrideReturnAddress**
> updateOverrideReturnAddress(body)

Update an overrideReturnAddress

Updates an existing overrideReturnAddress using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
OverrideReturnAddress body = new OverrideReturnAddress(); // OverrideReturnAddress | OverrideReturnAddress to be updated.
try {
    apiInstance.updateOverrideReturnAddress(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#updateOverrideReturnAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OverrideReturnAddress**](OverrideReturnAddress.md)| OverrideReturnAddress to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOverrideReturnAddressCustomFields"></a>
# **updateOverrideReturnAddressCustomFields**
> updateOverrideReturnAddressCustomFields(body)

Update an overrideReturnAddress custom fields

Updates an existing overrideReturnAddress custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OverrideReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OverrideReturnAddressApi apiInstance = new OverrideReturnAddressApi();
OverrideReturnAddress body = new OverrideReturnAddress(); // OverrideReturnAddress | OverrideReturnAddress to be updated.
try {
    apiInstance.updateOverrideReturnAddressCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OverrideReturnAddressApi#updateOverrideReturnAddressCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OverrideReturnAddress**](OverrideReturnAddress.md)| OverrideReturnAddress to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

