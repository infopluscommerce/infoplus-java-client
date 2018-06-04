# AlertApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAlertAudit**](AlertApi.md#addAlertAudit) | **PUT** /beta/alert/{alertId}/audit/{alertAudit} | Add new audit for an alert
[**addAlertTag**](AlertApi.md#addAlertTag) | **PUT** /beta/alert/{alertId}/tag/{alertTag} | Add new tags for an alert.
[**deleteAlertTag**](AlertApi.md#deleteAlertTag) | **DELETE** /beta/alert/{alertId}/tag/{alertTag} | Delete a tag for an alert.
[**getAlertByFilter**](AlertApi.md#getAlertByFilter) | **GET** /beta/alert/search | Search alerts by filter
[**getAlertById**](AlertApi.md#getAlertById) | **GET** /beta/alert/{alertId} | Get an alert by id
[**getAlertTags**](AlertApi.md#getAlertTags) | **GET** /beta/alert/{alertId}/tag | Get the tags for an alert.
[**getDuplicateAlertById**](AlertApi.md#getDuplicateAlertById) | **GET** /beta/alert/duplicate/{alertId} | Get a duplicated an alert by id
[**updateAlertCustomFields**](AlertApi.md#updateAlertCustomFields) | **PUT** /beta/alert/customFields | Update an alert custom fields


<a name="addAlertAudit"></a>
# **addAlertAudit**
> addAlertAudit(alertId, alertAudit)

Add new audit for an alert

Adds an audit to an existing alert.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AlertApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertApi apiInstance = new AlertApi();
Integer alertId = 56; // Integer | Id of the alert to add an audit to
String alertAudit = "alertAudit_example"; // String | The audit to add
try {
    apiInstance.addAlertAudit(alertId, alertAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertApi#addAlertAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertId** | **Integer**| Id of the alert to add an audit to |
 **alertAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addAlertTag"></a>
# **addAlertTag**
> addAlertTag(alertId, alertTag)

Add new tags for an alert.

Adds a tag to an existing alert.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AlertApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertApi apiInstance = new AlertApi();
Integer alertId = 56; // Integer | Id of the alert to add a tag to
String alertTag = "alertTag_example"; // String | The tag to add
try {
    apiInstance.addAlertTag(alertId, alertTag);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertApi#addAlertTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertId** | **Integer**| Id of the alert to add a tag to |
 **alertTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAlertTag"></a>
# **deleteAlertTag**
> deleteAlertTag(alertId, alertTag)

Delete a tag for an alert.

Deletes an existing alert tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AlertApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertApi apiInstance = new AlertApi();
Integer alertId = 56; // Integer | Id of the alert to remove tag from
String alertTag = "alertTag_example"; // String | The tag to delete
try {
    apiInstance.deleteAlertTag(alertId, alertTag);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertApi#deleteAlertTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertId** | **Integer**| Id of the alert to remove tag from |
 **alertTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAlertByFilter"></a>
# **getAlertByFilter**
> List&lt;Alert&gt; getAlertByFilter(filter, page, limit, sort)

Search alerts by filter

Returns the list of alerts that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AlertApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertApi apiInstance = new AlertApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Alert> result = apiInstance.getAlertByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertApi#getAlertByFilter");
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

[**List&lt;Alert&gt;**](Alert.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAlertById"></a>
# **getAlertById**
> Alert getAlertById(alertId)

Get an alert by id

Returns the alert identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AlertApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertApi apiInstance = new AlertApi();
Integer alertId = 56; // Integer | Id of the alert to be returned.
try {
    Alert result = apiInstance.getAlertById(alertId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertApi#getAlertById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertId** | **Integer**| Id of the alert to be returned. |

### Return type

[**Alert**](Alert.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAlertTags"></a>
# **getAlertTags**
> getAlertTags(alertId)

Get the tags for an alert.

Get all existing alert tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AlertApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertApi apiInstance = new AlertApi();
Integer alertId = 56; // Integer | Id of the alert to get tags for
try {
    apiInstance.getAlertTags(alertId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertApi#getAlertTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertId** | **Integer**| Id of the alert to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateAlertById"></a>
# **getDuplicateAlertById**
> Alert getDuplicateAlertById(alertId)

Get a duplicated an alert by id

Returns a duplicated alert identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AlertApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertApi apiInstance = new AlertApi();
Integer alertId = 56; // Integer | Id of the alert to be duplicated.
try {
    Alert result = apiInstance.getDuplicateAlertById(alertId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertApi#getDuplicateAlertById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertId** | **Integer**| Id of the alert to be duplicated. |

### Return type

[**Alert**](Alert.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAlertCustomFields"></a>
# **updateAlertCustomFields**
> updateAlertCustomFields(body)

Update an alert custom fields

Updates an existing alert custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AlertApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertApi apiInstance = new AlertApi();
Alert body = new Alert(); // Alert | Alert to be updated.
try {
    apiInstance.updateAlertCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertApi#updateAlertCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Alert**](Alert.md)| Alert to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

