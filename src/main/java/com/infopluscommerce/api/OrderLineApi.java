package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.OrderLine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class OrderLineApi {
  private ApiClient apiClient;

  public OrderLineApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrderLineApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for an orderLine
   * Adds an audit to an existing orderLine.
   * @param orderLineId Id of the orderLine to add an audit to (required)
   * @param orderLineAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addOrderLineAudit(Integer orderLineId, String orderLineAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderLineId' is set
    if (orderLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderLineId' when calling addOrderLineAudit");
    }
    
    // verify the required parameter 'orderLineAudit' is set
    if (orderLineAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'orderLineAudit' when calling addOrderLineAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderLine/{orderLineId}/audit/{orderLineAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderLineId" + "\\}", apiClient.escapeString(orderLineId.toString()))
      .replaceAll("\\{" + "orderLineAudit" + "\\}", apiClient.escapeString(orderLineAudit.toString()));

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
   * Add new tags for an orderLine.
   * Adds a tag to an existing orderLine.
   * @param orderLineId Id of the orderLine to add a tag to (required)
   * @param orderLineTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addOrderLineTag(Integer orderLineId, String orderLineTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderLineId' is set
    if (orderLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderLineId' when calling addOrderLineTag");
    }
    
    // verify the required parameter 'orderLineTag' is set
    if (orderLineTag == null) {
      throw new ApiException(400, "Missing the required parameter 'orderLineTag' when calling addOrderLineTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderLine/{orderLineId}/tag/{orderLineTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderLineId" + "\\}", apiClient.escapeString(orderLineId.toString()))
      .replaceAll("\\{" + "orderLineTag" + "\\}", apiClient.escapeString(orderLineTag.toString()));

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
   * Delete a tag for an orderLine.
   * Deletes an existing orderLine tag using the specified data.
   * @param orderLineId Id of the orderLine to remove tag from (required)
   * @param orderLineTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOrderLineTag(Integer orderLineId, String orderLineTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderLineId' is set
    if (orderLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderLineId' when calling deleteOrderLineTag");
    }
    
    // verify the required parameter 'orderLineTag' is set
    if (orderLineTag == null) {
      throw new ApiException(400, "Missing the required parameter 'orderLineTag' when calling deleteOrderLineTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderLine/{orderLineId}/tag/{orderLineTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderLineId" + "\\}", apiClient.escapeString(orderLineId.toString()))
      .replaceAll("\\{" + "orderLineTag" + "\\}", apiClient.escapeString(orderLineTag.toString()));

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
   * Get a duplicated an orderLine by id
   * Returns a duplicated orderLine identified by the specified id.
   * @param orderLineId Id of the orderLine to be duplicated. (required)
   * @return OrderLine
   * @throws ApiException if fails to make API call
   */
  public OrderLine getDuplicateOrderLineById(Integer orderLineId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderLineId' is set
    if (orderLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderLineId' when calling getDuplicateOrderLineById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderLine/duplicate/{orderLineId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderLineId" + "\\}", apiClient.escapeString(orderLineId.toString()));

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

    
    GenericType<OrderLine> localVarReturnType = new GenericType<OrderLine>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search orderLines by filter
   * Returns the list of orderLines that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<OrderLine>
   * @throws ApiException if fails to make API call
   */
  public List<OrderLine> getOrderLineByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/orderLine/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<OrderLine>> localVarReturnType = new GenericType<List<OrderLine>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an orderLine by id
   * Returns the orderLine identified by the specified id.
   * @param orderLineId Id of the orderLine to be returned. (required)
   * @return OrderLine
   * @throws ApiException if fails to make API call
   */
  public OrderLine getOrderLineById(Integer orderLineId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderLineId' is set
    if (orderLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderLineId' when calling getOrderLineById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderLine/{orderLineId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderLineId" + "\\}", apiClient.escapeString(orderLineId.toString()));

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

    
    GenericType<OrderLine> localVarReturnType = new GenericType<OrderLine>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an orderLine.
   * Get all existing orderLine tags.
   * @param orderLineId Id of the orderLine to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getOrderLineTags(Integer orderLineId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderLineId' is set
    if (orderLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderLineId' when calling getOrderLineTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderLine/{orderLineId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderLineId" + "\\}", apiClient.escapeString(orderLineId.toString()));

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
   * Update an orderLine custom fields
   * Updates an existing orderLine custom fields using the specified data.
   * @param body OrderLine to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateOrderLineCustomFields(OrderLine body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateOrderLineCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/orderLine/customFields".replaceAll("\\{format\\}","json");

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
