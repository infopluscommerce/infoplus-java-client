# PredefinedCartonApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPredefinedCartonById**](PredefinedCartonApi.md#getPredefinedCartonById) | **GET** /v3.0/predefinedCarton/{predefinedCartonId} | Get a predefinedCarton by id
[**getPredefinedCartonBySearchText**](PredefinedCartonApi.md#getPredefinedCartonBySearchText) | **GET** /v3.0/predefinedCarton/search | Search predefinedCartons


<a name="getPredefinedCartonById"></a>
# **getPredefinedCartonById**
> PredefinedCarton getPredefinedCartonById(predefinedCartonId)

Get a predefinedCarton by id

Returns the predefinedCarton identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PredefinedCartonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PredefinedCartonApi apiInstance = new PredefinedCartonApi();
String predefinedCartonId = "predefinedCartonId_example"; // String | Id of predefinedCarton to be returned.
try {
    PredefinedCarton result = apiInstance.getPredefinedCartonById(predefinedCartonId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PredefinedCartonApi#getPredefinedCartonById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **predefinedCartonId** | **String**| Id of predefinedCarton to be returned. |

### Return type

[**PredefinedCarton**](PredefinedCarton.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPredefinedCartonBySearchText"></a>
# **getPredefinedCartonBySearchText**
> List&lt;PredefinedCarton&gt; getPredefinedCartonBySearchText(searchText, page, limit)

Search predefinedCartons

Returns the list of predefinedCartons that match the given searchText.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.PredefinedCartonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PredefinedCartonApi apiInstance = new PredefinedCartonApi();
String searchText = "searchText_example"; // String | Search text, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
try {
    List<PredefinedCarton> result = apiInstance.getPredefinedCartonBySearchText(searchText, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PredefinedCartonApi#getPredefinedCartonBySearchText");
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

[**List&lt;PredefinedCarton&gt;**](PredefinedCarton.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

