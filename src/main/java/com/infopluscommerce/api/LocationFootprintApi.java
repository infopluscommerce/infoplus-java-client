package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.LocationFootprint;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
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
   * Update a locationFootprint
   * Updates an existing locationFootprint using the specified data.
   * @param body LocationFootprint to be updated.
   * @return void
   */
  public void updateLocationFootprint(LocationFootprint body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateLocationFootprint");
     }
     
    // create path and map variables
    String path = "/v1.0/locationFootprint".replaceAll("\\{format\\}","json");

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
   * Create a locationFootprint
   * Inserts a new locationFootprint using the specified data.
   * @param body LocationFootprint to be inserted.
   * @return LocationFootprint
   */
  public LocationFootprint addLocationFootprint(LocationFootprint body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addLocationFootprint");
     }
     
    // create path and map variables
    String path = "/v1.0/locationFootprint".replaceAll("\\{format\\}","json");

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

    
    GenericType<LocationFootprint> returnType = new GenericType<LocationFootprint>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search locationFootprints by filter
   * Returns the list of locationFootprints that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<LocationFootprint>
   */
  public List<LocationFootprint> getLocationFootprintByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/locationFootprint/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<LocationFootprint>> returnType = new GenericType<List<LocationFootprint>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a locationFootprint by id
   * Returns the locationFootprint identified by the specified id.
   * @param locationFootprintId Id of the locationFootprint to be returned.
   * @return LocationFootprint
   */
  public LocationFootprint getLocationFootprintById(Integer locationFootprintId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'locationFootprintId' is set
     if (locationFootprintId == null) {
        throw new ApiException(400, "Missing the required parameter 'locationFootprintId' when calling getLocationFootprintById");
     }
     
    // create path and map variables
    String path = "/v1.0/locationFootprint/{locationFootprintId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationFootprintId" + "\\}", apiClient.escapeString(locationFootprintId.toString()));

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

    
    GenericType<LocationFootprint> returnType = new GenericType<LocationFootprint>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a locationFootprint
   * Deletes the locationFootprint identified by the specified id.
   * @param locationFootprintId Id of the locationFootprint to be deleted.
   * @return void
   */
  public void deleteLocationFootprint(Integer locationFootprintId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'locationFootprintId' is set
     if (locationFootprintId == null) {
        throw new ApiException(400, "Missing the required parameter 'locationFootprintId' when calling deleteLocationFootprint");
     }
     
    // create path and map variables
    String path = "/v1.0/locationFootprint/{locationFootprintId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationFootprintId" + "\\}", apiClient.escapeString(locationFootprintId.toString()));

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
