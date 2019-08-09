# ShoppingCartConnectionApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addShoppingCartConnection**](ShoppingCartConnectionApi.md#addShoppingCartConnection) | **POST** /beta/shoppingCartConnection | Create a shoppingCartConnection
[**addShoppingCartConnectionAudit**](ShoppingCartConnectionApi.md#addShoppingCartConnectionAudit) | **PUT** /beta/shoppingCartConnection/{shoppingCartConnectionId}/audit/{shoppingCartConnectionAudit} | Add new audit for a shoppingCartConnection
[**addShoppingCartConnectionFile**](ShoppingCartConnectionApi.md#addShoppingCartConnectionFile) | **POST** /beta/shoppingCartConnection/{shoppingCartConnectionId}/file/{fileName} | Attach a file to a shoppingCartConnection
[**addShoppingCartConnectionTag**](ShoppingCartConnectionApi.md#addShoppingCartConnectionTag) | **PUT** /beta/shoppingCartConnection/{shoppingCartConnectionId}/tag/{shoppingCartConnectionTag} | Add new tags for a shoppingCartConnection.
[**deleteShoppingCartConnection**](ShoppingCartConnectionApi.md#deleteShoppingCartConnection) | **DELETE** /beta/shoppingCartConnection/{shoppingCartConnectionId} | Delete a shoppingCartConnection
[**deleteShoppingCartConnectionTag**](ShoppingCartConnectionApi.md#deleteShoppingCartConnectionTag) | **DELETE** /beta/shoppingCartConnection/{shoppingCartConnectionId}/tag/{shoppingCartConnectionTag} | Delete a tag for a shoppingCartConnection.
[**getDuplicateShoppingCartConnectionById**](ShoppingCartConnectionApi.md#getDuplicateShoppingCartConnectionById) | **GET** /beta/shoppingCartConnection/duplicate/{shoppingCartConnectionId} | Get a duplicated a shoppingCartConnection by id
[**getShoppingCartConnectionByFilter**](ShoppingCartConnectionApi.md#getShoppingCartConnectionByFilter) | **GET** /beta/shoppingCartConnection/search | Search shoppingCartConnections by filter
[**getShoppingCartConnectionById**](ShoppingCartConnectionApi.md#getShoppingCartConnectionById) | **GET** /beta/shoppingCartConnection/{shoppingCartConnectionId} | Get a shoppingCartConnection by id
[**getShoppingCartConnectionTags**](ShoppingCartConnectionApi.md#getShoppingCartConnectionTags) | **GET** /beta/shoppingCartConnection/{shoppingCartConnectionId}/tag | Get the tags for a shoppingCartConnection.
[**updateShoppingCartConnection**](ShoppingCartConnectionApi.md#updateShoppingCartConnection) | **PUT** /beta/shoppingCartConnection | Update a shoppingCartConnection
[**updateShoppingCartConnectionCustomFields**](ShoppingCartConnectionApi.md#updateShoppingCartConnectionCustomFields) | **PUT** /beta/shoppingCartConnection/customFields | Update a shoppingCartConnection custom fields


<a name="addShoppingCartConnection"></a>
# **addShoppingCartConnection**
> ShoppingCartConnection addShoppingCartConnection(body)

Create a shoppingCartConnection

Inserts a new shoppingCartConnection using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShoppingCartConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShoppingCartConnectionApi apiInstance = new ShoppingCartConnectionApi();
ShoppingCartConnection body = new ShoppingCartConnection(); // ShoppingCartConnection | ShoppingCartConnection to be inserted.
try {
    ShoppingCartConnection result = apiInstance.addShoppingCartConnection(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShoppingCartConnectionApi#addShoppingCartConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ShoppingCartConnection**](ShoppingCartConnection.md)| ShoppingCartConnection to be inserted. |

### Return type

[**ShoppingCartConnection**](ShoppingCartConnection.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addShoppingCartConnectionAudit"></a>
# **addShoppingCartConnectionAudit**
> addShoppingCartConnectionAudit(shoppingCartConnectionId, shoppingCartConnectionAudit)

Add new audit for a shoppingCartConnection

Adds an audit to an existing shoppingCartConnection.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShoppingCartConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShoppingCartConnectionApi apiInstance = new ShoppingCartConnectionApi();
Integer shoppingCartConnectionId = 56; // Integer | Id of the shoppingCartConnection to add an audit to
String shoppingCartConnectionAudit = "shoppingCartConnectionAudit_example"; // String | The audit to add
try {
    apiInstance.addShoppingCartConnectionAudit(shoppingCartConnectionId, shoppingCartConnectionAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ShoppingCartConnectionApi#addShoppingCartConnectionAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shoppingCartConnectionId** | **Integer**| Id of the shoppingCartConnection to add an audit to |
 **shoppingCartConnectionAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addShoppingCartConnectionFile"></a>
# **addShoppingCartConnectionFile**
> addShoppingCartConnectionFile(shoppingCartConnectionId, fileName)

Attach a file to a shoppingCartConnection

Adds a file to an existing shoppingCartConnection.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShoppingCartConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShoppingCartConnectionApi apiInstance = new ShoppingCartConnectionApi();
Integer shoppingCartConnectionId = 56; // Integer | Id of the shoppingCartConnection to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addShoppingCartConnectionFile(shoppingCartConnectionId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ShoppingCartConnectionApi#addShoppingCartConnectionFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shoppingCartConnectionId** | **Integer**| Id of the shoppingCartConnection to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addShoppingCartConnectionTag"></a>
# **addShoppingCartConnectionTag**
> addShoppingCartConnectionTag(shoppingCartConnectionId, shoppingCartConnectionTag)

Add new tags for a shoppingCartConnection.

Adds a tag to an existing shoppingCartConnection.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShoppingCartConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShoppingCartConnectionApi apiInstance = new ShoppingCartConnectionApi();
Integer shoppingCartConnectionId = 56; // Integer | Id of the shoppingCartConnection to add a tag to
String shoppingCartConnectionTag = "shoppingCartConnectionTag_example"; // String | The tag to add
try {
    apiInstance.addShoppingCartConnectionTag(shoppingCartConnectionId, shoppingCartConnectionTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ShoppingCartConnectionApi#addShoppingCartConnectionTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shoppingCartConnectionId** | **Integer**| Id of the shoppingCartConnection to add a tag to |
 **shoppingCartConnectionTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteShoppingCartConnection"></a>
# **deleteShoppingCartConnection**
> deleteShoppingCartConnection(shoppingCartConnectionId)

Delete a shoppingCartConnection

Deletes the shoppingCartConnection identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShoppingCartConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShoppingCartConnectionApi apiInstance = new ShoppingCartConnectionApi();
Integer shoppingCartConnectionId = 56; // Integer | Id of the shoppingCartConnection to be deleted.
try {
    apiInstance.deleteShoppingCartConnection(shoppingCartConnectionId);
} catch (ApiException e) {
    System.err.println("Exception when calling ShoppingCartConnectionApi#deleteShoppingCartConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shoppingCartConnectionId** | **Integer**| Id of the shoppingCartConnection to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteShoppingCartConnectionTag"></a>
# **deleteShoppingCartConnectionTag**
> deleteShoppingCartConnectionTag(shoppingCartConnectionId, shoppingCartConnectionTag)

Delete a tag for a shoppingCartConnection.

Deletes an existing shoppingCartConnection tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShoppingCartConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShoppingCartConnectionApi apiInstance = new ShoppingCartConnectionApi();
Integer shoppingCartConnectionId = 56; // Integer | Id of the shoppingCartConnection to remove tag from
String shoppingCartConnectionTag = "shoppingCartConnectionTag_example"; // String | The tag to delete
try {
    apiInstance.deleteShoppingCartConnectionTag(shoppingCartConnectionId, shoppingCartConnectionTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ShoppingCartConnectionApi#deleteShoppingCartConnectionTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shoppingCartConnectionId** | **Integer**| Id of the shoppingCartConnection to remove tag from |
 **shoppingCartConnectionTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateShoppingCartConnectionById"></a>
# **getDuplicateShoppingCartConnectionById**
> ShoppingCartConnection getDuplicateShoppingCartConnectionById(shoppingCartConnectionId)

Get a duplicated a shoppingCartConnection by id

Returns a duplicated shoppingCartConnection identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShoppingCartConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShoppingCartConnectionApi apiInstance = new ShoppingCartConnectionApi();
Integer shoppingCartConnectionId = 56; // Integer | Id of the shoppingCartConnection to be duplicated.
try {
    ShoppingCartConnection result = apiInstance.getDuplicateShoppingCartConnectionById(shoppingCartConnectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShoppingCartConnectionApi#getDuplicateShoppingCartConnectionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shoppingCartConnectionId** | **Integer**| Id of the shoppingCartConnection to be duplicated. |

### Return type

[**ShoppingCartConnection**](ShoppingCartConnection.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getShoppingCartConnectionByFilter"></a>
# **getShoppingCartConnectionByFilter**
> List&lt;ShoppingCartConnection&gt; getShoppingCartConnectionByFilter(filter, page, limit, sort)

Search shoppingCartConnections by filter

Returns the list of shoppingCartConnections that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShoppingCartConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShoppingCartConnectionApi apiInstance = new ShoppingCartConnectionApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ShoppingCartConnection> result = apiInstance.getShoppingCartConnectionByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShoppingCartConnectionApi#getShoppingCartConnectionByFilter");
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

[**List&lt;ShoppingCartConnection&gt;**](ShoppingCartConnection.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getShoppingCartConnectionById"></a>
# **getShoppingCartConnectionById**
> ShoppingCartConnection getShoppingCartConnectionById(shoppingCartConnectionId)

Get a shoppingCartConnection by id

Returns the shoppingCartConnection identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShoppingCartConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShoppingCartConnectionApi apiInstance = new ShoppingCartConnectionApi();
Integer shoppingCartConnectionId = 56; // Integer | Id of the shoppingCartConnection to be returned.
try {
    ShoppingCartConnection result = apiInstance.getShoppingCartConnectionById(shoppingCartConnectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShoppingCartConnectionApi#getShoppingCartConnectionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shoppingCartConnectionId** | **Integer**| Id of the shoppingCartConnection to be returned. |

### Return type

[**ShoppingCartConnection**](ShoppingCartConnection.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getShoppingCartConnectionTags"></a>
# **getShoppingCartConnectionTags**
> getShoppingCartConnectionTags(shoppingCartConnectionId)

Get the tags for a shoppingCartConnection.

Get all existing shoppingCartConnection tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShoppingCartConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShoppingCartConnectionApi apiInstance = new ShoppingCartConnectionApi();
Integer shoppingCartConnectionId = 56; // Integer | Id of the shoppingCartConnection to get tags for
try {
    apiInstance.getShoppingCartConnectionTags(shoppingCartConnectionId);
} catch (ApiException e) {
    System.err.println("Exception when calling ShoppingCartConnectionApi#getShoppingCartConnectionTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shoppingCartConnectionId** | **Integer**| Id of the shoppingCartConnection to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateShoppingCartConnection"></a>
# **updateShoppingCartConnection**
> updateShoppingCartConnection(body)

Update a shoppingCartConnection

Updates an existing shoppingCartConnection using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShoppingCartConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShoppingCartConnectionApi apiInstance = new ShoppingCartConnectionApi();
ShoppingCartConnection body = new ShoppingCartConnection(); // ShoppingCartConnection | ShoppingCartConnection to be updated.
try {
    apiInstance.updateShoppingCartConnection(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ShoppingCartConnectionApi#updateShoppingCartConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ShoppingCartConnection**](ShoppingCartConnection.md)| ShoppingCartConnection to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateShoppingCartConnectionCustomFields"></a>
# **updateShoppingCartConnectionCustomFields**
> updateShoppingCartConnectionCustomFields(body)

Update a shoppingCartConnection custom fields

Updates an existing shoppingCartConnection custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ShoppingCartConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShoppingCartConnectionApi apiInstance = new ShoppingCartConnectionApi();
ShoppingCartConnection body = new ShoppingCartConnection(); // ShoppingCartConnection | ShoppingCartConnection to be updated.
try {
    apiInstance.updateShoppingCartConnectionCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ShoppingCartConnectionApi#updateShoppingCartConnectionCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ShoppingCartConnection**](ShoppingCartConnection.md)| ShoppingCartConnection to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

