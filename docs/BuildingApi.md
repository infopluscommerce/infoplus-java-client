# BuildingApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBuilding**](BuildingApi.md#addBuilding) | **POST** /beta/building | Create a building
[**addBuildingAudit**](BuildingApi.md#addBuildingAudit) | **PUT** /beta/building/{buildingId}/audit/{buildingAudit} | Add new audit for a building
[**addBuildingTag**](BuildingApi.md#addBuildingTag) | **PUT** /beta/building/{buildingId}/tag/{buildingTag} | Add new tags for a building.
[**deleteBuilding**](BuildingApi.md#deleteBuilding) | **DELETE** /beta/building/{buildingId} | Delete a building
[**deleteBuildingTag**](BuildingApi.md#deleteBuildingTag) | **DELETE** /beta/building/{buildingId}/tag/{buildingTag} | Delete a tag for a building.
[**getBuildingByFilter**](BuildingApi.md#getBuildingByFilter) | **GET** /beta/building/search | Search buildings by filter
[**getBuildingById**](BuildingApi.md#getBuildingById) | **GET** /beta/building/{buildingId} | Get a building by id
[**getBuildingTags**](BuildingApi.md#getBuildingTags) | **GET** /beta/building/{buildingId}/tag | Get the tags for a building.
[**getDuplicateBuildingById**](BuildingApi.md#getDuplicateBuildingById) | **GET** /beta/building/duplicate/{buildingId} | Get a duplicated a building by id
[**updateBuilding**](BuildingApi.md#updateBuilding) | **PUT** /beta/building | Update a building
[**updateBuildingCustomFields**](BuildingApi.md#updateBuildingCustomFields) | **PUT** /beta/building/customFields | Update a building custom fields


<a name="addBuilding"></a>
# **addBuilding**
> Building addBuilding(body)

Create a building

Inserts a new building using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BuildingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BuildingApi apiInstance = new BuildingApi();
Building body = new Building(); // Building | Building to be inserted.
try {
    Building result = apiInstance.addBuilding(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildingApi#addBuilding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Building**](Building.md)| Building to be inserted. |

### Return type

[**Building**](Building.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addBuildingAudit"></a>
# **addBuildingAudit**
> addBuildingAudit(buildingId, buildingAudit)

Add new audit for a building

Adds an audit to an existing building.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BuildingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BuildingApi apiInstance = new BuildingApi();
Integer buildingId = 56; // Integer | Id of the building to add an audit to
String buildingAudit = "buildingAudit_example"; // String | The audit to add
try {
    apiInstance.addBuildingAudit(buildingId, buildingAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildingApi#addBuildingAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildingId** | **Integer**| Id of the building to add an audit to |
 **buildingAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addBuildingTag"></a>
# **addBuildingTag**
> addBuildingTag(buildingId, buildingTag)

Add new tags for a building.

Adds a tag to an existing building.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BuildingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BuildingApi apiInstance = new BuildingApi();
Integer buildingId = 56; // Integer | Id of the building to add a tag to
String buildingTag = "buildingTag_example"; // String | The tag to add
try {
    apiInstance.addBuildingTag(buildingId, buildingTag);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildingApi#addBuildingTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildingId** | **Integer**| Id of the building to add a tag to |
 **buildingTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBuilding"></a>
# **deleteBuilding**
> deleteBuilding(buildingId)

Delete a building

Deletes the building identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BuildingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BuildingApi apiInstance = new BuildingApi();
Integer buildingId = 56; // Integer | Id of the building to be deleted.
try {
    apiInstance.deleteBuilding(buildingId);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildingApi#deleteBuilding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildingId** | **Integer**| Id of the building to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuildingTag"></a>
# **deleteBuildingTag**
> deleteBuildingTag(buildingId, buildingTag)

Delete a tag for a building.

Deletes an existing building tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BuildingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BuildingApi apiInstance = new BuildingApi();
Integer buildingId = 56; // Integer | Id of the building to remove tag from
String buildingTag = "buildingTag_example"; // String | The tag to delete
try {
    apiInstance.deleteBuildingTag(buildingId, buildingTag);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildingApi#deleteBuildingTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildingId** | **Integer**| Id of the building to remove tag from |
 **buildingTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuildingByFilter"></a>
# **getBuildingByFilter**
> List&lt;Building&gt; getBuildingByFilter(filter, page, limit, sort)

Search buildings by filter

Returns the list of buildings that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BuildingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BuildingApi apiInstance = new BuildingApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Building> result = apiInstance.getBuildingByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildingApi#getBuildingByFilter");
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

[**List&lt;Building&gt;**](Building.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuildingById"></a>
# **getBuildingById**
> Building getBuildingById(buildingId)

Get a building by id

Returns the building identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BuildingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BuildingApi apiInstance = new BuildingApi();
Integer buildingId = 56; // Integer | Id of the building to be returned.
try {
    Building result = apiInstance.getBuildingById(buildingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildingApi#getBuildingById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildingId** | **Integer**| Id of the building to be returned. |

### Return type

[**Building**](Building.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuildingTags"></a>
# **getBuildingTags**
> getBuildingTags(buildingId)

Get the tags for a building.

Get all existing building tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BuildingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BuildingApi apiInstance = new BuildingApi();
Integer buildingId = 56; // Integer | Id of the building to get tags for
try {
    apiInstance.getBuildingTags(buildingId);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildingApi#getBuildingTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildingId** | **Integer**| Id of the building to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateBuildingById"></a>
# **getDuplicateBuildingById**
> Building getDuplicateBuildingById(buildingId)

Get a duplicated a building by id

Returns a duplicated building identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BuildingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BuildingApi apiInstance = new BuildingApi();
Integer buildingId = 56; // Integer | Id of the building to be duplicated.
try {
    Building result = apiInstance.getDuplicateBuildingById(buildingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildingApi#getDuplicateBuildingById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildingId** | **Integer**| Id of the building to be duplicated. |

### Return type

[**Building**](Building.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBuilding"></a>
# **updateBuilding**
> updateBuilding(body)

Update a building

Updates an existing building using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BuildingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BuildingApi apiInstance = new BuildingApi();
Building body = new Building(); // Building | Building to be updated.
try {
    apiInstance.updateBuilding(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildingApi#updateBuilding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Building**](Building.md)| Building to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBuildingCustomFields"></a>
# **updateBuildingCustomFields**
> updateBuildingCustomFields(body)

Update a building custom fields

Updates an existing building custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BuildingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BuildingApi apiInstance = new BuildingApi();
Building body = new Building(); // Building | Building to be updated.
try {
    apiInstance.updateBuildingCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildingApi#updateBuildingCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Building**](Building.md)| Building to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

