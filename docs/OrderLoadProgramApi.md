# OrderLoadProgramApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrderLoadProgramBySearchText**](OrderLoadProgramApi.md#getOrderLoadProgramBySearchText) | **GET** /beta/orderLoadProgram/search | Search orderLoadPrograms
[**getReqLoadProgramById**](OrderLoadProgramApi.md#getReqLoadProgramById) | **GET** /beta/orderLoadProgram/{orderLoadProgramId} | Get an orderLoadProgram by id


<a name="getOrderLoadProgramBySearchText"></a>
# **getOrderLoadProgramBySearchText**
> List&lt;OrderLoadProgram&gt; getOrderLoadProgramBySearchText(searchText, page, limit)

Search orderLoadPrograms

Returns the list of orderLoadPrograms that match the given searchText.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLoadProgramApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLoadProgramApi apiInstance = new OrderLoadProgramApi();
String searchText = "searchText_example"; // String | Search text, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
try {
    List<OrderLoadProgram> result = apiInstance.getOrderLoadProgramBySearchText(searchText, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLoadProgramApi#getOrderLoadProgramBySearchText");
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

[**List&lt;OrderLoadProgram&gt;**](OrderLoadProgram.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReqLoadProgramById"></a>
# **getReqLoadProgramById**
> OrderLoadProgram getReqLoadProgramById(orderLoadProgramId)

Get an orderLoadProgram by id

Returns the orderLoadProgram identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderLoadProgramApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderLoadProgramApi apiInstance = new OrderLoadProgramApi();
String orderLoadProgramId = "orderLoadProgramId_example"; // String | Id of orderLoadProgram to be returned.
try {
    OrderLoadProgram result = apiInstance.getReqLoadProgramById(orderLoadProgramId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLoadProgramApi#getReqLoadProgramById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderLoadProgramId** | **String**| Id of orderLoadProgram to be returned. |

### Return type

[**OrderLoadProgram**](OrderLoadProgram.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

