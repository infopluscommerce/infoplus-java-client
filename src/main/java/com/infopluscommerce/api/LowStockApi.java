package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.LowStock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class LowStockApi {
  private ApiClient apiClient;

  public LowStockApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LowStockApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for a lowStock
   * Adds an audit to an existing lowStock.
   * @param lowStockId Id of the lowStock to add an audit to (required)
   * @param lowStockAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addLowStockAudit(Integer lowStockId, String lowStockAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'lowStockId' is set
    if (lowStockId == null) {
      throw new ApiException(400, "Missing the required parameter 'lowStockId' when calling addLowStockAudit");
    }
    
    // verify the required parameter 'lowStockAudit' is set
    if (lowStockAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'lowStockAudit' when calling addLowStockAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/lowStock/{lowStockId}/audit/{lowStockAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "lowStockId" + "\\}", apiClient.escapeString(lowStockId.toString()))
      .replaceAll("\\{" + "lowStockAudit" + "\\}", apiClient.escapeString(lowStockAudit.toString()));

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
   * Add new tags for a lowStock.
   * Adds a tag to an existing lowStock.
   * @param lowStockId Id of the lowStock to add a tag to (required)
   * @param lowStockTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addLowStockTag(Integer lowStockId, String lowStockTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'lowStockId' is set
    if (lowStockId == null) {
      throw new ApiException(400, "Missing the required parameter 'lowStockId' when calling addLowStockTag");
    }
    
    // verify the required parameter 'lowStockTag' is set
    if (lowStockTag == null) {
      throw new ApiException(400, "Missing the required parameter 'lowStockTag' when calling addLowStockTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/lowStock/{lowStockId}/tag/{lowStockTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "lowStockId" + "\\}", apiClient.escapeString(lowStockId.toString()))
      .replaceAll("\\{" + "lowStockTag" + "\\}", apiClient.escapeString(lowStockTag.toString()));

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
   * Delete a tag for a lowStock.
   * Deletes an existing lowStock tag using the specified data.
   * @param lowStockId Id of the lowStock to remove tag from (required)
   * @param lowStockTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLowStockTag(Integer lowStockId, String lowStockTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'lowStockId' is set
    if (lowStockId == null) {
      throw new ApiException(400, "Missing the required parameter 'lowStockId' when calling deleteLowStockTag");
    }
    
    // verify the required parameter 'lowStockTag' is set
    if (lowStockTag == null) {
      throw new ApiException(400, "Missing the required parameter 'lowStockTag' when calling deleteLowStockTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/lowStock/{lowStockId}/tag/{lowStockTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "lowStockId" + "\\}", apiClient.escapeString(lowStockId.toString()))
      .replaceAll("\\{" + "lowStockTag" + "\\}", apiClient.escapeString(lowStockTag.toString()));

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
   * Get a duplicated a lowStock by id
   * Returns a duplicated lowStock identified by the specified id.
   * @param lowStockId Id of the lowStock to be duplicated. (required)
   * @return LowStock
   * @throws ApiException if fails to make API call
   */
  public LowStock getDuplicateLowStockById(Integer lowStockId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'lowStockId' is set
    if (lowStockId == null) {
      throw new ApiException(400, "Missing the required parameter 'lowStockId' when calling getDuplicateLowStockById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/lowStock/duplicate/{lowStockId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "lowStockId" + "\\}", apiClient.escapeString(lowStockId.toString()));

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

    
    GenericType<LowStock> localVarReturnType = new GenericType<LowStock>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search lowStocks by filter
   * Returns the list of lowStocks that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<LowStock>
   * @throws ApiException if fails to make API call
   */
  public List<LowStock> getLowStockByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/lowStock/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<LowStock>> localVarReturnType = new GenericType<List<LowStock>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a lowStock by id
   * Returns the lowStock identified by the specified id.
   * @param lowStockId Id of the lowStock to be returned. (required)
   * @return LowStock
   * @throws ApiException if fails to make API call
   */
  public LowStock getLowStockById(Integer lowStockId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'lowStockId' is set
    if (lowStockId == null) {
      throw new ApiException(400, "Missing the required parameter 'lowStockId' when calling getLowStockById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/lowStock/{lowStockId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "lowStockId" + "\\}", apiClient.escapeString(lowStockId.toString()));

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

    
    GenericType<LowStock> localVarReturnType = new GenericType<LowStock>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a lowStock.
   * Get all existing lowStock tags.
   * @param lowStockId Id of the lowStock to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getLowStockTags(Integer lowStockId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'lowStockId' is set
    if (lowStockId == null) {
      throw new ApiException(400, "Missing the required parameter 'lowStockId' when calling getLowStockTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/lowStock/{lowStockId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "lowStockId" + "\\}", apiClient.escapeString(lowStockId.toString()));

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
