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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:31:34.297-06:00")
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
    String localVarPath = "/v2.0/replenishment/duplicate/{replenishmentId}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/v2.0/replenishment/search".replaceAll("\\{format\\}","json");

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
    String localVarPath = "/v2.0/replenishment/{replenishmentId}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/v2.0/replenishment/customFields".replaceAll("\\{format\\}","json");

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
