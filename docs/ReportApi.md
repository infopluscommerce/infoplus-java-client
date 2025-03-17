# ReportApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**runReport**](ReportApi.md#runReport) | **GET** /beta/report/{reportId}/runReport | Run a specified report


<a name="runReport"></a>
# **runReport**
> runReport(reportId, format)

Run a specified report

Run a specified report

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.ReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ReportApi apiInstance = new ReportApi();
Integer reportId = 56; // Integer | Id of the report to run.
String format = "format_example"; // String | Format of the report.
try {
    apiInstance.runReport(reportId, format);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#runReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **Integer**| Id of the report to run. |
 **format** | **String**| Format of the report. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

