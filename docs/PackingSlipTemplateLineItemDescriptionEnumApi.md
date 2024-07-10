# PackingSlipTemplateLineItemDescriptionEnumApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPackingSlipTemplateLineItemDescriptionEnumById**](PackingSlipTemplateLineItemDescriptionEnumApi.md#getPackingSlipTemplateLineItemDescriptionEnumById) | **GET** /beta/packingSlipTemplateLineItemDescriptionEnum/{packingSlipTemplateLineItemDescriptionEnumId} | Get a packingSlipTemplateLineItemDescriptionEnum by id
[**getPackingSlipTemplateLineItemDescriptionEnumBySearchText**](PackingSlipTemplateLineItemDescriptionEnumApi.md#getPackingSlipTemplateLineItemDescriptionEnumBySearchText) | **GET** /beta/packingSlipTemplateLineItemDescriptionEnum/search | Search packingSlipTemplateLineItemDescriptionEnums


<a name="getPackingSlipTemplateLineItemDescriptionEnumById"></a>
# **getPackingSlipTemplateLineItemDescriptionEnumById**
> PackingSlipTemplateLineItemDescriptionEnum getPackingSlipTemplateLineItemDescriptionEnumById(packingSlipTemplateLineItemDescriptionEnumId)

Get a packingSlipTemplateLineItemDescriptionEnum by id

Returns the packingSlipTemplateLineItemDescriptionEnum identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingSlipTemplateLineItemDescriptionEnumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingSlipTemplateLineItemDescriptionEnumApi apiInstance = new PackingSlipTemplateLineItemDescriptionEnumApi();
String packingSlipTemplateLineItemDescriptionEnumId = "packingSlipTemplateLineItemDescriptionEnumId_example"; // String | Id of packingSlipTemplateLineItemDescriptionEnum to be returned.
try {
    PackingSlipTemplateLineItemDescriptionEnum result = apiInstance.getPackingSlipTemplateLineItemDescriptionEnumById(packingSlipTemplateLineItemDescriptionEnumId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingSlipTemplateLineItemDescriptionEnumApi#getPackingSlipTemplateLineItemDescriptionEnumById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packingSlipTemplateLineItemDescriptionEnumId** | **String**| Id of packingSlipTemplateLineItemDescriptionEnum to be returned. |

### Return type

[**PackingSlipTemplateLineItemDescriptionEnum**](PackingSlipTemplateLineItemDescriptionEnum.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPackingSlipTemplateLineItemDescriptionEnumBySearchText"></a>
# **getPackingSlipTemplateLineItemDescriptionEnumBySearchText**
> List&lt;PackingSlipTemplateLineItemDescriptionEnum&gt; getPackingSlipTemplateLineItemDescriptionEnumBySearchText(searchText, page, limit)

Search packingSlipTemplateLineItemDescriptionEnums

Returns the list of packingSlipTemplateLineItemDescriptionEnums that match the given searchText.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PackingSlipTemplateLineItemDescriptionEnumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PackingSlipTemplateLineItemDescriptionEnumApi apiInstance = new PackingSlipTemplateLineItemDescriptionEnumApi();
String searchText = "searchText_example"; // String | Search text, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
try {
    List<PackingSlipTemplateLineItemDescriptionEnum> result = apiInstance.getPackingSlipTemplateLineItemDescriptionEnumBySearchText(searchText, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackingSlipTemplateLineItemDescriptionEnumApi#getPackingSlipTemplateLineItemDescriptionEnumBySearchText");
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

[**List&lt;PackingSlipTemplateLineItemDescriptionEnum&gt;**](PackingSlipTemplateLineItemDescriptionEnum.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

