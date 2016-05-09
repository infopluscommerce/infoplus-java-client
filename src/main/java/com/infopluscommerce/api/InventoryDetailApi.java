package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.InventoryDetail;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class InventoryDetailApi {
  private ApiClient apiClient;

  public InventoryDetailApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InventoryDetailApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Search inventoryDetails by filter
   * Returns the list of inventoryDetails that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<InventoryDetail>
   */
  public List<InventoryDetail> getInventoryDetailByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/inventoryDetail/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<InventoryDetail>> returnType = new GenericType<List<InventoryDetail>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get an inventoryDetail by id
   * Returns the inventoryDetail identified by the specified id.
   * @param inventoryDetailId Id of the inventoryDetail to be returned.
   * @return InventoryDetail
   */
  public InventoryDetail getInventoryDetailById(Integer inventoryDetailId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'inventoryDetailId' is set
     if (inventoryDetailId == null) {
        throw new ApiException(400, "Missing the required parameter 'inventoryDetailId' when calling getInventoryDetailById");
     }
     
    // create path and map variables
    String path = "/v1.0/inventoryDetail/{inventoryDetailId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryDetailId" + "\\}", apiClient.escapeString(inventoryDetailId.toString()));

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

    
    GenericType<InventoryDetail> returnType = new GenericType<InventoryDetail>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
