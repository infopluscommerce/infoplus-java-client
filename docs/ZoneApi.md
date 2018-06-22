# ZoneApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addZone**](ZoneApi.md#addZone) | **POST** /beta/zone | Create a zone
[**addZoneAudit**](ZoneApi.md#addZoneAudit) | **PUT** /beta/zone/{zoneId}/audit/{zoneAudit} | Add new audit for a zone
[**addZoneTag**](ZoneApi.md#addZoneTag) | **PUT** /beta/zone/{zoneId}/tag/{zoneTag} | Add new tags for a zone.
[**deleteZone**](ZoneApi.md#deleteZone) | **DELETE** /beta/zone/{zoneId} | Delete a zone
[**deleteZoneTag**](ZoneApi.md#deleteZoneTag) | **DELETE** /beta/zone/{zoneId}/tag/{zoneTag} | Delete a tag for a zone.
[**getDuplicateZoneById**](ZoneApi.md#getDuplicateZoneById) | **GET** /beta/zone/duplicate/{zoneId} | Get a duplicated a zone by id
[**getZoneByFilter**](ZoneApi.md#getZoneByFilter) | **GET** /beta/zone/search | Search zones by filter
[**getZoneById**](ZoneApi.md#getZoneById) | **GET** /beta/zone/{zoneId} | Get a zone by id
[**getZoneTags**](ZoneApi.md#getZoneTags) | **GET** /beta/zone/{zoneId}/tag | Get the tags for a zone.
[**updateZone**](ZoneApi.md#updateZone) | **PUT** /beta/zone | Update a zone
[**updateZoneCustomFields**](ZoneApi.md#updateZoneCustomFields) | **PUT** /beta/zone/customFields | Update a zone custom fields


<a name="addZone"></a>
# **addZone**
> Zone addZone(body)

Create a zone

Inserts a new zone using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZoneApi apiInstance = new ZoneApi();
Zone body = new Zone(); // Zone | Zone to be inserted.
try {
    Zone result = apiInstance.addZone(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#addZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Zone**](Zone.md)| Zone to be inserted. |

### Return type

[**Zone**](Zone.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addZoneAudit"></a>
# **addZoneAudit**
> addZoneAudit(zoneId, zoneAudit)

Add new audit for a zone

Adds an audit to an existing zone.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZoneApi apiInstance = new ZoneApi();
Integer zoneId = 56; // Integer | Id of the zone to add an audit to
String zoneAudit = "zoneAudit_example"; // String | The audit to add
try {
    apiInstance.addZoneAudit(zoneId, zoneAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#addZoneAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **Integer**| Id of the zone to add an audit to |
 **zoneAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addZoneTag"></a>
# **addZoneTag**
> addZoneTag(zoneId, zoneTag)

Add new tags for a zone.

Adds a tag to an existing zone.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZoneApi apiInstance = new ZoneApi();
Integer zoneId = 56; // Integer | Id of the zone to add a tag to
String zoneTag = "zoneTag_example"; // String | The tag to add
try {
    apiInstance.addZoneTag(zoneId, zoneTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#addZoneTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **Integer**| Id of the zone to add a tag to |
 **zoneTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteZone"></a>
# **deleteZone**
> deleteZone(zoneId)

Delete a zone

Deletes the zone identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZoneApi apiInstance = new ZoneApi();
Integer zoneId = 56; // Integer | Id of the zone to be deleted.
try {
    apiInstance.deleteZone(zoneId);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#deleteZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **Integer**| Id of the zone to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteZoneTag"></a>
# **deleteZoneTag**
> deleteZoneTag(zoneId, zoneTag)

Delete a tag for a zone.

Deletes an existing zone tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZoneApi apiInstance = new ZoneApi();
Integer zoneId = 56; // Integer | Id of the zone to remove tag from
String zoneTag = "zoneTag_example"; // String | The tag to delete
try {
    apiInstance.deleteZoneTag(zoneId, zoneTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#deleteZoneTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **Integer**| Id of the zone to remove tag from |
 **zoneTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateZoneById"></a>
# **getDuplicateZoneById**
> Zone getDuplicateZoneById(zoneId)

Get a duplicated a zone by id

Returns a duplicated zone identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZoneApi apiInstance = new ZoneApi();
Integer zoneId = 56; // Integer | Id of the zone to be duplicated.
try {
    Zone result = apiInstance.getDuplicateZoneById(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#getDuplicateZoneById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **Integer**| Id of the zone to be duplicated. |

### Return type

[**Zone**](Zone.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getZoneByFilter"></a>
# **getZoneByFilter**
> List&lt;Zone&gt; getZoneByFilter(filter, page, limit, sort)

Search zones by filter

Returns the list of zones that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZoneApi apiInstance = new ZoneApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Zone> result = apiInstance.getZoneByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#getZoneByFilter");
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

[**List&lt;Zone&gt;**](Zone.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getZoneById"></a>
# **getZoneById**
> Zone getZoneById(zoneId)

Get a zone by id

Returns the zone identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZoneApi apiInstance = new ZoneApi();
Integer zoneId = 56; // Integer | Id of the zone to be returned.
try {
    Zone result = apiInstance.getZoneById(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#getZoneById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **Integer**| Id of the zone to be returned. |

### Return type

[**Zone**](Zone.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getZoneTags"></a>
# **getZoneTags**
> getZoneTags(zoneId)

Get the tags for a zone.

Get all existing zone tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZoneApi apiInstance = new ZoneApi();
Integer zoneId = 56; // Integer | Id of the zone to get tags for
try {
    apiInstance.getZoneTags(zoneId);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#getZoneTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **Integer**| Id of the zone to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateZone"></a>
# **updateZone**
> updateZone(body)

Update a zone

Updates an existing zone using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZoneApi apiInstance = new ZoneApi();
Zone body = new Zone(); // Zone | Zone to be updated.
try {
    apiInstance.updateZone(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#updateZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Zone**](Zone.md)| Zone to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateZoneCustomFields"></a>
# **updateZoneCustomFields**
> updateZoneCustomFields(body)

Update a zone custom fields

Updates an existing zone custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ZoneApi apiInstance = new ZoneApi();
Zone body = new Zone(); // Zone | Zone to be updated.
try {
    apiInstance.updateZoneCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#updateZoneCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Zone**](Zone.md)| Zone to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

