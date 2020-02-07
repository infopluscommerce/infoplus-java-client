# LegacyLowstockContactApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLegacyLowstockContact**](LegacyLowstockContactApi.md#addLegacyLowstockContact) | **POST** /beta/legacyLowstockContact | Create a legacyLowstockContact
[**addLegacyLowstockContactAudit**](LegacyLowstockContactApi.md#addLegacyLowstockContactAudit) | **PUT** /beta/legacyLowstockContact/{legacyLowstockContactId}/audit/{legacyLowstockContactAudit} | Add new audit for a legacyLowstockContact
[**addLegacyLowstockContactFile**](LegacyLowstockContactApi.md#addLegacyLowstockContactFile) | **POST** /beta/legacyLowstockContact/{legacyLowstockContactId}/file/{fileName} | Attach a file to a legacyLowstockContact
[**addLegacyLowstockContactFileByURL**](LegacyLowstockContactApi.md#addLegacyLowstockContactFileByURL) | **POST** /beta/legacyLowstockContact/{legacyLowstockContactId}/file | Attach a file to a legacyLowstockContact by URL.
[**addLegacyLowstockContactTag**](LegacyLowstockContactApi.md#addLegacyLowstockContactTag) | **PUT** /beta/legacyLowstockContact/{legacyLowstockContactId}/tag/{legacyLowstockContactTag} | Add new tags for a legacyLowstockContact.
[**deleteLegacyLowstockContact**](LegacyLowstockContactApi.md#deleteLegacyLowstockContact) | **DELETE** /beta/legacyLowstockContact/{legacyLowstockContactId} | Delete a legacyLowstockContact
[**deleteLegacyLowstockContactFile**](LegacyLowstockContactApi.md#deleteLegacyLowstockContactFile) | **DELETE** /beta/legacyLowstockContact/{legacyLowstockContactId}/file/{fileId} | Delete a file for a legacyLowstockContact.
[**deleteLegacyLowstockContactTag**](LegacyLowstockContactApi.md#deleteLegacyLowstockContactTag) | **DELETE** /beta/legacyLowstockContact/{legacyLowstockContactId}/tag/{legacyLowstockContactTag} | Delete a tag for a legacyLowstockContact.
[**getDuplicateLegacyLowstockContactById**](LegacyLowstockContactApi.md#getDuplicateLegacyLowstockContactById) | **GET** /beta/legacyLowstockContact/duplicate/{legacyLowstockContactId} | Get a duplicated a legacyLowstockContact by id
[**getLegacyLowstockContactByFilter**](LegacyLowstockContactApi.md#getLegacyLowstockContactByFilter) | **GET** /beta/legacyLowstockContact/search | Search legacyLowstockContacts by filter
[**getLegacyLowstockContactById**](LegacyLowstockContactApi.md#getLegacyLowstockContactById) | **GET** /beta/legacyLowstockContact/{legacyLowstockContactId} | Get a legacyLowstockContact by id
[**getLegacyLowstockContactFiles**](LegacyLowstockContactApi.md#getLegacyLowstockContactFiles) | **GET** /beta/legacyLowstockContact/{legacyLowstockContactId}/file | Get the files for a legacyLowstockContact.
[**getLegacyLowstockContactTags**](LegacyLowstockContactApi.md#getLegacyLowstockContactTags) | **GET** /beta/legacyLowstockContact/{legacyLowstockContactId}/tag | Get the tags for a legacyLowstockContact.
[**updateLegacyLowstockContact**](LegacyLowstockContactApi.md#updateLegacyLowstockContact) | **PUT** /beta/legacyLowstockContact | Update a legacyLowstockContact


<a name="addLegacyLowstockContact"></a>
# **addLegacyLowstockContact**
> LegacyLowstockContact addLegacyLowstockContact(body)

Create a legacyLowstockContact

Inserts a new legacyLowstockContact using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LegacyLowstockContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LegacyLowstockContactApi apiInstance = new LegacyLowstockContactApi();
LegacyLowstockContact body = new LegacyLowstockContact(); // LegacyLowstockContact | LegacyLowstockContact to be inserted.
try {
    LegacyLowstockContact result = apiInstance.addLegacyLowstockContact(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LegacyLowstockContactApi#addLegacyLowstockContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LegacyLowstockContact**](LegacyLowstockContact.md)| LegacyLowstockContact to be inserted. |

### Return type

[**LegacyLowstockContact**](LegacyLowstockContact.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLegacyLowstockContactAudit"></a>
# **addLegacyLowstockContactAudit**
> addLegacyLowstockContactAudit(legacyLowstockContactId, legacyLowstockContactAudit)

Add new audit for a legacyLowstockContact

Adds an audit to an existing legacyLowstockContact.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LegacyLowstockContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LegacyLowstockContactApi apiInstance = new LegacyLowstockContactApi();
Integer legacyLowstockContactId = 56; // Integer | Id of the legacyLowstockContact to add an audit to
String legacyLowstockContactAudit = "legacyLowstockContactAudit_example"; // String | The audit to add
try {
    apiInstance.addLegacyLowstockContactAudit(legacyLowstockContactId, legacyLowstockContactAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling LegacyLowstockContactApi#addLegacyLowstockContactAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legacyLowstockContactId** | **Integer**| Id of the legacyLowstockContact to add an audit to |
 **legacyLowstockContactAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLegacyLowstockContactFile"></a>
# **addLegacyLowstockContactFile**
> addLegacyLowstockContactFile(legacyLowstockContactId, fileName)

Attach a file to a legacyLowstockContact

Adds a file to an existing legacyLowstockContact.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LegacyLowstockContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LegacyLowstockContactApi apiInstance = new LegacyLowstockContactApi();
Integer legacyLowstockContactId = 56; // Integer | Id of the legacyLowstockContact to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addLegacyLowstockContactFile(legacyLowstockContactId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling LegacyLowstockContactApi#addLegacyLowstockContactFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legacyLowstockContactId** | **Integer**| Id of the legacyLowstockContact to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addLegacyLowstockContactFileByURL"></a>
# **addLegacyLowstockContactFileByURL**
> addLegacyLowstockContactFileByURL(body, legacyLowstockContactId)

Attach a file to a legacyLowstockContact by URL.

Adds a file to an existing legacyLowstockContact by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LegacyLowstockContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LegacyLowstockContactApi apiInstance = new LegacyLowstockContactApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer legacyLowstockContactId = 56; // Integer | Id of the legacyLowstockContact to add an file to
try {
    apiInstance.addLegacyLowstockContactFileByURL(body, legacyLowstockContactId);
} catch (ApiException e) {
    System.err.println("Exception when calling LegacyLowstockContactApi#addLegacyLowstockContactFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **legacyLowstockContactId** | **Integer**| Id of the legacyLowstockContact to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addLegacyLowstockContactTag"></a>
# **addLegacyLowstockContactTag**
> addLegacyLowstockContactTag(legacyLowstockContactId, legacyLowstockContactTag)

Add new tags for a legacyLowstockContact.

Adds a tag to an existing legacyLowstockContact.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LegacyLowstockContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LegacyLowstockContactApi apiInstance = new LegacyLowstockContactApi();
Integer legacyLowstockContactId = 56; // Integer | Id of the legacyLowstockContact to add a tag to
String legacyLowstockContactTag = "legacyLowstockContactTag_example"; // String | The tag to add
try {
    apiInstance.addLegacyLowstockContactTag(legacyLowstockContactId, legacyLowstockContactTag);
} catch (ApiException e) {
    System.err.println("Exception when calling LegacyLowstockContactApi#addLegacyLowstockContactTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legacyLowstockContactId** | **Integer**| Id of the legacyLowstockContact to add a tag to |
 **legacyLowstockContactTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLegacyLowstockContact"></a>
# **deleteLegacyLowstockContact**
> deleteLegacyLowstockContact(legacyLowstockContactId)

Delete a legacyLowstockContact

Deletes the legacyLowstockContact identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LegacyLowstockContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LegacyLowstockContactApi apiInstance = new LegacyLowstockContactApi();
Integer legacyLowstockContactId = 56; // Integer | Id of the legacyLowstockContact to be deleted.
try {
    apiInstance.deleteLegacyLowstockContact(legacyLowstockContactId);
} catch (ApiException e) {
    System.err.println("Exception when calling LegacyLowstockContactApi#deleteLegacyLowstockContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legacyLowstockContactId** | **Integer**| Id of the legacyLowstockContact to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLegacyLowstockContactFile"></a>
# **deleteLegacyLowstockContactFile**
> deleteLegacyLowstockContactFile(legacyLowstockContactId, fileId)

Delete a file for a legacyLowstockContact.

Deletes an existing legacyLowstockContact file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LegacyLowstockContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LegacyLowstockContactApi apiInstance = new LegacyLowstockContactApi();
Integer legacyLowstockContactId = 56; // Integer | Id of the legacyLowstockContact to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteLegacyLowstockContactFile(legacyLowstockContactId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling LegacyLowstockContactApi#deleteLegacyLowstockContactFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legacyLowstockContactId** | **Integer**| Id of the legacyLowstockContact to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLegacyLowstockContactTag"></a>
# **deleteLegacyLowstockContactTag**
> deleteLegacyLowstockContactTag(legacyLowstockContactId, legacyLowstockContactTag)

Delete a tag for a legacyLowstockContact.

Deletes an existing legacyLowstockContact tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LegacyLowstockContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LegacyLowstockContactApi apiInstance = new LegacyLowstockContactApi();
Integer legacyLowstockContactId = 56; // Integer | Id of the legacyLowstockContact to remove tag from
String legacyLowstockContactTag = "legacyLowstockContactTag_example"; // String | The tag to delete
try {
    apiInstance.deleteLegacyLowstockContactTag(legacyLowstockContactId, legacyLowstockContactTag);
} catch (ApiException e) {
    System.err.println("Exception when calling LegacyLowstockContactApi#deleteLegacyLowstockContactTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legacyLowstockContactId** | **Integer**| Id of the legacyLowstockContact to remove tag from |
 **legacyLowstockContactTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateLegacyLowstockContactById"></a>
# **getDuplicateLegacyLowstockContactById**
> LegacyLowstockContact getDuplicateLegacyLowstockContactById(legacyLowstockContactId)

Get a duplicated a legacyLowstockContact by id

Returns a duplicated legacyLowstockContact identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LegacyLowstockContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LegacyLowstockContactApi apiInstance = new LegacyLowstockContactApi();
Integer legacyLowstockContactId = 56; // Integer | Id of the legacyLowstockContact to be duplicated.
try {
    LegacyLowstockContact result = apiInstance.getDuplicateLegacyLowstockContactById(legacyLowstockContactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LegacyLowstockContactApi#getDuplicateLegacyLowstockContactById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legacyLowstockContactId** | **Integer**| Id of the legacyLowstockContact to be duplicated. |

### Return type

[**LegacyLowstockContact**](LegacyLowstockContact.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLegacyLowstockContactByFilter"></a>
# **getLegacyLowstockContactByFilter**
> List&lt;LegacyLowstockContact&gt; getLegacyLowstockContactByFilter(filter, page, limit, sort)

Search legacyLowstockContacts by filter

Returns the list of legacyLowstockContacts that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LegacyLowstockContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LegacyLowstockContactApi apiInstance = new LegacyLowstockContactApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<LegacyLowstockContact> result = apiInstance.getLegacyLowstockContactByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LegacyLowstockContactApi#getLegacyLowstockContactByFilter");
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

[**List&lt;LegacyLowstockContact&gt;**](LegacyLowstockContact.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLegacyLowstockContactById"></a>
# **getLegacyLowstockContactById**
> LegacyLowstockContact getLegacyLowstockContactById(legacyLowstockContactId)

Get a legacyLowstockContact by id

Returns the legacyLowstockContact identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LegacyLowstockContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LegacyLowstockContactApi apiInstance = new LegacyLowstockContactApi();
Integer legacyLowstockContactId = 56; // Integer | Id of the legacyLowstockContact to be returned.
try {
    LegacyLowstockContact result = apiInstance.getLegacyLowstockContactById(legacyLowstockContactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LegacyLowstockContactApi#getLegacyLowstockContactById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legacyLowstockContactId** | **Integer**| Id of the legacyLowstockContact to be returned. |

### Return type

[**LegacyLowstockContact**](LegacyLowstockContact.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLegacyLowstockContactFiles"></a>
# **getLegacyLowstockContactFiles**
> getLegacyLowstockContactFiles(legacyLowstockContactId)

Get the files for a legacyLowstockContact.

Get all existing legacyLowstockContact files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LegacyLowstockContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LegacyLowstockContactApi apiInstance = new LegacyLowstockContactApi();
Integer legacyLowstockContactId = 56; // Integer | Id of the legacyLowstockContact to get files for
try {
    apiInstance.getLegacyLowstockContactFiles(legacyLowstockContactId);
} catch (ApiException e) {
    System.err.println("Exception when calling LegacyLowstockContactApi#getLegacyLowstockContactFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legacyLowstockContactId** | **Integer**| Id of the legacyLowstockContact to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLegacyLowstockContactTags"></a>
# **getLegacyLowstockContactTags**
> getLegacyLowstockContactTags(legacyLowstockContactId)

Get the tags for a legacyLowstockContact.

Get all existing legacyLowstockContact tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LegacyLowstockContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LegacyLowstockContactApi apiInstance = new LegacyLowstockContactApi();
Integer legacyLowstockContactId = 56; // Integer | Id of the legacyLowstockContact to get tags for
try {
    apiInstance.getLegacyLowstockContactTags(legacyLowstockContactId);
} catch (ApiException e) {
    System.err.println("Exception when calling LegacyLowstockContactApi#getLegacyLowstockContactTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legacyLowstockContactId** | **Integer**| Id of the legacyLowstockContact to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLegacyLowstockContact"></a>
# **updateLegacyLowstockContact**
> updateLegacyLowstockContact(body)

Update a legacyLowstockContact

Updates an existing legacyLowstockContact using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LegacyLowstockContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LegacyLowstockContactApi apiInstance = new LegacyLowstockContactApi();
LegacyLowstockContact body = new LegacyLowstockContact(); // LegacyLowstockContact | LegacyLowstockContact to be updated.
try {
    apiInstance.updateLegacyLowstockContact(body);
} catch (ApiException e) {
    System.err.println("Exception when calling LegacyLowstockContactApi#updateLegacyLowstockContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LegacyLowstockContact**](LegacyLowstockContact.md)| LegacyLowstockContact to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

