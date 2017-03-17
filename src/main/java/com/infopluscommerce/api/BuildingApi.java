package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.Building;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class BuildingApi {
  private ApiClient apiClient;

  public BuildingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BuildingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a building
   * Inserts a new building using the specified data.
   * @param body Building to be inserted. (required)
   * @return Building
   * @throws ApiException if fails to make API call
   */
  public Building addBuilding(Building body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addBuilding");
    }
    
    // create path and map variables
    String localVarPath = "/beta/building".replaceAll("\\{format\\}","json");

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

    
    GenericType<Building> localVarReturnType = new GenericType<Building>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a building
   * Adds an audit to an existing building.
   * @param buildingId Id of the building to add an audit to (required)
   * @param buildingAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addBuildingAudit(Integer buildingId, String buildingAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'buildingId' is set
    if (buildingId == null) {
      throw new ApiException(400, "Missing the required parameter 'buildingId' when calling addBuildingAudit");
    }
    
    // verify the required parameter 'buildingAudit' is set
    if (buildingAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'buildingAudit' when calling addBuildingAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/building/{buildingId}/audit/{buildingAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "buildingId" + "\\}", apiClient.escapeString(buildingId.toString()))
      .replaceAll("\\{" + "buildingAudit" + "\\}", apiClient.escapeString(buildingAudit.toString()));

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
   * Add new tags for a building.
   * Adds a tag to an existing building.
   * @param buildingId Id of the building to add a tag to (required)
   * @param buildingTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addBuildingTag(Integer buildingId, String buildingTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'buildingId' is set
    if (buildingId == null) {
      throw new ApiException(400, "Missing the required parameter 'buildingId' when calling addBuildingTag");
    }
    
    // verify the required parameter 'buildingTag' is set
    if (buildingTag == null) {
      throw new ApiException(400, "Missing the required parameter 'buildingTag' when calling addBuildingTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/building/{buildingId}/tag/{buildingTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "buildingId" + "\\}", apiClient.escapeString(buildingId.toString()))
      .replaceAll("\\{" + "buildingTag" + "\\}", apiClient.escapeString(buildingTag.toString()));

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
   * Delete a building
   * Deletes the building identified by the specified id.
   * @param buildingId Id of the building to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteBuilding(Integer buildingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'buildingId' is set
    if (buildingId == null) {
      throw new ApiException(400, "Missing the required parameter 'buildingId' when calling deleteBuilding");
    }
    
    // create path and map variables
    String localVarPath = "/beta/building/{buildingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "buildingId" + "\\}", apiClient.escapeString(buildingId.toString()));

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
   * Delete a tag for a building.
   * Deletes an existing building tag using the specified data.
   * @param buildingId Id of the building to remove tag from (required)
   * @param buildingTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteBuildingTag(Integer buildingId, String buildingTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'buildingId' is set
    if (buildingId == null) {
      throw new ApiException(400, "Missing the required parameter 'buildingId' when calling deleteBuildingTag");
    }
    
    // verify the required parameter 'buildingTag' is set
    if (buildingTag == null) {
      throw new ApiException(400, "Missing the required parameter 'buildingTag' when calling deleteBuildingTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/building/{buildingId}/tag/{buildingTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "buildingId" + "\\}", apiClient.escapeString(buildingId.toString()))
      .replaceAll("\\{" + "buildingTag" + "\\}", apiClient.escapeString(buildingTag.toString()));

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
   * Search buildings by filter
   * Returns the list of buildings that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<Building>
   * @throws ApiException if fails to make API call
   */
  public List<Building> getBuildingByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/building/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Building>> localVarReturnType = new GenericType<List<Building>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a building by id
   * Returns the building identified by the specified id.
   * @param buildingId Id of the building to be returned. (required)
   * @return Building
   * @throws ApiException if fails to make API call
   */
  public Building getBuildingById(Integer buildingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'buildingId' is set
    if (buildingId == null) {
      throw new ApiException(400, "Missing the required parameter 'buildingId' when calling getBuildingById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/building/{buildingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "buildingId" + "\\}", apiClient.escapeString(buildingId.toString()));

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

    
    GenericType<Building> localVarReturnType = new GenericType<Building>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a building.
   * Get all existing building tags.
   * @param buildingId Id of the building to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getBuildingTags(Integer buildingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'buildingId' is set
    if (buildingId == null) {
      throw new ApiException(400, "Missing the required parameter 'buildingId' when calling getBuildingTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/building/{buildingId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "buildingId" + "\\}", apiClient.escapeString(buildingId.toString()));

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
   * Get a duplicated a building by id
   * Returns a duplicated building identified by the specified id.
   * @param buildingId Id of the building to be duplicated. (required)
   * @return Building
   * @throws ApiException if fails to make API call
   */
  public Building getDuplicateBuildingById(Integer buildingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'buildingId' is set
    if (buildingId == null) {
      throw new ApiException(400, "Missing the required parameter 'buildingId' when calling getDuplicateBuildingById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/building/duplicate/{buildingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "buildingId" + "\\}", apiClient.escapeString(buildingId.toString()));

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

    
    GenericType<Building> localVarReturnType = new GenericType<Building>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a building
   * Updates an existing building using the specified data.
   * @param body Building to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateBuilding(Building body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateBuilding");
    }
    
    // create path and map variables
    String localVarPath = "/beta/building".replaceAll("\\{format\\}","json");

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
   * Update a building custom fields
   * Updates an existing building custom fields using the specified data.
   * @param body Building to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateBuildingCustomFields(Building body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateBuildingCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/building/customFields".replaceAll("\\{format\\}","json");

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
