# LocationBillingTypeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLocationBillingType**](LocationBillingTypeApi.md#addLocationBillingType) | **POST** /beta/locationBillingType | Create a locationBillingType
[**addLocationBillingTypeAudit**](LocationBillingTypeApi.md#addLocationBillingTypeAudit) | **PUT** /beta/locationBillingType/{locationBillingTypeId}/audit/{locationBillingTypeAudit} | Add new audit for a locationBillingType
[**addLocationBillingTypeFile**](LocationBillingTypeApi.md#addLocationBillingTypeFile) | **POST** /beta/locationBillingType/{locationBillingTypeId}/file/{fileName} | Attach a file to a locationBillingType
[**addLocationBillingTypeFileByURL**](LocationBillingTypeApi.md#addLocationBillingTypeFileByURL) | **POST** /beta/locationBillingType/{locationBillingTypeId}/file | Attach a file to a locationBillingType by URL.
[**addLocationBillingTypeTag**](LocationBillingTypeApi.md#addLocationBillingTypeTag) | **PUT** /beta/locationBillingType/{locationBillingTypeId}/tag/{locationBillingTypeTag} | Add new tags for a locationBillingType.
[**deleteLocationBillingType**](LocationBillingTypeApi.md#deleteLocationBillingType) | **DELETE** /beta/locationBillingType/{locationBillingTypeId} | Delete a locationBillingType
[**deleteLocationBillingTypeFile**](LocationBillingTypeApi.md#deleteLocationBillingTypeFile) | **DELETE** /beta/locationBillingType/{locationBillingTypeId}/file/{fileId} | Delete a file for a locationBillingType.
[**deleteLocationBillingTypeTag**](LocationBillingTypeApi.md#deleteLocationBillingTypeTag) | **DELETE** /beta/locationBillingType/{locationBillingTypeId}/tag/{locationBillingTypeTag} | Delete a tag for a locationBillingType.
[**getDuplicateLocationBillingTypeById**](LocationBillingTypeApi.md#getDuplicateLocationBillingTypeById) | **GET** /beta/locationBillingType/duplicate/{locationBillingTypeId} | Get a duplicated a locationBillingType by id
[**getLocationBillingTypeByFilter**](LocationBillingTypeApi.md#getLocationBillingTypeByFilter) | **GET** /beta/locationBillingType/search | Search locationBillingTypes by filter
[**getLocationBillingTypeById**](LocationBillingTypeApi.md#getLocationBillingTypeById) | **GET** /beta/locationBillingType/{locationBillingTypeId} | Get a locationBillingType by id
[**getLocationBillingTypeFiles**](LocationBillingTypeApi.md#getLocationBillingTypeFiles) | **GET** /beta/locationBillingType/{locationBillingTypeId}/file | Get the files for a locationBillingType.
[**getLocationBillingTypeTags**](LocationBillingTypeApi.md#getLocationBillingTypeTags) | **GET** /beta/locationBillingType/{locationBillingTypeId}/tag | Get the tags for a locationBillingType.
[**updateLocationBillingType**](LocationBillingTypeApi.md#updateLocationBillingType) | **PUT** /beta/locationBillingType | Update a locationBillingType
[**updateLocationBillingTypeCustomFields**](LocationBillingTypeApi.md#updateLocationBillingTypeCustomFields) | **PUT** /beta/locationBillingType/customFields | Update a locationBillingType custom fields


<a name="addLocationBillingType"></a>
# **addLocationBillingType**
> LocationBillingType addLocationBillingType(body)

Create a locationBillingType

Inserts a new locationBillingType using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationBillingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationBillingTypeApi apiInstance = new LocationBillingTypeApi();
LocationBillingType body = new LocationBillingType(); // LocationBillingType | LocationBillingType to be inserted.
try {
    LocationBillingType result = apiInstance.addLocationBillingType(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationBillingTypeApi#addLocationBillingType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationBillingType**](LocationBillingType.md)| LocationBillingType to be inserted. |

### Return type

[**LocationBillingType**](LocationBillingType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLocationBillingTypeAudit"></a>
# **addLocationBillingTypeAudit**
> addLocationBillingTypeAudit(locationBillingTypeId, locationBillingTypeAudit)

Add new audit for a locationBillingType

Adds an audit to an existing locationBillingType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationBillingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationBillingTypeApi apiInstance = new LocationBillingTypeApi();
Integer locationBillingTypeId = 56; // Integer | Id of the locationBillingType to add an audit to
String locationBillingTypeAudit = "locationBillingTypeAudit_example"; // String | The audit to add
try {
    apiInstance.addLocationBillingTypeAudit(locationBillingTypeId, locationBillingTypeAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationBillingTypeApi#addLocationBillingTypeAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationBillingTypeId** | **Integer**| Id of the locationBillingType to add an audit to |
 **locationBillingTypeAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLocationBillingTypeFile"></a>
# **addLocationBillingTypeFile**
> addLocationBillingTypeFile(locationBillingTypeId, fileName)

Attach a file to a locationBillingType

Adds a file to an existing locationBillingType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationBillingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationBillingTypeApi apiInstance = new LocationBillingTypeApi();
Integer locationBillingTypeId = 56; // Integer | Id of the locationBillingType to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addLocationBillingTypeFile(locationBillingTypeId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationBillingTypeApi#addLocationBillingTypeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationBillingTypeId** | **Integer**| Id of the locationBillingType to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addLocationBillingTypeFileByURL"></a>
# **addLocationBillingTypeFileByURL**
> addLocationBillingTypeFileByURL(body, locationBillingTypeId)

Attach a file to a locationBillingType by URL.

Adds a file to an existing locationBillingType by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationBillingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationBillingTypeApi apiInstance = new LocationBillingTypeApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer locationBillingTypeId = 56; // Integer | Id of the locationBillingType to add an file to
try {
    apiInstance.addLocationBillingTypeFileByURL(body, locationBillingTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationBillingTypeApi#addLocationBillingTypeFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **locationBillingTypeId** | **Integer**| Id of the locationBillingType to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLocationBillingTypeTag"></a>
# **addLocationBillingTypeTag**
> addLocationBillingTypeTag(locationBillingTypeId, locationBillingTypeTag)

Add new tags for a locationBillingType.

Adds a tag to an existing locationBillingType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationBillingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationBillingTypeApi apiInstance = new LocationBillingTypeApi();
Integer locationBillingTypeId = 56; // Integer | Id of the locationBillingType to add a tag to
String locationBillingTypeTag = "locationBillingTypeTag_example"; // String | The tag to add
try {
    apiInstance.addLocationBillingTypeTag(locationBillingTypeId, locationBillingTypeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationBillingTypeApi#addLocationBillingTypeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationBillingTypeId** | **Integer**| Id of the locationBillingType to add a tag to |
 **locationBillingTypeTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLocationBillingType"></a>
# **deleteLocationBillingType**
> deleteLocationBillingType(locationBillingTypeId)

Delete a locationBillingType

Deletes the locationBillingType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationBillingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationBillingTypeApi apiInstance = new LocationBillingTypeApi();
Integer locationBillingTypeId = 56; // Integer | Id of the locationBillingType to be deleted.
try {
    apiInstance.deleteLocationBillingType(locationBillingTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationBillingTypeApi#deleteLocationBillingType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationBillingTypeId** | **Integer**| Id of the locationBillingType to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLocationBillingTypeFile"></a>
# **deleteLocationBillingTypeFile**
> deleteLocationBillingTypeFile(locationBillingTypeId, fileId)

Delete a file for a locationBillingType.

Deletes an existing locationBillingType file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationBillingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationBillingTypeApi apiInstance = new LocationBillingTypeApi();
Integer locationBillingTypeId = 56; // Integer | Id of the locationBillingType to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteLocationBillingTypeFile(locationBillingTypeId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationBillingTypeApi#deleteLocationBillingTypeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationBillingTypeId** | **Integer**| Id of the locationBillingType to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLocationBillingTypeTag"></a>
# **deleteLocationBillingTypeTag**
> deleteLocationBillingTypeTag(locationBillingTypeId, locationBillingTypeTag)

Delete a tag for a locationBillingType.

Deletes an existing locationBillingType tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationBillingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationBillingTypeApi apiInstance = new LocationBillingTypeApi();
Integer locationBillingTypeId = 56; // Integer | Id of the locationBillingType to remove tag from
String locationBillingTypeTag = "locationBillingTypeTag_example"; // String | The tag to delete
try {
    apiInstance.deleteLocationBillingTypeTag(locationBillingTypeId, locationBillingTypeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationBillingTypeApi#deleteLocationBillingTypeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationBillingTypeId** | **Integer**| Id of the locationBillingType to remove tag from |
 **locationBillingTypeTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateLocationBillingTypeById"></a>
# **getDuplicateLocationBillingTypeById**
> LocationBillingType getDuplicateLocationBillingTypeById(locationBillingTypeId)

Get a duplicated a locationBillingType by id

Returns a duplicated locationBillingType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationBillingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationBillingTypeApi apiInstance = new LocationBillingTypeApi();
Integer locationBillingTypeId = 56; // Integer | Id of the locationBillingType to be duplicated.
try {
    LocationBillingType result = apiInstance.getDuplicateLocationBillingTypeById(locationBillingTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationBillingTypeApi#getDuplicateLocationBillingTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationBillingTypeId** | **Integer**| Id of the locationBillingType to be duplicated. |

### Return type

[**LocationBillingType**](LocationBillingType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocationBillingTypeByFilter"></a>
# **getLocationBillingTypeByFilter**
> List&lt;LocationBillingType&gt; getLocationBillingTypeByFilter(filter, page, limit, sort)

Search locationBillingTypes by filter

Returns the list of locationBillingTypes that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationBillingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationBillingTypeApi apiInstance = new LocationBillingTypeApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<LocationBillingType> result = apiInstance.getLocationBillingTypeByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationBillingTypeApi#getLocationBillingTypeByFilter");
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

[**List&lt;LocationBillingType&gt;**](LocationBillingType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocationBillingTypeById"></a>
# **getLocationBillingTypeById**
> LocationBillingType getLocationBillingTypeById(locationBillingTypeId)

Get a locationBillingType by id

Returns the locationBillingType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationBillingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationBillingTypeApi apiInstance = new LocationBillingTypeApi();
Integer locationBillingTypeId = 56; // Integer | Id of the locationBillingType to be returned.
try {
    LocationBillingType result = apiInstance.getLocationBillingTypeById(locationBillingTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationBillingTypeApi#getLocationBillingTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationBillingTypeId** | **Integer**| Id of the locationBillingType to be returned. |

### Return type

[**LocationBillingType**](LocationBillingType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocationBillingTypeFiles"></a>
# **getLocationBillingTypeFiles**
> getLocationBillingTypeFiles(locationBillingTypeId)

Get the files for a locationBillingType.

Get all existing locationBillingType files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationBillingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationBillingTypeApi apiInstance = new LocationBillingTypeApi();
Integer locationBillingTypeId = 56; // Integer | Id of the locationBillingType to get files for
try {
    apiInstance.getLocationBillingTypeFiles(locationBillingTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationBillingTypeApi#getLocationBillingTypeFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationBillingTypeId** | **Integer**| Id of the locationBillingType to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocationBillingTypeTags"></a>
# **getLocationBillingTypeTags**
> getLocationBillingTypeTags(locationBillingTypeId)

Get the tags for a locationBillingType.

Get all existing locationBillingType tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationBillingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationBillingTypeApi apiInstance = new LocationBillingTypeApi();
Integer locationBillingTypeId = 56; // Integer | Id of the locationBillingType to get tags for
try {
    apiInstance.getLocationBillingTypeTags(locationBillingTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationBillingTypeApi#getLocationBillingTypeTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationBillingTypeId** | **Integer**| Id of the locationBillingType to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLocationBillingType"></a>
# **updateLocationBillingType**
> updateLocationBillingType(body)

Update a locationBillingType

Updates an existing locationBillingType using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationBillingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationBillingTypeApi apiInstance = new LocationBillingTypeApi();
LocationBillingType body = new LocationBillingType(); // LocationBillingType | LocationBillingType to be updated.
try {
    apiInstance.updateLocationBillingType(body);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationBillingTypeApi#updateLocationBillingType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationBillingType**](LocationBillingType.md)| LocationBillingType to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLocationBillingTypeCustomFields"></a>
# **updateLocationBillingTypeCustomFields**
> updateLocationBillingTypeCustomFields(body)

Update a locationBillingType custom fields

Updates an existing locationBillingType custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationBillingTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationBillingTypeApi apiInstance = new LocationBillingTypeApi();
LocationBillingType body = new LocationBillingType(); // LocationBillingType | LocationBillingType to be updated.
try {
    apiInstance.updateLocationBillingTypeCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationBillingTypeApi#updateLocationBillingTypeCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationBillingType**](LocationBillingType.md)| LocationBillingType to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

