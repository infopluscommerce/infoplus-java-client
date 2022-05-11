# LocationFootprintApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLocationFootprint**](LocationFootprintApi.md#addLocationFootprint) | **POST** /v3.0/locationFootprint | Create a locationFootprint
[**addLocationFootprintAudit**](LocationFootprintApi.md#addLocationFootprintAudit) | **PUT** /v3.0/locationFootprint/{locationFootprintId}/audit/{locationFootprintAudit} | Add new audit for a locationFootprint
[**addLocationFootprintFile**](LocationFootprintApi.md#addLocationFootprintFile) | **POST** /v3.0/locationFootprint/{locationFootprintId}/file/{fileName} | Attach a file to a locationFootprint
[**addLocationFootprintFileByURL**](LocationFootprintApi.md#addLocationFootprintFileByURL) | **POST** /v3.0/locationFootprint/{locationFootprintId}/file | Attach a file to a locationFootprint by URL.
[**addLocationFootprintTag**](LocationFootprintApi.md#addLocationFootprintTag) | **PUT** /v3.0/locationFootprint/{locationFootprintId}/tag/{locationFootprintTag} | Add new tags for a locationFootprint.
[**deleteLocationFootprint**](LocationFootprintApi.md#deleteLocationFootprint) | **DELETE** /v3.0/locationFootprint/{locationFootprintId} | Delete a locationFootprint
[**deleteLocationFootprintFile**](LocationFootprintApi.md#deleteLocationFootprintFile) | **DELETE** /v3.0/locationFootprint/{locationFootprintId}/file/{fileId} | Delete a file for a locationFootprint.
[**deleteLocationFootprintTag**](LocationFootprintApi.md#deleteLocationFootprintTag) | **DELETE** /v3.0/locationFootprint/{locationFootprintId}/tag/{locationFootprintTag} | Delete a tag for a locationFootprint.
[**getDuplicateLocationFootprintById**](LocationFootprintApi.md#getDuplicateLocationFootprintById) | **GET** /v3.0/locationFootprint/duplicate/{locationFootprintId} | Get a duplicated a locationFootprint by id
[**getLocationFootprintByFilter**](LocationFootprintApi.md#getLocationFootprintByFilter) | **GET** /v3.0/locationFootprint/search | Search locationFootprints by filter
[**getLocationFootprintById**](LocationFootprintApi.md#getLocationFootprintById) | **GET** /v3.0/locationFootprint/{locationFootprintId} | Get a locationFootprint by id
[**getLocationFootprintFiles**](LocationFootprintApi.md#getLocationFootprintFiles) | **GET** /v3.0/locationFootprint/{locationFootprintId}/file | Get the files for a locationFootprint.
[**getLocationFootprintTags**](LocationFootprintApi.md#getLocationFootprintTags) | **GET** /v3.0/locationFootprint/{locationFootprintId}/tag | Get the tags for a locationFootprint.
[**updateLocationFootprint**](LocationFootprintApi.md#updateLocationFootprint) | **PUT** /v3.0/locationFootprint | Update a locationFootprint
[**updateLocationFootprintCustomFields**](LocationFootprintApi.md#updateLocationFootprintCustomFields) | **PUT** /v3.0/locationFootprint/customFields | Update a locationFootprint custom fields


<a name="addLocationFootprint"></a>
# **addLocationFootprint**
> LocationFootprint addLocationFootprint(body)

Create a locationFootprint

Inserts a new locationFootprint using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationFootprintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationFootprintApi apiInstance = new LocationFootprintApi();
LocationFootprint body = new LocationFootprint(); // LocationFootprint | LocationFootprint to be inserted.
try {
    LocationFootprint result = apiInstance.addLocationFootprint(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationFootprintApi#addLocationFootprint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationFootprint**](LocationFootprint.md)| LocationFootprint to be inserted. |

### Return type

[**LocationFootprint**](LocationFootprint.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLocationFootprintAudit"></a>
# **addLocationFootprintAudit**
> addLocationFootprintAudit(locationFootprintId, locationFootprintAudit)

Add new audit for a locationFootprint

Adds an audit to an existing locationFootprint.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationFootprintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationFootprintApi apiInstance = new LocationFootprintApi();
Integer locationFootprintId = 56; // Integer | Id of the locationFootprint to add an audit to
String locationFootprintAudit = "locationFootprintAudit_example"; // String | The audit to add
try {
    apiInstance.addLocationFootprintAudit(locationFootprintId, locationFootprintAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationFootprintApi#addLocationFootprintAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationFootprintId** | **Integer**| Id of the locationFootprint to add an audit to |
 **locationFootprintAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLocationFootprintFile"></a>
# **addLocationFootprintFile**
> addLocationFootprintFile(locationFootprintId, fileName)

Attach a file to a locationFootprint

Adds a file to an existing locationFootprint.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationFootprintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationFootprintApi apiInstance = new LocationFootprintApi();
Integer locationFootprintId = 56; // Integer | Id of the locationFootprint to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addLocationFootprintFile(locationFootprintId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationFootprintApi#addLocationFootprintFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationFootprintId** | **Integer**| Id of the locationFootprint to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addLocationFootprintFileByURL"></a>
# **addLocationFootprintFileByURL**
> addLocationFootprintFileByURL(body, locationFootprintId)

Attach a file to a locationFootprint by URL.

Adds a file to an existing locationFootprint by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationFootprintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationFootprintApi apiInstance = new LocationFootprintApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer locationFootprintId = 56; // Integer | Id of the locationFootprint to add an file to
try {
    apiInstance.addLocationFootprintFileByURL(body, locationFootprintId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationFootprintApi#addLocationFootprintFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **locationFootprintId** | **Integer**| Id of the locationFootprint to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLocationFootprintTag"></a>
# **addLocationFootprintTag**
> addLocationFootprintTag(locationFootprintId, locationFootprintTag)

Add new tags for a locationFootprint.

Adds a tag to an existing locationFootprint.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationFootprintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationFootprintApi apiInstance = new LocationFootprintApi();
Integer locationFootprintId = 56; // Integer | Id of the locationFootprint to add a tag to
String locationFootprintTag = "locationFootprintTag_example"; // String | The tag to add
try {
    apiInstance.addLocationFootprintTag(locationFootprintId, locationFootprintTag);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationFootprintApi#addLocationFootprintTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationFootprintId** | **Integer**| Id of the locationFootprint to add a tag to |
 **locationFootprintTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLocationFootprint"></a>
# **deleteLocationFootprint**
> deleteLocationFootprint(locationFootprintId)

Delete a locationFootprint

Deletes the locationFootprint identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationFootprintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationFootprintApi apiInstance = new LocationFootprintApi();
Integer locationFootprintId = 56; // Integer | Id of the locationFootprint to be deleted.
try {
    apiInstance.deleteLocationFootprint(locationFootprintId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationFootprintApi#deleteLocationFootprint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationFootprintId** | **Integer**| Id of the locationFootprint to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLocationFootprintFile"></a>
# **deleteLocationFootprintFile**
> deleteLocationFootprintFile(locationFootprintId, fileId)

Delete a file for a locationFootprint.

Deletes an existing locationFootprint file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationFootprintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationFootprintApi apiInstance = new LocationFootprintApi();
Integer locationFootprintId = 56; // Integer | Id of the locationFootprint to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteLocationFootprintFile(locationFootprintId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationFootprintApi#deleteLocationFootprintFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationFootprintId** | **Integer**| Id of the locationFootprint to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLocationFootprintTag"></a>
# **deleteLocationFootprintTag**
> deleteLocationFootprintTag(locationFootprintId, locationFootprintTag)

Delete a tag for a locationFootprint.

Deletes an existing locationFootprint tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationFootprintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationFootprintApi apiInstance = new LocationFootprintApi();
Integer locationFootprintId = 56; // Integer | Id of the locationFootprint to remove tag from
String locationFootprintTag = "locationFootprintTag_example"; // String | The tag to delete
try {
    apiInstance.deleteLocationFootprintTag(locationFootprintId, locationFootprintTag);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationFootprintApi#deleteLocationFootprintTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationFootprintId** | **Integer**| Id of the locationFootprint to remove tag from |
 **locationFootprintTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateLocationFootprintById"></a>
# **getDuplicateLocationFootprintById**
> LocationFootprint getDuplicateLocationFootprintById(locationFootprintId)

Get a duplicated a locationFootprint by id

Returns a duplicated locationFootprint identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationFootprintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationFootprintApi apiInstance = new LocationFootprintApi();
Integer locationFootprintId = 56; // Integer | Id of the locationFootprint to be duplicated.
try {
    LocationFootprint result = apiInstance.getDuplicateLocationFootprintById(locationFootprintId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationFootprintApi#getDuplicateLocationFootprintById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationFootprintId** | **Integer**| Id of the locationFootprint to be duplicated. |

### Return type

[**LocationFootprint**](LocationFootprint.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocationFootprintByFilter"></a>
# **getLocationFootprintByFilter**
> List&lt;LocationFootprint&gt; getLocationFootprintByFilter(filter, page, limit, sort)

Search locationFootprints by filter

Returns the list of locationFootprints that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationFootprintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationFootprintApi apiInstance = new LocationFootprintApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<LocationFootprint> result = apiInstance.getLocationFootprintByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationFootprintApi#getLocationFootprintByFilter");
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

[**List&lt;LocationFootprint&gt;**](LocationFootprint.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocationFootprintById"></a>
# **getLocationFootprintById**
> LocationFootprint getLocationFootprintById(locationFootprintId)

Get a locationFootprint by id

Returns the locationFootprint identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationFootprintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationFootprintApi apiInstance = new LocationFootprintApi();
Integer locationFootprintId = 56; // Integer | Id of the locationFootprint to be returned.
try {
    LocationFootprint result = apiInstance.getLocationFootprintById(locationFootprintId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationFootprintApi#getLocationFootprintById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationFootprintId** | **Integer**| Id of the locationFootprint to be returned. |

### Return type

[**LocationFootprint**](LocationFootprint.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocationFootprintFiles"></a>
# **getLocationFootprintFiles**
> getLocationFootprintFiles(locationFootprintId)

Get the files for a locationFootprint.

Get all existing locationFootprint files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationFootprintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationFootprintApi apiInstance = new LocationFootprintApi();
Integer locationFootprintId = 56; // Integer | Id of the locationFootprint to get files for
try {
    apiInstance.getLocationFootprintFiles(locationFootprintId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationFootprintApi#getLocationFootprintFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationFootprintId** | **Integer**| Id of the locationFootprint to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocationFootprintTags"></a>
# **getLocationFootprintTags**
> getLocationFootprintTags(locationFootprintId)

Get the tags for a locationFootprint.

Get all existing locationFootprint tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationFootprintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationFootprintApi apiInstance = new LocationFootprintApi();
Integer locationFootprintId = 56; // Integer | Id of the locationFootprint to get tags for
try {
    apiInstance.getLocationFootprintTags(locationFootprintId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationFootprintApi#getLocationFootprintTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationFootprintId** | **Integer**| Id of the locationFootprint to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLocationFootprint"></a>
# **updateLocationFootprint**
> updateLocationFootprint(body)

Update a locationFootprint

Updates an existing locationFootprint using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationFootprintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationFootprintApi apiInstance = new LocationFootprintApi();
LocationFootprint body = new LocationFootprint(); // LocationFootprint | LocationFootprint to be updated.
try {
    apiInstance.updateLocationFootprint(body);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationFootprintApi#updateLocationFootprint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationFootprint**](LocationFootprint.md)| LocationFootprint to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLocationFootprintCustomFields"></a>
# **updateLocationFootprintCustomFields**
> updateLocationFootprintCustomFields(body)

Update a locationFootprint custom fields

Updates an existing locationFootprint custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LocationFootprintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LocationFootprintApi apiInstance = new LocationFootprintApi();
LocationFootprint body = new LocationFootprint(); // LocationFootprint | LocationFootprint to be updated.
try {
    apiInstance.updateLocationFootprintCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationFootprintApi#updateLocationFootprintCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationFootprint**](LocationFootprint.md)| LocationFootprint to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

