# AisleApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAisle**](AisleApi.md#addAisle) | **POST** /v3.0/aisle | Create an aisle
[**addAisleAudit**](AisleApi.md#addAisleAudit) | **PUT** /v3.0/aisle/{aisleId}/audit/{aisleAudit} | Add new audit for an aisle
[**addAisleFile**](AisleApi.md#addAisleFile) | **POST** /v3.0/aisle/{aisleId}/file/{fileName} | Attach a file to an aisle
[**addAisleFileByURL**](AisleApi.md#addAisleFileByURL) | **POST** /v3.0/aisle/{aisleId}/file | Attach a file to an aisle by URL.
[**addAisleTag**](AisleApi.md#addAisleTag) | **PUT** /v3.0/aisle/{aisleId}/tag/{aisleTag} | Add new tags for an aisle.
[**deleteAisle**](AisleApi.md#deleteAisle) | **DELETE** /v3.0/aisle/{aisleId} | Delete an aisle
[**deleteAisleFile**](AisleApi.md#deleteAisleFile) | **DELETE** /v3.0/aisle/{aisleId}/file/{fileId} | Delete a file for an aisle.
[**deleteAisleTag**](AisleApi.md#deleteAisleTag) | **DELETE** /v3.0/aisle/{aisleId}/tag/{aisleTag} | Delete a tag for an aisle.
[**getAisleByFilter**](AisleApi.md#getAisleByFilter) | **GET** /v3.0/aisle/search | Search aisles by filter
[**getAisleById**](AisleApi.md#getAisleById) | **GET** /v3.0/aisle/{aisleId} | Get an aisle by id
[**getAisleFiles**](AisleApi.md#getAisleFiles) | **GET** /v3.0/aisle/{aisleId}/file | Get the files for an aisle.
[**getAisleTags**](AisleApi.md#getAisleTags) | **GET** /v3.0/aisle/{aisleId}/tag | Get the tags for an aisle.
[**getDuplicateAisleById**](AisleApi.md#getDuplicateAisleById) | **GET** /v3.0/aisle/duplicate/{aisleId} | Get a duplicated an aisle by id
[**updateAisle**](AisleApi.md#updateAisle) | **PUT** /v3.0/aisle | Update an aisle
[**updateAisleCustomFields**](AisleApi.md#updateAisleCustomFields) | **PUT** /v3.0/aisle/customFields | Update an aisle custom fields


<a name="addAisle"></a>
# **addAisle**
> Aisle addAisle(body)

Create an aisle

Inserts a new aisle using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AisleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AisleApi apiInstance = new AisleApi();
Aisle body = new Aisle(); // Aisle | Aisle to be inserted.
try {
    Aisle result = apiInstance.addAisle(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AisleApi#addAisle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Aisle**](Aisle.md)| Aisle to be inserted. |

### Return type

[**Aisle**](Aisle.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addAisleAudit"></a>
# **addAisleAudit**
> addAisleAudit(aisleId, aisleAudit)

Add new audit for an aisle

Adds an audit to an existing aisle.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AisleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AisleApi apiInstance = new AisleApi();
Integer aisleId = 56; // Integer | Id of the aisle to add an audit to
String aisleAudit = "aisleAudit_example"; // String | The audit to add
try {
    apiInstance.addAisleAudit(aisleId, aisleAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling AisleApi#addAisleAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aisleId** | **Integer**| Id of the aisle to add an audit to |
 **aisleAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addAisleFile"></a>
# **addAisleFile**
> addAisleFile(aisleId, fileName)

Attach a file to an aisle

Adds a file to an existing aisle.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AisleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AisleApi apiInstance = new AisleApi();
Integer aisleId = 56; // Integer | Id of the aisle to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addAisleFile(aisleId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling AisleApi#addAisleFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aisleId** | **Integer**| Id of the aisle to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addAisleFileByURL"></a>
# **addAisleFileByURL**
> addAisleFileByURL(body, aisleId)

Attach a file to an aisle by URL.

Adds a file to an existing aisle by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AisleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AisleApi apiInstance = new AisleApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer aisleId = 56; // Integer | Id of the aisle to add an file to
try {
    apiInstance.addAisleFileByURL(body, aisleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AisleApi#addAisleFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **aisleId** | **Integer**| Id of the aisle to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addAisleTag"></a>
# **addAisleTag**
> addAisleTag(aisleId, aisleTag)

Add new tags for an aisle.

Adds a tag to an existing aisle.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AisleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AisleApi apiInstance = new AisleApi();
Integer aisleId = 56; // Integer | Id of the aisle to add a tag to
String aisleTag = "aisleTag_example"; // String | The tag to add
try {
    apiInstance.addAisleTag(aisleId, aisleTag);
} catch (ApiException e) {
    System.err.println("Exception when calling AisleApi#addAisleTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aisleId** | **Integer**| Id of the aisle to add a tag to |
 **aisleTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAisle"></a>
# **deleteAisle**
> deleteAisle(aisleId)

Delete an aisle

Deletes the aisle identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AisleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AisleApi apiInstance = new AisleApi();
Integer aisleId = 56; // Integer | Id of the aisle to be deleted.
try {
    apiInstance.deleteAisle(aisleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AisleApi#deleteAisle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aisleId** | **Integer**| Id of the aisle to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteAisleFile"></a>
# **deleteAisleFile**
> deleteAisleFile(aisleId, fileId)

Delete a file for an aisle.

Deletes an existing aisle file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AisleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AisleApi apiInstance = new AisleApi();
Integer aisleId = 56; // Integer | Id of the aisle to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteAisleFile(aisleId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling AisleApi#deleteAisleFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aisleId** | **Integer**| Id of the aisle to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteAisleTag"></a>
# **deleteAisleTag**
> deleteAisleTag(aisleId, aisleTag)

Delete a tag for an aisle.

Deletes an existing aisle tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AisleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AisleApi apiInstance = new AisleApi();
Integer aisleId = 56; // Integer | Id of the aisle to remove tag from
String aisleTag = "aisleTag_example"; // String | The tag to delete
try {
    apiInstance.deleteAisleTag(aisleId, aisleTag);
} catch (ApiException e) {
    System.err.println("Exception when calling AisleApi#deleteAisleTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aisleId** | **Integer**| Id of the aisle to remove tag from |
 **aisleTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAisleByFilter"></a>
# **getAisleByFilter**
> List&lt;Aisle&gt; getAisleByFilter(filter, page, limit, sort)

Search aisles by filter

Returns the list of aisles that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AisleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AisleApi apiInstance = new AisleApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Aisle> result = apiInstance.getAisleByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AisleApi#getAisleByFilter");
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

[**List&lt;Aisle&gt;**](Aisle.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAisleById"></a>
# **getAisleById**
> Aisle getAisleById(aisleId)

Get an aisle by id

Returns the aisle identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AisleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AisleApi apiInstance = new AisleApi();
Integer aisleId = 56; // Integer | Id of the aisle to be returned.
try {
    Aisle result = apiInstance.getAisleById(aisleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AisleApi#getAisleById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aisleId** | **Integer**| Id of the aisle to be returned. |

### Return type

[**Aisle**](Aisle.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAisleFiles"></a>
# **getAisleFiles**
> getAisleFiles(aisleId)

Get the files for an aisle.

Get all existing aisle files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AisleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AisleApi apiInstance = new AisleApi();
Integer aisleId = 56; // Integer | Id of the aisle to get files for
try {
    apiInstance.getAisleFiles(aisleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AisleApi#getAisleFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aisleId** | **Integer**| Id of the aisle to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAisleTags"></a>
# **getAisleTags**
> getAisleTags(aisleId)

Get the tags for an aisle.

Get all existing aisle tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AisleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AisleApi apiInstance = new AisleApi();
Integer aisleId = 56; // Integer | Id of the aisle to get tags for
try {
    apiInstance.getAisleTags(aisleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AisleApi#getAisleTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aisleId** | **Integer**| Id of the aisle to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateAisleById"></a>
# **getDuplicateAisleById**
> Aisle getDuplicateAisleById(aisleId)

Get a duplicated an aisle by id

Returns a duplicated aisle identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AisleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AisleApi apiInstance = new AisleApi();
Integer aisleId = 56; // Integer | Id of the aisle to be duplicated.
try {
    Aisle result = apiInstance.getDuplicateAisleById(aisleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AisleApi#getDuplicateAisleById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aisleId** | **Integer**| Id of the aisle to be duplicated. |

### Return type

[**Aisle**](Aisle.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAisle"></a>
# **updateAisle**
> updateAisle(body)

Update an aisle

Updates an existing aisle using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AisleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AisleApi apiInstance = new AisleApi();
Aisle body = new Aisle(); // Aisle | Aisle to be updated.
try {
    apiInstance.updateAisle(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AisleApi#updateAisle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Aisle**](Aisle.md)| Aisle to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAisleCustomFields"></a>
# **updateAisleCustomFields**
> updateAisleCustomFields(body)

Update an aisle custom fields

Updates an existing aisle custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AisleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AisleApi apiInstance = new AisleApi();
Aisle body = new Aisle(); // Aisle | Aisle to be updated.
try {
    apiInstance.updateAisleCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AisleApi#updateAisleCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Aisle**](Aisle.md)| Aisle to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

