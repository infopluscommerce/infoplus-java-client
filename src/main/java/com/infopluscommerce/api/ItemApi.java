package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.Item;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
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
   * Update an item
   * Updates an existing item using the specified data.
   * @param body Item to be updated.
   * @return void
   */
  public void updateItem(Item body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateItem");
     }
     
    // create path and map variables
    String path = "/v1.0/item".replaceAll("\\{format\\}","json");

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
   * Create an item
   * Inserts a new item using the specified data.
   * @param body Item to be inserted.
   * @return Item
   */
  public Item addItem(Item body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addItem");
     }
     
    // create path and map variables
    String path = "/v1.0/item".replaceAll("\\{format\\}","json");

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

    
    GenericType<Item> returnType = new GenericType<Item>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get an item by SKU
   * Returns the item identified by the specified parameters.
   * @param lobId lobId of the item to be returned.
   * @param sku sku of the item to be returned.
   * @return Item
   */
  public Item getItemBygetBySKU(Integer lobId, String sku) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'lobId' is set
     if (lobId == null) {
        throw new ApiException(400, "Missing the required parameter 'lobId' when calling getItemBygetBySKU");
     }
     
     // verify the required parameter 'sku' is set
     if (sku == null) {
        throw new ApiException(400, "Missing the required parameter 'sku' when calling getItemBygetBySKU");
     }
     
    // create path and map variables
    String path = "/v1.0/item/getBySKU".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "lobId", lobId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sku", sku));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<Item> returnType = new GenericType<Item>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search items by filter
   * Returns the list of items that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<Item>
   */
  public List<Item> getItemByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/item/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Item>> returnType = new GenericType<List<Item>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get an item by id
   * Returns the item identified by the specified id.
   * @param itemId Id of the item to be returned.
   * @return Item
   */
  public Item getItemById(Integer itemId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'itemId' is set
     if (itemId == null) {
        throw new ApiException(400, "Missing the required parameter 'itemId' when calling getItemById");
     }
     
    // create path and map variables
    String path = "/v1.0/item/{itemId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemId" + "\\}", apiClient.escapeString(itemId.toString()));

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

    
    GenericType<Item> returnType = new GenericType<Item>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete an item
   * Deletes the item identified by the specified id.
   * @param itemId Id of the item to be deleted.
   * @return void
   */
  public void deleteItem(Integer itemId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'itemId' is set
     if (itemId == null) {
        throw new ApiException(400, "Missing the required parameter 'itemId' when calling deleteItem");
     }
     
    // create path and map variables
    String path = "/v1.0/item/{itemId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemId" + "\\}", apiClient.escapeString(itemId.toString()));

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
