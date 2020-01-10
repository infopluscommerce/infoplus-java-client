# SubstitutionApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSubstitution**](SubstitutionApi.md#addSubstitution) | **POST** /beta/substitution | Create a substitution
[**addSubstitutionAudit**](SubstitutionApi.md#addSubstitutionAudit) | **PUT** /beta/substitution/{substitutionId}/audit/{substitutionAudit} | Add new audit for a substitution
[**addSubstitutionFile**](SubstitutionApi.md#addSubstitutionFile) | **POST** /beta/substitution/{substitutionId}/file/{fileName} | Attach a file to a substitution
[**addSubstitutionTag**](SubstitutionApi.md#addSubstitutionTag) | **PUT** /beta/substitution/{substitutionId}/tag/{substitutionTag} | Add new tags for a substitution.
[**deleteSubstitution**](SubstitutionApi.md#deleteSubstitution) | **DELETE** /beta/substitution/{substitutionId} | Delete a substitution
[**deleteSubstitutionTag**](SubstitutionApi.md#deleteSubstitutionTag) | **DELETE** /beta/substitution/{substitutionId}/tag/{substitutionTag} | Delete a tag for a substitution.
[**getDuplicateSubstitutionById**](SubstitutionApi.md#getDuplicateSubstitutionById) | **GET** /beta/substitution/duplicate/{substitutionId} | Get a duplicated a substitution by id
[**getSubstitutionByFilter**](SubstitutionApi.md#getSubstitutionByFilter) | **GET** /beta/substitution/search | Search substitutions by filter
[**getSubstitutionById**](SubstitutionApi.md#getSubstitutionById) | **GET** /beta/substitution/{substitutionId} | Get a substitution by id
[**getSubstitutionTags**](SubstitutionApi.md#getSubstitutionTags) | **GET** /beta/substitution/{substitutionId}/tag | Get the tags for a substitution.
[**updateSubstitution**](SubstitutionApi.md#updateSubstitution) | **PUT** /beta/substitution | Update a substitution
[**updateSubstitutionCustomFields**](SubstitutionApi.md#updateSubstitutionCustomFields) | **PUT** /beta/substitution/customFields | Update a substitution custom fields


<a name="addSubstitution"></a>
# **addSubstitution**
> Substitution addSubstitution(body)

Create a substitution

Inserts a new substitution using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SubstitutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubstitutionApi apiInstance = new SubstitutionApi();
Substitution body = new Substitution(); // Substitution | Substitution to be inserted.
try {
    Substitution result = apiInstance.addSubstitution(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubstitutionApi#addSubstitution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Substitution**](Substitution.md)| Substitution to be inserted. |

### Return type

[**Substitution**](Substitution.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addSubstitutionAudit"></a>
# **addSubstitutionAudit**
> addSubstitutionAudit(substitutionId, substitutionAudit)

Add new audit for a substitution

Adds an audit to an existing substitution.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SubstitutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubstitutionApi apiInstance = new SubstitutionApi();
Integer substitutionId = 56; // Integer | Id of the substitution to add an audit to
String substitutionAudit = "substitutionAudit_example"; // String | The audit to add
try {
    apiInstance.addSubstitutionAudit(substitutionId, substitutionAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling SubstitutionApi#addSubstitutionAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **substitutionId** | **Integer**| Id of the substitution to add an audit to |
 **substitutionAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addSubstitutionFile"></a>
# **addSubstitutionFile**
> addSubstitutionFile(substitutionId, fileName)

Attach a file to a substitution

Adds a file to an existing substitution.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SubstitutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubstitutionApi apiInstance = new SubstitutionApi();
Integer substitutionId = 56; // Integer | Id of the substitution to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addSubstitutionFile(substitutionId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling SubstitutionApi#addSubstitutionFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **substitutionId** | **Integer**| Id of the substitution to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addSubstitutionTag"></a>
# **addSubstitutionTag**
> addSubstitutionTag(substitutionId, substitutionTag)

Add new tags for a substitution.

Adds a tag to an existing substitution.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SubstitutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubstitutionApi apiInstance = new SubstitutionApi();
Integer substitutionId = 56; // Integer | Id of the substitution to add a tag to
String substitutionTag = "substitutionTag_example"; // String | The tag to add
try {
    apiInstance.addSubstitutionTag(substitutionId, substitutionTag);
} catch (ApiException e) {
    System.err.println("Exception when calling SubstitutionApi#addSubstitutionTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **substitutionId** | **Integer**| Id of the substitution to add a tag to |
 **substitutionTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSubstitution"></a>
# **deleteSubstitution**
> deleteSubstitution(substitutionId)

Delete a substitution

Deletes the substitution identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SubstitutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubstitutionApi apiInstance = new SubstitutionApi();
Integer substitutionId = 56; // Integer | Id of the substitution to be deleted.
try {
    apiInstance.deleteSubstitution(substitutionId);
} catch (ApiException e) {
    System.err.println("Exception when calling SubstitutionApi#deleteSubstitution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **substitutionId** | **Integer**| Id of the substitution to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteSubstitutionTag"></a>
# **deleteSubstitutionTag**
> deleteSubstitutionTag(substitutionId, substitutionTag)

Delete a tag for a substitution.

Deletes an existing substitution tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SubstitutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubstitutionApi apiInstance = new SubstitutionApi();
Integer substitutionId = 56; // Integer | Id of the substitution to remove tag from
String substitutionTag = "substitutionTag_example"; // String | The tag to delete
try {
    apiInstance.deleteSubstitutionTag(substitutionId, substitutionTag);
} catch (ApiException e) {
    System.err.println("Exception when calling SubstitutionApi#deleteSubstitutionTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **substitutionId** | **Integer**| Id of the substitution to remove tag from |
 **substitutionTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateSubstitutionById"></a>
# **getDuplicateSubstitutionById**
> Substitution getDuplicateSubstitutionById(substitutionId)

Get a duplicated a substitution by id

Returns a duplicated substitution identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SubstitutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubstitutionApi apiInstance = new SubstitutionApi();
Integer substitutionId = 56; // Integer | Id of the substitution to be duplicated.
try {
    Substitution result = apiInstance.getDuplicateSubstitutionById(substitutionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubstitutionApi#getDuplicateSubstitutionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **substitutionId** | **Integer**| Id of the substitution to be duplicated. |

### Return type

[**Substitution**](Substitution.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSubstitutionByFilter"></a>
# **getSubstitutionByFilter**
> List&lt;Substitution&gt; getSubstitutionByFilter(filter, page, limit, sort)

Search substitutions by filter

Returns the list of substitutions that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SubstitutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubstitutionApi apiInstance = new SubstitutionApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Substitution> result = apiInstance.getSubstitutionByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubstitutionApi#getSubstitutionByFilter");
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

[**List&lt;Substitution&gt;**](Substitution.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSubstitutionById"></a>
# **getSubstitutionById**
> Substitution getSubstitutionById(substitutionId)

Get a substitution by id

Returns the substitution identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SubstitutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubstitutionApi apiInstance = new SubstitutionApi();
Integer substitutionId = 56; // Integer | Id of the substitution to be returned.
try {
    Substitution result = apiInstance.getSubstitutionById(substitutionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubstitutionApi#getSubstitutionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **substitutionId** | **Integer**| Id of the substitution to be returned. |

### Return type

[**Substitution**](Substitution.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSubstitutionTags"></a>
# **getSubstitutionTags**
> getSubstitutionTags(substitutionId)

Get the tags for a substitution.

Get all existing substitution tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SubstitutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubstitutionApi apiInstance = new SubstitutionApi();
Integer substitutionId = 56; // Integer | Id of the substitution to get tags for
try {
    apiInstance.getSubstitutionTags(substitutionId);
} catch (ApiException e) {
    System.err.println("Exception when calling SubstitutionApi#getSubstitutionTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **substitutionId** | **Integer**| Id of the substitution to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSubstitution"></a>
# **updateSubstitution**
> updateSubstitution(body)

Update a substitution

Updates an existing substitution using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SubstitutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubstitutionApi apiInstance = new SubstitutionApi();
Substitution body = new Substitution(); // Substitution | Substitution to be updated.
try {
    apiInstance.updateSubstitution(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SubstitutionApi#updateSubstitution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Substitution**](Substitution.md)| Substitution to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSubstitutionCustomFields"></a>
# **updateSubstitutionCustomFields**
> updateSubstitutionCustomFields(body)

Update a substitution custom fields

Updates an existing substitution custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.SubstitutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubstitutionApi apiInstance = new SubstitutionApi();
Substitution body = new Substitution(); // Substitution | Substitution to be updated.
try {
    apiInstance.updateSubstitutionCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SubstitutionApi#updateSubstitutionCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Substitution**](Substitution.md)| Substitution to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

