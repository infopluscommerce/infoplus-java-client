# ManifestPartnerApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getManifestPartnerBySearchText**](ManifestPartnerApi.md#getManifestPartnerBySearchText) | **GET** /beta/manifestPartner/search | Search manifestPartners
[**getManifestSolutionProviderById**](ManifestPartnerApi.md#getManifestSolutionProviderById) | **GET** /beta/manifestPartner/{manifestPartnerId} | Get a manifestPartner by id


<a name="getManifestPartnerBySearchText"></a>
# **getManifestPartnerBySearchText**
> List&lt;ManifestPartner&gt; getManifestPartnerBySearchText(searchText, page, limit)

Search manifestPartners

Returns the list of manifestPartners that match the given searchText.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ManifestPartnerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ManifestPartnerApi apiInstance = new ManifestPartnerApi();
String searchText = "searchText_example"; // String | Search text, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
try {
    List<ManifestPartner> result = apiInstance.getManifestPartnerBySearchText(searchText, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManifestPartnerApi#getManifestPartnerBySearchText");
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

[**List&lt;ManifestPartner&gt;**](ManifestPartner.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getManifestSolutionProviderById"></a>
# **getManifestSolutionProviderById**
> ManifestPartner getManifestSolutionProviderById(manifestPartnerId)

Get a manifestPartner by id

Returns the manifestPartner identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ManifestPartnerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ManifestPartnerApi apiInstance = new ManifestPartnerApi();
String manifestPartnerId = "manifestPartnerId_example"; // String | Id of manifestPartner to be returned.
try {
    ManifestPartner result = apiInstance.getManifestSolutionProviderById(manifestPartnerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManifestPartnerApi#getManifestSolutionProviderById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **manifestPartnerId** | **String**| Id of manifestPartner to be returned. |

### Return type

[**ManifestPartner**](ManifestPartner.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

