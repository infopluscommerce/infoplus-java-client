# SupplementApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSupplement**](SupplementApi.md#addSupplement) | **POST** /v3.0/supplement | Create a supplement
[**addSupplementAudit**](SupplementApi.md#addSupplementAudit) | **PUT** /v3.0/supplement/{supplementId}/audit/{supplementAudit} | Add new audit for a supplement
[**addSupplementFile**](SupplementApi.md#addSupplementFile) | **POST** /v3.0/supplement/{supplementId}/file/{fileName} | Attach a file to a supplement
[**addSupplementFileByURL**](SupplementApi.md#addSupplementFileByURL) | **POST** /v3.0/supplement/{supplementId}/file | Attach a file to a supplement by URL.
[**addSupplementTag**](SupplementApi.md#addSupplementTag) | **PUT** /v3.0/supplement/{supplementId}/tag/{supplementTag} | Add new tags for a supplement.
[**deleteSupplement**](SupplementApi.md#deleteSupplement) | **DELETE** /v3.0/supplement/{supplementId} | Delete a supplement
[**deleteSupplementFile**](SupplementApi.md#deleteSupplementFile) | **DELETE** /v3.0/supplement/{supplementId}/file/{fileId} | Delete a file for a supplement.
[**deleteSupplementTag**](SupplementApi.md#deleteSupplementTag) | **DELETE** /v3.0/supplement/{supplementId}/tag/{supplementTag} | Delete a tag for a supplement.
[**getDuplicateSupplementById**](SupplementApi.md#getDuplicateSupplementById) | **GET** /v3.0/supplement/duplicate/{supplementId} | Get a duplicated a supplement by id
[**getSupplementByFilter**](SupplementApi.md#getSupplementByFilter) | **GET** /v3.0/supplement/search | Search supplements by filter
[**getSupplementById**](SupplementApi.md#getSupplementById) | **GET** /v3.0/supplement/{supplementId} | Get a supplement by id
[**getSupplementFiles**](SupplementApi.md#getSupplementFiles) | **GET** /v3.0/supplement/{supplementId}/file | Get the files for a supplement.
[**getSupplementTags**](SupplementApi.md#getSupplementTags) | **GET** /v3.0/supplement/{supplementId}/tag | Get the tags for a supplement.
[**updateSupplement**](SupplementApi.md#updateSupplement) | **PUT** /v3.0/supplement | Update a supplement
[**updateSupplementCustomFields**](SupplementApi.md#updateSupplementCustomFields) | **PUT** /v3.0/supplement/customFields | Update a supplement custom fields


<a name="addSupplement"></a>
# **addSupplement**
> Supplement addSupplement(body)

Create a supplement

Inserts a new supplement using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SupplementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SupplementApi apiInstance = new SupplementApi();
Supplement body = new Supplement(); // Supplement | Supplement to be inserted.
try {
    Supplement result = apiInstance.addSupplement(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplementApi#addSupplement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Supplement**](Supplement.md)| Supplement to be inserted. |

### Return type

[**Supplement**](Supplement.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addSupplementAudit"></a>
# **addSupplementAudit**
> addSupplementAudit(supplementId, supplementAudit)

Add new audit for a supplement

Adds an audit to an existing supplement.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SupplementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SupplementApi apiInstance = new SupplementApi();
Integer supplementId = 56; // Integer | Id of the supplement to add an audit to
String supplementAudit = "supplementAudit_example"; // String | The audit to add
try {
    apiInstance.addSupplementAudit(supplementId, supplementAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplementApi#addSupplementAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supplementId** | **Integer**| Id of the supplement to add an audit to |
 **supplementAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addSupplementFile"></a>
# **addSupplementFile**
> addSupplementFile(supplementId, fileName)

Attach a file to a supplement

Adds a file to an existing supplement.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SupplementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SupplementApi apiInstance = new SupplementApi();
Integer supplementId = 56; // Integer | Id of the supplement to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addSupplementFile(supplementId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplementApi#addSupplementFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supplementId** | **Integer**| Id of the supplement to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addSupplementFileByURL"></a>
# **addSupplementFileByURL**
> addSupplementFileByURL(body, supplementId)

Attach a file to a supplement by URL.

Adds a file to an existing supplement by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SupplementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SupplementApi apiInstance = new SupplementApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer supplementId = 56; // Integer | Id of the supplement to add an file to
try {
    apiInstance.addSupplementFileByURL(body, supplementId);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplementApi#addSupplementFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **supplementId** | **Integer**| Id of the supplement to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addSupplementTag"></a>
# **addSupplementTag**
> addSupplementTag(supplementId, supplementTag)

Add new tags for a supplement.

Adds a tag to an existing supplement.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SupplementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SupplementApi apiInstance = new SupplementApi();
Integer supplementId = 56; // Integer | Id of the supplement to add a tag to
String supplementTag = "supplementTag_example"; // String | The tag to add
try {
    apiInstance.addSupplementTag(supplementId, supplementTag);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplementApi#addSupplementTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supplementId** | **Integer**| Id of the supplement to add a tag to |
 **supplementTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSupplement"></a>
# **deleteSupplement**
> deleteSupplement(supplementId)

Delete a supplement

Deletes the supplement identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SupplementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SupplementApi apiInstance = new SupplementApi();
Integer supplementId = 56; // Integer | Id of the supplement to be deleted.
try {
    apiInstance.deleteSupplement(supplementId);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplementApi#deleteSupplement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supplementId** | **Integer**| Id of the supplement to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteSupplementFile"></a>
# **deleteSupplementFile**
> deleteSupplementFile(supplementId, fileId)

Delete a file for a supplement.

Deletes an existing supplement file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SupplementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SupplementApi apiInstance = new SupplementApi();
Integer supplementId = 56; // Integer | Id of the supplement to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteSupplementFile(supplementId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplementApi#deleteSupplementFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supplementId** | **Integer**| Id of the supplement to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteSupplementTag"></a>
# **deleteSupplementTag**
> deleteSupplementTag(supplementId, supplementTag)

Delete a tag for a supplement.

Deletes an existing supplement tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SupplementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SupplementApi apiInstance = new SupplementApi();
Integer supplementId = 56; // Integer | Id of the supplement to remove tag from
String supplementTag = "supplementTag_example"; // String | The tag to delete
try {
    apiInstance.deleteSupplementTag(supplementId, supplementTag);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplementApi#deleteSupplementTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supplementId** | **Integer**| Id of the supplement to remove tag from |
 **supplementTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateSupplementById"></a>
# **getDuplicateSupplementById**
> Supplement getDuplicateSupplementById(supplementId)

Get a duplicated a supplement by id

Returns a duplicated supplement identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SupplementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SupplementApi apiInstance = new SupplementApi();
Integer supplementId = 56; // Integer | Id of the supplement to be duplicated.
try {
    Supplement result = apiInstance.getDuplicateSupplementById(supplementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplementApi#getDuplicateSupplementById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supplementId** | **Integer**| Id of the supplement to be duplicated. |

### Return type

[**Supplement**](Supplement.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSupplementByFilter"></a>
# **getSupplementByFilter**
> List&lt;Supplement&gt; getSupplementByFilter(filter, page, limit, sort)

Search supplements by filter

Returns the list of supplements that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SupplementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SupplementApi apiInstance = new SupplementApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Supplement> result = apiInstance.getSupplementByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplementApi#getSupplementByFilter");
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

[**List&lt;Supplement&gt;**](Supplement.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSupplementById"></a>
# **getSupplementById**
> Supplement getSupplementById(supplementId)

Get a supplement by id

Returns the supplement identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SupplementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SupplementApi apiInstance = new SupplementApi();
Integer supplementId = 56; // Integer | Id of the supplement to be returned.
try {
    Supplement result = apiInstance.getSupplementById(supplementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplementApi#getSupplementById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supplementId** | **Integer**| Id of the supplement to be returned. |

### Return type

[**Supplement**](Supplement.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSupplementFiles"></a>
# **getSupplementFiles**
> getSupplementFiles(supplementId)

Get the files for a supplement.

Get all existing supplement files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SupplementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SupplementApi apiInstance = new SupplementApi();
Integer supplementId = 56; // Integer | Id of the supplement to get files for
try {
    apiInstance.getSupplementFiles(supplementId);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplementApi#getSupplementFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supplementId** | **Integer**| Id of the supplement to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSupplementTags"></a>
# **getSupplementTags**
> getSupplementTags(supplementId)

Get the tags for a supplement.

Get all existing supplement tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SupplementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SupplementApi apiInstance = new SupplementApi();
Integer supplementId = 56; // Integer | Id of the supplement to get tags for
try {
    apiInstance.getSupplementTags(supplementId);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplementApi#getSupplementTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supplementId** | **Integer**| Id of the supplement to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSupplement"></a>
# **updateSupplement**
> updateSupplement(body)

Update a supplement

Updates an existing supplement using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SupplementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SupplementApi apiInstance = new SupplementApi();
Supplement body = new Supplement(); // Supplement | Supplement to be updated.
try {
    apiInstance.updateSupplement(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplementApi#updateSupplement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Supplement**](Supplement.md)| Supplement to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSupplementCustomFields"></a>
# **updateSupplementCustomFields**
> updateSupplementCustomFields(body)

Update a supplement custom fields

Updates an existing supplement custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SupplementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SupplementApi apiInstance = new SupplementApi();
Supplement body = new Supplement(); // Supplement | Supplement to be updated.
try {
    apiInstance.updateSupplementCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplementApi#updateSupplementCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Supplement**](Supplement.md)| Supplement to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

