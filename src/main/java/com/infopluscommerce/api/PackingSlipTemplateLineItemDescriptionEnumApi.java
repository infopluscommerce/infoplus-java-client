package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.PackingSlipTemplateLineItemDescriptionEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class PackingSlipTemplateLineItemDescriptionEnumApi {
  private ApiClient apiClient;

  public PackingSlipTemplateLineItemDescriptionEnumApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PackingSlipTemplateLineItemDescriptionEnumApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get a packingSlipTemplateLineItemDescriptionEnum by id
   * Returns the packingSlipTemplateLineItemDescriptionEnum identified by the specified id.
   * @param packingSlipTemplateLineItemDescriptionEnumId Id of packingSlipTemplateLineItemDescriptionEnum to be returned. (required)
   * @return PackingSlipTemplateLineItemDescriptionEnum
   * @throws ApiException if fails to make API call
   */
  public PackingSlipTemplateLineItemDescriptionEnum getPackingSlipTemplateLineItemDescriptionEnumById(String packingSlipTemplateLineItemDescriptionEnumId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'packingSlipTemplateLineItemDescriptionEnumId' is set
    if (packingSlipTemplateLineItemDescriptionEnumId == null) {
      throw new ApiException(400, "Missing the required parameter 'packingSlipTemplateLineItemDescriptionEnumId' when calling getPackingSlipTemplateLineItemDescriptionEnumById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/packingSlipTemplateLineItemDescriptionEnum/{packingSlipTemplateLineItemDescriptionEnumId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "packingSlipTemplateLineItemDescriptionEnumId" + "\\}", apiClient.escapeString(packingSlipTemplateLineItemDescriptionEnumId.toString()));

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

    
    GenericType<PackingSlipTemplateLineItemDescriptionEnum> localVarReturnType = new GenericType<PackingSlipTemplateLineItemDescriptionEnum>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search packingSlipTemplateLineItemDescriptionEnums
   * Returns the list of packingSlipTemplateLineItemDescriptionEnums that match the given searchText.
   * @param searchText Search text, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @return List<PackingSlipTemplateLineItemDescriptionEnum>
   * @throws ApiException if fails to make API call
   */
  public List<PackingSlipTemplateLineItemDescriptionEnum> getPackingSlipTemplateLineItemDescriptionEnumBySearchText(String searchText, Integer page, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/packingSlipTemplateLineItemDescriptionEnum/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<PackingSlipTemplateLineItemDescriptionEnum>> localVarReturnType = new GenericType<List<PackingSlipTemplateLineItemDescriptionEnum>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
