# BillingCodeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBillingCode**](BillingCodeApi.md#addBillingCode) | **POST** /beta/billingCode | Create a billingCode
[**addBillingCodeAudit**](BillingCodeApi.md#addBillingCodeAudit) | **PUT** /beta/billingCode/{billingCodeId}/audit/{billingCodeAudit} | Add new audit for a billingCode
[**addBillingCodeTag**](BillingCodeApi.md#addBillingCodeTag) | **PUT** /beta/billingCode/{billingCodeId}/tag/{billingCodeTag} | Add new tags for a billingCode.
[**deleteBillingCode**](BillingCodeApi.md#deleteBillingCode) | **DELETE** /beta/billingCode/{billingCodeId} | Delete a billingCode
[**deleteBillingCodeTag**](BillingCodeApi.md#deleteBillingCodeTag) | **DELETE** /beta/billingCode/{billingCodeId}/tag/{billingCodeTag} | Delete a tag for a billingCode.
[**getBillingCodeByFilter**](BillingCodeApi.md#getBillingCodeByFilter) | **GET** /beta/billingCode/search | Search billingCodes by filter
[**getBillingCodeById**](BillingCodeApi.md#getBillingCodeById) | **GET** /beta/billingCode/{billingCodeId} | Get a billingCode by id
[**getBillingCodeTags**](BillingCodeApi.md#getBillingCodeTags) | **GET** /beta/billingCode/{billingCodeId}/tag | Get the tags for a billingCode.
[**getDuplicateBillingCodeById**](BillingCodeApi.md#getDuplicateBillingCodeById) | **GET** /beta/billingCode/duplicate/{billingCodeId} | Get a duplicated a billingCode by id
[**updateBillingCode**](BillingCodeApi.md#updateBillingCode) | **PUT** /beta/billingCode | Update a billingCode
[**updateBillingCodeCustomFields**](BillingCodeApi.md#updateBillingCodeCustomFields) | **PUT** /beta/billingCode/customFields | Update a billingCode custom fields


<a name="addBillingCode"></a>
# **addBillingCode**
> BillingCode addBillingCode(body)

Create a billingCode

Inserts a new billingCode using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeApi apiInstance = new BillingCodeApi();
BillingCode body = new BillingCode(); // BillingCode | BillingCode to be inserted.
try {
    BillingCode result = apiInstance.addBillingCode(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeApi#addBillingCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BillingCode**](BillingCode.md)| BillingCode to be inserted. |

### Return type

[**BillingCode**](BillingCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addBillingCodeAudit"></a>
# **addBillingCodeAudit**
> addBillingCodeAudit(billingCodeId, billingCodeAudit)

Add new audit for a billingCode

Adds an audit to an existing billingCode.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeApi apiInstance = new BillingCodeApi();
Integer billingCodeId = 56; // Integer | Id of the billingCode to add an audit to
String billingCodeAudit = "billingCodeAudit_example"; // String | The audit to add
try {
    apiInstance.addBillingCodeAudit(billingCodeId, billingCodeAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeApi#addBillingCodeAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeId** | **Integer**| Id of the billingCode to add an audit to |
 **billingCodeAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addBillingCodeTag"></a>
# **addBillingCodeTag**
> addBillingCodeTag(billingCodeId, billingCodeTag)

Add new tags for a billingCode.

Adds a tag to an existing billingCode.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeApi apiInstance = new BillingCodeApi();
Integer billingCodeId = 56; // Integer | Id of the billingCode to add a tag to
String billingCodeTag = "billingCodeTag_example"; // String | The tag to add
try {
    apiInstance.addBillingCodeTag(billingCodeId, billingCodeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeApi#addBillingCodeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeId** | **Integer**| Id of the billingCode to add a tag to |
 **billingCodeTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBillingCode"></a>
# **deleteBillingCode**
> deleteBillingCode(billingCodeId)

Delete a billingCode

Deletes the billingCode identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeApi apiInstance = new BillingCodeApi();
Integer billingCodeId = 56; // Integer | Id of the billingCode to be deleted.
try {
    apiInstance.deleteBillingCode(billingCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeApi#deleteBillingCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeId** | **Integer**| Id of the billingCode to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBillingCodeTag"></a>
# **deleteBillingCodeTag**
> deleteBillingCodeTag(billingCodeId, billingCodeTag)

Delete a tag for a billingCode.

Deletes an existing billingCode tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeApi apiInstance = new BillingCodeApi();
Integer billingCodeId = 56; // Integer | Id of the billingCode to remove tag from
String billingCodeTag = "billingCodeTag_example"; // String | The tag to delete
try {
    apiInstance.deleteBillingCodeTag(billingCodeId, billingCodeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeApi#deleteBillingCodeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeId** | **Integer**| Id of the billingCode to remove tag from |
 **billingCodeTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBillingCodeByFilter"></a>
# **getBillingCodeByFilter**
> List&lt;BillingCode&gt; getBillingCodeByFilter(filter, page, limit, sort)

Search billingCodes by filter

Returns the list of billingCodes that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeApi apiInstance = new BillingCodeApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<BillingCode> result = apiInstance.getBillingCodeByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeApi#getBillingCodeByFilter");
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

[**List&lt;BillingCode&gt;**](BillingCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBillingCodeById"></a>
# **getBillingCodeById**
> BillingCode getBillingCodeById(billingCodeId)

Get a billingCode by id

Returns the billingCode identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeApi apiInstance = new BillingCodeApi();
Integer billingCodeId = 56; // Integer | Id of the billingCode to be returned.
try {
    BillingCode result = apiInstance.getBillingCodeById(billingCodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeApi#getBillingCodeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeId** | **Integer**| Id of the billingCode to be returned. |

### Return type

[**BillingCode**](BillingCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBillingCodeTags"></a>
# **getBillingCodeTags**
> getBillingCodeTags(billingCodeId)

Get the tags for a billingCode.

Get all existing billingCode tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeApi apiInstance = new BillingCodeApi();
Integer billingCodeId = 56; // Integer | Id of the billingCode to get tags for
try {
    apiInstance.getBillingCodeTags(billingCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeApi#getBillingCodeTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeId** | **Integer**| Id of the billingCode to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateBillingCodeById"></a>
# **getDuplicateBillingCodeById**
> BillingCode getDuplicateBillingCodeById(billingCodeId)

Get a duplicated a billingCode by id

Returns a duplicated billingCode identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeApi apiInstance = new BillingCodeApi();
Integer billingCodeId = 56; // Integer | Id of the billingCode to be duplicated.
try {
    BillingCode result = apiInstance.getDuplicateBillingCodeById(billingCodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeApi#getDuplicateBillingCodeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeId** | **Integer**| Id of the billingCode to be duplicated. |

### Return type

[**BillingCode**](BillingCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBillingCode"></a>
# **updateBillingCode**
> updateBillingCode(body)

Update a billingCode

Updates an existing billingCode using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeApi apiInstance = new BillingCodeApi();
BillingCode body = new BillingCode(); // BillingCode | BillingCode to be updated.
try {
    apiInstance.updateBillingCode(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeApi#updateBillingCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BillingCode**](BillingCode.md)| BillingCode to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBillingCodeCustomFields"></a>
# **updateBillingCodeCustomFields**
> updateBillingCodeCustomFields(body)

Update a billingCode custom fields

Updates an existing billingCode custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeApi apiInstance = new BillingCodeApi();
BillingCode body = new BillingCode(); // BillingCode | BillingCode to be updated.
try {
    apiInstance.updateBillingCodeCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeApi#updateBillingCodeCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BillingCode**](BillingCode.md)| BillingCode to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

