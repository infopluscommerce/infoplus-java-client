package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ItemProductCode;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:31:34.297-06:00")
public class ItemProductCodeApi {
  private ApiClient apiClient;

  public ItemProductCodeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ItemProductCodeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an itemProductCode
   * Inserts a new itemProductCode using the specified data.
   * @param body ItemProductCode to be inserted. (required)
   * @return ItemProductCode
   * @throws ApiException if fails to make API call
   */
  public ItemProductCode addItemProductCode(ItemProductCode body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addItemProductCode");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/itemProductCode".replaceAll("\\{format\\}","json");

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

    
    GenericType<ItemProductCode> localVarReturnType = new GenericType<ItemProductCode>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete an itemProductCode
   * Deletes the itemProductCode identified by the specified id.
   * @param itemProductCodeId Id of the itemProductCode to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteItemProductCode(Integer itemProductCodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemProductCodeId' is set
    if (itemProductCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemProductCodeId' when calling deleteItemProductCode");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/itemProductCode/{itemProductCodeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemProductCodeId" + "\\}", apiClient.escapeString(itemProductCodeId.toString()));

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
   * Get a duplicated an itemProductCode by id
   * Returns a duplicated itemProductCode identified by the specified id.
   * @param itemProductCodeId Id of the itemProductCode to be duplicated. (required)
   * @return ItemProductCode
   * @throws ApiException if fails to make API call
   */
  public ItemProductCode getDuplicateItemProductCodeById(Integer itemProductCodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemProductCodeId' is set
    if (itemProductCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemProductCodeId' when calling getDuplicateItemProductCodeById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/itemProductCode/duplicate/{itemProductCodeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemProductCodeId" + "\\}", apiClient.escapeString(itemProductCodeId.toString()));

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

    
    GenericType<ItemProductCode> localVarReturnType = new GenericType<ItemProductCode>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search itemProductCodes by filter
   * Returns the list of itemProductCodes that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ItemProductCode>
   * @throws ApiException if fails to make API call
   */
  public List<ItemProductCode> getItemProductCodeByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2.0/itemProductCode/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ItemProductCode>> localVarReturnType = new GenericType<List<ItemProductCode>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an itemProductCode by id
   * Returns the itemProductCode identified by the specified id.
   * @param itemProductCodeId Id of the itemProductCode to be returned. (required)
   * @return ItemProductCode
   * @throws ApiException if fails to make API call
   */
  public ItemProductCode getItemProductCodeById(Integer itemProductCodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemProductCodeId' is set
    if (itemProductCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemProductCodeId' when calling getItemProductCodeById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/itemProductCode/{itemProductCodeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemProductCodeId" + "\\}", apiClient.escapeString(itemProductCodeId.toString()));

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

    
    GenericType<ItemProductCode> localVarReturnType = new GenericType<ItemProductCode>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update an itemProductCode
   * Updates an existing itemProductCode using the specified data.
   * @param body ItemProductCode to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateItemProductCode(ItemProductCode body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateItemProductCode");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/itemProductCode".replaceAll("\\{format\\}","json");

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
