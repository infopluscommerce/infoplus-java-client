# CustomerApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCustomer**](CustomerApi.md#addCustomer) | **POST** /beta/customer | Create a customer
[**addCustomerAudit**](CustomerApi.md#addCustomerAudit) | **PUT** /beta/customer/{customerId}/audit/{customerAudit} | Add new audit for a customer
[**addCustomerFile**](CustomerApi.md#addCustomerFile) | **POST** /beta/customer/{customerId}/file/{fileName} | Attach a file to a customer
[**addCustomerFileByURL**](CustomerApi.md#addCustomerFileByURL) | **POST** /beta/customer/{customerId}/file | Attach a file to a customer by URL.
[**addCustomerTag**](CustomerApi.md#addCustomerTag) | **PUT** /beta/customer/{customerId}/tag/{customerTag} | Add new tags for a customer.
[**deleteCustomer**](CustomerApi.md#deleteCustomer) | **DELETE** /beta/customer/{customerId} | Delete a customer
[**deleteCustomerFile**](CustomerApi.md#deleteCustomerFile) | **DELETE** /beta/customer/{customerId}/file/{fileId} | Delete a file for a customer.
[**deleteCustomerTag**](CustomerApi.md#deleteCustomerTag) | **DELETE** /beta/customer/{customerId}/tag/{customerTag} | Delete a tag for a customer.
[**getByCustomerNo**](CustomerApi.md#getByCustomerNo) | **GET** /beta/customer/getByCustomerNo | Get a customer by Customer No
[**getCustomerByFilter**](CustomerApi.md#getCustomerByFilter) | **GET** /beta/customer/search | Search customers by filter
[**getCustomerById**](CustomerApi.md#getCustomerById) | **GET** /beta/customer/{customerId} | Get a customer by id
[**getCustomerFiles**](CustomerApi.md#getCustomerFiles) | **GET** /beta/customer/{customerId}/file | Get the files for a customer.
[**getCustomerTags**](CustomerApi.md#getCustomerTags) | **GET** /beta/customer/{customerId}/tag | Get the tags for a customer.
[**getDuplicateCustomerById**](CustomerApi.md#getDuplicateCustomerById) | **GET** /beta/customer/duplicate/{customerId} | Get a duplicated a customer by id
[**updateCustomer**](CustomerApi.md#updateCustomer) | **PUT** /beta/customer | Update a customer
[**updateCustomerCustomFields**](CustomerApi.md#updateCustomerCustomFields) | **PUT** /beta/customer/customFields | Update a customer custom fields


<a name="addCustomer"></a>
# **addCustomer**
> Customer addCustomer(body)

Create a customer

Inserts a new customer using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
Customer body = new Customer(); // Customer | Customer to be inserted.
try {
    Customer result = apiInstance.addCustomer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#addCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Customer**](Customer.md)| Customer to be inserted. |

### Return type

[**Customer**](Customer.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCustomerAudit"></a>
# **addCustomerAudit**
> addCustomerAudit(customerId, customerAudit)

Add new audit for a customer

Adds an audit to an existing customer.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
Integer customerId = 56; // Integer | Id of the customer to add an audit to
String customerAudit = "customerAudit_example"; // String | The audit to add
try {
    apiInstance.addCustomerAudit(customerId, customerAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#addCustomerAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| Id of the customer to add an audit to |
 **customerAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCustomerFile"></a>
# **addCustomerFile**
> addCustomerFile(customerId, fileName)

Attach a file to a customer

Adds a file to an existing customer.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
Integer customerId = 56; // Integer | Id of the customer to add a file to
String fileName = "fileName_example"; // String | Name of file
try {
    apiInstance.addCustomerFile(customerId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#addCustomerFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| Id of the customer to add a file to |
 **fileName** | **String**| Name of file |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addCustomerFileByURL"></a>
# **addCustomerFileByURL**
> addCustomerFileByURL(body, customerId)

Attach a file to a customer by URL.

Adds a file to an existing customer by URL.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
RecordFile body = new RecordFile(); // RecordFile | The url and optionly fileName to be used.
Integer customerId = 56; // Integer | Id of the customer to add an file to
try {
    apiInstance.addCustomerFileByURL(body, customerId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#addCustomerFileByURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordFile**](RecordFile.md)| The url and optionly fileName to be used. |
 **customerId** | **Integer**| Id of the customer to add an file to |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCustomerTag"></a>
# **addCustomerTag**
> addCustomerTag(customerId, customerTag)

Add new tags for a customer.

Adds a tag to an existing customer.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
Integer customerId = 56; // Integer | Id of the customer to add a tag to
String customerTag = "customerTag_example"; // String | The tag to add
try {
    apiInstance.addCustomerTag(customerId, customerTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#addCustomerTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| Id of the customer to add a tag to |
 **customerTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomer"></a>
# **deleteCustomer**
> deleteCustomer(customerId)

Delete a customer

Deletes the customer identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
Integer customerId = 56; // Integer | Id of the customer to be deleted.
try {
    apiInstance.deleteCustomer(customerId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#deleteCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| Id of the customer to be deleted. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCustomerFile"></a>
# **deleteCustomerFile**
> deleteCustomerFile(customerId, fileId)

Delete a file for a customer.

Deletes an existing customer file using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
Integer customerId = 56; // Integer | Id of the customer to remove file from
Integer fileId = 56; // Integer | Id of the file to delete
try {
    apiInstance.deleteCustomerFile(customerId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#deleteCustomerFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| Id of the customer to remove file from |
 **fileId** | **Integer**| Id of the file to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCustomerTag"></a>
# **deleteCustomerTag**
> deleteCustomerTag(customerId, customerTag)

Delete a tag for a customer.

Deletes an existing customer tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
Integer customerId = 56; // Integer | Id of the customer to remove tag from
String customerTag = "customerTag_example"; // String | The tag to delete
try {
    apiInstance.deleteCustomerTag(customerId, customerTag);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#deleteCustomerTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| Id of the customer to remove tag from |
 **customerTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getByCustomerNo"></a>
# **getByCustomerNo**
> Customer getByCustomerNo(lobId, customerNo)

Get a customer by Customer No

Returns the customer identified by the specified parameters.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
Integer lobId = 56; // Integer | lobId of the customer to be returned.
String customerNo = "customerNo_example"; // String | customerNo of the customer to be returned.
try {
    Customer result = apiInstance.getByCustomerNo(lobId, customerNo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getByCustomerNo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lobId** | **Integer**| lobId of the customer to be returned. |
 **customerNo** | **String**| customerNo of the customer to be returned. |

### Return type

[**Customer**](Customer.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerByFilter"></a>
# **getCustomerByFilter**
> List&lt;Customer&gt; getCustomerByFilter(filter, page, limit, sort)

Search customers by filter

Returns the list of customers that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Customer> result = apiInstance.getCustomerByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getCustomerByFilter");
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

[**List&lt;Customer&gt;**](Customer.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerById"></a>
# **getCustomerById**
> Customer getCustomerById(customerId)

Get a customer by id

Returns the customer identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
Integer customerId = 56; // Integer | Id of the customer to be returned.
try {
    Customer result = apiInstance.getCustomerById(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getCustomerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| Id of the customer to be returned. |

### Return type

[**Customer**](Customer.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerFiles"></a>
# **getCustomerFiles**
> getCustomerFiles(customerId)

Get the files for a customer.

Get all existing customer files.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
Integer customerId = 56; // Integer | Id of the customer to get files for
try {
    apiInstance.getCustomerFiles(customerId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getCustomerFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| Id of the customer to get files for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerTags"></a>
# **getCustomerTags**
> getCustomerTags(customerId)

Get the tags for a customer.

Get all existing customer tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
Integer customerId = 56; // Integer | Id of the customer to get tags for
try {
    apiInstance.getCustomerTags(customerId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getCustomerTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| Id of the customer to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateCustomerById"></a>
# **getDuplicateCustomerById**
> Customer getDuplicateCustomerById(customerId)

Get a duplicated a customer by id

Returns a duplicated customer identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
Integer customerId = 56; // Integer | Id of the customer to be duplicated.
try {
    Customer result = apiInstance.getDuplicateCustomerById(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getDuplicateCustomerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| Id of the customer to be duplicated. |

### Return type

[**Customer**](Customer.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCustomer"></a>
# **updateCustomer**
> updateCustomer(body)

Update a customer

Updates an existing customer using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
Customer body = new Customer(); // Customer | Customer to be updated.
try {
    apiInstance.updateCustomer(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#updateCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Customer**](Customer.md)| Customer to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomerCustomFields"></a>
# **updateCustomerCustomFields**
> updateCustomerCustomFields(body)

Update a customer custom fields

Updates an existing customer custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
Customer body = new Customer(); // Customer | Customer to be updated.
try {
    apiInstance.updateCustomerCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#updateCustomerCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Customer**](Customer.md)| Customer to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

