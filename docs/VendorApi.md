# VendorApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addVendor**](VendorApi.md#addVendor) | **POST** /beta/vendor | Create a vendor
[**addVendorAudit**](VendorApi.md#addVendorAudit) | **PUT** /beta/vendor/{vendorId}/audit/{vendorAudit} | Add new audit for a vendor
[**addVendorFile**](VendorApi.md#addVendorFile) | **POST** /beta/vendor/{vendorId}/file/{fileName} | Attach a file to a vendor
[**addVendorFileByURL**](VendorApi.md#addVendorFileByURL) | **POST** /beta/vendor/{vendorId}/file | Attach a file to a vendor by URL.
[**addVendorTag**](VendorApi.md#addVendorTag) | **PUT** /beta/vendor/{vendorId}/tag/{vendorTag} | Add new tags for a vendor.
[**deleteVendor**](VendorApi.md#deleteVendor) | **DELETE** /beta/vendor/{vendorId} | Delete a vendor
[**deleteVendorFile**](VendorApi.md#deleteVendorFile) | **DELETE** /beta/vendor/{vendorId}/file/{fileId} | Delete a file for a vendor.
[**deleteVendorTag**](VendorApi.md#deleteVendorTag) | **DELETE** /beta/vendor/{vendorId}/tag/{vendorTag} | Delete a tag for a vendor.
[**getDuplicateVendorById**](VendorApi.md#getDuplicateVendorById) | **GET** /beta/vendor/duplicate/{vendorId} | Get a duplicated a vendor by id
[**getVendorByFilter**](VendorApi.md#getVendorByFilter) | **GET** /beta/vendor/search | Search vendors by filter
[**getVendorById**](VendorApi.md#getVendorById) | **GET** /beta/vendor/{vendorId} | Get a vendor by id
[**getVendorFiles**](VendorApi.md#getVendorFiles) | **GET** /beta/vendor/{vendorId}/file | Get the files for a vendor.
[**getVendorTags**](VendorApi.md#getVendorTags) | **GET** /beta/vendor/{vendorId}/tag | Get the tags for a vendor.
[**updateVendor**](VendorApi.md#updateVendor) | **PUT** /beta/vendor | Update a vendor
[**updateVendorCustomFields**](VendorApi.md#updateVendorCustomFields) | **PUT** /beta/vendor/customFields | Update a vendor custom fields


<a name="addVendor"></a>
# **addVendor**
> Vendor addVendor(body)

Create a vendor

Inserts a new vendor using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorApi apiInstance = new VendorApi();
Vendor body = new Vendor(); // Vendor | Vendor to be inserted.
try {
    Vendor result = apiInstance.addVendor(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#addVendor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Vendor**](Vendor.md)| Vendor to be inserted. |

### Return type

[**Vendor**](Vendor.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addVendorAudit"></a>
# **addVendorAudit**
> addVendorAudit(vendorId, vendorAudit)

Add new audit for a vendor

Adds an audit to an existing vendor.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorApi apiInstance = new VendorApi();
Integer vendorId = 56; // Integer | Id of the vendor to add an audit to
String vendorAudit = "vendorAudit_example"; // String | The audit to add
try {
    apiInstance.addVendorAudit(vendorId, vendorAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#addVendorAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorId** | **Integer**| Id of the vendor to add an audit to |
 **vendorAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addVendorFile"></a>
# **addVendorFile**
> addVendorFile(vendorId, fileName)

Attach a file to a vendor

Adds a file to an existing vendor.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorApi apiInstance = new VendorApi();
Integer vendorId = 56; // Integer | Id of the vendor to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addVendorFile(vendorId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#addVendorFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorId** | **Integer**| Id of the vendor to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addVendorFileByURL"></a>
# **addVendorFileByURL**
> addVendorFileByURL(body, vendorId)

Attach a file to a vendor by URL.

Adds a file to an existing vendor by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorApi apiInstance = new VendorApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer vendorId = 56; // Integer | Id of the vendor to add an file to
try {
    apiInstance.addVendorFileByURL(body, vendorId);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#addVendorFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **vendorId** | **Integer**| Id of the vendor to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addVendorTag"></a>
# **addVendorTag**
> addVendorTag(vendorId, vendorTag)

Add new tags for a vendor.

Adds a tag to an existing vendor.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorApi apiInstance = new VendorApi();
Integer vendorId = 56; // Integer | Id of the vendor to add a tag to
String vendorTag = "vendorTag_example"; // String | The tag to add
try {
    apiInstance.addVendorTag(vendorId, vendorTag);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#addVendorTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorId** | **Integer**| Id of the vendor to add a tag to |
 **vendorTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteVendor"></a>
# **deleteVendor**
> deleteVendor(vendorId)

Delete a vendor

Deletes the vendor identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorApi apiInstance = new VendorApi();
Integer vendorId = 56; // Integer | Id of the vendor to be deleted.
try {
    apiInstance.deleteVendor(vendorId);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#deleteVendor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorId** | **Integer**| Id of the vendor to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVendorFile"></a>
# **deleteVendorFile**
> deleteVendorFile(vendorId, fileId)

Delete a file for a vendor.

Deletes an existing vendor file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorApi apiInstance = new VendorApi();
Integer vendorId = 56; // Integer | Id of the vendor to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteVendorFile(vendorId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#deleteVendorFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorId** | **Integer**| Id of the vendor to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVendorTag"></a>
# **deleteVendorTag**
> deleteVendorTag(vendorId, vendorTag)

Delete a tag for a vendor.

Deletes an existing vendor tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorApi apiInstance = new VendorApi();
Integer vendorId = 56; // Integer | Id of the vendor to remove tag from
String vendorTag = "vendorTag_example"; // String | The tag to delete
try {
    apiInstance.deleteVendorTag(vendorId, vendorTag);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#deleteVendorTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorId** | **Integer**| Id of the vendor to remove tag from |
 **vendorTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateVendorById"></a>
# **getDuplicateVendorById**
> Vendor getDuplicateVendorById(vendorId)

Get a duplicated a vendor by id

Returns a duplicated vendor identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorApi apiInstance = new VendorApi();
Integer vendorId = 56; // Integer | Id of the vendor to be duplicated.
try {
    Vendor result = apiInstance.getDuplicateVendorById(vendorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#getDuplicateVendorById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorId** | **Integer**| Id of the vendor to be duplicated. |

### Return type

[**Vendor**](Vendor.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVendorByFilter"></a>
# **getVendorByFilter**
> List&lt;Vendor&gt; getVendorByFilter(filter, page, limit, sort)

Search vendors by filter

Returns the list of vendors that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorApi apiInstance = new VendorApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Vendor> result = apiInstance.getVendorByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#getVendorByFilter");
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

[**List&lt;Vendor&gt;**](Vendor.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVendorById"></a>
# **getVendorById**
> Vendor getVendorById(vendorId)

Get a vendor by id

Returns the vendor identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorApi apiInstance = new VendorApi();
Integer vendorId = 56; // Integer | Id of the vendor to be returned.
try {
    Vendor result = apiInstance.getVendorById(vendorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#getVendorById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorId** | **Integer**| Id of the vendor to be returned. |

### Return type

[**Vendor**](Vendor.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVendorFiles"></a>
# **getVendorFiles**
> getVendorFiles(vendorId)

Get the files for a vendor.

Get all existing vendor files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorApi apiInstance = new VendorApi();
Integer vendorId = 56; // Integer | Id of the vendor to get files for
try {
    apiInstance.getVendorFiles(vendorId);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#getVendorFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorId** | **Integer**| Id of the vendor to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVendorTags"></a>
# **getVendorTags**
> getVendorTags(vendorId)

Get the tags for a vendor.

Get all existing vendor tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorApi apiInstance = new VendorApi();
Integer vendorId = 56; // Integer | Id of the vendor to get tags for
try {
    apiInstance.getVendorTags(vendorId);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#getVendorTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorId** | **Integer**| Id of the vendor to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVendor"></a>
# **updateVendor**
> updateVendor(body)

Update a vendor

Updates an existing vendor using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorApi apiInstance = new VendorApi();
Vendor body = new Vendor(); // Vendor | Vendor to be updated.
try {
    apiInstance.updateVendor(body);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#updateVendor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Vendor**](Vendor.md)| Vendor to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateVendorCustomFields"></a>
# **updateVendorCustomFields**
> updateVendorCustomFields(body)

Update a vendor custom fields

Updates an existing vendor custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.VendorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VendorApi apiInstance = new VendorApi();
Vendor body = new Vendor(); // Vendor | Vendor to be updated.
try {
    apiInstance.updateVendorCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorApi#updateVendorCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Vendor**](Vendor.md)| Vendor to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

