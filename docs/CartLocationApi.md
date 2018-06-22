# CartLocationApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCartLocationAudit**](CartLocationApi.md#addCartLocationAudit) | **PUT** /beta/cartLocation/{cartLocationId}/audit/{cartLocationAudit} | Add new audit for a cartLocation
[**addCartLocationTag**](CartLocationApi.md#addCartLocationTag) | **PUT** /beta/cartLocation/{cartLocationId}/tag/{cartLocationTag} | Add new tags for a cartLocation.
[**deleteCartLocationTag**](CartLocationApi.md#deleteCartLocationTag) | **DELETE** /beta/cartLocation/{cartLocationId}/tag/{cartLocationTag} | Delete a tag for a cartLocation.
[**getCartLocationByFilter**](CartLocationApi.md#getCartLocationByFilter) | **GET** /beta/cartLocation/search | Search cartLocations by filter
[**getCartLocationById**](CartLocationApi.md#getCartLocationById) | **GET** /beta/cartLocation/{cartLocationId} | Get a cartLocation by id
[**getCartLocationTags**](CartLocationApi.md#getCartLocationTags) | **GET** /beta/cartLocation/{cartLocationId}/tag | Get the tags for a cartLocation.
[**getDuplicateCartLocationById**](CartLocationApi.md#getDuplicateCartLocationById) | **GET** /beta/cartLocation/duplicate/{cartLocationId} | Get a duplicated a cartLocation by id


<a name="addCartLocationAudit"></a>
# **addCartLocationAudit**
> addCartLocationAudit(cartLocationId, cartLocationAudit)

Add new audit for a cartLocation

Adds an audit to an existing cartLocation.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartLocationApi apiInstance = new CartLocationApi();
Integer cartLocationId = 56; // Integer | Id of the cartLocation to add an audit to
String cartLocationAudit = "cartLocationAudit_example"; // String | The audit to add
try {
    apiInstance.addCartLocationAudit(cartLocationId, cartLocationAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling CartLocationApi#addCartLocationAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartLocationId** | **Integer**| Id of the cartLocation to add an audit to |
 **cartLocationAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCartLocationTag"></a>
# **addCartLocationTag**
> addCartLocationTag(cartLocationId, cartLocationTag)

Add new tags for a cartLocation.

Adds a tag to an existing cartLocation.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartLocationApi apiInstance = new CartLocationApi();
Integer cartLocationId = 56; // Integer | Id of the cartLocation to add a tag to
String cartLocationTag = "cartLocationTag_example"; // String | The tag to add
try {
    apiInstance.addCartLocationTag(cartLocationId, cartLocationTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CartLocationApi#addCartLocationTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartLocationId** | **Integer**| Id of the cartLocation to add a tag to |
 **cartLocationTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCartLocationTag"></a>
# **deleteCartLocationTag**
> deleteCartLocationTag(cartLocationId, cartLocationTag)

Delete a tag for a cartLocation.

Deletes an existing cartLocation tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartLocationApi apiInstance = new CartLocationApi();
Integer cartLocationId = 56; // Integer | Id of the cartLocation to remove tag from
String cartLocationTag = "cartLocationTag_example"; // String | The tag to delete
try {
    apiInstance.deleteCartLocationTag(cartLocationId, cartLocationTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CartLocationApi#deleteCartLocationTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartLocationId** | **Integer**| Id of the cartLocation to remove tag from |
 **cartLocationTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartLocationByFilter"></a>
# **getCartLocationByFilter**
> List&lt;CartLocation&gt; getCartLocationByFilter(filter, page, limit, sort)

Search cartLocations by filter

Returns the list of cartLocations that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartLocationApi apiInstance = new CartLocationApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<CartLocation> result = apiInstance.getCartLocationByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartLocationApi#getCartLocationByFilter");
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

[**List&lt;CartLocation&gt;**](CartLocation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartLocationById"></a>
# **getCartLocationById**
> CartLocation getCartLocationById(cartLocationId)

Get a cartLocation by id

Returns the cartLocation identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartLocationApi apiInstance = new CartLocationApi();
Integer cartLocationId = 56; // Integer | Id of the cartLocation to be returned.
try {
    CartLocation result = apiInstance.getCartLocationById(cartLocationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartLocationApi#getCartLocationById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartLocationId** | **Integer**| Id of the cartLocation to be returned. |

### Return type

[**CartLocation**](CartLocation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartLocationTags"></a>
# **getCartLocationTags**
> getCartLocationTags(cartLocationId)

Get the tags for a cartLocation.

Get all existing cartLocation tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartLocationApi apiInstance = new CartLocationApi();
Integer cartLocationId = 56; // Integer | Id of the cartLocation to get tags for
try {
    apiInstance.getCartLocationTags(cartLocationId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartLocationApi#getCartLocationTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartLocationId** | **Integer**| Id of the cartLocation to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateCartLocationById"></a>
# **getDuplicateCartLocationById**
> CartLocation getDuplicateCartLocationById(cartLocationId)

Get a duplicated a cartLocation by id

Returns a duplicated cartLocation identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartLocationApi apiInstance = new CartLocationApi();
Integer cartLocationId = 56; // Integer | Id of the cartLocation to be duplicated.
try {
    CartLocation result = apiInstance.getDuplicateCartLocationById(cartLocationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartLocationApi#getDuplicateCartLocationById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartLocationId** | **Integer**| Id of the cartLocation to be duplicated. |

### Return type

[**CartLocation**](CartLocation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

