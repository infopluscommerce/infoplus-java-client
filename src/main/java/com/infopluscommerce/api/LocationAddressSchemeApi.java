package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.LocationAddressScheme;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class LocationAddressSchemeApi {
  private ApiClient apiClient;

  public LocationAddressSchemeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LocationAddressSchemeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Update a locationAddressScheme
   * Updates an existing locationAddressScheme using the specified data.
   * @param body LocationAddressScheme to be updated.
   * @return void
   */
  public void updateLocationAddressScheme(LocationAddressScheme body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateLocationAddressScheme");
     }
     
    // create path and map variables
    String path = "/v1.0/locationAddressScheme".replaceAll("\\{format\\}","json");

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
   * Create a locationAddressScheme
   * Inserts a new locationAddressScheme using the specified data.
   * @param body LocationAddressScheme to be inserted.
   * @return LocationAddressScheme
   */
  public LocationAddressScheme addLocationAddressScheme(LocationAddressScheme body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addLocationAddressScheme");
     }
     
    // create path and map variables
    String path = "/v1.0/locationAddressScheme".replaceAll("\\{format\\}","json");

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

    
    GenericType<LocationAddressScheme> returnType = new GenericType<LocationAddressScheme>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search locationAddressSchemes by filter
   * Returns the list of locationAddressSchemes that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<LocationAddressScheme>
   */
  public List<LocationAddressScheme> getLocationAddressSchemeByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/locationAddressScheme/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<LocationAddressScheme>> returnType = new GenericType<List<LocationAddressScheme>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a locationAddressScheme by id
   * Returns the locationAddressScheme identified by the specified id.
   * @param locationAddressSchemeId Id of the locationAddressScheme to be returned.
   * @return LocationAddressScheme
   */
  public LocationAddressScheme getLocationAddressSchemeById(Integer locationAddressSchemeId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'locationAddressSchemeId' is set
     if (locationAddressSchemeId == null) {
        throw new ApiException(400, "Missing the required parameter 'locationAddressSchemeId' when calling getLocationAddressSchemeById");
     }
     
    // create path and map variables
    String path = "/v1.0/locationAddressScheme/{locationAddressSchemeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationAddressSchemeId" + "\\}", apiClient.escapeString(locationAddressSchemeId.toString()));

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

    
    GenericType<LocationAddressScheme> returnType = new GenericType<LocationAddressScheme>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a locationAddressScheme
   * Deletes the locationAddressScheme identified by the specified id.
   * @param locationAddressSchemeId Id of the locationAddressScheme to be deleted.
   * @return void
   */
  public void deleteLocationAddressScheme(Integer locationAddressSchemeId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'locationAddressSchemeId' is set
     if (locationAddressSchemeId == null) {
        throw new ApiException(400, "Missing the required parameter 'locationAddressSchemeId' when calling deleteLocationAddressScheme");
     }
     
    // create path and map variables
    String path = "/v1.0/locationAddressScheme/{locationAddressSchemeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationAddressSchemeId" + "\\}", apiClient.escapeString(locationAddressSchemeId.toString()));

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
