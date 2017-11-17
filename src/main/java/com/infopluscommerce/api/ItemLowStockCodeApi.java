package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ItemLowstockCode;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:31:34.297-06:00")
public class ItemLowstockCodeApi {
  private ApiClient apiClient;

  public ItemLowstockCodeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ItemLowstockCodeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an itemLowstockCode
   * Inserts a new itemLowstockCode using the specified data.
   * @param body ItemLowstockCode to be inserted. (required)
   * @return ItemLowstockCode
   * @throws ApiException if fails to make API call
   */
  public ItemLowstockCode addItemLowstockCode(ItemLowstockCode body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addItemLowstockCode");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/itemLowstockCode".replaceAll("\\{format\\}","json");

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

    
    GenericType<ItemLowstockCode> localVarReturnType = new GenericType<ItemLowstockCode>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete an itemLowstockCode
   * Deletes the itemLowstockCode identified by the specified id.
   * @param itemLowstockCodeId Id of the itemLowstockCode to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteItemLowstockCode(Integer itemLowstockCodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemLowstockCodeId' is set
    if (itemLowstockCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemLowstockCodeId' when calling deleteItemLowstockCode");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/itemLowstockCode/{itemLowstockCodeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemLowstockCodeId" + "\\}", apiClient.escapeString(itemLowstockCodeId.toString()));

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
   * Get a duplicated an itemLowstockCode by id
   * Returns a duplicated itemLowstockCode identified by the specified id.
   * @param itemLowstockCodeId Id of the itemLowstockCode to be duplicated. (required)
   * @return ItemLowstockCode
   * @throws ApiException if fails to make API call
   */
  public ItemLowstockCode getDuplicateItemLowstockCodeById(Integer itemLowstockCodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemLowstockCodeId' is set
    if (itemLowstockCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemLowstockCodeId' when calling getDuplicateItemLowstockCodeById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/itemLowstockCode/duplicate/{itemLowstockCodeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemLowstockCodeId" + "\\}", apiClient.escapeString(itemLowstockCodeId.toString()));

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

    
    GenericType<ItemLowstockCode> localVarReturnType = new GenericType<ItemLowstockCode>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search itemLowstockCodes by filter
   * Returns the list of itemLowstockCodes that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ItemLowstockCode>
   * @throws ApiException if fails to make API call
   */
  public List<ItemLowstockCode> getItemLowstockCodeByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2.0/itemLowstockCode/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ItemLowstockCode>> localVarReturnType = new GenericType<List<ItemLowstockCode>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an itemLowstockCode by id
   * Returns the itemLowstockCode identified by the specified id.
   * @param itemLowstockCodeId Id of the itemLowstockCode to be returned. (required)
   * @return ItemLowstockCode
   * @throws ApiException if fails to make API call
   */
  public ItemLowstockCode getItemLowstockCodeById(Integer itemLowstockCodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemLowstockCodeId' is set
    if (itemLowstockCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemLowstockCodeId' when calling getItemLowstockCodeById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/itemLowstockCode/{itemLowstockCodeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemLowstockCodeId" + "\\}", apiClient.escapeString(itemLowstockCodeId.toString()));

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

    
    GenericType<ItemLowstockCode> localVarReturnType = new GenericType<ItemLowstockCode>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update an itemLowstockCode
   * Updates an existing itemLowstockCode using the specified data.
   * @param body ItemLowstockCode to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateItemLowstockCode(ItemLowstockCode body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateItemLowstockCode");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/itemLowstockCode".replaceAll("\\{format\\}","json");

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
