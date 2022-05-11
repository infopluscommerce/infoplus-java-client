# CartonTypeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCartonType**](CartonTypeApi.md#addCartonType) | **POST** /v3.0/cartonType | Create a cartonType
[**addCartonTypeAudit**](CartonTypeApi.md#addCartonTypeAudit) | **PUT** /v3.0/cartonType/{cartonTypeId}/audit/{cartonTypeAudit} | Add new audit for a cartonType
[**addCartonTypeFile**](CartonTypeApi.md#addCartonTypeFile) | **POST** /v3.0/cartonType/{cartonTypeId}/file/{fileName} | Attach a file to a cartonType
[**addCartonTypeFileByURL**](CartonTypeApi.md#addCartonTypeFileByURL) | **POST** /v3.0/cartonType/{cartonTypeId}/file | Attach a file to a cartonType by URL.
[**addCartonTypeTag**](CartonTypeApi.md#addCartonTypeTag) | **PUT** /v3.0/cartonType/{cartonTypeId}/tag/{cartonTypeTag} | Add new tags for a cartonType.
[**deleteCartonType**](CartonTypeApi.md#deleteCartonType) | **DELETE** /v3.0/cartonType/{cartonTypeId} | Delete a cartonType
[**deleteCartonTypeFile**](CartonTypeApi.md#deleteCartonTypeFile) | **DELETE** /v3.0/cartonType/{cartonTypeId}/file/{fileId} | Delete a file for a cartonType.
[**deleteCartonTypeTag**](CartonTypeApi.md#deleteCartonTypeTag) | **DELETE** /v3.0/cartonType/{cartonTypeId}/tag/{cartonTypeTag} | Delete a tag for a cartonType.
[**getCartonTypeByFilter**](CartonTypeApi.md#getCartonTypeByFilter) | **GET** /v3.0/cartonType/search | Search cartonTypes by filter
[**getCartonTypeById**](CartonTypeApi.md#getCartonTypeById) | **GET** /v3.0/cartonType/{cartonTypeId} | Get a cartonType by id
[**getCartonTypeFiles**](CartonTypeApi.md#getCartonTypeFiles) | **GET** /v3.0/cartonType/{cartonTypeId}/file | Get the files for a cartonType.
[**getCartonTypeTags**](CartonTypeApi.md#getCartonTypeTags) | **GET** /v3.0/cartonType/{cartonTypeId}/tag | Get the tags for a cartonType.
[**getDuplicateCartonTypeById**](CartonTypeApi.md#getDuplicateCartonTypeById) | **GET** /v3.0/cartonType/duplicate/{cartonTypeId} | Get a duplicated a cartonType by id
[**updateCartonType**](CartonTypeApi.md#updateCartonType) | **PUT** /v3.0/cartonType | Update a cartonType
[**updateCartonTypeCustomFields**](CartonTypeApi.md#updateCartonTypeCustomFields) | **PUT** /v3.0/cartonType/customFields | Update a cartonType custom fields


<a name="addCartonType"></a>
# **addCartonType**
> CartonType addCartonType(body)

Create a cartonType

Inserts a new cartonType using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonTypeApi apiInstance = new CartonTypeApi();
CartonType body = new CartonType(); // CartonType | CartonType to be inserted.
try {
    CartonType result = apiInstance.addCartonType(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonTypeApi#addCartonType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CartonType**](CartonType.md)| CartonType to be inserted. |

### Return type

[**CartonType**](CartonType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCartonTypeAudit"></a>
# **addCartonTypeAudit**
> addCartonTypeAudit(cartonTypeId, cartonTypeAudit)

Add new audit for a cartonType

Adds an audit to an existing cartonType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonTypeApi apiInstance = new CartonTypeApi();
Integer cartonTypeId = 56; // Integer | Id of the cartonType to add an audit to
String cartonTypeAudit = "cartonTypeAudit_example"; // String | The audit to add
try {
    apiInstance.addCartonTypeAudit(cartonTypeId, cartonTypeAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonTypeApi#addCartonTypeAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonTypeId** | **Integer**| Id of the cartonType to add an audit to |
 **cartonTypeAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCartonTypeFile"></a>
# **addCartonTypeFile**
> addCartonTypeFile(cartonTypeId, fileName)

Attach a file to a cartonType

Adds a file to an existing cartonType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonTypeApi apiInstance = new CartonTypeApi();
Integer cartonTypeId = 56; // Integer | Id of the cartonType to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addCartonTypeFile(cartonTypeId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonTypeApi#addCartonTypeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonTypeId** | **Integer**| Id of the cartonType to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addCartonTypeFileByURL"></a>
# **addCartonTypeFileByURL**
> addCartonTypeFileByURL(body, cartonTypeId)

Attach a file to a cartonType by URL.

Adds a file to an existing cartonType by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonTypeApi apiInstance = new CartonTypeApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer cartonTypeId = 56; // Integer | Id of the cartonType to add an file to
try {
    apiInstance.addCartonTypeFileByURL(body, cartonTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonTypeApi#addCartonTypeFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **cartonTypeId** | **Integer**| Id of the cartonType to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCartonTypeTag"></a>
# **addCartonTypeTag**
> addCartonTypeTag(cartonTypeId, cartonTypeTag)

Add new tags for a cartonType.

Adds a tag to an existing cartonType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonTypeApi apiInstance = new CartonTypeApi();
Integer cartonTypeId = 56; // Integer | Id of the cartonType to add a tag to
String cartonTypeTag = "cartonTypeTag_example"; // String | The tag to add
try {
    apiInstance.addCartonTypeTag(cartonTypeId, cartonTypeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonTypeApi#addCartonTypeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonTypeId** | **Integer**| Id of the cartonType to add a tag to |
 **cartonTypeTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCartonType"></a>
# **deleteCartonType**
> deleteCartonType(cartonTypeId)

Delete a cartonType

Deletes the cartonType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonTypeApi apiInstance = new CartonTypeApi();
Integer cartonTypeId = 56; // Integer | Id of the cartonType to be deleted.
try {
    apiInstance.deleteCartonType(cartonTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonTypeApi#deleteCartonType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonTypeId** | **Integer**| Id of the cartonType to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCartonTypeFile"></a>
# **deleteCartonTypeFile**
> deleteCartonTypeFile(cartonTypeId, fileId)

Delete a file for a cartonType.

Deletes an existing cartonType file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonTypeApi apiInstance = new CartonTypeApi();
Integer cartonTypeId = 56; // Integer | Id of the cartonType to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteCartonTypeFile(cartonTypeId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonTypeApi#deleteCartonTypeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonTypeId** | **Integer**| Id of the cartonType to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCartonTypeTag"></a>
# **deleteCartonTypeTag**
> deleteCartonTypeTag(cartonTypeId, cartonTypeTag)

Delete a tag for a cartonType.

Deletes an existing cartonType tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonTypeApi apiInstance = new CartonTypeApi();
Integer cartonTypeId = 56; // Integer | Id of the cartonType to remove tag from
String cartonTypeTag = "cartonTypeTag_example"; // String | The tag to delete
try {
    apiInstance.deleteCartonTypeTag(cartonTypeId, cartonTypeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonTypeApi#deleteCartonTypeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonTypeId** | **Integer**| Id of the cartonType to remove tag from |
 **cartonTypeTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartonTypeByFilter"></a>
# **getCartonTypeByFilter**
> List&lt;CartonType&gt; getCartonTypeByFilter(filter, page, limit, sort)

Search cartonTypes by filter

Returns the list of cartonTypes that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonTypeApi apiInstance = new CartonTypeApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<CartonType> result = apiInstance.getCartonTypeByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonTypeApi#getCartonTypeByFilter");
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

[**List&lt;CartonType&gt;**](CartonType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartonTypeById"></a>
# **getCartonTypeById**
> CartonType getCartonTypeById(cartonTypeId)

Get a cartonType by id

Returns the cartonType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonTypeApi apiInstance = new CartonTypeApi();
Integer cartonTypeId = 56; // Integer | Id of the cartonType to be returned.
try {
    CartonType result = apiInstance.getCartonTypeById(cartonTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonTypeApi#getCartonTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonTypeId** | **Integer**| Id of the cartonType to be returned. |

### Return type

[**CartonType**](CartonType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartonTypeFiles"></a>
# **getCartonTypeFiles**
> getCartonTypeFiles(cartonTypeId)

Get the files for a cartonType.

Get all existing cartonType files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonTypeApi apiInstance = new CartonTypeApi();
Integer cartonTypeId = 56; // Integer | Id of the cartonType to get files for
try {
    apiInstance.getCartonTypeFiles(cartonTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonTypeApi#getCartonTypeFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonTypeId** | **Integer**| Id of the cartonType to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartonTypeTags"></a>
# **getCartonTypeTags**
> getCartonTypeTags(cartonTypeId)

Get the tags for a cartonType.

Get all existing cartonType tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonTypeApi apiInstance = new CartonTypeApi();
Integer cartonTypeId = 56; // Integer | Id of the cartonType to get tags for
try {
    apiInstance.getCartonTypeTags(cartonTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonTypeApi#getCartonTypeTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonTypeId** | **Integer**| Id of the cartonType to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateCartonTypeById"></a>
# **getDuplicateCartonTypeById**
> CartonType getDuplicateCartonTypeById(cartonTypeId)

Get a duplicated a cartonType by id

Returns a duplicated cartonType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonTypeApi apiInstance = new CartonTypeApi();
Integer cartonTypeId = 56; // Integer | Id of the cartonType to be duplicated.
try {
    CartonType result = apiInstance.getDuplicateCartonTypeById(cartonTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonTypeApi#getDuplicateCartonTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartonTypeId** | **Integer**| Id of the cartonType to be duplicated. |

### Return type

[**CartonType**](CartonType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCartonType"></a>
# **updateCartonType**
> updateCartonType(body)

Update a cartonType

Updates an existing cartonType using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonTypeApi apiInstance = new CartonTypeApi();
CartonType body = new CartonType(); // CartonType | CartonType to be updated.
try {
    apiInstance.updateCartonType(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonTypeApi#updateCartonType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CartonType**](CartonType.md)| CartonType to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCartonTypeCustomFields"></a>
# **updateCartonTypeCustomFields**
> updateCartonTypeCustomFields(body)

Update a cartonType custom fields

Updates an existing cartonType custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartonTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartonTypeApi apiInstance = new CartonTypeApi();
CartonType body = new CartonType(); // CartonType | CartonType to be updated.
try {
    apiInstance.updateCartonTypeCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CartonTypeApi#updateCartonTypeCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CartonType**](CartonType.md)| CartonType to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

