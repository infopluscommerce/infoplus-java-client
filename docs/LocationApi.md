# LocationApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLocation**](LocationApi.md#addLocation) | **POST** /beta/location | Create a location
[**addLocationAudit**](LocationApi.md#addLocationAudit) | **PUT** /beta/location/{locationId}/audit/{locationAudit} | Add new audit for a location
[**addLocationFile**](LocationApi.md#addLocationFile) | **POST** /beta/location/{locationId}/file/{fileName} | Attach a file to a location
[**addLocationFileByURL**](LocationApi.md#addLocationFileByURL) | **POST** /beta/location/{locationId}/file | Attach a file to a location by URL.
[**addLocationTag**](LocationApi.md#addLocationTag) | **PUT** /beta/location/{locationId}/tag/{locationTag} | Add new tags for a location.
[**deleteLocation**](LocationApi.md#deleteLocation) | **DELETE** /beta/location/{locationId} | Delete a location
[**deleteLocationFile**](LocationApi.md#deleteLocationFile) | **DELETE** /beta/location/{locationId}/file/{fileId} | Delete a file for a location.
[**deleteLocationTag**](LocationApi.md#deleteLocationTag) | **DELETE** /beta/location/{locationId}/tag/{locationTag} | Delete a tag for a location.
[**getDuplicateLocationById**](LocationApi.md#getDuplicateLocationById) | **GET** /beta/location/duplicate/{locationId} | Get a duplicated a location by id
[**getLocationByFilter**](LocationApi.md#getLocationByFilter) | **GET** /beta/location/search | Search locations by filter
[**getLocationById**](LocationApi.md#getLocationById) | **GET** /beta/location/{locationId} | Get a location by id
[**getLocationFiles**](LocationApi.md#getLocationFiles) | **GET** /beta/location/{locationId}/file | Get the files for a location.
[**getLocationTags**](LocationApi.md#getLocationTags) | **GET** /beta/location/{locationId}/tag | Get the tags for a location.
[**updateLocation**](LocationApi.md#updateLocation) | **PUT** /beta/location | Update a location
[**updateLocationCustomFields**](LocationApi.md#updateLocationCustomFields) | **PUT** /beta/location/customFields | Update a location custom fields


<a name="addLocation"></a>
# **addLocation**
> Location addLocation(body)

Create a location

Inserts a new location using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationApi apiInstance = new LocationApi();
Location body = new Location(); // Location | Location to be inserted.
try {
    Location result = apiInstance.addLocation(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#addLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Location**](Location.md)| Location to be inserted. |

### Return type

[**Location**](Location.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLocationAudit"></a>
# **addLocationAudit**
> addLocationAudit(locationId, locationAudit)

Add new audit for a location

Adds an audit to an existing location.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationApi apiInstance = new LocationApi();
Integer locationId = 56; // Integer | Id of the location to add an audit to
String locationAudit = "locationAudit_example"; // String | The audit to add
try {
    apiInstance.addLocationAudit(locationId, locationAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#addLocationAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **Integer**| Id of the location to add an audit to |
 **locationAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLocationFile"></a>
# **addLocationFile**
> addLocationFile(locationId, fileName)

Attach a file to a location

Adds a file to an existing location.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationApi apiInstance = new LocationApi();
Integer locationId = 56; // Integer | Id of the location to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addLocationFile(locationId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#addLocationFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **Integer**| Id of the location to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addLocationFileByURL"></a>
# **addLocationFileByURL**
> addLocationFileByURL(body, locationId)

Attach a file to a location by URL.

Adds a file to an existing location by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationApi apiInstance = new LocationApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer locationId = 56; // Integer | Id of the location to add an file to
try {
    apiInstance.addLocationFileByURL(body, locationId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#addLocationFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **locationId** | **Integer**| Id of the location to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLocationTag"></a>
# **addLocationTag**
> addLocationTag(locationId, locationTag)

Add new tags for a location.

Adds a tag to an existing location.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationApi apiInstance = new LocationApi();
Integer locationId = 56; // Integer | Id of the location to add a tag to
String locationTag = "locationTag_example"; // String | The tag to add
try {
    apiInstance.addLocationTag(locationId, locationTag);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#addLocationTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **Integer**| Id of the location to add a tag to |
 **locationTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLocation"></a>
# **deleteLocation**
> deleteLocation(locationId)

Delete a location

Deletes the location identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationApi apiInstance = new LocationApi();
Integer locationId = 56; // Integer | Id of the location to be deleted.
try {
    apiInstance.deleteLocation(locationId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#deleteLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **Integer**| Id of the location to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLocationFile"></a>
# **deleteLocationFile**
> deleteLocationFile(locationId, fileId)

Delete a file for a location.

Deletes an existing location file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationApi apiInstance = new LocationApi();
Integer locationId = 56; // Integer | Id of the location to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteLocationFile(locationId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#deleteLocationFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **Integer**| Id of the location to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLocationTag"></a>
# **deleteLocationTag**
> deleteLocationTag(locationId, locationTag)

Delete a tag for a location.

Deletes an existing location tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationApi apiInstance = new LocationApi();
Integer locationId = 56; // Integer | Id of the location to remove tag from
String locationTag = "locationTag_example"; // String | The tag to delete
try {
    apiInstance.deleteLocationTag(locationId, locationTag);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#deleteLocationTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **Integer**| Id of the location to remove tag from |
 **locationTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateLocationById"></a>
# **getDuplicateLocationById**
> Location getDuplicateLocationById(locationId)

Get a duplicated a location by id

Returns a duplicated location identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationApi apiInstance = new LocationApi();
Integer locationId = 56; // Integer | Id of the location to be duplicated.
try {
    Location result = apiInstance.getDuplicateLocationById(locationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#getDuplicateLocationById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **Integer**| Id of the location to be duplicated. |

### Return type

[**Location**](Location.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocationByFilter"></a>
# **getLocationByFilter**
> List&lt;Location&gt; getLocationByFilter(filter, page, limit, sort)

Search locations by filter

Returns the list of locations that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationApi apiInstance = new LocationApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Location> result = apiInstance.getLocationByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#getLocationByFilter");
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

[**List&lt;Location&gt;**](Location.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocationById"></a>
# **getLocationById**
> Location getLocationById(locationId)

Get a location by id

Returns the location identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationApi apiInstance = new LocationApi();
Integer locationId = 56; // Integer | Id of the location to be returned.
try {
    Location result = apiInstance.getLocationById(locationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#getLocationById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **Integer**| Id of the location to be returned. |

### Return type

[**Location**](Location.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocationFiles"></a>
# **getLocationFiles**
> getLocationFiles(locationId)

Get the files for a location.

Get all existing location files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationApi apiInstance = new LocationApi();
Integer locationId = 56; // Integer | Id of the location to get files for
try {
    apiInstance.getLocationFiles(locationId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#getLocationFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **Integer**| Id of the location to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocationTags"></a>
# **getLocationTags**
> getLocationTags(locationId)

Get the tags for a location.

Get all existing location tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationApi apiInstance = new LocationApi();
Integer locationId = 56; // Integer | Id of the location to get tags for
try {
    apiInstance.getLocationTags(locationId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#getLocationTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **Integer**| Id of the location to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLocation"></a>
# **updateLocation**
> updateLocation(body)

Update a location

Updates an existing location using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationApi apiInstance = new LocationApi();
Location body = new Location(); // Location | Location to be updated.
try {
    apiInstance.updateLocation(body);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#updateLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Location**](Location.md)| Location to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLocationCustomFields"></a>
# **updateLocationCustomFields**
> updateLocationCustomFields(body)

Update a location custom fields

Updates an existing location custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationApi apiInstance = new LocationApi();
Location body = new Location(); // Location | Location to be updated.
try {
    apiInstance.updateLocationCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#updateLocationCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Location**](Location.md)| Location to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

