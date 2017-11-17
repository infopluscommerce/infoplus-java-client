package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ReplenishmentProcess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:31:34.297-06:00")
public class ReplenishmentProcessApi {
  private ApiClient apiClient;

  public ReplenishmentProcessApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReplenishmentProcessApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get a duplicated a replenishmentProcess by id
   * Returns a duplicated replenishmentProcess identified by the specified id.
   * @param replenishmentProcessId Id of the replenishmentProcess to be duplicated. (required)
   * @return ReplenishmentProcess
   * @throws ApiException if fails to make API call
   */
  public ReplenishmentProcess getDuplicateReplenishmentProcessById(Integer replenishmentProcessId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replenishmentProcessId' is set
    if (replenishmentProcessId == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentProcessId' when calling getDuplicateReplenishmentProcessById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/replenishmentProcess/duplicate/{replenishmentProcessId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "replenishmentProcessId" + "\\}", apiClient.escapeString(replenishmentProcessId.toString()));

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

    
    GenericType<ReplenishmentProcess> localVarReturnType = new GenericType<ReplenishmentProcess>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search replenishmentProcesses by filter
   * Returns the list of replenishmentProcesses that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ReplenishmentProcess>
   * @throws ApiException if fails to make API call
   */
  public List<ReplenishmentProcess> getReplenishmentProcessByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2.0/replenishmentProcess/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ReplenishmentProcess>> localVarReturnType = new GenericType<List<ReplenishmentProcess>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a replenishmentProcess by id
   * Returns the replenishmentProcess identified by the specified id.
   * @param replenishmentProcessId Id of the replenishmentProcess to be returned. (required)
   * @return ReplenishmentProcess
   * @throws ApiException if fails to make API call
   */
  public ReplenishmentProcess getReplenishmentProcessById(Integer replenishmentProcessId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replenishmentProcessId' is set
    if (replenishmentProcessId == null) {
      throw new ApiException(400, "Missing the required parameter 'replenishmentProcessId' when calling getReplenishmentProcessById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/replenishmentProcess/{replenishmentProcessId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "replenishmentProcessId" + "\\}", apiClient.escapeString(replenishmentProcessId.toString()));

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

    
    GenericType<ReplenishmentProcess> localVarReturnType = new GenericType<ReplenishmentProcess>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a replenishmentProcess custom fields
   * Updates an existing replenishmentProcess custom fields using the specified data.
   * @param body ReplenishmentProcess to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateReplenishmentProcessCustomFields(ReplenishmentProcess body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateReplenishmentProcessCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/replenishmentProcess/customFields".replaceAll("\\{format\\}","json");

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
