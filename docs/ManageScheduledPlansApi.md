# ManageScheduledPlansApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addManageScheduledPlans**](ManageScheduledPlansApi.md#addManageScheduledPlans) | **POST** /beta/manageScheduledPlans | Create a manageScheduledPlans
[**addManageScheduledPlansAudit**](ManageScheduledPlansApi.md#addManageScheduledPlansAudit) | **PUT** /beta/manageScheduledPlans/{manageScheduledPlansId}/audit/{manageScheduledPlansAudit} | Add new audit for a manageScheduledPlans
[**addManageScheduledPlansFile**](ManageScheduledPlansApi.md#addManageScheduledPlansFile) | **POST** /beta/manageScheduledPlans/{manageScheduledPlansId}/file/{fileName} | Attach a file to a manageScheduledPlans
[**addManageScheduledPlansFileByURL**](ManageScheduledPlansApi.md#addManageScheduledPlansFileByURL) | **POST** /beta/manageScheduledPlans/{manageScheduledPlansId}/file | Attach a file to a manageScheduledPlans by URL.
[**addManageScheduledPlansTag**](ManageScheduledPlansApi.md#addManageScheduledPlansTag) | **PUT** /beta/manageScheduledPlans/{manageScheduledPlansId}/tag/{manageScheduledPlansTag} | Add new tags for a manageScheduledPlans.
[**deleteManageScheduledPlans**](ManageScheduledPlansApi.md#deleteManageScheduledPlans) | **DELETE** /beta/manageScheduledPlans/{manageScheduledPlansId} | Delete a manageScheduledPlans
[**deleteManageScheduledPlansFile**](ManageScheduledPlansApi.md#deleteManageScheduledPlansFile) | **DELETE** /beta/manageScheduledPlans/{manageScheduledPlansId}/file/{fileId} | Delete a file for a manageScheduledPlans.
[**deleteManageScheduledPlansTag**](ManageScheduledPlansApi.md#deleteManageScheduledPlansTag) | **DELETE** /beta/manageScheduledPlans/{manageScheduledPlansId}/tag/{manageScheduledPlansTag} | Delete a tag for a manageScheduledPlans.
[**getDuplicateManageScheduledPlansById**](ManageScheduledPlansApi.md#getDuplicateManageScheduledPlansById) | **GET** /beta/manageScheduledPlans/duplicate/{manageScheduledPlansId} | Get a duplicated a manageScheduledPlans by id
[**getManageScheduledPlansByFilter**](ManageScheduledPlansApi.md#getManageScheduledPlansByFilter) | **GET** /beta/manageScheduledPlans/search | Search manageScheduledPlanses by filter
[**getManageScheduledPlansById**](ManageScheduledPlansApi.md#getManageScheduledPlansById) | **GET** /beta/manageScheduledPlans/{manageScheduledPlansId} | Get a manageScheduledPlans by id
[**getManageScheduledPlansFiles**](ManageScheduledPlansApi.md#getManageScheduledPlansFiles) | **GET** /beta/manageScheduledPlans/{manageScheduledPlansId}/file | Get the files for a manageScheduledPlans.
[**getManageScheduledPlansTags**](ManageScheduledPlansApi.md#getManageScheduledPlansTags) | **GET** /beta/manageScheduledPlans/{manageScheduledPlansId}/tag | Get the tags for a manageScheduledPlans.
[**updateManageScheduledPlans**](ManageScheduledPlansApi.md#updateManageScheduledPlans) | **PUT** /beta/manageScheduledPlans | Update a manageScheduledPlans


<a name="addManageScheduledPlans"></a>
# **addManageScheduledPlans**
> ManageScheduledPlans addManageScheduledPlans(body)

Create a manageScheduledPlans

Inserts a new manageScheduledPlans using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ManageScheduledPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ManageScheduledPlansApi apiInstance = new ManageScheduledPlansApi();
ManageScheduledPlans body = new ManageScheduledPlans(); // ManageScheduledPlans | ManageScheduledPlans to be inserted.
try {
    ManageScheduledPlans result = apiInstance.addManageScheduledPlans(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageScheduledPlansApi#addManageScheduledPlans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ManageScheduledPlans**](ManageScheduledPlans.md)| ManageScheduledPlans to be inserted. |

### Return type

[**ManageScheduledPlans**](ManageScheduledPlans.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addManageScheduledPlansAudit"></a>
# **addManageScheduledPlansAudit**
> addManageScheduledPlansAudit(manageScheduledPlansId, manageScheduledPlansAudit)

Add new audit for a manageScheduledPlans

Adds an audit to an existing manageScheduledPlans.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ManageScheduledPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ManageScheduledPlansApi apiInstance = new ManageScheduledPlansApi();
Integer manageScheduledPlansId = 56; // Integer | Id of the manageScheduledPlans to add an audit to
String manageScheduledPlansAudit = "manageScheduledPlansAudit_example"; // String | The audit to add
try {
    apiInstance.addManageScheduledPlansAudit(manageScheduledPlansId, manageScheduledPlansAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageScheduledPlansApi#addManageScheduledPlansAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **manageScheduledPlansId** | **Integer**| Id of the manageScheduledPlans to add an audit to |
 **manageScheduledPlansAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addManageScheduledPlansFile"></a>
# **addManageScheduledPlansFile**
> addManageScheduledPlansFile(manageScheduledPlansId, fileName)

Attach a file to a manageScheduledPlans

Adds a file to an existing manageScheduledPlans.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ManageScheduledPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ManageScheduledPlansApi apiInstance = new ManageScheduledPlansApi();
Integer manageScheduledPlansId = 56; // Integer | Id of the manageScheduledPlans to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addManageScheduledPlansFile(manageScheduledPlansId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageScheduledPlansApi#addManageScheduledPlansFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **manageScheduledPlansId** | **Integer**| Id of the manageScheduledPlans to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addManageScheduledPlansFileByURL"></a>
# **addManageScheduledPlansFileByURL**
> addManageScheduledPlansFileByURL(body, manageScheduledPlansId)

Attach a file to a manageScheduledPlans by URL.

Adds a file to an existing manageScheduledPlans by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ManageScheduledPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ManageScheduledPlansApi apiInstance = new ManageScheduledPlansApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer manageScheduledPlansId = 56; // Integer | Id of the manageScheduledPlans to add an file to
try {
    apiInstance.addManageScheduledPlansFileByURL(body, manageScheduledPlansId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageScheduledPlansApi#addManageScheduledPlansFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **manageScheduledPlansId** | **Integer**| Id of the manageScheduledPlans to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addManageScheduledPlansTag"></a>
# **addManageScheduledPlansTag**
> addManageScheduledPlansTag(manageScheduledPlansId, manageScheduledPlansTag)

Add new tags for a manageScheduledPlans.

Adds a tag to an existing manageScheduledPlans.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ManageScheduledPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ManageScheduledPlansApi apiInstance = new ManageScheduledPlansApi();
Integer manageScheduledPlansId = 56; // Integer | Id of the manageScheduledPlans to add a tag to
String manageScheduledPlansTag = "manageScheduledPlansTag_example"; // String | The tag to add
try {
    apiInstance.addManageScheduledPlansTag(manageScheduledPlansId, manageScheduledPlansTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageScheduledPlansApi#addManageScheduledPlansTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **manageScheduledPlansId** | **Integer**| Id of the manageScheduledPlans to add a tag to |
 **manageScheduledPlansTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteManageScheduledPlans"></a>
# **deleteManageScheduledPlans**
> deleteManageScheduledPlans(manageScheduledPlansId)

Delete a manageScheduledPlans

Deletes the manageScheduledPlans identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ManageScheduledPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ManageScheduledPlansApi apiInstance = new ManageScheduledPlansApi();
Integer manageScheduledPlansId = 56; // Integer | Id of the manageScheduledPlans to be deleted.
try {
    apiInstance.deleteManageScheduledPlans(manageScheduledPlansId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageScheduledPlansApi#deleteManageScheduledPlans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **manageScheduledPlansId** | **Integer**| Id of the manageScheduledPlans to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteManageScheduledPlansFile"></a>
# **deleteManageScheduledPlansFile**
> deleteManageScheduledPlansFile(manageScheduledPlansId, fileId)

Delete a file for a manageScheduledPlans.

Deletes an existing manageScheduledPlans file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ManageScheduledPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ManageScheduledPlansApi apiInstance = new ManageScheduledPlansApi();
Integer manageScheduledPlansId = 56; // Integer | Id of the manageScheduledPlans to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteManageScheduledPlansFile(manageScheduledPlansId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageScheduledPlansApi#deleteManageScheduledPlansFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **manageScheduledPlansId** | **Integer**| Id of the manageScheduledPlans to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteManageScheduledPlansTag"></a>
# **deleteManageScheduledPlansTag**
> deleteManageScheduledPlansTag(manageScheduledPlansId, manageScheduledPlansTag)

Delete a tag for a manageScheduledPlans.

Deletes an existing manageScheduledPlans tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ManageScheduledPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ManageScheduledPlansApi apiInstance = new ManageScheduledPlansApi();
Integer manageScheduledPlansId = 56; // Integer | Id of the manageScheduledPlans to remove tag from
String manageScheduledPlansTag = "manageScheduledPlansTag_example"; // String | The tag to delete
try {
    apiInstance.deleteManageScheduledPlansTag(manageScheduledPlansId, manageScheduledPlansTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageScheduledPlansApi#deleteManageScheduledPlansTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **manageScheduledPlansId** | **Integer**| Id of the manageScheduledPlans to remove tag from |
 **manageScheduledPlansTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateManageScheduledPlansById"></a>
# **getDuplicateManageScheduledPlansById**
> ManageScheduledPlans getDuplicateManageScheduledPlansById(manageScheduledPlansId)

Get a duplicated a manageScheduledPlans by id

Returns a duplicated manageScheduledPlans identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ManageScheduledPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ManageScheduledPlansApi apiInstance = new ManageScheduledPlansApi();
Integer manageScheduledPlansId = 56; // Integer | Id of the manageScheduledPlans to be duplicated.
try {
    ManageScheduledPlans result = apiInstance.getDuplicateManageScheduledPlansById(manageScheduledPlansId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageScheduledPlansApi#getDuplicateManageScheduledPlansById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **manageScheduledPlansId** | **Integer**| Id of the manageScheduledPlans to be duplicated. |

### Return type

[**ManageScheduledPlans**](ManageScheduledPlans.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getManageScheduledPlansByFilter"></a>
# **getManageScheduledPlansByFilter**
> List&lt;ManageScheduledPlans&gt; getManageScheduledPlansByFilter(filter, page, limit, sort)

Search manageScheduledPlanses by filter

Returns the list of manageScheduledPlanses that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ManageScheduledPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ManageScheduledPlansApi apiInstance = new ManageScheduledPlansApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ManageScheduledPlans> result = apiInstance.getManageScheduledPlansByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageScheduledPlansApi#getManageScheduledPlansByFilter");
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

[**List&lt;ManageScheduledPlans&gt;**](ManageScheduledPlans.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getManageScheduledPlansById"></a>
# **getManageScheduledPlansById**
> ManageScheduledPlans getManageScheduledPlansById(manageScheduledPlansId)

Get a manageScheduledPlans by id

Returns the manageScheduledPlans identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ManageScheduledPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ManageScheduledPlansApi apiInstance = new ManageScheduledPlansApi();
Integer manageScheduledPlansId = 56; // Integer | Id of the manageScheduledPlans to be returned.
try {
    ManageScheduledPlans result = apiInstance.getManageScheduledPlansById(manageScheduledPlansId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageScheduledPlansApi#getManageScheduledPlansById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **manageScheduledPlansId** | **Integer**| Id of the manageScheduledPlans to be returned. |

### Return type

[**ManageScheduledPlans**](ManageScheduledPlans.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getManageScheduledPlansFiles"></a>
# **getManageScheduledPlansFiles**
> getManageScheduledPlansFiles(manageScheduledPlansId)

Get the files for a manageScheduledPlans.

Get all existing manageScheduledPlans files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ManageScheduledPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ManageScheduledPlansApi apiInstance = new ManageScheduledPlansApi();
Integer manageScheduledPlansId = 56; // Integer | Id of the manageScheduledPlans to get files for
try {
    apiInstance.getManageScheduledPlansFiles(manageScheduledPlansId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageScheduledPlansApi#getManageScheduledPlansFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **manageScheduledPlansId** | **Integer**| Id of the manageScheduledPlans to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getManageScheduledPlansTags"></a>
# **getManageScheduledPlansTags**
> getManageScheduledPlansTags(manageScheduledPlansId)

Get the tags for a manageScheduledPlans.

Get all existing manageScheduledPlans tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ManageScheduledPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ManageScheduledPlansApi apiInstance = new ManageScheduledPlansApi();
Integer manageScheduledPlansId = 56; // Integer | Id of the manageScheduledPlans to get tags for
try {
    apiInstance.getManageScheduledPlansTags(manageScheduledPlansId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageScheduledPlansApi#getManageScheduledPlansTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **manageScheduledPlansId** | **Integer**| Id of the manageScheduledPlans to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateManageScheduledPlans"></a>
# **updateManageScheduledPlans**
> updateManageScheduledPlans(body)

Update a manageScheduledPlans

Updates an existing manageScheduledPlans using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ManageScheduledPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ManageScheduledPlansApi apiInstance = new ManageScheduledPlansApi();
ManageScheduledPlans body = new ManageScheduledPlans(); // ManageScheduledPlans | ManageScheduledPlans to be updated.
try {
    apiInstance.updateManageScheduledPlans(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageScheduledPlansApi#updateManageScheduledPlans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ManageScheduledPlans**](ManageScheduledPlans.md)| ManageScheduledPlans to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

