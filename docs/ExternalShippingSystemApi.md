# ExternalShippingSystemApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addExternalShippingSystem**](ExternalShippingSystemApi.md#addExternalShippingSystem) | **POST** /beta/externalShippingSystem | Create an externalShippingSystem
[**addExternalShippingSystemAudit**](ExternalShippingSystemApi.md#addExternalShippingSystemAudit) | **PUT** /beta/externalShippingSystem/{externalShippingSystemId}/audit/{externalShippingSystemAudit} | Add new audit for an externalShippingSystem
[**addExternalShippingSystemFile**](ExternalShippingSystemApi.md#addExternalShippingSystemFile) | **POST** /beta/externalShippingSystem/{externalShippingSystemId}/file/{fileName} | Attach a file to an externalShippingSystem
[**addExternalShippingSystemTag**](ExternalShippingSystemApi.md#addExternalShippingSystemTag) | **PUT** /beta/externalShippingSystem/{externalShippingSystemId}/tag/{externalShippingSystemTag} | Add new tags for an externalShippingSystem.
[**deleteExternalShippingSystem**](ExternalShippingSystemApi.md#deleteExternalShippingSystem) | **DELETE** /beta/externalShippingSystem/{externalShippingSystemId} | Delete an externalShippingSystem
[**deleteExternalShippingSystemTag**](ExternalShippingSystemApi.md#deleteExternalShippingSystemTag) | **DELETE** /beta/externalShippingSystem/{externalShippingSystemId}/tag/{externalShippingSystemTag} | Delete a tag for an externalShippingSystem.
[**getDuplicateExternalShippingSystemById**](ExternalShippingSystemApi.md#getDuplicateExternalShippingSystemById) | **GET** /beta/externalShippingSystem/duplicate/{externalShippingSystemId} | Get a duplicated an externalShippingSystem by id
[**getExternalShippingSystemByFilter**](ExternalShippingSystemApi.md#getExternalShippingSystemByFilter) | **GET** /beta/externalShippingSystem/search | Search externalShippingSystems by filter
[**getExternalShippingSystemById**](ExternalShippingSystemApi.md#getExternalShippingSystemById) | **GET** /beta/externalShippingSystem/{externalShippingSystemId} | Get an externalShippingSystem by id
[**getExternalShippingSystemTags**](ExternalShippingSystemApi.md#getExternalShippingSystemTags) | **GET** /beta/externalShippingSystem/{externalShippingSystemId}/tag | Get the tags for an externalShippingSystem.
[**updateExternalShippingSystem**](ExternalShippingSystemApi.md#updateExternalShippingSystem) | **PUT** /beta/externalShippingSystem | Update an externalShippingSystem
[**updateExternalShippingSystemCustomFields**](ExternalShippingSystemApi.md#updateExternalShippingSystemCustomFields) | **PUT** /beta/externalShippingSystem/customFields | Update an externalShippingSystem custom fields


<a name="addExternalShippingSystem"></a>
# **addExternalShippingSystem**
> ExternalShippingSystem addExternalShippingSystem(body)

Create an externalShippingSystem

Inserts a new externalShippingSystem using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShippingSystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShippingSystemApi apiInstance = new ExternalShippingSystemApi();
ExternalShippingSystem body = new ExternalShippingSystem(); // ExternalShippingSystem | ExternalShippingSystem to be inserted.
try {
    ExternalShippingSystem result = apiInstance.addExternalShippingSystem(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShippingSystemApi#addExternalShippingSystem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExternalShippingSystem**](ExternalShippingSystem.md)| ExternalShippingSystem to be inserted. |

### Return type

[**ExternalShippingSystem**](ExternalShippingSystem.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addExternalShippingSystemAudit"></a>
# **addExternalShippingSystemAudit**
> addExternalShippingSystemAudit(externalShippingSystemId, externalShippingSystemAudit)

Add new audit for an externalShippingSystem

Adds an audit to an existing externalShippingSystem.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShippingSystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShippingSystemApi apiInstance = new ExternalShippingSystemApi();
Integer externalShippingSystemId = 56; // Integer | Id of the externalShippingSystem to add an audit to
String externalShippingSystemAudit = "externalShippingSystemAudit_example"; // String | The audit to add
try {
    apiInstance.addExternalShippingSystemAudit(externalShippingSystemId, externalShippingSystemAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShippingSystemApi#addExternalShippingSystemAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalShippingSystemId** | **Integer**| Id of the externalShippingSystem to add an audit to |
 **externalShippingSystemAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addExternalShippingSystemFile"></a>
# **addExternalShippingSystemFile**
> addExternalShippingSystemFile(externalShippingSystemId, fileName)

Attach a file to an externalShippingSystem

Adds a file to an existing externalShippingSystem.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShippingSystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShippingSystemApi apiInstance = new ExternalShippingSystemApi();
Integer externalShippingSystemId = 56; // Integer | Id of the externalShippingSystem to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addExternalShippingSystemFile(externalShippingSystemId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShippingSystemApi#addExternalShippingSystemFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalShippingSystemId** | **Integer**| Id of the externalShippingSystem to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addExternalShippingSystemTag"></a>
# **addExternalShippingSystemTag**
> addExternalShippingSystemTag(externalShippingSystemId, externalShippingSystemTag)

Add new tags for an externalShippingSystem.

Adds a tag to an existing externalShippingSystem.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShippingSystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShippingSystemApi apiInstance = new ExternalShippingSystemApi();
Integer externalShippingSystemId = 56; // Integer | Id of the externalShippingSystem to add a tag to
String externalShippingSystemTag = "externalShippingSystemTag_example"; // String | The tag to add
try {
    apiInstance.addExternalShippingSystemTag(externalShippingSystemId, externalShippingSystemTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShippingSystemApi#addExternalShippingSystemTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalShippingSystemId** | **Integer**| Id of the externalShippingSystem to add a tag to |
 **externalShippingSystemTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteExternalShippingSystem"></a>
# **deleteExternalShippingSystem**
> deleteExternalShippingSystem(externalShippingSystemId)

Delete an externalShippingSystem

Deletes the externalShippingSystem identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShippingSystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShippingSystemApi apiInstance = new ExternalShippingSystemApi();
Integer externalShippingSystemId = 56; // Integer | Id of the externalShippingSystem to be deleted.
try {
    apiInstance.deleteExternalShippingSystem(externalShippingSystemId);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShippingSystemApi#deleteExternalShippingSystem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalShippingSystemId** | **Integer**| Id of the externalShippingSystem to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteExternalShippingSystemTag"></a>
# **deleteExternalShippingSystemTag**
> deleteExternalShippingSystemTag(externalShippingSystemId, externalShippingSystemTag)

Delete a tag for an externalShippingSystem.

Deletes an existing externalShippingSystem tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShippingSystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShippingSystemApi apiInstance = new ExternalShippingSystemApi();
Integer externalShippingSystemId = 56; // Integer | Id of the externalShippingSystem to remove tag from
String externalShippingSystemTag = "externalShippingSystemTag_example"; // String | The tag to delete
try {
    apiInstance.deleteExternalShippingSystemTag(externalShippingSystemId, externalShippingSystemTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShippingSystemApi#deleteExternalShippingSystemTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalShippingSystemId** | **Integer**| Id of the externalShippingSystem to remove tag from |
 **externalShippingSystemTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateExternalShippingSystemById"></a>
# **getDuplicateExternalShippingSystemById**
> ExternalShippingSystem getDuplicateExternalShippingSystemById(externalShippingSystemId)

Get a duplicated an externalShippingSystem by id

Returns a duplicated externalShippingSystem identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShippingSystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShippingSystemApi apiInstance = new ExternalShippingSystemApi();
Integer externalShippingSystemId = 56; // Integer | Id of the externalShippingSystem to be duplicated.
try {
    ExternalShippingSystem result = apiInstance.getDuplicateExternalShippingSystemById(externalShippingSystemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShippingSystemApi#getDuplicateExternalShippingSystemById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalShippingSystemId** | **Integer**| Id of the externalShippingSystem to be duplicated. |

### Return type

[**ExternalShippingSystem**](ExternalShippingSystem.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExternalShippingSystemByFilter"></a>
# **getExternalShippingSystemByFilter**
> List&lt;ExternalShippingSystem&gt; getExternalShippingSystemByFilter(filter, page, limit, sort)

Search externalShippingSystems by filter

Returns the list of externalShippingSystems that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShippingSystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShippingSystemApi apiInstance = new ExternalShippingSystemApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ExternalShippingSystem> result = apiInstance.getExternalShippingSystemByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShippingSystemApi#getExternalShippingSystemByFilter");
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

[**List&lt;ExternalShippingSystem&gt;**](ExternalShippingSystem.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExternalShippingSystemById"></a>
# **getExternalShippingSystemById**
> ExternalShippingSystem getExternalShippingSystemById(externalShippingSystemId)

Get an externalShippingSystem by id

Returns the externalShippingSystem identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShippingSystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShippingSystemApi apiInstance = new ExternalShippingSystemApi();
Integer externalShippingSystemId = 56; // Integer | Id of the externalShippingSystem to be returned.
try {
    ExternalShippingSystem result = apiInstance.getExternalShippingSystemById(externalShippingSystemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShippingSystemApi#getExternalShippingSystemById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalShippingSystemId** | **Integer**| Id of the externalShippingSystem to be returned. |

### Return type

[**ExternalShippingSystem**](ExternalShippingSystem.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExternalShippingSystemTags"></a>
# **getExternalShippingSystemTags**
> getExternalShippingSystemTags(externalShippingSystemId)

Get the tags for an externalShippingSystem.

Get all existing externalShippingSystem tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShippingSystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShippingSystemApi apiInstance = new ExternalShippingSystemApi();
Integer externalShippingSystemId = 56; // Integer | Id of the externalShippingSystem to get tags for
try {
    apiInstance.getExternalShippingSystemTags(externalShippingSystemId);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShippingSystemApi#getExternalShippingSystemTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalShippingSystemId** | **Integer**| Id of the externalShippingSystem to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateExternalShippingSystem"></a>
# **updateExternalShippingSystem**
> updateExternalShippingSystem(body)

Update an externalShippingSystem

Updates an existing externalShippingSystem using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShippingSystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShippingSystemApi apiInstance = new ExternalShippingSystemApi();
ExternalShippingSystem body = new ExternalShippingSystem(); // ExternalShippingSystem | ExternalShippingSystem to be updated.
try {
    apiInstance.updateExternalShippingSystem(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShippingSystemApi#updateExternalShippingSystem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExternalShippingSystem**](ExternalShippingSystem.md)| ExternalShippingSystem to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateExternalShippingSystemCustomFields"></a>
# **updateExternalShippingSystemCustomFields**
> updateExternalShippingSystemCustomFields(body)

Update an externalShippingSystem custom fields

Updates an existing externalShippingSystem custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ExternalShippingSystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExternalShippingSystemApi apiInstance = new ExternalShippingSystemApi();
ExternalShippingSystem body = new ExternalShippingSystem(); // ExternalShippingSystem | ExternalShippingSystem to be updated.
try {
    apiInstance.updateExternalShippingSystemCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalShippingSystemApi#updateExternalShippingSystemCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExternalShippingSystem**](ExternalShippingSystem.md)| ExternalShippingSystem to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

