package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.WarehouseDocument;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class WarehouseDocumentApi {
  private ApiClient apiClient;

  public WarehouseDocumentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WarehouseDocumentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for a warehouseDocument
   * Adds an audit to an existing warehouseDocument.
   * @param warehouseDocumentId Id of the warehouseDocument to add an audit to (required)
   * @param warehouseDocumentAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addWarehouseDocumentAudit(Integer warehouseDocumentId, String warehouseDocumentAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'warehouseDocumentId' is set
    if (warehouseDocumentId == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseDocumentId' when calling addWarehouseDocumentAudit");
    }
    
    // verify the required parameter 'warehouseDocumentAudit' is set
    if (warehouseDocumentAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseDocumentAudit' when calling addWarehouseDocumentAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouseDocument/{warehouseDocumentId}/audit/{warehouseDocumentAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "warehouseDocumentId" + "\\}", apiClient.escapeString(warehouseDocumentId.toString()))
      .replaceAll("\\{" + "warehouseDocumentAudit" + "\\}", apiClient.escapeString(warehouseDocumentAudit.toString()));

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
   * Add new tags for a warehouseDocument.
   * Adds a tag to an existing warehouseDocument.
   * @param warehouseDocumentId Id of the warehouseDocument to add a tag to (required)
   * @param warehouseDocumentTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addWarehouseDocumentTag(Integer warehouseDocumentId, String warehouseDocumentTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'warehouseDocumentId' is set
    if (warehouseDocumentId == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseDocumentId' when calling addWarehouseDocumentTag");
    }
    
    // verify the required parameter 'warehouseDocumentTag' is set
    if (warehouseDocumentTag == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseDocumentTag' when calling addWarehouseDocumentTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouseDocument/{warehouseDocumentId}/tag/{warehouseDocumentTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "warehouseDocumentId" + "\\}", apiClient.escapeString(warehouseDocumentId.toString()))
      .replaceAll("\\{" + "warehouseDocumentTag" + "\\}", apiClient.escapeString(warehouseDocumentTag.toString()));

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
   * Delete a tag for a warehouseDocument.
   * Deletes an existing warehouseDocument tag using the specified data.
   * @param warehouseDocumentId Id of the warehouseDocument to remove tag from (required)
   * @param warehouseDocumentTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteWarehouseDocumentTag(Integer warehouseDocumentId, String warehouseDocumentTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'warehouseDocumentId' is set
    if (warehouseDocumentId == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseDocumentId' when calling deleteWarehouseDocumentTag");
    }
    
    // verify the required parameter 'warehouseDocumentTag' is set
    if (warehouseDocumentTag == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseDocumentTag' when calling deleteWarehouseDocumentTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouseDocument/{warehouseDocumentId}/tag/{warehouseDocumentTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "warehouseDocumentId" + "\\}", apiClient.escapeString(warehouseDocumentId.toString()))
      .replaceAll("\\{" + "warehouseDocumentTag" + "\\}", apiClient.escapeString(warehouseDocumentTag.toString()));

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
   * Get a duplicated a warehouseDocument by id
   * Returns a duplicated warehouseDocument identified by the specified id.
   * @param warehouseDocumentId Id of the warehouseDocument to be duplicated. (required)
   * @return WarehouseDocument
   * @throws ApiException if fails to make API call
   */
  public WarehouseDocument getDuplicateWarehouseDocumentById(Integer warehouseDocumentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'warehouseDocumentId' is set
    if (warehouseDocumentId == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseDocumentId' when calling getDuplicateWarehouseDocumentById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouseDocument/duplicate/{warehouseDocumentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "warehouseDocumentId" + "\\}", apiClient.escapeString(warehouseDocumentId.toString()));

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

    
    GenericType<WarehouseDocument> localVarReturnType = new GenericType<WarehouseDocument>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search warehouseDocuments by filter
   * Returns the list of warehouseDocuments that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<WarehouseDocument>
   * @throws ApiException if fails to make API call
   */
  public List<WarehouseDocument> getWarehouseDocumentByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/warehouseDocument/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<WarehouseDocument>> localVarReturnType = new GenericType<List<WarehouseDocument>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a warehouseDocument by id
   * Returns the warehouseDocument identified by the specified id.
   * @param warehouseDocumentId Id of the warehouseDocument to be returned. (required)
   * @return WarehouseDocument
   * @throws ApiException if fails to make API call
   */
  public WarehouseDocument getWarehouseDocumentById(Integer warehouseDocumentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'warehouseDocumentId' is set
    if (warehouseDocumentId == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseDocumentId' when calling getWarehouseDocumentById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouseDocument/{warehouseDocumentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "warehouseDocumentId" + "\\}", apiClient.escapeString(warehouseDocumentId.toString()));

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

    
    GenericType<WarehouseDocument> localVarReturnType = new GenericType<WarehouseDocument>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a warehouseDocument.
   * Get all existing warehouseDocument tags.
   * @param warehouseDocumentId Id of the warehouseDocument to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getWarehouseDocumentTags(Integer warehouseDocumentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'warehouseDocumentId' is set
    if (warehouseDocumentId == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseDocumentId' when calling getWarehouseDocumentTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouseDocument/{warehouseDocumentId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "warehouseDocumentId" + "\\}", apiClient.escapeString(warehouseDocumentId.toString()));

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
   * Update a warehouseDocument custom fields
   * Updates an existing warehouseDocument custom fields using the specified data.
   * @param body WarehouseDocument to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateWarehouseDocumentCustomFields(WarehouseDocument body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateWarehouseDocumentCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouseDocument/customFields".replaceAll("\\{format\\}","json");

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
