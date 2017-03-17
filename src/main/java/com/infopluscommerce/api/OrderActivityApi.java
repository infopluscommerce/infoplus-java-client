package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.OrderActivity;
import com.infopluscommerce.model.ApiResponse;
import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class OrderActivityApi {
  private ApiClient apiClient;

  public OrderActivityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrderActivityApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an orderActivity
   * Inserts a new orderActivity using the specified data.
   * @param body OrderActivity to be inserted. (required)
   * @return OrderActivity
   * @throws ApiException if fails to make API call
   */
  public OrderActivity addOrderActivity(OrderActivity body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addOrderActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderActivity".replaceAll("\\{format\\}","json");

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

    
    GenericType<OrderActivity> localVarReturnType = new GenericType<OrderActivity>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for an orderActivity
   * Adds an audit to an existing orderActivity.
   * @param orderActivityId Id of the orderActivity to add an audit to (required)
   * @param orderActivityAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addOrderActivityAudit(BigDecimal orderActivityId, String orderActivityAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderActivityId' is set
    if (orderActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderActivityId' when calling addOrderActivityAudit");
    }
    
    // verify the required parameter 'orderActivityAudit' is set
    if (orderActivityAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'orderActivityAudit' when calling addOrderActivityAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderActivity/{orderActivityId}/audit/{orderActivityAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderActivityId" + "\\}", apiClient.escapeString(orderActivityId.toString()))
      .replaceAll("\\{" + "orderActivityAudit" + "\\}", apiClient.escapeString(orderActivityAudit.toString()));

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
   * Add new tags for an orderActivity.
   * Adds a tag to an existing orderActivity.
   * @param orderActivityId Id of the orderActivity to add a tag to (required)
   * @param orderActivityTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addOrderActivityTag(BigDecimal orderActivityId, String orderActivityTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderActivityId' is set
    if (orderActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderActivityId' when calling addOrderActivityTag");
    }
    
    // verify the required parameter 'orderActivityTag' is set
    if (orderActivityTag == null) {
      throw new ApiException(400, "Missing the required parameter 'orderActivityTag' when calling addOrderActivityTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderActivity/{orderActivityId}/tag/{orderActivityTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderActivityId" + "\\}", apiClient.escapeString(orderActivityId.toString()))
      .replaceAll("\\{" + "orderActivityTag" + "\\}", apiClient.escapeString(orderActivityTag.toString()));

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
   * Delete an orderActivity
   * Deletes the orderActivity identified by the specified id.
   * @param orderActivityId Id of the orderActivity to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOrderActivity(BigDecimal orderActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderActivityId' is set
    if (orderActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderActivityId' when calling deleteOrderActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderActivity/{orderActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderActivityId" + "\\}", apiClient.escapeString(orderActivityId.toString()));

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
   * Delete a tag for an orderActivity.
   * Deletes an existing orderActivity tag using the specified data.
   * @param orderActivityId Id of the orderActivity to remove tag from (required)
   * @param orderActivityTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOrderActivityTag(BigDecimal orderActivityId, String orderActivityTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderActivityId' is set
    if (orderActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderActivityId' when calling deleteOrderActivityTag");
    }
    
    // verify the required parameter 'orderActivityTag' is set
    if (orderActivityTag == null) {
      throw new ApiException(400, "Missing the required parameter 'orderActivityTag' when calling deleteOrderActivityTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderActivity/{orderActivityId}/tag/{orderActivityTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderActivityId" + "\\}", apiClient.escapeString(orderActivityId.toString()))
      .replaceAll("\\{" + "orderActivityTag" + "\\}", apiClient.escapeString(orderActivityTag.toString()));

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
   * Get a duplicated an orderActivity by id
   * Returns a duplicated orderActivity identified by the specified id.
   * @param orderActivityId Id of the orderActivity to be duplicated. (required)
   * @return OrderActivity
   * @throws ApiException if fails to make API call
   */
  public OrderActivity getDuplicateOrderActivityById(BigDecimal orderActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderActivityId' is set
    if (orderActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderActivityId' when calling getDuplicateOrderActivityById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderActivity/duplicate/{orderActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderActivityId" + "\\}", apiClient.escapeString(orderActivityId.toString()));

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

    
    GenericType<OrderActivity> localVarReturnType = new GenericType<OrderActivity>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search orderActivitys by filter
   * Returns the list of orderActivitys that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<OrderActivity>
   * @throws ApiException if fails to make API call
   */
  public List<OrderActivity> getOrderActivityByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/orderActivity/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<OrderActivity>> localVarReturnType = new GenericType<List<OrderActivity>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an orderActivity by id
   * Returns the orderActivity identified by the specified id.
   * @param orderActivityId Id of the orderActivity to be returned. (required)
   * @return OrderActivity
   * @throws ApiException if fails to make API call
   */
  public OrderActivity getOrderActivityById(BigDecimal orderActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderActivityId' is set
    if (orderActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderActivityId' when calling getOrderActivityById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderActivity/{orderActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderActivityId" + "\\}", apiClient.escapeString(orderActivityId.toString()));

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

    
    GenericType<OrderActivity> localVarReturnType = new GenericType<OrderActivity>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an orderActivity.
   * Get all existing orderActivity tags.
   * @param orderActivityId Id of the orderActivity to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getOrderActivityTags(BigDecimal orderActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderActivityId' is set
    if (orderActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderActivityId' when calling getOrderActivityTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderActivity/{orderActivityId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderActivityId" + "\\}", apiClient.escapeString(orderActivityId.toString()));

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
   * Update an orderActivity
   * Updates an existing orderActivity using the specified data.
   * @param body OrderActivity to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateOrderActivity(OrderActivity body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateOrderActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderActivity".replaceAll("\\{format\\}","json");

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
