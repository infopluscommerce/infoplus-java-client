# PalletTypeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPalletType**](PalletTypeApi.md#addPalletType) | **POST** /v3.0/palletType | Create a palletType
[**addPalletTypeAudit**](PalletTypeApi.md#addPalletTypeAudit) | **PUT** /v3.0/palletType/{palletTypeId}/audit/{palletTypeAudit} | Add new audit for a palletType
[**addPalletTypeFile**](PalletTypeApi.md#addPalletTypeFile) | **POST** /v3.0/palletType/{palletTypeId}/file/{fileName} | Attach a file to a palletType
[**addPalletTypeFileByURL**](PalletTypeApi.md#addPalletTypeFileByURL) | **POST** /v3.0/palletType/{palletTypeId}/file | Attach a file to a palletType by URL.
[**addPalletTypeTag**](PalletTypeApi.md#addPalletTypeTag) | **PUT** /v3.0/palletType/{palletTypeId}/tag/{palletTypeTag} | Add new tags for a palletType.
[**deletePalletType**](PalletTypeApi.md#deletePalletType) | **DELETE** /v3.0/palletType/{palletTypeId} | Delete a palletType
[**deletePalletTypeFile**](PalletTypeApi.md#deletePalletTypeFile) | **DELETE** /v3.0/palletType/{palletTypeId}/file/{fileId} | Delete a file for a palletType.
[**deletePalletTypeTag**](PalletTypeApi.md#deletePalletTypeTag) | **DELETE** /v3.0/palletType/{palletTypeId}/tag/{palletTypeTag} | Delete a tag for a palletType.
[**getDuplicatePalletTypeById**](PalletTypeApi.md#getDuplicatePalletTypeById) | **GET** /v3.0/palletType/duplicate/{palletTypeId} | Get a duplicated a palletType by id
[**getPalletTypeByFilter**](PalletTypeApi.md#getPalletTypeByFilter) | **GET** /v3.0/palletType/search | Search palletTypes by filter
[**getPalletTypeById**](PalletTypeApi.md#getPalletTypeById) | **GET** /v3.0/palletType/{palletTypeId} | Get a palletType by id
[**getPalletTypeFiles**](PalletTypeApi.md#getPalletTypeFiles) | **GET** /v3.0/palletType/{palletTypeId}/file | Get the files for a palletType.
[**getPalletTypeTags**](PalletTypeApi.md#getPalletTypeTags) | **GET** /v3.0/palletType/{palletTypeId}/tag | Get the tags for a palletType.
[**updatePalletType**](PalletTypeApi.md#updatePalletType) | **PUT** /v3.0/palletType | Update a palletType
[**updatePalletTypeCustomFields**](PalletTypeApi.md#updatePalletTypeCustomFields) | **PUT** /v3.0/palletType/customFields | Update a palletType custom fields


<a name="addPalletType"></a>
# **addPalletType**
> PalletType addPalletType(body)

Create a palletType

Inserts a new palletType using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PalletTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PalletTypeApi apiInstance = new PalletTypeApi();
PalletType body = new PalletType(); // PalletType | PalletType to be inserted.
try {
    PalletType result = apiInstance.addPalletType(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PalletTypeApi#addPalletType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PalletType**](PalletType.md)| PalletType to be inserted. |

### Return type

[**PalletType**](PalletType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPalletTypeAudit"></a>
# **addPalletTypeAudit**
> addPalletTypeAudit(palletTypeId, palletTypeAudit)

Add new audit for a palletType

Adds an audit to an existing palletType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PalletTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PalletTypeApi apiInstance = new PalletTypeApi();
Integer palletTypeId = 56; // Integer | Id of the palletType to add an audit to
String palletTypeAudit = "palletTypeAudit_example"; // String | The audit to add
try {
    apiInstance.addPalletTypeAudit(palletTypeId, palletTypeAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling PalletTypeApi#addPalletTypeAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **palletTypeId** | **Integer**| Id of the palletType to add an audit to |
 **palletTypeAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPalletTypeFile"></a>
# **addPalletTypeFile**
> addPalletTypeFile(palletTypeId, fileName)

Attach a file to a palletType

Adds a file to an existing palletType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PalletTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PalletTypeApi apiInstance = new PalletTypeApi();
Integer palletTypeId = 56; // Integer | Id of the palletType to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addPalletTypeFile(palletTypeId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling PalletTypeApi#addPalletTypeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **palletTypeId** | **Integer**| Id of the palletType to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addPalletTypeFileByURL"></a>
# **addPalletTypeFileByURL**
> addPalletTypeFileByURL(body, palletTypeId)

Attach a file to a palletType by URL.

Adds a file to an existing palletType by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PalletTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PalletTypeApi apiInstance = new PalletTypeApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer palletTypeId = 56; // Integer | Id of the palletType to add an file to
try {
    apiInstance.addPalletTypeFileByURL(body, palletTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling PalletTypeApi#addPalletTypeFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **palletTypeId** | **Integer**| Id of the palletType to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPalletTypeTag"></a>
# **addPalletTypeTag**
> addPalletTypeTag(palletTypeId, palletTypeTag)

Add new tags for a palletType.

Adds a tag to an existing palletType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PalletTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PalletTypeApi apiInstance = new PalletTypeApi();
Integer palletTypeId = 56; // Integer | Id of the palletType to add a tag to
String palletTypeTag = "palletTypeTag_example"; // String | The tag to add
try {
    apiInstance.addPalletTypeTag(palletTypeId, palletTypeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling PalletTypeApi#addPalletTypeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **palletTypeId** | **Integer**| Id of the palletType to add a tag to |
 **palletTypeTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePalletType"></a>
# **deletePalletType**
> deletePalletType(palletTypeId)

Delete a palletType

Deletes the palletType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PalletTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PalletTypeApi apiInstance = new PalletTypeApi();
Integer palletTypeId = 56; // Integer | Id of the palletType to be deleted.
try {
    apiInstance.deletePalletType(palletTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling PalletTypeApi#deletePalletType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **palletTypeId** | **Integer**| Id of the palletType to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePalletTypeFile"></a>
# **deletePalletTypeFile**
> deletePalletTypeFile(palletTypeId, fileId)

Delete a file for a palletType.

Deletes an existing palletType file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PalletTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PalletTypeApi apiInstance = new PalletTypeApi();
Integer palletTypeId = 56; // Integer | Id of the palletType to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deletePalletTypeFile(palletTypeId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling PalletTypeApi#deletePalletTypeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **palletTypeId** | **Integer**| Id of the palletType to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePalletTypeTag"></a>
# **deletePalletTypeTag**
> deletePalletTypeTag(palletTypeId, palletTypeTag)

Delete a tag for a palletType.

Deletes an existing palletType tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PalletTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PalletTypeApi apiInstance = new PalletTypeApi();
Integer palletTypeId = 56; // Integer | Id of the palletType to remove tag from
String palletTypeTag = "palletTypeTag_example"; // String | The tag to delete
try {
    apiInstance.deletePalletTypeTag(palletTypeId, palletTypeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling PalletTypeApi#deletePalletTypeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **palletTypeId** | **Integer**| Id of the palletType to remove tag from |
 **palletTypeTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicatePalletTypeById"></a>
# **getDuplicatePalletTypeById**
> PalletType getDuplicatePalletTypeById(palletTypeId)

Get a duplicated a palletType by id

Returns a duplicated palletType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PalletTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PalletTypeApi apiInstance = new PalletTypeApi();
Integer palletTypeId = 56; // Integer | Id of the palletType to be duplicated.
try {
    PalletType result = apiInstance.getDuplicatePalletTypeById(palletTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PalletTypeApi#getDuplicatePalletTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **palletTypeId** | **Integer**| Id of the palletType to be duplicated. |

### Return type

[**PalletType**](PalletType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPalletTypeByFilter"></a>
# **getPalletTypeByFilter**
> List&lt;PalletType&gt; getPalletTypeByFilter(filter, page, limit, sort)

Search palletTypes by filter

Returns the list of palletTypes that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PalletTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PalletTypeApi apiInstance = new PalletTypeApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<PalletType> result = apiInstance.getPalletTypeByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PalletTypeApi#getPalletTypeByFilter");
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

[**List&lt;PalletType&gt;**](PalletType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPalletTypeById"></a>
# **getPalletTypeById**
> PalletType getPalletTypeById(palletTypeId)

Get a palletType by id

Returns the palletType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PalletTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PalletTypeApi apiInstance = new PalletTypeApi();
Integer palletTypeId = 56; // Integer | Id of the palletType to be returned.
try {
    PalletType result = apiInstance.getPalletTypeById(palletTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PalletTypeApi#getPalletTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **palletTypeId** | **Integer**| Id of the palletType to be returned. |

### Return type

[**PalletType**](PalletType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPalletTypeFiles"></a>
# **getPalletTypeFiles**
> getPalletTypeFiles(palletTypeId)

Get the files for a palletType.

Get all existing palletType files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PalletTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PalletTypeApi apiInstance = new PalletTypeApi();
Integer palletTypeId = 56; // Integer | Id of the palletType to get files for
try {
    apiInstance.getPalletTypeFiles(palletTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling PalletTypeApi#getPalletTypeFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **palletTypeId** | **Integer**| Id of the palletType to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPalletTypeTags"></a>
# **getPalletTypeTags**
> getPalletTypeTags(palletTypeId)

Get the tags for a palletType.

Get all existing palletType tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PalletTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PalletTypeApi apiInstance = new PalletTypeApi();
Integer palletTypeId = 56; // Integer | Id of the palletType to get tags for
try {
    apiInstance.getPalletTypeTags(palletTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling PalletTypeApi#getPalletTypeTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **palletTypeId** | **Integer**| Id of the palletType to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePalletType"></a>
# **updatePalletType**
> updatePalletType(body)

Update a palletType

Updates an existing palletType using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PalletTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PalletTypeApi apiInstance = new PalletTypeApi();
PalletType body = new PalletType(); // PalletType | PalletType to be updated.
try {
    apiInstance.updatePalletType(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PalletTypeApi#updatePalletType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PalletType**](PalletType.md)| PalletType to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePalletTypeCustomFields"></a>
# **updatePalletTypeCustomFields**
> updatePalletTypeCustomFields(body)

Update a palletType custom fields

Updates an existing palletType custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PalletTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PalletTypeApi apiInstance = new PalletTypeApi();
PalletType body = new PalletType(); // PalletType | PalletType to be updated.
try {
    apiInstance.updatePalletTypeCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PalletTypeApi#updatePalletTypeCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PalletType**](PalletType.md)| PalletType to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

