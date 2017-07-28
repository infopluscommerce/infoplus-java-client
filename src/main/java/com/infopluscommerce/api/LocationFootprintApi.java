package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.LocationFootprint;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class LocationFootprintApi {
  private ApiClient apiClient;

  public LocationFootprintApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LocationFootprintApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a locationFootprint
   * Inserts a new locationFootprint using the specified data.
   * @param body LocationFootprint to be inserted. (required)
   * @return LocationFootprint
   * @throws ApiException if fails to make API call
   */
  public LocationFootprint addLocationFootprint(LocationFootprint body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addLocationFootprint");
    }
    
    // create path and map variables
    String localVarPath = "/beta/locationFootprint".replaceAll("\\{format\\}","json");

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

    
    GenericType<LocationFootprint> localVarReturnType = new GenericType<LocationFootprint>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a locationFootprint
   * Adds an audit to an existing locationFootprint.
   * @param locationFootprintId Id of the locationFootprint to add an audit to (required)
   * @param locationFootprintAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addLocationFootprintAudit(Integer locationFootprintId, String locationFootprintAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationFootprintId' is set
    if (locationFootprintId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationFootprintId' when calling addLocationFootprintAudit");
    }
    
    // verify the required parameter 'locationFootprintAudit' is set
    if (locationFootprintAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'locationFootprintAudit' when calling addLocationFootprintAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/locationFootprint/{locationFootprintId}/audit/{locationFootprintAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationFootprintId" + "\\}", apiClient.escapeString(locationFootprintId.toString()))
      .replaceAll("\\{" + "locationFootprintAudit" + "\\}", apiClient.escapeString(locationFootprintAudit.toString()));

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
   * Add new tags for a locationFootprint.
   * Adds a tag to an existing locationFootprint.
   * @param locationFootprintId Id of the locationFootprint to add a tag to (required)
   * @param locationFootprintTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addLocationFootprintTag(Integer locationFootprintId, String locationFootprintTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationFootprintId' is set
    if (locationFootprintId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationFootprintId' when calling addLocationFootprintTag");
    }
    
    // verify the required parameter 'locationFootprintTag' is set
    if (locationFootprintTag == null) {
      throw new ApiException(400, "Missing the required parameter 'locationFootprintTag' when calling addLocationFootprintTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/locationFootprint/{locationFootprintId}/tag/{locationFootprintTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationFootprintId" + "\\}", apiClient.escapeString(locationFootprintId.toString()))
      .replaceAll("\\{" + "locationFootprintTag" + "\\}", apiClient.escapeString(locationFootprintTag.toString()));

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
   * Delete a locationFootprint
   * Deletes the locationFootprint identified by the specified id.
   * @param locationFootprintId Id of the locationFootprint to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLocationFootprint(Integer locationFootprintId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationFootprintId' is set
    if (locationFootprintId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationFootprintId' when calling deleteLocationFootprint");
    }
    
    // create path and map variables
    String localVarPath = "/beta/locationFootprint/{locationFootprintId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationFootprintId" + "\\}", apiClient.escapeString(locationFootprintId.toString()));

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
   * Delete a tag for a locationFootprint.
   * Deletes an existing locationFootprint tag using the specified data.
   * @param locationFootprintId Id of the locationFootprint to remove tag from (required)
   * @param locationFootprintTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLocationFootprintTag(Integer locationFootprintId, String locationFootprintTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationFootprintId' is set
    if (locationFootprintId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationFootprintId' when calling deleteLocationFootprintTag");
    }
    
    // verify the required parameter 'locationFootprintTag' is set
    if (locationFootprintTag == null) {
      throw new ApiException(400, "Missing the required parameter 'locationFootprintTag' when calling deleteLocationFootprintTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/locationFootprint/{locationFootprintId}/tag/{locationFootprintTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationFootprintId" + "\\}", apiClient.escapeString(locationFootprintId.toString()))
      .replaceAll("\\{" + "locationFootprintTag" + "\\}", apiClient.escapeString(locationFootprintTag.toString()));

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
   * Get a duplicated a locationFootprint by id
   * Returns a duplicated locationFootprint identified by the specified id.
   * @param locationFootprintId Id of the locationFootprint to be duplicated. (required)
   * @return LocationFootprint
   * @throws ApiException if fails to make API call
   */
  public LocationFootprint getDuplicateLocationFootprintById(Integer locationFootprintId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationFootprintId' is set
    if (locationFootprintId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationFootprintId' when calling getDuplicateLocationFootprintById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/locationFootprint/duplicate/{locationFootprintId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationFootprintId" + "\\}", apiClient.escapeString(locationFootprintId.toString()));

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

    
    GenericType<LocationFootprint> localVarReturnType = new GenericType<LocationFootprint>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search locationFootprints by filter
   * Returns the list of locationFootprints that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<LocationFootprint>
   * @throws ApiException if fails to make API call
   */
  public List<LocationFootprint> getLocationFootprintByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/locationFootprint/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<LocationFootprint>> localVarReturnType = new GenericType<List<LocationFootprint>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a locationFootprint by id
   * Returns the locationFootprint identified by the specified id.
   * @param locationFootprintId Id of the locationFootprint to be returned. (required)
   * @return LocationFootprint
   * @throws ApiException if fails to make API call
   */
  public LocationFootprint getLocationFootprintById(Integer locationFootprintId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationFootprintId' is set
    if (locationFootprintId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationFootprintId' when calling getLocationFootprintById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/locationFootprint/{locationFootprintId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationFootprintId" + "\\}", apiClient.escapeString(locationFootprintId.toString()));

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

    
    GenericType<LocationFootprint> localVarReturnType = new GenericType<LocationFootprint>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a locationFootprint.
   * Get all existing locationFootprint tags.
   * @param locationFootprintId Id of the locationFootprint to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getLocationFootprintTags(Integer locationFootprintId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationFootprintId' is set
    if (locationFootprintId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationFootprintId' when calling getLocationFootprintTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/locationFootprint/{locationFootprintId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationFootprintId" + "\\}", apiClient.escapeString(locationFootprintId.toString()));

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
   * Update a locationFootprint
   * Updates an existing locationFootprint using the specified data.
   * @param body LocationFootprint to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateLocationFootprint(LocationFootprint body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateLocationFootprint");
    }
    
    // create path and map variables
    String localVarPath = "/beta/locationFootprint".replaceAll("\\{format\\}","json");

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
   * Update a locationFootprint custom fields
   * Updates an existing locationFootprint custom fields using the specified data.
   * @param body LocationFootprint to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateLocationFootprintCustomFields(LocationFootprint body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateLocationFootprintCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/locationFootprint/customFields".replaceAll("\\{format\\}","json");

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
