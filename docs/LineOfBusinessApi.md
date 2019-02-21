# LineOfBusinessApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLineOfBusinessById**](LineOfBusinessApi.md#getLineOfBusinessById) | **GET** /beta/lineOfBusiness/{lineOfBusinessId} | Get a lineOfBusiness by id
[**getLineOfBusinessBySearchText**](LineOfBusinessApi.md#getLineOfBusinessBySearchText) | **GET** /beta/lineOfBusiness/search | Search lineOfBusinesses


<a name="getLineOfBusinessById"></a>
# **getLineOfBusinessById**
> LineOfBusiness getLineOfBusinessById(lineOfBusinessId)

Get a lineOfBusiness by id

Returns the lineOfBusiness identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LineOfBusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LineOfBusinessApi apiInstance = new LineOfBusinessApi();
String lineOfBusinessId = "lineOfBusinessId_example"; // String | Id of lineOfBusiness to be returned.
try {
    LineOfBusiness result = apiInstance.getLineOfBusinessById(lineOfBusinessId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LineOfBusinessApi#getLineOfBusinessById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lineOfBusinessId** | **String**| Id of lineOfBusiness to be returned. |

### Return type

[**LineOfBusiness**](LineOfBusiness.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLineOfBusinessBySearchText"></a>
# **getLineOfBusinessBySearchText**
> List&lt;LineOfBusiness&gt; getLineOfBusinessBySearchText(searchText, page, limit)

Search lineOfBusinesses

Returns the list of lineOfBusinesses that match the given searchText.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.LineOfBusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LineOfBusinessApi apiInstance = new LineOfBusinessApi();
String searchText = "searchText_example"; // String | Search text, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
try {
    List<LineOfBusiness> result = apiInstance.getLineOfBusinessBySearchText(searchText, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LineOfBusinessApi#getLineOfBusinessBySearchText");
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

[**List&lt;LineOfBusiness&gt;**](LineOfBusiness.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

