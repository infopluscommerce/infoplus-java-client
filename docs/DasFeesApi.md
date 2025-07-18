# DasFeesApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDasFees**](DasFeesApi.md#addDasFees) | **POST** /beta/dasFees | Create a dasFees
[**addDasFeesAudit**](DasFeesApi.md#addDasFeesAudit) | **PUT** /beta/dasFees/{dasFeesId}/audit/{dasFeesAudit} | Add new audit for a dasFees
[**addDasFeesFile**](DasFeesApi.md#addDasFeesFile) | **POST** /beta/dasFees/{dasFeesId}/file/{fileName} | Attach a file to a dasFees
[**addDasFeesFileByURL**](DasFeesApi.md#addDasFeesFileByURL) | **POST** /beta/dasFees/{dasFeesId}/file | Attach a file to a dasFees by URL.
[**addDasFeesTag**](DasFeesApi.md#addDasFeesTag) | **PUT** /beta/dasFees/{dasFeesId}/tag/{dasFeesTag} | Add new tags for a dasFees.
[**deleteDasFees**](DasFeesApi.md#deleteDasFees) | **DELETE** /beta/dasFees/{dasFeesId} | Delete a dasFees
[**deleteDasFeesFile**](DasFeesApi.md#deleteDasFeesFile) | **DELETE** /beta/dasFees/{dasFeesId}/file/{fileId} | Delete a file for a dasFees.
[**deleteDasFeesTag**](DasFeesApi.md#deleteDasFeesTag) | **DELETE** /beta/dasFees/{dasFeesId}/tag/{dasFeesTag} | Delete a tag for a dasFees.
[**getDasFeesByFilter**](DasFeesApi.md#getDasFeesByFilter) | **GET** /beta/dasFees/search | Search dasFeeses by filter
[**getDasFeesById**](DasFeesApi.md#getDasFeesById) | **GET** /beta/dasFees/{dasFeesId} | Get a dasFees by id
[**getDasFeesFiles**](DasFeesApi.md#getDasFeesFiles) | **GET** /beta/dasFees/{dasFeesId}/file | Get the files for a dasFees.
[**getDasFeesTags**](DasFeesApi.md#getDasFeesTags) | **GET** /beta/dasFees/{dasFeesId}/tag | Get the tags for a dasFees.
[**getDuplicateDasFeesById**](DasFeesApi.md#getDuplicateDasFeesById) | **GET** /beta/dasFees/duplicate/{dasFeesId} | Get a duplicated a dasFees by id
[**updateDasFees**](DasFeesApi.md#updateDasFees) | **PUT** /beta/dasFees | Update a dasFees


<a name="addDasFees"></a>
# **addDasFees**
> DasFees addDasFees(body)

Create a dasFees

Inserts a new dasFees using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DasFeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DasFeesApi apiInstance = new DasFeesApi();
DasFees body = new DasFees(); // DasFees | DasFees to be inserted.
try {
    DasFees result = apiInstance.addDasFees(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DasFeesApi#addDasFees");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DasFees**](DasFees.md)| DasFees to be inserted. |

### Return type

[**DasFees**](DasFees.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addDasFeesAudit"></a>
# **addDasFeesAudit**
> addDasFeesAudit(dasFeesId, dasFeesAudit)

Add new audit for a dasFees

Adds an audit to an existing dasFees.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DasFeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DasFeesApi apiInstance = new DasFeesApi();
Integer dasFeesId = 56; // Integer | Id of the dasFees to add an audit to
String dasFeesAudit = "dasFeesAudit_example"; // String | The audit to add
try {
    apiInstance.addDasFeesAudit(dasFeesId, dasFeesAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling DasFeesApi#addDasFeesAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dasFeesId** | **Integer**| Id of the dasFees to add an audit to |
 **dasFeesAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addDasFeesFile"></a>
# **addDasFeesFile**
> addDasFeesFile(dasFeesId, fileName)

Attach a file to a dasFees

Adds a file to an existing dasFees.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DasFeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DasFeesApi apiInstance = new DasFeesApi();
Integer dasFeesId = 56; // Integer | Id of the dasFees to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addDasFeesFile(dasFeesId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling DasFeesApi#addDasFeesFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dasFeesId** | **Integer**| Id of the dasFees to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addDasFeesFileByURL"></a>
# **addDasFeesFileByURL**
> addDasFeesFileByURL(body, dasFeesId)

Attach a file to a dasFees by URL.

Adds a file to an existing dasFees by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DasFeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DasFeesApi apiInstance = new DasFeesApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer dasFeesId = 56; // Integer | Id of the dasFees to add an file to
try {
    apiInstance.addDasFeesFileByURL(body, dasFeesId);
} catch (ApiException e) {
    System.err.println("Exception when calling DasFeesApi#addDasFeesFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **dasFeesId** | **Integer**| Id of the dasFees to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addDasFeesTag"></a>
# **addDasFeesTag**
> addDasFeesTag(dasFeesId, dasFeesTag)

Add new tags for a dasFees.

Adds a tag to an existing dasFees.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DasFeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DasFeesApi apiInstance = new DasFeesApi();
Integer dasFeesId = 56; // Integer | Id of the dasFees to add a tag to
String dasFeesTag = "dasFeesTag_example"; // String | The tag to add
try {
    apiInstance.addDasFeesTag(dasFeesId, dasFeesTag);
} catch (ApiException e) {
    System.err.println("Exception when calling DasFeesApi#addDasFeesTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dasFeesId** | **Integer**| Id of the dasFees to add a tag to |
 **dasFeesTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDasFees"></a>
# **deleteDasFees**
> deleteDasFees(dasFeesId)

Delete a dasFees

Deletes the dasFees identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DasFeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DasFeesApi apiInstance = new DasFeesApi();
Integer dasFeesId = 56; // Integer | Id of the dasFees to be deleted.
try {
    apiInstance.deleteDasFees(dasFeesId);
} catch (ApiException e) {
    System.err.println("Exception when calling DasFeesApi#deleteDasFees");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dasFeesId** | **Integer**| Id of the dasFees to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDasFeesFile"></a>
# **deleteDasFeesFile**
> deleteDasFeesFile(dasFeesId, fileId)

Delete a file for a dasFees.

Deletes an existing dasFees file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DasFeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DasFeesApi apiInstance = new DasFeesApi();
Integer dasFeesId = 56; // Integer | Id of the dasFees to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteDasFeesFile(dasFeesId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling DasFeesApi#deleteDasFeesFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dasFeesId** | **Integer**| Id of the dasFees to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDasFeesTag"></a>
# **deleteDasFeesTag**
> deleteDasFeesTag(dasFeesId, dasFeesTag)

Delete a tag for a dasFees.

Deletes an existing dasFees tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DasFeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DasFeesApi apiInstance = new DasFeesApi();
Integer dasFeesId = 56; // Integer | Id of the dasFees to remove tag from
String dasFeesTag = "dasFeesTag_example"; // String | The tag to delete
try {
    apiInstance.deleteDasFeesTag(dasFeesId, dasFeesTag);
} catch (ApiException e) {
    System.err.println("Exception when calling DasFeesApi#deleteDasFeesTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dasFeesId** | **Integer**| Id of the dasFees to remove tag from |
 **dasFeesTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDasFeesByFilter"></a>
# **getDasFeesByFilter**
> List&lt;DasFees&gt; getDasFeesByFilter(filter, page, limit, sort)

Search dasFeeses by filter

Returns the list of dasFeeses that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DasFeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DasFeesApi apiInstance = new DasFeesApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<DasFees> result = apiInstance.getDasFeesByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DasFeesApi#getDasFeesByFilter");
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

[**List&lt;DasFees&gt;**](DasFees.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDasFeesById"></a>
# **getDasFeesById**
> DasFees getDasFeesById(dasFeesId)

Get a dasFees by id

Returns the dasFees identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DasFeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DasFeesApi apiInstance = new DasFeesApi();
Integer dasFeesId = 56; // Integer | Id of the dasFees to be returned.
try {
    DasFees result = apiInstance.getDasFeesById(dasFeesId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DasFeesApi#getDasFeesById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dasFeesId** | **Integer**| Id of the dasFees to be returned. |

### Return type

[**DasFees**](DasFees.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDasFeesFiles"></a>
# **getDasFeesFiles**
> getDasFeesFiles(dasFeesId)

Get the files for a dasFees.

Get all existing dasFees files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DasFeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DasFeesApi apiInstance = new DasFeesApi();
Integer dasFeesId = 56; // Integer | Id of the dasFees to get files for
try {
    apiInstance.getDasFeesFiles(dasFeesId);
} catch (ApiException e) {
    System.err.println("Exception when calling DasFeesApi#getDasFeesFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dasFeesId** | **Integer**| Id of the dasFees to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDasFeesTags"></a>
# **getDasFeesTags**
> getDasFeesTags(dasFeesId)

Get the tags for a dasFees.

Get all existing dasFees tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DasFeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DasFeesApi apiInstance = new DasFeesApi();
Integer dasFeesId = 56; // Integer | Id of the dasFees to get tags for
try {
    apiInstance.getDasFeesTags(dasFeesId);
} catch (ApiException e) {
    System.err.println("Exception when calling DasFeesApi#getDasFeesTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dasFeesId** | **Integer**| Id of the dasFees to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateDasFeesById"></a>
# **getDuplicateDasFeesById**
> DasFees getDuplicateDasFeesById(dasFeesId)

Get a duplicated a dasFees by id

Returns a duplicated dasFees identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DasFeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DasFeesApi apiInstance = new DasFeesApi();
Integer dasFeesId = 56; // Integer | Id of the dasFees to be duplicated.
try {
    DasFees result = apiInstance.getDuplicateDasFeesById(dasFeesId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DasFeesApi#getDuplicateDasFeesById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dasFeesId** | **Integer**| Id of the dasFees to be duplicated. |

### Return type

[**DasFees**](DasFees.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDasFees"></a>
# **updateDasFees**
> updateDasFees(body)

Update a dasFees

Updates an existing dasFees using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DasFeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DasFeesApi apiInstance = new DasFeesApi();
DasFees body = new DasFees(); // DasFees | DasFees to be updated.
try {
    apiInstance.updateDasFees(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DasFeesApi#updateDasFees");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DasFees**](DasFees.md)| DasFees to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

