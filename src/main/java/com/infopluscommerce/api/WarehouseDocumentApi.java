package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.WarehouseDocument;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class WarehouseDocumentApi {
  private ApiClient apiClient;

  public WarehouseDocumentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WarehouseDocumentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Search warehouseDocuments by filter
   * Returns the list of warehouseDocuments that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<WarehouseDocument>
   */
  public List<WarehouseDocument> getWarehouseDocumentByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/warehouseDocument/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<WarehouseDocument>> returnType = new GenericType<List<WarehouseDocument>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a warehouseDocument by id
   * Returns the warehouseDocument identified by the specified id.
   * @param warehouseDocumentId Id of the warehouseDocument to be returned.
   * @return WarehouseDocument
   */
  public WarehouseDocument getWarehouseDocumentById(Integer warehouseDocumentId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'warehouseDocumentId' is set
     if (warehouseDocumentId == null) {
        throw new ApiException(400, "Missing the required parameter 'warehouseDocumentId' when calling getWarehouseDocumentById");
     }
     
    // create path and map variables
    String path = "/v1.0/warehouseDocument/{warehouseDocumentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "warehouseDocumentId" + "\\}", apiClient.escapeString(warehouseDocumentId.toString()));

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

    
    GenericType<WarehouseDocument> returnType = new GenericType<WarehouseDocument>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
