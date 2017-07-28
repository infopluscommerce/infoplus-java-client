package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ItemLegacyLowStockContact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-19T13:06:54.930-05:00")
public class ItemLegacyLowStockContactApi {
  private ApiClient apiClient;

  public ItemLegacyLowStockContactApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ItemLegacyLowStockContactApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Search itemLegacyLowStockContacts
   * Returns the list of itemLegacyLowStockContacts that match the given searchText.
   * @param searchText Search text, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @return List<ItemLegacyLowStockContact>
   * @throws ApiException if fails to make API call
   */
  public List<ItemLegacyLowStockContact> getItemLegacyLowStockContactBySearchText(String searchText, Integer page, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/itemLegacyLowStockContact/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ItemLegacyLowStockContact>> localVarReturnType = new GenericType<List<ItemLegacyLowStockContact>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an itemLegacyLowStockContact by id
   * Returns the itemLegacyLowStockContact identified by the specified id.
   * @param itemLegacyLowStockContactId Id of itemLegacyLowStockContact to be returned. (required)
   * @return ItemLegacyLowStockContact
   * @throws ApiException if fails to make API call
   */
  public ItemLegacyLowStockContact getTranslateLowStockContactById(String itemLegacyLowStockContactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemLegacyLowStockContactId' is set
    if (itemLegacyLowStockContactId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemLegacyLowStockContactId' when calling getTranslateLowStockContactById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemLegacyLowStockContact/{itemLegacyLowStockContactId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemLegacyLowStockContactId" + "\\}", apiClient.escapeString(itemLegacyLowStockContactId.toString()));

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

    
    GenericType<ItemLegacyLowStockContact> localVarReturnType = new GenericType<ItemLegacyLowStockContact>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
