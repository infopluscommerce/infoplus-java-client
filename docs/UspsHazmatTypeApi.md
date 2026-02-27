# UspsHazmatTypeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUSPSHazmatTypeById**](UspsHazmatTypeApi.md#getUSPSHazmatTypeById) | **GET** /beta/uspsHazmatType/{uspsHazmatTypeId} | Get an uspsHazmatType by id
[**getUspsHazmatTypeBySearchText**](UspsHazmatTypeApi.md#getUspsHazmatTypeBySearchText) | **GET** /beta/uspsHazmatType/search | Search uspsHazmatTypes


<a name="getUSPSHazmatTypeById"></a>
# **getUSPSHazmatTypeById**
> UspsHazmatType getUSPSHazmatTypeById(uspsHazmatTypeId)

Get an uspsHazmatType by id

Returns the uspsHazmatType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.UspsHazmatTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UspsHazmatTypeApi apiInstance = new UspsHazmatTypeApi();
String uspsHazmatTypeId = "uspsHazmatTypeId_example"; // String | Id of uspsHazmatType to be returned.
try {
    UspsHazmatType result = apiInstance.getUSPSHazmatTypeById(uspsHazmatTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UspsHazmatTypeApi#getUSPSHazmatTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uspsHazmatTypeId** | **String**| Id of uspsHazmatType to be returned. |

### Return type

[**UspsHazmatType**](UspsHazmatType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUspsHazmatTypeBySearchText"></a>
# **getUspsHazmatTypeBySearchText**
> List&lt;UspsHazmatType&gt; getUspsHazmatTypeBySearchText(searchText, page, limit)

Search uspsHazmatTypes

Returns the list of uspsHazmatTypes that match the given searchText.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.UspsHazmatTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UspsHazmatTypeApi apiInstance = new UspsHazmatTypeApi();
String searchText = "searchText_example"; // String | Search text, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
try {
    List<UspsHazmatType> result = apiInstance.getUspsHazmatTypeBySearchText(searchText, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UspsHazmatTypeApi#getUspsHazmatTypeBySearchText");
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

[**List&lt;UspsHazmatType&gt;**](UspsHazmatType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

