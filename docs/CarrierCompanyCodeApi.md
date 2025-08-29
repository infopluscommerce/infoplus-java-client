# CarrierCompanyCodeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCarrierCompanyCodeById**](CarrierCompanyCodeApi.md#getCarrierCompanyCodeById) | **GET** /beta/carrierCompanyCode/{carrierCompanyCodeId} | Get a carrierCompanyCode by id
[**getCarrierCompanyCodeBySearchText**](CarrierCompanyCodeApi.md#getCarrierCompanyCodeBySearchText) | **GET** /beta/carrierCompanyCode/search | Search carrierCompanyCodes


<a name="getCarrierCompanyCodeById"></a>
# **getCarrierCompanyCodeById**
> CarrierCompanyCode getCarrierCompanyCodeById(carrierCompanyCodeId)

Get a carrierCompanyCode by id

Returns the carrierCompanyCode identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CarrierCompanyCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CarrierCompanyCodeApi apiInstance = new CarrierCompanyCodeApi();
String carrierCompanyCodeId = "carrierCompanyCodeId_example"; // String | Id of carrierCompanyCode to be returned.
try {
    CarrierCompanyCode result = apiInstance.getCarrierCompanyCodeById(carrierCompanyCodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarrierCompanyCodeApi#getCarrierCompanyCodeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **carrierCompanyCodeId** | **String**| Id of carrierCompanyCode to be returned. |

### Return type

[**CarrierCompanyCode**](CarrierCompanyCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCarrierCompanyCodeBySearchText"></a>
# **getCarrierCompanyCodeBySearchText**
> List&lt;CarrierCompanyCode&gt; getCarrierCompanyCodeBySearchText(searchText, page, limit)

Search carrierCompanyCodes

Returns the list of carrierCompanyCodes that match the given searchText.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.CarrierCompanyCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CarrierCompanyCodeApi apiInstance = new CarrierCompanyCodeApi();
String searchText = "searchText_example"; // String | Search text, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
try {
    List<CarrierCompanyCode> result = apiInstance.getCarrierCompanyCodeBySearchText(searchText, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarrierCompanyCodeApi#getCarrierCompanyCodeBySearchText");
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

[**List&lt;CarrierCompanyCode&gt;**](CarrierCompanyCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

