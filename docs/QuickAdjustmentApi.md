# QuickAdjustmentApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addQuickAdjustment**](QuickAdjustmentApi.md#addQuickAdjustment) | **POST** /beta/quickAdjustment | Create a quickAdjustment
[**addQuickAdjustmentAudit**](QuickAdjustmentApi.md#addQuickAdjustmentAudit) | **PUT** /beta/quickAdjustment/{quickAdjustmentId}/audit/{quickAdjustmentAudit} | Add new audit for a quickAdjustment
[**addQuickAdjustmentTag**](QuickAdjustmentApi.md#addQuickAdjustmentTag) | **PUT** /beta/quickAdjustment/{quickAdjustmentId}/tag/{quickAdjustmentTag} | Add new tags for a quickAdjustment.
[**deleteQuickAdjustment**](QuickAdjustmentApi.md#deleteQuickAdjustment) | **DELETE** /beta/quickAdjustment/{quickAdjustmentId} | Delete a quickAdjustment
[**deleteQuickAdjustmentTag**](QuickAdjustmentApi.md#deleteQuickAdjustmentTag) | **DELETE** /beta/quickAdjustment/{quickAdjustmentId}/tag/{quickAdjustmentTag} | Delete a tag for a quickAdjustment.
[**executeQuickAdjustment**](QuickAdjustmentApi.md#executeQuickAdjustment) | **POST** /beta/quickAdjustment/executeQuickAdjustment | Run the ExecuteQuickAdjustment process.
[**getDuplicateQuickAdjustmentById**](QuickAdjustmentApi.md#getDuplicateQuickAdjustmentById) | **GET** /beta/quickAdjustment/duplicate/{quickAdjustmentId} | Get a duplicated a quickAdjustment by id
[**getQuickAdjustmentByFilter**](QuickAdjustmentApi.md#getQuickAdjustmentByFilter) | **GET** /beta/quickAdjustment/search | Search quickAdjustments by filter
[**getQuickAdjustmentById**](QuickAdjustmentApi.md#getQuickAdjustmentById) | **GET** /beta/quickAdjustment/{quickAdjustmentId} | Get a quickAdjustment by id
[**getQuickAdjustmentTags**](QuickAdjustmentApi.md#getQuickAdjustmentTags) | **GET** /beta/quickAdjustment/{quickAdjustmentId}/tag | Get the tags for a quickAdjustment.
[**updateQuickAdjustment**](QuickAdjustmentApi.md#updateQuickAdjustment) | **PUT** /beta/quickAdjustment | Update a quickAdjustment
[**updateQuickAdjustmentCustomFields**](QuickAdjustmentApi.md#updateQuickAdjustmentCustomFields) | **PUT** /beta/quickAdjustment/customFields | Update a quickAdjustment custom fields


<a name="addQuickAdjustment"></a>
# **addQuickAdjustment**
> QuickAdjustment addQuickAdjustment(body)

Create a quickAdjustment

Inserts a new quickAdjustment using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickAdjustmentApi apiInstance = new QuickAdjustmentApi();
QuickAdjustment body = new QuickAdjustment(); // QuickAdjustment | QuickAdjustment to be inserted.
try {
    QuickAdjustment result = apiInstance.addQuickAdjustment(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickAdjustmentApi#addQuickAdjustment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QuickAdjustment**](QuickAdjustment.md)| QuickAdjustment to be inserted. |

### Return type

[**QuickAdjustment**](QuickAdjustment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addQuickAdjustmentAudit"></a>
# **addQuickAdjustmentAudit**
> addQuickAdjustmentAudit(quickAdjustmentId, quickAdjustmentAudit)

Add new audit for a quickAdjustment

Adds an audit to an existing quickAdjustment.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickAdjustmentApi apiInstance = new QuickAdjustmentApi();
Integer quickAdjustmentId = 56; // Integer | Id of the quickAdjustment to add an audit to
String quickAdjustmentAudit = "quickAdjustmentAudit_example"; // String | The audit to add
try {
    apiInstance.addQuickAdjustmentAudit(quickAdjustmentId, quickAdjustmentAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickAdjustmentApi#addQuickAdjustmentAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickAdjustmentId** | **Integer**| Id of the quickAdjustment to add an audit to |
 **quickAdjustmentAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addQuickAdjustmentTag"></a>
# **addQuickAdjustmentTag**
> addQuickAdjustmentTag(quickAdjustmentId, quickAdjustmentTag)

Add new tags for a quickAdjustment.

Adds a tag to an existing quickAdjustment.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickAdjustmentApi apiInstance = new QuickAdjustmentApi();
Integer quickAdjustmentId = 56; // Integer | Id of the quickAdjustment to add a tag to
String quickAdjustmentTag = "quickAdjustmentTag_example"; // String | The tag to add
try {
    apiInstance.addQuickAdjustmentTag(quickAdjustmentId, quickAdjustmentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickAdjustmentApi#addQuickAdjustmentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickAdjustmentId** | **Integer**| Id of the quickAdjustment to add a tag to |
 **quickAdjustmentTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteQuickAdjustment"></a>
# **deleteQuickAdjustment**
> deleteQuickAdjustment(quickAdjustmentId)

Delete a quickAdjustment

Deletes the quickAdjustment identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickAdjustmentApi apiInstance = new QuickAdjustmentApi();
Integer quickAdjustmentId = 56; // Integer | Id of the quickAdjustment to be deleted.
try {
    apiInstance.deleteQuickAdjustment(quickAdjustmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickAdjustmentApi#deleteQuickAdjustment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickAdjustmentId** | **Integer**| Id of the quickAdjustment to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteQuickAdjustmentTag"></a>
# **deleteQuickAdjustmentTag**
> deleteQuickAdjustmentTag(quickAdjustmentId, quickAdjustmentTag)

Delete a tag for a quickAdjustment.

Deletes an existing quickAdjustment tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickAdjustmentApi apiInstance = new QuickAdjustmentApi();
Integer quickAdjustmentId = 56; // Integer | Id of the quickAdjustment to remove tag from
String quickAdjustmentTag = "quickAdjustmentTag_example"; // String | The tag to delete
try {
    apiInstance.deleteQuickAdjustmentTag(quickAdjustmentId, quickAdjustmentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickAdjustmentApi#deleteQuickAdjustmentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickAdjustmentId** | **Integer**| Id of the quickAdjustment to remove tag from |
 **quickAdjustmentTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="executeQuickAdjustment"></a>
# **executeQuickAdjustment**
> List&lt;ProcessOutputAPIModel&gt; executeQuickAdjustment(body)

Run the ExecuteQuickAdjustment process.



### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickAdjustmentApi apiInstance = new QuickAdjustmentApi();
ExecuteQuickAdjustmentInputAPIModel body = new ExecuteQuickAdjustmentInputAPIModel(); // ExecuteQuickAdjustmentInputAPIModel | Input data for ExecuteQuickAdjustment process.
try {
    List<ProcessOutputAPIModel> result = apiInstance.executeQuickAdjustment(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickAdjustmentApi#executeQuickAdjustment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExecuteQuickAdjustmentInputAPIModel**](ExecuteQuickAdjustmentInputAPIModel.md)| Input data for ExecuteQuickAdjustment process. |

### Return type

[**List&lt;ProcessOutputAPIModel&gt;**](ProcessOutputAPIModel.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateQuickAdjustmentById"></a>
# **getDuplicateQuickAdjustmentById**
> QuickAdjustment getDuplicateQuickAdjustmentById(quickAdjustmentId)

Get a duplicated a quickAdjustment by id

Returns a duplicated quickAdjustment identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickAdjustmentApi apiInstance = new QuickAdjustmentApi();
Integer quickAdjustmentId = 56; // Integer | Id of the quickAdjustment to be duplicated.
try {
    QuickAdjustment result = apiInstance.getDuplicateQuickAdjustmentById(quickAdjustmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickAdjustmentApi#getDuplicateQuickAdjustmentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickAdjustmentId** | **Integer**| Id of the quickAdjustment to be duplicated. |

### Return type

[**QuickAdjustment**](QuickAdjustment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQuickAdjustmentByFilter"></a>
# **getQuickAdjustmentByFilter**
> List&lt;QuickAdjustment&gt; getQuickAdjustmentByFilter(filter, page, limit, sort)

Search quickAdjustments by filter

Returns the list of quickAdjustments that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickAdjustmentApi apiInstance = new QuickAdjustmentApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<QuickAdjustment> result = apiInstance.getQuickAdjustmentByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickAdjustmentApi#getQuickAdjustmentByFilter");
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

[**List&lt;QuickAdjustment&gt;**](QuickAdjustment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQuickAdjustmentById"></a>
# **getQuickAdjustmentById**
> QuickAdjustment getQuickAdjustmentById(quickAdjustmentId)

Get a quickAdjustment by id

Returns the quickAdjustment identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickAdjustmentApi apiInstance = new QuickAdjustmentApi();
Integer quickAdjustmentId = 56; // Integer | Id of the quickAdjustment to be returned.
try {
    QuickAdjustment result = apiInstance.getQuickAdjustmentById(quickAdjustmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickAdjustmentApi#getQuickAdjustmentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickAdjustmentId** | **Integer**| Id of the quickAdjustment to be returned. |

### Return type

[**QuickAdjustment**](QuickAdjustment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQuickAdjustmentTags"></a>
# **getQuickAdjustmentTags**
> getQuickAdjustmentTags(quickAdjustmentId)

Get the tags for a quickAdjustment.

Get all existing quickAdjustment tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickAdjustmentApi apiInstance = new QuickAdjustmentApi();
Integer quickAdjustmentId = 56; // Integer | Id of the quickAdjustment to get tags for
try {
    apiInstance.getQuickAdjustmentTags(quickAdjustmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickAdjustmentApi#getQuickAdjustmentTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickAdjustmentId** | **Integer**| Id of the quickAdjustment to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateQuickAdjustment"></a>
# **updateQuickAdjustment**
> updateQuickAdjustment(body)

Update a quickAdjustment

Updates an existing quickAdjustment using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickAdjustmentApi apiInstance = new QuickAdjustmentApi();
QuickAdjustment body = new QuickAdjustment(); // QuickAdjustment | QuickAdjustment to be updated.
try {
    apiInstance.updateQuickAdjustment(body);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickAdjustmentApi#updateQuickAdjustment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QuickAdjustment**](QuickAdjustment.md)| QuickAdjustment to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateQuickAdjustmentCustomFields"></a>
# **updateQuickAdjustmentCustomFields**
> updateQuickAdjustmentCustomFields(body)

Update a quickAdjustment custom fields

Updates an existing quickAdjustment custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.QuickAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuickAdjustmentApi apiInstance = new QuickAdjustmentApi();
QuickAdjustment body = new QuickAdjustment(); // QuickAdjustment | QuickAdjustment to be updated.
try {
    apiInstance.updateQuickAdjustmentCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling QuickAdjustmentApi#updateQuickAdjustmentCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QuickAdjustment**](QuickAdjustment.md)| QuickAdjustment to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

