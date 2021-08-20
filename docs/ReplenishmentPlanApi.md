# ReplenishmentPlanApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addReplenishmentPlan**](ReplenishmentPlanApi.md#addReplenishmentPlan) | **POST** /beta/replenishmentPlan | Create a replenishmentPlan
[**addReplenishmentPlanAudit**](ReplenishmentPlanApi.md#addReplenishmentPlanAudit) | **PUT** /beta/replenishmentPlan/{replenishmentPlanId}/audit/{replenishmentPlanAudit} | Add new audit for a replenishmentPlan
[**addReplenishmentPlanFile**](ReplenishmentPlanApi.md#addReplenishmentPlanFile) | **POST** /beta/replenishmentPlan/{replenishmentPlanId}/file/{fileName} | Attach a file to a replenishmentPlan
[**addReplenishmentPlanFileByURL**](ReplenishmentPlanApi.md#addReplenishmentPlanFileByURL) | **POST** /beta/replenishmentPlan/{replenishmentPlanId}/file | Attach a file to a replenishmentPlan by URL.
[**addReplenishmentPlanTag**](ReplenishmentPlanApi.md#addReplenishmentPlanTag) | **PUT** /beta/replenishmentPlan/{replenishmentPlanId}/tag/{replenishmentPlanTag} | Add new tags for a replenishmentPlan.
[**deleteReplenishmentPlan**](ReplenishmentPlanApi.md#deleteReplenishmentPlan) | **DELETE** /beta/replenishmentPlan/{replenishmentPlanId} | Delete a replenishmentPlan
[**deleteReplenishmentPlanFile**](ReplenishmentPlanApi.md#deleteReplenishmentPlanFile) | **DELETE** /beta/replenishmentPlan/{replenishmentPlanId}/file/{fileId} | Delete a file for a replenishmentPlan.
[**deleteReplenishmentPlanTag**](ReplenishmentPlanApi.md#deleteReplenishmentPlanTag) | **DELETE** /beta/replenishmentPlan/{replenishmentPlanId}/tag/{replenishmentPlanTag} | Delete a tag for a replenishmentPlan.
[**getDuplicateReplenishmentPlanById**](ReplenishmentPlanApi.md#getDuplicateReplenishmentPlanById) | **GET** /beta/replenishmentPlan/duplicate/{replenishmentPlanId} | Get a duplicated a replenishmentPlan by id
[**getReplenishmentPlanByFilter**](ReplenishmentPlanApi.md#getReplenishmentPlanByFilter) | **GET** /beta/replenishmentPlan/search | Search replenishmentPlans by filter
[**getReplenishmentPlanById**](ReplenishmentPlanApi.md#getReplenishmentPlanById) | **GET** /beta/replenishmentPlan/{replenishmentPlanId} | Get a replenishmentPlan by id
[**getReplenishmentPlanFiles**](ReplenishmentPlanApi.md#getReplenishmentPlanFiles) | **GET** /beta/replenishmentPlan/{replenishmentPlanId}/file | Get the files for a replenishmentPlan.
[**getReplenishmentPlanTags**](ReplenishmentPlanApi.md#getReplenishmentPlanTags) | **GET** /beta/replenishmentPlan/{replenishmentPlanId}/tag | Get the tags for a replenishmentPlan.
[**updateReplenishmentPlan**](ReplenishmentPlanApi.md#updateReplenishmentPlan) | **PUT** /beta/replenishmentPlan | Update a replenishmentPlan
[**updateReplenishmentPlanCustomFields**](ReplenishmentPlanApi.md#updateReplenishmentPlanCustomFields) | **PUT** /beta/replenishmentPlan/customFields | Update a replenishmentPlan custom fields


<a name="addReplenishmentPlan"></a>
# **addReplenishmentPlan**
> ReplenishmentPlan addReplenishmentPlan(body)

Create a replenishmentPlan

Inserts a new replenishmentPlan using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentPlanApi apiInstance = new ReplenishmentPlanApi();
ReplenishmentPlan body = new ReplenishmentPlan(); // ReplenishmentPlan | ReplenishmentPlan to be inserted.
try {
    ReplenishmentPlan result = apiInstance.addReplenishmentPlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentPlanApi#addReplenishmentPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReplenishmentPlan**](ReplenishmentPlan.md)| ReplenishmentPlan to be inserted. |

### Return type

[**ReplenishmentPlan**](ReplenishmentPlan.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addReplenishmentPlanAudit"></a>
# **addReplenishmentPlanAudit**
> addReplenishmentPlanAudit(replenishmentPlanId, replenishmentPlanAudit)

Add new audit for a replenishmentPlan

Adds an audit to an existing replenishmentPlan.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentPlanApi apiInstance = new ReplenishmentPlanApi();
Integer replenishmentPlanId = 56; // Integer | Id of the replenishmentPlan to add an audit to
String replenishmentPlanAudit = "replenishmentPlanAudit_example"; // String | The audit to add
try {
    apiInstance.addReplenishmentPlanAudit(replenishmentPlanId, replenishmentPlanAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentPlanApi#addReplenishmentPlanAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentPlanId** | **Integer**| Id of the replenishmentPlan to add an audit to |
 **replenishmentPlanAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addReplenishmentPlanFile"></a>
# **addReplenishmentPlanFile**
> addReplenishmentPlanFile(replenishmentPlanId, fileName)

Attach a file to a replenishmentPlan

Adds a file to an existing replenishmentPlan.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentPlanApi apiInstance = new ReplenishmentPlanApi();
Integer replenishmentPlanId = 56; // Integer | Id of the replenishmentPlan to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addReplenishmentPlanFile(replenishmentPlanId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentPlanApi#addReplenishmentPlanFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentPlanId** | **Integer**| Id of the replenishmentPlan to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addReplenishmentPlanFileByURL"></a>
# **addReplenishmentPlanFileByURL**
> addReplenishmentPlanFileByURL(body, replenishmentPlanId)

Attach a file to a replenishmentPlan by URL.

Adds a file to an existing replenishmentPlan by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentPlanApi apiInstance = new ReplenishmentPlanApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer replenishmentPlanId = 56; // Integer | Id of the replenishmentPlan to add an file to
try {
    apiInstance.addReplenishmentPlanFileByURL(body, replenishmentPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentPlanApi#addReplenishmentPlanFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **replenishmentPlanId** | **Integer**| Id of the replenishmentPlan to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addReplenishmentPlanTag"></a>
# **addReplenishmentPlanTag**
> addReplenishmentPlanTag(replenishmentPlanId, replenishmentPlanTag)

Add new tags for a replenishmentPlan.

Adds a tag to an existing replenishmentPlan.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentPlanApi apiInstance = new ReplenishmentPlanApi();
Integer replenishmentPlanId = 56; // Integer | Id of the replenishmentPlan to add a tag to
String replenishmentPlanTag = "replenishmentPlanTag_example"; // String | The tag to add
try {
    apiInstance.addReplenishmentPlanTag(replenishmentPlanId, replenishmentPlanTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentPlanApi#addReplenishmentPlanTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentPlanId** | **Integer**| Id of the replenishmentPlan to add a tag to |
 **replenishmentPlanTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReplenishmentPlan"></a>
# **deleteReplenishmentPlan**
> deleteReplenishmentPlan(replenishmentPlanId)

Delete a replenishmentPlan

Deletes the replenishmentPlan identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentPlanApi apiInstance = new ReplenishmentPlanApi();
Integer replenishmentPlanId = 56; // Integer | Id of the replenishmentPlan to be deleted.
try {
    apiInstance.deleteReplenishmentPlan(replenishmentPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentPlanApi#deleteReplenishmentPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentPlanId** | **Integer**| Id of the replenishmentPlan to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteReplenishmentPlanFile"></a>
# **deleteReplenishmentPlanFile**
> deleteReplenishmentPlanFile(replenishmentPlanId, fileId)

Delete a file for a replenishmentPlan.

Deletes an existing replenishmentPlan file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentPlanApi apiInstance = new ReplenishmentPlanApi();
Integer replenishmentPlanId = 56; // Integer | Id of the replenishmentPlan to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteReplenishmentPlanFile(replenishmentPlanId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentPlanApi#deleteReplenishmentPlanFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentPlanId** | **Integer**| Id of the replenishmentPlan to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteReplenishmentPlanTag"></a>
# **deleteReplenishmentPlanTag**
> deleteReplenishmentPlanTag(replenishmentPlanId, replenishmentPlanTag)

Delete a tag for a replenishmentPlan.

Deletes an existing replenishmentPlan tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentPlanApi apiInstance = new ReplenishmentPlanApi();
Integer replenishmentPlanId = 56; // Integer | Id of the replenishmentPlan to remove tag from
String replenishmentPlanTag = "replenishmentPlanTag_example"; // String | The tag to delete
try {
    apiInstance.deleteReplenishmentPlanTag(replenishmentPlanId, replenishmentPlanTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentPlanApi#deleteReplenishmentPlanTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentPlanId** | **Integer**| Id of the replenishmentPlan to remove tag from |
 **replenishmentPlanTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateReplenishmentPlanById"></a>
# **getDuplicateReplenishmentPlanById**
> ReplenishmentPlan getDuplicateReplenishmentPlanById(replenishmentPlanId)

Get a duplicated a replenishmentPlan by id

Returns a duplicated replenishmentPlan identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentPlanApi apiInstance = new ReplenishmentPlanApi();
Integer replenishmentPlanId = 56; // Integer | Id of the replenishmentPlan to be duplicated.
try {
    ReplenishmentPlan result = apiInstance.getDuplicateReplenishmentPlanById(replenishmentPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentPlanApi#getDuplicateReplenishmentPlanById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentPlanId** | **Integer**| Id of the replenishmentPlan to be duplicated. |

### Return type

[**ReplenishmentPlan**](ReplenishmentPlan.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReplenishmentPlanByFilter"></a>
# **getReplenishmentPlanByFilter**
> List&lt;ReplenishmentPlan&gt; getReplenishmentPlanByFilter(filter, page, limit, sort)

Search replenishmentPlans by filter

Returns the list of replenishmentPlans that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentPlanApi apiInstance = new ReplenishmentPlanApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ReplenishmentPlan> result = apiInstance.getReplenishmentPlanByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentPlanApi#getReplenishmentPlanByFilter");
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

[**List&lt;ReplenishmentPlan&gt;**](ReplenishmentPlan.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReplenishmentPlanById"></a>
# **getReplenishmentPlanById**
> ReplenishmentPlan getReplenishmentPlanById(replenishmentPlanId)

Get a replenishmentPlan by id

Returns the replenishmentPlan identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentPlanApi apiInstance = new ReplenishmentPlanApi();
Integer replenishmentPlanId = 56; // Integer | Id of the replenishmentPlan to be returned.
try {
    ReplenishmentPlan result = apiInstance.getReplenishmentPlanById(replenishmentPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentPlanApi#getReplenishmentPlanById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentPlanId** | **Integer**| Id of the replenishmentPlan to be returned. |

### Return type

[**ReplenishmentPlan**](ReplenishmentPlan.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReplenishmentPlanFiles"></a>
# **getReplenishmentPlanFiles**
> getReplenishmentPlanFiles(replenishmentPlanId)

Get the files for a replenishmentPlan.

Get all existing replenishmentPlan files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentPlanApi apiInstance = new ReplenishmentPlanApi();
Integer replenishmentPlanId = 56; // Integer | Id of the replenishmentPlan to get files for
try {
    apiInstance.getReplenishmentPlanFiles(replenishmentPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentPlanApi#getReplenishmentPlanFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentPlanId** | **Integer**| Id of the replenishmentPlan to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReplenishmentPlanTags"></a>
# **getReplenishmentPlanTags**
> getReplenishmentPlanTags(replenishmentPlanId)

Get the tags for a replenishmentPlan.

Get all existing replenishmentPlan tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentPlanApi apiInstance = new ReplenishmentPlanApi();
Integer replenishmentPlanId = 56; // Integer | Id of the replenishmentPlan to get tags for
try {
    apiInstance.getReplenishmentPlanTags(replenishmentPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentPlanApi#getReplenishmentPlanTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replenishmentPlanId** | **Integer**| Id of the replenishmentPlan to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateReplenishmentPlan"></a>
# **updateReplenishmentPlan**
> updateReplenishmentPlan(body)

Update a replenishmentPlan

Updates an existing replenishmentPlan using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentPlanApi apiInstance = new ReplenishmentPlanApi();
ReplenishmentPlan body = new ReplenishmentPlan(); // ReplenishmentPlan | ReplenishmentPlan to be updated.
try {
    apiInstance.updateReplenishmentPlan(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentPlanApi#updateReplenishmentPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReplenishmentPlan**](ReplenishmentPlan.md)| ReplenishmentPlan to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateReplenishmentPlanCustomFields"></a>
# **updateReplenishmentPlanCustomFields**
> updateReplenishmentPlanCustomFields(body)

Update a replenishmentPlan custom fields

Updates an existing replenishmentPlan custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReplenishmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReplenishmentPlanApi apiInstance = new ReplenishmentPlanApi();
ReplenishmentPlan body = new ReplenishmentPlan(); // ReplenishmentPlan | ReplenishmentPlan to be updated.
try {
    apiInstance.updateReplenishmentPlanCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentPlanApi#updateReplenishmentPlanCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReplenishmentPlan**](ReplenishmentPlan.md)| ReplenishmentPlan to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

