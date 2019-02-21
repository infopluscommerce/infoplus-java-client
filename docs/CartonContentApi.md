# CartonContentApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCartonContent**](CartonContentApi.md#addCartonContent) | **POST** /beta/cartonContent | Create a cartonContent
[**addCartonContentAudit**](CartonContentApi.md#addCartonContentAudit) | **PUT** /beta/cartonContent/{cartonContentId}/audit/{cartonContentAudit} | Add new audit for a cartonContent
[**addCartonContentTag**](CartonContentApi.md#addCartonContentTag) | **PUT** /beta/cartonContent/{cartonContentId}/tag/{cartonContentTag} | Add new tags for a cartonContent.
[**deleteCartonContent**](CartonContentApi.md#deleteCartonContent) | **DELETE** /beta/cartonContent/{cartonContentId} | Delete a cartonContent
[**deleteCartonContentTag**](CartonContentApi.md#deleteCartonContentTag) | **DELETE** /beta/cartonContent/{cartonContentId}/tag/{cartonContentTag} | Delete a tag for a cartonContent.
[**getCartonContentByFilter**](CartonContentApi.md#getCartonContentByFilter) | **GET** /beta/cartonContent/search | Search cartonContents by filter
[**getCartonContentById**](CartonContentApi.md#getCartonContentById) | **GET** /beta/cartonContent/{cartonContentId} | Get a cartonContent by id
[**getCartonContentTags**](CartonContentApi.md#getCartonContentTags) | **GET** /beta/cartonContent/{cartonContentId}/tag | Get the tags for a cartonContent.
[**getDuplicateCartonContentById**](CartonContentApi.md#getDuplicateCartonContentById) | **GET** /beta/cartonContent/duplicate/{cartonContentId} | Get a duplicated a cartonContent by id
[**updateCartonContent**](CartonContentApi.md#updateCartonContent) | **PUT** /beta/cartonContent | Update a cartonContent
[**updateCartonContentCustomFields**](CartonContentApi.md#updateCartonContentCustomFields) | **PUT** /beta/cartonContent/customFields | Update a cartonContent custom fields


<a name="addCartonContent"></a>
# **addCartonContent**
> CartonContent addCartonContent(body)

Create a cartonContent

Inserts a new cartonContent using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonContentApi apiInstance = new CartonContentApi();
CartonContent body = new CartonContent(); // CartonContent | CartonContent to be inserted.
try {
    CartonContent result = apiInstance.addCartonContent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonContentApi#addCartonContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CartonContent**](CartonContent.md)| CartonContent to be inserted. |

### Return type

[**CartonContent**](CartonContent.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCartonContentAudit"></a>
# **addCartonContentAudit**
> addCartonContentAudit(cartonContentId, cartonContentAudit)

Add new audit for a cartonContent

Adds an audit to an existing cartonContent.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonContentApi apiInstance = new CartonContentApi();
Integer cartonContentId = 56; // Integer | Id of the cartonContent to add an audit to
String cartonContentAudit = "cartonContentAudit_example"; // String | The audit to add
try {
    apiInstance.addCartonContentAudit(cartonContentId, cartonContentAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonContentApi#addCartonContentAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonContentId** | **Integer**| Id of the cartonContent to add an audit to |
 **cartonContentAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCartonContentTag"></a>
# **addCartonContentTag**
> addCartonContentTag(cartonContentId, cartonContentTag)

Add new tags for a cartonContent.

Adds a tag to an existing cartonContent.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonContentApi apiInstance = new CartonContentApi();
Integer cartonContentId = 56; // Integer | Id of the cartonContent to add a tag to
String cartonContentTag = "cartonContentTag_example"; // String | The tag to add
try {
    apiInstance.addCartonContentTag(cartonContentId, cartonContentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonContentApi#addCartonContentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonContentId** | **Integer**| Id of the cartonContent to add a tag to |
 **cartonContentTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCartonContent"></a>
# **deleteCartonContent**
> deleteCartonContent(cartonContentId)

Delete a cartonContent

Deletes the cartonContent identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonContentApi apiInstance = new CartonContentApi();
Integer cartonContentId = 56; // Integer | Id of the cartonContent to be deleted.
try {
    apiInstance.deleteCartonContent(cartonContentId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonContentApi#deleteCartonContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonContentId** | **Integer**| Id of the cartonContent to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCartonContentTag"></a>
# **deleteCartonContentTag**
> deleteCartonContentTag(cartonContentId, cartonContentTag)

Delete a tag for a cartonContent.

Deletes an existing cartonContent tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonContentApi apiInstance = new CartonContentApi();
Integer cartonContentId = 56; // Integer | Id of the cartonContent to remove tag from
String cartonContentTag = "cartonContentTag_example"; // String | The tag to delete
try {
    apiInstance.deleteCartonContentTag(cartonContentId, cartonContentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonContentApi#deleteCartonContentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonContentId** | **Integer**| Id of the cartonContent to remove tag from |
 **cartonContentTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartonContentByFilter"></a>
# **getCartonContentByFilter**
> List&lt;CartonContent&gt; getCartonContentByFilter(filter, page, limit, sort)

Search cartonContents by filter

Returns the list of cartonContents that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonContentApi apiInstance = new CartonContentApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<CartonContent> result = apiInstance.getCartonContentByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonContentApi#getCartonContentByFilter");
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

[**List&lt;CartonContent&gt;**](CartonContent.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartonContentById"></a>
# **getCartonContentById**
> CartonContent getCartonContentById(cartonContentId)

Get a cartonContent by id

Returns the cartonContent identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonContentApi apiInstance = new CartonContentApi();
Integer cartonContentId = 56; // Integer | Id of the cartonContent to be returned.
try {
    CartonContent result = apiInstance.getCartonContentById(cartonContentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonContentApi#getCartonContentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonContentId** | **Integer**| Id of the cartonContent to be returned. |

### Return type

[**CartonContent**](CartonContent.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartonContentTags"></a>
# **getCartonContentTags**
> getCartonContentTags(cartonContentId)

Get the tags for a cartonContent.

Get all existing cartonContent tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonContentApi apiInstance = new CartonContentApi();
Integer cartonContentId = 56; // Integer | Id of the cartonContent to get tags for
try {
    apiInstance.getCartonContentTags(cartonContentId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonContentApi#getCartonContentTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonContentId** | **Integer**| Id of the cartonContent to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateCartonContentById"></a>
# **getDuplicateCartonContentById**
> CartonContent getDuplicateCartonContentById(cartonContentId)

Get a duplicated a cartonContent by id

Returns a duplicated cartonContent identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonContentApi apiInstance = new CartonContentApi();
Integer cartonContentId = 56; // Integer | Id of the cartonContent to be duplicated.
try {
    CartonContent result = apiInstance.getDuplicateCartonContentById(cartonContentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonContentApi#getDuplicateCartonContentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonContentId** | **Integer**| Id of the cartonContent to be duplicated. |

### Return type

[**CartonContent**](CartonContent.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCartonContent"></a>
# **updateCartonContent**
> updateCartonContent(body)

Update a cartonContent

Updates an existing cartonContent using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonContentApi apiInstance = new CartonContentApi();
CartonContent body = new CartonContent(); // CartonContent | CartonContent to be updated.
try {
    apiInstance.updateCartonContent(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonContentApi#updateCartonContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CartonContent**](CartonContent.md)| CartonContent to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCartonContentCustomFields"></a>
# **updateCartonContentCustomFields**
> updateCartonContentCustomFields(body)

Update a cartonContent custom fields

Updates an existing cartonContent custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonContentApi apiInstance = new CartonContentApi();
CartonContent body = new CartonContent(); // CartonContent | CartonContent to be updated.
try {
    apiInstance.updateCartonContentCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonContentApi#updateCartonContentCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CartonContent**](CartonContent.md)| CartonContent to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

