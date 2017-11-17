package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.FulfillmentPlan;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:31:34.297-06:00")
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
   * Create a fulfillmentPlan
   * Inserts a new fulfillmentPlan using the specified data.
   * @param body FulfillmentPlan to be inserted. (required)
   * @return FulfillmentPlan
   * @throws ApiException if fails to make API call
   */
  public FulfillmentPlan addFulfillmentPlan(FulfillmentPlan body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addFulfillmentPlan");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/fulfillmentPlan".replaceAll("\\{format\\}","json");

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

    
    GenericType<FulfillmentPlan> localVarReturnType = new GenericType<FulfillmentPlan>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete a fulfillmentPlan
   * Deletes the fulfillmentPlan identified by the specified id.
   * @param fulfillmentPlanId Id of the fulfillmentPlan to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteFulfillmentPlan(Integer fulfillmentPlanId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fulfillmentPlanId' is set
    if (fulfillmentPlanId == null) {
      throw new ApiException(400, "Missing the required parameter 'fulfillmentPlanId' when calling deleteFulfillmentPlan");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/fulfillmentPlan/{fulfillmentPlanId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "fulfillmentPlanId" + "\\}", apiClient.escapeString(fulfillmentPlanId.toString()));

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
   * Get a duplicated a fulfillmentPlan by id
   * Returns a duplicated fulfillmentPlan identified by the specified id.
   * @param fulfillmentPlanId Id of the fulfillmentPlan to be duplicated. (required)
   * @return FulfillmentPlan
   * @throws ApiException if fails to make API call
   */
  public FulfillmentPlan getDuplicateFulfillmentPlanById(Integer fulfillmentPlanId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fulfillmentPlanId' is set
    if (fulfillmentPlanId == null) {
      throw new ApiException(400, "Missing the required parameter 'fulfillmentPlanId' when calling getDuplicateFulfillmentPlanById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/fulfillmentPlan/duplicate/{fulfillmentPlanId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "fulfillmentPlanId" + "\\}", apiClient.escapeString(fulfillmentPlanId.toString()));

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

    
    GenericType<FulfillmentPlan> localVarReturnType = new GenericType<FulfillmentPlan>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search fulfillmentPlans by filter
   * Returns the list of fulfillmentPlans that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<FulfillmentPlan>
   * @throws ApiException if fails to make API call
   */
  public List<FulfillmentPlan> getFulfillmentPlanByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2.0/fulfillmentPlan/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<FulfillmentPlan>> localVarReturnType = new GenericType<List<FulfillmentPlan>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a fulfillmentPlan by id
   * Returns the fulfillmentPlan identified by the specified id.
   * @param fulfillmentPlanId Id of the fulfillmentPlan to be returned. (required)
   * @return FulfillmentPlan
   * @throws ApiException if fails to make API call
   */
  public FulfillmentPlan getFulfillmentPlanById(Integer fulfillmentPlanId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fulfillmentPlanId' is set
    if (fulfillmentPlanId == null) {
      throw new ApiException(400, "Missing the required parameter 'fulfillmentPlanId' when calling getFulfillmentPlanById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/fulfillmentPlan/{fulfillmentPlanId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "fulfillmentPlanId" + "\\}", apiClient.escapeString(fulfillmentPlanId.toString()));

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

    
    GenericType<FulfillmentPlan> localVarReturnType = new GenericType<FulfillmentPlan>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a fulfillmentPlan
   * Updates an existing fulfillmentPlan using the specified data.
   * @param body FulfillmentPlan to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateFulfillmentPlan(FulfillmentPlan body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateFulfillmentPlan");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/fulfillmentPlan".replaceAll("\\{format\\}","json");

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
  
  /**
   * Update a fulfillmentPlan custom fields
   * Updates an existing fulfillmentPlan custom fields using the specified data.
   * @param body FulfillmentPlan to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateFulfillmentPlanCustomFields(FulfillmentPlan body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateFulfillmentPlanCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/fulfillmentPlan/customFields".replaceAll("\\{format\\}","json");

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
