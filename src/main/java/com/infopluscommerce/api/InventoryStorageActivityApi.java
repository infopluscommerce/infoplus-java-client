package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.InventoryStorageActivity;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class InventoryStorageActivityApi {
  private ApiClient apiClient;

  public InventoryStorageActivityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InventoryStorageActivityApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an inventoryStorageActivity
   * Inserts a new inventoryStorageActivity using the specified data.
   * @param body InventoryStorageActivity to be inserted. (required)
   * @return InventoryStorageActivity
   * @throws ApiException if fails to make API call
   */
  public InventoryStorageActivity addInventoryStorageActivity(InventoryStorageActivity body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addInventoryStorageActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryStorageActivity".replaceAll("\\{format\\}","json");

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

    
    GenericType<InventoryStorageActivity> localVarReturnType = new GenericType<InventoryStorageActivity>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for an inventoryStorageActivity
   * Adds an audit to an existing inventoryStorageActivity.
   * @param inventoryStorageActivityId Id of the inventoryStorageActivity to add an audit to (required)
   * @param inventoryStorageActivityAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addInventoryStorageActivityAudit(Integer inventoryStorageActivityId, String inventoryStorageActivityAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventoryStorageActivityId' is set
    if (inventoryStorageActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryStorageActivityId' when calling addInventoryStorageActivityAudit");
    }
    
    // verify the required parameter 'inventoryStorageActivityAudit' is set
    if (inventoryStorageActivityAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryStorageActivityAudit' when calling addInventoryStorageActivityAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryStorageActivity/{inventoryStorageActivityId}/audit/{inventoryStorageActivityAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryStorageActivityId" + "\\}", apiClient.escapeString(inventoryStorageActivityId.toString()))
      .replaceAll("\\{" + "inventoryStorageActivityAudit" + "\\}", apiClient.escapeString(inventoryStorageActivityAudit.toString()));

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
   * Add new tags for an inventoryStorageActivity.
   * Adds a tag to an existing inventoryStorageActivity.
   * @param inventoryStorageActivityId Id of the inventoryStorageActivity to add a tag to (required)
   * @param inventoryStorageActivityTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addInventoryStorageActivityTag(Integer inventoryStorageActivityId, String inventoryStorageActivityTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventoryStorageActivityId' is set
    if (inventoryStorageActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryStorageActivityId' when calling addInventoryStorageActivityTag");
    }
    
    // verify the required parameter 'inventoryStorageActivityTag' is set
    if (inventoryStorageActivityTag == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryStorageActivityTag' when calling addInventoryStorageActivityTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryStorageActivity/{inventoryStorageActivityId}/tag/{inventoryStorageActivityTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryStorageActivityId" + "\\}", apiClient.escapeString(inventoryStorageActivityId.toString()))
      .replaceAll("\\{" + "inventoryStorageActivityTag" + "\\}", apiClient.escapeString(inventoryStorageActivityTag.toString()));

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
   * Delete an inventoryStorageActivity
   * Deletes the inventoryStorageActivity identified by the specified id.
   * @param inventoryStorageActivityId Id of the inventoryStorageActivity to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteInventoryStorageActivity(Integer inventoryStorageActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventoryStorageActivityId' is set
    if (inventoryStorageActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryStorageActivityId' when calling deleteInventoryStorageActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryStorageActivity/{inventoryStorageActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryStorageActivityId" + "\\}", apiClient.escapeString(inventoryStorageActivityId.toString()));

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
   * Delete a tag for an inventoryStorageActivity.
   * Deletes an existing inventoryStorageActivity tag using the specified data.
   * @param inventoryStorageActivityId Id of the inventoryStorageActivity to remove tag from (required)
   * @param inventoryStorageActivityTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteInventoryStorageActivityTag(Integer inventoryStorageActivityId, String inventoryStorageActivityTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventoryStorageActivityId' is set
    if (inventoryStorageActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryStorageActivityId' when calling deleteInventoryStorageActivityTag");
    }
    
    // verify the required parameter 'inventoryStorageActivityTag' is set
    if (inventoryStorageActivityTag == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryStorageActivityTag' when calling deleteInventoryStorageActivityTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryStorageActivity/{inventoryStorageActivityId}/tag/{inventoryStorageActivityTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryStorageActivityId" + "\\}", apiClient.escapeString(inventoryStorageActivityId.toString()))
      .replaceAll("\\{" + "inventoryStorageActivityTag" + "\\}", apiClient.escapeString(inventoryStorageActivityTag.toString()));

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
   * Get a duplicated an inventoryStorageActivity by id
   * Returns a duplicated inventoryStorageActivity identified by the specified id.
   * @param inventoryStorageActivityId Id of the inventoryStorageActivity to be duplicated. (required)
   * @return InventoryStorageActivity
   * @throws ApiException if fails to make API call
   */
  public InventoryStorageActivity getDuplicateInventoryStorageActivityById(Integer inventoryStorageActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventoryStorageActivityId' is set
    if (inventoryStorageActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryStorageActivityId' when calling getDuplicateInventoryStorageActivityById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryStorageActivity/duplicate/{inventoryStorageActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryStorageActivityId" + "\\}", apiClient.escapeString(inventoryStorageActivityId.toString()));

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

    
    GenericType<InventoryStorageActivity> localVarReturnType = new GenericType<InventoryStorageActivity>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search inventoryStorageActivitys by filter
   * Returns the list of inventoryStorageActivitys that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<InventoryStorageActivity>
   * @throws ApiException if fails to make API call
   */
  public List<InventoryStorageActivity> getInventoryStorageActivityByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/inventoryStorageActivity/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<InventoryStorageActivity>> localVarReturnType = new GenericType<List<InventoryStorageActivity>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an inventoryStorageActivity by id
   * Returns the inventoryStorageActivity identified by the specified id.
   * @param inventoryStorageActivityId Id of the inventoryStorageActivity to be returned. (required)
   * @return InventoryStorageActivity
   * @throws ApiException if fails to make API call
   */
  public InventoryStorageActivity getInventoryStorageActivityById(Integer inventoryStorageActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventoryStorageActivityId' is set
    if (inventoryStorageActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryStorageActivityId' when calling getInventoryStorageActivityById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryStorageActivity/{inventoryStorageActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryStorageActivityId" + "\\}", apiClient.escapeString(inventoryStorageActivityId.toString()));

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

    
    GenericType<InventoryStorageActivity> localVarReturnType = new GenericType<InventoryStorageActivity>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an inventoryStorageActivity.
   * Get all existing inventoryStorageActivity tags.
   * @param inventoryStorageActivityId Id of the inventoryStorageActivity to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getInventoryStorageActivityTags(Integer inventoryStorageActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventoryStorageActivityId' is set
    if (inventoryStorageActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryStorageActivityId' when calling getInventoryStorageActivityTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryStorageActivity/{inventoryStorageActivityId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryStorageActivityId" + "\\}", apiClient.escapeString(inventoryStorageActivityId.toString()));

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
   * Update an inventoryStorageActivity
   * Updates an existing inventoryStorageActivity using the specified data.
   * @param body InventoryStorageActivity to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateInventoryStorageActivity(InventoryStorageActivity body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateInventoryStorageActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryStorageActivity".replaceAll("\\{format\\}","json");

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
