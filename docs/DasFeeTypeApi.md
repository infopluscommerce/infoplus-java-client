# DasFeeTypeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDASFeeTypeById**](DasFeeTypeApi.md#getDASFeeTypeById) | **GET** /beta/dasFeeType/{dasFeeTypeId} | Get a dasFeeType by id
[**getDasFeeTypeBySearchText**](DasFeeTypeApi.md#getDasFeeTypeBySearchText) | **GET** /beta/dasFeeType/search | Search dasFeeTypes


<a name="getDASFeeTypeById"></a>
# **getDASFeeTypeById**
> DasFeeType getDASFeeTypeById(dasFeeTypeId)

Get a dasFeeType by id

Returns the dasFeeType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DasFeeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DasFeeTypeApi apiInstance = new DasFeeTypeApi();
String dasFeeTypeId = "dasFeeTypeId_example"; // String | Id of dasFeeType to be returned.
try {
    DasFeeType result = apiInstance.getDASFeeTypeById(dasFeeTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DasFeeTypeApi#getDASFeeTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dasFeeTypeId** | **String**| Id of dasFeeType to be returned. |

### Return type

[**DasFeeType**](DasFeeType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDasFeeTypeBySearchText"></a>
# **getDasFeeTypeBySearchText**
> List&lt;DasFeeType&gt; getDasFeeTypeBySearchText(searchText, page, limit)

Search dasFeeTypes

Returns the list of dasFeeTypes that match the given searchText.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.DasFeeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DasFeeTypeApi apiInstance = new DasFeeTypeApi();
String searchText = "searchText_example"; // String | Search text, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
try {
    List<DasFeeType> result = apiInstance.getDasFeeTypeBySearchText(searchText, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DasFeeTypeApi#getDasFeeTypeBySearchText");
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

[**List&lt;DasFeeType&gt;**](DasFeeType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

