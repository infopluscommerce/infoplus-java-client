# BillingCodeActivityApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBillingCodeActivity**](BillingCodeActivityApi.md#addBillingCodeActivity) | **POST** /beta/billingCodeActivity | Create a billingCodeActivity
[**addBillingCodeActivityAudit**](BillingCodeActivityApi.md#addBillingCodeActivityAudit) | **PUT** /beta/billingCodeActivity/{billingCodeActivityId}/audit/{billingCodeActivityAudit} | Add new audit for a billingCodeActivity
[**addBillingCodeActivityFile**](BillingCodeActivityApi.md#addBillingCodeActivityFile) | **POST** /beta/billingCodeActivity/{billingCodeActivityId}/file/{fileName} | Attach a file to a billingCodeActivity
[**addBillingCodeActivityTag**](BillingCodeActivityApi.md#addBillingCodeActivityTag) | **PUT** /beta/billingCodeActivity/{billingCodeActivityId}/tag/{billingCodeActivityTag} | Add new tags for a billingCodeActivity.
[**deleteBillingCodeActivity**](BillingCodeActivityApi.md#deleteBillingCodeActivity) | **DELETE** /beta/billingCodeActivity/{billingCodeActivityId} | Delete a billingCodeActivity
[**deleteBillingCodeActivityTag**](BillingCodeActivityApi.md#deleteBillingCodeActivityTag) | **DELETE** /beta/billingCodeActivity/{billingCodeActivityId}/tag/{billingCodeActivityTag} | Delete a tag for a billingCodeActivity.
[**getBillingCodeActivityByFilter**](BillingCodeActivityApi.md#getBillingCodeActivityByFilter) | **GET** /beta/billingCodeActivity/search | Search billingCodeActivitys by filter
[**getBillingCodeActivityById**](BillingCodeActivityApi.md#getBillingCodeActivityById) | **GET** /beta/billingCodeActivity/{billingCodeActivityId} | Get a billingCodeActivity by id
[**getBillingCodeActivityTags**](BillingCodeActivityApi.md#getBillingCodeActivityTags) | **GET** /beta/billingCodeActivity/{billingCodeActivityId}/tag | Get the tags for a billingCodeActivity.
[**getDuplicateBillingCodeActivityById**](BillingCodeActivityApi.md#getDuplicateBillingCodeActivityById) | **GET** /beta/billingCodeActivity/duplicate/{billingCodeActivityId} | Get a duplicated a billingCodeActivity by id
[**updateBillingCodeActivity**](BillingCodeActivityApi.md#updateBillingCodeActivity) | **PUT** /beta/billingCodeActivity | Update a billingCodeActivity


<a name="addBillingCodeActivity"></a>
# **addBillingCodeActivity**
> BillingCodeActivity addBillingCodeActivity(body)

Create a billingCodeActivity

Inserts a new billingCodeActivity using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeActivityApi apiInstance = new BillingCodeActivityApi();
BillingCodeActivity body = new BillingCodeActivity(); // BillingCodeActivity | BillingCodeActivity to be inserted.
try {
    BillingCodeActivity result = apiInstance.addBillingCodeActivity(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeActivityApi#addBillingCodeActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BillingCodeActivity**](BillingCodeActivity.md)| BillingCodeActivity to be inserted. |

### Return type

[**BillingCodeActivity**](BillingCodeActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addBillingCodeActivityAudit"></a>
# **addBillingCodeActivityAudit**
> addBillingCodeActivityAudit(billingCodeActivityId, billingCodeActivityAudit)

Add new audit for a billingCodeActivity

Adds an audit to an existing billingCodeActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeActivityApi apiInstance = new BillingCodeActivityApi();
Integer billingCodeActivityId = 56; // Integer | Id of the billingCodeActivity to add an audit to
String billingCodeActivityAudit = "billingCodeActivityAudit_example"; // String | The audit to add
try {
    apiInstance.addBillingCodeActivityAudit(billingCodeActivityId, billingCodeActivityAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeActivityApi#addBillingCodeActivityAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeActivityId** | **Integer**| Id of the billingCodeActivity to add an audit to |
 **billingCodeActivityAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addBillingCodeActivityFile"></a>
# **addBillingCodeActivityFile**
> addBillingCodeActivityFile(billingCodeActivityId, fileName)

Attach a file to a billingCodeActivity

Adds a file to an existing billingCodeActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeActivityApi apiInstance = new BillingCodeActivityApi();
Integer billingCodeActivityId = 56; // Integer | Id of the billingCodeActivity to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addBillingCodeActivityFile(billingCodeActivityId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeActivityApi#addBillingCodeActivityFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeActivityId** | **Integer**| Id of the billingCodeActivity to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addBillingCodeActivityTag"></a>
# **addBillingCodeActivityTag**
> addBillingCodeActivityTag(billingCodeActivityId, billingCodeActivityTag)

Add new tags for a billingCodeActivity.

Adds a tag to an existing billingCodeActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeActivityApi apiInstance = new BillingCodeActivityApi();
Integer billingCodeActivityId = 56; // Integer | Id of the billingCodeActivity to add a tag to
String billingCodeActivityTag = "billingCodeActivityTag_example"; // String | The tag to add
try {
    apiInstance.addBillingCodeActivityTag(billingCodeActivityId, billingCodeActivityTag);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeActivityApi#addBillingCodeActivityTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeActivityId** | **Integer**| Id of the billingCodeActivity to add a tag to |
 **billingCodeActivityTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBillingCodeActivity"></a>
# **deleteBillingCodeActivity**
> deleteBillingCodeActivity(billingCodeActivityId)

Delete a billingCodeActivity

Deletes the billingCodeActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeActivityApi apiInstance = new BillingCodeActivityApi();
Integer billingCodeActivityId = 56; // Integer | Id of the billingCodeActivity to be deleted.
try {
    apiInstance.deleteBillingCodeActivity(billingCodeActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeActivityApi#deleteBillingCodeActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeActivityId** | **Integer**| Id of the billingCodeActivity to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBillingCodeActivityTag"></a>
# **deleteBillingCodeActivityTag**
> deleteBillingCodeActivityTag(billingCodeActivityId, billingCodeActivityTag)

Delete a tag for a billingCodeActivity.

Deletes an existing billingCodeActivity tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeActivityApi apiInstance = new BillingCodeActivityApi();
Integer billingCodeActivityId = 56; // Integer | Id of the billingCodeActivity to remove tag from
String billingCodeActivityTag = "billingCodeActivityTag_example"; // String | The tag to delete
try {
    apiInstance.deleteBillingCodeActivityTag(billingCodeActivityId, billingCodeActivityTag);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeActivityApi#deleteBillingCodeActivityTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeActivityId** | **Integer**| Id of the billingCodeActivity to remove tag from |
 **billingCodeActivityTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBillingCodeActivityByFilter"></a>
# **getBillingCodeActivityByFilter**
> List&lt;BillingCodeActivity&gt; getBillingCodeActivityByFilter(filter, page, limit, sort)

Search billingCodeActivitys by filter

Returns the list of billingCodeActivitys that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeActivityApi apiInstance = new BillingCodeActivityApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<BillingCodeActivity> result = apiInstance.getBillingCodeActivityByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeActivityApi#getBillingCodeActivityByFilter");
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

[**List&lt;BillingCodeActivity&gt;**](BillingCodeActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBillingCodeActivityById"></a>
# **getBillingCodeActivityById**
> BillingCodeActivity getBillingCodeActivityById(billingCodeActivityId)

Get a billingCodeActivity by id

Returns the billingCodeActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeActivityApi apiInstance = new BillingCodeActivityApi();
Integer billingCodeActivityId = 56; // Integer | Id of the billingCodeActivity to be returned.
try {
    BillingCodeActivity result = apiInstance.getBillingCodeActivityById(billingCodeActivityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeActivityApi#getBillingCodeActivityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeActivityId** | **Integer**| Id of the billingCodeActivity to be returned. |

### Return type

[**BillingCodeActivity**](BillingCodeActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBillingCodeActivityTags"></a>
# **getBillingCodeActivityTags**
> getBillingCodeActivityTags(billingCodeActivityId)

Get the tags for a billingCodeActivity.

Get all existing billingCodeActivity tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeActivityApi apiInstance = new BillingCodeActivityApi();
Integer billingCodeActivityId = 56; // Integer | Id of the billingCodeActivity to get tags for
try {
    apiInstance.getBillingCodeActivityTags(billingCodeActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeActivityApi#getBillingCodeActivityTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeActivityId** | **Integer**| Id of the billingCodeActivity to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateBillingCodeActivityById"></a>
# **getDuplicateBillingCodeActivityById**
> BillingCodeActivity getDuplicateBillingCodeActivityById(billingCodeActivityId)

Get a duplicated a billingCodeActivity by id

Returns a duplicated billingCodeActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeActivityApi apiInstance = new BillingCodeActivityApi();
Integer billingCodeActivityId = 56; // Integer | Id of the billingCodeActivity to be duplicated.
try {
    BillingCodeActivity result = apiInstance.getDuplicateBillingCodeActivityById(billingCodeActivityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeActivityApi#getDuplicateBillingCodeActivityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeActivityId** | **Integer**| Id of the billingCodeActivity to be duplicated. |

### Return type

[**BillingCodeActivity**](BillingCodeActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBillingCodeActivity"></a>
# **updateBillingCodeActivity**
> updateBillingCodeActivity(body)

Update a billingCodeActivity

Updates an existing billingCodeActivity using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeActivityApi apiInstance = new BillingCodeActivityApi();
BillingCodeActivity body = new BillingCodeActivity(); // BillingCodeActivity | BillingCodeActivity to be updated.
try {
    apiInstance.updateBillingCodeActivity(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeActivityApi#updateBillingCodeActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BillingCodeActivity**](BillingCodeActivity.md)| BillingCodeActivity to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

