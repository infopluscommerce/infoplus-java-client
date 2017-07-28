package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.Supplement;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class SupplementApi {
  private ApiClient apiClient;

  public SupplementApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SupplementApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a supplement
   * Inserts a new supplement using the specified data.
   * @param body Supplement to be inserted. (required)
   * @return Supplement
   * @throws ApiException if fails to make API call
   */
  public Supplement addSupplement(Supplement body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addSupplement");
    }
    
    // create path and map variables
    String localVarPath = "/beta/supplement".replaceAll("\\{format\\}","json");

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

    
    GenericType<Supplement> localVarReturnType = new GenericType<Supplement>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a supplement
   * Adds an audit to an existing supplement.
   * @param supplementId Id of the supplement to add an audit to (required)
   * @param supplementAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addSupplementAudit(Integer supplementId, String supplementAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'supplementId' is set
    if (supplementId == null) {
      throw new ApiException(400, "Missing the required parameter 'supplementId' when calling addSupplementAudit");
    }
    
    // verify the required parameter 'supplementAudit' is set
    if (supplementAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'supplementAudit' when calling addSupplementAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/supplement/{supplementId}/audit/{supplementAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "supplementId" + "\\}", apiClient.escapeString(supplementId.toString()))
      .replaceAll("\\{" + "supplementAudit" + "\\}", apiClient.escapeString(supplementAudit.toString()));

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
   * Add new tags for a supplement.
   * Adds a tag to an existing supplement.
   * @param supplementId Id of the supplement to add a tag to (required)
   * @param supplementTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addSupplementTag(Integer supplementId, String supplementTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'supplementId' is set
    if (supplementId == null) {
      throw new ApiException(400, "Missing the required parameter 'supplementId' when calling addSupplementTag");
    }
    
    // verify the required parameter 'supplementTag' is set
    if (supplementTag == null) {
      throw new ApiException(400, "Missing the required parameter 'supplementTag' when calling addSupplementTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/supplement/{supplementId}/tag/{supplementTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "supplementId" + "\\}", apiClient.escapeString(supplementId.toString()))
      .replaceAll("\\{" + "supplementTag" + "\\}", apiClient.escapeString(supplementTag.toString()));

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
   * Delete a supplement
   * Deletes the supplement identified by the specified id.
   * @param supplementId Id of the supplement to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSupplement(Integer supplementId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'supplementId' is set
    if (supplementId == null) {
      throw new ApiException(400, "Missing the required parameter 'supplementId' when calling deleteSupplement");
    }
    
    // create path and map variables
    String localVarPath = "/beta/supplement/{supplementId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "supplementId" + "\\}", apiClient.escapeString(supplementId.toString()));

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
   * Delete a tag for a supplement.
   * Deletes an existing supplement tag using the specified data.
   * @param supplementId Id of the supplement to remove tag from (required)
   * @param supplementTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSupplementTag(Integer supplementId, String supplementTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'supplementId' is set
    if (supplementId == null) {
      throw new ApiException(400, "Missing the required parameter 'supplementId' when calling deleteSupplementTag");
    }
    
    // verify the required parameter 'supplementTag' is set
    if (supplementTag == null) {
      throw new ApiException(400, "Missing the required parameter 'supplementTag' when calling deleteSupplementTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/supplement/{supplementId}/tag/{supplementTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "supplementId" + "\\}", apiClient.escapeString(supplementId.toString()))
      .replaceAll("\\{" + "supplementTag" + "\\}", apiClient.escapeString(supplementTag.toString()));

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
   * Get a duplicated a supplement by id
   * Returns a duplicated supplement identified by the specified id.
   * @param supplementId Id of the supplement to be duplicated. (required)
   * @return Supplement
   * @throws ApiException if fails to make API call
   */
  public Supplement getDuplicateSupplementById(Integer supplementId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'supplementId' is set
    if (supplementId == null) {
      throw new ApiException(400, "Missing the required parameter 'supplementId' when calling getDuplicateSupplementById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/supplement/duplicate/{supplementId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "supplementId" + "\\}", apiClient.escapeString(supplementId.toString()));

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

    
    GenericType<Supplement> localVarReturnType = new GenericType<Supplement>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search supplements by filter
   * Returns the list of supplements that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<Supplement>
   * @throws ApiException if fails to make API call
   */
  public List<Supplement> getSupplementByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/supplement/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Supplement>> localVarReturnType = new GenericType<List<Supplement>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a supplement by id
   * Returns the supplement identified by the specified id.
   * @param supplementId Id of the supplement to be returned. (required)
   * @return Supplement
   * @throws ApiException if fails to make API call
   */
  public Supplement getSupplementById(Integer supplementId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'supplementId' is set
    if (supplementId == null) {
      throw new ApiException(400, "Missing the required parameter 'supplementId' when calling getSupplementById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/supplement/{supplementId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "supplementId" + "\\}", apiClient.escapeString(supplementId.toString()));

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

    
    GenericType<Supplement> localVarReturnType = new GenericType<Supplement>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a supplement.
   * Get all existing supplement tags.
   * @param supplementId Id of the supplement to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getSupplementTags(Integer supplementId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'supplementId' is set
    if (supplementId == null) {
      throw new ApiException(400, "Missing the required parameter 'supplementId' when calling getSupplementTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/supplement/{supplementId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "supplementId" + "\\}", apiClient.escapeString(supplementId.toString()));

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
   * Update a supplement
   * Updates an existing supplement using the specified data.
   * @param body Supplement to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateSupplement(Supplement body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateSupplement");
    }
    
    // create path and map variables
    String localVarPath = "/beta/supplement".replaceAll("\\{format\\}","json");

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
   * Update a supplement custom fields
   * Updates an existing supplement custom fields using the specified data.
   * @param body Supplement to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateSupplementCustomFields(Supplement body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateSupplementCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/supplement/customFields".replaceAll("\\{format\\}","json");

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
