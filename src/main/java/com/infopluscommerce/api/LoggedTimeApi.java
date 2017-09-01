package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.LoggedTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class LoggedTimeApi {
  private ApiClient apiClient;

  public LoggedTimeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LoggedTimeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for a loggedTime
   * Adds an audit to an existing loggedTime.
   * @param loggedTimeId Id of the loggedTime to add an audit to (required)
   * @param loggedTimeAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addLoggedTimeAudit(Integer loggedTimeId, String loggedTimeAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'loggedTimeId' is set
    if (loggedTimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'loggedTimeId' when calling addLoggedTimeAudit");
    }
    
    // verify the required parameter 'loggedTimeAudit' is set
    if (loggedTimeAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'loggedTimeAudit' when calling addLoggedTimeAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/loggedTime/{loggedTimeId}/audit/{loggedTimeAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "loggedTimeId" + "\\}", apiClient.escapeString(loggedTimeId.toString()))
      .replaceAll("\\{" + "loggedTimeAudit" + "\\}", apiClient.escapeString(loggedTimeAudit.toString()));

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
   * Add new tags for a loggedTime.
   * Adds a tag to an existing loggedTime.
   * @param loggedTimeId Id of the loggedTime to add a tag to (required)
   * @param loggedTimeTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addLoggedTimeTag(Integer loggedTimeId, String loggedTimeTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'loggedTimeId' is set
    if (loggedTimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'loggedTimeId' when calling addLoggedTimeTag");
    }
    
    // verify the required parameter 'loggedTimeTag' is set
    if (loggedTimeTag == null) {
      throw new ApiException(400, "Missing the required parameter 'loggedTimeTag' when calling addLoggedTimeTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/loggedTime/{loggedTimeId}/tag/{loggedTimeTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "loggedTimeId" + "\\}", apiClient.escapeString(loggedTimeId.toString()))
      .replaceAll("\\{" + "loggedTimeTag" + "\\}", apiClient.escapeString(loggedTimeTag.toString()));

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
   * Delete a tag for a loggedTime.
   * Deletes an existing loggedTime tag using the specified data.
   * @param loggedTimeId Id of the loggedTime to remove tag from (required)
   * @param loggedTimeTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLoggedTimeTag(Integer loggedTimeId, String loggedTimeTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'loggedTimeId' is set
    if (loggedTimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'loggedTimeId' when calling deleteLoggedTimeTag");
    }
    
    // verify the required parameter 'loggedTimeTag' is set
    if (loggedTimeTag == null) {
      throw new ApiException(400, "Missing the required parameter 'loggedTimeTag' when calling deleteLoggedTimeTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/loggedTime/{loggedTimeId}/tag/{loggedTimeTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "loggedTimeId" + "\\}", apiClient.escapeString(loggedTimeId.toString()))
      .replaceAll("\\{" + "loggedTimeTag" + "\\}", apiClient.escapeString(loggedTimeTag.toString()));

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
   * Get a duplicated a loggedTime by id
   * Returns a duplicated loggedTime identified by the specified id.
   * @param loggedTimeId Id of the loggedTime to be duplicated. (required)
   * @return LoggedTime
   * @throws ApiException if fails to make API call
   */
  public LoggedTime getDuplicateLoggedTimeById(Integer loggedTimeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'loggedTimeId' is set
    if (loggedTimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'loggedTimeId' when calling getDuplicateLoggedTimeById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/loggedTime/duplicate/{loggedTimeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "loggedTimeId" + "\\}", apiClient.escapeString(loggedTimeId.toString()));

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

    
    GenericType<LoggedTime> localVarReturnType = new GenericType<LoggedTime>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search loggedTimes by filter
   * Returns the list of loggedTimes that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<LoggedTime>
   * @throws ApiException if fails to make API call
   */
  public List<LoggedTime> getLoggedTimeByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/loggedTime/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<LoggedTime>> localVarReturnType = new GenericType<List<LoggedTime>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a loggedTime by id
   * Returns the loggedTime identified by the specified id.
   * @param loggedTimeId Id of the loggedTime to be returned. (required)
   * @return LoggedTime
   * @throws ApiException if fails to make API call
   */
  public LoggedTime getLoggedTimeById(Integer loggedTimeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'loggedTimeId' is set
    if (loggedTimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'loggedTimeId' when calling getLoggedTimeById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/loggedTime/{loggedTimeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "loggedTimeId" + "\\}", apiClient.escapeString(loggedTimeId.toString()));

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

    
    GenericType<LoggedTime> localVarReturnType = new GenericType<LoggedTime>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a loggedTime.
   * Get all existing loggedTime tags.
   * @param loggedTimeId Id of the loggedTime to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getLoggedTimeTags(Integer loggedTimeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'loggedTimeId' is set
    if (loggedTimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'loggedTimeId' when calling getLoggedTimeTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/loggedTime/{loggedTimeId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "loggedTimeId" + "\\}", apiClient.escapeString(loggedTimeId.toString()));

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
   * Update a loggedTime custom fields
   * Updates an existing loggedTime custom fields using the specified data.
   * @param body LoggedTime to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateLoggedTimeCustomFields(LoggedTime body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateLoggedTimeCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/loggedTime/customFields".replaceAll("\\{format\\}","json");

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
