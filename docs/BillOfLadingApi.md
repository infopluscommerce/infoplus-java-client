# BillOfLadingApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBillOfLading**](BillOfLadingApi.md#addBillOfLading) | **POST** /beta/billOfLading | Create a billOfLading
[**addBillOfLadingAudit**](BillOfLadingApi.md#addBillOfLadingAudit) | **PUT** /beta/billOfLading/{billOfLadingId}/audit/{billOfLadingAudit} | Add new audit for a billOfLading
[**addBillOfLadingTag**](BillOfLadingApi.md#addBillOfLadingTag) | **PUT** /beta/billOfLading/{billOfLadingId}/tag/{billOfLadingTag} | Add new tags for a billOfLading.
[**deleteBillOfLading**](BillOfLadingApi.md#deleteBillOfLading) | **DELETE** /beta/billOfLading/{billOfLadingId} | Delete a billOfLading
[**deleteBillOfLadingTag**](BillOfLadingApi.md#deleteBillOfLadingTag) | **DELETE** /beta/billOfLading/{billOfLadingId}/tag/{billOfLadingTag} | Delete a tag for a billOfLading.
[**getBillOfLadingByFilter**](BillOfLadingApi.md#getBillOfLadingByFilter) | **GET** /beta/billOfLading/search | Search billOfLadings by filter
[**getBillOfLadingById**](BillOfLadingApi.md#getBillOfLadingById) | **GET** /beta/billOfLading/{billOfLadingId} | Get a billOfLading by id
[**getBillOfLadingTags**](BillOfLadingApi.md#getBillOfLadingTags) | **GET** /beta/billOfLading/{billOfLadingId}/tag | Get the tags for a billOfLading.
[**getDuplicateBillOfLadingById**](BillOfLadingApi.md#getDuplicateBillOfLadingById) | **GET** /beta/billOfLading/duplicate/{billOfLadingId} | Get a duplicated a billOfLading by id
[**updateBillOfLading**](BillOfLadingApi.md#updateBillOfLading) | **PUT** /beta/billOfLading | Update a billOfLading
[**updateBillOfLadingCustomFields**](BillOfLadingApi.md#updateBillOfLadingCustomFields) | **PUT** /beta/billOfLading/customFields | Update a billOfLading custom fields


<a name="addBillOfLading"></a>
# **addBillOfLading**
> BillOfLading addBillOfLading(body)

Create a billOfLading

Inserts a new billOfLading using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillOfLadingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillOfLadingApi apiInstance = new BillOfLadingApi();
BillOfLading body = new BillOfLading(); // BillOfLading | BillOfLading to be inserted.
try {
    BillOfLading result = apiInstance.addBillOfLading(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillOfLadingApi#addBillOfLading");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BillOfLading**](BillOfLading.md)| BillOfLading to be inserted. |

### Return type

[**BillOfLading**](BillOfLading.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addBillOfLadingAudit"></a>
# **addBillOfLadingAudit**
> addBillOfLadingAudit(billOfLadingId, billOfLadingAudit)

Add new audit for a billOfLading

Adds an audit to an existing billOfLading.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillOfLadingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillOfLadingApi apiInstance = new BillOfLadingApi();
Integer billOfLadingId = 56; // Integer | Id of the billOfLading to add an audit to
String billOfLadingAudit = "billOfLadingAudit_example"; // String | The audit to add
try {
    apiInstance.addBillOfLadingAudit(billOfLadingId, billOfLadingAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling BillOfLadingApi#addBillOfLadingAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billOfLadingId** | **Integer**| Id of the billOfLading to add an audit to |
 **billOfLadingAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addBillOfLadingTag"></a>
# **addBillOfLadingTag**
> addBillOfLadingTag(billOfLadingId, billOfLadingTag)

Add new tags for a billOfLading.

Adds a tag to an existing billOfLading.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillOfLadingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillOfLadingApi apiInstance = new BillOfLadingApi();
Integer billOfLadingId = 56; // Integer | Id of the billOfLading to add a tag to
String billOfLadingTag = "billOfLadingTag_example"; // String | The tag to add
try {
    apiInstance.addBillOfLadingTag(billOfLadingId, billOfLadingTag);
} catch (ApiException e) {
    System.err.println("Exception when calling BillOfLadingApi#addBillOfLadingTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billOfLadingId** | **Integer**| Id of the billOfLading to add a tag to |
 **billOfLadingTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBillOfLading"></a>
# **deleteBillOfLading**
> deleteBillOfLading(billOfLadingId)

Delete a billOfLading

Deletes the billOfLading identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillOfLadingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillOfLadingApi apiInstance = new BillOfLadingApi();
Integer billOfLadingId = 56; // Integer | Id of the billOfLading to be deleted.
try {
    apiInstance.deleteBillOfLading(billOfLadingId);
} catch (ApiException e) {
    System.err.println("Exception when calling BillOfLadingApi#deleteBillOfLading");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billOfLadingId** | **Integer**| Id of the billOfLading to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBillOfLadingTag"></a>
# **deleteBillOfLadingTag**
> deleteBillOfLadingTag(billOfLadingId, billOfLadingTag)

Delete a tag for a billOfLading.

Deletes an existing billOfLading tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillOfLadingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillOfLadingApi apiInstance = new BillOfLadingApi();
Integer billOfLadingId = 56; // Integer | Id of the billOfLading to remove tag from
String billOfLadingTag = "billOfLadingTag_example"; // String | The tag to delete
try {
    apiInstance.deleteBillOfLadingTag(billOfLadingId, billOfLadingTag);
} catch (ApiException e) {
    System.err.println("Exception when calling BillOfLadingApi#deleteBillOfLadingTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billOfLadingId** | **Integer**| Id of the billOfLading to remove tag from |
 **billOfLadingTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBillOfLadingByFilter"></a>
# **getBillOfLadingByFilter**
> List&lt;BillOfLading&gt; getBillOfLadingByFilter(filter, page, limit, sort)

Search billOfLadings by filter

Returns the list of billOfLadings that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillOfLadingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillOfLadingApi apiInstance = new BillOfLadingApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<BillOfLading> result = apiInstance.getBillOfLadingByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillOfLadingApi#getBillOfLadingByFilter");
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

[**List&lt;BillOfLading&gt;**](BillOfLading.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBillOfLadingById"></a>
# **getBillOfLadingById**
> BillOfLading getBillOfLadingById(billOfLadingId)

Get a billOfLading by id

Returns the billOfLading identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillOfLadingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillOfLadingApi apiInstance = new BillOfLadingApi();
Integer billOfLadingId = 56; // Integer | Id of the billOfLading to be returned.
try {
    BillOfLading result = apiInstance.getBillOfLadingById(billOfLadingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillOfLadingApi#getBillOfLadingById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billOfLadingId** | **Integer**| Id of the billOfLading to be returned. |

### Return type

[**BillOfLading**](BillOfLading.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBillOfLadingTags"></a>
# **getBillOfLadingTags**
> getBillOfLadingTags(billOfLadingId)

Get the tags for a billOfLading.

Get all existing billOfLading tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillOfLadingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillOfLadingApi apiInstance = new BillOfLadingApi();
Integer billOfLadingId = 56; // Integer | Id of the billOfLading to get tags for
try {
    apiInstance.getBillOfLadingTags(billOfLadingId);
} catch (ApiException e) {
    System.err.println("Exception when calling BillOfLadingApi#getBillOfLadingTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billOfLadingId** | **Integer**| Id of the billOfLading to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateBillOfLadingById"></a>
# **getDuplicateBillOfLadingById**
> BillOfLading getDuplicateBillOfLadingById(billOfLadingId)

Get a duplicated a billOfLading by id

Returns a duplicated billOfLading identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillOfLadingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillOfLadingApi apiInstance = new BillOfLadingApi();
Integer billOfLadingId = 56; // Integer | Id of the billOfLading to be duplicated.
try {
    BillOfLading result = apiInstance.getDuplicateBillOfLadingById(billOfLadingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillOfLadingApi#getDuplicateBillOfLadingById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billOfLadingId** | **Integer**| Id of the billOfLading to be duplicated. |

### Return type

[**BillOfLading**](BillOfLading.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBillOfLading"></a>
# **updateBillOfLading**
> updateBillOfLading(body)

Update a billOfLading

Updates an existing billOfLading using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillOfLadingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillOfLadingApi apiInstance = new BillOfLadingApi();
BillOfLading body = new BillOfLading(); // BillOfLading | BillOfLading to be updated.
try {
    apiInstance.updateBillOfLading(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BillOfLadingApi#updateBillOfLading");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BillOfLading**](BillOfLading.md)| BillOfLading to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBillOfLadingCustomFields"></a>
# **updateBillOfLadingCustomFields**
> updateBillOfLadingCustomFields(body)

Update a billOfLading custom fields

Updates an existing billOfLading custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillOfLadingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillOfLadingApi apiInstance = new BillOfLadingApi();
BillOfLading body = new BillOfLading(); // BillOfLading | BillOfLading to be updated.
try {
    apiInstance.updateBillOfLadingCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BillOfLadingApi#updateBillOfLadingCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BillOfLading**](BillOfLading.md)| BillOfLading to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

