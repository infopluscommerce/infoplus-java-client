# EmailTemplateApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEmailTemplate**](EmailTemplateApi.md#addEmailTemplate) | **POST** /beta/emailTemplate | Create an emailTemplate
[**addEmailTemplateAudit**](EmailTemplateApi.md#addEmailTemplateAudit) | **PUT** /beta/emailTemplate/{emailTemplateId}/audit/{emailTemplateAudit} | Add new audit for an emailTemplate
[**addEmailTemplateFile**](EmailTemplateApi.md#addEmailTemplateFile) | **POST** /beta/emailTemplate/{emailTemplateId}/file/{fileName} | Attach a file to an emailTemplate
[**addEmailTemplateFileByURL**](EmailTemplateApi.md#addEmailTemplateFileByURL) | **POST** /beta/emailTemplate/{emailTemplateId}/file | Attach a file to an emailTemplate by URL.
[**addEmailTemplateTag**](EmailTemplateApi.md#addEmailTemplateTag) | **PUT** /beta/emailTemplate/{emailTemplateId}/tag/{emailTemplateTag} | Add new tags for an emailTemplate.
[**deleteEmailTemplate**](EmailTemplateApi.md#deleteEmailTemplate) | **DELETE** /beta/emailTemplate/{emailTemplateId} | Delete an emailTemplate
[**deleteEmailTemplateFile**](EmailTemplateApi.md#deleteEmailTemplateFile) | **DELETE** /beta/emailTemplate/{emailTemplateId}/file/{fileId} | Delete a file for an emailTemplate.
[**deleteEmailTemplateTag**](EmailTemplateApi.md#deleteEmailTemplateTag) | **DELETE** /beta/emailTemplate/{emailTemplateId}/tag/{emailTemplateTag} | Delete a tag for an emailTemplate.
[**getDuplicateEmailTemplateById**](EmailTemplateApi.md#getDuplicateEmailTemplateById) | **GET** /beta/emailTemplate/duplicate/{emailTemplateId} | Get a duplicated an emailTemplate by id
[**getEmailTemplateByFilter**](EmailTemplateApi.md#getEmailTemplateByFilter) | **GET** /beta/emailTemplate/search | Search emailTemplates by filter
[**getEmailTemplateById**](EmailTemplateApi.md#getEmailTemplateById) | **GET** /beta/emailTemplate/{emailTemplateId} | Get an emailTemplate by id
[**getEmailTemplateFiles**](EmailTemplateApi.md#getEmailTemplateFiles) | **GET** /beta/emailTemplate/{emailTemplateId}/file | Get the files for an emailTemplate.
[**getEmailTemplateTags**](EmailTemplateApi.md#getEmailTemplateTags) | **GET** /beta/emailTemplate/{emailTemplateId}/tag | Get the tags for an emailTemplate.
[**updateEmailTemplate**](EmailTemplateApi.md#updateEmailTemplate) | **PUT** /beta/emailTemplate | Update an emailTemplate
[**updateEmailTemplateCustomFields**](EmailTemplateApi.md#updateEmailTemplateCustomFields) | **PUT** /beta/emailTemplate/customFields | Update an emailTemplate custom fields


<a name="addEmailTemplate"></a>
# **addEmailTemplate**
> EmailTemplate addEmailTemplate(body)

Create an emailTemplate

Inserts a new emailTemplate using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EmailTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EmailTemplateApi apiInstance = new EmailTemplateApi();
EmailTemplate body = new EmailTemplate(); // EmailTemplate | EmailTemplate to be inserted.
try {
    EmailTemplate result = apiInstance.addEmailTemplate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailTemplateApi#addEmailTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EmailTemplate**](EmailTemplate.md)| EmailTemplate to be inserted. |

### Return type

[**EmailTemplate**](EmailTemplate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addEmailTemplateAudit"></a>
# **addEmailTemplateAudit**
> addEmailTemplateAudit(emailTemplateId, emailTemplateAudit)

Add new audit for an emailTemplate

Adds an audit to an existing emailTemplate.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EmailTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EmailTemplateApi apiInstance = new EmailTemplateApi();
Integer emailTemplateId = 56; // Integer | Id of the emailTemplate to add an audit to
String emailTemplateAudit = "emailTemplateAudit_example"; // String | The audit to add
try {
    apiInstance.addEmailTemplateAudit(emailTemplateId, emailTemplateAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailTemplateApi#addEmailTemplateAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailTemplateId** | **Integer**| Id of the emailTemplate to add an audit to |
 **emailTemplateAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addEmailTemplateFile"></a>
# **addEmailTemplateFile**
> addEmailTemplateFile(emailTemplateId, fileName)

Attach a file to an emailTemplate

Adds a file to an existing emailTemplate.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EmailTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EmailTemplateApi apiInstance = new EmailTemplateApi();
Integer emailTemplateId = 56; // Integer | Id of the emailTemplate to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addEmailTemplateFile(emailTemplateId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailTemplateApi#addEmailTemplateFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailTemplateId** | **Integer**| Id of the emailTemplate to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addEmailTemplateFileByURL"></a>
# **addEmailTemplateFileByURL**
> addEmailTemplateFileByURL(body, emailTemplateId)

Attach a file to an emailTemplate by URL.

Adds a file to an existing emailTemplate by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EmailTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EmailTemplateApi apiInstance = new EmailTemplateApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer emailTemplateId = 56; // Integer | Id of the emailTemplate to add an file to
try {
    apiInstance.addEmailTemplateFileByURL(body, emailTemplateId);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailTemplateApi#addEmailTemplateFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **emailTemplateId** | **Integer**| Id of the emailTemplate to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addEmailTemplateTag"></a>
# **addEmailTemplateTag**
> addEmailTemplateTag(emailTemplateId, emailTemplateTag)

Add new tags for an emailTemplate.

Adds a tag to an existing emailTemplate.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EmailTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EmailTemplateApi apiInstance = new EmailTemplateApi();
Integer emailTemplateId = 56; // Integer | Id of the emailTemplate to add a tag to
String emailTemplateTag = "emailTemplateTag_example"; // String | The tag to add
try {
    apiInstance.addEmailTemplateTag(emailTemplateId, emailTemplateTag);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailTemplateApi#addEmailTemplateTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailTemplateId** | **Integer**| Id of the emailTemplate to add a tag to |
 **emailTemplateTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEmailTemplate"></a>
# **deleteEmailTemplate**
> deleteEmailTemplate(emailTemplateId)

Delete an emailTemplate

Deletes the emailTemplate identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EmailTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EmailTemplateApi apiInstance = new EmailTemplateApi();
Integer emailTemplateId = 56; // Integer | Id of the emailTemplate to be deleted.
try {
    apiInstance.deleteEmailTemplate(emailTemplateId);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailTemplateApi#deleteEmailTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailTemplateId** | **Integer**| Id of the emailTemplate to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteEmailTemplateFile"></a>
# **deleteEmailTemplateFile**
> deleteEmailTemplateFile(emailTemplateId, fileId)

Delete a file for an emailTemplate.

Deletes an existing emailTemplate file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EmailTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EmailTemplateApi apiInstance = new EmailTemplateApi();
Integer emailTemplateId = 56; // Integer | Id of the emailTemplate to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteEmailTemplateFile(emailTemplateId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailTemplateApi#deleteEmailTemplateFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailTemplateId** | **Integer**| Id of the emailTemplate to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteEmailTemplateTag"></a>
# **deleteEmailTemplateTag**
> deleteEmailTemplateTag(emailTemplateId, emailTemplateTag)

Delete a tag for an emailTemplate.

Deletes an existing emailTemplate tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EmailTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EmailTemplateApi apiInstance = new EmailTemplateApi();
Integer emailTemplateId = 56; // Integer | Id of the emailTemplate to remove tag from
String emailTemplateTag = "emailTemplateTag_example"; // String | The tag to delete
try {
    apiInstance.deleteEmailTemplateTag(emailTemplateId, emailTemplateTag);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailTemplateApi#deleteEmailTemplateTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailTemplateId** | **Integer**| Id of the emailTemplate to remove tag from |
 **emailTemplateTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateEmailTemplateById"></a>
# **getDuplicateEmailTemplateById**
> EmailTemplate getDuplicateEmailTemplateById(emailTemplateId)

Get a duplicated an emailTemplate by id

Returns a duplicated emailTemplate identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EmailTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EmailTemplateApi apiInstance = new EmailTemplateApi();
Integer emailTemplateId = 56; // Integer | Id of the emailTemplate to be duplicated.
try {
    EmailTemplate result = apiInstance.getDuplicateEmailTemplateById(emailTemplateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailTemplateApi#getDuplicateEmailTemplateById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailTemplateId** | **Integer**| Id of the emailTemplate to be duplicated. |

### Return type

[**EmailTemplate**](EmailTemplate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEmailTemplateByFilter"></a>
# **getEmailTemplateByFilter**
> List&lt;EmailTemplate&gt; getEmailTemplateByFilter(filter, page, limit, sort)

Search emailTemplates by filter

Returns the list of emailTemplates that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EmailTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EmailTemplateApi apiInstance = new EmailTemplateApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<EmailTemplate> result = apiInstance.getEmailTemplateByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailTemplateApi#getEmailTemplateByFilter");
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

[**List&lt;EmailTemplate&gt;**](EmailTemplate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEmailTemplateById"></a>
# **getEmailTemplateById**
> EmailTemplate getEmailTemplateById(emailTemplateId)

Get an emailTemplate by id

Returns the emailTemplate identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EmailTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EmailTemplateApi apiInstance = new EmailTemplateApi();
Integer emailTemplateId = 56; // Integer | Id of the emailTemplate to be returned.
try {
    EmailTemplate result = apiInstance.getEmailTemplateById(emailTemplateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailTemplateApi#getEmailTemplateById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailTemplateId** | **Integer**| Id of the emailTemplate to be returned. |

### Return type

[**EmailTemplate**](EmailTemplate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEmailTemplateFiles"></a>
# **getEmailTemplateFiles**
> getEmailTemplateFiles(emailTemplateId)

Get the files for an emailTemplate.

Get all existing emailTemplate files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EmailTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EmailTemplateApi apiInstance = new EmailTemplateApi();
Integer emailTemplateId = 56; // Integer | Id of the emailTemplate to get files for
try {
    apiInstance.getEmailTemplateFiles(emailTemplateId);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailTemplateApi#getEmailTemplateFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailTemplateId** | **Integer**| Id of the emailTemplate to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEmailTemplateTags"></a>
# **getEmailTemplateTags**
> getEmailTemplateTags(emailTemplateId)

Get the tags for an emailTemplate.

Get all existing emailTemplate tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EmailTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EmailTemplateApi apiInstance = new EmailTemplateApi();
Integer emailTemplateId = 56; // Integer | Id of the emailTemplate to get tags for
try {
    apiInstance.getEmailTemplateTags(emailTemplateId);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailTemplateApi#getEmailTemplateTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailTemplateId** | **Integer**| Id of the emailTemplate to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateEmailTemplate"></a>
# **updateEmailTemplate**
> updateEmailTemplate(body)

Update an emailTemplate

Updates an existing emailTemplate using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EmailTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EmailTemplateApi apiInstance = new EmailTemplateApi();
EmailTemplate body = new EmailTemplate(); // EmailTemplate | EmailTemplate to be updated.
try {
    apiInstance.updateEmailTemplate(body);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailTemplateApi#updateEmailTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EmailTemplate**](EmailTemplate.md)| EmailTemplate to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEmailTemplateCustomFields"></a>
# **updateEmailTemplateCustomFields**
> updateEmailTemplateCustomFields(body)

Update an emailTemplate custom fields

Updates an existing emailTemplate custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EmailTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EmailTemplateApi apiInstance = new EmailTemplateApi();
EmailTemplate body = new EmailTemplate(); // EmailTemplate | EmailTemplate to be updated.
try {
    apiInstance.updateEmailTemplateCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailTemplateApi#updateEmailTemplateCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EmailTemplate**](EmailTemplate.md)| EmailTemplate to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

