# BillingCodeTypeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBillingCodeType**](BillingCodeTypeApi.md#addBillingCodeType) | **POST** /v3.0/billingCodeType | Create a billingCodeType
[**addBillingCodeTypeAudit**](BillingCodeTypeApi.md#addBillingCodeTypeAudit) | **PUT** /v3.0/billingCodeType/{billingCodeTypeId}/audit/{billingCodeTypeAudit} | Add new audit for a billingCodeType
[**addBillingCodeTypeFile**](BillingCodeTypeApi.md#addBillingCodeTypeFile) | **POST** /v3.0/billingCodeType/{billingCodeTypeId}/file/{fileName} | Attach a file to a billingCodeType
[**addBillingCodeTypeFileByURL**](BillingCodeTypeApi.md#addBillingCodeTypeFileByURL) | **POST** /v3.0/billingCodeType/{billingCodeTypeId}/file | Attach a file to a billingCodeType by URL.
[**addBillingCodeTypeTag**](BillingCodeTypeApi.md#addBillingCodeTypeTag) | **PUT** /v3.0/billingCodeType/{billingCodeTypeId}/tag/{billingCodeTypeTag} | Add new tags for a billingCodeType.
[**deleteBillingCodeType**](BillingCodeTypeApi.md#deleteBillingCodeType) | **DELETE** /v3.0/billingCodeType/{billingCodeTypeId} | Delete a billingCodeType
[**deleteBillingCodeTypeFile**](BillingCodeTypeApi.md#deleteBillingCodeTypeFile) | **DELETE** /v3.0/billingCodeType/{billingCodeTypeId}/file/{fileId} | Delete a file for a billingCodeType.
[**deleteBillingCodeTypeTag**](BillingCodeTypeApi.md#deleteBillingCodeTypeTag) | **DELETE** /v3.0/billingCodeType/{billingCodeTypeId}/tag/{billingCodeTypeTag} | Delete a tag for a billingCodeType.
[**getBillingCodeTypeByFilter**](BillingCodeTypeApi.md#getBillingCodeTypeByFilter) | **GET** /v3.0/billingCodeType/search | Search billingCodeTypes by filter
[**getBillingCodeTypeById**](BillingCodeTypeApi.md#getBillingCodeTypeById) | **GET** /v3.0/billingCodeType/{billingCodeTypeId} | Get a billingCodeType by id
[**getBillingCodeTypeFiles**](BillingCodeTypeApi.md#getBillingCodeTypeFiles) | **GET** /v3.0/billingCodeType/{billingCodeTypeId}/file | Get the files for a billingCodeType.
[**getBillingCodeTypeTags**](BillingCodeTypeApi.md#getBillingCodeTypeTags) | **GET** /v3.0/billingCodeType/{billingCodeTypeId}/tag | Get the tags for a billingCodeType.
[**getDuplicateBillingCodeTypeById**](BillingCodeTypeApi.md#getDuplicateBillingCodeTypeById) | **GET** /v3.0/billingCodeType/duplicate/{billingCodeTypeId} | Get a duplicated a billingCodeType by id
[**updateBillingCodeType**](BillingCodeTypeApi.md#updateBillingCodeType) | **PUT** /v3.0/billingCodeType | Update a billingCodeType
[**updateBillingCodeTypeCustomFields**](BillingCodeTypeApi.md#updateBillingCodeTypeCustomFields) | **PUT** /v3.0/billingCodeType/customFields | Update a billingCodeType custom fields


<a name="addBillingCodeType"></a>
# **addBillingCodeType**
> BillingCodeType addBillingCodeType(body)

Create a billingCodeType

Inserts a new billingCodeType using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeTypeApi apiInstance = new BillingCodeTypeApi();
BillingCodeType body = new BillingCodeType(); // BillingCodeType | BillingCodeType to be inserted.
try {
    BillingCodeType result = apiInstance.addBillingCodeType(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeTypeApi#addBillingCodeType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BillingCodeType**](BillingCodeType.md)| BillingCodeType to be inserted. |

### Return type

[**BillingCodeType**](BillingCodeType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addBillingCodeTypeAudit"></a>
# **addBillingCodeTypeAudit**
> addBillingCodeTypeAudit(billingCodeTypeId, billingCodeTypeAudit)

Add new audit for a billingCodeType

Adds an audit to an existing billingCodeType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeTypeApi apiInstance = new BillingCodeTypeApi();
Integer billingCodeTypeId = 56; // Integer | Id of the billingCodeType to add an audit to
String billingCodeTypeAudit = "billingCodeTypeAudit_example"; // String | The audit to add
try {
    apiInstance.addBillingCodeTypeAudit(billingCodeTypeId, billingCodeTypeAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeTypeApi#addBillingCodeTypeAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeTypeId** | **Integer**| Id of the billingCodeType to add an audit to |
 **billingCodeTypeAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addBillingCodeTypeFile"></a>
# **addBillingCodeTypeFile**
> addBillingCodeTypeFile(billingCodeTypeId, fileName)

Attach a file to a billingCodeType

Adds a file to an existing billingCodeType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeTypeApi apiInstance = new BillingCodeTypeApi();
Integer billingCodeTypeId = 56; // Integer | Id of the billingCodeType to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addBillingCodeTypeFile(billingCodeTypeId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeTypeApi#addBillingCodeTypeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeTypeId** | **Integer**| Id of the billingCodeType to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addBillingCodeTypeFileByURL"></a>
# **addBillingCodeTypeFileByURL**
> addBillingCodeTypeFileByURL(body, billingCodeTypeId)

Attach a file to a billingCodeType by URL.

Adds a file to an existing billingCodeType by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeTypeApi apiInstance = new BillingCodeTypeApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer billingCodeTypeId = 56; // Integer | Id of the billingCodeType to add an file to
try {
    apiInstance.addBillingCodeTypeFileByURL(body, billingCodeTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeTypeApi#addBillingCodeTypeFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **billingCodeTypeId** | **Integer**| Id of the billingCodeType to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addBillingCodeTypeTag"></a>
# **addBillingCodeTypeTag**
> addBillingCodeTypeTag(billingCodeTypeId, billingCodeTypeTag)

Add new tags for a billingCodeType.

Adds a tag to an existing billingCodeType.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeTypeApi apiInstance = new BillingCodeTypeApi();
Integer billingCodeTypeId = 56; // Integer | Id of the billingCodeType to add a tag to
String billingCodeTypeTag = "billingCodeTypeTag_example"; // String | The tag to add
try {
    apiInstance.addBillingCodeTypeTag(billingCodeTypeId, billingCodeTypeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeTypeApi#addBillingCodeTypeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeTypeId** | **Integer**| Id of the billingCodeType to add a tag to |
 **billingCodeTypeTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBillingCodeType"></a>
# **deleteBillingCodeType**
> deleteBillingCodeType(billingCodeTypeId)

Delete a billingCodeType

Deletes the billingCodeType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeTypeApi apiInstance = new BillingCodeTypeApi();
Integer billingCodeTypeId = 56; // Integer | Id of the billingCodeType to be deleted.
try {
    apiInstance.deleteBillingCodeType(billingCodeTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeTypeApi#deleteBillingCodeType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeTypeId** | **Integer**| Id of the billingCodeType to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBillingCodeTypeFile"></a>
# **deleteBillingCodeTypeFile**
> deleteBillingCodeTypeFile(billingCodeTypeId, fileId)

Delete a file for a billingCodeType.

Deletes an existing billingCodeType file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeTypeApi apiInstance = new BillingCodeTypeApi();
Integer billingCodeTypeId = 56; // Integer | Id of the billingCodeType to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteBillingCodeTypeFile(billingCodeTypeId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeTypeApi#deleteBillingCodeTypeFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeTypeId** | **Integer**| Id of the billingCodeType to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBillingCodeTypeTag"></a>
# **deleteBillingCodeTypeTag**
> deleteBillingCodeTypeTag(billingCodeTypeId, billingCodeTypeTag)

Delete a tag for a billingCodeType.

Deletes an existing billingCodeType tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeTypeApi apiInstance = new BillingCodeTypeApi();
Integer billingCodeTypeId = 56; // Integer | Id of the billingCodeType to remove tag from
String billingCodeTypeTag = "billingCodeTypeTag_example"; // String | The tag to delete
try {
    apiInstance.deleteBillingCodeTypeTag(billingCodeTypeId, billingCodeTypeTag);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeTypeApi#deleteBillingCodeTypeTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeTypeId** | **Integer**| Id of the billingCodeType to remove tag from |
 **billingCodeTypeTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBillingCodeTypeByFilter"></a>
# **getBillingCodeTypeByFilter**
> List&lt;BillingCodeType&gt; getBillingCodeTypeByFilter(filter, page, limit, sort)

Search billingCodeTypes by filter

Returns the list of billingCodeTypes that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeTypeApi apiInstance = new BillingCodeTypeApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<BillingCodeType> result = apiInstance.getBillingCodeTypeByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeTypeApi#getBillingCodeTypeByFilter");
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

[**List&lt;BillingCodeType&gt;**](BillingCodeType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBillingCodeTypeById"></a>
# **getBillingCodeTypeById**
> BillingCodeType getBillingCodeTypeById(billingCodeTypeId)

Get a billingCodeType by id

Returns the billingCodeType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeTypeApi apiInstance = new BillingCodeTypeApi();
Integer billingCodeTypeId = 56; // Integer | Id of the billingCodeType to be returned.
try {
    BillingCodeType result = apiInstance.getBillingCodeTypeById(billingCodeTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeTypeApi#getBillingCodeTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeTypeId** | **Integer**| Id of the billingCodeType to be returned. |

### Return type

[**BillingCodeType**](BillingCodeType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBillingCodeTypeFiles"></a>
# **getBillingCodeTypeFiles**
> getBillingCodeTypeFiles(billingCodeTypeId)

Get the files for a billingCodeType.

Get all existing billingCodeType files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeTypeApi apiInstance = new BillingCodeTypeApi();
Integer billingCodeTypeId = 56; // Integer | Id of the billingCodeType to get files for
try {
    apiInstance.getBillingCodeTypeFiles(billingCodeTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeTypeApi#getBillingCodeTypeFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeTypeId** | **Integer**| Id of the billingCodeType to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBillingCodeTypeTags"></a>
# **getBillingCodeTypeTags**
> getBillingCodeTypeTags(billingCodeTypeId)

Get the tags for a billingCodeType.

Get all existing billingCodeType tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeTypeApi apiInstance = new BillingCodeTypeApi();
Integer billingCodeTypeId = 56; // Integer | Id of the billingCodeType to get tags for
try {
    apiInstance.getBillingCodeTypeTags(billingCodeTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeTypeApi#getBillingCodeTypeTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeTypeId** | **Integer**| Id of the billingCodeType to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateBillingCodeTypeById"></a>
# **getDuplicateBillingCodeTypeById**
> BillingCodeType getDuplicateBillingCodeTypeById(billingCodeTypeId)

Get a duplicated a billingCodeType by id

Returns a duplicated billingCodeType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeTypeApi apiInstance = new BillingCodeTypeApi();
Integer billingCodeTypeId = 56; // Integer | Id of the billingCodeType to be duplicated.
try {
    BillingCodeType result = apiInstance.getDuplicateBillingCodeTypeById(billingCodeTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeTypeApi#getDuplicateBillingCodeTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCodeTypeId** | **Integer**| Id of the billingCodeType to be duplicated. |

### Return type

[**BillingCodeType**](BillingCodeType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBillingCodeType"></a>
# **updateBillingCodeType**
> updateBillingCodeType(body)

Update a billingCodeType

Updates an existing billingCodeType using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeTypeApi apiInstance = new BillingCodeTypeApi();
BillingCodeType body = new BillingCodeType(); // BillingCodeType | BillingCodeType to be updated.
try {
    apiInstance.updateBillingCodeType(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeTypeApi#updateBillingCodeType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BillingCodeType**](BillingCodeType.md)| BillingCodeType to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBillingCodeTypeCustomFields"></a>
# **updateBillingCodeTypeCustomFields**
> updateBillingCodeTypeCustomFields(body)

Update a billingCodeType custom fields

Updates an existing billingCodeType custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.BillingCodeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingCodeTypeApi apiInstance = new BillingCodeTypeApi();
BillingCodeType body = new BillingCodeType(); // BillingCodeType | BillingCodeType to be updated.
try {
    apiInstance.updateBillingCodeTypeCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCodeTypeApi#updateBillingCodeTypeCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BillingCodeType**](BillingCodeType.md)| BillingCodeType to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

