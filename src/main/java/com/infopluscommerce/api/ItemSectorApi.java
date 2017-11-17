package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ItemSector;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:31:34.297-06:00")
public class ItemSectorApi {
  private ApiClient apiClient;

  public ItemSectorApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ItemSectorApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an itemSector
   * Inserts a new itemSector using the specified data.
   * @param body ItemSector to be inserted. (required)
   * @return ItemSector
   * @throws ApiException if fails to make API call
   */
  public ItemSector addItemSector(ItemSector body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addItemSector");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/itemSector".replaceAll("\\{format\\}","json");

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

    
    GenericType<ItemSector> localVarReturnType = new GenericType<ItemSector>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete an itemSector
   * Deletes the itemSector identified by the specified id.
   * @param itemSectorId Id of the itemSector to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteItemSector(Integer itemSectorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemSectorId' is set
    if (itemSectorId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSectorId' when calling deleteItemSector");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/itemSector/{itemSectorId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemSectorId" + "\\}", apiClient.escapeString(itemSectorId.toString()));

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
   * Get a duplicated an itemSector by id
   * Returns a duplicated itemSector identified by the specified id.
   * @param itemSectorId Id of the itemSector to be duplicated. (required)
   * @return ItemSector
   * @throws ApiException if fails to make API call
   */
  public ItemSector getDuplicateItemSectorById(Integer itemSectorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemSectorId' is set
    if (itemSectorId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSectorId' when calling getDuplicateItemSectorById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/itemSector/duplicate/{itemSectorId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemSectorId" + "\\}", apiClient.escapeString(itemSectorId.toString()));

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

    
    GenericType<ItemSector> localVarReturnType = new GenericType<ItemSector>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search itemSectors by filter
   * Returns the list of itemSectors that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ItemSector>
   * @throws ApiException if fails to make API call
   */
  public List<ItemSector> getItemSectorByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2.0/itemSector/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ItemSector>> localVarReturnType = new GenericType<List<ItemSector>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an itemSector by id
   * Returns the itemSector identified by the specified id.
   * @param itemSectorId Id of the itemSector to be returned. (required)
   * @return ItemSector
   * @throws ApiException if fails to make API call
   */
  public ItemSector getItemSectorById(Integer itemSectorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemSectorId' is set
    if (itemSectorId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSectorId' when calling getItemSectorById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/itemSector/{itemSectorId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemSectorId" + "\\}", apiClient.escapeString(itemSectorId.toString()));

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

    
    GenericType<ItemSector> localVarReturnType = new GenericType<ItemSector>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update an itemSector
   * Updates an existing itemSector using the specified data.
   * @param body ItemSector to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateItemSector(ItemSector body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateItemSector");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/itemSector".replaceAll("\\{format\\}","json");

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
