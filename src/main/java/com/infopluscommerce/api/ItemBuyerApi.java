package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ItemBuyer;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class ItemBuyerApi {
  private ApiClient apiClient;

  public ItemBuyerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ItemBuyerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an itemBuyer
   * Inserts a new itemBuyer using the specified data.
   * @param body ItemBuyer to be inserted. (required)
   * @return ItemBuyer
   * @throws ApiException if fails to make API call
   */
  public ItemBuyer addItemBuyer(ItemBuyer body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addItemBuyer");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemBuyer".replaceAll("\\{format\\}","json");

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

    
    GenericType<ItemBuyer> localVarReturnType = new GenericType<ItemBuyer>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for an itemBuyer
   * Adds an audit to an existing itemBuyer.
   * @param itemBuyerId Id of the itemBuyer to add an audit to (required)
   * @param itemBuyerAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addItemBuyerAudit(Integer itemBuyerId, String itemBuyerAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemBuyerId' is set
    if (itemBuyerId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemBuyerId' when calling addItemBuyerAudit");
    }
    
    // verify the required parameter 'itemBuyerAudit' is set
    if (itemBuyerAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'itemBuyerAudit' when calling addItemBuyerAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemBuyer/{itemBuyerId}/audit/{itemBuyerAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemBuyerId" + "\\}", apiClient.escapeString(itemBuyerId.toString()))
      .replaceAll("\\{" + "itemBuyerAudit" + "\\}", apiClient.escapeString(itemBuyerAudit.toString()));

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
   * Add new tags for an itemBuyer.
   * Adds a tag to an existing itemBuyer.
   * @param itemBuyerId Id of the itemBuyer to add a tag to (required)
   * @param itemBuyerTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addItemBuyerTag(Integer itemBuyerId, String itemBuyerTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemBuyerId' is set
    if (itemBuyerId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemBuyerId' when calling addItemBuyerTag");
    }
    
    // verify the required parameter 'itemBuyerTag' is set
    if (itemBuyerTag == null) {
      throw new ApiException(400, "Missing the required parameter 'itemBuyerTag' when calling addItemBuyerTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemBuyer/{itemBuyerId}/tag/{itemBuyerTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemBuyerId" + "\\}", apiClient.escapeString(itemBuyerId.toString()))
      .replaceAll("\\{" + "itemBuyerTag" + "\\}", apiClient.escapeString(itemBuyerTag.toString()));

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
   * Delete an itemBuyer
   * Deletes the itemBuyer identified by the specified id.
   * @param itemBuyerId Id of the itemBuyer to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteItemBuyer(Integer itemBuyerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemBuyerId' is set
    if (itemBuyerId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemBuyerId' when calling deleteItemBuyer");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemBuyer/{itemBuyerId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemBuyerId" + "\\}", apiClient.escapeString(itemBuyerId.toString()));

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
   * Delete a tag for an itemBuyer.
   * Deletes an existing itemBuyer tag using the specified data.
   * @param itemBuyerId Id of the itemBuyer to remove tag from (required)
   * @param itemBuyerTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteItemBuyerTag(Integer itemBuyerId, String itemBuyerTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemBuyerId' is set
    if (itemBuyerId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemBuyerId' when calling deleteItemBuyerTag");
    }
    
    // verify the required parameter 'itemBuyerTag' is set
    if (itemBuyerTag == null) {
      throw new ApiException(400, "Missing the required parameter 'itemBuyerTag' when calling deleteItemBuyerTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemBuyer/{itemBuyerId}/tag/{itemBuyerTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemBuyerId" + "\\}", apiClient.escapeString(itemBuyerId.toString()))
      .replaceAll("\\{" + "itemBuyerTag" + "\\}", apiClient.escapeString(itemBuyerTag.toString()));

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
   * Get a duplicated an itemBuyer by id
   * Returns a duplicated itemBuyer identified by the specified id.
   * @param itemBuyerId Id of the itemBuyer to be duplicated. (required)
   * @return ItemBuyer
   * @throws ApiException if fails to make API call
   */
  public ItemBuyer getDuplicateItemBuyerById(Integer itemBuyerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemBuyerId' is set
    if (itemBuyerId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemBuyerId' when calling getDuplicateItemBuyerById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemBuyer/duplicate/{itemBuyerId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemBuyerId" + "\\}", apiClient.escapeString(itemBuyerId.toString()));

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

    
    GenericType<ItemBuyer> localVarReturnType = new GenericType<ItemBuyer>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search itemBuyers by filter
   * Returns the list of itemBuyers that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ItemBuyer>
   * @throws ApiException if fails to make API call
   */
  public List<ItemBuyer> getItemBuyerByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/itemBuyer/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ItemBuyer>> localVarReturnType = new GenericType<List<ItemBuyer>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an itemBuyer by id
   * Returns the itemBuyer identified by the specified id.
   * @param itemBuyerId Id of the itemBuyer to be returned. (required)
   * @return ItemBuyer
   * @throws ApiException if fails to make API call
   */
  public ItemBuyer getItemBuyerById(Integer itemBuyerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemBuyerId' is set
    if (itemBuyerId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemBuyerId' when calling getItemBuyerById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemBuyer/{itemBuyerId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemBuyerId" + "\\}", apiClient.escapeString(itemBuyerId.toString()));

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

    
    GenericType<ItemBuyer> localVarReturnType = new GenericType<ItemBuyer>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an itemBuyer.
   * Get all existing itemBuyer tags.
   * @param itemBuyerId Id of the itemBuyer to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getItemBuyerTags(Integer itemBuyerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemBuyerId' is set
    if (itemBuyerId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemBuyerId' when calling getItemBuyerTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemBuyer/{itemBuyerId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemBuyerId" + "\\}", apiClient.escapeString(itemBuyerId.toString()));

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
   * Update an itemBuyer
   * Updates an existing itemBuyer using the specified data.
   * @param body ItemBuyer to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateItemBuyer(ItemBuyer body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateItemBuyer");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemBuyer".replaceAll("\\{format\\}","json");

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
