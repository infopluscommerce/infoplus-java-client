package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ItemLowStockCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-04T22:56:01.104-05:00")
public class ItemLowStockCodeApi {
  private ApiClient apiClient;

  public ItemLowStockCodeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ItemLowStockCodeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Search itemLowStockCodes
   * Returns the list of itemLowStockCodes that match the given searchText.
   * @param searchText Search text, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @return List<ItemLowStockCode>
   * @throws ApiException if fails to make API call
   */
  public List<ItemLowStockCode> getItemLowStockCodeBySearchText(String searchText, Integer page, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/itemLowStockCode/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchText", searchText));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    GenericType<List<ItemLowStockCode>> localVarReturnType = new GenericType<List<ItemLowStockCode>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an itemLowStockCode by id
   * Returns the itemLowStockCode identified by the specified id.
   * @param itemLowStockCodeId Id of itemLowStockCode to be returned. (required)
   * @return ItemLowStockCode
   * @throws ApiException if fails to make API call
   */
  public ItemLowStockCode getTranslateLowStockCodeById(String itemLowStockCodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemLowStockCodeId' is set
    if (itemLowStockCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemLowStockCodeId' when calling getTranslateLowStockCodeById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemLowStockCode/{itemLowStockCodeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemLowStockCodeId" + "\\}", apiClient.escapeString(itemLowStockCodeId.toString()));

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

    
    GenericType<ItemLowStockCode> localVarReturnType = new GenericType<ItemLowStockCode>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
