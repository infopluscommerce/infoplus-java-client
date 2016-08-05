package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ApiResponse;
import com.infopluscommerce.model.ManageScheduledPlans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-04T22:56:01.104-05:00")
public class ManageScheduledPlansApi {
  private ApiClient apiClient;

  public ManageScheduledPlansApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ManageScheduledPlansApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a manageScheduledPlans
   * Inserts a new manageScheduledPlans using the specified data.
   * @param body ManageScheduledPlans to be inserted. (required)
   * @return ManageScheduledPlans
   * @throws ApiException if fails to make API call
   */
  public ManageScheduledPlans addManageScheduledPlans(ManageScheduledPlans body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addManageScheduledPlans");
    }
    
    // create path and map variables
    String localVarPath = "/beta/manageScheduledPlans".replaceAll("\\{format\\}","json");

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

    
    GenericType<ManageScheduledPlans> localVarReturnType = new GenericType<ManageScheduledPlans>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete a manageScheduledPlans
   * Deletes the manageScheduledPlans identified by the specified id.
   * @param manageScheduledPlansId Id of the manageScheduledPlans to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteManageScheduledPlans(Integer manageScheduledPlansId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'manageScheduledPlansId' is set
    if (manageScheduledPlansId == null) {
      throw new ApiException(400, "Missing the required parameter 'manageScheduledPlansId' when calling deleteManageScheduledPlans");
    }
    
    // create path and map variables
    String localVarPath = "/beta/manageScheduledPlans/{manageScheduledPlansId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "manageScheduledPlansId" + "\\}", apiClient.escapeString(manageScheduledPlansId.toString()));

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
   * Search manageScheduledPlanses by filter
   * Returns the list of manageScheduledPlanses that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ManageScheduledPlans>
   * @throws ApiException if fails to make API call
   */
  public List<ManageScheduledPlans> getManageScheduledPlansByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/manageScheduledPlans/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ManageScheduledPlans>> localVarReturnType = new GenericType<List<ManageScheduledPlans>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a manageScheduledPlans by id
   * Returns the manageScheduledPlans identified by the specified id.
   * @param manageScheduledPlansId Id of the manageScheduledPlans to be returned. (required)
   * @return ManageScheduledPlans
   * @throws ApiException if fails to make API call
   */
  public ManageScheduledPlans getManageScheduledPlansById(Integer manageScheduledPlansId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'manageScheduledPlansId' is set
    if (manageScheduledPlansId == null) {
      throw new ApiException(400, "Missing the required parameter 'manageScheduledPlansId' when calling getManageScheduledPlansById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/manageScheduledPlans/{manageScheduledPlansId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "manageScheduledPlansId" + "\\}", apiClient.escapeString(manageScheduledPlansId.toString()));

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

    
    GenericType<ManageScheduledPlans> localVarReturnType = new GenericType<ManageScheduledPlans>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a manageScheduledPlans
   * Updates an existing manageScheduledPlans using the specified data.
   * @param body ManageScheduledPlans to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateManageScheduledPlans(ManageScheduledPlans body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateManageScheduledPlans");
    }
    
    // create path and map variables
    String localVarPath = "/beta/manageScheduledPlans".replaceAll("\\{format\\}","json");

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
