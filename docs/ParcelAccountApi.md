# ParcelAccountApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addParcelAccountAudit**](ParcelAccountApi.md#addParcelAccountAudit) | **PUT** /beta/parcelAccount/{parcelAccountId}/audit/{parcelAccountAudit} | Add new audit for a parcelAccount
[**addParcelAccountFile**](ParcelAccountApi.md#addParcelAccountFile) | **POST** /beta/parcelAccount/{parcelAccountId}/file/{fileName} | Attach a file to a parcelAccount
[**addParcelAccountFileByURL**](ParcelAccountApi.md#addParcelAccountFileByURL) | **POST** /beta/parcelAccount/{parcelAccountId}/file | Attach a file to a parcelAccount by URL.
[**addParcelAccountTag**](ParcelAccountApi.md#addParcelAccountTag) | **PUT** /beta/parcelAccount/{parcelAccountId}/tag/{parcelAccountTag} | Add new tags for a parcelAccount.
[**deleteParcelAccountFile**](ParcelAccountApi.md#deleteParcelAccountFile) | **DELETE** /beta/parcelAccount/{parcelAccountId}/file/{fileId} | Delete a file for a parcelAccount.
[**deleteParcelAccountTag**](ParcelAccountApi.md#deleteParcelAccountTag) | **DELETE** /beta/parcelAccount/{parcelAccountId}/tag/{parcelAccountTag} | Delete a tag for a parcelAccount.
[**getDuplicateParcelAccountById**](ParcelAccountApi.md#getDuplicateParcelAccountById) | **GET** /beta/parcelAccount/duplicate/{parcelAccountId} | Get a duplicated a parcelAccount by id
[**getParcelAccountByFilter**](ParcelAccountApi.md#getParcelAccountByFilter) | **GET** /beta/parcelAccount/search | Search parcelAccounts by filter
[**getParcelAccountById**](ParcelAccountApi.md#getParcelAccountById) | **GET** /beta/parcelAccount/{parcelAccountId} | Get a parcelAccount by id
[**getParcelAccountFiles**](ParcelAccountApi.md#getParcelAccountFiles) | **GET** /beta/parcelAccount/{parcelAccountId}/file | Get the files for a parcelAccount.
[**getParcelAccountTags**](ParcelAccountApi.md#getParcelAccountTags) | **GET** /beta/parcelAccount/{parcelAccountId}/tag | Get the tags for a parcelAccount.
[**updateParcelAccountCustomFields**](ParcelAccountApi.md#updateParcelAccountCustomFields) | **PUT** /beta/parcelAccount/customFields | Update a parcelAccount custom fields


<a name="addParcelAccountAudit"></a>
# **addParcelAccountAudit**
> addParcelAccountAudit(parcelAccountId, parcelAccountAudit)

Add new audit for a parcelAccount

Adds an audit to an existing parcelAccount.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelAccountApi apiInstance = new ParcelAccountApi();
Integer parcelAccountId = 56; // Integer | Id of the parcelAccount to add an audit to
String parcelAccountAudit = "parcelAccountAudit_example"; // String | The audit to add
try {
    apiInstance.addParcelAccountAudit(parcelAccountId, parcelAccountAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelAccountApi#addParcelAccountAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelAccountId** | **Integer**| Id of the parcelAccount to add an audit to |
 **parcelAccountAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addParcelAccountFile"></a>
# **addParcelAccountFile**
> addParcelAccountFile(parcelAccountId, fileName)

Attach a file to a parcelAccount

Adds a file to an existing parcelAccount.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelAccountApi apiInstance = new ParcelAccountApi();
Integer parcelAccountId = 56; // Integer | Id of the parcelAccount to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addParcelAccountFile(parcelAccountId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelAccountApi#addParcelAccountFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelAccountId** | **Integer**| Id of the parcelAccount to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addParcelAccountFileByURL"></a>
# **addParcelAccountFileByURL**
> addParcelAccountFileByURL(body, parcelAccountId)

Attach a file to a parcelAccount by URL.

Adds a file to an existing parcelAccount by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelAccountApi apiInstance = new ParcelAccountApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer parcelAccountId = 56; // Integer | Id of the parcelAccount to add an file to
try {
    apiInstance.addParcelAccountFileByURL(body, parcelAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelAccountApi#addParcelAccountFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **parcelAccountId** | **Integer**| Id of the parcelAccount to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addParcelAccountTag"></a>
# **addParcelAccountTag**
> addParcelAccountTag(parcelAccountId, parcelAccountTag)

Add new tags for a parcelAccount.

Adds a tag to an existing parcelAccount.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelAccountApi apiInstance = new ParcelAccountApi();
Integer parcelAccountId = 56; // Integer | Id of the parcelAccount to add a tag to
String parcelAccountTag = "parcelAccountTag_example"; // String | The tag to add
try {
    apiInstance.addParcelAccountTag(parcelAccountId, parcelAccountTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelAccountApi#addParcelAccountTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelAccountId** | **Integer**| Id of the parcelAccount to add a tag to |
 **parcelAccountTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteParcelAccountFile"></a>
# **deleteParcelAccountFile**
> deleteParcelAccountFile(parcelAccountId, fileId)

Delete a file for a parcelAccount.

Deletes an existing parcelAccount file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelAccountApi apiInstance = new ParcelAccountApi();
Integer parcelAccountId = 56; // Integer | Id of the parcelAccount to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteParcelAccountFile(parcelAccountId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelAccountApi#deleteParcelAccountFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelAccountId** | **Integer**| Id of the parcelAccount to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteParcelAccountTag"></a>
# **deleteParcelAccountTag**
> deleteParcelAccountTag(parcelAccountId, parcelAccountTag)

Delete a tag for a parcelAccount.

Deletes an existing parcelAccount tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelAccountApi apiInstance = new ParcelAccountApi();
Integer parcelAccountId = 56; // Integer | Id of the parcelAccount to remove tag from
String parcelAccountTag = "parcelAccountTag_example"; // String | The tag to delete
try {
    apiInstance.deleteParcelAccountTag(parcelAccountId, parcelAccountTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelAccountApi#deleteParcelAccountTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelAccountId** | **Integer**| Id of the parcelAccount to remove tag from |
 **parcelAccountTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateParcelAccountById"></a>
# **getDuplicateParcelAccountById**
> ParcelAccount getDuplicateParcelAccountById(parcelAccountId)

Get a duplicated a parcelAccount by id

Returns a duplicated parcelAccount identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelAccountApi apiInstance = new ParcelAccountApi();
Integer parcelAccountId = 56; // Integer | Id of the parcelAccount to be duplicated.
try {
    ParcelAccount result = apiInstance.getDuplicateParcelAccountById(parcelAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelAccountApi#getDuplicateParcelAccountById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelAccountId** | **Integer**| Id of the parcelAccount to be duplicated. |

### Return type

[**ParcelAccount**](ParcelAccount.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParcelAccountByFilter"></a>
# **getParcelAccountByFilter**
> List&lt;ParcelAccount&gt; getParcelAccountByFilter(filter, page, limit, sort)

Search parcelAccounts by filter

Returns the list of parcelAccounts that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelAccountApi apiInstance = new ParcelAccountApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ParcelAccount> result = apiInstance.getParcelAccountByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelAccountApi#getParcelAccountByFilter");
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

[**List&lt;ParcelAccount&gt;**](ParcelAccount.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParcelAccountById"></a>
# **getParcelAccountById**
> ParcelAccount getParcelAccountById(parcelAccountId)

Get a parcelAccount by id

Returns the parcelAccount identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelAccountApi apiInstance = new ParcelAccountApi();
Integer parcelAccountId = 56; // Integer | Id of the parcelAccount to be returned.
try {
    ParcelAccount result = apiInstance.getParcelAccountById(parcelAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelAccountApi#getParcelAccountById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelAccountId** | **Integer**| Id of the parcelAccount to be returned. |

### Return type

[**ParcelAccount**](ParcelAccount.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParcelAccountFiles"></a>
# **getParcelAccountFiles**
> getParcelAccountFiles(parcelAccountId)

Get the files for a parcelAccount.

Get all existing parcelAccount files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelAccountApi apiInstance = new ParcelAccountApi();
Integer parcelAccountId = 56; // Integer | Id of the parcelAccount to get files for
try {
    apiInstance.getParcelAccountFiles(parcelAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelAccountApi#getParcelAccountFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelAccountId** | **Integer**| Id of the parcelAccount to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParcelAccountTags"></a>
# **getParcelAccountTags**
> getParcelAccountTags(parcelAccountId)

Get the tags for a parcelAccount.

Get all existing parcelAccount tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelAccountApi apiInstance = new ParcelAccountApi();
Integer parcelAccountId = 56; // Integer | Id of the parcelAccount to get tags for
try {
    apiInstance.getParcelAccountTags(parcelAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelAccountApi#getParcelAccountTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelAccountId** | **Integer**| Id of the parcelAccount to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateParcelAccountCustomFields"></a>
# **updateParcelAccountCustomFields**
> updateParcelAccountCustomFields(body)

Update a parcelAccount custom fields

Updates an existing parcelAccount custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ParcelAccountApi apiInstance = new ParcelAccountApi();
ParcelAccount body = new ParcelAccount(); // ParcelAccount | ParcelAccount to be updated.
try {
    apiInstance.updateParcelAccountCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ParcelAccountApi#updateParcelAccountCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParcelAccount**](ParcelAccount.md)| ParcelAccount to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

