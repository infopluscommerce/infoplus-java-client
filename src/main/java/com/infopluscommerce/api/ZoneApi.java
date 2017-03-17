package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.Zone;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class ZoneApi {
  private ApiClient apiClient;

  public ZoneApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ZoneApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a zone
   * Inserts a new zone using the specified data.
   * @param body Zone to be inserted. (required)
   * @return Zone
   * @throws ApiException if fails to make API call
   */
  public Zone addZone(Zone body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addZone");
    }
    
    // create path and map variables
    String localVarPath = "/beta/zone".replaceAll("\\{format\\}","json");

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

    
    GenericType<Zone> localVarReturnType = new GenericType<Zone>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a zone
   * Adds an audit to an existing zone.
   * @param zoneId Id of the zone to add an audit to (required)
   * @param zoneAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addZoneAudit(Integer zoneId, String zoneAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'zoneId' is set
    if (zoneId == null) {
      throw new ApiException(400, "Missing the required parameter 'zoneId' when calling addZoneAudit");
    }
    
    // verify the required parameter 'zoneAudit' is set
    if (zoneAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'zoneAudit' when calling addZoneAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/zone/{zoneId}/audit/{zoneAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "zoneId" + "\\}", apiClient.escapeString(zoneId.toString()))
      .replaceAll("\\{" + "zoneAudit" + "\\}", apiClient.escapeString(zoneAudit.toString()));

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
   * Add new tags for a zone.
   * Adds a tag to an existing zone.
   * @param zoneId Id of the zone to add a tag to (required)
   * @param zoneTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addZoneTag(Integer zoneId, String zoneTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'zoneId' is set
    if (zoneId == null) {
      throw new ApiException(400, "Missing the required parameter 'zoneId' when calling addZoneTag");
    }
    
    // verify the required parameter 'zoneTag' is set
    if (zoneTag == null) {
      throw new ApiException(400, "Missing the required parameter 'zoneTag' when calling addZoneTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/zone/{zoneId}/tag/{zoneTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "zoneId" + "\\}", apiClient.escapeString(zoneId.toString()))
      .replaceAll("\\{" + "zoneTag" + "\\}", apiClient.escapeString(zoneTag.toString()));

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
   * Delete a zone
   * Deletes the zone identified by the specified id.
   * @param zoneId Id of the zone to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteZone(Integer zoneId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'zoneId' is set
    if (zoneId == null) {
      throw new ApiException(400, "Missing the required parameter 'zoneId' when calling deleteZone");
    }
    
    // create path and map variables
    String localVarPath = "/beta/zone/{zoneId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "zoneId" + "\\}", apiClient.escapeString(zoneId.toString()));

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
   * Delete a tag for a zone.
   * Deletes an existing zone tag using the specified data.
   * @param zoneId Id of the zone to remove tag from (required)
   * @param zoneTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteZoneTag(Integer zoneId, String zoneTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'zoneId' is set
    if (zoneId == null) {
      throw new ApiException(400, "Missing the required parameter 'zoneId' when calling deleteZoneTag");
    }
    
    // verify the required parameter 'zoneTag' is set
    if (zoneTag == null) {
      throw new ApiException(400, "Missing the required parameter 'zoneTag' when calling deleteZoneTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/zone/{zoneId}/tag/{zoneTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "zoneId" + "\\}", apiClient.escapeString(zoneId.toString()))
      .replaceAll("\\{" + "zoneTag" + "\\}", apiClient.escapeString(zoneTag.toString()));

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
   * Get a duplicated a zone by id
   * Returns a duplicated zone identified by the specified id.
   * @param zoneId Id of the zone to be duplicated. (required)
   * @return Zone
   * @throws ApiException if fails to make API call
   */
  public Zone getDuplicateZoneById(Integer zoneId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'zoneId' is set
    if (zoneId == null) {
      throw new ApiException(400, "Missing the required parameter 'zoneId' when calling getDuplicateZoneById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/zone/duplicate/{zoneId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "zoneId" + "\\}", apiClient.escapeString(zoneId.toString()));

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

    
    GenericType<Zone> localVarReturnType = new GenericType<Zone>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search zones by filter
   * Returns the list of zones that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<Zone>
   * @throws ApiException if fails to make API call
   */
  public List<Zone> getZoneByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/zone/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Zone>> localVarReturnType = new GenericType<List<Zone>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a zone by id
   * Returns the zone identified by the specified id.
   * @param zoneId Id of the zone to be returned. (required)
   * @return Zone
   * @throws ApiException if fails to make API call
   */
  public Zone getZoneById(Integer zoneId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'zoneId' is set
    if (zoneId == null) {
      throw new ApiException(400, "Missing the required parameter 'zoneId' when calling getZoneById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/zone/{zoneId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "zoneId" + "\\}", apiClient.escapeString(zoneId.toString()));

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

    
    GenericType<Zone> localVarReturnType = new GenericType<Zone>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a zone.
   * Get all existing zone tags.
   * @param zoneId Id of the zone to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getZoneTags(Integer zoneId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'zoneId' is set
    if (zoneId == null) {
      throw new ApiException(400, "Missing the required parameter 'zoneId' when calling getZoneTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/zone/{zoneId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "zoneId" + "\\}", apiClient.escapeString(zoneId.toString()));

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
   * Update a zone
   * Updates an existing zone using the specified data.
   * @param body Zone to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateZone(Zone body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateZone");
    }
    
    // create path and map variables
    String localVarPath = "/beta/zone".replaceAll("\\{format\\}","json");

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
   * Update a zone custom fields
   * Updates an existing zone custom fields using the specified data.
   * @param body Zone to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateZoneCustomFields(Zone body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateZoneCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/zone/customFields".replaceAll("\\{format\\}","json");

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
