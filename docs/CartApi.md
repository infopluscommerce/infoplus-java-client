# CartApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCart**](CartApi.md#addCart) | **POST** /beta/cart | Create a cart
[**addCartAudit**](CartApi.md#addCartAudit) | **PUT** /beta/cart/{cartId}/audit/{cartAudit} | Add new audit for a cart
[**addCartFile**](CartApi.md#addCartFile) | **POST** /beta/cart/{cartId}/file/{fileName} | Attach a file to a cart
[**addCartFileByURL**](CartApi.md#addCartFileByURL) | **POST** /beta/cart/{cartId}/file | Attach a file to a cart by URL.
[**addCartTag**](CartApi.md#addCartTag) | **PUT** /beta/cart/{cartId}/tag/{cartTag} | Add new tags for a cart.
[**deleteCart**](CartApi.md#deleteCart) | **DELETE** /beta/cart/{cartId} | Delete a cart
[**deleteCartFile**](CartApi.md#deleteCartFile) | **DELETE** /beta/cart/{cartId}/file/{fileId} | Delete a file for a cart.
[**deleteCartTag**](CartApi.md#deleteCartTag) | **DELETE** /beta/cart/{cartId}/tag/{cartTag} | Delete a tag for a cart.
[**getCartByFilter**](CartApi.md#getCartByFilter) | **GET** /beta/cart/search | Search carts by filter
[**getCartById**](CartApi.md#getCartById) | **GET** /beta/cart/{cartId} | Get a cart by id
[**getCartFiles**](CartApi.md#getCartFiles) | **GET** /beta/cart/{cartId}/file | Get the files for a cart.
[**getCartTags**](CartApi.md#getCartTags) | **GET** /beta/cart/{cartId}/tag | Get the tags for a cart.
[**getDuplicateCartById**](CartApi.md#getDuplicateCartById) | **GET** /beta/cart/duplicate/{cartId} | Get a duplicated a cart by id
[**updateCart**](CartApi.md#updateCart) | **PUT** /beta/cart | Update a cart


<a name="addCart"></a>
# **addCart**
> Cart addCart(body)

Create a cart

Inserts a new cart using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartApi apiInstance = new CartApi();
Cart body = new Cart(); // Cart | Cart to be inserted.
try {
    Cart result = apiInstance.addCart(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#addCart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Cart**](Cart.md)| Cart to be inserted. |

### Return type

[**Cart**](Cart.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCartAudit"></a>
# **addCartAudit**
> addCartAudit(cartId, cartAudit)

Add new audit for a cart

Adds an audit to an existing cart.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartApi apiInstance = new CartApi();
Integer cartId = 56; // Integer | Id of the cart to add an audit to
String cartAudit = "cartAudit_example"; // String | The audit to add
try {
    apiInstance.addCartAudit(cartId, cartAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#addCartAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartId** | **Integer**| Id of the cart to add an audit to |
 **cartAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCartFile"></a>
# **addCartFile**
> addCartFile(cartId, fileName)

Attach a file to a cart

Adds a file to an existing cart.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartApi apiInstance = new CartApi();
Integer cartId = 56; // Integer | Id of the cart to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addCartFile(cartId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#addCartFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartId** | **Integer**| Id of the cart to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addCartFileByURL"></a>
# **addCartFileByURL**
> addCartFileByURL(body, cartId)

Attach a file to a cart by URL.

Adds a file to an existing cart by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartApi apiInstance = new CartApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer cartId = 56; // Integer | Id of the cart to add an file to
try {
    apiInstance.addCartFileByURL(body, cartId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#addCartFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **cartId** | **Integer**| Id of the cart to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCartTag"></a>
# **addCartTag**
> addCartTag(cartId, cartTag)

Add new tags for a cart.

Adds a tag to an existing cart.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartApi apiInstance = new CartApi();
Integer cartId = 56; // Integer | Id of the cart to add a tag to
String cartTag = "cartTag_example"; // String | The tag to add
try {
    apiInstance.addCartTag(cartId, cartTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#addCartTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartId** | **Integer**| Id of the cart to add a tag to |
 **cartTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCart"></a>
# **deleteCart**
> deleteCart(cartId)

Delete a cart

Deletes the cart identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartApi apiInstance = new CartApi();
Integer cartId = 56; // Integer | Id of the cart to be deleted.
try {
    apiInstance.deleteCart(cartId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#deleteCart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartId** | **Integer**| Id of the cart to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCartFile"></a>
# **deleteCartFile**
> deleteCartFile(cartId, fileId)

Delete a file for a cart.

Deletes an existing cart file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartApi apiInstance = new CartApi();
Integer cartId = 56; // Integer | Id of the cart to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteCartFile(cartId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#deleteCartFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartId** | **Integer**| Id of the cart to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCartTag"></a>
# **deleteCartTag**
> deleteCartTag(cartId, cartTag)

Delete a tag for a cart.

Deletes an existing cart tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartApi apiInstance = new CartApi();
Integer cartId = 56; // Integer | Id of the cart to remove tag from
String cartTag = "cartTag_example"; // String | The tag to delete
try {
    apiInstance.deleteCartTag(cartId, cartTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#deleteCartTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartId** | **Integer**| Id of the cart to remove tag from |
 **cartTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartByFilter"></a>
# **getCartByFilter**
> List&lt;Cart&gt; getCartByFilter(filter, page, limit, sort)

Search carts by filter

Returns the list of carts that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartApi apiInstance = new CartApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Cart> result = apiInstance.getCartByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#getCartByFilter");
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

[**List&lt;Cart&gt;**](Cart.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartById"></a>
# **getCartById**
> Cart getCartById(cartId)

Get a cart by id

Returns the cart identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartApi apiInstance = new CartApi();
Integer cartId = 56; // Integer | Id of the cart to be returned.
try {
    Cart result = apiInstance.getCartById(cartId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#getCartById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartId** | **Integer**| Id of the cart to be returned. |

### Return type

[**Cart**](Cart.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartFiles"></a>
# **getCartFiles**
> getCartFiles(cartId)

Get the files for a cart.

Get all existing cart files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartApi apiInstance = new CartApi();
Integer cartId = 56; // Integer | Id of the cart to get files for
try {
    apiInstance.getCartFiles(cartId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#getCartFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartId** | **Integer**| Id of the cart to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCartTags"></a>
# **getCartTags**
> getCartTags(cartId)

Get the tags for a cart.

Get all existing cart tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartApi apiInstance = new CartApi();
Integer cartId = 56; // Integer | Id of the cart to get tags for
try {
    apiInstance.getCartTags(cartId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#getCartTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartId** | **Integer**| Id of the cart to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateCartById"></a>
# **getDuplicateCartById**
> Cart getDuplicateCartById(cartId)

Get a duplicated a cart by id

Returns a duplicated cart identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartApi apiInstance = new CartApi();
Integer cartId = 56; // Integer | Id of the cart to be duplicated.
try {
    Cart result = apiInstance.getDuplicateCartById(cartId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#getDuplicateCartById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartId** | **Integer**| Id of the cart to be duplicated. |

### Return type

[**Cart**](Cart.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCart"></a>
# **updateCart**
> updateCart(body)

Update a cart

Updates an existing cart using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CartApi apiInstance = new CartApi();
Cart body = new Cart(); // Cart | Cart to be updated.
try {
    apiInstance.updateCart(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#updateCart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Cart**](Cart.md)| Cart to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

