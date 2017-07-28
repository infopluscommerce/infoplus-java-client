package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ScheduledPlanLog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class ScheduledPlanLogApi {
  private ApiClient apiClient;

  public ScheduledPlanLogApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ScheduledPlanLogApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for a scheduledPlanLog
   * Adds an audit to an existing scheduledPlanLog.
   * @param scheduledPlanLogId Id of the scheduledPlanLog to add an audit to (required)
   * @param scheduledPlanLogAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addScheduledPlanLogAudit(Integer scheduledPlanLogId, String scheduledPlanLogAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'scheduledPlanLogId' is set
    if (scheduledPlanLogId == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduledPlanLogId' when calling addScheduledPlanLogAudit");
    }
    
    // verify the required parameter 'scheduledPlanLogAudit' is set
    if (scheduledPlanLogAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduledPlanLogAudit' when calling addScheduledPlanLogAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/scheduledPlanLog/{scheduledPlanLogId}/audit/{scheduledPlanLogAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "scheduledPlanLogId" + "\\}", apiClient.escapeString(scheduledPlanLogId.toString()))
      .replaceAll("\\{" + "scheduledPlanLogAudit" + "\\}", apiClient.escapeString(scheduledPlanLogAudit.toString()));

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
   * Add new tags for a scheduledPlanLog.
   * Adds a tag to an existing scheduledPlanLog.
   * @param scheduledPlanLogId Id of the scheduledPlanLog to add a tag to (required)
   * @param scheduledPlanLogTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addScheduledPlanLogTag(Integer scheduledPlanLogId, String scheduledPlanLogTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'scheduledPlanLogId' is set
    if (scheduledPlanLogId == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduledPlanLogId' when calling addScheduledPlanLogTag");
    }
    
    // verify the required parameter 'scheduledPlanLogTag' is set
    if (scheduledPlanLogTag == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduledPlanLogTag' when calling addScheduledPlanLogTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/scheduledPlanLog/{scheduledPlanLogId}/tag/{scheduledPlanLogTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "scheduledPlanLogId" + "\\}", apiClient.escapeString(scheduledPlanLogId.toString()))
      .replaceAll("\\{" + "scheduledPlanLogTag" + "\\}", apiClient.escapeString(scheduledPlanLogTag.toString()));

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
   * Delete a tag for a scheduledPlanLog.
   * Deletes an existing scheduledPlanLog tag using the specified data.
   * @param scheduledPlanLogId Id of the scheduledPlanLog to remove tag from (required)
   * @param scheduledPlanLogTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteScheduledPlanLogTag(Integer scheduledPlanLogId, String scheduledPlanLogTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'scheduledPlanLogId' is set
    if (scheduledPlanLogId == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduledPlanLogId' when calling deleteScheduledPlanLogTag");
    }
    
    // verify the required parameter 'scheduledPlanLogTag' is set
    if (scheduledPlanLogTag == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduledPlanLogTag' when calling deleteScheduledPlanLogTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/scheduledPlanLog/{scheduledPlanLogId}/tag/{scheduledPlanLogTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "scheduledPlanLogId" + "\\}", apiClient.escapeString(scheduledPlanLogId.toString()))
      .replaceAll("\\{" + "scheduledPlanLogTag" + "\\}", apiClient.escapeString(scheduledPlanLogTag.toString()));

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
   * Get a duplicated a scheduledPlanLog by id
   * Returns a duplicated scheduledPlanLog identified by the specified id.
   * @param scheduledPlanLogId Id of the scheduledPlanLog to be duplicated. (required)
   * @return ScheduledPlanLog
   * @throws ApiException if fails to make API call
   */
  public ScheduledPlanLog getDuplicateScheduledPlanLogById(Integer scheduledPlanLogId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'scheduledPlanLogId' is set
    if (scheduledPlanLogId == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduledPlanLogId' when calling getDuplicateScheduledPlanLogById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/scheduledPlanLog/duplicate/{scheduledPlanLogId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "scheduledPlanLogId" + "\\}", apiClient.escapeString(scheduledPlanLogId.toString()));

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

    
    GenericType<ScheduledPlanLog> localVarReturnType = new GenericType<ScheduledPlanLog>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search scheduledPlanLogs by filter
   * Returns the list of scheduledPlanLogs that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ScheduledPlanLog>
   * @throws ApiException if fails to make API call
   */
  public List<ScheduledPlanLog> getScheduledPlanLogByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/scheduledPlanLog/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ScheduledPlanLog>> localVarReturnType = new GenericType<List<ScheduledPlanLog>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a scheduledPlanLog by id
   * Returns the scheduledPlanLog identified by the specified id.
   * @param scheduledPlanLogId Id of the scheduledPlanLog to be returned. (required)
   * @return ScheduledPlanLog
   * @throws ApiException if fails to make API call
   */
  public ScheduledPlanLog getScheduledPlanLogById(Integer scheduledPlanLogId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'scheduledPlanLogId' is set
    if (scheduledPlanLogId == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduledPlanLogId' when calling getScheduledPlanLogById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/scheduledPlanLog/{scheduledPlanLogId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "scheduledPlanLogId" + "\\}", apiClient.escapeString(scheduledPlanLogId.toString()));

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

    
    GenericType<ScheduledPlanLog> localVarReturnType = new GenericType<ScheduledPlanLog>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a scheduledPlanLog.
   * Get all existing scheduledPlanLog tags.
   * @param scheduledPlanLogId Id of the scheduledPlanLog to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getScheduledPlanLogTags(Integer scheduledPlanLogId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'scheduledPlanLogId' is set
    if (scheduledPlanLogId == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduledPlanLogId' when calling getScheduledPlanLogTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/scheduledPlanLog/{scheduledPlanLogId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "scheduledPlanLogId" + "\\}", apiClient.escapeString(scheduledPlanLogId.toString()));

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
  
}
