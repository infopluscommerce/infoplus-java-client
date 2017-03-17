package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.Aisle;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class AisleApi {
  private ApiClient apiClient;

  public AisleApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AisleApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an aisle
   * Inserts a new aisle using the specified data.
   * @param body Aisle to be inserted. (required)
   * @return Aisle
   * @throws ApiException if fails to make API call
   */
  public Aisle addAisle(Aisle body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addAisle");
    }
    
    // create path and map variables
    String localVarPath = "/beta/aisle".replaceAll("\\{format\\}","json");

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

    
    GenericType<Aisle> localVarReturnType = new GenericType<Aisle>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for an aisle
   * Adds an audit to an existing aisle.
   * @param aisleId Id of the aisle to add an audit to (required)
   * @param aisleAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addAisleAudit(Integer aisleId, String aisleAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'aisleId' is set
    if (aisleId == null) {
      throw new ApiException(400, "Missing the required parameter 'aisleId' when calling addAisleAudit");
    }
    
    // verify the required parameter 'aisleAudit' is set
    if (aisleAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'aisleAudit' when calling addAisleAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/aisle/{aisleId}/audit/{aisleAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "aisleId" + "\\}", apiClient.escapeString(aisleId.toString()))
      .replaceAll("\\{" + "aisleAudit" + "\\}", apiClient.escapeString(aisleAudit.toString()));

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
   * Add new tags for an aisle.
   * Adds a tag to an existing aisle.
   * @param aisleId Id of the aisle to add a tag to (required)
   * @param aisleTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addAisleTag(Integer aisleId, String aisleTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'aisleId' is set
    if (aisleId == null) {
      throw new ApiException(400, "Missing the required parameter 'aisleId' when calling addAisleTag");
    }
    
    // verify the required parameter 'aisleTag' is set
    if (aisleTag == null) {
      throw new ApiException(400, "Missing the required parameter 'aisleTag' when calling addAisleTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/aisle/{aisleId}/tag/{aisleTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "aisleId" + "\\}", apiClient.escapeString(aisleId.toString()))
      .replaceAll("\\{" + "aisleTag" + "\\}", apiClient.escapeString(aisleTag.toString()));

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
   * Delete an aisle
   * Deletes the aisle identified by the specified id.
   * @param aisleId Id of the aisle to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAisle(Integer aisleId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'aisleId' is set
    if (aisleId == null) {
      throw new ApiException(400, "Missing the required parameter 'aisleId' when calling deleteAisle");
    }
    
    // create path and map variables
    String localVarPath = "/beta/aisle/{aisleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "aisleId" + "\\}", apiClient.escapeString(aisleId.toString()));

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
   * Delete a tag for an aisle.
   * Deletes an existing aisle tag using the specified data.
   * @param aisleId Id of the aisle to remove tag from (required)
   * @param aisleTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAisleTag(Integer aisleId, String aisleTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'aisleId' is set
    if (aisleId == null) {
      throw new ApiException(400, "Missing the required parameter 'aisleId' when calling deleteAisleTag");
    }
    
    // verify the required parameter 'aisleTag' is set
    if (aisleTag == null) {
      throw new ApiException(400, "Missing the required parameter 'aisleTag' when calling deleteAisleTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/aisle/{aisleId}/tag/{aisleTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "aisleId" + "\\}", apiClient.escapeString(aisleId.toString()))
      .replaceAll("\\{" + "aisleTag" + "\\}", apiClient.escapeString(aisleTag.toString()));

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
   * Search aisles by filter
   * Returns the list of aisles that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<Aisle>
   * @throws ApiException if fails to make API call
   */
  public List<Aisle> getAisleByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/aisle/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Aisle>> localVarReturnType = new GenericType<List<Aisle>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an aisle by id
   * Returns the aisle identified by the specified id.
   * @param aisleId Id of the aisle to be returned. (required)
   * @return Aisle
   * @throws ApiException if fails to make API call
   */
  public Aisle getAisleById(Integer aisleId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'aisleId' is set
    if (aisleId == null) {
      throw new ApiException(400, "Missing the required parameter 'aisleId' when calling getAisleById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/aisle/{aisleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "aisleId" + "\\}", apiClient.escapeString(aisleId.toString()));

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

    
    GenericType<Aisle> localVarReturnType = new GenericType<Aisle>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an aisle.
   * Get all existing aisle tags.
   * @param aisleId Id of the aisle to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getAisleTags(Integer aisleId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'aisleId' is set
    if (aisleId == null) {
      throw new ApiException(400, "Missing the required parameter 'aisleId' when calling getAisleTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/aisle/{aisleId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "aisleId" + "\\}", apiClient.escapeString(aisleId.toString()));

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
   * Get a duplicated an aisle by id
   * Returns a duplicated aisle identified by the specified id.
   * @param aisleId Id of the aisle to be duplicated. (required)
   * @return Aisle
   * @throws ApiException if fails to make API call
   */
  public Aisle getDuplicateAisleById(Integer aisleId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'aisleId' is set
    if (aisleId == null) {
      throw new ApiException(400, "Missing the required parameter 'aisleId' when calling getDuplicateAisleById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/aisle/duplicate/{aisleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "aisleId" + "\\}", apiClient.escapeString(aisleId.toString()));

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

    
    GenericType<Aisle> localVarReturnType = new GenericType<Aisle>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update an aisle
   * Updates an existing aisle using the specified data.
   * @param body Aisle to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateAisle(Aisle body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateAisle");
    }
    
    // create path and map variables
    String localVarPath = "/beta/aisle".replaceAll("\\{format\\}","json");

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
   * Update an aisle custom fields
   * Updates an existing aisle custom fields using the specified data.
   * @param body Aisle to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateAisleCustomFields(Aisle body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateAisleCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/aisle/customFields".replaceAll("\\{format\\}","json");

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
