package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.OverrideReturnAddress;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class OverrideReturnAddressApi {
  private ApiClient apiClient;

  public OverrideReturnAddressApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OverrideReturnAddressApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an overrideReturnAddress
   * Inserts a new overrideReturnAddress using the specified data.
   * @param body OverrideReturnAddress to be inserted. (required)
   * @return OverrideReturnAddress
   * @throws ApiException if fails to make API call
   */
  public OverrideReturnAddress addOverrideReturnAddress(OverrideReturnAddress body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addOverrideReturnAddress");
    }
    
    // create path and map variables
    String localVarPath = "/beta/overrideReturnAddress".replaceAll("\\{format\\}","json");

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

    
    GenericType<OverrideReturnAddress> localVarReturnType = new GenericType<OverrideReturnAddress>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for an overrideReturnAddress
   * Adds an audit to an existing overrideReturnAddress.
   * @param overrideReturnAddressId Id of the overrideReturnAddress to add an audit to (required)
   * @param overrideReturnAddressAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addOverrideReturnAddressAudit(Integer overrideReturnAddressId, String overrideReturnAddressAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'overrideReturnAddressId' is set
    if (overrideReturnAddressId == null) {
      throw new ApiException(400, "Missing the required parameter 'overrideReturnAddressId' when calling addOverrideReturnAddressAudit");
    }
    
    // verify the required parameter 'overrideReturnAddressAudit' is set
    if (overrideReturnAddressAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'overrideReturnAddressAudit' when calling addOverrideReturnAddressAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/overrideReturnAddress/{overrideReturnAddressId}/audit/{overrideReturnAddressAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "overrideReturnAddressId" + "\\}", apiClient.escapeString(overrideReturnAddressId.toString()))
      .replaceAll("\\{" + "overrideReturnAddressAudit" + "\\}", apiClient.escapeString(overrideReturnAddressAudit.toString()));

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
   * Add new tags for an overrideReturnAddress.
   * Adds a tag to an existing overrideReturnAddress.
   * @param overrideReturnAddressId Id of the overrideReturnAddress to add a tag to (required)
   * @param overrideReturnAddressTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addOverrideReturnAddressTag(Integer overrideReturnAddressId, String overrideReturnAddressTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'overrideReturnAddressId' is set
    if (overrideReturnAddressId == null) {
      throw new ApiException(400, "Missing the required parameter 'overrideReturnAddressId' when calling addOverrideReturnAddressTag");
    }
    
    // verify the required parameter 'overrideReturnAddressTag' is set
    if (overrideReturnAddressTag == null) {
      throw new ApiException(400, "Missing the required parameter 'overrideReturnAddressTag' when calling addOverrideReturnAddressTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/overrideReturnAddress/{overrideReturnAddressId}/tag/{overrideReturnAddressTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "overrideReturnAddressId" + "\\}", apiClient.escapeString(overrideReturnAddressId.toString()))
      .replaceAll("\\{" + "overrideReturnAddressTag" + "\\}", apiClient.escapeString(overrideReturnAddressTag.toString()));

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
   * Delete an overrideReturnAddress
   * Deletes the overrideReturnAddress identified by the specified id.
   * @param overrideReturnAddressId Id of the overrideReturnAddress to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOverrideReturnAddress(Integer overrideReturnAddressId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'overrideReturnAddressId' is set
    if (overrideReturnAddressId == null) {
      throw new ApiException(400, "Missing the required parameter 'overrideReturnAddressId' when calling deleteOverrideReturnAddress");
    }
    
    // create path and map variables
    String localVarPath = "/beta/overrideReturnAddress/{overrideReturnAddressId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "overrideReturnAddressId" + "\\}", apiClient.escapeString(overrideReturnAddressId.toString()));

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
   * Delete a tag for an overrideReturnAddress.
   * Deletes an existing overrideReturnAddress tag using the specified data.
   * @param overrideReturnAddressId Id of the overrideReturnAddress to remove tag from (required)
   * @param overrideReturnAddressTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOverrideReturnAddressTag(Integer overrideReturnAddressId, String overrideReturnAddressTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'overrideReturnAddressId' is set
    if (overrideReturnAddressId == null) {
      throw new ApiException(400, "Missing the required parameter 'overrideReturnAddressId' when calling deleteOverrideReturnAddressTag");
    }
    
    // verify the required parameter 'overrideReturnAddressTag' is set
    if (overrideReturnAddressTag == null) {
      throw new ApiException(400, "Missing the required parameter 'overrideReturnAddressTag' when calling deleteOverrideReturnAddressTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/overrideReturnAddress/{overrideReturnAddressId}/tag/{overrideReturnAddressTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "overrideReturnAddressId" + "\\}", apiClient.escapeString(overrideReturnAddressId.toString()))
      .replaceAll("\\{" + "overrideReturnAddressTag" + "\\}", apiClient.escapeString(overrideReturnAddressTag.toString()));

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
   * Get a duplicated an overrideReturnAddress by id
   * Returns a duplicated overrideReturnAddress identified by the specified id.
   * @param overrideReturnAddressId Id of the overrideReturnAddress to be duplicated. (required)
   * @return OverrideReturnAddress
   * @throws ApiException if fails to make API call
   */
  public OverrideReturnAddress getDuplicateOverrideReturnAddressById(Integer overrideReturnAddressId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'overrideReturnAddressId' is set
    if (overrideReturnAddressId == null) {
      throw new ApiException(400, "Missing the required parameter 'overrideReturnAddressId' when calling getDuplicateOverrideReturnAddressById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/overrideReturnAddress/duplicate/{overrideReturnAddressId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "overrideReturnAddressId" + "\\}", apiClient.escapeString(overrideReturnAddressId.toString()));

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

    
    GenericType<OverrideReturnAddress> localVarReturnType = new GenericType<OverrideReturnAddress>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search overrideReturnAddresses by filter
   * Returns the list of overrideReturnAddresses that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<OverrideReturnAddress>
   * @throws ApiException if fails to make API call
   */
  public List<OverrideReturnAddress> getOverrideReturnAddressByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/overrideReturnAddress/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<OverrideReturnAddress>> localVarReturnType = new GenericType<List<OverrideReturnAddress>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an overrideReturnAddress by id
   * Returns the overrideReturnAddress identified by the specified id.
   * @param overrideReturnAddressId Id of the overrideReturnAddress to be returned. (required)
   * @return OverrideReturnAddress
   * @throws ApiException if fails to make API call
   */
  public OverrideReturnAddress getOverrideReturnAddressById(Integer overrideReturnAddressId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'overrideReturnAddressId' is set
    if (overrideReturnAddressId == null) {
      throw new ApiException(400, "Missing the required parameter 'overrideReturnAddressId' when calling getOverrideReturnAddressById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/overrideReturnAddress/{overrideReturnAddressId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "overrideReturnAddressId" + "\\}", apiClient.escapeString(overrideReturnAddressId.toString()));

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

    
    GenericType<OverrideReturnAddress> localVarReturnType = new GenericType<OverrideReturnAddress>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an overrideReturnAddress.
   * Get all existing overrideReturnAddress tags.
   * @param overrideReturnAddressId Id of the overrideReturnAddress to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getOverrideReturnAddressTags(Integer overrideReturnAddressId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'overrideReturnAddressId' is set
    if (overrideReturnAddressId == null) {
      throw new ApiException(400, "Missing the required parameter 'overrideReturnAddressId' when calling getOverrideReturnAddressTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/overrideReturnAddress/{overrideReturnAddressId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "overrideReturnAddressId" + "\\}", apiClient.escapeString(overrideReturnAddressId.toString()));

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
   * Update an overrideReturnAddress
   * Updates an existing overrideReturnAddress using the specified data.
   * @param body OverrideReturnAddress to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateOverrideReturnAddress(OverrideReturnAddress body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateOverrideReturnAddress");
    }
    
    // create path and map variables
    String localVarPath = "/beta/overrideReturnAddress".replaceAll("\\{format\\}","json");

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
   * Update an overrideReturnAddress custom fields
   * Updates an existing overrideReturnAddress custom fields using the specified data.
   * @param body OverrideReturnAddress to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateOverrideReturnAddressCustomFields(OverrideReturnAddress body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateOverrideReturnAddressCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/overrideReturnAddress/customFields".replaceAll("\\{format\\}","json");

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
