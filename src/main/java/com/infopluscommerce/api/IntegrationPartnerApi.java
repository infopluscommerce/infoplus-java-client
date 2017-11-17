package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.IntegrationPartner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class IntegrationPartnerApi {
  private ApiClient apiClient;

  public IntegrationPartnerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IntegrationPartnerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get an integrationPartner by id
   * Returns the integrationPartner identified by the specified id.
   * @param integrationPartnerId Id of integrationPartner to be returned. (required)
   * @return IntegrationPartner
   * @throws ApiException if fails to make API call
   */
  public IntegrationPartner getIntegrationPartnerById(String integrationPartnerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'integrationPartnerId' is set
    if (integrationPartnerId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationPartnerId' when calling getIntegrationPartnerById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/integrationPartner/{integrationPartnerId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "integrationPartnerId" + "\\}", apiClient.escapeString(integrationPartnerId.toString()));

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

    
    GenericType<IntegrationPartner> localVarReturnType = new GenericType<IntegrationPartner>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search integrationPartners
   * Returns the list of integrationPartners that match the given searchText.
   * @param searchText Search text, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @return List<IntegrationPartner>
   * @throws ApiException if fails to make API call
   */
  public List<IntegrationPartner> getIntegrationPartnerBySearchText(String searchText, Integer page, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/integrationPartner/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<IntegrationPartner>> localVarReturnType = new GenericType<List<IntegrationPartner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
