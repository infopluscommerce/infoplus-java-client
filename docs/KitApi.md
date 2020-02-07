# KitApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addKit**](KitApi.md#addKit) | **POST** /beta/kit | Create a kit
[**addKitAudit**](KitApi.md#addKitAudit) | **PUT** /beta/kit/{kitId}/audit/{kitAudit} | Add new audit for a kit
[**addKitFile**](KitApi.md#addKitFile) | **POST** /beta/kit/{kitId}/file/{fileName} | Attach a file to a kit
[**addKitFileByURL**](KitApi.md#addKitFileByURL) | **POST** /beta/kit/{kitId}/file | Attach a file to a kit by URL.
[**addKitTag**](KitApi.md#addKitTag) | **PUT** /beta/kit/{kitId}/tag/{kitTag} | Add new tags for a kit.
[**deleteKit**](KitApi.md#deleteKit) | **DELETE** /beta/kit/{kitId} | Delete a kit
[**deleteKitFile**](KitApi.md#deleteKitFile) | **DELETE** /beta/kit/{kitId}/file/{fileId} | Delete a file for a kit.
[**deleteKitTag**](KitApi.md#deleteKitTag) | **DELETE** /beta/kit/{kitId}/tag/{kitTag} | Delete a tag for a kit.
[**getDuplicateKitById**](KitApi.md#getDuplicateKitById) | **GET** /beta/kit/duplicate/{kitId} | Get a duplicated a kit by id
[**getKitByFilter**](KitApi.md#getKitByFilter) | **GET** /beta/kit/search | Search kits by filter
[**getKitById**](KitApi.md#getKitById) | **GET** /beta/kit/{kitId} | Get a kit by id
[**getKitFiles**](KitApi.md#getKitFiles) | **GET** /beta/kit/{kitId}/file | Get the files for a kit.
[**getKitTags**](KitApi.md#getKitTags) | **GET** /beta/kit/{kitId}/tag | Get the tags for a kit.
[**updateKit**](KitApi.md#updateKit) | **PUT** /beta/kit | Update a kit
[**updateKitCustomFields**](KitApi.md#updateKitCustomFields) | **PUT** /beta/kit/customFields | Update a kit custom fields


<a name="addKit"></a>
# **addKit**
> Kit addKit(body)

Create a kit

Inserts a new kit using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.KitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

KitApi apiInstance = new KitApi();
Kit body = new Kit(); // Kit | Kit to be inserted.
try {
    Kit result = apiInstance.addKit(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KitApi#addKit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Kit**](Kit.md)| Kit to be inserted. |

### Return type

[**Kit**](Kit.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addKitAudit"></a>
# **addKitAudit**
> addKitAudit(kitId, kitAudit)

Add new audit for a kit

Adds an audit to an existing kit.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.KitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

KitApi apiInstance = new KitApi();
Integer kitId = 56; // Integer | Id of the kit to add an audit to
String kitAudit = "kitAudit_example"; // String | The audit to add
try {
    apiInstance.addKitAudit(kitId, kitAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling KitApi#addKitAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kitId** | **Integer**| Id of the kit to add an audit to |
 **kitAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addKitFile"></a>
# **addKitFile**
> addKitFile(kitId, fileName)

Attach a file to a kit

Adds a file to an existing kit.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.KitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

KitApi apiInstance = new KitApi();
Integer kitId = 56; // Integer | Id of the kit to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addKitFile(kitId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling KitApi#addKitFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kitId** | **Integer**| Id of the kit to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addKitFileByURL"></a>
# **addKitFileByURL**
> addKitFileByURL(body, kitId)

Attach a file to a kit by URL.

Adds a file to an existing kit by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.KitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

KitApi apiInstance = new KitApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer kitId = 56; // Integer | Id of the kit to add an file to
try {
    apiInstance.addKitFileByURL(body, kitId);
} catch (ApiException e) {
    System.err.println("Exception when calling KitApi#addKitFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **kitId** | **Integer**| Id of the kit to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addKitTag"></a>
# **addKitTag**
> addKitTag(kitId, kitTag)

Add new tags for a kit.

Adds a tag to an existing kit.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.KitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

KitApi apiInstance = new KitApi();
Integer kitId = 56; // Integer | Id of the kit to add a tag to
String kitTag = "kitTag_example"; // String | The tag to add
try {
    apiInstance.addKitTag(kitId, kitTag);
} catch (ApiException e) {
    System.err.println("Exception when calling KitApi#addKitTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kitId** | **Integer**| Id of the kit to add a tag to |
 **kitTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteKit"></a>
# **deleteKit**
> deleteKit(kitId)

Delete a kit

Deletes the kit identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.KitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

KitApi apiInstance = new KitApi();
Integer kitId = 56; // Integer | Id of the kit to be deleted.
try {
    apiInstance.deleteKit(kitId);
} catch (ApiException e) {
    System.err.println("Exception when calling KitApi#deleteKit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kitId** | **Integer**| Id of the kit to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteKitFile"></a>
# **deleteKitFile**
> deleteKitFile(kitId, fileId)

Delete a file for a kit.

Deletes an existing kit file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.KitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

KitApi apiInstance = new KitApi();
Integer kitId = 56; // Integer | Id of the kit to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteKitFile(kitId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling KitApi#deleteKitFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kitId** | **Integer**| Id of the kit to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteKitTag"></a>
# **deleteKitTag**
> deleteKitTag(kitId, kitTag)

Delete a tag for a kit.

Deletes an existing kit tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.KitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

KitApi apiInstance = new KitApi();
Integer kitId = 56; // Integer | Id of the kit to remove tag from
String kitTag = "kitTag_example"; // String | The tag to delete
try {
    apiInstance.deleteKitTag(kitId, kitTag);
} catch (ApiException e) {
    System.err.println("Exception when calling KitApi#deleteKitTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kitId** | **Integer**| Id of the kit to remove tag from |
 **kitTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateKitById"></a>
# **getDuplicateKitById**
> Kit getDuplicateKitById(kitId)

Get a duplicated a kit by id

Returns a duplicated kit identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.KitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

KitApi apiInstance = new KitApi();
Integer kitId = 56; // Integer | Id of the kit to be duplicated.
try {
    Kit result = apiInstance.getDuplicateKitById(kitId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KitApi#getDuplicateKitById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kitId** | **Integer**| Id of the kit to be duplicated. |

### Return type

[**Kit**](Kit.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getKitByFilter"></a>
# **getKitByFilter**
> List&lt;Kit&gt; getKitByFilter(filter, page, limit, sort)

Search kits by filter

Returns the list of kits that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.KitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

KitApi apiInstance = new KitApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Kit> result = apiInstance.getKitByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KitApi#getKitByFilter");
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

[**List&lt;Kit&gt;**](Kit.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getKitById"></a>
# **getKitById**
> Kit getKitById(kitId)

Get a kit by id

Returns the kit identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.KitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

KitApi apiInstance = new KitApi();
Integer kitId = 56; // Integer | Id of the kit to be returned.
try {
    Kit result = apiInstance.getKitById(kitId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KitApi#getKitById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kitId** | **Integer**| Id of the kit to be returned. |

### Return type

[**Kit**](Kit.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getKitFiles"></a>
# **getKitFiles**
> getKitFiles(kitId)

Get the files for a kit.

Get all existing kit files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.KitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

KitApi apiInstance = new KitApi();
Integer kitId = 56; // Integer | Id of the kit to get files for
try {
    apiInstance.getKitFiles(kitId);
} catch (ApiException e) {
    System.err.println("Exception when calling KitApi#getKitFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kitId** | **Integer**| Id of the kit to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getKitTags"></a>
# **getKitTags**
> getKitTags(kitId)

Get the tags for a kit.

Get all existing kit tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.KitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

KitApi apiInstance = new KitApi();
Integer kitId = 56; // Integer | Id of the kit to get tags for
try {
    apiInstance.getKitTags(kitId);
} catch (ApiException e) {
    System.err.println("Exception when calling KitApi#getKitTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kitId** | **Integer**| Id of the kit to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateKit"></a>
# **updateKit**
> updateKit(body)

Update a kit

Updates an existing kit using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.KitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

KitApi apiInstance = new KitApi();
Kit body = new Kit(); // Kit | Kit to be updated.
try {
    apiInstance.updateKit(body);
} catch (ApiException e) {
    System.err.println("Exception when calling KitApi#updateKit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Kit**](Kit.md)| Kit to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateKitCustomFields"></a>
# **updateKitCustomFields**
> updateKitCustomFields(body)

Update a kit custom fields

Updates an existing kit custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.KitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

KitApi apiInstance = new KitApi();
Kit body = new Kit(); // Kit | Kit to be updated.
try {
    apiInstance.updateKitCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling KitApi#updateKitCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Kit**](Kit.md)| Kit to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

