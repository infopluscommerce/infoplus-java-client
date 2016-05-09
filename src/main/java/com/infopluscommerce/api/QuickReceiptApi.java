package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.QuickReceipt;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
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
   * Update a quickReceipt
   * Updates an existing quickReceipt using the specified data.
   * @param body QuickReceipt to be updated.
   * @return void
   */
  public void updateQuickReceipt(QuickReceipt body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateQuickReceipt");
     }
     
    // create path and map variables
    String path = "/v1.0/quickReceipt".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Create a quickReceipt
   * Inserts a new quickReceipt using the specified data.
   * @param body QuickReceipt to be inserted.
   * @return QuickReceipt
   */
  public QuickReceipt addQuickReceipt(QuickReceipt body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addQuickReceipt");
     }
     
    // create path and map variables
    String path = "/v1.0/quickReceipt".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<QuickReceipt> returnType = new GenericType<QuickReceipt>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search quickReceipts by filter
   * Returns the list of quickReceipts that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<QuickReceipt>
   */
  public List<QuickReceipt> getQuickReceiptByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/quickReceipt/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<List<QuickReceipt>> returnType = new GenericType<List<QuickReceipt>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a quickReceipt by id
   * Returns the quickReceipt identified by the specified id.
   * @param quickReceiptId Id of the quickReceipt to be returned.
   * @return QuickReceipt
   */
  public QuickReceipt getQuickReceiptById(Integer quickReceiptId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'quickReceiptId' is set
     if (quickReceiptId == null) {
        throw new ApiException(400, "Missing the required parameter 'quickReceiptId' when calling getQuickReceiptById");
     }
     
    // create path and map variables
    String path = "/v1.0/quickReceipt/{quickReceiptId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "quickReceiptId" + "\\}", apiClient.escapeString(quickReceiptId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<QuickReceipt> returnType = new GenericType<QuickReceipt>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a quickReceipt
   * Deletes the quickReceipt identified by the specified id.
   * @param quickReceiptId Id of the quickReceipt to be deleted.
   * @return void
   */
  public void deleteQuickReceipt(Integer quickReceiptId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'quickReceiptId' is set
     if (quickReceiptId == null) {
        throw new ApiException(400, "Missing the required parameter 'quickReceiptId' when calling deleteQuickReceipt");
     }
     
    // create path and map variables
    String path = "/v1.0/quickReceipt/{quickReceiptId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "quickReceiptId" + "\\}", apiClient.escapeString(quickReceiptId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
}
