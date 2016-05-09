package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.FulfillmentPlan;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class FulfillmentPlanApi {
  private ApiClient apiClient;

  public FulfillmentPlanApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FulfillmentPlanApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Update a fulfillmentPlan
   * Updates an existing fulfillmentPlan using the specified data.
   * @param body FulfillmentPlan to be updated.
   * @return void
   */
  public void updateFulfillmentPlan(FulfillmentPlan body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateFulfillmentPlan");
     }
     
    // create path and map variables
    String path = "/v1.0/fulfillmentPlan".replaceAll("\\{format\\}","json");

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
   * Create a fulfillmentPlan
   * Inserts a new fulfillmentPlan using the specified data.
   * @param body FulfillmentPlan to be inserted.
   * @return FulfillmentPlan
   */
  public FulfillmentPlan addFulfillmentPlan(FulfillmentPlan body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addFulfillmentPlan");
     }
     
    // create path and map variables
    String path = "/v1.0/fulfillmentPlan".replaceAll("\\{format\\}","json");

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

    
    GenericType<FulfillmentPlan> returnType = new GenericType<FulfillmentPlan>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search fulfillmentPlans by filter
   * Returns the list of fulfillmentPlans that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<FulfillmentPlan>
   */
  public List<FulfillmentPlan> getFulfillmentPlanByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/fulfillmentPlan/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<FulfillmentPlan>> returnType = new GenericType<List<FulfillmentPlan>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a fulfillmentPlan by id
   * Returns the fulfillmentPlan identified by the specified id.
   * @param fulfillmentPlanId Id of the fulfillmentPlan to be returned.
   * @return FulfillmentPlan
   */
  public FulfillmentPlan getFulfillmentPlanById(Integer fulfillmentPlanId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'fulfillmentPlanId' is set
     if (fulfillmentPlanId == null) {
        throw new ApiException(400, "Missing the required parameter 'fulfillmentPlanId' when calling getFulfillmentPlanById");
     }
     
    // create path and map variables
    String path = "/v1.0/fulfillmentPlan/{fulfillmentPlanId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "fulfillmentPlanId" + "\\}", apiClient.escapeString(fulfillmentPlanId.toString()));

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

    
    GenericType<FulfillmentPlan> returnType = new GenericType<FulfillmentPlan>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a fulfillmentPlan
   * Deletes the fulfillmentPlan identified by the specified id.
   * @param fulfillmentPlanId Id of the fulfillmentPlan to be deleted.
   * @return void
   */
  public void deleteFulfillmentPlan(Integer fulfillmentPlanId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'fulfillmentPlanId' is set
     if (fulfillmentPlanId == null) {
        throw new ApiException(400, "Missing the required parameter 'fulfillmentPlanId' when calling deleteFulfillmentPlan");
     }
     
    // create path and map variables
    String path = "/v1.0/fulfillmentPlan/{fulfillmentPlanId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "fulfillmentPlanId" + "\\}", apiClient.escapeString(fulfillmentPlanId.toString()));

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
