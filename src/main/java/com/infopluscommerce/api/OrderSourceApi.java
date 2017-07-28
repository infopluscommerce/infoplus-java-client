package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.OrderSource;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class OrderSourceApi {
  private ApiClient apiClient;

  public OrderSourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrderSourceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an orderSource
   * Inserts a new orderSource using the specified data.
   * @param body OrderSource to be inserted. (required)
   * @return OrderSource
   * @throws ApiException if fails to make API call
   */
  public OrderSource addOrderSource(OrderSource body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addOrderSource");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderSource".replaceAll("\\{format\\}","json");

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

    
    GenericType<OrderSource> localVarReturnType = new GenericType<OrderSource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for an orderSource
   * Adds an audit to an existing orderSource.
   * @param orderSourceId Id of the orderSource to add an audit to (required)
   * @param orderSourceAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addOrderSourceAudit(Integer orderSourceId, String orderSourceAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderSourceId' is set
    if (orderSourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderSourceId' when calling addOrderSourceAudit");
    }
    
    // verify the required parameter 'orderSourceAudit' is set
    if (orderSourceAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'orderSourceAudit' when calling addOrderSourceAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderSource/{orderSourceId}/audit/{orderSourceAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderSourceId" + "\\}", apiClient.escapeString(orderSourceId.toString()))
      .replaceAll("\\{" + "orderSourceAudit" + "\\}", apiClient.escapeString(orderSourceAudit.toString()));

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
   * Add new tags for an orderSource.
   * Adds a tag to an existing orderSource.
   * @param orderSourceId Id of the orderSource to add a tag to (required)
   * @param orderSourceTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addOrderSourceTag(Integer orderSourceId, String orderSourceTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderSourceId' is set
    if (orderSourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderSourceId' when calling addOrderSourceTag");
    }
    
    // verify the required parameter 'orderSourceTag' is set
    if (orderSourceTag == null) {
      throw new ApiException(400, "Missing the required parameter 'orderSourceTag' when calling addOrderSourceTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderSource/{orderSourceId}/tag/{orderSourceTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderSourceId" + "\\}", apiClient.escapeString(orderSourceId.toString()))
      .replaceAll("\\{" + "orderSourceTag" + "\\}", apiClient.escapeString(orderSourceTag.toString()));

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
   * Delete an orderSource
   * Deletes the orderSource identified by the specified id.
   * @param orderSourceId Id of the orderSource to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOrderSource(Integer orderSourceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderSourceId' is set
    if (orderSourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderSourceId' when calling deleteOrderSource");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderSource/{orderSourceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderSourceId" + "\\}", apiClient.escapeString(orderSourceId.toString()));

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
   * Delete a tag for an orderSource.
   * Deletes an existing orderSource tag using the specified data.
   * @param orderSourceId Id of the orderSource to remove tag from (required)
   * @param orderSourceTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOrderSourceTag(Integer orderSourceId, String orderSourceTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderSourceId' is set
    if (orderSourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderSourceId' when calling deleteOrderSourceTag");
    }
    
    // verify the required parameter 'orderSourceTag' is set
    if (orderSourceTag == null) {
      throw new ApiException(400, "Missing the required parameter 'orderSourceTag' when calling deleteOrderSourceTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderSource/{orderSourceId}/tag/{orderSourceTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderSourceId" + "\\}", apiClient.escapeString(orderSourceId.toString()))
      .replaceAll("\\{" + "orderSourceTag" + "\\}", apiClient.escapeString(orderSourceTag.toString()));

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
   * Get a duplicated an orderSource by id
   * Returns a duplicated orderSource identified by the specified id.
   * @param orderSourceId Id of the orderSource to be duplicated. (required)
   * @return OrderSource
   * @throws ApiException if fails to make API call
   */
  public OrderSource getDuplicateOrderSourceById(Integer orderSourceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderSourceId' is set
    if (orderSourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderSourceId' when calling getDuplicateOrderSourceById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderSource/duplicate/{orderSourceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderSourceId" + "\\}", apiClient.escapeString(orderSourceId.toString()));

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

    
    GenericType<OrderSource> localVarReturnType = new GenericType<OrderSource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search orderSources by filter
   * Returns the list of orderSources that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<OrderSource>
   * @throws ApiException if fails to make API call
   */
  public List<OrderSource> getOrderSourceByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/orderSource/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<OrderSource>> localVarReturnType = new GenericType<List<OrderSource>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an orderSource by id
   * Returns the orderSource identified by the specified id.
   * @param orderSourceId Id of the orderSource to be returned. (required)
   * @return OrderSource
   * @throws ApiException if fails to make API call
   */
  public OrderSource getOrderSourceById(Integer orderSourceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderSourceId' is set
    if (orderSourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderSourceId' when calling getOrderSourceById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderSource/{orderSourceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderSourceId" + "\\}", apiClient.escapeString(orderSourceId.toString()));

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

    
    GenericType<OrderSource> localVarReturnType = new GenericType<OrderSource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an orderSource.
   * Get all existing orderSource tags.
   * @param orderSourceId Id of the orderSource to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getOrderSourceTags(Integer orderSourceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderSourceId' is set
    if (orderSourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderSourceId' when calling getOrderSourceTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderSource/{orderSourceId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderSourceId" + "\\}", apiClient.escapeString(orderSourceId.toString()));

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
   * Update an orderSource
   * Updates an existing orderSource using the specified data.
   * @param body OrderSource to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateOrderSource(OrderSource body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateOrderSource");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderSource".replaceAll("\\{format\\}","json");

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
   * Update an orderSource custom fields
   * Updates an existing orderSource custom fields using the specified data.
   * @param body OrderSource to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateOrderSourceCustomFields(OrderSource body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateOrderSourceCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderSource/customFields".replaceAll("\\{format\\}","json");

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
