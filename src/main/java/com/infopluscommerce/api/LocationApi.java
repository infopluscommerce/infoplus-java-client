package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ApiResponse;
import com.infopluscommerce.model.Location;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class LocationApi {
  private ApiClient apiClient;

  public LocationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LocationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a location
   * Inserts a new location using the specified data.
   * @param body Location to be inserted. (required)
   * @return Location
   * @throws ApiException if fails to make API call
   */
  public Location addLocation(Location body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addLocation");
    }
    
    // create path and map variables
    String localVarPath = "/beta/location".replaceAll("\\{format\\}","json");

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

    
    GenericType<Location> localVarReturnType = new GenericType<Location>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a location
   * Adds an audit to an existing location.
   * @param locationId Id of the location to add an audit to (required)
   * @param locationAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addLocationAudit(Integer locationId, String locationAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling addLocationAudit");
    }
    
    // verify the required parameter 'locationAudit' is set
    if (locationAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'locationAudit' when calling addLocationAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/location/{locationId}/audit/{locationAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationId" + "\\}", apiClient.escapeString(locationId.toString()))
      .replaceAll("\\{" + "locationAudit" + "\\}", apiClient.escapeString(locationAudit.toString()));

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
   * Add new tags for a location.
   * Adds a tag to an existing location.
   * @param locationId Id of the location to add a tag to (required)
   * @param locationTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addLocationTag(Integer locationId, String locationTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling addLocationTag");
    }
    
    // verify the required parameter 'locationTag' is set
    if (locationTag == null) {
      throw new ApiException(400, "Missing the required parameter 'locationTag' when calling addLocationTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/location/{locationId}/tag/{locationTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationId" + "\\}", apiClient.escapeString(locationId.toString()))
      .replaceAll("\\{" + "locationTag" + "\\}", apiClient.escapeString(locationTag.toString()));

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
   * Delete a location
   * Deletes the location identified by the specified id.
   * @param locationId Id of the location to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLocation(Integer locationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling deleteLocation");
    }
    
    // create path and map variables
    String localVarPath = "/beta/location/{locationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationId" + "\\}", apiClient.escapeString(locationId.toString()));

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
   * Delete a tag for a location.
   * Deletes an existing location tag using the specified data.
   * @param locationId Id of the location to remove tag from (required)
   * @param locationTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLocationTag(Integer locationId, String locationTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling deleteLocationTag");
    }
    
    // verify the required parameter 'locationTag' is set
    if (locationTag == null) {
      throw new ApiException(400, "Missing the required parameter 'locationTag' when calling deleteLocationTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/location/{locationId}/tag/{locationTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationId" + "\\}", apiClient.escapeString(locationId.toString()))
      .replaceAll("\\{" + "locationTag" + "\\}", apiClient.escapeString(locationTag.toString()));

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
   * Get a duplicated a location by id
   * Returns a duplicated location identified by the specified id.
   * @param locationId Id of the location to be duplicated. (required)
   * @return Location
   * @throws ApiException if fails to make API call
   */
  public Location getDuplicateLocationById(Integer locationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling getDuplicateLocationById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/location/duplicate/{locationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationId" + "\\}", apiClient.escapeString(locationId.toString()));

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

    
    GenericType<Location> localVarReturnType = new GenericType<Location>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search locations by filter
   * Returns the list of locations that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<Location>
   * @throws ApiException if fails to make API call
   */
  public List<Location> getLocationByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/location/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Location>> localVarReturnType = new GenericType<List<Location>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a location by id
   * Returns the location identified by the specified id.
   * @param locationId Id of the location to be returned. (required)
   * @return Location
   * @throws ApiException if fails to make API call
   */
  public Location getLocationById(Integer locationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling getLocationById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/location/{locationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationId" + "\\}", apiClient.escapeString(locationId.toString()));

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

    
    GenericType<Location> localVarReturnType = new GenericType<Location>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a location.
   * Get all existing location tags.
   * @param locationId Id of the location to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getLocationTags(Integer locationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling getLocationTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/location/{locationId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationId" + "\\}", apiClient.escapeString(locationId.toString()));

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
   * Update a location
   * Updates an existing location using the specified data.
   * @param body Location to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateLocation(Location body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateLocation");
    }
    
    // create path and map variables
    String localVarPath = "/beta/location".replaceAll("\\{format\\}","json");

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
   * Update a location custom fields
   * Updates an existing location custom fields using the specified data.
   * @param body Location to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateLocationCustomFields(Location body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateLocationCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/location/customFields".replaceAll("\\{format\\}","json");

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
