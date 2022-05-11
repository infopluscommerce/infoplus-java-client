# IntegrationPartnerApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIntegrationPartnerById**](IntegrationPartnerApi.md#getIntegrationPartnerById) | **GET** /v3.0/integrationPartner/{integrationPartnerId} | Get an integrationPartner by id
[**getIntegrationPartnerBySearchText**](IntegrationPartnerApi.md#getIntegrationPartnerBySearchText) | **GET** /v3.0/integrationPartner/search | Search integrationPartners


<a name="getIntegrationPartnerById"></a>
# **getIntegrationPartnerById**
> IntegrationPartner getIntegrationPartnerById(integrationPartnerId)

Get an integrationPartner by id

Returns the integrationPartner identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.IntegrationPartnerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

IntegrationPartnerApi apiInstance = new IntegrationPartnerApi();
String integrationPartnerId = "integrationPartnerId_example"; // String | Id of integrationPartner to be returned.
try {
    IntegrationPartner result = apiInstance.getIntegrationPartnerById(integrationPartnerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationPartnerApi#getIntegrationPartnerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationPartnerId** | **String**| Id of integrationPartner to be returned. |

### Return type

[**IntegrationPartner**](IntegrationPartner.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIntegrationPartnerBySearchText"></a>
# **getIntegrationPartnerBySearchText**
> List&lt;IntegrationPartner&gt; getIntegrationPartnerBySearchText(searchText, page, limit)

Search integrationPartners

Returns the list of integrationPartners that match the given searchText.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.IntegrationPartnerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

IntegrationPartnerApi apiInstance = new IntegrationPartnerApi();
String searchText = "searchText_example"; // String | Search text, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
try {
    List<IntegrationPartner> result = apiInstance.getIntegrationPartnerBySearchText(searchText, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationPartnerApi#getIntegrationPartnerBySearchText");
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

[**List&lt;IntegrationPartner&gt;**](IntegrationPartner.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

