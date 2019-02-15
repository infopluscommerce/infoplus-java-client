# AsnApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAsn**](AsnApi.md#addAsn) | **POST** /beta/asn | Create an asn
[**addAsnAudit**](AsnApi.md#addAsnAudit) | **PUT** /beta/asn/{asnId}/audit/{asnAudit} | Add new audit for an asn
[**addAsnTag**](AsnApi.md#addAsnTag) | **PUT** /beta/asn/{asnId}/tag/{asnTag} | Add new tags for an asn.
[**deleteAsn**](AsnApi.md#deleteAsn) | **DELETE** /beta/asn/{asnId} | Delete an asn
[**deleteAsnTag**](AsnApi.md#deleteAsnTag) | **DELETE** /beta/asn/{asnId}/tag/{asnTag} | Delete a tag for an asn.
[**getAsnByFilter**](AsnApi.md#getAsnByFilter) | **GET** /beta/asn/search | Search asns by filter
[**getAsnById**](AsnApi.md#getAsnById) | **GET** /beta/asn/{asnId} | Get an asn by id
[**getAsnTags**](AsnApi.md#getAsnTags) | **GET** /beta/asn/{asnId}/tag | Get the tags for an asn.
[**getDuplicateAsnById**](AsnApi.md#getDuplicateAsnById) | **GET** /beta/asn/duplicate/{asnId} | Get a duplicated an asn by id
[**updateAsn**](AsnApi.md#updateAsn) | **PUT** /beta/asn | Update an asn
[**updateAsnCustomFields**](AsnApi.md#updateAsnCustomFields) | **PUT** /beta/asn/customFields | Update an asn custom fields


<a name="addAsn"></a>
# **addAsn**
> Asn addAsn(body)

Create an asn

Inserts a new asn using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AsnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AsnApi apiInstance = new AsnApi();
Asn body = new Asn(); // Asn | Asn to be inserted.
try {
    Asn result = apiInstance.addAsn(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AsnApi#addAsn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Asn**](Asn.md)| Asn to be inserted. |

### Return type

[**Asn**](Asn.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addAsnAudit"></a>
# **addAsnAudit**
> addAsnAudit(asnId, asnAudit)

Add new audit for an asn

Adds an audit to an existing asn.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AsnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AsnApi apiInstance = new AsnApi();
Integer asnId = 56; // Integer | Id of the asn to add an audit to
String asnAudit = "asnAudit_example"; // String | The audit to add
try {
    apiInstance.addAsnAudit(asnId, asnAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling AsnApi#addAsnAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asnId** | **Integer**| Id of the asn to add an audit to |
 **asnAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addAsnTag"></a>
# **addAsnTag**
> addAsnTag(asnId, asnTag)

Add new tags for an asn.

Adds a tag to an existing asn.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AsnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AsnApi apiInstance = new AsnApi();
Integer asnId = 56; // Integer | Id of the asn to add a tag to
String asnTag = "asnTag_example"; // String | The tag to add
try {
    apiInstance.addAsnTag(asnId, asnTag);
} catch (ApiException e) {
    System.err.println("Exception when calling AsnApi#addAsnTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asnId** | **Integer**| Id of the asn to add a tag to |
 **asnTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAsn"></a>
# **deleteAsn**
> deleteAsn(asnId)

Delete an asn

Deletes the asn identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AsnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AsnApi apiInstance = new AsnApi();
Integer asnId = 56; // Integer | Id of the asn to be deleted.
try {
    apiInstance.deleteAsn(asnId);
} catch (ApiException e) {
    System.err.println("Exception when calling AsnApi#deleteAsn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asnId** | **Integer**| Id of the asn to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteAsnTag"></a>
# **deleteAsnTag**
> deleteAsnTag(asnId, asnTag)

Delete a tag for an asn.

Deletes an existing asn tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AsnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AsnApi apiInstance = new AsnApi();
Integer asnId = 56; // Integer | Id of the asn to remove tag from
String asnTag = "asnTag_example"; // String | The tag to delete
try {
    apiInstance.deleteAsnTag(asnId, asnTag);
} catch (ApiException e) {
    System.err.println("Exception when calling AsnApi#deleteAsnTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asnId** | **Integer**| Id of the asn to remove tag from |
 **asnTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAsnByFilter"></a>
# **getAsnByFilter**
> List&lt;Asn&gt; getAsnByFilter(filter, page, limit, sort)

Search asns by filter

Returns the list of asns that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AsnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AsnApi apiInstance = new AsnApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Asn> result = apiInstance.getAsnByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AsnApi#getAsnByFilter");
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

[**List&lt;Asn&gt;**](Asn.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAsnById"></a>
# **getAsnById**
> Asn getAsnById(asnId)

Get an asn by id

Returns the asn identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AsnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AsnApi apiInstance = new AsnApi();
Integer asnId = 56; // Integer | Id of the asn to be returned.
try {
    Asn result = apiInstance.getAsnById(asnId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AsnApi#getAsnById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asnId** | **Integer**| Id of the asn to be returned. |

### Return type

[**Asn**](Asn.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAsnTags"></a>
# **getAsnTags**
> getAsnTags(asnId)

Get the tags for an asn.

Get all existing asn tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AsnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AsnApi apiInstance = new AsnApi();
Integer asnId = 56; // Integer | Id of the asn to get tags for
try {
    apiInstance.getAsnTags(asnId);
} catch (ApiException e) {
    System.err.println("Exception when calling AsnApi#getAsnTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asnId** | **Integer**| Id of the asn to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateAsnById"></a>
# **getDuplicateAsnById**
> Asn getDuplicateAsnById(asnId)

Get a duplicated an asn by id

Returns a duplicated asn identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AsnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AsnApi apiInstance = new AsnApi();
Integer asnId = 56; // Integer | Id of the asn to be duplicated.
try {
    Asn result = apiInstance.getDuplicateAsnById(asnId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AsnApi#getDuplicateAsnById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asnId** | **Integer**| Id of the asn to be duplicated. |

### Return type

[**Asn**](Asn.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAsn"></a>
# **updateAsn**
> updateAsn(body)

Update an asn

Updates an existing asn using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AsnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AsnApi apiInstance = new AsnApi();
Asn body = new Asn(); // Asn | Asn to be updated.
try {
    apiInstance.updateAsn(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AsnApi#updateAsn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Asn**](Asn.md)| Asn to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAsnCustomFields"></a>
# **updateAsnCustomFields**
> updateAsnCustomFields(body)

Update an asn custom fields

Updates an existing asn custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.AsnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AsnApi apiInstance = new AsnApi();
Asn body = new Asn(); // Asn | Asn to be updated.
try {
    apiInstance.updateAsnCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AsnApi#updateAsnCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Asn**](Asn.md)| Asn to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

