# ThirdPartyParcelAccountApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addThirdPartyParcelAccount**](ThirdPartyParcelAccountApi.md#addThirdPartyParcelAccount) | **POST** /beta/thirdPartyParcelAccount | Create a thirdPartyParcelAccount
[**addThirdPartyParcelAccountAudit**](ThirdPartyParcelAccountApi.md#addThirdPartyParcelAccountAudit) | **PUT** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/audit/{thirdPartyParcelAccountAudit} | Add new audit for a thirdPartyParcelAccount
[**addThirdPartyParcelAccountFile**](ThirdPartyParcelAccountApi.md#addThirdPartyParcelAccountFile) | **POST** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/file/{fileName} | Attach a file to a thirdPartyParcelAccount
[**addThirdPartyParcelAccountTag**](ThirdPartyParcelAccountApi.md#addThirdPartyParcelAccountTag) | **PUT** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/tag/{thirdPartyParcelAccountTag} | Add new tags for a thirdPartyParcelAccount.
[**deleteThirdPartyParcelAccount**](ThirdPartyParcelAccountApi.md#deleteThirdPartyParcelAccount) | **DELETE** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId} | Delete a thirdPartyParcelAccount
[**deleteThirdPartyParcelAccountTag**](ThirdPartyParcelAccountApi.md#deleteThirdPartyParcelAccountTag) | **DELETE** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/tag/{thirdPartyParcelAccountTag} | Delete a tag for a thirdPartyParcelAccount.
[**getDuplicateThirdPartyParcelAccountById**](ThirdPartyParcelAccountApi.md#getDuplicateThirdPartyParcelAccountById) | **GET** /beta/thirdPartyParcelAccount/duplicate/{thirdPartyParcelAccountId} | Get a duplicated a thirdPartyParcelAccount by id
[**getThirdPartyParcelAccountByFilter**](ThirdPartyParcelAccountApi.md#getThirdPartyParcelAccountByFilter) | **GET** /beta/thirdPartyParcelAccount/search | Search thirdPartyParcelAccounts by filter
[**getThirdPartyParcelAccountById**](ThirdPartyParcelAccountApi.md#getThirdPartyParcelAccountById) | **GET** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId} | Get a thirdPartyParcelAccount by id
[**getThirdPartyParcelAccountTags**](ThirdPartyParcelAccountApi.md#getThirdPartyParcelAccountTags) | **GET** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/tag | Get the tags for a thirdPartyParcelAccount.
[**updateThirdPartyParcelAccount**](ThirdPartyParcelAccountApi.md#updateThirdPartyParcelAccount) | **PUT** /beta/thirdPartyParcelAccount | Update a thirdPartyParcelAccount
[**updateThirdPartyParcelAccountCustomFields**](ThirdPartyParcelAccountApi.md#updateThirdPartyParcelAccountCustomFields) | **PUT** /beta/thirdPartyParcelAccount/customFields | Update a thirdPartyParcelAccount custom fields


<a name="addThirdPartyParcelAccount"></a>
# **addThirdPartyParcelAccount**
> ThirdPartyParcelAccount addThirdPartyParcelAccount(body)

Create a thirdPartyParcelAccount

Inserts a new thirdPartyParcelAccount using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ThirdPartyParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ThirdPartyParcelAccountApi apiInstance = new ThirdPartyParcelAccountApi();
ThirdPartyParcelAccount body = new ThirdPartyParcelAccount(); // ThirdPartyParcelAccount | ThirdPartyParcelAccount to be inserted.
try {
    ThirdPartyParcelAccount result = apiInstance.addThirdPartyParcelAccount(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ThirdPartyParcelAccountApi#addThirdPartyParcelAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ThirdPartyParcelAccount**](ThirdPartyParcelAccount.md)| ThirdPartyParcelAccount to be inserted. |

### Return type

[**ThirdPartyParcelAccount**](ThirdPartyParcelAccount.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addThirdPartyParcelAccountAudit"></a>
# **addThirdPartyParcelAccountAudit**
> addThirdPartyParcelAccountAudit(thirdPartyParcelAccountId, thirdPartyParcelAccountAudit)

Add new audit for a thirdPartyParcelAccount

Adds an audit to an existing thirdPartyParcelAccount.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ThirdPartyParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ThirdPartyParcelAccountApi apiInstance = new ThirdPartyParcelAccountApi();
Integer thirdPartyParcelAccountId = 56; // Integer | Id of the thirdPartyParcelAccount to add an audit to
String thirdPartyParcelAccountAudit = "thirdPartyParcelAccountAudit_example"; // String | The audit to add
try {
    apiInstance.addThirdPartyParcelAccountAudit(thirdPartyParcelAccountId, thirdPartyParcelAccountAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling ThirdPartyParcelAccountApi#addThirdPartyParcelAccountAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thirdPartyParcelAccountId** | **Integer**| Id of the thirdPartyParcelAccount to add an audit to |
 **thirdPartyParcelAccountAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addThirdPartyParcelAccountFile"></a>
# **addThirdPartyParcelAccountFile**
> addThirdPartyParcelAccountFile(thirdPartyParcelAccountId, fileName)

Attach a file to a thirdPartyParcelAccount

Adds a file to an existing thirdPartyParcelAccount.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ThirdPartyParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ThirdPartyParcelAccountApi apiInstance = new ThirdPartyParcelAccountApi();
Integer thirdPartyParcelAccountId = 56; // Integer | Id of the thirdPartyParcelAccount to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addThirdPartyParcelAccountFile(thirdPartyParcelAccountId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ThirdPartyParcelAccountApi#addThirdPartyParcelAccountFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thirdPartyParcelAccountId** | **Integer**| Id of the thirdPartyParcelAccount to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addThirdPartyParcelAccountTag"></a>
# **addThirdPartyParcelAccountTag**
> addThirdPartyParcelAccountTag(thirdPartyParcelAccountId, thirdPartyParcelAccountTag)

Add new tags for a thirdPartyParcelAccount.

Adds a tag to an existing thirdPartyParcelAccount.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ThirdPartyParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ThirdPartyParcelAccountApi apiInstance = new ThirdPartyParcelAccountApi();
Integer thirdPartyParcelAccountId = 56; // Integer | Id of the thirdPartyParcelAccount to add a tag to
String thirdPartyParcelAccountTag = "thirdPartyParcelAccountTag_example"; // String | The tag to add
try {
    apiInstance.addThirdPartyParcelAccountTag(thirdPartyParcelAccountId, thirdPartyParcelAccountTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ThirdPartyParcelAccountApi#addThirdPartyParcelAccountTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thirdPartyParcelAccountId** | **Integer**| Id of the thirdPartyParcelAccount to add a tag to |
 **thirdPartyParcelAccountTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteThirdPartyParcelAccount"></a>
# **deleteThirdPartyParcelAccount**
> deleteThirdPartyParcelAccount(thirdPartyParcelAccountId)

Delete a thirdPartyParcelAccount

Deletes the thirdPartyParcelAccount identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ThirdPartyParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ThirdPartyParcelAccountApi apiInstance = new ThirdPartyParcelAccountApi();
Integer thirdPartyParcelAccountId = 56; // Integer | Id of the thirdPartyParcelAccount to be deleted.
try {
    apiInstance.deleteThirdPartyParcelAccount(thirdPartyParcelAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling ThirdPartyParcelAccountApi#deleteThirdPartyParcelAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thirdPartyParcelAccountId** | **Integer**| Id of the thirdPartyParcelAccount to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteThirdPartyParcelAccountTag"></a>
# **deleteThirdPartyParcelAccountTag**
> deleteThirdPartyParcelAccountTag(thirdPartyParcelAccountId, thirdPartyParcelAccountTag)

Delete a tag for a thirdPartyParcelAccount.

Deletes an existing thirdPartyParcelAccount tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ThirdPartyParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ThirdPartyParcelAccountApi apiInstance = new ThirdPartyParcelAccountApi();
Integer thirdPartyParcelAccountId = 56; // Integer | Id of the thirdPartyParcelAccount to remove tag from
String thirdPartyParcelAccountTag = "thirdPartyParcelAccountTag_example"; // String | The tag to delete
try {
    apiInstance.deleteThirdPartyParcelAccountTag(thirdPartyParcelAccountId, thirdPartyParcelAccountTag);
} catch (ApiException e) {
    System.err.println("Exception when calling ThirdPartyParcelAccountApi#deleteThirdPartyParcelAccountTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thirdPartyParcelAccountId** | **Integer**| Id of the thirdPartyParcelAccount to remove tag from |
 **thirdPartyParcelAccountTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateThirdPartyParcelAccountById"></a>
# **getDuplicateThirdPartyParcelAccountById**
> ThirdPartyParcelAccount getDuplicateThirdPartyParcelAccountById(thirdPartyParcelAccountId)

Get a duplicated a thirdPartyParcelAccount by id

Returns a duplicated thirdPartyParcelAccount identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ThirdPartyParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ThirdPartyParcelAccountApi apiInstance = new ThirdPartyParcelAccountApi();
Integer thirdPartyParcelAccountId = 56; // Integer | Id of the thirdPartyParcelAccount to be duplicated.
try {
    ThirdPartyParcelAccount result = apiInstance.getDuplicateThirdPartyParcelAccountById(thirdPartyParcelAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ThirdPartyParcelAccountApi#getDuplicateThirdPartyParcelAccountById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thirdPartyParcelAccountId** | **Integer**| Id of the thirdPartyParcelAccount to be duplicated. |

### Return type

[**ThirdPartyParcelAccount**](ThirdPartyParcelAccount.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getThirdPartyParcelAccountByFilter"></a>
# **getThirdPartyParcelAccountByFilter**
> List&lt;ThirdPartyParcelAccount&gt; getThirdPartyParcelAccountByFilter(filter, page, limit, sort)

Search thirdPartyParcelAccounts by filter

Returns the list of thirdPartyParcelAccounts that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ThirdPartyParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ThirdPartyParcelAccountApi apiInstance = new ThirdPartyParcelAccountApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<ThirdPartyParcelAccount> result = apiInstance.getThirdPartyParcelAccountByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ThirdPartyParcelAccountApi#getThirdPartyParcelAccountByFilter");
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

[**List&lt;ThirdPartyParcelAccount&gt;**](ThirdPartyParcelAccount.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getThirdPartyParcelAccountById"></a>
# **getThirdPartyParcelAccountById**
> ThirdPartyParcelAccount getThirdPartyParcelAccountById(thirdPartyParcelAccountId)

Get a thirdPartyParcelAccount by id

Returns the thirdPartyParcelAccount identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ThirdPartyParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ThirdPartyParcelAccountApi apiInstance = new ThirdPartyParcelAccountApi();
Integer thirdPartyParcelAccountId = 56; // Integer | Id of the thirdPartyParcelAccount to be returned.
try {
    ThirdPartyParcelAccount result = apiInstance.getThirdPartyParcelAccountById(thirdPartyParcelAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ThirdPartyParcelAccountApi#getThirdPartyParcelAccountById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thirdPartyParcelAccountId** | **Integer**| Id of the thirdPartyParcelAccount to be returned. |

### Return type

[**ThirdPartyParcelAccount**](ThirdPartyParcelAccount.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getThirdPartyParcelAccountTags"></a>
# **getThirdPartyParcelAccountTags**
> getThirdPartyParcelAccountTags(thirdPartyParcelAccountId)

Get the tags for a thirdPartyParcelAccount.

Get all existing thirdPartyParcelAccount tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ThirdPartyParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ThirdPartyParcelAccountApi apiInstance = new ThirdPartyParcelAccountApi();
Integer thirdPartyParcelAccountId = 56; // Integer | Id of the thirdPartyParcelAccount to get tags for
try {
    apiInstance.getThirdPartyParcelAccountTags(thirdPartyParcelAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling ThirdPartyParcelAccountApi#getThirdPartyParcelAccountTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thirdPartyParcelAccountId** | **Integer**| Id of the thirdPartyParcelAccount to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateThirdPartyParcelAccount"></a>
# **updateThirdPartyParcelAccount**
> updateThirdPartyParcelAccount(body)

Update a thirdPartyParcelAccount

Updates an existing thirdPartyParcelAccount using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ThirdPartyParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ThirdPartyParcelAccountApi apiInstance = new ThirdPartyParcelAccountApi();
ThirdPartyParcelAccount body = new ThirdPartyParcelAccount(); // ThirdPartyParcelAccount | ThirdPartyParcelAccount to be updated.
try {
    apiInstance.updateThirdPartyParcelAccount(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ThirdPartyParcelAccountApi#updateThirdPartyParcelAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ThirdPartyParcelAccount**](ThirdPartyParcelAccount.md)| ThirdPartyParcelAccount to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateThirdPartyParcelAccountCustomFields"></a>
# **updateThirdPartyParcelAccountCustomFields**
> updateThirdPartyParcelAccountCustomFields(body)

Update a thirdPartyParcelAccount custom fields

Updates an existing thirdPartyParcelAccount custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ThirdPartyParcelAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ThirdPartyParcelAccountApi apiInstance = new ThirdPartyParcelAccountApi();
ThirdPartyParcelAccount body = new ThirdPartyParcelAccount(); // ThirdPartyParcelAccount | ThirdPartyParcelAccount to be updated.
try {
    apiInstance.updateThirdPartyParcelAccountCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ThirdPartyParcelAccountApi#updateThirdPartyParcelAccountCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ThirdPartyParcelAccount**](ThirdPartyParcelAccount.md)| ThirdPartyParcelAccount to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

