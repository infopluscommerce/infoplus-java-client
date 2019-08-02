# CartonActivityApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCartonActivity**](CartonActivityApi.md#addCartonActivity) | **POST** /beta/cartonActivity | Create a cartonActivity
[**addCartonActivityAudit**](CartonActivityApi.md#addCartonActivityAudit) | **PUT** /beta/cartonActivity/{cartonActivityId}/audit/{cartonActivityAudit} | Add new audit for a cartonActivity
[**addCartonActivityFile**](CartonActivityApi.md#addCartonActivityFile) | **POST** /beta/cartonActivity/{cartonActivityId}/file/{fileName} | Attach a file to a cartonActivity
[**addCartonActivityTag**](CartonActivityApi.md#addCartonActivityTag) | **PUT** /beta/cartonActivity/{cartonActivityId}/tag/{cartonActivityTag} | Add new tags for a cartonActivity.
[**deleteCartonActivity**](CartonActivityApi.md#deleteCartonActivity) | **DELETE** /beta/cartonActivity/{cartonActivityId} | Delete a cartonActivity
[**deleteCartonActivityTag**](CartonActivityApi.md#deleteCartonActivityTag) | **DELETE** /beta/cartonActivity/{cartonActivityId}/tag/{cartonActivityTag} | Delete a tag for a cartonActivity.
[**getCartonActivityByFilter**](CartonActivityApi.md#getCartonActivityByFilter) | **GET** /beta/cartonActivity/search | Search cartonActivitys by filter
[**getCartonActivityById**](CartonActivityApi.md#getCartonActivityById) | **GET** /beta/cartonActivity/{cartonActivityId} | Get a cartonActivity by id
[**getCartonActivityTags**](CartonActivityApi.md#getCartonActivityTags) | **GET** /beta/cartonActivity/{cartonActivityId}/tag | Get the tags for a cartonActivity.
[**getDuplicateCartonActivityById**](CartonActivityApi.md#getDuplicateCartonActivityById) | **GET** /beta/cartonActivity/duplicate/{cartonActivityId} | Get a duplicated a cartonActivity by id
[**updateCartonActivity**](CartonActivityApi.md#updateCartonActivity) | **PUT** /beta/cartonActivity | Update a cartonActivity


<a name="addCartonActivity"></a>
# **addCartonActivity**
> CartonActivity addCartonActivity(body)

Create a cartonActivity

Inserts a new cartonActivity using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonActivityApi apiInstance = new CartonActivityApi();
CartonActivity body = new CartonActivity(); // CartonActivity | CartonActivity to be inserted.
try {
    CartonActivity result = apiInstance.addCartonActivity(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonActivityApi#addCartonActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CartonActivity**](CartonActivity.md)| CartonActivity to be inserted. |

### Return type

[**CartonActivity**](CartonActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCartonActivityAudit"></a>
# **addCartonActivityAudit**
> addCartonActivityAudit(cartonActivityId, cartonActivityAudit)

Add new audit for a cartonActivity

Adds an audit to an existing cartonActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonActivityApi apiInstance = new CartonActivityApi();
Integer cartonActivityId = 56; // Integer | Id of the cartonActivity to add an audit to
String cartonActivityAudit = "cartonActivityAudit_example"; // String | The audit to add
try {
    apiInstance.addCartonActivityAudit(cartonActivityId, cartonActivityAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonActivityApi#addCartonActivityAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonActivityId** | **Integer**| Id of the cartonActivity to add an audit to |
 **cartonActivityAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCartonActivityFile"></a>
# **addCartonActivityFile**
> addCartonActivityFile(cartonActivityId, fileName)

Attach a file to a cartonActivity

Adds a file to an existing cartonActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonActivityApi apiInstance = new CartonActivityApi();
Integer cartonActivityId = 56; // Integer | Id of the cartonActivity to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addCartonActivityFile(cartonActivityId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonActivityApi#addCartonActivityFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonActivityId** | **Integer**| Id of the cartonActivity to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addCartonActivityTag"></a>
# **addCartonActivityTag**
> addCartonActivityTag(cartonActivityId, cartonActivityTag)

Add new tags for a cartonActivity.

Adds a tag to an existing cartonActivity.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonActivityApi apiInstance = new CartonActivityApi();
Integer cartonActivityId = 56; // Integer | Id of the cartonActivity to add a tag to
String cartonActivityTag = "cartonActivityTag_example"; // String | The tag to add
try {
    apiInstance.addCartonActivityTag(cartonActivityId, cartonActivityTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonActivityApi#addCartonActivityTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonActivityId** | **Integer**| Id of the cartonActivity to add a tag to |
 **cartonActivityTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCartonActivity"></a>
# **deleteCartonActivity**
> deleteCartonActivity(cartonActivityId)

Delete a cartonActivity

Deletes the cartonActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonActivityApi apiInstance = new CartonActivityApi();
Integer cartonActivityId = 56; // Integer | Id of the cartonActivity to be deleted.
try {
    apiInstance.deleteCartonActivity(cartonActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonActivityApi#deleteCartonActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonActivityId** | **Integer**| Id of the cartonActivity to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCartonActivityTag"></a>
# **deleteCartonActivityTag**
> deleteCartonActivityTag(cartonActivityId, cartonActivityTag)

Delete a tag for a cartonActivity.

Deletes an existing cartonActivity tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonActivityApi apiInstance = new CartonActivityApi();
Integer cartonActivityId = 56; // Integer | Id of the cartonActivity to remove tag from
String cartonActivityTag = "cartonActivityTag_example"; // String | The tag to delete
try {
    apiInstance.deleteCartonActivityTag(cartonActivityId, cartonActivityTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonActivityApi#deleteCartonActivityTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonActivityId** | **Integer**| Id of the cartonActivity to remove tag from |
 **cartonActivityTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartonActivityByFilter"></a>
# **getCartonActivityByFilter**
> List&lt;CartonActivity&gt; getCartonActivityByFilter(filter, page, limit, sort)

Search cartonActivitys by filter

Returns the list of cartonActivitys that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonActivityApi apiInstance = new CartonActivityApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<CartonActivity> result = apiInstance.getCartonActivityByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonActivityApi#getCartonActivityByFilter");
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

[**List&lt;CartonActivity&gt;**](CartonActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartonActivityById"></a>
# **getCartonActivityById**
> CartonActivity getCartonActivityById(cartonActivityId)

Get a cartonActivity by id

Returns the cartonActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonActivityApi apiInstance = new CartonActivityApi();
Integer cartonActivityId = 56; // Integer | Id of the cartonActivity to be returned.
try {
    CartonActivity result = apiInstance.getCartonActivityById(cartonActivityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonActivityApi#getCartonActivityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonActivityId** | **Integer**| Id of the cartonActivity to be returned. |

### Return type

[**CartonActivity**](CartonActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartonActivityTags"></a>
# **getCartonActivityTags**
> getCartonActivityTags(cartonActivityId)

Get the tags for a cartonActivity.

Get all existing cartonActivity tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonActivityApi apiInstance = new CartonActivityApi();
Integer cartonActivityId = 56; // Integer | Id of the cartonActivity to get tags for
try {
    apiInstance.getCartonActivityTags(cartonActivityId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonActivityApi#getCartonActivityTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonActivityId** | **Integer**| Id of the cartonActivity to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateCartonActivityById"></a>
# **getDuplicateCartonActivityById**
> CartonActivity getDuplicateCartonActivityById(cartonActivityId)

Get a duplicated a cartonActivity by id

Returns a duplicated cartonActivity identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonActivityApi apiInstance = new CartonActivityApi();
Integer cartonActivityId = 56; // Integer | Id of the cartonActivity to be duplicated.
try {
    CartonActivity result = apiInstance.getDuplicateCartonActivityById(cartonActivityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonActivityApi#getDuplicateCartonActivityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonActivityId** | **Integer**| Id of the cartonActivity to be duplicated. |

### Return type

[**CartonActivity**](CartonActivity.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCartonActivity"></a>
# **updateCartonActivity**
> updateCartonActivity(body)

Update a cartonActivity

Updates an existing cartonActivity using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonActivityApi apiInstance = new CartonActivityApi();
CartonActivity body = new CartonActivity(); // CartonActivity | CartonActivity to be updated.
try {
    apiInstance.updateCartonActivity(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonActivityApi#updateCartonActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CartonActivity**](CartonActivity.md)| CartonActivity to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

