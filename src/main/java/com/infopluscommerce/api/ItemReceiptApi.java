package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ItemReceipt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class ItemReceiptApi {
  private ApiClient apiClient;

  public ItemReceiptApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ItemReceiptApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for an itemReceipt
   * Adds an audit to an existing itemReceipt.
   * @param itemReceiptId Id of the itemReceipt to add an audit to (required)
   * @param itemReceiptAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addItemReceiptAudit(Integer itemReceiptId, String itemReceiptAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemReceiptId' is set
    if (itemReceiptId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemReceiptId' when calling addItemReceiptAudit");
    }
    
    // verify the required parameter 'itemReceiptAudit' is set
    if (itemReceiptAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'itemReceiptAudit' when calling addItemReceiptAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemReceipt/{itemReceiptId}/audit/{itemReceiptAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemReceiptId" + "\\}", apiClient.escapeString(itemReceiptId.toString()))
      .replaceAll("\\{" + "itemReceiptAudit" + "\\}", apiClient.escapeString(itemReceiptAudit.toString()));

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
   * Add new tags for an itemReceipt.
   * Adds a tag to an existing itemReceipt.
   * @param itemReceiptId Id of the itemReceipt to add a tag to (required)
   * @param itemReceiptTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addItemReceiptTag(Integer itemReceiptId, String itemReceiptTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemReceiptId' is set
    if (itemReceiptId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemReceiptId' when calling addItemReceiptTag");
    }
    
    // verify the required parameter 'itemReceiptTag' is set
    if (itemReceiptTag == null) {
      throw new ApiException(400, "Missing the required parameter 'itemReceiptTag' when calling addItemReceiptTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemReceipt/{itemReceiptId}/tag/{itemReceiptTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemReceiptId" + "\\}", apiClient.escapeString(itemReceiptId.toString()))
      .replaceAll("\\{" + "itemReceiptTag" + "\\}", apiClient.escapeString(itemReceiptTag.toString()));

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
   * Delete a tag for an itemReceipt.
   * Deletes an existing itemReceipt tag using the specified data.
   * @param itemReceiptId Id of the itemReceipt to remove tag from (required)
   * @param itemReceiptTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteItemReceiptTag(Integer itemReceiptId, String itemReceiptTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemReceiptId' is set
    if (itemReceiptId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemReceiptId' when calling deleteItemReceiptTag");
    }
    
    // verify the required parameter 'itemReceiptTag' is set
    if (itemReceiptTag == null) {
      throw new ApiException(400, "Missing the required parameter 'itemReceiptTag' when calling deleteItemReceiptTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemReceipt/{itemReceiptId}/tag/{itemReceiptTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemReceiptId" + "\\}", apiClient.escapeString(itemReceiptId.toString()))
      .replaceAll("\\{" + "itemReceiptTag" + "\\}", apiClient.escapeString(itemReceiptTag.toString()));

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
   * Get a duplicated an itemReceipt by id
   * Returns a duplicated itemReceipt identified by the specified id.
   * @param itemReceiptId Id of the itemReceipt to be duplicated. (required)
   * @return ItemReceipt
   * @throws ApiException if fails to make API call
   */
  public ItemReceipt getDuplicateItemReceiptById(Integer itemReceiptId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemReceiptId' is set
    if (itemReceiptId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemReceiptId' when calling getDuplicateItemReceiptById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemReceipt/duplicate/{itemReceiptId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemReceiptId" + "\\}", apiClient.escapeString(itemReceiptId.toString()));

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

    
    GenericType<ItemReceipt> localVarReturnType = new GenericType<ItemReceipt>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search itemReceipts by filter
   * Returns the list of itemReceipts that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ItemReceipt>
   * @throws ApiException if fails to make API call
   */
  public List<ItemReceipt> getItemReceiptByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/itemReceipt/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ItemReceipt>> localVarReturnType = new GenericType<List<ItemReceipt>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an itemReceipt by id
   * Returns the itemReceipt identified by the specified id.
   * @param itemReceiptId Id of the itemReceipt to be returned. (required)
   * @return ItemReceipt
   * @throws ApiException if fails to make API call
   */
  public ItemReceipt getItemReceiptById(Integer itemReceiptId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemReceiptId' is set
    if (itemReceiptId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemReceiptId' when calling getItemReceiptById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemReceipt/{itemReceiptId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemReceiptId" + "\\}", apiClient.escapeString(itemReceiptId.toString()));

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

    
    GenericType<ItemReceipt> localVarReturnType = new GenericType<ItemReceipt>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an itemReceipt.
   * Get all existing itemReceipt tags.
   * @param itemReceiptId Id of the itemReceipt to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getItemReceiptTags(Integer itemReceiptId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemReceiptId' is set
    if (itemReceiptId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemReceiptId' when calling getItemReceiptTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemReceipt/{itemReceiptId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemReceiptId" + "\\}", apiClient.escapeString(itemReceiptId.toString()));

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
   * Update an itemReceipt
   * Updates an existing itemReceipt using the specified data.
   * @param body ItemReceipt to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateItemReceipt(ItemReceipt body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateItemReceipt");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemReceipt".replaceAll("\\{format\\}","json");

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
   * Update an itemReceipt custom fields
   * Updates an existing itemReceipt custom fields using the specified data.
   * @param body ItemReceipt to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateItemReceiptCustomFields(ItemReceipt body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateItemReceiptCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemReceipt/customFields".replaceAll("\\{format\\}","json");

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
