package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ReplenishmentPlan;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
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
   * Create a replenishmentPlan
   * Inserts a new replenishmentPlan using the specified data.
   * @param body ReplenishmentPlan to be inserted. (required)
   * @return ReplenishmentPlan
   * @throws ApiException if fails to make API call
   */
  public ReplenishmentPlan addReplenishmentPlan(ReplenishmentPlan body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addReplenishmentPlan");
    }
    
    // create path and map variables
    String localVarPath = "/beta/replenishmentPlan".replaceAll("\\{format\\}","json");

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

    
    GenericType<ReplenishmentPlan> localVarReturnType = new GenericType<ReplenishmentPlan>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a replenishmentPlan
   * Adds an audit to an existing replenishmentPlan.
   * @param replenishmentPlanId Id of the replenishmentPlan to add an audit to (required)
   * @param replenishmentPlanAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addReplenishmentPlanAudit(Integer replenishmentPlanId, String replenishmentPlanAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replenishmentPlanId' is set
    if (replenishmentPlanId == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentPlanId' when calling addReplenishmentPlanAudit");
    }
    
    // verify the required parameter 'replenishmentPlanAudit' is set
    if (replenishmentPlanAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentPlanAudit' when calling addReplenishmentPlanAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/replenishmentPlan/{replenishmentPlanId}/audit/{replenishmentPlanAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "replenishmentPlanId" + "\\}", apiClient.escapeString(replenishmentPlanId.toString()))
      .replaceAll("\\{" + "replenishmentPlanAudit" + "\\}", apiClient.escapeString(replenishmentPlanAudit.toString()));

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
   * Add new tags for a replenishmentPlan.
   * Adds a tag to an existing replenishmentPlan.
   * @param replenishmentPlanId Id of the replenishmentPlan to add a tag to (required)
   * @param replenishmentPlanTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addReplenishmentPlanTag(Integer replenishmentPlanId, String replenishmentPlanTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replenishmentPlanId' is set
    if (replenishmentPlanId == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentPlanId' when calling addReplenishmentPlanTag");
    }
    
    // verify the required parameter 'replenishmentPlanTag' is set
    if (replenishmentPlanTag == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentPlanTag' when calling addReplenishmentPlanTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/replenishmentPlan/{replenishmentPlanId}/tag/{replenishmentPlanTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "replenishmentPlanId" + "\\}", apiClient.escapeString(replenishmentPlanId.toString()))
      .replaceAll("\\{" + "replenishmentPlanTag" + "\\}", apiClient.escapeString(replenishmentPlanTag.toString()));

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
   * Delete a replenishmentPlan
   * Deletes the replenishmentPlan identified by the specified id.
   * @param replenishmentPlanId Id of the replenishmentPlan to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteReplenishmentPlan(Integer replenishmentPlanId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replenishmentPlanId' is set
    if (replenishmentPlanId == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentPlanId' when calling deleteReplenishmentPlan");
    }
    
    // create path and map variables
    String localVarPath = "/beta/replenishmentPlan/{replenishmentPlanId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "replenishmentPlanId" + "\\}", apiClient.escapeString(replenishmentPlanId.toString()));

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
   * Delete a tag for a replenishmentPlan.
   * Deletes an existing replenishmentPlan tag using the specified data.
   * @param replenishmentPlanId Id of the replenishmentPlan to remove tag from (required)
   * @param replenishmentPlanTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteReplenishmentPlanTag(Integer replenishmentPlanId, String replenishmentPlanTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replenishmentPlanId' is set
    if (replenishmentPlanId == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentPlanId' when calling deleteReplenishmentPlanTag");
    }
    
    // verify the required parameter 'replenishmentPlanTag' is set
    if (replenishmentPlanTag == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentPlanTag' when calling deleteReplenishmentPlanTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/replenishmentPlan/{replenishmentPlanId}/tag/{replenishmentPlanTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "replenishmentPlanId" + "\\}", apiClient.escapeString(replenishmentPlanId.toString()))
      .replaceAll("\\{" + "replenishmentPlanTag" + "\\}", apiClient.escapeString(replenishmentPlanTag.toString()));

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
   * Get a duplicated a replenishmentPlan by id
   * Returns a duplicated replenishmentPlan identified by the specified id.
   * @param replenishmentPlanId Id of the replenishmentPlan to be duplicated. (required)
   * @return ReplenishmentPlan
   * @throws ApiException if fails to make API call
   */
  public ReplenishmentPlan getDuplicateReplenishmentPlanById(Integer replenishmentPlanId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replenishmentPlanId' is set
    if (replenishmentPlanId == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentPlanId' when calling getDuplicateReplenishmentPlanById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/replenishmentPlan/duplicate/{replenishmentPlanId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "replenishmentPlanId" + "\\}", apiClient.escapeString(replenishmentPlanId.toString()));

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

    
    GenericType<ReplenishmentPlan> localVarReturnType = new GenericType<ReplenishmentPlan>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search replenishmentPlans by filter
   * Returns the list of replenishmentPlans that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ReplenishmentPlan>
   * @throws ApiException if fails to make API call
   */
  public List<ReplenishmentPlan> getReplenishmentPlanByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/replenishmentPlan/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ReplenishmentPlan>> localVarReturnType = new GenericType<List<ReplenishmentPlan>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a replenishmentPlan by id
   * Returns the replenishmentPlan identified by the specified id.
   * @param replenishmentPlanId Id of the replenishmentPlan to be returned. (required)
   * @return ReplenishmentPlan
   * @throws ApiException if fails to make API call
   */
  public ReplenishmentPlan getReplenishmentPlanById(Integer replenishmentPlanId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replenishmentPlanId' is set
    if (replenishmentPlanId == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentPlanId' when calling getReplenishmentPlanById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/replenishmentPlan/{replenishmentPlanId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "replenishmentPlanId" + "\\}", apiClient.escapeString(replenishmentPlanId.toString()));

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

    
    GenericType<ReplenishmentPlan> localVarReturnType = new GenericType<ReplenishmentPlan>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a replenishmentPlan.
   * Get all existing replenishmentPlan tags.
   * @param replenishmentPlanId Id of the replenishmentPlan to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getReplenishmentPlanTags(Integer replenishmentPlanId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replenishmentPlanId' is set
    if (replenishmentPlanId == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentPlanId' when calling getReplenishmentPlanTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/replenishmentPlan/{replenishmentPlanId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "replenishmentPlanId" + "\\}", apiClient.escapeString(replenishmentPlanId.toString()));

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

    
    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Update a replenishmentPlan
   * Updates an existing replenishmentPlan using the specified data.
   * @param body ReplenishmentPlan to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateReplenishmentPlan(ReplenishmentPlan body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateReplenishmentPlan");
    }
    
    // create path and map variables
    String localVarPath = "/beta/replenishmentPlan".replaceAll("\\{format\\}","json");

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
   * Update a replenishmentPlan custom fields
   * Updates an existing replenishmentPlan custom fields using the specified data.
   * @param body ReplenishmentPlan to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateReplenishmentPlanCustomFields(ReplenishmentPlan body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateReplenishmentPlanCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/replenishmentPlan/customFields".replaceAll("\\{format\\}","json");

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
