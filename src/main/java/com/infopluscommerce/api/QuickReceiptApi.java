package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ApiResponse;
import com.infopluscommerce.model.QuickReceipt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T15:40:30.367-05:00")
public class QuickReceiptApi {
  private ApiClient apiClient;

  public QuickReceiptApi() {
    this(Configuration.getDefaultApiClient());
  }

  public QuickReceiptApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a quickReceipt
   * Inserts a new quickReceipt using the specified data.
   * @param body QuickReceipt to be inserted. (required)
   * @return QuickReceipt
   * @throws ApiException if fails to make API call
   */
  public QuickReceipt addQuickReceipt(QuickReceipt body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addQuickReceipt");
    }
    
    // create path and map variables
    String localVarPath = "/v1.0/quickReceipt".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    GenericType<QuickReceipt> localVarReturnType = new GenericType<QuickReceipt>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete a quickReceipt
   * Deletes the quickReceipt identified by the specified id.
   * @param quickReceiptId Id of the quickReceipt to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteQuickReceipt(Integer quickReceiptId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'quickReceiptId' is set
    if (quickReceiptId == null) {
      throw new ApiException(400, "Missing the required parameter 'quickReceiptId' when calling deleteQuickReceipt");
    }
    
    // create path and map variables
    String localVarPath = "/v1.0/quickReceipt/{quickReceiptId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "quickReceiptId" + "\\}", apiClient.escapeString(quickReceiptId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Search quickReceipts by filter
   * Returns the list of quickReceipts that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<QuickReceipt>
   * @throws ApiException if fails to make API call
   */
  public List<QuickReceipt> getQuickReceiptByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1.0/quickReceipt/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    GenericType<List<QuickReceipt>> localVarReturnType = new GenericType<List<QuickReceipt>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a quickReceipt by id
   * Returns the quickReceipt identified by the specified id.
   * @param quickReceiptId Id of the quickReceipt to be returned. (required)
   * @return QuickReceipt
   * @throws ApiException if fails to make API call
   */
  public QuickReceipt getQuickReceiptById(Integer quickReceiptId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'quickReceiptId' is set
    if (quickReceiptId == null) {
      throw new ApiException(400, "Missing the required parameter 'quickReceiptId' when calling getQuickReceiptById");
    }
    
    // create path and map variables
    String localVarPath = "/v1.0/quickReceipt/{quickReceiptId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "quickReceiptId" + "\\}", apiClient.escapeString(quickReceiptId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    GenericType<QuickReceipt> localVarReturnType = new GenericType<QuickReceipt>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a quickReceipt
   * Updates an existing quickReceipt using the specified data.
   * @param body QuickReceipt to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateQuickReceipt(QuickReceipt body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateQuickReceipt");
    }
    
    // create path and map variables
    String localVarPath = "/v1.0/quickReceipt".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
}
