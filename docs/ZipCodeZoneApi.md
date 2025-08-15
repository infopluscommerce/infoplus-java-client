# ZipCodeZoneApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addZipCodeZone**](ZipCodeZoneApi.md#addZipCodeZone) | **POST** /beta/zipCodeZone | Create a zipCodeZone
[**addZipCodeZoneAudit**](ZipCodeZoneApi.md#addZipCodeZoneAudit) | **PUT** /beta/zipCodeZone/{zipCodeZoneId}/audit/{zipCodeZoneAudit} | Add new audit for a zipCodeZone
[**addZipCodeZoneFile**](ZipCodeZoneApi.md#addZipCodeZoneFile) | **POST** /beta/zipCodeZone/{zipCodeZoneId}/file/{fileName} | Attach a file to a zipCodeZone
[**addZipCodeZoneFileByURL**](ZipCodeZoneApi.md#addZipCodeZoneFileByURL) | **POST** /beta/zipCodeZone/{zipCodeZoneId}/file | Attach a file to a zipCodeZone by URL.
[**addZipCodeZoneTag**](ZipCodeZoneApi.md#addZipCodeZoneTag) | **PUT** /beta/zipCodeZone/{zipCodeZoneId}/tag/{zipCodeZoneTag} | Add new tags for a zipCodeZone.
[**deleteZipCodeZone**](ZipCodeZoneApi.md#deleteZipCodeZone) | **DELETE** /beta/zipCodeZone/{zipCodeZoneId} | Delete a zipCodeZone
[**deleteZipCodeZoneFile**](ZipCodeZoneApi.md#deleteZipCodeZoneFile) | **DELETE** /beta/zipCodeZone/{zipCodeZoneId}/file/{fileId} | Delete a file for a zipCodeZone.
[**deleteZipCodeZoneTag**](ZipCodeZoneApi.md#deleteZipCodeZoneTag) | **DELETE** /beta/zipCodeZone/{zipCodeZoneId}/tag/{zipCodeZoneTag} | Delete a tag for a zipCodeZone.
[**getDuplicateZipCodeZoneById**](ZipCodeZoneApi.md#getDuplicateZipCodeZoneById) | **GET** /beta/zipCodeZone/duplicate/{zipCodeZoneId} | Get a duplicated a zipCodeZone by id
[**getZipCodeZoneByFilter**](ZipCodeZoneApi.md#getZipCodeZoneByFilter) | **GET** /beta/zipCodeZone/search | Search zipCodeZones by filter
[**getZipCodeZoneById**](ZipCodeZoneApi.md#getZipCodeZoneById) | **GET** /beta/zipCodeZone/{zipCodeZoneId} | Get a zipCodeZone by id
[**getZipCodeZoneFiles**](ZipCodeZoneApi.md#getZipCodeZoneFiles) | **GET** /beta/zipCodeZone/{zipCodeZoneId}/file | Get the files for a zipCodeZone.
[**getZipCodeZoneTags**](ZipCodeZoneApi.md#getZipCodeZoneTags) | **GET** /beta/zipCodeZone/{zipCodeZoneId}/tag | Get the tags for a zipCodeZone.
[**updateZipCodeZone**](ZipCodeZoneApi.md#updateZipCodeZone) | **PUT** /beta/zipCodeZone | Update a zipCodeZone


<a name="addZipCodeZone"></a>
# **addZipCodeZone**
> ZipCodeZone addZipCodeZone(body)

Create a zipCodeZone

Inserts a new zipCodeZone using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZipCodeZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZipCodeZoneApi apiInstance = new ZipCodeZoneApi();
ZipCodeZone body = new ZipCodeZone(); // ZipCodeZone | ZipCodeZone to be inserted.
try {
    ZipCodeZone result = apiInstance.addZipCodeZone(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipCodeZoneApi#addZipCodeZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ZipCodeZone**](ZipCodeZone.md)| ZipCodeZone to be inserted. |

### Return type

[**ZipCodeZone**](ZipCodeZone.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addZipCodeZoneAudit"></a>
# **addZipCodeZoneAudit**
> addZipCodeZoneAudit(zipCodeZoneId, zipCodeZoneAudit)

Add new audit for a zipCodeZone

Adds an audit to an existing zipCodeZone.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZipCodeZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZipCodeZoneApi apiInstance = new ZipCodeZoneApi();
Integer zipCodeZoneId = 56; // Integer | Id of the zipCodeZone to add an audit to
String zipCodeZoneAudit = "zipCodeZoneAudit_example"; // String | The audit to add
try {
    apiInstance.addZipCodeZoneAudit(zipCodeZoneId, zipCodeZoneAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipCodeZoneApi#addZipCodeZoneAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zipCodeZoneId** | **Integer**| Id of the zipCodeZone to add an audit to |
 **zipCodeZoneAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addZipCodeZoneFile"></a>
# **addZipCodeZoneFile**
> addZipCodeZoneFile(zipCodeZoneId, fileName)

Attach a file to a zipCodeZone

Adds a file to an existing zipCodeZone.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZipCodeZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZipCodeZoneApi apiInstance = new ZipCodeZoneApi();
Integer zipCodeZoneId = 56; // Integer | Id of the zipCodeZone to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addZipCodeZoneFile(zipCodeZoneId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipCodeZoneApi#addZipCodeZoneFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zipCodeZoneId** | **Integer**| Id of the zipCodeZone to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addZipCodeZoneFileByURL"></a>
# **addZipCodeZoneFileByURL**
> addZipCodeZoneFileByURL(body, zipCodeZoneId)

Attach a file to a zipCodeZone by URL.

Adds a file to an existing zipCodeZone by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZipCodeZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZipCodeZoneApi apiInstance = new ZipCodeZoneApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer zipCodeZoneId = 56; // Integer | Id of the zipCodeZone to add an file to
try {
    apiInstance.addZipCodeZoneFileByURL(body, zipCodeZoneId);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipCodeZoneApi#addZipCodeZoneFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **zipCodeZoneId** | **Integer**| Id of the zipCodeZone to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addZipCodeZoneTag"></a>
# **addZipCodeZoneTag**
> addZipCodeZoneTag(zipCodeZoneId, zipCodeZoneTag)

Add new tags for a zipCodeZone.

Adds a tag to an existing zipCodeZone.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZipCodeZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZipCodeZoneApi apiInstance = new ZipCodeZoneApi();
Integer zipCodeZoneId = 56; // Integer | Id of the zipCodeZone to add a tag to
String zipCodeZoneTag = "zipCodeZoneTag_example"; // String | The tag to add
try {
    apiInstance.addZipCodeZoneTag(zipCodeZoneId, zipCodeZoneTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipCodeZoneApi#addZipCodeZoneTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zipCodeZoneId** | **Integer**| Id of the zipCodeZone to add a tag to |
 **zipCodeZoneTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteZipCodeZone"></a>
# **deleteZipCodeZone**
> deleteZipCodeZone(zipCodeZoneId)

Delete a zipCodeZone

Deletes the zipCodeZone identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZipCodeZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZipCodeZoneApi apiInstance = new ZipCodeZoneApi();
Integer zipCodeZoneId = 56; // Integer | Id of the zipCodeZone to be deleted.
try {
    apiInstance.deleteZipCodeZone(zipCodeZoneId);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipCodeZoneApi#deleteZipCodeZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zipCodeZoneId** | **Integer**| Id of the zipCodeZone to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteZipCodeZoneFile"></a>
# **deleteZipCodeZoneFile**
> deleteZipCodeZoneFile(zipCodeZoneId, fileId)

Delete a file for a zipCodeZone.

Deletes an existing zipCodeZone file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZipCodeZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZipCodeZoneApi apiInstance = new ZipCodeZoneApi();
Integer zipCodeZoneId = 56; // Integer | Id of the zipCodeZone to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteZipCodeZoneFile(zipCodeZoneId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipCodeZoneApi#deleteZipCodeZoneFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zipCodeZoneId** | **Integer**| Id of the zipCodeZone to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteZipCodeZoneTag"></a>
# **deleteZipCodeZoneTag**
> deleteZipCodeZoneTag(zipCodeZoneId, zipCodeZoneTag)

Delete a tag for a zipCodeZone.

Deletes an existing zipCodeZone tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZipCodeZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZipCodeZoneApi apiInstance = new ZipCodeZoneApi();
Integer zipCodeZoneId = 56; // Integer | Id of the zipCodeZone to remove tag from
String zipCodeZoneTag = "zipCodeZoneTag_example"; // String | The tag to delete
try {
    apiInstance.deleteZipCodeZoneTag(zipCodeZoneId, zipCodeZoneTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipCodeZoneApi#deleteZipCodeZoneTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zipCodeZoneId** | **Integer**| Id of the zipCodeZone to remove tag from |
 **zipCodeZoneTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateZipCodeZoneById"></a>
# **getDuplicateZipCodeZoneById**
> ZipCodeZone getDuplicateZipCodeZoneById(zipCodeZoneId)

Get a duplicated a zipCodeZone by id

Returns a duplicated zipCodeZone identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZipCodeZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZipCodeZoneApi apiInstance = new ZipCodeZoneApi();
Integer zipCodeZoneId = 56; // Integer | Id of the zipCodeZone to be duplicated.
try {
    ZipCodeZone result = apiInstance.getDuplicateZipCodeZoneById(zipCodeZoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipCodeZoneApi#getDuplicateZipCodeZoneById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zipCodeZoneId** | **Integer**| Id of the zipCodeZone to be duplicated. |

### Return type

[**ZipCodeZone**](ZipCodeZone.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getZipCodeZoneByFilter"></a>
# **getZipCodeZoneByFilter**
> List&lt;ZipCodeZone&gt; getZipCodeZoneByFilter(filter, page, limit, sort)

Search zipCodeZones by filter

Returns the list of zipCodeZones that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZipCodeZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZipCodeZoneApi apiInstance = new ZipCodeZoneApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ZipCodeZone> result = apiInstance.getZipCodeZoneByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipCodeZoneApi#getZipCodeZoneByFilter");
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

[**List&lt;ZipCodeZone&gt;**](ZipCodeZone.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getZipCodeZoneById"></a>
# **getZipCodeZoneById**
> ZipCodeZone getZipCodeZoneById(zipCodeZoneId)

Get a zipCodeZone by id

Returns the zipCodeZone identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZipCodeZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZipCodeZoneApi apiInstance = new ZipCodeZoneApi();
Integer zipCodeZoneId = 56; // Integer | Id of the zipCodeZone to be returned.
try {
    ZipCodeZone result = apiInstance.getZipCodeZoneById(zipCodeZoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipCodeZoneApi#getZipCodeZoneById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zipCodeZoneId** | **Integer**| Id of the zipCodeZone to be returned. |

### Return type

[**ZipCodeZone**](ZipCodeZone.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getZipCodeZoneFiles"></a>
# **getZipCodeZoneFiles**
> getZipCodeZoneFiles(zipCodeZoneId)

Get the files for a zipCodeZone.

Get all existing zipCodeZone files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZipCodeZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZipCodeZoneApi apiInstance = new ZipCodeZoneApi();
Integer zipCodeZoneId = 56; // Integer | Id of the zipCodeZone to get files for
try {
    apiInstance.getZipCodeZoneFiles(zipCodeZoneId);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipCodeZoneApi#getZipCodeZoneFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zipCodeZoneId** | **Integer**| Id of the zipCodeZone to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getZipCodeZoneTags"></a>
# **getZipCodeZoneTags**
> getZipCodeZoneTags(zipCodeZoneId)

Get the tags for a zipCodeZone.

Get all existing zipCodeZone tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZipCodeZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZipCodeZoneApi apiInstance = new ZipCodeZoneApi();
Integer zipCodeZoneId = 56; // Integer | Id of the zipCodeZone to get tags for
try {
    apiInstance.getZipCodeZoneTags(zipCodeZoneId);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipCodeZoneApi#getZipCodeZoneTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zipCodeZoneId** | **Integer**| Id of the zipCodeZone to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateZipCodeZone"></a>
# **updateZipCodeZone**
> updateZipCodeZone(body)

Update a zipCodeZone

Updates an existing zipCodeZone using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZipCodeZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZipCodeZoneApi apiInstance = new ZipCodeZoneApi();
ZipCodeZone body = new ZipCodeZone(); // ZipCodeZone | ZipCodeZone to be updated.
try {
    apiInstance.updateZipCodeZone(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipCodeZoneApi#updateZipCodeZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ZipCodeZone**](ZipCodeZone.md)| ZipCodeZone to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

