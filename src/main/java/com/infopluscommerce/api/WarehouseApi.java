package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.Warehouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class WarehouseApi {
  private ApiClient apiClient;

  public WarehouseApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WarehouseApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for a warehouse
   * Adds an audit to an existing warehouse.
   * @param warehouseId Id of the warehouse to add an audit to (required)
   * @param warehouseAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addWarehouseAudit(Integer warehouseId, String warehouseAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'warehouseId' is set
    if (warehouseId == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseId' when calling addWarehouseAudit");
    }
    
    // verify the required parameter 'warehouseAudit' is set
    if (warehouseAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseAudit' when calling addWarehouseAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouse/{warehouseId}/audit/{warehouseAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "warehouseId" + "\\}", apiClient.escapeString(warehouseId.toString()))
      .replaceAll("\\{" + "warehouseAudit" + "\\}", apiClient.escapeString(warehouseAudit.toString()));

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
   * Add new tags for a warehouse.
   * Adds a tag to an existing warehouse.
   * @param warehouseId Id of the warehouse to add a tag to (required)
   * @param warehouseTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addWarehouseTag(Integer warehouseId, String warehouseTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'warehouseId' is set
    if (warehouseId == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseId' when calling addWarehouseTag");
    }
    
    // verify the required parameter 'warehouseTag' is set
    if (warehouseTag == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseTag' when calling addWarehouseTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouse/{warehouseId}/tag/{warehouseTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "warehouseId" + "\\}", apiClient.escapeString(warehouseId.toString()))
      .replaceAll("\\{" + "warehouseTag" + "\\}", apiClient.escapeString(warehouseTag.toString()));

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
   * Delete a tag for a warehouse.
   * Deletes an existing warehouse tag using the specified data.
   * @param warehouseId Id of the warehouse to remove tag from (required)
   * @param warehouseTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteWarehouseTag(Integer warehouseId, String warehouseTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'warehouseId' is set
    if (warehouseId == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseId' when calling deleteWarehouseTag");
    }
    
    // verify the required parameter 'warehouseTag' is set
    if (warehouseTag == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseTag' when calling deleteWarehouseTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouse/{warehouseId}/tag/{warehouseTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "warehouseId" + "\\}", apiClient.escapeString(warehouseId.toString()))
      .replaceAll("\\{" + "warehouseTag" + "\\}", apiClient.escapeString(warehouseTag.toString()));

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
   * Get a duplicated a warehouse by id
   * Returns a duplicated warehouse identified by the specified id.
   * @param warehouseId Id of the warehouse to be duplicated. (required)
   * @return Warehouse
   * @throws ApiException if fails to make API call
   */
  public Warehouse getDuplicateWarehouseById(Integer warehouseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'warehouseId' is set
    if (warehouseId == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseId' when calling getDuplicateWarehouseById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouse/duplicate/{warehouseId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "warehouseId" + "\\}", apiClient.escapeString(warehouseId.toString()));

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

    
    GenericType<Warehouse> localVarReturnType = new GenericType<Warehouse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search warehouses by filter
   * Returns the list of warehouses that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<Warehouse>
   * @throws ApiException if fails to make API call
   */
  public List<Warehouse> getWarehouseByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/warehouse/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Warehouse>> localVarReturnType = new GenericType<List<Warehouse>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a warehouse by id
   * Returns the warehouse identified by the specified id.
   * @param warehouseId Id of the warehouse to be returned. (required)
   * @return Warehouse
   * @throws ApiException if fails to make API call
   */
  public Warehouse getWarehouseById(Integer warehouseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'warehouseId' is set
    if (warehouseId == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseId' when calling getWarehouseById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouse/{warehouseId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "warehouseId" + "\\}", apiClient.escapeString(warehouseId.toString()));

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

    
    GenericType<Warehouse> localVarReturnType = new GenericType<Warehouse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a warehouse.
   * Get all existing warehouse tags.
   * @param warehouseId Id of the warehouse to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getWarehouseTags(Integer warehouseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'warehouseId' is set
    if (warehouseId == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseId' when calling getWarehouseTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouse/{warehouseId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "warehouseId" + "\\}", apiClient.escapeString(warehouseId.toString()));

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
   * Update a warehouse
   * Updates an existing warehouse using the specified data.
   * @param body Warehouse to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateWarehouse(Warehouse body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateWarehouse");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouse".replaceAll("\\{format\\}","json");

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
   * Update a warehouse custom fields
   * Updates an existing warehouse custom fields using the specified data.
   * @param body Warehouse to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateWarehouseCustomFields(Warehouse body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateWarehouseCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouse/customFields".replaceAll("\\{format\\}","json");

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
