# CarrierApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCarrierById**](CarrierApi.md#getCarrierById) | **GET** /beta/carrier/{carrierId} | Get a carrier by id
[**getCarrierBySearchText**](CarrierApi.md#getCarrierBySearchText) | **GET** /beta/carrier/search | Search carriers


<a name="getCarrierById"></a>
# **getCarrierById**
> Carrier getCarrierById(carrierId)

Get a carrier by id

Returns the carrier identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CarrierApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CarrierApi apiInstance = new CarrierApi();
String carrierId = "carrierId_example"; // String | Id of carrier to be returned.
try {
    Carrier result = apiInstance.getCarrierById(carrierId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarrierApi#getCarrierById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **carrierId** | **String**| Id of carrier to be returned. |

### Return type

[**Carrier**](Carrier.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCarrierBySearchText"></a>
# **getCarrierBySearchText**
> List&lt;Carrier&gt; getCarrierBySearchText(searchText, page, limit)

Search carriers

Returns the list of carriers that match the given searchText.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CarrierApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CarrierApi apiInstance = new CarrierApi();
String searchText = "searchText_example"; // String | Search text, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
try {
    List<Carrier> result = apiInstance.getCarrierBySearchText(searchText, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarrierApi#getCarrierBySearchText");
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

[**List&lt;Carrier&gt;**](Carrier.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

