package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.JobTime;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
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
   * Update a jobTime
   * Updates an existing jobTime using the specified data.
   * @param body JobTime to be updated.
   * @return void
   */
  public void updateJobTime(JobTime body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateJobTime");
     }
     
    // create path and map variables
    String path = "/v1.0/jobTime".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Create a jobTime
   * Inserts a new jobTime using the specified data.
   * @param body JobTime to be inserted.
   * @return JobTime
   */
  public JobTime addJobTime(JobTime body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addJobTime");
     }
     
    // create path and map variables
    String path = "/v1.0/jobTime".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<JobTime> returnType = new GenericType<JobTime>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search jobTimes by filter
   * Returns the list of jobTimes that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<JobTime>
   */
  public List<JobTime> getJobTimeByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/jobTime/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<List<JobTime>> returnType = new GenericType<List<JobTime>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a jobTime by id
   * Returns the jobTime identified by the specified id.
   * @param jobTimeId Id of the jobTime to be returned.
   * @return JobTime
   */
  public JobTime getJobTimeById(Integer jobTimeId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'jobTimeId' is set
     if (jobTimeId == null) {
        throw new ApiException(400, "Missing the required parameter 'jobTimeId' when calling getJobTimeById");
     }
     
    // create path and map variables
    String path = "/v1.0/jobTime/{jobTimeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTimeId" + "\\}", apiClient.escapeString(jobTimeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<JobTime> returnType = new GenericType<JobTime>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a jobTime
   * Deletes the jobTime identified by the specified id.
   * @param jobTimeId Id of the jobTime to be deleted.
   * @return void
   */
  public void deleteJobTime(Integer jobTimeId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'jobTimeId' is set
     if (jobTimeId == null) {
        throw new ApiException(400, "Missing the required parameter 'jobTimeId' when calling deleteJobTime");
     }
     
    // create path and map variables
    String path = "/v1.0/jobTime/{jobTimeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobTimeId" + "\\}", apiClient.escapeString(jobTimeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
}
