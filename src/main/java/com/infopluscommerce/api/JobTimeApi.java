package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.JobTime;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class JobTimeApi {
  private ApiClient apiClient;

  public JobTimeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public JobTimeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a jobTime
   * Inserts a new jobTime using the specified data.
   * @param body JobTime to be inserted. (required)
   * @return JobTime
   * @throws ApiException if fails to make API call
   */
  public JobTime addJobTime(JobTime body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addJobTime");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobTime".replaceAll("\\{format\\}","json");

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

    
    GenericType<JobTime> localVarReturnType = new GenericType<JobTime>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a jobTime
   * Adds an audit to an existing jobTime.
   * @param jobTimeId Id of the jobTime to add an audit to (required)
   * @param jobTimeAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addJobTimeAudit(Integer jobTimeId, String jobTimeAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTimeId' is set
    if (jobTimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTimeId' when calling addJobTimeAudit");
    }
    
    // verify the required parameter 'jobTimeAudit' is set
    if (jobTimeAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTimeAudit' when calling addJobTimeAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobTime/{jobTimeId}/audit/{jobTimeAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTimeId" + "\\}", apiClient.escapeString(jobTimeId.toString()))
      .replaceAll("\\{" + "jobTimeAudit" + "\\}", apiClient.escapeString(jobTimeAudit.toString()));

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
   * Add new tags for a jobTime.
   * Adds a tag to an existing jobTime.
   * @param jobTimeId Id of the jobTime to add a tag to (required)
   * @param jobTimeTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addJobTimeTag(Integer jobTimeId, String jobTimeTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTimeId' is set
    if (jobTimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTimeId' when calling addJobTimeTag");
    }
    
    // verify the required parameter 'jobTimeTag' is set
    if (jobTimeTag == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTimeTag' when calling addJobTimeTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobTime/{jobTimeId}/tag/{jobTimeTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTimeId" + "\\}", apiClient.escapeString(jobTimeId.toString()))
      .replaceAll("\\{" + "jobTimeTag" + "\\}", apiClient.escapeString(jobTimeTag.toString()));

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
   * Delete a jobTime
   * Deletes the jobTime identified by the specified id.
   * @param jobTimeId Id of the jobTime to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteJobTime(Integer jobTimeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTimeId' is set
    if (jobTimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTimeId' when calling deleteJobTime");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobTime/{jobTimeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTimeId" + "\\}", apiClient.escapeString(jobTimeId.toString()));

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
   * Delete a tag for a jobTime.
   * Deletes an existing jobTime tag using the specified data.
   * @param jobTimeId Id of the jobTime to remove tag from (required)
   * @param jobTimeTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteJobTimeTag(Integer jobTimeId, String jobTimeTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTimeId' is set
    if (jobTimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTimeId' when calling deleteJobTimeTag");
    }
    
    // verify the required parameter 'jobTimeTag' is set
    if (jobTimeTag == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTimeTag' when calling deleteJobTimeTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobTime/{jobTimeId}/tag/{jobTimeTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTimeId" + "\\}", apiClient.escapeString(jobTimeId.toString()))
      .replaceAll("\\{" + "jobTimeTag" + "\\}", apiClient.escapeString(jobTimeTag.toString()));

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
   * Get a duplicated a jobTime by id
   * Returns a duplicated jobTime identified by the specified id.
   * @param jobTimeId Id of the jobTime to be duplicated. (required)
   * @return JobTime
   * @throws ApiException if fails to make API call
   */
  public JobTime getDuplicateJobTimeById(Integer jobTimeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTimeId' is set
    if (jobTimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTimeId' when calling getDuplicateJobTimeById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobTime/duplicate/{jobTimeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTimeId" + "\\}", apiClient.escapeString(jobTimeId.toString()));

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

    
    GenericType<JobTime> localVarReturnType = new GenericType<JobTime>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search jobTimes by filter
   * Returns the list of jobTimes that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<JobTime>
   * @throws ApiException if fails to make API call
   */
  public List<JobTime> getJobTimeByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/jobTime/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<JobTime>> localVarReturnType = new GenericType<List<JobTime>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a jobTime by id
   * Returns the jobTime identified by the specified id.
   * @param jobTimeId Id of the jobTime to be returned. (required)
   * @return JobTime
   * @throws ApiException if fails to make API call
   */
  public JobTime getJobTimeById(Integer jobTimeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTimeId' is set
    if (jobTimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTimeId' when calling getJobTimeById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobTime/{jobTimeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTimeId" + "\\}", apiClient.escapeString(jobTimeId.toString()));

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

    
    GenericType<JobTime> localVarReturnType = new GenericType<JobTime>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a jobTime.
   * Get all existing jobTime tags.
   * @param jobTimeId Id of the jobTime to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getJobTimeTags(Integer jobTimeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTimeId' is set
    if (jobTimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTimeId' when calling getJobTimeTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobTime/{jobTimeId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTimeId" + "\\}", apiClient.escapeString(jobTimeId.toString()));

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
   * Update a jobTime
   * Updates an existing jobTime using the specified data.
   * @param body JobTime to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateJobTime(JobTime body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateJobTime");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobTime".replaceAll("\\{format\\}","json");

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
   * Update a jobTime custom fields
   * Updates an existing jobTime custom fields using the specified data.
   * @param body JobTime to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateJobTimeCustomFields(JobTime body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateJobTimeCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobTime/customFields".replaceAll("\\{format\\}","json");

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
