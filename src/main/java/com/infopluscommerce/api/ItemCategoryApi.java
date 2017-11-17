package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ItemCategory;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:31:34.297-06:00")
public class ItemCategoryApi {
  private ApiClient apiClient;

  public ItemCategoryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ItemCategoryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an itemCategory
   * Inserts a new itemCategory using the specified data.
   * @param body ItemCategory to be inserted. (required)
   * @return ItemCategory
   * @throws ApiException if fails to make API call
   */
  public ItemCategory addItemCategory(ItemCategory body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addItemCategory");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/itemCategory".replaceAll("\\{format\\}","json");

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

    
    GenericType<ItemCategory> localVarReturnType = new GenericType<ItemCategory>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete an itemCategory
   * Deletes the itemCategory identified by the specified id.
   * @param itemCategoryId Id of the itemCategory to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteItemCategory(Integer itemCategoryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemCategoryId' is set
    if (itemCategoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemCategoryId' when calling deleteItemCategory");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/itemCategory/{itemCategoryId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemCategoryId" + "\\}", apiClient.escapeString(itemCategoryId.toString()));

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
   * Get a duplicated an itemCategory by id
   * Returns a duplicated itemCategory identified by the specified id.
   * @param itemCategoryId Id of the itemCategory to be duplicated. (required)
   * @return ItemCategory
   * @throws ApiException if fails to make API call
   */
  public ItemCategory getDuplicateItemCategoryById(Integer itemCategoryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemCategoryId' is set
    if (itemCategoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemCategoryId' when calling getDuplicateItemCategoryById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/itemCategory/duplicate/{itemCategoryId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemCategoryId" + "\\}", apiClient.escapeString(itemCategoryId.toString()));

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

    
    GenericType<ItemCategory> localVarReturnType = new GenericType<ItemCategory>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search itemCategorys by filter
   * Returns the list of itemCategorys that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ItemCategory>
   * @throws ApiException if fails to make API call
   */
  public List<ItemCategory> getItemCategoryByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2.0/itemCategory/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ItemCategory>> localVarReturnType = new GenericType<List<ItemCategory>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an itemCategory by id
   * Returns the itemCategory identified by the specified id.
   * @param itemCategoryId Id of the itemCategory to be returned. (required)
   * @return ItemCategory
   * @throws ApiException if fails to make API call
   */
  public ItemCategory getItemCategoryById(Integer itemCategoryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemCategoryId' is set
    if (itemCategoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemCategoryId' when calling getItemCategoryById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/itemCategory/{itemCategoryId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemCategoryId" + "\\}", apiClient.escapeString(itemCategoryId.toString()));

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

    
    GenericType<ItemCategory> localVarReturnType = new GenericType<ItemCategory>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update an itemCategory
   * Updates an existing itemCategory using the specified data.
   * @param body ItemCategory to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateItemCategory(ItemCategory body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateItemCategory");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/itemCategory".replaceAll("\\{format\\}","json");

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
