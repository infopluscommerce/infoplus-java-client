package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ApiResponse;
import com.infopluscommerce.model.LocationAddressScheme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T15:40:30.367-05:00")
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
   * Create a locationAddressScheme
   * Inserts a new locationAddressScheme using the specified data.
   * @param body LocationAddressScheme to be inserted. (required)
   * @return LocationAddressScheme
   * @throws ApiException if fails to make API call
   */
  public LocationAddressScheme addLocationAddressScheme(LocationAddressScheme body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addLocationAddressScheme");
    }
    
    // create path and map variables
    String localVarPath = "/v1.0/locationAddressScheme".replaceAll("\\{format\\}","json");

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

    
    GenericType<LocationAddressScheme> localVarReturnType = new GenericType<LocationAddressScheme>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete a locationAddressScheme
   * Deletes the locationAddressScheme identified by the specified id.
   * @param locationAddressSchemeId Id of the locationAddressScheme to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLocationAddressScheme(Integer locationAddressSchemeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationAddressSchemeId' is set
    if (locationAddressSchemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationAddressSchemeId' when calling deleteLocationAddressScheme");
    }
    
    // create path and map variables
    String localVarPath = "/v1.0/locationAddressScheme/{locationAddressSchemeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationAddressSchemeId" + "\\}", apiClient.escapeString(locationAddressSchemeId.toString()));

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
   * Search locationAddressSchemes by filter
   * Returns the list of locationAddressSchemes that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<LocationAddressScheme>
   * @throws ApiException if fails to make API call
   */
  public List<LocationAddressScheme> getLocationAddressSchemeByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1.0/locationAddressScheme/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<LocationAddressScheme>> localVarReturnType = new GenericType<List<LocationAddressScheme>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a locationAddressScheme by id
   * Returns the locationAddressScheme identified by the specified id.
   * @param locationAddressSchemeId Id of the locationAddressScheme to be returned. (required)
   * @return LocationAddressScheme
   * @throws ApiException if fails to make API call
   */
  public LocationAddressScheme getLocationAddressSchemeById(Integer locationAddressSchemeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationAddressSchemeId' is set
    if (locationAddressSchemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationAddressSchemeId' when calling getLocationAddressSchemeById");
    }
    
    // create path and map variables
    String localVarPath = "/v1.0/locationAddressScheme/{locationAddressSchemeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationAddressSchemeId" + "\\}", apiClient.escapeString(locationAddressSchemeId.toString()));

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

    
    GenericType<LocationAddressScheme> localVarReturnType = new GenericType<LocationAddressScheme>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a locationAddressScheme
   * Updates an existing locationAddressScheme using the specified data.
   * @param body LocationAddressScheme to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateLocationAddressScheme(LocationAddressScheme body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateLocationAddressScheme");
    }
    
    // create path and map variables
    String localVarPath = "/v1.0/locationAddressScheme".replaceAll("\\{format\\}","json");

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
