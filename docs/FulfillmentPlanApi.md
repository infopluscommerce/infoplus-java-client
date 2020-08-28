# FulfillmentPlanApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFulfillmentPlan**](FulfillmentPlanApi.md#addFulfillmentPlan) | **POST** /beta/fulfillmentPlan | Create a fulfillmentPlan
[**addFulfillmentPlanAudit**](FulfillmentPlanApi.md#addFulfillmentPlanAudit) | **PUT** /beta/fulfillmentPlan/{fulfillmentPlanId}/audit/{fulfillmentPlanAudit} | Add new audit for a fulfillmentPlan
[**addFulfillmentPlanFile**](FulfillmentPlanApi.md#addFulfillmentPlanFile) | **POST** /beta/fulfillmentPlan/{fulfillmentPlanId}/file/{fileName} | Attach a file to a fulfillmentPlan
[**addFulfillmentPlanFileByURL**](FulfillmentPlanApi.md#addFulfillmentPlanFileByURL) | **POST** /beta/fulfillmentPlan/{fulfillmentPlanId}/file | Attach a file to a fulfillmentPlan by URL.
[**addFulfillmentPlanTag**](FulfillmentPlanApi.md#addFulfillmentPlanTag) | **PUT** /beta/fulfillmentPlan/{fulfillmentPlanId}/tag/{fulfillmentPlanTag} | Add new tags for a fulfillmentPlan.
[**deleteFulfillmentPlan**](FulfillmentPlanApi.md#deleteFulfillmentPlan) | **DELETE** /beta/fulfillmentPlan/{fulfillmentPlanId} | Delete a fulfillmentPlan
[**deleteFulfillmentPlanFile**](FulfillmentPlanApi.md#deleteFulfillmentPlanFile) | **DELETE** /beta/fulfillmentPlan/{fulfillmentPlanId}/file/{fileId} | Delete a file for a fulfillmentPlan.
[**deleteFulfillmentPlanTag**](FulfillmentPlanApi.md#deleteFulfillmentPlanTag) | **DELETE** /beta/fulfillmentPlan/{fulfillmentPlanId}/tag/{fulfillmentPlanTag} | Delete a tag for a fulfillmentPlan.
[**getDuplicateFulfillmentPlanById**](FulfillmentPlanApi.md#getDuplicateFulfillmentPlanById) | **GET** /beta/fulfillmentPlan/duplicate/{fulfillmentPlanId} | Get a duplicated a fulfillmentPlan by id
[**getFulfillmentPlanByFilter**](FulfillmentPlanApi.md#getFulfillmentPlanByFilter) | **GET** /beta/fulfillmentPlan/search | Search fulfillmentPlans by filter
[**getFulfillmentPlanById**](FulfillmentPlanApi.md#getFulfillmentPlanById) | **GET** /beta/fulfillmentPlan/{fulfillmentPlanId} | Get a fulfillmentPlan by id
[**getFulfillmentPlanFiles**](FulfillmentPlanApi.md#getFulfillmentPlanFiles) | **GET** /beta/fulfillmentPlan/{fulfillmentPlanId}/file | Get the files for a fulfillmentPlan.
[**getFulfillmentPlanTags**](FulfillmentPlanApi.md#getFulfillmentPlanTags) | **GET** /beta/fulfillmentPlan/{fulfillmentPlanId}/tag | Get the tags for a fulfillmentPlan.
[**updateFulfillmentPlan**](FulfillmentPlanApi.md#updateFulfillmentPlan) | **PUT** /beta/fulfillmentPlan | Update a fulfillmentPlan
[**updateFulfillmentPlanCustomFields**](FulfillmentPlanApi.md#updateFulfillmentPlanCustomFields) | **PUT** /beta/fulfillmentPlan/customFields | Update a fulfillmentPlan custom fields


<a name="addFulfillmentPlan"></a>
# **addFulfillmentPlan**
> FulfillmentPlan addFulfillmentPlan(body)

Create a fulfillmentPlan

Inserts a new fulfillmentPlan using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentPlanApi apiInstance = new FulfillmentPlanApi();
FulfillmentPlan body = new FulfillmentPlan(); // FulfillmentPlan | FulfillmentPlan to be inserted.
try {
    FulfillmentPlan result = apiInstance.addFulfillmentPlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentPlanApi#addFulfillmentPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FulfillmentPlan**](FulfillmentPlan.md)| FulfillmentPlan to be inserted. |

### Return type

[**FulfillmentPlan**](FulfillmentPlan.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addFulfillmentPlanAudit"></a>
# **addFulfillmentPlanAudit**
> addFulfillmentPlanAudit(fulfillmentPlanId, fulfillmentPlanAudit)

Add new audit for a fulfillmentPlan

Adds an audit to an existing fulfillmentPlan.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentPlanApi apiInstance = new FulfillmentPlanApi();
Integer fulfillmentPlanId = 56; // Integer | Id of the fulfillmentPlan to add an audit to
String fulfillmentPlanAudit = "fulfillmentPlanAudit_example"; // String | The audit to add
try {
    apiInstance.addFulfillmentPlanAudit(fulfillmentPlanId, fulfillmentPlanAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentPlanApi#addFulfillmentPlanAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentPlanId** | **Integer**| Id of the fulfillmentPlan to add an audit to |
 **fulfillmentPlanAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addFulfillmentPlanFile"></a>
# **addFulfillmentPlanFile**
> addFulfillmentPlanFile(fulfillmentPlanId, fileName)

Attach a file to a fulfillmentPlan

Adds a file to an existing fulfillmentPlan.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentPlanApi apiInstance = new FulfillmentPlanApi();
Integer fulfillmentPlanId = 56; // Integer | Id of the fulfillmentPlan to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addFulfillmentPlanFile(fulfillmentPlanId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentPlanApi#addFulfillmentPlanFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentPlanId** | **Integer**| Id of the fulfillmentPlan to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addFulfillmentPlanFileByURL"></a>
# **addFulfillmentPlanFileByURL**
> addFulfillmentPlanFileByURL(body, fulfillmentPlanId)

Attach a file to a fulfillmentPlan by URL.

Adds a file to an existing fulfillmentPlan by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentPlanApi apiInstance = new FulfillmentPlanApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer fulfillmentPlanId = 56; // Integer | Id of the fulfillmentPlan to add an file to
try {
    apiInstance.addFulfillmentPlanFileByURL(body, fulfillmentPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentPlanApi#addFulfillmentPlanFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **fulfillmentPlanId** | **Integer**| Id of the fulfillmentPlan to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addFulfillmentPlanTag"></a>
# **addFulfillmentPlanTag**
> addFulfillmentPlanTag(fulfillmentPlanId, fulfillmentPlanTag)

Add new tags for a fulfillmentPlan.

Adds a tag to an existing fulfillmentPlan.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentPlanApi apiInstance = new FulfillmentPlanApi();
Integer fulfillmentPlanId = 56; // Integer | Id of the fulfillmentPlan to add a tag to
String fulfillmentPlanTag = "fulfillmentPlanTag_example"; // String | The tag to add
try {
    apiInstance.addFulfillmentPlanTag(fulfillmentPlanId, fulfillmentPlanTag);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentPlanApi#addFulfillmentPlanTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentPlanId** | **Integer**| Id of the fulfillmentPlan to add a tag to |
 **fulfillmentPlanTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFulfillmentPlan"></a>
# **deleteFulfillmentPlan**
> deleteFulfillmentPlan(fulfillmentPlanId)

Delete a fulfillmentPlan

Deletes the fulfillmentPlan identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentPlanApi apiInstance = new FulfillmentPlanApi();
Integer fulfillmentPlanId = 56; // Integer | Id of the fulfillmentPlan to be deleted.
try {
    apiInstance.deleteFulfillmentPlan(fulfillmentPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentPlanApi#deleteFulfillmentPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentPlanId** | **Integer**| Id of the fulfillmentPlan to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteFulfillmentPlanFile"></a>
# **deleteFulfillmentPlanFile**
> deleteFulfillmentPlanFile(fulfillmentPlanId, fileId)

Delete a file for a fulfillmentPlan.

Deletes an existing fulfillmentPlan file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentPlanApi apiInstance = new FulfillmentPlanApi();
Integer fulfillmentPlanId = 56; // Integer | Id of the fulfillmentPlan to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteFulfillmentPlanFile(fulfillmentPlanId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentPlanApi#deleteFulfillmentPlanFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentPlanId** | **Integer**| Id of the fulfillmentPlan to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteFulfillmentPlanTag"></a>
# **deleteFulfillmentPlanTag**
> deleteFulfillmentPlanTag(fulfillmentPlanId, fulfillmentPlanTag)

Delete a tag for a fulfillmentPlan.

Deletes an existing fulfillmentPlan tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentPlanApi apiInstance = new FulfillmentPlanApi();
Integer fulfillmentPlanId = 56; // Integer | Id of the fulfillmentPlan to remove tag from
String fulfillmentPlanTag = "fulfillmentPlanTag_example"; // String | The tag to delete
try {
    apiInstance.deleteFulfillmentPlanTag(fulfillmentPlanId, fulfillmentPlanTag);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentPlanApi#deleteFulfillmentPlanTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentPlanId** | **Integer**| Id of the fulfillmentPlan to remove tag from |
 **fulfillmentPlanTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateFulfillmentPlanById"></a>
# **getDuplicateFulfillmentPlanById**
> FulfillmentPlan getDuplicateFulfillmentPlanById(fulfillmentPlanId)

Get a duplicated a fulfillmentPlan by id

Returns a duplicated fulfillmentPlan identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentPlanApi apiInstance = new FulfillmentPlanApi();
Integer fulfillmentPlanId = 56; // Integer | Id of the fulfillmentPlan to be duplicated.
try {
    FulfillmentPlan result = apiInstance.getDuplicateFulfillmentPlanById(fulfillmentPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentPlanApi#getDuplicateFulfillmentPlanById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentPlanId** | **Integer**| Id of the fulfillmentPlan to be duplicated. |

### Return type

[**FulfillmentPlan**](FulfillmentPlan.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFulfillmentPlanByFilter"></a>
# **getFulfillmentPlanByFilter**
> List&lt;FulfillmentPlan&gt; getFulfillmentPlanByFilter(filter, page, limit, sort)

Search fulfillmentPlans by filter

Returns the list of fulfillmentPlans that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentPlanApi apiInstance = new FulfillmentPlanApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<FulfillmentPlan> result = apiInstance.getFulfillmentPlanByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentPlanApi#getFulfillmentPlanByFilter");
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

[**List&lt;FulfillmentPlan&gt;**](FulfillmentPlan.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFulfillmentPlanById"></a>
# **getFulfillmentPlanById**
> FulfillmentPlan getFulfillmentPlanById(fulfillmentPlanId)

Get a fulfillmentPlan by id

Returns the fulfillmentPlan identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentPlanApi apiInstance = new FulfillmentPlanApi();
Integer fulfillmentPlanId = 56; // Integer | Id of the fulfillmentPlan to be returned.
try {
    FulfillmentPlan result = apiInstance.getFulfillmentPlanById(fulfillmentPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentPlanApi#getFulfillmentPlanById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentPlanId** | **Integer**| Id of the fulfillmentPlan to be returned. |

### Return type

[**FulfillmentPlan**](FulfillmentPlan.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFulfillmentPlanFiles"></a>
# **getFulfillmentPlanFiles**
> getFulfillmentPlanFiles(fulfillmentPlanId)

Get the files for a fulfillmentPlan.

Get all existing fulfillmentPlan files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentPlanApi apiInstance = new FulfillmentPlanApi();
Integer fulfillmentPlanId = 56; // Integer | Id of the fulfillmentPlan to get files for
try {
    apiInstance.getFulfillmentPlanFiles(fulfillmentPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentPlanApi#getFulfillmentPlanFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentPlanId** | **Integer**| Id of the fulfillmentPlan to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFulfillmentPlanTags"></a>
# **getFulfillmentPlanTags**
> getFulfillmentPlanTags(fulfillmentPlanId)

Get the tags for a fulfillmentPlan.

Get all existing fulfillmentPlan tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentPlanApi apiInstance = new FulfillmentPlanApi();
Integer fulfillmentPlanId = 56; // Integer | Id of the fulfillmentPlan to get tags for
try {
    apiInstance.getFulfillmentPlanTags(fulfillmentPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentPlanApi#getFulfillmentPlanTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentPlanId** | **Integer**| Id of the fulfillmentPlan to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFulfillmentPlan"></a>
# **updateFulfillmentPlan**
> updateFulfillmentPlan(body)

Update a fulfillmentPlan

Updates an existing fulfillmentPlan using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentPlanApi apiInstance = new FulfillmentPlanApi();
FulfillmentPlan body = new FulfillmentPlan(); // FulfillmentPlan | FulfillmentPlan to be updated.
try {
    apiInstance.updateFulfillmentPlan(body);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentPlanApi#updateFulfillmentPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FulfillmentPlan**](FulfillmentPlan.md)| FulfillmentPlan to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFulfillmentPlanCustomFields"></a>
# **updateFulfillmentPlanCustomFields**
> updateFulfillmentPlanCustomFields(body)

Update a fulfillmentPlan custom fields

Updates an existing fulfillmentPlan custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentPlanApi apiInstance = new FulfillmentPlanApi();
FulfillmentPlan body = new FulfillmentPlan(); // FulfillmentPlan | FulfillmentPlan to be updated.
try {
    apiInstance.updateFulfillmentPlanCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentPlanApi#updateFulfillmentPlanCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FulfillmentPlan**](FulfillmentPlan.md)| FulfillmentPlan to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

