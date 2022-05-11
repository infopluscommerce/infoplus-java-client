# PackingSlipTemplateLineExtraDataEnumApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPackingSlipTemplateLineExtraDataEnumById**](PackingSlipTemplateLineExtraDataEnumApi.md#getPackingSlipTemplateLineExtraDataEnumById) | **GET** /v3.0/packingSlipTemplateLineExtraDataEnum/{packingSlipTemplateLineExtraDataEnumId} | Get a packingSlipTemplateLineExtraDataEnum by id
[**getPackingSlipTemplateLineExtraDataEnumBySearchText**](PackingSlipTemplateLineExtraDataEnumApi.md#getPackingSlipTemplateLineExtraDataEnumBySearchText) | **GET** /v3.0/packingSlipTemplateLineExtraDataEnum/search | Search packingSlipTemplateLineExtraDataEnums


<a name="getPackingSlipTemplateLineExtraDataEnumById"></a>
# **getPackingSlipTemplateLineExtraDataEnumById**
> PackingSlipTemplateLineExtraDataEnum getPackingSlipTemplateLineExtraDataEnumById(packingSlipTemplateLineExtraDataEnumId)

Get a packingSlipTemplateLineExtraDataEnum by id

Returns the packingSlipTemplateLineExtraDataEnum identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingSlipTemplateLineExtraDataEnumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingSlipTemplateLineExtraDataEnumApi apiInstance = new PackingSlipTemplateLineExtraDataEnumApi();
String packingSlipTemplateLineExtraDataEnumId = "packingSlipTemplateLineExtraDataEnumId_example"; // String | Id of packingSlipTemplateLineExtraDataEnum to be returned.
try {
    PackingSlipTemplateLineExtraDataEnum result = apiInstance.getPackingSlipTemplateLineExtraDataEnumById(packingSlipTemplateLineExtraDataEnumId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingSlipTemplateLineExtraDataEnumApi#getPackingSlipTemplateLineExtraDataEnumById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingSlipTemplateLineExtraDataEnumId** | **String**| Id of packingSlipTemplateLineExtraDataEnum to be returned. |

### Return type

[**PackingSlipTemplateLineExtraDataEnum**](PackingSlipTemplateLineExtraDataEnum.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPackingSlipTemplateLineExtraDataEnumBySearchText"></a>
# **getPackingSlipTemplateLineExtraDataEnumBySearchText**
> List&lt;PackingSlipTemplateLineExtraDataEnum&gt; getPackingSlipTemplateLineExtraDataEnumBySearchText(searchText, page, limit)

Search packingSlipTemplateLineExtraDataEnums

Returns the list of packingSlipTemplateLineExtraDataEnums that match the given searchText.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingSlipTemplateLineExtraDataEnumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingSlipTemplateLineExtraDataEnumApi apiInstance = new PackingSlipTemplateLineExtraDataEnumApi();
String searchText = "searchText_example"; // String | Search text, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
try {
    List<PackingSlipTemplateLineExtraDataEnum> result = apiInstance.getPackingSlipTemplateLineExtraDataEnumBySearchText(searchText, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingSlipTemplateLineExtraDataEnumApi#getPackingSlipTemplateLineExtraDataEnumBySearchText");
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

[**List&lt;PackingSlipTemplateLineExtraDataEnum&gt;**](PackingSlipTemplateLineExtraDataEnum.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

