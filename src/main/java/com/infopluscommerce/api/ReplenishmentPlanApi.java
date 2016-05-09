package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ReplenishmentPlan;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class ReplenishmentPlanApi {
  private ApiClient apiClient;

  public ReplenishmentPlanApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReplenishmentPlanApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Update a replenishmentPlan
   * Updates an existing replenishmentPlan using the specified data.
   * @param body ReplenishmentPlan to be updated.
   * @return void
   */
  public void updateReplenishmentPlan(ReplenishmentPlan body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateReplenishmentPlan");
     }
     
    // create path and map variables
    String path = "/v1.0/replenishmentPlan".replaceAll("\\{format\\}","json");

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
   * Create a replenishmentPlan
   * Inserts a new replenishmentPlan using the specified data.
   * @param body ReplenishmentPlan to be inserted.
   * @return ReplenishmentPlan
   */
  public ReplenishmentPlan addReplenishmentPlan(ReplenishmentPlan body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addReplenishmentPlan");
     }
     
    // create path and map variables
    String path = "/v1.0/replenishmentPlan".replaceAll("\\{format\\}","json");

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

    
    GenericType<ReplenishmentPlan> returnType = new GenericType<ReplenishmentPlan>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search replenishmentPlans by filter
   * Returns the list of replenishmentPlans that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<ReplenishmentPlan>
   */
  public List<ReplenishmentPlan> getReplenishmentPlanByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/replenishmentPlan/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ReplenishmentPlan>> returnType = new GenericType<List<ReplenishmentPlan>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a replenishmentPlan by id
   * Returns the replenishmentPlan identified by the specified id.
   * @param replenishmentPlanId Id of the replenishmentPlan to be returned.
   * @return ReplenishmentPlan
   */
  public ReplenishmentPlan getReplenishmentPlanById(Integer replenishmentPlanId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'replenishmentPlanId' is set
     if (replenishmentPlanId == null) {
        throw new ApiException(400, "Missing the required parameter 'replenishmentPlanId' when calling getReplenishmentPlanById");
     }
     
    // create path and map variables
    String path = "/v1.0/replenishmentPlan/{replenishmentPlanId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "replenishmentPlanId" + "\\}", apiClient.escapeString(replenishmentPlanId.toString()));

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

    
    GenericType<ReplenishmentPlan> returnType = new GenericType<ReplenishmentPlan>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a replenishmentPlan
   * Deletes the replenishmentPlan identified by the specified id.
   * @param replenishmentPlanId Id of the replenishmentPlan to be deleted.
   * @return void
   */
  public void deleteReplenishmentPlan(Integer replenishmentPlanId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'replenishmentPlanId' is set
     if (replenishmentPlanId == null) {
        throw new ApiException(400, "Missing the required parameter 'replenishmentPlanId' when calling deleteReplenishmentPlan");
     }
     
    // create path and map variables
    String path = "/v1.0/replenishmentPlan/{replenishmentPlanId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "replenishmentPlanId" + "\\}", apiClient.escapeString(replenishmentPlanId.toString()));

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
