package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.IntegrationPartner;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
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
   * Search integrationPartners
   * Returns the list of integrationPartners that match the given searchText.
   * @param searchText Search text, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @return List<IntegrationPartner>
   */
  public List<IntegrationPartner> getIntegrationPartnerBySearchText(String searchText, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/integrationPartner/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "searchText", searchText));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<List<IntegrationPartner>> returnType = new GenericType<List<IntegrationPartner>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get an integrationPartner by id
   * Returns the integrationPartner identified by the specified id.
   * @param integrationPartnerId Id of integrationPartner to be returned.
   * @return IntegrationPartner
   */
  public IntegrationPartner getIntegrationPartnerById(String integrationPartnerId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'integrationPartnerId' is set
     if (integrationPartnerId == null) {
        throw new ApiException(400, "Missing the required parameter 'integrationPartnerId' when calling getIntegrationPartnerById");
     }
     
    // create path and map variables
    String path = "/v1.0/integrationPartner/{integrationPartnerId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "integrationPartnerId" + "\\}", apiClient.escapeString(integrationPartnerId.toString()));

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

    
    GenericType<IntegrationPartner> returnType = new GenericType<IntegrationPartner>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
