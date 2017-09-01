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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
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
   * Add new audit for a pickFaceAssignment
   * Adds an audit to an existing pickFaceAssignment.
   * @param pickFaceAssignmentId Id of the pickFaceAssignment to add an audit to (required)
   * @param pickFaceAssignmentAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addPickFaceAssignmentAudit(Integer pickFaceAssignmentId, String pickFaceAssignmentAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pickFaceAssignmentId' is set
    if (pickFaceAssignmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'pickFaceAssignmentId' when calling addPickFaceAssignmentAudit");
    }
    
    // verify the required parameter 'pickFaceAssignmentAudit' is set
    if (pickFaceAssignmentAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'pickFaceAssignmentAudit' when calling addPickFaceAssignmentAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/pickFaceAssignment/{pickFaceAssignmentId}/audit/{pickFaceAssignmentAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "pickFaceAssignmentId" + "\\}", apiClient.escapeString(pickFaceAssignmentId.toString()))
      .replaceAll("\\{" + "pickFaceAssignmentAudit" + "\\}", apiClient.escapeString(pickFaceAssignmentAudit.toString()));

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
   * Add new tags for a pickFaceAssignment.
   * Adds a tag to an existing pickFaceAssignment.
   * @param pickFaceAssignmentId Id of the pickFaceAssignment to add a tag to (required)
   * @param pickFaceAssignmentTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addPickFaceAssignmentTag(Integer pickFaceAssignmentId, String pickFaceAssignmentTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pickFaceAssignmentId' is set
    if (pickFaceAssignmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'pickFaceAssignmentId' when calling addPickFaceAssignmentTag");
    }
    
    // verify the required parameter 'pickFaceAssignmentTag' is set
    if (pickFaceAssignmentTag == null) {
      throw new ApiException(400, "Missing the required parameter 'pickFaceAssignmentTag' when calling addPickFaceAssignmentTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/pickFaceAssignment/{pickFaceAssignmentId}/tag/{pickFaceAssignmentTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "pickFaceAssignmentId" + "\\}", apiClient.escapeString(pickFaceAssignmentId.toString()))
      .replaceAll("\\{" + "pickFaceAssignmentTag" + "\\}", apiClient.escapeString(pickFaceAssignmentTag.toString()));

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
   * Delete a tag for a pickFaceAssignment.
   * Deletes an existing pickFaceAssignment tag using the specified data.
   * @param pickFaceAssignmentId Id of the pickFaceAssignment to remove tag from (required)
   * @param pickFaceAssignmentTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deletePickFaceAssignmentTag(Integer pickFaceAssignmentId, String pickFaceAssignmentTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pickFaceAssignmentId' is set
    if (pickFaceAssignmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'pickFaceAssignmentId' when calling deletePickFaceAssignmentTag");
    }
    
    // verify the required parameter 'pickFaceAssignmentTag' is set
    if (pickFaceAssignmentTag == null) {
      throw new ApiException(400, "Missing the required parameter 'pickFaceAssignmentTag' when calling deletePickFaceAssignmentTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/pickFaceAssignment/{pickFaceAssignmentId}/tag/{pickFaceAssignmentTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "pickFaceAssignmentId" + "\\}", apiClient.escapeString(pickFaceAssignmentId.toString()))
      .replaceAll("\\{" + "pickFaceAssignmentTag" + "\\}", apiClient.escapeString(pickFaceAssignmentTag.toString()));

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
   * Get a duplicated a pickFaceAssignment by id
   * Returns a duplicated pickFaceAssignment identified by the specified id.
   * @param pickFaceAssignmentId Id of the pickFaceAssignment to be duplicated. (required)
   * @return PickFaceAssignment
   * @throws ApiException if fails to make API call
   */
  public PickFaceAssignment getDuplicatePickFaceAssignmentById(Integer pickFaceAssignmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pickFaceAssignmentId' is set
    if (pickFaceAssignmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'pickFaceAssignmentId' when calling getDuplicatePickFaceAssignmentById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/pickFaceAssignment/duplicate/{pickFaceAssignmentId}".replaceAll("\\{format\\}","json")
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
   * Get the tags for a pickFaceAssignment.
   * Get all existing pickFaceAssignment tags.
   * @param pickFaceAssignmentId Id of the pickFaceAssignment to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getPickFaceAssignmentTags(Integer pickFaceAssignmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pickFaceAssignmentId' is set
    if (pickFaceAssignmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'pickFaceAssignmentId' when calling getPickFaceAssignmentTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/pickFaceAssignment/{pickFaceAssignmentId}/tag".replaceAll("\\{format\\}","json")
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

    
    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
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
