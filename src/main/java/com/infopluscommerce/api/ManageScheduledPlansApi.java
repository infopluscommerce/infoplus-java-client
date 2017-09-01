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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
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
   * Add new audit for a manageScheduledPlans
   * Adds an audit to an existing manageScheduledPlans.
   * @param manageScheduledPlansId Id of the manageScheduledPlans to add an audit to (required)
   * @param manageScheduledPlansAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addManageScheduledPlansAudit(Integer manageScheduledPlansId, String manageScheduledPlansAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'manageScheduledPlansId' is set
    if (manageScheduledPlansId == null) {
      throw new ApiException(400, "Missing the required parameter 'manageScheduledPlansId' when calling addManageScheduledPlansAudit");
    }
    
    // verify the required parameter 'manageScheduledPlansAudit' is set
    if (manageScheduledPlansAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'manageScheduledPlansAudit' when calling addManageScheduledPlansAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/manageScheduledPlans/{manageScheduledPlansId}/audit/{manageScheduledPlansAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "manageScheduledPlansId" + "\\}", apiClient.escapeString(manageScheduledPlansId.toString()))
      .replaceAll("\\{" + "manageScheduledPlansAudit" + "\\}", apiClient.escapeString(manageScheduledPlansAudit.toString()));

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
   * Add new tags for a manageScheduledPlans.
   * Adds a tag to an existing manageScheduledPlans.
   * @param manageScheduledPlansId Id of the manageScheduledPlans to add a tag to (required)
   * @param manageScheduledPlansTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addManageScheduledPlansTag(Integer manageScheduledPlansId, String manageScheduledPlansTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'manageScheduledPlansId' is set
    if (manageScheduledPlansId == null) {
      throw new ApiException(400, "Missing the required parameter 'manageScheduledPlansId' when calling addManageScheduledPlansTag");
    }
    
    // verify the required parameter 'manageScheduledPlansTag' is set
    if (manageScheduledPlansTag == null) {
      throw new ApiException(400, "Missing the required parameter 'manageScheduledPlansTag' when calling addManageScheduledPlansTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/manageScheduledPlans/{manageScheduledPlansId}/tag/{manageScheduledPlansTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "manageScheduledPlansId" + "\\}", apiClient.escapeString(manageScheduledPlansId.toString()))
      .replaceAll("\\{" + "manageScheduledPlansTag" + "\\}", apiClient.escapeString(manageScheduledPlansTag.toString()));

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
   * Delete a tag for a manageScheduledPlans.
   * Deletes an existing manageScheduledPlans tag using the specified data.
   * @param manageScheduledPlansId Id of the manageScheduledPlans to remove tag from (required)
   * @param manageScheduledPlansTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteManageScheduledPlansTag(Integer manageScheduledPlansId, String manageScheduledPlansTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'manageScheduledPlansId' is set
    if (manageScheduledPlansId == null) {
      throw new ApiException(400, "Missing the required parameter 'manageScheduledPlansId' when calling deleteManageScheduledPlansTag");
    }
    
    // verify the required parameter 'manageScheduledPlansTag' is set
    if (manageScheduledPlansTag == null) {
      throw new ApiException(400, "Missing the required parameter 'manageScheduledPlansTag' when calling deleteManageScheduledPlansTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/manageScheduledPlans/{manageScheduledPlansId}/tag/{manageScheduledPlansTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "manageScheduledPlansId" + "\\}", apiClient.escapeString(manageScheduledPlansId.toString()))
      .replaceAll("\\{" + "manageScheduledPlansTag" + "\\}", apiClient.escapeString(manageScheduledPlansTag.toString()));

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
   * Get a duplicated a manageScheduledPlans by id
   * Returns a duplicated manageScheduledPlans identified by the specified id.
   * @param manageScheduledPlansId Id of the manageScheduledPlans to be duplicated. (required)
   * @return ManageScheduledPlans
   * @throws ApiException if fails to make API call
   */
  public ManageScheduledPlans getDuplicateManageScheduledPlansById(Integer manageScheduledPlansId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'manageScheduledPlansId' is set
    if (manageScheduledPlansId == null) {
      throw new ApiException(400, "Missing the required parameter 'manageScheduledPlansId' when calling getDuplicateManageScheduledPlansById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/manageScheduledPlans/duplicate/{manageScheduledPlansId}".replaceAll("\\{format\\}","json")
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
   * Get the tags for a manageScheduledPlans.
   * Get all existing manageScheduledPlans tags.
   * @param manageScheduledPlansId Id of the manageScheduledPlans to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getManageScheduledPlansTags(Integer manageScheduledPlansId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'manageScheduledPlansId' is set
    if (manageScheduledPlansId == null) {
      throw new ApiException(400, "Missing the required parameter 'manageScheduledPlansId' when calling getManageScheduledPlansTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/manageScheduledPlans/{manageScheduledPlansId}/tag".replaceAll("\\{format\\}","json")
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

    
    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
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
