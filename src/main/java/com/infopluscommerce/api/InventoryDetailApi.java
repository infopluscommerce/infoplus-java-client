package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.InventoryDetail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class InventoryDetailApi {
  private ApiClient apiClient;

  public InventoryDetailApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InventoryDetailApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for an inventoryDetail
   * Adds an audit to an existing inventoryDetail.
   * @param inventoryDetailId Id of the inventoryDetail to add an audit to (required)
   * @param inventoryDetailAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addInventoryDetailAudit(Integer inventoryDetailId, String inventoryDetailAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventoryDetailId' is set
    if (inventoryDetailId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryDetailId' when calling addInventoryDetailAudit");
    }
    
    // verify the required parameter 'inventoryDetailAudit' is set
    if (inventoryDetailAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryDetailAudit' when calling addInventoryDetailAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryDetail/{inventoryDetailId}/audit/{inventoryDetailAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryDetailId" + "\\}", apiClient.escapeString(inventoryDetailId.toString()))
      .replaceAll("\\{" + "inventoryDetailAudit" + "\\}", apiClient.escapeString(inventoryDetailAudit.toString()));

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
   * Add new tags for an inventoryDetail.
   * Adds a tag to an existing inventoryDetail.
   * @param inventoryDetailId Id of the inventoryDetail to add a tag to (required)
   * @param inventoryDetailTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addInventoryDetailTag(Integer inventoryDetailId, String inventoryDetailTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventoryDetailId' is set
    if (inventoryDetailId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryDetailId' when calling addInventoryDetailTag");
    }
    
    // verify the required parameter 'inventoryDetailTag' is set
    if (inventoryDetailTag == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryDetailTag' when calling addInventoryDetailTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryDetail/{inventoryDetailId}/tag/{inventoryDetailTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryDetailId" + "\\}", apiClient.escapeString(inventoryDetailId.toString()))
      .replaceAll("\\{" + "inventoryDetailTag" + "\\}", apiClient.escapeString(inventoryDetailTag.toString()));

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
   * Delete a tag for an inventoryDetail.
   * Deletes an existing inventoryDetail tag using the specified data.
   * @param inventoryDetailId Id of the inventoryDetail to remove tag from (required)
   * @param inventoryDetailTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteInventoryDetailTag(Integer inventoryDetailId, String inventoryDetailTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventoryDetailId' is set
    if (inventoryDetailId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryDetailId' when calling deleteInventoryDetailTag");
    }
    
    // verify the required parameter 'inventoryDetailTag' is set
    if (inventoryDetailTag == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryDetailTag' when calling deleteInventoryDetailTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryDetail/{inventoryDetailId}/tag/{inventoryDetailTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryDetailId" + "\\}", apiClient.escapeString(inventoryDetailId.toString()))
      .replaceAll("\\{" + "inventoryDetailTag" + "\\}", apiClient.escapeString(inventoryDetailTag.toString()));

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
   * Get a duplicated an inventoryDetail by id
   * Returns a duplicated inventoryDetail identified by the specified id.
   * @param inventoryDetailId Id of the inventoryDetail to be duplicated. (required)
   * @return InventoryDetail
   * @throws ApiException if fails to make API call
   */
  public InventoryDetail getDuplicateInventoryDetailById(Integer inventoryDetailId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventoryDetailId' is set
    if (inventoryDetailId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryDetailId' when calling getDuplicateInventoryDetailById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryDetail/duplicate/{inventoryDetailId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryDetailId" + "\\}", apiClient.escapeString(inventoryDetailId.toString()));

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

    
    GenericType<InventoryDetail> localVarReturnType = new GenericType<InventoryDetail>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search inventoryDetails by filter
   * Returns the list of inventoryDetails that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<InventoryDetail>
   * @throws ApiException if fails to make API call
   */
  public List<InventoryDetail> getInventoryDetailByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/inventoryDetail/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<InventoryDetail>> localVarReturnType = new GenericType<List<InventoryDetail>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an inventoryDetail by id
   * Returns the inventoryDetail identified by the specified id.
   * @param inventoryDetailId Id of the inventoryDetail to be returned. (required)
   * @return InventoryDetail
   * @throws ApiException if fails to make API call
   */
  public InventoryDetail getInventoryDetailById(Integer inventoryDetailId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventoryDetailId' is set
    if (inventoryDetailId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryDetailId' when calling getInventoryDetailById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryDetail/{inventoryDetailId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryDetailId" + "\\}", apiClient.escapeString(inventoryDetailId.toString()));

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

    
    GenericType<InventoryDetail> localVarReturnType = new GenericType<InventoryDetail>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an inventoryDetail.
   * Get all existing inventoryDetail tags.
   * @param inventoryDetailId Id of the inventoryDetail to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getInventoryDetailTags(Integer inventoryDetailId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'inventoryDetailId' is set
    if (inventoryDetailId == null) {
      throw new ApiException(400, "Missing the required parameter 'inventoryDetailId' when calling getInventoryDetailTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryDetail/{inventoryDetailId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryDetailId" + "\\}", apiClient.escapeString(inventoryDetailId.toString()));

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
   * Update an inventoryDetail custom fields
   * Updates an existing inventoryDetail custom fields using the specified data.
   * @param body InventoryDetail to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateInventoryDetailCustomFields(InventoryDetail body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateInventoryDetailCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/inventoryDetail/customFields".replaceAll("\\{format\\}","json");

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
