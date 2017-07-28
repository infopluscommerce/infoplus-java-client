package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.Item;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class ItemApi {
  private ApiClient apiClient;

  public ItemApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ItemApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an item
   * Inserts a new item using the specified data.
   * @param body Item to be inserted. (required)
   * @return Item
   * @throws ApiException if fails to make API call
   */
  public Item addItem(Item body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addItem");
    }
    
    // create path and map variables
    String localVarPath = "/beta/item".replaceAll("\\{format\\}","json");

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

    
    GenericType<Item> localVarReturnType = new GenericType<Item>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for an item
   * Adds an audit to an existing item.
   * @param itemId Id of the item to add an audit to (required)
   * @param itemAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addItemAudit(Integer itemId, String itemAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemId' is set
    if (itemId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemId' when calling addItemAudit");
    }
    
    // verify the required parameter 'itemAudit' is set
    if (itemAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'itemAudit' when calling addItemAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/item/{itemId}/audit/{itemAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemId" + "\\}", apiClient.escapeString(itemId.toString()))
      .replaceAll("\\{" + "itemAudit" + "\\}", apiClient.escapeString(itemAudit.toString()));

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
   * Add new tags for an item.
   * Adds a tag to an existing item.
   * @param itemId Id of the item to add a tag to (required)
   * @param itemTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addItemTag(Integer itemId, String itemTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemId' is set
    if (itemId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemId' when calling addItemTag");
    }
    
    // verify the required parameter 'itemTag' is set
    if (itemTag == null) {
      throw new ApiException(400, "Missing the required parameter 'itemTag' when calling addItemTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/item/{itemId}/tag/{itemTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemId" + "\\}", apiClient.escapeString(itemId.toString()))
      .replaceAll("\\{" + "itemTag" + "\\}", apiClient.escapeString(itemTag.toString()));

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
   * Delete an item
   * Deletes the item identified by the specified id.
   * @param itemId Id of the item to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteItem(Integer itemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemId' is set
    if (itemId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemId' when calling deleteItem");
    }
    
    // create path and map variables
    String localVarPath = "/beta/item/{itemId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemId" + "\\}", apiClient.escapeString(itemId.toString()));

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
   * Delete a tag for an item.
   * Deletes an existing item tag using the specified data.
   * @param itemId Id of the item to remove tag from (required)
   * @param itemTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteItemTag(Integer itemId, String itemTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemId' is set
    if (itemId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemId' when calling deleteItemTag");
    }
    
    // verify the required parameter 'itemTag' is set
    if (itemTag == null) {
      throw new ApiException(400, "Missing the required parameter 'itemTag' when calling deleteItemTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/item/{itemId}/tag/{itemTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemId" + "\\}", apiClient.escapeString(itemId.toString()))
      .replaceAll("\\{" + "itemTag" + "\\}", apiClient.escapeString(itemTag.toString()));

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
   * Get an item by SKU
   * Returns the item identified by the specified parameters.
   * @param lobId lobId of the item to be returned. (required)
   * @param sku sku of the item to be returned. (required)
   * @return Item
   * @throws ApiException if fails to make API call
   */
  public Item getBySKU(Integer lobId, String sku) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'lobId' is set
    if (lobId == null) {
      throw new ApiException(400, "Missing the required parameter 'lobId' when calling getBySKU");
    }
    
    // verify the required parameter 'sku' is set
    if (sku == null) {
      throw new ApiException(400, "Missing the required parameter 'sku' when calling getBySKU");
    }
    
    // create path and map variables
    String localVarPath = "/beta/item/getBySKU".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lobId", lobId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sku", sku));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    GenericType<Item> localVarReturnType = new GenericType<Item>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a duplicated an item by id
   * Returns a duplicated item identified by the specified id.
   * @param itemId Id of the item to be duplicated. (required)
   * @return Item
   * @throws ApiException if fails to make API call
   */
  public Item getDuplicateItemById(Integer itemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemId' is set
    if (itemId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemId' when calling getDuplicateItemById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/item/duplicate/{itemId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemId" + "\\}", apiClient.escapeString(itemId.toString()));

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

    
    GenericType<Item> localVarReturnType = new GenericType<Item>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search items by filter
   * Returns the list of items that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<Item>
   * @throws ApiException if fails to make API call
   */
  public List<Item> getItemByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/item/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Item>> localVarReturnType = new GenericType<List<Item>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an item by id
   * Returns the item identified by the specified id.
   * @param itemId Id of the item to be returned. (required)
   * @return Item
   * @throws ApiException if fails to make API call
   */
  public Item getItemById(Integer itemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemId' is set
    if (itemId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemId' when calling getItemById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/item/{itemId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemId" + "\\}", apiClient.escapeString(itemId.toString()));

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

    
    GenericType<Item> localVarReturnType = new GenericType<Item>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an item.
   * Get all existing item tags.
   * @param itemId Id of the item to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getItemTags(Integer itemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemId' is set
    if (itemId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemId' when calling getItemTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/item/{itemId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemId" + "\\}", apiClient.escapeString(itemId.toString()));

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
   * Update an item
   * Updates an existing item using the specified data.
   * @param body Item to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateItem(Item body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateItem");
    }
    
    // create path and map variables
    String localVarPath = "/beta/item".replaceAll("\\{format\\}","json");

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
   * Update an item custom fields
   * Updates an existing item custom fields using the specified data.
   * @param body Item to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateItemCustomFields(Item body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateItemCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/item/customFields".replaceAll("\\{format\\}","json");

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
