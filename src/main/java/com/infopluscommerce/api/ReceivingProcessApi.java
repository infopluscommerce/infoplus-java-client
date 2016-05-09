package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ReceivingProcess;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class ReceivingProcessApi {
  private ApiClient apiClient;

  public ReceivingProcessApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReceivingProcessApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Search receivingProcesses by filter
   * Returns the list of receivingProcesses that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<ReceivingProcess>
   */
  public List<ReceivingProcess> getReceivingProcessByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/receivingProcess/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ReceivingProcess>> returnType = new GenericType<List<ReceivingProcess>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a receivingProcess by id
   * Returns the receivingProcess identified by the specified id.
   * @param receivingProcessId Id of the receivingProcess to be returned.
   * @return ReceivingProcess
   */
  public ReceivingProcess getReceivingProcessById(Integer receivingProcessId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'receivingProcessId' is set
     if (receivingProcessId == null) {
        throw new ApiException(400, "Missing the required parameter 'receivingProcessId' when calling getReceivingProcessById");
     }
     
    // create path and map variables
    String path = "/v1.0/receivingProcess/{receivingProcessId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "receivingProcessId" + "\\}", apiClient.escapeString(receivingProcessId.toString()));

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

    
    GenericType<ReceivingProcess> returnType = new GenericType<ReceivingProcess>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a receivingProcess
   * Deletes the receivingProcess identified by the specified id.
   * @param receivingProcessId Id of the receivingProcess to be deleted.
   * @return void
   */
  public void deleteReceivingProcess(Integer receivingProcessId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'receivingProcessId' is set
     if (receivingProcessId == null) {
        throw new ApiException(400, "Missing the required parameter 'receivingProcessId' when calling deleteReceivingProcess");
     }
     
    // create path and map variables
    String path = "/v1.0/receivingProcess/{receivingProcessId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "receivingProcessId" + "\\}", apiClient.escapeString(receivingProcessId.toString()));

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

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
}
