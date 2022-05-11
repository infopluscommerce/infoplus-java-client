# CarrierServiceApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCarrierServiceById**](CarrierServiceApi.md#getCarrierServiceById) | **GET** /v3.0/carrierService/{carrierServiceId} | Get a carrierService by id
[**getCarrierServiceBySearchText**](CarrierServiceApi.md#getCarrierServiceBySearchText) | **GET** /v3.0/carrierService/search | Search carrierServices


<a name="getCarrierServiceById"></a>
# **getCarrierServiceById**
> CarrierService getCarrierServiceById(carrierServiceId)

Get a carrierService by id

Returns the carrierService identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CarrierServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CarrierServiceApi apiInstance = new CarrierServiceApi();
String carrierServiceId = "carrierServiceId_example"; // String | Id of carrierService to be returned.
try {
    CarrierService result = apiInstance.getCarrierServiceById(carrierServiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarrierServiceApi#getCarrierServiceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **carrierServiceId** | **String**| Id of carrierService to be returned. |

### Return type

[**CarrierService**](CarrierService.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCarrierServiceBySearchText"></a>
# **getCarrierServiceBySearchText**
> List&lt;CarrierService&gt; getCarrierServiceBySearchText(searchText, page, limit)

Search carrierServices

Returns the list of carrierServices that match the given searchText.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CarrierServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CarrierServiceApi apiInstance = new CarrierServiceApi();
String searchText = "searchText_example"; // String | Search text, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
try {
    List<CarrierService> result = apiInstance.getCarrierServiceBySearchText(searchText, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarrierServiceApi#getCarrierServiceBySearchText");
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

[**List&lt;CarrierService&gt;**](CarrierService.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

