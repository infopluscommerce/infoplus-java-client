# CartonApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCarton**](CartonApi.md#addCarton) | **POST** /beta/carton | Create a carton
[**addCartonAudit**](CartonApi.md#addCartonAudit) | **PUT** /beta/carton/{cartonId}/audit/{cartonAudit} | Add new audit for a carton
[**addCartonFile**](CartonApi.md#addCartonFile) | **POST** /beta/carton/{cartonId}/file/{fileName} | Attach a file to a carton
[**addCartonFileByURL**](CartonApi.md#addCartonFileByURL) | **POST** /beta/carton/{cartonId}/file | Attach a file to a carton by URL.
[**addCartonTag**](CartonApi.md#addCartonTag) | **PUT** /beta/carton/{cartonId}/tag/{cartonTag} | Add new tags for a carton.
[**deleteCarton**](CartonApi.md#deleteCarton) | **DELETE** /beta/carton/{cartonId} | Delete a carton
[**deleteCartonFile**](CartonApi.md#deleteCartonFile) | **DELETE** /beta/carton/{cartonId}/file/{fileId} | Delete a file for a carton.
[**deleteCartonTag**](CartonApi.md#deleteCartonTag) | **DELETE** /beta/carton/{cartonId}/tag/{cartonTag} | Delete a tag for a carton.
[**getCartonByFilter**](CartonApi.md#getCartonByFilter) | **GET** /beta/carton/search | Search cartons by filter
[**getCartonById**](CartonApi.md#getCartonById) | **GET** /beta/carton/{cartonId} | Get a carton by id
[**getCartonFiles**](CartonApi.md#getCartonFiles) | **GET** /beta/carton/{cartonId}/file | Get the files for a carton.
[**getCartonTags**](CartonApi.md#getCartonTags) | **GET** /beta/carton/{cartonId}/tag | Get the tags for a carton.
[**getDuplicateCartonById**](CartonApi.md#getDuplicateCartonById) | **GET** /beta/carton/duplicate/{cartonId} | Get a duplicated a carton by id
[**updateCarton**](CartonApi.md#updateCarton) | **PUT** /beta/carton | Update a carton
[**updateCartonCustomFields**](CartonApi.md#updateCartonCustomFields) | **PUT** /beta/carton/customFields | Update a carton custom fields


<a name="addCarton"></a>
# **addCarton**
> Carton addCarton(body)

Create a carton

Inserts a new carton using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonApi apiInstance = new CartonApi();
Carton body = new Carton(); // Carton | Carton to be inserted.
try {
    Carton result = apiInstance.addCarton(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonApi#addCarton");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Carton**](Carton.md)| Carton to be inserted. |

### Return type

[**Carton**](Carton.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCartonAudit"></a>
# **addCartonAudit**
> addCartonAudit(cartonId, cartonAudit)

Add new audit for a carton

Adds an audit to an existing carton.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonApi apiInstance = new CartonApi();
Integer cartonId = 56; // Integer | Id of the carton to add an audit to
String cartonAudit = "cartonAudit_example"; // String | The audit to add
try {
    apiInstance.addCartonAudit(cartonId, cartonAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonApi#addCartonAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonId** | **Integer**| Id of the carton to add an audit to |
 **cartonAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCartonFile"></a>
# **addCartonFile**
> addCartonFile(cartonId, fileName)

Attach a file to a carton

Adds a file to an existing carton.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonApi apiInstance = new CartonApi();
Integer cartonId = 56; // Integer | Id of the carton to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addCartonFile(cartonId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonApi#addCartonFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonId** | **Integer**| Id of the carton to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addCartonFileByURL"></a>
# **addCartonFileByURL**
> addCartonFileByURL(body, cartonId)

Attach a file to a carton by URL.

Adds a file to an existing carton by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonApi apiInstance = new CartonApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer cartonId = 56; // Integer | Id of the carton to add an file to
try {
    apiInstance.addCartonFileByURL(body, cartonId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonApi#addCartonFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **cartonId** | **Integer**| Id of the carton to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCartonTag"></a>
# **addCartonTag**
> addCartonTag(cartonId, cartonTag)

Add new tags for a carton.

Adds a tag to an existing carton.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonApi apiInstance = new CartonApi();
Integer cartonId = 56; // Integer | Id of the carton to add a tag to
String cartonTag = "cartonTag_example"; // String | The tag to add
try {
    apiInstance.addCartonTag(cartonId, cartonTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonApi#addCartonTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonId** | **Integer**| Id of the carton to add a tag to |
 **cartonTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCarton"></a>
# **deleteCarton**
> deleteCarton(cartonId)

Delete a carton

Deletes the carton identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonApi apiInstance = new CartonApi();
Integer cartonId = 56; // Integer | Id of the carton to be deleted.
try {
    apiInstance.deleteCarton(cartonId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonApi#deleteCarton");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonId** | **Integer**| Id of the carton to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCartonFile"></a>
# **deleteCartonFile**
> deleteCartonFile(cartonId, fileId)

Delete a file for a carton.

Deletes an existing carton file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonApi apiInstance = new CartonApi();
Integer cartonId = 56; // Integer | Id of the carton to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteCartonFile(cartonId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonApi#deleteCartonFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonId** | **Integer**| Id of the carton to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCartonTag"></a>
# **deleteCartonTag**
> deleteCartonTag(cartonId, cartonTag)

Delete a tag for a carton.

Deletes an existing carton tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonApi apiInstance = new CartonApi();
Integer cartonId = 56; // Integer | Id of the carton to remove tag from
String cartonTag = "cartonTag_example"; // String | The tag to delete
try {
    apiInstance.deleteCartonTag(cartonId, cartonTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonApi#deleteCartonTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonId** | **Integer**| Id of the carton to remove tag from |
 **cartonTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartonByFilter"></a>
# **getCartonByFilter**
> List&lt;Carton&gt; getCartonByFilter(filter, page, limit, sort)

Search cartons by filter

Returns the list of cartons that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonApi apiInstance = new CartonApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Carton> result = apiInstance.getCartonByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonApi#getCartonByFilter");
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

[**List&lt;Carton&gt;**](Carton.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartonById"></a>
# **getCartonById**
> Carton getCartonById(cartonId)

Get a carton by id

Returns the carton identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonApi apiInstance = new CartonApi();
Integer cartonId = 56; // Integer | Id of the carton to be returned.
try {
    Carton result = apiInstance.getCartonById(cartonId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonApi#getCartonById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonId** | **Integer**| Id of the carton to be returned. |

### Return type

[**Carton**](Carton.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartonFiles"></a>
# **getCartonFiles**
> getCartonFiles(cartonId)

Get the files for a carton.

Get all existing carton files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonApi apiInstance = new CartonApi();
Integer cartonId = 56; // Integer | Id of the carton to get files for
try {
    apiInstance.getCartonFiles(cartonId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonApi#getCartonFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonId** | **Integer**| Id of the carton to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartonTags"></a>
# **getCartonTags**
> getCartonTags(cartonId)

Get the tags for a carton.

Get all existing carton tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonApi apiInstance = new CartonApi();
Integer cartonId = 56; // Integer | Id of the carton to get tags for
try {
    apiInstance.getCartonTags(cartonId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonApi#getCartonTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonId** | **Integer**| Id of the carton to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateCartonById"></a>
# **getDuplicateCartonById**
> Carton getDuplicateCartonById(cartonId)

Get a duplicated a carton by id

Returns a duplicated carton identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonApi apiInstance = new CartonApi();
Integer cartonId = 56; // Integer | Id of the carton to be duplicated.
try {
    Carton result = apiInstance.getDuplicateCartonById(cartonId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonApi#getDuplicateCartonById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonId** | **Integer**| Id of the carton to be duplicated. |

### Return type

[**Carton**](Carton.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCarton"></a>
# **updateCarton**
> updateCarton(body)

Update a carton

Updates an existing carton using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonApi apiInstance = new CartonApi();
Carton body = new Carton(); // Carton | Carton to be updated.
try {
    apiInstance.updateCarton(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonApi#updateCarton");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Carton**](Carton.md)| Carton to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCartonCustomFields"></a>
# **updateCartonCustomFields**
> updateCartonCustomFields(body)

Update a carton custom fields

Updates an existing carton custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonApi apiInstance = new CartonApi();
Carton body = new Carton(); // Carton | Carton to be updated.
try {
    apiInstance.updateCartonCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonApi#updateCartonCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Carton**](Carton.md)| Carton to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

