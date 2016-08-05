package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.PickFaceAssignment;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-04T22:56:01.104-05:00")
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
   * Create a pickFaceAssignment
   * Inserts a new pickFaceAssignment using the specified data.
   * @param body PickFaceAssignment to be inserted. (required)
   * @return PickFaceAssignment
   * @throws ApiException if fails to make API call
   */
  public PickFaceAssignment addPickFaceAssignment(PickFaceAssignment body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addPickFaceAssignment");
    }
    
    // create path and map variables
    String localVarPath = "/beta/pickFaceAssignment".replaceAll("\\{format\\}","json");

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

    
    GenericType<PickFaceAssignment> localVarReturnType = new GenericType<PickFaceAssignment>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete a pickFaceAssignment
   * Deletes the pickFaceAssignment identified by the specified id.
   * @param pickFaceAssignmentId Id of the pickFaceAssignment to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deletePickFaceAssignment(Integer pickFaceAssignmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pickFaceAssignmentId' is set
    if (pickFaceAssignmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'pickFaceAssignmentId' when calling deletePickFaceAssignment");
    }
    
    // create path and map variables
    String localVarPath = "/beta/pickFaceAssignment/{pickFaceAssignmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "pickFaceAssignmentId" + "\\}", apiClient.escapeString(pickFaceAssignmentId.toString()));

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
   * Search pickFaceAssignments by filter
   * Returns the list of pickFaceAssignments that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<PickFaceAssignment>
   * @throws ApiException if fails to make API call
   */
  public List<PickFaceAssignment> getPickFaceAssignmentByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/pickFaceAssignment/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<PickFaceAssignment>> localVarReturnType = new GenericType<List<PickFaceAssignment>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a pickFaceAssignment by id
   * Returns the pickFaceAssignment identified by the specified id.
   * @param pickFaceAssignmentId Id of the pickFaceAssignment to be returned. (required)
   * @return PickFaceAssignment
   * @throws ApiException if fails to make API call
   */
  public PickFaceAssignment getPickFaceAssignmentById(Integer pickFaceAssignmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pickFaceAssignmentId' is set
    if (pickFaceAssignmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'pickFaceAssignmentId' when calling getPickFaceAssignmentById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/pickFaceAssignment/{pickFaceAssignmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "pickFaceAssignmentId" + "\\}", apiClient.escapeString(pickFaceAssignmentId.toString()));

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

    
    GenericType<PickFaceAssignment> localVarReturnType = new GenericType<PickFaceAssignment>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a pickFaceAssignment
   * Updates an existing pickFaceAssignment using the specified data.
   * @param body PickFaceAssignment to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updatePickFaceAssignment(PickFaceAssignment body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updatePickFaceAssignment");
    }
    
    // create path and map variables
    String localVarPath = "/beta/pickFaceAssignment".replaceAll("\\{format\\}","json");

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
   * Update a pickFaceAssignment custom fields
   * Updates an existing pickFaceAssignment custom fields using the specified data.
   * @param body PickFaceAssignment to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updatePickFaceAssignmentCustomFields(PickFaceAssignment body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updatePickFaceAssignmentCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/pickFaceAssignment/customFields".replaceAll("\\{format\\}","json");

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
