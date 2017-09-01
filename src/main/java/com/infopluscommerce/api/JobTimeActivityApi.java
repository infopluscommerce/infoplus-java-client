package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.JobTimeActivity;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class JobTimeActivityApi {
  private ApiClient apiClient;

  public JobTimeActivityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public JobTimeActivityApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a jobTimeActivity
   * Inserts a new jobTimeActivity using the specified data.
   * @param body JobTimeActivity to be inserted. (required)
   * @return JobTimeActivity
   * @throws ApiException if fails to make API call
   */
  public JobTimeActivity addJobTimeActivity(JobTimeActivity body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addJobTimeActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobTimeActivity".replaceAll("\\{format\\}","json");

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

    
    GenericType<JobTimeActivity> localVarReturnType = new GenericType<JobTimeActivity>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a jobTimeActivity
   * Adds an audit to an existing jobTimeActivity.
   * @param jobTimeActivityId Id of the jobTimeActivity to add an audit to (required)
   * @param jobTimeActivityAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addJobTimeActivityAudit(Integer jobTimeActivityId, String jobTimeActivityAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTimeActivityId' is set
    if (jobTimeActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTimeActivityId' when calling addJobTimeActivityAudit");
    }
    
    // verify the required parameter 'jobTimeActivityAudit' is set
    if (jobTimeActivityAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTimeActivityAudit' when calling addJobTimeActivityAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobTimeActivity/{jobTimeActivityId}/audit/{jobTimeActivityAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTimeActivityId" + "\\}", apiClient.escapeString(jobTimeActivityId.toString()))
      .replaceAll("\\{" + "jobTimeActivityAudit" + "\\}", apiClient.escapeString(jobTimeActivityAudit.toString()));

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
   * Add new tags for a jobTimeActivity.
   * Adds a tag to an existing jobTimeActivity.
   * @param jobTimeActivityId Id of the jobTimeActivity to add a tag to (required)
   * @param jobTimeActivityTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addJobTimeActivityTag(Integer jobTimeActivityId, String jobTimeActivityTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTimeActivityId' is set
    if (jobTimeActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTimeActivityId' when calling addJobTimeActivityTag");
    }
    
    // verify the required parameter 'jobTimeActivityTag' is set
    if (jobTimeActivityTag == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTimeActivityTag' when calling addJobTimeActivityTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobTimeActivity/{jobTimeActivityId}/tag/{jobTimeActivityTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTimeActivityId" + "\\}", apiClient.escapeString(jobTimeActivityId.toString()))
      .replaceAll("\\{" + "jobTimeActivityTag" + "\\}", apiClient.escapeString(jobTimeActivityTag.toString()));

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
   * Delete a jobTimeActivity
   * Deletes the jobTimeActivity identified by the specified id.
   * @param jobTimeActivityId Id of the jobTimeActivity to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteJobTimeActivity(Integer jobTimeActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTimeActivityId' is set
    if (jobTimeActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTimeActivityId' when calling deleteJobTimeActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobTimeActivity/{jobTimeActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTimeActivityId" + "\\}", apiClient.escapeString(jobTimeActivityId.toString()));

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
   * Delete a tag for a jobTimeActivity.
   * Deletes an existing jobTimeActivity tag using the specified data.
   * @param jobTimeActivityId Id of the jobTimeActivity to remove tag from (required)
   * @param jobTimeActivityTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteJobTimeActivityTag(Integer jobTimeActivityId, String jobTimeActivityTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTimeActivityId' is set
    if (jobTimeActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTimeActivityId' when calling deleteJobTimeActivityTag");
    }
    
    // verify the required parameter 'jobTimeActivityTag' is set
    if (jobTimeActivityTag == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTimeActivityTag' when calling deleteJobTimeActivityTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobTimeActivity/{jobTimeActivityId}/tag/{jobTimeActivityTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTimeActivityId" + "\\}", apiClient.escapeString(jobTimeActivityId.toString()))
      .replaceAll("\\{" + "jobTimeActivityTag" + "\\}", apiClient.escapeString(jobTimeActivityTag.toString()));

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
   * Get a duplicated a jobTimeActivity by id
   * Returns a duplicated jobTimeActivity identified by the specified id.
   * @param jobTimeActivityId Id of the jobTimeActivity to be duplicated. (required)
   * @return JobTimeActivity
   * @throws ApiException if fails to make API call
   */
  public JobTimeActivity getDuplicateJobTimeActivityById(Integer jobTimeActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTimeActivityId' is set
    if (jobTimeActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTimeActivityId' when calling getDuplicateJobTimeActivityById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobTimeActivity/duplicate/{jobTimeActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTimeActivityId" + "\\}", apiClient.escapeString(jobTimeActivityId.toString()));

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

    
    GenericType<JobTimeActivity> localVarReturnType = new GenericType<JobTimeActivity>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search jobTimeActivitys by filter
   * Returns the list of jobTimeActivitys that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<JobTimeActivity>
   * @throws ApiException if fails to make API call
   */
  public List<JobTimeActivity> getJobTimeActivityByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/jobTimeActivity/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<JobTimeActivity>> localVarReturnType = new GenericType<List<JobTimeActivity>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a jobTimeActivity by id
   * Returns the jobTimeActivity identified by the specified id.
   * @param jobTimeActivityId Id of the jobTimeActivity to be returned. (required)
   * @return JobTimeActivity
   * @throws ApiException if fails to make API call
   */
  public JobTimeActivity getJobTimeActivityById(Integer jobTimeActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTimeActivityId' is set
    if (jobTimeActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTimeActivityId' when calling getJobTimeActivityById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobTimeActivity/{jobTimeActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTimeActivityId" + "\\}", apiClient.escapeString(jobTimeActivityId.toString()));

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

    
    GenericType<JobTimeActivity> localVarReturnType = new GenericType<JobTimeActivity>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a jobTimeActivity.
   * Get all existing jobTimeActivity tags.
   * @param jobTimeActivityId Id of the jobTimeActivity to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getJobTimeActivityTags(Integer jobTimeActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTimeActivityId' is set
    if (jobTimeActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTimeActivityId' when calling getJobTimeActivityTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobTimeActivity/{jobTimeActivityId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTimeActivityId" + "\\}", apiClient.escapeString(jobTimeActivityId.toString()));

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
   * Update a jobTimeActivity
   * Updates an existing jobTimeActivity using the specified data.
   * @param body JobTimeActivity to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateJobTimeActivity(JobTimeActivity body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateJobTimeActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobTimeActivity".replaceAll("\\{format\\}","json");

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
