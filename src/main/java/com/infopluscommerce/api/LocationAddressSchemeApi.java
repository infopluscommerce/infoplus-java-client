package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.LocationAddressScheme;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
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
    String localVarPath = "/beta/locationAddressScheme".replaceAll("\\{format\\}","json");

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
   * Add new audit for a locationAddressScheme
   * Adds an audit to an existing locationAddressScheme.
   * @param locationAddressSchemeId Id of the locationAddressScheme to add an audit to (required)
   * @param locationAddressSchemeAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addLocationAddressSchemeAudit(Integer locationAddressSchemeId, String locationAddressSchemeAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationAddressSchemeId' is set
    if (locationAddressSchemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationAddressSchemeId' when calling addLocationAddressSchemeAudit");
    }
    
    // verify the required parameter 'locationAddressSchemeAudit' is set
    if (locationAddressSchemeAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'locationAddressSchemeAudit' when calling addLocationAddressSchemeAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/locationAddressScheme/{locationAddressSchemeId}/audit/{locationAddressSchemeAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationAddressSchemeId" + "\\}", apiClient.escapeString(locationAddressSchemeId.toString()))
      .replaceAll("\\{" + "locationAddressSchemeAudit" + "\\}", apiClient.escapeString(locationAddressSchemeAudit.toString()));

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
   * Add new tags for a locationAddressScheme.
   * Adds a tag to an existing locationAddressScheme.
   * @param locationAddressSchemeId Id of the locationAddressScheme to add a tag to (required)
   * @param locationAddressSchemeTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addLocationAddressSchemeTag(Integer locationAddressSchemeId, String locationAddressSchemeTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationAddressSchemeId' is set
    if (locationAddressSchemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationAddressSchemeId' when calling addLocationAddressSchemeTag");
    }
    
    // verify the required parameter 'locationAddressSchemeTag' is set
    if (locationAddressSchemeTag == null) {
      throw new ApiException(400, "Missing the required parameter 'locationAddressSchemeTag' when calling addLocationAddressSchemeTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/locationAddressScheme/{locationAddressSchemeId}/tag/{locationAddressSchemeTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationAddressSchemeId" + "\\}", apiClient.escapeString(locationAddressSchemeId.toString()))
      .replaceAll("\\{" + "locationAddressSchemeTag" + "\\}", apiClient.escapeString(locationAddressSchemeTag.toString()));

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
    String localVarPath = "/beta/locationAddressScheme/{locationAddressSchemeId}".replaceAll("\\{format\\}","json")
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
   * Delete a tag for a locationAddressScheme.
   * Deletes an existing locationAddressScheme tag using the specified data.
   * @param locationAddressSchemeId Id of the locationAddressScheme to remove tag from (required)
   * @param locationAddressSchemeTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLocationAddressSchemeTag(Integer locationAddressSchemeId, String locationAddressSchemeTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationAddressSchemeId' is set
    if (locationAddressSchemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationAddressSchemeId' when calling deleteLocationAddressSchemeTag");
    }
    
    // verify the required parameter 'locationAddressSchemeTag' is set
    if (locationAddressSchemeTag == null) {
      throw new ApiException(400, "Missing the required parameter 'locationAddressSchemeTag' when calling deleteLocationAddressSchemeTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/locationAddressScheme/{locationAddressSchemeId}/tag/{locationAddressSchemeTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationAddressSchemeId" + "\\}", apiClient.escapeString(locationAddressSchemeId.toString()))
      .replaceAll("\\{" + "locationAddressSchemeTag" + "\\}", apiClient.escapeString(locationAddressSchemeTag.toString()));

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
   * Get a duplicated a locationAddressScheme by id
   * Returns a duplicated locationAddressScheme identified by the specified id.
   * @param locationAddressSchemeId Id of the locationAddressScheme to be duplicated. (required)
   * @return LocationAddressScheme
   * @throws ApiException if fails to make API call
   */
  public LocationAddressScheme getDuplicateLocationAddressSchemeById(Integer locationAddressSchemeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationAddressSchemeId' is set
    if (locationAddressSchemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationAddressSchemeId' when calling getDuplicateLocationAddressSchemeById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/locationAddressScheme/duplicate/{locationAddressSchemeId}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/beta/locationAddressScheme/search".replaceAll("\\{format\\}","json");

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
    String localVarPath = "/beta/locationAddressScheme/{locationAddressSchemeId}".replaceAll("\\{format\\}","json")
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
   * Get the tags for a locationAddressScheme.
   * Get all existing locationAddressScheme tags.
   * @param locationAddressSchemeId Id of the locationAddressScheme to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getLocationAddressSchemeTags(Integer locationAddressSchemeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationAddressSchemeId' is set
    if (locationAddressSchemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationAddressSchemeId' when calling getLocationAddressSchemeTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/locationAddressScheme/{locationAddressSchemeId}/tag".replaceAll("\\{format\\}","json")
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

    
    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
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
    String localVarPath = "/beta/locationAddressScheme".replaceAll("\\{format\\}","json");

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
   * Update a locationAddressScheme custom fields
   * Updates an existing locationAddressScheme custom fields using the specified data.
   * @param body LocationAddressScheme to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateLocationAddressSchemeCustomFields(LocationAddressScheme body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateLocationAddressSchemeCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/locationAddressScheme/customFields".replaceAll("\\{format\\}","json");

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
