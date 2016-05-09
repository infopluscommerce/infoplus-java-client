package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.CarrierService;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class CarrierServiceApi {
  private ApiClient apiClient;

  public CarrierServiceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CarrierServiceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Search carrierServices
   * Returns the list of carrierServices that match the given searchText.
   * @param searchText Search text, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @return List<CarrierService>
   */
  public List<CarrierService> getCarrierServiceBySearchText(String searchText, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/carrierService/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<CarrierService>> returnType = new GenericType<List<CarrierService>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a carrierService by id
   * Returns the carrierService identified by the specified id.
   * @param carrierServiceId Id of carrierService to be returned.
   * @return CarrierService
   */
  public CarrierService getCarrierServiceById(String carrierServiceId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'carrierServiceId' is set
     if (carrierServiceId == null) {
        throw new ApiException(400, "Missing the required parameter 'carrierServiceId' when calling getCarrierServiceById");
     }
     
    // create path and map variables
    String path = "/v1.0/carrierService/{carrierServiceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "carrierServiceId" + "\\}", apiClient.escapeString(carrierServiceId.toString()));

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

    
    GenericType<CarrierService> returnType = new GenericType<CarrierService>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
