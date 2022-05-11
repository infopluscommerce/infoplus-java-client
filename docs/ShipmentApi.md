# ShipmentApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addShipmentAudit**](ShipmentApi.md#addShipmentAudit) | **PUT** /v3.0/shipment/{shipmentId}/audit/{shipmentAudit} | Add new audit for a shipment
[**addShipmentFile**](ShipmentApi.md#addShipmentFile) | **POST** /v3.0/shipment/{shipmentId}/file/{fileName} | Attach a file to a shipment
[**addShipmentFileByURL**](ShipmentApi.md#addShipmentFileByURL) | **POST** /v3.0/shipment/{shipmentId}/file | Attach a file to a shipment by URL.
[**addShipmentTag**](ShipmentApi.md#addShipmentTag) | **PUT** /v3.0/shipment/{shipmentId}/tag/{shipmentTag} | Add new tags for a shipment.
[**deleteShipmentFile**](ShipmentApi.md#deleteShipmentFile) | **DELETE** /v3.0/shipment/{shipmentId}/file/{fileId} | Delete a file for a shipment.
[**deleteShipmentTag**](ShipmentApi.md#deleteShipmentTag) | **DELETE** /v3.0/shipment/{shipmentId}/tag/{shipmentTag} | Delete a tag for a shipment.
[**getDuplicateShipmentById**](ShipmentApi.md#getDuplicateShipmentById) | **GET** /v3.0/shipment/duplicate/{shipmentId} | Get a duplicated a shipment by id
[**getShipmentByFilter**](ShipmentApi.md#getShipmentByFilter) | **GET** /v3.0/shipment/search | Search shipments by filter
[**getShipmentById**](ShipmentApi.md#getShipmentById) | **GET** /v3.0/shipment/{shipmentId} | Get a shipment by id
[**getShipmentFiles**](ShipmentApi.md#getShipmentFiles) | **GET** /v3.0/shipment/{shipmentId}/file | Get the files for a shipment.
[**getShipmentTags**](ShipmentApi.md#getShipmentTags) | **GET** /v3.0/shipment/{shipmentId}/tag | Get the tags for a shipment.
[**updateShipmentCustomFields**](ShipmentApi.md#updateShipmentCustomFields) | **PUT** /v3.0/shipment/customFields | Update a shipment custom fields


<a name="addShipmentAudit"></a>
# **addShipmentAudit**
> addShipmentAudit(shipmentId, shipmentAudit)

Add new audit for a shipment

Adds an audit to an existing shipment.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShipmentApi apiInstance = new ShipmentApi();
Integer shipmentId = 56; // Integer | Id of the shipment to add an audit to
String shipmentAudit = "shipmentAudit_example"; // String | The audit to add
try {
    apiInstance.addShipmentAudit(shipmentId, shipmentAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#addShipmentAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentId** | **Integer**| Id of the shipment to add an audit to |
 **shipmentAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addShipmentFile"></a>
# **addShipmentFile**
> addShipmentFile(shipmentId, fileName)

Attach a file to a shipment

Adds a file to an existing shipment.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShipmentApi apiInstance = new ShipmentApi();
Integer shipmentId = 56; // Integer | Id of the shipment to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addShipmentFile(shipmentId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#addShipmentFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentId** | **Integer**| Id of the shipment to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addShipmentFileByURL"></a>
# **addShipmentFileByURL**
> addShipmentFileByURL(body, shipmentId)

Attach a file to a shipment by URL.

Adds a file to an existing shipment by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShipmentApi apiInstance = new ShipmentApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer shipmentId = 56; // Integer | Id of the shipment to add an file to
try {
    apiInstance.addShipmentFileByURL(body, shipmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#addShipmentFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **shipmentId** | **Integer**| Id of the shipment to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addShipmentTag"></a>
# **addShipmentTag**
> addShipmentTag(shipmentId, shipmentTag)

Add new tags for a shipment.

Adds a tag to an existing shipment.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShipmentApi apiInstance = new ShipmentApi();
Integer shipmentId = 56; // Integer | Id of the shipment to add a tag to
String shipmentTag = "shipmentTag_example"; // String | The tag to add
try {
    apiInstance.addShipmentTag(shipmentId, shipmentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#addShipmentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentId** | **Integer**| Id of the shipment to add a tag to |
 **shipmentTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteShipmentFile"></a>
# **deleteShipmentFile**
> deleteShipmentFile(shipmentId, fileId)

Delete a file for a shipment.

Deletes an existing shipment file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShipmentApi apiInstance = new ShipmentApi();
Integer shipmentId = 56; // Integer | Id of the shipment to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteShipmentFile(shipmentId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#deleteShipmentFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentId** | **Integer**| Id of the shipment to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteShipmentTag"></a>
# **deleteShipmentTag**
> deleteShipmentTag(shipmentId, shipmentTag)

Delete a tag for a shipment.

Deletes an existing shipment tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShipmentApi apiInstance = new ShipmentApi();
Integer shipmentId = 56; // Integer | Id of the shipment to remove tag from
String shipmentTag = "shipmentTag_example"; // String | The tag to delete
try {
    apiInstance.deleteShipmentTag(shipmentId, shipmentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#deleteShipmentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentId** | **Integer**| Id of the shipment to remove tag from |
 **shipmentTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateShipmentById"></a>
# **getDuplicateShipmentById**
> Shipment getDuplicateShipmentById(shipmentId)

Get a duplicated a shipment by id

Returns a duplicated shipment identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShipmentApi apiInstance = new ShipmentApi();
Integer shipmentId = 56; // Integer | Id of the shipment to be duplicated.
try {
    Shipment result = apiInstance.getDuplicateShipmentById(shipmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#getDuplicateShipmentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentId** | **Integer**| Id of the shipment to be duplicated. |

### Return type

[**Shipment**](Shipment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getShipmentByFilter"></a>
# **getShipmentByFilter**
> List&lt;Shipment&gt; getShipmentByFilter(filter, page, limit, sort)

Search shipments by filter

Returns the list of shipments that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShipmentApi apiInstance = new ShipmentApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Shipment> result = apiInstance.getShipmentByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#getShipmentByFilter");
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

[**List&lt;Shipment&gt;**](Shipment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getShipmentById"></a>
# **getShipmentById**
> Shipment getShipmentById(shipmentId)

Get a shipment by id

Returns the shipment identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShipmentApi apiInstance = new ShipmentApi();
Integer shipmentId = 56; // Integer | Id of the shipment to be returned.
try {
    Shipment result = apiInstance.getShipmentById(shipmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#getShipmentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentId** | **Integer**| Id of the shipment to be returned. |

### Return type

[**Shipment**](Shipment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getShipmentFiles"></a>
# **getShipmentFiles**
> getShipmentFiles(shipmentId)

Get the files for a shipment.

Get all existing shipment files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShipmentApi apiInstance = new ShipmentApi();
Integer shipmentId = 56; // Integer | Id of the shipment to get files for
try {
    apiInstance.getShipmentFiles(shipmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#getShipmentFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentId** | **Integer**| Id of the shipment to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getShipmentTags"></a>
# **getShipmentTags**
> getShipmentTags(shipmentId)

Get the tags for a shipment.

Get all existing shipment tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShipmentApi apiInstance = new ShipmentApi();
Integer shipmentId = 56; // Integer | Id of the shipment to get tags for
try {
    apiInstance.getShipmentTags(shipmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#getShipmentTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentId** | **Integer**| Id of the shipment to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateShipmentCustomFields"></a>
# **updateShipmentCustomFields**
> updateShipmentCustomFields(body)

Update a shipment custom fields

Updates an existing shipment custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShipmentApi apiInstance = new ShipmentApi();
Shipment body = new Shipment(); // Shipment | Shipment to be updated.
try {
    apiInstance.updateShipmentCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#updateShipmentCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Shipment**](Shipment.md)| Shipment to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

