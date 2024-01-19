# LocationAddressSchemeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLocationAddressScheme**](LocationAddressSchemeApi.md#addLocationAddressScheme) | **POST** /beta/locationAddressScheme | Create a locationAddressScheme
[**addLocationAddressSchemeAudit**](LocationAddressSchemeApi.md#addLocationAddressSchemeAudit) | **PUT** /beta/locationAddressScheme/{locationAddressSchemeId}/audit/{locationAddressSchemeAudit} | Add new audit for a locationAddressScheme
[**addLocationAddressSchemeFile**](LocationAddressSchemeApi.md#addLocationAddressSchemeFile) | **POST** /beta/locationAddressScheme/{locationAddressSchemeId}/file/{fileName} | Attach a file to a locationAddressScheme
[**addLocationAddressSchemeFileByURL**](LocationAddressSchemeApi.md#addLocationAddressSchemeFileByURL) | **POST** /beta/locationAddressScheme/{locationAddressSchemeId}/file | Attach a file to a locationAddressScheme by URL.
[**addLocationAddressSchemeTag**](LocationAddressSchemeApi.md#addLocationAddressSchemeTag) | **PUT** /beta/locationAddressScheme/{locationAddressSchemeId}/tag/{locationAddressSchemeTag} | Add new tags for a locationAddressScheme.
[**deleteLocationAddressScheme**](LocationAddressSchemeApi.md#deleteLocationAddressScheme) | **DELETE** /beta/locationAddressScheme/{locationAddressSchemeId} | Delete a locationAddressScheme
[**deleteLocationAddressSchemeFile**](LocationAddressSchemeApi.md#deleteLocationAddressSchemeFile) | **DELETE** /beta/locationAddressScheme/{locationAddressSchemeId}/file/{fileId} | Delete a file for a locationAddressScheme.
[**deleteLocationAddressSchemeTag**](LocationAddressSchemeApi.md#deleteLocationAddressSchemeTag) | **DELETE** /beta/locationAddressScheme/{locationAddressSchemeId}/tag/{locationAddressSchemeTag} | Delete a tag for a locationAddressScheme.
[**getDuplicateLocationAddressSchemeById**](LocationAddressSchemeApi.md#getDuplicateLocationAddressSchemeById) | **GET** /beta/locationAddressScheme/duplicate/{locationAddressSchemeId} | Get a duplicated a locationAddressScheme by id
[**getLocationAddressSchemeByFilter**](LocationAddressSchemeApi.md#getLocationAddressSchemeByFilter) | **GET** /beta/locationAddressScheme/search | Search locationAddressSchemes by filter
[**getLocationAddressSchemeById**](LocationAddressSchemeApi.md#getLocationAddressSchemeById) | **GET** /beta/locationAddressScheme/{locationAddressSchemeId} | Get a locationAddressScheme by id
[**getLocationAddressSchemeFiles**](LocationAddressSchemeApi.md#getLocationAddressSchemeFiles) | **GET** /beta/locationAddressScheme/{locationAddressSchemeId}/file | Get the files for a locationAddressScheme.
[**getLocationAddressSchemeTags**](LocationAddressSchemeApi.md#getLocationAddressSchemeTags) | **GET** /beta/locationAddressScheme/{locationAddressSchemeId}/tag | Get the tags for a locationAddressScheme.
[**updateLocationAddressScheme**](LocationAddressSchemeApi.md#updateLocationAddressScheme) | **PUT** /beta/locationAddressScheme | Update a locationAddressScheme
[**updateLocationAddressSchemeCustomFields**](LocationAddressSchemeApi.md#updateLocationAddressSchemeCustomFields) | **PUT** /beta/locationAddressScheme/customFields | Update a locationAddressScheme custom fields


<a name="addLocationAddressScheme"></a>
# **addLocationAddressScheme**
> LocationAddressScheme addLocationAddressScheme(body)

Create a locationAddressScheme

Inserts a new locationAddressScheme using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationAddressSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationAddressSchemeApi apiInstance = new LocationAddressSchemeApi();
LocationAddressScheme body = new LocationAddressScheme(); // LocationAddressScheme | LocationAddressScheme to be inserted.
try {
    LocationAddressScheme result = apiInstance.addLocationAddressScheme(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAddressSchemeApi#addLocationAddressScheme");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationAddressScheme**](LocationAddressScheme.md)| LocationAddressScheme to be inserted. |

### Return type

[**LocationAddressScheme**](LocationAddressScheme.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLocationAddressSchemeAudit"></a>
# **addLocationAddressSchemeAudit**
> addLocationAddressSchemeAudit(locationAddressSchemeId, locationAddressSchemeAudit)

Add new audit for a locationAddressScheme

Adds an audit to an existing locationAddressScheme.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationAddressSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationAddressSchemeApi apiInstance = new LocationAddressSchemeApi();
Integer locationAddressSchemeId = 56; // Integer | Id of the locationAddressScheme to add an audit to
String locationAddressSchemeAudit = "locationAddressSchemeAudit_example"; // String | The audit to add
try {
    apiInstance.addLocationAddressSchemeAudit(locationAddressSchemeId, locationAddressSchemeAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAddressSchemeApi#addLocationAddressSchemeAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationAddressSchemeId** | **Integer**| Id of the locationAddressScheme to add an audit to |
 **locationAddressSchemeAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLocationAddressSchemeFile"></a>
# **addLocationAddressSchemeFile**
> addLocationAddressSchemeFile(locationAddressSchemeId, fileName)

Attach a file to a locationAddressScheme

Adds a file to an existing locationAddressScheme.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationAddressSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationAddressSchemeApi apiInstance = new LocationAddressSchemeApi();
Integer locationAddressSchemeId = 56; // Integer | Id of the locationAddressScheme to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addLocationAddressSchemeFile(locationAddressSchemeId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAddressSchemeApi#addLocationAddressSchemeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationAddressSchemeId** | **Integer**| Id of the locationAddressScheme to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addLocationAddressSchemeFileByURL"></a>
# **addLocationAddressSchemeFileByURL**
> addLocationAddressSchemeFileByURL(body, locationAddressSchemeId)

Attach a file to a locationAddressScheme by URL.

Adds a file to an existing locationAddressScheme by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationAddressSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationAddressSchemeApi apiInstance = new LocationAddressSchemeApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer locationAddressSchemeId = 56; // Integer | Id of the locationAddressScheme to add an file to
try {
    apiInstance.addLocationAddressSchemeFileByURL(body, locationAddressSchemeId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAddressSchemeApi#addLocationAddressSchemeFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **locationAddressSchemeId** | **Integer**| Id of the locationAddressScheme to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLocationAddressSchemeTag"></a>
# **addLocationAddressSchemeTag**
> addLocationAddressSchemeTag(locationAddressSchemeId, locationAddressSchemeTag)

Add new tags for a locationAddressScheme.

Adds a tag to an existing locationAddressScheme.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationAddressSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationAddressSchemeApi apiInstance = new LocationAddressSchemeApi();
Integer locationAddressSchemeId = 56; // Integer | Id of the locationAddressScheme to add a tag to
String locationAddressSchemeTag = "locationAddressSchemeTag_example"; // String | The tag to add
try {
    apiInstance.addLocationAddressSchemeTag(locationAddressSchemeId, locationAddressSchemeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAddressSchemeApi#addLocationAddressSchemeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationAddressSchemeId** | **Integer**| Id of the locationAddressScheme to add a tag to |
 **locationAddressSchemeTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLocationAddressScheme"></a>
# **deleteLocationAddressScheme**
> deleteLocationAddressScheme(locationAddressSchemeId)

Delete a locationAddressScheme

Deletes the locationAddressScheme identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationAddressSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationAddressSchemeApi apiInstance = new LocationAddressSchemeApi();
Integer locationAddressSchemeId = 56; // Integer | Id of the locationAddressScheme to be deleted.
try {
    apiInstance.deleteLocationAddressScheme(locationAddressSchemeId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAddressSchemeApi#deleteLocationAddressScheme");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationAddressSchemeId** | **Integer**| Id of the locationAddressScheme to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLocationAddressSchemeFile"></a>
# **deleteLocationAddressSchemeFile**
> deleteLocationAddressSchemeFile(locationAddressSchemeId, fileId)

Delete a file for a locationAddressScheme.

Deletes an existing locationAddressScheme file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationAddressSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationAddressSchemeApi apiInstance = new LocationAddressSchemeApi();
Integer locationAddressSchemeId = 56; // Integer | Id of the locationAddressScheme to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteLocationAddressSchemeFile(locationAddressSchemeId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAddressSchemeApi#deleteLocationAddressSchemeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationAddressSchemeId** | **Integer**| Id of the locationAddressScheme to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLocationAddressSchemeTag"></a>
# **deleteLocationAddressSchemeTag**
> deleteLocationAddressSchemeTag(locationAddressSchemeId, locationAddressSchemeTag)

Delete a tag for a locationAddressScheme.

Deletes an existing locationAddressScheme tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationAddressSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationAddressSchemeApi apiInstance = new LocationAddressSchemeApi();
Integer locationAddressSchemeId = 56; // Integer | Id of the locationAddressScheme to remove tag from
String locationAddressSchemeTag = "locationAddressSchemeTag_example"; // String | The tag to delete
try {
    apiInstance.deleteLocationAddressSchemeTag(locationAddressSchemeId, locationAddressSchemeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAddressSchemeApi#deleteLocationAddressSchemeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationAddressSchemeId** | **Integer**| Id of the locationAddressScheme to remove tag from |
 **locationAddressSchemeTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateLocationAddressSchemeById"></a>
# **getDuplicateLocationAddressSchemeById**
> LocationAddressScheme getDuplicateLocationAddressSchemeById(locationAddressSchemeId)

Get a duplicated a locationAddressScheme by id

Returns a duplicated locationAddressScheme identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationAddressSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationAddressSchemeApi apiInstance = new LocationAddressSchemeApi();
Integer locationAddressSchemeId = 56; // Integer | Id of the locationAddressScheme to be duplicated.
try {
    LocationAddressScheme result = apiInstance.getDuplicateLocationAddressSchemeById(locationAddressSchemeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAddressSchemeApi#getDuplicateLocationAddressSchemeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationAddressSchemeId** | **Integer**| Id of the locationAddressScheme to be duplicated. |

### Return type

[**LocationAddressScheme**](LocationAddressScheme.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocationAddressSchemeByFilter"></a>
# **getLocationAddressSchemeByFilter**
> List&lt;LocationAddressScheme&gt; getLocationAddressSchemeByFilter(filter, page, limit, sort)

Search locationAddressSchemes by filter

Returns the list of locationAddressSchemes that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationAddressSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationAddressSchemeApi apiInstance = new LocationAddressSchemeApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<LocationAddressScheme> result = apiInstance.getLocationAddressSchemeByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAddressSchemeApi#getLocationAddressSchemeByFilter");
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

[**List&lt;LocationAddressScheme&gt;**](LocationAddressScheme.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocationAddressSchemeById"></a>
# **getLocationAddressSchemeById**
> LocationAddressScheme getLocationAddressSchemeById(locationAddressSchemeId)

Get a locationAddressScheme by id

Returns the locationAddressScheme identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationAddressSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationAddressSchemeApi apiInstance = new LocationAddressSchemeApi();
Integer locationAddressSchemeId = 56; // Integer | Id of the locationAddressScheme to be returned.
try {
    LocationAddressScheme result = apiInstance.getLocationAddressSchemeById(locationAddressSchemeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAddressSchemeApi#getLocationAddressSchemeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationAddressSchemeId** | **Integer**| Id of the locationAddressScheme to be returned. |

### Return type

[**LocationAddressScheme**](LocationAddressScheme.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocationAddressSchemeFiles"></a>
# **getLocationAddressSchemeFiles**
> getLocationAddressSchemeFiles(locationAddressSchemeId)

Get the files for a locationAddressScheme.

Get all existing locationAddressScheme files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationAddressSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationAddressSchemeApi apiInstance = new LocationAddressSchemeApi();
Integer locationAddressSchemeId = 56; // Integer | Id of the locationAddressScheme to get files for
try {
    apiInstance.getLocationAddressSchemeFiles(locationAddressSchemeId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAddressSchemeApi#getLocationAddressSchemeFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationAddressSchemeId** | **Integer**| Id of the locationAddressScheme to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocationAddressSchemeTags"></a>
# **getLocationAddressSchemeTags**
> getLocationAddressSchemeTags(locationAddressSchemeId)

Get the tags for a locationAddressScheme.

Get all existing locationAddressScheme tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationAddressSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationAddressSchemeApi apiInstance = new LocationAddressSchemeApi();
Integer locationAddressSchemeId = 56; // Integer | Id of the locationAddressScheme to get tags for
try {
    apiInstance.getLocationAddressSchemeTags(locationAddressSchemeId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAddressSchemeApi#getLocationAddressSchemeTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationAddressSchemeId** | **Integer**| Id of the locationAddressScheme to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLocationAddressScheme"></a>
# **updateLocationAddressScheme**
> updateLocationAddressScheme(body)

Update a locationAddressScheme

Updates an existing locationAddressScheme using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationAddressSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationAddressSchemeApi apiInstance = new LocationAddressSchemeApi();
LocationAddressScheme body = new LocationAddressScheme(); // LocationAddressScheme | LocationAddressScheme to be updated.
try {
    apiInstance.updateLocationAddressScheme(body);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAddressSchemeApi#updateLocationAddressScheme");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationAddressScheme**](LocationAddressScheme.md)| LocationAddressScheme to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLocationAddressSchemeCustomFields"></a>
# **updateLocationAddressSchemeCustomFields**
> updateLocationAddressSchemeCustomFields(body)

Update a locationAddressScheme custom fields

Updates an existing locationAddressScheme custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationAddressSchemeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationAddressSchemeApi apiInstance = new LocationAddressSchemeApi();
LocationAddressScheme body = new LocationAddressScheme(); // LocationAddressScheme | LocationAddressScheme to be updated.
try {
    apiInstance.updateLocationAddressSchemeCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAddressSchemeApi#updateLocationAddressSchemeCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationAddressScheme**](LocationAddressScheme.md)| LocationAddressScheme to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

