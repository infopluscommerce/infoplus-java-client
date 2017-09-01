package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.InventoryAdjustment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class InventoryAdjustmentApi {
  private ApiClient apiClient;

  public InventoryAdjustmentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InventoryAdjustmentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for an inventoryAdjustment
   * Adds an audit to an existing inventoryAdjustment.
   * @param inventoryAdjustmentId Id of the inventoryAdjustment to add an audit to (required)
   * @param inventoryAdjustmentAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addInventoryAdjustmentAudit(Integer inventoryAdjustmentId, String inventoryAdjustmentAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventoryAdjustmentId' is set
    if (inventoryAdjustmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryAdjustmentId' when calling addInventoryAdjustmentAudit");
    }
    
    // verify the required parameter 'inventoryAdjustmentAudit' is set
    if (inventoryAdjustmentAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryAdjustmentAudit' when calling addInventoryAdjustmentAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryAdjustment/{inventoryAdjustmentId}/audit/{inventoryAdjustmentAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryAdjustmentId" + "\\}", apiClient.escapeString(inventoryAdjustmentId.toString()))
      .replaceAll("\\{" + "inventoryAdjustmentAudit" + "\\}", apiClient.escapeString(inventoryAdjustmentAudit.toString()));

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
   * Add new tags for an inventoryAdjustment.
   * Adds a tag to an existing inventoryAdjustment.
   * @param inventoryAdjustmentId Id of the inventoryAdjustment to add a tag to (required)
   * @param inventoryAdjustmentTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addInventoryAdjustmentTag(Integer inventoryAdjustmentId, String inventoryAdjustmentTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventoryAdjustmentId' is set
    if (inventoryAdjustmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryAdjustmentId' when calling addInventoryAdjustmentTag");
    }
    
    // verify the required parameter 'inventoryAdjustmentTag' is set
    if (inventoryAdjustmentTag == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryAdjustmentTag' when calling addInventoryAdjustmentTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryAdjustment/{inventoryAdjustmentId}/tag/{inventoryAdjustmentTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryAdjustmentId" + "\\}", apiClient.escapeString(inventoryAdjustmentId.toString()))
      .replaceAll("\\{" + "inventoryAdjustmentTag" + "\\}", apiClient.escapeString(inventoryAdjustmentTag.toString()));

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
   * Delete a tag for an inventoryAdjustment.
   * Deletes an existing inventoryAdjustment tag using the specified data.
   * @param inventoryAdjustmentId Id of the inventoryAdjustment to remove tag from (required)
   * @param inventoryAdjustmentTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteInventoryAdjustmentTag(Integer inventoryAdjustmentId, String inventoryAdjustmentTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventoryAdjustmentId' is set
    if (inventoryAdjustmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryAdjustmentId' when calling deleteInventoryAdjustmentTag");
    }
    
    // verify the required parameter 'inventoryAdjustmentTag' is set
    if (inventoryAdjustmentTag == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryAdjustmentTag' when calling deleteInventoryAdjustmentTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryAdjustment/{inventoryAdjustmentId}/tag/{inventoryAdjustmentTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryAdjustmentId" + "\\}", apiClient.escapeString(inventoryAdjustmentId.toString()))
      .replaceAll("\\{" + "inventoryAdjustmentTag" + "\\}", apiClient.escapeString(inventoryAdjustmentTag.toString()));

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
   * Get a duplicated an inventoryAdjustment by id
   * Returns a duplicated inventoryAdjustment identified by the specified id.
   * @param inventoryAdjustmentId Id of the inventoryAdjustment to be duplicated. (required)
   * @return InventoryAdjustment
   * @throws ApiException if fails to make API call
   */
  public InventoryAdjustment getDuplicateInventoryAdjustmentById(Integer inventoryAdjustmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventoryAdjustmentId' is set
    if (inventoryAdjustmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryAdjustmentId' when calling getDuplicateInventoryAdjustmentById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryAdjustment/duplicate/{inventoryAdjustmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryAdjustmentId" + "\\}", apiClient.escapeString(inventoryAdjustmentId.toString()));

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

    
    GenericType<InventoryAdjustment> localVarReturnType = new GenericType<InventoryAdjustment>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search inventoryAdjustments by filter
   * Returns the list of inventoryAdjustments that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<InventoryAdjustment>
   * @throws ApiException if fails to make API call
   */
  public List<InventoryAdjustment> getInventoryAdjustmentByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/inventoryAdjustment/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<InventoryAdjustment>> localVarReturnType = new GenericType<List<InventoryAdjustment>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an inventoryAdjustment by id
   * Returns the inventoryAdjustment identified by the specified id.
   * @param inventoryAdjustmentId Id of the inventoryAdjustment to be returned. (required)
   * @return InventoryAdjustment
   * @throws ApiException if fails to make API call
   */
  public InventoryAdjustment getInventoryAdjustmentById(Integer inventoryAdjustmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventoryAdjustmentId' is set
    if (inventoryAdjustmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryAdjustmentId' when calling getInventoryAdjustmentById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryAdjustment/{inventoryAdjustmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryAdjustmentId" + "\\}", apiClient.escapeString(inventoryAdjustmentId.toString()));

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

    
    GenericType<InventoryAdjustment> localVarReturnType = new GenericType<InventoryAdjustment>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an inventoryAdjustment.
   * Get all existing inventoryAdjustment tags.
   * @param inventoryAdjustmentId Id of the inventoryAdjustment to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getInventoryAdjustmentTags(Integer inventoryAdjustmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventoryAdjustmentId' is set
    if (inventoryAdjustmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryAdjustmentId' when calling getInventoryAdjustmentTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryAdjustment/{inventoryAdjustmentId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryAdjustmentId" + "\\}", apiClient.escapeString(inventoryAdjustmentId.toString()));

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
   * Update an inventoryAdjustment custom fields
   * Updates an existing inventoryAdjustment custom fields using the specified data.
   * @param body InventoryAdjustment to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateInventoryAdjustmentCustomFields(InventoryAdjustment body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateInventoryAdjustmentCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryAdjustment/customFields".replaceAll("\\{format\\}","json");

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
