# ProductionLotApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProductionLot**](ProductionLotApi.md#addProductionLot) | **POST** /beta/productionLot | Create a productionLot
[**addProductionLotAudit**](ProductionLotApi.md#addProductionLotAudit) | **PUT** /beta/productionLot/{productionLotId}/audit/{productionLotAudit} | Add new audit for a productionLot
[**addProductionLotTag**](ProductionLotApi.md#addProductionLotTag) | **PUT** /beta/productionLot/{productionLotId}/tag/{productionLotTag} | Add new tags for a productionLot.
[**deleteProductionLot**](ProductionLotApi.md#deleteProductionLot) | **DELETE** /beta/productionLot/{productionLotId} | Delete a productionLot
[**deleteProductionLotTag**](ProductionLotApi.md#deleteProductionLotTag) | **DELETE** /beta/productionLot/{productionLotId}/tag/{productionLotTag} | Delete a tag for a productionLot.
[**getDuplicateProductionLotById**](ProductionLotApi.md#getDuplicateProductionLotById) | **GET** /beta/productionLot/duplicate/{productionLotId} | Get a duplicated a productionLot by id
[**getProductionLotByFilter**](ProductionLotApi.md#getProductionLotByFilter) | **GET** /beta/productionLot/search | Search productionLots by filter
[**getProductionLotById**](ProductionLotApi.md#getProductionLotById) | **GET** /beta/productionLot/{productionLotId} | Get a productionLot by id
[**getProductionLotTags**](ProductionLotApi.md#getProductionLotTags) | **GET** /beta/productionLot/{productionLotId}/tag | Get the tags for a productionLot.
[**updateProductionLot**](ProductionLotApi.md#updateProductionLot) | **PUT** /beta/productionLot | Update a productionLot
[**updateProductionLotCustomFields**](ProductionLotApi.md#updateProductionLotCustomFields) | **PUT** /beta/productionLot/customFields | Update a productionLot custom fields


<a name="addProductionLot"></a>
# **addProductionLot**
> ProductionLot addProductionLot(body)

Create a productionLot

Inserts a new productionLot using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionLotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionLotApi apiInstance = new ProductionLotApi();
ProductionLot body = new ProductionLot(); // ProductionLot | ProductionLot to be inserted.
try {
    ProductionLot result = apiInstance.addProductionLot(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionLotApi#addProductionLot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProductionLot**](ProductionLot.md)| ProductionLot to be inserted. |

### Return type

[**ProductionLot**](ProductionLot.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addProductionLotAudit"></a>
# **addProductionLotAudit**
> addProductionLotAudit(productionLotId, productionLotAudit)

Add new audit for a productionLot

Adds an audit to an existing productionLot.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionLotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionLotApi apiInstance = new ProductionLotApi();
Integer productionLotId = 56; // Integer | Id of the productionLot to add an audit to
String productionLotAudit = "productionLotAudit_example"; // String | The audit to add
try {
    apiInstance.addProductionLotAudit(productionLotId, productionLotAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionLotApi#addProductionLotAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productionLotId** | **Integer**| Id of the productionLot to add an audit to |
 **productionLotAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addProductionLotTag"></a>
# **addProductionLotTag**
> addProductionLotTag(productionLotId, productionLotTag)

Add new tags for a productionLot.

Adds a tag to an existing productionLot.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionLotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionLotApi apiInstance = new ProductionLotApi();
Integer productionLotId = 56; // Integer | Id of the productionLot to add a tag to
String productionLotTag = "productionLotTag_example"; // String | The tag to add
try {
    apiInstance.addProductionLotTag(productionLotId, productionLotTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionLotApi#addProductionLotTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productionLotId** | **Integer**| Id of the productionLot to add a tag to |
 **productionLotTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProductionLot"></a>
# **deleteProductionLot**
> deleteProductionLot(productionLotId)

Delete a productionLot

Deletes the productionLot identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionLotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionLotApi apiInstance = new ProductionLotApi();
Integer productionLotId = 56; // Integer | Id of the productionLot to be deleted.
try {
    apiInstance.deleteProductionLot(productionLotId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionLotApi#deleteProductionLot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productionLotId** | **Integer**| Id of the productionLot to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteProductionLotTag"></a>
# **deleteProductionLotTag**
> deleteProductionLotTag(productionLotId, productionLotTag)

Delete a tag for a productionLot.

Deletes an existing productionLot tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionLotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionLotApi apiInstance = new ProductionLotApi();
Integer productionLotId = 56; // Integer | Id of the productionLot to remove tag from
String productionLotTag = "productionLotTag_example"; // String | The tag to delete
try {
    apiInstance.deleteProductionLotTag(productionLotId, productionLotTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionLotApi#deleteProductionLotTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productionLotId** | **Integer**| Id of the productionLot to remove tag from |
 **productionLotTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateProductionLotById"></a>
# **getDuplicateProductionLotById**
> ProductionLot getDuplicateProductionLotById(productionLotId)

Get a duplicated a productionLot by id

Returns a duplicated productionLot identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionLotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionLotApi apiInstance = new ProductionLotApi();
Integer productionLotId = 56; // Integer | Id of the productionLot to be duplicated.
try {
    ProductionLot result = apiInstance.getDuplicateProductionLotById(productionLotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionLotApi#getDuplicateProductionLotById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productionLotId** | **Integer**| Id of the productionLot to be duplicated. |

### Return type

[**ProductionLot**](ProductionLot.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductionLotByFilter"></a>
# **getProductionLotByFilter**
> List&lt;ProductionLot&gt; getProductionLotByFilter(filter, page, limit, sort)

Search productionLots by filter

Returns the list of productionLots that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionLotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionLotApi apiInstance = new ProductionLotApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ProductionLot> result = apiInstance.getProductionLotByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionLotApi#getProductionLotByFilter");
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

[**List&lt;ProductionLot&gt;**](ProductionLot.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductionLotById"></a>
# **getProductionLotById**
> ProductionLot getProductionLotById(productionLotId)

Get a productionLot by id

Returns the productionLot identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionLotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionLotApi apiInstance = new ProductionLotApi();
Integer productionLotId = 56; // Integer | Id of the productionLot to be returned.
try {
    ProductionLot result = apiInstance.getProductionLotById(productionLotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionLotApi#getProductionLotById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productionLotId** | **Integer**| Id of the productionLot to be returned. |

### Return type

[**ProductionLot**](ProductionLot.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductionLotTags"></a>
# **getProductionLotTags**
> getProductionLotTags(productionLotId)

Get the tags for a productionLot.

Get all existing productionLot tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionLotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionLotApi apiInstance = new ProductionLotApi();
Integer productionLotId = 56; // Integer | Id of the productionLot to get tags for
try {
    apiInstance.getProductionLotTags(productionLotId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionLotApi#getProductionLotTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productionLotId** | **Integer**| Id of the productionLot to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProductionLot"></a>
# **updateProductionLot**
> updateProductionLot(body)

Update a productionLot

Updates an existing productionLot using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionLotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionLotApi apiInstance = new ProductionLotApi();
ProductionLot body = new ProductionLot(); // ProductionLot | ProductionLot to be updated.
try {
    apiInstance.updateProductionLot(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionLotApi#updateProductionLot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProductionLot**](ProductionLot.md)| ProductionLot to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProductionLotCustomFields"></a>
# **updateProductionLotCustomFields**
> updateProductionLotCustomFields(body)

Update a productionLot custom fields

Updates an existing productionLot custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionLotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionLotApi apiInstance = new ProductionLotApi();
ProductionLot body = new ProductionLot(); // ProductionLot | ProductionLot to be updated.
try {
    apiInstance.updateProductionLotCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionLotApi#updateProductionLotCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProductionLot**](ProductionLot.md)| ProductionLot to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

