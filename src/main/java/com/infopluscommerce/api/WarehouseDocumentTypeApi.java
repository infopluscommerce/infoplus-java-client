package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.WarehouseDocumentType;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class WarehouseDocumentTypeApi {
  private ApiClient apiClient;

  public WarehouseDocumentTypeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WarehouseDocumentTypeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Search warehouseDocumentTypes by filter
   * Returns the list of warehouseDocumentTypes that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<WarehouseDocumentType>
   */
  public List<WarehouseDocumentType> getWarehouseDocumentTypeByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/warehouseDocumentType/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<WarehouseDocumentType>> returnType = new GenericType<List<WarehouseDocumentType>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a warehouseDocumentType by id
   * Returns the warehouseDocumentType identified by the specified id.
   * @param warehouseDocumentTypeId Id of the warehouseDocumentType to be returned.
   * @return WarehouseDocumentType
   */
  public WarehouseDocumentType getWarehouseDocumentTypeById(Integer warehouseDocumentTypeId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'warehouseDocumentTypeId' is set
     if (warehouseDocumentTypeId == null) {
        throw new ApiException(400, "Missing the required parameter 'warehouseDocumentTypeId' when calling getWarehouseDocumentTypeById");
     }
     
    // create path and map variables
    String path = "/v1.0/warehouseDocumentType/{warehouseDocumentTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "warehouseDocumentTypeId" + "\\}", apiClient.escapeString(warehouseDocumentTypeId.toString()));

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

    
    GenericType<WarehouseDocumentType> returnType = new GenericType<WarehouseDocumentType>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
