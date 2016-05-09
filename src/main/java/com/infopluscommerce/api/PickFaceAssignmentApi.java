package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.PickFaceAssignment;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class PickFaceAssignmentApi {
  private ApiClient apiClient;

  public PickFaceAssignmentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PickFaceAssignmentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Update a pickFaceAssignment
   * Updates an existing pickFaceAssignment using the specified data.
   * @param body PickFaceAssignment to be updated.
   * @return void
   */
  public void updatePickFaceAssignment(PickFaceAssignment body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updatePickFaceAssignment");
     }
     
    // create path and map variables
    String path = "/v1.0/pickFaceAssignment".replaceAll("\\{format\\}","json");

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
   * Create a pickFaceAssignment
   * Inserts a new pickFaceAssignment using the specified data.
   * @param body PickFaceAssignment to be inserted.
   * @return PickFaceAssignment
   */
  public PickFaceAssignment addPickFaceAssignment(PickFaceAssignment body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addPickFaceAssignment");
     }
     
    // create path and map variables
    String path = "/v1.0/pickFaceAssignment".replaceAll("\\{format\\}","json");

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

    
    GenericType<PickFaceAssignment> returnType = new GenericType<PickFaceAssignment>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search pickFaceAssignments by filter
   * Returns the list of pickFaceAssignments that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<PickFaceAssignment>
   */
  public List<PickFaceAssignment> getPickFaceAssignmentByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/pickFaceAssignment/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<PickFaceAssignment>> returnType = new GenericType<List<PickFaceAssignment>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a pickFaceAssignment by id
   * Returns the pickFaceAssignment identified by the specified id.
   * @param pickFaceAssignmentId Id of the pickFaceAssignment to be returned.
   * @return PickFaceAssignment
   */
  public PickFaceAssignment getPickFaceAssignmentById(Integer pickFaceAssignmentId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'pickFaceAssignmentId' is set
     if (pickFaceAssignmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'pickFaceAssignmentId' when calling getPickFaceAssignmentById");
     }
     
    // create path and map variables
    String path = "/v1.0/pickFaceAssignment/{pickFaceAssignmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "pickFaceAssignmentId" + "\\}", apiClient.escapeString(pickFaceAssignmentId.toString()));

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

    
    GenericType<PickFaceAssignment> returnType = new GenericType<PickFaceAssignment>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a pickFaceAssignment
   * Deletes the pickFaceAssignment identified by the specified id.
   * @param pickFaceAssignmentId Id of the pickFaceAssignment to be deleted.
   * @return void
   */
  public void deletePickFaceAssignment(Integer pickFaceAssignmentId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'pickFaceAssignmentId' is set
     if (pickFaceAssignmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'pickFaceAssignmentId' when calling deletePickFaceAssignment");
     }
     
    // create path and map variables
    String path = "/v1.0/pickFaceAssignment/{pickFaceAssignmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "pickFaceAssignmentId" + "\\}", apiClient.escapeString(pickFaceAssignmentId.toString()));

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
