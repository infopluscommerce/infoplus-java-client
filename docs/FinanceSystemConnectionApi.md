# FinanceSystemConnectionApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFinanceSystemConnection**](FinanceSystemConnectionApi.md#addFinanceSystemConnection) | **POST** /beta/financeSystemConnection | Create a financeSystemConnection
[**addFinanceSystemConnectionAudit**](FinanceSystemConnectionApi.md#addFinanceSystemConnectionAudit) | **PUT** /beta/financeSystemConnection/{financeSystemConnectionId}/audit/{financeSystemConnectionAudit} | Add new audit for a financeSystemConnection
[**addFinanceSystemConnectionTag**](FinanceSystemConnectionApi.md#addFinanceSystemConnectionTag) | **PUT** /beta/financeSystemConnection/{financeSystemConnectionId}/tag/{financeSystemConnectionTag} | Add new tags for a financeSystemConnection.
[**deleteFinanceSystemConnection**](FinanceSystemConnectionApi.md#deleteFinanceSystemConnection) | **DELETE** /beta/financeSystemConnection/{financeSystemConnectionId} | Delete a financeSystemConnection
[**deleteFinanceSystemConnectionTag**](FinanceSystemConnectionApi.md#deleteFinanceSystemConnectionTag) | **DELETE** /beta/financeSystemConnection/{financeSystemConnectionId}/tag/{financeSystemConnectionTag} | Delete a tag for a financeSystemConnection.
[**getDuplicateFinanceSystemConnectionById**](FinanceSystemConnectionApi.md#getDuplicateFinanceSystemConnectionById) | **GET** /beta/financeSystemConnection/duplicate/{financeSystemConnectionId} | Get a duplicated a financeSystemConnection by id
[**getFinanceSystemConnectionByFilter**](FinanceSystemConnectionApi.md#getFinanceSystemConnectionByFilter) | **GET** /beta/financeSystemConnection/search | Search financeSystemConnections by filter
[**getFinanceSystemConnectionById**](FinanceSystemConnectionApi.md#getFinanceSystemConnectionById) | **GET** /beta/financeSystemConnection/{financeSystemConnectionId} | Get a financeSystemConnection by id
[**getFinanceSystemConnectionTags**](FinanceSystemConnectionApi.md#getFinanceSystemConnectionTags) | **GET** /beta/financeSystemConnection/{financeSystemConnectionId}/tag | Get the tags for a financeSystemConnection.
[**updateFinanceSystemConnection**](FinanceSystemConnectionApi.md#updateFinanceSystemConnection) | **PUT** /beta/financeSystemConnection | Update a financeSystemConnection
[**updateFinanceSystemConnectionCustomFields**](FinanceSystemConnectionApi.md#updateFinanceSystemConnectionCustomFields) | **PUT** /beta/financeSystemConnection/customFields | Update a financeSystemConnection custom fields


<a name="addFinanceSystemConnection"></a>
# **addFinanceSystemConnection**
> FinanceSystemConnection addFinanceSystemConnection(body)

Create a financeSystemConnection

Inserts a new financeSystemConnection using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FinanceSystemConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FinanceSystemConnectionApi apiInstance = new FinanceSystemConnectionApi();
FinanceSystemConnection body = new FinanceSystemConnection(); // FinanceSystemConnection | FinanceSystemConnection to be inserted.
try {
    FinanceSystemConnection result = apiInstance.addFinanceSystemConnection(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinanceSystemConnectionApi#addFinanceSystemConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FinanceSystemConnection**](FinanceSystemConnection.md)| FinanceSystemConnection to be inserted. |

### Return type

[**FinanceSystemConnection**](FinanceSystemConnection.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addFinanceSystemConnectionAudit"></a>
# **addFinanceSystemConnectionAudit**
> addFinanceSystemConnectionAudit(financeSystemConnectionId, financeSystemConnectionAudit)

Add new audit for a financeSystemConnection

Adds an audit to an existing financeSystemConnection.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FinanceSystemConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FinanceSystemConnectionApi apiInstance = new FinanceSystemConnectionApi();
Integer financeSystemConnectionId = 56; // Integer | Id of the financeSystemConnection to add an audit to
String financeSystemConnectionAudit = "financeSystemConnectionAudit_example"; // String | The audit to add
try {
    apiInstance.addFinanceSystemConnectionAudit(financeSystemConnectionId, financeSystemConnectionAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling FinanceSystemConnectionApi#addFinanceSystemConnectionAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financeSystemConnectionId** | **Integer**| Id of the financeSystemConnection to add an audit to |
 **financeSystemConnectionAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addFinanceSystemConnectionTag"></a>
# **addFinanceSystemConnectionTag**
> addFinanceSystemConnectionTag(financeSystemConnectionId, financeSystemConnectionTag)

Add new tags for a financeSystemConnection.

Adds a tag to an existing financeSystemConnection.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FinanceSystemConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FinanceSystemConnectionApi apiInstance = new FinanceSystemConnectionApi();
Integer financeSystemConnectionId = 56; // Integer | Id of the financeSystemConnection to add a tag to
String financeSystemConnectionTag = "financeSystemConnectionTag_example"; // String | The tag to add
try {
    apiInstance.addFinanceSystemConnectionTag(financeSystemConnectionId, financeSystemConnectionTag);
} catch (ApiException e) {
    System.err.println("Exception when calling FinanceSystemConnectionApi#addFinanceSystemConnectionTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financeSystemConnectionId** | **Integer**| Id of the financeSystemConnection to add a tag to |
 **financeSystemConnectionTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFinanceSystemConnection"></a>
# **deleteFinanceSystemConnection**
> deleteFinanceSystemConnection(financeSystemConnectionId)

Delete a financeSystemConnection

Deletes the financeSystemConnection identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FinanceSystemConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FinanceSystemConnectionApi apiInstance = new FinanceSystemConnectionApi();
Integer financeSystemConnectionId = 56; // Integer | Id of the financeSystemConnection to be deleted.
try {
    apiInstance.deleteFinanceSystemConnection(financeSystemConnectionId);
} catch (ApiException e) {
    System.err.println("Exception when calling FinanceSystemConnectionApi#deleteFinanceSystemConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financeSystemConnectionId** | **Integer**| Id of the financeSystemConnection to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteFinanceSystemConnectionTag"></a>
# **deleteFinanceSystemConnectionTag**
> deleteFinanceSystemConnectionTag(financeSystemConnectionId, financeSystemConnectionTag)

Delete a tag for a financeSystemConnection.

Deletes an existing financeSystemConnection tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FinanceSystemConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FinanceSystemConnectionApi apiInstance = new FinanceSystemConnectionApi();
Integer financeSystemConnectionId = 56; // Integer | Id of the financeSystemConnection to remove tag from
String financeSystemConnectionTag = "financeSystemConnectionTag_example"; // String | The tag to delete
try {
    apiInstance.deleteFinanceSystemConnectionTag(financeSystemConnectionId, financeSystemConnectionTag);
} catch (ApiException e) {
    System.err.println("Exception when calling FinanceSystemConnectionApi#deleteFinanceSystemConnectionTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financeSystemConnectionId** | **Integer**| Id of the financeSystemConnection to remove tag from |
 **financeSystemConnectionTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateFinanceSystemConnectionById"></a>
# **getDuplicateFinanceSystemConnectionById**
> FinanceSystemConnection getDuplicateFinanceSystemConnectionById(financeSystemConnectionId)

Get a duplicated a financeSystemConnection by id

Returns a duplicated financeSystemConnection identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FinanceSystemConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FinanceSystemConnectionApi apiInstance = new FinanceSystemConnectionApi();
Integer financeSystemConnectionId = 56; // Integer | Id of the financeSystemConnection to be duplicated.
try {
    FinanceSystemConnection result = apiInstance.getDuplicateFinanceSystemConnectionById(financeSystemConnectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinanceSystemConnectionApi#getDuplicateFinanceSystemConnectionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financeSystemConnectionId** | **Integer**| Id of the financeSystemConnection to be duplicated. |

### Return type

[**FinanceSystemConnection**](FinanceSystemConnection.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFinanceSystemConnectionByFilter"></a>
# **getFinanceSystemConnectionByFilter**
> List&lt;FinanceSystemConnection&gt; getFinanceSystemConnectionByFilter(filter, page, limit, sort)

Search financeSystemConnections by filter

Returns the list of financeSystemConnections that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FinanceSystemConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FinanceSystemConnectionApi apiInstance = new FinanceSystemConnectionApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<FinanceSystemConnection> result = apiInstance.getFinanceSystemConnectionByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinanceSystemConnectionApi#getFinanceSystemConnectionByFilter");
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

[**List&lt;FinanceSystemConnection&gt;**](FinanceSystemConnection.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFinanceSystemConnectionById"></a>
# **getFinanceSystemConnectionById**
> FinanceSystemConnection getFinanceSystemConnectionById(financeSystemConnectionId)

Get a financeSystemConnection by id

Returns the financeSystemConnection identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FinanceSystemConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FinanceSystemConnectionApi apiInstance = new FinanceSystemConnectionApi();
Integer financeSystemConnectionId = 56; // Integer | Id of the financeSystemConnection to be returned.
try {
    FinanceSystemConnection result = apiInstance.getFinanceSystemConnectionById(financeSystemConnectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinanceSystemConnectionApi#getFinanceSystemConnectionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financeSystemConnectionId** | **Integer**| Id of the financeSystemConnection to be returned. |

### Return type

[**FinanceSystemConnection**](FinanceSystemConnection.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFinanceSystemConnectionTags"></a>
# **getFinanceSystemConnectionTags**
> getFinanceSystemConnectionTags(financeSystemConnectionId)

Get the tags for a financeSystemConnection.

Get all existing financeSystemConnection tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FinanceSystemConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FinanceSystemConnectionApi apiInstance = new FinanceSystemConnectionApi();
Integer financeSystemConnectionId = 56; // Integer | Id of the financeSystemConnection to get tags for
try {
    apiInstance.getFinanceSystemConnectionTags(financeSystemConnectionId);
} catch (ApiException e) {
    System.err.println("Exception when calling FinanceSystemConnectionApi#getFinanceSystemConnectionTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financeSystemConnectionId** | **Integer**| Id of the financeSystemConnection to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFinanceSystemConnection"></a>
# **updateFinanceSystemConnection**
> updateFinanceSystemConnection(body)

Update a financeSystemConnection

Updates an existing financeSystemConnection using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FinanceSystemConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FinanceSystemConnectionApi apiInstance = new FinanceSystemConnectionApi();
FinanceSystemConnection body = new FinanceSystemConnection(); // FinanceSystemConnection | FinanceSystemConnection to be updated.
try {
    apiInstance.updateFinanceSystemConnection(body);
} catch (ApiException e) {
    System.err.println("Exception when calling FinanceSystemConnectionApi#updateFinanceSystemConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FinanceSystemConnection**](FinanceSystemConnection.md)| FinanceSystemConnection to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFinanceSystemConnectionCustomFields"></a>
# **updateFinanceSystemConnectionCustomFields**
> updateFinanceSystemConnectionCustomFields(body)

Update a financeSystemConnection custom fields

Updates an existing financeSystemConnection custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FinanceSystemConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FinanceSystemConnectionApi apiInstance = new FinanceSystemConnectionApi();
FinanceSystemConnection body = new FinanceSystemConnection(); // FinanceSystemConnection | FinanceSystemConnection to be updated.
try {
    apiInstance.updateFinanceSystemConnectionCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling FinanceSystemConnectionApi#updateFinanceSystemConnectionCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FinanceSystemConnection**](FinanceSystemConnection.md)| FinanceSystemConnection to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

