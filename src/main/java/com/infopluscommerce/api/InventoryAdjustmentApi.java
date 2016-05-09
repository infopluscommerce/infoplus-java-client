package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.InventoryAdjustment;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class InventoryAdjustmentApi {
  private ApiClient apiClient;

  public InventoryAdjustmentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InventoryAdjustmentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Search inventoryAdjustments by filter
   * Returns the list of inventoryAdjustments that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<InventoryAdjustment>
   */
  public List<InventoryAdjustment> getInventoryAdjustmentByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/inventoryAdjustment/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<InventoryAdjustment>> returnType = new GenericType<List<InventoryAdjustment>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get an inventoryAdjustment by id
   * Returns the inventoryAdjustment identified by the specified id.
   * @param inventoryAdjustmentId Id of the inventoryAdjustment to be returned.
   * @return InventoryAdjustment
   */
  public InventoryAdjustment getInventoryAdjustmentById(Integer inventoryAdjustmentId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'inventoryAdjustmentId' is set
     if (inventoryAdjustmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'inventoryAdjustmentId' when calling getInventoryAdjustmentById");
     }
     
    // create path and map variables
    String path = "/v1.0/inventoryAdjustment/{inventoryAdjustmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "inventoryAdjustmentId" + "\\}", apiClient.escapeString(inventoryAdjustmentId.toString()));

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

    
    GenericType<InventoryAdjustment> returnType = new GenericType<InventoryAdjustment>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
