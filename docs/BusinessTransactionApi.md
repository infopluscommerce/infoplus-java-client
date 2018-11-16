# BusinessTransactionApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBusinessTransaction**](BusinessTransactionApi.md#addBusinessTransaction) | **POST** /beta/businessTransaction | Create a businessTransaction
[**addBusinessTransactionAudit**](BusinessTransactionApi.md#addBusinessTransactionAudit) | **PUT** /beta/businessTransaction/{businessTransactionId}/audit/{businessTransactionAudit} | Add new audit for a businessTransaction
[**addBusinessTransactionTag**](BusinessTransactionApi.md#addBusinessTransactionTag) | **PUT** /beta/businessTransaction/{businessTransactionId}/tag/{businessTransactionTag} | Add new tags for a businessTransaction.
[**deleteBusinessTransactionTag**](BusinessTransactionApi.md#deleteBusinessTransactionTag) | **DELETE** /beta/businessTransaction/{businessTransactionId}/tag/{businessTransactionTag} | Delete a tag for a businessTransaction.
[**getBusinessTransactionByFilter**](BusinessTransactionApi.md#getBusinessTransactionByFilter) | **GET** /beta/businessTransaction/search | Search businessTransactions by filter
[**getBusinessTransactionById**](BusinessTransactionApi.md#getBusinessTransactionById) | **GET** /beta/businessTransaction/{businessTransactionId} | Get a businessTransaction by id
[**getBusinessTransactionTags**](BusinessTransactionApi.md#getBusinessTransactionTags) | **GET** /beta/businessTransaction/{businessTransactionId}/tag | Get the tags for a businessTransaction.
[**getDuplicateBusinessTransactionById**](BusinessTransactionApi.md#getDuplicateBusinessTransactionById) | **GET** /beta/businessTransaction/duplicate/{businessTransactionId} | Get a duplicated a businessTransaction by id
[**updateBusinessTransaction**](BusinessTransactionApi.md#updateBusinessTransaction) | **PUT** /beta/businessTransaction | Update a businessTransaction
[**updateBusinessTransactionCustomFields**](BusinessTransactionApi.md#updateBusinessTransactionCustomFields) | **PUT** /beta/businessTransaction/customFields | Update a businessTransaction custom fields


<a name="addBusinessTransaction"></a>
# **addBusinessTransaction**
> BusinessTransaction addBusinessTransaction(body)

Create a businessTransaction

Inserts a new businessTransaction using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BusinessTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BusinessTransactionApi apiInstance = new BusinessTransactionApi();
BusinessTransaction body = new BusinessTransaction(); // BusinessTransaction | BusinessTransaction to be inserted.
try {
    BusinessTransaction result = apiInstance.addBusinessTransaction(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessTransactionApi#addBusinessTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BusinessTransaction**](BusinessTransaction.md)| BusinessTransaction to be inserted. |

### Return type

[**BusinessTransaction**](BusinessTransaction.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addBusinessTransactionAudit"></a>
# **addBusinessTransactionAudit**
> addBusinessTransactionAudit(businessTransactionId, businessTransactionAudit)

Add new audit for a businessTransaction

Adds an audit to an existing businessTransaction.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BusinessTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BusinessTransactionApi apiInstance = new BusinessTransactionApi();
Integer businessTransactionId = 56; // Integer | Id of the businessTransaction to add an audit to
String businessTransactionAudit = "businessTransactionAudit_example"; // String | The audit to add
try {
    apiInstance.addBusinessTransactionAudit(businessTransactionId, businessTransactionAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessTransactionApi#addBusinessTransactionAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessTransactionId** | **Integer**| Id of the businessTransaction to add an audit to |
 **businessTransactionAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addBusinessTransactionTag"></a>
# **addBusinessTransactionTag**
> addBusinessTransactionTag(businessTransactionId, businessTransactionTag)

Add new tags for a businessTransaction.

Adds a tag to an existing businessTransaction.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BusinessTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BusinessTransactionApi apiInstance = new BusinessTransactionApi();
Integer businessTransactionId = 56; // Integer | Id of the businessTransaction to add a tag to
String businessTransactionTag = "businessTransactionTag_example"; // String | The tag to add
try {
    apiInstance.addBusinessTransactionTag(businessTransactionId, businessTransactionTag);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessTransactionApi#addBusinessTransactionTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessTransactionId** | **Integer**| Id of the businessTransaction to add a tag to |
 **businessTransactionTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBusinessTransactionTag"></a>
# **deleteBusinessTransactionTag**
> deleteBusinessTransactionTag(businessTransactionId, businessTransactionTag)

Delete a tag for a businessTransaction.

Deletes an existing businessTransaction tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BusinessTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BusinessTransactionApi apiInstance = new BusinessTransactionApi();
Integer businessTransactionId = 56; // Integer | Id of the businessTransaction to remove tag from
String businessTransactionTag = "businessTransactionTag_example"; // String | The tag to delete
try {
    apiInstance.deleteBusinessTransactionTag(businessTransactionId, businessTransactionTag);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessTransactionApi#deleteBusinessTransactionTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessTransactionId** | **Integer**| Id of the businessTransaction to remove tag from |
 **businessTransactionTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBusinessTransactionByFilter"></a>
# **getBusinessTransactionByFilter**
> List&lt;BusinessTransaction&gt; getBusinessTransactionByFilter(filter, page, limit, sort)

Search businessTransactions by filter

Returns the list of businessTransactions that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BusinessTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BusinessTransactionApi apiInstance = new BusinessTransactionApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<BusinessTransaction> result = apiInstance.getBusinessTransactionByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessTransactionApi#getBusinessTransactionByFilter");
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

[**List&lt;BusinessTransaction&gt;**](BusinessTransaction.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBusinessTransactionById"></a>
# **getBusinessTransactionById**
> BusinessTransaction getBusinessTransactionById(businessTransactionId)

Get a businessTransaction by id

Returns the businessTransaction identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BusinessTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BusinessTransactionApi apiInstance = new BusinessTransactionApi();
Integer businessTransactionId = 56; // Integer | Id of the businessTransaction to be returned.
try {
    BusinessTransaction result = apiInstance.getBusinessTransactionById(businessTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessTransactionApi#getBusinessTransactionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessTransactionId** | **Integer**| Id of the businessTransaction to be returned. |

### Return type

[**BusinessTransaction**](BusinessTransaction.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBusinessTransactionTags"></a>
# **getBusinessTransactionTags**
> getBusinessTransactionTags(businessTransactionId)

Get the tags for a businessTransaction.

Get all existing businessTransaction tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BusinessTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BusinessTransactionApi apiInstance = new BusinessTransactionApi();
Integer businessTransactionId = 56; // Integer | Id of the businessTransaction to get tags for
try {
    apiInstance.getBusinessTransactionTags(businessTransactionId);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessTransactionApi#getBusinessTransactionTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessTransactionId** | **Integer**| Id of the businessTransaction to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateBusinessTransactionById"></a>
# **getDuplicateBusinessTransactionById**
> BusinessTransaction getDuplicateBusinessTransactionById(businessTransactionId)

Get a duplicated a businessTransaction by id

Returns a duplicated businessTransaction identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BusinessTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BusinessTransactionApi apiInstance = new BusinessTransactionApi();
Integer businessTransactionId = 56; // Integer | Id of the businessTransaction to be duplicated.
try {
    BusinessTransaction result = apiInstance.getDuplicateBusinessTransactionById(businessTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessTransactionApi#getDuplicateBusinessTransactionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessTransactionId** | **Integer**| Id of the businessTransaction to be duplicated. |

### Return type

[**BusinessTransaction**](BusinessTransaction.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBusinessTransaction"></a>
# **updateBusinessTransaction**
> updateBusinessTransaction(body)

Update a businessTransaction

Updates an existing businessTransaction using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BusinessTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BusinessTransactionApi apiInstance = new BusinessTransactionApi();
BusinessTransaction body = new BusinessTransaction(); // BusinessTransaction | BusinessTransaction to be updated.
try {
    apiInstance.updateBusinessTransaction(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessTransactionApi#updateBusinessTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BusinessTransaction**](BusinessTransaction.md)| BusinessTransaction to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBusinessTransactionCustomFields"></a>
# **updateBusinessTransactionCustomFields**
> updateBusinessTransactionCustomFields(body)

Update a businessTransaction custom fields

Updates an existing businessTransaction custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BusinessTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BusinessTransactionApi apiInstance = new BusinessTransactionApi();
BusinessTransaction body = new BusinessTransaction(); // BusinessTransaction | BusinessTransaction to be updated.
try {
    apiInstance.updateBusinessTransactionCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessTransactionApi#updateBusinessTransactionCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BusinessTransaction**](BusinessTransaction.md)| BusinessTransaction to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

