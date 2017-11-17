package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.WorkBatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class WorkBatchApi {
  private ApiClient apiClient;

  public WorkBatchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkBatchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for a workBatch
   * Adds an audit to an existing workBatch.
   * @param workBatchId Id of the workBatch to add an audit to (required)
   * @param workBatchAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addWorkBatchAudit(Integer workBatchId, String workBatchAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workBatchId' is set
    if (workBatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'workBatchId' when calling addWorkBatchAudit");
    }
    
    // verify the required parameter 'workBatchAudit' is set
    if (workBatchAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'workBatchAudit' when calling addWorkBatchAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/workBatch/{workBatchId}/audit/{workBatchAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workBatchId" + "\\}", apiClient.escapeString(workBatchId.toString()))
      .replaceAll("\\{" + "workBatchAudit" + "\\}", apiClient.escapeString(workBatchAudit.toString()));

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
   * Add new tags for a workBatch.
   * Adds a tag to an existing workBatch.
   * @param workBatchId Id of the workBatch to add a tag to (required)
   * @param workBatchTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addWorkBatchTag(Integer workBatchId, String workBatchTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workBatchId' is set
    if (workBatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'workBatchId' when calling addWorkBatchTag");
    }
    
    // verify the required parameter 'workBatchTag' is set
    if (workBatchTag == null) {
      throw new ApiException(400, "Missing the required parameter 'workBatchTag' when calling addWorkBatchTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/workBatch/{workBatchId}/tag/{workBatchTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workBatchId" + "\\}", apiClient.escapeString(workBatchId.toString()))
      .replaceAll("\\{" + "workBatchTag" + "\\}", apiClient.escapeString(workBatchTag.toString()));

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
   * Delete a tag for a workBatch.
   * Deletes an existing workBatch tag using the specified data.
   * @param workBatchId Id of the workBatch to remove tag from (required)
   * @param workBatchTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteWorkBatchTag(Integer workBatchId, String workBatchTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workBatchId' is set
    if (workBatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'workBatchId' when calling deleteWorkBatchTag");
    }
    
    // verify the required parameter 'workBatchTag' is set
    if (workBatchTag == null) {
      throw new ApiException(400, "Missing the required parameter 'workBatchTag' when calling deleteWorkBatchTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/workBatch/{workBatchId}/tag/{workBatchTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workBatchId" + "\\}", apiClient.escapeString(workBatchId.toString()))
      .replaceAll("\\{" + "workBatchTag" + "\\}", apiClient.escapeString(workBatchTag.toString()));

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
   * Get a duplicated a workBatch by id
   * Returns a duplicated workBatch identified by the specified id.
   * @param workBatchId Id of the workBatch to be duplicated. (required)
   * @return WorkBatch
   * @throws ApiException if fails to make API call
   */
  public WorkBatch getDuplicateWorkBatchById(Integer workBatchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workBatchId' is set
    if (workBatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'workBatchId' when calling getDuplicateWorkBatchById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/workBatch/duplicate/{workBatchId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workBatchId" + "\\}", apiClient.escapeString(workBatchId.toString()));

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

    
    GenericType<WorkBatch> localVarReturnType = new GenericType<WorkBatch>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search workBatchs by filter
   * Returns the list of workBatchs that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<WorkBatch>
   * @throws ApiException if fails to make API call
   */
  public List<WorkBatch> getWorkBatchByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/workBatch/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<WorkBatch>> localVarReturnType = new GenericType<List<WorkBatch>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a workBatch by id
   * Returns the workBatch identified by the specified id.
   * @param workBatchId Id of the workBatch to be returned. (required)
   * @return WorkBatch
   * @throws ApiException if fails to make API call
   */
  public WorkBatch getWorkBatchById(Integer workBatchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workBatchId' is set
    if (workBatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'workBatchId' when calling getWorkBatchById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/workBatch/{workBatchId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workBatchId" + "\\}", apiClient.escapeString(workBatchId.toString()));

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

    
    GenericType<WorkBatch> localVarReturnType = new GenericType<WorkBatch>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a workBatch.
   * Get all existing workBatch tags.
   * @param workBatchId Id of the workBatch to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getWorkBatchTags(Integer workBatchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workBatchId' is set
    if (workBatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'workBatchId' when calling getWorkBatchTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/workBatch/{workBatchId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workBatchId" + "\\}", apiClient.escapeString(workBatchId.toString()));

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
   * Update a workBatch custom fields
   * Updates an existing workBatch custom fields using the specified data.
   * @param body WorkBatch to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateWorkBatchCustomFields(WorkBatch body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateWorkBatchCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/workBatch/customFields".replaceAll("\\{format\\}","json");

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
