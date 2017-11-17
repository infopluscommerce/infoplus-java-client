package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.WorkActivity;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class WorkActivityApi {
  private ApiClient apiClient;

  public WorkActivityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkActivityApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a workActivity
   * Inserts a new workActivity using the specified data.
   * @param body WorkActivity to be inserted. (required)
   * @return WorkActivity
   * @throws ApiException if fails to make API call
   */
  public WorkActivity addWorkActivity(WorkActivity body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addWorkActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/workActivity".replaceAll("\\{format\\}","json");

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

    
    GenericType<WorkActivity> localVarReturnType = new GenericType<WorkActivity>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a workActivity
   * Adds an audit to an existing workActivity.
   * @param workActivityId Id of the workActivity to add an audit to (required)
   * @param workActivityAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addWorkActivityAudit(Integer workActivityId, String workActivityAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workActivityId' is set
    if (workActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'workActivityId' when calling addWorkActivityAudit");
    }
    
    // verify the required parameter 'workActivityAudit' is set
    if (workActivityAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'workActivityAudit' when calling addWorkActivityAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/workActivity/{workActivityId}/audit/{workActivityAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workActivityId" + "\\}", apiClient.escapeString(workActivityId.toString()))
      .replaceAll("\\{" + "workActivityAudit" + "\\}", apiClient.escapeString(workActivityAudit.toString()));

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
   * Add new tags for a workActivity.
   * Adds a tag to an existing workActivity.
   * @param workActivityId Id of the workActivity to add a tag to (required)
   * @param workActivityTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addWorkActivityTag(Integer workActivityId, String workActivityTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workActivityId' is set
    if (workActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'workActivityId' when calling addWorkActivityTag");
    }
    
    // verify the required parameter 'workActivityTag' is set
    if (workActivityTag == null) {
      throw new ApiException(400, "Missing the required parameter 'workActivityTag' when calling addWorkActivityTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/workActivity/{workActivityId}/tag/{workActivityTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workActivityId" + "\\}", apiClient.escapeString(workActivityId.toString()))
      .replaceAll("\\{" + "workActivityTag" + "\\}", apiClient.escapeString(workActivityTag.toString()));

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
   * Delete a workActivity
   * Deletes the workActivity identified by the specified id.
   * @param workActivityId Id of the workActivity to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteWorkActivity(Integer workActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workActivityId' is set
    if (workActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'workActivityId' when calling deleteWorkActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/workActivity/{workActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workActivityId" + "\\}", apiClient.escapeString(workActivityId.toString()));

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
   * Delete a tag for a workActivity.
   * Deletes an existing workActivity tag using the specified data.
   * @param workActivityId Id of the workActivity to remove tag from (required)
   * @param workActivityTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteWorkActivityTag(Integer workActivityId, String workActivityTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workActivityId' is set
    if (workActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'workActivityId' when calling deleteWorkActivityTag");
    }
    
    // verify the required parameter 'workActivityTag' is set
    if (workActivityTag == null) {
      throw new ApiException(400, "Missing the required parameter 'workActivityTag' when calling deleteWorkActivityTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/workActivity/{workActivityId}/tag/{workActivityTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workActivityId" + "\\}", apiClient.escapeString(workActivityId.toString()))
      .replaceAll("\\{" + "workActivityTag" + "\\}", apiClient.escapeString(workActivityTag.toString()));

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
   * Get a duplicated a workActivity by id
   * Returns a duplicated workActivity identified by the specified id.
   * @param workActivityId Id of the workActivity to be duplicated. (required)
   * @return WorkActivity
   * @throws ApiException if fails to make API call
   */
  public WorkActivity getDuplicateWorkActivityById(Integer workActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workActivityId' is set
    if (workActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'workActivityId' when calling getDuplicateWorkActivityById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/workActivity/duplicate/{workActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workActivityId" + "\\}", apiClient.escapeString(workActivityId.toString()));

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

    
    GenericType<WorkActivity> localVarReturnType = new GenericType<WorkActivity>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search workActivitys by filter
   * Returns the list of workActivitys that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<WorkActivity>
   * @throws ApiException if fails to make API call
   */
  public List<WorkActivity> getWorkActivityByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/workActivity/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<WorkActivity>> localVarReturnType = new GenericType<List<WorkActivity>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a workActivity by id
   * Returns the workActivity identified by the specified id.
   * @param workActivityId Id of the workActivity to be returned. (required)
   * @return WorkActivity
   * @throws ApiException if fails to make API call
   */
  public WorkActivity getWorkActivityById(Integer workActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workActivityId' is set
    if (workActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'workActivityId' when calling getWorkActivityById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/workActivity/{workActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workActivityId" + "\\}", apiClient.escapeString(workActivityId.toString()));

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

    
    GenericType<WorkActivity> localVarReturnType = new GenericType<WorkActivity>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a workActivity.
   * Get all existing workActivity tags.
   * @param workActivityId Id of the workActivity to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getWorkActivityTags(Integer workActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workActivityId' is set
    if (workActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'workActivityId' when calling getWorkActivityTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/workActivity/{workActivityId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workActivityId" + "\\}", apiClient.escapeString(workActivityId.toString()));

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
   * Update a workActivity
   * Updates an existing workActivity using the specified data.
   * @param body WorkActivity to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateWorkActivity(WorkActivity body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateWorkActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/workActivity".replaceAll("\\{format\\}","json");

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
