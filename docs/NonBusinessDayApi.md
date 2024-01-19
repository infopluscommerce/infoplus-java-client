# NonBusinessDayApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNonBusinessDay**](NonBusinessDayApi.md#addNonBusinessDay) | **POST** /beta/nonBusinessDay | Create a nonBusinessDay
[**addNonBusinessDayAudit**](NonBusinessDayApi.md#addNonBusinessDayAudit) | **PUT** /beta/nonBusinessDay/{nonBusinessDayId}/audit/{nonBusinessDayAudit} | Add new audit for a nonBusinessDay
[**addNonBusinessDayFile**](NonBusinessDayApi.md#addNonBusinessDayFile) | **POST** /beta/nonBusinessDay/{nonBusinessDayId}/file/{fileName} | Attach a file to a nonBusinessDay
[**addNonBusinessDayFileByURL**](NonBusinessDayApi.md#addNonBusinessDayFileByURL) | **POST** /beta/nonBusinessDay/{nonBusinessDayId}/file | Attach a file to a nonBusinessDay by URL.
[**addNonBusinessDayTag**](NonBusinessDayApi.md#addNonBusinessDayTag) | **PUT** /beta/nonBusinessDay/{nonBusinessDayId}/tag/{nonBusinessDayTag} | Add new tags for a nonBusinessDay.
[**deleteNonBusinessDay**](NonBusinessDayApi.md#deleteNonBusinessDay) | **DELETE** /beta/nonBusinessDay/{nonBusinessDayId} | Delete a nonBusinessDay
[**deleteNonBusinessDayFile**](NonBusinessDayApi.md#deleteNonBusinessDayFile) | **DELETE** /beta/nonBusinessDay/{nonBusinessDayId}/file/{fileId} | Delete a file for a nonBusinessDay.
[**deleteNonBusinessDayTag**](NonBusinessDayApi.md#deleteNonBusinessDayTag) | **DELETE** /beta/nonBusinessDay/{nonBusinessDayId}/tag/{nonBusinessDayTag} | Delete a tag for a nonBusinessDay.
[**getDuplicateNonBusinessDayById**](NonBusinessDayApi.md#getDuplicateNonBusinessDayById) | **GET** /beta/nonBusinessDay/duplicate/{nonBusinessDayId} | Get a duplicated a nonBusinessDay by id
[**getNonBusinessDayByFilter**](NonBusinessDayApi.md#getNonBusinessDayByFilter) | **GET** /beta/nonBusinessDay/search | Search nonBusinessDays by filter
[**getNonBusinessDayById**](NonBusinessDayApi.md#getNonBusinessDayById) | **GET** /beta/nonBusinessDay/{nonBusinessDayId} | Get a nonBusinessDay by id
[**getNonBusinessDayFiles**](NonBusinessDayApi.md#getNonBusinessDayFiles) | **GET** /beta/nonBusinessDay/{nonBusinessDayId}/file | Get the files for a nonBusinessDay.
[**getNonBusinessDayTags**](NonBusinessDayApi.md#getNonBusinessDayTags) | **GET** /beta/nonBusinessDay/{nonBusinessDayId}/tag | Get the tags for a nonBusinessDay.
[**updateNonBusinessDay**](NonBusinessDayApi.md#updateNonBusinessDay) | **PUT** /beta/nonBusinessDay | Update a nonBusinessDay


<a name="addNonBusinessDay"></a>
# **addNonBusinessDay**
> NonBusinessDay addNonBusinessDay(body)

Create a nonBusinessDay

Inserts a new nonBusinessDay using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.NonBusinessDayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

NonBusinessDayApi apiInstance = new NonBusinessDayApi();
NonBusinessDay body = new NonBusinessDay(); // NonBusinessDay | NonBusinessDay to be inserted.
try {
    NonBusinessDay result = apiInstance.addNonBusinessDay(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NonBusinessDayApi#addNonBusinessDay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NonBusinessDay**](NonBusinessDay.md)| NonBusinessDay to be inserted. |

### Return type

[**NonBusinessDay**](NonBusinessDay.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addNonBusinessDayAudit"></a>
# **addNonBusinessDayAudit**
> addNonBusinessDayAudit(nonBusinessDayId, nonBusinessDayAudit)

Add new audit for a nonBusinessDay

Adds an audit to an existing nonBusinessDay.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.NonBusinessDayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

NonBusinessDayApi apiInstance = new NonBusinessDayApi();
Integer nonBusinessDayId = 56; // Integer | Id of the nonBusinessDay to add an audit to
String nonBusinessDayAudit = "nonBusinessDayAudit_example"; // String | The audit to add
try {
    apiInstance.addNonBusinessDayAudit(nonBusinessDayId, nonBusinessDayAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling NonBusinessDayApi#addNonBusinessDayAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nonBusinessDayId** | **Integer**| Id of the nonBusinessDay to add an audit to |
 **nonBusinessDayAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addNonBusinessDayFile"></a>
# **addNonBusinessDayFile**
> addNonBusinessDayFile(nonBusinessDayId, fileName)

Attach a file to a nonBusinessDay

Adds a file to an existing nonBusinessDay.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.NonBusinessDayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

NonBusinessDayApi apiInstance = new NonBusinessDayApi();
Integer nonBusinessDayId = 56; // Integer | Id of the nonBusinessDay to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addNonBusinessDayFile(nonBusinessDayId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling NonBusinessDayApi#addNonBusinessDayFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nonBusinessDayId** | **Integer**| Id of the nonBusinessDay to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addNonBusinessDayFileByURL"></a>
# **addNonBusinessDayFileByURL**
> addNonBusinessDayFileByURL(body, nonBusinessDayId)

Attach a file to a nonBusinessDay by URL.

Adds a file to an existing nonBusinessDay by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.NonBusinessDayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

NonBusinessDayApi apiInstance = new NonBusinessDayApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer nonBusinessDayId = 56; // Integer | Id of the nonBusinessDay to add an file to
try {
    apiInstance.addNonBusinessDayFileByURL(body, nonBusinessDayId);
} catch (ApiException e) {
    System.err.println("Exception when calling NonBusinessDayApi#addNonBusinessDayFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **nonBusinessDayId** | **Integer**| Id of the nonBusinessDay to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addNonBusinessDayTag"></a>
# **addNonBusinessDayTag**
> addNonBusinessDayTag(nonBusinessDayId, nonBusinessDayTag)

Add new tags for a nonBusinessDay.

Adds a tag to an existing nonBusinessDay.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.NonBusinessDayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

NonBusinessDayApi apiInstance = new NonBusinessDayApi();
Integer nonBusinessDayId = 56; // Integer | Id of the nonBusinessDay to add a tag to
String nonBusinessDayTag = "nonBusinessDayTag_example"; // String | The tag to add
try {
    apiInstance.addNonBusinessDayTag(nonBusinessDayId, nonBusinessDayTag);
} catch (ApiException e) {
    System.err.println("Exception when calling NonBusinessDayApi#addNonBusinessDayTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nonBusinessDayId** | **Integer**| Id of the nonBusinessDay to add a tag to |
 **nonBusinessDayTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNonBusinessDay"></a>
# **deleteNonBusinessDay**
> deleteNonBusinessDay(nonBusinessDayId)

Delete a nonBusinessDay

Deletes the nonBusinessDay identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.NonBusinessDayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

NonBusinessDayApi apiInstance = new NonBusinessDayApi();
Integer nonBusinessDayId = 56; // Integer | Id of the nonBusinessDay to be deleted.
try {
    apiInstance.deleteNonBusinessDay(nonBusinessDayId);
} catch (ApiException e) {
    System.err.println("Exception when calling NonBusinessDayApi#deleteNonBusinessDay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nonBusinessDayId** | **Integer**| Id of the nonBusinessDay to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteNonBusinessDayFile"></a>
# **deleteNonBusinessDayFile**
> deleteNonBusinessDayFile(nonBusinessDayId, fileId)

Delete a file for a nonBusinessDay.

Deletes an existing nonBusinessDay file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.NonBusinessDayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

NonBusinessDayApi apiInstance = new NonBusinessDayApi();
Integer nonBusinessDayId = 56; // Integer | Id of the nonBusinessDay to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteNonBusinessDayFile(nonBusinessDayId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling NonBusinessDayApi#deleteNonBusinessDayFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nonBusinessDayId** | **Integer**| Id of the nonBusinessDay to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteNonBusinessDayTag"></a>
# **deleteNonBusinessDayTag**
> deleteNonBusinessDayTag(nonBusinessDayId, nonBusinessDayTag)

Delete a tag for a nonBusinessDay.

Deletes an existing nonBusinessDay tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.NonBusinessDayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

NonBusinessDayApi apiInstance = new NonBusinessDayApi();
Integer nonBusinessDayId = 56; // Integer | Id of the nonBusinessDay to remove tag from
String nonBusinessDayTag = "nonBusinessDayTag_example"; // String | The tag to delete
try {
    apiInstance.deleteNonBusinessDayTag(nonBusinessDayId, nonBusinessDayTag);
} catch (ApiException e) {
    System.err.println("Exception when calling NonBusinessDayApi#deleteNonBusinessDayTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nonBusinessDayId** | **Integer**| Id of the nonBusinessDay to remove tag from |
 **nonBusinessDayTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateNonBusinessDayById"></a>
# **getDuplicateNonBusinessDayById**
> NonBusinessDay getDuplicateNonBusinessDayById(nonBusinessDayId)

Get a duplicated a nonBusinessDay by id

Returns a duplicated nonBusinessDay identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.NonBusinessDayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

NonBusinessDayApi apiInstance = new NonBusinessDayApi();
Integer nonBusinessDayId = 56; // Integer | Id of the nonBusinessDay to be duplicated.
try {
    NonBusinessDay result = apiInstance.getDuplicateNonBusinessDayById(nonBusinessDayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NonBusinessDayApi#getDuplicateNonBusinessDayById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nonBusinessDayId** | **Integer**| Id of the nonBusinessDay to be duplicated. |

### Return type

[**NonBusinessDay**](NonBusinessDay.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNonBusinessDayByFilter"></a>
# **getNonBusinessDayByFilter**
> List&lt;NonBusinessDay&gt; getNonBusinessDayByFilter(filter, page, limit, sort)

Search nonBusinessDays by filter

Returns the list of nonBusinessDays that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.NonBusinessDayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

NonBusinessDayApi apiInstance = new NonBusinessDayApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<NonBusinessDay> result = apiInstance.getNonBusinessDayByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NonBusinessDayApi#getNonBusinessDayByFilter");
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

[**List&lt;NonBusinessDay&gt;**](NonBusinessDay.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNonBusinessDayById"></a>
# **getNonBusinessDayById**
> NonBusinessDay getNonBusinessDayById(nonBusinessDayId)

Get a nonBusinessDay by id

Returns the nonBusinessDay identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.NonBusinessDayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

NonBusinessDayApi apiInstance = new NonBusinessDayApi();
Integer nonBusinessDayId = 56; // Integer | Id of the nonBusinessDay to be returned.
try {
    NonBusinessDay result = apiInstance.getNonBusinessDayById(nonBusinessDayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NonBusinessDayApi#getNonBusinessDayById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nonBusinessDayId** | **Integer**| Id of the nonBusinessDay to be returned. |

### Return type

[**NonBusinessDay**](NonBusinessDay.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNonBusinessDayFiles"></a>
# **getNonBusinessDayFiles**
> getNonBusinessDayFiles(nonBusinessDayId)

Get the files for a nonBusinessDay.

Get all existing nonBusinessDay files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.NonBusinessDayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

NonBusinessDayApi apiInstance = new NonBusinessDayApi();
Integer nonBusinessDayId = 56; // Integer | Id of the nonBusinessDay to get files for
try {
    apiInstance.getNonBusinessDayFiles(nonBusinessDayId);
} catch (ApiException e) {
    System.err.println("Exception when calling NonBusinessDayApi#getNonBusinessDayFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nonBusinessDayId** | **Integer**| Id of the nonBusinessDay to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNonBusinessDayTags"></a>
# **getNonBusinessDayTags**
> getNonBusinessDayTags(nonBusinessDayId)

Get the tags for a nonBusinessDay.

Get all existing nonBusinessDay tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.NonBusinessDayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

NonBusinessDayApi apiInstance = new NonBusinessDayApi();
Integer nonBusinessDayId = 56; // Integer | Id of the nonBusinessDay to get tags for
try {
    apiInstance.getNonBusinessDayTags(nonBusinessDayId);
} catch (ApiException e) {
    System.err.println("Exception when calling NonBusinessDayApi#getNonBusinessDayTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nonBusinessDayId** | **Integer**| Id of the nonBusinessDay to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateNonBusinessDay"></a>
# **updateNonBusinessDay**
> updateNonBusinessDay(body)

Update a nonBusinessDay

Updates an existing nonBusinessDay using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.NonBusinessDayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

NonBusinessDayApi apiInstance = new NonBusinessDayApi();
NonBusinessDay body = new NonBusinessDay(); // NonBusinessDay | NonBusinessDay to be updated.
try {
    apiInstance.updateNonBusinessDay(body);
} catch (ApiException e) {
    System.err.println("Exception when calling NonBusinessDayApi#updateNonBusinessDay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NonBusinessDay**](NonBusinessDay.md)| NonBusinessDay to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

