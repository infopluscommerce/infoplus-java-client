package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ReplenishmentProcess;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
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
   * Search replenishmentProcesses by filter
   * Returns the list of replenishmentProcesses that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<ReplenishmentProcess>
   */
  public List<ReplenishmentProcess> getReplenishmentProcessByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/replenishmentProcess/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<List<ReplenishmentProcess>> returnType = new GenericType<List<ReplenishmentProcess>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a replenishmentProcess by id
   * Returns the replenishmentProcess identified by the specified id.
   * @param replenishmentProcessId Id of the replenishmentProcess to be returned.
   * @return ReplenishmentProcess
   */
  public ReplenishmentProcess getReplenishmentProcessById(Integer replenishmentProcessId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'replenishmentProcessId' is set
     if (replenishmentProcessId == null) {
        throw new ApiException(400, "Missing the required parameter 'replenishmentProcessId' when calling getReplenishmentProcessById");
     }
     
    // create path and map variables
    String path = "/v1.0/replenishmentProcess/{replenishmentProcessId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "replenishmentProcessId" + "\\}", apiClient.escapeString(replenishmentProcessId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<ReplenishmentProcess> returnType = new GenericType<ReplenishmentProcess>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
