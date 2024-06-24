# LoggedTimeTypeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLoggedTimeTypeById**](LoggedTimeTypeApi.md#getLoggedTimeTypeById) | **GET** /beta/loggedTimeType/{loggedTimeTypeId} | Get a loggedTimeType by id
[**getLoggedTimeTypeBySearchText**](LoggedTimeTypeApi.md#getLoggedTimeTypeBySearchText) | **GET** /beta/loggedTimeType/search | Search loggedTimeTypes


<a name="getLoggedTimeTypeById"></a>
# **getLoggedTimeTypeById**
> LoggedTimeType getLoggedTimeTypeById(loggedTimeTypeId)

Get a loggedTimeType by id

Returns the loggedTimeType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoggedTimeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoggedTimeTypeApi apiInstance = new LoggedTimeTypeApi();
String loggedTimeTypeId = "loggedTimeTypeId_example"; // String | Id of loggedTimeType to be returned.
try {
    LoggedTimeType result = apiInstance.getLoggedTimeTypeById(loggedTimeTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggedTimeTypeApi#getLoggedTimeTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loggedTimeTypeId** | **String**| Id of loggedTimeType to be returned. |

### Return type

[**LoggedTimeType**](LoggedTimeType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoggedTimeTypeBySearchText"></a>
# **getLoggedTimeTypeBySearchText**
> List&lt;LoggedTimeType&gt; getLoggedTimeTypeBySearchText(searchText, page, limit)

Search loggedTimeTypes

Returns the list of loggedTimeTypes that match the given searchText.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LoggedTimeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LoggedTimeTypeApi apiInstance = new LoggedTimeTypeApi();
String searchText = "searchText_example"; // String | Search text, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
try {
    List<LoggedTimeType> result = apiInstance.getLoggedTimeTypeBySearchText(searchText, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggedTimeTypeApi#getLoggedTimeTypeBySearchText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchText** | **String**| Search text, used to filter results. | [optional]
 **page** | **Integer**| Result page number.  Defaults to 1. | [optional]
 **limit** | **Integer**| Maximum results per page.  Defaults to 20.  Max allowed value is 250. | [optional]

### Return type

[**List&lt;LoggedTimeType&gt;**](LoggedTimeType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

