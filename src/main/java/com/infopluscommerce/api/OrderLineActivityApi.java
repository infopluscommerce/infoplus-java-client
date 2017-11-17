package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ApiResponse;
import com.infopluscommerce.model.OrderLineActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class OrderLineActivityApi {
  private ApiClient apiClient;

  public OrderLineActivityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrderLineActivityApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an orderLineActivity
   * Inserts a new orderLineActivity using the specified data.
   * @param body OrderLineActivity to be inserted. (required)
   * @return OrderLineActivity
   * @throws ApiException if fails to make API call
   */
  public OrderLineActivity addOrderLineActivity(OrderLineActivity body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addOrderLineActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderLineActivity".replaceAll("\\{format\\}","json");

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

    
    GenericType<OrderLineActivity> localVarReturnType = new GenericType<OrderLineActivity>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for an orderLineActivity
   * Adds an audit to an existing orderLineActivity.
   * @param orderLineActivityId Id of the orderLineActivity to add an audit to (required)
   * @param orderLineActivityAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addOrderLineActivityAudit(Integer orderLineActivityId, String orderLineActivityAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderLineActivityId' is set
    if (orderLineActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderLineActivityId' when calling addOrderLineActivityAudit");
    }
    
    // verify the required parameter 'orderLineActivityAudit' is set
    if (orderLineActivityAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'orderLineActivityAudit' when calling addOrderLineActivityAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderLineActivity/{orderLineActivityId}/audit/{orderLineActivityAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderLineActivityId" + "\\}", apiClient.escapeString(orderLineActivityId.toString()))
      .replaceAll("\\{" + "orderLineActivityAudit" + "\\}", apiClient.escapeString(orderLineActivityAudit.toString()));

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
   * Add new tags for an orderLineActivity.
   * Adds a tag to an existing orderLineActivity.
   * @param orderLineActivityId Id of the orderLineActivity to add a tag to (required)
   * @param orderLineActivityTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addOrderLineActivityTag(Integer orderLineActivityId, String orderLineActivityTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderLineActivityId' is set
    if (orderLineActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderLineActivityId' when calling addOrderLineActivityTag");
    }
    
    // verify the required parameter 'orderLineActivityTag' is set
    if (orderLineActivityTag == null) {
      throw new ApiException(400, "Missing the required parameter 'orderLineActivityTag' when calling addOrderLineActivityTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderLineActivity/{orderLineActivityId}/tag/{orderLineActivityTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderLineActivityId" + "\\}", apiClient.escapeString(orderLineActivityId.toString()))
      .replaceAll("\\{" + "orderLineActivityTag" + "\\}", apiClient.escapeString(orderLineActivityTag.toString()));

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
   * Delete an orderLineActivity
   * Deletes the orderLineActivity identified by the specified id.
   * @param orderLineActivityId Id of the orderLineActivity to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOrderLineActivity(Integer orderLineActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderLineActivityId' is set
    if (orderLineActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderLineActivityId' when calling deleteOrderLineActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderLineActivity/{orderLineActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderLineActivityId" + "\\}", apiClient.escapeString(orderLineActivityId.toString()));

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
   * Delete a tag for an orderLineActivity.
   * Deletes an existing orderLineActivity tag using the specified data.
   * @param orderLineActivityId Id of the orderLineActivity to remove tag from (required)
   * @param orderLineActivityTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOrderLineActivityTag(Integer orderLineActivityId, String orderLineActivityTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderLineActivityId' is set
    if (orderLineActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderLineActivityId' when calling deleteOrderLineActivityTag");
    }
    
    // verify the required parameter 'orderLineActivityTag' is set
    if (orderLineActivityTag == null) {
      throw new ApiException(400, "Missing the required parameter 'orderLineActivityTag' when calling deleteOrderLineActivityTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderLineActivity/{orderLineActivityId}/tag/{orderLineActivityTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderLineActivityId" + "\\}", apiClient.escapeString(orderLineActivityId.toString()))
      .replaceAll("\\{" + "orderLineActivityTag" + "\\}", apiClient.escapeString(orderLineActivityTag.toString()));

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
   * Get a duplicated an orderLineActivity by id
   * Returns a duplicated orderLineActivity identified by the specified id.
   * @param orderLineActivityId Id of the orderLineActivity to be duplicated. (required)
   * @return OrderLineActivity
   * @throws ApiException if fails to make API call
   */
  public OrderLineActivity getDuplicateOrderLineActivityById(Integer orderLineActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderLineActivityId' is set
    if (orderLineActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderLineActivityId' when calling getDuplicateOrderLineActivityById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderLineActivity/duplicate/{orderLineActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderLineActivityId" + "\\}", apiClient.escapeString(orderLineActivityId.toString()));

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

    
    GenericType<OrderLineActivity> localVarReturnType = new GenericType<OrderLineActivity>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search orderLineActivitys by filter
   * Returns the list of orderLineActivitys that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<OrderLineActivity>
   * @throws ApiException if fails to make API call
   */
  public List<OrderLineActivity> getOrderLineActivityByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/orderLineActivity/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<OrderLineActivity>> localVarReturnType = new GenericType<List<OrderLineActivity>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an orderLineActivity by id
   * Returns the orderLineActivity identified by the specified id.
   * @param orderLineActivityId Id of the orderLineActivity to be returned. (required)
   * @return OrderLineActivity
   * @throws ApiException if fails to make API call
   */
  public OrderLineActivity getOrderLineActivityById(Integer orderLineActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderLineActivityId' is set
    if (orderLineActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderLineActivityId' when calling getOrderLineActivityById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderLineActivity/{orderLineActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderLineActivityId" + "\\}", apiClient.escapeString(orderLineActivityId.toString()));

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

    
    GenericType<OrderLineActivity> localVarReturnType = new GenericType<OrderLineActivity>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an orderLineActivity.
   * Get all existing orderLineActivity tags.
   * @param orderLineActivityId Id of the orderLineActivity to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getOrderLineActivityTags(Integer orderLineActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderLineActivityId' is set
    if (orderLineActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderLineActivityId' when calling getOrderLineActivityTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderLineActivity/{orderLineActivityId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderLineActivityId" + "\\}", apiClient.escapeString(orderLineActivityId.toString()));

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
   * Update an orderLineActivity
   * Updates an existing orderLineActivity using the specified data.
   * @param body OrderLineActivity to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateOrderLineActivity(OrderLineActivity body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateOrderLineActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderLineActivity".replaceAll("\\{format\\}","json");

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
