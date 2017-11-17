package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.LocationBillingType;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:31:34.297-06:00")
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
   * Create a locationBillingType
   * Inserts a new locationBillingType using the specified data.
   * @param body LocationBillingType to be inserted. (required)
   * @return LocationBillingType
   * @throws ApiException if fails to make API call
   */
  public LocationBillingType addLocationBillingType(LocationBillingType body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addLocationBillingType");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/locationBillingType".replaceAll("\\{format\\}","json");

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

    
    GenericType<LocationBillingType> localVarReturnType = new GenericType<LocationBillingType>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete a locationBillingType
   * Deletes the locationBillingType identified by the specified id.
   * @param locationBillingTypeId Id of the locationBillingType to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLocationBillingType(Integer locationBillingTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationBillingTypeId' is set
    if (locationBillingTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationBillingTypeId' when calling deleteLocationBillingType");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/locationBillingType/{locationBillingTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationBillingTypeId" + "\\}", apiClient.escapeString(locationBillingTypeId.toString()));

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
   * Get a duplicated a locationBillingType by id
   * Returns a duplicated locationBillingType identified by the specified id.
   * @param locationBillingTypeId Id of the locationBillingType to be duplicated. (required)
   * @return LocationBillingType
   * @throws ApiException if fails to make API call
   */
  public LocationBillingType getDuplicateLocationBillingTypeById(Integer locationBillingTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationBillingTypeId' is set
    if (locationBillingTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationBillingTypeId' when calling getDuplicateLocationBillingTypeById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/locationBillingType/duplicate/{locationBillingTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationBillingTypeId" + "\\}", apiClient.escapeString(locationBillingTypeId.toString()));

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

    
    GenericType<LocationBillingType> localVarReturnType = new GenericType<LocationBillingType>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search locationBillingTypes by filter
   * Returns the list of locationBillingTypes that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<LocationBillingType>
   * @throws ApiException if fails to make API call
   */
  public List<LocationBillingType> getLocationBillingTypeByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2.0/locationBillingType/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<LocationBillingType>> localVarReturnType = new GenericType<List<LocationBillingType>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a locationBillingType by id
   * Returns the locationBillingType identified by the specified id.
   * @param locationBillingTypeId Id of the locationBillingType to be returned. (required)
   * @return LocationBillingType
   * @throws ApiException if fails to make API call
   */
  public LocationBillingType getLocationBillingTypeById(Integer locationBillingTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationBillingTypeId' is set
    if (locationBillingTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationBillingTypeId' when calling getLocationBillingTypeById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/locationBillingType/{locationBillingTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationBillingTypeId" + "\\}", apiClient.escapeString(locationBillingTypeId.toString()));

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

    
    GenericType<LocationBillingType> localVarReturnType = new GenericType<LocationBillingType>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a locationBillingType
   * Updates an existing locationBillingType using the specified data.
   * @param body LocationBillingType to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateLocationBillingType(LocationBillingType body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateLocationBillingType");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/locationBillingType".replaceAll("\\{format\\}","json");

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
   * Update a locationBillingType custom fields
   * Updates an existing locationBillingType custom fields using the specified data.
   * @param body LocationBillingType to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateLocationBillingTypeCustomFields(LocationBillingType body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateLocationBillingTypeCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/locationBillingType/customFields".replaceAll("\\{format\\}","json");

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
