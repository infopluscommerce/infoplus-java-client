package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.OrderSourceReservation;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class OrderSourceReservationApi {
  private ApiClient apiClient;

  public OrderSourceReservationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrderSourceReservationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Update an orderSourceReservation
   * Updates an existing orderSourceReservation using the specified data.
   * @param body OrderSourceReservation to be updated.
   * @return void
   */
  public void updateOrderSourceReservation(OrderSourceReservation body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateOrderSourceReservation");
     }
     
    // create path and map variables
    String path = "/v1.0/orderSourceReservation".replaceAll("\\{format\\}","json");

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
   * Create an orderSourceReservation
   * Inserts a new orderSourceReservation using the specified data.
   * @param body OrderSourceReservation to be inserted.
   * @return OrderSourceReservation
   */
  public OrderSourceReservation addOrderSourceReservation(OrderSourceReservation body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addOrderSourceReservation");
     }
     
    // create path and map variables
    String path = "/v1.0/orderSourceReservation".replaceAll("\\{format\\}","json");

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

    
    GenericType<OrderSourceReservation> returnType = new GenericType<OrderSourceReservation>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search orderSourceReservations by filter
   * Returns the list of orderSourceReservations that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<OrderSourceReservation>
   */
  public List<OrderSourceReservation> getOrderSourceReservationByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/orderSourceReservation/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<OrderSourceReservation>> returnType = new GenericType<List<OrderSourceReservation>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get an orderSourceReservation by id
   * Returns the orderSourceReservation identified by the specified id.
   * @param orderSourceReservationId Id of the orderSourceReservation to be returned.
   * @return OrderSourceReservation
   */
  public OrderSourceReservation getOrderSourceReservationById(Integer orderSourceReservationId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'orderSourceReservationId' is set
     if (orderSourceReservationId == null) {
        throw new ApiException(400, "Missing the required parameter 'orderSourceReservationId' when calling getOrderSourceReservationById");
     }
     
    // create path and map variables
    String path = "/v1.0/orderSourceReservation/{orderSourceReservationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderSourceReservationId" + "\\}", apiClient.escapeString(orderSourceReservationId.toString()));

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

    
    GenericType<OrderSourceReservation> returnType = new GenericType<OrderSourceReservation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete an orderSourceReservation
   * Deletes the orderSourceReservation identified by the specified id.
   * @param orderSourceReservationId Id of the orderSourceReservation to be deleted.
   * @return void
   */
  public void deleteOrderSourceReservation(Integer orderSourceReservationId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'orderSourceReservationId' is set
     if (orderSourceReservationId == null) {
        throw new ApiException(400, "Missing the required parameter 'orderSourceReservationId' when calling deleteOrderSourceReservation");
     }
     
    // create path and map variables
    String path = "/v1.0/orderSourceReservation/{orderSourceReservationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderSourceReservationId" + "\\}", apiClient.escapeString(orderSourceReservationId.toString()));

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
