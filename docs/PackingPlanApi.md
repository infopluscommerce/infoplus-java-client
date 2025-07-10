# PackingPlanApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPackingPlan**](PackingPlanApi.md#addPackingPlan) | **POST** /beta/packingPlan | Create a packingPlan
[**addPackingPlanAudit**](PackingPlanApi.md#addPackingPlanAudit) | **PUT** /beta/packingPlan/{packingPlanId}/audit/{packingPlanAudit} | Add new audit for a packingPlan
[**addPackingPlanFile**](PackingPlanApi.md#addPackingPlanFile) | **POST** /beta/packingPlan/{packingPlanId}/file/{fileName} | Attach a file to a packingPlan
[**addPackingPlanFileByURL**](PackingPlanApi.md#addPackingPlanFileByURL) | **POST** /beta/packingPlan/{packingPlanId}/file | Attach a file to a packingPlan by URL.
[**addPackingPlanTag**](PackingPlanApi.md#addPackingPlanTag) | **PUT** /beta/packingPlan/{packingPlanId}/tag/{packingPlanTag} | Add new tags for a packingPlan.
[**deletePackingPlan**](PackingPlanApi.md#deletePackingPlan) | **DELETE** /beta/packingPlan/{packingPlanId} | Delete a packingPlan
[**deletePackingPlanFile**](PackingPlanApi.md#deletePackingPlanFile) | **DELETE** /beta/packingPlan/{packingPlanId}/file/{fileId} | Delete a file for a packingPlan.
[**deletePackingPlanTag**](PackingPlanApi.md#deletePackingPlanTag) | **DELETE** /beta/packingPlan/{packingPlanId}/tag/{packingPlanTag} | Delete a tag for a packingPlan.
[**getDuplicatePackingPlanById**](PackingPlanApi.md#getDuplicatePackingPlanById) | **GET** /beta/packingPlan/duplicate/{packingPlanId} | Get a duplicated a packingPlan by id
[**getPackingPlanByFilter**](PackingPlanApi.md#getPackingPlanByFilter) | **GET** /beta/packingPlan/search | Search packingPlans by filter
[**getPackingPlanById**](PackingPlanApi.md#getPackingPlanById) | **GET** /beta/packingPlan/{packingPlanId} | Get a packingPlan by id
[**getPackingPlanFiles**](PackingPlanApi.md#getPackingPlanFiles) | **GET** /beta/packingPlan/{packingPlanId}/file | Get the files for a packingPlan.
[**getPackingPlanTags**](PackingPlanApi.md#getPackingPlanTags) | **GET** /beta/packingPlan/{packingPlanId}/tag | Get the tags for a packingPlan.
[**updatePackingPlan**](PackingPlanApi.md#updatePackingPlan) | **PUT** /beta/packingPlan | Update a packingPlan
[**updatePackingPlanCustomFields**](PackingPlanApi.md#updatePackingPlanCustomFields) | **PUT** /beta/packingPlan/customFields | Update a packingPlan custom fields


<a name="addPackingPlan"></a>
# **addPackingPlan**
> PackingPlan addPackingPlan(body)

Create a packingPlan

Inserts a new packingPlan using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanApi apiInstance = new PackingPlanApi();
PackingPlan body = new PackingPlan(); // PackingPlan | PackingPlan to be inserted.
try {
    PackingPlan result = apiInstance.addPackingPlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanApi#addPackingPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PackingPlan**](PackingPlan.md)| PackingPlan to be inserted. |

### Return type

[**PackingPlan**](PackingPlan.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPackingPlanAudit"></a>
# **addPackingPlanAudit**
> addPackingPlanAudit(packingPlanId, packingPlanAudit)

Add new audit for a packingPlan

Adds an audit to an existing packingPlan.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanApi apiInstance = new PackingPlanApi();
Integer packingPlanId = 56; // Integer | Id of the packingPlan to add an audit to
String packingPlanAudit = "packingPlanAudit_example"; // String | The audit to add
try {
    apiInstance.addPackingPlanAudit(packingPlanId, packingPlanAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanApi#addPackingPlanAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingPlanId** | **Integer**| Id of the packingPlan to add an audit to |
 **packingPlanAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPackingPlanFile"></a>
# **addPackingPlanFile**
> addPackingPlanFile(packingPlanId, fileName)

Attach a file to a packingPlan

Adds a file to an existing packingPlan.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanApi apiInstance = new PackingPlanApi();
Integer packingPlanId = 56; // Integer | Id of the packingPlan to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addPackingPlanFile(packingPlanId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanApi#addPackingPlanFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingPlanId** | **Integer**| Id of the packingPlan to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addPackingPlanFileByURL"></a>
# **addPackingPlanFileByURL**
> addPackingPlanFileByURL(body, packingPlanId)

Attach a file to a packingPlan by URL.

Adds a file to an existing packingPlan by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanApi apiInstance = new PackingPlanApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer packingPlanId = 56; // Integer | Id of the packingPlan to add an file to
try {
    apiInstance.addPackingPlanFileByURL(body, packingPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanApi#addPackingPlanFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **packingPlanId** | **Integer**| Id of the packingPlan to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPackingPlanTag"></a>
# **addPackingPlanTag**
> addPackingPlanTag(packingPlanId, packingPlanTag)

Add new tags for a packingPlan.

Adds a tag to an existing packingPlan.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanApi apiInstance = new PackingPlanApi();
Integer packingPlanId = 56; // Integer | Id of the packingPlan to add a tag to
String packingPlanTag = "packingPlanTag_example"; // String | The tag to add
try {
    apiInstance.addPackingPlanTag(packingPlanId, packingPlanTag);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanApi#addPackingPlanTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingPlanId** | **Integer**| Id of the packingPlan to add a tag to |
 **packingPlanTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePackingPlan"></a>
# **deletePackingPlan**
> deletePackingPlan(packingPlanId)

Delete a packingPlan

Deletes the packingPlan identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanApi apiInstance = new PackingPlanApi();
Integer packingPlanId = 56; // Integer | Id of the packingPlan to be deleted.
try {
    apiInstance.deletePackingPlan(packingPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanApi#deletePackingPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingPlanId** | **Integer**| Id of the packingPlan to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePackingPlanFile"></a>
# **deletePackingPlanFile**
> deletePackingPlanFile(packingPlanId, fileId)

Delete a file for a packingPlan.

Deletes an existing packingPlan file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanApi apiInstance = new PackingPlanApi();
Integer packingPlanId = 56; // Integer | Id of the packingPlan to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deletePackingPlanFile(packingPlanId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanApi#deletePackingPlanFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingPlanId** | **Integer**| Id of the packingPlan to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePackingPlanTag"></a>
# **deletePackingPlanTag**
> deletePackingPlanTag(packingPlanId, packingPlanTag)

Delete a tag for a packingPlan.

Deletes an existing packingPlan tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanApi apiInstance = new PackingPlanApi();
Integer packingPlanId = 56; // Integer | Id of the packingPlan to remove tag from
String packingPlanTag = "packingPlanTag_example"; // String | The tag to delete
try {
    apiInstance.deletePackingPlanTag(packingPlanId, packingPlanTag);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanApi#deletePackingPlanTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingPlanId** | **Integer**| Id of the packingPlan to remove tag from |
 **packingPlanTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicatePackingPlanById"></a>
# **getDuplicatePackingPlanById**
> PackingPlan getDuplicatePackingPlanById(packingPlanId)

Get a duplicated a packingPlan by id

Returns a duplicated packingPlan identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanApi apiInstance = new PackingPlanApi();
Integer packingPlanId = 56; // Integer | Id of the packingPlan to be duplicated.
try {
    PackingPlan result = apiInstance.getDuplicatePackingPlanById(packingPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanApi#getDuplicatePackingPlanById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingPlanId** | **Integer**| Id of the packingPlan to be duplicated. |

### Return type

[**PackingPlan**](PackingPlan.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPackingPlanByFilter"></a>
# **getPackingPlanByFilter**
> List&lt;PackingPlan&gt; getPackingPlanByFilter(filter, page, limit, sort)

Search packingPlans by filter

Returns the list of packingPlans that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanApi apiInstance = new PackingPlanApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<PackingPlan> result = apiInstance.getPackingPlanByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanApi#getPackingPlanByFilter");
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

[**List&lt;PackingPlan&gt;**](PackingPlan.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPackingPlanById"></a>
# **getPackingPlanById**
> PackingPlan getPackingPlanById(packingPlanId)

Get a packingPlan by id

Returns the packingPlan identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanApi apiInstance = new PackingPlanApi();
Integer packingPlanId = 56; // Integer | Id of the packingPlan to be returned.
try {
    PackingPlan result = apiInstance.getPackingPlanById(packingPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanApi#getPackingPlanById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingPlanId** | **Integer**| Id of the packingPlan to be returned. |

### Return type

[**PackingPlan**](PackingPlan.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPackingPlanFiles"></a>
# **getPackingPlanFiles**
> getPackingPlanFiles(packingPlanId)

Get the files for a packingPlan.

Get all existing packingPlan files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanApi apiInstance = new PackingPlanApi();
Integer packingPlanId = 56; // Integer | Id of the packingPlan to get files for
try {
    apiInstance.getPackingPlanFiles(packingPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanApi#getPackingPlanFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingPlanId** | **Integer**| Id of the packingPlan to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPackingPlanTags"></a>
# **getPackingPlanTags**
> getPackingPlanTags(packingPlanId)

Get the tags for a packingPlan.

Get all existing packingPlan tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanApi apiInstance = new PackingPlanApi();
Integer packingPlanId = 56; // Integer | Id of the packingPlan to get tags for
try {
    apiInstance.getPackingPlanTags(packingPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanApi#getPackingPlanTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingPlanId** | **Integer**| Id of the packingPlan to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePackingPlan"></a>
# **updatePackingPlan**
> updatePackingPlan(body)

Update a packingPlan

Updates an existing packingPlan using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanApi apiInstance = new PackingPlanApi();
PackingPlan body = new PackingPlan(); // PackingPlan | PackingPlan to be updated.
try {
    apiInstance.updatePackingPlan(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanApi#updatePackingPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PackingPlan**](PackingPlan.md)| PackingPlan to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePackingPlanCustomFields"></a>
# **updatePackingPlanCustomFields**
> updatePackingPlanCustomFields(body)

Update a packingPlan custom fields

Updates an existing packingPlan custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingPlanApi apiInstance = new PackingPlanApi();
PackingPlan body = new PackingPlan(); // PackingPlan | PackingPlan to be updated.
try {
    apiInstance.updatePackingPlanCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingPlanApi#updatePackingPlanCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PackingPlan**](PackingPlan.md)| PackingPlan to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

