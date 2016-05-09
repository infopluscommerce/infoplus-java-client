package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ExternalShipment;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class ExternalShipmentApi {
  private ApiClient apiClient;

  public ExternalShipmentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExternalShipmentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Update an externalShipment
   * Updates an existing externalShipment using the specified data.
   * @param body ExternalShipment to be updated.
   * @return void
   */
  public void updateExternalShipment(ExternalShipment body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateExternalShipment");
     }
     
    // create path and map variables
    String path = "/v1.0/externalShipment".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Create an externalShipment
   * Inserts a new externalShipment using the specified data.
   * @param body ExternalShipment to be inserted.
   * @return ExternalShipment
   */
  public ExternalShipment addExternalShipment(ExternalShipment body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addExternalShipment");
     }
     
    // create path and map variables
    String path = "/v1.0/externalShipment".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<ExternalShipment> returnType = new GenericType<ExternalShipment>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search externalShipments by filter
   * Returns the list of externalShipments that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<ExternalShipment>
   */
  public List<ExternalShipment> getExternalShipmentByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/externalShipment/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ExternalShipment>> returnType = new GenericType<List<ExternalShipment>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get an externalShipment by id
   * Returns the externalShipment identified by the specified id.
   * @param externalShipmentId Id of the externalShipment to be returned.
   * @return ExternalShipment
   */
  public ExternalShipment getExternalShipmentById(Integer externalShipmentId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'externalShipmentId' is set
     if (externalShipmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'externalShipmentId' when calling getExternalShipmentById");
     }
     
    // create path and map variables
    String path = "/v1.0/externalShipment/{externalShipmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalShipmentId" + "\\}", apiClient.escapeString(externalShipmentId.toString()));

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

    
    GenericType<ExternalShipment> returnType = new GenericType<ExternalShipment>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete an externalShipment
   * Deletes the externalShipment identified by the specified id.
   * @param externalShipmentId Id of the externalShipment to be deleted.
   * @return void
   */
  public void deleteExternalShipment(Integer externalShipmentId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'externalShipmentId' is set
     if (externalShipmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'externalShipmentId' when calling deleteExternalShipment");
     }
     
    // create path and map variables
    String path = "/v1.0/externalShipment/{externalShipmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalShipmentId" + "\\}", apiClient.escapeString(externalShipmentId.toString()));

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
