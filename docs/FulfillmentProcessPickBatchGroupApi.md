# FulfillmentProcessPickBatchGroupApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFulfillmentProcessGroupPicksByById**](FulfillmentProcessPickBatchGroupApi.md#getFulfillmentProcessGroupPicksByById) | **GET** /v3.0/fulfillmentProcessPickBatchGroup/{fulfillmentProcessPickBatchGroupId} | Get a fulfillmentProcessPickBatchGroup by id
[**getFulfillmentProcessPickBatchGroupBySearchText**](FulfillmentProcessPickBatchGroupApi.md#getFulfillmentProcessPickBatchGroupBySearchText) | **GET** /v3.0/fulfillmentProcessPickBatchGroup/search | Search fulfillmentProcessPickBatchGroups


<a name="getFulfillmentProcessGroupPicksByById"></a>
# **getFulfillmentProcessGroupPicksByById**
> FulfillmentProcessPickBatchGroup getFulfillmentProcessGroupPicksByById(fulfillmentProcessPickBatchGroupId)

Get a fulfillmentProcessPickBatchGroup by id

Returns the fulfillmentProcessPickBatchGroup identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentProcessPickBatchGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentProcessPickBatchGroupApi apiInstance = new FulfillmentProcessPickBatchGroupApi();
String fulfillmentProcessPickBatchGroupId = "fulfillmentProcessPickBatchGroupId_example"; // String | Id of fulfillmentProcessPickBatchGroup to be returned.
try {
    FulfillmentProcessPickBatchGroup result = apiInstance.getFulfillmentProcessGroupPicksByById(fulfillmentProcessPickBatchGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessPickBatchGroupApi#getFulfillmentProcessGroupPicksByById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentProcessPickBatchGroupId** | **String**| Id of fulfillmentProcessPickBatchGroup to be returned. |

### Return type

[**FulfillmentProcessPickBatchGroup**](FulfillmentProcessPickBatchGroup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFulfillmentProcessPickBatchGroupBySearchText"></a>
# **getFulfillmentProcessPickBatchGroupBySearchText**
> List&lt;FulfillmentProcessPickBatchGroup&gt; getFulfillmentProcessPickBatchGroupBySearchText(searchText, page, limit)

Search fulfillmentProcessPickBatchGroups

Returns the list of fulfillmentProcessPickBatchGroups that match the given searchText.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.FulfillmentProcessPickBatchGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FulfillmentProcessPickBatchGroupApi apiInstance = new FulfillmentProcessPickBatchGroupApi();
String searchText = "searchText_example"; // String | Search text, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
try {
    List<FulfillmentProcessPickBatchGroup> result = apiInstance.getFulfillmentProcessPickBatchGroupBySearchText(searchText, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentProcessPickBatchGroupApi#getFulfillmentProcessPickBatchGroupBySearchText");
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

[**List&lt;FulfillmentProcessPickBatchGroup&gt;**](FulfillmentProcessPickBatchGroup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

