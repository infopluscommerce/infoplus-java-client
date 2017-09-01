package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.PerpetualInventoryLog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class PerpetualInventoryLogApi {
  private ApiClient apiClient;

  public PerpetualInventoryLogApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PerpetualInventoryLogApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for a perpetualInventoryLog
   * Adds an audit to an existing perpetualInventoryLog.
   * @param perpetualInventoryLogId Id of the perpetualInventoryLog to add an audit to (required)
   * @param perpetualInventoryLogAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addPerpetualInventoryLogAudit(Integer perpetualInventoryLogId, String perpetualInventoryLogAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'perpetualInventoryLogId' is set
    if (perpetualInventoryLogId == null) {
      throw new ApiException(400, "Missing the required parameter 'perpetualInventoryLogId' when calling addPerpetualInventoryLogAudit");
    }
    
    // verify the required parameter 'perpetualInventoryLogAudit' is set
    if (perpetualInventoryLogAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'perpetualInventoryLogAudit' when calling addPerpetualInventoryLogAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/perpetualInventoryLog/{perpetualInventoryLogId}/audit/{perpetualInventoryLogAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "perpetualInventoryLogId" + "\\}", apiClient.escapeString(perpetualInventoryLogId.toString()))
      .replaceAll("\\{" + "perpetualInventoryLogAudit" + "\\}", apiClient.escapeString(perpetualInventoryLogAudit.toString()));

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
   * Add new tags for a perpetualInventoryLog.
   * Adds a tag to an existing perpetualInventoryLog.
   * @param perpetualInventoryLogId Id of the perpetualInventoryLog to add a tag to (required)
   * @param perpetualInventoryLogTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addPerpetualInventoryLogTag(Integer perpetualInventoryLogId, String perpetualInventoryLogTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'perpetualInventoryLogId' is set
    if (perpetualInventoryLogId == null) {
      throw new ApiException(400, "Missing the required parameter 'perpetualInventoryLogId' when calling addPerpetualInventoryLogTag");
    }
    
    // verify the required parameter 'perpetualInventoryLogTag' is set
    if (perpetualInventoryLogTag == null) {
      throw new ApiException(400, "Missing the required parameter 'perpetualInventoryLogTag' when calling addPerpetualInventoryLogTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/perpetualInventoryLog/{perpetualInventoryLogId}/tag/{perpetualInventoryLogTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "perpetualInventoryLogId" + "\\}", apiClient.escapeString(perpetualInventoryLogId.toString()))
      .replaceAll("\\{" + "perpetualInventoryLogTag" + "\\}", apiClient.escapeString(perpetualInventoryLogTag.toString()));

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
   * Delete a tag for a perpetualInventoryLog.
   * Deletes an existing perpetualInventoryLog tag using the specified data.
   * @param perpetualInventoryLogId Id of the perpetualInventoryLog to remove tag from (required)
   * @param perpetualInventoryLogTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deletePerpetualInventoryLogTag(Integer perpetualInventoryLogId, String perpetualInventoryLogTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'perpetualInventoryLogId' is set
    if (perpetualInventoryLogId == null) {
      throw new ApiException(400, "Missing the required parameter 'perpetualInventoryLogId' when calling deletePerpetualInventoryLogTag");
    }
    
    // verify the required parameter 'perpetualInventoryLogTag' is set
    if (perpetualInventoryLogTag == null) {
      throw new ApiException(400, "Missing the required parameter 'perpetualInventoryLogTag' when calling deletePerpetualInventoryLogTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/perpetualInventoryLog/{perpetualInventoryLogId}/tag/{perpetualInventoryLogTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "perpetualInventoryLogId" + "\\}", apiClient.escapeString(perpetualInventoryLogId.toString()))
      .replaceAll("\\{" + "perpetualInventoryLogTag" + "\\}", apiClient.escapeString(perpetualInventoryLogTag.toString()));

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
   * Get a duplicated a perpetualInventoryLog by id
   * Returns a duplicated perpetualInventoryLog identified by the specified id.
   * @param perpetualInventoryLogId Id of the perpetualInventoryLog to be duplicated. (required)
   * @return PerpetualInventoryLog
   * @throws ApiException if fails to make API call
   */
  public PerpetualInventoryLog getDuplicatePerpetualInventoryLogById(Integer perpetualInventoryLogId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'perpetualInventoryLogId' is set
    if (perpetualInventoryLogId == null) {
      throw new ApiException(400, "Missing the required parameter 'perpetualInventoryLogId' when calling getDuplicatePerpetualInventoryLogById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/perpetualInventoryLog/duplicate/{perpetualInventoryLogId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "perpetualInventoryLogId" + "\\}", apiClient.escapeString(perpetualInventoryLogId.toString()));

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

    
    GenericType<PerpetualInventoryLog> localVarReturnType = new GenericType<PerpetualInventoryLog>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search perpetualInventoryLogs by filter
   * Returns the list of perpetualInventoryLogs that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<PerpetualInventoryLog>
   * @throws ApiException if fails to make API call
   */
  public List<PerpetualInventoryLog> getPerpetualInventoryLogByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/perpetualInventoryLog/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<PerpetualInventoryLog>> localVarReturnType = new GenericType<List<PerpetualInventoryLog>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a perpetualInventoryLog by id
   * Returns the perpetualInventoryLog identified by the specified id.
   * @param perpetualInventoryLogId Id of the perpetualInventoryLog to be returned. (required)
   * @return PerpetualInventoryLog
   * @throws ApiException if fails to make API call
   */
  public PerpetualInventoryLog getPerpetualInventoryLogById(Integer perpetualInventoryLogId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'perpetualInventoryLogId' is set
    if (perpetualInventoryLogId == null) {
      throw new ApiException(400, "Missing the required parameter 'perpetualInventoryLogId' when calling getPerpetualInventoryLogById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/perpetualInventoryLog/{perpetualInventoryLogId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "perpetualInventoryLogId" + "\\}", apiClient.escapeString(perpetualInventoryLogId.toString()));

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

    
    GenericType<PerpetualInventoryLog> localVarReturnType = new GenericType<PerpetualInventoryLog>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a perpetualInventoryLog.
   * Get all existing perpetualInventoryLog tags.
   * @param perpetualInventoryLogId Id of the perpetualInventoryLog to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getPerpetualInventoryLogTags(Integer perpetualInventoryLogId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'perpetualInventoryLogId' is set
    if (perpetualInventoryLogId == null) {
      throw new ApiException(400, "Missing the required parameter 'perpetualInventoryLogId' when calling getPerpetualInventoryLogTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/perpetualInventoryLog/{perpetualInventoryLogId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "perpetualInventoryLogId" + "\\}", apiClient.escapeString(perpetualInventoryLogId.toString()));

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
