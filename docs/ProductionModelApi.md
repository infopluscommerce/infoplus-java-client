# ProductionModelApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProductionModel**](ProductionModelApi.md#addProductionModel) | **POST** /v3.0/productionModel | Create a productionModel
[**addProductionModelAudit**](ProductionModelApi.md#addProductionModelAudit) | **PUT** /v3.0/productionModel/{productionModelId}/audit/{productionModelAudit} | Add new audit for a productionModel
[**addProductionModelFile**](ProductionModelApi.md#addProductionModelFile) | **POST** /v3.0/productionModel/{productionModelId}/file/{fileName} | Attach a file to a productionModel
[**addProductionModelFileByURL**](ProductionModelApi.md#addProductionModelFileByURL) | **POST** /v3.0/productionModel/{productionModelId}/file | Attach a file to a productionModel by URL.
[**addProductionModelTag**](ProductionModelApi.md#addProductionModelTag) | **PUT** /v3.0/productionModel/{productionModelId}/tag/{productionModelTag} | Add new tags for a productionModel.
[**deleteProductionModel**](ProductionModelApi.md#deleteProductionModel) | **DELETE** /v3.0/productionModel/{productionModelId} | Delete a productionModel
[**deleteProductionModelFile**](ProductionModelApi.md#deleteProductionModelFile) | **DELETE** /v3.0/productionModel/{productionModelId}/file/{fileId} | Delete a file for a productionModel.
[**deleteProductionModelTag**](ProductionModelApi.md#deleteProductionModelTag) | **DELETE** /v3.0/productionModel/{productionModelId}/tag/{productionModelTag} | Delete a tag for a productionModel.
[**getDuplicateProductionModelById**](ProductionModelApi.md#getDuplicateProductionModelById) | **GET** /v3.0/productionModel/duplicate/{productionModelId} | Get a duplicated a productionModel by id
[**getProductionModelByFilter**](ProductionModelApi.md#getProductionModelByFilter) | **GET** /v3.0/productionModel/search | Search productionModels by filter
[**getProductionModelById**](ProductionModelApi.md#getProductionModelById) | **GET** /v3.0/productionModel/{productionModelId} | Get a productionModel by id
[**getProductionModelFiles**](ProductionModelApi.md#getProductionModelFiles) | **GET** /v3.0/productionModel/{productionModelId}/file | Get the files for a productionModel.
[**getProductionModelTags**](ProductionModelApi.md#getProductionModelTags) | **GET** /v3.0/productionModel/{productionModelId}/tag | Get the tags for a productionModel.
[**updateProductionModel**](ProductionModelApi.md#updateProductionModel) | **PUT** /v3.0/productionModel | Update a productionModel
[**updateProductionModelCustomFields**](ProductionModelApi.md#updateProductionModelCustomFields) | **PUT** /v3.0/productionModel/customFields | Update a productionModel custom fields


<a name="addProductionModel"></a>
# **addProductionModel**
> ProductionModel addProductionModel(body)

Create a productionModel

Inserts a new productionModel using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionModelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionModelApi apiInstance = new ProductionModelApi();
ProductionModel body = new ProductionModel(); // ProductionModel | ProductionModel to be inserted.
try {
    ProductionModel result = apiInstance.addProductionModel(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionModelApi#addProductionModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProductionModel**](ProductionModel.md)| ProductionModel to be inserted. |

### Return type

[**ProductionModel**](ProductionModel.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addProductionModelAudit"></a>
# **addProductionModelAudit**
> addProductionModelAudit(productionModelId, productionModelAudit)

Add new audit for a productionModel

Adds an audit to an existing productionModel.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionModelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionModelApi apiInstance = new ProductionModelApi();
Integer productionModelId = 56; // Integer | Id of the productionModel to add an audit to
String productionModelAudit = "productionModelAudit_example"; // String | The audit to add
try {
    apiInstance.addProductionModelAudit(productionModelId, productionModelAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionModelApi#addProductionModelAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productionModelId** | **Integer**| Id of the productionModel to add an audit to |
 **productionModelAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addProductionModelFile"></a>
# **addProductionModelFile**
> addProductionModelFile(productionModelId, fileName)

Attach a file to a productionModel

Adds a file to an existing productionModel.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionModelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionModelApi apiInstance = new ProductionModelApi();
Integer productionModelId = 56; // Integer | Id of the productionModel to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addProductionModelFile(productionModelId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionModelApi#addProductionModelFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productionModelId** | **Integer**| Id of the productionModel to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addProductionModelFileByURL"></a>
# **addProductionModelFileByURL**
> addProductionModelFileByURL(body, productionModelId)

Attach a file to a productionModel by URL.

Adds a file to an existing productionModel by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionModelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionModelApi apiInstance = new ProductionModelApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer productionModelId = 56; // Integer | Id of the productionModel to add an file to
try {
    apiInstance.addProductionModelFileByURL(body, productionModelId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionModelApi#addProductionModelFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **productionModelId** | **Integer**| Id of the productionModel to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addProductionModelTag"></a>
# **addProductionModelTag**
> addProductionModelTag(productionModelId, productionModelTag)

Add new tags for a productionModel.

Adds a tag to an existing productionModel.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionModelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionModelApi apiInstance = new ProductionModelApi();
Integer productionModelId = 56; // Integer | Id of the productionModel to add a tag to
String productionModelTag = "productionModelTag_example"; // String | The tag to add
try {
    apiInstance.addProductionModelTag(productionModelId, productionModelTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionModelApi#addProductionModelTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productionModelId** | **Integer**| Id of the productionModel to add a tag to |
 **productionModelTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProductionModel"></a>
# **deleteProductionModel**
> deleteProductionModel(productionModelId)

Delete a productionModel

Deletes the productionModel identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionModelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionModelApi apiInstance = new ProductionModelApi();
Integer productionModelId = 56; // Integer | Id of the productionModel to be deleted.
try {
    apiInstance.deleteProductionModel(productionModelId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionModelApi#deleteProductionModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productionModelId** | **Integer**| Id of the productionModel to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteProductionModelFile"></a>
# **deleteProductionModelFile**
> deleteProductionModelFile(productionModelId, fileId)

Delete a file for a productionModel.

Deletes an existing productionModel file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionModelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionModelApi apiInstance = new ProductionModelApi();
Integer productionModelId = 56; // Integer | Id of the productionModel to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteProductionModelFile(productionModelId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionModelApi#deleteProductionModelFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productionModelId** | **Integer**| Id of the productionModel to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteProductionModelTag"></a>
# **deleteProductionModelTag**
> deleteProductionModelTag(productionModelId, productionModelTag)

Delete a tag for a productionModel.

Deletes an existing productionModel tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionModelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionModelApi apiInstance = new ProductionModelApi();
Integer productionModelId = 56; // Integer | Id of the productionModel to remove tag from
String productionModelTag = "productionModelTag_example"; // String | The tag to delete
try {
    apiInstance.deleteProductionModelTag(productionModelId, productionModelTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionModelApi#deleteProductionModelTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productionModelId** | **Integer**| Id of the productionModel to remove tag from |
 **productionModelTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateProductionModelById"></a>
# **getDuplicateProductionModelById**
> ProductionModel getDuplicateProductionModelById(productionModelId)

Get a duplicated a productionModel by id

Returns a duplicated productionModel identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionModelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionModelApi apiInstance = new ProductionModelApi();
Integer productionModelId = 56; // Integer | Id of the productionModel to be duplicated.
try {
    ProductionModel result = apiInstance.getDuplicateProductionModelById(productionModelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionModelApi#getDuplicateProductionModelById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productionModelId** | **Integer**| Id of the productionModel to be duplicated. |

### Return type

[**ProductionModel**](ProductionModel.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductionModelByFilter"></a>
# **getProductionModelByFilter**
> List&lt;ProductionModel&gt; getProductionModelByFilter(filter, page, limit, sort)

Search productionModels by filter

Returns the list of productionModels that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionModelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionModelApi apiInstance = new ProductionModelApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ProductionModel> result = apiInstance.getProductionModelByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionModelApi#getProductionModelByFilter");
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

[**List&lt;ProductionModel&gt;**](ProductionModel.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductionModelById"></a>
# **getProductionModelById**
> ProductionModel getProductionModelById(productionModelId)

Get a productionModel by id

Returns the productionModel identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionModelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionModelApi apiInstance = new ProductionModelApi();
Integer productionModelId = 56; // Integer | Id of the productionModel to be returned.
try {
    ProductionModel result = apiInstance.getProductionModelById(productionModelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionModelApi#getProductionModelById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productionModelId** | **Integer**| Id of the productionModel to be returned. |

### Return type

[**ProductionModel**](ProductionModel.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductionModelFiles"></a>
# **getProductionModelFiles**
> getProductionModelFiles(productionModelId)

Get the files for a productionModel.

Get all existing productionModel files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionModelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionModelApi apiInstance = new ProductionModelApi();
Integer productionModelId = 56; // Integer | Id of the productionModel to get files for
try {
    apiInstance.getProductionModelFiles(productionModelId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionModelApi#getProductionModelFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productionModelId** | **Integer**| Id of the productionModel to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductionModelTags"></a>
# **getProductionModelTags**
> getProductionModelTags(productionModelId)

Get the tags for a productionModel.

Get all existing productionModel tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionModelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionModelApi apiInstance = new ProductionModelApi();
Integer productionModelId = 56; // Integer | Id of the productionModel to get tags for
try {
    apiInstance.getProductionModelTags(productionModelId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionModelApi#getProductionModelTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productionModelId** | **Integer**| Id of the productionModel to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProductionModel"></a>
# **updateProductionModel**
> updateProductionModel(body)

Update a productionModel

Updates an existing productionModel using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionModelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionModelApi apiInstance = new ProductionModelApi();
ProductionModel body = new ProductionModel(); // ProductionModel | ProductionModel to be updated.
try {
    apiInstance.updateProductionModel(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionModelApi#updateProductionModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProductionModel**](ProductionModel.md)| ProductionModel to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProductionModelCustomFields"></a>
# **updateProductionModelCustomFields**
> updateProductionModelCustomFields(body)

Update a productionModel custom fields

Updates an existing productionModel custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ProductionModelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionModelApi apiInstance = new ProductionModelApi();
ProductionModel body = new ProductionModel(); // ProductionModel | ProductionModel to be updated.
try {
    apiInstance.updateProductionModelCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionModelApi#updateProductionModelCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProductionModel**](ProductionModel.md)| ProductionModel to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

