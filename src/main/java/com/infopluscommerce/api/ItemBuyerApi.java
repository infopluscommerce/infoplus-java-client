package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ItemBuyer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T15:40:30.367-05:00")
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
   * Search itemBuyers
   * Returns the list of itemBuyers that match the given searchText.
   * @param searchText Search text, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @return List<ItemBuyer>
   * @throws ApiException if fails to make API call
   */
  public List<ItemBuyer> getItemBuyerBySearchText(String searchText, Integer page, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1.0/itemBuyer/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ItemBuyer>> localVarReturnType = new GenericType<List<ItemBuyer>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an itemBuyer by id
   * Returns the itemBuyer identified by the specified id.
   * @param itemBuyerId Id of itemBuyer to be returned. (required)
   * @return ItemBuyer
   * @throws ApiException if fails to make API call
   */
  public ItemBuyer getTranslateBuyerById(String itemBuyerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemBuyerId' is set
    if (itemBuyerId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemBuyerId' when calling getTranslateBuyerById");
    }
    
    // create path and map variables
    String localVarPath = "/v1.0/itemBuyer/{itemBuyerId}".replaceAll("\\{format\\}","json")
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
  
}
