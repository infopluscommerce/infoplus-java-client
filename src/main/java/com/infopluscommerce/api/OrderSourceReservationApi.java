package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.OrderSourceReservation;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
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
   * Create an orderSourceReservation
   * Inserts a new orderSourceReservation using the specified data.
   * @param body OrderSourceReservation to be inserted. (required)
   * @return OrderSourceReservation
   * @throws ApiException if fails to make API call
   */
  public OrderSourceReservation addOrderSourceReservation(OrderSourceReservation body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addOrderSourceReservation");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderSourceReservation".replaceAll("\\{format\\}","json");

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

    
    GenericType<OrderSourceReservation> localVarReturnType = new GenericType<OrderSourceReservation>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for an orderSourceReservation
   * Adds an audit to an existing orderSourceReservation.
   * @param orderSourceReservationId Id of the orderSourceReservation to add an audit to (required)
   * @param orderSourceReservationAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addOrderSourceReservationAudit(Integer orderSourceReservationId, String orderSourceReservationAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderSourceReservationId' is set
    if (orderSourceReservationId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderSourceReservationId' when calling addOrderSourceReservationAudit");
    }
    
    // verify the required parameter 'orderSourceReservationAudit' is set
    if (orderSourceReservationAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'orderSourceReservationAudit' when calling addOrderSourceReservationAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderSourceReservation/{orderSourceReservationId}/audit/{orderSourceReservationAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderSourceReservationId" + "\\}", apiClient.escapeString(orderSourceReservationId.toString()))
      .replaceAll("\\{" + "orderSourceReservationAudit" + "\\}", apiClient.escapeString(orderSourceReservationAudit.toString()));

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
  
  /**
   * Add new tags for an orderSourceReservation.
   * Adds a tag to an existing orderSourceReservation.
   * @param orderSourceReservationId Id of the orderSourceReservation to add a tag to (required)
   * @param orderSourceReservationTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addOrderSourceReservationTag(Integer orderSourceReservationId, String orderSourceReservationTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderSourceReservationId' is set
    if (orderSourceReservationId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderSourceReservationId' when calling addOrderSourceReservationTag");
    }
    
    // verify the required parameter 'orderSourceReservationTag' is set
    if (orderSourceReservationTag == null) {
      throw new ApiException(400, "Missing the required parameter 'orderSourceReservationTag' when calling addOrderSourceReservationTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderSourceReservation/{orderSourceReservationId}/tag/{orderSourceReservationTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderSourceReservationId" + "\\}", apiClient.escapeString(orderSourceReservationId.toString()))
      .replaceAll("\\{" + "orderSourceReservationTag" + "\\}", apiClient.escapeString(orderSourceReservationTag.toString()));

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
  
  /**
   * Delete an orderSourceReservation
   * Deletes the orderSourceReservation identified by the specified id.
   * @param orderSourceReservationId Id of the orderSourceReservation to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOrderSourceReservation(Integer orderSourceReservationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderSourceReservationId' is set
    if (orderSourceReservationId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderSourceReservationId' when calling deleteOrderSourceReservation");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderSourceReservation/{orderSourceReservationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderSourceReservationId" + "\\}", apiClient.escapeString(orderSourceReservationId.toString()));

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

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Delete a tag for an orderSourceReservation.
   * Deletes an existing orderSourceReservation tag using the specified data.
   * @param orderSourceReservationId Id of the orderSourceReservation to remove tag from (required)
   * @param orderSourceReservationTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOrderSourceReservationTag(Integer orderSourceReservationId, String orderSourceReservationTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderSourceReservationId' is set
    if (orderSourceReservationId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderSourceReservationId' when calling deleteOrderSourceReservationTag");
    }
    
    // verify the required parameter 'orderSourceReservationTag' is set
    if (orderSourceReservationTag == null) {
      throw new ApiException(400, "Missing the required parameter 'orderSourceReservationTag' when calling deleteOrderSourceReservationTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderSourceReservation/{orderSourceReservationId}/tag/{orderSourceReservationTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderSourceReservationId" + "\\}", apiClient.escapeString(orderSourceReservationId.toString()))
      .replaceAll("\\{" + "orderSourceReservationTag" + "\\}", apiClient.escapeString(orderSourceReservationTag.toString()));

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

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Get a duplicated an orderSourceReservation by id
   * Returns a duplicated orderSourceReservation identified by the specified id.
   * @param orderSourceReservationId Id of the orderSourceReservation to be duplicated. (required)
   * @return OrderSourceReservation
   * @throws ApiException if fails to make API call
   */
  public OrderSourceReservation getDuplicateOrderSourceReservationById(Integer orderSourceReservationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderSourceReservationId' is set
    if (orderSourceReservationId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderSourceReservationId' when calling getDuplicateOrderSourceReservationById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderSourceReservation/duplicate/{orderSourceReservationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderSourceReservationId" + "\\}", apiClient.escapeString(orderSourceReservationId.toString()));

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

    
    GenericType<OrderSourceReservation> localVarReturnType = new GenericType<OrderSourceReservation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search orderSourceReservations by filter
   * Returns the list of orderSourceReservations that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<OrderSourceReservation>
   * @throws ApiException if fails to make API call
   */
  public List<OrderSourceReservation> getOrderSourceReservationByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/orderSourceReservation/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<OrderSourceReservation>> localVarReturnType = new GenericType<List<OrderSourceReservation>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an orderSourceReservation by id
   * Returns the orderSourceReservation identified by the specified id.
   * @param orderSourceReservationId Id of the orderSourceReservation to be returned. (required)
   * @return OrderSourceReservation
   * @throws ApiException if fails to make API call
   */
  public OrderSourceReservation getOrderSourceReservationById(Integer orderSourceReservationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderSourceReservationId' is set
    if (orderSourceReservationId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderSourceReservationId' when calling getOrderSourceReservationById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderSourceReservation/{orderSourceReservationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderSourceReservationId" + "\\}", apiClient.escapeString(orderSourceReservationId.toString()));

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

    
    GenericType<OrderSourceReservation> localVarReturnType = new GenericType<OrderSourceReservation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an orderSourceReservation.
   * Get all existing orderSourceReservation tags.
   * @param orderSourceReservationId Id of the orderSourceReservation to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getOrderSourceReservationTags(Integer orderSourceReservationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderSourceReservationId' is set
    if (orderSourceReservationId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderSourceReservationId' when calling getOrderSourceReservationTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderSourceReservation/{orderSourceReservationId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderSourceReservationId" + "\\}", apiClient.escapeString(orderSourceReservationId.toString()));

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

    
    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Update an orderSourceReservation
   * Updates an existing orderSourceReservation using the specified data.
   * @param body OrderSourceReservation to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateOrderSourceReservation(OrderSourceReservation body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateOrderSourceReservation");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderSourceReservation".replaceAll("\\{format\\}","json");

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
  
  /**
   * Update an orderSourceReservation custom fields
   * Updates an existing orderSourceReservation custom fields using the specified data.
   * @param body OrderSourceReservation to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateOrderSourceReservationCustomFields(OrderSourceReservation body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateOrderSourceReservationCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderSourceReservation/customFields".replaceAll("\\{format\\}","json");

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
