package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.InventorySnapshot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class InventorySnapshotApi {
  private ApiClient apiClient;

  public InventorySnapshotApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InventorySnapshotApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for an inventorySnapshot
   * Adds an audit to an existing inventorySnapshot.
   * @param inventorySnapshotId Id of the inventorySnapshot to add an audit to (required)
   * @param inventorySnapshotAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addInventorySnapshotAudit(Integer inventorySnapshotId, String inventorySnapshotAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventorySnapshotId' is set
    if (inventorySnapshotId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventorySnapshotId' when calling addInventorySnapshotAudit");
    }
    
    // verify the required parameter 'inventorySnapshotAudit' is set
    if (inventorySnapshotAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'inventorySnapshotAudit' when calling addInventorySnapshotAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventorySnapshot/{inventorySnapshotId}/audit/{inventorySnapshotAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventorySnapshotId" + "\\}", apiClient.escapeString(inventorySnapshotId.toString()))
      .replaceAll("\\{" + "inventorySnapshotAudit" + "\\}", apiClient.escapeString(inventorySnapshotAudit.toString()));

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
   * Add new tags for an inventorySnapshot.
   * Adds a tag to an existing inventorySnapshot.
   * @param inventorySnapshotId Id of the inventorySnapshot to add a tag to (required)
   * @param inventorySnapshotTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addInventorySnapshotTag(Integer inventorySnapshotId, String inventorySnapshotTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventorySnapshotId' is set
    if (inventorySnapshotId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventorySnapshotId' when calling addInventorySnapshotTag");
    }
    
    // verify the required parameter 'inventorySnapshotTag' is set
    if (inventorySnapshotTag == null) {
      throw new ApiException(400, "Missing the required parameter 'inventorySnapshotTag' when calling addInventorySnapshotTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventorySnapshot/{inventorySnapshotId}/tag/{inventorySnapshotTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventorySnapshotId" + "\\}", apiClient.escapeString(inventorySnapshotId.toString()))
      .replaceAll("\\{" + "inventorySnapshotTag" + "\\}", apiClient.escapeString(inventorySnapshotTag.toString()));

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
   * Delete a tag for an inventorySnapshot.
   * Deletes an existing inventorySnapshot tag using the specified data.
   * @param inventorySnapshotId Id of the inventorySnapshot to remove tag from (required)
   * @param inventorySnapshotTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteInventorySnapshotTag(Integer inventorySnapshotId, String inventorySnapshotTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventorySnapshotId' is set
    if (inventorySnapshotId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventorySnapshotId' when calling deleteInventorySnapshotTag");
    }
    
    // verify the required parameter 'inventorySnapshotTag' is set
    if (inventorySnapshotTag == null) {
      throw new ApiException(400, "Missing the required parameter 'inventorySnapshotTag' when calling deleteInventorySnapshotTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventorySnapshot/{inventorySnapshotId}/tag/{inventorySnapshotTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventorySnapshotId" + "\\}", apiClient.escapeString(inventorySnapshotId.toString()))
      .replaceAll("\\{" + "inventorySnapshotTag" + "\\}", apiClient.escapeString(inventorySnapshotTag.toString()));

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
   * Get a duplicated an inventorySnapshot by id
   * Returns a duplicated inventorySnapshot identified by the specified id.
   * @param inventorySnapshotId Id of the inventorySnapshot to be duplicated. (required)
   * @return InventorySnapshot
   * @throws ApiException if fails to make API call
   */
  public InventorySnapshot getDuplicateInventorySnapshotById(Integer inventorySnapshotId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventorySnapshotId' is set
    if (inventorySnapshotId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventorySnapshotId' when calling getDuplicateInventorySnapshotById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventorySnapshot/duplicate/{inventorySnapshotId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventorySnapshotId" + "\\}", apiClient.escapeString(inventorySnapshotId.toString()));

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

    
    GenericType<InventorySnapshot> localVarReturnType = new GenericType<InventorySnapshot>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search inventorySnapshots by filter
   * Returns the list of inventorySnapshots that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<InventorySnapshot>
   * @throws ApiException if fails to make API call
   */
  public List<InventorySnapshot> getInventorySnapshotByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/inventorySnapshot/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<InventorySnapshot>> localVarReturnType = new GenericType<List<InventorySnapshot>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an inventorySnapshot by id
   * Returns the inventorySnapshot identified by the specified id.
   * @param inventorySnapshotId Id of the inventorySnapshot to be returned. (required)
   * @return InventorySnapshot
   * @throws ApiException if fails to make API call
   */
  public InventorySnapshot getInventorySnapshotById(Integer inventorySnapshotId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventorySnapshotId' is set
    if (inventorySnapshotId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventorySnapshotId' when calling getInventorySnapshotById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventorySnapshot/{inventorySnapshotId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventorySnapshotId" + "\\}", apiClient.escapeString(inventorySnapshotId.toString()));

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

    
    GenericType<InventorySnapshot> localVarReturnType = new GenericType<InventorySnapshot>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an inventorySnapshot.
   * Get all existing inventorySnapshot tags.
   * @param inventorySnapshotId Id of the inventorySnapshot to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getInventorySnapshotTags(Integer inventorySnapshotId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventorySnapshotId' is set
    if (inventorySnapshotId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventorySnapshotId' when calling getInventorySnapshotTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventorySnapshot/{inventorySnapshotId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventorySnapshotId" + "\\}", apiClient.escapeString(inventorySnapshotId.toString()));

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
  
}
