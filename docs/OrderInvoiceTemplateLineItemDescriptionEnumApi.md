# OrderInvoiceTemplateLineItemDescriptionEnumApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrderInvoiceTemplateLineItemDescriptionEnumById**](OrderInvoiceTemplateLineItemDescriptionEnumApi.md#getOrderInvoiceTemplateLineItemDescriptionEnumById) | **GET** /beta/orderInvoiceTemplateLineItemDescriptionEnum/{orderInvoiceTemplateLineItemDescriptionEnumId} | Get an orderInvoiceTemplateLineItemDescriptionEnum by id
[**getOrderInvoiceTemplateLineItemDescriptionEnumBySearchText**](OrderInvoiceTemplateLineItemDescriptionEnumApi.md#getOrderInvoiceTemplateLineItemDescriptionEnumBySearchText) | **GET** /beta/orderInvoiceTemplateLineItemDescriptionEnum/search | Search orderInvoiceTemplateLineItemDescriptionEnums


<a name="getOrderInvoiceTemplateLineItemDescriptionEnumById"></a>
# **getOrderInvoiceTemplateLineItemDescriptionEnumById**
> OrderInvoiceTemplateLineItemDescriptionEnum getOrderInvoiceTemplateLineItemDescriptionEnumById(orderInvoiceTemplateLineItemDescriptionEnumId)

Get an orderInvoiceTemplateLineItemDescriptionEnum by id

Returns the orderInvoiceTemplateLineItemDescriptionEnum identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderInvoiceTemplateLineItemDescriptionEnumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderInvoiceTemplateLineItemDescriptionEnumApi apiInstance = new OrderInvoiceTemplateLineItemDescriptionEnumApi();
String orderInvoiceTemplateLineItemDescriptionEnumId = "orderInvoiceTemplateLineItemDescriptionEnumId_example"; // String | Id of orderInvoiceTemplateLineItemDescriptionEnum to be returned.
try {
    OrderInvoiceTemplateLineItemDescriptionEnum result = apiInstance.getOrderInvoiceTemplateLineItemDescriptionEnumById(orderInvoiceTemplateLineItemDescriptionEnumId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderInvoiceTemplateLineItemDescriptionEnumApi#getOrderInvoiceTemplateLineItemDescriptionEnumById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderInvoiceTemplateLineItemDescriptionEnumId** | **String**| Id of orderInvoiceTemplateLineItemDescriptionEnum to be returned. |

### Return type

[**OrderInvoiceTemplateLineItemDescriptionEnum**](OrderInvoiceTemplateLineItemDescriptionEnum.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderInvoiceTemplateLineItemDescriptionEnumBySearchText"></a>
# **getOrderInvoiceTemplateLineItemDescriptionEnumBySearchText**
> List&lt;OrderInvoiceTemplateLineItemDescriptionEnum&gt; getOrderInvoiceTemplateLineItemDescriptionEnumBySearchText(searchText, page, limit)

Search orderInvoiceTemplateLineItemDescriptionEnums

Returns the list of orderInvoiceTemplateLineItemDescriptionEnums that match the given searchText.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.OrderInvoiceTemplateLineItemDescriptionEnumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderInvoiceTemplateLineItemDescriptionEnumApi apiInstance = new OrderInvoiceTemplateLineItemDescriptionEnumApi();
String searchText = "searchText_example"; // String | Search text, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
try {
    List<OrderInvoiceTemplateLineItemDescriptionEnum> result = apiInstance.getOrderInvoiceTemplateLineItemDescriptionEnumBySearchText(searchText, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderInvoiceTemplateLineItemDescriptionEnumApi#getOrderInvoiceTemplateLineItemDescriptionEnumBySearchText");
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

[**List&lt;OrderInvoiceTemplateLineItemDescriptionEnum&gt;**](OrderInvoiceTemplateLineItemDescriptionEnum.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

