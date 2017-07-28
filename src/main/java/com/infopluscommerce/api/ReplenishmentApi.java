package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.Replenishment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class ReplenishmentApi {
  private ApiClient apiClient;

  public ReplenishmentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReplenishmentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for a replenishment
   * Adds an audit to an existing replenishment.
   * @param replenishmentId Id of the replenishment to add an audit to (required)
   * @param replenishmentAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addReplenishmentAudit(Integer replenishmentId, String replenishmentAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replenishmentId' is set
    if (replenishmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentId' when calling addReplenishmentAudit");
    }
    
    // verify the required parameter 'replenishmentAudit' is set
    if (replenishmentAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentAudit' when calling addReplenishmentAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/replenishment/{replenishmentId}/audit/{replenishmentAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "replenishmentId" + "\\}", apiClient.escapeString(replenishmentId.toString()))
      .replaceAll("\\{" + "replenishmentAudit" + "\\}", apiClient.escapeString(replenishmentAudit.toString()));

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
   * Add new tags for a replenishment.
   * Adds a tag to an existing replenishment.
   * @param replenishmentId Id of the replenishment to add a tag to (required)
   * @param replenishmentTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addReplenishmentTag(Integer replenishmentId, String replenishmentTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replenishmentId' is set
    if (replenishmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentId' when calling addReplenishmentTag");
    }
    
    // verify the required parameter 'replenishmentTag' is set
    if (replenishmentTag == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentTag' when calling addReplenishmentTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/replenishment/{replenishmentId}/tag/{replenishmentTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "replenishmentId" + "\\}", apiClient.escapeString(replenishmentId.toString()))
      .replaceAll("\\{" + "replenishmentTag" + "\\}", apiClient.escapeString(replenishmentTag.toString()));

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
   * Delete a tag for a replenishment.
   * Deletes an existing replenishment tag using the specified data.
   * @param replenishmentId Id of the replenishment to remove tag from (required)
   * @param replenishmentTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteReplenishmentTag(Integer replenishmentId, String replenishmentTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replenishmentId' is set
    if (replenishmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentId' when calling deleteReplenishmentTag");
    }
    
    // verify the required parameter 'replenishmentTag' is set
    if (replenishmentTag == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentTag' when calling deleteReplenishmentTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/replenishment/{replenishmentId}/tag/{replenishmentTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "replenishmentId" + "\\}", apiClient.escapeString(replenishmentId.toString()))
      .replaceAll("\\{" + "replenishmentTag" + "\\}", apiClient.escapeString(replenishmentTag.toString()));

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
   * Get a duplicated a replenishment by id
   * Returns a duplicated replenishment identified by the specified id.
   * @param replenishmentId Id of the replenishment to be duplicated. (required)
   * @return Replenishment
   * @throws ApiException if fails to make API call
   */
  public Replenishment getDuplicateReplenishmentById(Integer replenishmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replenishmentId' is set
    if (replenishmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentId' when calling getDuplicateReplenishmentById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/replenishment/duplicate/{replenishmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "replenishmentId" + "\\}", apiClient.escapeString(replenishmentId.toString()));

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

    
    GenericType<Replenishment> localVarReturnType = new GenericType<Replenishment>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search replenishments by filter
   * Returns the list of replenishments that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<Replenishment>
   * @throws ApiException if fails to make API call
   */
  public List<Replenishment> getReplenishmentByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/replenishment/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Replenishment>> localVarReturnType = new GenericType<List<Replenishment>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a replenishment by id
   * Returns the replenishment identified by the specified id.
   * @param replenishmentId Id of the replenishment to be returned. (required)
   * @return Replenishment
   * @throws ApiException if fails to make API call
   */
  public Replenishment getReplenishmentById(Integer replenishmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replenishmentId' is set
    if (replenishmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentId' when calling getReplenishmentById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/replenishment/{replenishmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "replenishmentId" + "\\}", apiClient.escapeString(replenishmentId.toString()));

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

    
    GenericType<Replenishment> localVarReturnType = new GenericType<Replenishment>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a replenishment.
   * Get all existing replenishment tags.
   * @param replenishmentId Id of the replenishment to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getReplenishmentTags(Integer replenishmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replenishmentId' is set
    if (replenishmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentId' when calling getReplenishmentTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/replenishment/{replenishmentId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "replenishmentId" + "\\}", apiClient.escapeString(replenishmentId.toString()));

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
   * Update a replenishment custom fields
   * Updates an existing replenishment custom fields using the specified data.
   * @param body Replenishment to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateReplenishmentCustomFields(Replenishment body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateReplenishmentCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/replenishment/customFields".replaceAll("\\{format\\}","json");

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
