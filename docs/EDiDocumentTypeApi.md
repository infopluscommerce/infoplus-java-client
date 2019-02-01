# EDiDocumentTypeApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEDIDocumentTypeById**](EDiDocumentTypeApi.md#getEDIDocumentTypeById) | **GET** /beta/eDIDocumentType/{eDIDocumentTypeId} | Get an eDIDocumentType by id
[**getEDIDocumentTypeBySearchText**](EDiDocumentTypeApi.md#getEDIDocumentTypeBySearchText) | **GET** /beta/eDIDocumentType/search | Search eDIDocumentTypes


<a name="getEDIDocumentTypeById"></a>
# **getEDIDocumentTypeById**
> EDIDocumentType getEDIDocumentTypeById(eDIDocumentTypeId)

Get an eDIDocumentType by id

Returns the eDIDocumentType identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EDiDocumentTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EDiDocumentTypeApi apiInstance = new EDiDocumentTypeApi();
String eDIDocumentTypeId = "eDIDocumentTypeId_example"; // String | Id of eDIDocumentType to be returned.
try {
    EDIDocumentType result = apiInstance.getEDIDocumentTypeById(eDIDocumentTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EDiDocumentTypeApi#getEDIDocumentTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eDIDocumentTypeId** | **String**| Id of eDIDocumentType to be returned. |

### Return type

[**EDIDocumentType**](EDIDocumentType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEDIDocumentTypeBySearchText"></a>
# **getEDIDocumentTypeBySearchText**
> List&lt;EDIDocumentType&gt; getEDIDocumentTypeBySearchText(searchText, page, limit)

Search eDIDocumentTypes

Returns the list of eDIDocumentTypes that match the given searchText.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.EDiDocumentTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EDiDocumentTypeApi apiInstance = new EDiDocumentTypeApi();
String searchText = "searchText_example"; // String | Search text, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
try {
    List<EDIDocumentType> result = apiInstance.getEDIDocumentTypeBySearchText(searchText, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EDiDocumentTypeApi#getEDIDocumentTypeBySearchText");
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

[**List&lt;EDIDocumentType&gt;**](EDIDocumentType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

