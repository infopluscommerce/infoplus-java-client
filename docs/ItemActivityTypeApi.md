# ItemActivityTypeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getItemActivityTypeById**](ItemActivityTypeApi.md#getItemActivityTypeById) | **GET** /v3.0/itemActivityType/{itemActivityTypeId} | Get an itemActivityType by id
[**getItemActivityTypeBySearchText**](ItemActivityTypeApi.md#getItemActivityTypeBySearchText) | **GET** /v3.0/itemActivityType/search | Search itemActivityTypes


<a name="getItemActivityTypeById"></a>
# **getItemActivityTypeById**
> ItemActivityType getItemActivityTypeById(itemActivityTypeId)

Get an itemActivityType by id

Returns the itemActivityType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemActivityTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemActivityTypeApi apiInstance = new ItemActivityTypeApi();
String itemActivityTypeId = "itemActivityTypeId_example"; // String | Id of itemActivityType to be returned.
try {
    ItemActivityType result = apiInstance.getItemActivityTypeById(itemActivityTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemActivityTypeApi#getItemActivityTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemActivityTypeId** | **String**| Id of itemActivityType to be returned. |

### Return type

[**ItemActivityType**](ItemActivityType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemActivityTypeBySearchText"></a>
# **getItemActivityTypeBySearchText**
> List&lt;ItemActivityType&gt; getItemActivityTypeBySearchText(searchText, page, limit)

Search itemActivityTypes

Returns the list of itemActivityTypes that match the given searchText.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ItemActivityTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ItemActivityTypeApi apiInstance = new ItemActivityTypeApi();
String searchText = "searchText_example"; // String | Search text, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
try {
    List<ItemActivityType> result = apiInstance.getItemActivityTypeBySearchText(searchText, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemActivityTypeApi#getItemActivityTypeBySearchText");
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

[**List&lt;ItemActivityType&gt;**](ItemActivityType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

