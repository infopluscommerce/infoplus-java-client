# ServiceTypeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getServiceTypeById**](ServiceTypeApi.md#getServiceTypeById) | **GET** /v3.0/serviceType/{serviceTypeId} | Get a serviceType by id
[**getServiceTypeBySearchText**](ServiceTypeApi.md#getServiceTypeBySearchText) | **GET** /v3.0/serviceType/search | Search serviceTypes


<a name="getServiceTypeById"></a>
# **getServiceTypeById**
> ServiceType getServiceTypeById(serviceTypeId)

Get a serviceType by id

Returns the serviceType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ServiceTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ServiceTypeApi apiInstance = new ServiceTypeApi();
String serviceTypeId = "serviceTypeId_example"; // String | Id of serviceType to be returned.
try {
    ServiceType result = apiInstance.getServiceTypeById(serviceTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceTypeApi#getServiceTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceTypeId** | **String**| Id of serviceType to be returned. |

### Return type

[**ServiceType**](ServiceType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceTypeBySearchText"></a>
# **getServiceTypeBySearchText**
> List&lt;ServiceType&gt; getServiceTypeBySearchText(searchText, page, limit)

Search serviceTypes

Returns the list of serviceTypes that match the given searchText.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ServiceTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ServiceTypeApi apiInstance = new ServiceTypeApi();
String searchText = "searchText_example"; // String | Search text, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
try {
    List<ServiceType> result = apiInstance.getServiceTypeBySearchText(searchText, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceTypeApi#getServiceTypeBySearchText");
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

[**List&lt;ServiceType&gt;**](ServiceType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

