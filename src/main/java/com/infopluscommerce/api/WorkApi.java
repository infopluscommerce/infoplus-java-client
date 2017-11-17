package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.Work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class WorkApi {
  private ApiClient apiClient;

  public WorkApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for a work
   * Adds an audit to an existing work.
   * @param workId Id of the work to add an audit to (required)
   * @param workAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addWorkAudit(Integer workId, String workAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workId' is set
    if (workId == null) {
      throw new ApiException(400, "Missing the required parameter 'workId' when calling addWorkAudit");
    }
    
    // verify the required parameter 'workAudit' is set
    if (workAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'workAudit' when calling addWorkAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/work/{workId}/audit/{workAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workId" + "\\}", apiClient.escapeString(workId.toString()))
      .replaceAll("\\{" + "workAudit" + "\\}", apiClient.escapeString(workAudit.toString()));

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
   * Add new tags for a work.
   * Adds a tag to an existing work.
   * @param workId Id of the work to add a tag to (required)
   * @param workTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addWorkTag(Integer workId, String workTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workId' is set
    if (workId == null) {
      throw new ApiException(400, "Missing the required parameter 'workId' when calling addWorkTag");
    }
    
    // verify the required parameter 'workTag' is set
    if (workTag == null) {
      throw new ApiException(400, "Missing the required parameter 'workTag' when calling addWorkTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/work/{workId}/tag/{workTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workId" + "\\}", apiClient.escapeString(workId.toString()))
      .replaceAll("\\{" + "workTag" + "\\}", apiClient.escapeString(workTag.toString()));

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
   * Delete a tag for a work.
   * Deletes an existing work tag using the specified data.
   * @param workId Id of the work to remove tag from (required)
   * @param workTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteWorkTag(Integer workId, String workTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workId' is set
    if (workId == null) {
      throw new ApiException(400, "Missing the required parameter 'workId' when calling deleteWorkTag");
    }
    
    // verify the required parameter 'workTag' is set
    if (workTag == null) {
      throw new ApiException(400, "Missing the required parameter 'workTag' when calling deleteWorkTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/work/{workId}/tag/{workTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workId" + "\\}", apiClient.escapeString(workId.toString()))
      .replaceAll("\\{" + "workTag" + "\\}", apiClient.escapeString(workTag.toString()));

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
   * Get a duplicated a work by id
   * Returns a duplicated work identified by the specified id.
   * @param workId Id of the work to be duplicated. (required)
   * @return Work
   * @throws ApiException if fails to make API call
   */
  public Work getDuplicateWorkById(Integer workId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workId' is set
    if (workId == null) {
      throw new ApiException(400, "Missing the required parameter 'workId' when calling getDuplicateWorkById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/work/duplicate/{workId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workId" + "\\}", apiClient.escapeString(workId.toString()));

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

    
    GenericType<Work> localVarReturnType = new GenericType<Work>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search works by filter
   * Returns the list of works that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<Work>
   * @throws ApiException if fails to make API call
   */
  public List<Work> getWorkByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/work/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Work>> localVarReturnType = new GenericType<List<Work>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a work by id
   * Returns the work identified by the specified id.
   * @param workId Id of the work to be returned. (required)
   * @return Work
   * @throws ApiException if fails to make API call
   */
  public Work getWorkById(Integer workId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workId' is set
    if (workId == null) {
      throw new ApiException(400, "Missing the required parameter 'workId' when calling getWorkById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/work/{workId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workId" + "\\}", apiClient.escapeString(workId.toString()));

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

    
    GenericType<Work> localVarReturnType = new GenericType<Work>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a work.
   * Get all existing work tags.
   * @param workId Id of the work to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getWorkTags(Integer workId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workId' is set
    if (workId == null) {
      throw new ApiException(400, "Missing the required parameter 'workId' when calling getWorkTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/work/{workId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workId" + "\\}", apiClient.escapeString(workId.toString()));

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
   * Update a work custom fields
   * Updates an existing work custom fields using the specified data.
   * @param body Work to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateWorkCustomFields(Work body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateWorkCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/work/customFields".replaceAll("\\{format\\}","json");

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
