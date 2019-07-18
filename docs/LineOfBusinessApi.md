# LineOfBusinessApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLineOfBusinessAudit**](LineOfBusinessApi.md#addLineOfBusinessAudit) | **PUT** /beta/lineOfBusiness/{lineOfBusinessId}/audit/{lineOfBusinessAudit} | Add new audit for a lineOfBusiness
[**addLineOfBusinessFile**](LineOfBusinessApi.md#addLineOfBusinessFile) | **POST** /beta/lineOfBusiness/{lineOfBusinessId}/file/{fileName} | Attach a file to a lineOfBusiness
[**addLineOfBusinessTag**](LineOfBusinessApi.md#addLineOfBusinessTag) | **PUT** /beta/lineOfBusiness/{lineOfBusinessId}/tag/{lineOfBusinessTag} | Add new tags for a lineOfBusiness.
[**deleteLineOfBusinessTag**](LineOfBusinessApi.md#deleteLineOfBusinessTag) | **DELETE** /beta/lineOfBusiness/{lineOfBusinessId}/tag/{lineOfBusinessTag} | Delete a tag for a lineOfBusiness.
[**getDuplicateLineOfBusinessById**](LineOfBusinessApi.md#getDuplicateLineOfBusinessById) | **GET** /beta/lineOfBusiness/duplicate/{lineOfBusinessId} | Get a duplicated a lineOfBusiness by id
[**getLineOfBusinessByFilter**](LineOfBusinessApi.md#getLineOfBusinessByFilter) | **GET** /beta/lineOfBusiness/search | Search lineOfBusinesses by filter
[**getLineOfBusinessById**](LineOfBusinessApi.md#getLineOfBusinessById) | **GET** /beta/lineOfBusiness/{lineOfBusinessId} | Get a lineOfBusiness by id
[**getLineOfBusinessTags**](LineOfBusinessApi.md#getLineOfBusinessTags) | **GET** /beta/lineOfBusiness/{lineOfBusinessId}/tag | Get the tags for a lineOfBusiness.
[**updateLineOfBusiness**](LineOfBusinessApi.md#updateLineOfBusiness) | **PUT** /beta/lineOfBusiness | Update a lineOfBusiness
[**updateLineOfBusinessCustomFields**](LineOfBusinessApi.md#updateLineOfBusinessCustomFields) | **PUT** /beta/lineOfBusiness/customFields | Update a lineOfBusiness custom fields


<a name="addLineOfBusinessAudit"></a>
# **addLineOfBusinessAudit**
> addLineOfBusinessAudit(lineOfBusinessId, lineOfBusinessAudit)

Add new audit for a lineOfBusiness

Adds an audit to an existing lineOfBusiness.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LineOfBusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LineOfBusinessApi apiInstance = new LineOfBusinessApi();
Integer lineOfBusinessId = 56; // Integer | Id of the lineOfBusiness to add an audit to
String lineOfBusinessAudit = "lineOfBusinessAudit_example"; // String | The audit to add
try {
    apiInstance.addLineOfBusinessAudit(lineOfBusinessId, lineOfBusinessAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling LineOfBusinessApi#addLineOfBusinessAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lineOfBusinessId** | **Integer**| Id of the lineOfBusiness to add an audit to |
 **lineOfBusinessAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLineOfBusinessFile"></a>
# **addLineOfBusinessFile**
> addLineOfBusinessFile(lineOfBusinessId, fileName)

Attach a file to a lineOfBusiness

Adds a file to an existing lineOfBusiness.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LineOfBusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LineOfBusinessApi apiInstance = new LineOfBusinessApi();
Integer lineOfBusinessId = 56; // Integer | Id of the lineOfBusiness to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addLineOfBusinessFile(lineOfBusinessId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling LineOfBusinessApi#addLineOfBusinessFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lineOfBusinessId** | **Integer**| Id of the lineOfBusiness to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addLineOfBusinessTag"></a>
# **addLineOfBusinessTag**
> addLineOfBusinessTag(lineOfBusinessId, lineOfBusinessTag)

Add new tags for a lineOfBusiness.

Adds a tag to an existing lineOfBusiness.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LineOfBusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LineOfBusinessApi apiInstance = new LineOfBusinessApi();
Integer lineOfBusinessId = 56; // Integer | Id of the lineOfBusiness to add a tag to
String lineOfBusinessTag = "lineOfBusinessTag_example"; // String | The tag to add
try {
    apiInstance.addLineOfBusinessTag(lineOfBusinessId, lineOfBusinessTag);
} catch (ApiException e) {
    System.err.println("Exception when calling LineOfBusinessApi#addLineOfBusinessTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lineOfBusinessId** | **Integer**| Id of the lineOfBusiness to add a tag to |
 **lineOfBusinessTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLineOfBusinessTag"></a>
# **deleteLineOfBusinessTag**
> deleteLineOfBusinessTag(lineOfBusinessId, lineOfBusinessTag)

Delete a tag for a lineOfBusiness.

Deletes an existing lineOfBusiness tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LineOfBusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LineOfBusinessApi apiInstance = new LineOfBusinessApi();
Integer lineOfBusinessId = 56; // Integer | Id of the lineOfBusiness to remove tag from
String lineOfBusinessTag = "lineOfBusinessTag_example"; // String | The tag to delete
try {
    apiInstance.deleteLineOfBusinessTag(lineOfBusinessId, lineOfBusinessTag);
} catch (ApiException e) {
    System.err.println("Exception when calling LineOfBusinessApi#deleteLineOfBusinessTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lineOfBusinessId** | **Integer**| Id of the lineOfBusiness to remove tag from |
 **lineOfBusinessTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateLineOfBusinessById"></a>
# **getDuplicateLineOfBusinessById**
> LineOfBusiness getDuplicateLineOfBusinessById(lineOfBusinessId)

Get a duplicated a lineOfBusiness by id

Returns a duplicated lineOfBusiness identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LineOfBusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LineOfBusinessApi apiInstance = new LineOfBusinessApi();
Integer lineOfBusinessId = 56; // Integer | Id of the lineOfBusiness to be duplicated.
try {
    LineOfBusiness result = apiInstance.getDuplicateLineOfBusinessById(lineOfBusinessId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LineOfBusinessApi#getDuplicateLineOfBusinessById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lineOfBusinessId** | **Integer**| Id of the lineOfBusiness to be duplicated. |

### Return type

[**LineOfBusiness**](LineOfBusiness.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLineOfBusinessByFilter"></a>
# **getLineOfBusinessByFilter**
> List&lt;LineOfBusiness&gt; getLineOfBusinessByFilter(filter, page, limit, sort)

Search lineOfBusinesses by filter

Returns the list of lineOfBusinesses that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LineOfBusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LineOfBusinessApi apiInstance = new LineOfBusinessApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<LineOfBusiness> result = apiInstance.getLineOfBusinessByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LineOfBusinessApi#getLineOfBusinessByFilter");
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

[**List&lt;LineOfBusiness&gt;**](LineOfBusiness.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLineOfBusinessById"></a>
# **getLineOfBusinessById**
> LineOfBusiness getLineOfBusinessById(lineOfBusinessId)

Get a lineOfBusiness by id

Returns the lineOfBusiness identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LineOfBusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LineOfBusinessApi apiInstance = new LineOfBusinessApi();
Integer lineOfBusinessId = 56; // Integer | Id of the lineOfBusiness to be returned.
try {
    LineOfBusiness result = apiInstance.getLineOfBusinessById(lineOfBusinessId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LineOfBusinessApi#getLineOfBusinessById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lineOfBusinessId** | **Integer**| Id of the lineOfBusiness to be returned. |

### Return type

[**LineOfBusiness**](LineOfBusiness.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLineOfBusinessTags"></a>
# **getLineOfBusinessTags**
> getLineOfBusinessTags(lineOfBusinessId)

Get the tags for a lineOfBusiness.

Get all existing lineOfBusiness tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LineOfBusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LineOfBusinessApi apiInstance = new LineOfBusinessApi();
Integer lineOfBusinessId = 56; // Integer | Id of the lineOfBusiness to get tags for
try {
    apiInstance.getLineOfBusinessTags(lineOfBusinessId);
} catch (ApiException e) {
    System.err.println("Exception when calling LineOfBusinessApi#getLineOfBusinessTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lineOfBusinessId** | **Integer**| Id of the lineOfBusiness to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLineOfBusiness"></a>
# **updateLineOfBusiness**
> updateLineOfBusiness(body)

Update a lineOfBusiness

Updates an existing lineOfBusiness using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LineOfBusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LineOfBusinessApi apiInstance = new LineOfBusinessApi();
LineOfBusiness body = new LineOfBusiness(); // LineOfBusiness | LineOfBusiness to be updated.
try {
    apiInstance.updateLineOfBusiness(body);
} catch (ApiException e) {
    System.err.println("Exception when calling LineOfBusinessApi#updateLineOfBusiness");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LineOfBusiness**](LineOfBusiness.md)| LineOfBusiness to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLineOfBusinessCustomFields"></a>
# **updateLineOfBusinessCustomFields**
> updateLineOfBusinessCustomFields(body)

Update a lineOfBusiness custom fields

Updates an existing lineOfBusiness custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LineOfBusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LineOfBusinessApi apiInstance = new LineOfBusinessApi();
LineOfBusiness body = new LineOfBusiness(); // LineOfBusiness | LineOfBusiness to be updated.
try {
    apiInstance.updateLineOfBusinessCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling LineOfBusinessApi#updateLineOfBusinessCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LineOfBusiness**](LineOfBusiness.md)| LineOfBusiness to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

