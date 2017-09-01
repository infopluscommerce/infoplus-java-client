package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ItemReceiptActivity;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class ItemReceiptActivityApi {
  private ApiClient apiClient;

  public ItemReceiptActivityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ItemReceiptActivityApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an itemReceiptActivity
   * Inserts a new itemReceiptActivity using the specified data.
   * @param body ItemReceiptActivity to be inserted. (required)
   * @return ItemReceiptActivity
   * @throws ApiException if fails to make API call
   */
  public ItemReceiptActivity addItemReceiptActivity(ItemReceiptActivity body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addItemReceiptActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemReceiptActivity".replaceAll("\\{format\\}","json");

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

    
    GenericType<ItemReceiptActivity> localVarReturnType = new GenericType<ItemReceiptActivity>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for an itemReceiptActivity
   * Adds an audit to an existing itemReceiptActivity.
   * @param itemReceiptActivityId Id of the itemReceiptActivity to add an audit to (required)
   * @param itemReceiptActivityAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addItemReceiptActivityAudit(Integer itemReceiptActivityId, String itemReceiptActivityAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemReceiptActivityId' is set
    if (itemReceiptActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemReceiptActivityId' when calling addItemReceiptActivityAudit");
    }
    
    // verify the required parameter 'itemReceiptActivityAudit' is set
    if (itemReceiptActivityAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'itemReceiptActivityAudit' when calling addItemReceiptActivityAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemReceiptActivity/{itemReceiptActivityId}/audit/{itemReceiptActivityAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemReceiptActivityId" + "\\}", apiClient.escapeString(itemReceiptActivityId.toString()))
      .replaceAll("\\{" + "itemReceiptActivityAudit" + "\\}", apiClient.escapeString(itemReceiptActivityAudit.toString()));

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
   * Add new tags for an itemReceiptActivity.
   * Adds a tag to an existing itemReceiptActivity.
   * @param itemReceiptActivityId Id of the itemReceiptActivity to add a tag to (required)
   * @param itemReceiptActivityTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addItemReceiptActivityTag(Integer itemReceiptActivityId, String itemReceiptActivityTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemReceiptActivityId' is set
    if (itemReceiptActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemReceiptActivityId' when calling addItemReceiptActivityTag");
    }
    
    // verify the required parameter 'itemReceiptActivityTag' is set
    if (itemReceiptActivityTag == null) {
      throw new ApiException(400, "Missing the required parameter 'itemReceiptActivityTag' when calling addItemReceiptActivityTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemReceiptActivity/{itemReceiptActivityId}/tag/{itemReceiptActivityTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemReceiptActivityId" + "\\}", apiClient.escapeString(itemReceiptActivityId.toString()))
      .replaceAll("\\{" + "itemReceiptActivityTag" + "\\}", apiClient.escapeString(itemReceiptActivityTag.toString()));

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
   * Delete an itemReceiptActivity
   * Deletes the itemReceiptActivity identified by the specified id.
   * @param itemReceiptActivityId Id of the itemReceiptActivity to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteItemReceiptActivity(Integer itemReceiptActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemReceiptActivityId' is set
    if (itemReceiptActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemReceiptActivityId' when calling deleteItemReceiptActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemReceiptActivity/{itemReceiptActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemReceiptActivityId" + "\\}", apiClient.escapeString(itemReceiptActivityId.toString()));

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
   * Delete a tag for an itemReceiptActivity.
   * Deletes an existing itemReceiptActivity tag using the specified data.
   * @param itemReceiptActivityId Id of the itemReceiptActivity to remove tag from (required)
   * @param itemReceiptActivityTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteItemReceiptActivityTag(Integer itemReceiptActivityId, String itemReceiptActivityTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemReceiptActivityId' is set
    if (itemReceiptActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemReceiptActivityId' when calling deleteItemReceiptActivityTag");
    }
    
    // verify the required parameter 'itemReceiptActivityTag' is set
    if (itemReceiptActivityTag == null) {
      throw new ApiException(400, "Missing the required parameter 'itemReceiptActivityTag' when calling deleteItemReceiptActivityTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemReceiptActivity/{itemReceiptActivityId}/tag/{itemReceiptActivityTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemReceiptActivityId" + "\\}", apiClient.escapeString(itemReceiptActivityId.toString()))
      .replaceAll("\\{" + "itemReceiptActivityTag" + "\\}", apiClient.escapeString(itemReceiptActivityTag.toString()));

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
   * Get a duplicated an itemReceiptActivity by id
   * Returns a duplicated itemReceiptActivity identified by the specified id.
   * @param itemReceiptActivityId Id of the itemReceiptActivity to be duplicated. (required)
   * @return ItemReceiptActivity
   * @throws ApiException if fails to make API call
   */
  public ItemReceiptActivity getDuplicateItemReceiptActivityById(Integer itemReceiptActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemReceiptActivityId' is set
    if (itemReceiptActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemReceiptActivityId' when calling getDuplicateItemReceiptActivityById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemReceiptActivity/duplicate/{itemReceiptActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemReceiptActivityId" + "\\}", apiClient.escapeString(itemReceiptActivityId.toString()));

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

    
    GenericType<ItemReceiptActivity> localVarReturnType = new GenericType<ItemReceiptActivity>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search itemReceiptActivitys by filter
   * Returns the list of itemReceiptActivitys that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ItemReceiptActivity>
   * @throws ApiException if fails to make API call
   */
  public List<ItemReceiptActivity> getItemReceiptActivityByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/itemReceiptActivity/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ItemReceiptActivity>> localVarReturnType = new GenericType<List<ItemReceiptActivity>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an itemReceiptActivity by id
   * Returns the itemReceiptActivity identified by the specified id.
   * @param itemReceiptActivityId Id of the itemReceiptActivity to be returned. (required)
   * @return ItemReceiptActivity
   * @throws ApiException if fails to make API call
   */
  public ItemReceiptActivity getItemReceiptActivityById(Integer itemReceiptActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemReceiptActivityId' is set
    if (itemReceiptActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemReceiptActivityId' when calling getItemReceiptActivityById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemReceiptActivity/{itemReceiptActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemReceiptActivityId" + "\\}", apiClient.escapeString(itemReceiptActivityId.toString()));

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

    
    GenericType<ItemReceiptActivity> localVarReturnType = new GenericType<ItemReceiptActivity>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an itemReceiptActivity.
   * Get all existing itemReceiptActivity tags.
   * @param itemReceiptActivityId Id of the itemReceiptActivity to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getItemReceiptActivityTags(Integer itemReceiptActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemReceiptActivityId' is set
    if (itemReceiptActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemReceiptActivityId' when calling getItemReceiptActivityTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemReceiptActivity/{itemReceiptActivityId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemReceiptActivityId" + "\\}", apiClient.escapeString(itemReceiptActivityId.toString()));

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
   * Update an itemReceiptActivity
   * Updates an existing itemReceiptActivity using the specified data.
   * @param body ItemReceiptActivity to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateItemReceiptActivity(ItemReceiptActivity body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateItemReceiptActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemReceiptActivity".replaceAll("\\{format\\}","json");

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
