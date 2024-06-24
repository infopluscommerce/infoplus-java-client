# CustomFieldApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCustomField**](CustomFieldApi.md#addCustomField) | **POST** /beta/customField | Create a customField
[**addCustomFieldAudit**](CustomFieldApi.md#addCustomFieldAudit) | **PUT** /beta/customField/{customFieldId}/audit/{customFieldAudit} | Add new audit for a customField
[**addCustomFieldFile**](CustomFieldApi.md#addCustomFieldFile) | **POST** /beta/customField/{customFieldId}/file/{fileName} | Attach a file to a customField
[**addCustomFieldFileByURL**](CustomFieldApi.md#addCustomFieldFileByURL) | **POST** /beta/customField/{customFieldId}/file | Attach a file to a customField by URL.
[**addCustomFieldTag**](CustomFieldApi.md#addCustomFieldTag) | **PUT** /beta/customField/{customFieldId}/tag/{customFieldTag} | Add new tags for a customField.
[**deleteCustomFieldFile**](CustomFieldApi.md#deleteCustomFieldFile) | **DELETE** /beta/customField/{customFieldId}/file/{fileId} | Delete a file for a customField.
[**deleteCustomFieldTag**](CustomFieldApi.md#deleteCustomFieldTag) | **DELETE** /beta/customField/{customFieldId}/tag/{customFieldTag} | Delete a tag for a customField.
[**getCustomFieldByFilter**](CustomFieldApi.md#getCustomFieldByFilter) | **GET** /beta/customField/search | Search customFields by filter
[**getCustomFieldById**](CustomFieldApi.md#getCustomFieldById) | **GET** /beta/customField/{customFieldId} | Get a customField by id
[**getCustomFieldFiles**](CustomFieldApi.md#getCustomFieldFiles) | **GET** /beta/customField/{customFieldId}/file | Get the files for a customField.
[**getCustomFieldTags**](CustomFieldApi.md#getCustomFieldTags) | **GET** /beta/customField/{customFieldId}/tag | Get the tags for a customField.
[**getDuplicateCustomFieldById**](CustomFieldApi.md#getDuplicateCustomFieldById) | **GET** /beta/customField/duplicate/{customFieldId} | Get a duplicated a customField by id
[**updateCustomField**](CustomFieldApi.md#updateCustomField) | **PUT** /beta/customField | Update a customField


<a name="addCustomField"></a>
# **addCustomField**
> CustomField addCustomField(body)

Create a customField

Inserts a new customField using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomFieldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomFieldApi apiInstance = new CustomFieldApi();
CustomField body = new CustomField(); // CustomField | CustomField to be inserted.
try {
    CustomField result = apiInstance.addCustomField(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomFieldApi#addCustomField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomField**](CustomField.md)| CustomField to be inserted. |

### Return type

[**CustomField**](CustomField.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCustomFieldAudit"></a>
# **addCustomFieldAudit**
> addCustomFieldAudit(customFieldId, customFieldAudit)

Add new audit for a customField

Adds an audit to an existing customField.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomFieldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomFieldApi apiInstance = new CustomFieldApi();
Integer customFieldId = 56; // Integer | Id of the customField to add an audit to
String customFieldAudit = "customFieldAudit_example"; // String | The audit to add
try {
    apiInstance.addCustomFieldAudit(customFieldId, customFieldAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomFieldApi#addCustomFieldAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customFieldId** | **Integer**| Id of the customField to add an audit to |
 **customFieldAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCustomFieldFile"></a>
# **addCustomFieldFile**
> addCustomFieldFile(customFieldId, fileName)

Attach a file to a customField

Adds a file to an existing customField.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomFieldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomFieldApi apiInstance = new CustomFieldApi();
Integer customFieldId = 56; // Integer | Id of the customField to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addCustomFieldFile(customFieldId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomFieldApi#addCustomFieldFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customFieldId** | **Integer**| Id of the customField to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addCustomFieldFileByURL"></a>
# **addCustomFieldFileByURL**
> addCustomFieldFileByURL(body, customFieldId)

Attach a file to a customField by URL.

Adds a file to an existing customField by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomFieldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomFieldApi apiInstance = new CustomFieldApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer customFieldId = 56; // Integer | Id of the customField to add an file to
try {
    apiInstance.addCustomFieldFileByURL(body, customFieldId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomFieldApi#addCustomFieldFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **customFieldId** | **Integer**| Id of the customField to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCustomFieldTag"></a>
# **addCustomFieldTag**
> addCustomFieldTag(customFieldId, customFieldTag)

Add new tags for a customField.

Adds a tag to an existing customField.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomFieldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomFieldApi apiInstance = new CustomFieldApi();
Integer customFieldId = 56; // Integer | Id of the customField to add a tag to
String customFieldTag = "customFieldTag_example"; // String | The tag to add
try {
    apiInstance.addCustomFieldTag(customFieldId, customFieldTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomFieldApi#addCustomFieldTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customFieldId** | **Integer**| Id of the customField to add a tag to |
 **customFieldTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomFieldFile"></a>
# **deleteCustomFieldFile**
> deleteCustomFieldFile(customFieldId, fileId)

Delete a file for a customField.

Deletes an existing customField file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomFieldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomFieldApi apiInstance = new CustomFieldApi();
Integer customFieldId = 56; // Integer | Id of the customField to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteCustomFieldFile(customFieldId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomFieldApi#deleteCustomFieldFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customFieldId** | **Integer**| Id of the customField to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCustomFieldTag"></a>
# **deleteCustomFieldTag**
> deleteCustomFieldTag(customFieldId, customFieldTag)

Delete a tag for a customField.

Deletes an existing customField tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomFieldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomFieldApi apiInstance = new CustomFieldApi();
Integer customFieldId = 56; // Integer | Id of the customField to remove tag from
String customFieldTag = "customFieldTag_example"; // String | The tag to delete
try {
    apiInstance.deleteCustomFieldTag(customFieldId, customFieldTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomFieldApi#deleteCustomFieldTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customFieldId** | **Integer**| Id of the customField to remove tag from |
 **customFieldTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomFieldByFilter"></a>
# **getCustomFieldByFilter**
> List&lt;CustomField&gt; getCustomFieldByFilter(filter, page, limit, sort)

Search customFields by filter

Returns the list of customFields that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomFieldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomFieldApi apiInstance = new CustomFieldApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<CustomField> result = apiInstance.getCustomFieldByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomFieldApi#getCustomFieldByFilter");
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

[**List&lt;CustomField&gt;**](CustomField.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomFieldById"></a>
# **getCustomFieldById**
> CustomField getCustomFieldById(customFieldId)

Get a customField by id

Returns the customField identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomFieldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomFieldApi apiInstance = new CustomFieldApi();
Integer customFieldId = 56; // Integer | Id of the customField to be returned.
try {
    CustomField result = apiInstance.getCustomFieldById(customFieldId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomFieldApi#getCustomFieldById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customFieldId** | **Integer**| Id of the customField to be returned. |

### Return type

[**CustomField**](CustomField.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomFieldFiles"></a>
# **getCustomFieldFiles**
> getCustomFieldFiles(customFieldId)

Get the files for a customField.

Get all existing customField files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomFieldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomFieldApi apiInstance = new CustomFieldApi();
Integer customFieldId = 56; // Integer | Id of the customField to get files for
try {
    apiInstance.getCustomFieldFiles(customFieldId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomFieldApi#getCustomFieldFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customFieldId** | **Integer**| Id of the customField to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomFieldTags"></a>
# **getCustomFieldTags**
> getCustomFieldTags(customFieldId)

Get the tags for a customField.

Get all existing customField tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomFieldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomFieldApi apiInstance = new CustomFieldApi();
Integer customFieldId = 56; // Integer | Id of the customField to get tags for
try {
    apiInstance.getCustomFieldTags(customFieldId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomFieldApi#getCustomFieldTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customFieldId** | **Integer**| Id of the customField to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateCustomFieldById"></a>
# **getDuplicateCustomFieldById**
> CustomField getDuplicateCustomFieldById(customFieldId)

Get a duplicated a customField by id

Returns a duplicated customField identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomFieldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomFieldApi apiInstance = new CustomFieldApi();
Integer customFieldId = 56; // Integer | Id of the customField to be duplicated.
try {
    CustomField result = apiInstance.getDuplicateCustomFieldById(customFieldId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomFieldApi#getDuplicateCustomFieldById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customFieldId** | **Integer**| Id of the customField to be duplicated. |

### Return type

[**CustomField**](CustomField.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCustomField"></a>
# **updateCustomField**
> updateCustomField(body)

Update a customField

Updates an existing customField using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomFieldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomFieldApi apiInstance = new CustomFieldApi();
CustomField body = new CustomField(); // CustomField | CustomField to be updated.
try {
    apiInstance.updateCustomField(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomFieldApi#updateCustomField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomField**](CustomField.md)| CustomField to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

