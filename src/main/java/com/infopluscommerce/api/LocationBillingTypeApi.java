package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.LocationBillingType;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class LocationBillingTypeApi {
  private ApiClient apiClient;

  public LocationBillingTypeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LocationBillingTypeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Update a locationBillingType
   * Updates an existing locationBillingType using the specified data.
   * @param body LocationBillingType to be updated.
   * @return void
   */
  public void updateLocationBillingType(LocationBillingType body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateLocationBillingType");
     }
     
    // create path and map variables
    String path = "/v1.0/locationBillingType".replaceAll("\\{format\\}","json");

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
   * Create a locationBillingType
   * Inserts a new locationBillingType using the specified data.
   * @param body LocationBillingType to be inserted.
   * @return LocationBillingType
   */
  public LocationBillingType addLocationBillingType(LocationBillingType body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addLocationBillingType");
     }
     
    // create path and map variables
    String path = "/v1.0/locationBillingType".replaceAll("\\{format\\}","json");

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

    
    GenericType<LocationBillingType> returnType = new GenericType<LocationBillingType>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search locationBillingTypes by filter
   * Returns the list of locationBillingTypes that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<LocationBillingType>
   */
  public List<LocationBillingType> getLocationBillingTypeByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/locationBillingType/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<LocationBillingType>> returnType = new GenericType<List<LocationBillingType>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a locationBillingType by id
   * Returns the locationBillingType identified by the specified id.
   * @param locationBillingTypeId Id of the locationBillingType to be returned.
   * @return LocationBillingType
   */
  public LocationBillingType getLocationBillingTypeById(Integer locationBillingTypeId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'locationBillingTypeId' is set
     if (locationBillingTypeId == null) {
        throw new ApiException(400, "Missing the required parameter 'locationBillingTypeId' when calling getLocationBillingTypeById");
     }
     
    // create path and map variables
    String path = "/v1.0/locationBillingType/{locationBillingTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationBillingTypeId" + "\\}", apiClient.escapeString(locationBillingTypeId.toString()));

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

    
    GenericType<LocationBillingType> returnType = new GenericType<LocationBillingType>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a locationBillingType
   * Deletes the locationBillingType identified by the specified id.
   * @param locationBillingTypeId Id of the locationBillingType to be deleted.
   * @return void
   */
  public void deleteLocationBillingType(Integer locationBillingTypeId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'locationBillingTypeId' is set
     if (locationBillingTypeId == null) {
        throw new ApiException(400, "Missing the required parameter 'locationBillingTypeId' when calling deleteLocationBillingType");
     }
     
    // create path and map variables
    String path = "/v1.0/locationBillingType/{locationBillingTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationBillingTypeId" + "\\}", apiClient.escapeString(locationBillingTypeId.toString()));

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
