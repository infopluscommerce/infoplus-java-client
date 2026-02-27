# ProductChargesApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProductCharges**](ProductChargesApi.md#addProductCharges) | **POST** /beta/productCharges | Create a productCharges
[**addProductChargesAudit**](ProductChargesApi.md#addProductChargesAudit) | **PUT** /beta/productCharges/{productChargesId}/audit/{productChargesAudit} | Add new audit for a productCharges
[**addProductChargesFile**](ProductChargesApi.md#addProductChargesFile) | **POST** /beta/productCharges/{productChargesId}/file/{fileName} | Attach a file to a productCharges
[**addProductChargesFileByURL**](ProductChargesApi.md#addProductChargesFileByURL) | **POST** /beta/productCharges/{productChargesId}/file | Attach a file to a productCharges by URL.
[**addProductChargesTag**](ProductChargesApi.md#addProductChargesTag) | **PUT** /beta/productCharges/{productChargesId}/tag/{productChargesTag} | Add new tags for a productCharges.
[**deleteProductCharges**](ProductChargesApi.md#deleteProductCharges) | **DELETE** /beta/productCharges/{productChargesId} | Delete a productCharges
[**deleteProductChargesFile**](ProductChargesApi.md#deleteProductChargesFile) | **DELETE** /beta/productCharges/{productChargesId}/file/{fileId} | Delete a file for a productCharges.
[**deleteProductChargesTag**](ProductChargesApi.md#deleteProductChargesTag) | **DELETE** /beta/productCharges/{productChargesId}/tag/{productChargesTag} | Delete a tag for a productCharges.
[**getDuplicateProductChargesById**](ProductChargesApi.md#getDuplicateProductChargesById) | **GET** /beta/productCharges/duplicate/{productChargesId} | Get a duplicated a productCharges by id
[**getProductChargesByFilter**](ProductChargesApi.md#getProductChargesByFilter) | **GET** /beta/productCharges/search | Search productChargeses by filter
[**getProductChargesById**](ProductChargesApi.md#getProductChargesById) | **GET** /beta/productCharges/{productChargesId} | Get a productCharges by id
[**getProductChargesFiles**](ProductChargesApi.md#getProductChargesFiles) | **GET** /beta/productCharges/{productChargesId}/file | Get the files for a productCharges.
[**getProductChargesTags**](ProductChargesApi.md#getProductChargesTags) | **GET** /beta/productCharges/{productChargesId}/tag | Get the tags for a productCharges.
[**updateProductCharges**](ProductChargesApi.md#updateProductCharges) | **PUT** /beta/productCharges | Update a productCharges


<a name="addProductCharges"></a>
# **addProductCharges**
> ProductCharges addProductCharges(body)

Create a productCharges

Inserts a new productCharges using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductChargesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductChargesApi apiInstance = new ProductChargesApi();
ProductCharges body = new ProductCharges(); // ProductCharges | ProductCharges to be inserted.
try {
    ProductCharges result = apiInstance.addProductCharges(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductChargesApi#addProductCharges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProductCharges**](ProductCharges.md)| ProductCharges to be inserted. |

### Return type

[**ProductCharges**](ProductCharges.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addProductChargesAudit"></a>
# **addProductChargesAudit**
> addProductChargesAudit(productChargesId, productChargesAudit)

Add new audit for a productCharges

Adds an audit to an existing productCharges.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductChargesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductChargesApi apiInstance = new ProductChargesApi();
Integer productChargesId = 56; // Integer | Id of the productCharges to add an audit to
String productChargesAudit = "productChargesAudit_example"; // String | The audit to add
try {
    apiInstance.addProductChargesAudit(productChargesId, productChargesAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductChargesApi#addProductChargesAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productChargesId** | **Integer**| Id of the productCharges to add an audit to |
 **productChargesAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addProductChargesFile"></a>
# **addProductChargesFile**
> addProductChargesFile(productChargesId, fileName)

Attach a file to a productCharges

Adds a file to an existing productCharges.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductChargesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductChargesApi apiInstance = new ProductChargesApi();
Integer productChargesId = 56; // Integer | Id of the productCharges to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addProductChargesFile(productChargesId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductChargesApi#addProductChargesFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productChargesId** | **Integer**| Id of the productCharges to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addProductChargesFileByURL"></a>
# **addProductChargesFileByURL**
> addProductChargesFileByURL(body, productChargesId)

Attach a file to a productCharges by URL.

Adds a file to an existing productCharges by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductChargesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductChargesApi apiInstance = new ProductChargesApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer productChargesId = 56; // Integer | Id of the productCharges to add an file to
try {
    apiInstance.addProductChargesFileByURL(body, productChargesId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductChargesApi#addProductChargesFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **productChargesId** | **Integer**| Id of the productCharges to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addProductChargesTag"></a>
# **addProductChargesTag**
> addProductChargesTag(productChargesId, productChargesTag)

Add new tags for a productCharges.

Adds a tag to an existing productCharges.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductChargesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductChargesApi apiInstance = new ProductChargesApi();
Integer productChargesId = 56; // Integer | Id of the productCharges to add a tag to
String productChargesTag = "productChargesTag_example"; // String | The tag to add
try {
    apiInstance.addProductChargesTag(productChargesId, productChargesTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductChargesApi#addProductChargesTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productChargesId** | **Integer**| Id of the productCharges to add a tag to |
 **productChargesTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProductCharges"></a>
# **deleteProductCharges**
> deleteProductCharges(productChargesId)

Delete a productCharges

Deletes the productCharges identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductChargesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductChargesApi apiInstance = new ProductChargesApi();
Integer productChargesId = 56; // Integer | Id of the productCharges to be deleted.
try {
    apiInstance.deleteProductCharges(productChargesId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductChargesApi#deleteProductCharges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productChargesId** | **Integer**| Id of the productCharges to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteProductChargesFile"></a>
# **deleteProductChargesFile**
> deleteProductChargesFile(productChargesId, fileId)

Delete a file for a productCharges.

Deletes an existing productCharges file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductChargesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductChargesApi apiInstance = new ProductChargesApi();
Integer productChargesId = 56; // Integer | Id of the productCharges to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteProductChargesFile(productChargesId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductChargesApi#deleteProductChargesFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productChargesId** | **Integer**| Id of the productCharges to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteProductChargesTag"></a>
# **deleteProductChargesTag**
> deleteProductChargesTag(productChargesId, productChargesTag)

Delete a tag for a productCharges.

Deletes an existing productCharges tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductChargesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductChargesApi apiInstance = new ProductChargesApi();
Integer productChargesId = 56; // Integer | Id of the productCharges to remove tag from
String productChargesTag = "productChargesTag_example"; // String | The tag to delete
try {
    apiInstance.deleteProductChargesTag(productChargesId, productChargesTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductChargesApi#deleteProductChargesTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productChargesId** | **Integer**| Id of the productCharges to remove tag from |
 **productChargesTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateProductChargesById"></a>
# **getDuplicateProductChargesById**
> ProductCharges getDuplicateProductChargesById(productChargesId)

Get a duplicated a productCharges by id

Returns a duplicated productCharges identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductChargesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductChargesApi apiInstance = new ProductChargesApi();
Integer productChargesId = 56; // Integer | Id of the productCharges to be duplicated.
try {
    ProductCharges result = apiInstance.getDuplicateProductChargesById(productChargesId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductChargesApi#getDuplicateProductChargesById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productChargesId** | **Integer**| Id of the productCharges to be duplicated. |

### Return type

[**ProductCharges**](ProductCharges.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductChargesByFilter"></a>
# **getProductChargesByFilter**
> List&lt;ProductCharges&gt; getProductChargesByFilter(filter, page, limit, sort)

Search productChargeses by filter

Returns the list of productChargeses that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductChargesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductChargesApi apiInstance = new ProductChargesApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ProductCharges> result = apiInstance.getProductChargesByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductChargesApi#getProductChargesByFilter");
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

[**List&lt;ProductCharges&gt;**](ProductCharges.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductChargesById"></a>
# **getProductChargesById**
> ProductCharges getProductChargesById(productChargesId)

Get a productCharges by id

Returns the productCharges identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductChargesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductChargesApi apiInstance = new ProductChargesApi();
Integer productChargesId = 56; // Integer | Id of the productCharges to be returned.
try {
    ProductCharges result = apiInstance.getProductChargesById(productChargesId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductChargesApi#getProductChargesById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productChargesId** | **Integer**| Id of the productCharges to be returned. |

### Return type

[**ProductCharges**](ProductCharges.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductChargesFiles"></a>
# **getProductChargesFiles**
> getProductChargesFiles(productChargesId)

Get the files for a productCharges.

Get all existing productCharges files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductChargesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductChargesApi apiInstance = new ProductChargesApi();
Integer productChargesId = 56; // Integer | Id of the productCharges to get files for
try {
    apiInstance.getProductChargesFiles(productChargesId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductChargesApi#getProductChargesFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productChargesId** | **Integer**| Id of the productCharges to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductChargesTags"></a>
# **getProductChargesTags**
> getProductChargesTags(productChargesId)

Get the tags for a productCharges.

Get all existing productCharges tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductChargesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductChargesApi apiInstance = new ProductChargesApi();
Integer productChargesId = 56; // Integer | Id of the productCharges to get tags for
try {
    apiInstance.getProductChargesTags(productChargesId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductChargesApi#getProductChargesTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productChargesId** | **Integer**| Id of the productCharges to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProductCharges"></a>
# **updateProductCharges**
> updateProductCharges(body)

Update a productCharges

Updates an existing productCharges using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductChargesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductChargesApi apiInstance = new ProductChargesApi();
ProductCharges body = new ProductCharges(); // ProductCharges | ProductCharges to be updated.
try {
    apiInstance.updateProductCharges(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductChargesApi#updateProductCharges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProductCharges**](ProductCharges.md)| ProductCharges to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

