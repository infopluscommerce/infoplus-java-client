package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.OrderLoadProgram;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class OrderLoadProgramApi {
  private ApiClient apiClient;

  public OrderLoadProgramApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrderLoadProgramApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Search orderLoadPrograms
   * Returns the list of orderLoadPrograms that match the given searchText.
   * @param searchText Search text, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @return List<OrderLoadProgram>
   */
  public List<OrderLoadProgram> getOrderLoadProgramBySearchText(String searchText, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/orderLoadProgram/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<OrderLoadProgram>> returnType = new GenericType<List<OrderLoadProgram>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get an orderLoadProgram by id
   * Returns the orderLoadProgram identified by the specified id.
   * @param orderLoadProgramId Id of orderLoadProgram to be returned.
   * @return OrderLoadProgram
   */
  public OrderLoadProgram getReqLoadProgramById(String orderLoadProgramId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'orderLoadProgramId' is set
     if (orderLoadProgramId == null) {
        throw new ApiException(400, "Missing the required parameter 'orderLoadProgramId' when calling getReqLoadProgramById");
     }
     
    // create path and map variables
    String path = "/v1.0/orderLoadProgram/{orderLoadProgramId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orderLoadProgramId" + "\\}", apiClient.escapeString(orderLoadProgramId.toString()));

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

    
    GenericType<OrderLoadProgram> returnType = new GenericType<OrderLoadProgram>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
