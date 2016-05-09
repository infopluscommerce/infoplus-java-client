package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.QuickAdjustment;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class QuickAdjustmentApi {
  private ApiClient apiClient;

  public QuickAdjustmentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public QuickAdjustmentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Update a quickAdjustment
   * Updates an existing quickAdjustment using the specified data.
   * @param body QuickAdjustment to be updated.
   * @return void
   */
  public void updateQuickAdjustment(QuickAdjustment body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateQuickAdjustment");
     }
     
    // create path and map variables
    String path = "/v1.0/quickAdjustment".replaceAll("\\{format\\}","json");

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
   * Create a quickAdjustment
   * Inserts a new quickAdjustment using the specified data.
   * @param body QuickAdjustment to be inserted.
   * @return QuickAdjustment
   */
  public QuickAdjustment addQuickAdjustment(QuickAdjustment body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addQuickAdjustment");
     }
     
    // create path and map variables
    String path = "/v1.0/quickAdjustment".replaceAll("\\{format\\}","json");

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

    
    GenericType<QuickAdjustment> returnType = new GenericType<QuickAdjustment>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search quickAdjustments by filter
   * Returns the list of quickAdjustments that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<QuickAdjustment>
   */
  public List<QuickAdjustment> getQuickAdjustmentByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/quickAdjustment/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<QuickAdjustment>> returnType = new GenericType<List<QuickAdjustment>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a quickAdjustment by id
   * Returns the quickAdjustment identified by the specified id.
   * @param quickAdjustmentId Id of the quickAdjustment to be returned.
   * @return QuickAdjustment
   */
  public QuickAdjustment getQuickAdjustmentById(Integer quickAdjustmentId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'quickAdjustmentId' is set
     if (quickAdjustmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'quickAdjustmentId' when calling getQuickAdjustmentById");
     }
     
    // create path and map variables
    String path = "/v1.0/quickAdjustment/{quickAdjustmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "quickAdjustmentId" + "\\}", apiClient.escapeString(quickAdjustmentId.toString()));

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

    
    GenericType<QuickAdjustment> returnType = new GenericType<QuickAdjustment>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a quickAdjustment
   * Deletes the quickAdjustment identified by the specified id.
   * @param quickAdjustmentId Id of the quickAdjustment to be deleted.
   * @return void
   */
  public void deleteQuickAdjustment(Integer quickAdjustmentId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'quickAdjustmentId' is set
     if (quickAdjustmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'quickAdjustmentId' when calling deleteQuickAdjustment");
     }
     
    // create path and map variables
    String path = "/v1.0/quickAdjustment/{quickAdjustmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "quickAdjustmentId" + "\\}", apiClient.escapeString(quickAdjustmentId.toString()));

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
