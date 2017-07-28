package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.JobType;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class JobTypeApi {
  private ApiClient apiClient;

  public JobTypeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public JobTypeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a jobType
   * Inserts a new jobType using the specified data.
   * @param body JobType to be inserted. (required)
   * @return JobType
   * @throws ApiException if fails to make API call
   */
  public JobType addJobType(JobType body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addJobType");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobType".replaceAll("\\{format\\}","json");

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

    
    GenericType<JobType> localVarReturnType = new GenericType<JobType>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a jobType
   * Adds an audit to an existing jobType.
   * @param jobTypeId Id of the jobType to add an audit to (required)
   * @param jobTypeAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addJobTypeAudit(Integer jobTypeId, String jobTypeAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTypeId' is set
    if (jobTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTypeId' when calling addJobTypeAudit");
    }
    
    // verify the required parameter 'jobTypeAudit' is set
    if (jobTypeAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTypeAudit' when calling addJobTypeAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobType/{jobTypeId}/audit/{jobTypeAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTypeId" + "\\}", apiClient.escapeString(jobTypeId.toString()))
      .replaceAll("\\{" + "jobTypeAudit" + "\\}", apiClient.escapeString(jobTypeAudit.toString()));

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
   * Add new tags for a jobType.
   * Adds a tag to an existing jobType.
   * @param jobTypeId Id of the jobType to add a tag to (required)
   * @param jobTypeTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addJobTypeTag(Integer jobTypeId, String jobTypeTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTypeId' is set
    if (jobTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTypeId' when calling addJobTypeTag");
    }
    
    // verify the required parameter 'jobTypeTag' is set
    if (jobTypeTag == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTypeTag' when calling addJobTypeTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobType/{jobTypeId}/tag/{jobTypeTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTypeId" + "\\}", apiClient.escapeString(jobTypeId.toString()))
      .replaceAll("\\{" + "jobTypeTag" + "\\}", apiClient.escapeString(jobTypeTag.toString()));

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
   * Delete a jobType
   * Deletes the jobType identified by the specified id.
   * @param jobTypeId Id of the jobType to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteJobType(Integer jobTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTypeId' is set
    if (jobTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTypeId' when calling deleteJobType");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobType/{jobTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTypeId" + "\\}", apiClient.escapeString(jobTypeId.toString()));

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
   * Delete a tag for a jobType.
   * Deletes an existing jobType tag using the specified data.
   * @param jobTypeId Id of the jobType to remove tag from (required)
   * @param jobTypeTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteJobTypeTag(Integer jobTypeId, String jobTypeTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTypeId' is set
    if (jobTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTypeId' when calling deleteJobTypeTag");
    }
    
    // verify the required parameter 'jobTypeTag' is set
    if (jobTypeTag == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTypeTag' when calling deleteJobTypeTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobType/{jobTypeId}/tag/{jobTypeTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTypeId" + "\\}", apiClient.escapeString(jobTypeId.toString()))
      .replaceAll("\\{" + "jobTypeTag" + "\\}", apiClient.escapeString(jobTypeTag.toString()));

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
   * Get a duplicated a jobType by id
   * Returns a duplicated jobType identified by the specified id.
   * @param jobTypeId Id of the jobType to be duplicated. (required)
   * @return JobType
   * @throws ApiException if fails to make API call
   */
  public JobType getDuplicateJobTypeById(Integer jobTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTypeId' is set
    if (jobTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTypeId' when calling getDuplicateJobTypeById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobType/duplicate/{jobTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTypeId" + "\\}", apiClient.escapeString(jobTypeId.toString()));

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

    
    GenericType<JobType> localVarReturnType = new GenericType<JobType>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search jobTypes by filter
   * Returns the list of jobTypes that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<JobType>
   * @throws ApiException if fails to make API call
   */
  public List<JobType> getJobTypeByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/jobType/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<JobType>> localVarReturnType = new GenericType<List<JobType>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a jobType by id
   * Returns the jobType identified by the specified id.
   * @param jobTypeId Id of the jobType to be returned. (required)
   * @return JobType
   * @throws ApiException if fails to make API call
   */
  public JobType getJobTypeById(Integer jobTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTypeId' is set
    if (jobTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTypeId' when calling getJobTypeById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobType/{jobTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTypeId" + "\\}", apiClient.escapeString(jobTypeId.toString()));

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

    
    GenericType<JobType> localVarReturnType = new GenericType<JobType>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a jobType.
   * Get all existing jobType tags.
   * @param jobTypeId Id of the jobType to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getJobTypeTags(Integer jobTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobTypeId' is set
    if (jobTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobTypeId' when calling getJobTypeTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobType/{jobTypeId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTypeId" + "\\}", apiClient.escapeString(jobTypeId.toString()));

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
   * Update a jobType
   * Updates an existing jobType using the specified data.
   * @param body JobType to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateJobType(JobType body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateJobType");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobType".replaceAll("\\{format\\}","json");

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
   * Update a jobType custom fields
   * Updates an existing jobType custom fields using the specified data.
   * @param body JobType to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateJobTypeCustomFields(JobType body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateJobTypeCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/jobType/customFields".replaceAll("\\{format\\}","json");

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
